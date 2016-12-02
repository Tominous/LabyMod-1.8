import java.util.Random;

public class arc
  extends arh
{
  private arb[] a;
  private int b;
  
  public arc(Random ☃, int ☃)
  {
    b = ☃;
    a = new arb[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a[☃] = new arb(☃);
    }
  }
  
  public double[] a(double[] ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, double ☃, double ☃, double ☃)
  {
    if (☃ == null) {
      ☃ = new double[☃ * ☃ * ☃];
    } else {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃] = 0.0D;
      }
    }
    double ☃ = 1.0D;
    for (int ☃ = 0; ☃ < b; ☃++)
    {
      double ☃ = ☃ * ☃ * ☃;
      double ☃ = ☃ * ☃ * ☃;
      double ☃ = ☃ * ☃ * ☃;
      long ☃ = ns.d(☃);
      long ☃ = ns.d(☃);
      ☃ -= ☃;
      ☃ -= ☃;
      ☃ %= 16777216L;
      ☃ %= 16777216L;
      ☃ += ☃;
      ☃ += ☃;
      a[☃].a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃ * ☃, ☃ * ☃, ☃ * ☃, ☃);
      ☃ /= 2.0D;
    }
    return ☃;
  }
  
  public double[] a(double[] ☃, int ☃, int ☃, int ☃, int ☃, double ☃, double ☃, double ☃)
  {
    return a(☃, ☃, 10, ☃, ☃, 1, ☃, ☃, 1.0D, ☃);
  }
}
