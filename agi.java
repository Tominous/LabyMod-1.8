import java.util.List;
import java.util.Random;

public class agi
  extends afm
  implements afj
{
  public static final amm<agi.b> a = amm.a("variant", agi.b.class);
  public static final amm<agi.a> b = amm.a("half", agi.a.class);
  public static final amm<cq> N = age.O;
  
  public agi()
  {
    super(arm.l);
    j(M.b().a(a, agi.b.a).a(b, agi.a.b).a(N, cq.c));
    c(0.0F);
    a(h);
    c("doublePlant");
  }
  
  public void a(adq ☃, cj ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public agi.b e(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() == this)
    {
      ☃ = a(☃, ☃, ☃);
      
      return (agi.b)☃.b(a);
    }
    return agi.b.d;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (super.d(☃, ☃)) && (☃.d(☃.a()));
  }
  
  public boolean a(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() == this)
    {
      agi.b ☃ = (agi.b)a(☃, ☃, ☃).b(a);
      return (☃ == agi.b.d) || (☃ == agi.b.c);
    }
    return true;
  }
  
  protected void e(adm ☃, cj ☃, alz ☃)
  {
    if (f(☃, ☃, ☃)) {
      return;
    }
    boolean ☃ = ☃.b(b) == agi.a.a;
    cj ☃ = ☃ ? ☃ : ☃.a();
    cj ☃ = ☃ ? ☃.b() : ☃;
    
    afh ☃ = ☃ ? this : ☃.p(☃).c();
    afh ☃ = ☃ ? ☃.p(☃).c() : this;
    if (☃ == this) {
      ☃.a(☃, afi.a.Q(), 2);
    }
    if (☃ == this)
    {
      ☃.a(☃, afi.a.Q(), 3);
      if (!☃) {
        b(☃, ☃, ☃, 0);
      }
    }
  }
  
  public boolean f(adm ☃, cj ☃, alz ☃)
  {
    if (☃.b(b) == agi.a.a) {
      return ☃.p(☃.b()).c() == this;
    }
    alz ☃ = ☃.p(☃.a());
    return (☃.c() == this) && (super.f(☃, ☃, ☃));
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (☃.b(b) == agi.a.a) {
      return null;
    }
    agi.b ☃ = (agi.b)☃.b(a);
    if (☃ == agi.b.d) {
      return null;
    }
    if (☃ == agi.b.c)
    {
      if (☃.nextInt(8) == 0) {
        return zy.N;
      }
      return null;
    }
    return zw.a(this);
  }
  
  public int a(alz ☃)
  {
    if ((☃.b(b) == agi.a.a) || (☃.b(a) == agi.b.c)) {
      return 0;
    }
    return ((agi.b)☃.b(a)).a();
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    agi.b ☃ = e(☃, ☃);
    if ((☃ == agi.b.c) || (☃ == agi.b.d)) {
      return aea.a(☃, ☃);
    }
    return 16777215;
  }
  
  public void a(adm ☃, cj ☃, agi.b ☃, int ☃)
  {
    ☃.a(☃, Q().a(b, agi.a.b).a(a, ☃), ☃);
    ☃.a(☃.a(), Q().a(b, agi.a.a), ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    ☃.a(☃.a(), Q().a(b, agi.a.a), 2);
  }
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    if ((!D) && (☃.bZ() != null) && (☃.bZ().b() == zy.be)) {
      if ((☃.b(b) == agi.a.b) && 
        (b(☃, ☃, ☃, ☃))) {
        return;
      }
    }
    super.a(☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    if (☃.b(b) == agi.a.a)
    {
      if (☃.p(☃.b()).c() == this) {
        if (!bA.d)
        {
          alz ☃ = ☃.p(☃.b());
          agi.b ☃ = (agi.b)☃.b(a);
          if ((☃ == agi.b.d) || (☃ == agi.b.c))
          {
            if (!D)
            {
              if ((☃.bZ() != null) && (☃.bZ().b() == zy.be))
              {
                b(☃, ☃, ☃, ☃);
                ☃.g(☃.b());
              }
              else
              {
                ☃.b(☃.b(), true);
              }
            }
            else {
              ☃.g(☃.b());
            }
          }
          else {
            ☃.b(☃.b(), true);
          }
        }
        else
        {
          ☃.g(☃.b());
        }
      }
    }
    else if ((bA.d) && (☃.p(☃.a()).c() == this)) {
      ☃.a(☃.a(), afi.a.Q(), 2);
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  private boolean b(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    agi.b ☃ = (agi.b)☃.b(a);
    if ((☃ == agi.b.d) || (☃ == agi.b.c))
    {
      ☃.b(na.ab[afh.a(this)]);
      
      int ☃ = (☃ == agi.b.c ? akc.a.b : akc.a.c).a();
      a(☃, ☃, new zx(afi.H, 2, ☃));
      return true;
    }
    return false;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (agi.b ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public int j(adm ☃, cj ☃)
  {
    return e(☃, ☃).a();
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    agi.b ☃ = e(☃, ☃);
    
    return (☃ != agi.b.c) && (☃ != agi.b.d);
  }
  
  public boolean a(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    return true;
  }
  
  public void b(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    a(☃, ☃, new zx(this, 1, e(☃, ☃).a()));
  }
  
  public alz a(int ☃)
  {
    if ((☃ & 0x8) > 0) {
      return Q().a(b, agi.a.a);
    }
    return Q().a(b, agi.a.b).a(a, agi.b.a(☃ & 0x7));
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    if (☃.b(b) == agi.a.a)
    {
      alz ☃ = ☃.p(☃.b());
      if (☃.c() == this) {
        ☃ = ☃.a(a, ☃.b(a));
      }
    }
    return ☃;
  }
  
  public int c(alz ☃)
  {
    if (☃.b(b) == agi.a.a) {
      return 0x8 | ((cq)☃.b(N)).b();
    }
    return ((agi.b)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { b, a, N });
  }
  
  public static enum b
    implements nw
  {
    private static final b[] g;
    private final int h;
    private final String i;
    private final String j;
    
    static
    {
      g = new b[values().length];
      for (b ☃ : values()) {
        g[☃.a()] = ☃;
      }
    }
    
    private b(int ☃, String ☃)
    {
      this(☃, ☃, ☃);
    }
    
    private b(int ☃, String ☃, String ☃)
    {
      h = ☃;
      i = ☃;
      j = ☃;
    }
    
    public int a()
    {
      return h;
    }
    
    public String toString()
    {
      return i;
    }
    
    public static b a(int ☃)
    {
      if ((☃ < 0) || (☃ >= g.length)) {
        ☃ = 0;
      }
      return g[☃];
    }
    
    public String l()
    {
      return i;
    }
    
    public String c()
    {
      return j;
    }
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
  
  public afh.a R()
  {
    return afh.a.b;
  }
}
