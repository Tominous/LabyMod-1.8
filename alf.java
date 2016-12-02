import java.util.Random;

public class alf
  extends akw
  implements km
{
  public float a;
  public float f;
  public int g;
  private int h;
  
  public void c()
  {
    if (++h % 20 * 4 == 0) {
      b.c(c, afi.bQ, 1, g);
    }
    f = a;
    
    int ☃ = c.n();
    int ☃ = c.o();
    int ☃ = c.p();
    
    float ☃ = 0.1F;
    if ((g > 0) && (a == 0.0F))
    {
      double ☃ = ☃ + 0.5D;
      double ☃ = ☃ + 0.5D;
      
      b.a(☃, ☃ + 0.5D, ☃, "random.chestopen", 0.5F, b.s.nextFloat() * 0.1F + 0.9F);
    }
    if (((g == 0) && (a > 0.0F)) || ((g > 0) && (a < 1.0F)))
    {
      float ☃ = a;
      if (g > 0) {
        a += ☃;
      } else {
        a -= ☃;
      }
      if (a > 1.0F) {
        a = 1.0F;
      }
      float ☃ = 0.5F;
      if ((a < ☃) && (☃ >= ☃))
      {
        double ☃ = ☃ + 0.5D;
        double ☃ = ☃ + 0.5D;
        
        b.a(☃, ☃ + 0.5D, ☃, "random.chestclosed", 0.5F, b.s.nextFloat() * 0.1F + 0.9F);
      }
      if (a < 0.0F) {
        a = 0.0F;
      }
    }
  }
  
  public boolean c(int ☃, int ☃)
  {
    if (☃ == 1)
    {
      g = ☃;
      return true;
    }
    return super.c(☃, ☃);
  }
  
  public void y()
  {
    E();
    super.y();
  }
  
  public void b()
  {
    g += 1;
    b.c(c, afi.bQ, 1, g);
  }
  
  public void d()
  {
    g -= 1;
    b.c(c, afi.bQ, 1, g);
  }
  
  public boolean a(wn ☃)
  {
    if (b.s(c) != this) {
      return false;
    }
    if (☃.e(c.n() + 0.5D, c.o() + 0.5D, c.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
}
