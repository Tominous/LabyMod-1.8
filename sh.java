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
    this.a = ☃;
    this.b = ☃;
    this.k = ☃;
    this.l = ☃;
    a(3);
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
    }
  }
  
  public boolean a()
  {
    if (this.i > 0)
    {
      this.i -= 1;
      return false;
    }
    this.h = this.a.o.a(this.a, 10.0D);
    if (this.h == null) {
      return false;
    }
    zx ☃ = this.h.bZ();
    if (☃ == null) {
      return false;
    }
    if (☃.b() != this.k) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    if (this.l)
    {
      if (this.a.h(this.h) < 36.0D)
      {
        if (this.h.e(this.c, this.d, this.e) > 0.010000000000000002D) {
          return false;
        }
        if ((Math.abs(this.h.z - this.f) > 5.0D) || (Math.abs(this.h.y - this.g) > 5.0D)) {
          return false;
        }
      }
      else
      {
        this.c = this.h.s;
        this.d = this.h.t;
        this.e = this.h.u;
      }
      this.f = this.h.z;
      this.g = this.h.y;
    }
    return a();
  }
  
  public void c()
  {
    this.c = this.h.s;
    this.d = this.h.t;
    this.e = this.h.u;
    this.j = true;
    this.m = ((sv)this.a.s()).e();
    ((sv)this.a.s()).a(false);
  }
  
  public void d()
  {
    this.h = null;
    this.a.s().n();
    this.i = 100;
    this.j = false;
    ((sv)this.a.s()).a(this.m);
  }
  
  public void e()
  {
    this.a.p().a(this.h, 30.0F, this.a.bQ());
    if (this.a.h(this.h) < 6.25D) {
      this.a.s().n();
    } else {
      this.a.s().a(this.h, this.b);
    }
  }
  
  public boolean f()
  {
    return this.j;
  }
}
