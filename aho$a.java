public enum aho$a
  implements nw
{
  private static final a[] n;
  private final int o;
  private final String p;
  
  static
  {
    n = new a[16];
    for (a ☃ : values()) {
      n[☃.a()] = ☃;
    }
  }
  
  private aho$a(int ☃, String ☃)
  {
    this.o = ☃;
    this.p = ☃;
  }
  
  public int a()
  {
    return this.o;
  }
  
  public String toString()
  {
    return this.p;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= n.length)) {
      ☃ = 0;
    }
    a ☃ = n[☃];
    return ☃ == null ? n[0] : ☃;
  }
  
  public String l()
  {
    return this.p;
  }
}
