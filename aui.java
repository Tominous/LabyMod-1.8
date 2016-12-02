public class aui
{
  public final double a;
  public final double b;
  public final double c;
  
  public aui(double ☃, double ☃, double ☃)
  {
    if (☃ == -0.0D) {
      ☃ = 0.0D;
    }
    if (☃ == -0.0D) {
      ☃ = 0.0D;
    }
    if (☃ == -0.0D) {
      ☃ = 0.0D;
    }
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public aui(df ☃)
  {
    this(☃.n(), ☃.o(), ☃.p());
  }
  
  public aui a(aui ☃)
  {
    return new aui(a - a, b - b, c - c);
  }
  
  public aui a()
  {
    double ☃ = ns.a(a * a + b * b + c * c);
    if (☃ < 1.0E-4D) {
      return new aui(0.0D, 0.0D, 0.0D);
    }
    return new aui(a / ☃, b / ☃, c / ☃);
  }
  
  public double b(aui ☃)
  {
    return a * a + b * b + c * c;
  }
  
  public aui c(aui ☃)
  {
    return new aui(b * c - c * b, c * a - a * c, a * b - b * a);
  }
  
  public aui d(aui ☃)
  {
    return a(a, b, c);
  }
  
  public aui a(double ☃, double ☃, double ☃)
  {
    return b(-☃, -☃, -☃);
  }
  
  public aui e(aui ☃)
  {
    return b(a, b, c);
  }
  
  public aui b(double ☃, double ☃, double ☃)
  {
    return new aui(a + ☃, b + ☃, c + ☃);
  }
  
  public double f(aui ☃)
  {
    double ☃ = a - a;
    double ☃ = b - b;
    double ☃ = c - c;
    return ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public double g(aui ☃)
  {
    double ☃ = a - a;
    double ☃ = b - b;
    double ☃ = c - c;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double b()
  {
    return ns.a(a * a + b * b + c * c);
  }
  
  public aui a(aui ☃, double ☃)
  {
    double ☃ = a - a;
    double ☃ = b - b;
    double ☃ = c - c;
    if (☃ * ☃ < 1.0000000116860974E-7D) {
      return null;
    }
    double ☃ = (☃ - a) / ☃;
    if ((☃ < 0.0D) || (☃ > 1.0D)) {
      return null;
    }
    return new aui(a + ☃ * ☃, b + ☃ * ☃, c + ☃ * ☃);
  }
  
  public aui b(aui ☃, double ☃)
  {
    double ☃ = a - a;
    double ☃ = b - b;
    double ☃ = c - c;
    if (☃ * ☃ < 1.0000000116860974E-7D) {
      return null;
    }
    double ☃ = (☃ - b) / ☃;
    if ((☃ < 0.0D) || (☃ > 1.0D)) {
      return null;
    }
    return new aui(a + ☃ * ☃, b + ☃ * ☃, c + ☃ * ☃);
  }
  
  public aui c(aui ☃, double ☃)
  {
    double ☃ = a - a;
    double ☃ = b - b;
    double ☃ = c - c;
    if (☃ * ☃ < 1.0000000116860974E-7D) {
      return null;
    }
    double ☃ = (☃ - c) / ☃;
    if ((☃ < 0.0D) || (☃ > 1.0D)) {
      return null;
    }
    return new aui(a + ☃ * ☃, b + ☃ * ☃, c + ☃ * ☃);
  }
  
  public String toString()
  {
    return "(" + a + ", " + b + ", " + c + ")";
  }
  
  public aui a(float ☃)
  {
    float ☃ = ns.b(☃);
    float ☃ = ns.a(☃);
    
    double ☃ = a;
    double ☃ = b * ☃ + c * ☃;
    double ☃ = c * ☃ - b * ☃;
    
    return new aui(☃, ☃, ☃);
  }
  
  public aui b(float ☃)
  {
    float ☃ = ns.b(☃);
    float ☃ = ns.a(☃);
    
    double ☃ = a * ☃ + c * ☃;
    double ☃ = b;
    double ☃ = c * ☃ - a * ☃;
    
    return new aui(☃, ☃, ☃);
  }
}
