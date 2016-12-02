import java.util.Random;

public class arb
  extends arh
{
  private int[] d = new int['Ȁ'];
  public double a;
  public double b;
  public double c;
  
  public arb()
  {
    this(new Random());
  }
  
  public arb(Random ☃)
  {
    a = (☃.nextDouble() * 256.0D);
    b = (☃.nextDouble() * 256.0D);
    c = (☃.nextDouble() * 256.0D);
    for (int ☃ = 0; ☃ < 256; ☃++) {
      d[☃] = ☃;
    }
    for (int ☃ = 0; ☃ < 256; ☃++)
    {
      int ☃ = ☃.nextInt(256 - ☃) + ☃;
      int ☃ = d[☃];
      d[☃] = d[☃];
      d[☃] = ☃;
      
      d[(☃ + 256)] = d[☃];
    }
  }
  
  public final double b(double ☃, double ☃, double ☃)
  {
    return ☃ + ☃ * (☃ - ☃);
  }
  
  private static final double[] e = { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
  private static final double[] f = { 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D };
  private static final double[] g = { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
  private static final double[] h = { 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 0.0D, -1.0D, 0.0D };
  private static final double[] i = { 0.0D, 0.0D, 0.0D, 0.0D, 1.0D, 1.0D, -1.0D, -1.0D, 1.0D, 1.0D, -1.0D, -1.0D, 0.0D, 1.0D, 0.0D, -1.0D };
  
  public final double a(int ☃, double ☃, double ☃)
  {
    int ☃ = ☃ & 0xF;
    return h[☃] * ☃ + i[☃] * ☃;
  }
  
  public final double a(int ☃, double ☃, double ☃, double ☃)
  {
    int ☃ = ☃ & 0xF;
    return e[☃] * ☃ + f[☃] * ☃ + g[☃] * ☃;
  }
  
  public void a(double[] ☃, double ☃, double ☃, double ☃, int ☃, int ☃, int ☃, double ☃, double ☃, double ☃, double ☃)
  {
    if (☃ == 1)
    {
      int ☃ = 0;int ☃ = 0;int ☃ = 0;int ☃ = 0;
      double ☃ = 0.0D;double ☃ = 0.0D;
      int ☃ = 0;
      double ☃ = 1.0D / ☃;
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        double ☃ = ☃ + ☃ * ☃ + a;
        int ☃ = (int)☃;
        if (☃ < ☃) {
          ☃--;
        }
        int ☃ = ☃ & 0xFF;
        ☃ -= ☃;
        double ☃ = ☃ * ☃ * ☃ * (☃ * (☃ * 6.0D - 15.0D) + 10.0D);
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          double ☃ = ☃ + ☃ * ☃ + c;
          int ☃ = (int)☃;
          if (☃ < ☃) {
            ☃--;
          }
          int ☃ = ☃ & 0xFF;
          ☃ -= ☃;
          double ☃ = ☃ * ☃ * ☃ * (☃ * (☃ * 6.0D - 15.0D) + 10.0D);
          
          ☃ = d[☃] + 0;
          ☃ = d[☃] + ☃;
          ☃ = d[(☃ + 1)] + 0;
          ☃ = d[☃] + ☃;
          ☃ = b(☃, a(d[☃], ☃, ☃), a(d[☃], ☃ - 1.0D, 0.0D, ☃));
          ☃ = b(☃, a(d[(☃ + 1)], ☃, 0.0D, ☃ - 1.0D), a(d[(☃ + 1)], ☃ - 1.0D, 0.0D, ☃ - 1.0D));
          
          double ☃ = b(☃, ☃, ☃);
          
          ☃[(☃++)] += ☃ * ☃;
        }
      }
      return;
    }
    int ☃ = 0;
    double ☃ = 1.0D / ☃;
    int ☃ = -1;
    int ☃ = 0;int ☃ = 0;int ☃ = 0;int ☃ = 0;int ☃ = 0;int ☃ = 0;
    double ☃ = 0.0D;double ☃ = 0.0D;double ☃ = 0.0D;double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      double ☃ = ☃ + ☃ * ☃ + a;
      int ☃ = (int)☃;
      if (☃ < ☃) {
        ☃--;
      }
      int ☃ = ☃ & 0xFF;
      ☃ -= ☃;
      double ☃ = ☃ * ☃ * ☃ * (☃ * (☃ * 6.0D - 15.0D) + 10.0D);
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        double ☃ = ☃ + ☃ * ☃ + c;
        int ☃ = (int)☃;
        if (☃ < ☃) {
          ☃--;
        }
        int ☃ = ☃ & 0xFF;
        ☃ -= ☃;
        double ☃ = ☃ * ☃ * ☃ * (☃ * (☃ * 6.0D - 15.0D) + 10.0D);
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          double ☃ = ☃ + ☃ * ☃ + b;
          int ☃ = (int)☃;
          if (☃ < ☃) {
            ☃--;
          }
          int ☃ = ☃ & 0xFF;
          ☃ -= ☃;
          double ☃ = ☃ * ☃ * ☃ * (☃ * (☃ * 6.0D - 15.0D) + 10.0D);
          if ((☃ == 0) || (☃ != ☃))
          {
            ☃ = ☃;
            ☃ = d[☃] + ☃;
            ☃ = d[☃] + ☃;
            ☃ = d[(☃ + 1)] + ☃;
            ☃ = d[(☃ + 1)] + ☃;
            ☃ = d[☃] + ☃;
            ☃ = d[(☃ + 1)] + ☃;
            ☃ = b(☃, a(d[☃], ☃, ☃, ☃), a(d[☃], ☃ - 1.0D, ☃, ☃));
            ☃ = b(☃, a(d[☃], ☃, ☃ - 1.0D, ☃), a(d[☃], ☃ - 1.0D, ☃ - 1.0D, ☃));
            ☃ = b(☃, a(d[(☃ + 1)], ☃, ☃, ☃ - 1.0D), a(d[(☃ + 1)], ☃ - 1.0D, ☃, ☃ - 1.0D));
            ☃ = b(☃, a(d[(☃ + 1)], ☃, ☃ - 1.0D, ☃ - 1.0D), a(d[(☃ + 1)], ☃ - 1.0D, ☃ - 1.0D, ☃ - 1.0D));
          }
          double ☃ = b(☃, ☃, ☃);
          double ☃ = b(☃, ☃, ☃);
          double ☃ = b(☃, ☃, ☃);
          
          ☃[(☃++)] += ☃ * ☃;
        }
      }
    }
  }
}
