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
    ☃.a("tf", b);
    ☃.a("D", a.b());
  }
  
  protected void b(dn ☃)
  {
    b = ☃.n("tf");
    a = cq.b(☃.f("D"));
  }
  
  public aqg$b(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    a = ☃;
    l = ☃;
    b = (☃.d() > 3);
  }
  
  public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    aqe ☃ = new aqe(☃, ☃, ☃, ☃, ☃ + 2, ☃);
    if (☃.nextInt(4) == 0) {
      e += 4;
    }
    switch (aqg.1.a[☃.ordinal()])
    {
    case 1: 
      a = (☃ - 1);
      d = (☃ + 3);
      c = (☃ - 4);
      break;
    case 2: 
      a = (☃ - 1);
      d = (☃ + 3);
      f = (☃ + 4);
      break;
    case 3: 
      a = (☃ - 4);
      c = (☃ - 1);
      f = (☃ + 3);
      break;
    case 4: 
      d = (☃ + 4);
      c = (☃ - 1);
      f = (☃ + 3);
    }
    if (aqt.a(☃, ☃) != null) {
      return null;
    }
    return ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = d();
    switch (aqg.1.a[a.ordinal()])
    {
    case 1: 
      aqg.a(☃, ☃, ☃, l.a + 1, l.b, l.c - 1, cq.c, ☃);
      aqg.a(☃, ☃, ☃, l.a - 1, l.b, l.c + 1, cq.e, ☃);
      aqg.a(☃, ☃, ☃, l.d + 1, l.b, l.c + 1, cq.f, ☃);
      break;
    case 2: 
      aqg.a(☃, ☃, ☃, l.a + 1, l.b, l.f + 1, cq.d, ☃);
      aqg.a(☃, ☃, ☃, l.a - 1, l.b, l.c + 1, cq.e, ☃);
      aqg.a(☃, ☃, ☃, l.d + 1, l.b, l.c + 1, cq.f, ☃);
      break;
    case 3: 
      aqg.a(☃, ☃, ☃, l.a + 1, l.b, l.c - 1, cq.c, ☃);
      aqg.a(☃, ☃, ☃, l.a + 1, l.b, l.f + 1, cq.d, ☃);
      aqg.a(☃, ☃, ☃, l.a - 1, l.b, l.c + 1, cq.e, ☃);
      break;
    case 4: 
      aqg.a(☃, ☃, ☃, l.a + 1, l.b, l.c - 1, cq.c, ☃);
      aqg.a(☃, ☃, ☃, l.a + 1, l.b, l.f + 1, cq.d, ☃);
      aqg.a(☃, ☃, ☃, l.d + 1, l.b, l.c + 1, cq.f, ☃);
    }
    if (b)
    {
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, l.a + 1, l.b + 3 + 1, l.c - 1, cq.c, ☃);
      }
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, l.a - 1, l.b + 3 + 1, l.c + 1, cq.e, ☃);
      }
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, l.d + 1, l.b + 3 + 1, l.c + 1, cq.f, ☃);
      }
      if (☃.nextBoolean()) {
        aqg.a(☃, ☃, ☃, l.a + 1, l.b + 3 + 1, l.f + 1, cq.d, ☃);
      }
    }
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    if (b)
    {
      a(☃, ☃, l.a + 1, l.b, l.c, l.d - 1, l.b + 3 - 1, l.f, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, l.a, l.b, l.c + 1, l.d, l.b + 3 - 1, l.f - 1, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, l.a + 1, l.e - 2, l.c, l.d - 1, l.e, l.f, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, l.a, l.e - 2, l.c + 1, l.d, l.e, l.f - 1, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, l.a + 1, l.b + 3, l.c + 1, l.d - 1, l.b + 3, l.f - 1, afi.a.Q(), afi.a.Q(), false);
    }
    else
    {
      a(☃, ☃, l.a + 1, l.b, l.c, l.d - 1, l.e, l.f, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, l.a, l.b, l.c + 1, l.d, l.e, l.f - 1, afi.a.Q(), afi.a.Q(), false);
    }
    a(☃, ☃, l.a + 1, l.b, l.c + 1, l.a + 1, l.e, l.c + 1, afi.f.Q(), afi.a.Q(), false);
    a(☃, ☃, l.a + 1, l.b, l.f - 1, l.a + 1, l.e, l.f - 1, afi.f.Q(), afi.a.Q(), false);
    a(☃, ☃, l.d - 1, l.b, l.c + 1, l.d - 1, l.e, l.c + 1, afi.f.Q(), afi.a.Q(), false);
    a(☃, ☃, l.d - 1, l.b, l.f - 1, l.d - 1, l.e, l.f - 1, afi.f.Q(), afi.a.Q(), false);
    for (int ☃ = l.a; ☃ <= l.d; ☃++) {
      for (int ☃ = l.c; ☃ <= l.f; ☃++) {
        if (a(☃, ☃, l.b - 1, ☃, ☃).c().t() == arm.a) {
          a(☃, afi.f.Q(), ☃, l.b - 1, ☃, ☃);
        }
      }
    }
    return true;
  }
}
