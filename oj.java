public enum oj
{
  private static final oj[] e;
  private final int f;
  private final String g;
  
  private oj(int ☃, String ☃)
  {
    f = ☃;
    g = ☃;
  }
  
  public int a()
  {
    return f;
  }
  
  public static oj a(int ☃)
  {
    return e[(☃ % e.length)];
  }
  
  static
  {
    e = new oj[values().length];
    for (oj ☃ : values()) {
      e[f] = ☃;
    }
  }
  
  public String b()
  {
    return g;
  }
}
