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
    this.a = ☃;
    this.c = ☃;
    this.b = ☃.a(☃, 2);
    this.d = ☃;
  }
  
  public int b(int ☃, int ☃, int ☃)
  {
    return (int)this.a.c(☃, ☃, ☃);
  }
  
  public int a(cj ☃)
  {
    return (int)☃.i(d());
  }
  
  public int b(cj ☃)
  {
    return (int)this.b.i(☃);
  }
  
  public boolean c(cj ☃)
  {
    int ☃ = ☃.n() - this.a.n();
    int ☃ = ☃.p() - this.a.o();
    return ☃ * this.c.g() + ☃ * this.c.i() >= 0;
  }
  
  public void a()
  {
    this.f = 0;
  }
  
  public void b()
  {
    this.f += 1;
  }
  
  public int c()
  {
    return this.f;
  }
  
  public cj d()
  {
    return this.a;
  }
  
  public cj e()
  {
    return this.b;
  }
  
  public int f()
  {
    return this.c.g() * 2;
  }
  
  public int g()
  {
    return this.c.i() * 2;
  }
  
  public int h()
  {
    return this.d;
  }
  
  public void a(int ☃)
  {
    this.d = ☃;
  }
  
  public boolean i()
  {
    return this.e;
  }
  
  public void a(boolean ☃)
  {
    this.e = ☃;
  }
}
