public class adg
{
  public final int a;
  public final int b;
  private static final String __OBFID = "CL_00000133";
  private int cachedHashCode = 0;
  
  public adg(int x, int z)
  {
    a = x;
    b = z;
  }
  
  public static long a(int x, int z)
  {
    return x & 0xFFFFFFFF | (z & 0xFFFFFFFF) << 32;
  }
  
  public int hashCode()
  {
    if (cachedHashCode == 0)
    {
      int var1 = 1664525 * a + 1013904223;
      int var2 = 1664525 * (b ^ 0xDEADBEEF) + 1013904223;
      cachedHashCode = (var1 ^ var2);
    }
    return cachedHashCode;
  }
  
  public boolean equals(Object p_equals_1_)
  {
    if (this == p_equals_1_) {
      return true;
    }
    if (!(p_equals_1_ instanceof adg)) {
      return false;
    }
    adg var2 = (adg)p_equals_1_;
    return (a == a) && (b == b);
  }
  
  public int a()
  {
    return (a << 4) + 8;
  }
  
  public int b()
  {
    return (b << 4) + 8;
  }
  
  public int c()
  {
    return a << 4;
  }
  
  public int d()
  {
    return b << 4;
  }
  
  public int e()
  {
    return (a << 4) + 15;
  }
  
  public int f()
  {
    return (b << 4) + 15;
  }
  
  public cj a(int x, int y, int z)
  {
    return new cj((a << 4) + x, y, (b << 4) + z);
  }
  
  public cj a(int y)
  {
    return new cj(a(), y, b());
  }
  
  public String toString()
  {
    return "[" + a + ", " + b + "]";
  }
}
