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
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public arn c()
  {
    return this.e;
  }
  
  public String toString()
  {
    return this.d;
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
    return this.d;
  }
  
  public String d()
  {
    return this.d;
  }
}
