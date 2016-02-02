import java.util.List;
import java.util.Random;

public abstract class aih
  extends ahh
{
  public static final amk b = amk.a("seamless");
  public static final amm<aih.a> N = amm.a("variant", aih.a.class);
  
  public aih()
  {
    super(arm.e);
    alz ☃ = this.M.b();
    if (l()) {
      ☃ = ☃.a(b, Boolean.valueOf(false));
    } else {
      ☃ = ☃.a(a, ahh.a.b);
    }
    j(☃.a(N, aih.a.a));
    a(yz.b);
  }
  
  public String f()
  {
    return di.a(a() + ".red_sandstone.name");
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.cP);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(afi.cP);
  }
  
  public String b(int ☃)
  {
    return super.a() + "." + aih.a.a(☃).d();
  }
  
  public amo<?> n()
  {
    return N;
  }
  
  public Object a(zx ☃)
  {
    return aih.a.a(☃.i() & 0x7);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    if (☃ == zw.a(afi.cO)) {
      return;
    }
    for (aih.a ☃ : aih.a.values()) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public alz a(int ☃)
  {
    alz ☃ = Q().a(N, aih.a.a(☃ & 0x7));
    if (l()) {
      ☃ = ☃.a(b, Boolean.valueOf((☃ & 0x8) != 0));
    } else {
      ☃ = ☃.a(a, (☃ & 0x8) == 0 ? ahh.a.b : ahh.a.a);
    }
    return ☃;
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((aih.a)☃.b(N)).a();
    if (l())
    {
      if (((Boolean)☃.b(b)).booleanValue()) {
        ☃ |= 0x8;
      }
    }
    else if (☃.b(a) == ahh.a.a) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    if (l()) {
      return new ama(this, new amo[] { b, N });
    }
    return new ama(this, new amo[] { a, N });
  }
  
  public arn g(alz ☃)
  {
    return ((aih.a)☃.b(N)).c();
  }
  
  public int a(alz ☃)
  {
    return ((aih.a)☃.b(N)).a();
  }
  
  public static enum a
    implements nw
  {
    private static final a[] b;
    private final int c;
    private final String d;
    private final arn e;
    
    static
    {
      b = new a[values().length];
      for (a ☃ : values()) {
        b[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, arn ☃)
    {
      this.c = ☃;
      this.d = ☃;
      this.e = ☃;
    }
    
    public int a()
    {
      return this.c;
    }
    
    public arn c()
    {
      return this.e;
    }
    
    public String toString()
    {
      return this.d;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= b.length)) {
        ☃ = 0;
      }
      return b[☃];
    }
    
    public String l()
    {
      return this.d;
    }
    
    public String d()
    {
      return this.d;
    }
  }
}
