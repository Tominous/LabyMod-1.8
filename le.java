import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class le
  extends adm
  implements od
{
  private static final Logger a = ;
  private final MinecraftServer I;
  private final la J;
  private final lc K;
  private final Set<adw> L = Sets.newHashSet();
  private final TreeSet<adw> M = new TreeSet();
  private final Map<UUID, pk> N = Maps.newHashMap();
  public ld b;
  public boolean c;
  private boolean O;
  private int P;
  private final adu Q;
  private final adt R = new adt();
  protected final tg d = new tg(this);
  private le.a[] S = { new le.a(null), new le.a(null) };
  private int T;
  private static final List<ob> U = Lists.newArrayList(new ob[] { new ob(zy.y, 0, 1, 3, 10), new ob(zw.a(afi.f), 0, 1, 3, 10), new ob(zw.a(afi.r), 0, 1, 3, 10), new ob(zy.t, 0, 1, 1, 3), new ob(zy.p, 0, 1, 1, 5), new ob(zy.s, 0, 1, 1, 3), new ob(zy.o, 0, 1, 1, 5), new ob(zy.e, 0, 2, 3, 5), new ob(zy.P, 0, 2, 3, 3), new ob(zw.a(afi.s), 0, 1, 3, 10) });
  
  public le(MinecraftServer ☃, atp ☃, ato ☃, int ☃, nt ☃)
  {
    super(☃, ☃, anm.a(☃), ☃, false);
    I = ☃;
    J = new la(this);
    K = new lc(this);
    
    t.a(this);
    v = k();
    
    Q = new adu(this);
    
    B();
    C();
    
    af().a(☃.aI());
  }
  
  public adm b()
  {
    z = new aua(w);
    
    String ☃ = th.a(t);
    th ☃ = (th)z.a(th.class, ☃);
    if (☃ == null)
    {
      A = new th(this);
      z.a(☃, A);
    }
    else
    {
      A = ☃;
      A.a(this);
    }
    C = new kk(I);
    
    aup ☃ = (aup)z.a(aup.class, "scoreboard");
    if (☃ == null)
    {
      ☃ = new aup();
      z.a("scoreboard", ☃);
    }
    ☃.a(C);
    ((kk)C).a(☃);
    
    af().c(x.C(), x.D());
    af().c(x.I());
    af().b(x.H());
    af().c(x.J());
    af().b(x.K());
    if (x.F() > 0L) {
      af().a(x.E(), x.G(), x.F());
    } else {
      af().a(x.E());
    }
    return this;
  }
  
  public void c()
  {
    super.c();
    if ((P().t()) && (aa() != oj.d)) {
      P().a(oj.d);
    }
    t.m().b();
    if (f())
    {
      if (Q().b("doDaylightCycle"))
      {
        long ☃ = x.g() + 24000L;
        x.c(☃ - ☃ % 24000L);
      }
      e();
    }
    B.a("mobSpawner");
    if ((Q().b("doMobSpawning")) && (x.u() != adr.g)) {
      R.a(this, F, G, x.f() % 400L == 0L);
    }
    B.c("chunkSource");
    v.d();
    int ☃ = a(1.0F);
    if (☃ != ab()) {
      c(☃);
    }
    x.b(x.f() + 1L);
    if (Q().b("doDaylightCycle")) {
      x.c(x.g() + 1L);
    }
    B.c("tickPending");
    a(false);
    
    B.c("tickBlocks");
    h();
    
    B.c("chunkMap");
    K.b();
    
    B.c("village");
    A.a();
    d.a();
    
    B.c("portalForcer");
    Q.a(K());
    
    B.b();
    
    ak();
  }
  
  public ady.c a(pt ☃, cj ☃)
  {
    List<ady.c> ☃ = N().a(☃, ☃);
    if ((☃ == null) || (☃.isEmpty())) {
      return null;
    }
    return (ady.c)oa.a(s, ☃);
  }
  
  public boolean a(pt ☃, ady.c ☃, cj ☃)
  {
    List<ady.c> ☃ = N().a(☃, ☃);
    if ((☃ == null) || (☃.isEmpty())) {
      return false;
    }
    return ☃.contains(☃);
  }
  
  public void d()
  {
    O = false;
    if (!j.isEmpty())
    {
      int ☃ = 0;
      int ☃ = 0;
      for (wn ☃ : j) {
        if (☃.v()) {
          ☃++;
        } else if (☃.bJ()) {
          ☃++;
        }
      }
      O = ((☃ > 0) && (☃ >= j.size() - ☃));
    }
  }
  
  protected void e()
  {
    O = false;
    for (wn ☃ : j) {
      if (☃.bJ()) {
        ☃.a(false, false, true);
      }
    }
    ag();
  }
  
  private void ag()
  {
    x.g(0);
    x.b(false);
    x.f(0);
    x.a(false);
  }
  
  public boolean f()
  {
    if ((O) && (!D))
    {
      for (wn ☃ : j) {
        if ((☃.v()) || (!☃.cf())) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public void g()
  {
    if (x.d() <= 0) {
      x.b(F() + 1);
    }
    int ☃ = x.c();
    int ☃ = x.e();
    int ☃ = 0;
    while (c(new cj(☃, 0, ☃)).t() == arm.a)
    {
      ☃ += s.nextInt(8) - s.nextInt(8);
      ☃ += s.nextInt(8) - s.nextInt(8);
      ☃++;
      if (☃ == 10000) {
        break;
      }
    }
    x.a(☃);
    x.c(☃);
  }
  
  protected void h()
  {
    super.h();
    if (x.u() == adr.g)
    {
      for (adg ☃ : E) {
        a(a, b).b(false);
      }
      return;
    }
    int ☃ = 0;
    int ☃ = 0;
    for (adg ☃ : E)
    {
      int ☃ = a * 16;
      int ☃ = b * 16;
      
      B.a("getChunk");
      amy ☃ = a(a, b);
      
      a(☃, ☃, ☃);
      
      B.c("tickChunk");
      ☃.b(false);
      
      B.c("thunder");
      if ((s.nextInt(100000) == 0) && (S()) && (R()))
      {
        m = (m * 3 + 1013904223);
        int ☃ = m >> 2;
        
        cj ☃ = a(new cj(☃ + (☃ & 0xF), 0, ☃ + (☃ >> 8 & 0xF)));
        if (C(☃)) {
          c(new uv(this, ☃.n(), ☃.o(), ☃.p()));
        }
      }
      B.c("iceandsnow");
      if (s.nextInt(16) == 0)
      {
        m = (m * 3 + 1013904223);
        int ☃ = m >> 2;
        
        cj ☃ = q(new cj(☃ + (☃ & 0xF), 0, ☃ + (☃ >> 8 & 0xF)));
        cj ☃ = ☃.b();
        if (w(☃)) {
          a(☃, afi.aI.Q());
        }
        if ((S()) && (f(☃, true))) {
          a(☃, afi.aH.Q());
        }
        if ((S()) && 
          (b(☃).e())) {
          p(☃).c().k(this, ☃);
        }
      }
      B.c("tickBlocks");
      int ☃ = Q().c("randomTickSpeed");
      if (☃ > 0) {
        for (amz ☃ : ☃.h()) {
          if ((☃ != null) && (☃.b())) {
            for (int ☃ = 0; ☃ < ☃; ☃++)
            {
              m = (m * 3 + 1013904223);
              int ☃ = m >> 2;
              int ☃ = ☃ & 0xF;
              int ☃ = ☃ >> 8 & 0xF;
              int ☃ = ☃ >> 16 & 0xF;
              
              ☃++;
              alz ☃ = ☃.a(☃, ☃, ☃);
              afh ☃ = ☃.c();
              if (☃.y())
              {
                ☃++;
                ☃.a(this, new cj(☃ + ☃, ☃ + ☃.d(), ☃ + ☃), ☃, s);
              }
            }
          }
        }
      }
      B.b();
    }
  }
  
  protected cj a(cj ☃)
  {
    cj ☃ = q(☃);
    aug ☃ = new aug(☃, new cj(☃.n(), U(), ☃.p())).b(3.0D, 3.0D, 3.0D);
    
    List<pr> ☃ = a(pr.class, ☃, new Predicate()
    {
      public boolean a(pr ☃)
      {
        return (☃ != null) && (☃.ai()) && (i(☃.c()));
      }
    });
    if (!☃.isEmpty()) {
      return ((pr)☃.get(s.nextInt(☃.size()))).c();
    }
    return ☃;
  }
  
  public boolean a(cj ☃, afh ☃)
  {
    adw ☃ = new adw(☃, ☃);
    return V.contains(☃);
  }
  
  public void a(cj ☃, afh ☃, int ☃)
  {
    a(☃, ☃, ☃, 0);
  }
  
  public void a(cj ☃, afh ☃, int ☃, int ☃)
  {
    adw ☃ = new adw(☃, ☃);
    int ☃ = 0;
    if ((e) && (☃.t() != arm.a))
    {
      if (☃.N())
      {
        ☃ = 8;
        if (a(a.a(-☃, -☃, -☃), a.a(☃, ☃, ☃)))
        {
          alz ☃ = p(a);
          if ((☃.c().t() != arm.a) && (☃.c() == ☃.a())) {
            ☃.c().b(this, a, ☃, s);
          }
        }
        return;
      }
      ☃ = 1;
    }
    if (a(☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃)))
    {
      if (☃.t() != arm.a)
      {
        ☃.a(☃ + x.f());
        ☃.a(☃);
      }
      if (!L.contains(☃))
      {
        L.add(☃);
        M.add(☃);
      }
    }
  }
  
  public void b(cj ☃, afh ☃, int ☃, int ☃)
  {
    adw ☃ = new adw(☃, ☃);
    ☃.a(☃);
    if (☃.t() != arm.a) {
      ☃.a(☃ + x.f());
    }
    if (!L.contains(☃))
    {
      L.add(☃);
      M.add(☃);
    }
  }
  
  public void i()
  {
    if (j.isEmpty())
    {
      if (P++ < 1200) {}
    }
    else {
      j();
    }
    super.i();
  }
  
  public void j()
  {
    P = 0;
  }
  
  private List<adw> V = Lists.newArrayList();
  
  public boolean a(boolean ☃)
  {
    if (x.u() == adr.g) {
      return false;
    }
    int ☃ = M.size();
    if (☃ != L.size()) {
      throw new IllegalStateException("TickNextTick list out of synch");
    }
    if (☃ > 1000) {
      ☃ = 1000;
    }
    B.a("cleaning");
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      adw ☃ = (adw)M.first();
      if ((!☃) && (b > x.f())) {
        break;
      }
      M.remove(☃);
      L.remove(☃);
      V.add(☃);
    }
    B.b();
    
    B.a("ticking");
    Iterator<adw> ☃ = V.iterator();
    while (☃.hasNext())
    {
      adw ☃ = (adw)☃.next();
      ☃.remove();
      
      int ☃ = 0;
      if (a(a.a(-☃, -☃, -☃), a.a(☃, ☃, ☃)))
      {
        alz ☃ = p(a);
        if ((☃.c().t() != arm.a) && (afh.a(☃.c(), ☃.a()))) {
          try
          {
            ☃.c().b(this, a, ☃, s);
          }
          catch (Throwable ☃)
          {
            b ☃ = b.a(☃, "Exception while ticking a block");
            c ☃ = ☃.a("Block being ticked");
            c.a(☃, a, ☃);
            throw new e(☃);
          }
        }
      }
      else
      {
        a(a, ☃.a(), 0);
      }
    }
    B.b();
    
    V.clear();
    
    return !M.isEmpty();
  }
  
  public List<adw> a(amy ☃, boolean ☃)
  {
    adg ☃ = ☃.j();
    int ☃ = (a << 4) - 2;
    int ☃ = ☃ + 16 + 2;
    int ☃ = (b << 4) - 2;
    int ☃ = ☃ + 16 + 2;
    
    return a(new aqe(☃, 0, ☃, ☃, 256, ☃), ☃);
  }
  
  public List<adw> a(aqe ☃, boolean ☃)
  {
    List<adw> ☃ = null;
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      Iterator<adw> ☃;
      Iterator<adw> ☃;
      if (☃ == 0) {
        ☃ = M.iterator();
      } else {
        ☃ = V.iterator();
      }
      while (☃.hasNext())
      {
        adw ☃ = (adw)☃.next();
        cj ☃ = a;
        if ((☃.n() >= a) && (☃.n() < d) && (☃.p() >= c) && (☃.p() < f))
        {
          if (☃)
          {
            L.remove(☃);
            ☃.remove();
          }
          if (☃ == null) {
            ☃ = Lists.newArrayList();
          }
          ☃.add(☃);
        }
      }
    }
    return ☃;
  }
  
  public void a(pk ☃, boolean ☃)
  {
    if ((!ai()) && (((☃ instanceof tm)) || ((☃ instanceof tz)))) {
      ☃.J();
    }
    if ((!ah()) && ((☃ instanceof wh))) {
      ☃.J();
    }
    super.a(☃, ☃);
  }
  
  private boolean ah()
  {
    return I.ah();
  }
  
  private boolean ai()
  {
    return I.ag();
  }
  
  protected amv k()
  {
    and ☃ = w.a(t);
    b = new ld(this, ☃, t.c());
    return b;
  }
  
  public List<akw> a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    List<akw> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < h.size(); ☃++)
    {
      akw ☃ = (akw)h.get(☃);
      cj ☃ = ☃.v();
      if ((☃.n() >= ☃) && (☃.o() >= ☃) && (☃.p() >= ☃) && (☃.n() < ☃) && (☃.o() < ☃) && (☃.p() < ☃)) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public boolean a(wn ☃, cj ☃)
  {
    return (!I.a(this, ☃, ☃)) && (af().a(☃));
  }
  
  public void a(adp ☃)
  {
    if (!x.w())
    {
      try
      {
        b(☃);
        if (x.u() == adr.g) {
          aj();
        }
        super.a(☃);
      }
      catch (Throwable ☃)
      {
        b ☃ = b.a(☃, "Exception initializing level");
        try
        {
          a(☃);
        }
        catch (Throwable localThrowable1) {}
        throw new e(☃);
      }
      x.d(true);
    }
  }
  
  private void aj()
  {
    x.f(false);
    x.c(true);
    x.b(false);
    x.a(false);
    x.i(1000000000);
    x.c(6000L);
    x.a(adp.a.e);
    x.g(false);
    x.a(oj.a);
    x.e(true);
    Q().a("doDaylightCycle", "false");
  }
  
  private void b(adp ☃)
  {
    if (!t.e())
    {
      x.a(cj.a.b(t.i()));
      return;
    }
    if (x.u() == adr.g)
    {
      x.a(cj.a.a());
      return;
    }
    y = true;
    
    aec ☃ = t.m();
    List<ady> ☃ = ☃.a();
    Random ☃ = new Random(J());
    
    cj ☃ = ☃.a(0, 0, 256, ☃, ☃);
    
    int ☃ = 0;
    int ☃ = t.i();
    int ☃ = 0;
    if (☃ != null)
    {
      ☃ = ☃.n();
      ☃ = ☃.p();
    }
    else
    {
      a.warn("Unable to find spawn biome");
    }
    int ☃ = 0;
    while (!t.a(☃, ☃))
    {
      ☃ += ☃.nextInt(64) - ☃.nextInt(64);
      ☃ += ☃.nextInt(64) - ☃.nextInt(64);
      ☃++;
      if (☃ == 1000) {
        break;
      }
    }
    x.a(new cj(☃, ☃, ☃));
    y = false;
    if (☃.c()) {
      l();
    }
  }
  
  protected void l()
  {
    aol ☃ = new aol(U, 10);
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      int ☃ = x.c() + s.nextInt(6) - s.nextInt(6);
      int ☃ = x.e() + s.nextInt(6) - s.nextInt(6);
      
      cj ☃ = r(new cj(☃, 0, ☃)).a();
      if (☃.b(this, s, ☃)) {
        break;
      }
    }
  }
  
  public cj m()
  {
    return t.h();
  }
  
  public void a(boolean ☃, nu ☃)
    throws adn
  {
    if (!v.e()) {
      return;
    }
    if (☃ != null) {
      ☃.a("Saving level");
    }
    a();
    if (☃ != null) {
      ☃.c("Saving chunks");
    }
    v.a(☃, ☃);
    
    List<amy> ☃ = Lists.newArrayList(b.a());
    for (amy ☃ : ☃) {
      if (☃ != null) {
        if (!K.a(a, b)) {
          b.b(a, b);
        }
      }
    }
  }
  
  public void n()
  {
    if (!v.e()) {
      return;
    }
    v.c();
  }
  
  protected void a()
    throws adn
  {
    I();
    
    x.a(af().h());
    x.d(af().f());
    x.c(af().g());
    x.e(af().m());
    x.f(af().n());
    x.j(af().q());
    x.k(af().p());
    
    x.b(af().j());
    x.e(af().i());
    
    w.a(x, I.ap().t());
    z.a();
  }
  
  protected void a(pk ☃)
  {
    super.a(☃);
    l.a(☃.F(), ☃);
    N.put(☃.aK(), ☃);
    pk[] ☃ = ☃.aB();
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        l.a(☃[☃].F(), ☃[☃]);
      }
    }
  }
  
  protected void b(pk ☃)
  {
    super.b(☃);
    l.d(☃.F());
    N.remove(☃.aK());
    pk[] ☃ = ☃.aB();
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        l.d(☃[☃].F());
      }
    }
  }
  
  public boolean c(pk ☃)
  {
    if (super.c(☃))
    {
      I.ap().a(s, t, u, 512.0D, t.q(), new fm(☃));
      return true;
    }
    return false;
  }
  
  public void a(pk ☃, byte ☃)
  {
    s().b(☃, new gi(☃, ☃));
  }
  
  public adi a(pk ☃, double ☃, double ☃, double ☃, float ☃, boolean ☃, boolean ☃)
  {
    adi ☃ = new adi(this, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    ☃.a();
    ☃.a(false);
    if (!☃) {
      ☃.d();
    }
    for (wn ☃ : j) {
      if (☃.e(☃, ☃, ☃) < 4096.0D) {
        a.a(new gk(☃, ☃, ☃, ☃, ☃.e(), (aui)☃.b().get(☃)));
      }
    }
    return ☃;
  }
  
  public void c(cj ☃, afh ☃, int ☃, int ☃)
  {
    ade ☃ = new ade(☃, ☃, ☃, ☃);
    for (ade ☃ : S[T]) {
      if (☃.equals(☃)) {
        return;
      }
    }
    S[T].add(☃);
  }
  
  private void ak()
  {
    while (!S[T].isEmpty())
    {
      int ☃ = T;
      T ^= 0x1;
      for (ade ☃ : S[☃]) {
        if (a(☃)) {
          I.ap().a(☃.a().n(), ☃.a().o(), ☃.a().p(), 64.0D, t.q(), new fu(☃.a(), ☃.d(), ☃.b(), ☃.c()));
        }
      }
      S[☃].clear();
    }
  }
  
  private boolean a(ade ☃)
  {
    alz ☃ = p(☃.a());
    if (☃.c() == ☃.d()) {
      return ☃.c().a(this, ☃.a(), ☃, ☃.b(), ☃.c());
    }
    return false;
  }
  
  public void o()
  {
    w.a();
  }
  
  protected void p()
  {
    boolean ☃ = S();
    super.p();
    if (o != p) {
      I.ap().a(new gm(7, p), t.q());
    }
    if (q != r) {
      I.ap().a(new gm(8, r), t.q());
    }
    if (☃ != S())
    {
      if (☃) {
        I.ap().a(new gm(2, 0.0F));
      } else {
        I.ap().a(new gm(1, 0.0F));
      }
      I.ap().a(new gm(7, p));
      I.ap().a(new gm(8, r));
    }
  }
  
  protected int q()
  {
    return I.ap().s();
  }
  
  public MinecraftServer r()
  {
    return I;
  }
  
  public la s()
  {
    return J;
  }
  
  public lc t()
  {
    return K;
  }
  
  public adu u()
  {
    return Q;
  }
  
  public void a(cy ☃, double ☃, double ☃, double ☃, int ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    a(☃, false, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(cy ☃, boolean ☃, double ☃, double ☃, double ☃, int ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    ff ☃ = new gr(☃, ☃, (float)☃, (float)☃, (float)☃, (float)☃, (float)☃, (float)☃, (float)☃, ☃, ☃);
    for (int ☃ = 0; ☃ < j.size(); ☃++)
    {
      lf ☃ = (lf)j.get(☃);
      cj ☃ = ☃.c();
      double ☃ = ☃.c(☃, ☃, ☃);
      if ((☃ <= 256.0D) || ((☃) && (☃ <= 65536.0D))) {
        a.a(☃);
      }
    }
  }
  
  public pk a(UUID ☃)
  {
    return (pk)N.get(☃);
  }
  
  public ListenableFuture<Object> a(Runnable ☃)
  {
    return I.a(☃);
  }
  
  public boolean aJ()
  {
    return I.aJ();
  }
  
  static class a
    extends ArrayList<ade>
  {}
}
