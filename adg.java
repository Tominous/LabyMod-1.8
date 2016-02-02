public class adg
{
  public final int a;
  public final int b;
  private static final String __OBFID = "CL_00000133";
  private int cachedHashCode = 0;
  
  public adg(int x, int z)
  {
    this.a = x;
    this.b = z;
  }
  
  public static long a(int x, int z)
  {
    return x & 0xFFFFFFFF | (z & 0xFFFFFFFF) << 32;
  }
  
  public int hashCode()
  {
    if (this.cachedHashCode == 0)
    {
      int var1 = 1664525 * this.a + 1013904223;
      int var2 = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
      this.cachedHashCode = (var1 ^ var2);
    }
    return this.cachedHashCode;
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
    return (this.a == var2.a) && (this.b == var2.b);
  }
  
  public int a()
  {
    return (this.a << 4) + 8;
  }
  
  public int b()
  {
    return (this.b << 4) + 8;
  }
  
  public int c()
  {
    return this.a << 4;
  }
  
  public int d()
  {
    return this.b << 4;
  }
  
  public int e()
  {
    return (this.a << 4) + 15;
  }
  
  public int f()
  {
    return (this.b << 4) + 15;
  }
  
  public cj a(int x, int y, int z)
  {
    return new cj((this.a << 4) + x, y, (this.b << 4) + z);
  }
  
  public cj a(int y)
  {
    return new cj(a(), y, b());
  }
  
  public String toString()
  {
    return "[" + this.a + ", " + this.b + "]";
  }
}
