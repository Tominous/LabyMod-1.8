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
    this.a = ☃;
    ByteArrayOutputStream ☃ = new ByteArrayOutputStream();
    new Exception().printStackTrace(new PrintStream(☃));
    this.b = ("Leaked resource: '" + ☃ + "' loaded from pack: '" + ☃ + "'\n" + ☃.toString());
  }
  
  public void close()
    throws IOException
  {
    this.a.close();
    
    this.c = true;
  }
  
  protected void finalize()
    throws Throwable
  {
    if (!this.c) {
      bnb.b().warn(this.b);
    }
    super.finalize();
  }
  
  public int read()
    throws IOException
  {
    return this.a.read();
  }
}
