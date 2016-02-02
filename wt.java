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
    this.ac.a(8, 5);
  }
  
  public boolean a(double ☃)
  {
    return ☃ < 4096.0D;
  }
  
  public wt(adm ☃, double ☃, double ☃, double ☃, zx ☃)
  {
    super(☃);
    this.a = 0;
    
    a(0.25F, 0.25F);
    
    b(☃, ☃, ☃);
    
    int ☃ = 1;
    if ((☃ != null) && (☃.n()))
    {
      this.ac.b(8, ☃);
      
      dn ☃ = ☃.o();
      dn ☃ = ☃.m("Fireworks");
      if (☃ != null) {
        ☃ += ☃.d("Flight");
      }
    }
    this.v = (this.V.nextGaussian() * 0.001D);
    this.x = (this.V.nextGaussian() * 0.001D);
    this.w = 0.05D;
    
    this.b = (10 * ☃ + this.V.nextInt(6) + this.V.nextInt(7));
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
    if ((this.B == 0.0F) && (this.A == 0.0F))
    {
      float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
      this.A = (this.y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
      this.B = (this.z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    }
  }
  
  public void t_()
  {
    this.P = this.s;
    this.Q = this.t;
    this.R = this.u;
    super.t_();
    
    this.v *= 1.15D;
    this.x *= 1.15D;
    this.w += 0.04D;
    d(this.v, this.w, this.x);
    
    float ☃ = ns.a(this.v * this.v + this.x * this.x);
    this.y = ((float)(ns.b(this.v, this.x) * 180.0D / 3.1415927410125732D));
    this.z = ((float)(ns.b(this.w, ☃) * 180.0D / 3.1415927410125732D));
    while (this.z - this.B < -180.0F) {
      this.B -= 360.0F;
    }
    while (this.z - this.B >= 180.0F) {
      this.B += 360.0F;
    }
    while (this.y - this.A < -180.0F) {
      this.A -= 360.0F;
    }
    while (this.y - this.A >= 180.0F) {
      this.A += 360.0F;
    }
    this.z = (this.B + (this.z - this.B) * 0.2F);
    this.y = (this.A + (this.y - this.A) * 0.2F);
    if ((this.a == 0) && (!R())) {
      this.o.a(this, "fireworks.launch", 3.0F, 1.0F);
    }
    this.a += 1;
    if ((this.o.D) && (this.a % 2 < 2)) {
      this.o.a(cy.d, this.s, this.t - 0.3D, this.u, this.V.nextGaussian() * 0.05D, -this.w * 0.5D, this.V.nextGaussian() * 0.05D, new int[0]);
    }
    if ((!this.o.D) && (this.a > this.b))
    {
      this.o.a(this, (byte)17);
      J();
    }
  }
  
  public void a(byte ☃)
  {
    if ((☃ == 17) && (this.o.D))
    {
      zx ☃ = this.ac.f(8);
      dn ☃ = null;
      if ((☃ != null) && (☃.n())) {
        ☃ = ☃.o().m("Fireworks");
      }
      this.o.a(this.s, this.t, this.u, this.v, this.w, this.x, ☃);
    }
    super.a(☃);
  }
  
  public void b(dn ☃)
  {
    ☃.a("Life", this.a);
    ☃.a("LifeTime", this.b);
    zx ☃ = this.ac.f(8);
    if (☃ != null)
    {
      dn ☃ = new dn();
      ☃.b(☃);
      ☃.a("FireworksItem", ☃);
    }
  }
  
  public void a(dn ☃)
  {
    this.a = ☃.f("Life");
    this.b = ☃.f("LifeTime");
    
    dn ☃ = ☃.m("FireworksItem");
    if (☃ != null)
    {
      zx ☃ = zx.a(☃);
      if (☃ != null) {
        this.ac.b(8, ☃);
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
