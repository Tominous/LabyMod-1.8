import java.util.List;
import org.apache.commons.lang3.Validate;

public abstract class un
  extends pk
{
  private int c;
  protected cj a;
  public cq b;
  
  public un(adm ☃)
  {
    super(☃);
    a(0.5F, 0.5F);
  }
  
  public un(adm ☃, cj ☃)
  {
    this(☃);
    this.a = ☃;
  }
  
  protected void h() {}
  
  protected void a(cq ☃)
  {
    Validate.notNull(☃);
    Validate.isTrue(☃.k().c());
    
    this.b = ☃;
    this.A = (this.y = this.b.b() * 90);
    
    o();
  }
  
  private void o()
  {
    if (this.b == null) {
      return;
    }
    double ☃ = this.a.n() + 0.5D;
    double ☃ = this.a.o() + 0.5D;
    double ☃ = this.a.p() + 0.5D;
    
    double ☃ = 0.46875D;
    double ☃ = a(l());
    double ☃ = a(m());
    
    ☃ -= this.b.g() * 0.46875D;
    ☃ -= this.b.i() * 0.46875D;
    ☃ += ☃;
    
    cq ☃ = this.b.f();
    ☃ += ☃ * ☃.g();
    ☃ += ☃ * ☃.i();
    
    this.s = ☃;
    this.t = ☃;
    this.u = ☃;
    
    double ☃ = l();
    double ☃ = m();
    double ☃ = l();
    if (this.b.k() == cq.a.c) {
      ☃ = 1.0D;
    } else {
      ☃ = 1.0D;
    }
    ☃ /= 32.0D;
    ☃ /= 32.0D;
    ☃ /= 32.0D;
    a(new aug(☃ - ☃, ☃ - ☃, ☃ - ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃));
  }
  
  private double a(int ☃)
  {
    return ☃ % 32 == 0 ? 0.5D : 0.0D;
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if ((this.c++ == 100) && (!this.o.D))
    {
      this.c = 0;
      if ((!this.I) && (!j()))
      {
        J();
        b(null);
      }
    }
  }
  
  public boolean j()
  {
    if (!this.o.a(this, aR()).isEmpty()) {
      return false;
    }
    int ☃ = Math.max(1, l() / 16);
    int ☃ = Math.max(1, m() / 16);
    
    cj ☃ = this.a.a(this.b.d());
    cq ☃ = this.b.f();
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        cj ☃ = ☃.a(☃, ☃).b(☃);
        
        afh ☃ = this.o.p(☃).c();
        if ((!☃.t().a()) && (!agd.d(☃))) {
          return false;
        }
      }
    }
    List<pk> ☃ = this.o.b(this, aR());
    for (pk ☃ : ☃) {
      if ((☃ instanceof un)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean ad()
  {
    return true;
  }
  
  public boolean l(pk ☃)
  {
    if ((☃ instanceof wn)) {
      return a(ow.a((wn)☃), 0.0F);
    }
    return false;
  }
  
  public cq aP()
  {
    return this.b;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((!this.I) && (!this.o.D))
    {
      J();
      ac();
      b(☃.j());
    }
    return true;
  }
  
  public void d(double ☃, double ☃, double ☃)
  {
    if ((!this.o.D) && (!this.I) && (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 0.0D))
    {
      J();
      b(null);
    }
  }
  
  public void g(double ☃, double ☃, double ☃)
  {
    if ((!this.o.D) && (!this.I) && (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 0.0D))
    {
      J();
      b(null);
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("Facing", (byte)this.b.b());
    ☃.a("TileX", n().n());
    ☃.a("TileY", n().o());
    ☃.a("TileZ", n().p());
  }
  
  public void a(dn ☃)
  {
    this.a = new cj(☃.f("TileX"), ☃.f("TileY"), ☃.f("TileZ"));
    cq ☃;
    if (☃.b("Direction", 99))
    {
      cq ☃ = cq.b(☃.d("Direction"));
      this.a = this.a.a(☃);
    }
    else
    {
      cq ☃;
      if (☃.b("Facing", 99)) {
        ☃ = cq.b(☃.d("Facing"));
      } else {
        ☃ = cq.b(☃.d("Dir"));
      }
    }
    a(☃);
  }
  
  public abstract int l();
  
  public abstract int m();
  
  public abstract void b(pk parampk);
  
  protected boolean af()
  {
    return false;
  }
  
  public void b(double ☃, double ☃, double ☃)
  {
    this.s = ☃;
    this.t = ☃;
    this.u = ☃;
    cj ☃ = this.a;
    this.a = new cj(☃, ☃, ☃);
    if (!this.a.equals(☃))
    {
      o();
      this.ai = true;
    }
  }
  
  public cj n()
  {
    return this.a;
  }
}
