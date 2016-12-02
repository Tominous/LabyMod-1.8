import java.util.Random;

public class agh
  extends afh
{
  public static final aml a = aml.a("facing", cq.c.a);
  public static final amk b = amk.a("open");
  public static final amm<agh.b> N = amm.a("hinge", agh.b.class);
  public static final amk O = amk.a("powered");
  public static final amm<agh.a> P = amm.a("half", agh.a.class);
  
  protected agh(arm ☃)
  {
    super(☃);
    j(M.b().a(a, cq.c).a(b, Boolean.valueOf(false)).a(N, agh.b.a).a(O, Boolean.valueOf(false)).a(P, agh.a.b));
  }
  
  public String f()
  {
    return di.a((a() + ".name").replaceAll("tile", "item"));
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean b(adq ☃, cj ☃)
  {
    return g(e(☃, ☃));
  }
  
  public boolean d()
  {
    return false;
  }
  
  public aug b(adm ☃, cj ☃)
  {
    a(☃, ☃);
    return super.b(☃, ☃);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃);
  }
  
  public void a(adq ☃, cj ☃)
  {
    k(e(☃, ☃));
  }
  
  private void k(int ☃)
  {
    float ☃ = 0.1875F;
    a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
    cq ☃ = f(☃);
    boolean ☃ = g(☃);
    boolean ☃ = j(☃);
    if (☃)
    {
      if (☃ == cq.f)
      {
        if (!☃) {
          a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, ☃);
        } else {
          a(0.0F, 0.0F, 1.0F - ☃, 1.0F, 1.0F, 1.0F);
        }
      }
      else if (☃ == cq.d)
      {
        if (!☃) {
          a(1.0F - ☃, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        } else {
          a(0.0F, 0.0F, 0.0F, ☃, 1.0F, 1.0F);
        }
      }
      else if (☃ == cq.e)
      {
        if (!☃) {
          a(0.0F, 0.0F, 1.0F - ☃, 1.0F, 1.0F, 1.0F);
        } else {
          a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, ☃);
        }
      }
      else if (☃ == cq.c) {
        if (!☃) {
          a(0.0F, 0.0F, 0.0F, ☃, 1.0F, 1.0F);
        } else {
          a(1.0F - ☃, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
      }
    }
    else if (☃ == cq.f) {
      a(0.0F, 0.0F, 0.0F, ☃, 1.0F, 1.0F);
    } else if (☃ == cq.d) {
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, ☃);
    } else if (☃ == cq.e) {
      a(1.0F - ☃, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else if (☃ == cq.c) {
      a(0.0F, 0.0F, 1.0F - ☃, 1.0F, 1.0F, 1.0F);
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (J == arm.f) {
      return true;
    }
    cj ☃ = ☃.b(P) == agh.a.b ? ☃ : ☃.b();
    alz ☃ = ☃.equals(☃) ? ☃ : ☃.p(☃);
    if (☃.c() != this) {
      return false;
    }
    ☃ = ☃.a(b);
    ☃.a(☃, ☃, 2);
    ☃.b(☃, ☃);
    
    ☃.a(☃, ((Boolean)☃.b(b)).booleanValue() ? 1003 : 1006, ☃, 0);
    return true;
  }
  
  public void a(adm ☃, cj ☃, boolean ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() != this) {
      return;
    }
    cj ☃ = ☃.b(P) == agh.a.b ? ☃ : ☃.b();
    alz ☃ = ☃ == ☃ ? ☃ : ☃.p(☃);
    if ((☃.c() == this) && (((Boolean)☃.b(b)).booleanValue() != ☃))
    {
      ☃.a(☃, ☃.a(b, Boolean.valueOf(☃)), 2);
      ☃.b(☃, ☃);
      
      ☃.a(null, ☃ ? 1003 : 1006, ☃, 0);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (☃.b(P) == agh.a.a)
    {
      cj ☃ = ☃.b();
      alz ☃ = ☃.p(☃);
      if (☃.c() != this) {
        ☃.g(☃);
      } else if (☃ != this) {
        a(☃, ☃, ☃, ☃);
      }
    }
    else
    {
      boolean ☃ = false;
      cj ☃ = ☃.a();
      alz ☃ = ☃.p(☃);
      if (☃.c() != this)
      {
        ☃.g(☃);
        ☃ = true;
      }
      if (!adm.a(☃, ☃.b()))
      {
        ☃.g(☃);
        ☃ = true;
        if (☃.c() == this) {
          ☃.g(☃);
        }
      }
      if (☃)
      {
        if (!D) {
          b(☃, ☃, ☃, 0);
        }
      }
      else
      {
        boolean ☃ = (☃.z(☃)) || (☃.z(☃));
        if (((☃) || (☃.i())) && (☃ != this) && 
          (☃ != ((Boolean)☃.b(O)).booleanValue()))
        {
          ☃.a(☃, ☃.a(O, Boolean.valueOf(☃)), 2);
          if (☃ != ((Boolean)☃.b(b)).booleanValue())
          {
            ☃.a(☃, ☃.a(b, Boolean.valueOf(☃)), 2);
            ☃.b(☃, ☃);
            ☃.a(null, ☃ ? 1003 : 1006, ☃, 0);
          }
        }
      }
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (☃.b(P) == agh.a.a) {
      return null;
    }
    return l();
  }
  
  public auh a(adm ☃, cj ☃, aui ☃, aui ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃, ☃);
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    if (☃.o() >= 255) {
      return false;
    }
    return (adm.a(☃, ☃.b())) && (super.d(☃, ☃)) && (super.d(☃, ☃.a()));
  }
  
  public int k()
  {
    return 1;
  }
  
  public static int e(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    int ☃ = ☃.c().c(☃);
    boolean ☃ = i(☃);
    
    alz ☃ = ☃.p(☃.b());
    int ☃ = ☃.c().c(☃);
    int ☃ = ☃ ? ☃ : ☃;
    alz ☃ = ☃.p(☃.a());
    int ☃ = ☃.c().c(☃);
    int ☃ = ☃ ? ☃ : ☃;
    
    boolean ☃ = (☃ & 0x1) != 0;
    boolean ☃ = (☃ & 0x2) != 0;
    return b(☃) | (☃ ? 8 : 0) | (☃ ? 16 : 0) | (☃ ? 32 : 0);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return l();
  }
  
  private zw l()
  {
    if (this == afi.aA) {
      return zy.aB;
    }
    if (this == afi.ap) {
      return zy.ar;
    }
    if (this == afi.aq) {
      return zy.as;
    }
    if (this == afi.ar) {
      return zy.at;
    }
    if (this == afi.as) {
      return zy.au;
    }
    if (this == afi.at) {
      return zy.av;
    }
    return zy.aq;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    cj ☃ = ☃.b();
    if ((bA.d) && (☃.b(P) == agh.a.a) && (☃.p(☃).c() == this)) {
      ☃.g(☃);
    }
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    if (☃.b(P) == agh.a.b)
    {
      alz ☃ = ☃.p(☃.a());
      if (☃.c() == this) {
        ☃ = ☃.a(N, ☃.b(N)).a(O, ☃.b(O));
      }
    }
    else
    {
      alz ☃ = ☃.p(☃.b());
      if (☃.c() == this) {
        ☃ = ☃.a(a, ☃.b(a)).a(b, ☃.b(b));
      }
    }
    return ☃;
  }
  
  public alz a(int ☃)
  {
    if ((☃ & 0x8) > 0) {
      return Q().a(P, agh.a.a).a(N, (☃ & 0x1) > 0 ? agh.b.b : agh.b.a).a(O, Boolean.valueOf((☃ & 0x2) > 0));
    }
    return Q().a(P, agh.a.b).a(a, cq.b(☃ & 0x3).f()).a(b, Boolean.valueOf((☃ & 0x4) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    if (☃.b(P) == agh.a.a)
    {
      ☃ |= 0x8;
      if (☃.b(N) == agh.b.b) {
        ☃ |= 0x1;
      }
      if (((Boolean)☃.b(O)).booleanValue()) {
        ☃ |= 0x2;
      }
    }
    else
    {
      ☃ |= ((cq)☃.b(a)).e().b();
      if (((Boolean)☃.b(b)).booleanValue()) {
        ☃ |= 0x4;
      }
    }
    return ☃;
  }
  
  public static enum a
    implements nw
  {
    private a() {}
    
    public String toString()
    {
      return l();
    }
    
    public String l()
    {
      return this == a ? "upper" : "lower";
    }
  }
  
  public static enum b
    implements nw
  {
    private b() {}
    
    public String toString()
    {
      return l();
    }
    
    public String l()
    {
      return this == a ? "left" : "right";
    }
  }
  
  protected static int b(int ☃)
  {
    return ☃ & 0x7;
  }
  
  public static boolean f(adq ☃, cj ☃)
  {
    return g(e(☃, ☃));
  }
  
  public static cq h(adq ☃, cj ☃)
  {
    return f(e(☃, ☃));
  }
  
  public static cq f(int ☃)
  {
    return cq.b(☃ & 0x3).f();
  }
  
  protected static boolean g(int ☃)
  {
    return (☃ & 0x4) != 0;
  }
  
  protected static boolean i(int ☃)
  {
    return (☃ & 0x8) != 0;
  }
  
  protected static boolean j(int ☃)
  {
    return (☃ & 0x10) != 0;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { P, a, b, N, O });
  }
}
