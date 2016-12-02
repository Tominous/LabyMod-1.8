public enum ajz$a
  implements nw
{
  private static final a[] e;
  private final int f;
  private final String g;
  private final String h;
  
  static
  {
    e = new a[values().length];
    for (a ☃ : values()) {
      e[☃.a()] = ☃;
    }
  }
  
  private ajz$a(int ☃, String ☃, String ☃)
  {
    f = ☃;
    g = ☃;
    h = ☃;
  }
  
  public int a()
  {
    return f;
  }
  
  public String toString()
  {
    return g;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= e.length)) {
      ☃ = 0;
    }
    return e[☃];
  }
  
  public String l()
  {
    return g;
  }
  
  public String c()
  {
    return h;
  }
}
