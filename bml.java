import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class bml
{
  private static final Logger c = ;
  private static final IntBuffer d = avd.f(4194304);
  public static final blz a = new blz(16, 16);
  public static final int[] b = a.e();
  
  public static int a()
  {
    return bfl.y();
  }
  
  public static void a(int p_147942_0_)
  {
    bfl.h(p_147942_0_);
  }
  
  public static int a(int p_110987_0_, BufferedImage p_110987_1_)
  {
    return a(p_110987_0_, p_110987_1_, false, false);
  }
  
  public static void a(int p_110988_0_, int[] p_110988_1_, int p_110988_2_, int p_110988_3_)
  {
    b(p_110988_0_);
    a(0, p_110988_1_, p_110988_2_, p_110988_3_, 0, 0, false, false, false);
  }
  
  public static int[][] a(int p_147949_0_, int p_147949_1_, int[][] p_147949_2_)
  {
    int[][] var3 = new int[p_147949_0_ + 1][];
    var3[0] = p_147949_2_[0];
    if (p_147949_0_ > 0)
    {
      boolean var4 = false;
      for (int var5 = 0; var5 < p_147949_2_.length; var5++) {
        if (p_147949_2_[0][var5] >> 24 == 0)
        {
          var4 = true;
          break;
        }
      }
      for (var5 = 1; var5 <= p_147949_0_; var5++) {
        if (p_147949_2_[var5] != null)
        {
          var3[var5] = p_147949_2_[var5];
        }
        else
        {
          int[] var6 = var3[(var5 - 1)];
          int[] var7 = new int[var6.length >> 2];
          int var8 = p_147949_1_ >> var5;
          int var9 = var7.length / var8;
          int var10 = var8 << 1;
          for (int var11 = 0; var11 < var8; var11++) {
            for (int var12 = 0; var12 < var9; var12++)
            {
              int var13 = 2 * (var11 + var12 * var10);
              var7[(var11 + var12 * var8)] = a(var6[(var13 + 0)], var6[(var13 + 1)], var6[(var13 + 0 + var10)], var6[(var13 + 1 + var10)], var4);
            }
          }
          var3[var5] = var7;
        }
      }
    }
    return var3;
  }
  
  private static int a(int p_147943_0_, int p_147943_1_, int p_147943_2_, int p_147943_3_, boolean p_147943_4_)
  {
    return Mipmaps.alphaBlend(p_147943_0_, p_147943_1_, p_147943_2_, p_147943_3_);
  }
  
  private static int a(int p_147944_0_, int p_147944_1_, int p_147944_2_, int p_147944_3_, int p_147944_4_)
  {
    float var5 = (float)Math.pow((p_147944_0_ >> p_147944_4_ & 0xFF) / 255.0F, 2.2D);
    float var6 = (float)Math.pow((p_147944_1_ >> p_147944_4_ & 0xFF) / 255.0F, 2.2D);
    float var7 = (float)Math.pow((p_147944_2_ >> p_147944_4_ & 0xFF) / 255.0F, 2.2D);
    float var8 = (float)Math.pow((p_147944_3_ >> p_147944_4_ & 0xFF) / 255.0F, 2.2D);
    float var9 = (float)Math.pow((var5 + var6 + var7 + var8) * 0.25D, 0.45454545454545453D);
    return (int)(var9 * 255.0D);
  }
  
  public static void a(int[][] p_147955_0_, int p_147955_1_, int p_147955_2_, int p_147955_3_, int p_147955_4_, boolean p_147955_5_, boolean p_147955_6_)
  {
    for (int var7 = 0; var7 < p_147955_0_.length; var7++)
    {
      int[] var8 = p_147955_0_[var7];
      a(var7, var8, p_147955_1_ >> var7, p_147955_2_ >> var7, p_147955_3_ >> var7, p_147955_4_ >> var7, p_147955_5_, p_147955_6_, p_147955_0_.length > 1);
    }
  }
  
  private static void a(int p_147947_0_, int[] p_147947_1_, int p_147947_2_, int p_147947_3_, int p_147947_4_, int p_147947_5_, boolean p_147947_6_, boolean p_147947_7_, boolean p_147947_8_)
  {
    int var9 = 4194304 / p_147947_2_;
    a(p_147947_6_, p_147947_8_);
    a(p_147947_7_);
    int var12;
    for (int var10 = 0; var10 < p_147947_2_ * p_147947_3_; var10 += p_147947_2_ * var12)
    {
      int var11 = var10 / p_147947_2_;
      var12 = Math.min(var9, p_147947_3_ - var11);
      int var13 = p_147947_2_ * var12;
      b(p_147947_1_, var10, var13);
      GL11.glTexSubImage2D(3553, p_147947_0_, p_147947_4_, p_147947_5_ + var11, p_147947_2_, var12, 32993, 33639, d);
    }
  }
  
  public static int a(int p_110989_0_, BufferedImage p_110989_1_, boolean p_110989_2_, boolean p_110989_3_)
  {
    a(p_110989_0_, p_110989_1_.getWidth(), p_110989_1_.getHeight());
    return a(p_110989_0_, p_110989_1_, 0, 0, p_110989_2_, p_110989_3_);
  }
  
  public static void a(int p_110991_0_, int p_110991_1_, int p_110991_2_)
  {
    a(p_110991_0_, 0, p_110991_1_, p_110991_2_);
  }
  
  public static void a(int p_180600_0_, int p_180600_1_, int p_180600_2_, int p_180600_3_)
  {
    Object monitor = bml.class;
    if (Reflector.SplashScreen.exists()) {
      monitor = Reflector.SplashScreen.getTargetClass();
    }
    synchronized (monitor)
    {
      a(p_180600_0_);
      b(p_180600_0_);
    }
    if (p_180600_1_ >= 0)
    {
      GL11.glTexParameteri(3553, 33085, p_180600_1_);
      GL11.glTexParameterf(3553, 33082, 0.0F);
      GL11.glTexParameterf(3553, 33083, p_180600_1_);
      GL11.glTexParameterf(3553, 34049, 0.0F);
    }
    for (int var4 = 0; var4 <= p_180600_1_; var4++) {
      GL11.glTexImage2D(3553, var4, 6408, p_180600_2_ >> var4, p_180600_3_ >> var4, 0, 32993, 33639, (IntBuffer)null);
    }
  }
  
  public static int a(int p_110995_0_, BufferedImage p_110995_1_, int p_110995_2_, int p_110995_3_, boolean p_110995_4_, boolean p_110995_5_)
  {
    b(p_110995_0_);
    a(p_110995_1_, p_110995_2_, p_110995_3_, p_110995_4_, p_110995_5_);
    return p_110995_0_;
  }
  
  private static void a(BufferedImage p_110993_0_, int p_110993_1_, int p_110993_2_, boolean p_110993_3_, boolean p_110993_4_)
  {
    int var5 = p_110993_0_.getWidth();
    int var6 = p_110993_0_.getHeight();
    int var7 = 4194304 / var5;
    int[] var8 = new int[var7 * var5];
    b(p_110993_3_);
    a(p_110993_4_);
    for (int var9 = 0; var9 < var5 * var6; var9 += var5 * var7)
    {
      int var10 = var9 / var5;
      int var11 = Math.min(var7, var6 - var10);
      int var12 = var5 * var11;
      p_110993_0_.getRGB(0, var10, var5, var11, var8, 0, var5);
      a(var8, var12);
      GL11.glTexSubImage2D(3553, 0, p_110993_1_, p_110993_2_ + var10, var5, var11, 32993, 33639, d);
    }
  }
  
  public static void a(boolean p_110997_0_)
  {
    if (p_110997_0_)
    {
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
    }
    else
    {
      GL11.glTexParameteri(3553, 10242, 10497);
      GL11.glTexParameteri(3553, 10243, 10497);
    }
  }
  
  private static void b(boolean p_147951_0_)
  {
    a(p_147951_0_, false);
  }
  
  public static void a(boolean p_147954_0_, boolean p_147954_1_)
  {
    if (p_147954_0_)
    {
      GL11.glTexParameteri(3553, 10241, p_147954_1_ ? 9987 : 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
    }
    else
    {
      int mipmapType = Config.getMipmapType();
      
      GL11.glTexParameteri(3553, 10241, p_147954_1_ ? mipmapType : 9728);
      GL11.glTexParameteri(3553, 10240, 9728);
    }
  }
  
  private static void a(int[] p_110990_0_, int p_110990_1_)
  {
    b(p_110990_0_, 0, p_110990_1_);
  }
  
  private static void b(int[] p_110994_0_, int p_110994_1_, int p_110994_2_)
  {
    int[] var3 = p_110994_0_;
    if (ave.A().t.e) {
      var3 = a(p_110994_0_);
    }
    d.clear();
    d.put(var3, p_110994_1_, p_110994_2_);
    d.position(0).limit(p_110994_2_);
  }
  
  static void b(int p_94277_0_)
  {
    bfl.i(p_94277_0_);
  }
  
  public static int[] a(bni p_110986_0_, jy p_110986_1_)
    throws IOException
  {
    BufferedImage var2 = a(p_110986_0_.a(p_110986_1_).b());
    if (var2 == null) {
      return null;
    }
    int var3 = var2.getWidth();
    int var4 = var2.getHeight();
    int[] var5 = new int[var3 * var4];
    var2.getRGB(0, 0, var3, var4, var5, 0, var3);
    return var5;
  }
  
  public static BufferedImage a(InputStream p_177053_0_)
    throws IOException, IOException
  {
    BufferedImage var1;
    try
    {
      var1 = ImageIO.read(p_177053_0_);
    }
    finally
    {
      IOUtils.closeQuietly(p_177053_0_);
    }
    return var1;
  }
  
  public static int[] a(int[] p_110985_0_)
  {
    int[] var1 = new int[p_110985_0_.length];
    for (int var2 = 0; var2 < p_110985_0_.length; var2++) {
      var1[var2] = c(p_110985_0_[var2]);
    }
    return var1;
  }
  
  public static int c(int p_177054_0_)
  {
    int var1 = p_177054_0_ >> 24 & 0xFF;
    int var2 = p_177054_0_ >> 16 & 0xFF;
    int var3 = p_177054_0_ >> 8 & 0xFF;
    int var4 = p_177054_0_ & 0xFF;
    int var5 = (var2 * 30 + var3 * 59 + var4 * 11) / 100;
    int var6 = (var2 * 30 + var3 * 70) / 100;
    int var7 = (var2 * 30 + var4 * 70) / 100;
    return var1 << 24 | var5 << 16 | var6 << 8 | var7;
  }
  
  public static void saveGlTexture(String name, int textureId, int mipmapLevels, int width, int height)
  {
    b(textureId);
    GL11.glPixelStorei(3333, 1);
    GL11.glPixelStorei(3317, 1);
    for (int var5 = 0; var5 <= mipmapLevels; var5++)
    {
      File var6 = new File(name + "_" + var5 + ".png");
      int var7 = width >> var5;
      int var8 = height >> var5;
      int var9 = var7 * var8;
      IntBuffer var10 = BufferUtils.createIntBuffer(var9);
      int[] var11 = new int[var9];
      GL11.glGetTexImage(3553, var5, 32993, 33639, var10);
      var10.get(var11);
      BufferedImage var12 = new BufferedImage(var7, var8, 2);
      var12.setRGB(0, 0, var7, var8, var11, 0, var7);
      try
      {
        ImageIO.write(var12, "png", var6);
        c.debug("Exported png to: {}", new Object[] { var6.getAbsolutePath() });
      }
      catch (Exception var14)
      {
        c.debug("Unable to write: ", var14);
      }
    }
  }
  
  public static void a(int[] p_147953_0_, int p_147953_1_, int p_147953_2_)
  {
    int[] var3 = new int[p_147953_1_];
    int var4 = p_147953_2_ / 2;
    for (int var5 = 0; var5 < var4; var5++)
    {
      System.arraycopy(p_147953_0_, var5 * p_147953_1_, var3, 0, p_147953_1_);
      System.arraycopy(p_147953_0_, (p_147953_2_ - 1 - var5) * p_147953_1_, p_147953_0_, var5 * p_147953_1_, p_147953_1_);
      System.arraycopy(var3, 0, p_147953_0_, (p_147953_2_ - 1 - var5) * p_147953_1_, p_147953_1_);
    }
  }
  
  static
  {
    int var0 = -16777216;
    int var1 = -524040;
    int[] var2 = { -524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040 };
    int[] var3 = { -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216 };
    int var4 = var2.length;
    for (int var5 = 0; var5 < 16; var5++)
    {
      System.arraycopy(var5 < var4 ? var2 : var3, 0, b, 16 * var5, var4);
      System.arraycopy(var5 < var4 ? var3 : var2, 0, b, 16 * var5 + var4, var4);
    }
    a.d();
  }
  
  private static final int[] e = new int[4];
  private static final String __OBFID = "CL_00001067";
}
