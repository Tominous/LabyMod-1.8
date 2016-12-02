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
    d = ☃;
    a = o;
    f = ☃;
    g = ☃.s();
    c = ☃;
    b = ☃;
    a(3);
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
    }
  }
  
  public boolean a()
  {
    pr ☃ = d.co();
    if (☃ == null) {
      return false;
    }
    if (((☃ instanceof wn)) && (((wn)☃).v())) {
      return false;
    }
    if (d.cn()) {
      return false;
    }
    if (d.h(☃) < c * c) {
      return false;
    }
    e = ☃;
    return true;
  }
  
  public boolean b()
  {
    return (!g.m()) && (d.h(e) > b * b) && (!d.cn());
  }
  
  public void c()
  {
    h = 0;
    i = ((sv)d.s()).e();
    ((sv)d.s()).a(false);
  }
  
  public void d()
  {
    e = null;
    g.n();
    ((sv)d.s()).a(true);
  }
  
  private boolean a(cj ☃)
  {
    alz ☃ = a.p(☃);
    afh ☃ = ☃.c();
    if (☃ == afi.a) {
      return true;
    }
    return !☃.d();
  }
  
  public void e()
  {
    d.p().a(e, 10.0F, d.bQ());
    if (d.cn()) {
      return;
    }
    if (--h > 0) {
      return;
    }
    h = 10;
    if (g.a(e, f)) {
      return;
    }
    if (d.cc()) {
      return;
    }
    if (d.h(e) < 144.0D) {
      return;
    }
    int ☃ = ns.c(e.s) - 2;
    int ☃ = ns.c(e.u) - 2;
    int ☃ = ns.c(e.aR().b);
    for (int ☃ = 0; ☃ <= 4; ☃++) {
      for (int ☃ = 0; ☃ <= 4; ☃++) {
        if ((☃ < 1) || (☃ < 1) || (☃ > 3) || (☃ > 3)) {
          if ((adm.a(a, new cj(☃ + ☃, ☃ - 1, ☃ + ☃))) && (a(new cj(☃ + ☃, ☃, ☃ + ☃))) && (a(new cj(☃ + ☃, ☃ + 1, ☃ + ☃))))
          {
            d.b(☃ + ☃ + 0.5F, ☃, ☃ + ☃ + 0.5F, d.y, d.z);
            g.n();
            return;
          }
        }
      }
    }
  }
}
