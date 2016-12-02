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
    this.f = ☃;
    this.e = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public void b()
  {
    this.g = null;
  }
  
  public void a(gt ☃)
  {
    fh.a(☃, this, this.f);
    this.f.c = new bda(this.f, this);
    
    this.g = new bdb(this, new adp(0L, ☃.c(), false, ☃.b(), ☃.g()), ☃.d(), ☃.e(), this.f.A);
    this.f.t.ay = ☃.e();
    this.f.a(this.g);
    this.f.h.am = ☃.d();
    this.f.a(new axs(this));
    this.f.h.d(☃.a());
    this.a = ☃.f();
    this.f.h.k(☃.h());
    
    this.f.c.a(☃.c());
    this.f.t.c();
    this.c.a(new im("MC|Brand", new em(Unpooled.buffer()).a(ClientBrandRetriever.getClientModName())));
  }
  
  public void a(fk ☃)
  {
    fh.a(☃, this, this.f);
    double ☃ = ☃.b() / 32.0D;
    double ☃ = ☃.c() / 32.0D;
    double ☃ = ☃.d() / 32.0D;
    pk ☃ = null;
    if (☃.j() == 10)
    {
      ☃ = va.a(this.g, ☃, ☃, ☃, va.a.a(☃.k()));
    }
    else if (☃.j() == 90)
    {
      pk ☃ = this.g.a(☃.k());
      if ((☃ instanceof wn)) {
        ☃ = new ur(this.g, ☃, ☃, ☃, (wn)☃);
      }
      ☃.g(0);
    }
    else if (☃.j() == 60)
    {
      ☃ = new wq(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 61)
    {
      ☃ = new wx(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 71)
    {
      ☃ = new uo(this.g, new cj(ns.c(☃), ns.c(☃), ns.c(☃)), cq.b(☃.k()));
      ☃.g(0);
    }
    else if (☃.j() == 77)
    {
      ☃ = new up(this.g, new cj(ns.c(☃), ns.c(☃), ns.c(☃)));
      ☃.g(0);
    }
    else if (☃.j() == 65)
    {
      ☃ = new xa(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 72)
    {
      ☃ = new wr(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 76)
    {
      ☃ = new wt(this.g, ☃, ☃, ☃, null);
    }
    else if (☃.j() == 63)
    {
      ☃ = new wu(this.g, ☃, ☃, ☃, ☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      ☃.g(0);
    }
    else if (☃.j() == 64)
    {
      ☃ = new ww(this.g, ☃, ☃, ☃, ☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      ☃.g(0);
    }
    else if (☃.j() == 66)
    {
      ☃ = new xd(this.g, ☃, ☃, ☃, ☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      ☃.g(0);
    }
    else if (☃.j() == 62)
    {
      ☃ = new wz(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 73)
    {
      ☃ = new xc(this.g, ☃, ☃, ☃, ☃.k());
      ☃.g(0);
    }
    else if (☃.j() == 75)
    {
      ☃ = new xb(this.g, ☃, ☃, ☃);
      ☃.g(0);
    }
    else if (☃.j() == 1)
    {
      ☃ = new ux(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 50)
    {
      ☃ = new vj(this.g, ☃, ☃, ☃, null);
    }
    else if (☃.j() == 78)
    {
      ☃ = new um(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 51)
    {
      ☃ = new uf(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 2)
    {
      ☃ = new uz(this.g, ☃, ☃, ☃);
    }
    else if (☃.j() == 70)
    {
      ☃ = new uy(this.g, ☃, ☃, ☃, afh.d(☃.k() & 0xFFFF));
      ☃.g(0);
    }
    if (☃ != null)
    {
      ☃.bW = ☃.b();
      ☃.bX = ☃.c();
      ☃.bY = ☃.d();
      ☃.z = (☃.h() * 360 / 256.0F);
      ☃.y = (☃.i() * 360 / 256.0F);
      pk[] ☃ = ☃.aB();
      if (☃ != null)
      {
        int ☃ = ☃.a() - ☃.F();
        for (int ☃ = 0; ☃ < ☃.length; ☃++) {
          ☃[☃].d(☃[☃].F() + ☃);
        }
      }
      ☃.d(☃.a());
      this.g.a(☃.a(), ☃);
      if (☃.k() > 0)
      {
        if (☃.j() == 60)
        {
          pk ☃ = this.g.a(☃.k());
          if (((☃ instanceof pr)) && ((☃ instanceof wq))) {
            ((wq)☃).c = ☃;
          }
        }
        ☃.i(☃.e() / 8000.0D, ☃.f() / 8000.0D, ☃.g() / 8000.0D);
      }
    }
  }
  
  public void a(fl ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = new pp(this.g, ☃.b() / 32.0D, ☃.c() / 32.0D, ☃.d() / 32.0D, ☃.e());
    ☃.bW = ☃.b();
    ☃.bX = ☃.c();
    ☃.bY = ☃.d();
    ☃.y = 0.0F;
    ☃.z = 0.0F;
    ☃.d(☃.a());
    this.g.a(☃.a(), ☃);
  }
  
  public void a(fm ☃)
  {
    fh.a(☃, this, this.f);
    double ☃ = ☃.b() / 32.0D;
    double ☃ = ☃.c() / 32.0D;
    double ☃ = ☃.d() / 32.0D;
    pk ☃ = null;
    if (☃.e() == 1) {
      ☃ = new uv(this.g, ☃, ☃, ☃);
    }
    if (☃ != null)
    {
      ☃.bW = ☃.b();
      ☃.bX = ☃.c();
      ☃.bY = ☃.d();
      ☃.y = 0.0F;
      ☃.z = 0.0F;
      ☃.d(☃.a());
      this.g.c(☃);
    }
  }
  
  public void a(fo ☃)
  {
    fh.a(☃, this, this.f);
    uq ☃ = new uq(this.g, ☃.b(), ☃.c(), ☃.d());
    this.g.a(☃.a(), ☃);
  }
  
  public void a(hm ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.a());
    if (☃ == null) {
      return;
    }
    ☃.i(☃.b() / 8000.0D, ☃.c() / 8000.0D, ☃.d() / 8000.0D);
  }
  
  public void a(hk ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.b());
    if ((☃ != null) && (☃.a() != null)) {
      ☃.H().a(☃.a());
    }
  }
  
  public void a(fp ☃)
  {
    fh.a(☃, this, this.f);
    double ☃ = ☃.d() / 32.0D;
    double ☃ = ☃.e() / 32.0D;
    double ☃ = ☃.f() / 32.0D;
    float ☃ = ☃.g() * 360 / 256.0F;
    float ☃ = ☃.h() * 360 / 256.0F;
    bex ☃ = new bex(this.f.f, a(☃.c()).a());
    ☃.p = (☃.P = ☃.bW = ☃.d());
    ☃.q = (☃.Q = ☃.bX = ☃.e());
    ☃.r = (☃.R = ☃.bY = ☃.f());
    
    int ☃ = ☃.i();
    if (☃ == 0) {
      ☃.bi.a[☃.bi.c] = null;
    } else {
      ☃.bi.a[☃.bi.c] = new zx(zw.b(☃), 1, 0);
    }
    ☃.a(☃, ☃, ☃, ☃, ☃);
    this.g.a(☃.b(), ☃);
    
    List<pz.a> ☃ = ☃.a();
    if (☃ != null) {
      ☃.H().a(☃);
    }
  }
  
  public void a(hz ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.a());
    if (☃ == null) {
      return;
    }
    ☃.bW = ☃.b();
    ☃.bX = ☃.c();
    ☃.bY = ☃.d();
    double ☃ = ☃.bW / 32.0D;
    double ☃ = ☃.bX / 32.0D;
    double ☃ = ☃.bY / 32.0D;
    float ☃ = ☃.e() * 360 / 256.0F;
    float ☃ = ☃.f() * 360 / 256.0F;
    if ((Math.abs(☃.s - ☃) >= 0.03125D) || (Math.abs(☃.t - ☃) >= 0.015625D) || (Math.abs(☃.u - ☃) >= 0.03125D)) {
      ☃.a(☃, ☃, ☃, ☃, ☃, 3, true);
    } else {
      ☃.a(☃.s, ☃.t, ☃.u, ☃, ☃, 3, true);
    }
    ☃.C = ☃.g();
  }
  
  public void a(hi ☃)
  {
    fh.a(☃, this, this.f);
    if ((☃.a() >= 0) && (☃.a() < wm.i())) {
      this.f.h.bi.c = ☃.a();
    }
  }
  
  public void a(gv ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = ☃.a(this.g);
    if (☃ == null) {
      return;
    }
    ☃.bW += ☃.a();
    ☃.bX += ☃.b();
    ☃.bY += ☃.c();
    double ☃ = ☃.bW / 32.0D;
    double ☃ = ☃.bX / 32.0D;
    double ☃ = ☃.bY / 32.0D;
    float ☃ = ☃.f() ? ☃.d() * 360 / 256.0F : ☃.y;
    float ☃ = ☃.f() ? ☃.e() * 360 / 256.0F : ☃.z;
    ☃.a(☃, ☃, ☃, ☃, ☃, 3, false);
    ☃.C = ☃.g();
  }
  
  public void a(hf ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = ☃.a(this.g);
    if (☃ == null) {
      return;
    }
    float ☃ = ☃.a() * 360 / 256.0F;
    ☃.f(☃);
  }
  
  public void a(hb ☃)
  {
    fh.a(☃, this, this.f);
    for (int ☃ = 0; ☃ < ☃.a().length; ☃++) {
      this.g.e(☃.a()[☃]);
    }
  }
  
  public void a(fi ☃)
  {
    fh.a(☃, this, this.f);
    wn ☃ = this.f.h;
    
    double ☃ = ☃.a();
    double ☃ = ☃.b();
    double ☃ = ☃.c();
    float ☃ = ☃.d();
    float ☃ = ☃.e();
    if (☃.f().contains(fi.a.a)) {
      ☃ += ☃.s;
    } else {
      ☃.v = 0.0D;
    }
    if (☃.f().contains(fi.a.b)) {
      ☃ += ☃.t;
    } else {
      ☃.w = 0.0D;
    }
    if (☃.f().contains(fi.a.c)) {
      ☃ += ☃.u;
    } else {
      ☃.x = 0.0D;
    }
    if (☃.f().contains(fi.a.e)) {
      ☃ += ☃.z;
    }
    if (☃.f().contains(fi.a.d)) {
      ☃ += ☃.y;
    }
    ☃.a(☃, ☃, ☃, ☃, ☃);
    
    this.c.a(new ip.b(☃.s, ☃.aR().b, ☃.u, ☃.y, ☃.z, false));
    if (!this.h)
    {
      this.f.h.p = this.f.h.s;
      this.f.h.q = this.f.h.t;
      this.f.h.r = this.f.h.u;
      this.h = true;
      this.f.a(null);
    }
  }
  
  public void a(fz ☃)
  {
    fh.a(☃, this, this.f);
    for (fz.a ☃ : ☃.a()) {
      this.g.b(☃.a(), ☃.c());
    }
  }
  
  public void a(go ☃)
  {
    fh.a(☃, this, this.f);
    if (☃.e()) {
      if (☃.d() != 0)
      {
        this.g.b(☃.b(), ☃.c(), true);
      }
      else
      {
        this.g.b(☃.b(), ☃.c(), false);
        return;
      }
    }
    this.g.a(☃.b() << 4, 0, ☃.c() << 4, (☃.b() << 4) + 15, 256, (☃.c() << 4) + 15);
    
    amy ☃ = this.g.a(☃.b(), ☃.c());
    
    ☃.a(☃.a(), ☃.d(), ☃.e());
    this.g.b(☃.b() << 4, 0, ☃.c() << 4, (☃.b() << 4) + 15, 256, (☃.c() << 4) + 15);
    if ((!☃.e()) || (!(this.g.t instanceof ano))) {
      ☃.l();
    }
  }
  
  public void a(fv ☃)
  {
    fh.a(☃, this, this.f);
    this.g.b(☃.b(), ☃.a());
  }
  
  public void a(gh ☃)
  {
    this.c.a(☃.a());
  }
  
  public void a(eu ☃)
  {
    this.f.a(null);
    if (this.e != null)
    {
      if ((this.e instanceof awr)) {
        this.f.a(new DisconnectedRealmsScreen(((awr)this.e).a(), "disconnect.lost", ☃).getProxy());
      } else {
        this.f.a(new axh(this.e, "disconnect.lost", ☃));
      }
    }
    else {
      this.f.a(new axh(new azh(new aya()), "disconnect.lost", ☃));
    }
  }
  
  public void a(ff ☃)
  {
    this.c.a(☃);
  }
  
  public void a(hy ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.a());
    pr ☃ = (pr)this.g.a(☃.b());
    if (☃ == null) {
      ☃ = this.f.h;
    }
    if (☃ != null)
    {
      if ((☃ instanceof pp)) {
        this.g.a(☃, "random.orb", 0.2F, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      } else {
        this.g.a(☃, "random.pop", 0.2F, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      }
      this.f.j.a(new bdw(this.g, ☃, ☃, 0.5F));
      this.g.e(☃.a());
    }
  }
  
  public void a(fy ☃)
  {
    fh.a(☃, this, this.f);
    if (☃.c() == 2) {
      this.f.q.a(☃.a(), false);
    } else {
      this.f.q.d().a(☃.a());
    }
  }
  
  public void a(fq ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.a());
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
      this.f.j.a(☃, cy.j);
    }
    else if (☃.b() == 5)
    {
      this.f.j.a(☃, cy.k);
    }
  }
  
  public void a(ha ☃)
  {
    fh.a(☃, this, this.f);
    ☃.a(this.g).a(☃.a());
  }
  
  public void a(fn ☃)
  {
    fh.a(☃, this, this.f);
    double ☃ = ☃.d() / 32.0D;
    double ☃ = ☃.e() / 32.0D;
    double ☃ = ☃.f() / 32.0D;
    float ☃ = ☃.j() * 360 / 256.0F;
    float ☃ = ☃.k() * 360 / 256.0F;
    pr ☃ = (pr)pm.a(☃.c(), this.f.f);
    ☃.bW = ☃.d();
    ☃.bX = ☃.e();
    ☃.bY = ☃.f();
    ☃.aI = (☃.aK = ☃.l() * 360 / 256.0F);
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
    ☃.v = (☃.g() / 8000.0F);
    ☃.w = (☃.h() / 8000.0F);
    ☃.x = (☃.i() / 8000.0F);
    this.g.a(☃.b(), ☃);
    
    List<pz.a> ☃ = ☃.a();
    if (☃ != null) {
      ☃.H().a(☃);
    }
  }
  
  public void a(hu ☃)
  {
    fh.a(☃, this, this.f);
    this.f.f.a(☃.a());
    this.f.f.b(☃.b());
  }
  
  public void a(ht ☃)
  {
    fh.a(☃, this, this.f);
    this.f.h.a(☃.a(), true);
    this.f.f.P().a(☃.a());
  }
  
  public void a(hl ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.b());
    pk ☃ = this.g.a(☃.c());
    if (☃.a() == 0)
    {
      boolean ☃ = false;
      if (☃.b() == this.f.h.F())
      {
        ☃ = this.f.h;
        if ((☃ instanceof ux)) {
          ((ux)☃).a(false);
        }
        ☃ = (☃.m == null) && (☃ != null);
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
        avh ☃ = this.f.t;
        this.f.q.a(bnq.a("mount.onboard", new Object[] { avh.c(☃.ac.i()) }), false);
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
    fh.a(☃, this, this.f);
    pk ☃ = ☃.a(this.g);
    if (☃ != null) {
      if (☃.a() == 21) {
        this.f.W().a(new bpc((vt)☃));
      } else {
        ☃.a(☃.a());
      }
    }
  }
  
  public void a(hp ☃)
  {
    fh.a(☃, this, this.f);
    this.f.h.n(☃.a());
    this.f.h.cl().a(☃.b());
    this.f.h.cl().b(☃.c());
  }
  
  public void a(ho ☃)
  {
    fh.a(☃, this, this.f);
    this.f.h.a(☃.a(), ☃.b(), ☃.c());
  }
  
  public void a(he ☃)
  {
    fh.a(☃, this, this.f);
    if (☃.a() != this.f.h.am)
    {
      this.h = false;
      auo ☃ = this.g.Z();
      this.g = new bdb(this, new adp(0L, ☃.c(), false, this.f.f.P().t(), ☃.d()), ☃.a(), ☃.b(), this.f.A);
      this.g.a(☃);
      this.f.a(this.g);
      this.f.h.am = ☃.a();
      this.f.a(new axs(this));
    }
    this.f.a(☃.a());
    this.f.c.a(☃.c());
  }
  
  public void a(gk ☃)
  {
    fh.a(☃, this, this.f);
    adi ☃ = new adi(this.f.f, null, ☃.d(), ☃.e(), ☃.f(), ☃.g(), ☃.h());
    ☃.a(true);
    
    this.f.h.v += ☃.a();
    this.f.h.w += ☃.b();
    this.f.h.x += ☃.c();
  }
  
  public void a(gc ☃)
  {
    fh.a(☃, this, this.f);
    bew ☃ = this.f.h;
    if ("minecraft:container".equals(☃.b()))
    {
      ☃.a(new oq(☃.c(), ☃.d()));
      ☃.bk.d = ☃.a();
    }
    else if ("minecraft:villager".equals(☃.b()))
    {
      ☃.a(new wg(☃, ☃.c()));
      ☃.bk.d = ☃.a();
    }
    else if ("EntityHorse".equals(☃.b()))
    {
      pk ☃ = this.g.a(☃.e());
      if ((☃ instanceof tp))
      {
        ☃.a((tp)☃, new xj(☃.c(), ☃.d()));
        ☃.bk.d = ☃.a();
      }
    }
    else if (!☃.f())
    {
      ☃.a(new bey(☃.b(), ☃.c()));
      ☃.bk.d = ☃.a();
    }
    else
    {
      bez ☃ = new bez(☃.b(), ☃.c(), ☃.d());
      ☃.a(☃);
      ☃.bk.d = ☃.a();
    }
  }
  
  public void a(gf ☃)
  {
    fh.a(☃, this, this.f);
    wn ☃ = this.f.h;
    if (☃.a() == -1)
    {
      ☃.bi.b(☃.c());
    }
    else
    {
      boolean ☃ = false;
      if ((this.f.m instanceof ayu))
      {
        ayu ☃ = (ayu)this.f.m;
        
        ☃ = ☃.f() != yz.m.a();
      }
      if ((☃.a() == 0) && (☃.b() >= 36) && (☃.b() < 45))
      {
        zx ☃ = ☃.bj.a(☃.b()).d();
        if ((☃.c() != null) && (
          (☃ == null) || (☃.b < ☃.c().b))) {
          ☃.c().c = 5;
        }
        ☃.bj.a(☃.b(), ☃.c());
      }
      else if ((☃.a() == ☃.bk.d) && ((☃.a() != 0) || (!☃)))
      {
        ☃.bk.a(☃.b(), ☃.c());
      }
    }
  }
  
  public void a(ga ☃)
  {
    fh.a(☃, this, this.f);
    xi ☃ = null;
    wn ☃ = this.f.h;
    if (☃.a() == 0) {
      ☃ = ☃.bj;
    } else if (☃.a() == ☃.bk.d) {
      ☃ = ☃.bk;
    }
    if ((☃ != null) && 
      (!☃.c())) {
      a(new ii(☃.a(), ☃.b(), true));
    }
  }
  
  public void a(gd ☃)
  {
    fh.a(☃, this, this.f);
    wn ☃ = this.f.h;
    if (☃.a() == 0) {
      ☃.bj.a(☃.b());
    } else if (☃.a() == ☃.bk.d) {
      ☃.bk.a(☃.b());
    }
  }
  
  public void a(gw ☃)
  {
    fh.a(☃, this, this.f);
    akw ☃ = this.g.s(☃.a());
    if (!(☃ instanceof aln))
    {
      ☃ = new aln();
      ☃.a(this.g);
      ☃.a(☃.a());
    }
    this.f.h.a((aln)☃);
  }
  
  public void a(hw ☃)
  {
    fh.a(☃, this, this.f);
    boolean ☃ = false;
    if (this.f.f.e(☃.a()))
    {
      akw ☃ = this.f.f.s(☃.a());
      if ((☃ instanceof aln))
      {
        aln ☃ = (aln)☃;
        if (☃.b())
        {
          System.arraycopy(☃.b(), 0, ☃.a, 0, 4);
          ☃.p_();
        }
        ☃ = true;
      }
    }
    if ((!☃) && (this.f.h != null)) {
      this.f.h.a(new fa("Unable to locate sign at " + ☃.a().n() + ", " + ☃.a().o() + ", " + ☃.a().p()));
    }
  }
  
  public void a(ft ☃)
  {
    fh.a(☃, this, this.f);
    if (this.f.f.e(☃.a()))
    {
      akw ☃ = this.f.f.s(☃.a());
      int ☃ = ☃.b();
      if (((☃ == 1) && ((☃ instanceof all))) || ((☃ == 2) && ((☃ instanceof akz))) || ((☃ == 3) && ((☃ instanceof akv))) || ((☃ == 4) && ((☃ instanceof alo))) || ((☃ == 5) && ((☃ instanceof alg))) || ((☃ == 6) && ((☃ instanceof aku)))) {
        ☃.a(☃.c());
      }
    }
  }
  
  public void a(ge ☃)
  {
    fh.a(☃, this, this.f);
    wn ☃ = this.f.h;
    if ((☃.bk != null) && (☃.bk.d == ☃.a())) {
      ☃.bk.b(☃.b(), ☃.c());
    }
  }
  
  public void a(hn ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.b());
    if (☃ != null) {
      ☃.c(☃.c(), ☃.a());
    }
  }
  
  public void a(gb ☃)
  {
    fh.a(☃, this, this.f);
    this.f.h.q();
  }
  
  public void a(fu ☃)
  {
    fh.a(☃, this, this.f);
    this.f.f.c(☃.a(), ☃.d(), ☃.b(), ☃.c());
  }
  
  public void a(fs ☃)
  {
    fh.a(☃, this, this.f);
    this.f.f.c(☃.a(), ☃.b(), ☃.c());
  }
  
  public void a(gp ☃)
  {
    fh.a(☃, this, this.f);
    for (int ☃ = 0; ☃ < ☃.a(); ☃++)
    {
      int ☃ = ☃.a(☃);
      int ☃ = ☃.b(☃);
      
      this.g.b(☃, ☃, true);
      
      this.g.a(☃ << 4, 0, ☃ << 4, (☃ << 4) + 15, 256, (☃ << 4) + 15);
      
      amy ☃ = this.g.a(☃, ☃);
      
      ☃.a(☃.c(☃), ☃.d(☃), true);
      this.g.b(☃ << 4, 0, ☃ << 4, (☃ << 4) + 15, 256, (☃ << 4) + 15);
      if (!(this.g.t instanceof ano)) {
        ☃.l();
      }
    }
  }
  
  public void a(gm ☃)
  {
    fh.a(☃, this, this.f);
    wn ☃ = this.f.h;
    int ☃ = ☃.a();
    float ☃ = ☃.b();
    int ☃ = ns.d(☃ + 0.5F);
    if ((☃ >= 0) && (☃ < gm.a.length) && 
      (gm.a[☃] != null)) {
      ☃.b(new fb(gm.a[☃], new Object[0]));
    }
    if (☃ == 1)
    {
      this.g.P().b(true);
      this.g.k(0.0F);
    }
    else if (☃ == 2)
    {
      this.g.P().b(false);
      this.g.k(1.0F);
    }
    else if (☃ == 3)
    {
      this.f.c.a(adp.a.a(☃));
    }
    else if (☃ == 4)
    {
      this.f.a(new ayc());
    }
    else if (☃ == 5)
    {
      avh ☃ = this.f.t;
      if (☃ == 0.0F) {
        this.f.a(new axf());
      } else if (☃ == 101.0F) {
        this.f.q.d().a(new fb("demo.help.movement", new Object[] { avh.c(☃.X.i()), avh.c(☃.Y.i()), avh.c(☃.Z.i()), avh.c(☃.aa.i()) }));
      } else if (☃ == 102.0F) {
        this.f.q.d().a(new fb("demo.help.jump", new Object[] { avh.c(☃.ab.i()) }));
      } else if (☃ == 103.0F) {
        this.f.q.d().a(new fb("demo.help.inventory", new Object[] { avh.c(☃.ae.i()) }));
      }
    }
    else if (☃ == 6)
    {
      this.g.a(☃.s, ☃.t + ☃.aS(), ☃.u, "random.successful_hit", 0.18F, 0.45F, false);
    }
    else if (☃ == 7)
    {
      this.g.k(☃);
    }
    else if (☃ == 8)
    {
      this.g.i(☃);
    }
    else if (☃ == 10)
    {
      this.g.a(cy.P, ☃.s, ☃.t, ☃.u, 0.0D, 0.0D, 0.0D, new int[0]);
      this.g.a(☃.s, ☃.t, ☃.u, "mob.guardian.curse", 1.0F, 1.0F, false);
    }
  }
  
  public void a(gu ☃)
  {
    fh.a(☃, this, this.f);
    atg ☃ = aab.a(☃.a(), this.f.f);
    ☃.a(☃);
    this.f.o.k().a(☃);
  }
  
  public void a(gq ☃)
  {
    fh.a(☃, this, this.f);
    if (☃.a()) {
      this.f.f.a(☃.b(), ☃.d(), ☃.c());
    } else {
      this.f.f.b(☃.b(), ☃.d(), ☃.c());
    }
  }
  
  public void a(fr ☃)
  {
    fh.a(☃, this, this.f);
    boolean ☃ = false;
    for (Map.Entry<mw, Integer> ☃ : ☃.a().entrySet())
    {
      mw ☃ = (mw)☃.getKey();
      int ☃ = ((Integer)☃.getValue()).intValue();
      if ((☃.d()) && (☃ > 0))
      {
        if ((this.j) && (this.f.h.x().a(☃) == 0))
        {
          mq ☃ = (mq)☃;
          this.f.p.a(☃);
          this.f.Y().a(new bqe(☃), 0L);
          if (☃ == mr.f)
          {
            this.f.t.I = false;
            this.f.t.b();
          }
        }
        ☃ = true;
      }
      this.f.h.x().a(this.f.h, ☃, ☃);
    }
    if ((!this.j) && (!☃) && (this.f.t.I)) {
      this.f.p.b(mr.f);
    }
    this.j = true;
    if ((this.f.m instanceof ayg)) {
      ((ayg)this.f.m).a();
    }
  }
  
  public void a(ib ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.b());
    if (!(☃ instanceof pr)) {
      return;
    }
    pf ☃ = new pf(☃.c(), ☃.e(), ☃.d(), false, ☃.f());
    ☃.b(☃.a());
    ((pr)☃).c(☃);
  }
  
  public void a(gy ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.c);
    pr ☃ = (☃ instanceof pr) ? (pr)☃ : null;
    if (☃.a == gy.a.b)
    {
      long ☃ = 1000 * ☃.d / 20;
      bqf ☃ = new bqf(this.f.h, ☃);
      this.f.Y().a(☃, 0L - ☃, 0L);
    }
    else if (☃.a == gy.a.c)
    {
      pk ☃ = this.g.a(☃.b);
      if ((☃ instanceof wn))
      {
        bqg ☃ = new bqg((wn)☃, ☃);
        ☃.a(☃.e);
        this.f.Y().a(☃, 0L);
      }
    }
  }
  
  public void a(fw ☃)
  {
    fh.a(☃, this, this.f);
    this.f.f.P().a(☃.b());
    this.f.f.P().e(☃.a());
  }
  
  public void a(hh ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = ☃.a(this.g);
    if (☃ != null) {
      this.f.a(☃);
    }
  }
  
  public void a(hg ☃)
  {
    fh.a(☃, this, this.f);
    ☃.a(this.g.af());
  }
  
  public void a(hv ☃)
  {
    fh.a(☃, this, this.f);
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
      this.f.q.a("", "", -1, -1, -1);
      this.f.q.a();
      return;
    }
    this.f.q.a(☃, ☃, ☃.c(), ☃.d(), ☃.e());
  }
  
  public void a(gl ☃)
  {
    if (!this.c.c()) {
      this.c.a(☃.a());
    }
  }
  
  public void a(hx ☃)
  {
    this.f.q.h().b(☃.a().d().length() == 0 ? null : ☃.a());
    this.f.q.h().a(☃.b().d().length() == 0 ? null : ☃.b());
  }
  
  public void a(hc ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.a());
    if ((☃ instanceof pr)) {
      ((pr)☃).l(☃.b());
    }
  }
  
  public void a(gz ☃)
  {
    fh.a(☃, this, this.f);
    for (gz.b ☃ : ☃.a()) {
      if (☃.b() == gz.a.e)
      {
        this.i.remove(☃.a().getId());
      }
      else
      {
        bdc ☃ = (bdc)this.i.get(☃.a().getId());
        if (☃.b() == gz.a.a)
        {
          ☃ = new bdc(☃);
          this.i.put(☃.a().getId(), ☃);
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
    fh.a(☃, this, this.f);
    wn ☃ = this.f.h;
    ☃.bA.b = ☃.b();
    ☃.bA.d = ☃.d();
    ☃.bA.a = ☃.a();
    ☃.bA.c = ☃.c();
    ☃.bA.a(☃.e());
    ☃.bA.b(☃.f());
  }
  
  public void a(fx ☃)
  {
    fh.a(☃, this, this.f);
    String[] ☃ = ☃.a();
    if ((this.f.m instanceof awv))
    {
      awv ☃ = (awv)this.f.m;
      
      ☃.a(☃);
    }
  }
  
  public void a(gs ☃)
  {
    fh.a(☃, this, this.f);
    this.f.f.a(☃.b(), ☃.c(), ☃.d(), ☃.a(), ☃.e(), ☃.f(), false);
  }
  
  public void a(hd ☃)
  {
    final String ☃ = ☃.a();
    final String ☃ = ☃.b();
    if (☃.startsWith("level://"))
    {
      String ☃ = ☃.substring("level://".length());
      File ☃ = new File(this.f.v, "saves");
      File ☃ = new File(☃, ☃);
      if (☃.isFile())
      {
        this.c.a(new iu(☃, iu.a.d));
        Futures.addCallback(this.f.R().a(☃), new FutureCallback()
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
        this.c.a(new iu(☃, iu.a.c));
      }
      return;
    }
    if ((this.f.D() != null) && (this.f.D().b() == bde.a.a))
    {
      this.c.a(new iu(☃, iu.a.d));
      Futures.addCallback(this.f.R().a(☃, ☃), new FutureCallback()
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
    else if ((this.f.D() == null) || (this.f.D().b() == bde.a.c))
    {
      this.f.a(new Runnable()
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
                bcy.a(bcy.this).a(new iu(bcy.3.this.a, iu.a.d));
                Futures.addCallback(bcy.b(bcy.this).R().a(bcy.3.this.b, bcy.3.this.a), new FutureCallback()
                {
                  public void onSuccess(Object ☃)
                  {
                    bcy.a(bcy.this).a(new iu(bcy.3.this.a, iu.a.a));
                  }
                  
                  public void onFailure(Throwable ☃)
                  {
                    bcy.a(bcy.this).a(new iu(bcy.3.this.a, iu.a.c));
                  }
                });
              }
              else
              {
                if (bcy.b(bcy.this).D() != null) {
                  bcy.b(bcy.this).D().a(bde.a.b);
                }
                bcy.a(bcy.this).a(new iu(bcy.3.this.a, iu.a.b));
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
      this.c.a(new iu(☃, iu.a.b));
    }
  }
  
  public void a(gj ☃)
  {
    fh.a(☃, this, this.f);
    pk ☃ = ☃.a(this.g);
    if (☃ != null) {
      ☃.g(☃.a());
    }
  }
  
  public void a(gg ☃)
  {
    fh.a(☃, this, this.f);
    if ("MC|TrList".equals(☃.a()))
    {
      em ☃ = ☃.b();
      try
      {
        int ☃ = ☃.readInt();
        axu ☃ = this.f.m;
        if ((☃ != null) && ((☃ instanceof azd)) && (☃ == this.f.h.bk.d))
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
      this.f.h.f(☃.b().c(32767));
    }
    else if ("MC|BOpen".equals(☃.a()))
    {
      zx ☃ = this.f.h.bZ();
      if ((☃ != null) && (☃.b() == zy.bN)) {
        this.f.a(new ayo(this.f.h, ☃, false));
      }
    }
  }
  
  public void a(hq ☃)
  {
    fh.a(☃, this, this.f);
    auo ☃ = this.g.Z();
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
    fh.a(☃, this, this.f);
    auo ☃ = this.g.Z();
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
    fh.a(☃, this, this.f);
    auo ☃ = this.g.Z();
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
    fh.a(☃, this, this.f);
    auo ☃ = this.g.Z();
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
    fh.a(☃, this, this.f);
    if (☃.j() == 0)
    {
      double ☃ = ☃.i() * ☃.f();
      double ☃ = ☃.i() * ☃.g();
      double ☃ = ☃.i() * ☃.h();
      try
      {
        this.g.a(☃.a(), ☃.b(), ☃.c(), ☃.d(), ☃.e(), ☃, ☃, ☃, ☃.k());
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
        double ☃ = this.k.nextGaussian() * ☃.f();
        double ☃ = this.k.nextGaussian() * ☃.g();
        double ☃ = this.k.nextGaussian() * ☃.h();
        double ☃ = this.k.nextGaussian() * ☃.i();
        double ☃ = this.k.nextGaussian() * ☃.i();
        double ☃ = this.k.nextGaussian() * ☃.i();
        try
        {
          this.g.a(☃.a(), ☃.b(), ☃.c() + ☃, ☃.d() + ☃, ☃.e() + ☃, ☃, ☃, ☃, ☃.k());
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
    fh.a(☃, this, this.f);
    pk ☃ = this.g.a(☃.a());
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
    return this.c;
  }
  
  public Collection<bdc> d()
  {
    return this.i.values();
  }
  
  public bdc a(UUID ☃)
  {
    return (bdc)this.i.get(☃);
  }
  
  public bdc a(String ☃)
  {
    for (bdc ☃ : this.i.values()) {
      if (☃.a().getName().equals(☃)) {
        return ☃;
      }
    }
    return null;
  }
  
  public GameProfile e()
  {
    return this.d;
  }
}
