import java.util.List;

public class ajh
  extends agr
{
  public static final amm<ajh.a> a = amm.a("variant", ajh.a.class);
  
  public ajh()
  {
    j(this.M.b().a(a, ajh.a.a));
  }
  
  public int a(alz ☃)
  {
    return ((ajh.a)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (ajh.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public arn g(alz ☃)
  {
    return ((ajh.a)☃.b(a)).c();
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, ajh.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((ajh.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] c;
    private final int d;
    private final String e;
    private final arn f;
    private final String g;
    
    static
    {
      c = new a[values().length];
      for (a ☃ : values()) {
        c[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, String ☃, arn ☃)
    {
      this.d = ☃;
      this.e = ☃;
      this.f = ☃;
      this.g = ☃;
    }
    
    public int a()
    {
      return this.d;
    }
    
    public String toString()
    {
      return this.e;
    }
    
    public arn c()
    {
      return this.f;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= c.length)) {
        ☃ = 0;
      }
      return c[☃];
    }
    
    public String l()
    {
      return this.e;
    }
    
    public String d()
    {
      return this.g;
    }
  }
}
