import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bme
  extends bly
{
  private static final Logger g = ;
  protected final jy f;
  
  public bme(jy ☃)
  {
    this.f = ☃;
  }
  
  public void a(bni ☃)
    throws IOException
  {
    c();
    
    InputStream ☃ = null;
    try
    {
      bnh ☃ = ☃.a(this.f);
      ☃ = ☃.b();
      BufferedImage ☃ = bml.a(☃);
      
      boolean ☃ = false;
      boolean ☃ = false;
      if (☃.c()) {
        try
        {
          bon ☃ = (bon)☃.a("texture");
          if (☃ != null)
          {
            ☃ = ☃.a();
            ☃ = ☃.b();
          }
        }
        catch (RuntimeException ☃)
        {
          g.warn("Failed reading metadata of: " + this.f, ☃);
        }
      }
      bml.a(b(), ☃, ☃, ☃);
    }
    finally
    {
      if (☃ != null) {
        ☃.close();
      }
    }
  }
}
