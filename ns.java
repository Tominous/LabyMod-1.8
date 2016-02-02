import java.util.Random;
import java.util.UUID;

public class ns
{
  public static final float a = c(2.0F);
  private static final int SIN_BITS = 12;
  private static final int SIN_MASK = 4095;
  private static final int SIN_COUNT = 4096;
  public static final float PI = 3.1415927F;
  public static final float PI2 = 6.2831855F;
  public static final float PId2 = 1.5707964F;
  private static final float radFull = 6.2831855F;
  private static final float degFull = 360.0F;
  private static final float radToIndex = 651.8986F;
  private static final float degToIndex = 11.377778F;
  public static final float deg2Rad = 0.017453292F;
  private static final float[] SIN_TABLE_FAST = new float['က'];
  public static boolean fastMath = false;
  private static final float[] b = new float[65536];
  private static final int[] c;
  private static final double d;
  private static final double[] e;
  private static final double[] f;
  private static final String __OBFID = "CL_00001496";
  
  public static float a(float p_76126_0_)
  {
    if (fastMath) {
      return SIN_TABLE_FAST[((int)(p_76126_0_ * 651.8986F) & 0xFFF)];
    }
    return b[((int)(p_76126_0_ * 10430.378F) & 0xFFFF)];
  }
  
  public static float b(float p_76134_0_)
  {
    if (fastMath) {
      return SIN_TABLE_FAST[((int)((p_76134_0_ + 1.5707964F) * 651.8986F) & 0xFFF)];
    }
    return b[((int)(p_76134_0_ * 10430.378F + 16384.0F) & 0xFFFF)];
  }
  
  public static float c(float p_76129_0_)
  {
    return (float)Math.sqrt(p_76129_0_);
  }
  
  public static float a(double p_76133_0_)
  {
    return (float)Math.sqrt(p_76133_0_);
  }
  
  public static int d(float p_76141_0_)
  {
    int var1 = (int)p_76141_0_;
    return p_76141_0_ < var1 ? var1 - 1 : var1;
  }
  
  public static int b(double p_76140_0_)
  {
    return (int)(p_76140_0_ + 1024.0D) - 1024;
  }
  
  public static int c(double p_76128_0_)
  {
    int var2 = (int)p_76128_0_;
    return p_76128_0_ < var2 ? var2 - 1 : var2;
  }
  
  public static long d(double p_76124_0_)
  {
    long var2 = p_76124_0_;
    return p_76124_0_ < var2 ? var2 - 1L : var2;
  }
  
  public static int e(double p_154353_0_)
  {
    return (int)(p_154353_0_ >= 0.0D ? p_154353_0_ : -p_154353_0_ + 1.0D);
  }
  
  public static float e(float p_76135_0_)
  {
    return p_76135_0_ >= 0.0F ? p_76135_0_ : -p_76135_0_;
  }
  
  public static int a(int p_76130_0_)
  {
    return p_76130_0_ >= 0 ? p_76130_0_ : -p_76130_0_;
  }
  
  public static int f(float p_76123_0_)
  {
    int var1 = (int)p_76123_0_;
    return p_76123_0_ > var1 ? var1 + 1 : var1;
  }
  
  public static int f(double p_76143_0_)
  {
    int var2 = (int)p_76143_0_;
    return p_76143_0_ > var2 ? var2 + 1 : var2;
  }
  
  public static int a(int p_76125_0_, int p_76125_1_, int p_76125_2_)
  {
    return p_76125_0_ > p_76125_2_ ? p_76125_2_ : p_76125_0_ < p_76125_1_ ? p_76125_1_ : p_76125_0_;
  }
  
  public static float a(float p_76131_0_, float p_76131_1_, float p_76131_2_)
  {
    return p_76131_0_ > p_76131_2_ ? p_76131_2_ : p_76131_0_ < p_76131_1_ ? p_76131_1_ : p_76131_0_;
  }
  
  public static double a(double p_151237_0_, double p_151237_2_, double p_151237_4_)
  {
    return p_151237_0_ > p_151237_4_ ? p_151237_4_ : p_151237_0_ < p_151237_2_ ? p_151237_2_ : p_151237_0_;
  }
  
