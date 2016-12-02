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
    b = ☃;
    c = ☃;
    a = ☃.a(vy.b);
    j = a();
  }
  
  protected abstract asy a();
  
  public void a(double ☃)
  {
    e = ☃;
  }
  
  public float i()
  {
    return (float)a.e();
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
    c.B.a("pathfind");
    cj ☃ = new cj(b);
    int ☃ = (int)(☃ + 8.0F);
    
    adv ☃ = new adv(c, ☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃), 0);
    asx ☃ = j.a(☃, b, ☃, ☃);
    c.B.b();
    return ☃;
  }
  
  public boolean a(double ☃, double ☃, double ☃, double ☃)
  {
    asx ☃ = a(ns.c(☃), (int)☃, ns.c(☃));
    return a(☃, ☃);
  }
  
  public void a(float ☃)
  {
    i = ☃;
  }
  
  public asx a(pk ☃)
  {
    if (!b()) {
      return null;
    }
    float ☃ = i();
    c.B.a("pathfind");
    cj ☃ = new cj(b).a();
    int ☃ = (int)(☃ + 16.0F);
    
    adv ☃ = new adv(c, ☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃), 0);
    asx ☃ = j.a(☃, b, ☃, ☃);
    c.B.b();
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
      d = null;
      return false;
    }
    if (!☃.a(d)) {
      d = ☃;
    }
    d();
    if (d.d() == 0) {
      return false;
    }
    e = ☃;
    aui ☃ = c();
    g = f;
    h = ☃;
    return true;
  }
  
  public asx j()
  {
    return d;
  }
  
  public void k()
  {
    f += 1;
    if (m()) {
      return;
    }
    if (b())
    {
      l();
    }
    else if ((d != null) && (d.e() < d.d()))
    {
      aui ☃ = c();
      aui ☃ = d.a(b, d.e());
      if ((b > b) && (!b.C) && (ns.c(a) == ns.c(a)) && (ns.c(c) == ns.c(c))) {
        d.c(d.e() + 1);
      }
    }
    if (m()) {
      return;
    }
    aui ☃ = d.a(b);
    if (☃ == null) {
      return;
    }
    aug ☃ = new aug(a, b, c, a, b, c).b(0.5D, 0.5D, 0.5D);
    List<aug> ☃ = c.a(b, ☃.a(0.0D, -1.0D, 0.0D));
    double ☃ = -1.0D;
    ☃ = ☃.c(0.0D, 1.0D, 0.0D);
    for (aug ☃ : ☃) {
      ☃ = ☃.b(☃, ☃);
    }
    b.q().a(a, b + ☃, c, e);
  }
  
  protected void l()
  {
    aui ☃ = c();
    
    int ☃ = d.d();
    for (int ☃ = d.e(); ☃ < d.d(); ☃++) {
      if (d.a(☃).b != (int)b)
      {
        ☃ = ☃;
        break;
      }
    }
    float ☃ = b.J * b.J * i;
    for (int ☃ = d.e(); ☃ < ☃; ☃++)
    {
      aui ☃ = d.a(b, ☃);
      if (☃.g(☃) < ☃) {
        d.c(☃ + 1);
      }
    }
    int ☃ = ns.f(b.J);
    int ☃ = (int)b.K + 1;
    int ☃ = ☃;
    for (int ☃ = ☃ - 1; ☃ >= d.e(); ☃--) {
      if (a(☃, d.a(b, ☃), ☃, ☃, ☃))
      {
        d.c(☃);
        break;
      }
    }
    a(☃);
  }
  
  protected void a(aui ☃)
  {
    if (f - g > 100)
    {
      if (☃.g(h) < 2.25D) {
        n();
      }
      g = f;
      h = ☃;
    }
  }
  
  public boolean m()
  {
    return (d == null) || (d.b());
  }
  
  public void n()
  {
    d = null;
  }
  
  protected abstract aui c();
  
  protected abstract boolean b();
  
  protected boolean o()
  {
    return (b.V()) || (b.ab());
  }
  
  protected void d() {}
  
  protected abstract boolean a(aui paramaui1, aui paramaui2, int paramInt1, int paramInt2, int paramInt3);
}
