public class asx
{
  private final asv[] a;
  private int b;
  private int c;
  
  public asx(asv[] ☃)
  {
    this.a = ☃;
    this.c = ☃.length;
  }
  
  public void a()
  {
    this.b += 1;
  }
  
  public boolean b()
  {
    return this.b >= this.c;
  }
  
  public asv c()
  {
    if (this.c > 0) {
      return this.a[(this.c - 1)];
    }
    return null;
  }
  
  public asv a(int ☃)
  {
    return this.a[☃];
  }
  
  public int d()
  {
    return this.c;
  }
  
  public void b(int ☃)
  {
    this.c = ☃;
  }
  
  public int e()
  {
    return this.b;
  }
  
  public void c(int ☃)
  {
    this.b = ☃;
  }
  
  public aui a(pk ☃, int ☃)
  {
    double ☃ = this.a[☃].a + (int)(☃.J + 1.0F) * 0.5D;
    double ☃ = this.a[☃].b;
    double ☃ = this.a[☃].c + (int)(☃.J + 1.0F) * 0.5D;
    return new aui(☃, ☃, ☃);
  }
  
  public aui a(pk ☃)
  {
    return a(☃, this.b);
  }
  
  public boolean a(asx ☃)
  {
    if (☃ == null) {
      return false;
    }
    if (☃.a.length != this.a.length) {
      return false;
    }
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if ((this.a[☃].a != ☃.a[☃].a) || (this.a[☃].b != ☃.a[☃].b) || (this.a[☃].c != ☃.a[☃].c)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean b(aui ☃)
  {
    asv ☃ = c();
    if (☃ == null) {
      return false;
    }
    return (☃.a == (int)☃.a) && (☃.c == (int)☃.c);
  }
}
