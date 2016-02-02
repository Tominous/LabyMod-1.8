import java.util.List;

public class ajz
  extends afh
{
  public static final amm<ajz.a> a = amm.a("variant", ajz.a.class);
  public static final int b = ajz.a.a.a();
  public static final int N = ajz.a.b.a();
  public static final int O = ajz.a.c.a();
  public static final int P = ajz.a.d.a();
  
  public ajz()
  {
    super(arm.e);
    j(this.M.b().a(a, ajz.a.a));
    a(yz.b);
  }
  
  public int a(alz ☃)
  {
    return ((ajz.a)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (ajz.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, ajz.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((ajz.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] e;
    private final int f;
    private final String g;
    private final String h;
    
    static
    {
      e = new a[values().length];
      for (a ☃ : values()) {
        e[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, String ☃)
    {
      this.f = ☃;
      this.g = ☃;
      this.h = ☃;
    }
    
    public int a()
    {
      return this.f;
    }
    
    public String toString()
    {
      return this.g;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= e.length)) {
        ☃ = 0;
      }
      return e[☃];
    }
    
    public String l()
    {
      return this.g;
    }
    
    public String c()
    {
      return this.h;
    }
  }
}
