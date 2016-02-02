import java.util.Random;

public class afo
  extends afh
{
  public static final amn a = amn.a("age", 0, 15);
  
  protected afo()
  {
    super(arm.A);
    j(this.M.b().a(a, Integer.valueOf(0)));
    a(true);
    a(yz.c);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    cj ☃ = ☃.a();
    if (!☃.d(☃)) {
      return;
    }
    int ☃ = 1;
    while (☃.p(☃.c(☃)).c() == this) {
      ☃++;
    }
    if (☃ >= 3) {
      return;
    }
    int ☃ = ((Integer)☃.b(a)).intValue();
    if (☃ == 15)
    {
      ☃.a(☃, Q());
      alz ☃ = ☃.a(a, Integer.valueOf(0));
      ☃.a(☃, ☃, 4);
      a(☃, ☃, ☃, this);
    }
    else
    {
      ☃.a(☃, ☃.a(a, Integer.valueOf(☃ + 1)), 4);
    }
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    float ☃ = 0.0625F;
    return new aug(☃.n() + ☃, ☃.o(), ☃.p() + ☃, ☃.n() + 1 - ☃, ☃.o() + 1 - ☃, ☃.p() + 1 - ☃);
  }
  
  public aug b(adm ☃, cj ☃)
  {
    float ☃ = 0.0625F;
    return new aug(☃.n() + ☃, ☃.o(), ☃.p() + ☃, ☃.n() + 1 - ☃, ☃.o() + 1, ☃.p() + 1 - ☃);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    if (super.d(☃, ☃)) {
      return e(☃, ☃);
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!e(☃, ☃)) {
      ☃.b(☃, true);
    }
  }
  
  public boolean e(adm ☃, cj ☃)
  {
    for (cq ☃ : cq.c.a) {
      if (☃.p(☃.a(☃)).c().t().a()) {
        return false;
      }
    }
    afh ☃ = ☃.p(☃.b()).c();
    return (☃ == afi.aK) || (☃ == afi.m);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    ☃.a(ow.h, 1.0F);
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
