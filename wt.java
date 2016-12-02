import java.util.Random;

public class wt
  extends pk
{
  private int a;
  private int b;
  
  public wt(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
  }
  
  protected void h()
  {
    ac.a(8, 5);
  }
  
  public boolean a(double ☃)
  {
    return ☃ < 4096.0D;
  }
  
  public wt(adm ☃, double ☃, double ☃, double ☃, zx ☃)
  {
    super(☃);
    a = 0;
    
    a(0.25F, 0.25F);
    
    b(☃, ☃, ☃);
    
    int ☃ = 1;
    if ((☃ != null) && (☃.n()))
    {
      ac.b(8, ☃);
      
      dn ☃ = ☃.o();
      dn ☃ = ☃.m("Fireworks");
      if (☃ != null) {
        ☃ += ☃.d("Flight");
      }
    }
    v = (V.nextGaussian() * 0.001D);
    x = (V.nextGaussian() * 0.001D);
    w = 0.05D;
    
    b = (10 * ☃ + V.nextInt(6) + V.nextInt(7));
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    v = ☃;
    w = ☃;
    x = ☃;
    if ((B == 0.0F) && (A == 0.0F))
    {
      float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
      A = (y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
      B = (z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    }
  }
  
  public void t_()
  {
    P = s;
    Q = t;
    R = u;
    super.t_();
    
    v *= 1.15D;
    x *= 1.15D;
    w += 0.04D;
    d(v, w, x);
    
    float ☃ = ns.a(v * v + x * x);
    y = ((float)(ns.b(v, x) * 180.0D / 3.1415927410125732D));
    z = ((float)(ns.b(w, ☃) * 180.0D / 3.1415927410125732D));
    while (z - B < -180.0F) {
      B -= 360.0F;
    }
    while (z - B >= 180.0F) {
      B += 360.0F;
    }
    while (y - A < -180.0F) {
      A -= 360.0F;
    }
    while (y - A >= 180.0F) {
      A += 360.0F;
    }
    z = (B + (z - B) * 0.2F);
    y = (A + (y - A) * 0.2F);
    if ((a == 0) && (!R())) {
      o.a(this, "fireworks.launch", 3.0F, 1.0F);
    }
    a += 1;
    if ((o.D) && (a % 2 < 2)) {
      o.a(cy.d, s, t - 0.3D, u, V.nextGaussian() * 0.05D, -w * 0.5D, V.nextGaussian() * 0.05D, new int[0]);
    }
    if ((!o.D) && (a > b))
    {
      o.a(this, (byte)17);
      J();
    }
  }
  
  public void a(byte ☃)
  {
    if ((☃ == 17) && (o.D))
    {
      zx ☃ = ac.f(8);
      dn ☃ = null;
      if ((☃ != null) && (☃.n())) {
        ☃ = ☃.o().m("Fireworks");
      }
      o.a(s, t, u, v, w, x, ☃);
    }
    super.a(☃);
  }
  
  public void b(dn ☃)
  {
    ☃.a("Life", a);
    ☃.a("LifeTime", b);
    zx ☃ = ac.f(8);
    if (☃ != null)
    {
      dn ☃ = new dn();
      ☃.b(☃);
      ☃.a("FireworksItem", ☃);
    }
  }
  
  public void a(dn ☃)
  {
    a = ☃.f("Life");
    b = ☃.f("LifeTime");
    
    dn ☃ = ☃.m("FireworksItem");
    if (☃ != null)
    {
      zx ☃ = zx.a(☃);
      if (☃ != null) {
        ac.b(8, ☃);
      }
    }
  }
  
  public float c(float ☃)
  {
    return super.c(☃);
  }
  
  public int b(float ☃)
  {
    return super.b(☃);
  }
  
  public boolean aD()
  {
    return false;
  }
}
