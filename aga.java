import java.util.List;
import java.util.Random;

public class aga
  extends afc
{
  public static final amn a = amn.a("power", 0, 15);
  private final boolean b;
  
  public aga(boolean ☃)
  {
    super(arm.d);
    b = ☃;
    
    j(M.b().a(a, Integer.valueOf(0)));
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
    a(yz.d);
    
    c(0.2F);
    a(f);
    c("daylightDetector");
  }
  
  public void a(adq ☃, cj ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  public void f(adm ☃, cj ☃)
  {
    if (t.o()) {
      return;
    }
    alz ☃ = ☃.p(☃);
    int ☃ = ☃.b(ads.a, ☃) - ☃.ab();
    float ☃ = ☃.d(1.0F);
    
    float ☃ = ☃ < 3.1415927F ? 0.0F : 6.2831855F;
    ☃ += (☃ - ☃) * 0.2F;
    
    ☃ = Math.round(☃ * ns.b(☃));
    ☃ = ns.a(☃, 0, 15);
    if (b) {
      ☃ = 15 - ☃;
    }
    if (((Integer)☃.b(a)).intValue() != ☃) {
      ☃.a(☃, ☃.a(a, Integer.valueOf(☃)), 3);
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.cn())
    {
      if (D) {
        return true;
      }
      if (b)
      {
        ☃.a(☃, afi.cl.Q().a(a, ☃.b(a)), 4);
        afi.cl.f(☃, ☃);
      }
      else
      {
        ☃.a(☃, afi.cm.Q().a(a, ☃.b(a)), 4);
        afi.cm.f(☃, ☃);
      }
      return true;
    }
    return super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.cl);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(afi.cl);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public int b()
  {
    return 3;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new alb();
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
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    if (!b) {
      super.a(☃, ☃, ☃);
    }
  }
}
