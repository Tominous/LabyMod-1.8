public class adg
{
  public final int a;
  public final int b;
  
  public adg(int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public static long a(int ☃, int ☃)
  {
    return ☃ & 0xFFFFFFFF | (☃ & 0xFFFFFFFF) << 32;
  }
  
  public int hashCode()
  {
    int ☃ = 1664525 * this.a + 1013904223;
    int ☃ = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
    return ☃ ^ ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof adg))
    {
      adg ☃ = (adg)☃;
      
      return (this.a == ☃.a) && (this.b == ☃.b);
    }
    return false;
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
  
  public cj a(int ☃, int ☃, int ☃)
  {
    return new cj((this.a << 4) + ☃, ☃, (this.b << 4) + ☃);
  }
  
  public cj a(int ☃)
  {
    return new cj(a(), ☃, b());
  }
  
  public String toString()
  {
    return "[" + this.a + ", " + this.b + "]";
  }
}
