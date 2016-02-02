import java.util.Random;

public class tw
  extends tq
  implements vx
{
  public tw(adm ☃)
  {
    super(☃);
    a(0.7F, 1.9F);
    
    ((sv)s()).a(true);
    this.i.a(1, new sa(this, 1.25D, 20, 10.0F));
    this.i.a(2, new rz(this, 1.0D));
    this.i.a(3, new ri(this, wn.class, 6.0F));
    this.i.a(4, new ry(this));
    
    this.bi.a(1, new sp(this, ps.class, 10, true, false, vq.d));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(4.0D);
    a(vy.d).a(0.20000000298023224D);
  }
  
  public void m()
  {
    super.m();
    if (!this.o.D)
    {
      int ☃ = ns.c(this.s);
      int ☃ = ns.c(this.t);
      int ☃ = ns.c(this.u);
      if (U()) {
        a(ow.f, 1.0F);
      }
      if (this.o.b(new cj(☃, 0, ☃)).a(new cj(☃, ☃, ☃)) > 1.0F) {
        a(ow.c, 1.0F);
      }
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        ☃ = ns.c(this.s + (☃ % 2 * 2 - 1) * 0.25F);
        ☃ = ns.c(this.t);
        ☃ = ns.c(this.u + (☃ / 2 % 2 * 2 - 1) * 0.25F);
        cj ☃ = new cj(☃, ☃, ☃);
        if ((this.o.p(☃).c().t() == arm.a) && 
          (this.o.b(new cj(☃, 0, ☃)).a(☃) < 0.8F) && 
          (afi.aH.d(this.o, ☃))) {
          this.o.a(☃, afi.aH.Q());
        }
      }
    }
  }
  
  protected zw A()
  {
    return zy.aD;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = this.V.nextInt(16);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.aD, 1);
    }
  }
  
  public void a(pr ☃, float ☃)
  {
    wx ☃ = new wx(this.o, this);
    double ☃ = ☃.t + ☃.aS() - 1.100000023841858D;
    double ☃ = ☃.s - this.s;
    double ☃ = ☃ - ☃.t;
    double ☃ = ☃.u - this.u;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 0.2F;
    ☃.c(☃, ☃ + ☃, ☃, 1.6F, 12.0F);
    
    a("random.bow", 1.0F, 1.0F / (bc().nextFloat() * 0.4F + 0.8F));
    this.o.d(☃);
  }
  
  public float aS()
  {
    return 1.7F;
  }
}
