import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpq
{
  private static final AtomicInteger a = new AtomicInteger(0);
  private static final Logger b = LogManager.getLogger();
  
  public static class c
  {
    private List<bpq.a> b = Lists.newArrayList();
    boolean a;
    
    public synchronized boolean a()
    {
      return a;
    }
    
    public synchronized void b()
    {
      a = false;
    }
    
    public synchronized List<bpq.a> c()
    {
      return Collections.unmodifiableList(b);
    }
    
    public synchronized void a(String ☃, InetAddress ☃)
    {
      String ☃ = bpr.a(☃);
      String ☃ = bpr.b(☃);
      if (☃ == null) {
        return;
      }
      ☃ = ☃.getHostAddress() + ":" + ☃;
      
      boolean ☃ = false;
      for (bpq.a ☃ : b) {
        if (☃.b().equals(☃))
        {
          ☃.c();
          ☃ = true;
          break;
        }
      }
      if (!☃)
      {
        b.add(new bpq.a(☃, ☃));
        a = true;
      }
    }
  }
  
  public static class a
  {
    private String a;
    private String b;
    private long c;
    
    public a(String ☃, String ☃)
    {
      a = ☃;
      b = ☃;
      c = ave.J();
    }
    
    public String a()
    {
      return a;
    }
    
    public String b()
    {
      return b;
    }
    
    public void c()
    {
      c = ave.J();
    }
  }
  
  public static class b
    extends Thread
  {
    private final bpq.c a;
    private final InetAddress b;
    private final MulticastSocket c;
    
    public b(bpq.c ☃)
      throws IOException
    {
      super();
      a = ☃;
      setDaemon(true);
      
      c = new MulticastSocket(4445);
      b = InetAddress.getByName("224.0.2.60");
      c.setSoTimeout(5000);
      c.joinGroup(b);
    }
    
    public void run()
    {
      byte[] ☃ = new byte['Ѐ'];
      while (!isInterrupted())
      {
        DatagramPacket ☃ = new DatagramPacket(☃, ☃.length);
        try
        {
          c.receive(☃);
        }
        catch (SocketTimeoutException ☃)
        {
          continue;
        }
        catch (IOException ☃)
        {
          bpq.b().error("Couldn't ping server", ☃);
          break;
        }
        String ☃ = new String(☃.getData(), ☃.getOffset(), ☃.getLength());
        bpq.b().debug(☃.getAddress() + ": " + ☃);
        a.a(☃, ☃.getAddress());
      }
      try
      {
        c.leaveGroup(b);
      }
      catch (IOException localIOException1) {}
      c.close();
    }
  }
}
