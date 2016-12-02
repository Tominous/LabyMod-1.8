public enum aku$a
{
  private String N;
  private String O;
  private String[] P = new String[3];
  private zx Q;
  
  private aku$a(String ☃, String ☃)
  {
    N = ☃;
    O = ☃;
  }
  
  private aku$a(String ☃, String ☃, zx ☃)
  {
    this(☃, ☃);
    Q = ☃;
  }
  
  private aku$a(String ☃, String ☃, String ☃, String ☃, String ☃)
  {
    this(☃, ☃);
    P[0] = ☃;
    P[1] = ☃;
    P[2] = ☃;
  }
  
  public String a()
  {
    return N;
  }
  
  public String b()
  {
    return O;
  }
  
  public String[] c()
  {
    return P;
  }
  
  public boolean d()
  {
    return (Q != null) || (P[0] != null);
  }
  
  public boolean e()
  {
    return Q != null;
  }
  
  public zx f()
  {
    return Q;
  }
  
  public static a a(String ☃)
  {
    for (a ☃ : ) {
      if (O.equals(☃)) {
        return ☃;
      }
    }
    return null;
  }
}
