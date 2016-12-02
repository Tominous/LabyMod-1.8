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
    
    this.k = true;
    this.aH = ((float)((Math.random() + 1.0D) * 0.009999999776482582D));
    b(this.s, this.t, this.u);
    this.aG = ((float)Math.random() * 12398.0F);
    this.y = ((float)(Math.random() * 3.1415927410125732D * 2.0D));
    this.aK = this.y;
    this.S = 0.6F;
  }
  
  protected void h()
  {
    this.ac.a(7, Integer.valueOf(0));
    this.ac.a(8, Byte.valueOf((byte)0));
    this.ac.a(9, Byte.valueOf((byte)0));
    this.ac.a(6, Float.valueOf(1.0F));
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
    if ((!this.o.D) && (this.O > 3.0F) && (☃))
    {
      alz ☃ = this.o.p(☃);
      afh ☃ = ☃.c();
      float ☃ = ns.f(this.O - 3.0F);
      if (☃.t() != arm.a)
      {
        double ☃ = Math.min(0.2F + ☃ / 15.0F, 10.0F);
        if (☃ > 2.5D) {
          ☃ = 2.5D;
        }
        int ☃ = (int)(150.0D * ☃);
        ((le)this.o).a(cy.M, this.s, this.t, this.u, ☃, 0.0D, 0.0D, 0.0D, 0.15000000596046448D, new int[] { afh.f(☃) });
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
    this.ay = this.az;
    super.K();
    
    this.o.B.a("livingEntityBaseTick");
    
    boolean ☃ = this instanceof wn;
    if (ai()) {
      if (aj())
      {
        a(ow.e, 1.0F);
      }
      else if ((☃) && (!this.o.af().a(aR())))
      {
        double ☃ = this.o.af().a(this) + this.o.af().m();
        if (☃ < 0.0D) {
          a(ow.e, Math.max(1, ns.c(-☃ * this.o.af().n())));
        }
      }
    }
    if ((T()) || (this.o.D)) {
      N();
    }
    boolean ☃ = (☃) && (((wn)this).bA.a);
    if (ai()) {
      if (a(arm.h))
      {
        if ((!aY()) && (!k(pe.o.H)) && (!☃))
        {
          h(j(az()));
          if (az() == -20)
          {
            h(0);
            for (int ☃ = 0; ☃ < 8; ☃++)
            {
              float ☃ = this.V.nextFloat() - this.V.nextFloat();
              float ☃ = this.V.nextFloat() - this.V.nextFloat();
              float ☃ = this.V.nextFloat() - this.V.nextFloat();
              this.o.a(cy.e, this.s + ☃, this.t + ☃, this.u + ☃, this.v, this.w, this.x, new int[0]);
            }
            a(ow.f, 2.0F);
          }
        }
        if ((!this.o.D) && (au()) && ((this.m instanceof pr))) {
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
    this.aE = this.aF;
    if (this.au > 0) {
      this.au -= 1;
    }
    if ((this.Z > 0) && (!(this instanceof lf))) {
      this.Z -= 1;
    }
    if (bn() <= 0.0F) {
      aZ();
    }
    if (this.aO > 0) {
      this.aO -= 1;
    } else {
      this.aN = null;
    }
    if ((this.bk != null) && (!this.bk.ai())) {
      this.bk = null;
    }
    if (this.bi != null) {
      if (!this.bi.ai()) {
        b(null);
      } else if (this.W - this.bj > 100) {
        b(null);
      }
    }
    bi();
    
    this.aU = this.aT;
    
    this.aJ = this.aI;
    this.aL = this.aK;
    this.A = this.y;
    this.B = this.z;
    
    this.o.B.b();
  }
  
  public boolean j_()
  {
    return false;
  }
  
  protected void aZ()
  {
    this.ax += 1;
    if (this.ax == 20)
    {
      if ((!this.o.D) && ((this.aO > 0) || (bb())) && 
        (ba()) && (this.o.Q().b("doMobLoot")))
      {
        int ☃ = b(this.aN);
        while (☃ > 0)
        {
          int ☃ = pp.a(☃);
          ☃ -= ☃;
          this.o.d(new pp(this.o, this.s, this.t, this.u, ☃));
        }
      }
      J();
      for (int ☃ = 0; ☃ < 20; ☃++)
      {
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        this.o.a(cy.a, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, ☃, ☃, ☃, new int[0]);
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
      (this.V.nextInt(☃ + 1) > 0)) {
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
    return this.V;
  }
  
  public pr bd()
  {
    return this.bi;
  }
  
  public int be()
  {
    return this.bj;
  }
  
  public void b(pr ☃)
  {
    this.bi = ☃;
    this.bj = this.W;
  }
  
  public pr bf()
  {
    return this.bk;
  }
  
  public int bg()
  {
    return this.bl;
  }
  
  public void p(pk ☃)
  {
    if ((☃ instanceof pr)) {
      this.bk = ((pr)☃);
    } else {
      this.bk = null;
    }
    this.bl = this.W;
  }
  
  public int bh()
  {
    return this.aQ;
  }
  
  public void b(dn ☃)
  {
    ☃.a("HealF", bn());
    ☃.a("Health", (short)(int)Math.ceil(bn()));
    ☃.a("HurtTime", (short)this.au);
    ☃.a("HurtByTimestamp", this.bj);
    ☃.a("DeathTime", (short)this.ax);
    ☃.a("AbsorptionAmount", bN());
    for (zx ☃ : as()) {
      if (☃ != null) {
        this.c.a(☃.B());
      }
    }
    ☃.a("Attributes", vy.a(by()));
    for (zx ☃ : as()) {
      if (☃ != null) {
        this.c.b(☃.B());
      }
    }
    if (!this.g.isEmpty())
    {
      du ☃ = new du();
      for (pf ☃ : this.g.values()) {
        ☃.a(☃.a(new dn()));
      }
      ☃.a("ActiveEffects", ☃);
    }
  }
  
  public void a(dn ☃)
  {
    m(☃.h("AbsorptionAmount"));
    if ((☃.b("Attributes", 9)) && (this.o != null) && (!this.o.D)) {
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
          this.g.put(Integer.valueOf(☃.a()), ☃);
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
    this.au = ☃.e("HurtTime");
    this.ax = ☃.e("DeathTime");
    this.bj = ☃.f("HurtByTimestamp");
  }
  
  protected void bi()
  {
    Iterator<Integer> ☃ = this.g.keySet().iterator();
    while (☃.hasNext())
    {
      Integer ☃ = (Integer)☃.next();
      pf ☃ = (pf)this.g.get(☃);
      if (!☃.a(this))
      {
        if (!this.o.D)
        {
          ☃.remove();
          b(☃);
        }
      }
      else if (☃.b() % 600 == 0) {
        a(☃, false);
      }
    }
    if (this.i)
    {
      if (!this.o.D) {
        B();
      }
      this.i = false;
    }
    int ☃ = this.ac.c(7);
    boolean ☃ = this.ac.a(8) > 0;
    if (☃ > 0)
    {
      boolean ☃ = false;
      if (!ax()) {
        ☃ = this.V.nextBoolean();
      } else {
        ☃ = this.V.nextInt(15) == 0;
      }
      if (☃) {
        ☃ &= this.V.nextInt(5) == 0;
      }
      if ((☃) && 
        (☃ > 0))
      {
        double ☃ = (☃ >> 16 & 0xFF) / 255.0D;
        double ☃ = (☃ >> 8 & 0xFF) / 255.0D;
        double ☃ = (☃ >> 0 & 0xFF) / 255.0D;
        
        this.o.a(☃ ? cy.q : cy.p, this.s + (this.V.nextDouble() - 0.5D) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5D) * this.J, ☃, ☃, ☃, new int[0]);
      }
    }
  }
  
  protected void B()
  {
    if (this.g.isEmpty())
    {
      bj();
      e(false);
    }
    else
    {
      int ☃ = abe.a(this.g.values());
      this.ac.b(8, Byte.valueOf((byte)(abe.b(this.g.values()) ? 1 : 0)));
      this.ac.b(7, Integer.valueOf(☃));
      e(k(pe.p.H));
    }
  }
  
  protected void bj()
  {
    this.ac.b(8, Byte.valueOf((byte)0));
    this.ac.b(7, Integer.valueOf(0));
  }
  
  public void bk()
  {
    Iterator<Integer> ☃ = this.g.keySet().iterator();
    while (☃.hasNext())
    {
      Integer ☃ = (Integer)☃.next();
      pf ☃ = (pf)this.g.get(☃);
      if (!this.o.D)
      {
        ☃.remove();
        b(☃);
      }
    }
  }
  
  public Collection<pf> bl()
  {
    return this.g.values();
  }
  
  public boolean k(int ☃)
  {
    return this.g.containsKey(Integer.valueOf(☃));
  }
  
  public boolean a(pe ☃)
  {
    return this.g.containsKey(Integer.valueOf(☃.H));
  }
  
  public pf b(pe ☃)
  {
    return (pf)this.g.get(Integer.valueOf(☃.H));
  }
  
  public void c(pf ☃)
  {
    if (!d(☃)) {
      return;
    }
    if (this.g.containsKey(Integer.valueOf(☃.a())))
    {
      ((pf)this.g.get(Integer.valueOf(☃.a()))).a(☃);
      a((pf)this.g.get(Integer.valueOf(☃.a())), true);
    }
    else
    {
      this.g.put(Integer.valueOf(☃.a()), ☃);
      a(☃);
    }
  }
  
  public boolean d(pf ☃)
  {
    if (bz() == pw.b)
    {
      int ☃ = ☃.a();
      if ((☃ == pe.l.H) || (☃ == pe.u.H)) {
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
    this.g.remove(Integer.valueOf(☃));
  }
  
  public void m(int ☃)
  {
    pf ☃ = (pf)this.g.remove(Integer.valueOf(☃));
    if (☃ != null) {
      b(☃);
    }
  }
  
  protected void a(pf ☃)
  {
    this.i = true;
    if (!this.o.D) {
      pe.a[☃.a()].b(this, by(), ☃.c());
    }
  }
  
  protected void a(pf ☃, boolean ☃)
  {
    this.i = true;
    if ((☃) && (!this.o.D))
    {
      pe.a[☃.a()].a(this, by(), ☃.c());
      pe.a[☃.a()].b(this, by(), ☃.c());
    }
  }
  
  protected void b(pf ☃)
  {
    this.i = true;
    if (!this.o.D) {
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
    return this.ac.d(6);
  }
  
  public void i(float ☃)
  {
    this.ac.b(6, Float.valueOf(ns.a(☃, 0.0F, bu())));
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if (this.o.D) {
      return false;
    }
    this.aQ = 0;
    if (bn() <= 0.0F) {
      return false;
    }
    if ((☃.o()) && (a(pe.n))) {
      return false;
    }
    if (((☃ == ow.n) || (☃ == ow.o)) && (p(4) != null))
    {
      p(4).a((int)(☃ * 4.0F + this.V.nextFloat() * ☃ * 2.0F), this);
      ☃ *= 0.75F;
    }
    this.aB = 1.5F;
    
    boolean ☃ = true;
    if (this.Z > this.aD / 2.0F)
    {
      if (☃ <= this.aX) {
        return false;
      }
      d(☃, ☃ - this.aX);
      this.aX = ☃;
      ☃ = false;
    }
    else
    {
      this.aX = ☃;
      this.Z = this.aD;
      d(☃, ☃);
      this.au = (this.av = 10);
    }
    this.aw = 0.0F;
    
    pk ☃ = ☃.j();
    if (☃ != null)
    {
      if ((☃ instanceof pr)) {
        b((pr)☃);
      }
      if ((☃ instanceof wn))
      {
        this.aO = 100;
        this.aN = ((wn)☃);
      }
      else if ((☃ instanceof ua))
      {
        ua ☃ = (ua)☃;
        if (☃.cl())
        {
          this.aO = 100;
          this.aN = null;
        }
      }
    }
    if (☃)
    {
      this.o.a(this, (byte)2);
      if (☃ != ow.f) {
        ac();
      }
      if (☃ != null)
      {
        double ☃ = ☃.s - this.s;
        double ☃ = ☃.u - this.u;
        while (☃ * ☃ + ☃ * ☃ < 1.0E-4D)
        {
          ☃ = (Math.random() - Math.random()) * 0.01D;
          ☃ = (Math.random() - Math.random()) * 0.01D;
        }
        this.aw = ((float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D - this.y));
        a(☃, ☃, ☃, ☃);
      }
      else
      {
        this.aw = ((int)(Math.random() * 2.0D) * 180);
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
    a("random.break", 0.8F, 0.8F + this.o.s.nextFloat() * 0.4F);
    for (int ☃ = 0; ☃ < 5; ☃++)
    {
      aui ☃ = new aui((this.V.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
      ☃ = ☃.a(-this.z * 3.1415927F / 180.0F);
      ☃ = ☃.b(-this.y * 3.1415927F / 180.0F);
      
      double ☃ = -this.V.nextFloat() * 0.6D - 0.3D;
      aui ☃ = new aui((this.V.nextFloat() - 0.5D) * 0.3D, ☃, 0.6D);
      ☃ = ☃.a(-this.z * 3.1415927F / 180.0F);
      ☃ = ☃.b(-this.y * 3.1415927F / 180.0F);
      ☃ = ☃.b(this.s, this.t + aS(), this.u);
      this.o.a(cy.K, ☃.a, ☃.b, ☃.c, ☃.a, ☃.b + 0.05D, ☃.c, new int[] { zw.b(☃.b()) });
    }
  }
  
  public void a(ow ☃)
  {
    pk ☃ = ☃.j();
    pr ☃ = bt();
    if ((this.aW >= 0) && (☃ != null)) {
      ☃.b(this, this.aW);
    }
    if (☃ != null) {
      ☃.a(this);
    }
    this.aP = true;
    bs().g();
    if (!this.o.D)
    {
      int ☃ = 0;
      if ((☃ instanceof wn)) {
        ☃ = ack.i((pr)☃);
      }
      if ((ba()) && (this.o.Q().b("doMobLoot")))
      {
        b(this.aO > 0, ☃);
        a(this.aO > 0, ☃);
        if ((this.aO > 0) && 
          (this.V.nextFloat() < 0.025F + ☃ * 0.01F)) {
          bq();
        }
      }
    }
    this.o.a(this, (byte)3);
  }
  
  protected void a(boolean ☃, int ☃) {}
  
  public void a(pk ☃, float ☃, double ☃, double ☃)
  {
    if (this.V.nextDouble() < a(vy.c).e()) {
      return;
    }
    this.ai = true;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    float ☃ = 0.4F;
    
    this.v /= 2.0D;
    this.w /= 2.0D;
    this.x /= 2.0D;
    
    this.v -= ☃ / ☃ * ☃;
    this.w += ☃;
    this.x -= ☃ / ☃ * ☃;
    if (this.w > 0.4000000059604645D) {
      this.w = 0.4000000059604645D;
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
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(aR().b);
    int ☃ = ns.c(this.u);
    afh ☃ = this.o.p(new cj(☃, ☃, ☃)).c();
    return ((☃ == afi.au) || (☃ == afi.bn)) && ((!(this instanceof wn)) || (!((wn)this).v()));
  }
  
  public boolean ai()
  {
    return (!this.I) && (bn() > 0.0F);
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
      
      int ☃ = ns.c(this.s);
      int ☃ = ns.c(this.t - 0.20000000298023224D);
      int ☃ = ns.c(this.u);
      
      afh ☃ = this.o.p(new cj(☃, ☃, ☃)).c();
      if (☃.t() != arm.a)
      {
        afh.b ☃ = ☃.H;
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
    this.au = (this.av = 10);
    this.aw = 0.0F;
  }
  
  public int br()
  {
    int ☃ = 0;
    for (zx ☃ : as()) {
      if ((☃ != null) && ((☃.b() instanceof yj)))
      {
        int ☃ = ((yj)☃.b()).c;
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
    return this.f;
  }
  
  public pr bt()
  {
    if (this.f.c() != null) {
      return this.f.c();
    }
    if (this.aN != null) {
      return this.aN;
    }
    if (this.bi != null) {
      return this.bi;
    }
    return null;
  }
  
  public final float bu()
  {
    return (float)a(vy.a).e();
  }
  
  public final int bv()
  {
    return this.ac.a(9);
  }
  
  public final void o(int ☃)
  {
    this.ac.b(9, Byte.valueOf((byte)☃));
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
    if ((!this.ar) || (this.as >= n() / 2) || (this.as < 0))
    {
      this.as = -1;
      this.ar = true;
      if ((this.o instanceof le)) {
        ((le)this.o).s().a(this, new fq(this, 0));
      }
    }
  }
  
  public void a(byte ☃)
  {
    if (☃ == 2)
    {
      this.aB = 1.5F;
      
      this.Z = this.aD;
      this.au = (this.av = 10);
      this.aw = 0.0F;
      
      String ☃ = bo();
      if (☃ != null) {
        a(bo(), bB(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
      }
      a(ow.k, 0.0F);
    }
    else if (☃ == 3)
    {
      String ☃ = bp();
      if (☃ != null) {
        a(bp(), bB(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
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
    if (this.ar)
    {
      this.as += 1;
      if (this.as >= ☃)
      {
        this.as = 0;
        this.ar = false;
      }
    }
    else
    {
      this.as = 0;
    }
    this.az = (this.as / ☃);
  }
  
  public qc a(qb ☃)
  {
    return by().a(☃);
  }
  
  public qf by()
  {
    if (this.c == null) {
      this.c = new qi();
    }
    return this.c;
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
      return (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.5F;
    }
    return (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F;
  }
  
  protected boolean bD()
  {
    return bn() <= 0.0F;
  }
  
  public void q(pk ☃)
  {
    double ☃ = ☃.s;
    double ☃ = ☃.aR().b + ☃.K;
    double ☃ = ☃.u;
    int ☃ = 1;
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ < ☃; ☃++) {
        if ((☃ != 0) || (☃ != 0))
        {
          int ☃ = (int)(this.s + ☃);
          int ☃ = (int)(this.u + ☃);
          aug ☃ = aR().c(☃, 1.0D, ☃);
          if (this.o.a(☃).isEmpty())
          {
            if (adm.a(this.o, new cj(☃, (int)this.t, ☃)))
            {
              a(this.s + ☃, this.t + 1.0D, this.u + ☃);
              return;
            }
            if ((adm.a(this.o, new cj(☃, (int)this.t - 1, ☃))) || (this.o.p(new cj(☃, (int)this.t - 1, ☃)).c().t() == arm.h))
            {
              ☃ = this.s + ☃;
              ☃ = this.t + 1.0D;
              ☃ = this.u + ☃;
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
    this.w = bE();
    if (a(pe.j)) {
      this.w += (b(pe.j).c() + 1) * 0.1F;
    }
    if (aw())
    {
      float ☃ = this.y * 0.017453292F;
      
      this.v -= ns.a(☃) * 0.2F;
      this.x += ns.b(☃) * 0.2F;
    }
    this.ai = true;
  }
  
  protected void bG()
  {
    this.w += 0.03999999910593033D;
  }
  
  protected void bH()
  {
    this.w += 0.03999999910593033D;
  }
  
  public void g(float ☃, float ☃)
  {
    if (bM()) {
      if ((V()) && ((!(this instanceof wn)) || (!((wn)this).bA.b)))
      {
        double ☃ = this.t;
        
        float ☃ = 0.8F;
        float ☃ = 0.02F;
        
        float ☃ = ack.b(this);
        if (☃ > 3.0F) {
          ☃ = 3.0F;
        }
        if (!this.C) {
          ☃ *= 0.5F;
        }
        if (☃ > 0.0F)
        {
          ☃ += (0.54600006F - ☃) * ☃ / 3.0F;
          
          ☃ += (bI() * 1.0F - ☃) * ☃ / 3.0F;
        }
        a(☃, ☃, ☃);
        d(this.v, this.w, this.x);
        
        this.v *= ☃;
        this.w *= 0.800000011920929D;
        this.x *= ☃;
        this.w -= 0.02D;
        if ((this.D) && (c(this.v, this.w + 0.6000000238418579D - this.t + ☃, this.x))) {
          this.w = 0.30000001192092896D;
        }
      }
      else if ((ab()) && ((!(this instanceof wn)) || (!((wn)this).bA.b)))
      {
        double ☃ = this.t;
        a(☃, ☃, 0.02F);
        d(this.v, this.w, this.x);
        this.v *= 0.5D;
        this.w *= 0.5D;
        this.x *= 0.5D;
        this.w -= 0.02D;
        if ((this.D) && (c(this.v, this.w + 0.6000000238418579D - this.t + ☃, this.x))) {
          this.w = 0.30000001192092896D;
        }
      }
      else
      {
        float ☃ = 0.91F;
        if (this.C) {
          ☃ = this.o.p(new cj(ns.c(this.s), ns.c(aR().b) - 1, ns.c(this.u))).c().L * 0.91F;
        }
        float ☃ = 0.16277136F / (☃ * ☃ * ☃);
        float ☃;
        float ☃;
        if (this.C) {
          ☃ = bI() * ☃;
        } else {
          ☃ = this.aM;
        }
        a(☃, ☃, ☃);
        
        ☃ = 0.91F;
        if (this.C) {
          ☃ = this.o.p(new cj(ns.c(this.s), ns.c(aR().b) - 1, ns.c(this.u))).c().L * 0.91F;
        }
        if (k_())
        {
          float ☃ = 0.15F;
          this.v = ns.a(this.v, -☃, ☃);
          this.x = ns.a(this.x, -☃, ☃);
          this.O = 0.0F;
          if (this.w < -0.15D) {
            this.w = -0.15D;
          }
          boolean ☃ = (av()) && ((this instanceof wn));
          if ((☃) && (this.w < 0.0D)) {
            this.w = 0.0D;
          }
        }
        d(this.v, this.w, this.x);
        if ((this.D) && (k_())) {
          this.w = 0.2D;
        }
        if ((!this.o.D) || ((this.o.e(new cj((int)this.s, 0, (int)this.u))) && (this.o.f(new cj((int)this.s, 0, (int)this.u)).o()))) {
          this.w -= 0.08D;
        } else if (this.t > 0.0D) {
          this.w = -0.1D;
        } else {
          this.w = 0.0D;
        }
        this.w *= 0.9800000190734863D;
        this.v *= ☃;
        this.x *= ☃;
      }
    }
    this.aA = this.aB;
    double ☃ = this.s - this.p;
    double ☃ = this.u - this.r;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 4.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    this.aB += (☃ - this.aB) * 0.4F;
    this.aC += this.aB;
  }
  
  public float bI()
  {
    return this.bm;
  }
  
  public void k(float ☃)
  {
    this.bm = ☃;
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
    if (!this.o.D)
    {
      int ☃ = bv();
      if (☃ > 0)
      {
        if (this.at <= 0) {
          this.at = (20 * (30 - ☃));
        }
        this.at -= 1;
        if (this.at <= 0) {
          o(☃ - 1);
        }
      }
      for (int ☃ = 0; ☃ < 5; ☃++)
      {
        zx ☃ = this.h[☃];
        zx ☃ = p(☃);
        if (!zx.b(☃, ☃))
        {
          ((le)this.o).s().a(this, new hn(F(), ☃, ☃));
          if (☃ != null) {
            this.c.a(☃.B());
          }
          if (☃ != null) {
            this.c.b(☃.B());
          }
          this.h[☃] = (☃ == null ? null : ☃.k());
        }
      }
      if (this.W % 20 == 0) {
        bs().g();
      }
    }
    m();
    
    double ☃ = this.s - this.p;
    double ☃ = this.u - this.r;
    
    float ☃ = (float)(☃ * ☃ + ☃ * ☃);
    
    float ☃ = this.aI;
    
    float ☃ = 0.0F;
    this.aR = this.aS;
    float ☃ = 0.0F;
    if (☃ > 0.0025000002F)
    {
      ☃ = 1.0F;
      ☃ = (float)Math.sqrt(☃) * 3.0F;
      ☃ = (float)ns.b(☃, ☃) * 180.0F / 3.1415927F - 90.0F;
    }
    if (this.az > 0.0F) {
      ☃ = this.y;
    }
    if (!this.C) {
      ☃ = 0.0F;
    }
    this.aS += (☃ - this.aS) * 0.3F;
    
    this.o.B.a("headTurn");
    
    ☃ = h(☃, ☃);
    
    this.o.B.b();
    
    this.o.B.a("rangeChecks");
    while (this.y - this.A < -180.0F) {
      this.A -= 360.0F;
    }
    while (this.y - this.A >= 180.0F) {
      this.A += 360.0F;
    }
    while (this.aI - this.aJ < -180.0F) {
      this.aJ -= 360.0F;
    }
    while (this.aI - this.aJ >= 180.0F) {
      this.aJ += 360.0F;
    }
    while (this.z - this.B < -180.0F) {
      this.B -= 360.0F;
    }
    while (this.z - this.B >= 180.0F) {
      this.B += 360.0F;
    }
    while (this.aK - this.aL < -180.0F) {
      this.aL -= 360.0F;
    }
    while (this.aK - this.aL >= 180.0F) {
      this.aL += 360.0F;
    }
    this.o.B.b();
    
    this.aT += ☃;
  }
  
  protected float h(float ☃, float ☃)
  {
    float ☃ = ns.g(☃ - this.aI);
    this.aI += ☃ * 0.3F;
    
    float ☃ = ns.g(this.y - this.aI);
    boolean ☃ = (☃ < -90.0F) || (☃ >= 90.0F);
    if (☃ < -75.0F) {
      ☃ = -75.0F;
    }
    if (☃ >= 75.0F) {
      ☃ = 75.0F;
    }
    this.aI = (this.y - ☃);
    if (☃ * ☃ > 2500.0F) {
      this.aI += ☃ * 0.2F;
    }
    if (☃) {
      ☃ *= -1.0F;
    }
    return ☃;
  }
  
  public void m()
  {
    if (this.bn > 0) {
      this.bn -= 1;
    }
    if (this.bc > 0)
    {
      double ☃ = this.s + (this.bd - this.s) / this.bc;
      double ☃ = this.t + (this.be - this.t) / this.bc;
      double ☃ = this.u + (this.bf - this.u) / this.bc;
      
      double ☃ = ns.g(this.bg - this.y);
      
      this.y = ((float)(this.y + ☃ / this.bc));
      this.z = ((float)(this.z + (this.bh - this.z) / this.bc));
      
      this.bc -= 1;
      b(☃, ☃, ☃);
      b(this.y, this.z);
    }
    else if (!bM())
    {
      this.v *= 0.98D;
      this.w *= 0.98D;
      this.x *= 0.98D;
    }
    if (Math.abs(this.v) < 0.005D) {
      this.v = 0.0D;
    }
    if (Math.abs(this.w) < 0.005D) {
      this.w = 0.0D;
    }
    if (Math.abs(this.x) < 0.005D) {
      this.x = 0.0D;
    }
    this.o.B.a("ai");
    if (bD())
    {
      this.aY = false;
      this.aZ = 0.0F;
      this.ba = 0.0F;
      this.bb = 0.0F;
    }
    else if (bM())
    {
      this.o.B.a("newAi");
      bK();
      this.o.B.b();
    }
    this.o.B.b();
    
    this.o.B.a("jump");
    if (this.aY)
    {
      if (V())
      {
        bG();
      }
      else if (ab())
      {
        bH();
      }
      else if ((this.C) && 
        (this.bn == 0))
      {
        bF();
        this.bn = 10;
      }
    }
    else {
      this.bn = 0;
    }
    this.o.B.b();
    
    this.o.B.a("travel");
    this.aZ *= 0.98F;
    this.ba *= 0.98F;
    this.bb *= 0.9F;
    
    g(this.aZ, this.ba);
    this.o.B.b();
    
    this.o.B.a("push");
    if (!this.o.D) {
      bL();
    }
    this.o.B.b();
  }
  
  protected void bK() {}
  
  protected void bL()
  {
    List<pk> ☃ = this.o.a(this, aR().b(0.20000000298023224D, 0.0D, 0.20000000298023224D), Predicates.and(po.d, new Predicate()
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
    if ((this.m != null) && (☃ == null))
    {
      if (!this.o.D) {
        q(this.m);
      }
      if (this.m != null) {
        this.m.l = null;
      }
      this.m = null;
      
      return;
    }
    super.a(☃);
  }
  
  public void ak()
  {
    super.ak();
    this.aR = this.aS;
    this.aS = 0.0F;
    this.O = 0.0F;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    this.bd = ☃;
    this.be = ☃;
    this.bf = ☃;
    this.bg = ☃;
    this.bh = ☃;
    
    this.bc = ☃;
  }
  
  public void i(boolean ☃)
  {
    this.aY = ☃;
  }
  
  public void a(pk ☃, int ☃)
  {
    if ((!☃.I) && (!this.o.D))
    {
      la ☃ = ((le)this.o).s();
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
    return this.o.a(new aui(this.s, this.t + aS(), this.u), new aui(☃.s, ☃.t + ☃.aS(), ☃.u)) == null;
  }
  
  public aui ap()
  {
    return d(1.0F);
  }
  
  public aui d(float ☃)
  {
    if (☃ == 1.0F) {
      return f(this.z, this.aK);
    }
    float ☃ = this.B + (this.z - this.B) * ☃;
    float ☃ = this.aL + (this.aK - this.aL) * ☃;
    return f(☃, ☃);
  }
  
  public float l(float ☃)
  {
    float ☃ = this.az - this.ay;
    if (☃ < 0.0F) {
      ☃ += 1.0F;
    }
    return this.ay + ☃ * ☃;
  }
  
  public boolean bM()
  {
    return !this.o.D;
  }
  
  public boolean ad()
  {
    return !this.I;
  }
  
  public boolean ae()
  {
    return !this.I;
  }
  
  protected void ac()
  {
    this.G = (this.V.nextDouble() >= a(vy.c).e());
  }
  
  public float aC()
  {
    return this.aK;
  }
  
  public void f(float ☃)
  {
    this.aK = ☃;
  }
  
  public void g(float ☃)
  {
    this.aI = ☃;
  }
  
  public float bN()
  {
    return this.bo;
  }
  
  public void m(float ☃)
  {
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    this.bo = ☃;
  }
  
  public auq bO()
  {
    return this.o.Z().h(aK().toString());
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
    this.i = true;
  }
}
