public enum agf$a
  implements nw
{
  private static final a[] d;
  private final int e;
  private final String f;
  private final String g;
  private final arn h;
  
  static
  {
    d = new a[values().length];
    for (a ☃ : values()) {
      d[☃.a()] = ☃;
    }
  }
  
  private agf$a(int ☃, String ☃, arn ☃)
  {
    this(☃, ☃, ☃, ☃);
  }
  
  private agf$a(int ☃, String ☃, String ☃, arn ☃)
  {
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    this.h = ☃;
  }
  
  public int a()
  {
    return this.e;
  }
  
  public String c()
  {
    return this.g;
  }
  
  public arn d()
  {
    return this.h;
  }
  
  public String toString()
  {
    return this.f;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= d.length)) {
      ☃ = 0;
    }
    return d[☃];
  }
  
  public String l()
  {
    return this.f;
  }
}
