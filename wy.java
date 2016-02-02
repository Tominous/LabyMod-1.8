import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class wy
  extends pk
  implements wv
{
  private int c = -1;
  private int d = -1;
  private int e = -1;
  private afh f;
  protected boolean a;
  public int b;
  private pr g;
  private String h;
  private int i;
  private int ar;
  
  public wy(adm ☃)
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
  
  public wy(adm ☃, pr ☃)
  {
    super(☃);
    this.g = ☃;
    
    a(0.25F, 0.25F);
    
    b(☃.s, ☃.t + ☃.aS(), ☃.u, ☃.y, ☃.z);
    
    this.s -= ns.b(this.y / 180.0F * 3.1415927F) * 0.16F;
    this.t -= 0.10000000149011612D;
    this.u -= ns.a(this.y / 180.0F * 3.1415927F) * 0.16F;
    b(this.s, this.t, this.u);
    
    float ☃ = 0.4F;
    this.v = (-ns.a(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F) * ☃);
    this.x = (ns.b(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F) * ☃);
    this.w = (-ns.a((this.z + l()) / 180.0F * 3.1415927F) * ☃);
    
    c(this.v, this.w, this.x, j(), 1.0F);
  }
  
  public wy(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    this.i = 0;
    
    a(0.25F, 0.25F);
    
    b(☃, ☃, ☃);
  }
  
  protected float j()
  {
    return 1.5F;
  }
  
  protected float l()
  {
    return 0.0F;
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
    this.i = 0;
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
    if (this.b > 0) {
      this.b -= 1;
    }
    if (this.a)
    {
      if (this.o.p(new cj(this.c, this.d, this.e)).c() == this.f)
      {
        this.i += 1;
        if (this.i == 1200) {
          J();
        }
        return;
      }
      this.a = false;
      
      this.v *= this.V.nextFloat() * 0.2F;
      this.w *= this.V.nextFloat() * 0.2F;
      this.x *= this.V.nextFloat() * 0.2F;
      this.i = 0;
      this.ar = 0;
    }
    else
    {
      this.ar += 1;
    }
    aui ☃ = new aui(this.s, this.t, this.u);
    aui ☃ = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
    auh ☃ = this.o.a(☃, ☃);
    
    ☃ = new aui(this.s, this.t, this.u);
    ☃ = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
    if (☃ != null) {
      ☃ = new aui(☃.c.a, ☃.c.b, ☃.c.c);
    }
    if (!this.o.D)
    {
      pk ☃ = null;
      List<pk> ☃ = this.o.b(this, aR().a(this.v, this.w, this.x).b(1.0D, 1.0D, 1.0D));
      double ☃ = 0.0D;
      pr ☃ = n();
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        pk ☃ = (pk)☃.get(☃);
        if ((☃.ad()) && ((☃ != ☃) || (this.ar >= 5)))
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
    }
    if (☃ != null) {
      if ((☃.a == auh.a.b) && (this.o.p(☃.a()).c() == afi.aY)) {
        d(☃.a());
      } else {
        a(☃);
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
    float ☃ = m();
    if (V())
    {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        float ☃ = 0.25F;
        this.o.a(cy.e, this.s - this.v * ☃, this.t - this.w * ☃, this.u - this.x * ☃, this.v, this.w, this.x, new int[0]);
      }
      ☃ = 0.8F;
    }
    this.v *= ☃;
    this.w *= ☃;
    this.x *= ☃;
    this.w -= ☃;
    
    b(this.s, this.t, this.u);
  }
  
  protected float m()
  {
    return 0.03F;
  }
  
  protected abstract void a(auh paramauh);
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)this.c);
    ☃.a("yTile", (short)this.d);
    ☃.a("zTile", (short)this.e);
    jy ☃ = (jy)afh.c.c(this.f);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("shake", (byte)this.b);
    ☃.a("inGround", (byte)(this.a ? 1 : 0));
    if (((this.h == null) || (this.h.length() == 0)) && ((this.g instanceof wn))) {
      this.h = this.g.e_();
    }
    ☃.a("ownerName", this.h == null ? "" : this.h);
  }
  
  public void a(dn ☃)
  {
    this.c = ☃.e("xTile");
    this.d = ☃.e("yTile");
    this.e = ☃.e("zTile");
    if (☃.b("inTile", 8)) {
      this.f = afh.b(☃.j("inTile"));
    } else {
      this.f = afh.c(☃.d("inTile") & 0xFF);
    }
    this.b = (☃.d("shake") & 0xFF);
    this.a = (☃.d("inGround") == 1);
    this.g = null;
    this.h = ☃.j("ownerName");
    if ((this.h != null) && (this.h.length() == 0)) {
      this.h = null;
    }
    this.g = n();
  }
  
  public pr n()
  {
    if ((this.g == null) && (this.h != null) && (this.h.length() > 0))
    {
      this.g = this.o.a(this.h);
      if ((this.g == null) && ((this.o instanceof le))) {
        try
        {
          pk ☃ = ((le)this.o).a(UUID.fromString(this.h));
          if ((☃ instanceof pr)) {
            this.g = ((pr)☃);
          }
        }
        catch (Throwable ☃)
        {
          this.g = null;
        }
      }
    }
    return this.g;
  }
}
