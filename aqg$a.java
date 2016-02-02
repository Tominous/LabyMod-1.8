import java.util.List;
import java.util.Random;

public class aqg$a
  extends aqt
{
  private boolean a;
  private boolean b;
  private boolean c;
  private int d;
  
  public aqg$a() {}
  
  protected void a(dn ☃)
  {
    ☃.a("hr", this.a);
    ☃.a("sc", this.b);
    ☃.a("hps", this.c);
    ☃.a("Num", this.d);
  }
  
  protected void b(dn ☃)
  {
    this.a = ☃.n("hr");
    this.b = ☃.n("sc");
    this.c = ☃.n("hps");
    this.d = ☃.f("Num");
  }
  
  public aqg$a(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    this.m = ☃;
    this.l = ☃;
    this.a = (☃.nextInt(3) == 0);
    this.b = ((!this.a) && (☃.nextInt(23) == 0));
    if ((this.m == cq.c) || (this.m == cq.d)) {
      this.d = (☃.e() / 5);
    } else {
      this.d = (☃.c() / 5);
    }
  }
  
  public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    aqe ☃ = new aqe(☃, ☃, ☃, ☃, ☃ + 2, ☃);
    
    int ☃ = ☃.nextInt(3) + 2;
    while (☃ > 0)
    {
      int ☃ = ☃ * 5;
      switch (aqg.1.a[☃.ordinal()])
      {
      case 1: 
        ☃.d = (☃ + 2);
        ☃.c = (☃ - (☃ - 1));
        break;
      case 2: 
        ☃.d = (☃ + 2);
        ☃.f = (☃ + (☃ - 1));
        break;
      case 3: 
        ☃.a = (☃ - (☃ - 1));
        ☃.f = (☃ + 2);
        break;
      case 4: 
        ☃.d = (☃ + (☃ - 1));
        ☃.f = (☃ + 2);
      }
      if (aqt.a(☃, ☃) == null) {
        break;
      }
      ☃--;
    }
    if (☃ > 0) {
      return ☃;
    }
    return null;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = d();
    int ☃ = ☃.nextInt(4);
    if (this.m != null) {
      switch (aqg.1.a[this.m.ordinal()])
      {
      case 1: 
        if (☃ <= 1) {
          aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.c - 1, this.m, ☃);
        } else if (☃ == 2) {
          aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, cq.e, ☃);
        } else {
          aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, cq.f, ☃);
        }
        break;
      case 2: 
        if (☃ <= 1) {
          aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.f + 1, this.m, ☃);
        } else if (☃ == 2) {
          aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b - 1 + ☃.nextInt(3), this.l.f - 3, cq.e, ☃);
        } else {
          aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b - 1 + ☃.nextInt(3), this.l.f - 3, cq.f, ☃);
        }
        break;
      case 3: 
        if (☃ <= 1) {
          aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, this.m, ☃);
        } else if (☃ == 2) {
          aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.c - 1, cq.c, ☃);
        } else {
          aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.f + 1, cq.d, ☃);
        }
        break;
      case 4: 
        if (☃ <= 1) {
          aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, this.m, ☃);
        } else if (☃ == 2) {
          aqg.a(☃, ☃, ☃, this.l.d - 3, this.l.b - 1 + ☃.nextInt(3), this.l.c - 1, cq.c, ☃);
        } else {
          aqg.a(☃, ☃, ☃, this.l.d - 3, this.l.b - 1 + ☃.nextInt(3), this.l.f + 1, cq.d, ☃);
        }
        break;
      }
    }
    if (☃ < 8) {
      if ((this.m == cq.c) || (this.m == cq.d)) {
        for (int ☃ = this.l.c + 3; ☃ + 3 <= this.l.f; ☃ += 5)
        {
          int ☃ = ☃.nextInt(5);
          if (☃ == 0) {
            aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, ☃, cq.e, ☃ + 1);
          } else if (☃ == 1) {
            aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, ☃, cq.f, ☃ + 1);
          }
        }
      } else {
        for (int ☃ = this.l.a + 3; ☃ + 3 <= this.l.d; ☃ += 5)
        {
          int ☃ = ☃.nextInt(5);
          if (☃ == 0) {
            aqg.a(☃, ☃, ☃, ☃, this.l.b, this.l.c - 1, cq.c, ☃ + 1);
          } else if (☃ == 1) {
            aqg.a(☃, ☃, ☃, ☃, this.l.b, this.l.f + 1, cq.d, ☃ + 1);
          }
        }
      }
    }
  }
  
  protected boolean a(adm ☃, aqe ☃, Random ☃, int ☃, int ☃, int ☃, List<ob> ☃, int ☃)
  {
    cj ☃ = new cj(a(☃, ☃), d(☃), b(☃, ☃));
    if ((☃.b(☃)) && 
      (☃.p(☃).c().t() == arm.a))
    {
      int ☃ = ☃.nextBoolean() ? 1 : 0;
      ☃.a(☃, afi.av.a(a(afi.av, ☃)), 2);
      vb ☃ = new vb(☃, ☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F);
      ob.a(☃, ☃, ☃, ☃);
      ☃.d(☃);
      return true;
    }
    return false;
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    int ☃ = 0;
    int ☃ = 2;
    int ☃ = 0;
    int ☃ = 2;
    int ☃ = this.d * 5 - 1;
    
    a(☃, ☃, 0, 0, 0, 2, 1, ☃, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, ☃, 0.8F, 0, 2, 0, 2, 2, ☃, afi.a.Q(), afi.a.Q(), false);
    if (this.b) {
      a(☃, ☃, ☃, 0.6F, 0, 0, 0, 2, 1, ☃, afi.G.Q(), afi.a.Q(), false);
    }
    for (int ☃ = 0; ☃ < this.d; ☃++)
    {
      int ☃ = 2 + ☃ * 5;
      
      a(☃, ☃, 0, 0, ☃, 0, 1, ☃, afi.aO.Q(), afi.a.Q(), false);
      a(☃, ☃, 2, 0, ☃, 2, 1, ☃, afi.aO.Q(), afi.a.Q(), false);
      if (☃.nextInt(4) == 0)
      {
        a(☃, ☃, 0, 2, ☃, 0, 2, ☃, afi.f.Q(), afi.a.Q(), false);
        a(☃, ☃, 2, 2, ☃, 2, 2, ☃, afi.f.Q(), afi.a.Q(), false);
      }
      else
      {
        a(☃, ☃, 0, 2, ☃, 2, 2, ☃, afi.f.Q(), afi.a.Q(), false);
      }
      a(☃, ☃, ☃, 0.1F, 0, 2, ☃ - 1, afi.G.Q());
      a(☃, ☃, ☃, 0.1F, 2, 2, ☃ - 1, afi.G.Q());
      a(☃, ☃, ☃, 0.1F, 0, 2, ☃ + 1, afi.G.Q());
      a(☃, ☃, ☃, 0.1F, 2, 2, ☃ + 1, afi.G.Q());
      a(☃, ☃, ☃, 0.05F, 0, 2, ☃ - 2, afi.G.Q());
      a(☃, ☃, ☃, 0.05F, 2, 2, ☃ - 2, afi.G.Q());
      a(☃, ☃, ☃, 0.05F, 0, 2, ☃ + 2, afi.G.Q());
      a(☃, ☃, ☃, 0.05F, 2, 2, ☃ + 2, afi.G.Q());
      
      a(☃, ☃, ☃, 0.05F, 1, 2, ☃ - 1, afi.aa.a(cq.b.a()));
      a(☃, ☃, ☃, 0.05F, 1, 2, ☃ + 1, afi.aa.a(cq.b.a()));
      if (☃.nextInt(100) == 0) {
        a(☃, ☃, ☃, 2, 0, ☃ - 1, ob.a(aqg.b(), new ob[] { zy.cd.b(☃) }), 3 + ☃.nextInt(4));
      }
      if (☃.nextInt(100) == 0) {
        a(☃, ☃, ☃, 0, 0, ☃ + 1, ob.a(aqg.b(), new ob[] { zy.cd.b(☃) }), 3 + ☃.nextInt(4));
      }
      if ((this.b) && (!this.c))
      {
        int ☃ = d(0);int ☃ = ☃ - 1 + ☃.nextInt(3);
        int ☃ = a(1, ☃);
        ☃ = b(1, ☃);
        cj ☃ = new cj(☃, ☃, ☃);
        if (☃.b(☃))
        {
          this.c = true;
          ☃.a(☃, afi.ac.Q(), 2);
          
          akw ☃ = ☃.s(☃);
          if ((☃ instanceof all)) {
            ((all)☃).b().a("CaveSpider");
          }
        }
      }
    }
    for (int ☃ = 0; ☃ <= 2; ☃++) {
      for (int ☃ = 0; ☃ <= ☃; ☃++)
      {
        int ☃ = -1;
        alz ☃ = a(☃, ☃, ☃, ☃, ☃);
        if (☃.c().t() == arm.a)
        {
          int ☃ = -1;
          a(☃, afi.f.Q(), ☃, ☃, ☃, ☃);
        }
      }
    }
    if (this.a) {
      for (int ☃ = 0; ☃ <= ☃; ☃++)
      {
        alz ☃ = a(☃, 1, -1, ☃, ☃);
        if ((☃.c().t() != arm.a) && (☃.c().o())) {
          a(☃, ☃, ☃, 0.7F, 1, 0, ☃, afi.av.a(a(afi.av, 0)));
        }
      }
    }
    return true;
  }
}
