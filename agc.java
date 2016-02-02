import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;

public class agc
  extends afe
{
  public static final amm<afe.b> b = amm.a("shape", afe.b.class, new Predicate()
  {
    public boolean a(afe.b ☃)
    {
      return (☃ != afe.b.j) && (☃ != afe.b.i) && (☃ != afe.b.g) && (☃ != afe.b.h);
    }
  });
  public static final amk N = amk.a("powered");
  
  public agc()
  {
    super(true);
    j(this.M.b().a(N, Boolean.valueOf(false)).a(b, afe.b.a));
    a(true);
  }
  
  public int a(adm ☃)
  {
    return 20;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    if (☃.D) {
      return;
    }
    if (((Boolean)☃.b(N)).booleanValue()) {
      return;
    }
    e(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if ((☃.D) || (!((Boolean)☃.b(N)).booleanValue())) {
      return;
    }
    e(☃, ☃, ☃);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return ((Boolean)☃.b(N)).booleanValue() ? 15 : 0;
  }
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (!((Boolean)☃.b(N)).booleanValue()) {
      return 0;
    }
    return ☃ == cq.b ? 15 : 0;
  }
  
  private void e(adm ☃, cj ☃, alz ☃)
  {
    boolean ☃ = ((Boolean)☃.b(N)).booleanValue();
    boolean ☃ = false;
    
    List<va> ☃ = a(☃, ☃, va.class, new Predicate[0]);
    if (!☃.isEmpty()) {
      ☃ = true;
    }
    if ((☃) && (!☃))
    {
      ☃.a(☃, ☃.a(N, Boolean.valueOf(true)), 3);
      ☃.c(☃, this);
      ☃.c(☃.b(), this);
      ☃.b(☃, ☃);
    }
    if ((!☃) && (☃))
    {
      ☃.a(☃, ☃.a(N, Boolean.valueOf(false)), 3);
      ☃.c(☃, this);
      ☃.c(☃.b(), this);
      ☃.b(☃, ☃);
    }
    if (☃) {
      ☃.a(☃, this, a(☃));
    }
    ☃.e(☃, this);
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    super.c(☃, ☃, ☃);
    e(☃, ☃, ☃);
  }
  
  public amo<afe.b> n()
  {
    return b;
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    if (((Boolean)☃.p(☃).b(N)).booleanValue())
    {
      List<vc> ☃ = a(☃, ☃, vc.class, new Predicate[0]);
      if (!☃.isEmpty()) {
        return ((vc)☃.get(0)).j().j();
      }
      List<va> ☃ = a(☃, ☃, va.class, new Predicate[] { po.c });
      if (!☃.isEmpty()) {
        return xi.b((og)☃.get(0));
      }
    }
    return 0;
  }
  
  protected <T extends va> List<T> a(adm ☃, cj ☃, Class<T> ☃, Predicate<pk>... ☃)
  {
    aug ☃ = a(☃);
    if (☃.length != 1) {
      return ☃.a(☃, ☃);
    }
    return ☃.a(☃, ☃, ☃[0]);
  }
  
  private aug a(cj ☃)
  {
    float ☃ = 0.2F;
    
    return new aug(☃.n() + 0.2F, ☃.o(), ☃.p() + 0.2F, ☃.n() + 1 - 0.2F, ☃.o() + 1 - 0.2F, ☃.p() + 1 - 0.2F);
  }
  
  public alz a(int ☃)
  {
    return Q().a(b, afe.b.a(☃ & 0x7)).a(N, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((afe.b)☃.b(b)).a();
    if (((Boolean)☃.b(N)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { b, N });
  }
}
