import com.google.common.base.Predicate;
import java.util.List;

public class ahn
  extends afc
{
  public static final aml a = aml.a("facing", new Predicate()
  {
    public boolean a(cq ☃)
    {
      return ☃ != cq.b;
    }
  });
  public static final amk b = amk.a("enabled");
  
  public ahn()
  {
    super(arm.f, arn.m);
    j(M.b().a(a, cq.a).a(b, Boolean.valueOf(true)));
    a(yz.d);
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void a(adq ☃, cj ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    float ☃ = 0.125F;
    a(0.0F, 0.0F, 0.0F, ☃, 1.0F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    a(1.0F - ☃, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    a(0.0F, 0.0F, 1.0F - ☃, 1.0F, 1.0F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    cq ☃ = ☃.d();
    if (☃ == cq.b) {
      ☃ = cq.a;
    }
    return Q().a(a, ☃).a(b, Boolean.valueOf(true));
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new alj();
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃);
    if (☃.s())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof alj)) {
        ((alj)☃).a(☃.q());
      }
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    e(☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (D) {
      return true;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alj))
    {
      ☃.a((alj)☃);
      ☃.b(na.P);
    }
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    e(☃, ☃, ☃);
  }
  
  private void e(adm ☃, cj ☃, alz ☃)
  {
    boolean ☃ = !☃.z(☃);
    if (☃ != ((Boolean)☃.b(b)).booleanValue()) {
      ☃.a(☃, ☃.a(b, Boolean.valueOf(☃)), 4);
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alj))
    {
      oi.a(☃, ☃, (alj)☃);
      
      ☃.e(☃, this);
    }
    super.b(☃, ☃, ☃);
  }
  
  public int b()
  {
    return 3;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    return true;
  }
  
  public static cq b(int ☃)
  {
    return cq.a(☃ & 0x7);
  }
  
  public static boolean f(int ☃)
  {
    return (☃ & 0x8) != 8;
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    return xi.a(☃.s(☃));
  }
  
  public adf m()
  {
    return adf.b;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, b(☃)).a(b, Boolean.valueOf(f(☃)));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).a();
    if (!((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
