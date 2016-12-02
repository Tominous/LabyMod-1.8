public class aug
{
  public final double a;
  public final double b;
  public final double c;
  public final double d;
  public final double e;
  public final double f;
  
  public aug(double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    a = Math.min(☃, ☃);
    b = Math.min(☃, ☃);
    c = Math.min(☃, ☃);
    d = Math.max(☃, ☃);
    e = Math.max(☃, ☃);
    f = Math.max(☃, ☃);
  }
  
  public aug(cj ☃, cj ☃)
  {
    a = ☃.n();
    b = ☃.o();
    c = ☃.p();
    d = ☃.n();
    e = ☃.o();
    f = ☃.p();
  }
  
  public aug a(double ☃, double ☃, double ☃)
  {
    double ☃ = a;
    double ☃ = b;
    double ☃ = c;
    double ☃ = d;
    double ☃ = e;
    double ☃ = f;
    if (☃ < 0.0D) {
      ☃ += ☃;
    } else if (☃ > 0.0D) {
      ☃ += ☃;
    }
    if (☃ < 0.0D) {
      ☃ += ☃;
    } else if (☃ > 0.0D) {
      ☃ += ☃;
    }
    if (☃ < 0.0D) {
      ☃ += ☃;
    } else if (☃ > 0.0D) {
      ☃ += ☃;
    }
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public aug b(double ☃, double ☃, double ☃)
  {
    double ☃ = a - ☃;
    double ☃ = b - ☃;
    double ☃ = c - ☃;
    double ☃ = d + ☃;
    double ☃ = e + ☃;
    double ☃ = f + ☃;
    
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public aug a(aug ☃)
  {
    double ☃ = Math.min(a, a);
    double ☃ = Math.min(b, b);
    double ☃ = Math.min(c, c);
    double ☃ = Math.max(d, d);
    double ☃ = Math.max(e, e);
    double ☃ = Math.max(f, f);
    
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public static aug a(double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    double ☃ = Math.min(☃, ☃);
    double ☃ = Math.min(☃, ☃);
    double ☃ = Math.min(☃, ☃);
    double ☃ = Math.max(☃, ☃);
    double ☃ = Math.max(☃, ☃);
    double ☃ = Math.max(☃, ☃);
    
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public aug c(double ☃, double ☃, double ☃)
  {
    return new aug(a + ☃, b + ☃, c + ☃, d + ☃, e + ☃, f + ☃);
  }
  
  public double a(aug ☃, double ☃)
  {
    if ((e <= b) || (b >= e) || (f <= c) || (c >= f)) {
      return ☃;
    }
    if ((☃ > 0.0D) && (d <= a))
    {
      double ☃ = a - d;
      if (☃ < ☃) {
        ☃ = ☃;
      }
    }
    else if ((☃ < 0.0D) && (a >= d))
    {
      double ☃ = d - a;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public double b(aug ☃, double ☃)
  {
    if ((d <= a) || (a >= d) || (f <= c) || (c >= f)) {
      return ☃;
    }
    if ((☃ > 0.0D) && (e <= b))
    {
      double ☃ = b - e;
      if (☃ < ☃) {
        ☃ = ☃;
      }
    }
    else if ((☃ < 0.0D) && (b >= e))
    {
      double ☃ = e - b;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public double c(aug ☃, double ☃)
  {
    if ((d <= a) || (a >= d) || (e <= b) || (b >= e)) {
      return ☃;
    }
    if ((☃ > 0.0D) && (f <= c))
    {
      double ☃ = c - f;
      if (☃ < ☃) {
        ☃ = ☃;
      }
    }
    else if ((☃ < 0.0D) && (c >= f))
    {
      double ☃ = f - c;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public boolean b(aug ☃)
  {
    if ((d <= a) || (a >= d)) {
      return false;
    }
    if ((e <= b) || (b >= e)) {
      return false;
    }
    if ((f <= c) || (c >= f)) {
      return false;
    }
    return true;
  }
  
  public boolean a(aui ☃)
  {
    if ((a <= a) || (a >= d)) {
      return false;
    }
    if ((b <= b) || (b >= e)) {
      return false;
    }
    if ((c <= c) || (c >= f)) {
      return false;
    }
    return true;
  }
  
  public double a()
  {
    double ☃ = d - a;
    double ☃ = e - b;
    double ☃ = f - c;
    return (☃ + ☃ + ☃) / 3.0D;
  }
  
  public aug d(double ☃, double ☃, double ☃)
  {
    double ☃ = a + ☃;
    double ☃ = b + ☃;
    double ☃ = c + ☃;
    double ☃ = d - ☃;
    double ☃ = e - ☃;
    double ☃ = f - ☃;
    
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public auh a(aui ☃, aui ☃)
  {
    aui ☃ = ☃.a(☃, a);
    aui ☃ = ☃.a(☃, d);
    
    aui ☃ = ☃.b(☃, b);
    aui ☃ = ☃.b(☃, e);
    
    aui ☃ = ☃.c(☃, c);
    aui ☃ = ☃.c(☃, f);
    if (!b(☃)) {
      ☃ = null;
    }
    if (!b(☃)) {
      ☃ = null;
    }
    if (!c(☃)) {
      ☃ = null;
    }
    if (!c(☃)) {
      ☃ = null;
    }
    if (!d(☃)) {
      ☃ = null;
    }
    if (!d(☃)) {
      ☃ = null;
    }
    aui ☃ = null;
    if (☃ != null) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if (☃ == null) {
      return null;
    }
    cq ☃ = null;
    if (☃ == ☃) {
      ☃ = cq.e;
    } else if (☃ == ☃) {
      ☃ = cq.f;
    } else if (☃ == ☃) {
      ☃ = cq.a;
    } else if (☃ == ☃) {
      ☃ = cq.b;
    } else if (☃ == ☃) {
      ☃ = cq.c;
    } else {
      ☃ = cq.d;
    }
    return new auh(☃, ☃);
  }
  
  private boolean b(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (b >= b) && (b <= e) && (c >= c) && (c <= f);
  }
  
  private boolean c(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (a >= a) && (a <= d) && (c >= c) && (c <= f);
  }
  
  private boolean d(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (a >= a) && (a <= d) && (b >= b) && (b <= e);
  }
  
  public String toString()
  {
    return "box[" + a + ", " + b + ", " + c + " -> " + d + ", " + e + ", " + f + "]";
  }
  
  public boolean b()
  {
    if ((Double.isNaN(a)) || (Double.isNaN(b)) || (Double.isNaN(c)) || (Double.isNaN(d)) || (Double.isNaN(e)) || (Double.isNaN(f))) {
      return true;
    }
    return false;
  }
}
