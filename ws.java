import java.util.List;
import java.util.Random;

public abstract class ws
  extends pk
{
  private int e = -1;
  private int f = -1;
  private int g = -1;
  private afh h;
  private boolean i;
  public pr a;
  private int ar;
  private int as;
  public double b;
  public double c;
  public double d;
  
  public ws(adm ☃)
  {
    super(☃);
    a(1.0F, 1.0F);
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
  
  public ws(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    a(1.0F, 1.0F);
    
    b(☃, ☃, ☃, this.y, this.z);
    b(☃, ☃, ☃);
    
    double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    this.b = (☃ / ☃ * 0.1D);
    this.c = (☃ / ☃ * 0.1D);
    this.d = (☃ / ☃ * 0.1D);
  }
  
  public ws(adm ☃, pr ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    this.a = ☃;
    
    a(1.0F, 1.0F);
    
    b(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
    b(this.s, this.t, this.u);
    
    this.v = (this.w = this.x = 0.0D);
    
    ☃ += this.V.nextGaussian() * 0.4D;
    ☃ += this.V.nextGaussian() * 0.4D;
    ☃ += this.V.nextGaussian() * 0.4D;
    double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    this.b = (☃ / ☃ * 0.1D);
    this.c = (☃ / ☃ * 0.1D);
    this.d = (☃ / ☃ * 0.1D);
  }
  
  public void t_()
  {
    if ((!this.o.D) && (((this.a != null) && (this.a.I)) || (!this.o.e(new cj(this)))))
    {
      J();
      return;
    }
    super.t_();
    e(1);
    if (this.i)
    {
      if (this.o.p(new cj(this.e, this.f, this.g)).c() == this.h)
      {
        this.ar += 1;
        if (this.ar == 600) {
          J();
        }
        return;
      }
      this.i = false;
      
      this.v *= this.V.nextFloat() * 0.2F;
      this.w *= this.V.nextFloat() * 0.2F;
      this.x *= this.V.nextFloat() * 0.2F;
      this.ar = 0;
      this.as = 0;
    }
    else
    {
      this.as += 1;
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
      if ((☃.ad()) && ((!☃.k(this.a)) || (this.as >= 25)))
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
      a(☃);
    }
    this.s += this.v;
    this.t += this.w;
    this.u += this.x;
    
    float ☃ = ns.a(this.v * this.v + this.x * this.x);
    this.y = ((float)(ns.b(this.x, this.v) * 180.0D / 3.1415927410125732D) + 90.0F);
    this.z = ((float)(ns.b(☃, this.w) * 180.0D / 3.1415927410125732D) - 90.0F);
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
    
    float ☃ = j();
    if (V())
    {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        float ☃ = 0.25F;
        this.o.a(cy.e, this.s - this.v * ☃, this.t - this.w * ☃, this.u - this.x * ☃, this.v, this.w, this.x, new int[0]);
      }
      ☃ = 0.8F;
    }
    this.v += this.b;
    this.w += this.c;
    this.x += this.d;
    this.v *= ☃;
    this.w *= ☃;
    this.x *= ☃;
    
    this.o.a(cy.l, this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
    
    b(this.s, this.t, this.u);
  }
  
  protected float j()
  {
    return 0.95F;
  }
  
  protected abstract void a(auh paramauh);
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)this.e);
    ☃.a("yTile", (short)this.f);
    ☃.a("zTile", (short)this.g);
    jy ☃ = (jy)afh.c.c(this.h);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("inGround", (byte)(this.i ? 1 : 0));
    ☃.a("direction", a(new double[] { this.v, this.w, this.x }));
  }
  
  public void a(dn ☃)
  {
    this.e = ☃.e("xTile");
    this.f = ☃.e("yTile");
    this.g = ☃.e("zTile");
    if (☃.b("inTile", 8)) {
      this.h = afh.b(☃.j("inTile"));
    } else {
      this.h = afh.c(☃.d("inTile") & 0xFF);
    }
    this.i = (☃.d("inGround") == 1);
    if (☃.b("direction", 9))
    {
      du ☃ = ☃.c("direction", 6);
      this.v = ☃.d(0);
      this.w = ☃.d(1);
      this.x = ☃.d(2);
    }
    else
    {
      J();
    }
  }
  
  public boolean ad()
  {
    return true;
  }
  
  public float ao()
  {
    return 1.0F;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    ac();
    if (☃.j() != null)
    {
      aui ☃ = ☃.j().ap();
      if (☃ != null)
      {
        this.v = ☃.a;
        this.w = ☃.b;
        this.x = ☃.c;
        this.b = (this.v * 0.1D);
        this.c = (this.w * 0.1D);
        this.d = (this.x * 0.1D);
      }
      if ((☃.j() instanceof pr)) {
        this.a = ((pr)☃.j());
      }
      return true;
    }
    return false;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
}
