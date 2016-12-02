import java.util.EnumSet;
import java.util.Random;
import java.util.Set;

public class agl
  extends ahv
{
  int a;
  
  protected agl(arm ☃)
  {
    super(☃);
  }
  
  private void f(adm ☃, cj ☃, alz ☃)
  {
    ☃.a(☃, b(this.J).Q().a(b, ☃.b(b)), 2);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    int ☃ = ((Integer)☃.b(b)).intValue();
    
    int ☃ = 1;
    if ((this.J == arm.i) && (!☃.t.n())) {
      ☃ = 2;
    }
    int ☃ = a(☃);
    if (☃ > 0)
    {
      int ☃ = -100;
      this.a = 0;
      for (cq ☃ : cq.c.a) {
        ☃ = a(☃, ☃.a(☃), ☃);
      }
      int ☃ = ☃ + ☃;
      if ((☃ >= 8) || (☃ < 0)) {
        ☃ = -1;
      }
      if (e(☃, ☃.a()) >= 0)
      {
        int ☃ = e(☃, ☃.a());
        if (☃ >= 8) {
          ☃ = ☃;
        } else {
          ☃ = ☃ + 8;
        }
      }
      if ((this.a >= 2) && (this.J == arm.h))
      {
        alz ☃ = ☃.p(☃.b());
        if (☃.c().t().a()) {
          ☃ = 0;
        } else if ((☃.c().t() == this.J) && (((Integer)☃.b(b)).intValue() == 0)) {
          ☃ = 0;
        }
      }
      if ((this.J == arm.i) && 
        (☃ < 8) && (☃ < 8) && 
        (☃ > ☃) && 
        (☃.nextInt(4) != 0)) {
        ☃ *= 4;
      }
      if (☃ == ☃)
      {
        f(☃, ☃, ☃);
      }
      else
      {
        ☃ = ☃;
        if (☃ < 0)
        {
          ☃.g(☃);
        }
        else
        {
          ☃ = ☃.a(b, Integer.valueOf(☃));
          ☃.a(☃, ☃, 2);
          ☃.a(☃, this, ☃);
          ☃.c(☃, this);
        }
      }
    }
    else
    {
      f(☃, ☃, ☃);
    }
    alz ☃ = ☃.p(☃.b());
    int ☃;
    if (h(☃, ☃.b(), ☃))
    {
      if ((this.J == arm.i) && 
        (☃.p(☃.b()).c().t() == arm.h))
      {
        ☃.a(☃.b(), afi.b.Q());
        e(☃, ☃.b());
        return;
      }
      if (☃ >= 8) {
        a(☃, ☃.b(), ☃, ☃);
      } else {
        a(☃, ☃.b(), ☃, ☃ + 8);
      }
    }
    else if ((☃ >= 0) && ((☃ == 0) || (g(☃, ☃.b(), ☃))))
    {
      Set<cq> ☃ = f(☃, ☃);
      ☃ = ☃ + ☃;
      if (☃ >= 8) {
        ☃ = 1;
      }
      if (☃ >= 8) {
        return;
      }
      for (cq ☃ : ☃) {
        a(☃, ☃.a(☃), ☃.p(☃.a(☃)), ☃);
      }
    }
  }
  
  private void a(adm ☃, cj ☃, alz ☃, int ☃)
  {
    if (h(☃, ☃, ☃))
    {
      if (☃.c() != afi.a) {
        if (this.J == arm.i) {
          e(☃, ☃);
        } else {
          ☃.c().b(☃, ☃, ☃, 0);
        }
      }
      ☃.a(☃, Q().a(b, Integer.valueOf(☃)), 3);
    }
  }
  
  private int a(adm ☃, cj ☃, int ☃, cq ☃)
  {
    int ☃ = 1000;
    for (cq ☃ : cq.c.a) {
      if (☃ != ☃)
      {
        cj ☃ = ☃.a(☃);
        alz ☃ = ☃.p(☃);
        if ((!g(☃, ☃, ☃)) && ((☃.c().t() != this.J) || (((Integer)☃.b(b)).intValue() > 0))) {
          if (g(☃, ☃.b(), ☃))
          {
            if (☃ < 4)
            {
              int ☃ = a(☃, ☃, ☃ + 1, ☃.d());
              if (☃ < ☃) {
                ☃ = ☃;
              }
            }
          }
          else {
            return ☃;
          }
        }
      }
    }
    return ☃;
  }
  
  private Set<cq> f(adm ☃, cj ☃)
  {
    int ☃ = 1000;
    Set<cq> ☃ = EnumSet.noneOf(cq.class);
    for (cq ☃ : cq.c.a)
    {
      cj ☃ = ☃.a(☃);
      alz ☃ = ☃.p(☃);
      if ((!g(☃, ☃, ☃)) && ((☃.c().t() != this.J) || (((Integer)☃.b(b)).intValue() > 0)))
      {
        int ☃;
        int ☃;
        if (g(☃, ☃.b(), ☃.p(☃.b()))) {
          ☃ = a(☃, ☃, 1, ☃.d());
        } else {
          ☃ = 0;
        }
        if (☃ < ☃) {
          ☃.clear();
        }
        if (☃ <= ☃)
        {
          ☃.add(☃);
          ☃ = ☃;
        }
      }
    }
    return ☃;
  }
  
  private boolean g(adm ☃, cj ☃, alz ☃)
  {
    afh ☃ = ☃.p(☃).c();
    if (((☃ instanceof agh)) || (☃ == afi.an) || (☃ == afi.au) || (☃ == afi.aM)) {
      return true;
    }
    if (☃.J == arm.E) {
      return true;
    }
    return ☃.J.c();
  }
  
  protected int a(adm ☃, cj ☃, int ☃)
  {
    int ☃ = e(☃, ☃);
    if (☃ < 0) {
      return ☃;
    }
    if (☃ == 0) {
      this.a += 1;
    }
    if (☃ >= 8) {
      ☃ = 0;
    }
    return (☃ < 0) || (☃ < ☃) ? ☃ : ☃;
  }
  
  private boolean h(adm ☃, cj ☃, alz ☃)
  {
    arm ☃ = ☃.c().t();
    return (☃ != this.J) && (☃ != arm.i) && (!g(☃, ☃, ☃));
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    if (!e(☃, ☃, ☃)) {
      ☃.a(☃, this, a(☃));
    }
  }
}
