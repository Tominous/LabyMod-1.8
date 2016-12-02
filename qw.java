import java.util.Random;

public class qw
  extends rd
{
  private final ps a;
  private final float b;
  private float c;
  private boolean d;
  private int e;
  private int f;
  
  public qw(ps ☃, float ☃)
  {
    this.a = ☃;
    this.b = ☃;
    a(7);
  }
  
  public void c()
  {
    this.c = 0.0F;
  }
  
  public void d()
  {
    this.d = false;
    this.c = 0.0F;
  }
  
  public boolean a()
  {
    return (this.a.ai()) && (this.a.l != null) && ((this.a.l instanceof wn)) && ((this.d) || (this.a.bW()));
  }
  
  public void e()
  {
    wn ☃ = (wn)this.a.l;
    py ☃ = (py)this.a;
    
    float ☃ = ns.g(☃.y - this.a.y) * 0.5F;
    if (☃ > 5.0F) {
      ☃ = 5.0F;
    }
    if (☃ < -5.0F) {
      ☃ = -5.0F;
    }
    this.a.y = ns.g(this.a.y + ☃);
    if (this.c < this.b) {
      this.c += (this.b - this.c) * 0.01F;
    }
    if (this.c > this.b) {
      this.c = this.b;
    }
    int ☃ = ns.c(this.a.s);
    int ☃ = ns.c(this.a.t);
    int ☃ = ns.c(this.a.u);
    float ☃ = this.c;
    if (this.d)
    {
      if (this.e++ > this.f) {
        this.d = false;
      }
      ☃ += ☃ * 1.15F * ns.a(this.e / this.f * 3.1415927F);
    }
    float ☃ = 0.91F;
    if (this.a.C) {
      ☃ = this.a.o.p(new cj(ns.d(☃), ns.d(☃) - 1, ns.d(☃))).c().L * 0.91F;
    }
    float ☃ = 0.16277136F / (☃ * ☃ * ☃);
    float ☃ = ns.a(☃.y * 3.1415927F / 180.0F);
    float ☃ = ns.b(☃.y * 3.1415927F / 180.0F);
    float ☃ = ☃.bI() * ☃;
    float ☃ = Math.max(☃, 1.0F);
    ☃ = ☃ / ☃;
    float ☃ = ☃ * ☃;
    float ☃ = -(☃ * ☃);
    float ☃ = ☃ * ☃;
    if (ns.e(☃) > ns.e(☃))
    {
      if (☃ < 0.0F) {
        ☃ -= this.a.J / 2.0F;
      }
      if (☃ > 0.0F) {
        ☃ += this.a.J / 2.0F;
      }
      ☃ = 0.0F;
    }
    else
    {
      ☃ = 0.0F;
      if (☃ < 0.0F) {
        ☃ -= this.a.J / 2.0F;
      }
      if (☃ > 0.0F) {
        ☃ += this.a.J / 2.0F;
      }
    }
    int ☃ = ns.c(this.a.s + ☃);
    int ☃ = ns.c(this.a.u + ☃);
    
    int ☃ = ns.d(this.a.J + 1.0F);
    int ☃ = ns.d(this.a.K + ☃.K + 1.0F);
    int ☃ = ns.d(this.a.J + 1.0F);
    if ((☃ != ☃) || (☃ != ☃))
    {
      afh ☃ = this.a.o.p(new cj(☃, ☃, ☃)).c();
      boolean ☃ = (!a(☃)) && ((☃.t() != arm.a) || (!a(this.a.o.p(new cj(☃, ☃ - 1, ☃)).c())));
      if ((☃) && (0 == ata.a(this.a.o, this.a, ☃, ☃, ☃, ☃, ☃, ☃, false, false, true)) && (1 == ata.a(this.a.o, this.a, ☃, ☃ + 1, ☃, ☃, ☃, ☃, false, false, true)) && (1 == ata.a(this.a.o, this.a, ☃, ☃ + 1, ☃, ☃, ☃, ☃, false, false, true))) {
        ☃.r().a();
      }
    }
    if ((!☃.bA.d) && (this.c >= this.b * 0.5F) && (this.a.bc().nextFloat() < 0.006F) && (!this.d))
    {
      zx ☃ = ☃.bA();
      if ((☃ != null) && (☃.b() == zy.bY))
      {
        ☃.a(1, ☃);
        if (☃.b == 0)
        {
          zx ☃ = new zx(zy.aR);
          ☃.d(☃.o());
          ☃.bi.a[☃.bi.c] = ☃;
        }
      }
    }
    this.a.g(0.0F, ☃);
  }
  
  private boolean a(afh ☃)
  {
    return ((☃ instanceof aju)) || ((☃ instanceof ahh));
  }
  
  public boolean f()
  {
    return this.d;
  }
  
  public void g()
  {
    this.d = true;
    this.e = 0;
    this.f = (this.a.bc().nextInt(841) + 140);
  }
  
  public boolean h()
  {
    return (!f()) && (this.c > this.b * 0.3F);
  }
}
