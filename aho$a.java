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
    o = ☃;
    p = ☃;
  }
  
  public int a()
  {
    return o;
  }
  
  public String toString()
  {
    return p;
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
    return p;
  }
}
