public enum aiu$a
  implements nw
{
  private static final a[] d;
  private final int e;
  private final String f;
  private final String g;
  
  static
  {
    d = new a[values().length];
    for (a ☃ : values()) {
      d[☃.a()] = ☃;
    }
  }
  
  private aiu$a(int ☃, String ☃, String ☃)
  {
    e = ☃;
    f = ☃;
    g = ☃;
  }
  
  public int a()
  {
    return e;
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
  
  public String c()
  {
    return g;
  }
}
