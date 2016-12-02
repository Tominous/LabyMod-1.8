import com.mojang.authlib.GameProfile;

public class bex
  extends bet
{
  private boolean a;
  private int b;
  private double c;
  private double d;
  private double e;
  private double f;
  private double g;
  
  public bex(adm ☃, GameProfile ☃)
  {
    super(☃, ☃);
    
    S = 0.0F;
    T = true;
    
    bZ = 0.25F;
    
    j = 10.0D;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    return true;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
    g = ☃;
    
    b = ☃;
  }
  
  public void t_()
  {
    bZ = 0.0F;
    super.t_();
    
    aA = aB;
    double ☃ = s - p;
    double ☃ = u - r;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 4.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    aB += (☃ - aB) * 0.4F;
    aC += aB;
    if ((!a) && (ay()) && (bi.a[bi.c] != null))
    {
      zx ☃ = bi.a[bi.c];
      a(bi.a[bi.c], ☃.b().d(☃));
      a = true;
    }
    else if ((a) && (!ay()))
    {
      bV();
      a = false;
    }
  }
  
  public void m()
  {
    if (b > 0)
    {
      double ☃ = s + (c - s) / b;
      double ☃ = t + (d - t) / b;
      double ☃ = u + (e - u) / b;
      
      double ☃ = f - y;
      while (☃ < -180.0D) {
        ☃ += 360.0D;
      }
      while (☃ >= 180.0D) {
        ☃ -= 360.0D;
      }
      y = ((float)(y + ☃ / b));
      z = ((float)(z + (g - z) / b));
      
      b -= 1;
      b(☃, ☃, ☃);
      b(y, z);
    }
    bn = bo;
    
    bx();
    
    float ☃ = ns.a(v * v + x * x);
    float ☃ = (float)Math.atan(-w * 0.20000000298023224D) * 15.0F;
    if (☃ > 0.1F) {
      ☃ = 0.1F;
    }
    if ((!C) || (bn() <= 0.0F)) {
      ☃ = 0.0F;
    }
    if ((C) || (bn() <= 0.0F)) {
      ☃ = 0.0F;
    }
    bo += (☃ - bo) * 0.4F;
    aF += (☃ - aF) * 0.8F;
  }
  
  public void c(int ☃, zx ☃)
  {
    if (☃ == 0) {
      bi.a[bi.c] = ☃;
    } else {
      bi.b[(☃ - 1)] = ☃;
    }
  }
  
  public void a(eu ☃)
  {
    Aq.d().a(☃);
  }
  
  public boolean a(int ☃, String ☃)
  {
    return false;
  }
  
  public cj c()
  {
    return new cj(s + 0.5D, t + 0.5D, u + 0.5D);
  }
}
