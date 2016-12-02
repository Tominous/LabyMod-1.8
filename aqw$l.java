import java.util.List;
import java.util.Random;

public class aqw$l
  extends aqw.o
{
  private int a;
  
  public aqw$l() {}
  
  public aqw$l(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    m = ☃;
    l = ☃;
    a = Math.max(☃.c(), ☃.e());
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Length", a);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    a = ☃.f("Length");
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    boolean ☃ = false;
    
    int ☃ = ☃.nextInt(5);
    while (☃ < a - 8)
    {
      aqt ☃ = a((aqw.k)☃, ☃, ☃, 0, ☃);
      if (☃ != null)
      {
        ☃ += Math.max(l.c(), l.e());
        ☃ = true;
      }
      ☃ += 2 + ☃.nextInt(5);
    }
    ☃ = ☃.nextInt(5);
    while (☃ < a - 8)
    {
      aqt ☃ = b((aqw.k)☃, ☃, ☃, 0, ☃);
      if (☃ != null)
      {
        ☃ += Math.max(l.c(), l.e());
        ☃ = true;
      }
      ☃ += 2 + ☃.nextInt(5);
    }
    if ((☃) && (☃.nextInt(3) > 0) && (m != null)) {
      switch (aqw.1.a[m.ordinal()])
      {
      case 1: 
        aqw.b((aqw.k)☃, ☃, ☃, l.a - 1, l.b, l.c, cq.e, d());
        break;
      case 2: 
        aqw.b((aqw.k)☃, ☃, ☃, l.a - 1, l.b, l.f - 2, cq.e, d());
        break;
      case 4: 
        aqw.b((aqw.k)☃, ☃, ☃, l.d - 2, l.b, l.c - 1, cq.c, d());
        break;
      case 3: 
        aqw.b((aqw.k)☃, ☃, ☃, l.a, l.b, l.c - 1, cq.c, d());
      }
    }
    if ((☃) && (☃.nextInt(3) > 0) && (m != null)) {
      switch (aqw.1.a[m.ordinal()])
      {
      case 1: 
        aqw.b((aqw.k)☃, ☃, ☃, l.d + 1, l.b, l.c, cq.f, d());
        break;
      case 2: 
        aqw.b((aqw.k)☃, ☃, ☃, l.d + 1, l.b, l.f - 2, cq.f, d());
        break;
      case 4: 
        aqw.b((aqw.k)☃, ☃, ☃, l.d - 2, l.b, l.f + 1, cq.d, d());
        break;
      case 3: 
        aqw.b((aqw.k)☃, ☃, ☃, l.a, l.b, l.f + 1, cq.d, d());
      }
    }
  }
  
  public static aqe a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    int ☃ = 7 * ns.a(☃, 3, 5);
    while (☃ >= 7)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 3, 3, ☃, ☃);
      if (aqt.a(☃, ☃) == null) {
        return ☃;
      }
      ☃ -= 7;
    }
    return null;
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    alz ☃ = a(afi.n.Q());
    alz ☃ = a(afi.e.Q());
    for (int ☃ = l.a; ☃ <= l.d; ☃++) {
      for (int ☃ = l.c; ☃ <= l.f; ☃++)
      {
        cj ☃ = new cj(☃, 64, ☃);
        if (☃.b(☃))
        {
          ☃ = ☃.r(☃).b();
          ☃.a(☃, ☃, 2);
          ☃.a(☃.b(), ☃, 2);
        }
      }
    }
    return true;
  }
}
