import org.apache.commons.lang3.StringUtils;

public class bov
  extends jy
{
  private final String c;
  
  protected bov(int ☃, String... ☃)
  {
    super(0, new String[] { ☃[0], ☃[1] });
    
    c = (StringUtils.isEmpty(☃[2]) ? "normal" : ☃[2].toLowerCase());
  }
  
  public bov(String ☃)
  {
    this(0, b(☃));
  }
  
  public bov(jy ☃, String ☃)
  {
    this(☃.toString(), ☃);
  }
  
  public bov(String ☃, String ☃)
  {
    this(0, b(☃ + '#' + (☃ == null ? "normal" : ☃)));
  }
  
  protected static String[] b(String ☃)
  {
    String[] ☃ = { null, ☃, null };
    
    int ☃ = ☃.indexOf('#');
    String ☃ = ☃;
    if (☃ >= 0)
    {
      ☃[2] = ☃.substring(☃ + 1, ☃.length());
      if (☃ > 1) {
        ☃ = ☃.substring(0, ☃);
      }
    }
    System.arraycopy(jy.a(☃), 0, ☃, 0, 2);
    
    return ☃;
  }
  
  public String c()
  {
    return c;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (((☃ instanceof bov)) && 
      (super.equals(☃)))
    {
      bov ☃ = (bov)☃;
      
      return c.equals(c);
    }
    return false;
  }
  
  public int hashCode()
  {
    return 31 * super.hashCode() + c.hashCode();
  }
  
  public String toString()
  {
    return super.toString() + '#' + c;
  }
}
