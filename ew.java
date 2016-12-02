import com.google.common.collect.Maps;
import java.util.Map;

public class ew
{
  private final ew.a a;
  private final eu b;
  
  public ew(ew.a ☃, eu ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public ew.a a()
  {
    return a;
  }
  
  public eu b()
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
    ew ☃ = (ew)☃;
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
    return "HoverEvent{action=" + a + ", value='" + b + '\'' + '}';
  }
  
  public int hashCode()
  {
    int ☃ = a.hashCode();
    ☃ = 31 * ☃ + (b != null ? b.hashCode() : 0);
    return ☃;
  }
  
  public static enum a
  {
    private static final Map<String, a> e;
    private final boolean f;
    private final String g;
    
    private a(String ☃, boolean ☃)
    {
      g = ☃;
      f = ☃;
    }
    
    public boolean a()
    {
      return f;
    }
    
    public String b()
    {
      return g;
    }
    
    static
    {
      e = Maps.newHashMap();
      for (a ☃ : values()) {
        e.put(☃.b(), ☃);
      }
    }
    
    public static a a(String ☃)
    {
      return (a)e.get(☃);
    }
  }
}
