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
    this.a = ☃;
    this.d = ☃;
    this.c = ☃;
    this.f = 0.02F;
    a(2);
  }
  
  public ri(ps ☃, Class<? extends pk> ☃, float ☃, float ☃)
  {
    this.a = ☃;
    this.d = ☃;
    this.c = ☃;
    this.f = ☃;
    a(2);
  }
  
  public boolean a()
  {
    if (this.a.bc().nextFloat() >= this.f) {
      return false;
    }
    if (this.a.u() != null) {
      this.b = this.a.u();
    }
    if (this.d == wn.class) {
      this.b = this.a.o.a(this.a, this.c);
    } else {
      this.b = this.a.o.a(this.d, this.a.aR().b(this.c, 3.0D, this.c), this.a);
    }
    return this.b != null;
  }
  
  public boolean b()
  {
    if (!this.b.ai()) {
      return false;
    }
    if (this.a.h(this.b) > this.c * this.c) {
      return false;
    }
    return this.e > 0;
  }
  
  public void c()
  {
    this.e = (40 + this.a.bc().nextInt(40));
  }
  
  public void d()
  {
    this.b = null;
  }
  
  public void e()
  {
    this.a.p().a(this.b.s, this.b.t + this.b.aS(), this.b.u, 10.0F, this.a.bQ());
    this.e -= 1;
  }
}
