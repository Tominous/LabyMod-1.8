public enum zd
  implements nw
{
  private static final zd[] q;
  private static final zd[] r;
  private final int s;
  private final int t;
  private final String u;
  private final String v;
  private final arn w;
  private final a x;
  
  static
  {
    q = new zd[values().length];
    r = new zd[values().length];
    for (zd ☃ : values())
    {
      q[☃.a()] = ☃;
      r[☃.b()] = ☃;
    }
  }
  
  private zd(int ☃, int ☃, String ☃, String ☃, arn ☃, a ☃)
  {
    this.s = ☃;
    this.t = ☃;
    this.u = ☃;
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
  }
  
  public int a()
  {
    return this.s;
  }
  
  public int b()
  {
    return this.t;
  }
  
  public String d()
  {
    return this.v;
  }
  
  public arn e()
  {
    return this.w;
  }
  
  public static zd a(int ☃)
  {
    if ((☃ < 0) || (☃ >= r.length)) {
      ☃ = 0;
    }
    return r[☃];
  }
  
  public static zd b(int ☃)
  {
    if ((☃ < 0) || (☃ >= q.length)) {
      ☃ = 0;
    }
    return q[☃];
  }
  
  public String toString()
  {
    return this.v;
  }
  
  public String l()
  {
    return this.u;
  }
}
