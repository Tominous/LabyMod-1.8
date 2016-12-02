import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class HttpPipelineConnection
{
  private String host = null;
  private int port = 0;
  private Proxy proxy = Proxy.NO_PROXY;
  private List<HttpPipelineRequest> listRequests = new LinkedList();
  private List<HttpPipelineRequest> listRequestsSend = new LinkedList();
  private Socket socket = null;
  private InputStream inputStream = null;
  private OutputStream outputStream = null;
  private HttpPipelineSender httpPipelineSender = null;
  private HttpPipelineReceiver httpPipelineReceiver = null;
  private int countRequests = 0;
  private boolean responseReceived = false;
  private long keepaliveTimeoutMs = 5000L;
  private int keepaliveMaxCount = 1000;
  private long timeLastActivityMs = System.currentTimeMillis();
  private boolean terminated = false;
  private static final String LF = "\n";
  public static final int TIMEOUT_CONNECT_MS = 5000;
  public static final int TIMEOUT_READ_MS = 5000;
  
  public HttpPipelineConnection(String host, int port)
  {
    this(host, port, Proxy.NO_PROXY);
  }
  
  public HttpPipelineConnection(String host, int port, Proxy proxy)
  {
    this.host = host;
    this.port = port;
    this.proxy = proxy;
    
    httpPipelineSender = new HttpPipelineSender(this);
    httpPipelineSender.start();
    
    httpPipelineReceiver = new HttpPipelineReceiver(this);
    httpPipelineReceiver.start();
  }
  
  public synchronized boolean addRequest(HttpPipelineRequest pr)
  {
    if (isClosed()) {
      return false;
    }
    addRequest(pr, listRequests);
    addRequest(pr, listRequestsSend);
    
    countRequests += 1;
    
    return true;
  }
  
  private void addRequest(HttpPipelineRequest pr, List<HttpPipelineRequest> list)
  {
    list.add(pr);
    
    notifyAll();
  }
  
  public synchronized void setSocket(Socket s)
    throws IOException
  {
    if (terminated) {
      return;
    }
    if (socket != null) {
      throw new IllegalArgumentException("Already connected");
    }
    socket = s;
    
    socket.setTcpNoDelay(true);
    
    inputStream = socket.getInputStream();
    
    outputStream = new BufferedOutputStream(socket.getOutputStream());
    
    onActivity();
    
    notifyAll();
  }
  
  public synchronized OutputStream getOutputStream()
    throws IOException, InterruptedException
  {
    while (outputStream == null)
    {
      checkTimeout();
      wait(1000L);
    }
    return outputStream;
  }
  
  public synchronized InputStream getInputStream()
    throws IOException, InterruptedException
  {
    while (inputStream == null)
    {
      checkTimeout();
      wait(1000L);
    }
    return inputStream;
  }
  
  public synchronized HttpPipelineRequest getNextRequestSend()
    throws InterruptedException, IOException
  {
    if ((listRequestsSend.size() <= 0) && (outputStream != null)) {
      outputStream.flush();
    }
    return getNextRequest(listRequestsSend, true);
  }
  
  public synchronized HttpPipelineRequest getNextRequestReceive()
    throws InterruptedException
  {
    return getNextRequest(listRequests, false);
  }
  
  private HttpPipelineRequest getNextRequest(List<HttpPipelineRequest> list, boolean remove)
    throws InterruptedException
  {
    while (list.size() <= 0)
    {
      checkTimeout();
      wait(1000L);
    }
    onActivity();
    if (remove) {
      return (HttpPipelineRequest)list.remove(0);
    }
    return (HttpPipelineRequest)list.get(0);
  }
  
  private void checkTimeout()
  {
    if (socket == null) {
      return;
    }
    long timeoutMs = keepaliveTimeoutMs;
    if (listRequests.size() > 0) {
      timeoutMs = 5000L;
    }
    long timeNowMs = System.currentTimeMillis();
    if (timeNowMs > timeLastActivityMs + timeoutMs) {
      terminate(new InterruptedException("Timeout " + timeoutMs));
    }
  }
  
  private void onActivity()
  {
    timeLastActivityMs = System.currentTimeMillis();
  }
  
  public synchronized void onRequestSent(HttpPipelineRequest pr)
  {
    if (terminated) {
      return;
    }
    onActivity();
  }
  
  public synchronized void onResponseReceived(HttpPipelineRequest pr, HttpResponse resp)
  {
    if (terminated) {
      return;
    }
    responseReceived = true;
    onActivity();
    if ((listRequests.size() <= 0) || (listRequests.get(0) != pr)) {
      throw new IllegalArgumentException("Response out of order: " + pr);
    }
    listRequests.remove(0);
    
    pr.setClosed(true);
    
    String location = resp.getHeader("Location");
    if ((resp.getStatus() / 100 == 3) && (location != null) && (pr.getHttpRequest().getRedirects() < 5))
    {
      try
      {
        HttpRequest hr2 = HttpPipeline.makeRequest(location, pr.getHttpRequest().getProxy());
        hr2.setRedirects(pr.getHttpRequest().getRedirects() + 1);
        HttpPipelineRequest hpr2 = new HttpPipelineRequest(hr2, pr.getHttpListener());
        HttpPipeline.addRequest(hpr2);
      }
      catch (IOException e)
      {
        pr.getHttpListener().failed(pr.getHttpRequest(), e);
      }
    }
    else
    {
      HttpListener listener = pr.getHttpListener();
      
      listener.finished(pr.getHttpRequest(), resp);
    }
    checkResponseHeader(resp);
  }
  
  private void checkResponseHeader(HttpResponse resp)
  {
    String connStr = resp.getHeader("Connection");
    if (connStr != null) {
      if (!connStr.toLowerCase().equals("keep-alive")) {
        terminate(new EOFException("Connection not keep-alive"));
      }
    }
    String keepAliveStr = resp.getHeader("Keep-Alive");
    if (keepAliveStr != null)
    {
      String[] parts = Config.tokenize(keepAliveStr, ",;");
      for (int i = 0; i < parts.length; i++)
      {
        String part = parts[i];
        String[] tokens = split(part, '=');
        if (tokens.length >= 2)
        {
          if (tokens[0].equals("timeout"))
          {
            int timeout = Config.parseInt(tokens[1], -1);
            if (timeout > 0) {
              keepaliveTimeoutMs = (timeout * 1000);
            }
          }
          if (tokens[0].equals("max"))
          {
            int max = Config.parseInt(tokens[1], -1);
            if (max > 0) {
              keepaliveMaxCount = max;
            }
          }
        }
      }
    }
  }
  
  private String[] split(String str, char separator)
  {
    int pos = str.indexOf(separator);
    if (pos < 0) {
      return new String[] { str };
    }
    String str1 = str.substring(0, pos);
    String str2 = str.substring(pos + 1);
    
    return new String[] { str1, str2 };
  }
  
  public synchronized void onExceptionSend(HttpPipelineRequest pr, Exception e)
  {
    terminate(e);
  }
  
  public synchronized void onExceptionReceive(HttpPipelineRequest pr, Exception e)
  {
    terminate(e);
  }
  
  private synchronized void terminate(Exception e)
  {
    if (terminated) {
      return;
    }
    terminated = true;
    
    terminateRequests(e);
    if (httpPipelineSender != null) {
      httpPipelineSender.interrupt();
    }
    if (httpPipelineReceiver != null) {
      httpPipelineReceiver.interrupt();
    }
    try
    {
      if (socket != null) {
        socket.close();
      }
    }
    catch (IOException ex) {}
    socket = null;
    inputStream = null;
    outputStream = null;
  }
  
  private void terminateRequests(Exception e)
  {
    if (listRequests.size() <= 0) {
      return;
    }
    if (!responseReceived)
    {
      HttpPipelineRequest pr = (HttpPipelineRequest)listRequests.remove(0);
      pr.getHttpListener().failed(pr.getHttpRequest(), e);
      pr.setClosed(true);
    }
    while (listRequests.size() > 0)
    {
      HttpPipelineRequest pr = (HttpPipelineRequest)listRequests.remove(0);
      HttpPipeline.addRequest(pr);
    }
  }
  
  public synchronized boolean isClosed()
  {
    if (terminated) {
      return true;
    }
    if (countRequests >= keepaliveMaxCount) {
      return true;
    }
    return false;
  }
  
  public int getCountRequests()
  {
    return countRequests;
  }
  
  public synchronized boolean hasActiveRequests()
  {
    if (listRequests.size() > 0) {
      return true;
    }
    return false;
  }
  
  public String getHost()
  {
    return host;
  }
  
  public int getPort()
  {
    return port;
  }
  
  public Proxy getProxy()
  {
    return proxy;
  }
}
