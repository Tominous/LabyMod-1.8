import java.util.List;
import java.util.Random;

public class ahz
  extends afh
{
  public static final amm<ahz.a> a = amm.a("variant", ahz.a.class);
  
  public ahz()
  {
    super(arm.B);
    j(this.M.b().a(a, ahz.a.a));
    c(0.0F);
    a(yz.c);
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public static boolean d(alz ☃)
  {
    afh ☃ = ☃.c();
    
    return (☃ == afi.b.Q().a(ajy.a, ajy.a.a)) || (☃ == afi.e) || (☃ == afi.bf);
  }
  
  protected zx i(alz ☃)
  {
    switch (ahz.1.a[((ahz.a)☃.b(a)).ordinal()])
    {
    case 1: 
      return new zx(afi.e);
    case 2: 
      return new zx(afi.bf);
    case 3: 
      return new zx(afi.bf, 1, ajz.a.b.a());
    case 4: 
      return new zx(afi.bf, 1, ajz.a.c.a());
    case 5: 
      return new zx(afi.bf, 1, ajz.a.d.a());
    }
    return new zx(afi.b);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    if ((!☃.D) && (☃.Q().b("doTileDrops")))
    {
      vz ☃ = new vz(☃);
      ☃.b(☃.n() + 0.5D, ☃.o(), ☃.p() + 0.5D, 0.0F, 0.0F);
      ☃.d(☃);
      
      ☃.y();
    }
  }
  
  public int j(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    return ☃.c().c(☃);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (ahz.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, ahz.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((ahz.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static abstract enum a
    implements nw
  {
    private static final a[] g;
    private final int h;
    private final String i;
    private final String j;
    
    static
    {
      g = new a[values().length];
      for (a ☃ : values()) {
        g[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃)
    {
      this(☃, ☃, ☃);
    }
    
    private a(int ☃, String ☃, String ☃)
    {
      this.h = ☃;
      this.i = ☃;
      this.j = ☃;
    }
    
    public int a()
    {
      return this.h;
    }
    
    public String toString()
    {
      return this.i;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= g.length)) {
        ☃ = 0;
      }
      return g[☃];
    }
    
    public String l()
    {
      return this.i;
    }
    
    public String c()
    {
      return this.j;
    }
    
    public static a a(alz ☃)
    {
      for (a ☃ : ) {
        if (☃ == ☃.d()) {
          return ☃;
        }
      }
      return a;
    }
    
    public abstract alz d();
  }
}
