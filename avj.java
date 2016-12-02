import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class avj
{
  private static final Logger a = ;
  private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
  private static IntBuffer c;
  private static int[] d;
  
  public static eu a(File ☃, int ☃, int ☃, bfw ☃)
  {
    return a(☃, null, ☃, ☃, ☃);
  }
  
  public static eu a(File ☃, String ☃, int ☃, int ☃, bfw ☃)
  {
    try
    {
      File ☃ = new File(☃, "screenshots");
      ☃.mkdir();
      if (bqs.i())
      {
        ☃ = a;
        ☃ = b;
      }
      int ☃ = ☃ * ☃;
      if ((c == null) || (c.capacity() < ☃))
      {
        c = BufferUtils.createIntBuffer(☃);
        d = new int[☃];
      }
      GL11.glPixelStorei(3333, 1);
      GL11.glPixelStorei(3317, 1);
      
      c.clear();
      if (bqs.i())
      {
        bfl.i(g);
        GL11.glGetTexImage(3553, 0, 32993, 33639, c);
      }
      else
      {
        GL11.glReadPixels(0, 0, ☃, ☃, 32993, 33639, c);
      }
      c.get(d);
      
      bml.a(d, ☃, ☃);
      
      BufferedImage ☃ = null;
      if (bqs.i())
      {
        ☃ = new BufferedImage(c, d, 1);
        int ☃ = b - d;
        for (int ☃ = ☃; ☃ < b; ☃++) {
          for (int ☃ = 0; ☃ < c; ☃++) {
            ☃.setRGB(☃, ☃ - ☃, d[(☃ * a + ☃)]);
          }
        }
      }
      else
      {
        ☃ = new BufferedImage(☃, ☃, 1);
        ☃.setRGB(0, 0, ☃, ☃, d, 0, ☃);
      }
      File ☃;
      File ☃;
      if (☃ == null) {
        ☃ = a(☃);
      } else {
        ☃ = new File(☃, ☃);
      }
      ImageIO.write(☃, "png", ☃);
      
      eu ☃ = new fa(☃.getName());
      ☃.b().a(new et(et.a.b, ☃.getAbsolutePath()));
      ☃.b().d(Boolean.valueOf(true));
      return new fb("screenshot.success", new Object[] { ☃ });
    }
    catch (Exception ☃)
    {
      a.warn("Couldn't save screenshot", ☃);
    }
    return new fb("screenshot.failure", tmp428_425);
  }
  
  private static File a(File ☃)
  {
    String ☃ = b.format(new Date()).toString();
    for (int ☃ = 1;; ☃++)
    {
      File ☃ = new File(☃, ☃ + (☃ == 1 ? "" : new StringBuilder().append("_").append(☃).toString()) + ".png");
      if (!☃.exists()) {
        return ☃;
      }
    }
  }
}
