import java.util.Random;

public class rk
  extends rd
{
  private wi b;
  private wi c;
  private adm d;
  private int e;
  tf a;
  
  public rk(wi ☃)
  {
    this.b = ☃;
    this.d = ☃.o;
    a(3);
  }
  
  public boolean a()
  {
    if (this.b.l() != 0) {
      return false;
    }
    if (this.b.bc().nextInt(500) != 0) {
      return false;
    }
    this.a = this.d.ae().a(new cj(this.b), 0);
    if (this.a == null) {
      return false;
    }
    if ((!f()) || (!this.b.n(true))) {
      return false;
    }
    pk ☃ = this.d.a(wi.class, this.b.aR().b(8.0D, 3.0D, 8.0D), this.b);
    if (☃ == null) {
      return false;
    }
    this.c = ((wi)☃);
    if ((this.c.l() != 0) || (!this.c.n(true))) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    this.e = 300;
    this.b.l(true);
  }
  
  public void d()
  {
    this.a = null;
    this.c = null;
    this.b.l(false);
  }
  
  public boolean b()
  {
    return (this.e >= 0) && (f()) && (this.b.l() == 0) && (this.b.n(false));
  }
  
  public void e()
  {
    this.e -= 1;
    this.b.p().a(this.c, 10.0F, 30.0F);
    if (this.b.h(this.c) > 2.25D) {
      this.b.s().a(this.c, 0.25D);
    } else if ((this.e == 0) && (this.c.cm())) {
      g();
    }
    if (this.b.bc().nextInt(35) == 0) {
      this.d.a(this.b, (byte)12);
    }
  }
  
  private boolean f()
  {
    if (!this.a.i()) {
      return false;
    }
    int ☃ = (int)(this.a.c() * 0.35D);
    return this.a.e() < ☃;
  }
  
  private void g()
  {
    wi ☃ = this.b.b(this.c);
    this.c.b(6000);
    this.b.b(6000);
    this.c.o(false);
    this.b.o(false);
    ☃.b(41536);
    ☃.b(this.b.s, this.b.t, this.b.u, 0.0F, 0.0F);
    this.d.d(☃);
    this.d.a(☃, (byte)12);
  }
}
