import java.util.Random;
import java.util.UUID;

public class ns
{
  public static final float a = c(2.0F);
  private static final float[] b = new float[65536];
  private static final int[] c;
  private static final double d;
  private static final double[] e;
  private static final double[] f;
  
  public static float a(float ☃)
  {
    return b[((int)(☃ * 10430.378F) & 0xFFFF)];
  }
  
  public static float b(float ☃)
  {
    return b[((int)(☃ * 10430.378F + 16384.0F) & 0xFFFF)];
  }
  
  public static float c(float ☃)
  {
    return (float)Math.sqrt(☃);
  }
  
  public static float a(double ☃)
  {
    return (float)Math.sqrt(☃);
  }
  
  public static int d(float ☃)
  {
    int ☃ = (int)☃;
    return ☃ < ☃ ? ☃ - 1 : ☃;
  }
  
  public static int b(double ☃)
  {
    return (int)(☃ + 1024.0D) - 1024;
  }
  
  public static int c(double ☃)
  {
    int ☃ = (int)☃;
    return ☃ < ☃ ? ☃ - 1 : ☃;
  }
  
  public static long d(double ☃)
  {
    long ☃ = ☃;
    return ☃ < ☃ ? ☃ - 1L : ☃;
  }
  
  public static int e(double ☃)
  {
    return (int)(☃ >= 0.0D ? ☃ : -☃ + 1.0D);
  }
  
  public static float e(float ☃)
  {
    return ☃ >= 0.0F ? ☃ : -☃;
  }
  
  public static int a(int ☃)
  {
    return ☃ >= 0 ? ☃ : -☃;
  }
  
  public static int f(float ☃)
  {
    int ☃ = (int)☃;
    return ☃ > ☃ ? ☃ + 1 : ☃;
  }
  
  public static int f(double ☃)
  {
    int ☃ = (int)☃;
    return ☃ > ☃ ? ☃ + 1 : ☃;
  }
  
  public static int a(int ☃, int ☃, int ☃)
  {
    if (☃ < ☃) {
      return ☃;
    }
    if (☃ > ☃) {
      return ☃;
    }
    return ☃;
  }
  
  public static float a(float ☃, float ☃, float ☃)
  {
    if (☃ < ☃) {
      return ☃;
    }
    if (☃ > ☃) {
      return ☃;
    }
    return ☃;
  }
  
  public static double a(double ☃, double ☃, double ☃)
  {
    if (☃ < ☃) {
      return ☃;
    }
    if (☃ > ☃) {
      return ☃;
    }
    return ☃;
  }
  
  public static double b(double ☃, double ☃, double ☃)
  {
    if (☃ < 0.0D) {
      return ☃;
    }
    if (☃ > 1.0D) {
      return ☃;
    }
    return ☃ + (☃ - ☃) * ☃;
  }
  
  public static double a(double ☃, double ☃)
  {
    if (☃ < 0.0D) {
      ☃ = -☃;
    }
    if (☃ < 0.0D) {
      ☃ = -☃;
    }
    return ☃ > ☃ ? ☃ : ☃;
  }
  
  public static int a(int ☃, int ☃)
  {
    if (☃ < 0) {
      return -((-☃ - 1) / ☃) - 1;
    }
    return ☃ / ☃;
  }
  
  public static int a(Random ☃, int ☃, int ☃)
  {
    if (☃ >= ☃) {
      return ☃;
    }
    return ☃.nextInt(☃ - ☃ + 1) + ☃;
  }
  
  public static float a(Random ☃, float ☃, float ☃)
  {
    if (☃ >= ☃) {
      return ☃;
    }
    return ☃.nextFloat() * (☃ - ☃) + ☃;
  }
  
  public static double a(Random ☃, double ☃, double ☃)
  {
    if (☃ >= ☃) {
      return ☃;
    }
    return ☃.nextDouble() * (☃ - ☃) + ☃;
  }
  
  public static double a(long[] ☃)
  {
    long ☃ = 0L;
    for (long ☃ : ☃) {
      ☃ += ☃;
    }
    return ☃ / ☃.length;
  }
  
