public class te
{
  private final cj a;
  private final cj b;
  private final cq c;
  private int d;
  private boolean e;
  private int f;
  
  public te(cj ☃, int ☃, int ☃, int ☃)
  {
    this(☃, a(☃, ☃), ☃);
  }
  
  private static cq a(int ☃, int ☃)
  {
    if (☃ < 0) {
      return cq.e;
    }
    if (☃ > 0) {
      return cq.f;
    }
    if (☃ < 0) {
      return cq.c;
    }
    return cq.d;
  }
  
  public te(cj ☃, cq ☃, int ☃)
  {
    a = ☃;
    c = ☃;
    b = ☃.a(☃, 2);
    d = ☃;
  }
  
  public int b(int ☃, int ☃, int ☃)
  {
    return (int)a.c(☃, ☃, ☃);
  }
  
  public int a(cj ☃)
  {
    return (int)☃.i(d());
  }
  
  public int b(cj ☃)
  {
    return (int)b.i(☃);
  }
  
  public boolean c(cj ☃)
  {
    int ☃ = ☃.n() - a.n();
    int ☃ = ☃.p() - a.o();
    return ☃ * c.g() + ☃ * c.i() >= 0;
  }
  
  public void a()
  {
    f = 0;
  }
  
  public void b()
  {
    f += 1;
  }
  
  public int c()
  {
    return f;
  }
  
  public cj d()
  {
    return a;
  }
  
  public cj e()
  {
    return b;
  }
  
  public int f()
  {
    return c.g() * 2;
  }
  
  public int g()
  {
    return c.i() * 2;
  }
  
  public int h()
  {
    return d;
  }
  
  public void a(int ☃)
  {
    d = ☃;
  }
  
  public boolean i()
  {
    return e;
  }
  
  public void a(boolean ☃)
  {
    e = ☃;
  }
}
