public class sa
  extends rd
{
  private final ps a;
  private final vx b;
  private pr c;
  private int d = -1;
  private double e;
  private int f;
  private int g;
  private int h;
  private float i;
  private float j;
  
  public sa(vx ☃, double ☃, int ☃, float ☃)
  {
    this(☃, ☃, ☃, ☃, ☃);
  }
  
  public sa(vx ☃, double ☃, int ☃, int ☃, float ☃)
  {
    if (!(☃ instanceof pr)) {
      throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
    }
    b = ☃;
    a = ((ps)☃);
    e = ☃;
    g = ☃;
    h = ☃;
    i = ☃;
    j = (☃ * ☃);
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = a.u();
    if (☃ == null) {
      return false;
    }
    c = ☃;
    return true;
  }
  
  public boolean b()
  {
    return (a()) || (!a.s().m());
  }
  
  public void d()
  {
    c = null;
    f = 0;
    d = -1;
  }
  
  public void e()
  {
    double ☃ = a.e(c.s, c.aR().b, c.u);
    boolean ☃ = a.t().a(c);
    if (☃) {
      f += 1;
    } else {
      f = 0;
    }
    if ((☃ > j) || (f < 20)) {
      a.s().a(c, e);
    } else {
      a.s().n();
    }
    a.p().a(c, 30.0F, 30.0F);
    if (--d == 0)
    {
      if ((☃ > j) || (!☃)) {
        return;
      }
      float ☃ = ns.a(☃) / i;
      float ☃ = ☃;
      ☃ = ns.a(☃, 0.1F, 1.0F);
      
      b.a(c, ☃);
      d = ns.d(☃ * (h - g) + g);
    }
    else if (d < 0)
    {
      float ☃ = ns.a(☃) / i;
      d = ns.d(☃ * (h - g) + g);
    }
  }
}
