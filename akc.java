import java.util.List;
import java.util.Random;

public class akc
  extends afm
  implements afj
{
  public static final amm<akc.a> a = amm.a("type", akc.a.class);
  
  protected akc()
  {
    super(arm.l);
    j(M.b().a(a, akc.a.a));
    float ☃ = 0.4F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.8F, 0.5F + ☃);
  }
  
  public int H()
  {
    return adl.a(0.5D, 1.0D);
  }
  
  public boolean f(adm ☃, cj ☃, alz ☃)
  {
    return c(☃.p(☃.b()).c());
  }
  
  public boolean a(adm ☃, cj ☃)
  {
    return true;
  }
  
  public int h(alz ☃)
  {
    if (☃.c() != this) {
      return super.h(☃);
    }
    akc.a ☃ = (akc.a)☃.b(a);
    if (☃ == akc.a.a) {
      return 16777215;
    }
    return adl.a(0.5D, 1.0D);
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    return ☃.b(☃).b(☃);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (☃.nextInt(8) == 0) {
      return zy.N;
    }
    return null;
  }
  
  public int a(int ☃, Random ☃)
  {
    return 1 + ☃.nextInt(☃ * 2 + 1);
  }
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    if ((!D) && (☃.bZ() != null) && (☃.bZ().b() == zy.be))
    {
      ☃.b(na.ab[afh.a(this)]);
      
      a(☃, ☃, new zx(afi.H, 1, ((akc.a)☃.b(a)).a()));
    }
    else
    {
      super.a(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public int j(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    return ☃.c().c(☃);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (int ☃ = 1; ☃ < 3; ☃++) {
      ☃.add(new zx(☃, 1, ☃));
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    return ☃.b(a) != akc.a.a;
  }
  
  public boolean a(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    return true;
  }
  
  public void b(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    agi.b ☃ = agi.b.c;
    if (☃.b(a) == akc.a.c) {
      ☃ = agi.b.d;
    }
    if (afi.cF.d(☃, ☃)) {
      afi.cF.a(☃, ☃, ☃, 2);
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, akc.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((akc.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] d;
    private final int e;
    private final String f;
    
    static
    {
      d = new a[values().length];
      for (a ☃ : values()) {
        d[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃)
    {
      e = ☃;
      f = ☃;
    }
    
    public int a()
    {
      return e;
    }
    
    public String toString()
    {
      return f;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= d.length)) {
        ☃ = 0;
      }
      return d[☃];
    }
    
    public String l()
    {
      return f;
    }
  }
  
  public afh.a R()
  {
    return afh.a.c;
  }
}
