public enum aiw$a
  implements nw
{
  private static final a[] f;
  private final int g;
  private final String h;
  private final String i;
  
  static
  {
    f = new a[values().length];
    for (a ☃ : values()) {
      f[☃.a()] = ☃;
    }
  }
  
  private aiw$a(int ☃, String ☃, String ☃)
  {
    this.g = ☃;
    this.h = ☃;
    this.i = ☃;
  }
  
  public int a()
  {
    return this.g;
  }
  
  public String toString()
  {
    return this.i;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= f.length)) {
      ☃ = 0;
    }
    return f[☃];
  }
  
  public String l()
  {
    return this.h;
  }
}
