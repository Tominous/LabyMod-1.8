import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class afh
{
  private static final jy a = new jy("air");
  public static final co<jy, afh> c = new co(a);
  public static final ct<alz> d = new ct();
  private yz b;
  
  public static int a(afh ☃)
  {
    return c.b(☃);
  }
  
  public static int f(alz ☃)
  {
    afh ☃ = ☃.c();
    return a(☃) + (☃.c(☃) << 12);
  }
  
  public static afh c(int ☃)
  {
    return (afh)c.a(☃);
  }
  
  public static alz d(int ☃)
  {
    int ☃ = ☃ & 0xFFF;
    int ☃ = ☃ >> 12 & 0xF;
    return c(☃).a(☃);
  }
  
  public static afh a(zw ☃)
  {
    if ((☃ instanceof yo)) {
      return ((yo)☃).d();
    }
    return null;
  }
  
  public static afh b(String ☃)
  {
    jy ☃ = new jy(☃);
    if (c.d(☃)) {
      return (afh)c.a(☃);
    }
    try
    {
      return (afh)c.a(Integer.parseInt(☃));
    }
    catch (NumberFormatException localNumberFormatException) {}
    return null;
  }
  
  public boolean o()
  {
    return r;
  }
  
  public int p()
  {
    return s;
  }
  
  public boolean q()
  {
    return t;
  }
  
  public int r()
  {
    return u;
  }
  
  public boolean s()
  {
    return v;
  }
  
  public arm t()
  {
    return J;
  }
  
  public arn g(alz ☃)
  {
    return K;
  }
  
  public alz a(int ☃)
  {
    return Q();
  }
  
  public int c(alz ☃)
  {
    if ((☃ == null) || (☃.a().isEmpty())) {
      return 0;
    }
    throw new IllegalArgumentException("Don't know how to convert " + ☃ + " back into data...");
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃;
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static class b
  {
    public final String a;
    public final float b;
    public final float c;
    
    public b(String ☃, float ☃, float ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
    }
    
    public float d()
    {
      return b;
    }
    
    public float e()
    {
      return c;
    }
    
    public String a()
    {
      return "dig." + a;
    }
    
    public String c()
    {
      return "step." + a;
    }
    
    public String b()
    {
      return a();
    }
  }
  
  public static final afh.b e = new afh.b("stone", 1.0F, 1.0F);
  public static final afh.b f = new afh.b("wood", 1.0F, 1.0F);
  public static final afh.b g = new afh.b("gravel", 1.0F, 1.0F);
  public static final afh.b h = new afh.b("grass", 1.0F, 1.0F);
  public static final afh.b i = new afh.b("stone", 1.0F, 1.0F);
  public static final afh.b j = new afh.b("stone", 1.0F, 1.5F);
  public static final afh.b k = new afh.b("stone", 1.0F, 1.0F)
  {
    public String a()
    {
      return "dig.glass";
    }
    
    public String b()
    {
      return "step.stone";
    }
  };
  public static final afh.b l = new afh.b("cloth", 1.0F, 1.0F);
  public static final afh.b m = new afh.b("sand", 1.0F, 1.0F);
  public static final afh.b n = new afh.b("snow", 1.0F, 1.0F);
  public static final afh.b o = new afh.b("ladder", 1.0F, 1.0F)
  {
    public String a()
    {
      return "dig.wood";
    }
  };
  public static final afh.b p = new afh.b("anvil", 0.3F, 1.0F)
  {
    public String a()
    {
      return "dig.stone";
    }
    
    public String b()
    {
      return "random.anvil_land";
    }
  };
  public static final afh.b q = new afh.b("slime", 1.0F, 1.0F)
  {
    public String a()
    {
      return "mob.slime.big";
    }
    
    public String b()
    {
      return "mob.slime.big";
    }
    
    public String c()
    {
      return "mob.slime.small";
    }
  };
  protected boolean r;
  protected int s;
  protected boolean t;
  protected int u;
  protected boolean v;
  protected float w;
  protected float x;
  protected boolean y = true;
  protected boolean z;
  protected boolean A;
  protected double B;
  protected double C;
  protected double D;
  protected double E;
  protected double F;
  protected double G;
  public afh.b H = e;
  public float I = 1.0F;
  protected final arm J;
  protected final arn K;
  public float L = 0.6F;
  protected final ama M;
  private alz N;
  private String O;
  
  public afh(arm ☃, arn ☃)
  {
    J = ☃;
    K = ☃;
    
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    r = c();
    s = (c() ? 255 : 0);
    t = (!☃.b());
    
    M = e();
    j(M.b());
  }
  
  protected afh(arm ☃)
  {
    this(☃, ☃.r());
  }
  
  protected afh a(afh.b ☃)
  {
    H = ☃;
    return this;
  }
  
  protected afh e(int ☃)
  {
    s = ☃;
    return this;
  }
  
  protected afh a(float ☃)
  {
    u = ((int)(15.0F * ☃));
    return this;
  }
  
  protected afh b(float ☃)
  {
    x = (☃ * 3.0F);
    return this;
  }
  
  public boolean u()
  {
    return (J.c()) && (d());
  }
  
  public boolean v()
  {
    return (J.k()) && (d()) && (!i());
  }
  
  public boolean w()
  {
    return (J.c()) && (d());
  }
  
  public boolean d()
  {
    return true;
  }
  
  public boolean b(adq ☃, cj ☃)
  {
    return !J.c();
  }
  
  public int b()
  {
    return 3;
  }
  
  public boolean a(adm ☃, cj ☃)
  {
    return false;
  }
  
  protected afh c(float ☃)
  {
    w = ☃;
    if (x < ☃ * 5.0F) {
      x = (☃ * 5.0F);
    }
    return this;
  }
  
  protected afh x()
  {
    c(-1.0F);
    return this;
  }
  
  public float g(adm ☃, cj ☃)
  {
    return w;
  }
  
  protected afh a(boolean ☃)
  {
    z = ☃;
    return this;
  }
  
  public boolean y()
  {
    return z;
  }
  
  public boolean z()
  {
    return A;
  }
  
  protected final void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    B = ☃;
    C = ☃;
    D = ☃;
    E = ☃;
    F = ☃;
    G = ☃;
  }
  
  public int c(adq ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃).c();
    int ☃ = ☃.b(☃, ☃.r());
    if ((☃ == 0) && ((☃ instanceof ahh)))
    {
      ☃ = ☃.b();
      ☃ = ☃.p(☃).c();
      return ☃.b(☃, ☃.r());
    }
    return ☃;
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    if ((☃ == cq.a) && (C > 0.0D)) {
      return true;
    }
    if ((☃ == cq.b) && (F < 1.0D)) {
      return true;
    }
    if ((☃ == cq.c) && (D > 0.0D)) {
      return true;
    }
    if ((☃ == cq.d) && (G < 1.0D)) {
      return true;
    }
    if ((☃ == cq.e) && (B > 0.0D)) {
      return true;
    }
    if ((☃ == cq.f) && (E < 1.0D)) {
      return true;
    }
    return !☃.p(☃).c().c();
  }
  
  public boolean b(adq ☃, cj ☃, cq ☃)
  {
    return ☃.p(☃).c().t().a();
  }
  
  public aug b(adm ☃, cj ☃)
  {
    return new aug(☃.n() + B, ☃.o() + C, ☃.p() + D, ☃.n() + E, ☃.o() + F, ☃.p() + G);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    aug ☃ = a(☃, ☃, ☃);
    if ((☃ != null) && (☃.b(☃))) {
      ☃.add(☃);
    }
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return new aug(☃.n() + B, ☃.o() + C, ☃.p() + D, ☃.n() + E, ☃.o() + F, ☃.p() + G);
  }
  
  public boolean c()
  {
    return true;
  }
  
  public boolean a(alz ☃, boolean ☃)
  {
    return A();
  }
  
  public boolean A()
  {
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    b(☃, ☃, ☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void d(adm ☃, cj ☃, alz ☃) {}
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃) {}
  
  public int a(adm ☃)
  {
    return 10;
  }
  
  public void c(adm ☃, cj ☃, alz ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃) {}
  
  public int a(Random ☃)
  {
    return 1;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(this);
  }
  
  public float a(wn ☃, adm ☃, cj ☃)
  {
    float ☃ = g(☃, ☃);
    if (☃ < 0.0F) {
      return 0.0F;
    }
    if (!☃.b(this)) {
      return ☃.a(this) / ☃ / 100.0F;
    }
    return ☃.a(this) / ☃ / 30.0F;
  }
  
  public final void b(adm ☃, cj ☃, alz ☃, int ☃)
  {
    a(☃, ☃, ☃, 1.0F, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    if (D) {
      return;
    }
    int ☃ = a(☃, s);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      if (s.nextFloat() <= ☃)
      {
        zw ☃ = a(☃, s, ☃);
        if (☃ != null) {
          a(☃, ☃, new zx(☃, 1, a(☃)));
        }
      }
    }
  }
  
  public static void a(adm ☃, cj ☃, zx ☃)
  {
    if ((D) || (!☃.Q().b("doTileDrops"))) {
      return;
    }
    float ☃ = 0.5F;
    double ☃ = s.nextFloat() * ☃ + (1.0F - ☃) * 0.5D;
    double ☃ = s.nextFloat() * ☃ + (1.0F - ☃) * 0.5D;
    double ☃ = s.nextFloat() * ☃ + (1.0F - ☃) * 0.5D;
    uz ☃ = new uz(☃, ☃.n() + ☃, ☃.o() + ☃, ☃.p() + ☃, ☃);
    ☃.p();
    ☃.d(☃);
  }
  
  protected void b(adm ☃, cj ☃, int ☃)
  {
    if (!D) {
      while (☃ > 0)
      {
        int ☃ = pp.a(☃);
        ☃ -= ☃;
        ☃.d(new pp(☃, ☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, ☃));
      }
    }
  }
  
  public int a(alz ☃)
  {
    return 0;
  }
  
  public float a(pk ☃)
  {
    return x / 5.0F;
  }
  
  public auh a(adm ☃, cj ☃, aui ☃, aui ☃)
  {
    a(☃, ☃);
    
    ☃ = ☃.b(-☃.n(), -☃.o(), -☃.p());
    ☃ = ☃.b(-☃.n(), -☃.o(), -☃.p());
    
    aui ☃ = ☃.a(☃, B);
    aui ☃ = ☃.a(☃, E);
    
    aui ☃ = ☃.b(☃, C);
    aui ☃ = ☃.b(☃, F);
    
    aui ☃ = ☃.c(☃, D);
    aui ☃ = ☃.c(☃, G);
    if (!a(☃)) {
      ☃ = null;
    }
    if (!a(☃)) {
      ☃ = null;
    }
    if (!b(☃)) {
      ☃ = null;
    }
    if (!b(☃)) {
      ☃ = null;
    }
    if (!c(☃)) {
      ☃ = null;
    }
    if (!c(☃)) {
      ☃ = null;
    }
    aui ☃ = null;
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if ((☃ != null) && ((☃ == null) || (☃.g(☃) < ☃.g(☃)))) {
      ☃ = ☃;
    }
    if (☃ == null) {
      return null;
    }
    cq ☃ = null;
    if (☃ == ☃) {
      ☃ = cq.e;
    }
    if (☃ == ☃) {
      ☃ = cq.f;
    }
    if (☃ == ☃) {
      ☃ = cq.a;
    }
    if (☃ == ☃) {
      ☃ = cq.b;
    }
    if (☃ == ☃) {
      ☃ = cq.c;
    }
    if (☃ == ☃) {
      ☃ = cq.d;
    }
    return new auh(☃.b(☃.n(), ☃.o(), ☃.p()), ☃, ☃);
  }
  
  private boolean a(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (b >= C) && (b <= F) && (c >= D) && (c <= G);
  }
  
  private boolean b(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (a >= B) && (a <= E) && (c >= D) && (c <= G);
  }
  
  private boolean c(aui ☃)
  {
    if (☃ == null) {
      return false;
    }
    return (a >= B) && (a <= E) && (b >= C) && (b <= F);
  }
  
  public void a(adm ☃, cj ☃, adi ☃) {}
  
  public adf m()
  {
    return adf.a;
  }
  
  public boolean a(adm ☃, cj ☃, cq ☃, zx ☃)
  {
    return b(☃, ☃, ☃);
  }
  
  public boolean b(adm ☃, cj ☃, cq ☃)
  {
    return d(☃, ☃);
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return pcJ.j();
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    return false;
  }
  
  public void a(adm ☃, cj ☃, pk ☃) {}
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return a(☃);
  }
  
  public void a(adm ☃, cj ☃, wn ☃) {}
  
  public aui a(adm ☃, cj ☃, pk ☃, aui ☃)
  {
    return ☃;
  }
  
  public void a(adq ☃, cj ☃) {}
  
  public final double B()
  {
    return B;
  }
  
  public final double C()
  {
    return E;
  }
  
  public final double D()
  {
    return C;
  }
  
  public final double E()
  {
    return F;
  }
  
  public final double F()
  {
    return D;
  }
  
  public final double G()
  {
    return G;
  }
  
  public int H()
  {
    return 16777215;
  }
  
  public int h(alz ☃)
  {
    return 16777215;
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    return 16777215;
  }
  
  public final int d(adq ☃, cj ☃)
  {
    return a(☃, ☃, 0);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return 0;
  }
  
  public boolean i()
  {
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃) {}
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return 0;
  }
  
  public void j() {}
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    ☃.b(na.ab[a(this)]);
    ☃.a(0.025F);
    if ((I()) && (ack.e(☃)))
    {
      zx ☃ = i(☃);
      if (☃ != null) {
        a(☃, ☃, ☃);
      }
    }
    else
    {
      int ☃ = ack.f(☃);
      b(☃, ☃, ☃, ☃);
    }
  }
  
  protected boolean I()
  {
    return (d()) && (!A);
  }
  
  protected zx i(alz ☃)
  {
    int ☃ = 0;
    zw ☃ = zw.a(this);
    if ((☃ != null) && (☃.k())) {
      ☃ = c(☃);
    }
    return new zx(☃, 1, ☃);
  }
  
  public int a(int ☃, Random ☃)
  {
    return a(☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃) {}
  
  public boolean g()
  {
    return (!J.a()) && (!J.d());
  }
  
  public afh c(String ☃)
  {
    O = ☃;
    return this;
  }
  
  public String f()
  {
    return di.a(a() + ".name");
  }
  
  public String a()
  {
    return "tile." + O;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, int ☃, int ☃)
  {
    return false;
  }
  
  public boolean J()
  {
    return y;
  }
  
  protected afh K()
  {
    y = false;
    return this;
  }
  
  public int k()
  {
    return J.m();
  }
  
  public float h()
  {
    return u() ? 0.2F : 1.0F;
  }
  
  public void a(adm ☃, cj ☃, pk ☃, float ☃)
  {
    ☃.e(☃, 1.0F);
  }
  
  public void a(adm ☃, pk ☃)
  {
    w = 0.0D;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(this);
  }
  
  public int j(adm ☃, cj ☃)
  {
    return a(☃.p(☃));
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, 0));
  }
  
  public yz L()
  {
    return b;
  }
  
  public afh a(yz ☃)
  {
    b = ☃;
    return this;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃) {}
  
  public void k(adm ☃, cj ☃) {}
  
  public boolean M()
  {
    return false;
  }
  
  public boolean N()
  {
    return true;
  }
  
  public boolean a(adi ☃)
  {
    return true;
  }
  
  public boolean b(afh ☃)
  {
    return this == ☃;
  }
  
  public static boolean a(afh ☃, afh ☃)
  {
    if ((☃ == null) || (☃ == null)) {
      return false;
    }
    if (☃ == ☃) {
      return true;
    }
    return ☃.b(☃);
  }
  
  public boolean O()
  {
    return false;
  }
  
  public int l(adm ☃, cj ☃)
  {
    return 0;
  }
  
  public alz b(alz ☃)
  {
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[0]);
  }
  
  public ama P()
  {
    return M;
  }
  
  protected final void j(alz ☃)
  {
    N = ☃;
  }
  
  public final alz Q()
  {
    return N;
  }
  
  public afh.a R()
  {
    return afh.a.a;
  }
  
  public String toString()
  {
    return "Block{" + c.c(this) + "}";
  }
  
  public static void S()
  {
    a(0, a, new aey().c("air"));
    a(1, "stone", new ajy().c(1.5F).b(10.0F).a(i).c("stone"));
    a(2, "grass", new ahe().c(0.6F).a(h).c("grass"));
    a(3, "dirt", new agf().c(0.5F).a(g).c("dirt"));
    afh ☃ = new afh(arm.e).c(2.0F).b(10.0F).a(i).c("stonebrick").a(yz.b);
    a(4, "cobblestone", ☃);
    afh ☃ = new aio().c(2.0F).b(5.0F).a(f).c("wood");
    a(5, "planks", ☃);
    a(6, "sapling", new ajj().c(0.0F).a(h).c("sapling"));
    a(7, "bedrock", new afh(arm.e).x().b(6000000.0F).a(i).c("bedrock").K().a(yz.b));
    a(8, "flowing_water", new agl(arm.h).c(100.0F).e(3).c("water").K());
    a(9, "water", new ajw(arm.h).c(100.0F).e(3).c("water").K());
    a(10, "flowing_lava", new agl(arm.i).c(100.0F).a(1.0F).c("lava").K());
    a(11, "lava", new ajw(arm.i).c(100.0F).a(1.0F).c("lava").K());
    a(12, "sand", new ajh().c(0.5F).a(m).c("sand"));
    a(13, "gravel", new ahf().c(0.6F).a(g).c("gravel"));
    a(14, "gold_ore", new aim().c(3.0F).b(5.0F).a(i).c("oreGold"));
    a(15, "iron_ore", new aim().c(3.0F).b(5.0F).a(i).c("oreIron"));
    a(16, "coal_ore", new aim().c(3.0F).b(5.0F).a(i).c("oreCoal"));
    a(17, "log", new ail().c("log"));
    a(18, "leaves", new aik().c("leaves"));
    a(19, "sponge", new ajr().c(0.6F).a(h).c("sponge"));
    a(20, "glass", new ahc(arm.s, false).c(0.3F).a(k).c("glass"));
    a(21, "lapis_ore", new aim().c(3.0F).b(5.0F).a(i).c("oreLapis"));
    a(22, "lapis_block", new afh(arm.f, arn.H).c(3.0F).b(5.0F).a(i).c("blockLapis").a(yz.b));
    a(23, "dispenser", new agg().c(3.5F).a(i).c("dispenser"));
    afh ☃ = new aji().a(i).c(0.8F).c("sandStone");
    a(24, "sandstone", ☃);
    a(25, "noteblock", new aii().c(0.8F).c("musicBlock"));
    a(26, "bed", new afg().a(f).c(0.2F).c("bed").K());
    a(27, "golden_rail", new ais().c(0.7F).a(j).c("goldenRail"));
    a(28, "detector_rail", new agc().c(0.7F).a(j).c("detectorRail"));
    a(29, "sticky_piston", new als(true).c("pistonStickyBase"));
    a(30, "web", new ako().e(1).c(4.0F).c("web"));
    a(31, "tallgrass", new akc().c(0.0F).a(h).c("tallgrass"));
    a(32, "deadbush", new agb().c(0.0F).a(h).c("deadbush"));
    a(33, "piston", new als(false).c("pistonBase"));
    a(34, "piston_head", new alt().c("pistonBase"));
    a(35, "wool", new afv(arm.n).c(0.8F).a(l).c("cloth"));
    a(36, "piston_extension", new alv());
    a(37, "yellow_flower", new akt().c(0.0F).a(h).c("flower1"));
    a(38, "red_flower", new aiy().c(0.0F).a(h).c("flower2"));
    afh ☃ = new aia().c(0.0F).a(h).a(0.125F).c("mushroom");
    a(39, "brown_mushroom", ☃);
    afh ☃ = new aia().c(0.0F).a(h).c("mushroom");
    a(40, "red_mushroom", ☃);
    a(41, "gold_block", new afh(arm.f, arn.F).c(3.0F).b(10.0F).a(j).c("blockGold").a(yz.b));
    a(42, "iron_block", new afh(arm.f, arn.h).c(5.0F).b(10.0F).a(j).c("blockIron").a(yz.b));
    a(43, "double_stone_slab", new agz().c(2.0F).b(10.0F).a(i).c("stoneSlab"));
    a(44, "stone_slab", new ahi().c(2.0F).b(10.0F).a(i).c("stoneSlab"));
    afh ☃ = new afh(arm.e, arn.D).c(2.0F).b(10.0F).a(i).c("brick").a(yz.b);
    a(45, "brick_block", ☃);
    a(46, "tnt", new ake().c(0.0F).a(h).c("tnt"));
    a(47, "bookshelf", new afk().c(1.5F).a(f).c("bookshelf"));
    a(48, "mossy_cobblestone", new afh(arm.e).c(2.0F).b(10.0F).a(i).c("stoneMoss").a(yz.b));
    a(49, "obsidian", new aij().c(50.0F).b(2000.0F).a(i).c("obsidian"));
    a(50, "torch", new akf().c(0.0F).a(0.9375F).a(f).c("torch"));
    a(51, "fire", new agv().c(0.0F).a(1.0F).a(l).c("fire").K());
    a(52, "mob_spawner", new ahy().c(5.0F).a(j).c("mobSpawner").K());
    a(53, "oak_stairs", new aju(☃.Q().a(aio.a, aio.a.a)).c("stairsWood"));
    a(54, "chest", new afs(0).c(2.5F).a(f).c("chest"));
    a(55, "redstone_wire", new ajb().c(0.0F).a(e).c("redstoneDust").K());
    a(56, "diamond_ore", new aim().c(3.0F).b(5.0F).a(i).c("oreDiamond"));
    a(57, "diamond_block", new afh(arm.f, arn.G).c(5.0F).b(10.0F).a(j).c("blockDiamond").a(yz.b));
    a(58, "crafting_table", new afy().c(2.5F).a(f).c("workbench"));
    a(59, "wheat", new afz().c("crops"));
    afh ☃ = new ags().c(0.6F).a(g).c("farmland");
    a(60, "farmland", ☃);
    a(61, "furnace", new ahb(false).c(3.5F).a(i).c("furnace").a(yz.c));
    a(62, "lit_furnace", new ahb(true).c(3.5F).a(i).a(0.875F).c("furnace"));
    a(63, "standing_sign", new ajv().c(1.0F).a(f).c("sign").K());
    a(64, "wooden_door", new agh(arm.d).c(3.0F).a(f).c("doorOak").K());
    a(65, "ladder", new ahr().c(0.4F).a(o).c("ladder"));
    a(66, "rail", new aix().c(0.7F).a(j).c("rail"));
    a(67, "stone_stairs", new aju(☃.Q()).c("stairsStone"));
    a(68, "wall_sign", new akm().c(1.0F).a(f).c("sign").K());
    a(69, "lever", new ahu().c(0.5F).a(f).c("lever"));
    a(70, "stone_pressure_plate", new ait(arm.e, ait.a.b).c(0.5F).a(i).c("pressurePlateStone"));
    a(71, "iron_door", new agh(arm.f).c(5.0F).a(j).c("doorIron").K());
    a(72, "wooden_pressure_plate", new ait(arm.d, ait.a.a).c(0.5F).a(f).c("pressurePlateWood"));
    a(73, "redstone_ore", new aja(false).c(3.0F).b(5.0F).a(i).c("oreRedstone").a(yz.b));
    a(74, "lit_redstone_ore", new aja(true).a(0.625F).c(3.0F).b(5.0F).a(i).c("oreRedstone"));
    a(75, "unlit_redstone_torch", new ajd(false).c(0.0F).a(f).c("notGate"));
    a(76, "redstone_torch", new ajd(true).c(0.0F).a(0.5F).a(f).c("notGate").a(yz.d));
    a(77, "stone_button", new aka().c(0.5F).a(i).c("button"));
    a(78, "snow_layer", new ajp().c(0.1F).a(n).c("snow").e(0));
    a(79, "ice", new ahp().c(0.5F).e(3).a(k).c("ice"));
    a(80, "snow", new ajo().c(0.2F).a(n).c("snow"));
    a(81, "cactus", new afo().c(0.4F).a(l).c("cactus"));
    a(82, "clay", new aft().c(0.6F).a(g).c("clay"));
    a(83, "reeds", new aje().c(0.0F).a(h).c("reeds").K());
    a(84, "jukebox", new ahq().c(2.0F).b(10.0F).a(i).c("jukebox"));
    a(85, "fence", new agt(arm.d, aio.a.a.c()).c(2.0F).b(5.0F).a(f).c("fence"));
    afh ☃ = new aiv().c(1.0F).a(f).c("pumpkin");
    a(86, "pumpkin", ☃);
    a(87, "netherrack", new aie().c(0.4F).a(i).c("hellrock"));
    a(88, "soul_sand", new ajq().c(0.5F).a(m).c("hellsand"));
    a(89, "glowstone", new ahd(arm.s).c(0.3F).a(k).a(1.0F).c("lightgem"));
    a(90, "portal", new aip().c(-1.0F).a(k).a(0.75F).c("portal"));
    a(91, "lit_pumpkin", new aiv().c(1.0F).a(f).a(1.0F).c("litpumpkin"));
    a(92, "cake", new afp().c(0.5F).a(l).c("cake").K());
    a(93, "unpowered_repeater", new ajf(false).c(0.0F).a(f).c("diode").K());
    a(94, "powered_repeater", new ajf(true).c(0.0F).a(f).c("diode").K());
    a(95, "stained_glass", new ajs(arm.s).c(0.3F).a(k).c("stainedGlass"));
    a(96, "trapdoor", new akh(arm.d).c(3.0F).a(f).c("trapdoor").K());
    a(97, "monster_egg", new ahz().c(0.75F).c("monsterStoneEgg"));
    afh ☃ = new ajz().c(1.5F).b(10.0F).a(i).c("stonebricksmooth");
    a(98, "stonebrick", ☃);
    a(99, "brown_mushroom_block", new aho(arm.d, arn.l, ☃).c(0.2F).a(f).c("mushroom"));
    a(100, "red_mushroom_block", new aho(arm.d, arn.D, ☃).c(0.2F).a(f).c("mushroom"));
    a(101, "iron_bars", new akd(arm.f, true).c(5.0F).b(10.0F).a(j).c("fenceIron"));
    a(102, "glass_pane", new akd(arm.s, false).c(0.3F).a(k).c("thinGlass"));
    afh ☃ = new ahx().c(1.0F).a(f).c("melon");
    a(103, "melon_block", ☃);
    a(104, "pumpkin_stem", new ajx(☃).c(0.0F).a(f).c("pumpkinStem"));
    a(105, "melon_stem", new ajx(☃).c(0.0F).a(f).c("pumpkinStem"));
    a(106, "vine", new akk().c(0.2F).a(h).c("vine"));
    a(107, "fence_gate", new agu(aio.a.a).c(2.0F).b(5.0F).a(f).c("fenceGate"));
    a(108, "brick_stairs", new aju(☃.Q()).c("stairsBrick"));
    a(109, "stone_brick_stairs", new aju(☃.Q().a(ajz.a, ajz.a.a)).c("stairsStoneBrickSmooth"));
    a(110, "mycelium", new aib().c(0.6F).a(h).c("mycel"));
    a(111, "waterlily", new akn().c(0.0F).a(h).c("waterlily"));
    afh ☃ = new aic().c(2.0F).b(10.0F).a(i).c("netherBrick").a(yz.b);
    a(112, "nether_brick", ☃);
    a(113, "nether_brick_fence", new agt(arm.e, arn.K).c(2.0F).b(10.0F).a(i).c("netherFence"));
    a(114, "nether_brick_stairs", new aju(☃.Q()).c("stairsNetherBrick"));
    a(115, "nether_wart", new aid().c("netherStalk"));
    a(116, "enchanting_table", new agm().c(5.0F).b(2000.0F).c("enchantmentTable"));
    a(117, "brewing_stand", new afl().c(0.5F).a(0.125F).c("brewingStand"));
    a(118, "cauldron", new afr().c(2.0F).c("cauldron"));
    a(119, "end_portal", new agn(arm.E).c(-1.0F).b(6000000.0F));
    a(120, "end_portal_frame", new ago().a(k).a(0.125F).c(-1.0F).c("endPortalFrame").b(6000000.0F).a(yz.c));
    a(121, "end_stone", new afh(arm.e, arn.d).c(3.0F).b(15.0F).a(i).c("whiteStone").a(yz.b));
    a(122, "dragon_egg", new agj().c(3.0F).b(15.0F).a(i).a(0.125F).c("dragonEgg"));
    a(123, "redstone_lamp", new ajc(false).c(0.3F).a(k).c("redstoneLight").a(yz.d));
    a(124, "lit_redstone_lamp", new ajc(true).c(0.3F).a(k).c("redstoneLight"));
    a(125, "double_wooden_slab", new aha().c(2.0F).b(5.0F).a(f).c("woodSlab"));
    a(126, "wooden_slab", new ahk().c(2.0F).b(5.0F).a(f).c("woodSlab"));
    a(127, "cocoa", new afu().c(0.2F).b(5.0F).a(f).c("cocoa"));
    a(128, "sandstone_stairs", new aju(☃.Q().a(aji.a, aji.a.c)).c("stairsSandStone"));
    a(129, "emerald_ore", new aim().c(3.0F).b(5.0F).a(i).c("oreEmerald"));
    a(130, "ender_chest", new agp().c(22.5F).b(1000.0F).a(i).c("enderChest").a(0.5F));
    a(131, "tripwire_hook", new akj().c("tripWireSource"));
    a(132, "tripwire", new aki().c("tripWire"));
    a(133, "emerald_block", new afh(arm.f, arn.I).c(5.0F).b(10.0F).a(j).c("blockEmerald").a(yz.b));
    a(134, "spruce_stairs", new aju(☃.Q().a(aio.a, aio.a.b)).c("stairsWoodSpruce"));
    a(135, "birch_stairs", new aju(☃.Q().a(aio.a, aio.a.c)).c("stairsWoodBirch"));
    a(136, "jungle_stairs", new aju(☃.Q().a(aio.a, aio.a.d)).c("stairsWoodJungle"));
    a(137, "command_block", new afw().x().b(6000000.0F).c("commandBlock"));
    a(138, "beacon", new aff().c("beacon").a(1.0F));
    a(139, "cobblestone_wall", new akl(☃).c("cobbleWall"));
    a(140, "flower_pot", new agx().c(0.0F).a(e).c("flowerPot"));
    a(141, "carrots", new afq().c("carrots"));
    a(142, "potatoes", new aiq().c("potatoes"));
    a(143, "wooden_button", new akq().c(0.5F).a(f).c("button"));
    a(144, "skull", new ajm().c(1.0F).a(i).c("skull"));
    a(145, "anvil", new aez().c(5.0F).a(p).b(2000.0F).c("anvil"));
    a(146, "trapped_chest", new afs(1).c(2.5F).a(f).c("chestTrap"));
    a(147, "light_weighted_pressure_plate", new akp(arm.f, 15, arn.F).c(0.5F).a(f).c("weightedPlate_light"));
    a(148, "heavy_weighted_pressure_plate", new akp(arm.f, 150).c(0.5F).a(f).c("weightedPlate_heavy"));
    a(149, "unpowered_comparator", new afx(false).c(0.0F).a(f).c("comparator").K());
    a(150, "powered_comparator", new afx(true).c(0.0F).a(0.625F).a(f).c("comparator").K());
    a(151, "daylight_detector", new aga(false));
    a(152, "redstone_block", new air(arm.f, arn.f).c(5.0F).b(10.0F).a(j).c("blockRedstone").a(yz.d));
    a(153, "quartz_ore", new aim(arn.K).c(3.0F).b(5.0F).a(i).c("netherquartz"));
    a(154, "hopper", new ahn().c(3.0F).b(8.0F).a(j).c("hopper"));
    afh ☃ = new aiw().a(i).c(0.8F).c("quartzBlock");
    a(155, "quartz_block", ☃);
    a(156, "quartz_stairs", new aju(☃.Q().a(aiw.a, aiw.a.a)).c("stairsQuartz"));
    a(157, "activator_rail", new ais().c(0.7F).a(j).c("activatorRail"));
    a(158, "dropper", new agk().c(3.5F).a(i).c("dropper"));
    a(159, "stained_hardened_clay", new afv(arm.e).c(1.25F).b(7.0F).a(i).c("clayHardenedStained"));
    a(160, "stained_glass_pane", new ajt().c(0.3F).a(k).c("thinStainedGlass"));
    a(161, "leaves2", new aif().c("leaves"));
    a(162, "log2", new aig().c("log"));
    a(163, "acacia_stairs", new aju(☃.Q().a(aio.a, aio.a.e)).c("stairsWoodAcacia"));
    a(164, "dark_oak_stairs", new aju(☃.Q().a(aio.a, aio.a.f)).c("stairsWoodDarkOak"));
    a(165, "slime", new ajn().c("slime").a(q));
    a(166, "barrier", new afb().c("barrier"));
    a(167, "iron_trapdoor", new akh(arm.f).c(5.0F).a(j).c("ironTrapdoor").K());
    a(168, "prismarine", new aiu().c(1.5F).b(10.0F).a(i).c("prismarine"));
    a(169, "sea_lantern", new ajk(arm.s).c(0.3F).a(k).a(1.0F).c("seaLantern"));
    a(170, "hay_block", new ahm().c(0.5F).a(h).c("hayBlock").a(yz.b));
    a(171, "carpet", new aks().c(0.1F).a(l).c("woolCarpet").e(0));
    a(172, "hardened_clay", new ahl().c(1.25F).b(7.0F).a(i).c("clayHardened"));
    a(173, "coal_block", new afh(arm.e, arn.E).c(5.0F).b(10.0F).a(i).c("blockCoal").a(yz.b));
    a(174, "packed_ice", new ain().c(0.5F).a(k).c("icePacked"));
    a(175, "double_plant", new agi());
    a(176, "standing_banner", new afa.a().c(1.0F).a(f).c("banner").K());
    a(177, "wall_banner", new afa.b().c(1.0F).a(f).c("banner").K());
    a(178, "daylight_detector_inverted", new aga(true));
    afh ☃ = new aiz().a(i).c(0.8F).c("redSandStone");
    a(179, "red_sandstone", ☃);
    a(180, "red_sandstone_stairs", new aju(☃.Q().a(aiz.a, aiz.a.c)).c("stairsRedSandStone"));
    a(181, "double_stone_slab2", new agy().c(2.0F).b(10.0F).a(i).c("stoneSlab2"));
    a(182, "stone_slab2", new ahg().c(2.0F).b(10.0F).a(i).c("stoneSlab2"));
    a(183, "spruce_fence_gate", new agu(aio.a.b).c(2.0F).b(5.0F).a(f).c("spruceFenceGate"));
    a(184, "birch_fence_gate", new agu(aio.a.c).c(2.0F).b(5.0F).a(f).c("birchFenceGate"));
    a(185, "jungle_fence_gate", new agu(aio.a.d).c(2.0F).b(5.0F).a(f).c("jungleFenceGate"));
    a(186, "dark_oak_fence_gate", new agu(aio.a.f).c(2.0F).b(5.0F).a(f).c("darkOakFenceGate"));
    a(187, "acacia_fence_gate", new agu(aio.a.e).c(2.0F).b(5.0F).a(f).c("acaciaFenceGate"));
    a(188, "spruce_fence", new agt(arm.d, aio.a.b.c()).c(2.0F).b(5.0F).a(f).c("spruceFence"));
    a(189, "birch_fence", new agt(arm.d, aio.a.c.c()).c(2.0F).b(5.0F).a(f).c("birchFence"));
    a(190, "jungle_fence", new agt(arm.d, aio.a.d.c()).c(2.0F).b(5.0F).a(f).c("jungleFence"));
    a(191, "dark_oak_fence", new agt(arm.d, aio.a.f.c()).c(2.0F).b(5.0F).a(f).c("darkOakFence"));
    a(192, "acacia_fence", new agt(arm.d, aio.a.e.c()).c(2.0F).b(5.0F).a(f).c("acaciaFence"));
    a(193, "spruce_door", new agh(arm.d).c(3.0F).a(f).c("doorSpruce").K());
    a(194, "birch_door", new agh(arm.d).c(3.0F).a(f).c("doorBirch").K());
    a(195, "jungle_door", new agh(arm.d).c(3.0F).a(f).c("doorJungle").K());
    a(196, "acacia_door", new agh(arm.d).c(3.0F).a(f).c("doorAcacia").K());
    a(197, "dark_oak_door", new agh(arm.d).c(3.0F).a(f).c("doorDarkOak").K());
    
    c.a();
    for (afh ☃ : c) {
      if (J == arm.a)
      {
        v = false;
      }
      else
      {
        boolean ☃ = false;
        boolean ☃ = ☃ instanceof aju;
        boolean ☃ = ☃ instanceof ahh;
        boolean ☃ = ☃ == ☃;
        boolean ☃ = t;
        boolean ☃ = s == 0;
        if ((☃) || (☃) || (☃) || (☃) || (☃)) {
          ☃ = true;
        }
        v = ☃;
      }
    }
    for (Iterator ☃ = c.iterator(); ☃.hasNext();)
    {
      ☃ = (afh)☃.next();
      for (alz ☃ : ☃.P().a())
      {
        int ☃ = c.b(☃) << 4 | ☃.c(☃);
        d.a(☃, ☃);
      }
    }
    afh ☃;
  }
  
  private static void a(int ☃, jy ☃, afh ☃)
  {
    c.a(☃, ☃, ☃);
  }
  
  private static void a(int ☃, String ☃, afh ☃)
  {
    a(☃, new jy(☃), ☃);
  }
}
