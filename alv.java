import java.util.Random;

public class alv
  extends afc
{
  public static final aml a = alt.a;
  public static final amm<alt.a> b = alt.b;
  
  public alv()
  {
    super(arm.H);
    j(M.b().a(a, cq.c).a(b, alt.a.a));
    c(-1.0F);
  }
  
  public akw a(adm ☃, int ☃)
  {
    return null;
  }
  
  public static akw a(alz ☃, cq ☃, boolean ☃, boolean ☃)
  {
    return new alu(☃, ☃, ☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alu)) {
      ((alu)☃).h();
    } else {
      super.b(☃, ☃, ☃);
    }
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return false;
  }
  
  public boolean b(adm ☃, cj ☃, cq ☃)
  {
    return false;
  }
  
  public void d(adm ☃, cj ☃, alz ☃)
  {
    cj ☃ = ☃.a(((cq)☃.b(a)).d());
    alz ☃ = ☃.p(☃);
    if (((☃.c() instanceof als)) && (((Boolean)☃.b(als.b)).booleanValue())) {
      ☃.g(☃);
    }
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if ((!D) && (☃.s(☃) == null))
    {
      ☃.g(☃);
      return true;
    }
    return false;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return null;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    if (D) {
      return;
    }
    alu ☃ = e(☃, ☃);
    if (☃ == null) {
      return;
    }
    alz ☃ = ☃.b();
    ☃.c().b(☃, ☃, ☃, 0);
  }
  
  public auh a(adm ☃, cj ☃, aui ☃, aui ☃)
  {
    return null;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!D) {
      ☃.s(☃);
    }
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    alu ☃ = e(☃, ☃);
    if (☃ == null) {
      return null;
    }
    float ☃ = ☃.a(0.0F);
    if (☃.d()) {
      ☃ = 1.0F - ☃;
    }
    return a(☃, ☃, ☃.b(), ☃, ☃.e());
  }
  
  public void a(adq ☃, cj ☃)
  {
    alu ☃ = e(☃, ☃);
    if (☃ != null)
    {
      alz ☃ = ☃.b();
      afh ☃ = ☃.c();
      if ((☃ == this) || (☃.t() == arm.a)) {
        return;
      }
      float ☃ = ☃.a(0.0F);
      if (☃.d()) {
        ☃ = 1.0F - ☃;
      }
      ☃.a(☃, ☃);
      if ((☃ == afi.J) || (☃ == afi.F)) {
        ☃ = 0.0F;
      }
      cq ☃ = ☃.e();
      B = (☃.B() - ☃.g() * ☃);
      C = (☃.D() - ☃.h() * ☃);
      D = (☃.F() - ☃.i() * ☃);
      E = (☃.C() - ☃.g() * ☃);
      F = (☃.E() - ☃.h() * ☃);
      G = (☃.G() - ☃.i() * ☃);
    }
  }
  
  public aug a(adm ☃, cj ☃, alz ☃, float ☃, cq ☃)
  {
    if ((☃.c() == this) || (☃.c().t() == arm.a)) {
      return null;
    }
    aug ☃ = ☃.c().a(☃, ☃, ☃);
    if (☃ == null) {
      return null;
    }
    double ☃ = a;
    double ☃ = b;
    double ☃ = c;
    double ☃ = d;
    double ☃ = e;
    double ☃ = f;
    if (☃.g() < 0) {
      ☃ -= ☃.g() * ☃;
    } else {
      ☃ -= ☃.g() * ☃;
    }
    if (☃.h() < 0) {
      ☃ -= ☃.h() * ☃;
    } else {
      ☃ -= ☃.h() * ☃;
    }
    if (☃.i() < 0) {
      ☃ -= ☃.i() * ☃;
    } else {
      ☃ -= ☃.i() * ☃;
    }
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private alu e(adq ☃, cj ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alu)) {
      return (alu)☃;
    }
    return null;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return null;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, alt.b(☃)).a(b, (☃ & 0x8) > 0 ? alt.a.b : alt.a.a);
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).a();
    if (☃.b(b) == alt.a.b) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
