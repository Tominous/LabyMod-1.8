public enum adp$a
{
  int f;
  String g;
  
  private adp$a(int ☃, String ☃)
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
  
  public void a(wl ☃)
  {
    if (this == c)
    {
      c = true;
      d = true;
      a = true;
    }
    else if (this == e)
    {
      c = true;
      d = false;
      a = true;
      b = true;
    }
    else
    {
      c = false;
      d = false;
      a = false;
      b = false;
    }
    e = (!c());
  }
  
  public boolean c()
  {
    return (this == d) || (this == e);
  }
  
  public boolean d()
  {
    return this == c;
  }
  
  public boolean e()
  {
    return (this == b) || (this == d);
  }
  
  public static a a(int ☃)
  {
    for (a ☃ : ) {
      if (f == ☃) {
        return ☃;
      }
    }
    return b;
  }
  
  public static a a(String ☃)
  {
    for (a ☃ : ) {
      if (g.equals(☃)) {
        return ☃;
      }
    }
    return b;
  }
}
