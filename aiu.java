import java.util.List;

public class aiu
  extends afh
{
  public static final amm<aiu.a> a = amm.a("variant", aiu.a.class);
  public static final int b = aiu.a.a.a();
  public static final int N = aiu.a.b.a();
  public static final int O = aiu.a.c.a();
  
  public aiu()
  {
    super(arm.e);
    j(this.M.b().a(a, aiu.a.a));
    a(yz.b);
  }
  
  public String f()
  {
    return di.a(a() + "." + aiu.a.a.c() + ".name");
  }
  
  public arn g(alz ☃)
  {
    if (☃.b(a) == aiu.a.a) {
      return arn.y;
    }
    return arn.G;
  }
  
  public int a(alz ☃)
  {
    return ((aiu.a)☃.b(a)).a();
  }
  
  public int c(alz ☃)
  {
    return ((aiu.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, aiu.a.a(☃));
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, b));
    ☃.add(new zx(☃, 1, N));
    ☃.add(new zx(☃, 1, O));
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
      this.e = ☃;
      this.f = ☃;
      this.g = ☃;
    }
    
    public int a()
    {
      return this.e;
    }
    
    public String toString()
    {
      return this.f;
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
      return this.f;
    }
    
    public String c()
    {
      return this.g;
    }
  }
}
