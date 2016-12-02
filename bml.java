import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bml
{
  private static final Logger c = ;
  private static final IntBuffer d = avd.f(4194304);
  public static final blz a = new blz(16, 16);
  public static final int[] b = a.e();
  
  static
  {
    int ☃ = -16777216;
    int ☃ = -524040;
    int[] ☃ = { -524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040 };
    int[] ☃ = { -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216 };
    int ☃ = ☃.length;
    for (int ☃ = 0; ☃ < 16; ☃++)
    {
      System.arraycopy(☃ < ☃ ? ☃ : ☃, 0, b, 16 * ☃, ☃);
      System.arraycopy(☃ < ☃ ? ☃ : ☃, 0, b, 16 * ☃ + ☃, ☃);
    }
    a.d();
  }
  
  public static int a()
  {
    return bfl.y();
  }
  
  public static void a(int ☃)
  {
    bfl.h(☃);
  }
  
  public static int a(int ☃, BufferedImage ☃)
  {
    return a(☃, ☃, false, false);
  }
  
  public static void a(int ☃, int[] ☃, int ☃, int ☃)
  {
    b(☃);
    
    a(0, ☃, ☃, ☃, 0, 0, false, false, false);
  }
  
  public static int[][] a(int ☃, int ☃, int[][] ☃)
  {
    int[][] ☃ = new int[☃ + 1][];
    ☃[0] = ☃[0];
    if (☃ > 0)
    {
      boolean ☃ = false;
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        if (☃[0][☃] >> 24 == 0)
        {
          ☃ = true;
          break;
        }
      }
      for (int ☃ = 1; ☃ <= ☃; ☃++) {
        if (☃[☃] != null)
        {
          ☃[☃] = ☃[☃];
        }
        else
        {
          int[] ☃ = ☃[(☃ - 1)];
          int[] ☃ = new int[☃.length >> 2];
          
          int ☃ = ☃ >> ☃;
          int ☃ = ☃.length / ☃;
          int ☃ = ☃ << 1;
          for (int ☃ = 0; ☃ < ☃; ☃++) {
            for (int ☃ = 0; ☃ < ☃; ☃++)
            {
              int ☃ = 2 * (☃ + ☃ * ☃);
              ☃[(☃ + ☃ * ☃)] = a(☃[(☃ + 0)], ☃[(☃ + 1)], ☃[(☃ + 0 + ☃)], ☃[(☃ + 1 + ☃)], ☃);
            }
          }
          ☃[☃] = ☃;
        }
      }
    }
    return ☃;
  }
  
  private static final int[] e = new int[4];
  
  private static int a(int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    if (!☃)
    {
      int ☃ = a(☃, ☃, ☃, ☃, 24);
      int ☃ = a(☃, ☃, ☃, ☃, 16);
      int ☃ = a(☃, ☃, ☃, ☃, 8);
      int ☃ = a(☃, ☃, ☃, ☃, 0);
      
      return ☃ << 24 | ☃ << 16 | ☃ << 8 | ☃;
    }
    e[0] = ☃;
    e[1] = ☃;
    e[2] = ☃;
    e[3] = ☃;
    
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    for (int ☃ = 0; ☃ < 4; ☃++) {
      if (e[☃] >> 24 != 0)
      {
        ☃ += (float)Math.pow((e[☃] >> 24 & 0xFF) / 255.0F, 2.2D);
        ☃ += (float)Math.pow((e[☃] >> 16 & 0xFF) / 255.0F, 2.2D);
        ☃ += (float)Math.pow((e[☃] >> 8 & 0xFF) / 255.0F, 2.2D);
        ☃ += (float)Math.pow((e[☃] >> 0 & 0xFF) / 255.0F, 2.2D);
      }
    }
    ☃ /= 4.0F;
    ☃ /= 4.0F;
    ☃ /= 4.0F;
    ☃ /= 4.0F;
    
    int ☃ = (int)(Math.pow(☃, 0.45454545454545453D) * 255.0D);
    int ☃ = (int)(Math.pow(☃, 0.45454545454545453D) * 255.0D);
    int ☃ = (int)(Math.pow(☃, 0.45454545454545453D) * 255.0D);
    int ☃ = (int)(Math.pow(☃, 0.45454545454545453D) * 255.0D);
    if (☃ < 96) {
      ☃ = 0;
    }
    return ☃ << 24 | ☃ << 16 | ☃ << 8 | ☃;
  }
  
  private static int a(int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    float ☃ = (float)Math.pow((☃ >> ☃ & 0xFF) / 255.0F, 2.2D);
    float ☃ = (float)Math.pow((☃ >> ☃ & 0xFF) / 255.0F, 2.2D);
    float ☃ = (float)Math.pow((☃ >> ☃ & 0xFF) / 255.0F, 2.2D);
    float ☃ = (float)Math.pow((☃ >> ☃ & 0xFF) / 255.0F, 2.2D);
    float ☃ = (float)Math.pow((☃ + ☃ + ☃ + ☃) * 0.25D, 0.45454545454545453D);
    
    return (int)(☃ * 255.0D);
  }
  
  public static void a(int[][] ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃, boolean ☃)
  {
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      int[] ☃ = ☃[☃];
      
      a(☃, ☃, ☃ >> ☃, ☃ >> ☃, ☃ >> ☃, ☃ >> ☃, ☃, ☃, ☃.length > 1);
    }
  }
  
  private static void a(int ☃, int[] ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    int ☃ = 4194304 / ☃;
    
    a(☃, ☃);
    a(☃);
    
    int ☃ = 0;
    while (☃ < ☃ * ☃)
    {
      int ☃ = ☃ / ☃;
      int ☃ = Math.min(☃, ☃ - ☃);
      int ☃ = ☃ * ☃;
      
      b(☃, ☃, ☃);
      
      GL11.glTexSubImage2D(3553, ☃, ☃, ☃ + ☃, ☃, ☃, 32993, 33639, d);
      
      ☃ += ☃ * ☃;
    }
  }
  
  public static int a(int ☃, BufferedImage ☃, boolean ☃, boolean ☃)
  {
    a(☃, ☃.getWidth(), ☃.getHeight());
    
    return a(☃, ☃, 0, 0, ☃, ☃);
  }
  
  public static void a(int ☃, int ☃, int ☃)
  {
    a(☃, 0, ☃, ☃);
  }
  
  public static void a(int ☃, int ☃, int ☃, int ☃)
  {
    a(☃);
    
    b(☃);
    if (☃ >= 0)
    {
      GL11.glTexParameteri(3553, 33085, ☃);
      GL11.glTexParameterf(3553, 33082, 0.0F);
      GL11.glTexParameterf(3553, 33083, ☃);
      GL11.glTexParameterf(3553, 34049, 0.0F);
    }
    for (int ☃ = 0; ☃ <= ☃; ☃++) {
      GL11.glTexImage2D(3553, ☃, 6408, ☃ >> ☃, ☃ >> ☃, 0, 32993, 33639, (IntBuffer)null);
    }
  }
  
  public static int a(int ☃, BufferedImage ☃, int ☃, int ☃, boolean ☃, boolean ☃)
  {
    b(☃);
    
    a(☃, ☃, ☃, ☃, ☃);
    
    return ☃;
  }
  
  private static void a(BufferedImage ☃, int ☃, int ☃, boolean ☃, boolean ☃)
  {
    int ☃ = ☃.getWidth();
    int ☃ = ☃.getHeight();
    
    int ☃ = 4194304 / ☃;
    int[] ☃ = new int[☃ * ☃];
    
    b(☃);
    a(☃);
    
    int ☃ = 0;
    while (☃ < ☃ * ☃)
    {
      int ☃ = ☃ / ☃;
      int ☃ = Math.min(☃, ☃ - ☃);
      int ☃ = ☃ * ☃;
      
      ☃.getRGB(0, ☃, ☃, ☃, ☃, 0, ☃);
      
      a(☃, ☃);
      
      GL11.glTexSubImage2D(3553, 0, ☃, ☃ + ☃, ☃, ☃, 32993, 33639, d);
      
      ☃ += ☃ * ☃;
    }
  }
  
  private static void a(boolean ☃)
  {
    if (☃)
    {
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
    }
    else
    {
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
    }
  }
  
  private static void b(boolean ☃)
  {
    a(☃, false);
  }
  
  private static void a(boolean ☃, boolean ☃)
  {
    if (☃)
    {
      GL11.glTexParameteri(3553, 10241, ☃ ? 9987 : 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
    }
    else
    {
      GL11.glTexParameteri(3553, 10241, ☃ ? 9986 : 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
    }
  }
  
  private static void a(int[] ☃, int ☃)
  {
    b(☃, 0, ☃);
  }
  
  private static void b(int[] ☃, int ☃, int ☃)
  {
    int[] ☃ = ☃;
    if (ave.A().t.e) {
      ☃ = a(☃);
    }
    d.clear();
    d.put(☃, ☃, ☃);
    d.position(0).limit(☃);
  }
  
  static void b(int ☃)
  {
    bfl.i(☃);
  }
  
  public static int[] a(bni ☃, jy ☃)
    throws IOException
  {
    BufferedImage ☃ = a(☃.a(☃).b());
    
    int ☃ = ☃.getWidth();
    int ☃ = ☃.getHeight();
    
    int[] ☃ = new int[☃ * ☃];
    ☃.getRGB(0, 0, ☃, ☃, ☃, 0, ☃);
    
    return ☃;
  }
  
  public static BufferedImage a(InputStream ☃)
    throws IOException
  {
    try
    {
      return ImageIO.read(☃);
    }
    finally
    {
      IOUtils.closeQuietly(☃);
    }
  }
  
  public static int[] a(int[] ☃)
  {
    int[] ☃ = new int[☃.length];
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = c(☃[☃]);
    }
    return ☃;
  }
  
  public static int c(int ☃)
  {
    int ☃ = ☃ >> 24 & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    int ☃ = ☃ >> 8 & 0xFF;
    int ☃ = ☃ & 0xFF;
    
    int ☃ = (☃ * 30 + ☃ * 59 + ☃ * 11) / 100;
    int ☃ = (☃ * 30 + ☃ * 70) / 100;
    int ☃ = (☃ * 30 + ☃ * 70) / 100;
    
    return ☃ << 24 | ☃ << 16 | ☃ << 8 | ☃;
  }
  
  public static void a(int[] ☃, int ☃, int ☃)
  {
    int[] ☃ = new int[☃];
    int ☃ = ☃ / 2;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      System.arraycopy(☃, ☃ * ☃, ☃, 0, ☃);
      System.arraycopy(☃, (☃ - 1 - ☃) * ☃, ☃, ☃ * ☃, ☃);
      System.arraycopy(☃, 0, ☃, (☃ - 1 - ☃) * ☃, ☃);
    }
  }
}
