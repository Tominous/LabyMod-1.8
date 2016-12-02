import java.util.List;

public class akl
  extends afh
{
  public static final amk a = amk.a("up");
  public static final amk b = amk.a("north");
  public static final amk N = amk.a("east");
  public static final amk O = amk.a("south");
  public static final amk P = amk.a("west");
  public static final amm<akl.a> Q = amm.a("variant", akl.a.class);
  
  public akl(afh ☃)
  {
    super(J);
    j(M.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)).a(Q, akl.a.a));
    c(w);
    b(x / 3.0F);
    a(H);
    a(yz.b);
  }
  
  public String f()
  {
    return di.a(a() + "." + akl.a.a.c() + ".name");
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean b(adq ☃, cj ☃)
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public void a(adq ☃, cj ☃)
  {
    boolean ☃ = e(☃, ☃.c());
    boolean ☃ = e(☃, ☃.d());
    boolean ☃ = e(☃, ☃.e());
    boolean ☃ = e(☃, ☃.f());
    
    float ☃ = 0.25F;
    float ☃ = 0.75F;
    float ☃ = 0.25F;
    float ☃ = 0.75F;
    float ☃ = 1.0F;
    if (☃) {
      ☃ = 0.0F;
    }
    if (☃) {
      ☃ = 1.0F;
    }
    if (☃) {
      ☃ = 0.0F;
    }
    if (☃) {
      ☃ = 1.0F;
    }
    if ((☃) && (☃) && (!☃) && (!☃))
    {
      ☃ = 0.8125F;
      ☃ = 0.3125F;
      ☃ = 0.6875F;
    }
    else if ((!☃) && (!☃) && (☃) && (☃))
    {
      ☃ = 0.8125F;
      ☃ = 0.3125F;
      ☃ = 0.6875F;
    }
    a(☃, 0.0F, ☃, ☃, ☃, ☃);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃);
    F = 1.5D;
    return super.a(☃, ☃, ☃);
  }
  
  public boolean e(adq ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃).c();
    if (☃ == afi.cv) {
      return false;
    }
    if ((☃ == this) || ((☃ instanceof agu))) {
      return true;
    }
    if ((J.k()) && (☃.d())) {
      return J != arm.C;
    }
    return false;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (akl.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public int a(alz ☃)
  {
    return ((akl.a)☃.b(Q)).a();
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    if (☃ == cq.a) {
      return super.a(☃, ☃, ☃);
    }
    return true;
  }
  
  public alz a(int ☃)
  {
    return Q().a(Q, akl.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((akl.a)☃.b(Q)).a();
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃.a(a, Boolean.valueOf(!☃.d(☃.a()))).a(b, Boolean.valueOf(e(☃, ☃.c()))).a(N, Boolean.valueOf(e(☃, ☃.f()))).a(O, Boolean.valueOf(e(☃, ☃.d()))).a(P, Boolean.valueOf(e(☃, ☃.e())));
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, N, P, O, Q });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] c;
    private final int d;
    private final String e;
    private String f;
    
    static
    {
      c = new a[values().length];
      for (a ☃ : values()) {
        c[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, String ☃)
    {
      d = ☃;
      e = ☃;
      f = ☃;
    }
    
    public int a()
    {
      return d;
    }
    
    public String toString()
    {
      return e;
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
      return e;
    }
    
    public String c()
    {
      return f;
    }
  }
}
