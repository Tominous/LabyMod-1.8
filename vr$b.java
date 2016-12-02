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
    g = ☃;
  }
  
  public void c()
  {
    if (!f) {
      return;
    }
    double ☃ = b - g.s;
    double ☃ = c - g.t;
    double ☃ = d - g.u;
    
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    if (h-- <= 0)
    {
      h += g.bc().nextInt(5) + 2;
      
      ☃ = ns.a(☃);
      if (b(b, c, d, ☃))
      {
        g.v += ☃ / ☃ * 0.1D;
        g.w += ☃ / ☃ * 0.1D;
        g.x += ☃ / ☃ * 0.1D;
      }
      else
      {
        f = false;
      }
    }
  }
  
  private boolean b(double ☃, double ☃, double ☃, double ☃)
  {
    double ☃ = (☃ - g.s) / ☃;
    double ☃ = (☃ - g.t) / ☃;
    double ☃ = (☃ - g.u) / ☃;
    
    aug ☃ = g.aR();
    for (int ☃ = 1; ☃ < ☃; ☃++)
    {
      ☃ = ☃.c(☃, ☃, ☃);
      if (!g.o.a(g, ☃).isEmpty()) {
        return false;
      }
    }
    return true;
  }
}
