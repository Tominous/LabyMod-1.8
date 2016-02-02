import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class lx
{
  public static final File a = new File("banned-players.json");
  public static final File b = new File("banned-ips.json");
  public static final File c = new File("ops.json");
  public static final File d = new File("whitelist.json");
  private static final Logger f = LogManager.getLogger();
  private static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
  private final MinecraftServer h;
  private final List<lf> i = Lists.newArrayList();
  private final Map<UUID, lf> j = Maps.newHashMap();
  private final mc k = new mc(a);
  private final lu l = new lu(b);
  private final ly m = new ly(c);
  private final me n = new me(d);
  private final Map<UUID, mv> o = Maps.newHashMap();
  private aty p;
  private boolean q;
  protected int e;
  private int r;
  private adp.a s;
  private boolean t;
  private int u;
  
  public lx(MinecraftServer ☃)
  {
    this.h = ☃;
    
    this.k.a(false);
    this.l.a(false);
    
    this.e = 8;
  }
  
  public void a(ek ☃, lf ☃)
  {
    GameProfile ☃ = ☃.cd();
    
    lt ☃ = this.h.aF();
    GameProfile ☃ = ☃.a(☃.getId());
    String ☃ = ☃ == null ? ☃.getName() : ☃.getName();
    ☃.a(☃);
    
    dn ☃ = a(☃);
    ☃.a(this.h.a(☃.am));
    ☃.c.a((le)☃.o);
    
    String ☃ = "local";
    if (☃.b() != null) {
      ☃ = ☃.b().toString();
    }
    f.info(☃.e_() + "[" + ☃ + "] logged in with entity id " + ☃.F() + " at (" + ☃.s + ", " + ☃.t + ", " + ☃.u + ")");
    
    le ☃ = this.h.a(☃.am);
    ato ☃ = ☃.P();
    
    cj ☃ = ☃.M();
    
    a(☃, null, ☃);
    
    lm ☃ = new lm(this.h, ☃, ☃);
    ☃.a(new gt(☃.F(), ☃.c.b(), ☃.t(), ☃.t.q(), ☃.aa(), p(), ☃.u(), ☃.Q().b("reducedDebugInfo")));
    ☃.a(new gg("MC|Brand", new em(Unpooled.buffer()).a(c().getServerModName())));
    ☃.a(new fw(☃.y(), ☃.z()));
    ☃.a(new ht(☃));
    ☃.a(new gx(☃.bA));
    ☃.a(new hi(☃.bi.c));
    
    ☃.A().d();
    ☃.A().b(☃);
    
    a((kk)☃.Z(), ☃);
    
    this.h.aH();
    fb ☃;
    fb ☃;
    if (!☃.e_().equalsIgnoreCase(☃)) {
      ☃ = new fb("multiplayer.player.joined.renamed", new Object[] { ☃.f_(), ☃ });
    } else {
      ☃ = new fb("multiplayer.player.joined", new Object[] { ☃.f_() });
    }
    ☃.b().a(a.o);
    a(☃);
    c(☃);
    
    ☃.a(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
    b(☃, ☃);
    if (this.h.ab().length() > 0) {
      ☃.a(this.h.ab(), this.h.ac());
    }
    for (pf ☃ : ☃.bl()) {
      ☃.a(new ib(☃.F(), ☃));
    }
    ☃.g_();
    if ((☃ != null) && (☃.b("Riding", 10)))
    {
      pk ☃ = pm.a(☃.m("Riding"), ☃);
      if (☃ != null)
      {
        ☃.n = true;
        ☃.d(☃);
        ☃.a(☃);
        ☃.n = false;
      }
    }
  }
  
  protected void a(kk ☃, lf ☃)
  {
    Set<auk> ☃ = Sets.newHashSet();
    for (aul ☃ : ☃.g()) {
      ☃.a.a(new hr(☃, 0));
    }
    for (int ☃ = 0; ☃ < 19; ☃++)
    {
      auk ☃ = ☃.a(☃);
      if ((☃ != null) && (!☃.contains(☃)))
      {
        List<ff> ☃ = ☃.d(☃);
        for (ff ☃ : ☃) {
          ☃.a.a(☃);
        }
        ☃.add(☃);
      }
    }
  }
  
  public void a(le[] ☃)
  {
    this.p = ☃[0].O().e();
    ☃[0].af().a(new amq()
    {
      public void a(ams ☃, double ☃)
      {
        lx.this.a(new hg(☃, hg.a.a));
      }
      
      public void a(ams ☃, double ☃, double ☃, long ☃)
      {
        lx.this.a(new hg(☃, hg.a.b));
      }
      
      public void a(ams ☃, double ☃, double ☃)
      {
        lx.this.a(new hg(☃, hg.a.c));
      }
      
      public void a(ams ☃, int ☃)
      {
        lx.this.a(new hg(☃, hg.a.e));
      }
      
      public void b(ams ☃, int ☃)
      {
        lx.this.a(new hg(☃, hg.a.f));
      }
      
      public void b(ams ☃, double ☃) {}
      
      public void c(ams ☃, double ☃) {}
    });
  }
  
  public void a(lf ☃, le ☃)
  {
    le ☃ = ☃.u();
    if (☃ != null) {
      ☃.t().c(☃);
    }
    ☃.t().a(☃);
    
    ☃.b.c((int)☃.s >> 4, (int)☃.u >> 4);
  }
  
  public int d()
  {
    return lc.b(s());
  }
  
  public dn a(lf ☃)
  {
    dn ☃ = this.h.d[0].P().i();
    dn ☃;
    if ((☃.e_().equals(this.h.S())) && (☃ != null))
    {
      ☃.f(☃);
      dn ☃ = ☃;
      f.debug("loading single player");
    }
    else
    {
      ☃ = this.p.b(☃);
    }
    return ☃;
  }
  
  protected void b(lf ☃)
  {
    this.p.a(☃);
    mv ☃ = (mv)this.o.get(☃.aK());
    if (☃ != null) {
      ☃.b();
    }
  }
  
  public void c(lf ☃)
  {
    this.i.add(☃);
    this.j.put(☃.aK(), ☃);
    
    a(new gz(gz.a.a, new lf[] { ☃ }));
    
    le ☃ = this.h.a(☃.am);
    
    ☃.d(☃);
    a(☃, null);
    for (int ☃ = 0; ☃ < this.i.size(); ☃++)
    {
      lf ☃ = (lf)this.i.get(☃);
      ☃.a.a(new gz(gz.a.a, new lf[] { ☃ }));
    }
  }
  
  public void d(lf ☃)
  {
    ☃.u().t().d(☃);
  }
  
  public void e(lf ☃)
  {
    ☃.b(na.f);
    b(☃);
    le ☃ = ☃.u();
    if (☃.m != null)
    {
      ☃.f(☃.m);
      f.debug("removing player mount");
    }
    ☃.e(☃);
    ☃.t().c(☃);
    this.i.remove(☃);
    UUID ☃ = ☃.aK();
    lf ☃ = (lf)this.j.get(☃);
    if (☃ == ☃)
    {
      this.j.remove(☃);
      this.o.remove(☃);
    }
    a(new gz(gz.a.e, new lf[] { ☃ }));
  }
  
  public String a(SocketAddress ☃, GameProfile ☃)
  {
    if (this.k.a(☃))
    {
      md ☃ = (md)this.k.b(☃);
      String ☃ = "You are banned from this server!\nReason: " + ☃.d();
      if (☃.c() != null) {
        ☃ = ☃ + "\nYour ban will be removed on " + g.format(☃.c());
      }
      return ☃;
    }
    if (!e(☃)) {
      return "You are not white-listed on this server!";
    }
    if (this.l.a(☃))
    {
      lv ☃ = this.l.b(☃);
      String ☃ = "Your IP address is banned from this server!\nReason: " + ☃.d();
      if (☃.c() != null) {
        ☃ = ☃ + "\nYour ban will be removed on " + g.format(☃.c());
      }
      return ☃;
    }
    if ((this.i.size() >= this.e) && (!f(☃))) {
      return "The server is full!";
    }
    return null;
  }
  
  public lf g(GameProfile ☃)
  {
    UUID ☃ = wn.a(☃);
    List<lf> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < this.i.size(); ☃++)
    {
      lf ☃ = (lf)this.i.get(☃);
      if (☃.aK().equals(☃)) {
        ☃.add(☃);
      }
    }
    lf ☃ = (lf)this.j.get(☃.getId());
    if ((☃ != null) && (!☃.contains(☃))) {
      ☃.add(☃);
    }
    for (lf ☃ : ☃) {
      ☃.a.c("You logged in from another location");
    }
    lg ☃;
    lg ☃;
    if (this.h.X()) {
      ☃ = new ky(this.h.a(0));
    } else {
      ☃ = new lg(this.h.a(0));
    }
    return new lf(this.h, this.h.a(0), ☃, ☃);
  }
  
  public lf a(lf ☃, int ☃, boolean ☃)
  {
    ☃.u().s().b(☃);
    ☃.u().s().b(☃);
    ☃.u().t().c(☃);
    this.i.remove(☃);
    this.h.a(☃.am).f(☃);
    
    cj ☃ = ☃.ch();
    boolean ☃ = ☃.ci();
    
    ☃.am = ☃;
    lg ☃;
    lg ☃;
    if (this.h.X()) {
      ☃ = new ky(this.h.a(☃.am));
    } else {
      ☃ = new lg(this.h.a(☃.am));
    }
    lf ☃ = new lf(this.h, this.h.a(☃.am), ☃.cd(), ☃);
    ☃.a = ☃.a;
    ☃.a(☃, ☃);
    ☃.d(☃.F());
    ☃.o(☃);
    
    le ☃ = this.h.a(☃.am);
    a(☃, ☃, ☃);
    if (☃ != null)
    {
      cj ☃ = wn.a(this.h.a(☃.am), ☃, ☃);
      if (☃ != null)
      {
        ☃.b(☃.n() + 0.5F, ☃.o() + 0.1F, ☃.p() + 0.5F, 0.0F, 0.0F);
        ☃.a(☃, ☃);
      }
      else
      {
        ☃.a.a(new gm(0, 0.0F));
      }
    }
    ☃.b.c((int)☃.s >> 4, (int)☃.u >> 4);
    while ((!☃.a(☃, ☃.aR()).isEmpty()) && (☃.t < 256.0D)) {
      ☃.b(☃.s, ☃.t + 1.0D, ☃.u);
    }
    ☃.a.a(new he(☃.am, ☃.o.aa(), ☃.o.P().u(), ☃.c.b()));
    cj ☃ = ☃.M();
    ☃.a.a(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
    ☃.a.a(new ht(☃));
    ☃.a.a(new ho(☃.bD, ☃.bC, ☃.bB));
    b(☃, ☃);
    
    ☃.t().a(☃);
    ☃.d(☃);
    this.i.add(☃);
    this.j.put(☃.aK(), ☃);
    
    ☃.g_();
    ☃.i(☃.bn());
    return ☃;
  }
  
  public void a(lf ☃, int ☃)
  {
    int ☃ = ☃.am;
    le ☃ = this.h.a(☃.am);
    ☃.am = ☃;
    
    le ☃ = this.h.a(☃.am);
    
    ☃.a.a(new he(☃.am, ☃.o.aa(), ☃.o.P().u(), ☃.c.b()));
    
    ☃.f(☃);
    ☃.I = false;
    
    a(☃, ☃, ☃, ☃);
    a(☃, ☃);
    
    ☃.a.a(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
    ☃.c.a(☃);
    b(☃, ☃);
    f(☃);
    for (pf ☃ : ☃.bl()) {
      ☃.a.a(new ib(☃.F(), ☃));
    }
  }
  
  public void a(pk ☃, int ☃, le ☃, le ☃)
  {
    double ☃ = ☃.s;
    double ☃ = ☃.u;
    double ☃ = 8.0D;
    float ☃ = ☃.y;
    
    ☃.B.a("moving");
    if (☃.am == -1)
    {
      ☃ = ns.a(☃ / ☃, ☃.af().b() + 16.0D, ☃.af().d() - 16.0D);
      ☃ = ns.a(☃ / ☃, ☃.af().c() + 16.0D, ☃.af().e() - 16.0D);
      ☃.b(☃, ☃.t, ☃, ☃.y, ☃.z);
      if (☃.ai()) {
        ☃.a(☃, false);
      }
    }
    else if (☃.am == 0)
    {
      ☃ = ns.a(☃ * ☃, ☃.af().b() + 16.0D, ☃.af().d() - 16.0D);
      ☃ = ns.a(☃ * ☃, ☃.af().c() + 16.0D, ☃.af().e() - 16.0D);
      ☃.b(☃, ☃.t, ☃, ☃.y, ☃.z);
      if (☃.ai()) {
        ☃.a(☃, false);
      }
    }
    else
    {
      cj ☃;
      cj ☃;
      if (☃ == 1) {
        ☃ = ☃.M();
      } else {
        ☃ = ☃.m();
      }
      ☃ = ☃.n();
      ☃.t = ☃.o();
      ☃ = ☃.p();
      
      ☃.b(☃, ☃.t, ☃, 90.0F, 0.0F);
      if (☃.ai()) {
        ☃.a(☃, false);
      }
    }
    ☃.B.b();
    if (☃ != 1)
    {
      ☃.B.a("placing");
      
      ☃ = ns.a((int)☃, -29999872, 29999872);
      ☃ = ns.a((int)☃, -29999872, 29999872);
      if (☃.ai())
      {
        ☃.b(☃, ☃.t, ☃, ☃.y, ☃.z);
        ☃.u().a(☃, ☃);
        ☃.d(☃);
        ☃.a(☃, false);
      }
      ☃.B.b();
    }
    ☃.a(☃);
  }
  
  public void e()
  {
    if (++this.u > 600)
    {
      a(new gz(gz.a.c, this.i));
      this.u = 0;
    }
  }
  
  public void a(ff ☃)
  {
    for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
      ((lf)this.i.get(☃)).a.a(☃);
    }
  }
  
  public void a(ff ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < this.i.size(); ☃++)
    {
      lf ☃ = (lf)this.i.get(☃);
      if (☃.am == ☃) {
        ☃.a.a(☃);
      }
    }
  }
  
  public void a(wn ☃, eu ☃)
  {
    auq ☃ = ☃.bO();
    if (☃ == null) {
      return;
    }
    Collection<String> ☃ = ☃.d();
    for (String ☃ : ☃)
    {
      lf ☃ = a(☃);
      if ((☃ != null) && (☃ != ☃)) {
        ☃.a(☃);
      }
    }
  }
  
  public void b(wn ☃, eu ☃)
  {
    auq ☃ = ☃.bO();
    if (☃ == null)
    {
      a(☃);
      return;
    }
    for (int ☃ = 0; ☃ < this.i.size(); ☃++)
    {
      lf ☃ = (lf)this.i.get(☃);
      if (☃.bO() != ☃) {
        ☃.a(☃);
      }
    }
  }
  
  public String b(boolean ☃)
  {
    String ☃ = "";
    List<lf> ☃ = Lists.newArrayList(this.i);
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      if (☃ > 0) {
        ☃ = ☃ + ", ";
      }
      ☃ = ☃ + ((lf)☃.get(☃)).e_();
      if (☃) {
        ☃ = ☃ + " (" + ((lf)☃.get(☃)).aK().toString() + ")";
      }
    }
    return ☃;
  }
  
  public String[] f()
  {
    String[] ☃ = new String[this.i.size()];
    for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
      ☃[☃] = ((lf)this.i.get(☃)).e_();
    }
    return ☃;
  }
  
  public GameProfile[] g()
  {
    GameProfile[] ☃ = new GameProfile[this.i.size()];
    for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
      ☃[☃] = ((lf)this.i.get(☃)).cd();
    }
    return ☃;
  }
  
  public mc h()
  {
    return this.k;
  }
  
  public lu i()
  {
    return this.l;
  }
  
  public void a(GameProfile ☃)
  {
    this.m.a(new lz(☃, this.h.p(), this.m.b(☃)));
  }
  
  public void b(GameProfile ☃)
  {
    this.m.c(☃);
  }
  
  public boolean e(GameProfile ☃)
  {
    return (!this.q) || (this.m.d(☃)) || (this.n.d(☃));
  }
  
  public boolean h(GameProfile ☃)
  {
    return (this.m.d(☃)) || ((this.h.T()) && (this.h.d[0].P().v()) && (this.h.S().equalsIgnoreCase(☃.getName()))) || (this.t);
  }
  
  public lf a(String ☃)
  {
    for (lf ☃ : this.i) {
      if (☃.e_().equalsIgnoreCase(☃)) {
        return ☃;
      }
    }
    return null;
  }
  
  public void a(double ☃, double ☃, double ☃, double ☃, int ☃, ff ☃)
  {
    a(null, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(wn ☃, double ☃, double ☃, double ☃, double ☃, int ☃, ff ☃)
  {
    for (int ☃ = 0; ☃ < this.i.size(); ☃++)
    {
      lf ☃ = (lf)this.i.get(☃);
      if (☃ != ☃) {
        if (☃.am == ☃)
        {
          double ☃ = ☃ - ☃.s;
          double ☃ = ☃ - ☃.t;
          double ☃ = ☃ - ☃.u;
          if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ < ☃ * ☃) {
            ☃.a.a(☃);
          }
        }
      }
    }
  }
  
  public void j()
  {
    for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
      b((lf)this.i.get(☃));
    }
  }
  
  public void d(GameProfile ☃)
  {
    this.n.a(new mf(☃));
  }
  
  public void c(GameProfile ☃)
  {
    this.n.c(☃);
  }
  
  public me k()
  {
    return this.n;
  }
  
  public String[] l()
  {
    return this.n.a();
  }
  
  public ly m()
  {
    return this.m;
  }
  
  public String[] n()
  {
    return this.m.a();
  }
  
  public void a() {}
  
  public void b(lf ☃, le ☃)
  {
    ams ☃ = this.h.d[0].af();
    ☃.a.a(new hg(☃, hg.a.d));
    ☃.a.a(new hu(☃.K(), ☃.L(), ☃.Q().b("doDaylightCycle")));
    if (☃.S())
    {
      ☃.a.a(new gm(1, 0.0F));
      ☃.a.a(new gm(7, ☃.j(1.0F)));
      ☃.a.a(new gm(8, ☃.h(1.0F)));
    }
  }
  
  public void f(lf ☃)
  {
    ☃.a(☃.bj);
    ☃.r();
    ☃.a.a(new hi(☃.bi.c));
  }
  
  public int o()
  {
    return this.i.size();
  }
  
  public int p()
  {
    return this.e;
  }
  
  public String[] q()
  {
    return this.h.d[0].O().e().f();
  }
  
  public void a(boolean ☃)
  {
    this.q = ☃;
  }
  
  public List<lf> b(String ☃)
  {
    List<lf> ☃ = Lists.newArrayList();
    for (lf ☃ : this.i) {
      if (☃.w().equals(☃)) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public int s()
  {
    return this.r;
  }
  
  public MinecraftServer c()
  {
    return this.h;
  }
  
  public dn t()
  {
    return null;
  }
  
  public void a(adp.a ☃)
  {
    this.s = ☃;
  }
  
  private void a(lf ☃, lf ☃, adm ☃)
  {
    if (☃ != null) {
      ☃.c.a(☃.c.b());
    } else if (this.s != null) {
      ☃.c.a(this.s);
    }
    ☃.c.b(☃.P().r());
  }
  
  public void c(boolean ☃)
  {
    this.t = ☃;
  }
  
  public void u()
  {
    for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
      ((lf)this.i.get(☃)).a.c("Server closed");
    }
  }
  
  public void a(eu ☃, boolean ☃)
  {
    this.h.a(☃);
    byte ☃ = ☃ ? 1 : 0;
    a(new fy(☃, ☃));
  }
  
  public void a(eu ☃)
  {
    a(☃, true);
  }
  
  public mv a(wn ☃)
  {
    UUID ☃ = ☃.aK();
    mv ☃ = ☃ == null ? null : (mv)this.o.get(☃);
    if (☃ == null)
    {
      File ☃ = new File(this.h.a(0).O().b(), "stats");
      File ☃ = new File(☃, ☃.toString() + ".json");
      if (!☃.exists())
      {
        File ☃ = new File(☃, ☃.e_() + ".json");
        if ((☃.exists()) && (☃.isFile())) {
          ☃.renameTo(☃);
        }
      }
      ☃ = new mv(this.h, ☃);
      ☃.a();
      this.o.put(☃, ☃);
    }
    return ☃;
  }
  
  public void a(int ☃)
  {
    this.r = ☃;
    if (this.h.d == null) {
      return;
    }
    for (le ☃ : this.h.d) {
      if (☃ != null) {
        ☃.t().a(☃);
      }
    }
  }
  
  public List<lf> v()
  {
    return this.i;
  }
  
  public lf a(UUID ☃)
  {
    return (lf)this.j.get(☃);
  }
  
  public boolean f(GameProfile ☃)
  {
    return false;
  }
}
