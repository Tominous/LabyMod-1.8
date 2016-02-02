import java.util.List;

public class um
  extends pr
{
  private static final dc a = new dc(0.0F, 0.0F, 0.0F);
  private static final dc b = new dc(0.0F, 0.0F, 0.0F);
  private static final dc c = new dc(-10.0F, 0.0F, -10.0F);
  private static final dc d = new dc(-15.0F, 0.0F, 10.0F);
  private static final dc e = new dc(-1.0F, 0.0F, -1.0F);
  private static final dc f = new dc(1.0F, 0.0F, 1.0F);
  private final zx[] g = new zx[5];
  private boolean h;
  private long i;
  private int bi;
  private boolean bj;
  private dc bk = a;
  private dc bl = b;
  private dc bm = c;
  private dc bn = d;
  private dc bo = e;
  private dc bp = f;
  
  public um(adm ☃)
  {
    super(☃);
    b(true);
    this.T = p();
    a(0.5F, 1.975F);
  }
  
  public um(adm ☃, double ☃, double ☃, double ☃)
  {
    this(☃);
    b(☃, ☃, ☃);
  }
  
  public boolean bM()
  {
    return (super.bM()) && (!p());
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(10, Byte.valueOf((byte)0));
    this.ac.a(11, a);
    this.ac.a(12, b);
    this.ac.a(13, c);
    this.ac.a(14, d);
    this.ac.a(15, e);
    this.ac.a(16, f);
  }
  
  public zx bA()
  {
    return this.g[0];
  }
  
  public zx p(int ☃)
  {
    return this.g[☃];
  }
  
  public zx q(int ☃)
  {
    return this.g[(☃ + 1)];
  }
  
  public void c(int ☃, zx ☃)
  {
    this.g[☃] = ☃;
  }
  
  public zx[] as()
  {
    return this.g;
  }
  
  public boolean d(int ☃, zx ☃)
  {
    int ☃;
    int ☃;
    if (☃ == 99)
    {
      ☃ = 0;
    }
    else
    {
      ☃ = ☃ - 100 + 1;
      if ((☃ < 0) || (☃ >= this.g.length)) {
        return false;
      }
    }
    if ((☃ == null) || (ps.c(☃) == ☃) || ((☃ == 4) && ((☃.b() instanceof yo))))
    {
      c(☃, ☃);
      return true;
    }
    return false;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    du ☃ = new du();
    for (int ☃ = 0; ☃ < this.g.length; ☃++)
    {
      dn ☃ = new dn();
      if (this.g[☃] != null) {
        this.g[☃].b(☃);
      }
      ☃.a(☃);
    }
    ☃.a("Equipment", ☃);
    if ((aN()) && ((aM() == null) || (aM().length() == 0))) {
      ☃.a("CustomNameVisible", aN());
    }
    ☃.a("Invisible", ax());
    ☃.a("Small", n());
    
    ☃.a("ShowArms", q());
    
    ☃.a("DisabledSlots", this.bi);
    ☃.a("NoGravity", p());
    ☃.a("NoBasePlate", r());
    if (s()) {
      ☃.a("Marker", s());
    }
    ☃.a("Pose", z());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("Equipment", 9))
    {
      du ☃ = ☃.c("Equipment", 10);
      for (int ☃ = 0; ☃ < this.g.length; ☃++) {
        this.g[☃] = zx.a(☃.b(☃));
      }
    }
    e(☃.n("Invisible"));
    
    j(☃.n("Small"));
    
    l(☃.n("ShowArms"));
    
    this.bi = ☃.f("DisabledSlots");
    k(☃.n("NoGravity"));
    m(☃.n("NoBasePlate"));
    n(☃.n("Marker"));
    this.bj = (!s());
    this.T = p();
    dn ☃ = ☃.m("Pose");
    h(☃);
  }
  
  private void h(dn ☃)
  {
    du ☃ = ☃.c("Head", 5);
    if (☃.c() > 0) {
      a(new dc(☃));
    } else {
      a(a);
    }
    du ☃ = ☃.c("Body", 5);
    if (☃.c() > 0) {
      b(new dc(☃));
    } else {
      b(b);
    }
    du ☃ = ☃.c("LeftArm", 5);
    if (☃.c() > 0) {
      c(new dc(☃));
    } else {
      c(c);
    }
    du ☃ = ☃.c("RightArm", 5);
    if (☃.c() > 0) {
      d(new dc(☃));
    } else {
      d(d);
    }
    du ☃ = ☃.c("LeftLeg", 5);
    if (☃.c() > 0) {
      e(new dc(☃));
    } else {
      e(e);
    }
    du ☃ = ☃.c("RightLeg", 5);
    if (☃.c() > 0) {
      f(new dc(☃));
    } else {
      f(f);
    }
  }
  
  private dn z()
  {
    dn ☃ = new dn();
    if (!a.equals(this.bk)) {
      ☃.a("Head", this.bk.a());
    }
    if (!b.equals(this.bl)) {
      ☃.a("Body", this.bl.a());
    }
    if (!c.equals(this.bm)) {
      ☃.a("LeftArm", this.bm.a());
    }
    if (!d.equals(this.bn)) {
      ☃.a("RightArm", this.bn.a());
    }
    if (!e.equals(this.bo)) {
      ☃.a("LeftLeg", this.bo.a());
    }
    if (!f.equals(this.bp)) {
      ☃.a("RightLeg", this.bp.a());
    }
    return ☃;
  }
  
  public boolean ae()
  {
    return false;
  }
  
  protected void s(pk ☃) {}
  
  protected void bL()
  {
    List<pk> ☃ = this.o.b(this, aR());
    if ((☃ != null) && (!☃.isEmpty())) {
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        pk ☃ = (pk)☃.get(☃);
        if (((☃ instanceof va)) && (((va)☃).s() == va.a.a) && 
          (h(☃) <= 0.2D)) {
          ☃.i(this);
        }
      }
    }
  }
  
  public boolean a(wn ☃, aui ☃)
  {
    if (s()) {
      return false;
    }
    if ((this.o.D) || (☃.v())) {
      return true;
    }
    int ☃ = 0;
    zx ☃ = ☃.bZ();
    boolean ☃ = ☃ != null;
    if ((☃) && ((☃.b() instanceof yj)))
    {
      yj ☃ = (yj)☃.b();
      if (☃.b == 3) {
        ☃ = 1;
      } else if (☃.b == 2) {
        ☃ = 2;
      } else if (☃.b == 1) {
        ☃ = 3;
      } else if (☃.b == 0) {
        ☃ = 4;
      }
    }
    if ((☃) && ((☃.b() == zy.bX) || (☃.b() == zw.a(afi.aU)))) {
      ☃ = 4;
    }
    double ☃ = 0.1D;
    double ☃ = 0.9D;
    double ☃ = 0.4D;
    double ☃ = 1.6D;
    
    int ☃ = 0;
    boolean ☃ = n();
    double ☃ = ☃ ? ☃.b * 2.0D : ☃.b;
    if (☃ >= 0.1D) {
      if ((☃ < 0.1D + (☃ ? 0.8D : 0.45D)) && (this.g[1] != null))
      {
        ☃ = 1;
        break label383;
      }
    }
    if (☃ >= 0.9D + (☃ ? 0.3D : 0.0D)) {
      if ((☃ < 0.9D + (☃ ? 1.0D : 0.7D)) && (this.g[3] != null))
      {
        ☃ = 3;
        break label383;
      }
    }
    if (☃ >= 0.4D) {
      if ((☃ < 0.4D + (☃ ? 1.0D : 0.8D)) && (this.g[2] != null))
      {
        ☃ = 2;
        break label383;
      }
    }
    if ((☃ >= 1.6D) && (this.g[4] != null)) {
      ☃ = 4;
    }
    label383:
    boolean ☃ = this.g[☃] != null;
    if (((this.bi & 1 << ☃) != 0) || ((this.bi & 1 << ☃) != 0))
    {
      ☃ = ☃;
      if ((this.bi & 1 << ☃) != 0)
      {
        if ((this.bi & 0x1) != 0) {
          return true;
        }
        ☃ = 0;
      }
    }
    if ((☃) && (☃ == 0) && (!q())) {
      return true;
    }
    if (☃) {
      a(☃, ☃);
    } else if (☃) {
      a(☃, ☃);
    }
    return true;
  }
  
  private void a(wn ☃, int ☃)
  {
    zx ☃ = this.g[☃];
    if ((☃ != null) && ((this.bi & 1 << ☃ + 8) != 0)) {
      return;
    }
    if ((☃ == null) && ((this.bi & 1 << ☃ + 16) != 0)) {
      return;
    }
    int ☃ = ☃.bi.c;
    zx ☃ = ☃.bi.a(☃);
    if ((☃.bA.d) && ((☃ == null) || (☃.b() == zw.a(afi.a))) && (☃ != null))
    {
      zx ☃ = ☃.k();
      ☃.b = 1;
      c(☃, ☃);
      return;
    }
    if ((☃ != null) && (☃.b > 1))
    {
      if (☃ != null) {
        return;
      }
      zx ☃ = ☃.k();
      ☃.b = 1;
      c(☃, ☃);
      ☃.b -= 1;
      return;
    }
    c(☃, ☃);
    ☃.bi.a(☃, ☃);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (this.o.D) {
      return false;
    }
    if (ow.j.equals(☃))
    {
      J();
      return false;
    }
    if ((b(☃)) || (this.h) || (s())) {
      return false;
    }
    if (☃.c())
    {
      D();
      J();
      return false;
    }
    if (ow.a.equals(☃))
    {
      if (!at()) {
        e(5);
      } else {
        a(0.15F);
      }
      return false;
    }
    if ((ow.c.equals(☃)) && (bn() > 0.5F))
    {
      a(4.0F);
      return false;
    }
    boolean ☃ = "arrow".equals(☃.p());
    boolean ☃ = "player".equals(☃.p());
    if ((!☃) && (!☃)) {
      return false;
    }
    if ((☃.i() instanceof wq)) {
      ☃.i().J();
    }
    if (((☃.j() instanceof wn)) && (!((wn)☃.j()).bA.e)) {
      return false;
    }
    if (☃.u())
    {
      A();
      J();
      return false;
    }
    long ☃ = this.o.K();
    if ((☃ - this.i <= 5L) || (☃))
    {
      C();
      A();
      J();
    }
    else
    {
      this.i = ☃;
    }
    return false;
  }
  
  public boolean a(double ☃)
  {
    double ☃ = aR().a() * 4.0D;
    if ((Double.isNaN(☃)) || (☃ == 0.0D)) {
      ☃ = 4.0D;
    }
    ☃ *= 64.0D;
    return ☃ < ☃ * ☃;
  }
  
  private void A()
  {
    if ((this.o instanceof le)) {
      ((le)this.o).a(cy.M, this.s, this.t + this.K / 1.5D, this.u, 10, this.J / 4.0F, this.K / 4.0F, this.J / 4.0F, 0.05D, new int[] { afh.f(afi.f.Q()) });
    }
  }
  
  private void a(float ☃)
  {
    float ☃ = bn();
    ☃ -= ☃;
    if (☃ <= 0.5F)
    {
      D();
      J();
    }
    else
    {
      i(☃);
    }
  }
  
  private void C()
  {
    afh.a(this.o, new cj(this), new zx(zy.cj));
    D();
  }
  
  private void D()
  {
    for (int ☃ = 0; ☃ < this.g.length; ☃++) {
      if ((this.g[☃] != null) && (this.g[☃].b > 0))
      {
        if (this.g[☃] != null) {
          afh.a(this.o, new cj(this).a(), this.g[☃]);
        }
        this.g[☃] = null;
      }
    }
  }
  
  protected float h(float ☃, float ☃)
  {
    this.aJ = this.A;
    this.aI = this.y;
    return 0.0F;
  }
  
  public float aS()
  {
    return j_() ? this.K * 0.5F : this.K * 0.9F;
  }
  
  public void g(float ☃, float ☃)
  {
    if (p()) {
      return;
    }
    super.g(☃, ☃);
  }
  
  public void t_()
  {
    super.t_();
    
    dc ☃ = this.ac.h(11);
    if (!this.bk.equals(☃)) {
      a(☃);
    }
    dc ☃ = this.ac.h(12);
    if (!this.bl.equals(☃)) {
      b(☃);
    }
    dc ☃ = this.ac.h(13);
    if (!this.bm.equals(☃)) {
      c(☃);
    }
    dc ☃ = this.ac.h(14);
    if (!this.bn.equals(☃)) {
      d(☃);
    }
    dc ☃ = this.ac.h(15);
    if (!this.bo.equals(☃)) {
      e(☃);
    }
    dc ☃ = this.ac.h(16);
    if (!this.bp.equals(☃)) {
      f(☃);
    }
    boolean ☃ = s();
    if ((!this.bj) && (☃)) {
      a(false);
    } else if ((this.bj) && (!☃)) {
      a(true);
    } else {
      return;
    }
    this.bj = ☃;
  }
  
  private void a(boolean ☃)
  {
    double ☃ = this.s;
    double ☃ = this.t;
    double ☃ = this.u;
    if (☃) {
      a(0.5F, 1.975F);
    } else {
      a(0.0F, 0.0F);
    }
    b(☃, ☃, ☃);
  }
  
  protected void B()
  {
    e(this.h);
  }
  
  public void e(boolean ☃)
  {
    this.h = ☃;
    super.e(☃);
  }
  
  public boolean j_()
  {
    return n();
  }
  
  public void G()
  {
    J();
  }
  
  public boolean aW()
  {
    return ax();
  }
  
  private void j(boolean ☃)
  {
    byte ☃ = this.ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x1);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFE);
    }
    this.ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean n()
  {
    return (this.ac.a(10) & 0x1) != 0;
  }
  
  private void k(boolean ☃)
  {
    byte ☃ = this.ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x2);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFD);
    }
    this.ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean p()
  {
    return (this.ac.a(10) & 0x2) != 0;
  }
  
  private void l(boolean ☃)
  {
    byte ☃ = this.ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x4);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFB);
    }
    this.ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean q()
  {
    return (this.ac.a(10) & 0x4) != 0;
  }
  
  private void m(boolean ☃)
  {
    byte ☃ = this.ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x8);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFF7);
    }
    this.ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean r()
  {
    return (this.ac.a(10) & 0x8) != 0;
  }
  
  private void n(boolean ☃)
  {
    byte ☃ = this.ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x10);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFEF);
    }
    this.ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean s()
  {
    return (this.ac.a(10) & 0x10) != 0;
  }
  
  public void a(dc ☃)
  {
    this.bk = ☃;
    this.ac.b(11, ☃);
  }
  
  public void b(dc ☃)
  {
    this.bl = ☃;
    this.ac.b(12, ☃);
  }
  
  public void c(dc ☃)
  {
    this.bm = ☃;
    this.ac.b(13, ☃);
  }
  
  public void d(dc ☃)
  {
    this.bn = ☃;
    this.ac.b(14, ☃);
  }
  
  public void e(dc ☃)
  {
    this.bo = ☃;
    this.ac.b(15, ☃);
  }
  
  public void f(dc ☃)
  {
    this.bp = ☃;
    this.ac.b(16, ☃);
  }
  
  public dc t()
  {
    return this.bk;
  }
  
  public dc u()
  {
    return this.bl;
  }
  
  public dc v()
  {
    return this.bm;
  }
  
  public dc w()
  {
    return this.bn;
  }
  
  public dc x()
  {
    return this.bo;
  }
  
  public dc y()
  {
    return this.bp;
  }
  
  public boolean ad()
  {
    return (super.ad()) && (!s());
  }
}
