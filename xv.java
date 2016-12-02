public class xv
  extends yg
{
  private wn a;
  private int b;
  
  public xv(wn ☃, og ☃, int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃);
    
    this.a = ☃;
  }
  
  public boolean a(zx ☃)
  {
    return false;
  }
  
  public zx a(int ☃)
  {
    if (e()) {
      this.b += Math.min(☃, d().b);
    }
    return super.a(☃);
  }
  
  public void a(wn ☃, zx ☃)
  {
    c(☃);
    super.a(☃, ☃);
  }
  
  protected void a(zx ☃, int ☃)
  {
    this.b += ☃;
    c(☃);
  }
  
  protected void c(zx ☃)
  {
    ☃.a(this.a.o, this.a, this.b);
    if (!this.a.o.D)
    {
      int ☃ = this.b;
      float ☃ = abo.a().b(☃);
      if (☃ == 0.0F)
      {
        ☃ = 0;
      }
      else if (☃ < 1.0F)
      {
        int ☃ = ns.d(☃ * ☃);
        if ((☃ < ns.f(☃ * ☃)) && (Math.random() < ☃ * ☃ - ☃)) {
          ☃++;
        }
        ☃ = ☃;
      }
      while (☃ > 0)
      {
        int ☃ = pp.a(☃);
        ☃ -= ☃;
        this.a.o.d(new pp(this.a.o, this.a.s, this.a.t + 0.5D, this.a.u + 0.5D, ☃));
      }
    }
    this.b = 0;
    if (☃.b() == zy.j) {
      this.a.b(mr.k);
    }
    if (☃.b() == zy.aV) {
      this.a.b(mr.p);
    }
  }
}
