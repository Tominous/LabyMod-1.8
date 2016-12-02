import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;

public enum cq$a
  implements Predicate<cq>, nw
{
  private static final Map<String, a> d;
  private final String e;
  private final cq.c f;
  
  static
  {
    d = Maps.newHashMap();
    for (a ☃ : values()) {
      d.put(☃.a().toLowerCase(), ☃);
    }
  }
  
  private cq$a(String ☃, cq.c ☃)
  {
    this.e = ☃;
    this.f = ☃;
  }
  
  public static a a(String ☃)
  {
    if (☃ == null) {
      return null;
    }
    return (a)d.get(☃.toLowerCase());
  }
  
  public String a()
  {
    return this.e;
  }
  
  public boolean b()
  {
    return this.f == cq.c.b;
  }
  
  public boolean c()
  {
    return this.f == cq.c.a;
  }
  
  public String toString()
  {
    return this.e;
  }
  
  public boolean a(cq ☃)
  {
    return (☃ != null) && (☃.k() == this);
  }
  
  public cq.c d()
  {
    return this.f;
  }
  
  public String l()
  {
    return this.e;
  }
}
