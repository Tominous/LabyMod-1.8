public enum akl$a
  implements nw
{
  private static final a[] c;
  private final int d;
  private final String e;
  private String f;
  
  static
  {
    c = new a[values().length];
    for (a ☃ : values()) {
      c[☃.a()] = ☃;
    }
  }
  
  private akl$a(int ☃, String ☃, String ☃)
  {
    d = ☃;
    e = ☃;
    f = ☃;
  }
  
  public int a()
  {
    return d;
  }
  
  public String toString()
  {
    return e;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.length)) {
      ☃ = 0;
    }
    return c[☃];
  }
  
  public String l()
  {
    return e;
  }
  
  public String c()
  {
    return f;
  }
}
