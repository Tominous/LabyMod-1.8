public abstract class pq
  extends ps
{
  public pq(adm ☃)
  {
    super(☃);
  }
  
  public void e(float ☃, float ☃) {}
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃) {}
  
  public void g(float ☃, float ☃)
  {
    if (V())
    {
      a(☃, ☃, 0.02F);
      d(this.v, this.w, this.x);
      
      this.v *= 0.800000011920929D;
      this.w *= 0.800000011920929D;
      this.x *= 0.800000011920929D;
    }
    else if (ab())
    {
      a(☃, ☃, 0.02F);
      d(this.v, this.w, this.x);
      this.v *= 0.5D;
      this.w *= 0.5D;
      this.x *= 0.5D;
    }
    else
    {
      float ☃ = 0.91F;
      if (this.C) {
        ☃ = this.o.p(new cj(ns.c(this.s), ns.c(aR().b) - 1, ns.c(this.u))).c().L * 0.91F;
      }
      float ☃ = 0.16277136F / (☃ * ☃ * ☃);
      a(☃, ☃, this.C ? 0.1F * ☃ : 0.02F);
      
      ☃ = 0.91F;
      if (this.C) {
        ☃ = this.o.p(new cj(ns.c(this.s), ns.c(aR().b) - 1, ns.c(this.u))).c().L * 0.91F;
      }
      d(this.v, this.w, this.x);
      
      this.v *= ☃;
      this.w *= ☃;
      this.x *= ☃;
    }
    this.aA = this.aB;
    double ☃ = this.s - this.p;
    double ☃ = this.u - this.r;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 4.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    this.aB += (☃ - this.aB) * 0.4F;
    this.aC += this.aB;
  }
  
  public boolean k_()
  {
    return false;
  }
}
