public class f
{
  public static boolean a(char ☃)
  {
    return (☃ != '§') && (☃ >= ' ') && (☃ != '');
  }
  
  public static final char[] a = { '/', '\n', '\r', '\t', '\000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':' };
  
  public static String a(String ☃)
  {
    StringBuilder ☃ = new StringBuilder();
    for (char ☃ : ☃.toCharArray()) {
      if (a(☃)) {
        ☃.append(☃);
      }
    }
    return ☃.toString();
  }
}
