import java.util.List;

public class agf
  extends afh
{
  public static final amm<agf.a> a = amm.a("variant", agf.a.class);
  public static final amk b = amk.a("snowy");
  
  protected agf()
  {
    super(arm.c);
    j(M.b().a(a, agf.a.a).a(b, Boolean.valueOf(false)));
    a(yz.b);
  }
  
  public arn g(alz ☃)
  {
    return ((agf.a)☃.b(a)).d();
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    if (☃.b(a) == agf.a.c)
    {
      afh ☃ = ☃.p(☃.a()).c();
      ☃ = ☃.a(b, Boolean.valueOf((☃ == afi.aJ) || (☃ == afi.aH)));
    }
    return ☃;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(this, 1, agf.a.a.a()));
    ☃.add(new zx(this, 1, agf.a.b.a()));
    ☃.add(new zx(this, 1, agf.a.c.a()));
  }
  
  public int j(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() != this) {
      return 0;
    }
    return ((agf.a)☃.b(a)).a();
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, agf.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((agf.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
  
  public int a(alz ☃)
  {
    agf.a ☃ = (agf.a)☃.b(a);
    if (☃ == agf.a.c) {
      ☃ = agf.a.a;
    }
    return ☃.a();
  }
  
  public static enum a
    implements nw
  {
    private static final a[] d;
    private final int e;
    private final String f;
    private final String g;
    private final arn h;
    
    static
    {
      d = new a[values().length];
      for (a ☃ : values()) {
        d[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, arn ☃)
    {
      this(☃, ☃, ☃, ☃);
    }
    
    private a(int ☃, String ☃, String ☃, arn ☃)
    {
      e = ☃;
      f = ☃;
      g = ☃;
      h = ☃;
    }
    
    public int a()
    {
      return e;
    }
    
    public String c()
    {
      return g;
    }
    
    public arn d()
    {
      return h;
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
}
