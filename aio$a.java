public enum aio$a
  implements nw
{
  private static final a[] g;
  private final int h;
  private final String i;
  private final String j;
  private final arn k;
  
  static
  {
    g = new a[values().length];
    for (a ☃ : values()) {
      g[☃.a()] = ☃;
    }
  }
  
  private aio$a(int ☃, String ☃, arn ☃)
  {
    this(☃, ☃, ☃, ☃);
  }
  
  private aio$a(int ☃, String ☃, String ☃, arn ☃)
  {
    h = ☃;
    i = ☃;
    j = ☃;
    k = ☃;
  }
  
  public int a()
  {
    return h;
  }
  
  public arn c()
  {
    return k;
  }
  
  public String toString()
  {
    return i;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= g.length)) {
      ☃ = 0;
    }
    return g[☃];
  }
  
  public String l()
  {
    return i;
  }
  
  public String d()
  {
    return j;
  }
}
