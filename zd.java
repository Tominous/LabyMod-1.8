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
    s = ☃;
    t = ☃;
    u = ☃;
    v = ☃;
    w = ☃;
    x = ☃;
  }
  
  public int a()
  {
    return s;
  }
  
  public int b()
  {
    return t;
  }
  
  public String d()
  {
    return v;
  }
  
  public arn e()
  {
    return w;
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
    return v;
  }
  
  public String l()
  {
    return u;
  }
}
