import java.util.Random;

public class ve
  extends va
{
  private int c;
  public double a;
  public double b;
  
  public ve(adm ☃)
  {
    super(☃);
  }
  
  public ve(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  public va.a s()
  {
    return va.a.c;
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(16, new Byte((byte)0));
  }
  
  public void t_()
  {
    super.t_();
    if (this.c > 0) {
      this.c -= 1;
    }
    if (this.c <= 0) {
      this.a = (this.b = 0.0D);
    }
    i(this.c > 0);
    if ((j()) && (this.V.nextInt(4) == 0)) {
      this.o.a(cy.m, this.s, this.t + 0.8D, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  protected double m()
  {
    return 0.2D;
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if ((!☃.c()) && (this.o.Q().b("doEntityDrops"))) {
      a(new zx(afi.al, 1), 0.0F);
    }
  }
  
  protected void a(cj ☃, alz ☃)
  {
    super.a(☃, ☃);
    
    double ☃ = this.a * this.a + this.b * this.b;
    if ((☃ > 1.0E-4D) && (this.v * this.v + this.x * this.x > 0.001D))
    {
      ☃ = ns.a(☃);
      this.a /= ☃;
      this.b /= ☃;
      if (this.a * this.v + this.b * this.x < 0.0D)
      {
        this.a = 0.0D;
        this.b = 0.0D;
      }
      else
      {
        double ☃ = ☃ / m();
        this.a *= ☃;
        this.b *= ☃;
      }
    }
  }
  
  protected void o()
  {
    double ☃ = this.a * this.a + this.b * this.b;
    if (☃ > 1.0E-4D)
    {
      ☃ = ns.a(☃);
      this.a /= ☃;
      this.b /= ☃;
      double ☃ = 1.0D;
      this.v *= 0.800000011920929D;
      this.w *= 0.0D;
      this.x *= 0.800000011920929D;
      this.v += this.a * ☃;
      this.x += this.b * ☃;
    }
    else
    {
      this.v *= 0.9800000190734863D;
      this.w *= 0.0D;
      this.x *= 0.9800000190734863D;
    }
    super.o();
  }
  
  public boolean e(wn ☃)
  {
    zx ☃ = ☃.bi.h();
    if ((☃ != null) && (☃.b() == zy.h))
    {
      if (!☃.bA.d) {
        if (--☃.b == 0) {
          ☃.bi.a(☃.bi.c, null);
        }
      }
      this.c += 3600;
    }
    this.a = (this.s - ☃.s);
    this.b = (this.u - ☃.u);
    
    return true;
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    ☃.a("PushX", this.a);
    ☃.a("PushZ", this.b);
    ☃.a("Fuel", (short)this.c);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    this.a = ☃.i("PushX");
    this.b = ☃.i("PushZ");
    this.c = ☃.e("Fuel");
  }
  
  protected boolean j()
  {
    return (this.ac.a(16) & 0x1) != 0;
  }
  
  protected void i(boolean ☃)
  {
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)(this.ac.a(16) | 0x1)));
    } else {
      this.ac.b(16, Byte.valueOf((byte)(this.ac.a(16) & 0xFFFFFFFE)));
    }
  }
  
  public alz u()
  {
    return (j() ? afi.am : afi.al).Q().a(ahb.a, cq.c);
  }
}
