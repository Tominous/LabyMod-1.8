import java.util.List;
import java.util.Random;

public class rw
  extends rd
{
  private wi a;
  private pr b;
  private double c;
  private int d;
  
  public rw(wi ☃, double ☃)
  {
    a = ☃;
    c = ☃;
    a(1);
  }
  
  public boolean a()
  {
    if (a.l() >= 0) {
      return false;
    }
    if (a.bc().nextInt(400) != 0) {
      return false;
    }
    List<wi> ☃ = a.o.a(wi.class, a.aR().b(6.0D, 3.0D, 6.0D));
    double ☃ = Double.MAX_VALUE;
    for (wi ☃ : ☃) {
      if ((☃ != a) && 
      
        (!☃.cn()) && 
        
        (☃.l() < 0))
      {
        double ☃ = ☃.h(a);
        if (☃ <= ☃)
        {
          ☃ = ☃;
          b = ☃;
        }
      }
    }
    if (b == null)
    {
      aui ☃ = tc.a(a, 16, 3);
      if (☃ == null) {
        return false;
      }
    }
    return true;
  }
  
  public boolean b()
  {
    return d > 0;
  }
  
  public void c()
  {
    if (b != null) {
      a.m(true);
    }
    d = 1000;
  }
  
  public void d()
  {
    a.m(false);
    b = null;
  }
  
  public void e()
  {
    d -= 1;
    if (b != null)
    {
      if (a.h(b) > 4.0D) {
        a.s().a(b, c);
      }
    }
    else if (a.s().m())
    {
      aui ☃ = tc.a(a, 16, 3);
      if (☃ == null) {
        return;
      }
      a.s().a(a, b, c, c);
    }
  }
}
