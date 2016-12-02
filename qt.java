import java.util.Random;

public class qt
  extends rd
{
  private ua a;
  private wn b;
  private adm c;
  private float d;
  private int e;
  
  public qt(ua ☃, float ☃)
  {
    a = ☃;
    c = o;
    d = ☃;
    a(2);
  }
  
  public boolean a()
  {
    b = c.a(a, d);
    if (b == null) {
      return false;
    }
    return a(b);
  }
  
  public boolean b()
  {
    if (!b.ai()) {
      return false;
    }
    if (a.h(b) > d * d) {
      return false;
    }
    return (e > 0) && (a(b));
  }
  
  public void c()
  {
    a.p(true);
    e = (40 + a.bc().nextInt(40));
  }
  
  public void d()
  {
    a.p(false);
    b = null;
  }
  
  public void e()
  {
    a.p().a(b.s, b.t + b.aS(), b.u, 10.0F, a.bQ());
    e -= 1;
  }
  
  private boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if (☃ == null) {
      return false;
    }
    if ((!a.cl()) && (☃.b() == zy.aX)) {
      return true;
    }
    return a.d(☃);
  }
}
