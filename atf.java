public class atf
{
  private byte a;
  private byte b;
  private byte c;
  private byte d;
  
  public atf(byte ☃, byte ☃, byte ☃, byte ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public atf(atf ☃)
  {
    a = a;
    b = b;
    c = c;
    d = d;
  }
  
  public byte a()
  {
    return a;
  }
  
  public byte b()
  {
    return b;
  }
  
  public byte c()
  {
    return c;
  }
  
  public byte d()
  {
    return d;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (!(☃ instanceof atf)) {
      return false;
    }
    atf ☃ = (atf)☃;
    if (a != a) {
      return false;
    }
    if (d != d) {
      return false;
    }
    if (b != b) {
      return false;
    }
    if (c != c) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = a;
    ☃ = 31 * ☃ + b;
    ☃ = 31 * ☃ + c;
    ☃ = 31 * ☃ + d;
    return ☃;
  }
}
