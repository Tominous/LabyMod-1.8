import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lf
  extends wn
  implements xn
{
  private static final Logger bH = ;
  private String bI = "en_US";
  public lm a;
  public final MinecraftServer b;
  public final lg c;
  public double d;
  public double e;
  public final List<adg> f = Lists.newLinkedList();
  private final List<Integer> bJ = Lists.newLinkedList();
  private final mv bK;
  private float bL = Float.MIN_VALUE;
  private float bM = -1.0E8F;
  private int bN = -99999999;
  private boolean bO = true;
  private int bP = -99999999;
  private int bQ = 60;
  private wn.b bR;
  private boolean bS = true;
  private long bT = System.currentTimeMillis();
  private pk bU = null;
  private int bV;
  public boolean g;
  public int h;
  public boolean i;
  
  public lf(MinecraftServer ☃, le ☃, GameProfile ☃, lg ☃)
  {
    super(☃, ☃);
    ☃.b = this;
    this.c = ☃;
    
    cj ☃ = ☃.M();
    if ((!☃.t.o()) && (☃.P().r() != adp.a.d))
    {
      int ☃ = Math.max(5, ☃.aw() - 6);
      int ☃ = ns.c(☃.af().b(☃.n(), ☃.p()));
      if (☃ < ☃) {
        ☃ = ☃;
      }
      if (☃ <= 1) {
        ☃ = 1;
      }
      ☃ = ☃.r(☃.a(this.V.nextInt(☃ * 2) - ☃, 0, this.V.nextInt(☃ * 2) - ☃));
    }
    this.b = ☃;
    this.bK = ☃.ap().a(this);
    this.S = 0.0F;
    
    a(☃, 0.0F, 0.0F);
    while ((!☃.a(this, aR()).isEmpty()) && (this.t < 255.0D)) {
      b(this.s, this.t + 1.0D, this.u);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("playerGameType", 99)) {
      if (MinecraftServer.N().ax()) {
        this.c.a(MinecraftServer.N().m());
      } else {
        this.c.a(adp.a.a(☃.f("playerGameType")));
      }
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("playerGameType", this.c.b().a());
  }
  
  public void a(int ☃)
  {
    super.a(☃);
    this.bP = -1;
  }
  
  public void b(int ☃)
  {
    super.b(☃);
    this.bP = -1;
  }
  
  public void g_()
  {
    this.bk.a(this);
  }
  
  public void h_()
  {
    super.h_();
    
    this.a.a(new gy(bs(), gy.a.a));
  }
  
  public void j()
  {
    super.j();
    
    this.a.a(new gy(bs(), gy.a.b));
  }
  
  public void t_()
  {
    this.c.a();
    
    this.bQ -= 1;
    if (this.Z > 0) {
      this.Z -= 1;
    }
    this.bk.b();
    if ((!this.o.D) && 
      (!this.bk.a(this)))
    {
      n();
      this.bk = this.bj;
    }
    while (!this.bJ.isEmpty())
    {
      int ☃ = Math.min(this.bJ.size(), Integer.MAX_VALUE);
      int[] ☃ = new int[☃];
      Iterator<Integer> ☃ = this.bJ.iterator();
      int ☃ = 0;
      while ((☃.hasNext()) && (☃ < ☃))
      {
        ☃[(☃++)] = ((Integer)☃.next()).intValue();
        ☃.remove();
      }
      this.a.a(new hb(☃));
    }
    if (!this.f.isEmpty())
    {
      List<amy> ☃ = Lists.newArrayList();
      Iterator<adg> ☃ = this.f.iterator();
      List<akw> ☃ = Lists.newArrayList();
      while ((☃.hasNext()) && (☃.size() < 10))
      {
        adg ☃ = (adg)☃.next();
        if (☃ != null)
        {
          if (this.o.e(new cj(☃.a << 4, 0, ☃.b << 4)))
          {
            amy ☃ = this.o.a(☃.a, ☃.b);
            if (☃.i())
            {
              ☃.add(☃);
              ☃.addAll(((le)this.o).a(☃.a * 16, 0, ☃.b * 16, ☃.a * 16 + 16, 256, ☃.b * 16 + 16));
              ☃.remove();
            }
          }
        }
        else {
          ☃.remove();
        }
      }
      if (!☃.isEmpty())
      {
        if (☃.size() == 1) {
          this.a.a(new go((amy)☃.get(0), true, 65535));
        } else {
          this.a.a(new gp(☃));
        }
        for (akw ☃ : ☃) {
          a(☃);
        }
        for (amy ☃ : ☃) {
          u().s().a(this, ☃);
        }
      }
    }
    pk ☃ = C();
    if (☃ != this) {
      if (!☃.ai())
      {
        e(this);
      }
      else
      {
        a(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
        this.b.ap().d(this);
        if (av()) {
          e(this);
        }
      }
    }
  }
  
  public void l()
  {
    try
    {
      super.t_();
      for (int ☃ = 0; ☃ < this.bi.o_(); ☃++)
      {
        zx ☃ = this.bi.a(☃);
        if ((☃ != null) && 
          (☃.b().f()))
        {
          ff ☃ = ((yy)☃.b()).c(☃, this.o, this);
          if (☃ != null) {
            this.a.a(☃);
          }
        }
      }
      if ((bn() == this.bM) && (this.bN == this.bl.a()))
      {
        if ((this.bl.e() == 0.0F) == this.bO) {}
      }
      else
      {
        this.a.a(new hp(bn(), this.bl.a(), this.bl.e()));
        this.bM = bn();
        this.bN = this.bl.a();
        this.bO = (this.bl.e() == 0.0F);
      }
      if (bn() + bN() != this.bL)
      {
        this.bL = (bn() + bN());
        
        Collection<auk> ☃ = cp().a(auu.g);
        for (auk ☃ : ☃) {
          cp().c(e_(), ☃).a(Arrays.asList(new wn[] { this }));
        }
      }
      if (this.bC != this.bP)
      {
        this.bP = this.bC;
        this.a.a(new ho(this.bD, this.bC, this.bB));
      }
      if ((this.W % 20 * 5 == 0) && (!A().a(mr.L))) {
        i_();
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Ticking player");
      c ☃ = ☃.a("Player being ticked");
      
      a(☃);
      
      throw new e(☃);
    }
  }
  
  protected void i_()
  {
    ady ☃ = this.o.b(new cj(ns.c(this.s), 0, ns.c(this.u)));
    String ☃ = ☃.ah;
    nc ☃ = (nc)A().b(mr.L);
    if (☃ == null) {
      ☃ = (nc)A().a(mr.L, new nc());
    }
    ☃.add(☃);
    if ((A().b(mr.L)) && (☃.size() >= ady.n.size()))
    {
      Set<ady> ☃ = Sets.newHashSet(ady.n);
      for (String ☃ : ☃)
      {
        Iterator<ady> ☃ = ☃.iterator();
        while (☃.hasNext())
        {
          ady ☃ = (ady)☃.next();
          if (☃.ah.equals(☃)) {
            ☃.remove();
          }
        }
        if (☃.isEmpty()) {
          break;
        }
      }
      if (☃.isEmpty()) {
        b(mr.L);
      }
    }
  }
  
  public void a(ow ☃)
  {
    if (this.o.Q().b("showDeathMessages"))
    {
      auq ☃ = bO();
      if ((☃ == null) || (☃.j() == auq.a.a)) {
        this.b.ap().a(bs().b());
      } else if (☃.j() == auq.a.c) {
        this.b.ap().a(this, bs().b());
      } else if (☃.j() == auq.a.d) {
        this.b.ap().b(this, bs().b());
      }
    }
    if (!this.o.Q().b("keepInventory")) {
      this.bi.n();
    }
    Collection<auk> ☃ = this.o.Z().a(auu.d);
    for (auk ☃ : ☃)
    {
      aum ☃ = cp().c(e_(), ☃);
      ☃.a();
    }
    pr ☃ = bt();
    if (☃ != null)
    {
      pm.a ☃ = (pm.a)pm.a.get(Integer.valueOf(pm.a(☃)));
      if (☃ != null) {
        b(☃.e);
      }
      ☃.b(this, this.aW);
    }
    b(na.y);
    a(na.h);
    
    bs().g();
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    boolean ☃ = (this.b.ae()) && (cr()) && ("fall".equals(☃.p));
    if ((!☃) && (this.bQ > 0) && (☃ != ow.j)) {
      return false;
    }
    if ((☃ instanceof ox))
    {
      pk ☃ = ☃.j();
      if (((☃ instanceof wn)) && (!a((wn)☃))) {
        return false;
      }
      if ((☃ instanceof wq))
      {
        wq ☃ = (wq)☃;
        if (((☃.c instanceof wn)) && (!a((wn)☃.c))) {
          return false;
        }
      }
    }
    return super.a(☃, ☃);
  }
  
  public boolean a(wn ☃)
  {
    if (!cr()) {
      return false;
    }
    return super.a(☃);
  }
  
  private boolean cr()
  {
    return this.b.aj();
  }
  
  public void c(int ☃)
  {
    if ((this.am == 1) && (☃ == 1))
    {
      b(mr.D);
      this.o.e(this);
      this.i = true;
      this.a.a(new gm(4, 0.0F));
    }
    else
    {
      if ((this.am == 0) && (☃ == 1))
      {
        b(mr.C);
        cj ☃ = this.b.a(☃).m();
        if (☃ != null) {
          this.a.a(☃.n(), ☃.o(), ☃.p(), 0.0F, 0.0F);
        }
        ☃ = 1;
      }
      else
      {
        b(mr.y);
      }
      this.b.ap().a(this, ☃);
      this.bP = -1;
      this.bM = -1.0F;
      this.bN = -1;
    }
  }
  
  public boolean a(lf ☃)
  {
    if (☃.v()) {
      return C() == this;
    }
    if (v()) {
      return false;
    }
    return super.a(☃);
  }
  
  private void a(akw ☃)
  {
    if (☃ != null)
    {
      ff ☃ = ☃.y_();
      if (☃ != null) {
        this.a.a(☃);
      }
    }
  }
  
  public void a(pk ☃, int ☃)
  {
    super.a(☃, ☃);
    this.bk.b();
  }
  
  public wn.a a(cj ☃)
  {
    wn.a ☃ = super.a(☃);
    if (☃ == wn.a.a)
    {
      ff ☃ = new ha(this, ☃);
      u().s().a(this, ☃);
      this.a.a(this.s, this.t, this.u, this.y, this.z);
      this.a.a(☃);
    }
    return ☃;
  }
  
  public void a(boolean ☃, boolean ☃, boolean ☃)
  {
    if (bJ()) {
      u().s().b(this, new fq(this, 2));
    }
    super.a(☃, ☃, ☃);
    if (this.a != null) {
      this.a.a(this.s, this.t, this.u, this.y, this.z);
    }
  }
  
  public void a(pk ☃)
  {
    pk ☃ = this.m;
    super.a(☃);
    if (☃ != ☃)
    {
      this.a.a(new hl(0, this, this.m));
      this.a.a(this.s, this.t, this.u, this.y, this.z);
    }
  }
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃) {}
  
  public void a(double ☃, boolean ☃)
  {
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(this.t - 0.20000000298023224D);
    int ☃ = ns.c(this.u);
    
    cj ☃ = new cj(☃, ☃, ☃);
    afh ☃ = this.o.p(☃).c();
    if (☃.t() == arm.a)
    {
      afh ☃ = this.o.p(☃.b()).c();
      if (((☃ instanceof agt)) || ((☃ instanceof akl)) || ((☃ instanceof agu)))
      {
        ☃ = ☃.b();
        ☃ = this.o.p(☃).c();
      }
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  public void a(aln ☃)
  {
    ☃.a(this);
    this.a.a(new gw(☃.v()));
  }
  
  private void cs()
  {
    this.bV = (this.bV % 100 + 1);
  }
  
  public void a(ol ☃)
  {
    cs();
    this.a.a(new gc(this.bV, ☃.k(), ☃.f_()));
    this.bk = ☃.a(this.bi, this);
    this.bk.d = this.bV;
    this.bk.a(this);
  }
  
  public void a(og ☃)
  {
    if (this.bk != this.bj) {
      n();
    }
    if ((☃ instanceof oo))
    {
      oo ☃ = (oo)☃;
      if ((☃.r_()) && (!a(☃.i())) && (!v()))
      {
        this.a.a(new fy(new fb("container.isLocked", new Object[] { ☃.f_() }), (byte)2));
        this.a.a(new gs("random.door_close", this.s, this.t, this.u, 1.0F, 1.0F));
        return;
      }
    }
    cs();
    if ((☃ instanceof ol))
    {
      this.a.a(new gc(this.bV, ((ol)☃).k(), ☃.f_(), ☃.o_()));
      this.bk = ((ol)☃).a(this.bi, this);
    }
    else
    {
      this.a.a(new gc(this.bV, "minecraft:container", ☃.f_(), ☃.o_()));
      this.bk = new xo(this.bi, ☃, this);
    }
    this.bk.d = this.bV;
    this.bk.a(this);
  }
  
  public void a(acy ☃)
  {
    cs();
    this.bk = new yb(this.bi, ☃, this.o);
    this.bk.d = this.bV;
    this.bk.a(this);
    og ☃ = ((yb)this.bk).e();
    
    eu ☃ = ☃.f_();
    this.a.a(new gc(this.bV, "minecraft:villager", ☃, ☃.o_()));
    
    ada ☃ = ☃.b_(this);
    if (☃ != null)
    {
      em ☃ = new em(Unpooled.buffer());
      
      ☃.writeInt(this.bV);
      ☃.a(☃);
      
      this.a.a(new gg("MC|TrList", ☃));
    }
  }
  
  public void a(tp ☃, og ☃)
  {
    if (this.bk != this.bj) {
      n();
    }
    cs();
    this.a.a(new gc(this.bV, "EntityHorse", ☃.f_(), ☃.o_(), ☃.F()));
    this.bk = new xx(this.bi, ☃, ☃, this);
    this.bk.d = this.bV;
    this.bk.a(this);
  }
  
  public void a(zx ☃)
  {
    zw ☃ = ☃.b();
    if (☃ == zy.bN) {
      this.a.a(new gg("MC|BOpen", new em(Unpooled.buffer())));
    }
  }
  
  public void a(xi ☃, int ☃, zx ☃)
  {
    if ((☃.a(☃) instanceof yf)) {
      return;
    }
    if (this.g) {
      return;
    }
    this.a.a(new gf(☃.d, ☃, ☃));
  }
  
  public void a(xi ☃)
  {
    a(☃, ☃.a());
  }
  
  public void a(xi ☃, List<zx> ☃)
  {
    this.a.a(new gd(☃.d, ☃));
    this.a.a(new gf(-1, -1, this.bi.p()));
  }
  
  public void a(xi ☃, int ☃, int ☃)
  {
    this.a.a(new ge(☃.d, ☃, ☃));
  }
  
  public void a(xi ☃, og ☃)
  {
    for (int ☃ = 0; ☃ < ☃.g(); ☃++) {
      this.a.a(new ge(☃.d, ☃, ☃.a_(☃)));
    }
  }
  
  public void n()
  {
    this.a.a(new gb(this.bk.d));
    p();
  }
  
  public void o()
  {
    if (this.g) {
      return;
    }
    this.a.a(new gf(-1, -1, this.bi.p()));
  }
  
  public void p()
  {
    this.bk.b(this);
    this.bk = this.bj;
  }
  
  public void a(float ☃, float ☃, boolean ☃, boolean ☃)
  {
    if (this.m != null)
    {
      if ((☃ >= -1.0F) && (☃ <= 1.0F)) {
        this.aZ = ☃;
      }
      if ((☃ >= -1.0F) && (☃ <= 1.0F)) {
        this.ba = ☃;
      }
      this.aY = ☃;
      c(☃);
    }
  }
  
  public void a(mw ☃, int ☃)
  {
    if (☃ == null) {
      return;
    }
    this.bK.b(this, ☃, ☃);
    for (auk ☃ : cp().a(☃.k())) {
      cp().c(e_(), ☃).a(☃);
    }
    if (this.bK.e()) {
      this.bK.a(this);
    }
  }
  
  public void a(mw ☃)
  {
    if (☃ == null) {
      return;
    }
    this.bK.a(this, ☃, 0);
    for (auk ☃ : cp().a(☃.k())) {
      cp().c(e_(), ☃).c(0);
    }
    if (this.bK.e()) {
      this.bK.a(this);
    }
  }
  
  public void q()
  {
    if (this.l != null) {
      this.l.a(this);
    }
    if (this.bw) {
      a(true, false, false);
    }
  }
  
  public void r()
  {
    this.bM = -1.0E8F;
  }
  
  public void b(eu ☃)
  {
    this.a.a(new fy(☃));
  }
  
  protected void s()
  {
    this.a.a(new gi(this, (byte)9));
    super.s();
  }
  
  public void a(zx ☃, int ☃)
  {
    super.a(☃, ☃);
    if ((☃ != null) && (☃.b() != null) && (☃.b().e(☃) == aba.b)) {
      u().s().b(this, new fq(this, 3));
    }
  }
  
  public void a(wn ☃, boolean ☃)
  {
    super.a(☃, ☃);
    this.bP = -1;
    this.bM = -1.0F;
    this.bN = -1;
    this.bJ.addAll(((lf)☃).bJ);
  }
  
  protected void a(pf ☃)
  {
    super.a(☃);
    this.a.a(new ib(F(), ☃));
  }
  
  protected void a(pf ☃, boolean ☃)
  {
    super.a(☃, ☃);
    this.a.a(new ib(F(), ☃));
  }
  
  protected void b(pf ☃)
  {
    super.b(☃);
    this.a.a(new hc(F(), ☃));
  }
  
  public void a(double ☃, double ☃, double ☃)
  {
    this.a.a(☃, ☃, ☃, this.y, this.z);
  }
  
  public void b(pk ☃)
  {
    u().s().b(this, new fq(☃, 4));
  }
  
  public void c(pk ☃)
  {
    u().s().b(this, new fq(☃, 5));
  }
  
  public void t()
  {
    if (this.a == null) {
      return;
    }
    this.a.a(new gx(this.bA));
    B();
  }
  
  public le u()
  {
    return (le)this.o;
  }
  
  public void a(adp.a ☃)
  {
    this.c.a(☃);
    this.a.a(new gm(3, ☃.a()));
    if (☃ == adp.a.e) {
      a(null);
    } else {
      e(this);
    }
    t();
    bP();
  }
  
  public boolean v()
  {
    return this.c.b() == adp.a.e;
  }
  
  public void a(eu ☃)
  {
    this.a.a(new fy(☃));
  }
  
  public boolean a(int ☃, String ☃)
  {
    if (("seed".equals(☃)) && (!this.b.ae())) {
      return true;
    }
    if (("tell".equals(☃)) || ("help".equals(☃)) || ("me".equals(☃)) || ("trigger".equals(☃))) {
      return true;
    }
    if (this.b.ap().h(cd()))
    {
      lz ☃ = (lz)this.b.ap().m().b(cd());
      if (☃ != null) {
        return ☃.a() >= ☃;
      }
      return this.b.p() >= ☃;
    }
    return false;
  }
  
  public String w()
  {
    String ☃ = this.a.a.b().toString();
    ☃ = ☃.substring(☃.indexOf("/") + 1);
    ☃ = ☃.substring(0, ☃.indexOf(":"));
    return ☃;
  }
  
  public void a(ih ☃)
  {
    this.bI = ☃.a();
    
    this.bR = ☃.c();
    this.bS = ☃.d();
    
    H().b(10, Byte.valueOf((byte)☃.e()));
  }
  
  public wn.b y()
  {
    return this.bR;
  }
  
  public void a(String ☃, String ☃)
  {
    this.a.a(new hd(☃, ☃));
  }
  
  public cj c()
  {
    return new cj(this.s, this.t + 0.5D, this.u);
  }
  
  public void z()
  {
    this.bT = MinecraftServer.az();
  }
  
  public mv A()
  {
    return this.bK;
  }
  
  public void d(pk ☃)
  {
    if ((☃ instanceof wn)) {
      this.a.a(new hb(new int[] { ☃.F() }));
    } else {
      this.bJ.add(Integer.valueOf(☃.F()));
    }
  }
  
  protected void B()
  {
    if (v())
    {
      bj();
      e(true);
    }
    else
    {
      super.B();
    }
    u().s().a(this);
  }
  
  public pk C()
  {
    return this.bU == null ? this : this.bU;
  }
  
  public void e(pk ☃)
  {
    pk ☃ = C();
    this.bU = (☃ == null ? this : ☃);
    if (☃ != this.bU)
    {
      this.a.a(new hh(this.bU));
      a(this.bU.s, this.bU.t, this.bU.u);
    }
  }
  
  public void f(pk ☃)
  {
    if (this.c.b() == adp.a.e) {
      e(☃);
    } else {
      super.f(☃);
    }
  }
  
  public long D()
  {
    return this.bT;
  }
  
  public eu E()
  {
    return null;
  }
}
