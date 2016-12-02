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
    a = ☃;
  }
  
  protected void h() {}
  
  protected void a(cq ☃)
  {
    Validate.notNull(☃);
    Validate.isTrue(☃.k().c());
    
    b = ☃;
    A = (y = b.b() * 90);
    
    o();
  }
  
  private void o()
  {
    if (b == null) {
      return;
    }
    double ☃ = a.n() + 0.5D;
    double ☃ = a.o() + 0.5D;
    double ☃ = a.p() + 0.5D;
    
    double ☃ = 0.46875D;
    double ☃ = a(l());
    double ☃ = a(m());
    
    ☃ -= b.g() * 0.46875D;
    ☃ -= b.i() * 0.46875D;
    ☃ += ☃;
    
    cq ☃ = b.f();
    ☃ += ☃ * ☃.g();
    ☃ += ☃ * ☃.i();
    
    s = ☃;
    t = ☃;
    u = ☃;
    
    double ☃ = l();
    double ☃ = m();
    double ☃ = l();
    if (b.k() == cq.a.c) {
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
    p = s;
    q = t;
    r = u;
    if ((c++ == 100) && (!o.D))
    {
      c = 0;
      if ((!I) && (!j()))
      {
        J();
        b(null);
      }
    }
  }
  
  public boolean j()
  {
    if (!o.a(this, aR()).isEmpty()) {
      return false;
    }
    int ☃ = Math.max(1, l() / 16);
    int ☃ = Math.max(1, m() / 16);
    
    cj ☃ = a.a(b.d());
    cq ☃ = b.f();
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        cj ☃ = ☃.a(☃, ☃).b(☃);
        
        afh ☃ = o.p(☃).c();
        if ((!☃.t().a()) && (!agd.d(☃))) {
          return false;
        }
      }
    }
    List<pk> ☃ = o.b(this, aR());
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
    return b;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((!I) && (!o.D))
    {
      J();
      ac();
      b(☃.j());
    }
    return true;
  }
  
  public void d(double ☃, double ☃, double ☃)
  {
    if ((!o.D) && (!I) && (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 0.0D))
    {
      J();
      b(null);
    }
  }
  
  public void g(double ☃, double ☃, double ☃)
  {
    if ((!o.D) && (!I) && (☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 0.0D))
    {
      J();
      b(null);
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("Facing", (byte)b.b());
    ☃.a("TileX", n().n());
    ☃.a("TileY", n().o());
    ☃.a("TileZ", n().p());
  }
  
  public void a(dn ☃)
  {
    a = new cj(☃.f("TileX"), ☃.f("TileY"), ☃.f("TileZ"));
    cq ☃;
    if (☃.b("Direction", 99))
    {
      cq ☃ = cq.b(☃.d("Direction"));
      a = a.a(☃);
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
    s = ☃;
    t = ☃;
    u = ☃;
    cj ☃ = a;
    a = new cj(☃, ☃, ☃);
    if (!a.equals(☃))
    {
      o();
      ai = true;
    }
  }
  
  public cj n()
  {
    return a;
  }
}
