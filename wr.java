import java.util.Random;

public class wr
  extends pk
{
  private double a;
  private double b;
  private double c;
  private int d;
  private boolean e;
  
  public wr(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
  }
  
  protected void h() {}
  
  public boolean a(double ☃)
  {
    double ☃ = aR().a() * 4.0D;
    if (Double.isNaN(☃)) {
      ☃ = 4.0D;
    }
    ☃ *= 64.0D;
    return ☃ < ☃ * ☃;
  }
  
  public wr(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    this.d = 0;
    
    a(0.25F, 0.25F);
    
    b(☃, ☃, ☃);
  }
  
  public void a(cj ☃)
  {
    double ☃ = ☃.n();
    int ☃ = ☃.o();
    double ☃ = ☃.p();
    
    double ☃ = ☃ - this.s;double ☃ = ☃ - this.u;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    if (☃ > 12.0F)
    {
      this.a = (this.s + ☃ / ☃ * 12.0D);
      this.c = (this.u + ☃ / ☃ * 12.0D);
      this.b = (this.t + 8.0D);
    }
    else
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
    }
    this.d = 0;
    this.e = (this.V.nextInt(5) > 0);
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
    
    this.s += this.v;
    this.t += this.w;
    this.u += this.x;
    
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
    if (!this.o.D)
    {
      double ☃ = this.a - this.s;double ☃ = this.c - this.u;
      float ☃ = (float)Math.sqrt(☃ * ☃ + ☃ * ☃);
      float ☃ = (float)ns.b(☃, ☃);
      double ☃ = ☃ + (☃ - ☃) * 0.0025D;
      if (☃ < 1.0F)
      {
        ☃ *= 0.8D;
        this.w *= 0.8D;
      }
      this.v = (Math.cos(☃) * ☃);
      this.x = (Math.sin(☃) * ☃);
      if (this.t < this.b) {
        this.w += (1.0D - this.w) * 0.014999999664723873D;
      } else {
        this.w += (-1.0D - this.w) * 0.014999999664723873D;
      }
    }
    float ☃ = 0.25F;
    if (V()) {
      for (int ☃ = 0; ☃ < 4; ☃++) {
        this.o.a(cy.e, this.s - this.v * ☃, this.t - this.w * ☃, this.u - this.x * ☃, this.v, this.w, this.x, new int[0]);
      }
    } else {
      this.o.a(cy.y, this.s - this.v * ☃ + this.V.nextDouble() * 0.6D - 0.3D, this.t - this.w * ☃ - 0.5D, this.u - this.x * ☃ + this.V.nextDouble() * 0.6D - 0.3D, this.v, this.w, this.x, new int[0]);
    }
    if (!this.o.D)
    {
      b(this.s, this.t, this.u);
      
      this.d += 1;
      if ((this.d > 80) && (!this.o.D))
      {
        J();
        if (this.e) {
          this.o.d(new uz(this.o, this.s, this.t, this.u, new zx(zy.bH)));
        } else {
          this.o.b(2003, new cj(this), 0);
        }
      }
    }
  }
  
  public void b(dn ☃) {}
  
  public void a(dn ☃) {}
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
  
  public boolean aD()
  {
    return false;
  }
}
