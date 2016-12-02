import java.util.List;

public class aio
  extends afh
{
  public static final amm<aio.a> a = amm.a("variant", aio.a.class);
  
  public aio()
  {
    super(arm.d);
    j(M.b().a(a, aio.a.a));
    a(yz.b);
  }
  
  public int a(alz ☃)
  {
    return ((aio.a)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (aio.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, aio.a.a(☃));
  }
  
  public arn g(alz ☃)
  {
    return ((aio.a)☃.b(a)).c();
  }
  
  public int c(alz ☃)
  {
    return ((aio.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] g;
    private final int h;
    private final String i;
    private final String j;
    private final arn k;
    
    static
    {
      g = new a[values().length];
      for (a ☃ : values()) {
        g[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, arn ☃)
    {
      this(☃, ☃, ☃, ☃);
    }
    
    private a(int ☃, String ☃, String ☃, arn ☃)
    {
      h = ☃;
      i = ☃;
      j = ☃;
      k = ☃;
    }
    
    public int a()
    {
      return h;
    }
    
    public arn c()
    {
      return k;
    }
    
    public String toString()
    {
      return i;
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
      return i;
    }
    
    public String d()
    {
      return j;
    }
  }
}
