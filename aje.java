import java.util.Random;

public class aje
  extends afh
{
  public static final amn a = amn.a("age", 0, 15);
  
  protected aje()
  {
    super(arm.k);
    j(this.M.b().a(a, Integer.valueOf(0)));
    float ☃ = 0.375F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 1.0F, 0.5F + ☃);
    a(true);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if ((☃.p(☃.b()).c() != afi.aM) && (!e(☃, ☃, ☃))) {
      return;
    }
    if (☃.d(☃.a()))
    {
      int ☃ = 1;
      while (☃.p(☃.c(☃)).c() == this) {
        ☃++;
      }
      if (☃ < 3)
      {
        int ☃ = ((Integer)☃.b(a)).intValue();
        if (☃ == 15)
        {
          ☃.a(☃.a(), Q());
          ☃.a(☃, ☃.a(a, Integer.valueOf(0)), 4);
        }
        else
        {
          ☃.a(☃, ☃.a(a, Integer.valueOf(☃ + 1)), 4);
        }
      }
    }
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃.b()).c();
    if (☃ == this) {
      return true;
    }
    if ((☃ == afi.c) || (☃ == afi.d) || (☃ == afi.m))
    {
      for (cq ☃ : cq.c.a) {
        if (☃.p(☃.a(☃).b()).c().t() == arm.h) {
          return true;
        }
      }
      return false;
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    e(☃, ☃, ☃);
  }
  
  protected final boolean e(adm ☃, cj ☃, alz ☃)
  {
    if (e(☃, ☃)) {
      return true;
    }
    b(☃, ☃, ☃, 0);
    ☃.g(☃);
    return false;
  }
  
  public boolean e(adm ☃, cj ☃)
  {
    return d(☃, ☃);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.aJ;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.aJ;
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    return ☃.b(☃).b(☃);
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Integer.valueOf(☃));
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