  public static boolean a(float ☃, float ☃)
  {
    return e(☃ - ☃) < 1.0E-5F;
  }
  
  public static int b(int ☃, int ☃)
  {
    return (☃ % ☃ + ☃) % ☃;
  }
  
  public static float g(float ☃)
  {
    ☃ %= 360.0F;
    if (☃ >= 180.0F) {
      ☃ -= 360.0F;
    }
    if (☃ < -180.0F) {
      ☃ += 360.0F;
    }
    return ☃;
  }
  
  public static double g(double ☃)
  {
    ☃ %= 360.0D;
    if (☃ >= 180.0D) {
      ☃ -= 360.0D;
    }
    if (☃ < -180.0D) {
      ☃ += 360.0D;
    }
    return ☃;
  }
  
  public static int a(String ☃, int ☃)
  {
    try
    {
      return Integer.parseInt(☃);
    }
    catch (Throwable ☃) {}
    return ☃;
  }
  
  public static int a(String ☃, int ☃, int ☃)
  {
    return Math.max(☃, a(☃, ☃));
  }
  
  public static double a(String ☃, double ☃)
  {
    try
    {
      return Double.parseDouble(☃);
    }
    catch (Throwable ☃) {}
    return ☃;
  }
  
  public static double a(String ☃, double ☃, double ☃)
  {
    return Math.max(☃, a(☃, ☃));
  }
  
  public static int b(int ☃)
  {
    int ☃ = ☃ - 1;
    ☃ |= ☃ >> 1;
    ☃ |= ☃ >> 2;
    ☃ |= ☃ >> 4;
    ☃ |= ☃ >> 8;
    ☃ |= ☃ >> 16;
    return ☃ + 1;
  }
  
  private static boolean d(int ☃)
  {
    return (☃ != 0) && ((☃ & ☃ - 1) == 0);
  }
  
  private static int e(int ☃)
  {
    ☃ = d(☃) ? ☃ : b(☃);
    return c[((int)(☃ * 125613361L >> 27) & 0x1F)];
  }
  
  public static int c(int ☃)
  {
    return e(☃) - (d(☃) ? 0 : 1);
  }
  
  public static int c(int ☃, int ☃)
  {
    if (☃ == 0) {
      return 0;
    }
    if (☃ == 0) {
      return ☃;
    }
    if (☃ < 0) {
      ☃ *= -1;
    }
    int ☃ = ☃ % ☃;
    if (☃ == 0) {
      return ☃;
    }
    return ☃ + ☃ - ☃;
  }
  
  public static int b(float ☃, float ☃, float ☃)
  {
    return b(d(☃ * 255.0F), d(☃ * 255.0F), d(☃ * 255.0F));
  }
  
  public static int b(int ☃, int ☃, int ☃)
  {
    int ☃ = ☃;
    ☃ = (☃ << 8) + ☃;
    ☃ = (☃ << 8) + ☃;
    return ☃;
  }
  
  public static int d(int ☃, int ☃)
  {
    int ☃ = (☃ & 0xFF0000) >> 16;
    int ☃ = (☃ & 0xFF0000) >> 16;
    int ☃ = (☃ & 0xFF00) >> 8;
    int ☃ = (☃ & 0xFF00) >> 8;
    int ☃ = (☃ & 0xFF) >> 0;
    int ☃ = (☃ & 0xFF) >> 0;
    
    int ☃ = (int)(☃ * ☃ / 255.0F);
    int ☃ = (int)(☃ * ☃ / 255.0F);
    int ☃ = (int)(☃ * ☃ / 255.0F);
    
    return ☃ & 0xFF000000 | ☃ << 16 | ☃ << 8 | ☃;
  }
  
  public static double h(double ☃)
  {
    return ☃ - Math.floor(☃);
  }
  
  public static long a(df ☃)
  {
    return c(☃.n(), ☃.o(), ☃.p());
  }
  
