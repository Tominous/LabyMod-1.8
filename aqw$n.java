import java.util.List;
import java.util.Random;

abstract class aqw$n
  extends aqt
{
  protected int h = -1;
  private int a;
  private boolean b;
  
  public aqw$n() {}
  
  protected aqw$n(aqw.k ☃, int ☃)
  {
    super(☃);
    if (☃ != null) {
      this.b = ☃.b;
    }
  }
  
  protected void a(dn ☃)
  {
    ☃.a("HPos", this.h);
    ☃.a("VCount", this.a);
    ☃.a("Desert", this.b);
  }
  
  protected void b(dn ☃)
  {
    this.h = ☃.f("HPos");
    this.a = ☃.f("VCount");
    this.b = ☃.n("Desert");
  }
  
  protected aqt a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃)
  {
    if (this.m != null) {
      switch (aqw.1.a[this.m.ordinal()])
      {
      case 1: 
        return aqw.a(☃, ☃, ☃, this.l.a - 1, this.l.b + ☃, this.l.c + ☃, cq.e, d());
      case 2: 
        return aqw.a(☃, ☃, ☃, this.l.a - 1, this.l.b + ☃, this.l.c + ☃, cq.e, d());
      case 3: 
        return aqw.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.c - 1, cq.c, d());
      case 4: 
        return aqw.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.c - 1, cq.c, d());
      }
    }
    return null;
  }
  
  protected aqt b(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃)
  {
    if (this.m != null) {
      switch (aqw.1.a[this.m.ordinal()])
      {
      case 1: 
        return aqw.a(☃, ☃, ☃, this.l.d + 1, this.l.b + ☃, this.l.c + ☃, cq.f, d());
      case 2: 
        return aqw.a(☃, ☃, ☃, this.l.d + 1, this.l.b + ☃, this.l.c + ☃, cq.f, d());
      case 3: 
        return aqw.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.f + 1, cq.d, d());
      case 4: 
        return aqw.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.f + 1, cq.d, d());
      }
    }
    return null;
  }
  
  protected int b(adm ☃, aqe ☃)
  {
    int ☃ = 0;
    int ☃ = 0;
    cj.a ☃ = new cj.a();
    for (int ☃ = this.l.c; ☃ <= this.l.f; ☃++) {
      for (int ☃ = this.l.a; ☃ <= this.l.d; ☃++)
      {
        ☃.c(☃, 64, ☃);
        if (☃.b(☃))
        {
          ☃ += Math.max(☃.r(☃).o(), ☃.t.i());
          ☃++;
        }
      }
    }
    if (☃ == 0) {
      return -1;
    }
    return ☃ / ☃;
  }
  
  protected static boolean a(aqe ☃)
  {
    return (☃ != null) && (☃.b > 10);
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (this.a >= ☃) {
      return;
    }
    for (int ☃ = this.a; ☃ < ☃; ☃++)
    {
      int ☃ = a(☃ + ☃, ☃);
      int ☃ = d(☃);
      int ☃ = b(☃ + ☃, ☃);
      if (!☃.b(new cj(☃, ☃, ☃))) {
        break;
      }
      this.a += 1;
      
      wi ☃ = new wi(☃);
      ☃.b(☃ + 0.5D, ☃, ☃ + 0.5D, 0.0F, 0.0F);
      ☃.a(☃.E(new cj(☃)), null);
      ☃.r(c(☃, ☃.cl()));
      ☃.d(☃);
    }
  }
  
  protected int c(int ☃, int ☃)
  {
    return ☃;
  }
  
  protected alz a(alz ☃)
  {
    if (this.b)
    {
      if ((☃.c() == afi.r) || (☃.c() == afi.s)) {
        return afi.A.Q();
      }
      if (☃.c() == afi.e) {
        return afi.A.a(aji.a.a.a());
      }
      if (☃.c() == afi.f) {
        return afi.A.a(aji.a.c.a());
      }
      if (☃.c() == afi.ad) {
        return afi.bO.Q().a(aju.a, ☃.b(aju.a));
      }
      if (☃.c() == afi.aw) {
        return afi.bO.Q().a(aju.a, ☃.b(aju.a));
      }
      if (☃.c() == afi.n) {
        return afi.A.Q();
      }
    }
    return ☃;
  }
  
  protected void a(adm ☃, alz ☃, int ☃, int ☃, int ☃, aqe ☃)
  {
    alz ☃ = a(☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, alz ☃, alz ☃, boolean ☃)
  {
    alz ☃ = a(☃);
    alz ☃ = a(☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected void b(adm ☃, alz ☃, int ☃, int ☃, int ☃, aqe ☃)
  {
    alz ☃ = a(☃);
    super.b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected void a(boolean ☃)
  {
    this.b = ☃;
  }
}
