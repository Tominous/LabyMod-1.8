public final class adp
{
  private final long a;
  private final adp.a b;
  private final boolean c;
  private final boolean d;
  private final adr e;
  private boolean f;
  private boolean g;
  
  public static enum a
  {
    int f;
    String g;
    
    private a(int ☃, String ☃)
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
  
  private String h = "";
  
  public adp(long ☃, adp.a ☃, boolean ☃, boolean ☃, adr ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
  }
  
  public adp(ato ☃)
  {
    this(☃.b(), ☃.r(), ☃.s(), ☃.t(), ☃.u());
  }
  
  public adp a()
  {
    g = true;
    return this;
  }
  
  public adp b()
  {
    f = true;
    return this;
  }
  
  public adp a(String ☃)
  {
    h = ☃;
    return this;
  }
  
  public boolean c()
  {
    return g;
  }
  
  public long d()
  {
    return a;
  }
  
  public adp.a e()
  {
    return b;
  }
  
  public boolean f()
  {
    return d;
  }
  
  public boolean g()
  {
    return c;
  }
  
  public adr h()
  {
    return e;
  }
  
  public boolean i()
  {
    return f;
  }
  
  public static adp.a a(int ☃)
  {
    return adp.a.a(☃);
  }
  
  public String j()
  {
    return h;
  }
}
