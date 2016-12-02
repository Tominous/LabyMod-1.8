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
    T = p();
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
    ac.a(10, Byte.valueOf((byte)0));
    ac.a(11, a);
    ac.a(12, b);
    ac.a(13, c);
    ac.a(14, d);
    ac.a(15, e);
    ac.a(16, f);
  }
  
  public zx bA()
  {
    return g[0];
  }
  
  public zx p(int ☃)
  {
    return g[☃];
  }
  
  public zx q(int ☃)
  {
    return g[(☃ + 1)];
  }
  
  public void c(int ☃, zx ☃)
  {
    g[☃] = ☃;
  }
  
  public zx[] as()
  {
    return g;
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
      if ((☃ < 0) || (☃ >= g.length)) {
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
    for (int ☃ = 0; ☃ < g.length; ☃++)
    {
      dn ☃ = new dn();
      if (g[☃] != null) {
        g[☃].b(☃);
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
    
    ☃.a("DisabledSlots", bi);
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
      for (int ☃ = 0; ☃ < g.length; ☃++) {
        g[☃] = zx.a(☃.b(☃));
      }
    }
    e(☃.n("Invisible"));
    
    j(☃.n("Small"));
    
    l(☃.n("ShowArms"));
    
    bi = ☃.f("DisabledSlots");
    k(☃.n("NoGravity"));
    m(☃.n("NoBasePlate"));
    n(☃.n("Marker"));
    bj = (!s());
    T = p();
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
    if (!a.equals(bk)) {
      ☃.a("Head", bk.a());
    }
    if (!b.equals(bl)) {
      ☃.a("Body", bl.a());
    }
    if (!c.equals(bm)) {
      ☃.a("LeftArm", bm.a());
    }
    if (!d.equals(bn)) {
      ☃.a("RightArm", bn.a());
    }
    if (!e.equals(bo)) {
      ☃.a("LeftLeg", bo.a());
    }
    if (!f.equals(bp)) {
      ☃.a("RightLeg", bp.a());
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
    List<pk> ☃ = o.b(this, aR());
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
    if ((o.D) || (☃.v())) {
      return true;
    }
    int ☃ = 0;
    zx ☃ = ☃.bZ();
    boolean ☃ = ☃ != null;
    if ((☃) && ((☃.b() instanceof yj)))
    {
      yj ☃ = (yj)☃.b();
      if (b == 3) {
        ☃ = 1;
      } else if (b == 2) {
        ☃ = 2;
      } else if (b == 1) {
        ☃ = 3;
      } else if (b == 0) {
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
    double ☃ = ☃ ? b * 2.0D : b;
    if (☃ >= 0.1D) {
      if ((☃ < 0.1D + (☃ ? 0.8D : 0.45D)) && (g[1] != null))
      {
        ☃ = 1;
        break label383;
      }
    }
    if (☃ >= 0.9D + (☃ ? 0.3D : 0.0D)) {
      if ((☃ < 0.9D + (☃ ? 1.0D : 0.7D)) && (g[3] != null))
      {
        ☃ = 3;
        break label383;
      }
    }
    if (☃ >= 0.4D) {
      if ((☃ < 0.4D + (☃ ? 1.0D : 0.8D)) && (g[2] != null))
      {
        ☃ = 2;
        break label383;
      }
    }
    if ((☃ >= 1.6D) && (g[4] != null)) {
      ☃ = 4;
    }
    label383:
    boolean ☃ = g[☃] != null;
    if (((bi & 1 << ☃) != 0) || ((bi & 1 << ☃) != 0))
    {
      ☃ = ☃;
      if ((bi & 1 << ☃) != 0)
      {
        if ((bi & 0x1) != 0) {
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
    zx ☃ = g[☃];
    if ((☃ != null) && ((bi & 1 << ☃ + 8) != 0)) {
      return;
    }
    if ((☃ == null) && ((bi & 1 << ☃ + 16) != 0)) {
      return;
    }
    int ☃ = bi.c;
    zx ☃ = bi.a(☃);
    if ((bA.d) && ((☃ == null) || (☃.b() == zw.a(afi.a))) && (☃ != null))
    {
      zx ☃ = ☃.k();
      b = 1;
      c(☃, ☃);
      return;
    }
    if ((☃ != null) && (b > 1))
    {
      if (☃ != null) {
        return;
      }
      zx ☃ = ☃.k();
      b = 1;
      c(☃, ☃);
      b -= 1;
      return;
    }
    c(☃, ☃);
    bi.a(☃, ☃);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (o.D) {
      return false;
    }
    if (ow.j.equals(☃))
    {
      J();
      return false;
    }
    if ((b(☃)) || (h) || (s())) {
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
    if (((☃.j() instanceof wn)) && (!jbA.e)) {
      return false;
    }
    if (☃.u())
    {
      A();
      J();
      return false;
    }
    long ☃ = o.K();
    if ((☃ - i <= 5L) || (☃))
    {
      C();
      A();
      J();
    }
    else
    {
      i = ☃;
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
    if ((o instanceof le)) {
      ((le)o).a(cy.M, s, t + K / 1.5D, u, 10, J / 4.0F, K / 4.0F, J / 4.0F, 0.05D, new int[] { afh.f(afi.f.Q()) });
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
    afh.a(o, new cj(this), new zx(zy.cj));
    D();
  }
  
  private void D()
  {
    for (int ☃ = 0; ☃ < g.length; ☃++) {
      if ((g[☃] != null) && (g[☃].b > 0))
      {
        if (g[☃] != null) {
          afh.a(o, new cj(this).a(), g[☃]);
        }
        g[☃] = null;
      }
    }
  }
  
  protected float h(float ☃, float ☃)
  {
    aJ = A;
    aI = y;
    return 0.0F;
  }
  
  public float aS()
  {
    return j_() ? K * 0.5F : K * 0.9F;
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
    
    dc ☃ = ac.h(11);
    if (!bk.equals(☃)) {
      a(☃);
    }
    dc ☃ = ac.h(12);
    if (!bl.equals(☃)) {
      b(☃);
    }
    dc ☃ = ac.h(13);
    if (!bm.equals(☃)) {
      c(☃);
    }
    dc ☃ = ac.h(14);
    if (!bn.equals(☃)) {
      d(☃);
    }
    dc ☃ = ac.h(15);
    if (!bo.equals(☃)) {
      e(☃);
    }
    dc ☃ = ac.h(16);
    if (!bp.equals(☃)) {
      f(☃);
    }
    boolean ☃ = s();
    if ((!bj) && (☃)) {
      a(false);
    } else if ((bj) && (!☃)) {
      a(true);
    } else {
      return;
    }
    bj = ☃;
  }
  
  private void a(boolean ☃)
  {
    double ☃ = s;
    double ☃ = t;
    double ☃ = u;
    if (☃) {
      a(0.5F, 1.975F);
    } else {
      a(0.0F, 0.0F);
    }
    b(☃, ☃, ☃);
  }
  
  protected void B()
  {
    e(h);
  }
  
  public void e(boolean ☃)
  {
    h = ☃;
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
    byte ☃ = ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x1);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFE);
    }
    ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean n()
  {
    return (ac.a(10) & 0x1) != 0;
  }
  
  private void k(boolean ☃)
  {
    byte ☃ = ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x2);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFD);
    }
    ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean p()
  {
    return (ac.a(10) & 0x2) != 0;
  }
  
  private void l(boolean ☃)
  {
    byte ☃ = ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x4);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFB);
    }
    ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean q()
  {
    return (ac.a(10) & 0x4) != 0;
  }
  
  private void m(boolean ☃)
  {
    byte ☃ = ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x8);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFF7);
    }
    ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean r()
  {
    return (ac.a(10) & 0x8) != 0;
  }
  
  private void n(boolean ☃)
  {
    byte ☃ = ac.a(10);
    if (☃) {
      ☃ = (byte)(☃ | 0x10);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFEF);
    }
    ac.b(10, Byte.valueOf(☃));
  }
  
  public boolean s()
  {
    return (ac.a(10) & 0x10) != 0;
  }
  
  public void a(dc ☃)
  {
    bk = ☃;
    ac.b(11, ☃);
  }
  
  public void b(dc ☃)
  {
    bl = ☃;
    ac.b(12, ☃);
  }
  
  public void c(dc ☃)
  {
    bm = ☃;
    ac.b(13, ☃);
  }
  
  public void d(dc ☃)
  {
    bn = ☃;
    ac.b(14, ☃);
  }
  
  public void e(dc ☃)
  {
    bo = ☃;
    ac.b(15, ☃);
  }
  
  public void f(dc ☃)
  {
    bp = ☃;
    ac.b(16, ☃);
  }
  
  public dc t()
  {
    return bk;
  }
  
  public dc u()
  {
    return bl;
  }
  
  public dc v()
  {
    return bm;
  }
  
  public dc w()
  {
    return bn;
  }
  
  public dc x()
  {
    return bo;
  }
  
  public dc y()
  {
    return bp;
  }
  
  public boolean ad()
  {
    return (super.ad()) && (!s());
  }
}
