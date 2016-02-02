import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;
import java.awt.image.WritableRaster;

public class bfs
  implements bfm
{
  private int[] a;
  private int b;
  private int c;
  private static final String __OBFID = "CL_00000956";
  
  public BufferedImage a(BufferedImage p_78432_1_)
  {
    if (p_78432_1_ == null) {
      return null;
    }
    this.b = 64;
    this.c = 64;
    
    BufferedImage srcImg = p_78432_1_;
    int srcWidth = srcImg.getWidth();
    int srcHeight = srcImg.getHeight();
    
    int k = 1;
    while ((this.b < srcWidth) || (this.c < srcHeight))
    {
      this.b *= 2;
      this.c *= 2;
      k *= 2;
    }
    BufferedImage var2 = new BufferedImage(this.b, this.c, 2);
    Graphics var3 = var2.getGraphics();
    var3.drawImage(p_78432_1_, 0, 0, (ImageObserver)null);
    if (p_78432_1_.getHeight() == 32 * k)
    {
      var3.drawImage(var2, 24 * k, 48 * k, 20 * k, 52 * k, 4 * k, 16 * k, 8 * k, 20 * k, (ImageObserver)null);
      var3.drawImage(var2, 28 * k, 48 * k, 24 * k, 52 * k, 8 * k, 16 * k, 12 * k, 20 * k, (ImageObserver)null);
      var3.drawImage(var2, 20 * k, 52 * k, 16 * k, 64 * k, 8 * k, 20 * k, 12 * k, 32 * k, (ImageObserver)null);
      var3.drawImage(var2, 24 * k, 52 * k, 20 * k, 64 * k, 4 * k, 20 * k, 8 * k, 32 * k, (ImageObserver)null);
      var3.drawImage(var2, 28 * k, 52 * k, 24 * k, 64 * k, 0 * k, 20 * k, 4 * k, 32 * k, (ImageObserver)null);
      var3.drawImage(var2, 32 * k, 52 * k, 28 * k, 64 * k, 12 * k, 20 * k, 16 * k, 32 * k, (ImageObserver)null);
      var3.drawImage(var2, 40 * k, 48 * k, 36 * k, 52 * k, 44 * k, 16 * k, 48 * k, 20 * k, (ImageObserver)null);
      var3.drawImage(var2, 44 * k, 48 * k, 40 * k, 52 * k, 48 * k, 16 * k, 52 * k, 20 * k, (ImageObserver)null);
      var3.drawImage(var2, 36 * k, 52 * k, 32 * k, 64 * k, 48 * k, 20 * k, 52 * k, 32 * k, (ImageObserver)null);
      var3.drawImage(var2, 40 * k, 52 * k, 36 * k, 64 * k, 44 * k, 20 * k, 48 * k, 32 * k, (ImageObserver)null);
      var3.drawImage(var2, 44 * k, 52 * k, 40 * k, 64 * k, 40 * k, 20 * k, 44 * k, 32 * k, (ImageObserver)null);
      var3.drawImage(var2, 48 * k, 52 * k, 44 * k, 64 * k, 52 * k, 20 * k, 56 * k, 32 * k, (ImageObserver)null);
    }
    var3.dispose();
    this.a = ((DataBufferInt)var2.getRaster().getDataBuffer()).getData();
    
    b(0, 0, 32 * k, 16 * k);
    a(32 * k, 0, 64 * k, 32 * k);
    b(0, 16 * k, 64 * k, 32 * k);
    a(0, 32 * k, 16 * k, 48 * k);
    a(16 * k, 32 * k, 40 * k, 48 * k);
    a(40 * k, 32 * k, 56 * k, 48 * k);
    a(0, 48 * k, 16 * k, 64 * k);
    b(16 * k, 48 * k, 48 * k, 64 * k);
    a(48 * k, 48 * k, 64 * k, 64 * k);
    return var2;
  }
  
  public void a() {}
  
  private void a(int p_78434_1_, int p_78434_2_, int p_78434_3_, int p_78434_4_)
  {
    if (!c(p_78434_1_, p_78434_2_, p_78434_3_, p_78434_4_)) {
      for (int var5 = p_78434_1_; var5 < p_78434_3_; var5++) {
        for (int var6 = p_78434_2_; var6 < p_78434_4_; var6++) {
          this.a[(var5 + var6 * this.b)] &= 0xFFFFFF;
        }
      }
    }
  }
  
  private void b(int p_78433_1_, int p_78433_2_, int p_78433_3_, int p_78433_4_)
  {
    for (int var5 = p_78433_1_; var5 < p_78433_3_; var5++) {
      for (int var6 = p_78433_2_; var6 < p_78433_4_; var6++) {
        this.a[(var5 + var6 * this.b)] |= 0xFF000000;
      }
    }
  }
  
  private boolean c(int p_78435_1_, int p_78435_2_, int p_78435_3_, int p_78435_4_)
  {
    for (int var5 = p_78435_1_; var5 < p_78435_3_; var5++) {
      for (int var6 = p_78435_2_; var6 < p_78435_4_; var6++)
      {
        int var7 = this.a[(var5 + var6 * this.b)];
        if ((var7 >> 24 & 0xFF) < 128) {
          return true;
        }
      }
    }
    return false;
  }
}
