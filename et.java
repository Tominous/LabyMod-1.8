import com.google.common.collect.Maps;
import java.util.Map;

public class et
{
  private final et.a a;
  private final String b;
  
  public et(et.a ☃, String ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public et.a a()
  {
    return a;
  }
  
  public String b()
  {
    return b;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ == null) || (getClass() != ☃.getClass())) {
      return false;
    }
    et ☃ = (et)☃;
    if (a != a) {
      return false;
    }
    if (b != null ? !b.equals(b) : b != null) {
      return false;
    }
    return true;
  }
  
  public String toString()
  {
    return "ClickEvent{action=" + a + ", value='" + b + '\'' + '}';
  }
  
  public int hashCode()
  {
    int ☃ = a.hashCode();
    ☃ = 31 * ☃ + (b != null ? b.hashCode() : 0);
    return ☃;
  }
  
  public static enum a
  {
    private static final Map<String, a> g;
    private final boolean h;
    private final String i;
    
    private a(String ☃, boolean ☃)
    {
      i = ☃;
      h = ☃;
    }
    
    public boolean a()
    {
      return h;
    }
    
    public String b()
    {
      return i;
    }
    
    static
    {
      g = Maps.newHashMap();
      for (a ☃ : values()) {
        g.put(☃.b(), ☃);
      }
    }
    
    public static a a(String ☃)
    {
      return (a)g.get(☃);
    }
  }
}
