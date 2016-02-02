import java.util.List;
import java.util.Random;

public class aqg$b
  extends aqt
{
  private cq a;
  private boolean b;
  
  public aqg$b() {}
  
  protected void a(dn ☃)
  {
    ☃.a("tf", this.b);
    ☃.a("D", this.a.b());
  }
  
  protected void b(dn ☃)
  {
    this.b = ☃.n("tf");
    this.a = cq.b(☃.f("D"));
  }
  
  public aqg$b(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.a = ☃;
    this.l = ☃;
    this.b = (☃.d() > 3);
  }
  
  public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    aqe ☃ = new aqe(☃, ☃, ☃, ☃, ☃ + 2, ☃);
    if (☃.nextInt(4) == 0) {
      ☃.e += 4;
    }
    switch (aqg.1.a[☃.ordinal()])
    {
    case 1: 
      ☃.a = (☃ - 1);
      ☃.d = (☃ + 3);
      ☃.c = (☃ - 4);
      break;
    case 2: 
      ☃.a = (☃ - 1);
      ☃.d = (☃ + 3);
      ☃.f = (☃ + 4);
      break;
    case 3: 
      ☃.a = (☃ - 4);
      ☃.c = (☃ - 1);
      ☃.f = (☃ + 3);
      break;
    case 4: 
      ☃.d = (☃ + 4);
      ☃.c = (☃ - 1);
      ☃.f = (☃ + 3);
    }
    if (aqt.a(☃, ☃) != null) {
      return null;
    }
    return ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = d();
    switch (aqg.1.a[this.a.ordinal()])
    {
    case 1: 
      aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, ☃);
      aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, ☃);
      aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, ☃);
      break;
    case 2: 
      aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, ☃);
      aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, ☃);
      aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, ☃);
      break;
    case 3: 
      aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, ☃);
      aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, ☃);
      aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, ☃);
      break;
    case 4: 
      aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, ☃);
      aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, ☃);
      aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, ☃);
    }
    if (this.b)
    {
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, cq.c, ☃);
      }
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, cq.e, ☃);
      }
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, cq.f, ☃);
      }
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, cq.d, ☃);
      }
    }
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    if (this.b)
    {
      a(☃, ☃, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
    }
    else
    {
      a(☃, ☃, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
    }
    a(☃, ☃, this.l.a + 1, this.l.b, this.l.c + 1, this.l.a + 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
    a(☃, ☃, this.l.a + 1, this.l.b, this.l.f - 1, this.l.a + 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
    a(☃, ☃, this.l.d - 1, this.l.b, this.l.c + 1, this.l.d - 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
    a(☃, ☃, this.l.d - 1, this.l.b, this.l.f - 1, this.l.d - 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
    for (int ☃ = this.l.a; ☃ <= this.l.d; ☃++) {
      for (int ☃ = this.l.c; ☃ <= this.l.f; ☃++) {
        if (a(☃, ☃, this.l.b - 1, ☃, ☃).c().t() == arm.a) {
          a(☃, afi.f.Q(), ☃, this.l.b - 1, ☃, ☃);
        }
      }
    }
    return true;
  }
}
