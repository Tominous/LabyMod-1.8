import com.google.common.collect.Maps;
import java.util.Map;

public enum zp$a
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
  
  private zp$a(int ☃, String ☃, int ☃, float ☃, int ☃, float ☃)
  {
    f = ☃;
    g = ☃;
    h = ☃;
    i = ☃;
    j = ☃;
    k = ☃;
    l = true;
  }
  
  private zp$a(int ☃, String ☃, int ☃, float ☃)
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
