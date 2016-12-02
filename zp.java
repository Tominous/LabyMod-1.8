import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class zp
  extends zs
{
  private final boolean b;
  
  public zp(boolean ☃)
  {
    super(0, 0.0F, false);
    
    this.b = ☃;
  }
  
  public int h(zx ☃)
  {
    zp.a ☃ = zp.a.a(☃);
    if ((this.b) && (☃.g())) {
      return ☃.e();
    }
    return ☃.c();
  }
  
  public float i(zx ☃)
  {
    zp.a ☃ = zp.a.a(☃);
    if ((this.b) && (☃.g())) {
      return ☃.f();
    }
    return ☃.d();
  }
  
  public String j(zx ☃)
  {
    if (zp.a.a(☃) == zp.a.d) {
      return abe.m;
    }
    return null;
  }
  
  protected void c(zx ☃, adm ☃, wn ☃)
  {
    zp.a ☃ = zp.a.a(☃);
    if (☃ == zp.a.d)
    {
      ☃.c(new pf(pe.u.H, 1200, 3));
      ☃.c(new pf(pe.s.H, 300, 2));
      ☃.c(new pf(pe.k.H, 300, 1));
    }
    super.c(☃, ☃, ☃);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (zp.a ☃ : ) {
      if ((!this.b) || (☃.g())) {
        ☃.add(new zx(this, 1, ☃.a()));
      }
    }
  }
  
  public String e_(zx ☃)
  {
    zp.a ☃ = zp.a.a(☃);
    return a() + "." + ☃.b() + "." + ((this.b) && (☃.g()) ? "cooked" : "raw");
  }
  
  public static enum a
  {
    private static final Map<Integer, a> e;
    private final int f;
    private final String g;
    private final int h;
    private final float i;
    private final int j;
    private final float k;
    private boolean l = false;
    
    static
    {
      e = Maps.newHashMap();
      for (a ☃ : values()) {
        e.put(Integer.valueOf(☃.a()), ☃);
      }
    }
    
    private a(int ☃, String ☃, int ☃, float ☃, int ☃, float ☃)
    {
      this.f = ☃;
      this.g = ☃;
      this.h = ☃;
      this.i = ☃;
      this.j = ☃;
      this.k = ☃;
      this.l = true;
    }
    
    private a(int ☃, String ☃, int ☃, float ☃)
    {
      this.f = ☃;
      this.g = ☃;
      this.h = ☃;
      this.i = ☃;
      this.j = 0;
      this.k = 0.0F;
      this.l = false;
    }
    
    public int a()
    {
      return this.f;
    }
    
    public String b()
    {
      return this.g;
    }
    
    public int c()
    {
      return this.h;
    }
    
    public float d()
    {
      return this.i;
    }
    
    public int e()
    {
      return this.j;
    }
    
    public float f()
    {
      return this.k;
    }
    
    public boolean g()
    {
      return this.l;
    }
    
    public static a a(int ☃)
    {
      a ☃ = (a)e.get(Integer.valueOf(☃));
      if (☃ == null) {
        return a;
      }
      return ☃;
    }
    
    public static a a(zx ☃)
    {
      if ((☃.b() instanceof zp)) {
        return a(☃.i());
      }
      return a;
    }
  }
}
