public enum ahz$a
  implements nw
{
  private static final a[] g;
  private final int h;
  private final String i;
  private final String j;
  
  static
  {
    g = new a[values().length];
    for (a ☃ : values()) {
      g[☃.a()] = ☃;
    }
  }
  
  private ahz$a(int ☃, String ☃)
  {
    this(☃, ☃, ☃);
  }
  
  private ahz$a(int ☃, String ☃, String ☃)
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
  
  public static a a(int ☃)
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
  
  public static a a(alz ☃)
  {
    for (a ☃ : ) {
      if (☃ == ☃.d()) {
        return ☃;
      }
    }
    return a;
  }
  
  public abstract alz d();
}
