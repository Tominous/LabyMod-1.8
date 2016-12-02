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
    e = ☃;
    f = ☃;
    g = ☃;
    h = ☃;
  }
  
  public int a()
  {
    return e;
  }
  
  public String c()
  {
    return g;
  }
  
  public arn d()
  {
    return h;
  }
  
  public String toString()
  {
    return f;
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
    return f;
  }
}
