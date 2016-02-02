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
    this.I = ☃;
    this.J = new la(this);
    this.K = new lc(this);
    
    this.t.a(this);
    this.v = k();
    
    this.Q = new adu(this);
    
    B();
    C();
    
    af().a(☃.aI());
  }
  
  public adm b()
  {
    this.z = new aua(this.w);
    
    String ☃ = th.a(this.t);
    th ☃ = (th)this.z.a(th.class, ☃);
    if (☃ == null)
    {
      this.A = new th(this);
      this.z.a(☃, this.A);
    }
    else
    {
      this.A = ☃;
      this.A.a(this);
    }
    this.C = new kk(this.I);
    
    aup ☃ = (aup)this.z.a(aup.class, "scoreboard");
    if (☃ == null)
    {
      ☃ = new aup();
      this.z.a("scoreboard", ☃);
    }
    ☃.a(this.C);
    ((kk)this.C).a(☃);
    
    af().c(this.x.C(), this.x.D());
    af().c(this.x.I());
    af().b(this.x.H());
    af().c(this.x.J());
    af().b(this.x.K());
    if (this.x.F() > 0L) {
      af().a(this.x.E(), this.x.G(), this.x.F());
    } else {
      af().a(this.x.E());
    }
    return this;
  }
  
  public void c()
  {
    super.c();
    if ((P().t()) && (aa() != oj.d)) {
      P().a(oj.d);
    }
    this.t.m().b();
    if (f())
    {
      if (Q().b("doDaylightCycle"))
      {
        long ☃ = this.x.g() + 24000L;
        this.x.c(☃ - ☃ % 24000L);
      }
      e();
    }
    this.B.a("mobSpawner");
    if ((Q().b("doMobSpawning")) && (this.x.u() != adr.g)) {
      this.R.a(this, this.F, this.G, this.x.f() % 400L == 0L);
    }
    this.B.c("chunkSource");
    this.v.d();
    int ☃ = a(1.0F);
    if (☃ != ab()) {
      c(☃);
    }
    this.x.b(this.x.f() + 1L);
    if (Q().b("doDaylightCycle")) {
      this.x.c(this.x.g() + 1L);
    }
    this.B.c("tickPending");
    a(false);
    
    this.B.c("tickBlocks");
    h();
    
    this.B.c("chunkMap");
    this.K.b();
    
    this.B.c("village");
    this.A.a();
    this.d.a();
    
    this.B.c("portalForcer");
    this.Q.a(K());
    
    this.B.b();
    
    ak();
  }
  
  public ady.c a(pt ☃, cj ☃)
  {
    List<ady.c> ☃ = N().a(☃, ☃);
    if ((☃ == null) || (☃.isEmpty())) {
      return null;
    }
    return (ady.c)oa.a(this.s, ☃);
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
    this.O = false;
    if (!this.j.isEmpty())
    {
      int ☃ = 0;
      int ☃ = 0;
      for (wn ☃ : this.j) {
        if (☃.v()) {
          ☃++;
        } else if (☃.bJ()) {
          ☃++;
        }
      }
      this.O = ((☃ > 0) && (☃ >= this.j.size() - ☃));
    }
  }
  
  protected void e()
  {
    this.O = false;
    for (wn ☃ : this.j) {
      if (☃.bJ()) {
        ☃.a(false, false, true);
      }
    }
    ag();
  }
  
  private void ag()
  {
    this.x.g(0);
    this.x.b(false);
    this.x.f(0);
    this.x.a(false);
  }
  
  public boolean f()
  {
    if ((this.O) && (!this.D))
    {
      for (wn ☃ : this.j) {
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
    if (this.x.d() <= 0) {
      this.x.b(F() + 1);
    }
    int ☃ = this.x.c();
    int ☃ = this.x.e();
    int ☃ = 0;
    while (c(new cj(☃, 0, ☃)).t() == arm.a)
    {
      ☃ += this.s.nextInt(8) - this.s.nextInt(8);
      ☃ += this.s.nextInt(8) - this.s.nextInt(8);
      ☃++;
      if (☃ == 10000) {
        break;
      }
    }
    this.x.a(☃);
    this.x.c(☃);
  }
  
  protected void h()
  {
    super.h();
    if (this.x.u() == adr.g)
    {
      for (adg ☃ : this.E) {
        a(☃.a, ☃.b).b(false);
      }
      return;
    }
    int ☃ = 0;
    int ☃ = 0;
    for (adg ☃ : this.E)
    {
      int ☃ = ☃.a * 16;
      int ☃ = ☃.b * 16;
      
      this.B.a("getChunk");
      amy ☃ = a(☃.a, ☃.b);
      
      a(☃, ☃, ☃);
      
      this.B.c("tickChunk");
      ☃.b(false);
      
      this.B.c("thunder");
      if ((this.s.nextInt(100000) == 0) && (S()) && (R()))
      {
        this.m = (this.m * 3 + 1013904223);
        int ☃ = this.m >> 2;
        
        cj ☃ = a(new cj(☃ + (☃ & 0xF), 0, ☃ + (☃ >> 8 & 0xF)));
        if (C(☃)) {
          c(new uv(this, ☃.n(), ☃.o(), ☃.p()));
        }
      }
      this.B.c("iceandsnow");
      if (this.s.nextInt(16) == 0)
      {
        this.m = (this.m * 3 + 1013904223);
        int ☃ = this.m >> 2;
        
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
      this.B.c("tickBlocks");
      int ☃ = Q().c("randomTickSpeed");
      if (☃ > 0) {
        for (amz ☃ : ☃.h()) {
          if ((☃ != null) && (☃.b())) {
            for (int ☃ = 0; ☃ < ☃; ☃++)
            {
              this.m = (this.m * 3 + 1013904223);
              int ☃ = this.m >> 2;
              int ☃ = ☃ & 0xF;
              int ☃ = ☃ >> 8 & 0xF;
              int ☃ = ☃ >> 16 & 0xF;
              
              ☃++;
              alz ☃ = ☃.a(☃, ☃, ☃);
              afh ☃ = ☃.c();
              if (☃.y())
              {
                ☃++;
                ☃.a(this, new cj(☃ + ☃, ☃ + ☃.d(), ☃ + ☃), ☃, this.s);
              }
            }
          }
        }
      }
      this.B.b();
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
        return (☃ != null) && (☃.ai()) && (le.this.i(☃.c()));
      }
    });
    if (!☃.isEmpty()) {
      return ((pr)☃.get(this.s.nextInt(☃.size()))).c();
    }
    return ☃;
  }
  
  public boolean a(cj ☃, afh ☃)
  {
    adw ☃ = new adw(☃, ☃);
    return this.V.contains(☃);
  }
  
  public void a(cj ☃, afh ☃, int ☃)
  {
    a(☃, ☃, ☃, 0);
  }
  
  public void a(cj ☃, afh ☃, int ☃, int ☃)
  {
    adw ☃ = new adw(☃, ☃);
    int ☃ = 0;
    if ((this.e) && (☃.t() != arm.a))
    {
      if (☃.N())
      {
        ☃ = 8;
        if (a(☃.a.a(-☃, -☃, -☃), ☃.a.a(☃, ☃, ☃)))
        {
          alz ☃ = p(☃.a);
          if ((☃.c().t() != arm.a) && (☃.c() == ☃.a())) {
            ☃.c().b(this, ☃.a, ☃, this.s);
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
        ☃.a(☃ + this.x.f());
        ☃.a(☃);
      }
      if (!this.L.contains(☃))
      {
        this.L.add(☃);
        this.M.add(☃);
      }
    }
  }
  
  public void b(cj ☃, afh ☃, int ☃, int ☃)
  {
    adw ☃ = new adw(☃, ☃);
    ☃.a(☃);
    if (☃.t() != arm.a) {
      ☃.a(☃ + this.x.f());
    }
    if (!this.L.contains(☃))
    {
      this.L.add(☃);
      this.M.add(☃);
    }
  }
  
  public void i()
  {
    if (this.j.isEmpty())
    {
      if (this.P++ < 1200) {}
    }
    else {
      j();
    }
    super.i();
  }
  
  public void j()
  {
    this.P = 0;
  }
  
  private List<adw> V = Lists.newArrayList();
  
  public boolean a(boolean ☃)
  {
    if (this.x.u() == adr.g) {
      return false;
    }
    int ☃ = this.M.size();
    if (☃ != this.L.size()) {
      throw new IllegalStateException("TickNextTick list out of synch");
    }
    if (☃ > 1000) {
      ☃ = 1000;
    }
    this.B.a("cleaning");
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      adw ☃ = (adw)this.M.first();
      if ((!☃) && (☃.b > this.x.f())) {
        break;
      }
      this.M.remove(☃);
      this.L.remove(☃);
      this.V.add(☃);
    }
    this.B.b();
    
    this.B.a("ticking");
    Iterator<adw> ☃ = this.V.iterator();
    while (☃.hasNext())
    {
      adw ☃ = (adw)☃.next();
      ☃.remove();
      
      int ☃ = 0;
      if (a(☃.a.a(-☃, -☃, -☃), ☃.a.a(☃, ☃, ☃)))
      {
        alz ☃ = p(☃.a);
        if ((☃.c().t() != arm.a) && (afh.a(☃.c(), ☃.a()))) {
          try
          {
            ☃.c().b(this, ☃.a, ☃, this.s);
          }
          catch (Throwable ☃)
          {
            b ☃ = b.a(☃, "Exception while ticking a block");
            c ☃ = ☃.a("Block being ticked");
            c.a(☃, ☃.a, ☃);
            throw new e(☃);
          }
        }
      }
      else
      {
        a(☃.a, ☃.a(), 0);
      }
    }
    this.B.b();
    
    this.V.clear();
    
    return !this.M.isEmpty();
  }
  
  public List<adw> a(amy ☃, boolean ☃)
  {
    adg ☃ = ☃.j();
    int ☃ = (☃.a << 4) - 2;
    int ☃ = ☃ + 16 + 2;
    int ☃ = (☃.b << 4) - 2;
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
        ☃ = this.M.iterator();
      } else {
        ☃ = this.V.iterator();
      }
      while (☃.hasNext())
      {
        adw ☃ = (adw)☃.next();
        cj ☃ = ☃.a;
        if ((☃.n() >= ☃.a) && (☃.n() < ☃.d) && (☃.p() >= ☃.c) && (☃.p() < ☃.f))
        {
          if (☃)
          {
            this.L.remove(☃);
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
    return this.I.ah();
  }
  
  private boolean ai()
  {
    return this.I.ag();
  }
  
  protected amv k()
  {
    and ☃ = this.w.a(this.t);
    this.b = new ld(this, ☃, this.t.c());
    return this.b;
  }
  
  public List<akw> a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    List<akw> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < this.h.size(); ☃++)
    {
      akw ☃ = (akw)this.h.get(☃);
      cj ☃ = ☃.v();
      if ((☃.n() >= ☃) && (☃.o() >= ☃) && (☃.p() >= ☃) && (☃.n() < ☃) && (☃.o() < ☃) && (☃.p() < ☃)) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public boolean a(wn ☃, cj ☃)
  {
    return (!this.I.a(this, ☃, ☃)) && (af().a(☃));
  }
  
  public void a(adp ☃)
  {
    if (!this.x.w())
    {
      try
      {
        b(☃);
        if (this.x.u() == adr.g) {
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
      this.x.d(true);
    }
  }
  
  private void aj()
  {
    this.x.f(false);
    this.x.c(true);
    this.x.b(false);
    this.x.a(false);
    this.x.i(1000000000);
    this.x.c(6000L);
    this.x.a(adp.a.e);
    this.x.g(false);
    this.x.a(oj.a);
    this.x.e(true);
    Q().a("doDaylightCycle", "false");
  }
  
  private void b(adp ☃)
  {
    if (!this.t.e())
    {
      this.x.a(cj.a.b(this.t.i()));
      return;
    }
    if (this.x.u() == adr.g)
    {
      this.x.a(cj.a.a());
      return;
    }
    this.y = true;
    
    aec ☃ = this.t.m();
    List<ady> ☃ = ☃.a();
    Random ☃ = new Random(J());
    
    cj ☃ = ☃.a(0, 0, 256, ☃, ☃);
    
    int ☃ = 0;
    int ☃ = this.t.i();
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
    while (!this.t.a(☃, ☃))
    {
      ☃ += ☃.nextInt(64) - ☃.nextInt(64);
      ☃ += ☃.nextInt(64) - ☃.nextInt(64);
      ☃++;
      if (☃ == 1000) {
        break;
      }
    }
    this.x.a(new cj(☃, ☃, ☃));
    this.y = false;
    if (☃.c()) {
      l();
    }
  }
  
  protected void l()
  {
    aol ☃ = new aol(U, 10);
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      int ☃ = this.x.c() + this.s.nextInt(6) - this.s.nextInt(6);
      int ☃ = this.x.e() + this.s.nextInt(6) - this.s.nextInt(6);
      
      cj ☃ = r(new cj(☃, 0, ☃)).a();
      if (☃.b(this, this.s, ☃)) {
        break;
      }
    }
  }
  
  public cj m()
  {
    return this.t.h();
  }
  
  public void a(boolean ☃, nu ☃)
    throws adn
  {
    if (!this.v.e()) {
      return;
    }
    if (☃ != null) {
      ☃.a("Saving level");
    }
    a();
    if (☃ != null) {
      ☃.c("Saving chunks");
    }
    this.v.a(☃, ☃);
    
    List<amy> ☃ = Lists.newArrayList(this.b.a());
    for (amy ☃ : ☃) {
      if (☃ != null) {
        if (!this.K.a(☃.a, ☃.b)) {
          this.b.b(☃.a, ☃.b);
        }
      }
    }
  }
  
  public void n()
  {
    if (!this.v.e()) {
      return;
    }
    this.v.c();
  }
  
  protected void a()
    throws adn
  {
    I();
    
    this.x.a(af().h());
    this.x.d(af().f());
    this.x.c(af().g());
    this.x.e(af().m());
    this.x.f(af().n());
    this.x.j(af().q());
    this.x.k(af().p());
    
    this.x.b(af().j());
    this.x.e(af().i());
    
    this.w.a(this.x, this.I.ap().t());
    this.z.a();
  }
  
  protected void a(pk ☃)
  {
    super.a(☃);
    this.l.a(☃.F(), ☃);
    this.N.put(☃.aK(), ☃);
    pk[] ☃ = ☃.aB();
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        this.l.a(☃[☃].F(), ☃[☃]);
      }
    }
  }
  
  protected void b(pk ☃)
  {
    super.b(☃);
    this.l.d(☃.F());
    this.N.remove(☃.aK());
    pk[] ☃ = ☃.aB();
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        this.l.d(☃[☃].F());
      }
    }
  }
  
  public boolean c(pk ☃)
  {
    if (super.c(☃))
    {
      this.I.ap().a(☃.s, ☃.t, ☃.u, 512.0D, this.t.q(), new fm(☃));
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
    for (wn ☃ : this.j) {
      if (☃.e(☃, ☃, ☃) < 4096.0D) {
        ((lf)☃).a.a(new gk(☃, ☃, ☃, ☃, ☃.e(), (aui)☃.b().get(☃)));
      }
    }
    return ☃;
  }
  
  public void c(cj ☃, afh ☃, int ☃, int ☃)
  {
    ade ☃ = new ade(☃, ☃, ☃, ☃);
    for (ade ☃ : this.S[this.T]) {
      if (☃.equals(☃)) {
        return;
      }
    }
    this.S[this.T].add(☃);
  }
  
  private void ak()
  {
    while (!this.S[this.T].isEmpty())
    {
      int ☃ = this.T;
      this.T ^= 0x1;
      for (ade ☃ : this.S[☃]) {
        if (a(☃)) {
          this.I.ap().a(☃.a().n(), ☃.a().o(), ☃.a().p(), 64.0D, this.t.q(), new fu(☃.a(), ☃.d(), ☃.b(), ☃.c()));
        }
      }
      this.S[☃].clear();
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
    this.w.a();
  }
  
  protected void p()
  {
    boolean ☃ = S();
    super.p();
    if (this.o != this.p) {
      this.I.ap().a(new gm(7, this.p), this.t.q());
    }
    if (this.q != this.r) {
      this.I.ap().a(new gm(8, this.r), this.t.q());
    }
    if (☃ != S())
    {
      if (☃) {
        this.I.ap().a(new gm(2, 0.0F));
      } else {
        this.I.ap().a(new gm(1, 0.0F));
      }
      this.I.ap().a(new gm(7, this.p));
      this.I.ap().a(new gm(8, this.r));
    }
  }
  
  protected int q()
  {
    return this.I.ap().s();
  }
  
  public MinecraftServer r()
  {
    return this.I;
  }
  
  public la s()
  {
    return this.J;
  }
  
  public lc t()
  {
    return this.K;
  }
  
  public adu u()
  {
    return this.Q;
  }
  
  public void a(cy ☃, double ☃, double ☃, double ☃, int ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    a(☃, false, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(cy ☃, boolean ☃, double ☃, double ☃, double ☃, int ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    ff ☃ = new gr(☃, ☃, (float)☃, (float)☃, (float)☃, (float)☃, (float)☃, (float)☃, (float)☃, ☃, ☃);
    for (int ☃ = 0; ☃ < this.j.size(); ☃++)
    {
      lf ☃ = (lf)this.j.get(☃);
      cj ☃ = ☃.c();
      double ☃ = ☃.c(☃, ☃, ☃);
      if ((☃ <= 256.0D) || ((☃) && (☃ <= 65536.0D))) {
        ☃.a.a(☃);
      }
    }
  }
  
  public pk a(UUID ☃)
  {
    return (pk)this.N.get(☃);
  }
  
  public ListenableFuture<Object> a(Runnable ☃)
  {
    return this.I.a(☃);
  }
  
  public boolean aJ()
  {
    return this.I.aJ();
  }
  
  static class a
    extends ArrayList<ade>
  {}
}
