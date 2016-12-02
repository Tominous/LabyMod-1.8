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
    this.e = ☃;
    l = this;
    this.o = null;
    this.q = null;
    this.Z = new lt(this, ☃);
    this.b = null;
    this.m = null;
    this.V = new YggdrasilAuthenticationService(☃, UUID.randomUUID().toString());
    this.W = this.V.createMinecraftSessionService();
    this.Y = this.V.createProfileRepository();
  }
  
  public MinecraftServer(File ☃, Proxy ☃, File ☃)
  {
    this.e = ☃;
    l = this;
    this.o = ☃;
    this.q = new ll(this);
    this.Z = new lt(this, ☃);
    this.b = h();
    this.m = new atk(☃);
    this.V = new YggdrasilAuthenticationService(☃, UUID.randomUUID().toString());
    this.W = this.V.createMinecraftSessionService();
    this.Y = this.V.createProfileRepository();
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
          if (MinecraftServer.az() - this.b >= 1000L)
          {
            this.b = MinecraftServer.az();
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
    this.S = ☃;
  }
  
  public synchronized String j()
  {
    return this.S;
  }
  
  protected void a(String ☃, String ☃, long ☃, adr ☃, String ☃)
  {
    a(☃);
    b("menu.loadingLevel");
    
    this.d = new le[3];
    this.i = new long[this.d.length][100];
    
    atp ☃ = this.m.a(☃, true);
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
        if (this.M) {
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
    for (int ☃ = 0; ☃ < this.d.length; ☃++)
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
          this.d[☃] = ((le)new kx(this, ☃, ☃, ☃, this.c).b());
        } else {
          this.d[☃] = ((le)new le(this, ☃, ☃, ☃, this.c).b());
        }
        this.d[☃].a(☃);
      }
      else
      {
        this.d[☃] = ((le)new kz(this, ☃, ☃, this.d[0], this.c).b());
      }
      this.d[☃].a(new lb(this, this.d[☃]));
      if (!T()) {
        this.d[☃].P().a(m());
      }
    }
    this.v.a(this.d);
    
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
    le ☃ = this.d[☃];
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
        
        ☃.b.c(☃.n() + ☃ >> 4, ☃.p() + ☃ >> 4);
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
    this.f = ☃;
    this.g = ☃;
    k.info(☃ + ": " + ☃ + "%");
  }
  
  protected void s()
  {
    this.f = null;
    this.g = 0;
  }
  
  protected void a(boolean ☃)
  {
    if (this.N) {
      return;
    }
    for (le ☃ : this.d) {
      if (☃ != null)
      {
        if (!☃) {
          k.info("Saving chunks for level '" + ☃.P().k() + "'/" + ☃.t.k());
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
    if (this.N) {
      return;
    }
    k.info("Stopping server");
    if (aq() != null) {
      aq().b();
    }
    if (this.v != null)
    {
      k.info("Saving players");
      this.v.j();
      this.v.u();
    }
    if (this.d != null)
    {
      k.info("Saving worlds");
      a(false);
      for (int ☃ = 0; ☃ < this.d.length; ☃++)
      {
        le ☃ = this.d[☃];
        ☃.o();
      }
    }
    if (this.n.d()) {
      this.n.e();
    }
  }
  
  public boolean v()
  {
    return this.w;
  }
  
  public void w()
  {
    this.w = false;
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
        this.ab = az();
        long ☃ = 0L;
        
        this.r.a(new fa(this.E));
        this.r.a(new js.c("1.8.8", 47));
        
        a(this.r);
        while (this.w)
        {
          long ☃ = az();
          long ☃ = ☃ - this.ab;
          if ((☃ > 2000L) && (this.ab - this.R >= 15000L))
          {
            k.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[] { Long.valueOf(☃), Long.valueOf(☃ / 50L) });
            ☃ = 2000L;
            this.R = this.ab;
          }
          if (☃ < 0L)
          {
            k.warn("Time ran backwards! Did the system time change?");
            ☃ = 0L;
          }
          ☃ += ☃;
          this.ab = ☃;
          if (this.d[0].f())
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
          this.Q = true;
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
        this.x = true;
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
    
    this.y += 1;
    if (this.T)
    {
      this.T = false;
      this.c.a = true;
      this.c.a();
    }
    this.c.a("root");
    B();
    if (☃ - this.X >= 5000000000L)
    {
      this.X = ☃;
      this.r.a(new js.a(J(), I()));
      
      GameProfile[] ☃ = new GameProfile[Math.min(I(), 12)];
      int ☃ = ns.a(this.s, 0, I() - ☃.length);
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃] = ((lf)this.v.v().get(☃ + ☃)).cd();
      }
      Collections.shuffle(Arrays.asList(☃));
      this.r.b().a(☃);
    }
    if (this.y % 900 == 0)
    {
      this.c.a("save");
      this.v.j();
      a(true);
      this.c.b();
    }
    this.c.a("tallying");
    this.h[(this.y % 100)] = (System.nanoTime() - ☃);
    
    this.c.b();
    
    this.c.a("snooper");
    if ((!this.n.d()) && (this.y > 100)) {
      this.n.a();
    }
    if (this.y % 6000 == 0) {
      this.n.b();
    }
    this.c.b();
    
    this.c.b();
  }
  
  public void B()
  {
    this.c.a("jobs");
    synchronized (this.j)
    {
      while (!this.j.isEmpty()) {
        g.a((FutureTask)this.j.poll(), k);
      }
    }
    this.c.c("levels");
    for (int ☃ = 0; ☃ < this.d.length; ☃++)
    {
      long ☃ = System.nanoTime();
      if ((☃ == 0) || (C()))
      {
        le ☃ = this.d[☃];
        this.c.a(☃.P().k());
        if (this.y % 20 == 0)
        {
          this.c.a("timeSync");
          this.v.a(new hu(☃.K(), ☃.L(), ☃.Q().b("doDaylightCycle")), ☃.t.q());
          this.c.b();
        }
        this.c.a("tick");
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
        this.c.b();
        this.c.a("tracker");
        ☃.s().a();
        this.c.b();
        
        this.c.b();
      }
      this.i[☃][(this.y % 100)] = (System.nanoTime() - ☃);
    }
    this.c.c("connection");
    aq().c();
    this.c.c("players");
    this.v.e();
    
    this.c.c("tickables");
    for (int ☃ = 0; ☃ < this.p.size(); ☃++) {
      ((km)this.p.get(☃)).c();
    }
    this.c.b();
  }
  
  public boolean C()
  {
    return true;
  }
  
  public void D()
  {
    this.aa = new Thread(this, "Server thread");
    this.aa.start();
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
      return this.d[1];
    }
    if (☃ == 1) {
      return this.d[2];
    }
    return this.d[0];
  }
  
  public String H()
  {
    return "1.8.8";
  }
  
  public int I()
  {
    return this.v.o();
  }
  
  public int J()
  {
    return this.v.p();
  }
  
  public String[] K()
  {
    return this.v.f();
  }
  
  public GameProfile[] L()
  {
    return this.v.g();
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
        return MinecraftServer.this.c.a ? MinecraftServer.this.c.c() : "N/A (disabled)";
      }
    });
    if (this.v != null) {
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
      
      List<String> ☃ = this.b.a(☃, ☃, ☃);
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
    for (String ☃ : this.v.f()) {
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
    return this.o != null;
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
    return this.b;
  }
  
  public KeyPair Q()
  {
    return this.H;
  }
  
  public String S()
  {
    return this.I;
  }
  
  public void i(String ☃)
  {
    this.I = ☃;
  }
  
  public boolean T()
  {
    return this.I != null;
  }
  
  public String U()
  {
    return this.J;
  }
  
  public void j(String ☃)
  {
    this.J = ☃;
  }
  
  public void k(String ☃)
  {
    this.K = ☃;
  }
  
  public String V()
  {
    return this.K;
  }
  
  public void a(KeyPair ☃)
  {
    this.H = ☃;
  }
  
  public void a(oj ☃)
  {
    for (int ☃ = 0; ☃ < this.d.length; ☃++)
    {
      adm ☃ = this.d[☃];
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
          ☃.a(W(), this.A);
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
    return this.L;
  }
  
  public void b(boolean ☃)
  {
    this.L = ☃;
  }
  
  public void c(boolean ☃)
  {
    this.M = ☃;
  }
  
  public atr Y()
  {
    return this.m;
  }
  
  public void aa()
  {
    this.N = true;
    
    Y().d();
    for (int ☃ = 0; ☃ < this.d.length; ☃++)
    {
      le ☃ = this.d[☃];
      if (☃ != null) {
        ☃.o();
      }
    }
    Y().e(this.d[0].O().g());
    w();
  }
  
  public String ab()
  {
    return this.O;
  }
  
  public String ac()
  {
    return this.P;
  }
  
  public void a_(String ☃, String ☃)
  {
    this.O = ☃;
    this.P = ☃;
  }
  
  public void a(or ☃)
  {
    ☃.a("whitelist_enabled", Boolean.valueOf(false));
    ☃.a("whitelist_count", Integer.valueOf(0));
    if (this.v != null)
    {
      ☃.a("players_current", Integer.valueOf(I()));
      ☃.a("players_max", Integer.valueOf(J()));
      ☃.a("players_seen", Integer.valueOf(this.v.q().length));
    }
    ☃.a("uses_auth", Boolean.valueOf(this.z));
    ☃.a("gui_state", as() ? "enabled" : "disabled");
    ☃.a("run_time", Long.valueOf((az() - ☃.g()) / 60L * 1000L));
    
    ☃.a("avg_tick_ms", Integer.valueOf((int)(ns.a(this.h) * 1.0E-6D)));
    
    int ☃ = 0;
    if (this.d != null) {
      for (int ☃ = 0; ☃ < this.d.length; ☃++) {
        if (this.d[☃] != null)
        {
          le ☃ = this.d[☃];
          ato ☃ = ☃.P();
          
          ☃.a("world[" + ☃ + "][dimension]", Integer.valueOf(☃.t.q()));
          ☃.a("world[" + ☃ + "][mode]", ☃.r());
          ☃.a("world[" + ☃ + "][difficulty]", ☃.aa());
          ☃.a("world[" + ☃ + "][hardcore]", Boolean.valueOf(☃.t()));
          ☃.a("world[" + ☃ + "][generator_name]", ☃.u().a());
          ☃.a("world[" + ☃ + "][generator_version]", Integer.valueOf(☃.u().d()));
          ☃.a("world[" + ☃ + "][height]", Integer.valueOf(this.F));
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
    return this.z;
  }
  
  public void d(boolean ☃)
  {
    this.z = ☃;
  }
  
  public boolean ag()
  {
    return this.A;
  }
  
  public void e(boolean ☃)
  {
    this.A = ☃;
  }
  
  public boolean ah()
  {
    return this.B;
  }
  
  public abstract boolean ai();
  
  public void f(boolean ☃)
  {
    this.B = ☃;
  }
  
  public boolean aj()
  {
    return this.C;
  }
  
  public void g(boolean ☃)
  {
    this.C = ☃;
  }
  
  public boolean ak()
  {
    return this.D;
  }
  
  public void h(boolean ☃)
  {
    this.D = ☃;
  }
  
  public abstract boolean al();
  
  public String am()
  {
    return this.E;
  }
  
  public void l(String ☃)
  {
    this.E = ☃;
  }
  
  public int an()
  {
    return this.F;
  }
  
  public void c(int ☃)
  {
    this.F = ☃;
  }
  
  public boolean ao()
  {
    return this.x;
  }
  
  public lx ap()
  {
    return this.v;
  }
  
  public void a(lx ☃)
  {
    this.v = ☃;
  }
  
  public void a(adp.a ☃)
  {
    for (int ☃ = 0; ☃ < this.d.length; ☃++) {
      N().d[☃].P().a(☃);
    }
  }
  
  public ll aq()
  {
    return this.q;
  }
  
  public boolean ar()
  {
    return this.Q;
  }
  
  public boolean as()
  {
    return false;
  }
  
  public abstract String a(adp.a parama, boolean paramBoolean);
  
  public int at()
  {
    return this.y;
  }
  
  public void au()
  {
    this.T = true;
  }
  
  public or av()
  {
    return this.n;
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
    return this.d[0];
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
    return this.U;
  }
  
  public Proxy ay()
  {
    return this.e;
  }
  
  public static long az()
  {
    return System.currentTimeMillis();
  }
  
  public int aA()
  {
    return this.G;
  }
  
  public void d(int ☃)
  {
    this.G = ☃;
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
    return this.W;
  }
  
  public GameProfileRepository aE()
  {
    return this.Y;
  }
  
  public lt aF()
  {
    return this.Z;
  }
  
  public js aG()
  {
    return this.r;
  }
  
  public void aH()
  {
    this.X = 0L;
  }
  
  public pk a(UUID ☃)
  {
    for (le ☃ : this.d) {
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
    return N().d[0].Q().b("sendCommandFeedback");
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
      synchronized (this.j)
      {
        this.j.add(☃);
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
    return Thread.currentThread() == this.aa;
  }
  
  public int aK()
  {
    return 256;
  }
}
