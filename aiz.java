import java.util.List;

public class aiz
  extends afh
{
  public static final amm<aiz.a> a = amm.a("type", aiz.a.class);
  
  public aiz()
  {
    super(arm.e, ajh.a.b.c());
    j(this.M.b().a(a, aiz.a.a));
    a(yz.b);
  }
  
  public int a(alz ☃)
  {
    return ((aiz.a)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (aiz.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, aiz.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((aiz.a)☃.b(a)).a();
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
