import java.util.Random;

public class agg
  extends afc
{
  public static final aml a = aml.a("facing");
  public static final amk b = amk.a("triggered");
  public static final cp<zw, cr> N = new cp(new cn());
  protected Random O = new Random();
  
  protected agg()
  {
    super(arm.e);
    j(this.M.b().a(a, cq.c).a(b, Boolean.valueOf(false)));
    a(yz.d);
  }
  
  public int a(adm ☃)
  {
    return 4;
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    super.c(☃, ☃, ☃);
    e(☃, ☃, ☃);
  }
  
  private void e(adm ☃, cj ☃, alz ☃)
  {
    if (☃.D) {
      return;
    }
    cq ☃ = (cq)☃.b(a);
    boolean ☃ = ☃.p(☃.c()).c().o();
    boolean ☃ = ☃.p(☃.d()).c().o();
    if ((☃ == cq.c) && (☃) && (!☃))
    {
      ☃ = cq.d;
    }
    else if ((☃ == cq.d) && (☃) && (!☃))
    {
      ☃ = cq.c;
    }
    else
    {
      boolean ☃ = ☃.p(☃.e()).c().o();
      boolean ☃ = ☃.p(☃.f()).c().o();
      if ((☃ == cq.e) && (☃) && (!☃)) {
        ☃ = cq.f;
      } else if ((☃ == cq.f) && (☃) && (!☃)) {
        ☃ = cq.e;
      }
    }
    ☃.a(☃, ☃.a(a, ☃).a(b, Boolean.valueOf(false)), 2);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alc))
    {
      ☃.a((alc)☃);
      if ((☃ instanceof ald)) {
        ☃.b(na.O);
      } else {
        ☃.b(na.Q);
      }
    }
    return true;
  }
  
  protected void f(adm ☃, cj ☃)
  {
    cl ☃ = new cl(☃, ☃);
    alc ☃ = (alc)☃.h();
    if (☃ == null) {
      return;
    }
    int ☃ = ☃.m();
    if (☃ < 0)
    {
      ☃.b(1001, ☃, 0);
      return;
    }
    zx ☃ = ☃.a(☃);
    cr ☃ = a(☃);
    if (☃ != cr.a)
    {
      zx ☃ = ☃.a(☃, ☃);
      
      ☃.a(☃, ☃.b <= 0 ? null : ☃);
    }
  }
  
  protected cr a(zx ☃)
  {
    return (cr)N.a(☃ == null ? null : ☃.b());
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    boolean ☃ = (☃.z(☃)) || (☃.z(☃.a()));
    boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
    if ((☃) && (!☃))
    {
      ☃.a(☃, this, a(☃));
      ☃.a(☃, ☃.a(b, Boolean.valueOf(true)), 4);
    }
    else if ((!☃) && (☃))
    {
      ☃.a(☃, ☃.a(b, Boolean.valueOf(false)), 4);
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (!☃.D) {
      f(☃, ☃);
    }
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new alc();
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(a, als.a(☃, ☃, ☃)).a(b, Boolean.valueOf(false));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    ☃.a(☃, ☃.a(a, als.a(☃, ☃, ☃)), 2);
    if (☃.s())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof alc)) {
        ((alc)☃).a(☃.q());
      }
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alc))
    {
      oi.a(☃, ☃, (alc)☃);
      
      ☃.e(☃, this);
    }
    super.b(☃, ☃, ☃);
  }
  
  public static cz a(ck ☃)
  {
    cq ☃ = b(☃.f());
    
    double ☃ = ☃.a() + 0.7D * ☃.g();
    double ☃ = ☃.b() + 0.7D * ☃.h();
    double ☃ = ☃.c() + 0.7D * ☃.i();
    
    return new da(☃, ☃, ☃);
  }
  
  public static cq b(int ☃)
  {
    return cq.a(☃ & 0x7);
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    return xi.a(☃.s(☃));
  }
  
  public int b()
  {
    return 3;
  }
  
  public alz b(alz ☃)
  {
    return Q().a(a, cq.d);
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, b(☃)).a(b, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).a();
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
