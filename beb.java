import java.util.Random;

public class beb
  extends pk
{
  protected int b;
  protected int c;
  protected float d;
  protected float e;
  protected int f;
  protected int g;
  protected float h;
  protected float i;
  protected float ar;
  protected float as;
  protected float at;
  protected float au = 1.0F;
  protected bmi av;
  public static double aw;
  public static double ax;
  public static double ay;
  
  protected beb(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    
    a(0.2F, 0.2F);
    b(☃, ☃, ☃);
    this.P = (this.p = ☃);
    this.Q = (this.q = ☃);
    this.R = (this.r = ☃);
    this.ar = (this.as = this.at = 1.0F);
    
    this.d = (this.V.nextFloat() * 3.0F);
    this.e = (this.V.nextFloat() * 3.0F);
    
    this.h = ((this.V.nextFloat() * 0.5F + 0.5F) * 2.0F);
    
    this.g = ((int)(4.0F / (this.V.nextFloat() * 0.9F + 0.1F)));
    this.f = 0;
  }
  
  public beb(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃);
    
    this.v = (☃ + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
    this.w = (☃ + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
    this.x = (☃ + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
    float ☃ = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
    
    float ☃ = ns.a(this.v * this.v + this.w * this.w + this.x * this.x);
    this.v = (this.v / ☃ * ☃ * 0.4000000059604645D);
    this.w = (this.w / ☃ * ☃ * 0.4000000059604645D + 0.10000000149011612D);
    this.x = (this.x / ☃ * ☃ * 0.4000000059604645D);
  }
  
  public beb a(float ☃)
  {
    this.v *= ☃;
    this.w = ((this.w - 0.10000000149011612D) * ☃ + 0.10000000149011612D);
    this.x *= ☃;
    return this;
  }
  
  public beb h(float ☃)
  {
    a(0.2F * ☃, 0.2F * ☃);
    this.h *= ☃;
    return this;
  }
  
  public void b(float ☃, float ☃, float ☃)
  {
    this.ar = ☃;
    this.as = ☃;
    this.at = ☃;
  }
  
  public void i(float ☃)
  {
    if ((this.au == 1.0F) && (☃ < 1.0F)) {
      ave.A().j.b(this);
    } else if ((this.au < 1.0F) && (☃ == 1.0F)) {
      ave.A().j.c(this);
    }
    this.au = ☃;
  }
  
  public float b()
  {
    return this.ar;
  }
  
  public float g()
  {
    return this.as;
  }
  
  public float i()
  {
    return this.at;
  }
  
  public float j()
  {
    return this.au;
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h() {}
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if (this.f++ >= this.g) {
      J();
    }
    this.w -= 0.04D * this.i;
    d(this.v, this.w, this.x);
    this.v *= 0.9800000190734863D;
    this.w *= 0.9800000190734863D;
    this.x *= 0.9800000190734863D;
    if (this.C)
    {
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
    }
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = this.b / 16.0F;
    float ☃ = ☃ + 0.0624375F;
    float ☃ = this.c / 16.0F;
    float ☃ = ☃ + 0.0624375F;
    float ☃ = 0.1F * this.h;
    if (this.av != null)
    {
      ☃ = this.av.e();
      ☃ = this.av.f();
      ☃ = this.av.g();
      ☃ = this.av.h();
    }
    float ☃ = (float)(this.p + (this.s - this.p) * ☃ - aw);
    float ☃ = (float)(this.q + (this.t - this.q) * ☃ - ax);
    float ☃ = (float)(this.r + (this.u - this.r) * ☃ - ay);
    
    int ☃ = b(☃);
    int ☃ = ☃ >> 16 & 0xFFFF;
    int ☃ = ☃ & 0xFFFF;
    
    ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
    ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
  }
  
  public int a()
  {
    return 0;
  }
  
  public void b(dn ☃) {}
  
  public void a(dn ☃) {}
  
  public void a(bmi ☃)
  {
    int ☃ = a();
    if (☃ == 1) {
      this.av = ☃;
    } else {
      throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
    }
  }
  
  public void k(int ☃)
  {
    if (a() != 0) {
      throw new RuntimeException("Invalid call to Particle.setMiscTex");
    }
    this.b = (☃ % 16);
    this.c = (☃ / 16);
  }
  
  public void k()
  {
    this.b += 1;
  }
  
  public boolean aD()
  {
    return false;
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + ", Pos (" + this.s + "," + this.t + "," + this.u + "), RGBA (" + this.ar + "," + this.as + "," + this.at + "," + this.au + "), Age " + this.f;
  }
}
