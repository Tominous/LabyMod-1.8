import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;

public class afx
  extends agd
  implements agq
{
  public static final amk a = amk.a("powered");
  public static final amm<afx.a> b = amm.a("mode", afx.a.class);
  
  public afx(boolean ☃)
  {
    super(☃);
    j(M.b().a(O, cq.c).a(a, Boolean.valueOf(false)).a(b, afx.a.a));
    A = true;
  }
  
  public String f()
  {
    return di.a("item.comparator.name");
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.ce;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.ce;
  }
  
  protected int d(alz ☃)
  {
    return 2;
  }
  
  protected alz e(alz ☃)
  {
    Boolean ☃ = (Boolean)☃.b(a);
    afx.a ☃ = (afx.a)☃.b(b);
    cq ☃ = (cq)☃.b(O);
    
    return afi.ck.Q().a(O, ☃).a(a, ☃).a(b, ☃);
  }
  
  protected alz k(alz ☃)
  {
    Boolean ☃ = (Boolean)☃.b(a);
    afx.a ☃ = (afx.a)☃.b(b);
    cq ☃ = (cq)☃.b(O);
    
    return afi.cj.Q().a(O, ☃).a(a, ☃).a(b, ☃);
  }
  
  protected boolean l(alz ☃)
  {
    return (N) || (((Boolean)☃.b(a)).booleanValue());
  }
  
  protected int a(adq ☃, cj ☃, alz ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof ala)) {
      return ((ala)☃).b();
    }
    return 0;
  }
  
  private int j(adm ☃, cj ☃, alz ☃)
  {
    if (☃.b(b) == afx.a.b) {
      return Math.max(f(☃, ☃, ☃) - c(☃, ☃, ☃), 0);
    }
    return f(☃, ☃, ☃);
  }
  
  protected boolean e(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = f(☃, ☃, ☃);
    if (☃ >= 15) {
      return true;
    }
    if (☃ == 0) {
      return false;
    }
    int ☃ = c(☃, ☃, ☃);
    if (☃ == 0) {
      return true;
    }
    return ☃ >= ☃;
  }
  
  protected int f(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = super.f(☃, ☃, ☃);
    
    cq ☃ = (cq)☃.b(O);
    cj ☃ = ☃.a(☃);
    afh ☃ = ☃.p(☃).c();
    if (☃.O())
    {
      ☃ = ☃.l(☃, ☃);
    }
    else if ((☃ < 15) && (☃.v()))
    {
      ☃ = ☃.a(☃);
      ☃ = ☃.p(☃).c();
      if (☃.O())
      {
        ☃ = ☃.l(☃, ☃);
      }
      else if (☃.t() == arm.a)
      {
        uo ☃ = a(☃, ☃, ☃);
        if (☃ != null) {
          ☃ = ☃.q();
        }
      }
    }
    return ☃;
  }
  
  private uo a(adm ☃, final cq ☃, cj ☃)
  {
    List<uo> ☃ = ☃.a(uo.class, new aug(☃.n(), ☃.o(), ☃.p(), ☃.n() + 1, ☃.o() + 1, ☃.p() + 1), new Predicate()
    {
      public boolean a(pk ☃)
      {
        return (☃ != null) && (☃.aP() == ☃);
      }
    });
    if (☃.size() == 1) {
      return (uo)☃.get(0);
    }
    return null;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (!bA.e) {
      return false;
    }
    ☃ = ☃.a(b);
    ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "random.click", 0.3F, ☃.b(b) == afx.a.b ? 0.55F : 0.5F);
    
    ☃.a(☃, ☃, 2);
    k(☃, ☃, ☃);
    return true;
  }
  
  protected void g(adm ☃, cj ☃, alz ☃)
  {
    if (☃.a(☃, this)) {
      return;
    }
    int ☃ = j(☃, ☃, ☃);
    akw ☃ = ☃.s(☃);
    int ☃ = (☃ instanceof ala) ? ((ala)☃).b() : 0;
    if ((☃ != ☃) || (l(☃) != e(☃, ☃, ☃))) {
      if (i(☃, ☃, ☃)) {
        ☃.a(☃, this, 2, -1);
      } else {
        ☃.a(☃, this, 2, 0);
      }
    }
  }
  
  private void k(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = j(☃, ☃, ☃);
    
    akw ☃ = ☃.s(☃);
    int ☃ = 0;
    if ((☃ instanceof ala))
    {
      ala ☃ = (ala)☃;
      
      ☃ = ☃.b();
      ☃.a(☃);
    }
    if ((☃ != ☃) || (☃.b(b) == afx.a.a))
    {
      boolean ☃ = e(☃, ☃, ☃);
      boolean ☃ = l(☃);
      if ((☃) && (!☃)) {
        ☃.a(☃, ☃.a(a, Boolean.valueOf(false)), 2);
      } else if ((!☃) && (☃)) {
        ☃.a(☃, ☃.a(a, Boolean.valueOf(true)), 2);
      }
      h(☃, ☃, ☃);
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (N) {
      ☃.a(☃, k(☃).a(a, Boolean.valueOf(true)), 4);
    }
    k(☃, ☃, ☃);
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    super.c(☃, ☃, ☃);
    ☃.a(☃, a(☃, 0));
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    super.b(☃, ☃, ☃);
    ☃.t(☃);
    
    h(☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃);
    
    akw ☃ = ☃.s(☃);
    if (☃ == null) {
      return false;
    }
    return ☃.c(☃, ☃);
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new ala();
  }
  
  public alz a(int ☃)
  {
    return Q().a(O, cq.b(☃)).a(a, Boolean.valueOf((☃ & 0x8) > 0)).a(b, (☃ & 0x4) > 0 ? afx.a.b : afx.a.a);
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(O)).b();
    if (((Boolean)☃.b(a)).booleanValue()) {
      ☃ |= 0x8;
    }
    if (☃.b(b) == afx.a.b) {
      ☃ |= 0x4;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { O, b, a });
  }
  
  public static enum a
    implements nw
  {
    private final String c;
    
    private a(String ☃)
    {
      c = ☃;
    }
    
    public String toString()
    {
      return c;
    }
    
    public String l()
    {
      return c;
    }
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(O, ☃.aP().d()).a(a, Boolean.valueOf(false)).a(b, afx.a.a);
  }
}
