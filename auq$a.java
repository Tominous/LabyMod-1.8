import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public enum auq$a
{
  private static Map<String, a> g;
  public final String e;
  public final int f;
  
  static
  {
    g = Maps.newHashMap();
    for (a ☃ : values()) {
      g.put(e, ☃);
    }
  }
  
  public static String[] a()
  {
    return (String[])g.keySet().toArray(new String[g.size()]);
  }
  
  public static a a(String ☃)
  {
    return (a)g.get(☃);
  }
  
  private auq$a(String ☃, int ☃)
  {
    e = ☃;
    f = ☃;
  }
}
