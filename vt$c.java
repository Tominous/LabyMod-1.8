class vt$c
  extends qq
{
  private vt g;
  
  public vt$c(vt ☃)
  {
    super(☃);
    this.g = ☃;
  }
  
  public void c()
  {
    if ((!this.f) || (this.g.s().m()))
    {
      this.g.k(0.0F);
      vt.a(this.g, false);
      return;
    }
    double ☃ = this.b - this.g.s;
    double ☃ = this.c - this.g.t;
    double ☃ = this.d - this.g.u;
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    ☃ = ns.a(☃);
    ☃ /= ☃;
    
    float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
    
    this.g.y = a(this.g.y, ☃, 30.0F);
    this.g.aI = this.g.y;
    
    float ☃ = (float)(this.e * this.g.a(vy.d).e());
    this.g.k(this.g.bI() + (☃ - this.g.bI()) * 0.125F);
    double ☃ = Math.sin((this.g.W + this.g.F()) * 0.5D) * 0.05D;
    double ☃ = Math.cos(this.g.y * 3.1415927F / 180.0F);
    double ☃ = Math.sin(this.g.y * 3.1415927F / 180.0F);
    this.g.v += ☃ * ☃;
    this.g.x += ☃ * ☃;
    
    ☃ = Math.sin((this.g.W + this.g.F()) * 0.75D) * 0.05D;
    this.g.w += ☃ * (☃ + ☃) * 0.25D;
    this.g.w += this.g.bI() * ☃ * 0.1D;
    
    qp ☃ = this.g.p();
    double ☃ = this.g.s + ☃ / ☃ * 2.0D;
    double ☃ = this.g.aS() + this.g.t + ☃ / ☃ * 1.0D;
    double ☃ = this.g.u + ☃ / ☃ * 2.0D;
    double ☃ = ☃.e();
    double ☃ = ☃.f();
    double ☃ = ☃.g();
    if (!☃.b())
    {
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    this.g.p().a(☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, 10.0F, 40.0F);
    vt.a(this.g, true);
  }
}
