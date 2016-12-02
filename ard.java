import java.util.Random;

public class ard
  extends arh
{
  private arg[] a;
  private int b;
  
  public ard(Random ☃, int ☃)
  {
    b = ☃;
    a = new arg[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a[☃] = new arg(☃);
    }
  }
  
  public double a(double ☃, double ☃)
  {
    double ☃ = 0.0D;
    double ☃ = 1.0D;
    for (int ☃ = 0; ☃ < b; ☃++)
    {
      ☃ += a[☃].a(☃ * ☃, ☃ * ☃) / ☃;
      ☃ /= 2.0D;
    }
    return ☃;
  }
  
  public double[] a(double[] ☃, double ☃, double ☃, int ☃, int ☃, double ☃, double ☃, double ☃)
  {
    return a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, 0.5D);
  }
  
  public double[] a(double[] ☃, double ☃, double ☃, int ☃, int ☃, double ☃, double ☃, double ☃, double ☃)
  {
    if ((☃ == null) || (☃.length < ☃ * ☃)) {
      ☃ = new double[☃ * ☃];
    } else {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃] = 0.0D;
      }
    }
    double ☃ = 1.0D;
    double ☃ = 1.0D;
    for (int ☃ = 0; ☃ < b; ☃++)
    {
      a[☃].a(☃, ☃, ☃, ☃, ☃, ☃ * ☃ * ☃, ☃ * ☃ * ☃, 0.55D / ☃);
      ☃ *= ☃;
      ☃ *= ☃;
    }
    return ☃;
  }
}
