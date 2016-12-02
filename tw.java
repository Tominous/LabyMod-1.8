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
    i.a(1, new sa(this, 1.25D, 20, 10.0F));
    i.a(2, new rz(this, 1.0D));
    i.a(3, new ri(this, wn.class, 6.0F));
    i.a(4, new ry(this));
    
    bi.a(1, new sp(this, ps.class, 10, true, false, vq.d));
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
    if (!o.D)
    {
      int ☃ = ns.c(s);
      int ☃ = ns.c(t);
      int ☃ = ns.c(u);
      if (U()) {
        a(ow.f, 1.0F);
      }
      if (o.b(new cj(☃, 0, ☃)).a(new cj(☃, ☃, ☃)) > 1.0F) {
        a(ow.c, 1.0F);
      }
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        ☃ = ns.c(s + (☃ % 2 * 2 - 1) * 0.25F);
        ☃ = ns.c(t);
        ☃ = ns.c(u + (☃ / 2 % 2 * 2 - 1) * 0.25F);
        cj ☃ = new cj(☃, ☃, ☃);
        if ((o.p(☃).c().t() == arm.a) && 
          (o.b(new cj(☃, 0, ☃)).a(☃) < 0.8F) && 
          (afi.aH.d(o, ☃))) {
          o.a(☃, afi.aH.Q());
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
    int ☃ = V.nextInt(16);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.aD, 1);
    }
  }
  
  public void a(pr ☃, float ☃)
  {
    wx ☃ = new wx(o, this);
    double ☃ = t + ☃.aS() - 1.100000023841858D;
    double ☃ = s - s;
    double ☃ = ☃ - t;
    double ☃ = u - u;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 0.2F;
    ☃.c(☃, ☃ + ☃, ☃, 1.6F, 12.0F);
    
    a("random.bow", 1.0F, 1.0F / (bc().nextFloat() * 0.4F + 0.8F));
    o.d(☃);
  }
  
  public float aS()
  {
    return 1.7F;
  }
}