  public static double b(double p_151238_0_, double p_151238_2_, double p_151238_4_)
  {
    return p_151238_4_ > 1.0D ? p_151238_2_ : p_151238_4_ < 0.0D ? p_151238_0_ : p_151238_0_ + (p_151238_2_ - p_151238_0_) * p_151238_4_;
  }
  
  public static double a(double p_76132_0_, double p_76132_2_)
  {
    if (p_76132_0_ < 0.0D) {
      p_76132_0_ = -p_76132_0_;
    }
    if (p_76132_2_ < 0.0D) {
      p_76132_2_ = -p_76132_2_;
    }
    return p_76132_0_ > p_76132_2_ ? p_76132_0_ : p_76132_2_;
  }
  
  public static int a(int p_76137_0_, int p_76137_1_)
  {
    return p_76137_0_ < 0 ? -((-p_76137_0_ - 1) / p_76137_1_) - 1 : p_76137_0_ / p_76137_1_;
  }
  
  public static int a(Random p_76136_0_, int p_76136_1_, int p_76136_2_)
  {
    return p_76136_1_ >= p_76136_2_ ? p_76136_1_ : p_76136_0_.nextInt(p_76136_2_ - p_76136_1_ + 1) + p_76136_1_;
  }
  
  public static float a(Random p_151240_0_, float p_151240_1_, float p_151240_2_)
  {
    return p_151240_1_ >= p_151240_2_ ? p_151240_1_ : p_151240_0_.nextFloat() * (p_151240_2_ - p_151240_1_) + p_151240_1_;
  }
  
  public static double a(Random p_82716_0_, double p_82716_1_, double p_82716_3_)
  {
    return p_82716_1_ >= p_82716_3_ ? p_82716_1_ : p_82716_0_.nextDouble() * (p_82716_3_ - p_82716_1_) + p_82716_1_;
  }
  
  public static double a(long[] p_76127_0_)
  {
    long var1 = 0L;
    long[] var3 = p_76127_0_;
    int var4 = p_76127_0_.length;
    for (int var5 = 0; var5 < var4; var5++)
    {
      long var6 = var3[var5];
      var1 += var6;
    }
    return var1 / p_76127_0_.length;
  }
  
  public static boolean a(float p_180185_0_, float p_180185_1_)
  {
    return e(p_180185_1_ - p_180185_0_) < 1.0E-5F;
  }
  
  public static int b(int p_180184_0_, int p_180184_1_)
  {
    return (p_180184_0_ % p_180184_1_ + p_180184_1_) % p_180184_1_;
  }
  
  public static float g(float p_76142_0_)
  {
    p_76142_0_ %= 360.0F;
    if (p_76142_0_ >= 180.0F) {
      p_76142_0_ -= 360.0F;
    }
    if (p_76142_0_ < -180.0F) {
      p_76142_0_ += 360.0F;
    }
    return p_76142_0_;
  }
  
  public static double g(double p_76138_0_)
  {
    p_76138_0_ %= 360.0D;
    if (p_76138_0_ >= 180.0D) {
      p_76138_0_ -= 360.0D;
    }
    if (p_76138_0_ < -180.0D) {
      p_76138_0_ += 360.0D;
    }
    return p_76138_0_;
  }
  
  public static int a(String p_82715_0_, int p_82715_1_)
  {
    try
    {
      return Integer.parseInt(p_82715_0_);
    }
    catch (Throwable var3) {}
    return p_82715_1_;
  }
  
  public static int a(String p_82714_0_, int p_82714_1_, int p_82714_2_)
  {
    return Math.max(p_82714_2_, a(p_82714_0_, p_82714_1_));
  }
  
  public static double a(String p_82712_0_, double p_82712_1_)
  {
    try
    {
      return Double.parseDouble(p_82712_0_);
    }
    catch (Throwable var4) {}
    return p_82712_1_;
  }
  
  public static double a(String p_82713_0_, double p_82713_1_, double p_82713_3_)
  {
    return Math.max(p_82713_3_, a(p_82713_0_, p_82713_1_));
  }
  
