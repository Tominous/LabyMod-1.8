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
    a = new ata();
    a.a(true);
    return new asy(a);
  }
  
  protected boolean b()
  {
    return (b.C) || ((h()) && (o())) || ((b.au()) && ((b instanceof we)) && ((b.m instanceof tn)));
  }
  
  protected aui c()
  {
    return new aui(b.s, p(), b.u);
  }
  
  private int p()
  {
    if ((!b.V()) || (!h())) {
      return (int)(b.aR().b + 0.5D);
    }
    int ☃ = (int)b.aR().b;
    afh ☃ = c.p(new cj(ns.c(b.s), ☃, ns.c(b.u))).c();
    int ☃ = 0;
    while ((☃ == afi.i) || (☃ == afi.j))
    {
      ☃++;
      ☃ = c.p(new cj(ns.c(b.s), ☃, ns.c(b.u))).c();
      ☃++;
      if (☃ > 16) {
        return (int)b.aR().b;
      }
    }
    return ☃;
  }
  
  protected void d()
  {
    super.d();
    if (f)
    {
      if (c.i(new cj(ns.c(b.s), (int)(b.aR().b + 0.5D), ns.c(b.u)))) {
        return;
      }
      for (int ☃ = 0; ☃ < d.d(); ☃++)
      {
        asv ☃ = d.a(☃);
        if (c.i(new cj(a, b, c)))
        {
          d.b(☃ - 1);
          return;
        }
      }
    }
  }
  
  protected boolean a(aui ☃, aui ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = ns.c(a);
    int ☃ = ns.c(c);
    
    double ☃ = a - a;
    double ☃ = c - c;
    double ☃ = ☃ * ☃ + ☃ * ☃;
    if (☃ < 1.0E-8D) {
      return false;
    }
    double ☃ = 1.0D / Math.sqrt(☃);
    ☃ *= ☃;
    ☃ *= ☃;
    
    ☃ += 2;
    ☃ += 2;
    if (!a(☃, (int)b, ☃, ☃, ☃, ☃, ☃, ☃, ☃)) {
      return false;
    }
    ☃ -= 2;
    ☃ -= 2;
    
    double ☃ = 1.0D / Math.abs(☃);
    double ☃ = 1.0D / Math.abs(☃);
    
    double ☃ = ☃ * 1 - a;
    double ☃ = ☃ * 1 - c;
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
    int ☃ = ns.c(a);
    int ☃ = ns.c(c);
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
      if (!a(☃, (int)b, ☃, ☃, ☃, ☃, ☃, ☃, ☃)) {
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
        double ☃ = ☃ + 0.5D - a;
        double ☃ = ☃ + 0.5D - c;
        if (☃ * ☃ + ☃ * ☃ >= 0.0D)
        {
          afh ☃ = c.p(new cj(☃, ☃ - 1, ☃)).c();
          arm ☃ = ☃.t();
          if (☃ == arm.a) {
            return false;
          }
          if ((☃ == arm.h) && (!b.V())) {
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
      double ☃ = ☃.n() + 0.5D - a;
      double ☃ = ☃.p() + 0.5D - c;
      if (☃ * ☃ + ☃ * ☃ >= 0.0D)
      {
        afh ☃ = c.p(☃).c();
        if (!☃.b(c, ☃)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public void a(boolean ☃)
  {
    a.c(☃);
  }
  
  public boolean e()
  {
    return a.e();
  }
  
  public void b(boolean ☃)
  {
    a.b(☃);
  }
  
  public void c(boolean ☃)
  {
    a.a(☃);
  }
  
  public boolean g()
  {
    return a.b();
  }
  
  public void d(boolean ☃)
  {
    a.d(☃);
  }
  
  public boolean h()
  {
    return a.d();
  }
  
  public void e(boolean ☃)
  {
    f = ☃;
  }
}
