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
    
    b = ☃;
  }
  
  public int h(zx ☃)
  {
    zp.a ☃ = zp.a.a(☃);
    if ((b) && (☃.g())) {
      return ☃.e();
    }
    return ☃.c();
  }
  
  public float i(zx ☃)
  {
    zp.a ☃ = zp.a.a(☃);
    if ((b) && (☃.g())) {
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
      ☃.c(new pf(uH, 1200, 3));
      ☃.c(new pf(sH, 300, 2));
      ☃.c(new pf(kH, 300, 1));
    }
    super.c(☃, ☃, ☃);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (zp.a ☃ : ) {
      if ((!b) || (☃.g())) {
        ☃.add(new zx(this, 1, ☃.a()));
      }
    }
  }
  
  public String e_(zx ☃)
  {
    zp.a ☃ = zp.a.a(☃);
    return a() + "." + ☃.b() + "." + ((b) && (☃.g()) ? "cooked" : "raw");
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
      f = ☃;
      g = ☃;
      h = ☃;
      i = ☃;
      j = ☃;
      k = ☃;
      l = true;
    }
    
    private a(int ☃, String ☃, int ☃, float ☃)
    {
      f = ☃;
      g = ☃;
      h = ☃;
      i = ☃;
      j = 0;
      k = 0.0F;
      l = false;
    }
    
    public int a()
    {
      return f;
    }
    
    public String b()
    {
      return g;
    }
    
    public int c()
    {
      return h;
    }
    
    public float d()
    {
      return i;
    }
    
    public int e()
    {
      return j;
    }
    
    public float f()
    {
      return k;
    }
    
    public boolean g()
    {
      return l;
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
