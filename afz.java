import java.util.Random;

public class afz
  extends afm
  implements afj
{
  public static final amn a = amn.a("age", 0, 7);
  
  protected afz()
  {
    j(M.b().a(a, Integer.valueOf(0)));
    a(true);
    float ☃ = 0.5F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.25F, 0.5F + ☃);
    a(null);
    c(0.0F);
    a(h);
    K();
  }
  
  protected boolean c(afh ☃)
  {
    return ☃ == afi.ak;
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    super.b(☃, ☃, ☃, ☃);
    if (☃.l(☃.a()) >= 9)
    {
      int ☃ = ((Integer)☃.b(a)).intValue();
      if (☃ < 7)
      {
        float ☃ = a(this, ☃, ☃);
        if (☃.nextInt((int)(25.0F / ☃) + 1) == 0) {
          ☃.a(☃, ☃.a(a, Integer.valueOf(☃ + 1)), 2);
        }
      }
    }
  }
  
  public void g(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = ((Integer)☃.b(a)).intValue() + ns.a(s, 2, 5);
    if (☃ > 7) {
      ☃ = 7;
    }
    ☃.a(☃, ☃.a(a, Integer.valueOf(☃)), 2);
  }
  
  protected static float a(afh ☃, adm ☃, cj ☃)
  {
    float ☃ = 1.0F;
    
    cj ☃ = ☃.b();
    for (int ☃ = -1; ☃ <= 1; ☃++) {
      for (int ☃ = -1; ☃ <= 1; ☃++)
      {
        float ☃ = 0.0F;
        
        alz ☃ = ☃.p(☃.a(☃, 0, ☃));
        if (☃.c() == afi.ak)
        {
          ☃ = 1.0F;
          if (((Integer)☃.b(ags.a)).intValue() > 0) {
            ☃ = 3.0F;
          }
        }
        if ((☃ != 0) || (☃ != 0)) {
          ☃ /= 4.0F;
        }
        ☃ += ☃;
      }
    }
    cj ☃ = ☃.c();
    cj ☃ = ☃.d();
    cj ☃ = ☃.e();
    cj ☃ = ☃.f();
    
    boolean ☃ = (☃ == ☃.p(☃).c()) || (☃ == ☃.p(☃).c());
    boolean ☃ = (☃ == ☃.p(☃).c()) || (☃ == ☃.p(☃).c());
    if ((☃) && (☃))
    {
      ☃ /= 2.0F;
    }
    else
    {
      boolean ☃ = (☃ == ☃.p(☃.c()).c()) || (☃ == ☃.p(☃.c()).c()) || (☃ == ☃.p(☃.d()).c()) || (☃ == ☃.p(☃.d()).c());
      if (☃) {
        ☃ /= 2.0F;
      }
    }
    return ☃;
  }
  
  public boolean f(adm ☃, cj ☃, alz ☃)
  {
    return ((☃.k(☃) >= 8) || (☃.i(☃))) && (c(☃.p(☃.b()).c()));
  }
  
  protected zw l()
  {
    return zy.N;
  }
  
  protected zw n()
  {
    return zy.O;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    super.a(☃, ☃, ☃, ☃, 0);
    if (D) {
      return;
    }
    int ☃ = ((Integer)☃.b(a)).intValue();
    if (☃ >= 7)
    {
      int ☃ = 3 + ☃;
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        if (s.nextInt(15) <= ☃) {
          a(☃, ☃, new zx(l(), 1, 0));
        }
      }
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (((Integer)☃.b(a)).intValue() == 7) {
      return n();
    }
    return l();
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return l();
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    return ((Integer)☃.b(a)).intValue() < 7;
  }
  
  public boolean a(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    return true;
  }
  
  public void b(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    g(☃, ☃, ☃);
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
