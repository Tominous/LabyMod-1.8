import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

final class bpx$2
  extends URLStreamHandler
{
  bpx$2(jy paramjy) {}
  
  protected URLConnection openConnection(URL ☃)
  {
    new URLConnection(☃)
    {
      public void connect()
        throws IOException
      {}
      
      public InputStream getInputStream()
        throws IOException
      {
        return ave.A().Q().a(a).b();
      }
    };
  }
}
