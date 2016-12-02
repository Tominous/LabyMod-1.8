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
    
    this.S = 0.0F;
    this.T = true;
    
    this.bZ = 0.25F;
    
    this.j = 10.0D;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    return true;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    
    this.b = ☃;
  }
  
  public void t_()
  {
    this.bZ = 0.0F;
    super.t_();
    
    this.aA = this.aB;
    double ☃ = this.s - this.p;
    double ☃ = this.u - this.r;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 4.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    this.aB += (☃ - this.aB) * 0.4F;
    this.aC += this.aB;
    if ((!this.a) && (ay()) && (this.bi.a[this.bi.c] != null))
    {
      zx ☃ = this.bi.a[this.bi.c];
      a(this.bi.a[this.bi.c], ☃.b().d(☃));
      this.a = true;
    }
    else if ((this.a) && (!ay()))
    {
      bV();
      this.a = false;
    }
  }
  
  public void m()
  {
    if (this.b > 0)
    {
      double ☃ = this.s + (this.c - this.s) / this.b;
      double ☃ = this.t + (this.d - this.t) / this.b;
      double ☃ = this.u + (this.e - this.u) / this.b;
      
      double ☃ = this.f - this.y;
      while (☃ < -180.0D) {
        ☃ += 360.0D;
      }
      while (☃ >= 180.0D) {
        ☃ -= 360.0D;
      }
      this.y = ((float)(this.y + ☃ / this.b));
      this.z = ((float)(this.z + (this.g - this.z) / this.b));
      
      this.b -= 1;
      b(☃, ☃, ☃);
      b(this.y, this.z);
    }
    this.bn = this.bo;
    
    bx();
    
    float ☃ = ns.a(this.v * this.v + this.x * this.x);
    float ☃ = (float)Math.atan(-this.w * 0.20000000298023224D) * 15.0F;
    if (☃ > 0.1F) {
      ☃ = 0.1F;
    }
    if ((!this.C) || (bn() <= 0.0F)) {
      ☃ = 0.0F;
    }
    if ((this.C) || (bn() <= 0.0F)) {
      ☃ = 0.0F;
    }
    this.bo += (☃ - this.bo) * 0.4F;
    this.aF += (☃ - this.aF) * 0.8F;
  }
  
  public void c(int ☃, zx ☃)
  {
    if (☃ == 0) {
      this.bi.a[this.bi.c] = ☃;
    } else {
      this.bi.b[(☃ - 1)] = ☃;
    }
  }
  
  public void a(eu ☃)
  {
    ave.A().q.d().a(☃);
  }
  
  public boolean a(int ☃, String ☃)
  {
    return false;
  }
  
  public cj c()
  {
    return new cj(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D);
  }
}
