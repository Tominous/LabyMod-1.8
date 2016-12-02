import com.google.common.collect.Maps;
import java.util.Map;

public enum auu$a
{
  private static final Map<String, a> c;
  private final String d;
  
  static
  {
    c = Maps.newHashMap();
    for (a ☃ : values()) {
      c.put(☃.a(), ☃);
    }
  }
  
  private auu$a(String ☃)
  {
    d = ☃;
  }
  
  public String a()
  {
    return d;
  }
  
  public static a a(String ☃)
  {
    a ☃ = (a)c.get(☃);
    return ☃ == null ? a : ☃;
  }
}
