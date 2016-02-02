public class qq
{
  protected ps a;
  protected double b;
  protected double c;
  protected double d;
  protected double e;
  protected boolean f;
  
  public qq(ps ☃)
  {
    this.a = ☃;
    this.b = ☃.s;
    this.c = ☃.t;
    this.d = ☃.u;
  }
  
  public boolean a()
  {
    return this.f;
  }
  
  public double b()
  {
    return this.e;
  }
  
  public void a(double ☃, double ☃, double ☃, double ☃)
  {
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = true;
  }
  
  public void c()
  {
    this.a.n(0.0F);
    if (!this.f) {
      return;
    }
    this.f = false;
    
    int ☃ = ns.c(this.a.aR().b + 0.5D);
    
    double ☃ = this.b - this.a.s;
    double ☃ = this.d - this.a.u;
    double ☃ = this.c - ☃;
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    if (☃ < 2.500000277905201E-7D) {
      return;
    }
    float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
    
    this.a.y = a(this.a.y, ☃, 30.0F);
    this.a.k((float)(this.e * this.a.a(vy.d).e()));
    if ((☃ > 0.0D) && (☃ * ☃ + ☃ * ☃ < 1.0D)) {
      this.a.r().a();
    }
  }
  
  protected float a(float ☃, float ☃, float ☃)
  {
    float ☃ = ns.g(☃ - ☃);
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    float ☃ = ☃ + ☃;
    if (☃ < 0.0F) {
      ☃ += 360.0F;
    } else if (☃ > 360.0F) {
      ☃ -= 360.0F;
    }
    return ☃;
  }
  
  public double d()
  {
    return this.b;
  }
  
  public double e()
  {
    return this.c;
  }
  
  public double f()
  {
    return this.d;
  }
}
