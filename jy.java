import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class jy
{
  protected final String a;
  protected final String b;
  
  protected jy(int ☃, String... ☃)
  {
    a = (StringUtils.isEmpty(☃[0]) ? "minecraft" : ☃[0].toLowerCase());
    b = ☃[1];
    
    Validate.notNull(b);
  }
  
  public jy(String ☃)
  {
    this(0, a(☃));
  }
  
  public jy(String ☃, String ☃)
  {
    this(0, new String[] { ☃, ☃ });
  }
  
  protected static String[] a(String ☃)
  {
    String[] ☃ = { null, ☃ };
    int ☃ = ☃.indexOf(':');
    if (☃ >= 0)
    {
      ☃[1] = ☃.substring(☃ + 1, ☃.length());
      if (☃ > 1) {
        ☃[0] = ☃.substring(0, ☃);
      }
    }
    return ☃;
  }
  
  public String a()
  {
    return b;
  }
  
  public String b()
  {
    return a;
  }
  
  public String toString()
  {
    return a + ':' + b;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof jy))
    {
      jy ☃ = (jy)☃;
      
      return (a.equals(a)) && (b.equals(b));
    }
    return false;
  }
  
  public int hashCode()
  {
    return 31 * a.hashCode() + b.hashCode();
  }
}
