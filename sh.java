public class sh
  extends rd
{
  private py a;
  private double b;
  private double c;
  private double d;
  private double e;
  private double f;
  private double g;
  private wn h;
  private int i;
  private boolean j;
  private zw k;
  private boolean l;
  private boolean m;
  
  public sh(py ☃, double ☃, zw ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    k = ☃;
    l = ☃;
    a(3);
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
    }
  }
  
  public boolean a()
  {
    if (i > 0)
    {
      i -= 1;
      return false;
    }
    h = a.o.a(a, 10.0D);
    if (h == null) {
      return false;
    }
    zx ☃ = h.bZ();
    if (☃ == null) {
      return false;
    }
    if (☃.b() != k) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    if (l)
    {
      if (a.h(h) < 36.0D)
      {
        if (h.e(c, d, e) > 0.010000000000000002D) {
          return false;
        }
        if ((Math.abs(h.z - f) > 5.0D) || (Math.abs(h.y - g) > 5.0D)) {
          return false;
        }
      }
      else
      {
        c = h.s;
        d = h.t;
        e = h.u;
      }
      f = h.z;
      g = h.y;
    }
    return a();
  }
  
  public void c()
  {
    c = h.s;
    d = h.t;
    e = h.u;
    j = true;
    m = ((sv)a.s()).e();
    ((sv)a.s()).a(false);
  }
  
  public void d()
  {
    h = null;
    a.s().n();
    i = 100;
    j = false;
    ((sv)a.s()).a(m);
  }
  
  public void e()
  {
    a.p().a(h, 30.0F, a.bQ());
    if (a.h(h) < 6.25D) {
      a.s().n();
    } else {
      a.s().a(h, b);
    }
  }
  
  public boolean f()
  {
    return j;
  }
}
