import java.util.List;
import java.util.Random;

public class aki
  extends afh
{
  public static final amk a = amk.a("powered");
  public static final amk b = amk.a("suspended");
  public static final amk N = amk.a("attached");
  public static final amk O = amk.a("disarmed");
  public static final amk P = amk.a("north");
  public static final amk Q = amk.a("east");
  public static final amk R = amk.a("south");
  public static final amk S = amk.a("west");
  
  public aki()
  {
    super(arm.q);
    j(this.M.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)).a(Q, Boolean.valueOf(false)).a(R, Boolean.valueOf(false)).a(S, Boolean.valueOf(false)));
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
    a(true);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃.a(P, Boolean.valueOf(c(☃, ☃, ☃, cq.c))).a(Q, Boolean.valueOf(c(☃, ☃, ☃, cq.f))).a(R, Boolean.valueOf(c(☃, ☃, ☃, cq.d))).a(S, Boolean.valueOf(c(☃, ☃, ☃, cq.e)));
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
  
  public adf m()
  {
    return adf.d;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.F;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.F;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
    boolean ☃ = !adm.a(☃, ☃.b());
    if (☃ != ☃)
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
  }
  
  public void a(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    boolean ☃ = ((Boolean)☃.b(N)).booleanValue();
    boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
    if (!☃) {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
    } else if (!☃) {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    } else {
      a(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    ☃ = ☃.a(b, Boolean.valueOf(!adm.a(☃, ☃.b())));
    ☃.a(☃, ☃, 3);
    e(☃, ☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    e(☃, ☃, ☃.a(a, Boolean.valueOf(true)));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    if (☃.D) {
      return;
    }
    if ((☃.bZ() != null) && (☃.bZ().b() == zy.be)) {
      ☃.a(☃, ☃.a(O, Boolean.valueOf(true)), 4);
    }
  }
  
  private void e(adm ☃, cj ☃, alz ☃)
  {
    for (cq ☃ : new cq[] { cq.d, cq.e }) {
      for (int ☃ = 1; ☃ < 42; ☃++)
      {
        cj ☃ = ☃.a(☃, ☃);
        alz ☃ = ☃.p(☃);
        if (☃.c() == afi.bR)
        {
          if (☃.b(akj.a) == ☃.d()) {
            afi.bR.a(☃, ☃, ☃, false, true, ☃, ☃);
          }
        }
        else {
          if (☃.c() != afi.bS) {
            break;
          }
        }
      }
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    if (☃.D) {
      return;
    }
    if (((Boolean)☃.b(a)).booleanValue()) {
      return;
    }
    e(☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.D) {
      return;
    }
    if (!((Boolean)☃.p(☃).b(a)).booleanValue()) {
      return;
    }
    e(☃, ☃);
  }
  
  private void e(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    boolean ☃ = ((Boolean)☃.b(a)).booleanValue();
    boolean ☃ = false;
    
    List<? extends pk> ☃ = ☃.b(null, new aug(☃.n() + this.B, ☃.o() + this.C, ☃.p() + this.D, ☃.n() + this.E, ☃.o() + this.F, ☃.p() + this.G));
    if (!☃.isEmpty()) {
      for (pk ☃ : ☃) {
        if (!☃.aI())
        {
          ☃ = true;
          break;
        }
      }
    }
    if (☃ != ☃)
    {
      ☃ = ☃.a(a, Boolean.valueOf(☃));
      ☃.a(☃, ☃, 3);
      e(☃, ☃, ☃);
    }
    if (☃) {
      ☃.a(☃, this, a(☃));
    }
  }
  
  public static boolean c(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    cj ☃ = ☃.a(☃);
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (☃ == afi.bR)
    {
      cq ☃ = ☃.d();
      return ☃.b(akj.a) == ☃;
    }
    if (☃ == afi.bS)
    {
      boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
      boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
      return ☃ == ☃;
    }
    return false;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Boolean.valueOf((☃ & 0x1) > 0)).a(b, Boolean.valueOf((☃ & 0x2) > 0)).a(N, Boolean.valueOf((☃ & 0x4) > 0)).a(O, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    if (((Boolean)☃.b(a)).booleanValue()) {
      ☃ |= 0x1;
    }
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x2;
    }
    if (((Boolean)☃.b(N)).booleanValue()) {
      ☃ |= 0x4;
    }
    if (((Boolean)☃.b(O)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, N, O, P, Q, S, R });
  }
}
