import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.Logger;

class bnb$a
  extends InputStream
{
  private final InputStream a;
  private final String b;
  private boolean c = false;
  
  public bnb$a(InputStream ☃, jy ☃, String ☃)
  {
    a = ☃;
    ByteArrayOutputStream ☃ = new ByteArrayOutputStream();
    new Exception().printStackTrace(new PrintStream(☃));
    b = ("Leaked resource: '" + ☃ + "' loaded from pack: '" + ☃ + "'\n" + ☃.toString());
  }
  
  public void close()
    throws IOException
  {
    a.close();
    
    c = true;
  }
  
  protected void finalize()
    throws Throwable
  {
    if (!c) {
      bnb.b().warn(b);
    }
    super.finalize();
  }
  
  public int read()
    throws IOException
  {
    return a.read();
  }
}
