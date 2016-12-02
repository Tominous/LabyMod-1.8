public class rr
  extends rd
{
  adm a;
  ps b;
  pr c;
  int d;
  
  public rr(ps ☃)
  {
    this.b = ☃;
    this.a = ☃.o;
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = this.b.u();
    if (☃ == null) {
      return false;
    }
    this.c = ☃;
    return true;
  }
  
  public boolean b()
  {
    if (!this.c.ai()) {
      return false;
    }
    if (this.b.h(this.c) > 225.0D) {
      return false;
    }
    return (!this.b.s().m()) || (a());
  }
  
  public void d()
  {
    this.c = null;
    this.b.s().n();
  }
  
  public void e()
  {
    this.b.p().a(this.c, 30.0F, 30.0F);
    
    double ☃ = this.b.J * 2.0F * (this.b.J * 2.0F);
    double ☃ = this.b.e(this.c.s, this.c.aR().b, this.c.u);
    
    double ☃ = 0.8D;
    if ((☃ > ☃) && (☃ < 16.0D)) {
      ☃ = 1.33D;
    } else if (☃ < 225.0D) {
      ☃ = 0.6D;
    }
    this.b.s().a(this.c, ☃);
    
    this.d = Math.max(this.d - 1, 0);
    if (☃ > ☃) {
      return;
    }
    if (this.d > 0) {
      return;
    }
    this.d = 20;
    this.b.r(this.c);
  }
}
