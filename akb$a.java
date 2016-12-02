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
    j = ☃;
    k = ☃;
    l = ☃;
    m = ☃;
  }
  
  public int a()
  {
    return j;
  }
  
  public arn c()
  {
    return k;
  }
  
  public String toString()
  {
    return l;
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
    return l;
  }
  
  public String d()
  {
    return m;
  }
}
