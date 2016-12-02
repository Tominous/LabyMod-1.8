public class avr
{
  private final double a;
  private final double b;
  private int c;
  private int d;
  private int e;
  
  public avr(ave ☃)
  {
    this.c = ☃.d;
    this.d = ☃.e;
    this.e = 1;
    
    boolean ☃ = ☃.d();
    int ☃ = ☃.t.aK;
    if (☃ == 0) {
      ☃ = 1000;
    }
    while ((this.e < ☃) && (this.c / (this.e + 1) >= 320) && (this.d / (this.e + 1) >= 240)) {
      this.e += 1;
    }
    if ((☃) && (this.e % 2 != 0) && (this.e != 1)) {
      this.e -= 1;
    }
    this.a = (this.c / this.e);
    this.b = (this.d / this.e);
    this.c = ns.f(this.a);
    this.d = ns.f(this.b);
  }
  
  public int a()
  {
    return this.c;
  }
  
  public int b()
  {
    return this.d;
  }
  
  public double c()
  {
    return this.a;
  }
  
  public double d()
  {
    return this.b;
  }
  
  public int e()
  {
    return this.e;
  }
}
