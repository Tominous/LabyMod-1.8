public enum ajy$a
  implements nw
{
  private static final a[] h;
  private final int i;
  private final String j;
  private final String k;
  private final arn l;
  
  static
  {
    h = new a[values().length];
    for (a ☃ : values()) {
      h[☃.a()] = ☃;
    }
  }
  
  private ajy$a(int ☃, arn ☃, String ☃)
  {
    this(☃, ☃, ☃, ☃);
  }
  
  private ajy$a(int ☃, arn ☃, String ☃, String ☃)
  {
    i = ☃;
    j = ☃;
    k = ☃;
    l = ☃;
  }
  
  public int a()
  {
    return i;
  }
  
  public arn c()
  {
    return l;
  }
  
  public String toString()
  {
    return j;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= h.length)) {
      ☃ = 0;
    }
    return h[☃];
  }
  
  public String l()
  {
    return j;
  }
  
  public String d()
  {
    return k;
  }
}
