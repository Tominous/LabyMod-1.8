import java.util.List;

public class aji
  extends afh
{
  public static final amm<aji.a> a = amm.a("type", aji.a.class);
  
  public aji()
  {
    super(arm.e);
    j(M.b().a(a, aji.a.a));
    a(yz.b);
  }
  
  public int a(alz ☃)
  {
    return ((aji.a)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (aji.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public arn g(alz ☃)
  {
    return arn.d;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, aji.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((aji.a)☃.b(a)).a();
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
    private final String g;
    
    static
    {
      d = new a[values().length];
      for (a ☃ : values()) {
        d[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, String ☃)
    {
      e = ☃;
      f = ☃;
      g = ☃;
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
    
    public String c()
    {
      return g;
    }
  }
}
