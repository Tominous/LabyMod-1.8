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
    this.h = ☃;
    this.i = ☃;
    this.j = ☃;
  }
  
  public int a()
  {
    return this.h;
  }
  
  public String toString()
  {
    return this.i;
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
    return this.i;
  }
  
  public String c()
  {
    return this.j;
  }
}
