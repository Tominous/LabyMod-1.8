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
import de.labystudio.labymod.ClickCounter;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;
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
  public static boolean cancelShader = false;
  public String C = "";
  public boolean D = false;
  public boolean E = false;
  public boolean F = false;
  public boolean G = true;
  long H = J();
  int I;
  long J = -1L;
  private String aR = "root";
  
  public ave(bao gameConfig)
  {
    S = this;
    this.v = gameConfig.c.a;
    this.ak = gameConfig.c.c;
    this.N = gameConfig.c.b;
    this.al = gameConfig.d.b;
    this.O = gameConfig.a.b;
    this.P = gameConfig.a.c;
    this.aB = new bna(new bmy(gameConfig.c.c, gameConfig.c.d).a());
    this.am = (gameConfig.a.d == null ? Proxy.NO_PROXY : gameConfig.a.d);
    this.aK = new YggdrasilAuthenticationService(gameConfig.a.d, UUID.randomUUID().toString()).createMinecraftSessionService();
    this.ae = gameConfig.a.a;
    K.info("Setting user: " + this.ae.c());
    K.info("(Session ID is " + this.ae.a() + ")");
    this.au = gameConfig.d.a;
    this.d = (gameConfig.b.a > 0 ? gameConfig.b.a : 1);
    this.e = (gameConfig.b.b > 0 ? gameConfig.b.b : 1);
    this.ah = gameConfig.b.a;
    this.ai = gameConfig.b.b;
    this.T = gameConfig.b.c;
    this.at = as();
    this.aj = new bpo(this);
    if (gameConfig.e.a != null)
    {
      this.aq = gameConfig.e.a;
      this.ar = gameConfig.e.b;
    }
    ImageIO.setUseCache(false);
    kb.c();
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 333	ave:B	Z
    //   5: aload_0
    //   6: invokespecial 534	ave:am	()V
    //   9: goto +30 -> 39
    //   12: astore_1
    //   13: aload_1
    //   14: ldc_w 536
    //   17: invokestatic 540	b:a	(Ljava/lang/Throwable;Ljava/lang/String;)Lb;
    //   20: astore_2
    //   21: aload_2
    //   22: ldc_w 542
    //   25: invokevirtual 545	b:a	(Ljava/lang/String;)Lc;
    //   28: pop
    //   29: aload_0
    //   30: aload_0
    //   31: aload_2
    //   32: invokevirtual 548	ave:b	(Lb;)Lb;
    //   35: invokevirtual 551	ave:c	(Lb;)V
    //   38: return
    //   39: aload_0
    //   40: getfield 333	ave:B	Z
    //   43: ifeq +57 -> 100
    //   46: aload_0
    //   47: getfield 553	ave:V	Z
    //   50: ifeq +10 -> 60
    //   53: aload_0
    //   54: getfield 555	ave:W	Lb;
    //   57: ifnonnull +32 -> 89
    //   60: aload_0
    //   61: invokespecial 557	ave:av	()V
    //   64: goto -25 -> 39
    //   67: astore_1
    //   68: aload_0
    //   69: invokevirtual 559	ave:l	()V
    //   72: aload_0
    //   73: new 561	axo
    //   76: dup
    //   77: invokespecial 562	axo:<init>	()V
    //   80: invokevirtual 565	ave:a	(Laxu;)V
    //   83: invokestatic 568	java/lang/System:gc	()V
    //   86: goto -47 -> 39
    //   89: aload_0
    //   90: aload_0
    //   91: getfield 555	ave:W	Lb;
    //   94: invokevirtual 551	ave:c	(Lb;)V
    //   97: goto -58 -> 39
    //   100: aload_0
    //   101: invokevirtual 570	ave:g	()V
    //   104: goto +104 -> 208
    //   107: astore_1
    //   108: aload_0
    //   109: invokevirtual 570	ave:g	()V
    //   112: goto +97 -> 209
    //   115: astore_1
    //   116: aload_0
    //   117: aload_1
    //   118: invokevirtual 573	e:a	()Lb;
    //   121: invokevirtual 548	ave:b	(Lb;)Lb;
    //   124: pop
    //   125: aload_0
    //   126: invokevirtual 559	ave:l	()V
    //   129: getstatic 441	ave:K	Lorg/apache/logging/log4j/Logger;
    //   132: ldc_w 575
    //   135: aload_1
    //   136: invokeinterface 579 3 0
    //   141: aload_0
    //   142: aload_1
    //   143: invokevirtual 573	e:a	()Lb;
    //   146: invokevirtual 551	ave:c	(Lb;)V
    //   149: aload_0
    //   150: invokevirtual 570	ave:g	()V
    //   153: goto +56 -> 209
    //   156: astore_1
    //   157: aload_0
    //   158: new 537	b
    //   161: dup
    //   162: ldc_w 581
    //   165: aload_1
    //   166: invokespecial 583	b:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: invokevirtual 548	ave:b	(Lb;)Lb;
    //   172: astore_2
    //   173: aload_0
    //   174: invokevirtual 559	ave:l	()V
    //   177: getstatic 441	ave:K	Lorg/apache/logging/log4j/Logger;
    //   180: ldc_w 585
    //   183: aload_1
    //   184: invokeinterface 579 3 0
    //   189: aload_0
    //   190: aload_2
    //   191: invokevirtual 551	ave:c	(Lb;)V
    //   194: aload_0
    //   195: invokevirtual 570	ave:g	()V
    //   198: goto +11 -> 209
    //   201: astore_3
    //   202: aload_0
    //   203: invokevirtual 570	ave:g	()V
    //   206: aload_3
    //   207: athrow
    //   208: return
    //   209: return
    // Line number table:
    //   Java source line #404	-> byte code offset #0
    //   Java source line #408	-> byte code offset #5
    //   Java source line #416	-> byte code offset #9
    //   Java source line #410	-> byte code offset #12
    //   Java source line #412	-> byte code offset #13
    //   Java source line #413	-> byte code offset #21
    //   Java source line #414	-> byte code offset #29
    //   Java source line #415	-> byte code offset #38
    //   Java source line #422	-> byte code offset #39
    //   Java source line #424	-> byte code offset #46
    //   Java source line #428	-> byte code offset #60
    //   Java source line #435	-> byte code offset #64
    //   Java source line #430	-> byte code offset #67
    //   Java source line #432	-> byte code offset #68
    //   Java source line #433	-> byte code offset #72
    //   Java source line #434	-> byte code offset #83
    //   Java source line #435	-> byte code offset #86
    //   Java source line #439	-> byte code offset #89
    //   Java source line #465	-> byte code offset #100
    //   Java source line #466	-> byte code offset #104
    //   Java source line #443	-> byte code offset #107
    //   Java source line #465	-> byte code offset #108
    //   Java source line #447	-> byte code offset #115
    //   Java source line #449	-> byte code offset #116
    //   Java source line #450	-> byte code offset #125
    //   Java source line #451	-> byte code offset #129
    //   Java source line #452	-> byte code offset #141
    //   Java source line #465	-> byte code offset #149
    //   Java source line #455	-> byte code offset #156
    //   Java source line #457	-> byte code offset #157
    //   Java source line #458	-> byte code offset #173
    //   Java source line #459	-> byte code offset #177
    //   Java source line #460	-> byte code offset #189
    //   Java source line #465	-> byte code offset #194
    //   Java source line #468	-> byte code offset #208
    //   Java source line #470	-> byte code offset #209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	this	ave
    //   12	2	1	throwable	Throwable
    //   67	2	1	var10	OutOfMemoryError
    //   107	2	1	var12	avk
    //   115	28	1	reportedexception	e
    //   156	28	1	throwable1	Throwable
    //   20	12	2	crashreport	b
    //   172	19	2	crashreport1	b
    //   201	6	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	9	12	java/lang/Throwable
    //   60	64	67	java/lang/OutOfMemoryError
    //   39	100	107	avk
    //   39	100	115	e
    //   39	100	156	java/lang/Throwable
    //   39	100	201	finally
    //   115	149	201	finally
    //   156	194	201	finally
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
      public String a(String p_74535_1_)
      {
        try
        {
          return String.format(p_74535_1_, new Object[] { avh.c(ave.this.t.ae.i()) });
        }
        catch (Exception exception)
        {
          return "Error: " + exception.getLocalizedMessage();
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
    catch (OpenGLException var2)
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
    catch (Throwable throwable)
    {
      this.aE = new bqo(throwable);
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
    catch (LWJGLException lwjglexception)
    {
      K.error("Couldn't set pixel format", lwjglexception);
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
      DisplayMode displaymode = Display.getDisplayMode();
      this.d = Math.max(1, displaymode.getWidth());
      this.e = Math.max(1, displaymode.getHeight());
    }
    else
    {
      Display.setDisplayMode(new DisplayMode(this.d, this.e));
    }
  }
  
  private void ar()
  {
    g.a util$enumos = g.a();
    if (util$enumos != g.a.d)
    {
      InputStream inputstream = null;
      InputStream inputstream1 = null;
      try
      {
        inputstream = this.aB.c(new jy("icons/icon_16x16.png"));
        inputstream1 = this.aB.c(new jy("icons/icon_32x32.png"));
        if ((inputstream != null) && (inputstream1 != null)) {
          Display.setIcon(new ByteBuffer[] { a(inputstream), a(inputstream1) });
        }
      }
      catch (IOException ioexception)
      {
        K.error("Couldn't set icon", ioexception);
      }
      finally
      {
        IOUtils.closeQuietly(inputstream);
        IOUtils.closeQuietly(inputstream1);
      }
    }
  }
  
  private static boolean as()
  {
    String[] astring = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
    for (String s : astring)
    {
      String s1 = System.getProperty(s);
      if ((s1 != null) && (s1.contains("64"))) {
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
    Thread thread = new Thread("Timer hack thread")
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
    thread.setDaemon(true);
    thread.start();
  }
  
  public void a(b crash)
  {
    this.V = true;
    this.W = crash;
  }
  
  public void c(b crashReportIn)
  {
    File file1 = new File(A().v, "crash-reports");
    File file2 = new File(file1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
    kb.a(crashReportIn.e());
    if (crashReportIn.f() != null)
    {
      kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + crashReportIn.f());
      System.exit(-1);
    }
    else if (crashReportIn.a(file2))
    {
      kb.a("#@!@# Game crashed! Crash report saved to: #@!@# " + file2.getAbsolutePath());
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
    List<bnk> list = Lists.newArrayList(this.aA);
    for (bnm.a resourcepackrepository$entry : this.aC.c()) {
      list.add(resourcepackrepository$entry.c());
    }
    if (this.aC.e() != null) {
      list.add(this.aC.e());
    }
    try
    {
      this.ay.a(list);
    }
    catch (RuntimeException runtimeexception)
    {
      K.info("Caught error stitching, removing all assigned resourcepacks", runtimeexception);
      list.clear();
      list.addAll(this.aA);
      this.aC.a(Collections.emptyList());
      this.ay.a(list);
      this.t.k.clear();
      this.t.l.clear();
      this.t.b();
    }
    this.aD.a(list);
    if (this.g != null) {
      this.g.a();
    }
  }
  
  private ByteBuffer a(InputStream imageStream)
    throws IOException
  {
    BufferedImage bufferedimage = ImageIO.read(imageStream);
    int[] aint = bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), (int[])null, 0, bufferedimage.getWidth());
    ByteBuffer bytebuffer = ByteBuffer.allocate(4 * aint.length);
    for (int i : aint) {
      bytebuffer.putInt(i << 8 | i >> 24 & 0xFF);
    }
    bytebuffer.flip();
    return bytebuffer;
  }
  
  private void au()
    throws LWJGLException
  {
    Set<DisplayMode> set = Sets.newHashSet();
    Collections.addAll(set, Display.getAvailableDisplayModes());
    DisplayMode displaymode = Display.getDesktopDisplayMode();
    if ((!set.contains(displaymode)) && (g.a() == g.a.d))
    {
      Iterator localIterator1 = M.iterator();
      for (;;)
      {
        if (!localIterator1.hasNext()) {
          break label229;
        }
        DisplayMode displaymode1 = (DisplayMode)localIterator1.next();
        
        boolean flag = true;
        for (DisplayMode displaymode2 : set) {
          if ((displaymode2.getBitsPerPixel() == 32) && (displaymode2.getWidth() == displaymode1.getWidth()) && (displaymode2.getHeight() == displaymode1.getHeight()))
          {
            flag = false;
            break;
          }
        }
        if (!flag)
        {
          Iterator iterator = set.iterator();
          if (iterator.hasNext())
          {
            DisplayMode displaymode3 = (DisplayMode)iterator.next();
            if ((displaymode3.getBitsPerPixel() != 32) || (displaymode3.getWidth() != displaymode1.getWidth() / 2) || (displaymode3.getHeight() != displaymode1.getHeight() / 2)) {
              break;
            }
            displaymode = displaymode3;
          }
        }
      }
    }
    label229:
    Display.setDisplayMode(displaymode);
    this.d = displaymode.getWidth();
    this.e = displaymode.getHeight();
  }
  
  private void a(bmj textureManagerInstance)
    throws LWJGLException
  {
    avr scaledresolution = new avr(this);
    int i = scaledresolution.e();
    bfw framebuffer = new bfw(scaledresolution.a() * i, scaledresolution.b() * i, true);
    framebuffer.a(false);
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, scaledresolution.a(), scaledresolution.b(), 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
    bfl.f();
    bfl.n();
    bfl.i();
    bfl.w();
    InputStream inputstream = null;
    try
    {
      inputstream = this.aB.a(L);
      this.aJ = textureManagerInstance.a("logo", new blz(ImageIO.read(inputstream)));
      textureManagerInstance.a(this.aJ);
    }
    catch (IOException ioexception)
    {
      K.error("Unable to load logo: " + L, ioexception);
    }
    finally
    {
      IOUtils.closeQuietly(inputstream);
    }
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(0.0D, this.e, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    worldrenderer.b(this.d, this.e, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    worldrenderer.b(this.d, 0.0D, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    worldrenderer.b(0.0D, 0.0D, 0.0D).a(0.0D, 0.0D).b(255, 255, 255, 255).d();
    tessellator.b();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    int j = 256;
    int k = 256;
    a((scaledresolution.a() - j) / 2, (scaledresolution.b() - k) / 2, 0, 0, j, k, 255, 255, 255, 255);
    bfl.f();
    bfl.n();
    framebuffer.e();
    framebuffer.c(scaledresolution.a() * i, scaledresolution.b() * i);
    bfl.d();
    bfl.a(516, 0.1F);
    h();
  }
  
  public void a(int p_181536_1_, int p_181536_2_, int p_181536_3_, int p_181536_4_, int p_181536_5_, int p_181536_6_, int p_181536_7_, int p_181536_8_, int p_181536_9_, int p_181536_10_)
  {
    float f = 0.00390625F;
    float f1 = 0.00390625F;
    bfd worldrenderer = bfx.a().c();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(p_181536_1_, p_181536_2_ + p_181536_6_, 0.0D).a(p_181536_3_ * f, (p_181536_4_ + p_181536_6_) * f1).b(p_181536_7_, p_181536_8_, p_181536_9_, p_181536_10_).d();
    worldrenderer.b(p_181536_1_ + p_181536_5_, p_181536_2_ + p_181536_6_, 0.0D).a((p_181536_3_ + p_181536_5_) * f, (p_181536_4_ + p_181536_6_) * f1).b(p_181536_7_, p_181536_8_, p_181536_9_, p_181536_10_).d();
    worldrenderer.b(p_181536_1_ + p_181536_5_, p_181536_2_, 0.0D).a((p_181536_3_ + p_181536_5_) * f, p_181536_4_ * f1).b(p_181536_7_, p_181536_8_, p_181536_9_, p_181536_10_).d();
    worldrenderer.b(p_181536_1_, p_181536_2_, 0.0D).a(p_181536_3_ * f, p_181536_4_ * f1).b(p_181536_7_, p_181536_8_, p_181536_9_, p_181536_10_).d();
    bfx.a().b();
  }
  
  public atr f()
  {
    return this.an;
  }
  
  public void a(axu guiScreenIn)
  {
    if (this.m != null) {
      this.m.m();
    }
    if ((guiScreenIn == null) && (this.f == null)) {
      guiScreenIn = new aya();
    } else if ((guiScreenIn == null) && (this.h.bn() <= 0.0F)) {
      guiScreenIn = new axe();
    }
    if ((guiScreenIn instanceof aya))
    {
      this.t.aB = false;
      this.q.d().a();
    }
    this.m = guiScreenIn;
    if (guiScreenIn != null)
    {
      o();
      avr scaledresolution = new avr(this);
      int i = scaledresolution.a();
      int j = scaledresolution.b();
      guiScreenIn.a(this, i, j);
      this.r = false;
    }
    else
    {
      this.aH.e();
      n();
    }
  }
  
  private void b(String message)
  {
    if (this.U)
    {
      int i = GL11.glGetError();
      if (i != 0)
      {
        String s = GLU.gluErrorString(i);
        K.error("########## GL ERROR ##########");
        K.error("@ " + message);
        K.error(i + ": " + s);
      }
    }
  }
  
  /* Error */
  public void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 978	ave:aE	Lbqm;
    //   4: invokeinterface 1465 1 0
    //   9: getstatic 441	ave:K	Lorg/apache/logging/log4j/Logger;
    //   12: ldc_w 1467
    //   15: invokeinterface 461 2 0
    //   20: aload_0
    //   21: aconst_null
    //   22: checkcast 1469	bdb
    //   25: invokevirtual 1472	ave:a	(Lbdb;)V
    //   28: goto +4 -> 32
    //   31: astore_1
    //   32: aload_0
    //   33: getfield 718	ave:aH	Lbpz;
    //   36: invokevirtual 1473	bpz:d	()V
    //   39: invokestatic 1476	org/lwjgl/opengl/Display:destroy	()V
    //   42: aload_0
    //   43: getfield 553	ave:V	Z
    //   46: ifne +27 -> 73
    //   49: iconst_0
    //   50: invokestatic 1166	java/lang/System:exit	(I)V
    //   53: goto +20 -> 73
    //   56: astore_2
    //   57: invokestatic 1476	org/lwjgl/opengl/Display:destroy	()V
    //   60: aload_0
    //   61: getfield 553	ave:V	Z
    //   64: ifne +7 -> 71
    //   67: iconst_0
    //   68: invokestatic 1166	java/lang/System:exit	(I)V
    //   71: aload_2
    //   72: athrow
    //   73: invokestatic 568	java/lang/System:gc	()V
    //   76: return
    // Line number table:
    //   Java source line #1041	-> byte code offset #0
    //   Java source line #1042	-> byte code offset #9
    //   Java source line #1046	-> byte code offset #20
    //   Java source line #1051	-> byte code offset #28
    //   Java source line #1048	-> byte code offset #31
    //   Java source line #1053	-> byte code offset #32
    //   Java source line #1057	-> byte code offset #39
    //   Java source line #1059	-> byte code offset #42
    //   Java source line #1061	-> byte code offset #49
    //   Java source line #1057	-> byte code offset #56
    //   Java source line #1059	-> byte code offset #60
    //   Java source line #1061	-> byte code offset #67
    //   Java source line #1065	-> byte code offset #73
    //   Java source line #1066	-> byte code offset #76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	ave
    //   31	1	1	localThrowable	Throwable
    //   56	16	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   20	28	31	java/lang/Throwable
    //   0	39	56	finally
  }
  
  private void av()
    throws IOException
  {
    long i = System.nanoTime();
    this.A.a("root");
    if ((Display.isCreated()) && (Display.isCloseRequested())) {
      m();
    }
    if ((this.af) && (this.f != null))
    {
      float f = this.Y.c;
      this.Y.a();
      this.Y.c = f;
    }
    else
    {
      this.Y.a();
    }
    LabyMod.getInstance().setPartialTicks(this.Y.c);
    
    this.A.a("scheduledExecutables");
    synchronized (this.aM)
    {
      while (!this.aM.isEmpty()) {
        g.a((FutureTask)this.aM.poll(), K);
      }
    }
    this.A.b();
    long l = System.nanoTime();
    this.A.a("tick");
    for (int j = 0; j < this.Y.b; j++) {
      s();
    }
    this.A.c("preRenderErrors");
    long i1 = System.nanoTime() - l;
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
      this.o.a(this.Y.c, i);
      this.A.b();
    }
    this.A.b();
    if ((this.t.aB) && (this.t.aC) && (!this.t.az))
    {
      if (!this.A.a) {
        this.A.a();
      }
      this.A.a = true;
      a(i1);
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
    long k = System.nanoTime();
    this.y.a(k - this.z);
    this.z = k;
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
      int i = this.d;
      int j = this.e;
      this.d = Display.getWidth();
      this.e = Display.getHeight();
      if ((this.d != i) || (this.e != j))
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
    return (this.f == null) && (this.m != null) ? 30 : this.t.g;
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
      a((bdb)null);
    }
    catch (Throwable localThrowable1) {}
    System.gc();
  }
  
  private void b(int keyCount)
  {
    List<nt.a> list = this.A.b(this.aR);
    if ((list != null) && (!list.isEmpty()))
    {
      nt.a profiler$result = (nt.a)list.remove(0);
      if (keyCount == 0)
      {
        if (profiler$result.c.length() > 0)
        {
          int i = this.aR.lastIndexOf(".");
          if (i >= 0) {
            this.aR = this.aR.substring(0, i);
          }
        }
      }
      else
      {
        keyCount--;
        if ((keyCount < list.size()) && (!((nt.a)list.get(keyCount)).c.equals("unspecified")))
        {
          if (this.aR.length() > 0) {
            this.aR += ".";
          }
          this.aR += ((nt.a)list.get(keyCount)).c;
        }
      }
    }
  }
  
  private void a(long elapsedTicksTime)
  {
    if (this.A.a)
    {
      List<nt.a> list = this.A.b(this.aR);
      nt.a profiler$result = (nt.a)list.remove(0);
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
      bfx tessellator = bfx.a();
      bfd worldrenderer = tessellator.c();
      int i = 160;
      int j = this.d - i - 10;
      int k = this.e - i * 2;
      bfl.l();
      worldrenderer.a(7, bms.f);
      worldrenderer.b(j - i * 1.1F, k - i * 0.6F - 16.0F, 0.0D).b(200, 0, 0, 0).d();
      worldrenderer.b(j - i * 1.1F, k + i * 2, 0.0D).b(200, 0, 0, 0).d();
      worldrenderer.b(j + i * 1.1F, k + i * 2, 0.0D).b(200, 0, 0, 0).d();
      worldrenderer.b(j + i * 1.1F, k - i * 0.6F - 16.0F, 0.0D).b(200, 0, 0, 0).d();
      tessellator.b();
      bfl.k();
      double d0 = 0.0D;
      for (int l = 0; l < list.size(); l++)
      {
        nt.a profiler$result1 = (nt.a)list.get(l);
        int i1 = ns.c(profiler$result1.a / 4.0D) + 1;
        worldrenderer.a(6, bms.f);
        int j1 = profiler$result1.a();
        int k1 = j1 >> 16 & 0xFF;
        int l1 = j1 >> 8 & 0xFF;
        int i2 = j1 & 0xFF;
        worldrenderer.b(j, k, 0.0D).b(k1, l1, i2, 255).d();
        for (int j2 = i1; j2 >= 0; j2--)
        {
          float f = (float)((d0 + profiler$result1.a * j2 / i1) * 3.141592653589793D * 2.0D / 100.0D);
          float f1 = ns.a(f) * i;
          float f2 = ns.b(f) * i * 0.5F;
          worldrenderer.b(j + f1, k - f2, 0.0D).b(k1, l1, i2, 255).d();
        }
        tessellator.b();
        worldrenderer.a(5, bms.f);
        for (int i3 = i1; i3 >= 0; i3--)
        {
          float f3 = (float)((d0 + profiler$result1.a * i3 / i1) * 3.141592653589793D * 2.0D / 100.0D);
          float f4 = ns.a(f3) * i;
          float f5 = ns.b(f3) * i * 0.5F;
          worldrenderer.b(j + f4, k - f5, 0.0D).b(k1 >> 1, l1 >> 1, i2 >> 1, 255).d();
          worldrenderer.b(j + f4, k - f5 + 10.0F, 0.0D).b(k1 >> 1, l1 >> 1, i2 >> 1, 255).d();
        }
        tessellator.b();
        d0 += profiler$result1.a;
      }
      DecimalFormat decimalformat = new DecimalFormat("##0.00");
      bfl.w();
      String s = "";
      if (!profiler$result.c.equals("unspecified")) {
        s = s + "[0] ";
      }
      if (profiler$result.c.length() == 0) {
        s = s + "ROOT ";
      } else {
        s = s + profiler$result.c + " ";
      }
      int l2 = 16777215;
      this.k.a(s, j - i, k - i / 2 - 16, l2);
      this.k.a(s = decimalformat.format(profiler$result.b) + "%", j + i - this.k.a(s), k - i / 2 - 16, l2);
      for (int k2 = 0; k2 < list.size(); k2++)
      {
        nt.a profiler$result2 = (nt.a)list.get(k2);
        String s1 = "";
        if (profiler$result2.c.equals("unspecified")) {
          s1 = s1 + "[?] ";
        } else {
          s1 = s1 + "[" + (k2 + 1) + "] ";
        }
        s1 = s1 + profiler$result2.c;
        this.k.a(s1, j - i, k + i / 2 + k2 * 8 + 20, profiler$result2.a());
        this.k.a(s1 = decimalformat.format(profiler$result2.a) + "%", j + i - 50 - this.k.a(s1), k + i / 2 + k2 * 8 + 20, profiler$result2.a());
        this.k.a(s1 = decimalformat.format(profiler$result2.b) + "%", j + i - this.k.a(s1), k + i / 2 + k2 * 8 + 20, profiler$result2.a());
      }
    }
  }
  
  public void m()
  {
    this.B = false;
  }
  
  public void n()
  {
    if (Display.isActive()) {
      if (!this.w)
      {
        this.w = true;
        this.u.a();
        a((axu)null);
        this.ag = 10000;
      }
    }
  }
  
  public void o()
  {
    if (this.w)
    {
      avb.a();
      this.w = false;
      this.u.b();
    }
  }
  
  public void p()
  {
    if (this.m == null)
    {
      a(new axp());
      if ((F()) && (!this.aj.b())) {
        this.aH.a();
      }
    }
  }
  
  private void b(boolean leftClick)
  {
    if (!leftClick) {
      this.ag = 0;
    }
    if ((this.ag <= 0) && ((!this.h.bS()) || ((ConfigManager.settings.oldBlockBuild) && (Allowed.blockBuild())))) {
      if ((leftClick) && (this.s != null) && (this.s.a == auh.a.b))
      {
        cj blockpos = this.s.a();
        if ((this.f.p(blockpos).c().t() != arm.a) && (this.c.c(blockpos, this.s.b)))
        {
          this.j.a(blockpos, this.s.b);
          this.h.bw();
        }
      }
      else
      {
        this.c.c();
      }
    }
  }
  
  private void aw()
  {
    if (this.ag <= 0)
    {
      this.h.bw();
      if (this.s == null)
      {
        K.error("Null returned as 'hitResult', this shouldn't happen!");
        if (this.c.g()) {
          this.ag = 10;
        }
      }
      else
      {
        switch (this.s.a)
        {
        case c: 
          this.c.a(this.h, this.s.d);
          break;
        case b: 
          cj blockpos = this.s.a();
          if (this.f.p(blockpos).c().t() != arm.a) {
            this.c.b(blockpos, this.s.b);
          }
          break;
        }
        if (this.c.g()) {
          this.ag = 10;
        }
      }
    }
  }
  
  private void ax()
  {
    if (!this.c.m())
    {
      this.ap = 4;
      boolean flag = true;
      zx itemstack = this.h.bi.h();
      if (this.s == null) {
        K.warn("Null returned as 'hitResult', this shouldn't happen!");
      } else {
        switch (this.s.a)
        {
        case c: 
          if (this.c.a(this.h, this.s.d, this.s)) {
            flag = false;
          } else if (this.c.b(this.h, this.s.d)) {
            flag = false;
          }
          break;
        case b: 
          cj blockpos = this.s.a();
          if (this.f.p(blockpos).c().t() != arm.a)
          {
            int i = itemstack != null ? itemstack.b : 0;
            if (this.c.a(this.h, this.f, itemstack, blockpos, this.s.b, this.s.c))
            {
              flag = false;
              this.h.bw();
            }
            if (itemstack == null) {
              return;
            }
            if (itemstack.b == 0) {
              this.h.bi.a[this.h.bi.c] = null;
            } else if ((itemstack.b != i) || (this.c.h())) {
              this.o.c.b();
            }
          }
          break;
        }
      }
      if (flag)
      {
        zx itemstack1 = this.h.bi.h();
        if ((itemstack1 != null) && (this.c.a(this.h, this.f, itemstack1))) {
          this.o.c.c();
        }
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
    catch (Exception exception)
    {
      K.error("Couldn't toggle fullscreen", exception);
    }
  }
  
  private void a(int width, int height)
  {
    this.d = Math.max(1, width);
    this.e = Math.max(1, height);
    if (this.m != null)
    {
      avr scaledresolution = new avr(this);
      this.m.b(this, scaledresolution.a(), scaledresolution.b());
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
    throws IOException
  {
    if (this.ap > 0) {
      this.ap -= 1;
    }
    this.A.a("gui");
    if (!this.af) {
      this.q.c();
    }
    LabyMod.getInstance().gameTick();
    
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
        a((axu)null);
      } else if ((this.h.bJ()) && (this.f != null)) {
        a(new axk());
      }
    }
    else if ((this.m != null) && ((this.m instanceof axk)) && (!this.h.bJ())) {
      a((axu)null);
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
      catch (Throwable throwable1)
      {
        b crashreport = b.a(throwable1, "Updating screen events");
        c crashreportcategory = crashreport.a("Affected screen");
        crashreportcategory.a("Screen name", new Callable()
        {
          public String a()
            throws Exception
          {
            return ave.this.m.getClass().getCanonicalName();
          }
        });
        throw new e(crashreport);
      }
      if (this.m != null) {
        try
        {
          this.m.e();
        }
        catch (Throwable throwable)
        {
          b crashreport1 = b.a(throwable, "Ticking screen");
          c crashreportcategory1 = crashreport1.a("Affected screen");
          crashreportcategory1.a("Screen name", new Callable()
          {
            public String a()
              throws Exception
            {
              return ave.this.m.getClass().getCanonicalName();
            }
          });
          throw new e(crashreport1);
        }
      }
    }
    if ((this.m == null) || (this.m.p))
    {
      this.A.c("mouse");
      while (Mouse.next())
      {
        int i = Mouse.getEventButton();
        avb.a(i - 100, Mouse.getEventButtonState());
        if (Mouse.getEventButtonState()) {
          if ((this.h.v()) && (i == 2)) {
            this.q.g().b();
          } else {
            avb.a(i - 100);
          }
        }
        long i1 = J() - this.x;
        if (i1 <= 200L)
        {
          int j = Mouse.getEventDWheel();
          if (j != 0) {
            if (this.h.v())
            {
              j = j < 0 ? -1 : 1;
              if (this.q.g().a())
              {
                this.q.g().b(-j);
              }
              else
              {
                float f = ns.a(this.h.bA.a() + j * 0.005F, 0.0F, 0.2F);
                this.h.bA.a(f);
              }
            }
            else
            {
              this.h.bi.d(j);
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
        int k = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + 'Ā' : Keyboard.getEventKey();
        avb.a(k, Keyboard.getEventKeyState());
        if (Keyboard.getEventKeyState()) {
          avb.a(k);
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
          if ((k == 62) && (this.o != null)) {
            if (!cancelShader) {
              this.o.c();
            }
          }
          if (this.m != null)
          {
            this.m.l();
          }
          else
          {
            if (k == 1) {
              p();
            }
            if ((k == 32) && (Keyboard.isKeyDown(61)) && (this.q != null)) {
              this.q.d().a();
            }
            if ((k == 31) && (Keyboard.isKeyDown(61))) {
              e();
            }
            if (((k != 17) || (!Keyboard.isKeyDown(61))) || (
            
              ((k != 18) || (!Keyboard.isKeyDown(61))) || (
              
              ((k != 47) || (!Keyboard.isKeyDown(61))) || (
              
              ((k != 38) || (!Keyboard.isKeyDown(61))) || (
              
              ((k != 22) || (!Keyboard.isKeyDown(61))) || (
              
              (k == 20) && (Keyboard.isKeyDown(61)))))))) {
              e();
            }
            if ((k == 33) && (Keyboard.isKeyDown(61))) {
              this.t.a(avh.a.f, axu.r() ? -1 : 1);
            }
            if ((k == 30) && (Keyboard.isKeyDown(61))) {
              this.g.a();
            }
            if ((k == 35) && (Keyboard.isKeyDown(61)))
            {
              this.t.y = (!this.t.y);
              this.t.b();
            }
            if ((k == 48) && (Keyboard.isKeyDown(61))) {
              this.aa.b(!this.aa.b());
            }
            if ((k == 25) && (Keyboard.isKeyDown(61)))
            {
              this.t.z = (!this.t.z);
              this.t.b();
            }
            if (k == 59) {
              this.t.az = (!this.t.az);
            }
            if (k == 61)
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
              if (!cancelShader) {
                if (this.t.aA == 0) {
                  this.o.a(ac());
                } else if (this.t.aA == 1) {
                  this.o.a((pk)null);
                }
              }
              this.g.m();
            }
            if (this.t.ao.f()) {
              this.t.aF = (!this.t.aF);
            }
          }
          if ((this.t.aB) && (this.t.aC))
          {
            if (k == 11) {
              b(0);
            }
            for (int j1 = 0; j1 < 9; j1++) {
              if (k == 2 + j1) {
                b(j1 + 1);
              }
            }
          }
        }
      }
      for (int l = 0; l < 9; l++) {
        if (this.t.av[l].f()) {
          if (this.h.v()) {
            this.q.g().a(l);
          } else {
            this.h.bi.c = l;
          }
        }
      }
      boolean flag = this.t.m != wn.b.c;
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
      while ((this.t.aj.f()) && (flag)) {
        a(new awv());
      }
      if ((this.m == null) && (this.t.al.f()) && (flag)) {
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
      while (this.t.ah.f())
      {
        aw();
        ClickCounter.click();
      }
      while (this.t.af.f())
      {
        ax();
        ClickCounter.click();
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
        catch (Throwable throwable2)
        {
          b crashreport2 = b.a(throwable2, "Exception in world tick");
          if (this.f == null)
          {
            c crashreportcategory2 = crashreport2.a("Affected level");
            crashreportcategory2.a("Problem", "Level is null!");
          }
          else
          {
            this.f.a(crashreport2);
          }
          throw new e(crashreport2);
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
  
  public void a(String folderName, String worldName, adp worldSettingsIn)
  {
    a((bdb)null);
    System.gc();
    atp isavehandler = this.an.a(folderName, false);
    ato worldinfo = isavehandler.d();
    if ((worldinfo == null) && (worldSettingsIn != null))
    {
      worldinfo = new ato(worldSettingsIn, folderName);
      isavehandler.a(worldinfo);
    }
    if (worldSettingsIn == null) {
      worldSettingsIn = new adp(worldinfo);
    }
    try
    {
      this.aj = new bpo(this, folderName, worldName, worldSettingsIn);
      this.aj.D();
      this.aw = true;
    }
    catch (Throwable throwable)
    {
      b crashreport = b.a(throwable, "Starting integrated server");
      c crashreportcategory = crashreport.a("Starting integrated server");
      crashreportcategory.a("Level ID", folderName);
      crashreportcategory.a("Level Name", worldName);
      throw new e(crashreport);
    }
    this.n.a(bnq.a("menu.loadingLevel", new Object[0]));
    while (!this.aj.ar())
    {
      String s = this.aj.j();
      if (s != null) {
        this.n.c(bnq.a(s, new Object[0]));
      } else {
        this.n.c("");
      }
      try
      {
        Thread.sleep(200L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
    a((axu)null);
    SocketAddress socketaddress = this.aj.aq().a();
    ek networkmanager = ek.a(socketaddress);
    networkmanager.a(new bcx(networkmanager, this, (axu)null));
    networkmanager.a(new jc(47, socketaddress.toString(), 0, el.d));
    networkmanager.a(new jl(L().e()));
    this.av = networkmanager;
  }
  
  public void a(bdb worldClientIn)
  {
    a(worldClientIn, "");
  }
  
  public void a(bdb worldClientIn, String loadingMessage)
  {
    if (worldClientIn == null)
    {
      bcy nethandlerplayclient = u();
      if (nethandlerplayclient != null) {
        nethandlerplayclient.b();
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
      this.n.b(loadingMessage);
      this.n.c("");
    }
    if ((worldClientIn == null) && (this.f != null))
    {
      this.aC.f();
      this.q.i();
      a((bde)null);
      this.aw = false;
    }
    this.aH.b();
    this.f = worldClientIn;
    if (worldClientIn != null)
    {
      if (this.g != null) {
        this.g.a(worldClientIn);
      }
      if (this.j != null) {
        this.j.a(worldClientIn);
      }
      if (this.h == null)
      {
        this.h = this.c.a(worldClientIn, new nb());
        this.c.b(this.h);
      }
      this.h.I();
      worldClientIn.d(this.h);
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
  
  public void a(int dimension)
  {
    this.f.g();
    this.f.a();
    int i = 0;
    String s = null;
    if (this.h != null)
    {
      i = this.h.F();
      this.f.e(this.h);
      s = this.h.w();
    }
    this.ad = null;
    bew entityplayersp = this.h;
    this.h = this.c.a(this.f, this.h == null ? new nb() : this.h.x());
    this.h.H().a(entityplayersp.H().c());
    this.h.am = dimension;
    this.ad = this.h;
    this.h.I();
    this.h.f(s);
    this.f.d(this.h);
    this.c.b(this.h);
    this.h.b = new bev(this.t);
    this.h.d(i);
    this.c.a(this.h);
    this.h.k(entityplayersp.cq());
    if ((this.m instanceof axe)) {
      a((axu)null);
    }
  }
  
  public final boolean t()
  {
    return this.au;
  }
  
  public bcy u()
  {
    return this.h != null ? this.h.a : null;
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
    if (this.s != null)
    {
      boolean flag = this.h.bA.d;
      int i = 0;
      boolean flag1 = false;
      akw tileentity = null;
      zw item;
      if (this.s.a == auh.a.b)
      {
        cj blockpos = this.s.a();
        afh block = this.f.p(blockpos).c();
        if (block.t() == arm.a) {
          return;
        }
        zw item = block.c(this.f, blockpos);
        if (item == null) {
          return;
        }
        if ((flag) && (axu.q())) {
          tileentity = this.f.s(blockpos);
        }
        afh block1 = ((item instanceof yo)) && (!block.M()) ? afh.a(item) : block;
        i = block1.j(this.f, blockpos);
        flag1 = item.k();
      }
      else
      {
        if ((this.s.a != auh.a.c) || (this.s.d == null) || (!flag)) {
          return;
        }
        zw item;
        if ((this.s.d instanceof uq))
        {
          item = zy.an;
        }
        else
        {
          zw item;
          if ((this.s.d instanceof up))
          {
            item = zy.cn;
          }
          else if ((this.s.d instanceof uo))
          {
            uo entityitemframe = (uo)this.s.d;
            zx itemstack = entityitemframe.o();
            zw item;
            if (itemstack == null)
            {
              item = zy.bP;
            }
            else
            {
              zw item = itemstack.b();
              i = itemstack.i();
              flag1 = true;
            }
          }
          else
          {
            zw item;
            if ((this.s.d instanceof va))
            {
              va entityminecart = (va)this.s.d;
              zw item;
              zw item;
              zw item;
              zw item;
              zw item;
              switch (entityminecart.s())
              {
              case c: 
                item = zy.aO;
                break;
              case b: 
                item = zy.aN;
                break;
              case d: 
                item = zy.ch;
                break;
              case f: 
                item = zy.ci;
                break;
              case g: 
                item = zy.cp;
                break;
              default: 
                item = zy.az;
              }
            }
            else
            {
              zw item;
              if ((this.s.d instanceof ux))
              {
                item = zy.aE;
              }
              else
              {
                zw item;
                if ((this.s.d instanceof um))
                {
                  item = zy.cj;
                }
                else
                {
                  item = zy.bJ;
                  i = pm.a(this.s.d);
                  flag1 = true;
                  if (!pm.a.containsKey(Integer.valueOf(i))) {
                    return;
                  }
                }
              }
            }
          }
        }
      }
      wm inventoryplayer = this.h.bi;
      if (tileentity == null)
      {
        inventoryplayer.a(item, i, flag1, flag);
      }
      else
      {
        zx itemstack1 = a(item, i, tileentity);
        inventoryplayer.a(inventoryplayer.c, itemstack1);
      }
      if (flag)
      {
        int j = this.h.bj.c.size() - 9 + inventoryplayer.c;
        this.c.a(inventoryplayer.a(inventoryplayer.c), j);
      }
    }
  }
  
  private zx a(zw p_181036_1_, int p_181036_2_, akw p_181036_3_)
  {
    zx itemstack = new zx(p_181036_1_, 1, p_181036_2_);
    dn nbttagcompound = new dn();
    p_181036_3_.b(nbttagcompound);
    if ((p_181036_1_ == zy.bX) && (nbttagcompound.c("Owner")))
    {
      dn nbttagcompound2 = nbttagcompound.m("Owner");
      dn nbttagcompound3 = new dn();
      nbttagcompound3.a("SkullOwner", nbttagcompound2);
      itemstack.d(nbttagcompound3);
      return itemstack;
    }
    itemstack.a("BlockEntityTag", nbttagcompound);
    dn nbttagcompound1 = new dn();
    du nbttaglist = new du();
    nbttaglist.a(new ea("(+NBT)"));
    nbttagcompound1.a("Lore", nbttaglist);
    itemstack.a("display", nbttagcompound1);
    return itemstack;
  }
  
  public b b(b theCrash)
  {
    theCrash.g().a("Launched Version", new Callable()
    {
      public String a()
        throws Exception
      {
        return ave.a(ave.this);
      }
    });
    theCrash.g().a("LWJGL", new Callable()
    {
      public String a()
      {
        return Sys.getVersion();
      }
    });
    theCrash.g().a("OpenGL", new Callable()
    {
      public String a()
      {
        return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
      }
    });
    theCrash.g().a("GL Caps", new Callable()
    {
      public String call()
      {
        return bqs.c();
      }
    });
    theCrash.g().a("Using VBOs", new Callable()
    {
      public String call()
      {
        return ave.this.t.u ? "Yes" : "No";
      }
    });
    theCrash.g().a("Is Modded", new Callable()
    {
      public String call()
        throws Exception
      {
        String s = ClientBrandRetriever.getClientModName();
        return ave.class.getSigners() == null ? "Very likely; Jar signature invalidated" : !s.equals("vanilla") ? "Definitely; Client brand changed to '" + s + "'" : "Probably not. Jar signature remains and client brand is untouched.";
      }
    });
    theCrash.g().a("Type", new Callable()
    {
      public String call()
        throws Exception
      {
        return "Client (map_client.txt)";
      }
    });
    theCrash.g().a("Resource Packs", new Callable()
    {
      public String a()
        throws Exception
      {
        StringBuilder stringbuilder = new StringBuilder();
        for (String s : ave.this.t.k)
        {
          if (stringbuilder.length() > 0) {
            stringbuilder.append(", ");
          }
          stringbuilder.append(s);
          if (ave.this.t.l.contains(s)) {
            stringbuilder.append(" (incompatible)");
          }
        }
        return stringbuilder.toString();
      }
    });
    theCrash.g().a("Current Language", new Callable()
    {
      public String a()
        throws Exception
      {
        return ave.b(ave.this).c().toString();
      }
    });
    theCrash.g().a("Profiler Position", new Callable()
    {
      public String a()
        throws Exception
      {
        return ave.this.A.a ? ave.this.A.c() : "N/A (disabled)";
      }
    });
    theCrash.g().a("CPU", new Callable()
    {
      public String a()
      {
        return bqs.j();
      }
    });
    if (this.f != null) {
      this.f.a(theCrash);
    }
    return theCrash;
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
  
  public void a(or playerSnooper)
  {
    playerSnooper.a("fps", Integer.valueOf(ao));
    playerSnooper.a("vsync_enabled", Boolean.valueOf(this.t.t));
    playerSnooper.a("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
    playerSnooper.a("display_type", this.T ? "fullscreen" : "windowed");
    playerSnooper.a("run_time", Long.valueOf((MinecraftServer.az() - playerSnooper.g()) / 60L * 1000L));
    playerSnooper.a("current_action", aA());
    String s = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? "little" : "big";
    playerSnooper.a("endianness", s);
    playerSnooper.a("resource_packs", Integer.valueOf(this.aC.c().size()));
    int i = 0;
    for (bnm.a resourcepackrepository$entry : this.aC.c()) {
      playerSnooper.a("resource_pack[" + i++ + "]", resourcepackrepository$entry.d());
    }
    if ((this.aj != null) && (this.aj.av() != null)) {
      playerSnooper.a("snooper_partner", this.aj.av().f());
    }
  }
  
  private String aA()
  {
    return this.Q != null ? "multiplayer" : this.Q.d() ? "playing_lan" : this.aj != null ? "singleplayer" : this.aj.b() ? "hosting_lan" : "out_of_game";
  }
  
  public void b(or playerSnooper)
  {
    playerSnooper.b("opengl_version", GL11.glGetString(7938));
    playerSnooper.b("opengl_vendor", GL11.glGetString(7936));
    playerSnooper.b("client_brand", ClientBrandRetriever.getClientModName());
    playerSnooper.b("launched_version", this.al);
    ContextCapabilities contextcapabilities = GLContext.getCapabilities();
    playerSnooper.b("gl_caps[ARB_arrays_of_arrays]", Boolean.valueOf(contextcapabilities.GL_ARB_arrays_of_arrays));
    playerSnooper.b("gl_caps[ARB_base_instance]", Boolean.valueOf(contextcapabilities.GL_ARB_base_instance));
    playerSnooper.b("gl_caps[ARB_blend_func_extended]", Boolean.valueOf(contextcapabilities.GL_ARB_blend_func_extended));
    playerSnooper.b("gl_caps[ARB_clear_buffer_object]", Boolean.valueOf(contextcapabilities.GL_ARB_clear_buffer_object));
    playerSnooper.b("gl_caps[ARB_color_buffer_float]", Boolean.valueOf(contextcapabilities.GL_ARB_color_buffer_float));
    playerSnooper.b("gl_caps[ARB_compatibility]", Boolean.valueOf(contextcapabilities.GL_ARB_compatibility));
    playerSnooper.b("gl_caps[ARB_compressed_texture_pixel_storage]", Boolean.valueOf(contextcapabilities.GL_ARB_compressed_texture_pixel_storage));
    playerSnooper.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(contextcapabilities.GL_ARB_compute_shader));
    playerSnooper.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(contextcapabilities.GL_ARB_copy_buffer));
    playerSnooper.b("gl_caps[ARB_copy_image]", Boolean.valueOf(contextcapabilities.GL_ARB_copy_image));
    playerSnooper.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(contextcapabilities.GL_ARB_depth_buffer_float));
    playerSnooper.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(contextcapabilities.GL_ARB_compute_shader));
    playerSnooper.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(contextcapabilities.GL_ARB_copy_buffer));
    playerSnooper.b("gl_caps[ARB_copy_image]", Boolean.valueOf(contextcapabilities.GL_ARB_copy_image));
    playerSnooper.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(contextcapabilities.GL_ARB_depth_buffer_float));
    playerSnooper.b("gl_caps[ARB_depth_clamp]", Boolean.valueOf(contextcapabilities.GL_ARB_depth_clamp));
    playerSnooper.b("gl_caps[ARB_depth_texture]", Boolean.valueOf(contextcapabilities.GL_ARB_depth_texture));
    playerSnooper.b("gl_caps[ARB_draw_buffers]", Boolean.valueOf(contextcapabilities.GL_ARB_draw_buffers));
    playerSnooper.b("gl_caps[ARB_draw_buffers_blend]", Boolean.valueOf(contextcapabilities.GL_ARB_draw_buffers_blend));
    playerSnooper.b("gl_caps[ARB_draw_elements_base_vertex]", Boolean.valueOf(contextcapabilities.GL_ARB_draw_elements_base_vertex));
    playerSnooper.b("gl_caps[ARB_draw_indirect]", Boolean.valueOf(contextcapabilities.GL_ARB_draw_indirect));
    playerSnooper.b("gl_caps[ARB_draw_instanced]", Boolean.valueOf(contextcapabilities.GL_ARB_draw_instanced));
    playerSnooper.b("gl_caps[ARB_explicit_attrib_location]", Boolean.valueOf(contextcapabilities.GL_ARB_explicit_attrib_location));
    playerSnooper.b("gl_caps[ARB_explicit_uniform_location]", Boolean.valueOf(contextcapabilities.GL_ARB_explicit_uniform_location));
    playerSnooper.b("gl_caps[ARB_fragment_layer_viewport]", Boolean.valueOf(contextcapabilities.GL_ARB_fragment_layer_viewport));
    playerSnooper.b("gl_caps[ARB_fragment_program]", Boolean.valueOf(contextcapabilities.GL_ARB_fragment_program));
    playerSnooper.b("gl_caps[ARB_fragment_shader]", Boolean.valueOf(contextcapabilities.GL_ARB_fragment_shader));
    playerSnooper.b("gl_caps[ARB_fragment_program_shadow]", Boolean.valueOf(contextcapabilities.GL_ARB_fragment_program_shadow));
    playerSnooper.b("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(contextcapabilities.GL_ARB_framebuffer_object));
    playerSnooper.b("gl_caps[ARB_framebuffer_sRGB]", Boolean.valueOf(contextcapabilities.GL_ARB_framebuffer_sRGB));
    playerSnooper.b("gl_caps[ARB_geometry_shader4]", Boolean.valueOf(contextcapabilities.GL_ARB_geometry_shader4));
    playerSnooper.b("gl_caps[ARB_gpu_shader5]", Boolean.valueOf(contextcapabilities.GL_ARB_gpu_shader5));
    playerSnooper.b("gl_caps[ARB_half_float_pixel]", Boolean.valueOf(contextcapabilities.GL_ARB_half_float_pixel));
    playerSnooper.b("gl_caps[ARB_half_float_vertex]", Boolean.valueOf(contextcapabilities.GL_ARB_half_float_vertex));
    playerSnooper.b("gl_caps[ARB_instanced_arrays]", Boolean.valueOf(contextcapabilities.GL_ARB_instanced_arrays));
    playerSnooper.b("gl_caps[ARB_map_buffer_alignment]", Boolean.valueOf(contextcapabilities.GL_ARB_map_buffer_alignment));
    playerSnooper.b("gl_caps[ARB_map_buffer_range]", Boolean.valueOf(contextcapabilities.GL_ARB_map_buffer_range));
    playerSnooper.b("gl_caps[ARB_multisample]", Boolean.valueOf(contextcapabilities.GL_ARB_multisample));
    playerSnooper.b("gl_caps[ARB_multitexture]", Boolean.valueOf(contextcapabilities.GL_ARB_multitexture));
    playerSnooper.b("gl_caps[ARB_occlusion_query2]", Boolean.valueOf(contextcapabilities.GL_ARB_occlusion_query2));
    playerSnooper.b("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(contextcapabilities.GL_ARB_pixel_buffer_object));
    playerSnooper.b("gl_caps[ARB_seamless_cube_map]", Boolean.valueOf(contextcapabilities.GL_ARB_seamless_cube_map));
    playerSnooper.b("gl_caps[ARB_shader_objects]", Boolean.valueOf(contextcapabilities.GL_ARB_shader_objects));
    playerSnooper.b("gl_caps[ARB_shader_stencil_export]", Boolean.valueOf(contextcapabilities.GL_ARB_shader_stencil_export));
    playerSnooper.b("gl_caps[ARB_shader_texture_lod]", Boolean.valueOf(contextcapabilities.GL_ARB_shader_texture_lod));
    playerSnooper.b("gl_caps[ARB_shadow]", Boolean.valueOf(contextcapabilities.GL_ARB_shadow));
    playerSnooper.b("gl_caps[ARB_shadow_ambient]", Boolean.valueOf(contextcapabilities.GL_ARB_shadow_ambient));
    playerSnooper.b("gl_caps[ARB_stencil_texturing]", Boolean.valueOf(contextcapabilities.GL_ARB_stencil_texturing));
    playerSnooper.b("gl_caps[ARB_sync]", Boolean.valueOf(contextcapabilities.GL_ARB_sync));
    playerSnooper.b("gl_caps[ARB_tessellation_shader]", Boolean.valueOf(contextcapabilities.GL_ARB_tessellation_shader));
    playerSnooper.b("gl_caps[ARB_texture_border_clamp]", Boolean.valueOf(contextcapabilities.GL_ARB_texture_border_clamp));
    playerSnooper.b("gl_caps[ARB_texture_buffer_object]", Boolean.valueOf(contextcapabilities.GL_ARB_texture_buffer_object));
    playerSnooper.b("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(contextcapabilities.GL_ARB_texture_cube_map));
    playerSnooper.b("gl_caps[ARB_texture_cube_map_array]", Boolean.valueOf(contextcapabilities.GL_ARB_texture_cube_map_array));
    playerSnooper.b("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(contextcapabilities.GL_ARB_texture_non_power_of_two));
    playerSnooper.b("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(contextcapabilities.GL_ARB_uniform_buffer_object));
    playerSnooper.b("gl_caps[ARB_vertex_blend]", Boolean.valueOf(contextcapabilities.GL_ARB_vertex_blend));
    playerSnooper.b("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(contextcapabilities.GL_ARB_vertex_buffer_object));
    playerSnooper.b("gl_caps[ARB_vertex_program]", Boolean.valueOf(contextcapabilities.GL_ARB_vertex_program));
    playerSnooper.b("gl_caps[ARB_vertex_shader]", Boolean.valueOf(contextcapabilities.GL_ARB_vertex_shader));
    playerSnooper.b("gl_caps[EXT_bindable_uniform]", Boolean.valueOf(contextcapabilities.GL_EXT_bindable_uniform));
    playerSnooper.b("gl_caps[EXT_blend_equation_separate]", Boolean.valueOf(contextcapabilities.GL_EXT_blend_equation_separate));
    playerSnooper.b("gl_caps[EXT_blend_func_separate]", Boolean.valueOf(contextcapabilities.GL_EXT_blend_func_separate));
    playerSnooper.b("gl_caps[EXT_blend_minmax]", Boolean.valueOf(contextcapabilities.GL_EXT_blend_minmax));
    playerSnooper.b("gl_caps[EXT_blend_subtract]", Boolean.valueOf(contextcapabilities.GL_EXT_blend_subtract));
    playerSnooper.b("gl_caps[EXT_draw_instanced]", Boolean.valueOf(contextcapabilities.GL_EXT_draw_instanced));
    playerSnooper.b("gl_caps[EXT_framebuffer_multisample]", Boolean.valueOf(contextcapabilities.GL_EXT_framebuffer_multisample));
    playerSnooper.b("gl_caps[EXT_framebuffer_object]", Boolean.valueOf(contextcapabilities.GL_EXT_framebuffer_object));
    playerSnooper.b("gl_caps[EXT_framebuffer_sRGB]", Boolean.valueOf(contextcapabilities.GL_EXT_framebuffer_sRGB));
    playerSnooper.b("gl_caps[EXT_geometry_shader4]", Boolean.valueOf(contextcapabilities.GL_EXT_geometry_shader4));
    playerSnooper.b("gl_caps[EXT_gpu_program_parameters]", Boolean.valueOf(contextcapabilities.GL_EXT_gpu_program_parameters));
    playerSnooper.b("gl_caps[EXT_gpu_shader4]", Boolean.valueOf(contextcapabilities.GL_EXT_gpu_shader4));
    playerSnooper.b("gl_caps[EXT_multi_draw_arrays]", Boolean.valueOf(contextcapabilities.GL_EXT_multi_draw_arrays));
    playerSnooper.b("gl_caps[EXT_packed_depth_stencil]", Boolean.valueOf(contextcapabilities.GL_EXT_packed_depth_stencil));
    playerSnooper.b("gl_caps[EXT_paletted_texture]", Boolean.valueOf(contextcapabilities.GL_EXT_paletted_texture));
    playerSnooper.b("gl_caps[EXT_rescale_normal]", Boolean.valueOf(contextcapabilities.GL_EXT_rescale_normal));
    playerSnooper.b("gl_caps[EXT_separate_shader_objects]", Boolean.valueOf(contextcapabilities.GL_EXT_separate_shader_objects));
    playerSnooper.b("gl_caps[EXT_shader_image_load_store]", Boolean.valueOf(contextcapabilities.GL_EXT_shader_image_load_store));
    playerSnooper.b("gl_caps[EXT_shadow_funcs]", Boolean.valueOf(contextcapabilities.GL_EXT_shadow_funcs));
    playerSnooper.b("gl_caps[EXT_shared_texture_palette]", Boolean.valueOf(contextcapabilities.GL_EXT_shared_texture_palette));
    playerSnooper.b("gl_caps[EXT_stencil_clear_tag]", Boolean.valueOf(contextcapabilities.GL_EXT_stencil_clear_tag));
    playerSnooper.b("gl_caps[EXT_stencil_two_side]", Boolean.valueOf(contextcapabilities.GL_EXT_stencil_two_side));
    playerSnooper.b("gl_caps[EXT_stencil_wrap]", Boolean.valueOf(contextcapabilities.GL_EXT_stencil_wrap));
    playerSnooper.b("gl_caps[EXT_texture_3d]", Boolean.valueOf(contextcapabilities.GL_EXT_texture_3d));
    playerSnooper.b("gl_caps[EXT_texture_array]", Boolean.valueOf(contextcapabilities.GL_EXT_texture_array));
    playerSnooper.b("gl_caps[EXT_texture_buffer_object]", Boolean.valueOf(contextcapabilities.GL_EXT_texture_buffer_object));
    playerSnooper.b("gl_caps[EXT_texture_integer]", Boolean.valueOf(contextcapabilities.GL_EXT_texture_integer));
    playerSnooper.b("gl_caps[EXT_texture_lod_bias]", Boolean.valueOf(contextcapabilities.GL_EXT_texture_lod_bias));
    playerSnooper.b("gl_caps[EXT_texture_sRGB]", Boolean.valueOf(contextcapabilities.GL_EXT_texture_sRGB));
    playerSnooper.b("gl_caps[EXT_vertex_shader]", Boolean.valueOf(contextcapabilities.GL_EXT_vertex_shader));
    playerSnooper.b("gl_caps[EXT_vertex_weighting]", Boolean.valueOf(contextcapabilities.GL_EXT_vertex_weighting));
    playerSnooper.b("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger(35658)));
    GL11.glGetError();
    playerSnooper.b("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger(35657)));
    GL11.glGetError();
    playerSnooper.b("gl_caps[gl_max_vertex_attribs]", Integer.valueOf(GL11.glGetInteger(34921)));
    GL11.glGetError();
    playerSnooper.b("gl_caps[gl_max_vertex_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35660)));
    GL11.glGetError();
    playerSnooper.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(34930)));
    GL11.glGetError();
    playerSnooper.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35071)));
    GL11.glGetError();
    playerSnooper.b("gl_max_texture_size", Integer.valueOf(C()));
  }
  
  public static int C()
  {
    for (int i = 16384; i > 0; i >>= 1)
    {
      GL11.glTexImage2D(32868, 0, 6408, i, i, 0, 6408, 5121, (ByteBuffer)null);
      int j = GL11.glGetTexLevelParameteri(32868, 0, 4096);
      if (j != 0) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean ad()
  {
    return this.t.r;
  }
  
  public void a(bde serverDataIn)
  {
    this.Q = serverDataIn;
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
    if (S != null)
    {
      bpo integratedserver = S.G();
      if (integratedserver != null) {
        integratedserver.t();
      }
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
      GameProfile gameprofile = aa().fillProfileProperties(this.ae.e(), false);
      this.P.putAll(gameprofile.getProperties());
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
    return this.h != null ? bpv.a.b : (this.h.bA.d) && (this.h.bA.c) ? bpv.a.c : (this.h.o.t instanceof anp) ? bpv.a.g : (bfc.c != null) && (bfc.b > 0) ? bpv.a.f : (this.h.o.t instanceof ann) ? bpv.a.e : bpv.a.a;
  }
  
  public bqm Y()
  {
    return this.aE;
  }
  
  public void Z()
  {
    int i = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() : Keyboard.getEventKey();
    if ((i == 60) && (Keyboard.getEventKey() == 0)) {
      i = 0;
    }
    if ((i != 0) && (!Keyboard.isRepeatEvent())) {
      if ((!(this.m instanceof ayj)) || (((ayj)this.m).g <= J() - 20L)) {
        if (Keyboard.getEventKeyState())
        {
          if (i == this.t.ar.i())
          {
            if (Y().k()) {
              Y().r();
            } else if (Y().j()) {
              a(new awy(new awx()
              {
                public void a(boolean result, int id)
                {
                  if (result) {
                    ave.this.Y().q();
                  }
                  ave.this.a((axu)null);
                }
              }, bnq.a("stream.confirm_start", new Object[0]), "", 0));
            } else if ((Y().A()) && (Y().i()))
            {
              if (this.f != null) {
                this.q.d().a(new fa("Not ready to start streaming yet!"));
              }
            }
            else {
              baa.a(this.m);
            }
          }
          else if (i == this.t.as.i())
          {
            if (Y().k()) {
              if (Y().l()) {
                Y().o();
              } else {
                Y().n();
              }
            }
          }
          else if (i == this.t.at.i())
          {
            if (Y().k()) {
              Y().m();
            }
          }
          else if (i == this.t.au.i()) {
            this.aE.a(true);
          } else if (i == this.t.ap.i()) {
            q();
          } else if (i == this.t.am.i()) {
            this.q.d().a(avj.a(this.v, this.d, this.e, this.aF));
          }
        }
        else if (i == this.t.au.i()) {
          this.aE.a(false);
        }
      }
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
  
  public void a(pk viewingEntity)
  {
    this.ad = viewingEntity;
    this.o.a(viewingEntity);
  }
  
  public <V> ListenableFuture<V> a(Callable<V> callableToSchedule)
  {
    Validate.notNull(callableToSchedule);
    if (!aJ())
    {
      ListenableFutureTask<V> listenablefuturetask = ListenableFutureTask.create(callableToSchedule);
      synchronized (this.aM)
      {
        this.aM.add(listenablefuturetask);
        return listenablefuturetask;
      }
    }
    try
    {
      return Futures.immediateFuture(callableToSchedule.call());
    }
    catch (Exception exception)
    {
      return Futures.immediateFailedCheckedFuture(exception);
    }
  }
  
  public ListenableFuture<Object> a(Runnable runnableToSchedule)
  {
    Validate.notNull(runnableToSchedule);
    return a(Executors.callable(runnableToSchedule));
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
    Map<String, String> map = Maps.newHashMap();
    map.put("X-Minecraft-Username", A().L().c());
    map.put("X-Minecraft-UUID", A().L().b());
    map.put("X-Minecraft-Version", "1.8.8");
    return map;
  }
  
  public boolean al()
  {
    return this.X;
  }
  
  public void a(boolean p_181537_1_)
  {
    this.X = p_181537_1_;
  }
}
