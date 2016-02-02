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
    this.a = Math.min(☃, ☃);
    this.b = Math.min(☃, ☃);
    this.c = Math.min(☃, ☃);
    this.d = Math.max(☃, ☃);
    this.e = Math.max(☃, ☃);
    this.f = Math.max(☃, ☃);
  }
  
  public aug(cj ☃, cj ☃)
  {
    this.a = ☃.n();
    this.b = ☃.o();
    this.c = ☃.p();
    this.d = ☃.n();
    this.e = ☃.o();
    this.f = ☃.p();
  }
  
  public aug a(double ☃, double ☃, double ☃)
  {
    double ☃ = this.a;
    double ☃ = this.b;
    double ☃ = this.c;
    double ☃ = this.d;
    double ☃ = this.e;
    double ☃ = this.f;
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
    double ☃ = this.a - ☃;
    double ☃ = this.b - ☃;
    double ☃ = this.c - ☃;
    double ☃ = this.d + ☃;
    double ☃ = this.e + ☃;
    double ☃ = this.f + ☃;
    
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public aug a(aug ☃)
  {
    double ☃ = Math.min(this.a, ☃.a);
    double ☃ = Math.min(this.b, ☃.b);
    double ☃ = Math.min(this.c, ☃.c);
    double ☃ = Math.max(this.d, ☃.d);
    double ☃ = Math.max(this.e, ☃.e);
    double ☃ = Math.max(this.f, ☃.f);
    
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
    return new aug(this.a + ☃, this.b + ☃, this.c + ☃, this.d + ☃, this.e + ☃, this.f + ☃);
  }
  
  public double a(aug ☃, double ☃)
  {
    if ((☃.e <= this.b) || (☃.b >= this.e) || (☃.f <= this.c) || (☃.c >= this.f)) {
      return ☃;
    }
    if ((☃ > 0.0D) && (☃.d <= this.a))
    {
      double ☃ = this.a - ☃.d;
      if (☃ < ☃) {
        ☃ = ☃;
      }
    }
    else if ((☃ < 0.0D) && (☃.a >= this.d))
    {
      double ☃ = this.d - ☃.a;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public double b(aug ☃, double ☃)
  {
    if ((☃.d <= this.a) || (☃.a >= this.d) || (☃.f <= this.c) || (☃.c >= this.f)) {
      return ☃;
    }
    if ((☃ > 0.0D) && (☃.e <= this.b))
    {
      double ☃ = this.b - ☃.e;
      if (☃ < ☃) {
        ☃ = ☃;
      }
    }
    else if ((☃ < 0.0D) && (☃.b >= this.e))
    {
      double ☃ = this.e - ☃.b;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public double c(aug ☃, double ☃)
  {
    if ((☃.d <= this.a) || (☃.a >= this.d) || (☃.e <= this.b) || (☃.b >= this.e)) {
      return ☃;
    }
    if ((☃ > 0.0D) && (☃.f <= this.c))
    {
      double ☃ = this.c - ☃.f;
      if (☃ < ☃) {
        ☃ = ☃;
      }
    }
    else if ((☃ < 0.0D) && (☃.c >= this.f))
    {
      double ☃ = this.f - ☃.c;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public boolean b(aug ☃)
  {
    if ((☃.d <= this.a) || (☃.a >= this.d)) {
      return false;
    }
    if ((☃.e <= this.b) || (☃.b >= this.e)) {
      return false;
    }
    if ((☃.f <= this.c) || (☃.c >= this.f)) {
      return false;
    }
    return true;
  }
  
  public boolean a(aui ☃)
  {
    if ((☃.a <= this.a) || (☃.a >= this.d)) {
      return false;
    }
    if ((☃.b <= this.b) || (☃.b >= this.e)) {
      return false;
    }
    if ((☃.c <= this.c) || (☃.c >= this.f)) {
      return false;
    }
    return true;
  }
  
  public double a()
  {
    double ☃ = this.d - this.a;
    double ☃ = this.e - this.b;
    double ☃ = this.f - this.c;
    return (☃ + ☃ + ☃) / 3.0D;
  }
  
  public aug d(double ☃, double ☃, double ☃)
  {
    double ☃ = this.a + ☃;
    double ☃ = this.b + ☃;
    double ☃ = this.c + ☃;
    double ☃ = this.d - ☃;
    double ☃ = this.e - ☃;
    double ☃ = this.f - ☃;
    
    return new aug(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public auh a(aui ☃, aui ☃)
  {
    aui ☃ = ☃.a(☃, this.a);
    aui ☃ = ☃.a(☃, this.d);
    
    aui ☃ = ☃.b(☃, this.b);
    aui ☃ = ☃.b(☃, this.e);
    
    aui ☃ = ☃.c(☃, this.c);
    aui ☃ = ☃.c(☃, this.f);
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
    return (☃.b >= this.b) && (☃.b <= this.e) && (☃.c >= this.c) && (☃.c <= this.f);
  }
  
  private boolean c(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (☃.a >= this.a) && (☃.a <= this.d) && (☃.c >= this.c) && (☃.c <= this.f);
  }
  
  private boolean d(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (☃.a >= this.a) && (☃.a <= this.d) && (☃.b >= this.b) && (☃.b <= this.e);
  }
  
  public String toString()
  {
    return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + "]";
  }
  
  public boolean b()
  {
    if ((Double.isNaN(this.a)) || (Double.isNaN(this.b)) || (Double.isNaN(this.c)) || (Double.isNaN(this.d)) || (Double.isNaN(this.e)) || (Double.isNaN(this.f))) {
      return true;
    }
    return false;
  }
}
