import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public abstract class pr
  extends pk
{
  private static final UUID a = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
  private static final qd b = new qd(a, "Sprinting speed boost", 0.30000001192092896D, 2).a(false);
  private qf c;
  private final ov f = new ov(this);
  private final Map<Integer, pf> g = Maps.newHashMap();
  private final zx[] h = new zx[5];
  public boolean ar;
  public int as;
  public int at;
  public int au;
  public int av;
  public float aw;
  public int ax;
  public float ay;
  public float az;
  public float aA;
  public float aB;
  public float aC;
  public int aD = 20;
  public float aE;
  public float aF;
  public float aG;
  public float aH;
  public float aI;
  public float aJ;
  public float aK;
  public float aL;
  public float aM = 0.02F;
  protected wn aN;
  protected int aO;
  protected boolean aP;
  protected int aQ;
  protected float aR;
  protected float aS;
  protected float aT;
  protected float aU;
  protected float aV;
  protected int aW;
  protected float aX;
  protected boolean aY;
  public float aZ;
  public float ba;
  protected float bb;
  protected int bc;
  protected double bd;
  protected double be;
  protected double bf;
  protected double bg;
  protected double bh;
  private boolean i = true;
  private pr bi;
  private int bj;
  private pr bk;
  private int bl;
  private float bm;
  private int bn;
  private float bo;
  
  public void G()
  {
    a(ow.j, Float.MAX_VALUE);
  }
  
  public pr(adm ☃)
  {
    super(☃);
    
    aX();
    i(bu());
    
    k = true;
    aH = ((float)((Math.random() + 1.0D) * 0.009999999776482582D));
    b(s, t, u);
    aG = ((float)Math.random() * 12398.0F);
    y = ((float)(Math.random() * 3.1415927410125732D * 2.0D));
    aK = y;
    S = 0.6F;
  }
  
  protected void h()
  {
    ac.a(7, Integer.valueOf(0));
    ac.a(8, Byte.valueOf((byte)0));
    ac.a(9, Byte.valueOf((byte)0));
    ac.a(6, Float.valueOf(1.0F));
  }
  
  protected void aX()
  {
    by().b(vy.a);
    by().b(vy.c);
    by().b(vy.d);
  }
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃)
  {
    if (!V()) {
      W();
    }
    if ((!o.D) && (O > 3.0F) && (☃))
    {
      alz ☃ = o.p(☃);
      afh ☃ = ☃.c();
      float ☃ = ns.f(O - 3.0F);
      if (☃.t() != arm.a)
      {
        double ☃ = Math.min(0.2F + ☃ / 15.0F, 10.0F);
        if (☃ > 2.5D) {
          ☃ = 2.5D;
        }
        int ☃ = (int)(150.0D * ☃);
        ((le)o).a(cy.M, s, t, u, ☃, 0.0D, 0.0D, 0.0D, 0.15000000596046448D, new int[] { afh.f(☃) });
      }
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  public boolean aY()
  {
    return false;
  }
  
  public void K()
  {
    ay = az;
    super.K();
    
    o.B.a("livingEntityBaseTick");
    
    boolean ☃ = this instanceof wn;
    if (ai()) {
      if (aj())
      {
        a(ow.e, 1.0F);
      }
      else if ((☃) && (!o.af().a(aR())))
      {
        double ☃ = o.af().a(this) + o.af().m();
        if (☃ < 0.0D) {
          a(ow.e, Math.max(1, ns.c(-☃ * o.af().n())));
        }
      }
    }
    if ((T()) || (o.D)) {
      N();
    }
    boolean ☃ = (☃) && (bA.a);
    if (ai()) {
      if (a(arm.h))
      {
        if ((!aY()) && (!k(oH)) && (!☃))
        {
          h(j(az()));
          if (az() == -20)
          {
            h(0);
            for (int ☃ = 0; ☃ < 8; ☃++)
            {
              float ☃ = V.nextFloat() - V.nextFloat();
              float ☃ = V.nextFloat() - V.nextFloat();
              float ☃ = V.nextFloat() - V.nextFloat();
              o.a(cy.e, s + ☃, t + ☃, u + ☃, v, w, x, new int[0]);
            }
            a(ow.f, 2.0F);
          }
        }
        if ((!o.D) && (au()) && ((m instanceof pr))) {
          a(null);
        }
      }
      else
      {
        h(300);
      }
    }
    if ((ai()) && (U())) {
      N();
    }
    aE = aF;
    if (au > 0) {
      au -= 1;
    }
    if ((Z > 0) && (!(this instanceof lf))) {
      Z -= 1;
    }
    if (bn() <= 0.0F) {
      aZ();
    }
    if (aO > 0) {
      aO -= 1;
    } else {
      aN = null;
    }
    if ((bk != null) && (!bk.ai())) {
      bk = null;
    }
    if (bi != null) {
      if (!bi.ai()) {
        b(null);
      } else if (W - bj > 100) {
        b(null);
      }
    }
    bi();
    
    aU = aT;
    
    aJ = aI;
    aL = aK;
    A = y;
    B = z;
    
    o.B.b();
  }
  
  public boolean j_()
  {
    return false;
  }
  
  protected void aZ()
  {
    ax += 1;
    if (ax == 20)
    {
      if ((!o.D) && ((aO > 0) || (bb())) && 
        (ba()) && (o.Q().b("doMobLoot")))
      {
        int ☃ = b(aN);
        while (☃ > 0)
        {
          int ☃ = pp.a(☃);
          ☃ -= ☃;
          o.d(new pp(o, s, t, u, ☃));
        }
      }
      J();
      for (int ☃ = 0; ☃ < 20; ☃++)
      {
        double ☃ = V.nextGaussian() * 0.02D;
        double ☃ = V.nextGaussian() * 0.02D;
        double ☃ = V.nextGaussian() * 0.02D;
        o.a(cy.a, s + V.nextFloat() * J * 2.0F - J, t + V.nextFloat() * K, u + V.nextFloat() * J * 2.0F - J, ☃, ☃, ☃, new int[0]);
      }
    }
  }
  
  protected boolean ba()
  {
    return !j_();
  }
  
  protected int j(int ☃)
  {
    int ☃ = ack.a(this);
    if ((☃ > 0) && 
      (V.nextInt(☃ + 1) > 0)) {
      return ☃;
    }
    return ☃ - 1;
  }
  
  protected int b(wn ☃)
  {
    return 0;
  }
  
  protected boolean bb()
  {
    return false;
  }
  
  public Random bc()
  {
    return V;
  }
  
  public pr bd()
  {
    return bi;
  }
  
  public int be()
  {
    return bj;
  }
  
  public void b(pr ☃)
  {
    bi = ☃;
    bj = W;
  }
  
  public pr bf()
  {
    return bk;
  }
  
  public int bg()
  {
    return bl;
  }
  
  public void p(pk ☃)
  {
    if ((☃ instanceof pr)) {
      bk = ((pr)☃);
    } else {
      bk = null;
    }
    bl = W;
  }
  
  public int bh()
  {
    return aQ;
  }
  
  public void b(dn ☃)
  {
    ☃.a("HealF", bn());
    ☃.a("Health", (short)(int)Math.ceil(bn()));
    ☃.a("HurtTime", (short)au);
    ☃.a("HurtByTimestamp", bj);
    ☃.a("DeathTime", (short)ax);
    ☃.a("AbsorptionAmount", bN());
    for (zx ☃ : as()) {
      if (☃ != null) {
        c.a(☃.B());
      }
    }
    ☃.a("Attributes", vy.a(by()));
    for (zx ☃ : as()) {
      if (☃ != null) {
        c.b(☃.B());
      }
    }
    if (!g.isEmpty())
    {
      du ☃ = new du();
      for (pf ☃ : g.values()) {
        ☃.a(☃.a(new dn()));
      }
      ☃.a("ActiveEffects", ☃);
    }
  }
  
  public void a(dn ☃)
  {
    m(☃.h("AbsorptionAmount"));
    if ((☃.b("Attributes", 9)) && (o != null) && (!o.D)) {
      vy.a(by(), ☃.c("Attributes", 10));
    }
    if (☃.b("ActiveEffects", 9))
    {
      du ☃ = ☃.c("ActiveEffects", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        pf ☃ = pf.b(☃);
        if (☃ != null) {
          g.put(Integer.valueOf(☃.a()), ☃);
        }
      }
    }
    if (☃.b("HealF", 99))
    {
      i(☃.h("HealF"));
    }
    else
    {
      eb ☃ = ☃.a("Health");
      if (☃ == null) {
        i(bu());
      } else if (☃.a() == 5) {
        i(((dr)☃).h());
      } else if (☃.a() == 2) {
        i(((dz)☃).e());
      }
    }
    au = ☃.e("HurtTime");
    ax = ☃.e("DeathTime");
    bj = ☃.f("HurtByTimestamp");
  }
  
  protected void bi()
  {
    Iterator<Integer> ☃ = g.keySet().iterator();
    while (☃.hasNext())
    {
      Integer ☃ = (Integer)☃.next();
      pf ☃ = (pf)g.get(☃);
      if (!☃.a(this))
      {
        if (!o.D)
        {
          ☃.remove();
          b(☃);
        }
      }
      else if (☃.b() % 600 == 0) {
        a(☃, false);
      }
    }
    if (i)
    {
      if (!o.D) {
        B();
      }
      i = false;
    }
    int ☃ = ac.c(7);
    boolean ☃ = ac.a(8) > 0;
    if (☃ > 0)
    {
      boolean ☃ = false;
      if (!ax()) {
        ☃ = V.nextBoolean();
      } else {
        ☃ = V.nextInt(15) == 0;
      }
      if (☃) {
        ☃ &= V.nextInt(5) == 0;
      }
      if ((☃) && 
        (☃ > 0))
      {
        double ☃ = (☃ >> 16 & 0xFF) / 255.0D;
        double ☃ = (☃ >> 8 & 0xFF) / 255.0D;
        double ☃ = (☃ >> 0 & 0xFF) / 255.0D;
        
        o.a(☃ ? cy.q : cy.p, s + (V.nextDouble() - 0.5D) * J, t + V.nextDouble() * K, u + (V.nextDouble() - 0.5D) * J, ☃, ☃, ☃, new int[0]);
      }
    }
  }
  
  protected void B()
  {
    if (g.isEmpty())
    {
      bj();
      e(false);
    }
    else
    {
      int ☃ = abe.a(g.values());
      ac.b(8, Byte.valueOf((byte)(abe.b(g.values()) ? 1 : 0)));
      ac.b(7, Integer.valueOf(☃));
      e(k(pH));
    }
  }
  
  protected void bj()
  {
    ac.b(8, Byte.valueOf((byte)0));
    ac.b(7, Integer.valueOf(0));
  }
  
  public void bk()
  {
    Iterator<Integer> ☃ = g.keySet().iterator();
    while (☃.hasNext())
    {
      Integer ☃ = (Integer)☃.next();
      pf ☃ = (pf)g.get(☃);
      if (!o.D)
      {
        ☃.remove();
        b(☃);
      }
    }
  }
  
  public Collection<pf> bl()
  {
    return g.values();
  }
  
  public boolean k(int ☃)
  {
    return g.containsKey(Integer.valueOf(☃));
  }
  
  public boolean a(pe ☃)
  {
    return g.containsKey(Integer.valueOf(H));
  }
  
  public pf b(pe ☃)
  {
    return (pf)g.get(Integer.valueOf(H));
  }
  
  public void c(pf ☃)
  {
    if (!d(☃)) {
      return;
    }
    if (g.containsKey(Integer.valueOf(☃.a())))
    {
      ((pf)g.get(Integer.valueOf(☃.a()))).a(☃);
      a((pf)g.get(Integer.valueOf(☃.a())), true);
    }
    else
    {
      g.put(Integer.valueOf(☃.a()), ☃);
      a(☃);
    }
  }
  
  public boolean d(pf ☃)
  {
    if (bz() == pw.b)
    {
      int ☃ = ☃.a();
      if ((☃ == lH) || (☃ == uH)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean bm()
  {
    return bz() == pw.b;
  }
  
  public void l(int ☃)
  {
    g.remove(Integer.valueOf(☃));
  }
  
  public void m(int ☃)
  {
    pf ☃ = (pf)g.remove(Integer.valueOf(☃));
    if (☃ != null) {
      b(☃);
    }
  }
  
  protected void a(pf ☃)
  {
    i = true;
    if (!o.D) {
      pe.a[☃.a()].b(this, by(), ☃.c());
    }
  }
  
  protected void a(pf ☃, boolean ☃)
  {
    i = true;
    if ((☃) && (!o.D))
    {
      pe.a[☃.a()].a(this, by(), ☃.c());
      pe.a[☃.a()].b(this, by(), ☃.c());
    }
  }
  
  protected void b(pf ☃)
  {
    i = true;
    if (!o.D) {
      pe.a[☃.a()].a(this, by(), ☃.c());
    }
  }
  
  public void h(float ☃)
  {
    float ☃ = bn();
    if (☃ > 0.0F) {
      i(☃ + ☃);
    }
  }
  
  public final float bn()
  {
    return ac.d(6);
  }
  
  public void i(float ☃)
  {
    ac.b(6, Float.valueOf(ns.a(☃, 0.0F, bu())));
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if (o.D) {
      return false;
    }
    aQ = 0;
    if (bn() <= 0.0F) {
      return false;
    }
    if ((☃.o()) && (a(pe.n))) {
      return false;
    }
    if (((☃ == ow.n) || (☃ == ow.o)) && (p(4) != null))
    {
      p(4).a((int)(☃ * 4.0F + V.nextFloat() * ☃ * 2.0F), this);
      ☃ *= 0.75F;
    }
    aB = 1.5F;
    
    boolean ☃ = true;
    if (Z > aD / 2.0F)
    {
      if (☃ <= aX) {
        return false;
      }
      d(☃, ☃ - aX);
      aX = ☃;
      ☃ = false;
    }
    else
    {
      aX = ☃;
      Z = aD;
      d(☃, ☃);
      au = (av = 10);
    }
    aw = 0.0F;
    
    pk ☃ = ☃.j();
    if (☃ != null)
    {
      if ((☃ instanceof pr)) {
        b((pr)☃);
      }
      if ((☃ instanceof wn))
      {
        aO = 100;
        aN = ((wn)☃);
      }
      else if ((☃ instanceof ua))
      {
        ua ☃ = (ua)☃;
        if (☃.cl())
        {
          aO = 100;
          aN = null;
        }
      }
    }
    if (☃)
    {
      o.a(this, (byte)2);
      if (☃ != ow.f) {
        ac();
      }
      if (☃ != null)
      {
        double ☃ = s - s;
        double ☃ = u - u;
        while (☃ * ☃ + ☃ * ☃ < 1.0E-4D)
        {
          ☃ = (Math.random() - Math.random()) * 0.01D;
          ☃ = (Math.random() - Math.random()) * 0.01D;
        }
        aw = ((float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D - y));
        a(☃, ☃, ☃, ☃);
      }
      else
      {
        aw = ((int)(Math.random() * 2.0D) * 180);
      }
    }
    if (bn() <= 0.0F)
    {
      String ☃ = bp();
      if ((☃) && (☃ != null)) {
        a(☃, bB(), bC());
      }
      a(☃);
    }
    else
    {
      String ☃ = bo();
      if ((☃) && (☃ != null)) {
        a(☃, bB(), bC());
      }
    }
    return true;
  }
  
  public void b(zx ☃)
  {
    a("random.break", 0.8F, 0.8F + o.s.nextFloat() * 0.4F);
    for (int ☃ = 0; ☃ < 5; ☃++)
    {
      aui ☃ = new aui((V.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
      ☃ = ☃.a(-z * 3.1415927F / 180.0F);
      ☃ = ☃.b(-y * 3.1415927F / 180.0F);
      
      double ☃ = -V.nextFloat() * 0.6D - 0.3D;
      aui ☃ = new aui((V.nextFloat() - 0.5D) * 0.3D, ☃, 0.6D);
      ☃ = ☃.a(-z * 3.1415927F / 180.0F);
      ☃ = ☃.b(-y * 3.1415927F / 180.0F);
      ☃ = ☃.b(s, t + aS(), u);
      o.a(cy.K, a, b, c, a, b + 0.05D, c, new int[] { zw.b(☃.b()) });
    }
  }
  
  public void a(ow ☃)
  {
    pk ☃ = ☃.j();
    pr ☃ = bt();
    if ((aW >= 0) && (☃ != null)) {
      ☃.b(this, aW);
    }
    if (☃ != null) {
      ☃.a(this);
    }
    aP = true;
    bs().g();
    if (!o.D)
    {
      int ☃ = 0;
      if ((☃ instanceof wn)) {
        ☃ = ack.i((pr)☃);
      }
      if ((ba()) && (o.Q().b("doMobLoot")))
      {
        b(aO > 0, ☃);
        a(aO > 0, ☃);
        if ((aO > 0) && 
          (V.nextFloat() < 0.025F + ☃ * 0.01F)) {
          bq();
        }
      }
    }
    o.a(this, (byte)3);
  }
  
  protected void a(boolean ☃, int ☃) {}
  
  public void a(pk ☃, float ☃, double ☃, double ☃)
  {
    if (V.nextDouble() < a(vy.c).e()) {
      return;
    }
    ai = true;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    float ☃ = 0.4F;
    
    v /= 2.0D;
    w /= 2.0D;
    x /= 2.0D;
    
    v -= ☃ / ☃ * ☃;
    w += ☃;
    x -= ☃ / ☃ * ☃;
    if (w > 0.4000000059604645D) {
      w = 0.4000000059604645D;
    }
  }
  
  protected String bo()
  {
    return "game.neutral.hurt";
  }
  
  protected String bp()
  {
    return "game.neutral.die";
  }
  
  protected void bq() {}
  
  protected void b(boolean ☃, int ☃) {}
  
  public boolean k_()
  {
    int ☃ = ns.c(s);
    int ☃ = ns.c(aRb);
    int ☃ = ns.c(u);
    afh ☃ = o.p(new cj(☃, ☃, ☃)).c();
    return ((☃ == afi.au) || (☃ == afi.bn)) && ((!(this instanceof wn)) || (!((wn)this).v()));
  }
  
  public boolean ai()
  {
    return (!I) && (bn() > 0.0F);
  }
  
  public void e(float ☃, float ☃)
  {
    super.e(☃, ☃);
    pf ☃ = b(pe.j);
    float ☃ = ☃ != null ? ☃.c() + 1 : 0.0F;
    
    int ☃ = ns.f((☃ - 3.0F - ☃) * ☃);
    if (☃ > 0)
    {
      a(n(☃), 1.0F, 1.0F);
      a(ow.i, ☃);
      
      int ☃ = ns.c(s);
      int ☃ = ns.c(t - 0.20000000298023224D);
      int ☃ = ns.c(u);
      
      afh ☃ = o.p(new cj(☃, ☃, ☃)).c();
      if (☃.t() != arm.a)
      {
        afh.b ☃ = H;
        a(☃.c(), ☃.d() * 0.5F, ☃.e() * 0.75F);
      }
    }
  }
  
  protected String n(int ☃)
  {
    if (☃ > 4) {
      return "game.neutral.hurt.fall.big";
    }
    return "game.neutral.hurt.fall.small";
  }
  
  public void ar()
  {
    au = (av = 10);
    aw = 0.0F;
  }
  
  public int br()
  {
    int ☃ = 0;
    for (zx ☃ : as()) {
      if ((☃ != null) && ((☃.b() instanceof yj)))
      {
        int ☃ = bc;
        ☃ += ☃;
      }
    }
    return ☃;
  }
  
  protected void j(float ☃) {}
  
  protected float b(ow ☃, float ☃)
  {
    if (!☃.e())
    {
      int ☃ = 25 - br();
      float ☃ = ☃ * ☃;
      j(☃);
      ☃ = ☃ / 25.0F;
    }
    return ☃;
  }
  
  protected float c(ow ☃, float ☃)
  {
    if (☃.h()) {
      return ☃;
    }
    if ((a(pe.m)) && (☃ != ow.j))
    {
      int ☃ = (b(pe.m).c() + 1) * 5;
      int ☃ = 25 - ☃;
      float ☃ = ☃ * ☃;
      ☃ = ☃ / 25.0F;
    }
    if (☃ <= 0.0F) {
      return 0.0F;
    }
    int ☃ = ack.a(as(), ☃);
    if (☃ > 20) {
      ☃ = 20;
    }
    if ((☃ > 0) && (☃ <= 20))
    {
      int ☃ = 25 - ☃;
      float ☃ = ☃ * ☃;
      ☃ = ☃ / 25.0F;
    }
    return ☃;
  }
  
  protected void d(ow ☃, float ☃)
  {
    if (b(☃)) {
      return;
    }
    ☃ = b(☃, ☃);
    ☃ = c(☃, ☃);
    
    float ☃ = ☃;
    ☃ = Math.max(☃ - bN(), 0.0F);
    m(bN() - (☃ - ☃));
    if (☃ == 0.0F) {
      return;
    }
    float ☃ = bn();
    i(☃ - ☃);
    bs().a(☃, ☃, ☃);
    m(bN() - ☃);
  }
  
  public ov bs()
  {
    return f;
  }
  
  public pr bt()
  {
    if (f.c() != null) {
      return f.c();
    }
    if (aN != null) {
      return aN;
    }
    if (bi != null) {
      return bi;
    }
    return null;
  }
  
  public final float bu()
  {
    return (float)a(vy.a).e();
  }
  
  public final int bv()
  {
    return ac.a(9);
  }
  
  public final void o(int ☃)
  {
    ac.b(9, Byte.valueOf((byte)☃));
  }
  
  private int n()
  {
    if (a(pe.e)) {
      return 6 - (1 + b(pe.e).c()) * 1;
    }
    if (a(pe.f)) {
      return 6 + (1 + b(pe.f).c()) * 2;
    }
    return 6;
  }
  
  public void bw()
  {
    if ((!ar) || (as >= n() / 2) || (as < 0))
    {
      as = -1;
      ar = true;
      if ((o instanceof le)) {
        ((le)o).s().a(this, new fq(this, 0));
      }
    }
  }
  
  public void a(byte ☃)
  {
    if (☃ == 2)
    {
      aB = 1.5F;
      
      Z = aD;
      au = (av = 10);
      aw = 0.0F;
      
      String ☃ = bo();
      if (☃ != null) {
        a(bo(), bB(), (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F);
      }
      a(ow.k, 0.0F);
    }
    else if (☃ == 3)
    {
      String ☃ = bp();
      if (☃ != null) {
        a(bp(), bB(), (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F);
      }
      i(0.0F);
      a(ow.k);
    }
    else
    {
      super.a(☃);
    }
  }
  
  protected void O()
  {
    a(ow.j, 4.0F);
  }
  
  protected void bx()
  {
    int ☃ = n();
    if (ar)
    {
      as += 1;
      if (as >= ☃)
      {
        as = 0;
        ar = false;
      }
    }
    else
    {
      as = 0;
    }
    az = (as / ☃);
  }
  
  public qc a(qb ☃)
  {
    return by().a(☃);
  }
  
  public qf by()
  {
    if (c == null) {
      c = new qi();
    }
    return c;
  }
  
  public pw bz()
  {
    return pw.a;
  }
  
  public abstract zx bA();
  
  public abstract zx p(int paramInt);
  
  public abstract zx q(int paramInt);
  
  public abstract void c(int paramInt, zx paramzx);
  
  public void d(boolean ☃)
  {
    super.d(☃);
    
    qc ☃ = a(vy.d);
    if (☃.a(a) != null) {
      ☃.c(b);
    }
    if (☃) {
      ☃.b(b);
    }
  }
  
  public abstract zx[] as();
  
  protected float bB()
  {
    return 1.0F;
  }
  
  protected float bC()
  {
    if (j_()) {
      return (V.nextFloat() - V.nextFloat()) * 0.2F + 1.5F;
    }
    return (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F;
  }
  
  protected boolean bD()
  {
    return bn() <= 0.0F;
  }
  
  public void q(pk ☃)
  {
    double ☃ = s;
    double ☃ = aRb + K;
    double ☃ = u;
    int ☃ = 1;
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ < ☃; ☃++) {
        if ((☃ != 0) || (☃ != 0))
        {
          int ☃ = (int)(s + ☃);
          int ☃ = (int)(u + ☃);
          aug ☃ = aR().c(☃, 1.0D, ☃);
          if (o.a(☃).isEmpty())
          {
            if (adm.a(o, new cj(☃, (int)t, ☃)))
            {
              a(s + ☃, t + 1.0D, u + ☃);
              return;
            }
            if ((adm.a(o, new cj(☃, (int)t - 1, ☃))) || (o.p(new cj(☃, (int)t - 1, ☃)).c().t() == arm.h))
            {
              ☃ = s + ☃;
              ☃ = t + 1.0D;
              ☃ = u + ☃;
            }
          }
        }
      }
    }
    a(☃, ☃, ☃);
  }
  
  public boolean aO()
  {
    return false;
  }
  
  protected float bE()
  {
    return 0.42F;
  }
  
  protected void bF()
  {
    w = bE();
    if (a(pe.j)) {
      w += (b(pe.j).c() + 1) * 0.1F;
    }
    if (aw())
    {
      float ☃ = y * 0.017453292F;
      
      v -= ns.a(☃) * 0.2F;
      x += ns.b(☃) * 0.2F;
    }
    ai = true;
  }
  
  protected void bG()
  {
    w += 0.03999999910593033D;
  }
  
  protected void bH()
  {
    w += 0.03999999910593033D;
  }
  
  public void g(float ☃, float ☃)
  {
    if (bM()) {
      if ((V()) && ((!(this instanceof wn)) || (!bA.b)))
      {
        double ☃ = t;
        
        float ☃ = 0.8F;
        float ☃ = 0.02F;
        
        float ☃ = ack.b(this);
        if (☃ > 3.0F) {
          ☃ = 3.0F;
        }
        if (!C) {
          ☃ *= 0.5F;
        }
        if (☃ > 0.0F)
        {
          ☃ += (0.54600006F - ☃) * ☃ / 3.0F;
          
          ☃ += (bI() * 1.0F - ☃) * ☃ / 3.0F;
        }
        a(☃, ☃, ☃);
        d(v, w, x);
        
        v *= ☃;
        w *= 0.800000011920929D;
        x *= ☃;
        w -= 0.02D;
        if ((D) && (c(v, w + 0.6000000238418579D - t + ☃, x))) {
          w = 0.30000001192092896D;
        }
      }
      else if ((ab()) && ((!(this instanceof wn)) || (!bA.b)))
      {
        double ☃ = t;
        a(☃, ☃, 0.02F);
        d(v, w, x);
        v *= 0.5D;
        w *= 0.5D;
        x *= 0.5D;
        w -= 0.02D;
        if ((D) && (c(v, w + 0.6000000238418579D - t + ☃, x))) {
          w = 0.30000001192092896D;
        }
      }
      else
      {
        float ☃ = 0.91F;
        if (C) {
          ☃ = o.p(new cj(ns.c(s), ns.c(aRb) - 1, ns.c(u))).c().L * 0.91F;
        }
        float ☃ = 0.16277136F / (☃ * ☃ * ☃);
        float ☃;
        float ☃;
        if (C) {
          ☃ = bI() * ☃;
        } else {
          ☃ = aM;
        }
        a(☃, ☃, ☃);
        
        ☃ = 0.91F;
        if (C) {
          ☃ = o.p(new cj(ns.c(s), ns.c(aRb) - 1, ns.c(u))).c().L * 0.91F;
        }
        if (k_())
        {
          float ☃ = 0.15F;
          v = ns.a(v, -☃, ☃);
          x = ns.a(x, -☃, ☃);
          O = 0.0F;
          if (w < -0.15D) {
            w = -0.15D;
          }
          boolean ☃ = (av()) && ((this instanceof wn));
          if ((☃) && (w < 0.0D)) {
            w = 0.0D;
          }
        }
        d(v, w, x);
        if ((D) && (k_())) {
          w = 0.2D;
        }
        if ((!o.D) || ((o.e(new cj((int)s, 0, (int)u))) && (o.f(new cj((int)s, 0, (int)u)).o()))) {
          w -= 0.08D;
        } else if (t > 0.0D) {
          w = -0.1D;
        } else {
          w = 0.0D;
        }
        w *= 0.9800000190734863D;
        v *= ☃;
        x *= ☃;
      }
    }
    aA = aB;
    double ☃ = s - p;
    double ☃ = u - r;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 4.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    aB += (☃ - aB) * 0.4F;
    aC += aB;
  }
  
  public float bI()
  {
    return bm;
  }
  
  public void k(float ☃)
  {
    bm = ☃;
  }
  
  public boolean r(pk ☃)
  {
    p(☃);
    return false;
  }
  
  public boolean bJ()
  {
    return false;
  }
  
  public void t_()
  {
    super.t_();
    if (!o.D)
    {
      int ☃ = bv();
      if (☃ > 0)
      {
        if (at <= 0) {
          at = (20 * (30 - ☃));
        }
        at -= 1;
        if (at <= 0) {
          o(☃ - 1);
        }
      }
      for (int ☃ = 0; ☃ < 5; ☃++)
      {
        zx ☃ = h[☃];
        zx ☃ = p(☃);
        if (!zx.b(☃, ☃))
        {
          ((le)o).s().a(this, new hn(F(), ☃, ☃));
          if (☃ != null) {
            c.a(☃.B());
          }
          if (☃ != null) {
            c.b(☃.B());
          }
          h[☃] = (☃ == null ? null : ☃.k());
        }
      }
      if (W % 20 == 0) {
        bs().g();
      }
    }
    m();
    
    double ☃ = s - p;
    double ☃ = u - r;
    
    float ☃ = (float)(☃ * ☃ + ☃ * ☃);
    
    float ☃ = aI;
    
    float ☃ = 0.0F;
    aR = aS;
    float ☃ = 0.0F;
    if (☃ > 0.0025000002F)
    {
      ☃ = 1.0F;
      ☃ = (float)Math.sqrt(☃) * 3.0F;
      ☃ = (float)ns.b(☃, ☃) * 180.0F / 3.1415927F - 90.0F;
    }
    if (az > 0.0F) {
      ☃ = y;
    }
    if (!C) {
      ☃ = 0.0F;
    }
    aS += (☃ - aS) * 0.3F;
    
    o.B.a("headTurn");
    
    ☃ = h(☃, ☃);
    
    o.B.b();
    
    o.B.a("rangeChecks");
    while (y - A < -180.0F) {
      A -= 360.0F;
    }
    while (y - A >= 180.0F) {
      A += 360.0F;
    }
    while (aI - aJ < -180.0F) {
      aJ -= 360.0F;
    }
    while (aI - aJ >= 180.0F) {
      aJ += 360.0F;
    }
    while (z - B < -180.0F) {
      B -= 360.0F;
    }
    while (z - B >= 180.0F) {
      B += 360.0F;
    }
    while (aK - aL < -180.0F) {
      aL -= 360.0F;
    }
    while (aK - aL >= 180.0F) {
      aL += 360.0F;
    }
    o.B.b();
    
    aT += ☃;
  }
  
  protected float h(float ☃, float ☃)
  {
    float ☃ = ns.g(☃ - aI);
    aI += ☃ * 0.3F;
    
    float ☃ = ns.g(y - aI);
    boolean ☃ = (☃ < -90.0F) || (☃ >= 90.0F);
    if (☃ < -75.0F) {
      ☃ = -75.0F;
    }
    if (☃ >= 75.0F) {
      ☃ = 75.0F;
    }
    aI = (y - ☃);
    if (☃ * ☃ > 2500.0F) {
      aI += ☃ * 0.2F;
    }
    if (☃) {
      ☃ *= -1.0F;
    }
    return ☃;
  }
  
  public void m()
  {
    if (bn > 0) {
      bn -= 1;
    }
    if (bc > 0)
    {
      double ☃ = s + (bd - s) / bc;
      double ☃ = t + (be - t) / bc;
      double ☃ = u + (bf - u) / bc;
      
      double ☃ = ns.g(bg - y);
      
      y = ((float)(y + ☃ / bc));
      z = ((float)(z + (bh - z) / bc));
      
      bc -= 1;
      b(☃, ☃, ☃);
      b(y, z);
    }
    else if (!bM())
    {
      v *= 0.98D;
      w *= 0.98D;
      x *= 0.98D;
    }
    if (Math.abs(v) < 0.005D) {
      v = 0.0D;
    }
    if (Math.abs(w) < 0.005D) {
      w = 0.0D;
    }
    if (Math.abs(x) < 0.005D) {
      x = 0.0D;
    }
    o.B.a("ai");
    if (bD())
    {
      aY = false;
      aZ = 0.0F;
      ba = 0.0F;
      bb = 0.0F;
    }
    else if (bM())
    {
      o.B.a("newAi");
      bK();
      o.B.b();
    }
    o.B.b();
    
    o.B.a("jump");
    if (aY)
    {
      if (V())
      {
        bG();
      }
      else if (ab())
      {
        bH();
      }
      else if ((C) && 
        (bn == 0))
      {
        bF();
        bn = 10;
      }
    }
    else {
      bn = 0;
    }
    o.B.b();
    
    o.B.a("travel");
    aZ *= 0.98F;
    ba *= 0.98F;
    bb *= 0.9F;
    
    g(aZ, ba);
    o.B.b();
    
    o.B.a("push");
    if (!o.D) {
      bL();
    }
    o.B.b();
  }
  
  protected void bK() {}
  
  protected void bL()
  {
    List<pk> ☃ = o.a(this, aR().b(0.20000000298023224D, 0.0D, 0.20000000298023224D), Predicates.and(po.d, new Predicate()
    {
      public boolean a(pk ☃)
      {
        return ☃.ae();
      }
    }));
    if (!☃.isEmpty()) {
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        pk ☃ = (pk)☃.get(☃);
        s(☃);
      }
    }
  }
  
  protected void s(pk ☃)
  {
    ☃.i(this);
  }
  
  public void a(pk ☃)
  {
    if ((m != null) && (☃ == null))
    {
      if (!o.D) {
        q(m);
      }
      if (m != null) {
        m.l = null;
      }
      m = null;
      
      return;
    }
    super.a(☃);
  }
  
  public void ak()
  {
    super.ak();
    aR = aS;
    aS = 0.0F;
    O = 0.0F;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    bd = ☃;
    be = ☃;
    bf = ☃;
    bg = ☃;
    bh = ☃;
    
    bc = ☃;
  }
  
  public void i(boolean ☃)
  {
    aY = ☃;
  }
  
  public void a(pk ☃, int ☃)
  {
    if ((!I) && (!o.D))
    {
      la ☃ = ((le)o).s();
      if ((☃ instanceof uz)) {
        ☃.a(☃, new hy(☃.F(), F()));
      }
      if ((☃ instanceof wq)) {
        ☃.a(☃, new hy(☃.F(), F()));
      }
      if ((☃ instanceof pp)) {
        ☃.a(☃, new hy(☃.F(), F()));
      }
    }
  }
  
  public boolean t(pk ☃)
  {
    return o.a(new aui(s, t + aS(), u), new aui(s, t + ☃.aS(), u)) == null;
  }
  
  public aui ap()
  {
    return d(1.0F);
  }
  
  public aui d(float ☃)
  {
    if (☃ == 1.0F) {
      return f(z, aK);
    }
    float ☃ = B + (z - B) * ☃;
    float ☃ = aL + (aK - aL) * ☃;
    return f(☃, ☃);
  }
  
  public float l(float ☃)
  {
    float ☃ = az - ay;
    if (☃ < 0.0F) {
      ☃ += 1.0F;
    }
    return ay + ☃ * ☃;
  }
  
  public boolean bM()
  {
    return !o.D;
  }
  
  public boolean ad()
  {
    return !I;
  }
  
  public boolean ae()
  {
    return !I;
  }
  
  protected void ac()
  {
    G = (V.nextDouble() >= a(vy.c).e());
  }
  
  public float aC()
  {
    return aK;
  }
  
  public void f(float ☃)
  {
    aK = ☃;
  }
  
  public void g(float ☃)
  {
    aI = ☃;
  }
  
  public float bN()
  {
    return bo;
  }
  
  public void m(float ☃)
  {
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    bo = ☃;
  }
  
  public auq bO()
  {
    return o.Z().h(aK().toString());
  }
  
  public boolean c(pr ☃)
  {
    return a(☃.bO());
  }
  
  public boolean a(auq ☃)
  {
    if (bO() != null) {
      return bO().a(☃);
    }
    return false;
  }
  
  public void h_() {}
  
  public void j() {}
  
  protected void bP()
  {
    i = true;
  }
}
