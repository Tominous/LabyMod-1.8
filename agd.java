import java.util.Random;

public abstract class agd
  extends age
{
  protected final boolean N;
  
  protected agd(boolean ☃)
  {
    super(arm.q);
    this.N = ☃;
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    if (adm.a(☃, ☃.b())) {
      return super.d(☃, ☃);
    }
    return false;
  }
  
  public boolean e(adm ☃, cj ☃)
  {
    if (adm.a(☃, ☃.b())) {
      return true;
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (b(☃, ☃, ☃)) {
      return;
    }
    boolean ☃ = e(☃, ☃, ☃);
    if ((this.N) && (!☃))
    {
      ☃.a(☃, k(☃), 2);
    }
    else if (!this.N)
    {
      ☃.a(☃, e(☃), 2);
      if (!☃) {
        ☃.a(☃, e(☃).c(), m(☃), -1);
      }
    }
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    return ☃.k() != cq.a.b;
  }
  
  protected boolean l(alz ☃)
  {
    return this.N;
  }
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return a(☃, ☃, ☃, ☃);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (!l(☃)) {
      return 0;
    }
    if (☃.b(O) == ☃) {
      return a(☃, ☃, ☃);
    }
    return 0;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (e(☃, ☃))
    {
      g(☃, ☃, ☃);
      return;
    }
    b(☃, ☃, ☃, 0);
    ☃.g(☃);
    for (cq ☃ : cq.values()) {
      ☃.c(☃.a(☃), this);
    }
  }
  
  protected void g(adm ☃, cj ☃, alz ☃)
  {
    if (b(☃, ☃, ☃)) {
      return;
    }
    boolean ☃ = e(☃, ☃, ☃);
    if (((this.N) && (!☃)) || ((!this.N) && (☃) && (!☃.a(☃, this))))
    {
      int ☃ = -1;
      if (i(☃, ☃, ☃)) {
        ☃ = -3;
      } else if (this.N) {
        ☃ = -2;
      }
      ☃.a(☃, this, d(☃), ☃);
    }
  }
  
  public boolean b(adq ☃, cj ☃, alz ☃)
  {
    return false;
  }
  
  protected boolean e(adm ☃, cj ☃, alz ☃)
  {
    return f(☃, ☃, ☃) > 0;
  }
  
  protected int f(adm ☃, cj ☃, alz ☃)
  {
    cq ☃ = (cq)☃.b(O);
    
    cj ☃ = ☃.a(☃);
    int ☃ = ☃.c(☃, ☃);
    if (☃ >= 15) {
      return ☃;
    }
    alz ☃ = ☃.p(☃);
    return Math.max(☃, ☃.c() == afi.af ? ((Integer)☃.b(ajb.P)).intValue() : 0);
  }
  
  protected int c(adq ☃, cj ☃, alz ☃)
  {
    cq ☃ = (cq)☃.b(O);
    cq ☃ = ☃.e();
    cq ☃ = ☃.f();
    return Math.max(c(☃, ☃.a(☃), ☃), c(☃, ☃.a(☃), ☃));
  }
  
  protected int c(adq ☃, cj ☃, cq ☃)
  {
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (c(☃))
    {
      if (☃ == afi.af) {
        return ((Integer)☃.b(ajb.P)).intValue();
      }
      return ☃.a(☃, ☃);
    }
    return 0;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(O, ☃.aP().d());
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    if (e(☃, ☃, ☃)) {
      ☃.a(☃, this, 1);
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    h(☃, ☃, ☃);
  }
  
  protected void h(adm ☃, cj ☃, alz ☃)
  {
    cq ☃ = (cq)☃.b(O);
    cj ☃ = ☃.a(☃.d());
    
    ☃.d(☃, this);
    ☃.a(☃, this, ☃);
  }
  
  public void d(adm ☃, cj ☃, alz ☃)
  {
    if (this.N) {
      for (cq ☃ : cq.values()) {
        ☃.c(☃.a(☃), this);
      }
    }
    super.d(☃, ☃, ☃);
  }
  
  public boolean c()
  {
    return false;
  }
  
  protected boolean c(afh ☃)
  {
    return ☃.i();
  }
  
  protected int a(adq ☃, cj ☃, alz ☃)
  {
    return 15;
  }
  
  public static boolean d(afh ☃)
  {
    return (afi.bb.e(☃)) || (afi.cj.e(☃));
  }
  
  public boolean e(afh ☃)
  {
    return (☃ == e(Q()).c()) || (☃ == k(Q()).c());
  }
  
  public boolean i(adm ☃, cj ☃, alz ☃)
  {
    cq ☃ = ((cq)☃.b(O)).d();
    cj ☃ = ☃.a(☃);
    if (d(☃.p(☃).c())) {
      return ☃.p(☃).b(O) != ☃;
    }
    return false;
  }
  
  protected int m(alz ☃)
  {
    return d(☃);
  }
  
  protected abstract int d(alz paramalz);
  
  protected abstract alz e(alz paramalz);
  
  protected abstract alz k(alz paramalz);
  
  public boolean b(afh ☃)
  {
    return e(☃);
  }
  
  public adf m()
  {
    return adf.c;
  }
}
