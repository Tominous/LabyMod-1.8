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
    b = this;
    c = ☃;
    
    cj ☃ = ☃.M();
    if ((!t.o()) && (☃.P().r() != adp.a.d))
    {
      int ☃ = Math.max(5, ☃.aw() - 6);
      int ☃ = ns.c(☃.af().b(☃.n(), ☃.p()));
      if (☃ < ☃) {
        ☃ = ☃;
      }
      if (☃ <= 1) {
        ☃ = 1;
      }
      ☃ = ☃.r(☃.a(V.nextInt(☃ * 2) - ☃, 0, V.nextInt(☃ * 2) - ☃));
    }
    b = ☃;
    bK = ☃.ap().a(this);
    S = 0.0F;
    
    a(☃, 0.0F, 0.0F);
    while ((!☃.a(this, aR()).isEmpty()) && (t < 255.0D)) {
      b(s, t + 1.0D, u);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("playerGameType", 99)) {
      if (MinecraftServer.N().ax()) {
        c.a(MinecraftServer.N().m());
      } else {
        c.a(adp.a.a(☃.f("playerGameType")));
      }
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("playerGameType", c.b().a());
  }
  
  public void a(int ☃)
  {
    super.a(☃);
    bP = -1;
  }
  
  public void b(int ☃)
  {
    super.b(☃);
    bP = -1;
  }
  
  public void g_()
  {
    bk.a(this);
  }
  
  public void h_()
  {
    super.h_();
    
    a.a(new gy(bs(), gy.a.a));
  }
  
  public void j()
  {
    super.j();
    
    a.a(new gy(bs(), gy.a.b));
  }
  
  public void t_()
  {
    c.a();
    
    bQ -= 1;
    if (Z > 0) {
      Z -= 1;
    }
    bk.b();
    if ((!o.D) && 
      (!bk.a(this)))
    {
      n();
      bk = bj;
    }
    while (!bJ.isEmpty())
    {
      int ☃ = Math.min(bJ.size(), Integer.MAX_VALUE);
      int[] ☃ = new int[☃];
      Iterator<Integer> ☃ = bJ.iterator();
      int ☃ = 0;
      while ((☃.hasNext()) && (☃ < ☃))
      {
        ☃[(☃++)] = ((Integer)☃.next()).intValue();
        ☃.remove();
      }
      a.a(new hb(☃));
    }
    if (!f.isEmpty())
    {
      List<amy> ☃ = Lists.newArrayList();
      Iterator<adg> ☃ = f.iterator();
      List<akw> ☃ = Lists.newArrayList();
      while ((☃.hasNext()) && (☃.size() < 10))
      {
        adg ☃ = (adg)☃.next();
        if (☃ != null)
        {
          if (o.e(new cj(a << 4, 0, b << 4)))
          {
            amy ☃ = o.a(a, b);
            if (☃.i())
            {
              ☃.add(☃);
              ☃.addAll(((le)o).a(a * 16, 0, b * 16, a * 16 + 16, 256, b * 16 + 16));
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
          a.a(new go((amy)☃.get(0), true, 65535));
        } else {
          a.a(new gp(☃));
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
        a(s, t, u, y, z);
        b.ap().d(this);
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
      for (int ☃ = 0; ☃ < bi.o_(); ☃++)
      {
        zx ☃ = bi.a(☃);
        if ((☃ != null) && 
          (☃.b().f()))
        {
          ff ☃ = ((yy)☃.b()).c(☃, o, this);
          if (☃ != null) {
            a.a(☃);
          }
        }
      }
      if ((bn() == bM) && (bN == bl.a()))
      {
        if ((bl.e() == 0.0F) == bO) {}
      }
      else
      {
        a.a(new hp(bn(), bl.a(), bl.e()));
        bM = bn();
        bN = bl.a();
        bO = (bl.e() == 0.0F);
      }
      if (bn() + bN() != bL)
      {
        bL = (bn() + bN());
        
        Collection<auk> ☃ = cp().a(auu.g);
        for (auk ☃ : ☃) {
          cp().c(e_(), ☃).a(Arrays.asList(new wn[] { this }));
        }
      }
      if (bC != bP)
      {
        bP = bC;
        a.a(new ho(bD, bC, bB));
      }
      if ((W % 20 * 5 == 0) && (!A().a(mr.L))) {
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
    ady ☃ = o.b(new cj(ns.c(s), 0, ns.c(u)));
    String ☃ = ah;
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
          if (ah.equals(☃)) {
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
    if (o.Q().b("showDeathMessages"))
    {
      auq ☃ = bO();
      if ((☃ == null) || (☃.j() == auq.a.a)) {
        b.ap().a(bs().b());
      } else if (☃.j() == auq.a.c) {
        b.ap().a(this, bs().b());
      } else if (☃.j() == auq.a.d) {
        b.ap().b(this, bs().b());
      }
    }
    if (!o.Q().b("keepInventory")) {
      bi.n();
    }
    Collection<auk> ☃ = o.Z().a(auu.d);
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
        b(e);
      }
      ☃.b(this, aW);
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
    boolean ☃ = (b.ae()) && (cr()) && ("fall".equals(p));
    if ((!☃) && (bQ > 0) && (☃ != ow.j)) {
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
        if (((c instanceof wn)) && (!a((wn)c))) {
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
    return b.aj();
  }
  
  public void c(int ☃)
  {
    if ((am == 1) && (☃ == 1))
    {
      b(mr.D);
      o.e(this);
      i = true;
      a.a(new gm(4, 0.0F));
    }
    else
    {
      if ((am == 0) && (☃ == 1))
      {
        b(mr.C);
        cj ☃ = b.a(☃).m();
        if (☃ != null) {
          a.a(☃.n(), ☃.o(), ☃.p(), 0.0F, 0.0F);
        }
        ☃ = 1;
      }
      else
      {
        b(mr.y);
      }
      b.ap().a(this, ☃);
      bP = -1;
      bM = -1.0F;
      bN = -1;
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
        a.a(☃);
      }
    }
  }
  
  public void a(pk ☃, int ☃)
  {
    super.a(☃, ☃);
    bk.b();
  }
  
  public wn.a a(cj ☃)
  {
    wn.a ☃ = super.a(☃);
    if (☃ == wn.a.a)
    {
      ff ☃ = new ha(this, ☃);
      u().s().a(this, ☃);
      a.a(s, t, u, y, z);
      a.a(☃);
    }
    return ☃;
  }
  
  public void a(boolean ☃, boolean ☃, boolean ☃)
  {
    if (bJ()) {
      u().s().b(this, new fq(this, 2));
    }
    super.a(☃, ☃, ☃);
    if (a != null) {
      a.a(s, t, u, y, z);
    }
  }
  
  public void a(pk ☃)
  {
    pk ☃ = m;
    super.a(☃);
    if (☃ != ☃)
    {
      a.a(new hl(0, this, m));
      a.a(s, t, u, y, z);
    }
  }
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃) {}
  
  public void a(double ☃, boolean ☃)
  {
    int ☃ = ns.c(s);
    int ☃ = ns.c(t - 0.20000000298023224D);
    int ☃ = ns.c(u);
    
    cj ☃ = new cj(☃, ☃, ☃);
    afh ☃ = o.p(☃).c();
    if (☃.t() == arm.a)
    {
      afh ☃ = o.p(☃.b()).c();
      if (((☃ instanceof agt)) || ((☃ instanceof akl)) || ((☃ instanceof agu)))
      {
        ☃ = ☃.b();
        ☃ = o.p(☃).c();
      }
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  public void a(aln ☃)
  {
    ☃.a(this);
    a.a(new gw(☃.v()));
  }
  
  private void cs()
  {
    bV = (bV % 100 + 1);
  }
  
  public void a(ol ☃)
  {
    cs();
    a.a(new gc(bV, ☃.k(), ☃.f_()));
    bk = ☃.a(bi, this);
    bk.d = bV;
    bk.a(this);
  }
  
  public void a(og ☃)
  {
    if (bk != bj) {
      n();
    }
    if ((☃ instanceof oo))
    {
      oo ☃ = (oo)☃;
      if ((☃.r_()) && (!a(☃.i())) && (!v()))
      {
        a.a(new fy(new fb("container.isLocked", new Object[] { ☃.f_() }), (byte)2));
        a.a(new gs("random.door_close", s, t, u, 1.0F, 1.0F));
        return;
      }
    }
    cs();
    if ((☃ instanceof ol))
    {
      a.a(new gc(bV, ((ol)☃).k(), ☃.f_(), ☃.o_()));
      bk = ((ol)☃).a(bi, this);
    }
    else
    {
      a.a(new gc(bV, "minecraft:container", ☃.f_(), ☃.o_()));
      bk = new xo(bi, ☃, this);
    }
    bk.d = bV;
    bk.a(this);
  }
  
  public void a(acy ☃)
  {
    cs();
    bk = new yb(bi, ☃, o);
    bk.d = bV;
    bk.a(this);
    og ☃ = ((yb)bk).e();
    
    eu ☃ = ☃.f_();
    a.a(new gc(bV, "minecraft:villager", ☃, ☃.o_()));
    
    ada ☃ = ☃.b_(this);
    if (☃ != null)
    {
      em ☃ = new em(Unpooled.buffer());
      
      ☃.writeInt(bV);
      ☃.a(☃);
      
      a.a(new gg("MC|TrList", ☃));
    }
  }
  
  public void a(tp ☃, og ☃)
  {
    if (bk != bj) {
      n();
    }
    cs();
    a.a(new gc(bV, "EntityHorse", ☃.f_(), ☃.o_(), ☃.F()));
    bk = new xx(bi, ☃, ☃, this);
    bk.d = bV;
    bk.a(this);
  }
  
  public void a(zx ☃)
  {
    zw ☃ = ☃.b();
    if (☃ == zy.bN) {
      a.a(new gg("MC|BOpen", new em(Unpooled.buffer())));
    }
  }
  
  public void a(xi ☃, int ☃, zx ☃)
  {
    if ((☃.a(☃) instanceof yf)) {
      return;
    }
    if (g) {
      return;
    }
    a.a(new gf(d, ☃, ☃));
  }
  
  public void a(xi ☃)
  {
    a(☃, ☃.a());
  }
  
  public void a(xi ☃, List<zx> ☃)
  {
    a.a(new gd(d, ☃));
    a.a(new gf(-1, -1, bi.p()));
  }
  
  public void a(xi ☃, int ☃, int ☃)
  {
    a.a(new ge(d, ☃, ☃));
  }
  
  public void a(xi ☃, og ☃)
  {
    for (int ☃ = 0; ☃ < ☃.g(); ☃++) {
      a.a(new ge(d, ☃, ☃.a_(☃)));
    }
  }
  
  public void n()
  {
    a.a(new gb(bk.d));
    p();
  }
  
  public void o()
  {
    if (g) {
      return;
    }
    a.a(new gf(-1, -1, bi.p()));
  }
  
  public void p()
  {
    bk.b(this);
    bk = bj;
  }
  
  public void a(float ☃, float ☃, boolean ☃, boolean ☃)
  {
    if (m != null)
    {
      if ((☃ >= -1.0F) && (☃ <= 1.0F)) {
        aZ = ☃;
      }
      if ((☃ >= -1.0F) && (☃ <= 1.0F)) {
        ba = ☃;
      }
      aY = ☃;
      c(☃);
    }
  }
  
  public void a(mw ☃, int ☃)
  {
    if (☃ == null) {
      return;
    }
    bK.b(this, ☃, ☃);
    for (auk ☃ : cp().a(☃.k())) {
      cp().c(e_(), ☃).a(☃);
    }
    if (bK.e()) {
      bK.a(this);
    }
  }
  
  public void a(mw ☃)
  {
    if (☃ == null) {
      return;
    }
    bK.a(this, ☃, 0);
    for (auk ☃ : cp().a(☃.k())) {
      cp().c(e_(), ☃).c(0);
    }
    if (bK.e()) {
      bK.a(this);
    }
  }
  
  public void q()
  {
    if (l != null) {
      l.a(this);
    }
    if (bw) {
      a(true, false, false);
    }
  }
  
  public void r()
  {
    bM = -1.0E8F;
  }
  
  public void b(eu ☃)
  {
    a.a(new fy(☃));
  }
  
  protected void s()
  {
    a.a(new gi(this, (byte)9));
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
    bP = -1;
    bM = -1.0F;
    bN = -1;
    bJ.addAll(bJ);
  }
  
  protected void a(pf ☃)
  {
    super.a(☃);
    a.a(new ib(F(), ☃));
  }
  
  protected void a(pf ☃, boolean ☃)
  {
    super.a(☃, ☃);
    a.a(new ib(F(), ☃));
  }
  
  protected void b(pf ☃)
  {
    super.b(☃);
    a.a(new hc(F(), ☃));
  }
  
  public void a(double ☃, double ☃, double ☃)
  {
    a.a(☃, ☃, ☃, y, z);
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
    if (a == null) {
      return;
    }
    a.a(new gx(bA));
    B();
  }
  
  public le u()
  {
    return (le)o;
  }
  
  public void a(adp.a ☃)
  {
    c.a(☃);
    a.a(new gm(3, ☃.a()));
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
    return c.b() == adp.a.e;
  }
  
  public void a(eu ☃)
  {
    a.a(new fy(☃));
  }
  
  public boolean a(int ☃, String ☃)
  {
    if (("seed".equals(☃)) && (!b.ae())) {
      return true;
    }
    if (("tell".equals(☃)) || ("help".equals(☃)) || ("me".equals(☃)) || ("trigger".equals(☃))) {
      return true;
    }
    if (b.ap().h(cd()))
    {
      lz ☃ = (lz)b.ap().m().b(cd());
      if (☃ != null) {
        return ☃.a() >= ☃;
      }
      return b.p() >= ☃;
    }
    return false;
  }
  
  public String w()
  {
    String ☃ = a.a.b().toString();
    ☃ = ☃.substring(☃.indexOf("/") + 1);
    ☃ = ☃.substring(0, ☃.indexOf(":"));
    return ☃;
  }
  
  public void a(ih ☃)
  {
    bI = ☃.a();
    
    bR = ☃.c();
    bS = ☃.d();
    
    H().b(10, Byte.valueOf((byte)☃.e()));
  }
  
  public wn.b y()
  {
    return bR;
  }
  
  public void a(String ☃, String ☃)
  {
    a.a(new hd(☃, ☃));
  }
  
  public cj c()
  {
    return new cj(s, t + 0.5D, u);
  }
  
  public void z()
  {
    bT = MinecraftServer.az();
  }
  
  public mv A()
  {
    return bK;
  }
  
  public void d(pk ☃)
  {
    if ((☃ instanceof wn)) {
      a.a(new hb(new int[] { ☃.F() }));
    } else {
      bJ.add(Integer.valueOf(☃.F()));
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
    return bU == null ? this : bU;
  }
  
  public void e(pk ☃)
  {
    pk ☃ = C();
    bU = (☃ == null ? this : ☃);
    if (☃ != bU)
    {
      a.a(new hh(bU));
      a(bU.s, bU.t, bU.u);
    }
  }
  
  public void f(pk ☃)
  {
    if (c.b() == adp.a.e) {
      e(☃);
    } else {
      super.f(☃);
    }
  }
  
  public long D()
  {
    return bT;
  }
  
  public eu E()
  {
    return null;
  }
}
