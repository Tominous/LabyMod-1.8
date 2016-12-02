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
    a = ☃;
    c = ☃;
  }
  
  public boolean a()
  {
    if (a.l() >= 0) {
      return false;
    }
    List<tm> ☃ = a.o.a(a.getClass(), a.aR().b(8.0D, 4.0D, 8.0D));
    
    tm ☃ = null;
    double ☃ = Double.MAX_VALUE;
    for (tm ☃ : ☃) {
      if (☃.l() >= 0)
      {
        double ☃ = a.h(☃);
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
    b = ☃;
    return true;
  }
  
  public boolean b()
  {
    if (a.l() >= 0) {
      return false;
    }
    if (!b.ai()) {
      return false;
    }
    double ☃ = a.h(b);
    if ((☃ < 9.0D) || (☃ > 256.0D)) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    d = 0;
  }
  
  public void d()
  {
    b = null;
  }
  
  public void e()
  {
    if (--d > 0) {
      return;
    }
    d = 10;
    a.s().a(b, c);
  }
}