  public static int b(int p_151236_0_)
  {
    int var1 = p_151236_0_ - 1;
    var1 |= var1 >> 1;
    var1 |= var1 >> 2;
    var1 |= var1 >> 4;
    var1 |= var1 >> 8;
    var1 |= var1 >> 16;
    return var1 + 1;
  }
  
  private static boolean d(int p_151235_0_)
  {
    return (p_151235_0_ != 0) && ((p_151235_0_ & p_151235_0_ - 1) == 0);
  }
  
  private static int e(int p_151241_0_)
  {
    p_151241_0_ = d(p_151241_0_) ? p_151241_0_ : b(p_151241_0_);
    return c[((int)(p_151241_0_ * 125613361L >> 27) & 0x1F)];
  }
  
  public static int c(int p_151239_0_)
  {
    return e(p_151239_0_) - (d(p_151239_0_) ? 0 : 1);
  }
  
  public static int c(int p_154354_0_, int p_154354_1_)
  {
    if (p_154354_1_ == 0) {
      return 0;
    }
    if (p_154354_0_ == 0) {
      return p_154354_1_;
    }
    if (p_154354_0_ < 0) {
      p_154354_1_ *= -1;
    }
    int var2 = p_154354_0_ % p_154354_1_;
    return var2 == 0 ? p_154354_0_ : p_154354_0_ + p_154354_1_ - var2;
  }
  
  public static int b(float p_180183_0_, float p_180183_1_, float p_180183_2_)
  {
    return b(d(p_180183_0_ * 255.0F), d(p_180183_1_ * 255.0F), d(p_180183_2_ * 255.0F));
  }
  
  public static int b(int p_180181_0_, int p_180181_1_, int p_180181_2_)
  {
    int var3 = (p_180181_0_ << 8) + p_180181_1_;
    var3 = (var3 << 8) + p_180181_2_;
    return var3;
  }
  
  public static int d(int p_180188_0_, int p_180188_1_)
  {
    int var2 = (p_180188_0_ & 0xFF0000) >> 16;
    int var3 = (p_180188_1_ & 0xFF0000) >> 16;
    int var4 = (p_180188_0_ & 0xFF00) >> 8;
    int var5 = (p_180188_1_ & 0xFF00) >> 8;
    int var6 = (p_180188_0_ & 0xFF) >> 0;
    int var7 = (p_180188_1_ & 0xFF) >> 0;
    int var8 = (int)(var2 * var3 / 255.0F);
    int var9 = (int)(var4 * var5 / 255.0F);
    int var10 = (int)(var6 * var7 / 255.0F);
    return p_180188_0_ & 0xFF000000 | var8 << 16 | var9 << 8 | var10;
  }
  
  public static double h(double p_500016_0_)
  {
    return p_500016_0_ - Math.floor(p_500016_0_);
  }
  
  public static long a(df pos)
  {
    return c(pos.n(), pos.o(), pos.p());
  }
  
  public static long c(int x, int y, int z)
  {
    long var3 = x * 3129871 ^ z * 116129781L ^ y;
    var3 = var3 * var3 * 42317861L + var3 * 11L;
    return var3;
  }
  
  public static UUID a(Random p_180182_0_)
  {
    long var1 = p_180182_0_.nextLong() & 0xFFFFFFFFFFFF0FFF | 0x4000;
    long var3 = p_180182_0_.nextLong() & 0x3FFFFFFFFFFFFFFF | 0x8000000000000000;
    return new UUID(var1, var3);
  }
  
  public static double c(double p_500017_0_, double p_500017_2_, double p_500017_4_)
  {
    return (p_500017_0_ - p_500017_2_) / (p_500017_4_ - p_500017_2_);
  }
  
