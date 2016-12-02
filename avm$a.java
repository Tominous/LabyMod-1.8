import com.google.common.collect.Maps;
import java.util.Map;

public enum avm$a
{
  private static final Map<String, a> c;
  private final String d;
  
  private avm$a(String ☃)
  {
    d = ☃;
  }
  
  public static a a(String ☃)
  {
    return (a)c.get(☃.toLowerCase());
  }
  
  static
  {
    c = Maps.newHashMap();
    for (a ☃ : values()) {
      c.put(d, ☃);
    }
  }
}
