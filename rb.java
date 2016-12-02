public class rb
  extends rd
{
  private qa d;
  private pr e;
  adm a;
  private double f;
  private sw g;
  private int h;
  float b;
  float c;
  private boolean i;
  
  public rb(qa ☃, double ☃, float ☃, float ☃)
  {
    this.d = ☃;
    this.a = ☃.o;
    this.f = ☃;
    this.g = ☃.s();
    this.c = ☃;
    this.b = ☃;
    a(3);
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
    }
  }
  
  public boolean a()
  {
    pr ☃ = this.d.co();
    if (☃ == null) {
      return false;
    }
    if (((☃ instanceof wn)) && (((wn)☃).v())) {
      return false;
    }
    if (this.d.cn()) {
      return false;
    }
    if (this.d.h(☃) < this.c * this.c) {
      return false;
    }
    this.e = ☃;
    return true;
  }
  
  public boolean b()
  {
    return (!this.g.m()) && (this.d.h(this.e) > this.b * this.b) && (!this.d.cn());
  }
  
  public void c()
  {
    this.h = 0;
    this.i = ((sv)this.d.s()).e();
    ((sv)this.d.s()).a(false);
  }
  
  public void d()
  {
    this.e = null;
    this.g.n();
    ((sv)this.d.s()).a(true);
  }
  
  private boolean a(cj ☃)
  {
    alz ☃ = this.a.p(☃);
    afh ☃ = ☃.c();
    if (☃ == afi.a) {
      return true;
    }
    return !☃.d();
  }
  
  public void e()
  {
    this.d.p().a(this.e, 10.0F, this.d.bQ());
    if (this.d.cn()) {
      return;
    }
    if (--this.h > 0) {
      return;
    }
    this.h = 10;
    if (this.g.a(this.e, this.f)) {
      return;
    }
    if (this.d.cc()) {
      return;
    }
    if (this.d.h(this.e) < 144.0D) {
      return;
    }
    int ☃ = ns.c(this.e.s) - 2;
    int ☃ = ns.c(this.e.u) - 2;
    int ☃ = ns.c(this.e.aR().b);
    for (int ☃ = 0; ☃ <= 4; ☃++) {
      for (int ☃ = 0; ☃ <= 4; ☃++) {
        if ((☃ < 1) || (☃ < 1) || (☃ > 3) || (☃ > 3)) {
          if ((adm.a(this.a, new cj(☃ + ☃, ☃ - 1, ☃ + ☃))) && (a(new cj(☃ + ☃, ☃, ☃ + ☃))) && (a(new cj(☃ + ☃, ☃ + 1, ☃ + ☃))))
          {
            this.d.b(☃ + ☃ + 0.5F, ☃, ☃ + ☃ + 0.5F, this.d.y, this.d.z);
            this.g.n();
            return;
          }
        }
      }
    }
  }
}
