import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ur
  extends pk
{
  private static final List<us> d = Arrays.asList(new us[] { new us(new zx(zy.T), 10).a(0.9F), new us(new zx(zy.aF), 10), new us(new zx(zy.aX), 10), new us(new zx(zy.bz), 10), new us(new zx(zy.F), 5), new us(new zx(zy.aR), 2).a(0.9F), new us(new zx(zy.z), 10), new us(new zx(zy.y), 5), new us(new zx(zy.aW, 10, zd.p.b()), 1), new us(new zx(afi.bR), 10), new us(new zx(zy.bt), 10) });
  private static final List<us> e = Arrays.asList(new us[] { new us(new zx(afi.bx), 1), new us(new zx(zy.co), 1), new us(new zx(zy.aA), 1), new us(new zx(zy.f), 1).a(0.25F).a(), new us(new zx(zy.aR), 1).a(0.25F).a(), new us(new zx(zy.aL), 1).a() });
  private static final List<us> f = Arrays.asList(new us[] { new us(new zx(zy.aU, 1, zp.a.a.a()), 60), new us(new zx(zy.aU, 1, zp.a.b.a()), 25), new us(new zx(zy.aU, 1, zp.a.c.a()), 2), new us(new zx(zy.aU, 1, zp.a.d.a()), 13) });
  
  public static List<us> j()
  {
    return f;
  }
  
  private int g = -1;
  private int h = -1;
  private int i = -1;
  private afh ar;
  private boolean as;
  public int a;
  public wn b;
  private int at;
  private int au;
  private int av;
  private int aw;
  private int ax;
  private float ay;
  public pk c;
  private int az;
  private double aA;
  private double aB;
  private double aC;
  private double aD;
  private double aE;
  private double aF;
  private double aG;
  private double aH;
  
  public ur(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
    this.ah = true;
  }
  
  public ur(adm ☃, double ☃, double ☃, double ☃, wn ☃)
  {
    this(☃);
    b(☃, ☃, ☃);
    this.ah = true;
    this.b = ☃;
    ☃.bG = this;
  }
  
  public ur(adm ☃, wn ☃)
  {
    super(☃);
    this.ah = true;
    this.b = ☃;
    this.b.bG = this;
    
    a(0.25F, 0.25F);
    
    b(☃.s, ☃.t + ☃.aS(), ☃.u, ☃.y, ☃.z);
    
    this.s -= ns.b(this.y / 180.0F * 3.1415927F) * 0.16F;
    this.t -= 0.10000000149011612D;
    this.u -= ns.a(this.y / 180.0F * 3.1415927F) * 0.16F;
    b(this.s, this.t, this.u);
    
    float ☃ = 0.4F;
    this.v = (-ns.a(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F) * ☃);
    this.x = (ns.b(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F) * ☃);
    this.w = (-ns.a(this.z / 180.0F * 3.1415927F) * ☃);
    
    c(this.v, this.w, this.x, 1.5F, 1.0F);
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
  
  public void c(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    
    ☃ /= ☃;
    ☃ /= ☃;
    ☃ /= ☃;
    
    ☃ += this.V.nextGaussian() * 0.007499999832361937D * ☃;
    ☃ += this.V.nextGaussian() * 0.007499999832361937D * ☃;
    ☃ += this.V.nextGaussian() * 0.007499999832361937D * ☃;
    
    ☃ *= ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
    
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    
    this.A = (this.y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    this.B = (this.z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    this.at = 0;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    this.aA = ☃;
    this.aB = ☃;
    this.aC = ☃;
    this.aD = ☃;
    this.aE = ☃;
    
    this.az = ☃;
    
    this.v = this.aF;
    this.w = this.aG;
    this.x = this.aH;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    this.aF = (this.v = ☃);
    this.aG = (this.w = ☃);
    this.aH = (this.x = ☃);
  }
  
  public void t_()
  {
    super.t_();
    if (this.az > 0)
    {
      double ☃ = this.s + (this.aA - this.s) / this.az;
      double ☃ = this.t + (this.aB - this.t) / this.az;
      double ☃ = this.u + (this.aC - this.u) / this.az;
      
      double ☃ = ns.g(this.aD - this.y);
      
      this.y = ((float)(this.y + ☃ / this.az));
      this.z = ((float)(this.z + (this.aE - this.z) / this.az));
      
      this.az -= 1;
      b(☃, ☃, ☃);
      b(this.y, this.z);
      return;
    }
    if (!this.o.D)
    {
      zx ☃ = this.b.bZ();
      if ((this.b.I) || (!this.b.ai()) || (☃ == null) || (☃.b() != zy.aR) || (h(this.b) > 1024.0D))
      {
        J();
        this.b.bG = null;
        return;
      }
      if (this.c != null) {
        if (this.c.I)
        {
          this.c = null;
        }
        else
        {
          this.s = this.c.s;
          this.t = (this.c.aR().b + this.c.K * 0.8D);
          this.u = this.c.u;
          return;
        }
      }
    }
    if (this.a > 0) {
      this.a -= 1;
    }
    if (this.as)
    {
      if (this.o.p(new cj(this.g, this.h, this.i)).c() == this.ar)
      {
        this.at += 1;
        if (this.at == 1200) {
          J();
        }
        return;
      }
      this.as = false;
      
      this.v *= this.V.nextFloat() * 0.2F;
      this.w *= this.V.nextFloat() * 0.2F;
      this.x *= this.V.nextFloat() * 0.2F;
      this.at = 0;
      this.au = 0;
    }
    else
    {
      this.au += 1;
    }
    aui ☃ = new aui(this.s, this.t, this.u);
    aui ☃ = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
    auh ☃ = this.o.a(☃, ☃);
    
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
      if ((☃.ad()) && ((☃ != this.b) || (this.au >= 5)))
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
    if (☃ != null) {
      if (☃.d != null)
      {
        if (☃.d.a(ow.a(this, this.b), 0.0F)) {
          this.c = ☃.d;
        }
      }
      else {
        this.as = true;
      }
    }
    if (this.as) {
      return;
    }
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
    
    float ☃ = 0.92F;
    if ((this.C) || (this.D)) {
      ☃ = 0.5F;
    }
    int ☃ = 5;
    double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      aug ☃ = aR();
      double ☃ = ☃.e - ☃.b;
      double ☃ = ☃.b + ☃ * ☃ / ☃;
      double ☃ = ☃.b + ☃ * (☃ + 1) / ☃;
      aug ☃ = new aug(☃.a, ☃, ☃.c, ☃.d, ☃, ☃.f);
      if (this.o.b(☃, arm.h)) {
        ☃ += 1.0D / ☃;
      }
    }
    if ((!this.o.D) && (☃ > 0.0D))
    {
      le ☃ = (le)this.o;
      
      int ☃ = 1;
      cj ☃ = new cj(this).a();
      if ((this.V.nextFloat() < 0.25F) && (this.o.C(☃))) {
        ☃ = 2;
      }
      if ((this.V.nextFloat() < 0.5F) && (!this.o.i(☃))) {
        ☃--;
      }
      if (this.av > 0)
      {
        this.av -= 1;
        if (this.av <= 0)
        {
          this.aw = 0;
          this.ax = 0;
        }
      }
      else if (this.ax > 0)
      {
        this.ax -= ☃;
        if (this.ax <= 0)
        {
          this.w -= 0.20000000298023224D;
          a("random.splash", 0.25F, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
          float ☃ = ns.c(aR().b);
          ☃.a(cy.e, this.s, ☃ + 1.0F, this.u, (int)(1.0F + this.J * 20.0F), this.J, 0.0D, this.J, 0.20000000298023224D, new int[0]);
          ☃.a(cy.g, this.s, ☃ + 1.0F, this.u, (int)(1.0F + this.J * 20.0F), this.J, 0.0D, this.J, 0.20000000298023224D, new int[0]);
          
          this.av = ns.a(this.V, 10, 30);
        }
        else
        {
          this.ay = ((float)(this.ay + this.V.nextGaussian() * 4.0D));
          
          float ☃ = this.ay * 0.017453292F;
          float ☃ = ns.a(☃);
          float ☃ = ns.b(☃);
          double ☃ = this.s + ☃ * this.ax * 0.1F;
          double ☃ = ns.c(aR().b) + 1.0F;
          double ☃ = this.u + ☃ * this.ax * 0.1F;
          
          afh ☃ = ☃.p(new cj((int)☃, (int)☃ - 1, (int)☃)).c();
          if ((☃ == afi.j) || (☃ == afi.i))
          {
            if (this.V.nextFloat() < 0.15F) {
              ☃.a(cy.e, ☃, ☃ - 0.10000000149011612D, ☃, 1, ☃, 0.1D, ☃, 0.0D, new int[0]);
            }
            float ☃ = ☃ * 0.04F;
            float ☃ = ☃ * 0.04F;
            
            ☃.a(cy.g, ☃, ☃, ☃, 0, ☃, 0.01D, -☃, 1.0D, new int[0]);
            ☃.a(cy.g, ☃, ☃, ☃, 0, -☃, 0.01D, ☃, 1.0D, new int[0]);
          }
        }
      }
      else if (this.aw > 0)
      {
        this.aw -= ☃;
        
        float ☃ = 0.15F;
        if (this.aw < 20) {
          ☃ = (float)(☃ + (20 - this.aw) * 0.05D);
        } else if (this.aw < 40) {
          ☃ = (float)(☃ + (40 - this.aw) * 0.02D);
        } else if (this.aw < 60) {
          ☃ = (float)(☃ + (60 - this.aw) * 0.01D);
        }
        if (this.V.nextFloat() < ☃)
        {
          float ☃ = ns.a(this.V, 0.0F, 360.0F) * 0.017453292F;
          float ☃ = ns.a(this.V, 25.0F, 60.0F);
          double ☃ = this.s + ns.a(☃) * ☃ * 0.1F;
          double ☃ = ns.c(aR().b) + 1.0F;
          double ☃ = this.u + ns.b(☃) * ☃ * 0.1F;
          afh ☃ = ☃.p(new cj((int)☃, (int)☃ - 1, (int)☃)).c();
          if ((☃ == afi.j) || (☃ == afi.i)) {
            ☃.a(cy.f, ☃, ☃, ☃, 2 + this.V.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D, new int[0]);
          }
        }
        if (this.aw <= 0)
        {
          this.ay = ns.a(this.V, 0.0F, 360.0F);
          this.ax = ns.a(this.V, 20, 80);
        }
      }
      else
      {
        this.aw = ns.a(this.V, 100, 900);
        this.aw -= ack.h(this.b) * 20 * 5;
      }
      if (this.av > 0) {
        this.w -= this.V.nextFloat() * this.V.nextFloat() * this.V.nextFloat() * 0.2D;
      }
    }
    double ☃ = ☃ * 2.0D - 1.0D;
    this.w += 0.03999999910593033D * ☃;
    if (☃ > 0.0D)
    {
      ☃ = (float)(☃ * 0.9D);
      this.w *= 0.8D;
    }
    this.v *= ☃;
    this.w *= ☃;
    this.x *= ☃;
    
    b(this.s, this.t, this.u);
  }
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)this.g);
    ☃.a("yTile", (short)this.h);
    ☃.a("zTile", (short)this.i);
    jy ☃ = (jy)afh.c.c(this.ar);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("shake", (byte)this.a);
    ☃.a("inGround", (byte)(this.as ? 1 : 0));
  }
  
  public void a(dn ☃)
  {
    this.g = ☃.e("xTile");
    this.h = ☃.e("yTile");
    this.i = ☃.e("zTile");
    if (☃.b("inTile", 8)) {
      this.ar = afh.b(☃.j("inTile"));
    } else {
      this.ar = afh.c(☃.d("inTile") & 0xFF);
    }
    this.a = (☃.d("shake") & 0xFF);
    this.as = (☃.d("inGround") == 1);
  }
  
  public int l()
  {
    if (this.o.D) {
      return 0;
    }
    int ☃ = 0;
    if (this.c != null)
    {
      double ☃ = this.b.s - this.s;
      double ☃ = this.b.t - this.t;
      double ☃ = this.b.u - this.u;
      
      double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
      double ☃ = 0.1D;
      this.c.v += ☃ * ☃;
      this.c.w += ☃ * ☃ + ns.a(☃) * 0.08D;
      this.c.x += ☃ * ☃;
      ☃ = 3;
    }
    else if (this.av > 0)
    {
      uz ☃ = new uz(this.o, this.s, this.t, this.u, m());
      double ☃ = this.b.s - this.s;
      double ☃ = this.b.t - this.t;
      double ☃ = this.b.u - this.u;
      
      double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
      double ☃ = 0.1D;
      ☃.v = (☃ * ☃);
      ☃.w = (☃ * ☃ + ns.a(☃) * 0.08D);
      ☃.x = (☃ * ☃);
      this.o.d(☃);
      this.b.o.d(new pp(this.b.o, this.b.s, this.b.t + 0.5D, this.b.u + 0.5D, this.V.nextInt(6) + 1));
      ☃ = 1;
    }
    if (this.as) {
      ☃ = 2;
    }
    J();
    this.b.bG = null;
    return ☃;
  }
  
  private zx m()
  {
    float ☃ = this.o.s.nextFloat();
    int ☃ = ack.g(this.b);
    int ☃ = ack.h(this.b);
    float ☃ = 0.1F - ☃ * 0.025F - ☃ * 0.01F;
    float ☃ = 0.05F + ☃ * 0.01F - ☃ * 0.01F;
    
    ☃ = ns.a(☃, 0.0F, 1.0F);
    ☃ = ns.a(☃, 0.0F, 1.0F);
    if (☃ < ☃)
    {
      this.b.b(na.D);
      return ((us)oa.a(this.V, d)).a(this.V);
    }
    ☃ -= ☃;
    if (☃ < ☃)
    {
      this.b.b(na.E);
      return ((us)oa.a(this.V, e)).a(this.V);
    }
    ☃ -= ☃;
    
    this.b.b(na.C);
    return ((us)oa.a(this.V, f)).a(this.V);
  }
  
  public void J()
  {
    super.J();
    if (this.b != null) {
      this.b.bG = null;
    }
  }
}
