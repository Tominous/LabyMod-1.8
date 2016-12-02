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
    a = ☃;
    b = ☃;
    c = ☃;
    
    j = a(☃, ☃, ☃);
  }
  
  public static int a(int ☃, int ☃, int ☃)
  {
    return ☃ & 0xFF | (☃ & 0x7FFF) << 8 | (☃ & 0x7FFF) << 24 | (☃ < 0 ? Integer.MIN_VALUE : 0) | (☃ < 0 ? 32768 : 0);
  }
  
  public float a(asv ☃)
  {
    float ☃ = a - a;
    float ☃ = b - b;
    float ☃ = c - c;
    return ns.c(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public float b(asv ☃)
  {
    float ☃ = a - a;
    float ☃ = b - b;
    float ☃ = c - c;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if ((☃ instanceof asv))
    {
      asv ☃ = (asv)☃;
      return (j == j) && (a == a) && (b == b) && (c == c);
    }
    return false;
  }
  
  public int hashCode()
  {
    return j;
  }
  
  public boolean a()
  {
    return d >= 0;
  }
  
  public String toString()
  {
    return a + ", " + b + ", " + c;
  }
}
