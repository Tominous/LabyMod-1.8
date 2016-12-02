import java.util.List;
import java.util.Random;

public class wq
  extends pk
  implements wv
{
  private int d = -1;
  private int e = -1;
  private int f = -1;
  private afh g;
  private int h;
  private boolean i;
  public int a;
  public int b;
  public pk c;
  private int ar;
  private int as;
  private double at = 2.0D;
  private int au;
  
  public wq(adm ☃)
  {
    super(☃);
    this.j = 10.0D;
    a(0.5F, 0.5F);
  }
  
  public wq(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    this.j = 10.0D;
    
    a(0.5F, 0.5F);
    
    b(☃, ☃, ☃);
  }
  
  public wq(adm ☃, pr ☃, pr ☃, float ☃, float ☃)
  {
    super(☃);
    this.j = 10.0D;
    this.c = ☃;
    if ((☃ instanceof wn)) {
      this.a = 1;
    }
    this.t = (☃.t + ☃.aS() - 0.10000000149011612D);
    
    double ☃ = ☃.s - ☃.s;
    double ☃ = ☃.aR().b + ☃.K / 3.0F - this.t;
    double ☃ = ☃.u - ☃.u;
    double ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    if (☃ < 1.0E-7D) {
      return;
    }
    float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
    float ☃ = (float)-(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D);
    
    double ☃ = ☃ / ☃;
    double ☃ = ☃ / ☃;
    b(☃.s + ☃, this.t, ☃.u + ☃, ☃, ☃);
    
    float ☃ = (float)(☃ * 0.20000000298023224D);
    c(☃, ☃ + ☃, ☃, ☃, ☃);
  }
  
  public wq(adm ☃, pr ☃, float ☃)
  {
    super(☃);
    this.j = 10.0D;
    this.c = ☃;
    if ((☃ instanceof wn)) {
      this.a = 1;
    }
    a(0.5F, 0.5F);
    
    b(☃.s, ☃.t + ☃.aS(), ☃.u, ☃.y, ☃.z);
    
    this.s -= ns.b(this.y / 180.0F * 3.1415927F) * 0.16F;
    this.t -= 0.10000000149011612D;
    this.u -= ns.a(this.y / 180.0F * 3.1415927F) * 0.16F;
    b(this.s, this.t, this.u);
    
    this.v = (-ns.a(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F));
    this.x = (ns.b(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F));
    this.w = (-ns.a(this.z / 180.0F * 3.1415927F));
    
    c(this.v, this.w, this.x, ☃ * 1.5F, 1.0F);
  }
  
  protected void h()
  {
    this.ac.a(16, Byte.valueOf((byte)0));
  }
  
  public void c(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    
    ☃ /= ☃;
    ☃ /= ☃;
    ☃ /= ☃;
    
    ☃ += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * ☃;
    ☃ += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * ☃;
    ☃ += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * ☃;
    
    ☃ *= ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
    
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    
    this.A = (this.y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    this.B = (this.z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    this.ar = 0;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    b(☃, ☃, ☃);
    b(☃, ☃);
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
      this.B = this.z;
      this.A = this.y;
      b(this.s, this.t, this.u, this.y, this.z);
      this.ar = 0;
    }
  }
  
  public void t_()
  {
    super.t_();
    if ((this.B == 0.0F) && (this.A == 0.0F))
    {
      float ☃ = ns.a(this.v * this.v + this.x * this.x);
      this.A = (this.y = (float)(ns.b(this.v, this.x) * 180.0D / 3.1415927410125732D));
      this.B = (this.z = (float)(ns.b(this.w, ☃) * 180.0D / 3.1415927410125732D));
    }
    cj ☃ = new cj(this.d, this.e, this.f);
    alz ☃ = this.o.p(☃);
    afh ☃ = ☃.c();
    if (☃.t() != arm.a)
    {
      ☃.a(this.o, ☃);
      aug ☃ = ☃.a(this.o, ☃, ☃);
      if ((☃ != null) && (☃.a(new aui(this.s, this.t, this.u)))) {
        this.i = true;
      }
    }
    if (this.b > 0) {
      this.b -= 1;
    }
    if (this.i)
    {
      int ☃ = ☃.c(☃);
      if ((☃ != this.g) || (☃ != this.h))
      {
        this.i = false;
        
        this.v *= this.V.nextFloat() * 0.2F;
        this.w *= this.V.nextFloat() * 0.2F;
        this.x *= this.V.nextFloat() * 0.2F;
        this.ar = 0;
        this.as = 0;
      }
      else
      {
        this.ar += 1;
        if (this.ar >= 1200) {
          J();
        }
      }
      return;
    }
    this.as += 1;
    
    aui ☃ = new aui(this.s, this.t, this.u);
    aui ☃ = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
    auh ☃ = this.o.a(☃, ☃, false, true, false);
    
    ☃ = new aui(this.s, this.t, this.u);
    ☃ = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
    if (☃ != null) {
      ☃ = new aui(☃.c.a, ☃.c.b, ☃.c.c);
    }
    pk ☃ = null;
    List<pk> ☃ = this.o.b(this, aR().a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
    double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      pk ☃ = (pk)☃.get(☃);
      if ((☃.ad()) && ((☃ != this.c) || (this.as >= 5)))
      {
        float ☃ = 0.3F;
        aug ☃ = ☃.aR().b(☃, ☃, ☃);
        auh ☃ = ☃.a(☃, ☃);
        if (☃ != null)
        {
          double ☃ = ☃.g(☃.c);
          if ((☃ < ☃) || (☃ == 0.0D))
          {
            ☃ = ☃;
            ☃ = ☃;
          }
        }
      }
    }
    if (☃ != null) {
      ☃ = new auh(☃);
    }
    if ((☃ != null) && (☃.d != null) && ((☃.d instanceof wn)))
    {
      wn ☃ = (wn)☃.d;
      if ((☃.bA.a) || (((this.c instanceof wn)) && (!((wn)this.c).a(☃)))) {
        ☃ = null;
      }
    }
    if (☃ != null) {
      if (☃.d != null)
      {
        float ☃ = ns.a(this.v * this.v + this.w * this.w + this.x * this.x);
        int ☃ = ns.f(☃ * this.at);
        if (l()) {
          ☃ += this.V.nextInt(☃ / 2 + 2);
        }
        ow ☃;
        ow ☃;
        if (this.c == null) {
          ☃ = ow.a(this, this);
        } else {
          ☃ = ow.a(this, this.c);
        }
        if ((at()) && (!(☃.d instanceof vo))) {
          ☃.d.e(5);
        }
        if (☃.d.a(☃, ☃))
        {
          if ((☃.d instanceof pr))
          {
            pr ☃ = (pr)☃.d;
            if (!this.o.D) {
              ☃.o(☃.bv() + 1);
            }
            if (this.au > 0)
            {
              float ☃ = ns.a(this.v * this.v + this.x * this.x);
              if (☃ > 0.0F) {
                ☃.d.g(this.v * this.au * 0.6000000238418579D / ☃, 0.1D, this.x * this.au * 0.6000000238418579D / ☃);
              }
            }
            if ((this.c instanceof pr))
            {
              ack.a(☃, this.c);
              ack.b((pr)this.c, ☃);
            }
            if ((this.c != null) && (☃.d != this.c) && ((☃.d instanceof wn)) && ((this.c instanceof lf))) {
              ((lf)this.c).a.a(new gm(6, 0.0F));
            }
          }
          a("random.bowhit", 1.0F, 1.2F / (this.V.nextFloat() * 0.2F + 0.9F));
          if (!(☃.d instanceof vo)) {
            J();
          }
        }
        else
        {
          this.v *= -0.10000000149011612D;
          this.w *= -0.10000000149011612D;
          this.x *= -0.10000000149011612D;
          this.y += 180.0F;
          this.A += 180.0F;
          this.as = 0;
        }
      }
      else
      {
        cj ☃ = ☃.a();
        this.d = ☃.n();
        this.e = ☃.o();
        this.f = ☃.p();
        alz ☃ = this.o.p(☃);
        this.g = ☃.c();
        this.h = this.g.c(☃);
        this.v = ((float)(☃.c.a - this.s));
        this.w = ((float)(☃.c.b - this.t));
        this.x = ((float)(☃.c.c - this.u));
        float ☃ = ns.a(this.v * this.v + this.w * this.w + this.x * this.x);
        this.s -= this.v / ☃ * 0.05000000074505806D;
        this.t -= this.w / ☃ * 0.05000000074505806D;
        this.u -= this.x / ☃ * 0.05000000074505806D;
        
        a("random.bowhit", 1.0F, 1.2F / (this.V.nextFloat() * 0.2F + 0.9F));
        this.i = true;
        this.b = 7;
        a(false);
        if (this.g.t() != arm.a) {
          this.g.a(this.o, ☃, ☃, this);
        }
      }
    }
    if (l()) {
      for (int ☃ = 0; ☃ < 4; ☃++) {
        this.o.a(cy.j, this.s + this.v * ☃ / 4.0D, this.t + this.w * ☃ / 4.0D, this.u + this.x * ☃ / 4.0D, -this.v, -this.w + 0.2D, -this.x, new int[0]);
      }
    }
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
    
    float ☃ = 0.99F;
    float ☃ = 0.05F;
    if (V())
    {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        float ☃ = 0.25F;
        this.o.a(cy.e, this.s - this.v * ☃, this.t - this.w * ☃, this.u - this.x * ☃, this.v, this.w, this.x, new int[0]);
      }
      ☃ = 0.6F;
    }
    if (U()) {
      N();
    }
    this.v *= ☃;
    this.w *= ☃;
    this.x *= ☃;
    this.w -= ☃;
    
    b(this.s, this.t, this.u);
    
    Q();
  }
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)this.d);
    ☃.a("yTile", (short)this.e);
    ☃.a("zTile", (short)this.f);
    ☃.a("life", (short)this.ar);
    jy ☃ = (jy)afh.c.c(this.g);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("inData", (byte)this.h);
    ☃.a("shake", (byte)this.b);
    ☃.a("inGround", (byte)(this.i ? 1 : 0));
    ☃.a("pickup", (byte)this.a);
    ☃.a("damage", this.at);
  }
  
  public void a(dn ☃)
  {
    this.d = ☃.e("xTile");
    this.e = ☃.e("yTile");
    this.f = ☃.e("zTile");
    this.ar = ☃.e("life");
    if (☃.b("inTile", 8)) {
      this.g = afh.b(☃.j("inTile"));
    } else {
      this.g = afh.c(☃.d("inTile") & 0xFF);
    }
    this.h = (☃.d("inData") & 0xFF);
    this.b = (☃.d("shake") & 0xFF);
    this.i = (☃.d("inGround") == 1);
    if (☃.b("damage", 99)) {
      this.at = ☃.i("damage");
    }
    if (☃.b("pickup", 99)) {
      this.a = ☃.d("pickup");
    } else if (☃.b("player", 99)) {
      this.a = (☃.n("player") ? 1 : 0);
    }
  }
  
  public void d(wn ☃)
  {
    if ((this.o.D) || (!this.i) || (this.b > 0)) {
      return;
    }
    boolean ☃ = (this.a == 1) || ((this.a == 2) && (☃.bA.d));
    if ((this.a == 1) && 
      (!☃.bi.a(new zx(zy.g, 1)))) {
      ☃ = false;
    }
    if (☃)
    {
      a("random.pop", 0.2F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      ☃.a(this, 1);
      J();
    }
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  public void b(double ☃)
  {
    this.at = ☃;
  }
  
  public double j()
  {
    return this.at;
  }
  
  public void a(int ☃)
  {
    this.au = ☃;
  }
  
  public boolean aD()
  {
    return false;
  }
  
  public float aS()
  {
    return 0.0F;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)(☃ | 0x1)));
    } else {
      this.ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFE)));
    }
  }
  
  public boolean l()
  {
    byte ☃ = this.ac.a(16);
    return (☃ & 0x1) != 0;
  }
}
