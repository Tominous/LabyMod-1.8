import com.google.common.collect.Maps;
import java.util.Map;

public enum et$a
{
  private static final Map<String, a> g;
  private final boolean h;
  private final String i;
  
  private et$a(String ☃, boolean ☃)
  {
    this.i = ☃;
    this.h = ☃;
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public String b()
  {
    return this.i;
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