  public static long c(int ☃, int ☃, int ☃)
  {
    long ☃ = ☃ * 3129871 ^ ☃ * 116129781L ^ ☃;
    ☃ = ☃ * ☃ * 42317861L + ☃ * 11L;
    return ☃;
  }
  
  public static UUID a(Random ☃)
  {
    long ☃ = ☃.nextLong() & 0xFFFFFFFFFFFF0FFF | 0x4000;
    long ☃ = ☃.nextLong() & 0x3FFFFFFFFFFFFFFF | 0x8000000000000000;
    return new UUID(☃, ☃);
  }
  
  public static double c(double ☃, double ☃, double ☃)
  {
    return (☃ - ☃) / (☃ - ☃);
  }
  
  public static double b(double ☃, double ☃)
  {
    double ☃ = ☃ * ☃ + ☃ * ☃;
    if (Double.isNaN(☃)) {
      return NaN.0D;
    }
    boolean ☃ = ☃ < 0.0D;
    if (☃) {
      ☃ = -☃;
    }
    boolean ☃ = ☃ < 0.0D;
    if (☃) {
      ☃ = -☃;
    }
    boolean ☃ = ☃ > ☃;
    if (☃)
    {
      double ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    double ☃ = i(☃);
    ☃ *= ☃;
    ☃ *= ☃;
    
    double ☃ = d + ☃;
    int ☃ = (int)Double.doubleToRawLongBits(☃);
    
    double ☃ = e[☃];
    double ☃ = f[☃];
    
    double ☃ = ☃ - d;
    double ☃ = ☃ * ☃ - ☃ * ☃;
    
    double ☃ = (6.0D + ☃ * ☃) * ☃ * 0.16666666666666666D;
    double ☃ = ☃ + ☃;
    if (☃) {
      ☃ = 1.5707963267948966D - ☃;
    }
    if (☃) {
      ☃ = 3.141592653589793D - ☃;
    }
    if (☃) {
      ☃ = -☃;
    }
    return ☃;
  }
  
  public static double i(double ☃)
  {
    double ☃ = 0.5D * ☃;
    long ☃ = Double.doubleToRawLongBits(☃);
    ☃ = 6910469410427058090L - (☃ >> 1);
    ☃ = Double.longBitsToDouble(☃);
    ☃ *= (1.5D - ☃ * ☃ * ☃);
    return ☃;
  }
  
  static
  {
    for (int ☃ = 0; ☃ < 65536; ☃++) {
      b[☃] = ((float)Math.sin(☃ * 3.141592653589793D * 2.0D / 65536.0D));
    }
    c = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
    
    d = Double.longBitsToDouble(4805340802404319232L);
    e = new double['ā'];
    f = new double['ā'];
    for (int ☃ = 0; ☃ < 257; ☃++)
    {
      double ☃ = ☃ / 256.0D;
      double ☃ = Math.asin(☃);
      f[☃] = Math.cos(☃);
      e[☃] = ☃;
    }
  }
  
  public static int c(float ☃, float ☃, float ☃)
  {
    int ☃ = (int)(☃ * 6.0F) % 6;
    float ☃ = ☃ * 6.0F - ☃;
    float ☃ = ☃ * (1.0F - ☃);
    float ☃ = ☃ * (1.0F - ☃ * ☃);
    float ☃ = ☃ * (1.0F - (1.0F - ☃) * ☃);
    float ☃;
    float ☃;
    float ☃;
    switch (☃)
    {
    case 0: 
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
      break;
    case 1: 
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
      break;
    case 2: 
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
      break;
    case 3: 
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
      break;
    case 4: 
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
      break;
    case 5: 
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
      break;
    default: 
      throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + ☃ + ", " + ☃ + ", " + ☃);
    }
    int ☃ = a((int)(☃ * 255.0F), 0, 255);
    int ☃ = a((int)(☃ * 255.0F), 0, 255);
    int ☃ = a((int)(☃ * 255.0F), 0, 255);
    
    return ☃ << 16 | ☃ << 8 | ☃;
  }
}
