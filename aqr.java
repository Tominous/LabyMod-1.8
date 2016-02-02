import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aqr
{
  private static final Logger a = ;
  private static Map<String, Class<? extends aqu>> b = Maps.newHashMap();
  private static Map<Class<? extends aqu>, String> c = Maps.newHashMap();
  private static Map<String, Class<? extends aqt>> d = Maps.newHashMap();
  private static Map<Class<? extends aqt>, String> e = Maps.newHashMap();
  
  private static void b(Class<? extends aqu> ☃, String ☃)
  {
    b.put(☃, ☃);
    c.put(☃, ☃);
  }
  
  static void a(Class<? extends aqt> ☃, String ☃)
  {
    d.put(☃, ☃);
    e.put(☃, ☃);
  }
  
  static
  {
    b(aqh.class, "Mineshaft");
    b(aqv.a.class, "Village");
    b(aqi.a.class, "Fortress");
    b(aqo.a.class, "Stronghold");
    b(aqm.a.class, "Temple");
    b(aqk.a.class, "Monument");
    
    aqg.a();
    aqw.a();
    aqj.a();
    aqp.a();
    aqn.a();
    aql.a();
  }
  
  public static String a(aqu ☃)
  {
    return (String)c.get(☃.getClass());
  }
  
  public static String a(aqt ☃)
  {
    return (String)e.get(☃.getClass());
  }
  
  public static aqu a(dn ☃, adm ☃)
  {
    aqu ☃ = null;
    try
    {
      Class<? extends aqu> ☃ = (Class)b.get(☃.j("id"));
      if (☃ != null) {
        ☃ = (aqu)☃.newInstance();
      }
    }
    catch (Exception ☃)
    {
      a.warn("Failed Start with id " + ☃.j("id"));
      ☃.printStackTrace();
    }
    if (☃ != null) {
      ☃.a(☃, ☃);
    } else {
      a.warn("Skipping Structure with id " + ☃.j("id"));
    }
    return ☃;
  }
  
  public static aqt b(dn ☃, adm ☃)
  {
    aqt ☃ = null;
    try
    {
      Class<? extends aqt> ☃ = (Class)d.get(☃.j("id"));
      if (☃ != null) {
        ☃ = (aqt)☃.newInstance();
      }
    }
    catch (Exception ☃)
    {
      a.warn("Failed Piece with id " + ☃.j("id"));
      ☃.printStackTrace();
    }
    if (☃ != null) {
      ☃.a(☃, ☃);
    } else {
      a.warn("Skipping Piece with id " + ☃.j("id"));
    }
    return ☃;
  }
}
