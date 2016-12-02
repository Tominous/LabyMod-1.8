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
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public String toString()
  {
    return this.e;
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
    return this.e;
  }
  
  public String c()
  {
    return this.f;
  }
}
