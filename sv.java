public class sv
  extends sw
{
  protected ata a;
  private boolean f;
  
  public sv(ps ☃, adm ☃)
  {
    super(☃, ☃);
  }
  
  protected asy a()
  {
    this.a = new ata();
    this.a.a(true);
    return new asy(this.a);
  }
  
  protected boolean b()
  {
    return (this.b.C) || ((h()) && (o())) || ((this.b.au()) && ((this.b instanceof we)) && ((this.b.m instanceof tn)));
  }
  
  protected aui c()
  {
    return new aui(this.b.s, p(), this.b.u);
  }
  
  private int p()
  {
    if ((!this.b.V()) || (!h())) {
      return (int)(this.b.aR().b + 0.5D);
    }
    int ☃ = (int)this.b.aR().b;
    afh ☃ = this.c.p(new cj(ns.c(this.b.s), ☃, ns.c(this.b.u))).c();
    int ☃ = 0;
    while ((☃ == afi.i) || (☃ == afi.j))
    {
      ☃++;
      ☃ = this.c.p(new cj(ns.c(this.b.s), ☃, ns.c(this.b.u))).c();
      ☃++;
      if (☃ > 16) {
        return (int)this.b.aR().b;
      }
    }
    return ☃;
  }
  
  protected void d()
  {
    super.d();
    if (this.f)
    {
      if (this.c.i(new cj(ns.c(this.b.s), (int)(this.b.aR().b + 0.5D), ns.c(this.b.u)))) {
        return;
      }
      for (int ☃ = 0; ☃ < this.d.d(); ☃++)
      {
        asv ☃ = this.d.a(☃);
        if (this.c.i(new cj(☃.a, ☃.b, ☃.c)))
        {
          this.d.b(☃ - 1);
          return;
        }
      }
    }
  }
  
  protected boolean a(aui ☃, aui ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.c);
    
    double ☃ = ☃.a - ☃.a;
    double ☃ = ☃.c - ☃.c;
    double ☃ = ☃ * ☃ + ☃ * ☃;
    if (☃ < 1.0E-8D) {
      return false;
    }
    double ☃ = 1.0D / Math.sqrt(☃);
    ☃ *= ☃;
    ☃ *= ☃;
    
    ☃ += 2;
    ☃ += 2;
    if (!a(☃, (int)☃.b, ☃, ☃, ☃, ☃, ☃, ☃, ☃)) {
      return false;
    }
    ☃ -= 2;
    ☃ -= 2;
    
    double ☃ = 1.0D / Math.abs(☃);
    double ☃ = 1.0D / Math.abs(☃);
    
    double ☃ = ☃ * 1 - ☃.a;
    double ☃ = ☃ * 1 - ☃.c;
    if (☃ >= 0.0D) {
      ☃ += 1.0D;
    }
    if (☃ >= 0.0D) {
      ☃ += 1.0D;
    }
    ☃ /= ☃;
    ☃ /= ☃;
    
    int ☃ = ☃ < 0.0D ? -1 : 1;
    int ☃ = ☃ < 0.0D ? -1 : 1;
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.c);
    int ☃ = ☃ - ☃;
    int ☃ = ☃ - ☃;
    while ((☃ * ☃ > 0) || (☃ * ☃ > 0))
    {
      if (☃ < ☃)
      {
        ☃ += ☃;
        ☃ += ☃;
        ☃ = ☃ - ☃;
      }
      else
      {
        ☃ += ☃;
        ☃ += ☃;
        ☃ = ☃ - ☃;
      }
      if (!a(☃, (int)☃.b, ☃, ☃, ☃, ☃, ☃, ☃, ☃)) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, aui ☃, double ☃, double ☃)
  {
    int ☃ = ☃ - ☃ / 2;
    int ☃ = ☃ - ☃ / 2;
    if (!b(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃)) {
      return false;
    }
    for (int ☃ = ☃; ☃ < ☃ + ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃ + ☃; ☃++)
      {
        double ☃ = ☃ + 0.5D - ☃.a;
        double ☃ = ☃ + 0.5D - ☃.c;
        if (☃ * ☃ + ☃ * ☃ >= 0.0D)
        {
          afh ☃ = this.c.p(new cj(☃, ☃ - 1, ☃)).c();
          arm ☃ = ☃.t();
          if (☃ == arm.a) {
            return false;
          }
          if ((☃ == arm.h) && (!this.b.V())) {
            return false;
          }
          if (☃ == arm.i) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  private boolean b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, aui ☃, double ☃, double ☃)
  {
    for (cj ☃ : cj.a(new cj(☃, ☃, ☃), new cj(☃ + ☃ - 1, ☃ + ☃ - 1, ☃ + ☃ - 1)))
    {
      double ☃ = ☃.n() + 0.5D - ☃.a;
      double ☃ = ☃.p() + 0.5D - ☃.c;
      if (☃ * ☃ + ☃ * ☃ >= 0.0D)
      {
        afh ☃ = this.c.p(☃).c();
        if (!☃.b(this.c, ☃)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public void a(boolean ☃)
  {
    this.a.c(☃);
  }
  
  public boolean e()
  {
    return this.a.e();
  }
  
  public void b(boolean ☃)
  {
    this.a.b(☃);
  }
  
  public void c(boolean ☃)
  {
    this.a.a(☃);
  }
  
  public boolean g()
  {
    return this.a.b();
  }
  
  public void d(boolean ☃)
  {
    this.a.d(☃);
  }
  
  public boolean h()
  {
    return this.a.d();
  }
  
  public void e(boolean ☃)
  {
    this.f = ☃;
  }
}
