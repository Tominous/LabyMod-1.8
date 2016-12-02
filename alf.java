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
    if (++this.h % 20 * 4 == 0) {
      this.b.c(this.c, afi.bQ, 1, this.g);
    }
    this.f = this.a;
    
    int ☃ = this.c.n();
    int ☃ = this.c.o();
    int ☃ = this.c.p();
    
    float ☃ = 0.1F;
    if ((this.g > 0) && (this.a == 0.0F))
    {
      double ☃ = ☃ + 0.5D;
      double ☃ = ☃ + 0.5D;
      
      this.b.a(☃, ☃ + 0.5D, ☃, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
    }
    if (((this.g == 0) && (this.a > 0.0F)) || ((this.g > 0) && (this.a < 1.0F)))
    {
      float ☃ = this.a;
      if (this.g > 0) {
        this.a += ☃;
      } else {
        this.a -= ☃;
      }
      if (this.a > 1.0F) {
        this.a = 1.0F;
      }
      float ☃ = 0.5F;
      if ((this.a < ☃) && (☃ >= ☃))
      {
        double ☃ = ☃ + 0.5D;
        double ☃ = ☃ + 0.5D;
        
        this.b.a(☃, ☃ + 0.5D, ☃, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
      }
      if (this.a < 0.0F) {
        this.a = 0.0F;
      }
    }
  }
  
  public boolean c(int ☃, int ☃)
  {
    if (☃ == 1)
    {
      this.g = ☃;
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
    this.g += 1;
    this.b.c(this.c, afi.bQ, 1, this.g);
  }
  
  public void d()
  {
    this.g -= 1;
    this.b.c(this.c, afi.bQ, 1, this.g);
  }
  
  public boolean a(wn ☃)
  {
    if (this.b.s(this.c) != this) {
      return false;
    }
    if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
}
