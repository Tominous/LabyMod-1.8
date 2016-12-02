import com.google.common.collect.Lists;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmd
  extends bly
{
  private static final Logger g = ;
  public final List<String> f;
  
  public bmd(String... ☃)
  {
    f = Lists.newArrayList(☃);
  }
  
  public void a(bni ☃)
    throws IOException
  {
    c();
    
    BufferedImage ☃ = null;
    try
    {
      for (String ☃ : f) {
        if (☃ != null)
        {
          InputStream ☃ = ☃.a(new jy(☃)).b();
          BufferedImage ☃ = bml.a(☃);
          if (☃ == null) {
            ☃ = new BufferedImage(☃.getWidth(), ☃.getHeight(), 2);
          }
          ☃.getGraphics().drawImage(☃, 0, 0, null);
        }
      }
    }
    catch (IOException ☃)
    {
      g.error("Couldn't load layered image", ☃);
      return;
    }
    bml.a(b(), ☃);
  }
}
