import java.util.Random;

public class arg
{
  private static int[][] e = { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 } };
  public static final double a = Math.sqrt(3.0D);
  private int[] f = new int['Ȁ'];
  public double b;
  public double c;
  public double d;
  
  public arg()
  {
    this(new Random());
  }
  
  public arg(Random ☃)
  {
    b = (☃.nextDouble() * 256.0D);
    c = (☃.nextDouble() * 256.0D);
    d = (☃.nextDouble() * 256.0D);
    for (int ☃ = 0; ☃ < 256; ☃++) {
      f[☃] = ☃;
    }
    for (int ☃ = 0; ☃ < 256; ☃++)
    {
      int ☃ = ☃.nextInt(256 - ☃) + ☃;
      int ☃ = f[☃];
      f[☃] = f[☃];
      f[☃] = ☃;
      
      f[(☃ + 256)] = f[☃];
    }
  }
  
  private static int a(double ☃)
  {
    return ☃ > 0.0D ? (int)☃ : (int)☃ - 1;
  }
  
  private static double a(int[] ☃, double ☃, double ☃)
  {
    return ☃[0] * ☃ + ☃[1] * ☃;
  }
  
  public double a(double ☃, double ☃)
  {
    double ☃ = 0.5D * (a - 1.0D);
    double ☃ = (☃ + ☃) * ☃;
    int ☃ = a(☃ + ☃);
    int ☃ = a(☃ + ☃);
    double ☃ = (3.0D - a) / 6.0D;
    double ☃ = (☃ + ☃) * ☃;
    double ☃ = ☃ - ☃;
    double ☃ = ☃ - ☃;
    double ☃ = ☃ - ☃;
    double ☃ = ☃ - ☃;
    int ☃;
    int ☃;
    int ☃;
    if (☃ > ☃)
    {
      int ☃ = 1;
      ☃ = 0;
    }
    else
    {
      ☃ = 0;
      ☃ = 1;
    }
    double ☃ = ☃ - ☃ + ☃;
    double ☃ = ☃ - ☃ + ☃;
    double ☃ = ☃ - 1.0D + 2.0D * ☃;
    double ☃ = ☃ - 1.0D + 2.0D * ☃;
    
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ & 0xFF;
    int ☃ = f[(☃ + f[☃])] % 12;
    int ☃ = f[(☃ + ☃ + f[(☃ + ☃)])] % 12;
    int ☃ = f[(☃ + 1 + f[(☃ + 1)])] % 12;
    
    double ☃ = 0.5D - ☃ * ☃ - ☃ * ☃;
    double ☃;
    double ☃;
    if (☃ < 0.0D)
    {
      ☃ = 0.0D;
    }
    else
    {
      ☃ *= ☃;
      ☃ = ☃ * ☃ * a(e[☃], ☃, ☃);
    }
    double ☃ = 0.5D - ☃ * ☃ - ☃ * ☃;
    double ☃;
    double ☃;
    if (☃ < 0.0D)
    {
      ☃ = 0.0D;
    }
    else
    {
      ☃ *= ☃;
      ☃ = ☃ * ☃ * a(e[☃], ☃, ☃);
    }
    double ☃ = 0.5D - ☃ * ☃ - ☃ * ☃;
    double ☃;
    double ☃;
    if (☃ < 0.0D)
    {
      ☃ = 0.0D;
    }
    else
    {
      ☃ *= ☃;
      ☃ = ☃ * ☃ * a(e[☃], ☃, ☃);
    }
    return 70.0D * (☃ + ☃ + ☃);
  }
  
  private static final double g = 0.5D * (a - 1.0D);
  private static final double h = (3.0D - a) / 6.0D;
  
  public void a(double[] ☃, double ☃, double ☃, int ☃, int ☃, double ☃, double ☃, double ☃)
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      double ☃ = (☃ + ☃) * ☃ + c;
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        double ☃ = (☃ + ☃) * ☃ + b;
        
        double ☃ = (☃ + ☃) * g;
        int ☃ = a(☃ + ☃);
        int ☃ = a(☃ + ☃);
        double ☃ = (☃ + ☃) * h;
        double ☃ = ☃ - ☃;
        double ☃ = ☃ - ☃;
        double ☃ = ☃ - ☃;
        double ☃ = ☃ - ☃;
        int ☃;
        int ☃;
        int ☃;
        if (☃ > ☃)
        {
          int ☃ = 1;
          ☃ = 0;
        }
        else
        {
          ☃ = 0;
          ☃ = 1;
        }
        double ☃ = ☃ - ☃ + h;
        double ☃ = ☃ - ☃ + h;
        double ☃ = ☃ - 1.0D + 2.0D * h;
        double ☃ = ☃ - 1.0D + 2.0D * h;
        
        int ☃ = ☃ & 0xFF;
        int ☃ = ☃ & 0xFF;
        int ☃ = f[(☃ + f[☃])] % 12;
        int ☃ = f[(☃ + ☃ + f[(☃ + ☃)])] % 12;
        int ☃ = f[(☃ + 1 + f[(☃ + 1)])] % 12;
        
        double ☃ = 0.5D - ☃ * ☃ - ☃ * ☃;
        double ☃;
        double ☃;
        if (☃ < 0.0D)
        {
          ☃ = 0.0D;
        }
        else
        {
          ☃ *= ☃;
          ☃ = ☃ * ☃ * a(e[☃], ☃, ☃);
        }
        double ☃ = 0.5D - ☃ * ☃ - ☃ * ☃;
        double ☃;
        double ☃;
        if (☃ < 0.0D)
        {
          ☃ = 0.0D;
        }
        else
        {
          ☃ *= ☃;
          ☃ = ☃ * ☃ * a(e[☃], ☃, ☃);
        }
        double ☃ = 0.5D - ☃ * ☃ - ☃ * ☃;
        double ☃;
        double ☃;
        if (☃ < 0.0D)
        {
          ☃ = 0.0D;
        }
        else
        {
          ☃ *= ☃;
          ☃ = ☃ * ☃ * a(e[☃], ☃, ☃);
        }
        ☃[(☃++)] += 70.0D * (☃ + ☃ + ☃) * ☃;
      }
    }
  }
}
