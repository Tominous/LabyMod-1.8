import java.util.Random;

public class rl
  extends rd
{
  adm a;
  protected py b;
  int c;
  double d;
  boolean e;
  asx f;
  Class<? extends pk> g;
  private int h;
  private double i;
  private double j;
  private double k;
  
  public rl(py ☃, Class<? extends pk> ☃, double ☃, boolean ☃)
  {
    this(☃, ☃, ☃);
    this.g = ☃;
  }
  
  public rl(py ☃, double ☃, boolean ☃)
  {
    this.b = ☃;
    this.a = ☃.o;
    this.d = ☃;
    this.e = ☃;
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = this.b.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    if ((this.g != null) && (!this.g.isAssignableFrom(☃.getClass()))) {
      return false;
    }
    this.f = this.b.s().a(☃);
    return this.f != null;
  }
  
  public boolean b()
  {
    pr ☃ = this.b.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    if (!this.e)
    {
      if (this.b.s().m()) {
        return false;
      }
      return true;
    }
    if (!this.b.e(new cj(☃))) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    this.b.s().a(this.f, this.d);
    this.h = 0;
  }
  
  public void d()
  {
    this.b.s().n();
  }
  
  public void e()
  {
    pr ☃ = this.b.u();
    this.b.p().a(☃, 30.0F, 30.0F);
    double ☃ = this.b.e(☃.s, ☃.aR().b, ☃.u);
    double ☃ = a(☃);
    this.h -= 1;
    if (((this.e) || (this.b.t().a(☃))) && 
      (this.h <= 0) && (
      ((this.i == 0.0D) && (this.j == 0.0D) && (this.k == 0.0D)) || (☃.e(this.i, this.j, this.k) >= 1.0D) || (this.b.bc().nextFloat() < 0.05F)))
    {
      this.i = ☃.s;
      this.j = ☃.aR().b;
      this.k = ☃.u;
      this.h = (4 + this.b.bc().nextInt(7));
      if (☃ > 1024.0D) {
        this.h += 10;
      } else if (☃ > 256.0D) {
        this.h += 5;
      }
      if (!this.b.s().a(☃, this.d)) {
        this.h += 15;
      }
    }
    this.c = Math.max(this.c - 1, 0);
    if ((☃ <= ☃) && (this.c <= 0))
    {
      this.c = 20;
      if (this.b.bA() != null) {
        this.b.bw();
      }
      this.b.r(☃);
    }
  }
  
  protected double a(pr ☃)
  {
    return this.b.J * 2.0F * (this.b.J * 2.0F) + ☃.J;
  }
}
