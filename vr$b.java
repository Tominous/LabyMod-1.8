import java.util.List;
import java.util.Random;

class vr$b
  extends qq
{
  private vr g;
  private int h;
  
  public vr$b(vr ☃)
  {
    super(☃);
    this.g = ☃;
  }
  
  public void c()
  {
    if (!this.f) {
      return;
    }
    double ☃ = this.b - this.g.s;
    double ☃ = this.c - this.g.t;
    double ☃ = this.d - this.g.u;
    
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    if (this.h-- <= 0)
    {
      this.h += this.g.bc().nextInt(5) + 2;
      
      ☃ = ns.a(☃);
      if (b(this.b, this.c, this.d, ☃))
      {
        this.g.v += ☃ / ☃ * 0.1D;
        this.g.w += ☃ / ☃ * 0.1D;
        this.g.x += ☃ / ☃ * 0.1D;
      }
      else
      {
        this.f = false;
      }
    }
  }
  
  private boolean b(double ☃, double ☃, double ☃, double ☃)
  {
    double ☃ = (☃ - this.g.s) / ☃;
    double ☃ = (☃ - this.g.t) / ☃;
    double ☃ = (☃ - this.g.u) / ☃;
    
    aug ☃ = this.g.aR();
    for (int ☃ = 1; ☃ < ☃; ☃++)
    {
      ☃ = ☃.c(☃, ☃, ☃);
      if (!this.g.o.a(this.g, ☃).isEmpty()) {
        return false;
      }
    }
    return true;
  }
}
