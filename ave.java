import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import javax.imageio.ImageIO;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class ave
  implements od, os
{
  private static final Logger K = ;
  private static final jy L = new jy("textures/gui/title/mojang.png");
  public static final boolean a = g.a() == g.a.d;
  public static byte[] b = new byte[10485760];
  private static final List<DisplayMode> M = Lists.newArrayList(new DisplayMode[] { new DisplayMode(2560, 1600), new DisplayMode(2880, 1800) });
  private final File N;
  private final PropertyMap O;
  private final PropertyMap P;
  private bde Q;
  private bmj R;
  private static ave S;
  public bda c;
  private boolean T;
  private boolean U = true;
  private boolean V;
  private b W;
  public int d;
  public int e;
  private boolean X = false;
  private avl Y = new avl(20.0F);
  private or Z = new or("client", this, MinecraftServer.az());
  public bdb f;
  public bfr g;
  private biu aa;
  private bjh ab;
  private bfn ac;
  public bew h;
  private pk ad;
  public pk i;
  public bec j;
  private final avm ae;
  private boolean af;
  public avn k;
  public avn l;
  public axu m;
  public avi n;
  public bfk o;
  private int ag;
  private int ah;
  private int ai;
  private bpo aj;
  public ayd p;
  public avo q;
  public boolean r;
  public auh s;
  public avh t;
  public avf u;
  public final File v;
  private final File ak;
  private final String al;
  private final Proxy am;
  private atr an;
  private static int ao;
  private int ap;
  private String aq;
  private int ar;
  public boolean w;
  long x = J();
  private int as;
  public final nh y = new nh();
  long z = System.nanoTime();
  private final boolean at;
  private final boolean au;
  private ek av;
  private boolean aw;
  public final nt A = new nt();
  private long ax = -1L;
  private bng ay;
  private final bny az = new bny();
  private final List<bnk> aA = Lists.newArrayList();
  private final bna aB;
  private bnm aC;
  private bns aD;
  private bqm aE;
  private bfw aF;
  private bmh aG;
  private bpz aH;
  private bpv aI;
  private jy aJ;
  private final MinecraftSessionService aK;
  private bnp aL;
  private final Queue<FutureTask<?>> aM = Queues.newArrayDeque();
  private long aN = 0L;
  private final Thread aO = Thread.currentThread();
  private bou aP;
  private bgd aQ;
  volatile boolean B = true;
  public String C = "";
  public boolean D = false;
  public boolean E = false;
  public boolean F = false;
  public boolean G = true;
  long H = J();
  int I;
  
  public ave(bao ☃)
  {
    S = this;
    
    this.v = ☃.c.a;
    this.ak = ☃.c.c;
    this.N = ☃.c.b;
    this.al = ☃.d.b;
    this.O = ☃.a.b;
    this.P = ☃.a.c;
    this.aB = new bna(new bmy(☃.c.c, ☃.c.d).a());
    this.am = (☃.a.d == null ? Proxy.NO_PROXY : ☃.a.d);
    this.aK = new YggdrasilAuthenticationService(☃.a.d, UUID.randomUUID().toString()).createMinecraftSessionService();
    
    this.ae = ☃.a.a;
    
    K.info("Setting user: " + this.ae.c());
    K.info("(Session ID is " + this.ae.a() + ")");
    
    this.au = ☃.d.a;
    this.d = (☃.b.a > 0 ? ☃.b.a : 1);
    this.e = (☃.b.b > 0 ? ☃.b.b : 1);
    this.ah = ☃.b.a;
    this.ai = ☃.b.b;
    this.T = ☃.b.c;
    
    this.at = as();
    this.aj = new bpo(this);
    if (☃.e.a != null)
    {
      this.aq = ☃.e.a;
      this.ar = ☃.e.b;
    }
    ImageIO.setUseCache(false);
    
    kb.c();
  }
  
  public void a()
  {
    this.B = true;
    try
    {
      am();
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Initializing game");
      ☃.a("Initialization");
      c(b(☃));
      return;
    }
    try
    {
      while (this.B)
      {
        if ((this.V) && (this.W != null))
        {
          c(this.W); return;
        }
        try
        {
          av();
        }
        catch (OutOfMemoryError ☃)
        {
          l();
          a(new axo());
          System.gc();
        }
      }
    }
    catch (avk localavk) {}catch (e ☃)
    {
      b(☃.a());
      l();
      K.fatal("Reported exception thrown!", ☃);
      c(☃.a());
    }
    catch (Throwable ☃)
    {
      b ☃ = b(new b("Unexpected error", ☃));
      l();
      K.fatal("Unreported exception thrown!", ☃);
      c(☃);
    }
    finally
    {
      g();
    }
  }
  
  private void am()
    throws LWJGLException, IOException
  {
    this.t = new avh(this, this.v);
    
    this.aA.add(this.aB);
    
    at();
    if ((this.t.C > 0) && (this.t.B > 0))
    {
      this.d = this.t.B;
      this.e = this.t.C;
    }
    K.info("LWJGL Version: " + Sys.getVersion());
    ar();
    aq();
    ap();
    
    bqs.a();
    
    this.aF = new bfw(this.d, this.e, true);
    this.aF.a(0.0F, 0.0F, 0.0F, 0.0F);
    
    an();
    
    this.aC = new bnm(this.N, new File(this.v, "server-resource-packs"), this.aB, this.az, this.t);
    this.ay = new bnn(this.az);
    
    this.aD = new bns(this.az, this.t.aM);
    this.ay.a(this.aD);
    
    e();
    
    this.R = new bmj(this.ay);
    this.ay.a(this.R);
    
    a(this.R);
    
    ao();
    
    this.aL = new bnp(this.R, new File(this.ak, "skins"), this.aK);
    
    this.an = new atk(new File(this.v, "saves"));
    
    this.aH = new bpz(this.ay, this.t);
    this.ay.a(this.aH);
    
    this.aI = new bpv(this);
    
    this.k = new avn(this.t, new jy("textures/font/ascii.png"), this.R, false);
    if (this.t.aM != null)
    {
      this.k.a(d());
      this.k.b(this.aD.b());
    }
    this.l = new avn(this.t, new jy("textures/font/ascii_sga.png"), this.R, false);
    
    this.ay.a(this.k);
    this.ay.a(this.l);
    
    this.ay.a(new bnf());
    this.ay.a(new bne());
    
    mr.f.a(new ms()
    {
      public String a(String ☃)
      {
        try
        {
          return String.format(☃, new Object[] { avh.c(ave.this.t.ae.i()) });
        }
        catch (Exception ☃)
        {
          return "Error: " + ☃.getLocalizedMessage();
        }
      }
    });
    this.u = new avf();
    
    b("Pre startup");
    
    bfl.w();
    bfl.j(7425);
    bfl.a(1.0D);
    bfl.j();
    bfl.c(515);
    bfl.d();
    bfl.a(516, 0.1F);
    bfl.e(1029);
    
    bfl.n(5889);
    bfl.D();
    bfl.n(5888);
    b("Startup");
    
    this.aG = new bmh("textures");
    this.aG.a(this.t.J);
    this.R.a(bmh.g, this.aG);
    this.R.a(bmh.g);
    this.aG.a(false, this.t.J > 0);
    
    this.aP = new bou(this.aG);
    this.ay.a(this.aP);
    
    this.ab = new bjh(this.R, this.aP);
    this.aa = new biu(this.R, this.ab);
    this.ac = new bfn(this);
    this.ay.a(this.ab);
    
    this.o = new bfk(this, this.ay);
    this.ay.a(this.o);
    
    this.aQ = new bgd(this.aP.c(), this.t);
    this.ay.a(this.aQ);
    
    this.g = new bfr(this);
    this.ay.a(this.g);
    
    this.p = new ayd(this);
    
    bfl.b(0, 0, this.d, this.e);
    
    this.j = new bec(this.f, this.R);
    
    b("Post startup");
    this.q = new avo(this);
    if (this.aq != null) {
      a(new awz(new aya(), this, this.aq, this.ar));
    } else {
      a(new aya());
    }
    this.R.c(this.aJ);
    this.aJ = null;
    
    this.n = new avi(this);
    if ((this.t.s) && (!this.T)) {
      q();
    }
    try
    {
      Display.setVSyncEnabled(this.t.t);
    }
    catch (OpenGLException ☃)
    {
      this.t.t = false;
      this.t.b();
    }
    this.g.b();
  }
  
  private void an()
  {
    this.az.a(new boo(), bon.class);
    this.az.a(new boe(), bod.class);
    this.az.a(new bob(), boa.class);
    this.az.a(new bok(), boj.class);
    this.az.a(new boh(), bog.class);
  }
  
  private void ao()
  {
    try
    {
      this.aE = new bqn(this, (Property)Iterables.getFirst(this.O.get("twitch_access_token"), null));
    }
    catch (Throwable ☃)
    {
      this.aE = new bqo(☃);
      K.error("Couldn't initialize twitch stream");
    }
  }
  
  private void ap()
    throws LWJGLException
  {
    Display.setResizable(true);
    Display.setTitle("Minecraft 1.8.8");
    try
    {
      Display.create(new PixelFormat().withDepthBits(24));
    }
    catch (LWJGLException ☃)
    {
      K.error("Couldn't set pixel format", ☃);
      try
      {
        Thread.sleep(1000L);
      }
      catch (InterruptedException localInterruptedException) {}
      if (this.T) {
        au();
      }
      Display.create();
    }
  }
  
  private void aq()
    throws LWJGLException
  {
    if (this.T)
    {
      Display.setFullscreen(true);
      DisplayMode ☃ = Display.getDisplayMode();
      this.d = Math.max(1, ☃.getWidth());
      this.e = Math.max(1, ☃.getHeight());
    }
    else
    {
      Display.setDisplayMode(new DisplayMode(this.d, this.e));
    }
  }
  
  private void ar()
  {
    g.a ☃ = g.a();
    if (☃ != g.a.d)
    {
      InputStream ☃ = null;
      InputStream ☃ = null;
      try
      {
        ☃ = this.aB.c(new jy("icons/icon_16x16.png"));
        ☃ = this.aB.c(new jy("icons/icon_32x32.png"));
        if ((☃ != null) && (☃ != null)) {
          Display.setIcon(new ByteBuffer[] { a(☃), a(☃) });
        }
      }
      catch (IOException ☃)
      {
        K.error("Couldn't set icon", ☃);
      }
      finally
      {
        IOUtils.closeQuietly(☃);
        IOUtils.closeQuietly(☃);
      }
    }
  }
  
  private static boolean as()
  {
    String[] ☃ = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
    for (String ☃ : ☃)
    {
      String ☃ = System.getProperty(☃);
      if ((☃ != null) && 
        (☃.contains("64"))) {
        return true;
      }
    }
    return false;
  }
  
  public bfw b()
  {
    return this.aF;
  }
  
  public String c()
  {
    return this.al;
  }
  
  private void at()
  {
    Thread ☃ = new Thread("Timer hack thread")
    {
      public void run()
      {
        while (ave.this.B) {
          try
          {
            Thread.sleep(2147483647L);
          }
          catch (InterruptedException localInterruptedException) {}
        }
      }
    };
    ☃.setDaemon(true);
    ☃.start();
  }
  
  public void a(b ☃)
  {
    this.V = true;
    this.W = ☃;
  }
  
  public void c(b ☃)
  {
    File ☃ = new File(A().v, "crash-reports");
    File ☃ = new File(☃, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
    
    kb.a(☃.e());
    if (☃.f() != null)
    {
      kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + ☃.f());
      System.exit(-1);
    }
    else if (☃.a(☃))
    {
      kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + ☃.getAbsolutePath());
      System.exit(-1);
    }
    else
    {
      kb.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
      System.exit(-2);
    }
  }
  
  public boolean d()
  {
    return (this.aD.a()) || (this.t.aN);
  }
  
  public void e()
  {
    List<bnk> ☃ = Lists.newArrayList(this.aA);
    for (bnm.a ☃ : this.aC.c()) {
      ☃.add(☃.c());
    }
    if (this.aC.e() != null) {
      ☃.add(this.aC.e());
    }
    try
    {
      this.ay.a(☃);
    }
    catch (RuntimeException ☃)
    {
      K.info("Caught error stitching, removing all assigned resourcepacks", ☃);
      
      ☃.clear();
      ☃.addAll(this.aA);
      this.aC.a(Collections.emptyList());
      
      this.ay.a(☃);
      
      this.t.k.clear();
      this.t.l.clear();
      this.t.b();
    }
    this.aD.a(☃);
    if (this.g != null) {
      this.g.a();
    }
  }
  
  private ByteBuffer a(InputStream ☃)
    throws IOException
  {
    BufferedImage ☃ = ImageIO.read(☃);
    int[] ☃ = ☃.getRGB(0, 0, ☃.getWidth(), ☃.getHeight(), null, 0, ☃.getWidth());
    
    ByteBuffer ☃ = ByteBuffer.allocate(4 * ☃.length);
    for (int ☃ : ☃) {
      ☃.putInt(☃ << 8 | ☃ >> 24 & 0xFF);
    }
    ☃.flip();
    return ☃;
  }
  
  private void au()
    throws LWJGLException
  {
    Set<DisplayMode> ☃ = Sets.newHashSet();
    Collections.addAll(☃, Display.getAvailableDisplayModes());
    
    DisplayMode ☃ = Display.getDesktopDisplayMode();
    Iterator ☃;
    if (!☃.contains(☃)) {
      if (g.a() == g.a.d) {
        for (☃ = M.iterator(); ☃.hasNext();)
        {
          ☃ = (DisplayMode)☃.next();
          
          boolean ☃ = true;
          for (DisplayMode ☃ : ☃) {
            if ((☃.getBitsPerPixel() == 32) && (☃.getWidth() == ☃.getWidth()) && (☃.getHeight() == ☃.getHeight()))
            {
              ☃ = false;
              break;
            }
          }
          if (!☃) {
            for (DisplayMode ☃ : ☃) {
              if ((☃.getBitsPerPixel() == 32) && (☃.getWidth() == ☃.getWidth() / 2) && (☃.getHeight() == ☃.getHeight() / 2))
              {
                ☃ = ☃;
                break;
              }
            }
          }
        }
      }
    }
    DisplayMode ☃;
    Display.setDisplayMode(☃);
    this.d = ☃.getWidth();
    this.e = ☃.getHeight();
  }
  
  private void a(bmj ☃)
    throws LWJGLException
  {
    avr ☃ = new avr(this);
    int ☃ = ☃.e();
    bfw ☃ = new bfw(☃.a() * ☃, ☃.b() * ☃, true);
    ☃.a(false);
    
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, ☃.a(), ☃.b(), 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
    
    bfl.f();
    bfl.n();
    bfl.i();
    
    bfl.w();
    
    InputStream ☃ = null;
    try
    {
      ☃ = this.aB.a(L);
      this.aJ = ☃.a("logo", new blz(ImageIO.read(☃)));
      ☃.a(this.aJ);
    }
    catch (IOException ☃)
    {
      K.error("Unable to load logo: " + L, ☃);
    }
    finally
    {
      IOUtils.closeQuietly(☃);
    }
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.i);
    ☃.b(0.0D, this.e, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    ☃.b(this.d, this.e, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    ☃.b(this.d, 0.0D, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    ☃.b(0.0D, 0.0D, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    ☃.b();
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    int ☃ = 256;
    int ☃ = 256;
    a((☃.a() - ☃) / 2, (☃.b() - ☃) / 2, 0, 0, ☃, ☃, 255, 255, 255, 255);
    
    bfl.f();
    bfl.n();
    
    ☃.e();
    ☃.c(☃.a() * ☃, ☃.b() * ☃);
    
    bfl.d();
    bfl.a(516, 0.1F);
    
    h();
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    float ☃ = 0.00390625F;
    float ☃ = 0.00390625F;
    bfd ☃ = bfx.a().c();
    ☃.a(7, bms.i);
    ☃.b(☃, ☃ + ☃, 0.0D).a(☃ * ☃, (☃ + ☃) * ☃).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃ + ☃, ☃ + ☃, 0.0D).a((☃ + ☃) * ☃, (☃ + ☃) * ☃).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃ + ☃, ☃, 0.0D).a((☃ + ☃) * ☃, ☃ * ☃).b(☃, ☃, ☃, ☃).d();
    ☃.b(☃, ☃, 0.0D).a(☃ * ☃, ☃ * ☃).b(☃, ☃, ☃, ☃).d();
    bfx.a().b();
  }
  
  public atr f()
  {
    return this.an;
  }
  
  public void a(axu ☃)
  {
    if (this.m != null) {
      this.m.m();
    }
    if ((☃ == null) && (this.f == null)) {
      ☃ = new aya();
    } else if ((☃ == null) && (this.h.bn() <= 0.0F)) {
      ☃ = new axe();
    }
    if ((☃ instanceof aya))
    {
      this.t.aB = false;
      this.q.d().a();
    }
    this.m = ☃;
    if (☃ != null)
    {
      o();
      avr ☃ = new avr(this);
      int ☃ = ☃.a();
      int ☃ = ☃.b();
      ☃.a(this, ☃, ☃);
      this.r = false;
    }
    else
    {
      this.aH.e();
      n();
    }
  }
  
  private void b(String ☃)
  {
    if (!this.U) {
      return;
    }
    int ☃ = GL11.glGetError();
    if (☃ != 0)
    {
      String ☃ = GLU.gluErrorString(☃);
      K.error("########## GL ERROR ##########");
      K.error("@ " + ☃);
      K.error(☃ + ": " + ☃);
    }
  }
  
  public void g()
  {
    try
    {
      this.aE.f();
      
      K.info("Stopping!");
      try
      {
        a(null);
      }
      catch (Throwable localThrowable) {}
      this.aH.d();
    }
    finally
    {
      Display.destroy();
      if (!this.V) {
        System.exit(0);
      }
    }
    System.gc();
  }
  
  private void av()
  {
    long ☃ = System.nanoTime();
    
    this.A.a("root");
    if ((Display.isCreated()) && (Display.isCloseRequested())) {
      m();
    }
    if ((this.af) && (this.f != null))
    {
      float ☃ = this.Y.c;
      this.Y.a();
      this.Y.c = ☃;
    }
    else
    {
      this.Y.a();
    }
    this.A.a("scheduledExecutables");
    synchronized (this.aM)
    {
      while (!this.aM.isEmpty()) {
        g.a((FutureTask)this.aM.poll(), K);
      }
    }
    this.A.b();
    
    long ☃ = System.nanoTime();
    this.A.a("tick");
    for (int ☃ = 0; ☃ < this.Y.b; ☃++) {
      s();
    }
    this.A.c("preRenderErrors");
    long ☃ = System.nanoTime() - ☃;
    b("Pre render");
    
    this.A.c("sound");
    this.aH.a(this.h, this.Y.c);
    this.A.b();
    
    this.A.a("render");
    
    bfl.E();
    bfl.m(16640);
    this.aF.a(true);
    
    this.A.a("display");
    bfl.w();
    if ((this.h != null) && (this.h.aj())) {
      this.t.aA = 0;
    }
    this.A.b();
    if (!this.r)
    {
      this.A.c("gameRenderer");
      this.o.a(this.Y.c, ☃);
      this.A.b();
    }
    this.A.b();
    if ((this.t.aB) && (this.t.aC) && (!this.t.az))
    {
      if (!this.A.a) {
        this.A.a();
      }
      this.A.a = true;
      a(☃);
    }
    else
    {
      this.A.a = false;
      this.J = System.nanoTime();
    }
    this.p.a();
    
    this.aF.e();
    bfl.F();
    bfl.E();
    this.aF.c(this.d, this.e);
    bfl.F();
    bfl.E();
    this.o.b(this.Y.c);
    bfl.F();
    this.A.a("root");
    
    h();
    
    Thread.yield();
    
    this.A.a("stream");
    this.A.a("update");
    this.aE.g();
    this.A.c("submit");
    this.aE.h();
    this.A.b();
    this.A.b();
    
    b("Post render");
    this.I += 1;
    this.af = ((F()) && (this.m != null) && (this.m.d()) && (!this.aj.b()));
    
    long ☃ = System.nanoTime();
    this.y.a(☃ - this.z);
    this.z = ☃;
    while (J() >= this.H + 1000L)
    {
      ao = this.I;
      this.C = String.format("%d fps (%d chunk update%s) T: %s%s%s%s%s", new Object[] { Integer.valueOf(ao), Integer.valueOf(bht.a), bht.a != 1 ? "s" : "", this.t.g == avh.a.i.f() ? "inf" : Integer.valueOf(this.t.g), this.t.t ? " vsync" : "", this.t.i ? "" : " fast", this.t.h == 1 ? " fast-clouds" : this.t.h == 0 ? "" : " fancy-clouds", bqs.f() ? " vbo" : "" });
      
      bht.a = 0;
      this.H += 1000L;
      this.I = 0;
      this.Z.b();
      if (!this.Z.d()) {
        this.Z.a();
      }
    }
    if (k())
    {
      this.A.a("fpslimit_wait");
      Display.sync(j());
      this.A.b();
    }
    this.A.b();
  }
  
  public void h()
  {
    this.A.a("display_update");
    Display.update();
    this.A.b();
    i();
  }
  
  protected void i()
  {
    if ((!this.T) && (Display.wasResized()))
    {
      int ☃ = this.d;
      int ☃ = this.e;
      this.d = Display.getWidth();
      this.e = Display.getHeight();
      if ((this.d != ☃) || (this.e != ☃))
      {
        if (this.d <= 0) {
          this.d = 1;
        }
        if (this.e <= 0) {
          this.e = 1;
        }
        a(this.d, this.e);
      }
    }
  }
  
  public int j()
  {
    if ((this.f == null) && (this.m != null)) {
      return 30;
    }
    return this.t.g;
  }
  
  public boolean k()
  {
    return j() < avh.a.i.f();
  }
  
  public void l()
  {
    try
    {
      b = new byte[0];
      this.g.k();
    }
    catch (Throwable localThrowable) {}
    try
    {
      System.gc();
      a(null);
    }
    catch (Throwable localThrowable1) {}
    System.gc();
  }
  
  long J = -1L;
  private String aR = "root";
  
  private void b(int ☃)
  {
    List<nt.a> ☃ = this.A.b(this.aR);
    if ((☃ == null) || (☃.isEmpty())) {
      return;
    }
    nt.a ☃ = (nt.a)☃.remove(0);
    if (☃ == 0)
    {
      if (☃.c.length() > 0)
      {
        int ☃ = this.aR.lastIndexOf(".");
        if (☃ >= 0) {
          this.aR = this.aR.substring(0, ☃);
        }
      }
    }
    else
    {
      ☃--;
      if ((☃ < ☃.size()) && (!((nt.a)☃.get(☃)).c.equals("unspecified")))
      {
        if (this.aR.length() > 0) {
          this.aR += ".";
        }
        this.aR += ((nt.a)☃.get(☃)).c;
      }
    }
  }
  
  private void a(long ☃)
  {
    if (!this.A.a) {
      return;
    }
    List<nt.a> ☃ = this.A.b(this.aR);
    nt.a ☃ = (nt.a)☃.remove(0);
    
    bfl.m(256);
    bfl.n(5889);
    bfl.g();
    bfl.D();
    bfl.a(0.0D, this.d, this.e, 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
    
    GL11.glLineWidth(1.0F);
    bfl.x();
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    int ☃ = 160;
    int ☃ = this.d - ☃ - 10;
    int ☃ = this.e - ☃ * 2;
    bfl.l();
    ☃.a(7, bms.f);
    ☃.b(☃ - ☃ * 1.1F, ☃ - ☃ * 0.6F - 16.0F, 0.0D).b(200, 0, 0, 0).d();
    ☃.b(☃ - ☃ * 1.1F, ☃ + ☃ * 2, 0.0D).b(200, 0, 0, 0).d();
    ☃.b(☃ + ☃ * 1.1F, ☃ + ☃ * 2, 0.0D).b(200, 0, 0, 0).d();
    ☃.b(☃ + ☃ * 1.1F, ☃ - ☃ * 0.6F - 16.0F, 0.0D).b(200, 0, 0, 0).d();
    ☃.b();
    bfl.k();
    
    double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      nt.a ☃ = (nt.a)☃.get(☃);
      
      int ☃ = ns.c(☃.a / 4.0D) + 1;
      
      ☃.a(6, bms.f);
      int ☃ = ☃.a();
      int ☃ = ☃ >> 16 & 0xFF;
      int ☃ = ☃ >> 8 & 0xFF;
      int ☃ = ☃ & 0xFF;
      ☃.b(☃, ☃, 0.0D).b(☃, ☃, ☃, 255).d();
      for (int ☃ = ☃; ☃ >= 0; ☃--)
      {
        float ☃ = (float)((☃ + ☃.a * ☃ / ☃) * 3.1415927410125732D * 2.0D / 100.0D);
        float ☃ = ns.a(☃) * ☃;
        float ☃ = ns.b(☃) * ☃ * 0.5F;
        ☃.b(☃ + ☃, ☃ - ☃, 0.0D).b(☃, ☃, ☃, 255).d();
      }
      ☃.b();
      
      ☃.a(5, bms.f);
      for (int ☃ = ☃; ☃ >= 0; ☃--)
      {
        float ☃ = (float)((☃ + ☃.a * ☃ / ☃) * 3.1415927410125732D * 2.0D / 100.0D);
        float ☃ = ns.a(☃) * ☃;
        float ☃ = ns.b(☃) * ☃ * 0.5F;
        ☃.b(☃ + ☃, ☃ - ☃, 0.0D).b(☃ >> 1, ☃ >> 1, ☃ >> 1, 255).d();
        ☃.b(☃ + ☃, ☃ - ☃ + 10.0F, 0.0D).b(☃ >> 1, ☃ >> 1, ☃ >> 1, 255).d();
      }
      ☃.b();
      
      ☃ += ☃.a;
    }
    DecimalFormat ☃ = new DecimalFormat("##0.00");
    
    bfl.w();
    
    String ☃ = "";
    if (!☃.c.equals("unspecified")) {
      ☃ = ☃ + "[0] ";
    }
    if (☃.c.length() == 0) {
      ☃ = ☃ + "ROOT ";
    } else {
      ☃ = ☃ + ☃.c + " ";
    }
    int ☃ = 16777215;
    this.k.a(☃, ☃ - ☃, ☃ - ☃ / 2 - 16, ☃);
    this.k.a(☃ = ☃.format(☃.b) + "%", ☃ + ☃ - this.k.a(☃), ☃ - ☃ / 2 - 16, ☃);
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      nt.a ☃ = (nt.a)☃.get(☃);
      String ☃ = "";
      if (☃.c.equals("unspecified")) {
        ☃ = ☃ + "[?] ";
      } else {
        ☃ = ☃ + "[" + (☃ + 1) + "] ";
      }
      ☃ = ☃ + ☃.c;
      this.k.a(☃, ☃ - ☃, ☃ + ☃ / 2 + ☃ * 8 + 20, ☃.a());
      this.k.a(☃ = ☃.format(☃.a) + "%", ☃ + ☃ - 50 - this.k.a(☃), ☃ + ☃ / 2 + ☃ * 8 + 20, ☃.a());
      this.k.a(☃ = ☃.format(☃.b) + "%", ☃ + ☃ - this.k.a(☃), ☃ + ☃ / 2 + ☃ * 8 + 20, ☃.a());
    }
  }
  
  public void m()
  {
    this.B = false;
  }
  
  public void n()
  {
    if (!Display.isActive()) {
      return;
    }
    if (this.w) {
      return;
    }
    this.w = true;
    this.u.a();
    a(null);
    this.ag = 10000;
  }
  
  public void o()
  {
    if (!this.w) {
      return;
    }
    avb.a();
    this.w = false;
    this.u.b();
  }
  
  public void p()
  {
    if (this.m != null) {
      return;
    }
    a(new axp());
    if ((F()) && (!this.aj.b())) {
      this.aH.a();
    }
  }
  
  private void b(boolean ☃)
  {
    if (!☃) {
      this.ag = 0;
    }
    if ((this.ag > 0) || (this.h.bS())) {
      return;
    }
    if ((☃) && (this.s != null) && (this.s.a == auh.a.b))
    {
      cj ☃ = this.s.a();
      if ((this.f.p(☃).c().t() != arm.a) && 
        (this.c.c(☃, this.s.b)))
      {
        this.j.a(☃, this.s.b);
        this.h.bw();
      }
      return;
    }
    this.c.c();
  }
  
  private void aw()
  {
    if (this.ag > 0) {
      return;
    }
    this.h.bw();
    if (this.s == null)
    {
      K.error("Null returned as 'hitResult', this shouldn't happen!");
      if (this.c.g()) {
        this.ag = 10;
      }
      return;
    }
    switch (ave.10.a[this.s.a.ordinal()])
    {
    case 1: 
      this.c.a(this.h, this.s.d);
      break;
    case 2: 
      cj ☃ = this.s.a();
      if (this.f.p(☃).c().t() != arm.a) {
        this.c.b(☃, this.s.b);
      }
      break;
    }
    if (this.c.g()) {
      this.ag = 10;
    }
  }
  
  private void ax()
  {
    if (this.c.m()) {
      return;
    }
    this.ap = 4;
    boolean ☃ = true;
    
    zx ☃ = this.h.bi.h();
    if (this.s == null) {
      K.warn("Null returned as 'hitResult', this shouldn't happen!");
    } else {
      switch (ave.10.a[this.s.a.ordinal()])
      {
      case 1: 
        if (this.c.a(this.h, this.s.d, this.s)) {
          ☃ = false;
        } else if (this.c.b(this.h, this.s.d)) {
          ☃ = false;
        }
        break;
      case 2: 
        cj ☃ = this.s.a();
        if (this.f.p(☃).c().t() != arm.a)
        {
          int ☃ = ☃ != null ? ☃.b : 0;
          if (this.c.a(this.h, this.f, ☃, ☃, this.s.b, this.s.c))
          {
            ☃ = false;
            this.h.bw();
          }
          if (☃ == null) {
            return;
          }
          if (☃.b == 0) {
            this.h.bi.a[this.h.bi.c] = null;
          } else if ((☃.b != ☃) || (this.c.h())) {
            this.o.c.b();
          }
        }
        break;
      }
    }
    if (☃)
    {
      zx ☃ = this.h.bi.h();
      if ((☃ != null) && 
        (this.c.a(this.h, this.f, ☃))) {
        this.o.c.c();
      }
    }
  }
  
  public void q()
  {
    try
    {
      this.T = (!this.T);
      this.t.s = this.T;
      if (this.T)
      {
        au();
        this.d = Display.getDisplayMode().getWidth();
        this.e = Display.getDisplayMode().getHeight();
        if (this.d <= 0) {
          this.d = 1;
        }
        if (this.e <= 0) {
          this.e = 1;
        }
      }
      else
      {
        Display.setDisplayMode(new DisplayMode(this.ah, this.ai));
        this.d = this.ah;
        this.e = this.ai;
        if (this.d <= 0) {
          this.d = 1;
        }
        if (this.e <= 0) {
          this.e = 1;
        }
      }
      if (this.m != null) {
        a(this.d, this.e);
      } else {
        ay();
      }
      Display.setFullscreen(this.T);
      Display.setVSyncEnabled(this.t.t);
      h();
    }
    catch (Exception ☃)
    {
      K.error("Couldn't toggle fullscreen", ☃);
    }
  }
  
  private void a(int ☃, int ☃)
  {
    this.d = Math.max(1, ☃);
    this.e = Math.max(1, ☃);
    if (this.m != null)
    {
      avr ☃ = new avr(this);
      this.m.b(this, ☃.a(), ☃.b());
    }
    this.n = new avi(this);
    ay();
  }
  
  private void ay()
  {
    this.aF.a(this.d, this.e);
    if (this.o != null) {
      this.o.a(this.d, this.e);
    }
  }
  
  public bpv r()
  {
    return this.aI;
  }
  
  public void s()
  {
    if (this.ap > 0) {
      this.ap -= 1;
    }
    this.A.a("gui");
    if (!this.af) {
      this.q.c();
    }
    this.A.b();
    this.o.a(1.0F);
    
    this.A.a("gameMode");
    if ((!this.af) && (this.f != null)) {
      this.c.e();
    }
    this.A.c("textures");
    if (!this.af) {
      this.R.e();
    }
    if ((this.m == null) && (this.h != null))
    {
      if (this.h.bn() <= 0.0F) {
        a(null);
      } else if ((this.h.bJ()) && (this.f != null)) {
        a(new axk());
      }
    }
    else if ((this.m != null) && ((this.m instanceof axk)) && (!this.h.bJ())) {
      a(null);
    }
    if (this.m != null) {
      this.ag = 10000;
    }
    if (this.m != null)
    {
      try
      {
        this.m.p();
      }
      catch (Throwable ☃)
      {
        b ☃ = b.a(☃, "Updating screen events");
        c ☃ = ☃.a("Affected screen");
        ☃.a("Screen name", new Callable()
        {
          public String a()
            throws Exception
          {
            return ave.this.m.getClass().getCanonicalName();
          }
        });
        throw new e(☃);
      }
      if (this.m != null) {
        try
        {
          this.m.e();
        }
        catch (Throwable ☃)
        {
          b ☃ = b.a(☃, "Ticking screen");
          c ☃ = ☃.a("Affected screen");
          ☃.a("Screen name", new Callable()
          {
            public String a()
              throws Exception
            {
              return ave.this.m.getClass().getCanonicalName();
            }
          });
          throw new e(☃);
        }
      }
    }
    if ((this.m == null) || (this.m.p))
    {
      this.A.c("mouse");
      while (Mouse.next())
      {
        int ☃ = Mouse.getEventButton();
        
        avb.a(☃ - 100, Mouse.getEventButtonState());
        if (Mouse.getEventButtonState()) {
          if ((this.h.v()) && (☃ == 2)) {
            this.q.g().b();
          } else {
            avb.a(☃ - 100);
          }
        }
        long ☃ = J() - this.x;
        if (☃ <= 200L)
        {
          int ☃ = Mouse.getEventDWheel();
          if (☃ != 0) {
            if (this.h.v())
            {
              ☃ = ☃ < 0 ? -1 : 1;
              if (this.q.g().a())
              {
                this.q.g().b(-☃);
              }
              else
              {
                float ☃ = ns.a(this.h.bA.a() + ☃ * 0.005F, 0.0F, 0.2F);
                this.h.bA.a(☃);
              }
            }
            else
            {
              this.h.bi.d(☃);
            }
          }
          if (this.m == null)
          {
            if ((!this.w) && (Mouse.getEventButtonState())) {
              n();
            }
          }
          else if (this.m != null) {
            this.m.k();
          }
        }
      }
      if (this.ag > 0) {
        this.ag -= 1;
      }
      this.A.c("keyboard");
      while (Keyboard.next())
      {
        int ☃ = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 'Ā' : Keyboard.getEventKey();
        avb.a(☃, Keyboard.getEventKeyState());
        if (Keyboard.getEventKeyState()) {
          avb.a(☃);
        }
        if (this.ax > 0L)
        {
          if (J() - this.ax >= 6000L) {
            throw new e(new b("Manually triggered debug crash", new Throwable()));
          }
          if ((!Keyboard.isKeyDown(46)) || (!Keyboard.isKeyDown(61))) {
            this.ax = -1L;
          }
        }
        else if ((Keyboard.isKeyDown(46)) && (Keyboard.isKeyDown(61)))
        {
          this.ax = J();
        }
        Z();
        if (Keyboard.getEventKeyState())
        {
          if ((☃ == 62) && 
            (this.o != null)) {
            this.o.c();
          }
          if (this.m != null)
          {
            this.m.l();
          }
          else
          {
            if (☃ == 1) {
              p();
            }
            if ((☃ == 32) && (Keyboard.isKeyDown(61)) && 
              (this.q != null)) {
              this.q.d().a();
            }
            if ((☃ == 31) && (Keyboard.isKeyDown(61))) {
              e();
            }
            if (((☃ != 17) || (!Keyboard.isKeyDown(61))) || (
            
              ((☃ != 18) || (!Keyboard.isKeyDown(61))) || (
              
              ((☃ != 47) || (!Keyboard.isKeyDown(61))) || (
              
              ((☃ != 38) || (!Keyboard.isKeyDown(61))) || (
              
              ((☃ != 22) || (!Keyboard.isKeyDown(61))) || (
              
              (☃ == 20) && (Keyboard.isKeyDown(61)))))))) {
              e();
            }
            if ((☃ == 33) && (Keyboard.isKeyDown(61))) {
              this.t.a(avh.a.f, axu.r() ? -1 : 1);
            }
            if ((☃ == 30) && (Keyboard.isKeyDown(61))) {
              this.g.a();
            }
            if ((☃ == 35) && (Keyboard.isKeyDown(61)))
            {
              this.t.y = (!this.t.y);
              this.t.b();
            }
            if ((☃ == 48) && (Keyboard.isKeyDown(61))) {
              this.aa.b(!this.aa.b());
            }
            if ((☃ == 25) && (Keyboard.isKeyDown(61)))
            {
              this.t.z = (!this.t.z);
              this.t.b();
            }
            if (☃ == 59) {
              this.t.az = (!this.t.az);
            }
            if (☃ == 61)
            {
              this.t.aB = (!this.t.aB);
              this.t.aC = axu.r();
              this.t.aD = axu.s();
            }
            if (this.t.an.f())
            {
              this.t.aA += 1;
              if (this.t.aA > 2) {
                this.t.aA = 0;
              }
              if (this.t.aA == 0) {
                this.o.a(ac());
              } else if (this.t.aA == 1) {
                this.o.a(null);
              }
              this.g.m();
            }
            if (this.t.ao.f()) {
              this.t.aF = (!this.t.aF);
            }
          }
          if ((this.t.aB) && (this.t.aC))
          {
            if (☃ == 11) {
              b(0);
            }
            for (int ☃ = 0; ☃ < 9; ☃++) {
              if (☃ == 2 + ☃) {
                b(☃ + 1);
              }
            }
          }
        }
      }
      for (int ☃ = 0; ☃ < 9; ☃++) {
        if (this.t.av[☃].f()) {
          if (this.h.v()) {
            this.q.g().a(☃);
          } else {
            this.h.bi.c = ☃;
          }
        }
      }
      boolean ☃ = this.t.m != wn.b.c;
      while (this.t.ae.f()) {
        if (this.c.j())
        {
          this.h.u();
        }
        else
        {
          u().a(new ig(ig.a.c));
          a(new azc(this.h));
        }
      }
      while (this.t.ag.f()) {
        if (!this.h.v()) {
          this.h.a(axu.q());
        }
      }
      while ((this.t.aj.f()) && (☃)) {
        a(new awv());
      }
      if ((this.m == null) && (this.t.al.f()) && (☃)) {
        a(new awv("/"));
      }
      if (this.h.bS())
      {
        if (!this.t.af.d()) {
          this.c.c(this.h);
        }
        while (this.t.ah.f()) {}
        while (this.t.af.f()) {}
        while (this.t.ai.f()) {}
      }
      while (this.t.ah.f()) {
        aw();
      }
      while (this.t.af.f()) {
        ax();
      }
      while (this.t.ai.f()) {
        az();
      }
      if ((this.t.af.d()) && (this.ap == 0) && (!this.h.bS())) {
        ax();
      }
      b((this.m == null) && (this.t.ah.d()) && (this.w));
    }
    if (this.f != null)
    {
      if (this.h != null)
      {
        this.as += 1;
        if (this.as == 30)
        {
          this.as = 0;
          this.f.h(this.h);
        }
      }
      this.A.c("gameRenderer");
      if (!this.af) {
        this.o.e();
      }
      this.A.c("levelRenderer");
      if (!this.af) {
        this.g.j();
      }
      this.A.c("level");
      if (!this.af)
      {
        if (this.f.ac() > 0) {
          this.f.d(this.f.ac() - 1);
        }
        this.f.i();
      }
    }
    else if (this.o.a())
    {
      this.o.b();
    }
    if (!this.af)
    {
      this.aI.c();
      this.aH.c();
    }
    if (this.f != null)
    {
      if (!this.af)
      {
        this.f.a(this.f.aa() != oj.a, true);
        try
        {
          this.f.c();
        }
        catch (Throwable ☃)
        {
          b ☃ = b.a(☃, "Exception in world tick");
          if (this.f == null)
          {
            c ☃ = ☃.a("Affected level");
            ☃.a("Problem", "Level is null!");
          }
          else
          {
            this.f.a(☃);
          }
          throw new e(☃);
        }
      }
      this.A.c("animateTick");
      if ((!this.af) && (this.f != null)) {
        this.f.b(ns.c(this.h.s), ns.c(this.h.t), ns.c(this.h.u));
      }
      this.A.c("particles");
      if (!this.af) {
        this.j.a();
      }
    }
    else if (this.av != null)
    {
      this.A.c("pendingConnection");
      this.av.a();
    }
    this.A.b();
    
    this.x = J();
  }
  
  public void a(String ☃, String ☃, adp ☃)
  {
    a(null);
    System.gc();
    
    atp ☃ = this.an.a(☃, false);
    ato ☃ = ☃.d();
    if ((☃ == null) && (☃ != null))
    {
      ☃ = new ato(☃, ☃);
      ☃.a(☃);
    }
    if (☃ == null) {
      ☃ = new adp(☃);
    }
    try
    {
      this.aj = new bpo(this, ☃, ☃, ☃);
      this.aj.D();
      this.aw = true;
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Starting integrated server");
      c ☃ = ☃.a("Starting integrated server");
      
      ☃.a("Level ID", ☃);
      ☃.a("Level Name", ☃);
      
      throw new e(☃);
    }
    this.n.a(bnq.a("menu.loadingLevel", new Object[0]));
    while (!this.aj.ar())
    {
      String ☃ = this.aj.j();
      if (☃ != null) {
        this.n.c(bnq.a(☃, new Object[0]));
      } else {
        this.n.c("");
      }
      try
      {
        Thread.sleep(200L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
    a(null);
    
    SocketAddress ☃ = this.aj.aq().a();
    ek ☃ = ek.a(☃);
    ☃.a(new bcx(☃, this, null));
    ☃.a(new jc(47, ☃.toString(), 0, el.d));
    ☃.a(new jl(L().e()));
    this.av = ☃;
  }
  
  public void a(bdb ☃)
  {
    a(☃, "");
  }
  
  public void a(bdb ☃, String ☃)
  {
    if (☃ == null)
    {
      bcy ☃ = u();
      if (☃ != null) {
        ☃.b();
      }
      if ((this.aj != null) && (this.aj.O()))
      {
        this.aj.w();
        this.aj.a();
      }
      this.aj = null;
      this.p.b();
      
      this.o.k().a();
    }
    this.ad = null;
    this.av = null;
    if (this.n != null)
    {
      this.n.b(☃);
      this.n.c("");
    }
    if ((☃ == null) && (this.f != null))
    {
      this.aC.f();
      this.q.i();
      a(null);
      this.aw = false;
    }
    this.aH.b();
    
    this.f = ☃;
    if (☃ != null)
    {
      if (this.g != null) {
        this.g.a(☃);
      }
      if (this.j != null) {
        this.j.a(☃);
      }
      if (this.h == null)
      {
        this.h = this.c.a(☃, new nb());
        this.c.b(this.h);
      }
      this.h.I();
      ☃.d(this.h);
      
      this.h.b = new bev(this.t);
      
      this.c.a(this.h);
      this.ad = this.h;
    }
    else
    {
      this.an.d();
      this.h = null;
    }
    System.gc();
    this.x = 0L;
  }
  
  public void a(int ☃)
  {
    this.f.g();
    this.f.a();
    
    int ☃ = 0;
    String ☃ = null;
    if (this.h != null)
    {
      ☃ = this.h.F();
      this.f.e(this.h);
      ☃ = this.h.w();
    }
    this.ad = null;
    bew ☃ = this.h;
    this.h = this.c.a(this.f, this.h == null ? new nb() : this.h.x());
    this.h.H().a(☃.H().c());
    this.h.am = ☃;
    this.ad = this.h;
    this.h.I();
    this.h.f(☃);
    this.f.d(this.h);
    this.c.b(this.h);
    
    this.h.b = new bev(this.t);
    this.h.d(☃);
    this.c.a(this.h);
    this.h.k(☃.cq());
    if ((this.m instanceof axe)) {
      a(null);
    }
  }
  
  public final boolean t()
  {
    return this.au;
  }
  
  public bcy u()
  {
    if (this.h != null) {
      return this.h.a;
    }
    return null;
  }
  
  public static boolean v()
  {
    return (S == null) || (!S.t.az);
  }
  
  public static boolean w()
  {
    return (S != null) && (S.t.i);
  }
  
  public static boolean x()
  {
    return (S != null) && (S.t.j != 0);
  }
  
  private void az()
  {
    if (this.s == null) {
      return;
    }
    boolean ☃ = this.h.bA.d;
    
    int ☃ = 0;
    boolean ☃ = false;
    akw ☃ = null;
    if (this.s.a == auh.a.b)
    {
      cj ☃ = this.s.a();
      
      afh ☃ = this.f.p(☃).c();
      if (☃.t() == arm.a) {
        return;
      }
      zw ☃ = ☃.c(this.f, ☃);
      if (☃ == null) {
        return;
      }
      if ((☃) && (axu.q())) {
        ☃ = this.f.s(☃);
      }
      afh ☃ = ((☃ instanceof yo)) && (!☃.M()) ? afh.a(☃) : ☃;
      ☃ = ☃.j(this.f, ☃);
      ☃ = ☃.k();
    }
    else if ((this.s.a == auh.a.c) && (this.s.d != null) && (☃))
    {
      zw ☃;
      if ((this.s.d instanceof uq))
      {
        ☃ = zy.an;
      }
      else
      {
        zw ☃;
        if ((this.s.d instanceof up))
        {
          ☃ = zy.cn;
        }
        else if ((this.s.d instanceof uo))
        {
          uo ☃ = (uo)this.s.d;
          zx ☃ = ☃.o();
          zw ☃;
          if (☃ == null)
          {
            ☃ = zy.bP;
          }
          else
          {
            zw ☃ = ☃.b();
            ☃ = ☃.i();
            ☃ = true;
          }
        }
        else if ((this.s.d instanceof va))
        {
          va ☃ = (va)this.s.d;
          zw ☃;
          switch (ave.10.b[☃.s().ordinal()])
          {
          case 1: 
            ☃ = zy.aO;
            break;
          case 2: 
            ☃ = zy.aN;
            break;
          case 3: 
            ☃ = zy.ch;
            break;
          case 4: 
            ☃ = zy.ci;
            break;
          case 5: 
            ☃ = zy.cp;
            break;
          default: 
            ☃ = zy.az;
          }
        }
        else
        {
          zw ☃;
          if ((this.s.d instanceof ux))
          {
            ☃ = zy.aE;
          }
          else
          {
            zw ☃;
            if ((this.s.d instanceof um))
            {
              ☃ = zy.cj;
            }
            else
            {
              zw ☃ = zy.bJ;
              ☃ = pm.a(this.s.d);
              ☃ = true;
              if (pm.a.containsKey(Integer.valueOf(☃))) {}
            }
          }
        }
      }
    }
    else
    {
      return;
    }
    zw ☃;
    wm ☃ = this.h.bi;
    if (☃ == null)
    {
      ☃.a(☃, ☃, ☃, ☃);
    }
    else
    {
      zx ☃ = a(☃, ☃, ☃);
      ☃.a(☃.c, ☃);
    }
    if (☃)
    {
      int ☃ = this.h.bj.c.size() - 9 + ☃.c;
      this.c.a(☃.a(☃.c), ☃);
    }
  }
  
  private zx a(zw ☃, int ☃, akw ☃)
  {
    zx ☃ = new zx(☃, 1, ☃);
    dn ☃ = new dn();
    ☃.b(☃);
    if ((☃ == zy.bX) && (☃.c("Owner")))
    {
      dn ☃ = ☃.m("Owner");
      dn ☃ = new dn();
      ☃.a("SkullOwner", ☃);
      ☃.d(☃);
      return ☃;
    }
    ☃.a("BlockEntityTag", ☃);
    dn ☃ = new dn();
    
    du ☃ = new du();
    ☃.a(new ea("(+NBT)"));
    ☃.a("Lore", ☃);
    ☃.a("display", ☃);
    
    return ☃;
  }
  
  public b b(b ☃)
  {
    ☃.g().a("Launched Version", new Callable()
    {
      public String a()
      {
        return ave.a(ave.this);
      }
    });
    ☃.g().a("LWJGL", new Callable()
    {
      public String a()
      {
        return Sys.getVersion();
      }
    });
    ☃.g().a("OpenGL", new Callable()
    {
      public String a()
      {
        return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
      }
    });
    ☃.g().a("GL Caps", new Callable()
    {
      public String a()
      {
        return bqs.c();
      }
    });
    ☃.g().a("Using VBOs", new Callable()
    {
      public String a()
      {
        return ave.this.t.u ? "Yes" : "No";
      }
    });
    ☃.g().a("Is Modded", new Callable()
    {
      public String a()
        throws Exception
      {
        String ☃ = ClientBrandRetriever.getClientModName();
        if (!☃.equals("vanilla")) {
          return "Definitely; Client brand changed to '" + ☃ + "'";
        }
        if (ave.class.getSigners() == null) {
          return "Very likely; Jar signature invalidated";
        }
        return "Probably not. Jar signature remains and client brand is untouched.";
      }
    });
    ☃.g().a("Type", new Callable()
    {
      public String a()
        throws Exception
      {
        return "Client (map_client.txt)";
      }
    });
    ☃.g().a("Resource Packs", new Callable()
    {
      public String a()
        throws Exception
      {
        StringBuilder ☃ = new StringBuilder();
        for (String ☃ : ave.this.t.k)
        {
          if (☃.length() > 0) {
            ☃.append(", ");
          }
          ☃.append(☃);
          if (ave.this.t.l.contains(☃)) {
            ☃.append(" (incompatible)");
          }
        }
        return ☃.toString();
      }
    });
    ☃.g().a("Current Language", new Callable()
    {
      public String a()
        throws Exception
      {
        return ave.b(ave.this).c().toString();
      }
    });
    ☃.g().a("Profiler Position", new Callable()
    {
      public String a()
        throws Exception
      {
        return ave.this.A.a ? ave.this.A.c() : "N/A (disabled)";
      }
    });
    ☃.g().a("CPU", new Callable()
    {
      public String a()
      {
        return bqs.j();
      }
    });
    if (this.f != null) {
      this.f.a(☃);
    }
    return ☃;
  }
  
  public static ave A()
  {
    return S;
  }
  
  public ListenableFuture<Object> B()
  {
    a(new Runnable()
    {
      public void run()
      {
        ave.this.e();
      }
    });
  }
  
  public void a(or ☃)
  {
    ☃.a("fps", Integer.valueOf(ao));
    ☃.a("vsync_enabled", Boolean.valueOf(this.t.t));
    ☃.a("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
    ☃.a("display_type", this.T ? "fullscreen" : "windowed");
    ☃.a("run_time", Long.valueOf((MinecraftServer.az() - ☃.g()) / 60L * 1000L));
    ☃.a("current_action", aA());
    
    String ☃ = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
    ☃.a("endianness", ☃);
    
    ☃.a("resource_packs", Integer.valueOf(this.aC.c().size()));
    int ☃ = 0;
    for (bnm.a ☃ : this.aC.c()) {
      ☃.a("resource_pack[" + ☃++ + "]", ☃.d());
    }
    if ((this.aj != null) && (this.aj.av() != null)) {
      ☃.a("snooper_partner", this.aj.av().f());
    }
  }
  
  private String aA()
  {
    if (this.aj != null)
    {
      if (this.aj.b()) {
        return "hosting_lan";
      }
      return "singleplayer";
    }
    if (this.Q != null)
    {
      if (this.Q.d()) {
        return "playing_lan";
      }
      return "multiplayer";
    }
    return "out_of_game";
  }
  
  public void b(or ☃)
  {
    ☃.b("opengl_version", GL11.glGetString(7938));
    ☃.b("opengl_vendor", GL11.glGetString(7936));
    ☃.b("client_brand", ClientBrandRetriever.getClientModName());
    ☃.b("launched_version", this.al);
    
    ContextCapabilities ☃ = GLContext.getCapabilities();
    ☃.b("gl_caps[ARB_arrays_of_arrays]", Boolean.valueOf(☃.GL_ARB_arrays_of_arrays));
    ☃.b("gl_caps[ARB_base_instance]", Boolean.valueOf(☃.GL_ARB_base_instance));
    ☃.b("gl_caps[ARB_blend_func_extended]", Boolean.valueOf(☃.GL_ARB_blend_func_extended));
    ☃.b("gl_caps[ARB_clear_buffer_object]", Boolean.valueOf(☃.GL_ARB_clear_buffer_object));
    ☃.b("gl_caps[ARB_color_buffer_float]", Boolean.valueOf(☃.GL_ARB_color_buffer_float));
    ☃.b("gl_caps[ARB_compatibility]", Boolean.valueOf(☃.GL_ARB_compatibility));
    ☃.b("gl_caps[ARB_compressed_texture_pixel_storage]", Boolean.valueOf(☃.GL_ARB_compressed_texture_pixel_storage));
    ☃.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(☃.GL_ARB_compute_shader));
    ☃.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(☃.GL_ARB_copy_buffer));
    ☃.b("gl_caps[ARB_copy_image]", Boolean.valueOf(☃.GL_ARB_copy_image));
    ☃.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(☃.GL_ARB_depth_buffer_float));
    ☃.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(☃.GL_ARB_compute_shader));
    ☃.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(☃.GL_ARB_copy_buffer));
    ☃.b("gl_caps[ARB_copy_image]", Boolean.valueOf(☃.GL_ARB_copy_image));
    ☃.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(☃.GL_ARB_depth_buffer_float));
    ☃.b("gl_caps[ARB_depth_clamp]", Boolean.valueOf(☃.GL_ARB_depth_clamp));
    ☃.b("gl_caps[ARB_depth_texture]", Boolean.valueOf(☃.GL_ARB_depth_texture));
    ☃.b("gl_caps[ARB_draw_buffers]", Boolean.valueOf(☃.GL_ARB_draw_buffers));
    ☃.b("gl_caps[ARB_draw_buffers_blend]", Boolean.valueOf(☃.GL_ARB_draw_buffers_blend));
    ☃.b("gl_caps[ARB_draw_elements_base_vertex]", Boolean.valueOf(☃.GL_ARB_draw_elements_base_vertex));
    ☃.b("gl_caps[ARB_draw_indirect]", Boolean.valueOf(☃.GL_ARB_draw_indirect));
    ☃.b("gl_caps[ARB_draw_instanced]", Boolean.valueOf(☃.GL_ARB_draw_instanced));
    ☃.b("gl_caps[ARB_explicit_attrib_location]", Boolean.valueOf(☃.GL_ARB_explicit_attrib_location));
    ☃.b("gl_caps[ARB_explicit_uniform_location]", Boolean.valueOf(☃.GL_ARB_explicit_uniform_location));
    ☃.b("gl_caps[ARB_fragment_layer_viewport]", Boolean.valueOf(☃.GL_ARB_fragment_layer_viewport));
    ☃.b("gl_caps[ARB_fragment_program]", Boolean.valueOf(☃.GL_ARB_fragment_program));
    ☃.b("gl_caps[ARB_fragment_shader]", Boolean.valueOf(☃.GL_ARB_fragment_shader));
    ☃.b("gl_caps[ARB_fragment_program_shadow]", Boolean.valueOf(☃.GL_ARB_fragment_program_shadow));
    ☃.b("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(☃.GL_ARB_framebuffer_object));
    ☃.b("gl_caps[ARB_framebuffer_sRGB]", Boolean.valueOf(☃.GL_ARB_framebuffer_sRGB));
    ☃.b("gl_caps[ARB_geometry_shader4]", Boolean.valueOf(☃.GL_ARB_geometry_shader4));
    ☃.b("gl_caps[ARB_gpu_shader5]", Boolean.valueOf(☃.GL_ARB_gpu_shader5));
    ☃.b("gl_caps[ARB_half_float_pixel]", Boolean.valueOf(☃.GL_ARB_half_float_pixel));
    ☃.b("gl_caps[ARB_half_float_vertex]", Boolean.valueOf(☃.GL_ARB_half_float_vertex));
    ☃.b("gl_caps[ARB_instanced_arrays]", Boolean.valueOf(☃.GL_ARB_instanced_arrays));
    ☃.b("gl_caps[ARB_map_buffer_alignment]", Boolean.valueOf(☃.GL_ARB_map_buffer_alignment));
    ☃.b("gl_caps[ARB_map_buffer_range]", Boolean.valueOf(☃.GL_ARB_map_buffer_range));
    ☃.b("gl_caps[ARB_multisample]", Boolean.valueOf(☃.GL_ARB_multisample));
    ☃.b("gl_caps[ARB_multitexture]", Boolean.valueOf(☃.GL_ARB_multitexture));
    ☃.b("gl_caps[ARB_occlusion_query2]", Boolean.valueOf(☃.GL_ARB_occlusion_query2));
    ☃.b("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(☃.GL_ARB_pixel_buffer_object));
    ☃.b("gl_caps[ARB_seamless_cube_map]", Boolean.valueOf(☃.GL_ARB_seamless_cube_map));
    ☃.b("gl_caps[ARB_shader_objects]", Boolean.valueOf(☃.GL_ARB_shader_objects));
    ☃.b("gl_caps[ARB_shader_stencil_export]", Boolean.valueOf(☃.GL_ARB_shader_stencil_export));
    ☃.b("gl_caps[ARB_shader_texture_lod]", Boolean.valueOf(☃.GL_ARB_shader_texture_lod));
    ☃.b("gl_caps[ARB_shadow]", Boolean.valueOf(☃.GL_ARB_shadow));
    ☃.b("gl_caps[ARB_shadow_ambient]", Boolean.valueOf(☃.GL_ARB_shadow_ambient));
    ☃.b("gl_caps[ARB_stencil_texturing]", Boolean.valueOf(☃.GL_ARB_stencil_texturing));
    ☃.b("gl_caps[ARB_sync]", Boolean.valueOf(☃.GL_ARB_sync));
    ☃.b("gl_caps[ARB_tessellation_shader]", Boolean.valueOf(☃.GL_ARB_tessellation_shader));
    ☃.b("gl_caps[ARB_texture_border_clamp]", Boolean.valueOf(☃.GL_ARB_texture_border_clamp));
    ☃.b("gl_caps[ARB_texture_buffer_object]", Boolean.valueOf(☃.GL_ARB_texture_buffer_object));
    ☃.b("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(☃.GL_ARB_texture_cube_map));
    ☃.b("gl_caps[ARB_texture_cube_map_array]", Boolean.valueOf(☃.GL_ARB_texture_cube_map_array));
    ☃.b("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(☃.GL_ARB_texture_non_power_of_two));
    ☃.b("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(☃.GL_ARB_uniform_buffer_object));
    ☃.b("gl_caps[ARB_vertex_blend]", Boolean.valueOf(☃.GL_ARB_vertex_blend));
    ☃.b("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(☃.GL_ARB_vertex_buffer_object));
    ☃.b("gl_caps[ARB_vertex_program]", Boolean.valueOf(☃.GL_ARB_vertex_program));
    ☃.b("gl_caps[ARB_vertex_shader]", Boolean.valueOf(☃.GL_ARB_vertex_shader));
    
    ☃.b("gl_caps[EXT_bindable_uniform]", Boolean.valueOf(☃.GL_EXT_bindable_uniform));
    ☃.b("gl_caps[EXT_blend_equation_separate]", Boolean.valueOf(☃.GL_EXT_blend_equation_separate));
    ☃.b("gl_caps[EXT_blend_func_separate]", Boolean.valueOf(☃.GL_EXT_blend_func_separate));
    ☃.b("gl_caps[EXT_blend_minmax]", Boolean.valueOf(☃.GL_EXT_blend_minmax));
    ☃.b("gl_caps[EXT_blend_subtract]", Boolean.valueOf(☃.GL_EXT_blend_subtract));
    ☃.b("gl_caps[EXT_draw_instanced]", Boolean.valueOf(☃.GL_EXT_draw_instanced));
    ☃.b("gl_caps[EXT_framebuffer_multisample]", Boolean.valueOf(☃.GL_EXT_framebuffer_multisample));
    ☃.b("gl_caps[EXT_framebuffer_object]", Boolean.valueOf(☃.GL_EXT_framebuffer_object));
    ☃.b("gl_caps[EXT_framebuffer_sRGB]", Boolean.valueOf(☃.GL_EXT_framebuffer_sRGB));
    ☃.b("gl_caps[EXT_geometry_shader4]", Boolean.valueOf(☃.GL_EXT_geometry_shader4));
    ☃.b("gl_caps[EXT_gpu_program_parameters]", Boolean.valueOf(☃.GL_EXT_gpu_program_parameters));
    ☃.b("gl_caps[EXT_gpu_shader4]", Boolean.valueOf(☃.GL_EXT_gpu_shader4));
    ☃.b("gl_caps[EXT_multi_draw_arrays]", Boolean.valueOf(☃.GL_EXT_multi_draw_arrays));
    ☃.b("gl_caps[EXT_packed_depth_stencil]", Boolean.valueOf(☃.GL_EXT_packed_depth_stencil));
    ☃.b("gl_caps[EXT_paletted_texture]", Boolean.valueOf(☃.GL_EXT_paletted_texture));
    ☃.b("gl_caps[EXT_rescale_normal]", Boolean.valueOf(☃.GL_EXT_rescale_normal));
    ☃.b("gl_caps[EXT_separate_shader_objects]", Boolean.valueOf(☃.GL_EXT_separate_shader_objects));
    ☃.b("gl_caps[EXT_shader_image_load_store]", Boolean.valueOf(☃.GL_EXT_shader_image_load_store));
    ☃.b("gl_caps[EXT_shadow_funcs]", Boolean.valueOf(☃.GL_EXT_shadow_funcs));
    ☃.b("gl_caps[EXT_shared_texture_palette]", Boolean.valueOf(☃.GL_EXT_shared_texture_palette));
    ☃.b("gl_caps[EXT_stencil_clear_tag]", Boolean.valueOf(☃.GL_EXT_stencil_clear_tag));
    ☃.b("gl_caps[EXT_stencil_two_side]", Boolean.valueOf(☃.GL_EXT_stencil_two_side));
    ☃.b("gl_caps[EXT_stencil_wrap]", Boolean.valueOf(☃.GL_EXT_stencil_wrap));
    ☃.b("gl_caps[EXT_texture_3d]", Boolean.valueOf(☃.GL_EXT_texture_3d));
    ☃.b("gl_caps[EXT_texture_array]", Boolean.valueOf(☃.GL_EXT_texture_array));
    ☃.b("gl_caps[EXT_texture_buffer_object]", Boolean.valueOf(☃.GL_EXT_texture_buffer_object));
    ☃.b("gl_caps[EXT_texture_integer]", Boolean.valueOf(☃.GL_EXT_texture_integer));
    ☃.b("gl_caps[EXT_texture_lod_bias]", Boolean.valueOf(☃.GL_EXT_texture_lod_bias));
    ☃.b("gl_caps[EXT_texture_sRGB]", Boolean.valueOf(☃.GL_EXT_texture_sRGB));
    ☃.b("gl_caps[EXT_vertex_shader]", Boolean.valueOf(☃.GL_EXT_vertex_shader));
    ☃.b("gl_caps[EXT_vertex_weighting]", Boolean.valueOf(☃.GL_EXT_vertex_weighting));
    
    ☃.b("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger(35658)));
    GL11.glGetError();
    ☃.b("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger(35657)));
    GL11.glGetError();
    ☃.b("gl_caps[gl_max_vertex_attribs]", Integer.valueOf(GL11.glGetInteger(34921)));
    GL11.glGetError();
    ☃.b("gl_caps[gl_max_vertex_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35660)));
    GL11.glGetError();
    ☃.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(34930)));
    GL11.glGetError();
    ☃.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35071)));
    GL11.glGetError();
    
    ☃.b("gl_max_texture_size", Integer.valueOf(C()));
  }
  
  public static int C()
  {
    for (int ☃ = 16384; ☃ > 0; ☃ >>= 1)
    {
      GL11.glTexImage2D(32868, 0, 6408, ☃, ☃, 0, 6408, 5121, (ByteBuffer)null);
      int ☃ = GL11.glGetTexLevelParameteri(32868, 0, 4096);
      if (☃ != 0) {
        return ☃;
      }
    }
    return -1;
  }
  
  public boolean ad()
  {
    return this.t.r;
  }
  
  public void a(bde ☃)
  {
    this.Q = ☃;
  }
  
  public bde D()
  {
    return this.Q;
  }
  
  public boolean E()
  {
    return this.aw;
  }
  
  public boolean F()
  {
    return (this.aw) && (this.aj != null);
  }
  
  public bpo G()
  {
    return this.aj;
  }
  
  public static void H()
  {
    if (S == null) {
      return;
    }
    bpo ☃ = S.G();
    if (☃ != null) {
      ☃.t();
    }
  }
  
  public or I()
  {
    return this.Z;
  }
  
  public static long J()
  {
    return Sys.getTime() * 1000L / Sys.getTimerResolution();
  }
  
  public boolean K()
  {
    return this.T;
  }
  
  public avm L()
  {
    return this.ae;
  }
  
  public PropertyMap M()
  {
    return this.O;
  }
  
  public PropertyMap N()
  {
    if (this.P.isEmpty())
    {
      GameProfile ☃ = aa().fillProfileProperties(this.ae.e(), false);
      this.P.putAll(☃.getProperties());
    }
    return this.P;
  }
  
  public Proxy O()
  {
    return this.am;
  }
  
  public bmj P()
  {
    return this.R;
  }
  
  public bni Q()
  {
    return this.ay;
  }
  
  public bnm R()
  {
    return this.aC;
  }
  
  public bns S()
  {
    return this.aD;
  }
  
  public bmh T()
  {
    return this.aG;
  }
  
  public boolean U()
  {
    return this.at;
  }
  
  public boolean V()
  {
    return this.af;
  }
  
  public bpz W()
  {
    return this.aH;
  }
  
  public bpv.a X()
  {
    if (this.h != null)
    {
      if ((this.h.o.t instanceof ann)) {
        return bpv.a.e;
      }
      if ((this.h.o.t instanceof anp))
      {
        if ((bfc.c != null) && (bfc.b > 0)) {
          return bpv.a.f;
        }
        return bpv.a.g;
      }
      if ((this.h.bA.d) && (this.h.bA.c)) {
        return bpv.a.c;
      }
      return bpv.a.b;
    }
    return bpv.a.a;
  }
  
  public bqm Y()
  {
    return this.aE;
  }
  
  public void Z()
  {
    int ☃ = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
    if ((☃ == 0) || (Keyboard.isRepeatEvent())) {
      return;
    }
    if (((this.m instanceof ayj)) && (((ayj)this.m).g > J() - 20L)) {
      return;
    }
    if (Keyboard.getEventKeyState())
    {
      if (☃ == this.t.ar.i())
      {
        if (Y().k()) {
          Y().r();
        } else if (Y().j()) {
          a(new awy(new awx()
          {
            public void a(boolean ☃, int ☃)
            {
              if (☃) {
                ave.this.Y().q();
              }
              ave.this.a(null);
            }
          }, bnq.a("stream.confirm_start", new Object[0]), "", 0));
        } else if ((!Y().A()) || (!Y().i())) {
          baa.a(this.m);
        } else if (this.f != null) {
          this.q.d().a(new fa("Not ready to start streaming yet!"));
        }
      }
      else if (☃ == this.t.as.i())
      {
        if (Y().k()) {
          if (Y().l()) {
            Y().o();
          } else {
            Y().n();
          }
        }
      }
      else if (☃ == this.t.at.i())
      {
        if (Y().k()) {
          Y().m();
        }
      }
      else if (☃ == this.t.au.i()) {
        this.aE.a(true);
      } else if (☃ == this.t.ap.i()) {
        q();
      } else if (☃ == this.t.am.i()) {
        this.q.d().a(avj.a(this.v, this.d, this.e, this.aF));
      }
    }
    else if (☃ == this.t.au.i()) {
      this.aE.a(false);
    }
  }
  
  public MinecraftSessionService aa()
  {
    return this.aK;
  }
  
  public bnp ab()
  {
    return this.aL;
  }
  
  public pk ac()
  {
    return this.ad;
  }
  
  public void a(pk ☃)
  {
    this.ad = ☃;
    this.o.a(☃);
  }
  
  public <V> ListenableFuture<V> a(Callable<V> ☃)
  {
    Validate.notNull(☃);
    if (!aJ())
    {
      ListenableFutureTask<V> ☃ = ListenableFutureTask.create(☃);
      synchronized (this.aM)
      {
        this.aM.add(☃);
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
    return Thread.currentThread() == this.aO;
  }
  
  public bgd ae()
  {
    return this.aQ;
  }
  
  public biu af()
  {
    return this.aa;
  }
  
  public bjh ag()
  {
    return this.ab;
  }
  
  public bfn ah()
  {
    return this.ac;
  }
  
  public static int ai()
  {
    return ao;
  }
  
  public nh aj()
  {
    return this.y;
  }
  
  public static Map<String, String> ak()
  {
    Map<String, String> ☃ = Maps.newHashMap();
    ☃.put("X-Minecraft-Username", A().L().c());
    ☃.put("X-Minecraft-UUID", A().L().b());
    ☃.put("X-Minecraft-Version", "1.8.8");
    return ☃;
  }
  
  public boolean al()
  {
    return this.X;
  }
  
  public void a(boolean ☃)
  {
    this.X = ☃;
  }
}
