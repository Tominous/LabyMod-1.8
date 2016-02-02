public enum akb$a
  implements nw
{
  private static final a[] i;
  private final int j;
  private final arn k;
  private final String l;
  private final String m;
  
  static
  {
    i = new a[values().length];
    for (a ☃ : values()) {
      i[☃.a()] = ☃;
    }
  }
  
  private akb$a(int ☃, arn ☃, String ☃)
  {
    this(☃, ☃, ☃, ☃);
  }
  
  private akb$a(int ☃, arn ☃, String ☃, String ☃)
  {
    this.j = ☃;
    this.k = ☃;
    this.l = ☃;
    this.m = ☃;
  }
  
  public int a()
  {
    return this.j;
  }
  
  public arn c()
  {
    return this.k;
  }
  
  public String toString()
  {
    return this.l;
  }
  
  public static a a(int ☃)
  {
    if ((☃ < 0) || (☃ >= i.length)) {
      ☃ = 0;
    }
    return i[☃];
  }
  
  public String l()
  {
    return this.l;
  }
  
  public String d()
  {
    return this.m;
  }
}
