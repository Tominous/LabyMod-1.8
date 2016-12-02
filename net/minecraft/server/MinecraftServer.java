package net.minecraft.server;

import adk;
import adm;
import adn;
import adp;
import adp.a;
import adr;
import amv;
import anm;
import atk;
import ato;
import atp;
import atr;
import aui;
import b;
import bd;
import c;
import cj;
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import e;
import eu;
import fa;
import g;
import hu;
import i;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import js;
import js.a;
import js.c;
import km;
import kx;
import kz;
import l;
import la;
import lb;
import ld;
import le;
import lf;
import ll;
import lt;
import lx;
import m;
import n.a;
import ns;
import nt;
import nu;
import od;
import oj;
import or;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import os;
import pk;
import wn;

public abstract class MinecraftServer
  implements Runnable, m, od, os
{
  private static final Logger k = ;
  public static final File a = new File("usercache.json");
  private static MinecraftServer l;
  private final atr m;
  private final or n = new or("server", this, az());
  private final File o;
  private final List<km> p = Lists.newArrayList();
  protected final l b;
  public final nt c = new nt();
  private final ll q;
  private final js r = new js();
  private final Random s = new Random();
  private int u = -1;
  public le[] d;
  private lx v;
  private boolean w = true;
  private boolean x;
  private int y;
  protected final Proxy e;
  public String f;
  public int g;
  private boolean z;
  private boolean A;
  private boolean B;
  private boolean C;
  private boolean D;
  private String E;
  private int F;
  private int G = 0;
  public final long[] h = new long[100];
  public long[][] i;
  private KeyPair H;
  private String I;
  private String J;
  private String K;
  private boolean L;
  private boolean M;
  private boolean N;
  private String O = "";
  private String P = "";
  private boolean Q;
  private long R;
  private String S;
  private boolean T;
  private boolean U;
  private final YggdrasilAuthenticationService V;
  private final MinecraftSessionService W;
  private long X = 0L;
  private final GameProfileRepository Y;
  private final lt Z;
  protected final Queue<FutureTask<?>> j = Queues.newArrayDeque();
  private Thread aa;
  private long ab = az();
  
  public MinecraftServer(Proxy ☃, File ☃)
  {
    e = ☃;
    l = this;
    o = null;
    q = null;
    Z = new lt(this, ☃);
    b = null;
    m = null;
    V = new YggdrasilAuthenticationService(☃, UUID.randomUUID().toString());
    W = V.createMinecraftSessionService();
    Y = V.createProfileRepository();
  }
  
  public MinecraftServer(File ☃, Proxy ☃, File ☃)
  {
    e = ☃;
    l = this;
    o = ☃;
    q = new ll(this);
    Z = new lt(this, ☃);
    b = h();
    m = new atk(☃);
    V = new YggdrasilAuthenticationService(☃, UUID.randomUUID().toString());
    W = V.createMinecraftSessionService();
    Y = V.createProfileRepository();
  }
  
  protected bd h()
  {
    return new bd();
  }
  
  protected abstract boolean i()
    throws IOException;
  
  protected void a(String ☃)
  {
    if (Y().b(☃))
    {
      k.info("Converting map!");
      b("menu.convertingLevel");
      Y().a(☃, new nu()
      {
        private long b = MinecraftServer.az();
        
        public void a(String ☃) {}
        
        public void b(String ☃) {}
        
        public void a(int ☃)
        {
          if (MinecraftServer.az() - b >= 1000L)
          {
            b = MinecraftServer.az();
            MinecraftServer.aN().info("Converting... " + ☃ + "%");
          }
        }
        
        public void a() {}
        
        public void c(String ☃) {}
      });
    }
  }
  
  protected synchronized void b(String ☃)
  {
    S = ☃;
  }
  
  public synchronized String j()
  {
    return S;
  }
  
  protected void a(String ☃, String ☃, long ☃, adr ☃, String ☃)
  {
    a(☃);
    b("menu.loadingLevel");
    
    d = new le[3];
    i = new long[d.length][100];
    
    atp ☃ = m.a(☃, true);
    a(U(), ☃);
    
    ato ☃ = ☃.d();
    adp ☃;
    if (☃ == null)
    {
      adp ☃;
      adp ☃;
      if (X())
      {
        ☃ = kx.a;
      }
      else
      {
        ☃ = new adp(☃, m(), l(), o(), ☃);
        ☃.a(☃);
        if (M) {
          ☃.a();
        }
      }
      ☃ = new ato(☃, ☃);
    }
    else
    {
      ☃.a(☃);
      ☃ = new adp(☃);
    }
    for (int ☃ = 0; ☃ < d.length; ☃++)
    {
      int ☃ = 0;
      if (☃ == 1) {
        ☃ = -1;
      }
      if (☃ == 2) {
        ☃ = 1;
      }
      if (☃ == 0)
      {
        if (X()) {
          d[☃] = ((le)new kx(this, ☃, ☃, ☃, c).b());
        } else {
          d[☃] = ((le)new le(this, ☃, ☃, ☃, c).b());
        }
        d[☃].a(☃);
      }
      else
      {
        d[☃] = ((le)new kz(this, ☃, ☃, d[0], c).b());
      }
      d[☃].a(new lb(this, d[☃]));
      if (!T()) {
        d[☃].P().a(m());
      }
    }
    v.a(d);
    
    a(n());
    
    k();
  }
  
  protected void k()
  {
    int ☃ = 16;
    int ☃ = 4;
    
    int ☃ = 192;
    int ☃ = 625;
    int ☃ = 0;
    
    b("menu.generatingTerrain");
    
    int ☃ = 0;
    k.info("Preparing start region for level " + ☃);
    le ☃ = d[☃];
    cj ☃ = ☃.M();
    
    long ☃ = az();
    for (int ☃ = 65344; (☃ <= 192) && (v()); ☃ += 16) {
      for (int ☃ = 65344; (☃ <= 192) && (v()); ☃ += 16)
      {
        long ☃ = az();
        if (☃ - ☃ > 1000L)
        {
          a_("Preparing spawn area", ☃ * 100 / 625);
          ☃ = ☃;
        }
        ☃++;
        
        b.c(☃.n() + ☃ >> 4, ☃.p() + ☃ >> 4);
      }
    }
    s();
  }
  
  protected void a(String ☃, atp ☃)
  {
    File ☃ = new File(☃.b(), "resources.zip");
    if (☃.isFile()) {
      a_("level://" + ☃ + "/" + ☃.getName(), "");
    }
  }
  
  public abstract boolean l();
  
  public abstract adp.a m();
  
  public abstract oj n();
  
  public abstract boolean o();
  
  public abstract int p();
  
  public abstract boolean q();
  
  public abstract boolean r();
  
  protected void a_(String ☃, int ☃)
  {
    f = ☃;
    g = ☃;
    k.info(☃ + ": " + ☃ + "%");
  }
  
  protected void s()
  {
    f = null;
    g = 0;
  }
  
  protected void a(boolean ☃)
  {
    if (N) {
      return;
    }
    for (le ☃ : d) {
      if (☃ != null)
      {
        if (!☃) {
          k.info("Saving chunks for level '" + ☃.P().k() + "'/" + t.k());
        }
        try
        {
          ☃.a(true, null);
        }
        catch (adn ☃)
        {
          k.warn(☃.getMessage());
        }
      }
    }
  }
  
  public void t()
  {
    if (N) {
      return;
    }
    k.info("Stopping server");
    if (aq() != null) {
      aq().b();
    }
    if (v != null)
    {
      k.info("Saving players");
      v.j();
      v.u();
    }
    if (d != null)
    {
      k.info("Saving worlds");
      a(false);
      for (int ☃ = 0; ☃ < d.length; ☃++)
      {
        le ☃ = d[☃];
        ☃.o();
      }
    }
    if (n.d()) {
      n.e();
    }
  }
  
  public boolean v()
  {
    return w;
  }
  
  public void w()
  {
    w = false;
  }
  
  protected void x()
  {
    l = this;
  }
  
  public void run()
  {
    try
    {
      if (i())
      {
        ab = az();
        long ☃ = 0L;
        
        r.a(new fa(E));
        r.a(new js.c("1.8.8", 47));
        
        a(r);
        while (w)
        {
          long ☃ = az();
          long ☃ = ☃ - ab;
          if ((☃ > 2000L) && (ab - R >= 15000L))
          {
            k.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[] { Long.valueOf(☃), Long.valueOf(☃ / 50L) });
            ☃ = 2000L;
            R = ab;
          }
          if (☃ < 0L)
          {
            k.warn("Time ran backwards! Did the system time change?");
            ☃ = 0L;
          }
          ☃ += ☃;
          ab = ☃;
          if (d[0].f())
          {
            A();
            ☃ = 0L;
          }
          else
          {
            while (☃ > 50L)
            {
              ☃ -= 50L;
              A();
            }
          }
          Thread.sleep(Math.max(1L, 50L - ☃));
          Q = true;
        }
      }
      else
      {
        a(null);
      }
    }
    catch (Throwable ☃)
    {
      k.error("Encountered an unexpected exception", ☃);
      
      b ☃ = null;
      if ((☃ instanceof e)) {
        ☃ = b(((e)☃).a());
      } else {
        ☃ = b(new b("Exception in server tick loop", ☃));
      }
      File ☃ = new File(new File(y(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
      if (☃.a(☃)) {
        k.error("This crash report has been saved to: " + ☃.getAbsolutePath());
      } else {
        k.error("We were unable to save this crash report to disk.");
      }
      a(☃);
    }
    finally
    {
      try
      {
        x = true;
        t();
      }
      catch (Throwable ☃)
      {
        k.error("Exception stopping the server", ☃);
      }
      finally
      {
        z();
      }
    }
  }
  
  private void a(js ☃)
  {
    File ☃ = d("server-icon.png");
    if (☃.isFile())
    {
      ByteBuf ☃ = Unpooled.buffer();
      try
      {
        BufferedImage ☃ = ImageIO.read(☃);
        Validate.validState(☃.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
        Validate.validState(☃.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
        ImageIO.write(☃, "PNG", new ByteBufOutputStream(☃));
        ByteBuf ☃ = Base64.encode(☃);
        ☃.a("data:image/png;base64," + ☃.toString(Charsets.UTF_8));
      }
      catch (Exception ☃)
      {
        k.error("Couldn't load server icon", ☃);
      }
      finally
      {
        ☃.release();
      }
    }
  }
  
  public File y()
  {
    return new File(".");
  }
  
  protected void a(b ☃) {}
  
  protected void z() {}
  
  public void A()
  {
    long ☃ = System.nanoTime();
    
    y += 1;
    if (T)
    {
      T = false;
      c.a = true;
      c.a();
    }
    c.a("root");
    B();
    if (☃ - X >= 5000000000L)
    {
      X = ☃;
      r.a(new js.a(J(), I()));
      
      GameProfile[] ☃ = new GameProfile[Math.min(I(), 12)];
      int ☃ = ns.a(s, 0, I() - ☃.length);
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃] = ((lf)v.v().get(☃ + ☃)).cd();
      }
      Collections.shuffle(Arrays.asList(☃));
      r.b().a(☃);
    }
    if (y % 900 == 0)
    {
      c.a("save");
      v.j();
      a(true);
      c.b();
    }
    c.a("tallying");
    h[(y % 100)] = (System.nanoTime() - ☃);
    
    c.b();
    
    c.a("snooper");
    if ((!n.d()) && (y > 100)) {
      n.a();
    }
    if (y % 6000 == 0) {
      n.b();
    }
    c.b();
    
    c.b();
  }
  
  public void B()
  {
    c.a("jobs");
    synchronized (j)
    {
      while (!j.isEmpty()) {
        g.a((FutureTask)j.poll(), k);
      }
    }
    c.c("levels");
    for (int ☃ = 0; ☃ < d.length; ☃++)
    {
      long ☃ = System.nanoTime();
      if ((☃ == 0) || (C()))
      {
        le ☃ = d[☃];
        c.a(☃.P().k());
        if (y % 20 == 0)
        {
          c.a("timeSync");
          v.a(new hu(☃.K(), ☃.L(), ☃.Q().b("doDaylightCycle")), t.q());
          c.b();
        }
        c.a("tick");
        try
        {
          ☃.c();
        }
        catch (Throwable ☃)
        {
          b ☃ = b.a(☃, "Exception ticking world");
          ☃.a(☃);
          throw new e(☃);
        }
        try
        {
          ☃.i();
        }
        catch (Throwable ☃)
        {
          b ☃ = b.a(☃, "Exception ticking world entities");
          ☃.a(☃);
          throw new e(☃);
        }
        c.b();
        c.a("tracker");
        ☃.s().a();
        c.b();
        
        c.b();
      }
      i[☃][(y % 100)] = (System.nanoTime() - ☃);
    }
    c.c("connection");
    aq().c();
    c.c("players");
    v.e();
    
    c.c("tickables");
    for (int ☃ = 0; ☃ < p.size(); ☃++) {
      ((km)p.get(☃)).c();
    }
    c.b();
  }
  
  public boolean C()
  {
    return true;
  }
  
  public void D()
  {
    aa = new Thread(this, "Server thread");
    aa.start();
  }
  
  public File d(String ☃)
  {
    return new File(y(), ☃);
  }
  
  public void f(String ☃)
  {
    k.warn(☃);
  }
  
  public le a(int ☃)
  {
    if (☃ == -1) {
      return d[1];
    }
    if (☃ == 1) {
      return d[2];
    }
    return d[0];
  }
  
  public String H()
  {
    return "1.8.8";
  }
  
  public int I()
  {
    return v.o();
  }
  
  public int J()
  {
    return v.p();
  }
  
  public String[] K()
  {
    return v.f();
  }
  
  public GameProfile[] L()
  {
    return v.g();
  }
  
  public String getServerModName()
  {
    return "vanilla";
  }
  
  public b b(b ☃)
  {
    ☃.g().a("Profiler Position", new Callable()
    {
      public String a()
        throws Exception
      {
        return c.a ? c.c() : "N/A (disabled)";
      }
    });
    if (v != null) {
      ☃.g().a("Player Count", new Callable()
      {
        public String a()
        {
          return MinecraftServer.a(MinecraftServer.this).o() + " / " + MinecraftServer.a(MinecraftServer.this).p() + "; " + MinecraftServer.a(MinecraftServer.this).v();
        }
      });
    }
    return ☃;
  }
  
  public List<String> a(m ☃, String ☃, cj ☃)
  {
    List<String> ☃ = Lists.newArrayList();
    if (☃.startsWith("/"))
    {
      ☃ = ☃.substring(1);
      boolean ☃ = !☃.contains(" ");
      
      List<String> ☃ = b.a(☃, ☃, ☃);
      if (☃ != null) {
        for (String ☃ : ☃) {
          if (☃) {
            ☃.add("/" + ☃);
          } else {
            ☃.add(☃);
          }
        }
      }
      return ☃;
    }
    String[] ☃ = ☃.split(" ", -1);
    String ☃ = ☃[(☃.length - 1)];
    for (String ☃ : v.f()) {
      if (i.a(☃, ☃)) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public static MinecraftServer N()
  {
    return l;
  }
  
  public boolean O()
  {
    return o != null;
  }
  
  public String e_()
  {
    return "Server";
  }
  
  public void a(eu ☃)
  {
    k.info(☃.c());
  }
  
  public boolean a(int ☃, String ☃)
  {
    return true;
  }
  
  public l P()
  {
    return b;
  }
  
  public KeyPair Q()
  {
    return H;
  }
  
  public String S()
  {
    return I;
  }
  
  public void i(String ☃)
  {
    I = ☃;
  }
  
  public boolean T()
  {
    return I != null;
  }
  
  public String U()
  {
    return J;
  }
  
  public void j(String ☃)
  {
    J = ☃;
  }
  
  public void k(String ☃)
  {
    K = ☃;
  }
  
  public String V()
  {
    return K;
  }
  
  public void a(KeyPair ☃)
  {
    H = ☃;
  }
  
  public void a(oj ☃)
  {
    for (int ☃ = 0; ☃ < d.length; ☃++)
    {
      adm ☃ = d[☃];
      if (☃ != null) {
        if (☃.P().t())
        {
          ☃.P().a(oj.d);
          ☃.a(true, true);
        }
        else if (T())
        {
          ☃.P().a(☃);
          ☃.a(☃.aa() != oj.a, true);
        }
        else
        {
          ☃.P().a(☃);
          ☃.a(W(), A);
        }
      }
    }
  }
  
  protected boolean W()
  {
    return true;
  }
  
  public boolean X()
  {
    return L;
  }
  
  public void b(boolean ☃)
  {
    L = ☃;
  }
  
  public void c(boolean ☃)
  {
    M = ☃;
  }
  
  public atr Y()
  {
    return m;
  }
  
  public void aa()
  {
    N = true;
    
    Y().d();
    for (int ☃ = 0; ☃ < d.length; ☃++)
    {
      le ☃ = d[☃];
      if (☃ != null) {
        ☃.o();
      }
    }
    Y().e(d[0].O().g());
    w();
  }
  
  public String ab()
  {
    return O;
  }
  
  public String ac()
  {
    return P;
  }
  
  public void a_(String ☃, String ☃)
  {
    O = ☃;
    P = ☃;
  }
  
  public void a(or ☃)
  {
    ☃.a("whitelist_enabled", Boolean.valueOf(false));
    ☃.a("whitelist_count", Integer.valueOf(0));
    if (v != null)
    {
      ☃.a("players_current", Integer.valueOf(I()));
      ☃.a("players_max", Integer.valueOf(J()));
      ☃.a("players_seen", Integer.valueOf(v.q().length));
    }
    ☃.a("uses_auth", Boolean.valueOf(z));
    ☃.a("gui_state", as() ? "enabled" : "disabled");
    ☃.a("run_time", Long.valueOf((az() - ☃.g()) / 60L * 1000L));
    
    ☃.a("avg_tick_ms", Integer.valueOf((int)(ns.a(h) * 1.0E-6D)));
    
    int ☃ = 0;
    if (d != null) {
      for (int ☃ = 0; ☃ < d.length; ☃++) {
        if (d[☃] != null)
        {
          le ☃ = d[☃];
          ato ☃ = ☃.P();
          
          ☃.a("world[" + ☃ + "][dimension]", Integer.valueOf(t.q()));
          ☃.a("world[" + ☃ + "][mode]", ☃.r());
          ☃.a("world[" + ☃ + "][difficulty]", ☃.aa());
          ☃.a("world[" + ☃ + "][hardcore]", Boolean.valueOf(☃.t()));
          ☃.a("world[" + ☃ + "][generator_name]", ☃.u().a());
          ☃.a("world[" + ☃ + "][generator_version]", Integer.valueOf(☃.u().d()));
          ☃.a("world[" + ☃ + "][height]", Integer.valueOf(F));
          ☃.a("world[" + ☃ + "][chunks_loaded]", Integer.valueOf(☃.N().g()));
          
          ☃++;
        }
      }
    }
    ☃.a("worlds", Integer.valueOf(☃));
  }
  
  public void b(or ☃)
  {
    ☃.b("singleplayer", Boolean.valueOf(T()));
    ☃.b("server_brand", getServerModName());
    ☃.b("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
    ☃.b("dedicated", Boolean.valueOf(ae()));
  }
  
  public boolean ad()
  {
    return true;
  }
  
  public abstract boolean ae();
  
  public boolean af()
  {
    return z;
  }
  
  public void d(boolean ☃)
  {
    z = ☃;
  }
  
  public boolean ag()
  {
    return A;
  }
  
  public void e(boolean ☃)
  {
    A = ☃;
  }
  
  public boolean ah()
  {
    return B;
  }
  
  public abstract boolean ai();
  
  public void f(boolean ☃)
  {
    B = ☃;
  }
  
  public boolean aj()
  {
    return C;
  }
  
  public void g(boolean ☃)
  {
    C = ☃;
  }
  
  public boolean ak()
  {
    return D;
  }
  
  public void h(boolean ☃)
  {
    D = ☃;
  }
  
  public abstract boolean al();
  
  public String am()
  {
    return E;
  }
  
  public void l(String ☃)
  {
    E = ☃;
  }
  
  public int an()
  {
    return F;
  }
  
  public void c(int ☃)
  {
    F = ☃;
  }
  
  public boolean ao()
  {
    return x;
  }
  
  public lx ap()
  {
    return v;
  }
  
  public void a(lx ☃)
  {
    v = ☃;
  }
  
  public void a(adp.a ☃)
  {
    for (int ☃ = 0; ☃ < d.length; ☃++) {
      Nd[☃].P().a(☃);
    }
  }
  
  public ll aq()
  {
    return q;
  }
  
  public boolean ar()
  {
    return Q;
  }
  
  public boolean as()
  {
    return false;
  }
  
  public abstract String a(adp.a parama, boolean paramBoolean);
  
  public int at()
  {
    return y;
  }
  
  public void au()
  {
    T = true;
  }
  
  public or av()
  {
    return n;
  }
  
  public cj c()
  {
    return cj.a;
  }
  
  public aui d()
  {
    return new aui(0.0D, 0.0D, 0.0D);
  }
  
  public adm e()
  {
    return d[0];
  }
  
  public pk f()
  {
    return null;
  }
  
  public int aw()
  {
    return 16;
  }
  
  public boolean a(adm ☃, cj ☃, wn ☃)
  {
    return false;
  }
  
  public boolean ax()
  {
    return U;
  }
  
  public Proxy ay()
  {
    return e;
  }
  
  public static long az()
  {
    return System.currentTimeMillis();
  }
  
  public int aA()
  {
    return G;
  }
  
  public void d(int ☃)
  {
    G = ☃;
  }
  
  public eu f_()
  {
    return new fa(e_());
  }
  
  public boolean aB()
  {
    return true;
  }
  
  public MinecraftSessionService aD()
  {
    return W;
  }
  
  public GameProfileRepository aE()
  {
    return Y;
  }
  
  public lt aF()
  {
    return Z;
  }
  
  public js aG()
  {
    return r;
  }
  
  public void aH()
  {
    X = 0L;
  }
  
  public pk a(UUID ☃)
  {
    for (le ☃ : d) {
      if (☃ != null)
      {
        pk ☃ = ☃.a(☃);
        if (☃ != null) {
          return ☃;
        }
      }
    }
    return null;
  }
  
  public boolean u_()
  {
    return Nd[0].Q().b("sendCommandFeedback");
  }
  
  public void a(n.a ☃, int ☃) {}
  
  public int aI()
  {
    return 29999984;
  }
  
  public <V> ListenableFuture<V> a(Callable<V> ☃)
  {
    Validate.notNull(☃);
    if ((!aJ()) && (!ao()))
    {
      ListenableFutureTask<V> ☃ = ListenableFutureTask.create(☃);
      synchronized (j)
      {
        j.add(☃);
      }
      return ☃;
    }
    try
    {
      return Futures.immediateFuture(☃.call());
    }
    catch (Exception ☃)
    {
      return Futures.immediateFailedCheckedFuture(☃);
    }
  }
  
  public ListenableFuture<Object> a(Runnable ☃)
  {
    Validate.notNull(☃);
    
    return a(Executors.callable(☃));
  }
  
  public boolean aJ()
  {
    return Thread.currentThread() == aa;
  }
  
  public int aK()
  {
    return 256;
  }
}
