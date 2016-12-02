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
    this.i = ☃;
    this.j = ☃;
    this.k = ☃;
    this.l = ☃;
  }
  
  public int a()
  {
    return this.i;
  }
  
  public arn c()
  {
    return this.l;
  }
  
  public String toString()
  {
    return this.j;
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
    return this.j;
  }
  
  public String d()
  {
    return this.k;
  }
}
