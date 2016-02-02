public class asv
{
  public final int a;
  public final int b;
  public final int c;
  private final int j;
  int d = -1;
  float e;
  float f;
  float g;
  asv h;
  public boolean i;
  
  public asv(int ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    
    this.j = a(☃, ☃, ☃);
  }
  
  public static int a(int ☃, int ☃, int ☃)
  {
    return ☃ & 0xFF | (☃ & 0x7FFF) << 8 | (☃ & 0x7FFF) << 24 | (☃ < 0 ? Integer.MIN_VALUE : 0) | (☃ < 0 ? 32768 : 0);
  }
  
  public float a(asv ☃)
  {
    float ☃ = ☃.a - this.a;
    float ☃ = ☃.b - this.b;
    float ☃ = ☃.c - this.c;
    return ns.c(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public float b(asv ☃)
  {
    float ☃ = ☃.a - this.a;
    float ☃ = ☃.b - this.b;
    float ☃ = ☃.c - this.c;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if ((☃ instanceof asv))
    {
      asv ☃ = (asv)☃;
      return (this.j == ☃.j) && (this.a == ☃.a) && (this.b == ☃.b) && (this.c == ☃.c);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.j;
  }
  
  public boolean a()
  {
    return this.d >= 0;
  }
  
  public String toString()
  {
    return this.a + ", " + this.b + ", " + this.c;
  }
}
