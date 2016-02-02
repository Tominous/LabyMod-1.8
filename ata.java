public class ata
  extends asw
{
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  
  public void a(adq ☃, pk ☃)
  {
    super.a(☃, ☃);
    this.j = this.h;
  }
  
  public void a()
  {
    super.a();
    this.h = this.j;
  }
  
  public asv a(pk ☃)
  {
    int ☃;
    if ((this.i) && (☃.V()))
    {
      int ☃ = (int)☃.aR().b;
      cj.a ☃ = new cj.a(ns.c(☃.s), ☃, ns.c(☃.u));
      afh ☃ = this.a.p(☃).c();
      while ((☃ == afi.i) || (☃ == afi.j))
      {
        ☃++;
        ☃.c(ns.c(☃.s), ☃, ns.c(☃.u));
        ☃ = this.a.p(☃).c();
      }
      this.h = false;
    }
    else
    {
      ☃ = ns.c(☃.aR().b + 0.5D);
    }
    return a(ns.c(☃.aR().a), ☃, ns.c(☃.aR().c));
  }
  
  public asv a(pk ☃, double ☃, double ☃, double ☃)
  {
    return a(ns.c(☃ - ☃.J / 2.0F), ns.c(☃), ns.c(☃ - ☃.J / 2.0F));
  }
  
  public int a(asv[] ☃, pk ☃, asv ☃, asv ☃, float ☃)
  {
    int ☃ = 0;
    
    int ☃ = 0;
    if (a(☃, ☃.a, ☃.b + 1, ☃.c) == 1) {
      ☃ = 1;
    }
    asv ☃ = a(☃, ☃.a, ☃.b, ☃.c + 1, ☃);
    asv ☃ = a(☃, ☃.a - 1, ☃.b, ☃.c, ☃);
    asv ☃ = a(☃, ☃.a + 1, ☃.b, ☃.c, ☃);
    asv ☃ = a(☃, ☃.a, ☃.b, ☃.c - 1, ☃);
    if ((☃ != null) && (!☃.i) && (☃.a(☃) < ☃)) {
      ☃[(☃++)] = ☃;
    }
    if ((☃ != null) && (!☃.i) && (☃.a(☃) < ☃)) {
      ☃[(☃++)] = ☃;
    }
    if ((☃ != null) && (!☃.i) && (☃.a(☃) < ☃)) {
      ☃[(☃++)] = ☃;
    }
    if ((☃ != null) && (!☃.i) && (☃.a(☃) < ☃)) {
      ☃[(☃++)] = ☃;
    }
    return ☃;
  }
  
  private asv a(pk ☃, int ☃, int ☃, int ☃, int ☃)
  {
    asv ☃ = null;
    int ☃ = a(☃, ☃, ☃, ☃);
    if (☃ == 2) {
      return a(☃, ☃, ☃);
    }
    if (☃ == 1) {
      ☃ = a(☃, ☃, ☃);
    }
    if ((☃ == null) && (☃ > 0) && (☃ != -3) && (☃ != -4) && (a(☃, ☃, ☃ + ☃, ☃) == 1))
    {
      ☃ = a(☃, ☃ + ☃, ☃);
      ☃ += ☃;
    }
    if (☃ != null)
    {
      int ☃ = 0;
      int ☃ = 0;
      while (☃ > 0)
      {
        ☃ = a(☃, ☃, ☃ - 1, ☃);
        if ((this.h) && (☃ == -1)) {
          return null;
        }
        if (☃ == 1)
        {
          if (☃++ >= ☃.aE()) {
            return null;
          }
          ☃--;
          if (☃ > 0) {
            ☃ = a(☃, ☃, ☃);
          } else {
            return null;
          }
        }
      }
      if (☃ == -2) {
        return null;
      }
    }
    return ☃;
  }
  
  private int a(pk ☃, int ☃, int ☃, int ☃)
  {
    return a(this.a, ☃, ☃, ☃, ☃, this.c, this.d, this.e, this.h, this.g, this.f);
  }
  
  public static int a(adq ☃, pk ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    boolean ☃ = false;
    cj ☃ = new cj(☃);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ < ☃ + ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃ + ☃; ☃++) {
        for (int ☃ = ☃; ☃ < ☃ + ☃; ☃++)
        {
          ☃.c(☃, ☃, ☃);
          afh ☃ = ☃.p(☃).c();
          if (☃.t() != arm.a)
          {
            if ((☃ == afi.bd) || (☃ == afi.cw))
            {
              ☃ = true;
            }
            else if ((☃ == afi.i) || (☃ == afi.j))
            {
              if (☃) {
                return -1;
              }
              ☃ = true;
            }
            else if ((!☃) && ((☃ instanceof agh)) && (☃.t() == arm.d))
            {
              return 0;
            }
            if ((☃.o.p(☃).c() instanceof afe))
            {
              if ((!(☃.o.p(☃).c() instanceof afe)) && (!(☃.o.p(☃.b()).c() instanceof afe))) {
                return -3;
              }
            }
            else if (!☃.b(☃, ☃)) {
              if ((!☃) || (!(☃ instanceof agh)) || (☃.t() != arm.d))
              {
                if (((☃ instanceof agt)) || ((☃ instanceof agu)) || ((☃ instanceof akl))) {
                  return -3;
                }
                if ((☃ == afi.bd) || (☃ == afi.cw)) {
                  return -4;
                }
                arm ☃ = ☃.t();
                if (☃ == arm.i)
                {
                  if (!☃.ab()) {
                    return -2;
                  }
                }
                else {
                  return 0;
                }
              }
            }
          }
        }
      }
    }
    return ☃ ? 2 : 1;
  }
  
  public void a(boolean ☃)
  {
    this.f = ☃;
  }
  
  public void b(boolean ☃)
  {
    this.g = ☃;
  }
  
  public void c(boolean ☃)
  {
    this.h = ☃;
  }
  
  public void d(boolean ☃)
  {
    this.i = ☃;
  }
  
  public boolean b()
  {
    return this.f;
  }
  
  public boolean d()
  {
    return this.i;
  }
  
  public boolean e()
  {
    return this.h;
  }
}
