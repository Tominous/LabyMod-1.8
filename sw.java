import java.util.List;

public abstract class sw
{
  protected ps b;
  protected adm c;
  protected asx d;
  protected double e;
  private final qc a;
  private int f;
  private int g;
  private aui h = new aui(0.0D, 0.0D, 0.0D);
  private float i = 1.0F;
  private final asy j;
  
  public sw(ps ☃, adm ☃)
  {
    this.b = ☃;
    this.c = ☃;
    this.a = ☃.a(vy.b);
    this.j = a();
  }
  
  protected abstract asy a();
  
  public void a(double ☃)
  {
    this.e = ☃;
  }
  
  public float i()
  {
    return (float)this.a.e();
  }
  
  public final asx a(double ☃, double ☃, double ☃)
  {
    return a(new cj(ns.c(☃), (int)☃, ns.c(☃)));
  }
  
  public asx a(cj ☃)
  {
    if (!b()) {
      return null;
    }
    float ☃ = i();
    this.c.B.a("pathfind");
    cj ☃ = new cj(this.b);
    int ☃ = (int)(☃ + 8.0F);
    
    adv ☃ = new adv(this.c, ☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃), 0);
    asx ☃ = this.j.a(☃, this.b, ☃, ☃);
    this.c.B.b();
    return ☃;
  }
  
  public boolean a(double ☃, double ☃, double ☃, double ☃)
  {
    asx ☃ = a(ns.c(☃), (int)☃, ns.c(☃));
    return a(☃, ☃);
  }
  
  public void a(float ☃)
  {
    this.i = ☃;
  }
  
  public asx a(pk ☃)
  {
    if (!b()) {
      return null;
    }
    float ☃ = i();
    this.c.B.a("pathfind");
    cj ☃ = new cj(this.b).a();
    int ☃ = (int)(☃ + 16.0F);
    
    adv ☃ = new adv(this.c, ☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃), 0);
    asx ☃ = this.j.a(☃, this.b, ☃, ☃);
    this.c.B.b();
    return ☃;
  }
  
  public boolean a(pk ☃, double ☃)
  {
    asx ☃ = a(☃);
    if (☃ != null) {
      return a(☃, ☃);
    }
    return false;
  }
  
  public boolean a(asx ☃, double ☃)
  {
    if (☃ == null)
    {
      this.d = null;
      return false;
    }
    if (!☃.a(this.d)) {
      this.d = ☃;
    }
    d();
    if (this.d.d() == 0) {
      return false;
    }
    this.e = ☃;
    aui ☃ = c();
    this.g = this.f;
    this.h = ☃;
    return true;
  }
  
  public asx j()
  {
    return this.d;
  }
  
  public void k()
  {
    this.f += 1;
    if (m()) {
      return;
    }
    if (b())
    {
      l();
    }
    else if ((this.d != null) && (this.d.e() < this.d.d()))
    {
      aui ☃ = c();
      aui ☃ = this.d.a(this.b, this.d.e());
      if ((☃.b > ☃.b) && (!this.b.C) && (ns.c(☃.a) == ns.c(☃.a)) && (ns.c(☃.c) == ns.c(☃.c))) {
        this.d.c(this.d.e() + 1);
      }
    }
    if (m()) {
      return;
    }
    aui ☃ = this.d.a(this.b);
    if (☃ == null) {
      return;
    }
    aug ☃ = new aug(☃.a, ☃.b, ☃.c, ☃.a, ☃.b, ☃.c).b(0.5D, 0.5D, 0.5D);
    List<aug> ☃ = this.c.a(this.b, ☃.a(0.0D, -1.0D, 0.0D));
    double ☃ = -1.0D;
    ☃ = ☃.c(0.0D, 1.0D, 0.0D);
    for (aug ☃ : ☃) {
      ☃ = ☃.b(☃, ☃);
    }
    this.b.q().a(☃.a, ☃.b + ☃, ☃.c, this.e);
  }
  
  protected void l()
  {
    aui ☃ = c();
    
    int ☃ = this.d.d();
    for (int ☃ = this.d.e(); ☃ < this.d.d(); ☃++) {
      if (this.d.a(☃).b != (int)☃.b)
      {
        ☃ = ☃;
        break;
      }
    }
    float ☃ = this.b.J * this.b.J * this.i;
    for (int ☃ = this.d.e(); ☃ < ☃; ☃++)
    {
      aui ☃ = this.d.a(this.b, ☃);
      if (☃.g(☃) < ☃) {
        this.d.c(☃ + 1);
      }
    }
    int ☃ = ns.f(this.b.J);
    int ☃ = (int)this.b.K + 1;
    int ☃ = ☃;
    for (int ☃ = ☃ - 1; ☃ >= this.d.e(); ☃--) {
      if (a(☃, this.d.a(this.b, ☃), ☃, ☃, ☃))
      {
        this.d.c(☃);
        break;
      }
    }
    a(☃);
  }
  
  protected void a(aui ☃)
  {
    if (this.f - this.g > 100)
    {
      if (☃.g(this.h) < 2.25D) {
        n();
      }
      this.g = this.f;
      this.h = ☃;
    }
  }
  
  public boolean m()
  {
    return (this.d == null) || (this.d.b());
  }
  
  public void n()
  {
    this.d = null;
  }
  
  protected abstract aui c();
  
  protected abstract boolean b();
  
  protected boolean o()
  {
    return (this.b.V()) || (this.b.ab());
  }
  
  protected void d() {}
  
  protected abstract boolean a(aui paramaui1, aui paramaui2, int paramInt1, int paramInt2, int paramInt3);
}
