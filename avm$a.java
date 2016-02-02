import com.google.common.collect.Maps;
import java.util.Map;

public enum avm$a
{
  private static final Map<String, a> c;
  private final String d;
  
  private avm$a(String sessionTypeIn)
  {
    this.d = sessionTypeIn;
  }
  
  public static a a(String sessionTypeIn)
  {
    return (a)c.get(sessionTypeIn.toLowerCase());
  }
  
  static
  {
    c = Maps.newHashMap();
    for (a session$type : values()) {
      c.put(session$type.d, session$type);
    }
  }
}
