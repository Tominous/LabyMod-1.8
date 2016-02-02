public class rq
  extends rd
{
  private py a;
  private pr b;
  private double c;
  private double d;
  private double e;
  private double f;
  private float g;
  
  public rq(py ☃, double ☃, float ☃)
  {
    this.a = ☃;
    this.f = ☃;
    this.g = ☃;
    a(1);
  }
  
  public boolean a()
  {
    this.b = this.a.u();
    if (this.b == null) {
      return false;
    }
    if (this.b.h(this.a) > this.g * this.g) {
      return false;
    }
    aui ☃ = tc.a(this.a, 16, 7, new aui(this.b.s, this.b.t, this.b.u));
    if (☃ == null) {
      return false;
    }
    this.c = ☃.a;
    this.d = ☃.b;
    this.e = ☃.c;
    return true;
  }
  
  public boolean b()
  {
    return (!this.a.s().m()) && (this.b.ai()) && (this.b.h(this.a) < this.g * this.g);
  }
  
  public void d()
  {
    this.b = null;
  }
  
  public void c()
  {
    this.a.s().a(this.c, this.d, this.e, this.f);
  }
}
