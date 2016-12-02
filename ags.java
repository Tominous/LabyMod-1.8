import java.util.Random;

public class ags
  extends afh
{
  public static final amn a = amn.a("moisture", 0, 7);
  
  protected ags()
  {
    super(arm.c);
    j(M.b().a(a, Integer.valueOf(0)));
    a(true);
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
    e(255);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return new aug(☃.n(), ☃.o(), ☃.p(), ☃.n() + 1, ☃.o() + 1, ☃.p() + 1);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    int ☃ = ((Integer)☃.b(a)).intValue();
    if ((f(☃, ☃)) || (☃.C(☃.a())))
    {
      if (☃ < 7) {
        ☃.a(☃, ☃.a(a, Integer.valueOf(7)), 2);
      }
    }
    else if (☃ > 0) {
      ☃.a(☃, ☃.a(a, Integer.valueOf(☃ - 1)), 2);
    } else if (!e(☃, ☃)) {
      ☃.a(☃, afi.d.Q());
    }
  }
  
  public void a(adm ☃, cj ☃, pk ☃, float ☃)
  {
    if (!(☃ instanceof pr)) {
      return;
    }
    if ((!D) && (s.nextFloat() < ☃ - 0.5F))
    {
      if ((!(☃ instanceof wn)) && (!☃.Q().b("mobGriefing"))) {
        return;
      }
      ☃.a(☃, afi.d.Q());
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  private boolean e(adm ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃.a()).c();
    return ((☃ instanceof afz)) || ((☃ instanceof ajx));
  }
  
  private boolean f(adm ☃, cj ☃)
  {
    for (cj.a ☃ : cj.b(☃.a(-4, 0, -4), ☃.a(4, 1, 4))) {
      if (☃.p(☃).c().t() == arm.h) {
        return true;
      }
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    super.a(☃, ☃, ☃, ☃);
    if (☃.p(☃.a()).c().t().a()) {
      ☃.a(☃, afi.d.Q());
    }
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    switch (ags.1.a[☃.ordinal()])
    {
    case 1: 
      return true;
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      afh ☃ = ☃.p(☃).c();
      return (!☃.c()) && (☃ != afi.ak);
    }
    return super.a(☃, ☃, ☃);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), ☃, ☃);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(afi.d);
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Integer.valueOf(☃ & 0x7));
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
