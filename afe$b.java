public enum afe$b
  implements nw
{
  private static final b[] k;
  private final int l;
  private final String m;
  
  static
  {
    k = new b[values().length];
    for (b ☃ : values()) {
      k[☃.a()] = ☃;
    }
  }
  
  private afe$b(int ☃, String ☃)
  {
    l = ☃;
    m = ☃;
  }
  
  public int a()
  {
    return l;
  }
  
  public String toString()
  {
    return m;
  }
  
  public boolean c()
  {
    return (this == e) || (this == c) || (this == f) || (this == d);
  }
  
  public static b a(int ☃)
  {
    if ((☃ < 0) || (☃ >= k.length)) {
      ☃ = 0;
    }
    return k[☃];
  }
  
  public String l()
  {
    return m;
  }
}
