import java.util.Random;

public class ahb
  extends afc
{
  public static final aml a = aml.a("facing", cq.c.a);
  private final boolean b;
  private static boolean N;
  
  protected ahb(boolean ☃)
  {
    super(arm.e);
    j(this.M.b().a(a, cq.c));
    this.b = ☃;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.al);
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    e(☃, ☃, ☃);
  }
  
  private void e(adm ☃, cj ☃, alz ☃)
  {
    if (☃.D) {
      return;
    }
    afh ☃ = ☃.p(☃.c()).c();
    afh ☃ = ☃.p(☃.d()).c();
    afh ☃ = ☃.p(☃.e()).c();
    afh ☃ = ☃.p(☃.f()).c();
    
    cq ☃ = (cq)☃.b(a);
    if ((☃ == cq.c) && (☃.o()) && (!☃.o())) {
      ☃ = cq.d;
    } else if ((☃ == cq.d) && (☃.o()) && (!☃.o())) {
      ☃ = cq.c;
    } else if ((☃ == cq.e) && (☃.o()) && (!☃.o())) {
      ☃ = cq.f;
    } else if ((☃ == cq.f) && (☃.o()) && (!☃.o())) {
      ☃ = cq.e;
    }
    ☃.a(☃, ☃.a(a, ☃), 2);
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (!this.b) {
      return;
    }
    cq ☃ = (cq)☃.b(a);
    
    double ☃ = ☃.n() + 0.5D;
    double ☃ = ☃.o() + ☃.nextDouble() * 6.0D / 16.0D;
    double ☃ = ☃.p() + 0.5D;
    double ☃ = 0.52D;
    double ☃ = ☃.nextDouble() * 0.6D - 0.3D;
    switch (ahb.1.a[☃.ordinal()])
    {
    case 1: 
      ☃.a(cy.l, ☃ - ☃, ☃, ☃ + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      ☃.a(cy.A, ☃ - ☃, ☃, ☃ + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      break;
    case 2: 
      ☃.a(cy.l, ☃ + ☃, ☃, ☃ + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      ☃.a(cy.A, ☃ + ☃, ☃, ☃ + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      break;
    case 3: 
      ☃.a(cy.l, ☃ + ☃, ☃, ☃ - ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      ☃.a(cy.A, ☃ + ☃, ☃, ☃ - ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      break;
    case 4: 
      ☃.a(cy.l, ☃ + ☃, ☃, ☃ + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      ☃.a(cy.A, ☃ + ☃, ☃, ☃ + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alh))
    {
      ☃.a((alh)☃);
      ☃.b(na.Y);
    }
    return true;
  }
  
  public static void a(boolean ☃, adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    akw ☃ = ☃.s(☃);
    
    N = true;
    if (☃)
    {
      ☃.a(☃, afi.am.Q().a(a, ☃.b(a)), 3);
      ☃.a(☃, afi.am.Q().a(a, ☃.b(a)), 3);
    }
    else
    {
      ☃.a(☃, afi.al.Q().a(a, ☃.b(a)), 3);
      ☃.a(☃, afi.al.Q().a(a, ☃.b(a)), 3);
    }
    N = false;
    if (☃ != null)
    {
      ☃.D();
      ☃.a(☃, ☃);
    }
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new alh();
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(a, ☃.aP().d());
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    ☃.a(☃, ☃.a(a, ☃.aP().d()), 2);
    if (☃.s())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof alh)) {
        ((alh)☃).a(☃.q());
      }
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    if (!N)
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof alh))
      {
        oi.a(☃, ☃, (alh)☃);
        
        ☃.e(☃, this);
      }
    }
    super.b(☃, ☃, ☃);
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    return xi.a(☃.s(☃));
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(afi.al);
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
    cq ☃ = cq.a(☃);
    if (☃.k() == cq.a.b) {
      ☃ = cq.c;
    }
    return Q().a(a, ☃);
  }
  
  public int c(alz ☃)
  {
    return ((cq)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
