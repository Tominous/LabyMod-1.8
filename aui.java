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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public aui(df ☃)
  {
    this(☃.n(), ☃.o(), ☃.p());
  }
  
  public aui a(aui ☃)
  {
    return new aui(☃.a - this.a, ☃.b - this.b, ☃.c - this.c);
  }
  
  public aui a()
  {
    double ☃ = ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
    if (☃ < 1.0E-4D) {
      return new aui(0.0D, 0.0D, 0.0D);
    }
    return new aui(this.a / ☃, this.b / ☃, this.c / ☃);
  }
  
  public double b(aui ☃)
  {
    return this.a * ☃.a + this.b * ☃.b + this.c * ☃.c;
  }
  
  public aui c(aui ☃)
  {
    return new aui(this.b * ☃.c - this.c * ☃.b, this.c * ☃.a - this.a * ☃.c, this.a * ☃.b - this.b * ☃.a);
  }
  
  public aui d(aui ☃)
  {
    return a(☃.a, ☃.b, ☃.c);
  }
  
  public aui a(double ☃, double ☃, double ☃)
  {
    return b(-☃, -☃, -☃);
  }
  
  public aui e(aui ☃)
  {
    return b(☃.a, ☃.b, ☃.c);
  }
  
  public aui b(double ☃, double ☃, double ☃)
  {
    return new aui(this.a + ☃, this.b + ☃, this.c + ☃);
  }
  
  public double f(aui ☃)
  {
    double ☃ = ☃.a - this.a;
    double ☃ = ☃.b - this.b;
    double ☃ = ☃.c - this.c;
    return ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public double g(aui ☃)
  {
    double ☃ = ☃.a - this.a;
    double ☃ = ☃.b - this.b;
    double ☃ = ☃.c - this.c;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double b()
  {
    return ns.a(this.a * this.a + this.b * this.b + this.c * this.c);
  }
  
  public aui a(aui ☃, double ☃)
  {
    double ☃ = ☃.a - this.a;
    double ☃ = ☃.b - this.b;
    double ☃ = ☃.c - this.c;
    if (☃ * ☃ < 1.0000000116860974E-7D) {
      return null;
    }
    double ☃ = (☃ - this.a) / ☃;
    if ((☃ < 0.0D) || (☃ > 1.0D)) {
      return null;
    }
    return new aui(this.a + ☃ * ☃, this.b + ☃ * ☃, this.c + ☃ * ☃);
  }
  
  public aui b(aui ☃, double ☃)
  {
    double ☃ = ☃.a - this.a;
    double ☃ = ☃.b - this.b;
    double ☃ = ☃.c - this.c;
    if (☃ * ☃ < 1.0000000116860974E-7D) {
      return null;
    }
    double ☃ = (☃ - this.b) / ☃;
    if ((☃ < 0.0D) || (☃ > 1.0D)) {
      return null;
    }
    return new aui(this.a + ☃ * ☃, this.b + ☃ * ☃, this.c + ☃ * ☃);
  }
  
  public aui c(aui ☃, double ☃)
  {
    double ☃ = ☃.a - this.a;
    double ☃ = ☃.b - this.b;
    double ☃ = ☃.c - this.c;
    if (☃ * ☃ < 1.0000000116860974E-7D) {
      return null;
    }
    double ☃ = (☃ - this.c) / ☃;
    if ((☃ < 0.0D) || (☃ > 1.0D)) {
      return null;
    }
    return new aui(this.a + ☃ * ☃, this.b + ☃ * ☃, this.c + ☃ * ☃);
  }
  
  public String toString()
  {
    return "(" + this.a + ", " + this.b + ", " + this.c + ")";
  }
  
  public aui a(float ☃)
  {
    float ☃ = ns.b(☃);
    float ☃ = ns.a(☃);
    
    double ☃ = this.a;
    double ☃ = this.b * ☃ + this.c * ☃;
    double ☃ = this.c * ☃ - this.b * ☃;
    
    return new aui(☃, ☃, ☃);
  }
  
  public aui b(float ☃)
  {
    float ☃ = ns.b(☃);
    float ☃ = ns.a(☃);
    
    double ☃ = this.a * ☃ + this.c * ☃;
    double ☃ = this.b;
    double ☃ = this.c * ☃ - this.a * ☃;
    
    return new aui(☃, ☃, ☃);
  }
}
