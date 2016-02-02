import java.util.Random;

class bj$a
{
  double a;
  double b;
  
  bj$a() {}
  
  bj$a(double ☃, double ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  double a(a ☃)
  {
    double ☃ = this.a - ☃.a;
    double ☃ = this.b - ☃.b;
    
    return Math.sqrt(☃ * ☃ + ☃ * ☃);
  }
  
  void a()
  {
    double ☃ = b();
    this.a /= ☃;
    this.b /= ☃;
  }
  
  float b()
  {
    return ns.a(this.a * this.a + this.b * this.b);
  }
  
  public void b(a ☃)
  {
    this.a -= ☃.a;
    this.b -= ☃.b;
  }
  
  public boolean a(double ☃, double ☃, double ☃, double ☃)
  {
    boolean ☃ = false;
    if (this.a < ☃)
    {
      this.a = ☃;
      ☃ = true;
    }
    else if (this.a > ☃)
    {
      this.a = ☃;
      ☃ = true;
    }
    if (this.b < ☃)
    {
      this.b = ☃;
      ☃ = true;
    }
    else if (this.b > ☃)
    {
      this.b = ☃;
      ☃ = true;
    }
    return ☃;
  }
  
  public int a(adm ☃)
  {
    cj ☃ = new cj(this.a, 256.0D, this.b);
    while (☃.o() > 0)
    {
      ☃ = ☃.b();
      if (☃.p(☃).c().t() != arm.a) {
        return ☃.o() + 1;
      }
    }
    return 257;
  }
  
  public boolean b(adm ☃)
  {
    cj ☃ = new cj(this.a, 256.0D, this.b);
    while (☃.o() > 0)
    {
      ☃ = ☃.b();
      
      arm ☃ = ☃.p(☃).c().t();
      if (☃ != arm.a) {
        return (!☃.d()) && (☃ != arm.o);
      }
    }
    return false;
  }
  
  public void a(Random ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this.a = ns.a(☃, ☃, ☃);
    this.b = ns.a(☃, ☃, ☃);
  }
}
