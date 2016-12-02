public enum aih$a
  implements nw
{
  private static final a[] b;
  private final int c;
  private final String d;
  private final arn e;
  
  static
  {
    b = new a[values().length];
    for (a ☃ : values()) {
      b[☃.a()] = ☃;
    }
  }
  
  private aih$a(int ☃, String ☃, arn ☃)
  {
    c = ☃;
    d = ☃;
    e = ☃;
  }
  
  public int a()
  {
    return c;
  }
  
  public arn c()
  {
    return e;
  }
  
  public String toString()
  {
    return d;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= b.length)) {
      ☃ = 0;
    }
    return b[☃];
  }
  
  public String l()
  {
    return d;
  }
  
  public String d()
  {
    return d;
  }
}
