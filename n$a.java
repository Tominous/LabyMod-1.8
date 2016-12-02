public enum n$a
{
  final int f;
  final String g;
  
  private n$a(int ☃, String ☃)
  {
    f = ☃;
    g = ☃;
  }
  
  public int a()
  {
    return f;
  }
  
  public String b()
  {
    return g;
  }
  
  public static String[] c()
  {
    String[] ☃ = new String[values().length];
    int ☃ = 0;
    for (a ☃ : values()) {
      ☃[(☃++)] = ☃.b();
    }
    return ☃;
  }
  
  public static a a(String ☃)
  {
    for (a ☃ : ) {
      if (☃.b().equals(☃)) {
        return ☃;
      }
    }
    return null;
  }
}
