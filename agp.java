import java.util.Random;

public class agp
  extends afc
{
  public static final aml a = aml.a("facing", cq.c.a);
  
  protected agp()
  {
    super(arm.e);
    j(M.b().a(a, cq.c));
    a(yz.c);
    a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public int b()
  {
    return 2;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.Z);
  }
  
  public int a(Random ☃)
  {
    return 8;
  }
  
  protected boolean I()
  {
    return true;
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(a, ☃.aP().d());
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    ☃.a(☃, ☃.a(a, ☃.aP().d()), 2);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    yd ☃ = ☃.co();
    akw ☃ = ☃.s(☃);
    if ((☃ == null) || (!(☃ instanceof alf))) {
      return true;
    }
    if (☃.p(☃.a()).c().v()) {
      return true;
    }
    if (D) {
      return true;
    }
    ☃.a((alf)☃);
    ☃.a(☃);
    ☃.b(na.V);
    
    return true;
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new alf();
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      int ☃ = ☃.nextInt(2) * 2 - 1;
      int ☃ = ☃.nextInt(2) * 2 - 1;
      
      double ☃ = ☃.n() + 0.5D + 0.25D * ☃;
      double ☃ = ☃.o() + ☃.nextFloat();
      double ☃ = ☃.p() + 0.5D + 0.25D * ☃;
      double ☃ = ☃.nextFloat() * ☃;
      double ☃ = (☃.nextFloat() - 0.5D) * 0.125D;
      double ☃ = ☃.nextFloat() * ☃;
      
      ☃.a(cy.y, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
    }
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
