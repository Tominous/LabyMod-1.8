import java.util.List;
import java.util.Random;

public class ajy
  extends afh
{
  public static final amm<ajy.a> a = amm.a("variant", ajy.a.class);
  
  public ajy()
  {
    super(arm.e);
    j(this.M.b().a(a, ajy.a.a));
    a(yz.b);
  }
  
  public String f()
  {
    return di.a(a() + "." + ajy.a.a.d() + ".name");
  }
  
  public arn g(alz ☃)
  {
    return ((ajy.a)☃.b(a)).c();
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (☃.b(a) == ajy.a.a) {
      return zw.a(afi.e);
    }
    return zw.a(afi.b);
  }
  
  public int a(alz ☃)
  {
    return ((ajy.a)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (ajy.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, ajy.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((ajy.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] h;
    private final int i;
    private final String j;
    private final String k;
    private final arn l;
    
    static
    {
      h = new a[values().length];
      for (a ☃ : values()) {
        h[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, arn ☃, String ☃)
    {
      this(☃, ☃, ☃, ☃);
    }
    
    private a(int ☃, arn ☃, String ☃, String ☃)
    {
      this.i = ☃;
      this.j = ☃;
      this.k = ☃;
      this.l = ☃;
    }
    
    public int a()
    {
      return this.i;
    }
    
    public arn c()
    {
      return this.l;
    }
    
    public String toString()
    {
      return this.j;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= h.length)) {
        ☃ = 0;
      }
      return h[☃];
    }
    
    public String l()
    {
      return this.j;
    }
    
    public String d()
    {
      return this.k;
    }
  }
}
