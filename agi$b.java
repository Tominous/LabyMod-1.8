public enum agi$b
  implements nw
{
  private static final b[] g;
  private final int h;
  private final String i;
  private final String j;
  
  static
  {
    g = new b[values().length];
    for (b ☃ : values()) {
      g[☃.a()] = ☃;
    }
  }
  
  private agi$b(int ☃, String ☃)
  {
    this(☃, ☃, ☃);
  }
  
  private agi$b(int ☃, String ☃, String ☃)
  {
    h = ☃;
    i = ☃;
    j = ☃;
  }
  
  public int a()
  {
    return h;
  }
  
  public String toString()
  {
    return i;
  }
  
  public static b a(int ☃)
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
  
  public String c()
  {
    return j;
  }
}
