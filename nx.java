import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class nx
{
  private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
  
  public static String a(int ☃)
  {
    int ☃ = ☃ / 20;
    int ☃ = ☃ / 60;
    ☃ %= 60;
    if (☃ < 10) {
      return ☃ + ":0" + ☃;
    }
    return ☃ + ":" + ☃;
  }
  
  public static String a(String ☃)
  {
    return a.matcher(☃).replaceAll("");
  }
  
  public static boolean b(String ☃)
  {
    return StringUtils.isEmpty(☃);
  }
}
