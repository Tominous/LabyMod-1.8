import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lm
  implements ic, km
{
  private static final Logger c = ;
  public final ek a;
  private final MinecraftServer d;
  public lf b;
  private int e;
  private int f;
  private int g;
  private boolean h;
  private int i;
  private long j;
  private long k;
  private int l;
  private int m;
  private nm<Short> n = new nm();
  private double o;
  private double p;
  private double q;
  
  public lm(MinecraftServer ☃, ek ☃, lf ☃)
  {
    this.d = ☃;
    this.a = ☃;
    ☃.a(this);
    this.b = ☃;
    ☃.a = this;
  }
  
  public void c()
  {
    this.h = false;
    this.e += 1;
    
    this.d.c.a("keepAlive");
    if (this.e - this.k > 40L)
    {
      this.k = this.e;
      this.j = d();
      this.i = ((int)this.j);
      a(new gn(this.i));
    }
    this.d.c.b();
    if (this.l > 0) {
      this.l -= 1;
    }
    if (this.m > 0) {
      this.m -= 1;
    }
    if ((this.b.D() > 0L) && (this.d.aA() > 0) && (MinecraftServer.az() - this.b.D() > this.d.aA() * 1000 * 60)) {
      c("You have been idle for too long!");
    }
  }
  
  public ek a()
  {
    return this.a;
  }
  
  public void c(String ☃)
  {
    final fa ☃ = new fa(☃);
    this.a.a(new gh(☃), new GenericFutureListener()
    {
      public void operationComplete(Future<? super Void> ☃)
        throws Exception
      {
        lm.this.a.a(☃);
      }
    }, new GenericFutureListener[0]);
    
    this.a.k();
    Futures.getUnchecked(this.d.a(new Runnable()
    {
      public void run()
      {
        lm.this.a.l();
      }
    }));
  }
  
  private boolean r = true;
  
  public void a(it ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.a(☃.a(), ☃.b(), ☃.c(), ☃.d());
  }
  
  private boolean b(ip ☃)
  {
    if ((Doubles.isFinite(☃.a())) && (Doubles.isFinite(☃.b())) && (Doubles.isFinite(☃.c())) && (Floats.isFinite(☃.e())) && (Floats.isFinite(☃.d()))) {
      return false;
    }
    return true;
  }
  
  public void a(ip ☃)
  {
    fh.a(☃, this, this.b.u());
    if (b(☃))
    {
      c("Invalid move packet received");
      return;
    }
    le ☃ = this.d.a(this.b.am);
    
    this.h = true;
    if (this.b.i) {
      return;
    }
    double ☃ = this.b.s;
    double ☃ = this.b.t;
    double ☃ = this.b.u;
    double ☃ = 0.0D;
    
    double ☃ = ☃.a() - this.o;
    double ☃ = ☃.b() - this.p;
    double ☃ = ☃.c() - this.q;
    if (☃.g())
    {
      ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if ((!this.r) && 
        (☃ < 0.25D)) {
        this.r = true;
      }
    }
    if (this.r)
    {
      this.f = this.e;
      if (this.b.m != null)
      {
        float ☃ = this.b.y;
        float ☃ = this.b.z;
        this.b.m.al();
        double ☃ = this.b.s;
        double ☃ = this.b.t;
        double ☃ = this.b.u;
        if (☃.h())
        {
          ☃ = ☃.d();
          ☃ = ☃.e();
        }
        this.b.C = ☃.f();
        this.b.l();
        this.b.a(☃, ☃, ☃, ☃, ☃);
        if (this.b.m != null) {
          this.b.m.al();
        }
        this.d.ap().d(this.b);
        if (this.b.m != null)
        {
          if (☃ > 4.0D)
          {
            pk ☃ = this.b.m;
            this.b.a.a(new hz(☃));
            a(this.b.s, this.b.t, this.b.u, this.b.y, this.b.z);
          }
          this.b.m.ai = true;
        }
        if (this.r)
        {
          this.o = this.b.s;
          this.p = this.b.t;
          this.q = this.b.u;
        }
        ☃.g(this.b);
        return;
      }
      if (this.b.bJ())
      {
        this.b.l();
        this.b.a(this.o, this.p, this.q, this.b.y, this.b.z);
        ☃.g(this.b);
        return;
      }
      double ☃ = this.b.t;
      this.o = this.b.s;
      this.p = this.b.t;
      this.q = this.b.u;
      
      double ☃ = this.b.s;
      double ☃ = this.b.t;
      double ☃ = this.b.u;
      
      float ☃ = this.b.y;
      float ☃ = this.b.z;
      if ((☃.g()) && (☃.b() == -999.0D)) {
        ☃.a(false);
      }
      if (☃.g())
      {
        ☃ = ☃.a();
        ☃ = ☃.b();
        ☃ = ☃.c();
        if ((Math.abs(☃.a()) > 3.0E7D) || (Math.abs(☃.c()) > 3.0E7D))
        {
          c("Illegal position");
          return;
        }
      }
      if (☃.h())
      {
        ☃ = ☃.d();
        ☃ = ☃.e();
      }
      this.b.l();
      this.b.a(this.o, this.p, this.q, ☃, ☃);
      if (!this.r) {
        return;
      }
      double ☃ = ☃ - this.b.s;
      double ☃ = ☃ - this.b.t;
      double ☃ = ☃ - this.b.u;
      
      double ☃ = this.b.v * this.b.v + this.b.w * this.b.w + this.b.x * this.b.x;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if ((☃ - ☃ > 100.0D) && ((!this.d.T()) || (!this.d.S().equals(this.b.e_()))))
      {
        c.warn(this.b.e_() + " moved too quickly! " + ☃ + "," + ☃ + "," + ☃ + " (" + ☃ + ", " + ☃ + ", " + ☃ + ")");
        a(this.o, this.p, this.q, this.b.y, this.b.z);
        return;
      }
      float ☃ = 0.0625F;
      boolean ☃ = ☃.a(this.b, this.b.aR().d(☃, ☃, ☃)).isEmpty();
      if ((this.b.C) && (!☃.f()) && (☃ > 0.0D)) {
        this.b.bF();
      }
      this.b.d(☃, ☃, ☃);
      this.b.C = ☃.f();
      
      double ☃ = ☃;
      
      ☃ = ☃ - this.b.s;
      ☃ = ☃ - this.b.t;
      if ((☃ > -0.5D) || (☃ < 0.5D)) {
        ☃ = 0.0D;
      }
      ☃ = ☃ - this.b.u;
      ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      boolean ☃ = false;
      if ((☃ > 0.0625D) && (!this.b.bJ()) && (!this.b.c.d()))
      {
        ☃ = true;
        c.warn(this.b.e_() + " moved wrongly!");
      }
      this.b.a(☃, ☃, ☃, ☃, ☃);
      
      this.b.k(this.b.s - ☃, this.b.t - ☃, this.b.u - ☃);
      if (!this.b.T)
      {
        boolean ☃ = ☃.a(this.b, this.b.aR().d(☃, ☃, ☃)).isEmpty();
        if ((☃) && ((☃) || (!☃)) && (!this.b.bJ()))
        {
          a(this.o, this.p, this.q, ☃, ☃);
          return;
        }
      }
      aug ☃ = this.b.aR().b(☃, ☃, ☃).a(0.0D, -0.55D, 0.0D);
      if ((!this.d.ak()) && (!this.b.bA.c) && (!☃.c(☃)))
      {
        if (☃ >= -0.03125D)
        {
          this.g += 1;
          if (this.g > 80)
          {
            c.warn(this.b.e_() + " was kicked for floating too long!");
            c("Flying is not enabled on this server");
          }
        }
      }
      else {
        this.g = 0;
      }
      this.b.C = ☃.f();
      this.d.ap().d(this.b);
      this.b.a(this.b.t - ☃, ☃.f());
    }
    else if (this.e - this.f > 20)
    {
      a(this.o, this.p, this.q, this.b.y, this.b.z);
    }
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, Collections.emptySet());
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, Set<fi.a> ☃)
  {
    this.r = false;
    this.o = ☃;
    this.p = ☃;
    this.q = ☃;
    if (☃.contains(fi.a.a)) {
      this.o += this.b.s;
    }
    if (☃.contains(fi.a.b)) {
      this.p += this.b.t;
    }
    if (☃.contains(fi.a.c)) {
      this.q += this.b.u;
    }
    float ☃ = ☃;
    float ☃ = ☃;
    if (☃.contains(fi.a.d)) {
      ☃ += this.b.y;
    }
    if (☃.contains(fi.a.e)) {
      ☃ += this.b.z;
    }
    this.b.a(this.o, this.p, this.q, ☃, ☃);
    this.b.a.a(new fi(☃, ☃, ☃, ☃, ☃, ☃));
  }
  
  public void a(ir ☃)
  {
    fh.a(☃, this, this.b.u());
    le ☃ = this.d.a(this.b.am);
    cj ☃ = ☃.a();
    this.b.z();
    switch (lm.4.a[☃.c().ordinal()])
    {
    case 1: 
      if (!this.b.v()) {
        this.b.a(false);
      }
      return;
    case 2: 
      if (!this.b.v()) {
        this.b.a(true);
      }
      return;
    case 3: 
      this.b.bU();
      return;
    case 4: 
    case 5: 
    case 6: 
      double ☃ = this.b.s - (☃.n() + 0.5D);
      
      double ☃ = this.b.t - (☃.o() + 0.5D) + 1.5D;
      double ☃ = this.b.u - (☃.p() + 0.5D);
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (☃ > 36.0D) {
        return;
      }
      if (☃.o() >= this.d.an()) {
        return;
      }
      break;
    default: 
      throw new IllegalArgumentException("Invalid player action");
    }
    if (☃.c() == ir.a.a)
    {
      if ((!this.d.a(☃, ☃, this.b)) && (☃.af().a(☃))) {
        this.b.c.a(☃, ☃.b());
      } else {
        this.b.a.a(new fv(☃, ☃));
      }
    }
    else
    {
      if (☃.c() == ir.a.c) {
        this.b.c.a(☃);
      } else if (☃.c() == ir.a.b) {
        this.b.c.e();
      }
      if (☃.p(☃).c().t() != arm.a) {
        this.b.a.a(new fv(☃, ☃));
      }
    }
  }
  
  public void a(ja ☃)
  {
    fh.a(☃, this, this.b.u());
    le ☃ = this.d.a(this.b.am);
    zx ☃ = this.b.bi.h();
    boolean ☃ = false;
    cj ☃ = ☃.a();
    cq ☃ = cq.a(☃.b());
    this.b.z();
    if (☃.b() == 255)
    {
      if (☃ == null) {
        return;
      }
      this.b.c.a(this.b, ☃, ☃);
    }
    else if ((☃.o() < this.d.an() - 1) || ((☃ != cq.b) && (☃.o() < this.d.an())))
    {
      if ((this.r) && (this.b.e(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D) < 64.0D) && 
        (!this.d.a(☃, ☃, this.b)) && (☃.af().a(☃))) {
        this.b.c.a(this.b, ☃, ☃, ☃, ☃, ☃.d(), ☃.e(), ☃.f());
      }
      ☃ = true;
    }
    else
    {
      fb ☃ = new fb("build.tooHigh", new Object[] { Integer.valueOf(this.d.an()) });
      ☃.b().a(a.m);
      this.b.a.a(new fy(☃));
      ☃ = true;
    }
    if (☃)
    {
      this.b.a.a(new fv(☃, ☃));
      this.b.a.a(new fv(☃, ☃.a(☃)));
    }
    ☃ = this.b.bi.h();
    if ((☃ != null) && (☃.b == 0))
    {
      this.b.bi.a[this.b.bi.c] = null;
      ☃ = null;
    }
    if ((☃ == null) || (☃.l() == 0))
    {
      this.b.g = true;
      this.b.bi.a[this.b.bi.c] = zx.b(this.b.bi.a[this.b.bi.c]);
      yg ☃ = this.b.bk.a(this.b.bi, this.b.bi.c);
      this.b.bk.b();
      this.b.g = false;
      if (!zx.b(this.b.bi.h(), ☃.c())) {
        a(new gf(this.b.bk.d, ☃.e, this.b.bi.h()));
      }
    }
  }
  
  public void a(iz ☃)
  {
    fh.a(☃, this, this.b.u());
    if (this.b.v())
    {
      pk ☃ = null;
      for (le ☃ : this.d.d) {
        if (☃ != null)
        {
          ☃ = ☃.a(☃);
          if (☃ != null) {
            break;
          }
        }
      }
      if (☃ != null)
      {
        this.b.e(this.b);
        this.b.a(null);
        if (☃.o != this.b.o)
        {
          le ☃ = this.b.u();
          le ☃ = (le)☃.o;
          
          this.b.am = ☃.am;
          a(new he(this.b.am, ☃.aa(), ☃.P().u(), this.b.c.b()));
          
          ☃.f(this.b);
          this.b.I = false;
          
          this.b.b(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
          if (this.b.ai())
          {
            ☃.a(this.b, false);
            ☃.d(this.b);
            ☃.a(this.b, false);
          }
          this.b.a(☃);
          
          this.d.ap().a(this.b, ☃);
          
          this.b.a(☃.s, ☃.t, ☃.u);
          this.b.c.a(☃);
          this.d.ap().b(this.b, ☃);
          this.d.ap().f(this.b);
        }
        else
        {
          this.b.a(☃.s, ☃.t, ☃.u);
        }
      }
    }
  }
  
  public void a(iu ☃) {}
  
  public void a(eu ☃)
  {
    c.info(this.b.e_() + " lost connection: " + ☃);
    this.d.aH();
    fb ☃ = new fb("multiplayer.player.left", new Object[] { this.b.f_() });
    ☃.b().a(a.o);
    this.d.ap().a(☃);
    this.b.q();
    this.d.ap().e(this.b);
    if ((this.d.T()) && (this.b.e_().equals(this.d.S())))
    {
      c.info("Stopping singleplayer server as player logged out");
      this.d.w();
    }
  }
  
  public void a(final ff ☃)
  {
    if ((☃ instanceof fy))
    {
      fy ☃ = (fy)☃;
      wn.b ☃ = this.b.y();
      if (☃ == wn.b.c) {
        return;
      }
      if ((☃ == wn.b.b) && (!☃.b())) {
        return;
      }
    }
    try
    {
      this.a.a(☃);
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Sending packet");
      c ☃ = ☃.a("Packet being sent");
      
      ☃.a("Packet class", new Callable()
      {
        public String a()
          throws Exception
        {
          return ☃.getClass().getCanonicalName();
        }
      });
      throw new e(☃);
    }
  }
  
  public void a(iv ☃)
  {
    fh.a(☃, this, this.b.u());
    if ((☃.a() < 0) || (☃.a() >= wm.i()))
    {
      c.warn(this.b.e_() + " tried to set an invalid carried item");
      return;
    }
    this.b.bi.c = ☃.a();
    this.b.z();
  }
  
  public void a(ie ☃)
  {
    fh.a(☃, this, this.b.u());
    if (this.b.y() == wn.b.c)
    {
      fb ☃ = new fb("chat.cannotSend", new Object[0]);
      ☃.b().a(a.m);
      a(new fy(☃));
      return;
    }
    this.b.z();
    
    String ☃ = ☃.a();
    ☃ = StringUtils.normalizeSpace(☃);
    for (int ☃ = 0; ☃ < ☃.length(); ☃++) {
      if (!f.a(☃.charAt(☃)))
      {
        c("Illegal characters in chat");
        return;
      }
    }
    if (☃.startsWith("/"))
    {
      d(☃);
    }
    else
    {
      eu ☃ = new fb("chat.type.text", new Object[] { this.b.f_(), ☃ });
      this.d.ap().a(☃, false);
    }
    this.l += 20;
    if ((this.l > 200) && (!this.d.ap().h(this.b.cd()))) {
      c("disconnect.spam");
    }
  }
  
  private void d(String ☃)
  {
    this.d.P().a(this.b, ☃);
  }
  
  public void a(iy ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.z();
    this.b.bw();
  }
  
  public void a(is ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.z();
    switch (lm.4.b[☃.b().ordinal()])
    {
    case 1: 
      this.b.c(true);
      break;
    case 2: 
      this.b.c(false);
      break;
    case 3: 
      this.b.d(true);
      break;
    case 4: 
      this.b.d(false);
      break;
    case 5: 
      this.b.a(false, true, true);
      this.r = false;
      break;
    case 6: 
      if ((this.b.m instanceof tp)) {
        ((tp)this.b.m).v(☃.c());
      }
      break;
    case 7: 
      if ((this.b.m instanceof tp)) {
        ((tp)this.b.m).g(this.b);
      }
      break;
    default: 
      throw new IllegalArgumentException("Invalid client command!");
    }
  }
  
  public void a(in ☃)
  {
    fh.a(☃, this, this.b.u());
    le ☃ = this.d.a(this.b.am);
    pk ☃ = ☃.a(☃);
    this.b.z();
    if (☃ != null)
    {
      boolean ☃ = this.b.t(☃);
      double ☃ = 36.0D;
      if (!☃) {
        ☃ = 9.0D;
      }
      if (this.b.h(☃) < ☃) {
        if (☃.a() == in.a.a)
        {
          this.b.u(☃);
        }
        else if (☃.a() == in.a.c)
        {
          ☃.a(this.b, ☃.b());
        }
        else if (☃.a() == in.a.b)
        {
          if (((☃ instanceof uz)) || ((☃ instanceof pp)) || ((☃ instanceof wq)) || (☃ == this.b))
          {
            c("Attempting to attack an invalid entity");
            this.d.f("Player " + this.b.e_() + " tried to attack an invalid entity");
            return;
          }
          this.b.f(☃);
        }
      }
    }
  }
  
  public void a(ig ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.z();
    ig.a ☃ = ☃.a();
    switch (lm.4.c[☃.ordinal()])
    {
    case 1: 
      if (this.b.i)
      {
        this.b = this.d.ap().a(this.b, 0, true);
      }
      else if (this.b.u().P().t())
      {
        if ((this.d.T()) && (this.b.e_().equals(this.d.S())))
        {
          this.b.a.c("You have died. Game over, man, it's game over!");
          this.d.aa();
        }
        else
        {
          md ☃ = new md(this.b.cd(), null, "(You just lost the game)", null, "Death in Hardcore");
          
          this.d.ap().h().a(☃);
          this.b.a.c("You have died. Game over, man, it's game over!");
        }
      }
      else
      {
        if (this.b.bn() > 0.0F) {
          return;
        }
        this.b = this.d.ap().a(this.b, 0, false);
      }
      break;
    case 2: 
      this.b.A().a(this.b);
      break;
    case 3: 
      this.b.b(mr.f);
    }
  }
  
  public void a(il ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.p();
  }
  
  public void a(ik ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.z();
    if ((this.b.bk.d == ☃.a()) && (this.b.bk.c(this.b))) {
      if (this.b.v())
      {
        List<zx> ☃ = Lists.newArrayList();
        for (int ☃ = 0; ☃ < this.b.bk.c.size(); ☃++) {
          ☃.add(((yg)this.b.bk.c.get(☃)).d());
        }
        this.b.a(this.b.bk, ☃);
      }
      else
      {
        zx ☃ = this.b.bk.a(☃.b(), ☃.c(), ☃.f(), this.b);
        if (zx.b(☃.e(), ☃))
        {
          this.b.a.a(new ga(☃.a(), ☃.d(), true));
          this.b.g = true;
          this.b.bk.b();
          this.b.o();
          this.b.g = false;
        }
        else
        {
          this.n.a(this.b.bk.d, Short.valueOf(☃.d()));
          this.b.a.a(new ga(☃.a(), ☃.d(), false));
          this.b.bk.a(this.b, false);
          
          List<zx> ☃ = Lists.newArrayList();
          for (int ☃ = 0; ☃ < this.b.bk.c.size(); ☃++) {
            ☃.add(((yg)this.b.bk.c.get(☃)).d());
          }
          this.b.a(this.b.bk, ☃);
        }
      }
    }
  }
  
  public void a(ij ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.z();
    if ((this.b.bk.d == ☃.a()) && (this.b.bk.c(this.b)) && (!this.b.v()))
    {
      this.b.bk.a(this.b, ☃.b());
      this.b.bk.b();
    }
  }
  
  public void a(iw ☃)
  {
    fh.a(☃, this, this.b.u());
    if (this.b.c.d())
    {
      boolean ☃ = ☃.a() < 0;
      zx ☃ = ☃.b();
      if ((☃ != null) && (☃.n()) && (☃.o().b("BlockEntityTag", 10)))
      {
        dn ☃ = ☃.o().m("BlockEntityTag");
        if ((☃.c("x")) && (☃.c("y")) && (☃.c("z")))
        {
          cj ☃ = new cj(☃.f("x"), ☃.f("y"), ☃.f("z"));
          akw ☃ = this.b.o.s(☃);
          if (☃ != null)
          {
            dn ☃ = new dn();
            ☃.b(☃);
            ☃.o("x");
            ☃.o("y");
            ☃.o("z");
            ☃.a("BlockEntityTag", ☃);
          }
        }
      }
      boolean ☃ = (☃.a() >= 1) && (☃.a() < 36 + wm.i());
      boolean ☃ = (☃ == null) || (☃.b() != null);
      boolean ☃ = (☃ == null) || ((☃.i() >= 0) && (☃.b <= 64) && (☃.b > 0));
      if ((☃) && (☃) && (☃))
      {
        if (☃ == null) {
          this.b.bj.a(☃.a(), null);
        } else {
          this.b.bj.a(☃.a(), ☃);
        }
        this.b.bj.a(this.b, true);
      }
      else if ((☃) && (☃) && (☃) && 
        (this.m < 200))
      {
        this.m += 20;
        
        uz ☃ = this.b.a(☃, true);
        if (☃ != null) {
          ☃.j();
        }
      }
    }
  }
  
  public void a(ii ☃)
  {
    fh.a(☃, this, this.b.u());
    Short ☃ = (Short)this.n.a(this.b.bk.d);
    if ((☃ != null) && (☃.b() == ☃.shortValue()) && (this.b.bk.d == ☃.a()) && (!this.b.bk.c(this.b)) && (!this.b.v())) {
      this.b.bk.a(this.b, true);
    }
  }
  
  public void a(ix ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.z();
    le ☃ = this.d.a(this.b.am);
    cj ☃ = ☃.a();
    if (☃.e(☃))
    {
      akw ☃ = ☃.s(☃);
      if (!(☃ instanceof aln)) {
        return;
      }
      aln ☃ = (aln)☃;
      if ((!☃.b()) || (☃.c() != this.b))
      {
        this.d.f("Player " + this.b.e_() + " just tried to change non-editable sign");
        return;
      }
      eu[] ☃ = ☃.b();
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃.a[☃] = new fa(a.a(☃[☃].c()));
      }
      ☃.p_();
      ☃.h(☃);
    }
  }
  
  public void a(io ☃)
  {
    if (☃.a() == this.i)
    {
      int ☃ = (int)(d() - this.j);
      this.b.h = ((this.b.h * 3 + ☃) / 4);
    }
  }
  
  private long d()
  {
    return System.nanoTime() / 1000000L;
  }
  
  public void a(iq ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.bA.b = ((☃.b()) && (this.b.bA.c));
  }
  
  public void a(id ☃)
  {
    fh.a(☃, this, this.b.u());
    List<String> ☃ = Lists.newArrayList();
    for (String ☃ : this.d.a(this.b, ☃.a(), ☃.b())) {
      ☃.add(☃);
    }
    this.b.a.a(new fx((String[])☃.toArray(new String[☃.size()])));
  }
  
  public void a(ih ☃)
  {
    fh.a(☃, this, this.b.u());
    this.b.a(☃);
  }
  
  public void a(im ☃)
  {
    fh.a(☃, this, this.b.u());
    if ("MC|BEdit".equals(☃.a()))
    {
      em ☃ = new em(Unpooled.wrappedBuffer(☃.b()));
      try
      {
        zx ☃ = ☃.i();
        if (☃ == null) {
          return;
        }
        if (!abc.b(☃.o())) {
          throw new IOException("Invalid book tag!");
        }
        zx ☃ = this.b.bi.h();
        if (☃ == null) {
          return;
        }
        if ((☃.b() == zy.bM) && (☃.b() == ☃.b())) {
          ☃.a("pages", ☃.o().c("pages", 8));
        }
      }
      catch (Exception ☃)
      {
        c.error("Couldn't handle book info", ☃);
      }
      finally
      {
        ☃.release();
      }
    }
    else if ("MC|BSign".equals(☃.a()))
    {
      em ☃ = new em(Unpooled.wrappedBuffer(☃.b()));
      try
      {
        zx ☃ = ☃.i();
        if (☃ == null) {
          return;
        }
        if (!abd.b(☃.o())) {
          throw new IOException("Invalid book tag!");
        }
        zx ☃ = this.b.bi.h();
        if (☃ == null) {
          return;
        }
        if ((☃.b() == zy.bN) && (☃.b() == zy.bM))
        {
          ☃.a("author", new ea(this.b.e_()));
          ☃.a("title", new ea(☃.o().j("title")));
          ☃.a("pages", ☃.o().c("pages", 8));
          ☃.a(zy.bN);
        }
      }
      catch (Exception ☃)
      {
        c.error("Couldn't sign book", ☃);
      }
      finally
      {
        ☃.release();
      }
    }
    else if ("MC|TrSel".equals(☃.a()))
    {
      try
      {
        int ☃ = ☃.b().readInt();
        xi ☃ = this.b.bk;
        if ((☃ instanceof yb)) {
          ((yb)☃).d(☃);
        }
      }
      catch (Exception ☃)
      {
        c.error("Couldn't select trade", ☃);
      }
    }
    else if ("MC|AdvCdm".equals(☃.a()))
    {
      if (!this.d.al())
      {
        this.b.a(new fb("advMode.notEnabled", new Object[0]));
      }
      else if ((this.b.a(2, "")) && (this.b.bA.d))
      {
        em ☃ = ☃.b();
        try
        {
          int ☃ = ☃.readByte();
          adc ☃ = null;
          if (☃ == 0)
          {
            akw ☃ = this.b.o.s(new cj(☃.readInt(), ☃.readInt(), ☃.readInt()));
            if ((☃ instanceof akz)) {
              ☃ = ((akz)☃).b();
            }
          }
          else if (☃ == 1)
          {
            pk ☃ = this.b.o.a(☃.readInt());
            if ((☃ instanceof vc)) {
              ☃ = ((vc)☃).j();
            }
          }
          String ☃ = ☃.c(☃.readableBytes());
          boolean ☃ = ☃.readBoolean();
          if (☃ != null)
          {
            ☃.a(☃);
            ☃.a(☃);
            if (!☃) {
              ☃.b(null);
            }
            ☃.h();
            this.b.a(new fb("advMode.setCommand.success", new Object[] { ☃ }));
          }
        }
        catch (Exception ☃)
        {
          c.error("Couldn't set command block", ☃);
        }
        finally
        {
          ☃.release();
        }
      }
      else
      {
        this.b.a(new fb("advMode.notAllowed", new Object[0]));
      }
    }
    else if ("MC|Beacon".equals(☃.a()))
    {
      if ((this.b.bk instanceof xl)) {
        try
        {
          em ☃ = ☃.b();
          int ☃ = ☃.readInt();
          int ☃ = ☃.readInt();
          
          xl ☃ = (xl)this.b.bk;
          yg ☃ = ☃.a(0);
          if (☃.e())
          {
            ☃.a(1);
            og ☃ = ☃.e();
            ☃.b(1, ☃);
            ☃.b(2, ☃);
            ☃.p_();
          }
        }
        catch (Exception ☃)
        {
          c.error("Couldn't set beacon", ☃);
        }
      }
    }
    else if (("MC|ItemName".equals(☃.a())) && 
      ((this.b.bk instanceof xk)))
    {
      xk ☃ = (xk)this.b.bk;
      if ((☃.b() == null) || (☃.b().readableBytes() < 1))
      {
        ☃.a("");
      }
      else
      {
        String ☃ = f.a(☃.b().c(32767));
        if (☃.length() <= 30) {
          ☃.a(☃);
        }
      }
    }
  }
}
