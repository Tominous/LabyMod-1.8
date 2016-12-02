import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.realms.DisconnectedRealmsScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcy
  implements fj
{
  private static final Logger b = ;
  private final ek c;
  private final GameProfile d;
  private final axu e;
  private ave f;
  private bdb g;
  private boolean h;
  private final Map<UUID, bdc> i = Maps.newHashMap();
  public int a = 20;
  private boolean j = false;
  private final Random k = new Random();
  
  public bcy(ave ☃, axu ☃, ek ☃, GameProfile ☃)
  {
    f = ☃;
    e = ☃;
    c = ☃;
    d = ☃;
  }
  
  public void b()
  {
    g = null;
  }
  
  public void a(gt ☃)
  {
    fh.a(☃, this, f);
    f.c = new bda(f, this);
    
    g = new bdb(this, new adp(0L, ☃.c(), false, ☃.b(), ☃.g()), ☃.d(), ☃.e(), f.A);
    f.t.ay = ☃.e();
    f.a(g);
    f.h.am = ☃.d();
    f.a(new axs(this));
    f.h.d(☃.a());
    a = ☃.f();
    f.h.k(☃.h());
    
    f.c.a(☃.c());
    f.t.c();
    c.a(new im("MC|Brand", new em(Unpooled.buffer()).a(ClientBrandRetriever.getClientModName())));
  }
  
  public void a(fk ☃)
  {
    fh.a(☃, this, f);
    double ☃ = ☃.b() / 32.0D;
    double ☃ = ☃.c() / 32.0D;
    double ☃ = ☃.d() / 32.0D;
    pk ☃ = null;
    if (☃.j() == 10)
    {
      ☃ = va.a(g, ☃, ☃, ☃, va.a.a(☃.k()));
    }
    else if (☃.j() == 90)
    {
      pk ☃ = g.a(☃.k());
      if ((☃ instanceof wn)) {
        ☃ = new ur(g, ☃, ☃, ☃, (wn)☃);
      }
      ☃.g(0);
    }
    else if (☃.j() == 60)
    {
      ☃ = new wq(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 61)
    {
      ☃ = new wx(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 71)
    {
      ☃ = new uo(g, new cj(ns.c(☃), ns.c(☃), ns.c(☃)), cq.b(☃.k()));
      ☃.g(0);
    }
    else if (☃.j() == 77)
    {
      ☃ = new up(g, new cj(ns.c(☃), ns.c(☃), ns.c(☃)));
      ☃.g(0);
    }
    else if (☃.j() == 65)
    {
      ☃ = new xa(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 72)
    {
      ☃ = new wr(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 76)
    {
      ☃ = new wt(g, ☃, ☃, ☃, null);
    }
    else if (☃.j() == 63)
    {
      ☃ = new wu(g, ☃, ☃, ☃, ☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      ☃.g(0);
    }
    else if (☃.j() == 64)
    {
      ☃ = new ww(g, ☃, ☃, ☃, ☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      ☃.g(0);
    }
    else if (☃.j() == 66)
    {
      ☃ = new xd(g, ☃, ☃, ☃, ☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      ☃.g(0);
    }
    else if (☃.j() == 62)
    {
      ☃ = new wz(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 73)
    {
      ☃ = new xc(g, ☃, ☃, ☃, ☃.k());
      ☃.g(0);
    }
    else if (☃.j() == 75)
    {
      ☃ = new xb(g, ☃, ☃, ☃);
      ☃.g(0);
    }
    else if (☃.j() == 1)
    {
      ☃ = new ux(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 50)
    {
      ☃ = new vj(g, ☃, ☃, ☃, null);
    }
    else if (☃.j() == 78)
    {
      ☃ = new um(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 51)
    {
      ☃ = new uf(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 2)
    {
      ☃ = new uz(g, ☃, ☃, ☃);
    }
    else if (☃.j() == 70)
    {
      ☃ = new uy(g, ☃, ☃, ☃, afh.d(☃.k() & 0xFFFF));
      ☃.g(0);
    }
    if (☃ != null)
    {
      bW = ☃.b();
      bX = ☃.c();
      bY = ☃.d();
      z = (☃.h() * 360 / 256.0F);
      y = (☃.i() * 360 / 256.0F);
      pk[] ☃ = ☃.aB();
      if (☃ != null)
      {
        int ☃ = ☃.a() - ☃.F();
        for (int ☃ = 0; ☃ < ☃.length; ☃++) {
          ☃[☃].d(☃[☃].F() + ☃);
        }
      }
      ☃.d(☃.a());
      g.a(☃.a(), ☃);
      if (☃.k() > 0)
      {
        if (☃.j() == 60)
        {
          pk ☃ = g.a(☃.k());
          if (((☃ instanceof pr)) && ((☃ instanceof wq))) {
            c = ☃;
          }
        }
        ☃.i(☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      }
    }
  }
  
  public void a(fl ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = new pp(g, ☃.b() / 32.0D, ☃.c() / 32.0D, ☃.d() / 32.0D, ☃.e());
    bW = ☃.b();
    bX = ☃.c();
    bY = ☃.d();
    y = 0.0F;
    z = 0.0F;
    ☃.d(☃.a());
    g.a(☃.a(), ☃);
  }
  
  public void a(fm ☃)
  {
    fh.a(☃, this, f);
    double ☃ = ☃.b() / 32.0D;
    double ☃ = ☃.c() / 32.0D;
    double ☃ = ☃.d() / 32.0D;
    pk ☃ = null;
    if (☃.e() == 1) {
      ☃ = new uv(g, ☃, ☃, ☃);
    }
    if (☃ != null)
    {
      bW = ☃.b();
      bX = ☃.c();
      bY = ☃.d();
      y = 0.0F;
      z = 0.0F;
      ☃.d(☃.a());
      g.c(☃);
    }
  }
  
  public void a(fo ☃)
  {
    fh.a(☃, this, f);
    uq ☃ = new uq(g, ☃.b(), ☃.c(), ☃.d());
    g.a(☃.a(), ☃);
  }
  
  public void a(hm ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.a());
    if (☃ == null) {
      return;
    }
    ☃.i(☃.b() / 8000.0D, ☃.c() / 8000.0D, ☃.d() / 8000.0D);
  }
  
  public void a(hk ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.b());
    if ((☃ != null) && (☃.a() != null)) {
      ☃.H().a(☃.a());
    }
  }
  
  public void a(fp ☃)
  {
    fh.a(☃, this, f);
    double ☃ = ☃.d() / 32.0D;
    double ☃ = ☃.e() / 32.0D;
    double ☃ = ☃.f() / 32.0D;
    float ☃ = ☃.g() * 360 / 256.0F;
    float ☃ = ☃.h() * 360 / 256.0F;
    bex ☃ = new bex(f.f, a(☃.c()).a());
    p = (P = bW = ☃.d());
    q = (Q = bX = ☃.e());
    r = (R = bY = ☃.f());
    
    int ☃ = ☃.i();
    if (☃ == 0) {
      bi.a[bi.c] = null;
    } else {
      bi.a[bi.c] = new zx(zw.b(☃), 1, 0);
    }
    ☃.a(☃, ☃, ☃, ☃, ☃);
    g.a(☃.b(), ☃);
    
    List<pz.a> ☃ = ☃.a();
    if (☃ != null) {
      ☃.H().a(☃);
    }
  }
  
  public void a(hz ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.a());
    if (☃ == null) {
      return;
    }
    bW = ☃.b();
    bX = ☃.c();
    bY = ☃.d();
    double ☃ = bW / 32.0D;
    double ☃ = bX / 32.0D;
    double ☃ = bY / 32.0D;
    float ☃ = ☃.e() * 360 / 256.0F;
    float ☃ = ☃.f() * 360 / 256.0F;
    if ((Math.abs(s - ☃) >= 0.03125D) || (Math.abs(t - ☃) >= 0.015625D) || (Math.abs(u - ☃) >= 0.03125D)) {
      ☃.a(☃, ☃, ☃, ☃, ☃, 3, true);
    } else {
      ☃.a(s, t, u, ☃, ☃, 3, true);
    }
    C = ☃.g();
  }
  
  public void a(hi ☃)
  {
    fh.a(☃, this, f);
    if ((☃.a() >= 0) && (☃.a() < wm.i())) {
      f.h.bi.c = ☃.a();
    }
  }
  
  public void a(gv ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = ☃.a(g);
    if (☃ == null) {
      return;
    }
    bW += ☃.a();
    bX += ☃.b();
    bY += ☃.c();
    double ☃ = bW / 32.0D;
    double ☃ = bX / 32.0D;
    double ☃ = bY / 32.0D;
    float ☃ = ☃.f() ? ☃.d() * 360 / 256.0F : y;
    float ☃ = ☃.f() ? ☃.e() * 360 / 256.0F : z;
    ☃.a(☃, ☃, ☃, ☃, ☃, 3, false);
    C = ☃.g();
  }
  
  public void a(hf ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = ☃.a(g);
    if (☃ == null) {
      return;
    }
    float ☃ = ☃.a() * 360 / 256.0F;
    ☃.f(☃);
  }
  
  public void a(hb ☃)
  {
    fh.a(☃, this, f);
    for (int ☃ = 0; ☃ < ☃.a().length; ☃++) {
      g.e(☃.a()[☃]);
    }
  }
  
  public void a(fi ☃)
  {
    fh.a(☃, this, f);
    wn ☃ = f.h;
    
    double ☃ = ☃.a();
    double ☃ = ☃.b();
    double ☃ = ☃.c();
    float ☃ = ☃.d();
    float ☃ = ☃.e();
    if (☃.f().contains(fi.a.a)) {
      ☃ += s;
    } else {
      v = 0.0D;
    }
    if (☃.f().contains(fi.a.b)) {
      ☃ += t;
    } else {
      w = 0.0D;
    }
    if (☃.f().contains(fi.a.c)) {
      ☃ += u;
    } else {
      x = 0.0D;
    }
    if (☃.f().contains(fi.a.e)) {
      ☃ += z;
    }
    if (☃.f().contains(fi.a.d)) {
      ☃ += y;
    }
    ☃.a(☃, ☃, ☃, ☃, ☃);
    
    c.a(new ip.b(s, aRb, u, y, z, false));
    if (!h)
    {
      f.h.p = f.h.s;
      f.h.q = f.h.t;
      f.h.r = f.h.u;
      h = true;
      f.a(null);
    }
  }
  
  public void a(fz ☃)
  {
    fh.a(☃, this, f);
    for (fz.a ☃ : ☃.a()) {
      g.b(☃.a(), ☃.c());
    }
  }
  
  public void a(go ☃)
  {
    fh.a(☃, this, f);
    if (☃.e()) {
      if (☃.d() != 0)
      {
        g.b(☃.b(), ☃.c(), true);
      }
      else
      {
        g.b(☃.b(), ☃.c(), false);
        return;
      }
    }
    g.a(☃.b() << 4, 0, ☃.c() << 4, (☃.b() << 4) + 15, 256, (☃.c() << 4) + 15);
    
    amy ☃ = g.a(☃.b(), ☃.c());
    
    ☃.a(☃.a(), ☃.d(), ☃.e());
    g.b(☃.b() << 4, 0, ☃.c() << 4, (☃.b() << 4) + 15, 256, (☃.c() << 4) + 15);
    if ((!☃.e()) || (!(g.t instanceof ano))) {
      ☃.l();
    }
  }
  
  public void a(fv ☃)
  {
    fh.a(☃, this, f);
    g.b(☃.b(), ☃.a());
  }
  
  public void a(gh ☃)
  {
    c.a(☃.a());
  }
  
  public void a(eu ☃)
  {
    f.a(null);
    if (e != null)
    {
      if ((e instanceof awr)) {
        f.a(new DisconnectedRealmsScreen(((awr)e).a(), "disconnect.lost", ☃).getProxy());
      } else {
        f.a(new axh(e, "disconnect.lost", ☃));
      }
    }
    else {
      f.a(new axh(new azh(new aya()), "disconnect.lost", ☃));
    }
  }
  
  public void a(ff ☃)
  {
    c.a(☃);
  }
  
  public void a(hy ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.a());
    pr ☃ = (pr)g.a(☃.b());
    if (☃ == null) {
      ☃ = f.h;
    }
    if (☃ != null)
    {
      if ((☃ instanceof pp)) {
        g.a(☃, "random.orb", 0.2F, ((k.nextFloat() - k.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      } else {
        g.a(☃, "random.pop", 0.2F, ((k.nextFloat() - k.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      }
      f.j.a(new bdw(g, ☃, ☃, 0.5F));
      g.e(☃.a());
    }
  }
  
  public void a(fy ☃)
  {
    fh.a(☃, this, f);
    if (☃.c() == 2) {
      f.q.a(☃.a(), false);
    } else {
      f.q.d().a(☃.a());
    }
  }
  
  public void a(fq ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.a());
    if (☃ == null) {
      return;
    }
    if (☃.b() == 0)
    {
      pr ☃ = (pr)☃;
      ☃.bw();
    }
    else if (☃.b() == 1)
    {
      ☃.ar();
    }
    else if (☃.b() == 2)
    {
      wn ☃ = (wn)☃;
      ☃.a(false, false, false);
    }
    else if (☃.b() == 4)
    {
      f.j.a(☃, cy.j);
    }
    else if (☃.b() == 5)
    {
      f.j.a(☃, cy.k);
    }
  }
  
  public void a(ha ☃)
  {
    fh.a(☃, this, f);
    ☃.a(g).a(☃.a());
  }
  
  public void a(fn ☃)
  {
    fh.a(☃, this, f);
    double ☃ = ☃.d() / 32.0D;
    double ☃ = ☃.e() / 32.0D;
    double ☃ = ☃.f() / 32.0D;
    float ☃ = ☃.j() * 360 / 256.0F;
    float ☃ = ☃.k() * 360 / 256.0F;
    pr ☃ = (pr)pm.a(☃.c(), f.f);
    bW = ☃.d();
    bX = ☃.e();
    bY = ☃.f();
    aI = (aK = ☃.l() * 360 / 256.0F);
    pk[] ☃ = ☃.aB();
    if (☃ != null)
    {
      int ☃ = ☃.b() - ☃.F();
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃].d(☃[☃].F() + ☃);
      }
    }
    ☃.d(☃.b());
    ☃.a(☃, ☃, ☃, ☃, ☃);
    v = (☃.g() / 8000.0F);
    w = (☃.h() / 8000.0F);
    x = (☃.i() / 8000.0F);
    g.a(☃.b(), ☃);
    
    List<pz.a> ☃ = ☃.a();
    if (☃ != null) {
      ☃.H().a(☃);
    }
  }
  
  public void a(hu ☃)
  {
    fh.a(☃, this, f);
    f.f.a(☃.a());
    f.f.b(☃.b());
  }
  
  public void a(ht ☃)
  {
    fh.a(☃, this, f);
    f.h.a(☃.a(), true);
    f.f.P().a(☃.a());
  }
  
  public void a(hl ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.b());
    pk ☃ = g.a(☃.c());
    if (☃.a() == 0)
    {
      boolean ☃ = false;
      if (☃.b() == f.h.F())
      {
        ☃ = f.h;
        if ((☃ instanceof ux)) {
          ((ux)☃).a(false);
        }
        ☃ = (m == null) && (☃ != null);
      }
      else if ((☃ instanceof ux))
      {
        ((ux)☃).a(true);
      }
      if (☃ == null) {
        return;
      }
      ☃.a(☃);
      if (☃)
      {
        avh ☃ = f.t;
        f.q.a(bnq.a("mount.onboard", new Object[] { avh.c(ac.i()) }), false);
      }
    }
    else if ((☃.a() == 1) && 
      ((☃ instanceof ps)))
    {
      if (☃ != null) {
        ((ps)☃).a(☃, false);
      } else {
        ((ps)☃).a(false, false);
      }
    }
  }
  
  public void a(gi ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = ☃.a(g);
    if (☃ != null) {
      if (☃.a() == 21) {
        f.W().a(new bpc((vt)☃));
      } else {
        ☃.a(☃.a());
      }
    }
  }
  
  public void a(hp ☃)
  {
    fh.a(☃, this, f);
    f.h.n(☃.a());
    f.h.cl().a(☃.b());
    f.h.cl().b(☃.c());
  }
  
  public void a(ho ☃)
  {
    fh.a(☃, this, f);
    f.h.a(☃.a(), ☃.b(), ☃.c());
  }
  
  public void a(he ☃)
  {
    fh.a(☃, this, f);
    if (☃.a() != f.h.am)
    {
      h = false;
      auo ☃ = g.Z();
      g = new bdb(this, new adp(0L, ☃.c(), false, f.f.P().t(), ☃.d()), ☃.a(), ☃.b(), f.A);
      g.a(☃);
      f.a(g);
      f.h.am = ☃.a();
      f.a(new axs(this));
    }
    f.a(☃.a());
    f.c.a(☃.c());
  }
  
  public void a(gk ☃)
  {
    fh.a(☃, this, f);
    adi ☃ = new adi(f.f, null, ☃.d(), ☃.e(), ☃.f(), ☃.g(), ☃.h());
    ☃.a(true);
    
    f.h.v += ☃.a();
    f.h.w += ☃.b();
    f.h.x += ☃.c();
  }
  
  public void a(gc ☃)
  {
    fh.a(☃, this, f);
    bew ☃ = f.h;
    if ("minecraft:container".equals(☃.b()))
    {
      ☃.a(new oq(☃.c(), ☃.d()));
      bk.d = ☃.a();
    }
    else if ("minecraft:villager".equals(☃.b()))
    {
      ☃.a(new wg(☃, ☃.c()));
      bk.d = ☃.a();
    }
    else if ("EntityHorse".equals(☃.b()))
    {
      pk ☃ = g.a(☃.e());
      if ((☃ instanceof tp))
      {
        ☃.a((tp)☃, new xj(☃.c(), ☃.d()));
        bk.d = ☃.a();
      }
    }
    else if (!☃.f())
    {
      ☃.a(new bey(☃.b(), ☃.c()));
      bk.d = ☃.a();
    }
    else
    {
      bez ☃ = new bez(☃.b(), ☃.c(), ☃.d());
      ☃.a(☃);
      bk.d = ☃.a();
    }
  }
  
  public void a(gf ☃)
  {
    fh.a(☃, this, f);
    wn ☃ = f.h;
    if (☃.a() == -1)
    {
      bi.b(☃.c());
    }
    else
    {
      boolean ☃ = false;
      if ((f.m instanceof ayu))
      {
        ayu ☃ = (ayu)f.m;
        
        ☃ = ☃.f() != yz.m.a();
      }
      if ((☃.a() == 0) && (☃.b() >= 36) && (☃.b() < 45))
      {
        zx ☃ = bj.a(☃.b()).d();
        if ((☃.c() != null) && (
          (☃ == null) || (b < cb))) {
          cc = 5;
        }
        bj.a(☃.b(), ☃.c());
      }
      else if ((☃.a() == bk.d) && ((☃.a() != 0) || (!☃)))
      {
        bk.a(☃.b(), ☃.c());
      }
    }
  }
  
  public void a(ga ☃)
  {
    fh.a(☃, this, f);
    xi ☃ = null;
    wn ☃ = f.h;
    if (☃.a() == 0) {
      ☃ = bj;
    } else if (☃.a() == bk.d) {
      ☃ = bk;
    }
    if ((☃ != null) && 
      (!☃.c())) {
      a(new ii(☃.a(), ☃.b(), true));
    }
  }
  
  public void a(gd ☃)
  {
    fh.a(☃, this, f);
    wn ☃ = f.h;
    if (☃.a() == 0) {
      bj.a(☃.b());
    } else if (☃.a() == bk.d) {
      bk.a(☃.b());
    }
  }
  
  public void a(gw ☃)
  {
    fh.a(☃, this, f);
    akw ☃ = g.s(☃.a());
    if (!(☃ instanceof aln))
    {
      ☃ = new aln();
      ☃.a(g);
      ☃.a(☃.a());
    }
    f.h.a((aln)☃);
  }
  
  public void a(hw ☃)
  {
    fh.a(☃, this, f);
    boolean ☃ = false;
    if (f.f.e(☃.a()))
    {
      akw ☃ = f.f.s(☃.a());
      if ((☃ instanceof aln))
      {
        aln ☃ = (aln)☃;
        if (☃.b())
        {
          System.arraycopy(☃.b(), 0, a, 0, 4);
          ☃.p_();
        }
        ☃ = true;
      }
    }
    if ((!☃) && (f.h != null)) {
      f.h.a(new fa("Unable to locate sign at " + ☃.a().n() + ", " + ☃.a().o() + ", " + ☃.a().p()));
    }
  }
  
  public void a(ft ☃)
  {
    fh.a(☃, this, f);
    if (f.f.e(☃.a()))
    {
      akw ☃ = f.f.s(☃.a());
      int ☃ = ☃.b();
      if (((☃ == 1) && ((☃ instanceof all))) || ((☃ == 2) && ((☃ instanceof akz))) || ((☃ == 3) && ((☃ instanceof akv))) || ((☃ == 4) && ((☃ instanceof alo))) || ((☃ == 5) && ((☃ instanceof alg))) || ((☃ == 6) && ((☃ instanceof aku)))) {
        ☃.a(☃.c());
      }
    }
  }
  
  public void a(ge ☃)
  {
    fh.a(☃, this, f);
    wn ☃ = f.h;
    if ((bk != null) && (bk.d == ☃.a())) {
      bk.b(☃.b(), ☃.c());
    }
  }
  
  public void a(hn ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.b());
    if (☃ != null) {
      ☃.c(☃.c(), ☃.a());
    }
  }
  
  public void a(gb ☃)
  {
    fh.a(☃, this, f);
    f.h.q();
  }
  
  public void a(fu ☃)
  {
    fh.a(☃, this, f);
    f.f.c(☃.a(), ☃.d(), ☃.b(), ☃.c());
  }
  
  public void a(fs ☃)
  {
    fh.a(☃, this, f);
    f.f.c(☃.a(), ☃.b(), ☃.c());
  }
  
  public void a(gp ☃)
  {
    fh.a(☃, this, f);
    for (int ☃ = 0; ☃ < ☃.a(); ☃++)
    {
      int ☃ = ☃.a(☃);
      int ☃ = ☃.b(☃);
      
      g.b(☃, ☃, true);
      
      g.a(☃ << 4, 0, ☃ << 4, (☃ << 4) + 15, 256, (☃ << 4) + 15);
      
      amy ☃ = g.a(☃, ☃);
      
      ☃.a(☃.c(☃), ☃.d(☃), true);
      g.b(☃ << 4, 0, ☃ << 4, (☃ << 4) + 15, 256, (☃ << 4) + 15);
      if (!(g.t instanceof ano)) {
        ☃.l();
      }
    }
  }
  
  public void a(gm ☃)
  {
    fh.a(☃, this, f);
    wn ☃ = f.h;
    int ☃ = ☃.a();
    float ☃ = ☃.b();
    int ☃ = ns.d(☃ + 0.5F);
    if ((☃ >= 0) && (☃ < gm.a.length) && 
      (gm.a[☃] != null)) {
      ☃.b(new fb(gm.a[☃], new Object[0]));
    }
    if (☃ == 1)
    {
      g.P().b(true);
      g.k(0.0F);
    }
    else if (☃ == 2)
    {
      g.P().b(false);
      g.k(1.0F);
    }
    else if (☃ == 3)
    {
      f.c.a(adp.a.a(☃));
    }
    else if (☃ == 4)
    {
      f.a(new ayc());
    }
    else if (☃ == 5)
    {
      avh ☃ = f.t;
      if (☃ == 0.0F) {
        f.a(new axf());
      } else if (☃ == 101.0F) {
        f.q.d().a(new fb("demo.help.movement", new Object[] { avh.c(X.i()), avh.c(Y.i()), avh.c(Z.i()), avh.c(aa.i()) }));
      } else if (☃ == 102.0F) {
        f.q.d().a(new fb("demo.help.jump", new Object[] { avh.c(ab.i()) }));
      } else if (☃ == 103.0F) {
        f.q.d().a(new fb("demo.help.inventory", new Object[] { avh.c(ae.i()) }));
      }
    }
    else if (☃ == 6)
    {
      g.a(s, t + ☃.aS(), u, "random.successful_hit", 0.18F, 0.45F, false);
    }
    else if (☃ == 7)
    {
      g.k(☃);
    }
    else if (☃ == 8)
    {
      g.i(☃);
    }
    else if (☃ == 10)
    {
      g.a(cy.P, s, t, u, 0.0D, 0.0D, 0.0D, new int[0]);
      g.a(s, t, u, "mob.guardian.curse", 1.0F, 1.0F, false);
    }
  }
  
  public void a(gu ☃)
  {
    fh.a(☃, this, f);
    atg ☃ = aab.a(☃.a(), f.f);
    ☃.a(☃);
    f.o.k().a(☃);
  }
  
  public void a(gq ☃)
  {
    fh.a(☃, this, f);
    if (☃.a()) {
      f.f.a(☃.b(), ☃.d(), ☃.c());
    } else {
      f.f.b(☃.b(), ☃.d(), ☃.c());
    }
  }
  
  public void a(fr ☃)
  {
    fh.a(☃, this, f);
    boolean ☃ = false;
    for (Map.Entry<mw, Integer> ☃ : ☃.a().entrySet())
    {
      mw ☃ = (mw)☃.getKey();
      int ☃ = ((Integer)☃.getValue()).intValue();
      if ((☃.d()) && (☃ > 0))
      {
        if ((j) && (f.h.x().a(☃) == 0))
        {
          mq ☃ = (mq)☃;
          f.p.a(☃);
          f.Y().a(new bqe(☃), 0L);
          if (☃ == mr.f)
          {
            f.t.I = false;
            f.t.b();
          }
        }
        ☃ = true;
      }
      f.h.x().a(f.h, ☃, ☃);
    }
    if ((!j) && (!☃) && (f.t.I)) {
      f.p.b(mr.f);
    }
    j = true;
    if ((f.m instanceof ayg)) {
      ((ayg)f.m).a();
    }
  }
  
  public void a(ib ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.b());
    if (!(☃ instanceof pr)) {
      return;
    }
    pf ☃ = new pf(☃.c(), ☃.e(), ☃.d(), false, ☃.f());
    ☃.b(☃.a());
    ((pr)☃).c(☃);
  }
  
  public void a(gy ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(c);
    pr ☃ = (☃ instanceof pr) ? (pr)☃ : null;
    if (a == gy.a.b)
    {
      long ☃ = 1000 * d / 20;
      bqf ☃ = new bqf(f.h, ☃);
      f.Y().a(☃, 0L - ☃, 0L);
    }
    else if (a == gy.a.c)
    {
      pk ☃ = g.a(b);
      if ((☃ instanceof wn))
      {
        bqg ☃ = new bqg((wn)☃, ☃);
        ☃.a(e);
        f.Y().a(☃, 0L);
      }
    }
  }
  
  public void a(fw ☃)
  {
    fh.a(☃, this, f);
    f.f.P().a(☃.b());
    f.f.P().e(☃.a());
  }
  
  public void a(hh ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = ☃.a(g);
    if (☃ != null) {
      f.a(☃);
    }
  }
  
  public void a(hg ☃)
  {
    fh.a(☃, this, f);
    ☃.a(g.af());
  }
  
  public void a(hv ☃)
  {
    fh.a(☃, this, f);
    hv.a ☃ = ☃.a();
    String ☃ = null;
    String ☃ = null;
    String ☃ = ☃.b() != null ? ☃.b().d() : "";
    switch (bcy.4.a[☃.ordinal()])
    {
    case 1: 
      ☃ = ☃;
      break;
    case 2: 
      ☃ = ☃;
      break;
    case 3: 
      f.q.a("", "", -1, -1, -1);
      f.q.a();
      return;
    }
    f.q.a(☃, ☃, ☃.c(), ☃.d(), ☃.e());
  }
  
  public void a(gl ☃)
  {
    if (!c.c()) {
      c.a(☃.a());
    }
  }
  
  public void a(hx ☃)
  {
    f.q.h().b(☃.a().d().length() == 0 ? null : ☃.a());
    f.q.h().a(☃.b().d().length() == 0 ? null : ☃.b());
  }
  
  public void a(hc ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.a());
    if ((☃ instanceof pr)) {
      ((pr)☃).l(☃.b());
    }
  }
  
  public void a(gz ☃)
  {
    fh.a(☃, this, f);
    for (gz.b ☃ : ☃.a()) {
      if (☃.b() == gz.a.e)
      {
        i.remove(☃.a().getId());
      }
      else
      {
        bdc ☃ = (bdc)i.get(☃.a().getId());
        if (☃.b() == gz.a.a)
        {
          ☃ = new bdc(☃);
          i.put(☃.a().getId(), ☃);
        }
        if (☃ != null) {
          switch (bcy.4.b[☃.b().ordinal()])
          {
          case 1: 
            ☃.a(☃.c());
            ☃.a(☃.b());
            break;
          case 2: 
            ☃.a(☃.c());
            break;
          case 3: 
            ☃.a(☃.b());
            break;
          case 4: 
            ☃.a(☃.d());
          }
        }
      }
    }
  }
  
  public void a(gn ☃)
  {
    a(new io(☃.a()));
  }
  
  public void a(gx ☃)
  {
    fh.a(☃, this, f);
    wn ☃ = f.h;
    bA.b = ☃.b();
    bA.d = ☃.d();
    bA.a = ☃.a();
    bA.c = ☃.c();
    bA.a(☃.e());
    bA.b(☃.f());
  }
  
  public void a(fx ☃)
  {
    fh.a(☃, this, f);
    String[] ☃ = ☃.a();
    if ((f.m instanceof awv))
    {
      awv ☃ = (awv)f.m;
      
      ☃.a(☃);
    }
  }
  
  public void a(gs ☃)
  {
    fh.a(☃, this, f);
    f.f.a(☃.b(), ☃.c(), ☃.d(), ☃.a(), ☃.e(), ☃.f(), false);
  }
  
  public void a(hd ☃)
  {
    final String ☃ = ☃.a();
    final String ☃ = ☃.b();
    if (☃.startsWith("level://"))
    {
      String ☃ = ☃.substring("level://".length());
      File ☃ = new File(f.v, "saves");
      File ☃ = new File(☃, ☃);
      if (☃.isFile())
      {
        c.a(new iu(☃, iu.a.d));
        Futures.addCallback(f.R().a(☃), new FutureCallback()
        {
          public void onSuccess(Object ☃)
          {
            bcy.a(bcy.this).a(new iu(☃, iu.a.a));
          }
          
          public void onFailure(Throwable ☃)
          {
            bcy.a(bcy.this).a(new iu(☃, iu.a.c));
          }
        });
      }
      else
      {
        c.a(new iu(☃, iu.a.c));
      }
      return;
    }
    if ((f.D() != null) && (f.D().b() == bde.a.a))
    {
      c.a(new iu(☃, iu.a.d));
      Futures.addCallback(f.R().a(☃, ☃), new FutureCallback()
      {
        public void onSuccess(Object ☃)
        {
          bcy.a(bcy.this).a(new iu(☃, iu.a.a));
        }
        
        public void onFailure(Throwable ☃)
        {
          bcy.a(bcy.this).a(new iu(☃, iu.a.c));
        }
      });
    }
    else if ((f.D() == null) || (f.D().b() == bde.a.c))
    {
      f.a(new Runnable()
      {
        public void run()
        {
          bcy.b(bcy.this).a(new awy(new awx()
          {
            public void a(boolean ☃, int ☃)
            {
              bcy.a(bcy.this, ave.A());
              if (☃)
              {
                if (bcy.b(bcy.this).D() != null) {
                  bcy.b(bcy.this).D().a(bde.a.a);
                }
                bcy.a(bcy.this).a(new iu(a, iu.a.d));
                Futures.addCallback(bcy.b(bcy.this).R().a(b, a), new FutureCallback()
                {
                  public void onSuccess(Object ☃)
                  {
                    bcy.a(bcy.this).a(new iu(a, iu.a.a));
                  }
                  
                  public void onFailure(Throwable ☃)
                  {
                    bcy.a(bcy.this).a(new iu(a, iu.a.c));
                  }
                });
              }
              else
              {
                if (bcy.b(bcy.this).D() != null) {
                  bcy.b(bcy.this).D().a(bde.a.b);
                }
                bcy.a(bcy.this).a(new iu(a, iu.a.b));
              }
              bdf.b(bcy.b(bcy.this).D());
              
              bcy.b(bcy.this).a(null);
            }
          }, bnq.a("multiplayer.texturePrompt.line1", new Object[0]), bnq.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
        }
      });
    }
    else
    {
      c.a(new iu(☃, iu.a.b));
    }
  }
  
  public void a(gj ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = ☃.a(g);
    if (☃ != null) {
      ☃.g(☃.a());
    }
  }
  
  public void a(gg ☃)
  {
    fh.a(☃, this, f);
    if ("MC|TrList".equals(☃.a()))
    {
      em ☃ = ☃.b();
      try
      {
        int ☃ = ☃.readInt();
        axu ☃ = f.m;
        if ((☃ != null) && ((☃ instanceof azd)) && (☃ == f.h.bk.d))
        {
          acy ☃ = ((azd)☃).a();
          ada ☃ = ada.b(☃);
          ☃.a(☃);
        }
      }
      catch (IOException ☃)
      {
        b.error("Couldn't load trade info", ☃);
      }
      finally
      {
        ☃.release();
      }
    }
    else if ("MC|Brand".equals(☃.a()))
    {
      f.h.f(☃.b().c(32767));
    }
    else if ("MC|BOpen".equals(☃.a()))
    {
      zx ☃ = f.h.bZ();
      if ((☃ != null) && (☃.b() == zy.bN)) {
        f.a(new ayo(f.h, ☃, false));
      }
    }
  }
  
  public void a(hq ☃)
  {
    fh.a(☃, this, f);
    auo ☃ = g.Z();
    if (☃.c() == 0)
    {
      auk ☃ = ☃.a(☃.a(), auu.b);
      ☃.a(☃.b());
      ☃.a(☃.d());
    }
    else
    {
      auk ☃ = ☃.b(☃.a());
      if (☃.c() == 1)
      {
        ☃.k(☃);
      }
      else if (☃.c() == 2)
      {
        ☃.a(☃.b());
        ☃.a(☃.d());
      }
    }
  }
  
  public void a(hs ☃)
  {
    fh.a(☃, this, f);
    auo ☃ = g.Z();
    auk ☃ = ☃.b(☃.b());
    if (☃.d() == hs.a.a)
    {
      aum ☃ = ☃.c(☃.a(), ☃);
      
      ☃.c(☃.c());
    }
    else if (☃.d() == hs.a.b)
    {
      if (nx.b(☃.b())) {
        ☃.d(☃.a(), null);
      } else if (☃ != null) {
        ☃.d(☃.a(), ☃);
      }
    }
  }
  
  public void a(hj ☃)
  {
    fh.a(☃, this, f);
    auo ☃ = g.Z();
    if (☃.b().length() == 0)
    {
      ☃.a(☃.a(), null);
    }
    else
    {
      auk ☃ = ☃.b(☃.b());
      ☃.a(☃.a(), ☃);
    }
  }
  
  public void a(hr ☃)
  {
    fh.a(☃, this, f);
    auo ☃ = g.Z();
    aul ☃;
    aul ☃;
    if (☃.f() == 0) {
      ☃ = ☃.e(☃.a());
    } else {
      ☃ = ☃.d(☃.a());
    }
    if ((☃.f() == 0) || (☃.f() == 2))
    {
      ☃.a(☃.b());
      ☃.b(☃.c());
      ☃.c(☃.d());
      ☃.a(a.a(☃.h()));
      ☃.a(☃.g());
      auq.a ☃ = auq.a.a(☃.i());
      if (☃ != null) {
        ☃.a(☃);
      }
    }
    if ((☃.f() == 0) || (☃.f() == 3)) {
      for (String ☃ : ☃.e()) {
        ☃.a(☃, ☃.a());
      }
    }
    if (☃.f() == 4) {
      for (String ☃ : ☃.e()) {
        ☃.a(☃, ☃);
      }
    }
    if (☃.f() == 1) {
      ☃.d(☃);
    }
  }
  
  public void a(gr ☃)
  {
    fh.a(☃, this, f);
    if (☃.j() == 0)
    {
      double ☃ = ☃.i() * ☃.f();
      double ☃ = ☃.i() * ☃.g();
      double ☃ = ☃.i() * ☃.h();
      try
      {
        g.a(☃.a(), ☃.b(), ☃.c(), ☃.d(), ☃.e(), ☃, ☃, ☃, ☃.k());
      }
      catch (Throwable ☃)
      {
        b.warn("Could not spawn particle effect " + ☃.a());
      }
    }
    else
    {
      for (int ☃ = 0; ☃ < ☃.j(); ☃++)
      {
        double ☃ = k.nextGaussian() * ☃.f();
        double ☃ = k.nextGaussian() * ☃.g();
        double ☃ = k.nextGaussian() * ☃.h();
        double ☃ = k.nextGaussian() * ☃.i();
        double ☃ = k.nextGaussian() * ☃.i();
        double ☃ = k.nextGaussian() * ☃.i();
        try
        {
          g.a(☃.a(), ☃.b(), ☃.c() + ☃, ☃.d() + ☃, ☃.e() + ☃, ☃, ☃, ☃, ☃.k());
        }
        catch (Throwable ☃)
        {
          b.warn("Could not spawn particle effect " + ☃.a());
          return;
        }
      }
    }
  }
  
  public void a(ia ☃)
  {
    fh.a(☃, this, f);
    pk ☃ = g.a(☃.a());
    if (☃ == null) {
      return;
    }
    if (!(☃ instanceof pr)) {
      throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + ☃ + ")");
    }
    qf ☃ = ((pr)☃).by();
    for (ia.a ☃ : ☃.b())
    {
      ☃ = ☃.a(☃.a());
      if (☃ == null) {
        ☃ = ☃.b(new qj(null, ☃.a(), 0.0D, 2.2250738585072014E-308D, Double.MAX_VALUE));
      }
      ☃.a(☃.b());
      ☃.d();
      for (qd ☃ : ☃.c()) {
        ☃.b(☃);
      }
    }
    qc ☃;
  }
  
  public ek a()
  {
    return c;
  }
  
  public Collection<bdc> d()
  {
    return i.values();
  }
  
  public bdc a(UUID ☃)
  {
    return (bdc)i.get(☃);
  }
  
  public bdc a(String ☃)
  {
    for (bdc ☃ : i.values()) {
      if (☃.a().getName().equals(☃)) {
        return ☃;
      }
    }
    return null;
  }
  
  public GameProfile e()
  {
    return d;
  }
}
