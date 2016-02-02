import java.util.Random;

public class pp
  extends pk
{
  public int a;
  public int b;
  public int c;
  private int d = 5;
  private int e;
  private wn f;
  private int g;
  
  public pp(adm ☃, double ☃, double ☃, double ☃, int ☃)
  {
    super(☃);
    a(0.5F, 0.5F);
    b(☃, ☃, ☃);
    
    this.y = ((float)(Math.random() * 360.0D));
    
    this.v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    this.w = ((float)(Math.random() * 0.2D) * 2.0F);
    this.x = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    
    this.e = ☃;
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  public pp(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
  }
  
  protected void h() {}
  
  public int b(float ☃)
  {
    float ☃ = 0.5F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    int ☃ = super.b(☃);
    
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    ☃ += (int)(☃ * 15.0F * 16.0F);
    if (☃ > 240) {
      ☃ = 240;
    }
    return ☃ | ☃ << 16;
  }
  
  public void t_()
  {
    super.t_();
    if (this.c > 0) {
      this.c -= 1;
    }
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    this.w -= 0.029999999329447746D;
    if (this.o.p(new cj(this)).c().t() == arm.i)
    {
      this.w = 0.20000000298023224D;
      this.v = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
      this.x = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
      a("random.fizz", 0.4F, 2.0F + this.V.nextFloat() * 0.4F);
    }
    j(this.s, (aR().b + aR().e) / 2.0D, this.u);
    
    double ☃ = 8.0D;
    if (this.g < this.a - 20 + F() % 100)
    {
      if ((this.f == null) || (this.f.h(this) > ☃ * ☃)) {
        this.f = this.o.a(this, ☃);
      }
      this.g = this.a;
    }
    if ((this.f != null) && (this.f.v())) {
      this.f = null;
    }
    if (this.f != null)
    {
      double ☃ = (this.f.s - this.s) / ☃;
      double ☃ = (this.f.t + this.f.aS() - this.t) / ☃;
      double ☃ = (this.f.u - this.u) / ☃;
      double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
      double ☃ = 1.0D - ☃;
      if (☃ > 0.0D)
      {
        ☃ *= ☃;
        this.v += ☃ / ☃ * ☃ * 0.1D;
        this.w += ☃ / ☃ * ☃ * 0.1D;
        this.x += ☃ / ☃ * ☃ * 0.1D;
      }
    }
    d(this.v, this.w, this.x);
    
    float ☃ = 0.98F;
    if (this.C) {
      ☃ = this.o.p(new cj(ns.c(this.s), ns.c(aR().b) - 1, ns.c(this.u))).c().L * 0.98F;
    }
    this.v *= ☃;
    this.w *= 0.9800000190734863D;
    this.x *= ☃;
    if (this.C) {
      this.w *= -0.8999999761581421D;
    }
    this.a += 1;
    
    this.b += 1;
    if (this.b >= 6000) {
      J();
    }
  }
  
  public boolean W()
  {
    return this.o.a(aR(), arm.h, this);
  }
  
  protected void f(int ☃)
  {
    a(ow.a, ☃);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    ac();
    this.d = ((int)(this.d - ☃));
    if (this.d <= 0) {
      J();
    }
    return false;
  }
  
  public void b(dn ☃)
  {
    ☃.a("Health", (short)(byte)this.d);
    ☃.a("Age", (short)this.b);
    ☃.a("Value", (short)this.e);
  }
  
  public void a(dn ☃)
  {
    this.d = (☃.e("Health") & 0xFF);
    this.b = ☃.e("Age");
    this.e = ☃.e("Value");
  }
  
  public void d(wn ☃)
  {
    if (this.o.D) {
      return;
    }
    if ((this.c == 0) && (☃.bp == 0))
    {
      ☃.bp = 2;
      this.o.a(☃, "random.orb", 0.1F, 0.5F * ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.8F));
      ☃.a(this, 1);
      ☃.u(this.e);
      J();
    }
  }
  
  public int j()
  {
    return this.e;
  }
  
  public int l()
  {
    if (this.e >= 2477) {
      return 10;
    }
    if (this.e >= 1237) {
      return 9;
    }
    if (this.e >= 617) {
      return 8;
    }
    if (this.e >= 307) {
      return 7;
    }
    if (this.e >= 149) {
      return 6;
    }
    if (this.e >= 73) {
      return 5;
    }
    if (this.e >= 37) {
      return 4;
    }
    if (this.e >= 17) {
      return 3;
    }
    if (this.e >= 7) {
      return 2;
    }
    if (this.e >= 3) {
      return 1;
    }
    return 0;
  }
  
  public static int a(int ☃)
  {
    if (☃ >= 2477) {
      return 2477;
    }
    if (☃ >= 1237) {
      return 1237;
    }
    if (☃ >= 617) {
      return 617;
    }
    if (☃ >= 307) {
      return 307;
    }
    if (☃ >= 149) {
      return 149;
    }
    if (☃ >= 73) {
      return 73;
    }
    if (☃ >= 37) {
      return 37;
    }
    if (☃ >= 17) {
      return 17;
    }
    if (☃ >= 7) {
      return 7;
    }
    if (☃ >= 3) {
      return 3;
    }
    return 1;
  }
  
  public boolean aD()
  {
    return false;
  }
}
