import java.util.Map;

final class HttpPipeline$1
  implements HttpListener
{
  HttpPipeline$1(Map paramMap) {}
  
  public void finished(HttpRequest req, HttpResponse resp)
  {
    synchronized (val$map)
    {
      val$map.put("Response", resp);
      val$map.notifyAll();
    }
  }
  
  public void failed(HttpRequest req, Exception e)
  {
    synchronized (val$map)
    {
      val$map.put("Exception", e);
      val$map.notifyAll();
    }
  }
}
