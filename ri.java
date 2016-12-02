import java.util.Random;

public class ri
  extends rd
{
  protected ps a;
  protected pk b;
  protected float c;
  private int e;
  private float f;
  protected Class<? extends pk> d;
  
  public ri(ps ☃, Class<? extends pk> ☃, float ☃)
  {
    a = ☃;
    d = ☃;
    c = ☃;
    f = 0.02F;
    a(2);
  }
  
  public ri(ps ☃, Class<? extends pk> ☃, float ☃, float ☃)
  {
    a = ☃;
    d = ☃;
    c = ☃;
    f = ☃;
    a(2);
  }
  
  public boolean a()
  {
    if (a.bc().nextFloat() >= f) {
      return false;
    }
    if (a.u() != null) {
      b = a.u();
    }
    if (d == wn.class) {
      b = a.o.a(a, c);
    } else {
      b = a.o.a(d, a.aR().b(c, 3.0D, c), a);
    }
    return b != null;
  }
  
  public boolean b()
  {
    if (!b.ai()) {
      return false;
    }
    if (a.h(b) > c * c) {
      return false;
    }
    return e > 0;
  }
  
  public void c()
  {
    e = (40 + a.bc().nextInt(40));
  }
  
  public void d()
  {
    b = null;
  }
  
  public void e()
  {
    a.p().a(b.s, b.t + b.aS(), b.u, 10.0F, a.bQ());
    e -= 1;
  }
}
