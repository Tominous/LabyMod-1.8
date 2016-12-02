import com.google.common.base.Predicate;
import java.util.Random;

public class ajx
  extends afm
  implements afj
{
  public static final amn a = amn.a("age", 0, 7);
  public static final aml b = aml.a("facing", new Predicate()
  {
    public boolean a(cq ☃)
    {
      return ☃ != cq.a;
    }
  });
  private final afh N;
  
  protected ajx(afh ☃)
  {
    j(this.M.b().a(a, Integer.valueOf(0)).a(b, cq.b));
    this.N = ☃;
    a(true);
    float ☃ = 0.125F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.25F, 0.5F + ☃);
    a(null);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    ☃ = ☃.a(b, cq.b);
    for (cq ☃ : cq.c.a) {
      if (☃.p(☃.a(☃)).c() == this.N)
      {
        ☃ = ☃.a(b, ☃);
        break;
      }
    }
    return ☃;
  }
  
  protected boolean c(afh ☃)
  {
    return ☃ == afi.ak;
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    super.b(☃, ☃, ☃, ☃);
    if (☃.l(☃.a()) < 9) {
      return;
    }
    float ☃ = afz.a(this, ☃, ☃);
    if (☃.nextInt((int)(25.0F / ☃) + 1) == 0)
    {
      int ☃ = ((Integer)☃.b(a)).intValue();
      if (☃ < 7)
      {
        ☃ = ☃.a(a, Integer.valueOf(☃ + 1));
        ☃.a(☃, ☃, 2);
      }
      else
      {
        for (cq ☃ : cq.c.a) {
          if (☃.p(☃.a(☃)).c() == this.N) {
            return;
          }
        }
        ☃ = ☃.a(cq.c.a.a(☃));
        
        afh ☃ = ☃.p(☃.b()).c();
        if ((☃.p(☃).c().J == arm.a) && ((☃ == afi.ak) || (☃ == afi.d) || (☃ == afi.c))) {
          ☃.a(☃, this.N.Q());
        }
      }
    }
  }
  
  public void g(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = ((Integer)☃.b(a)).intValue() + ns.a(☃.s, 2, 5);
    ☃.a(☃, ☃.a(a, Integer.valueOf(Math.min(7, ☃))), 2);
  }
  
  public int h(alz ☃)
  {
    if (☃.c() != this) {
      return super.h(☃);
    }
    int ☃ = ((Integer)☃.b(a)).intValue();
    int ☃ = ☃ * 32;
    int ☃ = 255 - ☃ * 8;
    int ☃ = ☃ * 4;
    return ☃ << 16 | ☃ << 8 | ☃;
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    return h(☃.p(☃));
  }
  
  public void j()
  {
    float ☃ = 0.125F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.25F, 0.5F + ☃);
  }
  
  public void a(adq ☃, cj ☃)
  {
    this.F = ((((Integer)☃.p(☃).b(a)).intValue() * 2 + 2) / 16.0F);
    float ☃ = 0.125F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, (float)this.F, 0.5F + ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃);
    if (☃.D) {
      return;
    }
    zw ☃ = l();
    if (☃ == null) {
      return;
    }
    int ☃ = ((Integer)☃.b(a)).intValue();
    for (int ☃ = 0; ☃ < 3; ☃++) {
      if (☃.s.nextInt(15) <= ☃) {
        a(☃, ☃, new zx(☃));
      }
    }
  }
  
  protected zw l()
  {
    if (this.N == afi.aU) {
      return zy.bg;
    }
    if (this.N == afi.bk) {
      return zy.bh;
    }
    return null;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return null;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    zw ☃ = l();
    
    return ☃ != null ? ☃ : null;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    return ((Integer)☃.b(a)).intValue() != 7;
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
    return new ama(this, new amo[] { a, b });
  }
}
