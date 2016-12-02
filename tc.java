import java.util.Random;

public class tc
{
  private static aui a = new aui(0.0D, 0.0D, 0.0D);
  
  public static aui a(py ☃, int ☃, int ☃)
  {
    return c(☃, ☃, ☃, null);
  }
  
  public static aui a(py ☃, int ☃, int ☃, aui ☃)
  {
    a = ☃.a(s, t, u);
    return c(☃, ☃, ☃, a);
  }
  
  public static aui b(py ☃, int ☃, int ☃, aui ☃)
  {
    a = new aui(s, t, u).d(☃);
    return c(☃, ☃, ☃, a);
  }
  
  private static aui c(py ☃, int ☃, int ☃, aui ☃)
  {
    Random ☃ = ☃.bc();
    boolean ☃ = false;
    int ☃ = 0;int ☃ = 0;int ☃ = 0;
    float ☃ = -99999.0F;
    boolean ☃;
    boolean ☃;
    if (☃.ck())
    {
      double ☃ = ☃.ch().c(ns.c(s), ns.c(t), ns.c(u)) + 4.0D;
      double ☃ = ☃.ci() + ☃;
      ☃ = ☃ < ☃ * ☃;
    }
    else
    {
      ☃ = false;
    }
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      int ☃ = ☃.nextInt(2 * ☃ + 1) - ☃;
      int ☃ = ☃.nextInt(2 * ☃ + 1) - ☃;
      int ☃ = ☃.nextInt(2 * ☃ + 1) - ☃;
      if ((☃ == null) || (☃ * a + ☃ * c >= 0.0D))
      {
        if ((☃.ck()) && (☃ > 1))
        {
          cj ☃ = ☃.ch();
          if (s > ☃.n()) {
            ☃ -= ☃.nextInt(☃ / 2);
          } else {
            ☃ += ☃.nextInt(☃ / 2);
          }
          if (u > ☃.p()) {
            ☃ -= ☃.nextInt(☃ / 2);
          } else {
            ☃ += ☃.nextInt(☃ / 2);
          }
        }
        ☃ += ns.c(s);
        ☃ += ns.c(t);
        ☃ += ns.c(u);
        
        cj ☃ = new cj(☃, ☃, ☃);
        if ((!☃) || (☃.e(☃)))
        {
          float ☃ = ☃.a(☃);
          if (☃ > ☃)
          {
            ☃ = ☃;
            ☃ = ☃;
            ☃ = ☃;
            ☃ = ☃;
            ☃ = true;
          }
        }
      }
    }
    if (☃) {
      return new aui(☃, ☃, ☃);
    }
    return null;
  }
}
