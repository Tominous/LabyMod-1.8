import java.util.List;

public class aiw
  extends afh
{
  public static final amm<aiw.a> a = amm.a("variant", aiw.a.class);
  
  public aiw()
  {
    super(arm.e);
    j(M.b().a(a, aiw.a.a));
    a(yz.b);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    if (☃ == aiw.a.c.a())
    {
      switch (aiw.1.a[☃.k().ordinal()])
      {
      case 1: 
        return Q().a(a, aiw.a.e);
      case 2: 
        return Q().a(a, aiw.a.d);
      }
      return Q().a(a, aiw.a.c);
    }
    if (☃ == aiw.a.b.a()) {
      return Q().a(a, aiw.a.b);
    }
    return Q().a(a, aiw.a.a);
  }
  
  public int a(alz ☃)
  {
    aiw.a ☃ = (aiw.a)☃.b(a);
    if ((☃ == aiw.a.d) || (☃ == aiw.a.e)) {
      return aiw.a.c.a();
    }
    return ☃.a();
  }
  
  protected zx i(alz ☃)
  {
    aiw.a ☃ = (aiw.a)☃.b(a);
    if ((☃ == aiw.a.d) || (☃ == aiw.a.e)) {
      return new zx(zw.a(this), 1, aiw.a.c.a());
    }
    return super.i(☃);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, aiw.a.a.a()));
    ☃.add(new zx(☃, 1, aiw.a.b.a()));
    ☃.add(new zx(☃, 1, aiw.a.c.a()));
  }
  
  public arn g(alz ☃)
  {
    return arn.p;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, aiw.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((aiw.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] f;
    private final int g;
    private final String h;
    private final String i;
    
    static
    {
      f = new a[values().length];
      for (a ☃ : values()) {
        f[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, String ☃)
    {
      g = ☃;
      h = ☃;
      i = ☃;
    }
    
    public int a()
    {
      return g;
    }
    
    public String toString()
    {
      return i;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= f.length)) {
        ☃ = 0;
      }
      return f[☃];
    }
    
    public String l()
    {
      return h;
    }
  }
}
