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
    this.h = ☃;
    this.i = ☃;
    this.j = ☃;
    this.k = ☃;
  }
  
  public int a()
  {
    return this.h;
  }
  
  public arn c()
  {
    return this.k;
  }
  
  public String toString()
  {
    return this.i;
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
    return this.i;
  }
  
  public String d()
  {
    return this.j;
  }
}
