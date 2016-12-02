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
    d = ☃;
    a = ☃;
    ☃.a(this);
    b = ☃;
    a = this;
  }
  
  public void c()
  {
    h = false;
    e += 1;
    
    d.c.a("keepAlive");
    if (e - k > 40L)
    {
      k = e;
      j = d();
      i = ((int)j);
      a(new gn(i));
    }
    d.c.b();
    if (l > 0) {
      l -= 1;
    }
    if (m > 0) {
      m -= 1;
    }
    if ((b.D() > 0L) && (d.aA() > 0) && (MinecraftServer.az() - b.D() > d.aA() * 1000 * 60)) {
      c("You have been idle for too long!");
    }
  }
  
  public ek a()
  {
    return a;
  }
  
  public void c(String ☃)
  {
    final fa ☃ = new fa(☃);
    a.a(new gh(☃), new GenericFutureListener()
    {
      public void operationComplete(Future<? super Void> ☃)
        throws Exception
      {
        a.a(☃);
      }
    }, new GenericFutureListener[0]);
    
    a.k();
    Futures.getUnchecked(d.a(new Runnable()
    {
      public void run()
      {
        a.l();
      }
    }));
  }
  
  private boolean r = true;
  
  public void a(it ☃)
  {
    fh.a(☃, this, b.u());
    b.a(☃.a(), ☃.b(), ☃.c(), ☃.d());
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
    fh.a(☃, this, b.u());
    if (b(☃))
    {
      c("Invalid move packet received");
      return;
    }
    le ☃ = d.a(b.am);
    
    h = true;
    if (b.i) {
      return;
    }
    double ☃ = b.s;
    double ☃ = b.t;
    double ☃ = b.u;
    double ☃ = 0.0D;
    
    double ☃ = ☃.a() - o;
    double ☃ = ☃.b() - p;
    double ☃ = ☃.c() - q;
    if (☃.g())
    {
      ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if ((!r) && 
        (☃ < 0.25D)) {
        r = true;
      }
    }
    if (r)
    {
      f = e;
      if (b.m != null)
      {
        float ☃ = b.y;
        float ☃ = b.z;
        b.m.al();
        double ☃ = b.s;
        double ☃ = b.t;
        double ☃ = b.u;
        if (☃.h())
        {
          ☃ = ☃.d();
          ☃ = ☃.e();
        }
        b.C = ☃.f();
        b.l();
        b.a(☃, ☃, ☃, ☃, ☃);
        if (b.m != null) {
          b.m.al();
        }
        d.ap().d(b);
        if (b.m != null)
        {
          if (☃ > 4.0D)
          {
            pk ☃ = b.m;
            b.a.a(new hz(☃));
            a(b.s, b.t, b.u, b.y, b.z);
          }
          b.m.ai = true;
        }
        if (r)
        {
          o = b.s;
          p = b.t;
          q = b.u;
        }
        ☃.g(b);
        return;
      }
      if (b.bJ())
      {
        b.l();
        b.a(o, p, q, b.y, b.z);
        ☃.g(b);
        return;
      }
      double ☃ = b.t;
      o = b.s;
      p = b.t;
      q = b.u;
      
      double ☃ = b.s;
      double ☃ = b.t;
      double ☃ = b.u;
      
      float ☃ = b.y;
      float ☃ = b.z;
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
      b.l();
      b.a(o, p, q, ☃, ☃);
      if (!r) {
        return;
      }
      double ☃ = ☃ - b.s;
      double ☃ = ☃ - b.t;
      double ☃ = ☃ - b.u;
      
      double ☃ = b.v * b.v + b.w * b.w + b.x * b.x;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if ((☃ - ☃ > 100.0D) && ((!d.T()) || (!d.S().equals(b.e_()))))
      {
        c.warn(b.e_() + " moved too quickly! " + ☃ + "," + ☃ + "," + ☃ + " (" + ☃ + ", " + ☃ + ", " + ☃ + ")");
        a(o, p, q, b.y, b.z);
        return;
      }
      float ☃ = 0.0625F;
      boolean ☃ = ☃.a(b, b.aR().d(☃, ☃, ☃)).isEmpty();
      if ((b.C) && (!☃.f()) && (☃ > 0.0D)) {
        b.bF();
      }
      b.d(☃, ☃, ☃);
      b.C = ☃.f();
      
      double ☃ = ☃;
      
      ☃ = ☃ - b.s;
      ☃ = ☃ - b.t;
      if ((☃ > -0.5D) || (☃ < 0.5D)) {
        ☃ = 0.0D;
      }
      ☃ = ☃ - b.u;
      ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      boolean ☃ = false;
      if ((☃ > 0.0625D) && (!b.bJ()) && (!b.c.d()))
      {
        ☃ = true;
        c.warn(b.e_() + " moved wrongly!");
      }
      b.a(☃, ☃, ☃, ☃, ☃);
      
      b.k(b.s - ☃, b.t - ☃, b.u - ☃);
      if (!b.T)
      {
        boolean ☃ = ☃.a(b, b.aR().d(☃, ☃, ☃)).isEmpty();
        if ((☃) && ((☃) || (!☃)) && (!b.bJ()))
        {
          a(o, p, q, ☃, ☃);
          return;
        }
      }
      aug ☃ = b.aR().b(☃, ☃, ☃).a(0.0D, -0.55D, 0.0D);
      if ((!d.ak()) && (!b.bA.c) && (!☃.c(☃)))
      {
        if (☃ >= -0.03125D)
        {
          g += 1;
          if (g > 80)
          {
            c.warn(b.e_() + " was kicked for floating too long!");
            c("Flying is not enabled on this server");
          }
        }
      }
      else {
        g = 0;
      }
      b.C = ☃.f();
      d.ap().d(b);
      b.a(b.t - ☃, ☃.f());
    }
    else if (e - f > 20)
    {
      a(o, p, q, b.y, b.z);
    }
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, Collections.emptySet());
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, Set<fi.a> ☃)
  {
    r = false;
    o = ☃;
    p = ☃;
    q = ☃;
    if (☃.contains(fi.a.a)) {
      o += b.s;
    }
    if (☃.contains(fi.a.b)) {
      p += b.t;
    }
    if (☃.contains(fi.a.c)) {
      q += b.u;
    }
    float ☃ = ☃;
    float ☃ = ☃;
    if (☃.contains(fi.a.d)) {
      ☃ += b.y;
    }
    if (☃.contains(fi.a.e)) {
      ☃ += b.z;
    }
    b.a(o, p, q, ☃, ☃);
    b.a.a(new fi(☃, ☃, ☃, ☃, ☃, ☃));
  }
  
  public void a(ir ☃)
  {
    fh.a(☃, this, b.u());
    le ☃ = d.a(b.am);
    cj ☃ = ☃.a();
    b.z();
    switch (lm.4.a[☃.c().ordinal()])
    {
    case 1: 
      if (!b.v()) {
        b.a(false);
      }
      return;
    case 2: 
      if (!b.v()) {
        b.a(true);
      }
      return;
    case 3: 
      b.bU();
      return;
    case 4: 
    case 5: 
    case 6: 
      double ☃ = b.s - (☃.n() + 0.5D);
      
      double ☃ = b.t - (☃.o() + 0.5D) + 1.5D;
      double ☃ = b.u - (☃.p() + 0.5D);
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (☃ > 36.0D) {
        return;
      }
      if (☃.o() >= d.an()) {
        return;
      }
      break;
    default: 
      throw new IllegalArgumentException("Invalid player action");
    }
    if (☃.c() == ir.a.a)
    {
      if ((!d.a(☃, ☃, b)) && (☃.af().a(☃))) {
        b.c.a(☃, ☃.b());
      } else {
        b.a.a(new fv(☃, ☃));
      }
    }
    else
    {
      if (☃.c() == ir.a.c) {
        b.c.a(☃);
      } else if (☃.c() == ir.a.b) {
        b.c.e();
      }
      if (☃.p(☃).c().t() != arm.a) {
        b.a.a(new fv(☃, ☃));
      }
    }
  }
  
  public void a(ja ☃)
  {
    fh.a(☃, this, b.u());
    le ☃ = d.a(b.am);
    zx ☃ = b.bi.h();
    boolean ☃ = false;
    cj ☃ = ☃.a();
    cq ☃ = cq.a(☃.b());
    b.z();
    if (☃.b() == 255)
    {
      if (☃ == null) {
        return;
      }
      b.c.a(b, ☃, ☃);
    }
    else if ((☃.o() < d.an() - 1) || ((☃ != cq.b) && (☃.o() < d.an())))
    {
      if ((r) && (b.e(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D) < 64.0D) && 
        (!d.a(☃, ☃, b)) && (☃.af().a(☃))) {
        b.c.a(b, ☃, ☃, ☃, ☃, ☃.d(), ☃.e(), ☃.f());
      }
      ☃ = true;
    }
    else
    {
      fb ☃ = new fb("build.tooHigh", new Object[] { Integer.valueOf(d.an()) });
      ☃.b().a(a.m);
      b.a.a(new fy(☃));
      ☃ = true;
    }
    if (☃)
    {
      b.a.a(new fv(☃, ☃));
      b.a.a(new fv(☃, ☃.a(☃)));
    }
    ☃ = b.bi.h();
    if ((☃ != null) && (b == 0))
    {
      b.bi.a[b.bi.c] = null;
      ☃ = null;
    }
    if ((☃ == null) || (☃.l() == 0))
    {
      b.g = true;
      b.bi.a[b.bi.c] = zx.b(b.bi.a[b.bi.c]);
      yg ☃ = b.bk.a(b.bi, b.bi.c);
      b.bk.b();
      b.g = false;
      if (!zx.b(b.bi.h(), ☃.c())) {
        a(new gf(b.bk.d, e, b.bi.h()));
      }
    }
  }
  
  public void a(iz ☃)
  {
    fh.a(☃, this, b.u());
    if (b.v())
    {
      pk ☃ = null;
      for (le ☃ : d.d) {
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
        b.e(b);
        b.a(null);
        if (o != b.o)
        {
          le ☃ = b.u();
          le ☃ = (le)o;
          
          b.am = am;
          a(new he(b.am, ☃.aa(), ☃.P().u(), b.c.b()));
          
          ☃.f(b);
          b.I = false;
          
          b.b(s, t, u, y, z);
          if (b.ai())
          {
            ☃.a(b, false);
            ☃.d(b);
            ☃.a(b, false);
          }
          b.a(☃);
          
          d.ap().a(b, ☃);
          
          b.a(s, t, u);
          b.c.a(☃);
          d.ap().b(b, ☃);
          d.ap().f(b);
        }
        else
        {
          b.a(s, t, u);
        }
      }
    }
  }
  
  public void a(iu ☃) {}
  
  public void a(eu ☃)
  {
    c.info(b.e_() + " lost connection: " + ☃);
    d.aH();
    fb ☃ = new fb("multiplayer.player.left", new Object[] { b.f_() });
    ☃.b().a(a.o);
    d.ap().a(☃);
    b.q();
    d.ap().e(b);
    if ((d.T()) && (b.e_().equals(d.S())))
    {
      c.info("Stopping singleplayer server as player logged out");
      d.w();
    }
  }
  
  public void a(final ff ☃)
  {
    if ((☃ instanceof fy))
    {
      fy ☃ = (fy)☃;
      wn.b ☃ = b.y();
      if (☃ == wn.b.c) {
        return;
      }
      if ((☃ == wn.b.b) && (!☃.b())) {
        return;
      }
    }
    try
    {
      a.a(☃);
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
    fh.a(☃, this, b.u());
    if ((☃.a() < 0) || (☃.a() >= wm.i()))
    {
      c.warn(b.e_() + " tried to set an invalid carried item");
      return;
    }
    b.bi.c = ☃.a();
    b.z();
  }
  
  public void a(ie ☃)
  {
    fh.a(☃, this, b.u());
    if (b.y() == wn.b.c)
    {
      fb ☃ = new fb("chat.cannotSend", new Object[0]);
      ☃.b().a(a.m);
      a(new fy(☃));
      return;
    }
    b.z();
    
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
      eu ☃ = new fb("chat.type.text", new Object[] { b.f_(), ☃ });
      d.ap().a(☃, false);
    }
    l += 20;
    if ((l > 200) && (!d.ap().h(b.cd()))) {
      c("disconnect.spam");
    }
  }
  
  private void d(String ☃)
  {
    d.P().a(b, ☃);
  }
  
  public void a(iy ☃)
  {
    fh.a(☃, this, b.u());
    b.z();
    b.bw();
  }
  
  public void a(is ☃)
  {
    fh.a(☃, this, b.u());
    b.z();
    switch (lm.4.b[☃.b().ordinal()])
    {
    case 1: 
      b.c(true);
      break;
    case 2: 
      b.c(false);
      break;
    case 3: 
      b.d(true);
      break;
    case 4: 
      b.d(false);
      break;
    case 5: 
      b.a(false, true, true);
      r = false;
      break;
    case 6: 
      if ((b.m instanceof tp)) {
        ((tp)b.m).v(☃.c());
      }
      break;
    case 7: 
      if ((b.m instanceof tp)) {
        ((tp)b.m).g(b);
      }
      break;
    default: 
      throw new IllegalArgumentException("Invalid client command!");
    }
  }
  
  public void a(in ☃)
  {
    fh.a(☃, this, b.u());
    le ☃ = d.a(b.am);
    pk ☃ = ☃.a(☃);
    b.z();
    if (☃ != null)
    {
      boolean ☃ = b.t(☃);
      double ☃ = 36.0D;
      if (!☃) {
        ☃ = 9.0D;
      }
      if (b.h(☃) < ☃) {
        if (☃.a() == in.a.a)
        {
          b.u(☃);
        }
        else if (☃.a() == in.a.c)
        {
          ☃.a(b, ☃.b());
        }
        else if (☃.a() == in.a.b)
        {
          if (((☃ instanceof uz)) || ((☃ instanceof pp)) || ((☃ instanceof wq)) || (☃ == b))
          {
            c("Attempting to attack an invalid entity");
            d.f("Player " + b.e_() + " tried to attack an invalid entity");
            return;
          }
          b.f(☃);
        }
      }
    }
  }
  
  public void a(ig ☃)
  {
    fh.a(☃, this, b.u());
    b.z();
    ig.a ☃ = ☃.a();
    switch (lm.4.c[☃.ordinal()])
    {
    case 1: 
      if (b.i)
      {
        b = d.ap().a(b, 0, true);
      }
      else if (b.u().P().t())
      {
        if ((d.T()) && (b.e_().equals(d.S())))
        {
          b.a.c("You have died. Game over, man, it's game over!");
          d.aa();
        }
        else
        {
          md ☃ = new md(b.cd(), null, "(You just lost the game)", null, "Death in Hardcore");
          
          d.ap().h().a(☃);
          b.a.c("You have died. Game over, man, it's game over!");
        }
      }
      else
      {
        if (b.bn() > 0.0F) {
          return;
        }
        b = d.ap().a(b, 0, false);
      }
      break;
    case 2: 
      b.A().a(b);
      break;
    case 3: 
      b.b(mr.f);
    }
  }
  
  public void a(il ☃)
  {
    fh.a(☃, this, b.u());
    b.p();
  }
  
  public void a(ik ☃)
  {
    fh.a(☃, this, b.u());
    b.z();
    if ((b.bk.d == ☃.a()) && (b.bk.c(b))) {
      if (b.v())
      {
        List<zx> ☃ = Lists.newArrayList();
        for (int ☃ = 0; ☃ < b.bk.c.size(); ☃++) {
          ☃.add(((yg)b.bk.c.get(☃)).d());
        }
        b.a(b.bk, ☃);
      }
      else
      {
        zx ☃ = b.bk.a(☃.b(), ☃.c(), ☃.f(), b);
        if (zx.b(☃.e(), ☃))
        {
          b.a.a(new ga(☃.a(), ☃.d(), true));
          b.g = true;
          b.bk.b();
          b.o();
          b.g = false;
        }
        else
        {
          n.a(b.bk.d, Short.valueOf(☃.d()));
          b.a.a(new ga(☃.a(), ☃.d(), false));
          b.bk.a(b, false);
          
          List<zx> ☃ = Lists.newArrayList();
          for (int ☃ = 0; ☃ < b.bk.c.size(); ☃++) {
            ☃.add(((yg)b.bk.c.get(☃)).d());
          }
          b.a(b.bk, ☃);
        }
      }
    }
  }
  
  public void a(ij ☃)
  {
    fh.a(☃, this, b.u());
    b.z();
    if ((b.bk.d == ☃.a()) && (b.bk.c(b)) && (!b.v()))
    {
      b.bk.a(b, ☃.b());
      b.bk.b();
    }
  }
  
  public void a(iw ☃)
  {
    fh.a(☃, this, b.u());
    if (b.c.d())
    {
      boolean ☃ = ☃.a() < 0;
      zx ☃ = ☃.b();
      if ((☃ != null) && (☃.n()) && (☃.o().b("BlockEntityTag", 10)))
      {
        dn ☃ = ☃.o().m("BlockEntityTag");
        if ((☃.c("x")) && (☃.c("y")) && (☃.c("z")))
        {
          cj ☃ = new cj(☃.f("x"), ☃.f("y"), ☃.f("z"));
          akw ☃ = b.o.s(☃);
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
      boolean ☃ = (☃ == null) || ((☃.i() >= 0) && (b <= 64) && (b > 0));
      if ((☃) && (☃) && (☃))
      {
        if (☃ == null) {
          b.bj.a(☃.a(), null);
        } else {
          b.bj.a(☃.a(), ☃);
        }
        b.bj.a(b, true);
      }
      else if ((☃) && (☃) && (☃) && 
        (m < 200))
      {
        m += 20;
        
        uz ☃ = b.a(☃, true);
        if (☃ != null) {
          ☃.j();
        }
      }
    }
  }
  
  public void a(ii ☃)
  {
    fh.a(☃, this, b.u());
    Short ☃ = (Short)n.a(b.bk.d);
    if ((☃ != null) && (☃.b() == ☃.shortValue()) && (b.bk.d == ☃.a()) && (!b.bk.c(b)) && (!b.v())) {
      b.bk.a(b, true);
    }
  }
  
  public void a(ix ☃)
  {
    fh.a(☃, this, b.u());
    b.z();
    le ☃ = d.a(b.am);
    cj ☃ = ☃.a();
    if (☃.e(☃))
    {
      akw ☃ = ☃.s(☃);
      if (!(☃ instanceof aln)) {
        return;
      }
      aln ☃ = (aln)☃;
      if ((!☃.b()) || (☃.c() != b))
      {
        d.f("Player " + b.e_() + " just tried to change non-editable sign");
        return;
      }
      eu[] ☃ = ☃.b();
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        a[☃] = new fa(a.a(☃[☃].c()));
      }
      ☃.p_();
      ☃.h(☃);
    }
  }
  
  public void a(io ☃)
  {
    if (☃.a() == i)
    {
      int ☃ = (int)(d() - j);
      b.h = ((b.h * 3 + ☃) / 4);
    }
  }
  
  private long d()
  {
    return System.nanoTime() / 1000000L;
  }
  
  public void a(iq ☃)
  {
    fh.a(☃, this, b.u());
    b.bA.b = ((☃.b()) && (b.bA.c));
  }
  
  public void a(id ☃)
  {
    fh.a(☃, this, b.u());
    List<String> ☃ = Lists.newArrayList();
    for (String ☃ : d.a(b, ☃.a(), ☃.b())) {
      ☃.add(☃);
    }
    b.a.a(new fx((String[])☃.toArray(new String[☃.size()])));
  }
  
  public void a(ih ☃)
  {
    fh.a(☃, this, b.u());
    b.a(☃);
  }
  
  public void a(im ☃)
  {
    fh.a(☃, this, b.u());
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
        zx ☃ = b.bi.h();
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
        zx ☃ = b.bi.h();
        if (☃ == null) {
          return;
        }
        if ((☃.b() == zy.bN) && (☃.b() == zy.bM))
        {
          ☃.a("author", new ea(b.e_()));
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
        xi ☃ = b.bk;
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
      if (!d.al())
      {
        b.a(new fb("advMode.notEnabled", new Object[0]));
      }
      else if ((b.a(2, "")) && (b.bA.d))
      {
        em ☃ = ☃.b();
        try
        {
          int ☃ = ☃.readByte();
          adc ☃ = null;
          if (☃ == 0)
          {
            akw ☃ = b.o.s(new cj(☃.readInt(), ☃.readInt(), ☃.readInt()));
            if ((☃ instanceof akz)) {
              ☃ = ((akz)☃).b();
            }
          }
          else if (☃ == 1)
          {
            pk ☃ = b.o.a(☃.readInt());
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
            b.a(new fb("advMode.setCommand.success", new Object[] { ☃ }));
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
        b.a(new fb("advMode.notAllowed", new Object[0]));
      }
    }
    else if ("MC|Beacon".equals(☃.a()))
    {
      if ((b.bk instanceof xl)) {
        try
        {
          em ☃ = ☃.b();
          int ☃ = ☃.readInt();
          int ☃ = ☃.readInt();
          
          xl ☃ = (xl)b.bk;
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
      ((b.bk instanceof xk)))
    {
      xk ☃ = (xk)b.bk;
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
