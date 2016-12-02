import java.util.Random;

class bj$a
{
  double a;
  double b;
  
  bj$a() {}
  
  bj$a(double ☃, double ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  double a(a ☃)
  {
    double ☃ = a - a;
    double ☃ = b - b;
    
    return Math.sqrt(☃ * ☃ + ☃ * ☃);
  }
  
  void a()
  {
    double ☃ = b();
    a /= ☃;
    b /= ☃;
  }
  
  float b()
  {
    return ns.a(a * a + b * b);
  }
  
  public void b(a ☃)
  {
    a -= a;
    b -= b;
  }
  
  public boolean a(double ☃, double ☃, double ☃, double ☃)
  {
    boolean ☃ = false;
    if (a < ☃)
    {
      a = ☃;
      ☃ = true;
    }
    else if (a > ☃)
    {
      a = ☃;
      ☃ = true;
    }
    if (b < ☃)
    {
      b = ☃;
      ☃ = true;
    }
    else if (b > ☃)
    {
      b = ☃;
      ☃ = true;
    }
    return ☃;
  }
  
  public int a(adm ☃)
  {
    cj ☃ = new cj(a, 256.0D, b);
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
    cj ☃ = new cj(a, 256.0D, b);
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
    a = ns.a(☃, ☃, ☃);
    b = ns.a(☃, ☃, ☃);
  }
}
