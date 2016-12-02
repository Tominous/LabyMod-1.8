import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;

public class bfs
  implements bfm
{
  private int[] a;
  private int b;
  private int c;
  
  public BufferedImage a(BufferedImage ☃)
  {
    if (☃ == null) {
      return null;
    }
    this.b = 64;
    this.c = 64;
    
    BufferedImage ☃ = new BufferedImage(this.b, this.c, 2);
    Graphics ☃ = ☃.getGraphics();
    ☃.drawImage(☃, 0, 0, null);
    if (☃.getHeight() == 32)
    {
      ☃.drawImage(☃, 24, 48, 20, 52, 4, 16, 8, 20, null);
      ☃.drawImage(☃, 28, 48, 24, 52, 8, 16, 12, 20, null);
      ☃.drawImage(☃, 20, 52, 16, 64, 8, 20, 12, 32, null);
      ☃.drawImage(☃, 24, 52, 20, 64, 4, 20, 8, 32, null);
      ☃.drawImage(☃, 28, 52, 24, 64, 0, 20, 4, 32, null);
      ☃.drawImage(☃, 32, 52, 28, 64, 12, 20, 16, 32, null);
      
      ☃.drawImage(☃, 40, 48, 36, 52, 44, 16, 48, 20, null);
      ☃.drawImage(☃, 44, 48, 40, 52, 48, 16, 52, 20, null);
      ☃.drawImage(☃, 36, 52, 32, 64, 48, 20, 52, 32, null);
      ☃.drawImage(☃, 40, 52, 36, 64, 44, 20, 48, 32, null);
      ☃.drawImage(☃, 44, 52, 40, 64, 40, 20, 44, 32, null);
      ☃.drawImage(☃, 48, 52, 44, 64, 52, 20, 56, 32, null);
    }
    ☃.dispose();
    
    this.a = ((DataBufferInt)☃.getRaster().getDataBuffer()).getData();
    
    b(0, 0, 32, 16);
    a(32, 0, 64, 32);
    b(0, 16, 64, 32);
    
    a(0, 32, 16, 48);
    a(16, 32, 40, 48);
    a(40, 32, 56, 48);
    
    a(0, 48, 16, 64);
    b(16, 48, 48, 64);
    a(48, 48, 64, 64);
    
    return ☃;
  }
  
  public void a() {}
  
  private void a(int ☃, int ☃, int ☃, int ☃)
  {
    if (c(☃, ☃, ☃, ☃)) {
      return;
    }
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        this.a[(☃ + ☃ * this.b)] &= 0xFFFFFF;
      }
    }
  }
  
  private void b(int ☃, int ☃, int ☃, int ☃)
  {
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        this.a[(☃ + ☃ * this.b)] |= 0xFF000000;
      }
    }
  }
  
  private boolean c(int ☃, int ☃, int ☃, int ☃)
  {
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++)
      {
        int ☃ = this.a[(☃ + ☃ * this.b)];
        if ((☃ >> 24 & 0xFF) < 128) {
          return true;
        }
      }
    }
    return false;
  }
}
