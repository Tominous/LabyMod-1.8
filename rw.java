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
    this.a = ☃;
    this.c = ☃;
    a(1);
  }
  
  public boolean a()
  {
    if (this.a.l() >= 0) {
      return false;
    }
    if (this.a.bc().nextInt(400) != 0) {
      return false;
    }
    List<wi> ☃ = this.a.o.a(wi.class, this.a.aR().b(6.0D, 3.0D, 6.0D));
    double ☃ = Double.MAX_VALUE;
    for (wi ☃ : ☃) {
      if ((☃ != this.a) && 
      
        (!☃.cn()) && 
        
        (☃.l() < 0))
      {
        double ☃ = ☃.h(this.a);
        if (☃ <= ☃)
        {
          ☃ = ☃;
          this.b = ☃;
        }
      }
    }
    if (this.b == null)
    {
      aui ☃ = tc.a(this.a, 16, 3);
      if (☃ == null) {
        return false;
      }
    }
    return true;
  }
  
  public boolean b()
  {
    return this.d > 0;
  }
  
  public void c()
  {
    if (this.b != null) {
      this.a.m(true);
    }
    this.d = 1000;
  }
  
  public void d()
  {
    this.a.m(false);
    this.b = null;
  }
  
  public void e()
  {
    this.d -= 1;
    if (this.b != null)
    {
      if (this.a.h(this.b) > 4.0D) {
        this.a.s().a(this.b, this.c);
      }
    }
    else if (this.a.s().m())
    {
      aui ☃ = tc.a(this.a, 16, 3);
      if (☃ == null) {
        return;
      }
      this.a.s().a(☃.a, ☃.b, ☃.c, this.c);
    }
  }
}
