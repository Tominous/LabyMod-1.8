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
    this.a = ☃;
    this.c = ☃.o;
    this.d = ☃;
    a(2);
  }
  
  public boolean a()
  {
    this.b = this.c.a(this.a, this.d);
    if (this.b == null) {
      return false;
    }
    return a(this.b);
  }
  
  public boolean b()
  {
    if (!this.b.ai()) {
      return false;
    }
    if (this.a.h(this.b) > this.d * this.d) {
      return false;
    }
    return (this.e > 0) && (a(this.b));
  }
  
  public void c()
  {
    this.a.p(true);
    this.e = (40 + this.a.bc().nextInt(40));
  }
  
  public void d()
  {
    this.a.p(false);
    this.b = null;
  }
  
  public void e()
  {
    this.a.p().a(this.b.s, this.b.t + this.b.aS(), this.b.u, 10.0F, this.a.bQ());
    this.e -= 1;
  }
  
  private boolean a(wn ☃)
  {
    zx ☃ = ☃.bi.h();
    if (☃ == null) {
      return false;
    }
    if ((!this.a.cl()) && (☃.b() == zy.aX)) {
      return true;
    }
    return this.a.d(☃);
  }
}
