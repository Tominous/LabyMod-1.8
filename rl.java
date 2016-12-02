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
    g = ☃;
  }
  
  public rl(py ☃, double ☃, boolean ☃)
  {
    b = ☃;
    a = o;
    d = ☃;
    e = ☃;
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = b.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    if ((g != null) && (!g.isAssignableFrom(☃.getClass()))) {
      return false;
    }
    f = b.s().a(☃);
    return f != null;
  }
  
  public boolean b()
  {
    pr ☃ = b.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    if (!e)
    {
      if (b.s().m()) {
        return false;
      }
      return true;
    }
    if (!b.e(new cj(☃))) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    b.s().a(f, d);
    h = 0;
  }
  
  public void d()
  {
    b.s().n();
  }
  
  public void e()
  {
    pr ☃ = b.u();
    b.p().a(☃, 30.0F, 30.0F);
    double ☃ = b.e(s, aRb, u);
    double ☃ = a(☃);
    h -= 1;
    if (((e) || (b.t().a(☃))) && 
      (h <= 0) && (
      ((i == 0.0D) && (j == 0.0D) && (k == 0.0D)) || (☃.e(i, j, k) >= 1.0D) || (b.bc().nextFloat() < 0.05F)))
    {
      i = s;
      j = aRb;
      k = u;
      h = (4 + b.bc().nextInt(7));
      if (☃ > 1024.0D) {
        h += 10;
      } else if (☃ > 256.0D) {
        h += 5;
      }
      if (!b.s().a(☃, d)) {
        h += 15;
      }
    }
    c = Math.max(c - 1, 0);
    if ((☃ <= ☃) && (c <= 0))
    {
      c = 20;
      if (b.bA() != null) {
        b.bw();
      }
      b.r(☃);
    }
  }
  
  protected double a(pr ☃)
  {
    return b.J * 2.0F * (b.J * 2.0F) + J;
  }
}
