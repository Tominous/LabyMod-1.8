import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class jy
{
  protected final String a;
  protected final String b;
  
  protected jy(int ☃, String... ☃)
  {
    this.a = (StringUtils.isEmpty(☃[0]) ? "minecraft" : ☃[0].toLowerCase());
    this.b = ☃[1];
    
    Validate.notNull(this.b);
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
    return this.b;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public String toString()
  {
    return this.a + ':' + this.b;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof jy))
    {
      jy ☃ = (jy)☃;
      
      return (this.a.equals(☃.a)) && (this.b.equals(☃.b));
    }
    return false;
  }
  
  public int hashCode()
  {
    return 31 * this.a.hashCode() + this.b.hashCode();
  }
}
