import java.util.List;
import java.util.Random;

public abstract class akb
  extends ahh
{
  public static final amk b = amk.a("seamless");
  public static final amm<akb.a> N = amm.a("variant", akb.a.class);
  
  public akb()
  {
    super(arm.e);
    alz ☃ = this.M.b();
    if (l()) {
      ☃ = ☃.a(b, Boolean.valueOf(false));
    } else {
      ☃ = ☃.a(a, ahh.a.b);
    }
    j(☃.a(N, akb.a.a));
    a(yz.b);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.U);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(afi.U);
  }
  
  public String b(int ☃)
  {
    return super.a() + "." + akb.a.a(☃).d();
  }
  
  public amo<?> n()
  {
    return N;
  }
  
  public Object a(zx ☃)
  {
    return akb.a.a(☃.i() & 0x7);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    if (☃ == zw.a(afi.T)) {
      return;
    }
    for (akb.a ☃ : akb.a.values()) {
      if (☃ != akb.a.c) {
        ☃.add(new zx(☃, 1, ☃.a()));
      }
    }
  }
  
  public alz a(int ☃)
  {
    alz ☃ = Q().a(N, akb.a.a(☃ & 0x7));
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
    
    ☃ |= ((akb.a)☃.b(N)).a();
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
  
  public int a(alz ☃)
  {
    return ((akb.a)☃.b(N)).a();
  }
  
  public arn g(alz ☃)
  {
    return ((akb.a)☃.b(N)).c();
  }
  
  public static enum a
    implements nw
  {
    private static final a[] i;
    private final int j;
    private final arn k;
    private final String l;
    private final String m;
    
    static
    {
      i = new a[values().length];
      for (a ☃ : values()) {
        i[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, arn ☃, String ☃)
    {
      this(☃, ☃, ☃, ☃);
    }
    
    private a(int ☃, arn ☃, String ☃, String ☃)
    {
      this.j = ☃;
      this.k = ☃;
      this.l = ☃;
      this.m = ☃;
    }
    
    public int a()
    {
      return this.j;
    }
    
    public arn c()
    {
      return this.k;
    }
    
    public String toString()
    {
      return this.l;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= i.length)) {
        ☃ = 0;
      }
      return i[☃];
    }
    
    public String l()
    {
      return this.l;
    }
    
    public String d()
    {
      return this.m;
    }
  }
}
