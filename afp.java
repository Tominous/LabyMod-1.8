import java.util.Random;

public class afp
  extends afh
{
  public static final amn a = amn.a("bites", 0, 6);
  
  protected afp()
  {
    super(arm.F);
    j(M.b().a(a, Integer.valueOf(0)));
    a(true);
  }
  
  public void a(adq ☃, cj ☃)
  {
    float ☃ = 0.0625F;
    float ☃ = (1 + ((Integer)☃.p(☃).b(a)).intValue() * 2) / 16.0F;
    float ☃ = 0.5F;
    a(☃, 0.0F, ☃, 1.0F - ☃, ☃, 1.0F - ☃);
  }
  
  public void j()
  {
    float ☃ = 0.0625F;
    float ☃ = 0.5F;
    a(☃, 0.0F, ☃, 1.0F - ☃, ☃, 1.0F - ☃);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    float ☃ = 0.0625F;
    float ☃ = (1 + ((Integer)☃.b(a)).intValue() * 2) / 16.0F;
    float ☃ = 0.5F;
    return new aug(☃.n() + ☃, ☃.o(), ☃.p() + ☃, ☃.n() + 1 - ☃, ☃.o() + ☃, ☃.p() + 1 - ☃);
  }
  
  public aug b(adm ☃, cj ☃)
  {
    return a(☃, ☃, ☃.p(☃));
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    b(☃, ☃, ☃, ☃);
    return true;
  }
  
  public void a(adm ☃, cj ☃, wn ☃)
  {
    b(☃, ☃, ☃.p(☃), ☃);
  }
  
  private void b(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    if (!☃.j(false)) {
      return;
    }
    ☃.b(na.H);
    
    ☃.cl().a(2, 0.1F);
    int ☃ = ((Integer)☃.b(a)).intValue();
    if (☃ < 6) {
      ☃.a(☃, ☃.a(a, Integer.valueOf(☃ + 1)), 3);
    } else {
      ☃.g(☃);
    }
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
      ☃.g(☃);
    }
  }
  
  private boolean e(adm ☃, cj ☃)
  {
    return ☃.p(☃.b()).c().t().a();
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return null;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.aZ;
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
  
  public int l(adm ☃, cj ☃)
  {
    return (7 - ((Integer)☃.p(☃).b(a)).intValue()) * 2;
  }
  
  public boolean O()
  {
    return true;
  }
}
