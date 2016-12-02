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
    b = ☃;
    d = o;
    a(3);
  }
  
  public boolean a()
  {
    if (b.l() != 0) {
      return false;
    }
    if (b.bc().nextInt(500) != 0) {
      return false;
    }
    a = d.ae().a(new cj(b), 0);
    if (a == null) {
      return false;
    }
    if ((!f()) || (!b.n(true))) {
      return false;
    }
    pk ☃ = d.a(wi.class, b.aR().b(8.0D, 3.0D, 8.0D), b);
    if (☃ == null) {
      return false;
    }
    c = ((wi)☃);
    if ((c.l() != 0) || (!c.n(true))) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    e = 300;
    b.l(true);
  }
  
  public void d()
  {
    a = null;
    c = null;
    b.l(false);
  }
  
  public boolean b()
  {
    return (e >= 0) && (f()) && (b.l() == 0) && (b.n(false));
  }
  
  public void e()
  {
    e -= 1;
    b.p().a(c, 10.0F, 30.0F);
    if (b.h(c) > 2.25D) {
      b.s().a(c, 0.25D);
    } else if ((e == 0) && (c.cm())) {
      g();
    }
    if (b.bc().nextInt(35) == 0) {
      d.a(b, (byte)12);
    }
  }
  
  private boolean f()
  {
    if (!a.i()) {
      return false;
    }
    int ☃ = (int)(a.c() * 0.35D);
    return a.e() < ☃;
  }
  
  private void g()
  {
    wi ☃ = b.b(c);
    c.b(6000);
    b.b(6000);
    c.o(false);
    b.o(false);
    ☃.b(41536);
    ☃.b(b.s, b.t, b.u, 0.0F, 0.0F);
    d.d(☃);
    d.a(☃, (byte)12);
  }
}
