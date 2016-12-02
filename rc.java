import java.util.List;

public class rc
  extends rd
{
  tm a;
  tm b;
  double c;
  private int d;
  
  public rc(tm ☃, double ☃)
  {
    this.a = ☃;
    this.c = ☃;
  }
  
  public boolean a()
  {
    if (this.a.l() >= 0) {
      return false;
    }
    List<tm> ☃ = this.a.o.a(this.a.getClass(), this.a.aR().b(8.0D, 4.0D, 8.0D));
    
    tm ☃ = null;
    double ☃ = Double.MAX_VALUE;
    for (tm ☃ : ☃) {
      if (☃.l() >= 0)
      {
        double ☃ = this.a.h(☃);
        if (☃ <= ☃)
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
    }
    if (☃ == null) {
      return false;
    }
    if (☃ < 9.0D) {
      return false;
    }
    this.b = ☃;
    return true;
  }
  
  public boolean b()
  {
    if (this.a.l() >= 0) {
      return false;
    }
    if (!this.b.ai()) {
      return false;
    }
    double ☃ = this.a.h(this.b);
    if ((☃ < 9.0D) || (☃ > 256.0D)) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    this.d = 0;
  }
  
  public void d()
  {
    this.b = null;
  }
  
  public void e()
  {
    if (--this.d > 0) {
      return;
    }
    this.d = 10;
    this.a.s().a(this.b, this.c);
  }
}
