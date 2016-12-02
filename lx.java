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
    h = ☃;
    
    k.a(false);
    l.a(false);
    
    e = 8;
  }
  
  public void a(ek ☃, lf ☃)
  {
    GameProfile ☃ = ☃.cd();
    
    lt ☃ = h.aF();
    GameProfile ☃ = ☃.a(☃.getId());
    String ☃ = ☃ == null ? ☃.getName() : ☃.getName();
    ☃.a(☃);
    
    dn ☃ = a(☃);
    ☃.a(h.a(am));
    c.a((le)o);
    
    String ☃ = "local";
    if (☃.b() != null) {
      ☃ = ☃.b().toString();
    }
    f.info(☃.e_() + "[" + ☃ + "] logged in with entity id " + ☃.F() + " at (" + s + ", " + t + ", " + u + ")");
    
    le ☃ = h.a(am);
    ato ☃ = ☃.P();
    
    cj ☃ = ☃.M();
    
    a(☃, null, ☃);
    
    lm ☃ = new lm(h, ☃, ☃);
    ☃.a(new gt(☃.F(), c.b(), ☃.t(), t.q(), ☃.aa(), p(), ☃.u(), ☃.Q().b("reducedDebugInfo")));
    ☃.a(new gg("MC|Brand", new em(Unpooled.buffer()).a(c().getServerModName())));
    ☃.a(new fw(☃.y(), ☃.z()));
    ☃.a(new ht(☃));
    ☃.a(new gx(bA));
    ☃.a(new hi(bi.c));
    
    ☃.A().d();
    ☃.A().b(☃);
    
    a((kk)☃.Z(), ☃);
    
    h.aH();
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
    
    ☃.a(s, t, u, y, z);
    b(☃, ☃);
    if (h.ab().length() > 0) {
      ☃.a(h.ab(), h.ac());
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
        n = true;
        ☃.d(☃);
        ☃.a(☃);
        n = false;
      }
    }
  }
  
  protected void a(kk ☃, lf ☃)
  {
    Set<auk> ☃ = Sets.newHashSet();
    for (aul ☃ : ☃.g()) {
      a.a(new hr(☃, 0));
    }
    for (int ☃ = 0; ☃ < 19; ☃++)
    {
      auk ☃ = ☃.a(☃);
      if ((☃ != null) && (!☃.contains(☃)))
      {
        List<ff> ☃ = ☃.d(☃);
        for (ff ☃ : ☃) {
          a.a(☃);
        }
        ☃.add(☃);
      }
    }
  }
  
  public void a(le[] ☃)
  {
    p = ☃[0].O().e();
    ☃[0].af().a(new amq()
    {
      public void a(ams ☃, double ☃)
      {
        a(new hg(☃, hg.a.a));
      }
      
      public void a(ams ☃, double ☃, double ☃, long ☃)
      {
        a(new hg(☃, hg.a.b));
      }
      
      public void a(ams ☃, double ☃, double ☃)
      {
        a(new hg(☃, hg.a.c));
      }
      
      public void a(ams ☃, int ☃)
      {
        a(new hg(☃, hg.a.e));
      }
      
      public void b(ams ☃, int ☃)
      {
        a(new hg(☃, hg.a.f));
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
    
    b.c((int)s >> 4, (int)u >> 4);
  }
  
  public int d()
  {
    return lc.b(s());
  }
  
  public dn a(lf ☃)
  {
    dn ☃ = h.d[0].P().i();
    dn ☃;
    if ((☃.e_().equals(h.S())) && (☃ != null))
    {
      ☃.f(☃);
      dn ☃ = ☃;
      f.debug("loading single player");
    }
    else
    {
      ☃ = p.b(☃);
    }
    return ☃;
  }
  
  protected void b(lf ☃)
  {
    p.a(☃);
    mv ☃ = (mv)o.get(☃.aK());
    if (☃ != null) {
      ☃.b();
    }
  }
  
  public void c(lf ☃)
  {
    i.add(☃);
    j.put(☃.aK(), ☃);
    
    a(new gz(gz.a.a, new lf[] { ☃ }));
    
    le ☃ = h.a(am);
    
    ☃.d(☃);
    a(☃, null);
    for (int ☃ = 0; ☃ < i.size(); ☃++)
    {
      lf ☃ = (lf)i.get(☃);
      a.a(new gz(gz.a.a, new lf[] { ☃ }));
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
    if (m != null)
    {
      ☃.f(m);
      f.debug("removing player mount");
    }
    ☃.e(☃);
    ☃.t().c(☃);
    i.remove(☃);
    UUID ☃ = ☃.aK();
    lf ☃ = (lf)j.get(☃);
    if (☃ == ☃)
    {
      j.remove(☃);
      o.remove(☃);
    }
    a(new gz(gz.a.e, new lf[] { ☃ }));
  }
  
  public String a(SocketAddress ☃, GameProfile ☃)
  {
    if (k.a(☃))
    {
      md ☃ = (md)k.b(☃);
      String ☃ = "You are banned from this server!\nReason: " + ☃.d();
      if (☃.c() != null) {
        ☃ = ☃ + "\nYour ban will be removed on " + g.format(☃.c());
      }
      return ☃;
    }
    if (!e(☃)) {
      return "You are not white-listed on this server!";
    }
    if (l.a(☃))
    {
      lv ☃ = l.b(☃);
      String ☃ = "Your IP address is banned from this server!\nReason: " + ☃.d();
      if (☃.c() != null) {
        ☃ = ☃ + "\nYour ban will be removed on " + g.format(☃.c());
      }
      return ☃;
    }
    if ((i.size() >= e) && (!f(☃))) {
      return "The server is full!";
    }
    return null;
  }
  
  public lf g(GameProfile ☃)
  {
    UUID ☃ = wn.a(☃);
    List<lf> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < i.size(); ☃++)
    {
      lf ☃ = (lf)i.get(☃);
      if (☃.aK().equals(☃)) {
        ☃.add(☃);
      }
    }
    lf ☃ = (lf)j.get(☃.getId());
    if ((☃ != null) && (!☃.contains(☃))) {
      ☃.add(☃);
    }
    for (lf ☃ : ☃) {
      a.c("You logged in from another location");
    }
    lg ☃;
    lg ☃;
    if (h.X()) {
      ☃ = new ky(h.a(0));
    } else {
      ☃ = new lg(h.a(0));
    }
    return new lf(h, h.a(0), ☃, ☃);
  }
  
  public lf a(lf ☃, int ☃, boolean ☃)
  {
    ☃.u().s().b(☃);
    ☃.u().s().b(☃);
    ☃.u().t().c(☃);
    i.remove(☃);
    h.a(am).f(☃);
    
    cj ☃ = ☃.ch();
    boolean ☃ = ☃.ci();
    
    am = ☃;
    lg ☃;
    lg ☃;
    if (h.X()) {
      ☃ = new ky(h.a(am));
    } else {
      ☃ = new lg(h.a(am));
    }
    lf ☃ = new lf(h, h.a(am), ☃.cd(), ☃);
    a = a;
    ☃.a(☃, ☃);
    ☃.d(☃.F());
    ☃.o(☃);
    
    le ☃ = h.a(am);
    a(☃, ☃, ☃);
    if (☃ != null)
    {
      cj ☃ = wn.a(h.a(am), ☃, ☃);
      if (☃ != null)
      {
        ☃.b(☃.n() + 0.5F, ☃.o() + 0.1F, ☃.p() + 0.5F, 0.0F, 0.0F);
        ☃.a(☃, ☃);
      }
      else
      {
        a.a(new gm(0, 0.0F));
      }
    }
    b.c((int)s >> 4, (int)u >> 4);
    while ((!☃.a(☃, ☃.aR()).isEmpty()) && (t < 256.0D)) {
      ☃.b(s, t + 1.0D, u);
    }
    a.a(new he(am, o.aa(), o.P().u(), c.b()));
    cj ☃ = ☃.M();
    a.a(s, t, u, y, z);
    a.a(new ht(☃));
    a.a(new ho(bD, bC, bB));
    b(☃, ☃);
    
    ☃.t().a(☃);
    ☃.d(☃);
    i.add(☃);
    j.put(☃.aK(), ☃);
    
    ☃.g_();
    ☃.i(☃.bn());
    return ☃;
  }
  
  public void a(lf ☃, int ☃)
  {
    int ☃ = am;
    le ☃ = h.a(am);
    am = ☃;
    
    le ☃ = h.a(am);
    
    a.a(new he(am, o.aa(), o.P().u(), c.b()));
    
    ☃.f(☃);
    I = false;
    
    a(☃, ☃, ☃, ☃);
    a(☃, ☃);
    
    a.a(s, t, u, y, z);
    c.a(☃);
    b(☃, ☃);
    f(☃);
    for (pf ☃ : ☃.bl()) {
      a.a(new ib(☃.F(), ☃));
    }
  }
  
  public void a(pk ☃, int ☃, le ☃, le ☃)
  {
    double ☃ = s;
    double ☃ = u;
    double ☃ = 8.0D;
    float ☃ = y;
    
    B.a("moving");
    if (am == -1)
    {
      ☃ = ns.a(☃ / ☃, ☃.af().b() + 16.0D, ☃.af().d() - 16.0D);
      ☃ = ns.a(☃ / ☃, ☃.af().c() + 16.0D, ☃.af().e() - 16.0D);
      ☃.b(☃, t, ☃, y, z);
      if (☃.ai()) {
        ☃.a(☃, false);
      }
    }
    else if (am == 0)
    {
      ☃ = ns.a(☃ * ☃, ☃.af().b() + 16.0D, ☃.af().d() - 16.0D);
      ☃ = ns.a(☃ * ☃, ☃.af().c() + 16.0D, ☃.af().e() - 16.0D);
      ☃.b(☃, t, ☃, y, z);
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
      t = ☃.o();
      ☃ = ☃.p();
      
      ☃.b(☃, t, ☃, 90.0F, 0.0F);
      if (☃.ai()) {
        ☃.a(☃, false);
      }
    }
    B.b();
    if (☃ != 1)
    {
      B.a("placing");
      
      ☃ = ns.a((int)☃, -29999872, 29999872);
      ☃ = ns.a((int)☃, -29999872, 29999872);
      if (☃.ai())
      {
        ☃.b(☃, t, ☃, y, z);
        ☃.u().a(☃, ☃);
        ☃.d(☃);
        ☃.a(☃, false);
      }
      B.b();
    }
    ☃.a(☃);
  }
  
  public void e()
  {
    if (++u > 600)
    {
      a(new gz(gz.a.c, i));
      u = 0;
    }
  }
  
  public void a(ff ☃)
  {
    for (int ☃ = 0; ☃ < i.size(); ☃++) {
      i.get(☃)).a.a(☃);
    }
  }
  
  public void a(ff ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < i.size(); ☃++)
    {
      lf ☃ = (lf)i.get(☃);
      if (am == ☃) {
        a.a(☃);
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
    for (int ☃ = 0; ☃ < i.size(); ☃++)
    {
      lf ☃ = (lf)i.get(☃);
      if (☃.bO() != ☃) {
        ☃.a(☃);
      }
    }
  }
  
  public String b(boolean ☃)
  {
    String ☃ = "";
    List<lf> ☃ = Lists.newArrayList(i);
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
    String[] ☃ = new String[i.size()];
    for (int ☃ = 0; ☃ < i.size(); ☃++) {
      ☃[☃] = ((lf)i.get(☃)).e_();
    }
    return ☃;
  }
  
  public GameProfile[] g()
  {
    GameProfile[] ☃ = new GameProfile[i.size()];
    for (int ☃ = 0; ☃ < i.size(); ☃++) {
      ☃[☃] = ((lf)i.get(☃)).cd();
    }
    return ☃;
  }
  
  public mc h()
  {
    return k;
  }
  
  public lu i()
  {
    return l;
  }
  
  public void a(GameProfile ☃)
  {
    m.a(new lz(☃, h.p(), m.b(☃)));
  }
  
  public void b(GameProfile ☃)
  {
    m.c(☃);
  }
  
  public boolean e(GameProfile ☃)
  {
    return (!q) || (m.d(☃)) || (n.d(☃));
  }
  
  public boolean h(GameProfile ☃)
  {
    return (m.d(☃)) || ((h.T()) && (h.d[0].P().v()) && (h.S().equalsIgnoreCase(☃.getName()))) || (t);
  }
  
  public lf a(String ☃)
  {
    for (lf ☃ : i) {
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
    for (int ☃ = 0; ☃ < i.size(); ☃++)
    {
      lf ☃ = (lf)i.get(☃);
      if (☃ != ☃) {
        if (am == ☃)
        {
          double ☃ = ☃ - s;
          double ☃ = ☃ - t;
          double ☃ = ☃ - u;
          if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ < ☃ * ☃) {
            a.a(☃);
          }
        }
      }
    }
  }
  
  public void j()
  {
    for (int ☃ = 0; ☃ < i.size(); ☃++) {
      b((lf)i.get(☃));
    }
  }
  
  public void d(GameProfile ☃)
  {
    n.a(new mf(☃));
  }
  
  public void c(GameProfile ☃)
  {
    n.c(☃);
  }
  
  public me k()
  {
    return n;
  }
  
  public String[] l()
  {
    return n.a();
  }
  
  public ly m()
  {
    return m;
  }
  
  public String[] n()
  {
    return m.a();
  }
  
  public void a() {}
  
  public void b(lf ☃, le ☃)
  {
    ams ☃ = h.d[0].af();
    a.a(new hg(☃, hg.a.d));
    a.a(new hu(☃.K(), ☃.L(), ☃.Q().b("doDaylightCycle")));
    if (☃.S())
    {
      a.a(new gm(1, 0.0F));
      a.a(new gm(7, ☃.j(1.0F)));
      a.a(new gm(8, ☃.h(1.0F)));
    }
  }
  
  public void f(lf ☃)
  {
    ☃.a(bj);
    ☃.r();
    a.a(new hi(bi.c));
  }
  
  public int o()
  {
    return i.size();
  }
  
  public int p()
  {
    return e;
  }
  
  public String[] q()
  {
    return h.d[0].O().e().f();
  }
  
  public void a(boolean ☃)
  {
    q = ☃;
  }
  
  public List<lf> b(String ☃)
  {
    List<lf> ☃ = Lists.newArrayList();
    for (lf ☃ : i) {
      if (☃.w().equals(☃)) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public int s()
  {
    return r;
  }
  
  public MinecraftServer c()
  {
    return h;
  }
  
  public dn t()
  {
    return null;
  }
  
  public void a(adp.a ☃)
  {
    s = ☃;
  }
  
  private void a(lf ☃, lf ☃, adm ☃)
  {
    if (☃ != null) {
      c.a(c.b());
    } else if (s != null) {
      c.a(s);
    }
    c.b(☃.P().r());
  }
  
  public void c(boolean ☃)
  {
    t = ☃;
  }
  
  public void u()
  {
    for (int ☃ = 0; ☃ < i.size(); ☃++) {
      i.get(☃)).a.c("Server closed");
    }
  }
  
  public void a(eu ☃, boolean ☃)
  {
    h.a(☃);
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
    mv ☃ = ☃ == null ? null : (mv)o.get(☃);
    if (☃ == null)
    {
      File ☃ = new File(h.a(0).O().b(), "stats");
      File ☃ = new File(☃, ☃.toString() + ".json");
      if (!☃.exists())
      {
        File ☃ = new File(☃, ☃.e_() + ".json");
        if ((☃.exists()) && (☃.isFile())) {
          ☃.renameTo(☃);
        }
      }
      ☃ = new mv(h, ☃);
      ☃.a();
      o.put(☃, ☃);
    }
    return ☃;
  }
  
  public void a(int ☃)
  {
    r = ☃;
    if (h.d == null) {
      return;
    }
    for (le ☃ : h.d) {
      if (☃ != null) {
        ☃.t().a(☃);
      }
    }
  }
  
  public List<lf> v()
  {
    return i;
  }
  
  public lf a(UUID ☃)
  {
    return (lf)j.get(☃);
  }
  
  public boolean f(GameProfile ☃)
  {
    return false;
  }
}
