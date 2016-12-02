import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmc
  extends bly
{
  private static final Logger f = ;
  private final jy g;
  private final List<String> h;
  private final List<zd> i;
  
  public bmc(jy ☃, List<String> ☃, List<zd> ☃)
  {
    g = ☃;
    h = ☃;
    i = ☃;
  }
  
  public void a(bni ☃)
    throws IOException
  {
    c();
    BufferedImage ☃;
    try
    {
      BufferedImage ☃ = bml.a(☃.a(g).b());
      
      int ☃ = ☃.getType();
      if (☃ == 0) {
        ☃ = 6;
      }
      ☃ = new BufferedImage(☃.getWidth(), ☃.getHeight(), ☃);
      Graphics ☃ = ☃.getGraphics();
      ☃.drawImage(☃, 0, 0, null);
      for (int ☃ = 0; (☃ < 17) && (☃ < h.size()) && (☃ < i.size()); ☃++)
      {
        String ☃ = (String)h.get(☃);
        arn ☃ = ((zd)i.get(☃)).e();
        if (☃ != null)
        {
          InputStream ☃ = ☃.a(new jy(☃)).b();
          BufferedImage ☃ = bml.a(☃);
          if ((☃.getWidth() == ☃.getWidth()) && (☃.getHeight() == ☃.getHeight()) && (☃.getType() == 6))
          {
            for (int ☃ = 0; ☃ < ☃.getHeight(); ☃++) {
              for (int ☃ = 0; ☃ < ☃.getWidth(); ☃++)
              {
                int ☃ = ☃.getRGB(☃, ☃);
                if ((☃ & 0xFF000000) != 0)
                {
                  int ☃ = (☃ & 0xFF0000) << 8 & 0xFF000000;
                  
                  int ☃ = ☃.getRGB(☃, ☃);
                  
                  int ☃ = ns.d(☃, L) & 0xFFFFFF;
                  ☃.setRGB(☃, ☃, ☃ | ☃);
                }
              }
            }
            ☃.getGraphics().drawImage(☃, 0, 0, null);
          }
        }
      }
    }
    catch (IOException ☃)
    {
      f.error("Couldn't load layered image", ☃);
      return;
    }
    bml.a(b(), ☃);
  }
}
