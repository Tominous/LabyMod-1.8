import com.google.common.base.Objects;
import java.util.Random;

public class akj
  extends afh
{
  public static final aml a = aml.a("facing", cq.c.a);
  public static final amk b = amk.a("powered");
  public static final amk N = amk.a("attached");
  public static final amk O = amk.a("suspended");
  
  public akj()
  {
    super(arm.q);
    j(M.b().a(a, cq.c).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)));
    a(yz.d);
    a(true);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃.a(O, Boolean.valueOf(!adm.a(☃, ☃.b())));
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
  
  public boolean b(adm ☃, cj ☃, cq ☃)
  {
    return (☃.k().c()) && (☃.p(☃.a(☃.d())).c().v());
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    for (cq ☃ : cq.c.a) {
      if (☃.p(☃.a(☃)).c().v()) {
        return true;
      }
    }
    return false;
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    alz ☃ = Q().a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false));
    if (☃.k().c()) {
      ☃ = ☃.a(a, ☃);
    }
    return ☃;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    a(☃, ☃, ☃, false, false, -1, null);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (☃ == this) {
      return;
    }
    if (e(☃, ☃, ☃))
    {
      cq ☃ = (cq)☃.b(a);
      if (!☃.p(☃.a(☃.d())).c().v())
      {
        b(☃, ☃, ☃, 0);
        ☃.g(☃);
      }
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, boolean ☃, boolean ☃, int ☃, alz ☃)
  {
    cq ☃ = (cq)☃.b(a);
    boolean ☃ = ((Boolean)☃.b(N)).booleanValue();
    boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
    boolean ☃ = !adm.a(☃, ☃.b());
    
    boolean ☃ = !☃;
    boolean ☃ = false;
    int ☃ = 0;
    
    alz[] ☃ = new alz[42];
    for (int ☃ = 1; ☃ < 42; ☃++)
    {
      cj ☃ = ☃.a(☃, ☃);
      alz ☃ = ☃.p(☃);
      if (☃.c() == afi.bR)
      {
        if (☃.b(a) != ☃.d()) {
          break;
        }
        ☃ = ☃; break;
      }
      if ((☃.c() == afi.bS) || (☃ == ☃))
      {
        if (☃ == ☃) {
          ☃ = (alz)Objects.firstNonNull(☃, ☃);
        }
        boolean ☃ = !((Boolean)☃.b(aki.O)).booleanValue();
        boolean ☃ = ((Boolean)☃.b(aki.a)).booleanValue();
        boolean ☃ = ((Boolean)☃.b(aki.b)).booleanValue();
        ☃ &= ☃ == ☃;
        ☃ |= ((☃) && (☃));
        
        ☃[☃] = ☃;
        if (☃ == ☃)
        {
          ☃.a(☃, this, a(☃));
          ☃ &= ☃;
        }
      }
      else
      {
        ☃[☃] = null;
        ☃ = false;
      }
    }
    ☃ &= ☃ > 1;
    ☃ &= ☃;
    alz ☃ = Q().a(N, Boolean.valueOf(☃)).a(b, Boolean.valueOf(☃));
    if (☃ > 0)
    {
      cj ☃ = ☃.a(☃, ☃);
      cq ☃ = ☃.d();
      ☃.a(☃, ☃.a(a, ☃), 3);
      a(☃, ☃, ☃);
      
      a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    a(☃, ☃, ☃, ☃, ☃, ☃);
    if (!☃)
    {
      ☃.a(☃, ☃.a(a, ☃), 3);
      if (☃) {
        a(☃, ☃, ☃);
      }
    }
    if (☃ != ☃) {
      for (int ☃ = 1; ☃ < ☃; ☃++)
      {
        cj ☃ = ☃.a(☃, ☃);
        alz ☃ = ☃[☃];
        if (☃ != null) {
          if (☃.p(☃).c() != afi.a) {
            ☃.a(☃, ☃.a(N, Boolean.valueOf(☃)), 3);
          }
        }
      }
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    a(☃, ☃, ☃, false, true, -1, null);
  }
  
  private void a(adm ☃, cj ☃, boolean ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    if ((☃) && (!☃)) {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.1D, ☃.p() + 0.5D, "random.click", 0.4F, 0.6F);
    } else if ((!☃) && (☃)) {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.1D, ☃.p() + 0.5D, "random.click", 0.4F, 0.5F);
    } else if ((☃) && (!☃)) {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.1D, ☃.p() + 0.5D, "random.click", 0.4F, 0.7F);
    } else if ((!☃) && (☃)) {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.1D, ☃.p() + 0.5D, "random.bowhit", 0.4F, 1.2F / (s.nextFloat() * 0.2F + 0.9F));
    }
  }
  
  private void a(adm ☃, cj ☃, cq ☃)
  {
    ☃.c(☃, this);
    ☃.c(☃.a(☃.d()), this);
  }
  
  private boolean e(adm ☃, cj ☃, alz ☃)
  {
    if (!d(☃, ☃))
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
      return false;
    }
    return true;
  }
  
  public void a(adq ☃, cj ☃)
  {
    float ☃ = 0.1875F;
    switch (akj.1.a[((cq)☃.p(☃).b(a)).ordinal()])
    {
    case 1: 
      a(0.0F, 0.2F, 0.5F - ☃, ☃ * 2.0F, 0.8F, 0.5F + ☃);
      break;
    case 2: 
      a(1.0F - ☃ * 2.0F, 0.2F, 0.5F - ☃, 1.0F, 0.8F, 0.5F + ☃);
      break;
    case 3: 
      a(0.5F - ☃, 0.2F, 0.0F, 0.5F + ☃, 0.8F, ☃ * 2.0F);
      break;
    case 4: 
      a(0.5F - ☃, 0.2F, 1.0F - ☃ * 2.0F, 0.5F + ☃, 0.8F, 1.0F);
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    boolean ☃ = ((Boolean)☃.b(N)).booleanValue();
    boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
    if ((☃) || (☃)) {
      a(☃, ☃, ☃, true, false, -1, null);
    }
    if (☃)
    {
      ☃.c(☃, this);
      ☃.c(☃.a(((cq)☃.b(a)).d()), this);
    }
    super.b(☃, ☃, ☃);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return ((Boolean)☃.b(b)).booleanValue() ? 15 : 0;
  }
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (!((Boolean)☃.b(b)).booleanValue()) {
      return 0;
    }
    if (☃.b(a) == ☃) {
      return 15;
    }
    return 0;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public adf m()
  {
    return adf.b;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, cq.b(☃ & 0x3)).a(b, Boolean.valueOf((☃ & 0x8) > 0)).a(N, Boolean.valueOf((☃ & 0x4) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).b();
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    if (((Boolean)☃.b(N)).booleanValue()) {
      ☃ |= 0x4;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, N, O });
  }
}
