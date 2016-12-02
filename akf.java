import com.google.common.base.Predicate;
import java.util.Random;

public class akf
  extends afh
{
  public static final aml a = aml.a("facing", new Predicate()
  {
    public boolean a(cq ☃)
    {
      return ☃ != cq.a;
    }
  });
  
  protected akf()
  {
    super(arm.q);
    j(M.b().a(a, cq.b));
    a(true);
    a(yz.c);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  private boolean e(adm ☃, cj ☃)
  {
    if (adm.a(☃, ☃)) {
      return true;
    }
    afh ☃ = ☃.p(☃).c();
    return ((☃ instanceof agt)) || (☃ == afi.w) || (☃ == afi.bZ) || (☃ == afi.cG);
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    for (cq ☃ : a.c()) {
      if (a(☃, ☃, ☃)) {
        return true;
      }
    }
    return false;
  }
  
  private boolean a(adm ☃, cj ☃, cq ☃)
  {
    cj ☃ = ☃.a(☃.d());
    
    boolean ☃ = ☃.k().c();
    return ((☃) && (☃.d(☃, true))) || ((☃.equals(cq.b)) && (e(☃, ☃)));
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    if (a(☃, ☃, ☃)) {
      return Q().a(a, ☃);
    }
    for (cq ☃ : cq.c.a) {
      if (☃.d(☃.a(☃.d()), true)) {
        return Q().a(a, ☃);
      }
    }
    return Q();
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    f(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    e(☃, ☃, ☃);
  }
  
  protected boolean e(adm ☃, cj ☃, alz ☃)
  {
    if (!f(☃, ☃, ☃)) {
      return true;
    }
    cq ☃ = (cq)☃.b(a);
    cq.a ☃ = ☃.k();
    cq ☃ = ☃.d();
    
    boolean ☃ = false;
    if ((☃.c()) && (!☃.d(☃.a(☃), true))) {
      ☃ = true;
    } else if ((☃.b()) && (!e(☃, ☃.a(☃)))) {
      ☃ = true;
    }
    if (☃)
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
      return true;
    }
    return false;
  }
  
  protected boolean f(adm ☃, cj ☃, alz ☃)
  {
    if ((☃.c() == this) && 
      (a(☃, ☃, (cq)☃.b(a)))) {
      return true;
    }
    if (☃.p(☃).c() == this)
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
    return false;
  }
  
  public auh a(adm ☃, cj ☃, aui ☃, aui ☃)
  {
    cq ☃ = (cq)☃.p(☃).b(a);
    
    float ☃ = 0.15F;
    if (☃ == cq.f)
    {
      a(0.0F, 0.2F, 0.5F - ☃, ☃ * 2.0F, 0.8F, 0.5F + ☃);
    }
    else if (☃ == cq.e)
    {
      a(1.0F - ☃ * 2.0F, 0.2F, 0.5F - ☃, 1.0F, 0.8F, 0.5F + ☃);
    }
    else if (☃ == cq.d)
    {
      a(0.5F - ☃, 0.2F, 0.0F, 0.5F + ☃, 0.8F, ☃ * 2.0F);
    }
    else if (☃ == cq.c)
    {
      a(0.5F - ☃, 0.2F, 1.0F - ☃ * 2.0F, 0.5F + ☃, 0.8F, 1.0F);
    }
    else
    {
      ☃ = 0.1F;
      a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.6F, 0.5F + ☃);
    }
    return super.a(☃, ☃, ☃, ☃);
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    cq ☃ = (cq)☃.b(a);
    double ☃ = ☃.n() + 0.5D;
    double ☃ = ☃.o() + 0.7D;
    double ☃ = ☃.p() + 0.5D;
    double ☃ = 0.22D;
    double ☃ = 0.27D;
    if (☃.k().c())
    {
      cq ☃ = ☃.d();
      ☃.a(cy.l, ☃ + ☃ * ☃.g(), ☃ + ☃, ☃ + ☃ * ☃.i(), 0.0D, 0.0D, 0.0D, new int[0]);
      ☃.a(cy.A, ☃ + ☃ * ☃.g(), ☃ + ☃, ☃ + ☃ * ☃.i(), 0.0D, 0.0D, 0.0D, new int[0]);
    }
    else
    {
      ☃.a(cy.l, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      ☃.a(cy.A, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    alz ☃ = Q();
    switch (☃)
    {
    case 1: 
      ☃ = ☃.a(a, cq.f);
      break;
    case 2: 
      ☃ = ☃.a(a, cq.e);
      break;
    case 3: 
      ☃ = ☃.a(a, cq.d);
      break;
    case 4: 
      ☃ = ☃.a(a, cq.c);
      break;
    case 5: 
    default: 
      ☃ = ☃.a(a, cq.b);
    }
    return ☃;
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    switch (akf.2.a[((cq)☃.b(a)).ordinal()])
    {
    case 1: 
      ☃ |= 0x1;
      break;
    case 2: 
      ☃ |= 0x2;
      break;
    case 3: 
      ☃ |= 0x3;
      break;
    case 4: 
      ☃ |= 0x4;
      break;
    case 5: 
    case 6: 
    default: 
      ☃ |= 0x5;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
