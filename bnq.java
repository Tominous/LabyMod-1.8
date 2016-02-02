import com.minimap.XaeroMinimap;
import java.util.Map;

public class bnq
{
  private static bnt a;
  
  static void a(bnt i18nLocaleIn)
  {
    a = i18nLocaleIn;
  }
  
  public static String a(String translateKey, Object... parameters)
  {
    String locale = ave.A().S().c().a();
    if (XaeroMinimap.languages.containsKey(locale))
    {
      Map<String, String> msgs = (Map)XaeroMinimap.languages.get(locale);
      if (msgs.containsKey(translateKey)) {
        return (String)msgs.get(translateKey);
      }
      if (((Map)XaeroMinimap.languages.get("en_US")).containsKey(translateKey)) {
        return (String)((Map)XaeroMinimap.languages.get("en_US")).get(translateKey);
      }
    }
    return a.a(translateKey, parameters);
  }
}