  public static double b(double p_500018_0_, double p_500018_2_)
  {
    double var4 = p_500018_2_ * p_500018_2_ + p_500018_0_ * p_500018_0_;
    if (Double.isNaN(var4)) {
      return NaN.0D;
    }
    boolean var6 = p_500018_0_ < 0.0D;
    if (var6) {
      p_500018_0_ = -p_500018_0_;
    }
    boolean var7 = p_500018_2_ < 0.0D;
    if (var7) {
      p_500018_2_ = -p_500018_2_;
    }
    boolean var8 = p_500018_0_ > p_500018_2_;
    if (var8)
    {
      double var9 = p_500018_2_;
      p_500018_2_ = p_500018_0_;
      p_500018_0_ = var9;
    }
    double var9 = i(var4);
    p_500018_2_ *= var9;
    p_500018_0_ *= var9;
    double var11 = d + p_500018_0_;
    int var13 = (int)Double.doubleToRawLongBits(var11);
    double var14 = e[var13];
    double var16 = f[var13];
    double var18 = var11 - d;
    double var20 = p_500018_0_ * var16 - p_500018_2_ * var18;
    double var22 = (6.0D + var20 * var20) * var20 * 0.16666666666666666D;
    double var24 = var14 + var22;
    if (var8) {
      var24 = 1.5707963267948966D - var24;
    }
    if (var7) {
      var24 = 3.141592653589793D - var24;
    }
    if (var6) {
      var24 = -var24;
    }
    return var24;
  }
  
  public static double i(double p_500019_0_)
  {
    double var2 = 0.5D * p_500019_0_;
    long var4 = Double.doubleToRawLongBits(p_500019_0_);
    var4 = 6910469410427058090L - (var4 >> 1);
    p_500019_0_ = Double.longBitsToDouble(var4);
    p_500019_0_ *= (1.5D - var2 * p_500019_0_ * p_500019_0_);
    return p_500019_0_;
  }
  
  public static int c(float p_500020_0_, float p_500020_1_, float p_500020_2_)
  {
    int var3 = (int)(p_500020_0_ * 6.0F) % 6;
    float var4 = p_500020_0_ * 6.0F - var3;
    float var5 = p_500020_2_ * (1.0F - p_500020_1_);
    float var6 = p_500020_2_ * (1.0F - var4 * p_500020_1_);
    float var7 = p_500020_2_ * (1.0F - (1.0F - var4) * p_500020_1_);
    float var8;
    float var9;
    float var10;
    switch (var3)
    {
    case 0: 
      var8 = p_500020_2_;
      var9 = var7;
      var10 = var5;
      break;
    case 1: 
      var8 = var6;
      var9 = p_500020_2_;
      var10 = var5;
      break;
    case 2: 
      var8 = var5;
      var9 = p_500020_2_;
      var10 = var7;
      break;
    case 3: 
      var8 = var5;
      var9 = var6;
      var10 = p_500020_2_;
      break;
    case 4: 
      var8 = var7;
      var9 = var5;
      var10 = p_500020_2_;
      break;
    case 5: 
      var8 = p_500020_2_;
      var9 = var5;
      var10 = var6;
      break;
    default: 
      throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + p_500020_0_ + ", " + p_500020_1_ + ", " + p_500020_2_);
    }
    int var11 = a((int)(var8 * 255.0F), 0, 255);
    int var12 = a((int)(var9 * 255.0F), 0, 255);
    int var13 = a((int)(var10 * 255.0F), 0, 255);
    return var11 << 16 | var12 << 8 | var13;
  }
  
  static
  {
    for (int var0 = 0; var0 < 65536; var0++) {
      b[var0] = ((float)Math.sin(var0 * 3.141592653589793D * 2.0D / 65536.0D));
    }
    for (int i = 0; i < 4096; i++) {
      SIN_TABLE_FAST[i] = ((float)Math.sin((i + 0.5F) / 4096.0F * 6.2831855F));
    }
    for (int i = 0; i < 360; i += 90) {
      SIN_TABLE_FAST[((int)(i * 11.377778F) & 0xFFF)] = ((float)Math.sin(i * 0.017453292F));
    }
    c = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
    d = Double.longBitsToDouble(4805340802404319232L);
    e = new double['ā'];
    f = new double['ā'];
    for (var0 = 0; var0 < 257; var0++)
    {
      double var1 = var0 / 256.0D;
      double var3 = Math.asin(var1);
      f[var0] = Math.cos(var3);
      e[var0] = var3;
    }
  }
}
