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
    this.b = ☃;
    this.a = ((ps)☃);
    this.e = ☃;
    this.g = ☃;
    this.h = ☃;
    this.i = ☃;
    this.j = (☃ * ☃);
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = this.a.u();
    if (☃ == null) {
      return false;
    }
    this.c = ☃;
    return true;
  }
  
  public boolean b()
  {
    return (a()) || (!this.a.s().m());
  }
  
  public void d()
  {
    this.c = null;
    this.f = 0;
    this.d = -1;
  }
  
  public void e()
  {
    double ☃ = this.a.e(this.c.s, this.c.aR().b, this.c.u);
    boolean ☃ = this.a.t().a(this.c);
    if (☃) {
      this.f += 1;
    } else {
      this.f = 0;
    }
    if ((☃ > this.j) || (this.f < 20)) {
      this.a.s().a(this.c, this.e);
    } else {
      this.a.s().n();
    }
    this.a.p().a(this.c, 30.0F, 30.0F);
    if (--this.d == 0)
    {
      if ((☃ > this.j) || (!☃)) {
        return;
      }
      float ☃ = ns.a(☃) / this.i;
      float ☃ = ☃;
      ☃ = ns.a(☃, 0.1F, 1.0F);
      
      this.b.a(this.c, ☃);
      this.d = ns.d(☃ * (this.h - this.g) + this.g);
    }
    else if (this.d < 0)
    {
      float ☃ = ns.a(☃) / this.i;
      this.d = ns.d(☃ * (this.h - this.g) + this.g);
    }
  }
}
