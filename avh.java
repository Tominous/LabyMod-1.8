import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class avh
{
  private static final Logger aO = ;
  private static final Gson aP = new Gson();
  private static final ParameterizedType aQ = new ParameterizedType()
  {
    public Type[] getActualTypeArguments()
    {
      return new Type[] { String.class };
    }
    
    public Type getRawType()
    {
      return List.class;
    }
    
    public Type getOwnerType()
    {
      return null;
    }
  };
  
  public static enum a
  {
    private final boolean S;
    private final boolean T;
    private final String U;
    private final float V;
    private float W;
    private float X;
    
    public static a a(int ☃)
    {
      for (a ☃ : ) {
        if (☃.c() == ☃) {
          return ☃;
        }
      }
      return null;
    }
    
    private a(String ☃, boolean ☃, boolean ☃)
    {
      this(☃, ☃, ☃, 0.0F, 1.0F, 0.0F);
    }
    
    private a(String ☃, boolean ☃, boolean ☃, float ☃, float ☃, float ☃)
    {
      this.U = ☃;
      this.S = ☃;
      this.T = ☃;
      this.W = ☃;
      this.X = ☃;
      this.V = ☃;
    }
    
    public boolean a()
    {
      return this.S;
    }
    
    public boolean b()
    {
      return this.T;
    }
    
    public int c()
    {
      return ordinal();
    }
    
    public String d()
    {
      return this.U;
    }
    
    public float f()
    {
      return this.X;
    }
    
    public void a(float ☃)
    {
      this.X = ☃;
    }
    
    public float c(float ☃)
    {
      return ns.a((e(☃) - this.W) / (this.X - this.W), 0.0F, 1.0F);
    }
    
    public float d(float ☃)
    {
      return e(this.W + (this.X - this.W) * ns.a(☃, 0.0F, 1.0F));
    }
    
    public float e(float ☃)
    {
      ☃ = f(☃);
      return ns.a(☃, this.W, this.X);
    }
    
    protected float f(float ☃)
    {
      if (this.V > 0.0F) {
        ☃ = this.V * Math.round(☃ / this.V);
      }
      return ☃;
    }
  }
  
  private static final String[] aR = { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
  private static final String[] aS = { "options.particles.all", "options.particles.decreased", "options.particles.minimal" };
  private static final String[] aT = { "options.ao.off", "options.ao.min", "options.ao.max" };
  private static final String[] aU = { "options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high" };
  private static final String[] aV = { "options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never" };
  private static final String[] aW = { "options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods" };
  private static final String[] aX = { "options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk" };
  private static final String[] aY = { "options.off", "options.graphics.fast", "options.graphics.fancy" };
  public float a = 0.5F;
  public boolean b;
  public int c = -1;
  public boolean d = true;
  public boolean e;
  public boolean f = true;
  public int g = 120;
  public int h = 2;
  public boolean i = true;
  public int j = 2;
  public List<String> k = Lists.newArrayList();
  public List<String> l = Lists.newArrayList();
  public wn.b m = wn.b.a;
  public boolean n = true;
  public boolean o = true;
  public boolean p = true;
  public float q = 1.0F;
  public boolean r = true;
  public boolean s;
  public boolean t = true;
  public boolean u = false;
  public boolean v = true;
  public boolean w = false;
  public boolean x;
  public boolean y;
  public boolean z = true;
  private final Set<wo> aZ = Sets.newHashSet(wo.values());
  public boolean A;
  public int B;
  public int C;
  public boolean D = true;
  public float E = 1.0F;
  public float F = 1.0F;
  public float G = 0.44366196F;
  public float H = 1.0F;
  public boolean I = true;
  public int J = 4;
  private Map<bpg, Float> ba = Maps.newEnumMap(bpg.class);
  public float K = 0.5F;
  public float L = 1.0F;
  public float M = 1.0F;
  public float N = 0.5412844F;
  public float O = 0.31690142F;
  public int P = 1;
  public boolean Q = true;
  public String R = "";
  public int S = 0;
  public int T = 0;
  public int U = 0;
  public boolean V = true;
  public boolean W = true;
  public avb X = new avb("key.forward", 17, "key.categories.movement");
  public avb Y = new avb("key.left", 30, "key.categories.movement");
  public avb Z = new avb("key.back", 31, "key.categories.movement");
  public avb aa = new avb("key.right", 32, "key.categories.movement");
  public avb ab = new avb("key.jump", 57, "key.categories.movement");
  public avb ac = new avb("key.sneak", 42, "key.categories.movement");
  public avb ad = new avb("key.sprint", 29, "key.categories.movement");
  public avb ae = new avb("key.inventory", 18, "key.categories.inventory");
  public avb af = new avb("key.use", -99, "key.categories.gameplay");
  public avb ag = new avb("key.drop", 16, "key.categories.gameplay");
  public avb ah = new avb("key.attack", -100, "key.categories.gameplay");
  public avb ai = new avb("key.pickItem", -98, "key.categories.gameplay");
  public avb aj = new avb("key.chat", 20, "key.categories.multiplayer");
  public avb ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
  public avb al = new avb("key.command", 53, "key.categories.multiplayer");
  public avb am = new avb("key.screenshot", 60, "key.categories.misc");
  public avb an = new avb("key.togglePerspective", 63, "key.categories.misc");
  public avb ao = new avb("key.smoothCamera", 0, "key.categories.misc");
  public avb ap = new avb("key.fullscreen", 87, "key.categories.misc");
  public avb aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
  public avb ar = new avb("key.streamStartStop", 64, "key.categories.stream");
  public avb as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
  public avb at = new avb("key.streamCommercial", 0, "key.categories.stream");
  public avb au = new avb("key.streamToggleMic", 0, "key.categories.stream");
  public avb[] av = { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
  public avb[] aw = (avb[])ArrayUtils.addAll(new avb[] { this.ah, this.af, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ag, this.ae, this.aj, this.ak, this.ai, this.al, this.am, this.an, this.ao, this.ar, this.as, this.at, this.au, this.ap, this.aq }, this.av);
  protected ave ax;
  private File bb;
  public oj ay = oj.c;
  public boolean az;
  public int aA;
  public boolean aB;
  public boolean aC;
  public boolean aD;
  public String aE = "";
  public boolean aF;
  public boolean aG;
  public float aH = 70.0F;
  public float aI;
  public float aJ;
  public int aK;
  public int aL;
  public String aM = "en_US";
  public boolean aN = false;
  
  public avh(ave ☃, File ☃)
  {
    this.ax = ☃;
    this.bb = new File(☃, "options.txt");
    if ((☃.U()) && (Runtime.getRuntime().maxMemory() >= 1000000000L)) {
      avh.a.f.a(32.0F);
    } else {
      avh.a.f.a(16.0F);
    }
    this.c = (☃.U() ? 12 : 8);
    
    a();
  }
  
  public avh() {}
  
  public static String c(int ☃)
  {
    if (☃ < 0) {
      return bnq.a("key.mouseButton", new Object[] { Integer.valueOf(☃ + 101) });
    }
    if (☃ < 256) {
      return Keyboard.getKeyName(☃);
    }
    return String.format("%c", new Object[] { Character.valueOf((char)(☃ - 256)) }).toUpperCase();
  }
  
  public static boolean a(avb ☃)
  {
    if (☃.i() == 0) {
      return false;
    }
    if (☃.i() < 0) {
      return Mouse.isButtonDown(☃.i() + 100);
    }
    return Keyboard.isKeyDown(☃.i());
  }
  
  public void a(avb ☃, int ☃)
  {
    ☃.b(☃);
    b();
  }
  
  public void a(avh.a ☃, float ☃)
  {
    if (☃ == avh.a.b) {
      this.a = ☃;
    }
    if (☃ == avh.a.c) {
      this.aH = ☃;
    }
    if (☃ == avh.a.d) {
      this.aI = ☃;
    }
    if (☃ == avh.a.i) {
      this.g = ((int)☃);
    }
    if (☃ == avh.a.s)
    {
      this.q = ☃;
      this.ax.q.d().b();
    }
    if (☃ == avh.a.B)
    {
      this.H = ☃;
      this.ax.q.d().b();
    }
    if (☃ == avh.a.C)
    {
      this.G = ☃;
      this.ax.q.d().b();
    }
    if (☃ == avh.a.A)
    {
      this.F = ☃;
      this.ax.q.d().b();
    }
    if (☃ == avh.a.z)
    {
      this.E = ☃;
      this.ax.q.d().b();
    }
    if (☃ == avh.a.D)
    {
      int ☃ = this.J;
      this.J = ((int)☃);
      if (☃ != ☃)
      {
        this.ax.T().a(this.J);
        this.ax.P().a(bmh.g);
        this.ax.T().a(false, this.J > 0);
        this.ax.B();
      }
    }
    if (☃ == avh.a.P)
    {
      this.v = (!this.v);
      this.ax.g.a();
    }
    if (☃ == avh.a.f)
    {
      this.c = ((int)☃);
      this.ax.g.m();
    }
    if (☃ == avh.a.F) {
      this.K = ☃;
    }
    if (☃ == avh.a.G)
    {
      this.L = ☃;
      this.ax.Y().p();
    }
    if (☃ == avh.a.H)
    {
      this.M = ☃;
      this.ax.Y().p();
    }
    if (☃ == avh.a.I) {
      this.N = ☃;
    }
    if (☃ == avh.a.J) {
      this.O = ☃;
    }
  }
  
  public void a(avh.a ☃, int ☃)
  {
    if (☃ == avh.a.a) {
      this.b = (!this.b);
    }
    if (☃ == avh.a.n) {
      this.aK = (this.aK + ☃ & 0x3);
    }
    if (☃ == avh.a.o) {
      this.aL = ((this.aL + ☃) % 3);
    }
    if (☃ == avh.a.g) {
      this.d = (!this.d);
    }
    if (☃ == avh.a.k) {
      this.h = ((this.h + ☃) % 3);
    }
    if (☃ == avh.a.E)
    {
      this.aN = (!this.aN);
      this.ax.k.a((this.ax.S().a()) || (this.aN));
    }
    if (☃ == avh.a.j) {
      this.f = (!this.f);
    }
    if (☃ == avh.a.h)
    {
      this.e = (!this.e);
      this.ax.e();
    }
    if (☃ == avh.a.l)
    {
      this.i = (!this.i);
      this.ax.g.a();
    }
    if (☃ == avh.a.m)
    {
      this.j = ((this.j + ☃) % 3);
      this.ax.g.a();
    }
    if (☃ == avh.a.p) {
      this.m = wn.b.a((this.m.a() + ☃) % 3);
    }
    if (☃ == avh.a.K) {
      this.P = ((this.P + ☃) % 3);
    }
    if (☃ == avh.a.L) {
      this.Q = (!this.Q);
    }
    if (☃ == avh.a.M) {
      this.S = ((this.S + ☃) % 3);
    }
    if (☃ == avh.a.N) {
      this.T = ((this.T + ☃) % 3);
    }
    if (☃ == avh.a.O) {
      this.U = ((this.U + ☃) % 2);
    }
    if (☃ == avh.a.q) {
      this.n = (!this.n);
    }
    if (☃ == avh.a.r) {
      this.o = (!this.o);
    }
    if (☃ == avh.a.t) {
      this.p = (!this.p);
    }
    if (☃ == avh.a.u) {
      this.r = (!this.r);
    }
    if (☃ == avh.a.y) {
      this.A = (!this.A);
    }
    if (☃ == avh.a.v)
    {
      this.s = (!this.s);
      if (this.ax.K() != this.s) {
        this.ax.q();
      }
    }
    if (☃ == avh.a.w)
    {
      this.t = (!this.t);
      Display.setVSyncEnabled(this.t);
    }
    if (☃ == avh.a.x)
    {
      this.u = (!this.u);
      this.ax.g.a();
    }
    if (☃ == avh.a.P)
    {
      this.v = (!this.v);
      this.ax.g.a();
    }
    if (☃ == avh.a.Q) {
      this.w = (!this.w);
    }
    if (☃ == avh.a.R) {
      this.W = (!this.W);
    }
    b();
  }
  
  public float a(avh.a ☃)
  {
    if (☃ == avh.a.c) {
      return this.aH;
    }
    if (☃ == avh.a.d) {
      return this.aI;
    }
    if (☃ == avh.a.e) {
      return this.aJ;
    }
    if (☃ == avh.a.b) {
      return this.a;
    }
    if (☃ == avh.a.s) {
      return this.q;
    }
    if (☃ == avh.a.B) {
      return this.H;
    }
    if (☃ == avh.a.C) {
      return this.G;
    }
    if (☃ == avh.a.z) {
      return this.E;
    }
    if (☃ == avh.a.A) {
      return this.F;
    }
    if (☃ == avh.a.i) {
      return this.g;
    }
    if (☃ == avh.a.D) {
      return this.J;
    }
    if (☃ == avh.a.f) {
      return this.c;
    }
    if (☃ == avh.a.F) {
      return this.K;
    }
    if (☃ == avh.a.G) {
      return this.L;
    }
    if (☃ == avh.a.H) {
      return this.M;
    }
    if (☃ == avh.a.I) {
      return this.N;
    }
    if (☃ == avh.a.J) {
      return this.O;
    }
    return 0.0F;
  }
  
  public boolean b(avh.a ☃)
  {
    switch (avh.2.a[☃.ordinal()])
    {
    case 1: 
      return this.b;
    case 2: 
      return this.d;
    case 3: 
      return this.e;
    case 4: 
      return this.f;
    case 5: 
      return this.n;
    case 6: 
      return this.o;
    case 7: 
      return this.p;
    case 8: 
      return this.r;
    case 9: 
      return this.s;
    case 10: 
      return this.t;
    case 11: 
      return this.u;
    case 12: 
      return this.A;
    case 13: 
      return this.Q;
    case 14: 
      return this.aN;
    case 15: 
      return this.v;
    case 16: 
      return this.w;
    case 17: 
      return this.W;
    }
    return false;
  }
  
  private static String a(String[] ☃, int ☃)
  {
    if ((☃ < 0) || (☃ >= ☃.length)) {
      ☃ = 0;
    }
    return bnq.a(☃[☃], new Object[0]);
  }
  
  public String c(avh.a ☃)
  {
    String ☃ = bnq.a(☃.d(), new Object[0]) + ": ";
    if (☃.a())
    {
      float ☃ = a(☃);
      float ☃ = ☃.c(☃);
      if (☃ == avh.a.b)
      {
        if (☃ == 0.0F) {
          return ☃ + bnq.a("options.sensitivity.min", new Object[0]);
        }
        if (☃ == 1.0F) {
          return ☃ + bnq.a("options.sensitivity.max", new Object[0]);
        }
        return ☃ + (int)(☃ * 200.0F) + "%";
      }
      if (☃ == avh.a.c)
      {
        if (☃ == 70.0F) {
          return ☃ + bnq.a("options.fov.min", new Object[0]);
        }
        if (☃ == 110.0F) {
          return ☃ + bnq.a("options.fov.max", new Object[0]);
        }
        return ☃ + (int)☃;
      }
      if (☃ == avh.a.i)
      {
        if (☃ == avh.a.a(☃)) {
          return ☃ + bnq.a("options.framerateLimit.max", new Object[0]);
        }
        return ☃ + (int)☃ + " fps";
      }
      if (☃ == avh.a.k)
      {
        if (☃ == avh.a.b(☃)) {
          return ☃ + bnq.a("options.cloudHeight.min", new Object[0]);
        }
        return ☃ + ((int)☃ + 128);
      }
      if (☃ == avh.a.d)
      {
        if (☃ == 0.0F) {
          return ☃ + bnq.a("options.gamma.min", new Object[0]);
        }
        if (☃ == 1.0F) {
          return ☃ + bnq.a("options.gamma.max", new Object[0]);
        }
        return ☃ + "+" + (int)(☃ * 100.0F) + "%";
      }
      if (☃ == avh.a.e) {
        return ☃ + (int)(☃ * 400.0F) + "%";
      }
      if (☃ == avh.a.s) {
        return ☃ + (int)(☃ * 90.0F + 10.0F) + "%";
      }
      if (☃ == avh.a.C) {
        return ☃ + avt.b(☃) + "px";
      }
      if (☃ == avh.a.B) {
        return ☃ + avt.b(☃) + "px";
      }
      if (☃ == avh.a.A) {
        return ☃ + avt.a(☃) + "px";
      }
      if (☃ == avh.a.f) {
        return ☃ + (int)☃ + " chunks";
      }
      if (☃ == avh.a.D)
      {
        if (☃ == 0.0F) {
          return ☃ + bnq.a("options.off", new Object[0]);
        }
        return ☃ + (int)☃;
      }
      if (☃ == avh.a.J) {
        return ☃ + bqn.a(☃) + " fps";
      }
      if (☃ == avh.a.I) {
        return ☃ + bqn.b(☃) + " Kbps";
      }
      if (☃ == avh.a.F) {
        return ☃ + String.format("%.3f bpp", new Object[] { Float.valueOf(bqn.c(☃)) });
      }
      if (☃ == 0.0F) {
        return ☃ + bnq.a("options.off", new Object[0]);
      }
      return ☃ + (int)(☃ * 100.0F) + "%";
    }
    if (☃.b())
    {
      boolean ☃ = b(☃);
      if (☃) {
        return ☃ + bnq.a("options.on", new Object[0]);
      }
      return ☃ + bnq.a("options.off", new Object[0]);
    }
    if (☃ == avh.a.n) {
      return ☃ + a(aR, this.aK);
    }
    if (☃ == avh.a.p) {
      return ☃ + bnq.a(this.m.b(), new Object[0]);
    }
    if (☃ == avh.a.o) {
      return ☃ + a(aS, this.aL);
    }
    if (☃ == avh.a.m) {
      return ☃ + a(aT, this.j);
    }
    if (☃ == avh.a.K) {
      return ☃ + a(aU, this.P);
    }
    if (☃ == avh.a.M) {
      return ☃ + a(aV, this.S);
    }
    if (☃ == avh.a.N) {
      return ☃ + a(aW, this.T);
    }
    if (☃ == avh.a.O) {
      return ☃ + a(aX, this.U);
    }
    if (☃ == avh.a.k) {
      return ☃ + a(aY, this.h);
    }
    if (☃ == avh.a.l)
    {
      if (this.i) {
        return ☃ + bnq.a("options.graphics.fancy", new Object[0]);
      }
      String ☃ = "options.graphics.fast";
      return ☃ + bnq.a("options.graphics.fast", new Object[0]);
    }
    return ☃;
  }
  
  public void a()
  {
    try
    {
      if (!this.bb.exists()) {
        return;
      }
      BufferedReader ☃ = new BufferedReader(new FileReader(this.bb));
      String ☃ = "";
      this.ba.clear();
      while ((☃ = ☃.readLine()) != null) {
        try
        {
          String[] ☃ = ☃.split(":");
          if (☃[0].equals("mouseSensitivity")) {
            this.a = a(☃[1]);
          }
          if (☃[0].equals("fov")) {
            this.aH = (a(☃[1]) * 40.0F + 70.0F);
          }
          if (☃[0].equals("gamma")) {
            this.aI = a(☃[1]);
          }
          if (☃[0].equals("saturation")) {
            this.aJ = a(☃[1]);
          }
          if (☃[0].equals("invertYMouse")) {
            this.b = ☃[1].equals("true");
          }
          if (☃[0].equals("renderDistance")) {
            this.c = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("guiScale")) {
            this.aK = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("particles")) {
            this.aL = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("bobView")) {
            this.d = ☃[1].equals("true");
          }
          if (☃[0].equals("anaglyph3d")) {
            this.e = ☃[1].equals("true");
          }
          if (☃[0].equals("maxFps")) {
            this.g = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("fboEnable")) {
            this.f = ☃[1].equals("true");
          }
          if (☃[0].equals("difficulty")) {
            this.ay = oj.a(Integer.parseInt(☃[1]));
          }
          if (☃[0].equals("fancyGraphics")) {
            this.i = ☃[1].equals("true");
          }
          if (☃[0].equals("ao")) {
            if (☃[1].equals("true")) {
              this.j = 2;
            } else if (☃[1].equals("false")) {
              this.j = 0;
            } else {
              this.j = Integer.parseInt(☃[1]);
            }
          }
          if (☃[0].equals("renderClouds")) {
            if (☃[1].equals("true")) {
              this.h = 2;
            } else if (☃[1].equals("false")) {
              this.h = 0;
            } else if (☃[1].equals("fast")) {
              this.h = 1;
            }
          }
          if (☃[0].equals("resourcePacks"))
          {
            this.k = ((List)aP.fromJson(☃.substring(☃.indexOf(':') + 1), aQ));
            if (this.k == null) {
              this.k = Lists.newArrayList();
            }
          }
          if (☃[0].equals("incompatibleResourcePacks"))
          {
            this.l = ((List)aP.fromJson(☃.substring(☃.indexOf(':') + 1), aQ));
            if (this.l == null) {
              this.l = Lists.newArrayList();
            }
          }
          if ((☃[0].equals("lastServer")) && (☃.length >= 2)) {
            this.aE = ☃.substring(☃.indexOf(':') + 1);
          }
          if ((☃[0].equals("lang")) && (☃.length >= 2)) {
            this.aM = ☃[1];
          }
          if (☃[0].equals("chatVisibility")) {
            this.m = wn.b.a(Integer.parseInt(☃[1]));
          }
          if (☃[0].equals("chatColors")) {
            this.n = ☃[1].equals("true");
          }
          if (☃[0].equals("chatLinks")) {
            this.o = ☃[1].equals("true");
          }
          if (☃[0].equals("chatLinksPrompt")) {
            this.p = ☃[1].equals("true");
          }
          if (☃[0].equals("chatOpacity")) {
            this.q = a(☃[1]);
          }
          if (☃[0].equals("snooperEnabled")) {
            this.r = ☃[1].equals("true");
          }
          if (☃[0].equals("fullscreen")) {
            this.s = ☃[1].equals("true");
          }
          if (☃[0].equals("enableVsync")) {
            this.t = ☃[1].equals("true");
          }
          if (☃[0].equals("useVbo")) {
            this.u = ☃[1].equals("true");
          }
          if (☃[0].equals("hideServerAddress")) {
            this.x = ☃[1].equals("true");
          }
          if (☃[0].equals("advancedItemTooltips")) {
            this.y = ☃[1].equals("true");
          }
          if (☃[0].equals("pauseOnLostFocus")) {
            this.z = ☃[1].equals("true");
          }
          if (☃[0].equals("touchscreen")) {
            this.A = ☃[1].equals("true");
          }
          if (☃[0].equals("overrideHeight")) {
            this.C = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("overrideWidth")) {
            this.B = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("heldItemTooltips")) {
            this.D = ☃[1].equals("true");
          }
          if (☃[0].equals("chatHeightFocused")) {
            this.H = a(☃[1]);
          }
          if (☃[0].equals("chatHeightUnfocused")) {
            this.G = a(☃[1]);
          }
          if (☃[0].equals("chatScale")) {
            this.E = a(☃[1]);
          }
          if (☃[0].equals("chatWidth")) {
            this.F = a(☃[1]);
          }
          if (☃[0].equals("showInventoryAchievementHint")) {
            this.I = ☃[1].equals("true");
          }
          if (☃[0].equals("mipmapLevels")) {
            this.J = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("streamBytesPerPixel")) {
            this.K = a(☃[1]);
          }
          if (☃[0].equals("streamMicVolume")) {
            this.L = a(☃[1]);
          }
          if (☃[0].equals("streamSystemVolume")) {
            this.M = a(☃[1]);
          }
          if (☃[0].equals("streamKbps")) {
            this.N = a(☃[1]);
          }
          if (☃[0].equals("streamFps")) {
            this.O = a(☃[1]);
          }
          if (☃[0].equals("streamCompression")) {
            this.P = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("streamSendMetadata")) {
            this.Q = ☃[1].equals("true");
          }
          if ((☃[0].equals("streamPreferredServer")) && (☃.length >= 2)) {
            this.R = ☃.substring(☃.indexOf(':') + 1);
          }
          if (☃[0].equals("streamChatEnabled")) {
            this.S = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("streamChatUserFilter")) {
            this.T = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("streamMicToggleBehavior")) {
            this.U = Integer.parseInt(☃[1]);
          }
          if (☃[0].equals("forceUnicodeFont")) {
            this.aN = ☃[1].equals("true");
          }
          if (☃[0].equals("allowBlockAlternatives")) {
            this.v = ☃[1].equals("true");
          }
          if (☃[0].equals("reducedDebugInfo")) {
            this.w = ☃[1].equals("true");
          }
          if (☃[0].equals("useNativeTransport")) {
            this.V = ☃[1].equals("true");
          }
          if (☃[0].equals("entityShadows")) {
            this.W = ☃[1].equals("true");
          }
          for (avb ☃ : this.aw) {
            if (☃[0].equals("key_" + ☃.g())) {
              ☃.b(Integer.parseInt(☃[1]));
            }
          }
          for (bpg ☃ : bpg.values()) {
            if (☃[0].equals("soundCategory_" + ☃.a())) {
              this.ba.put(☃, Float.valueOf(a(☃[1])));
            }
          }
          for (wo ☃ : wo.values()) {
            if (☃[0].equals("modelPart_" + ☃.c())) {
              a(☃, ☃[1].equals("true"));
            }
          }
        }
        catch (Exception ☃)
        {
          aO.warn("Skipping bad option: " + ☃);
        }
      }
      avb.b();
      ☃.close();
    }
    catch (Exception ☃)
    {
      aO.error("Failed to load options", ☃);
    }
  }
  
  private float a(String ☃)
  {
    if (☃.equals("true")) {
      return 1.0F;
    }
    if (☃.equals("false")) {
      return 0.0F;
    }
    return Float.parseFloat(☃);
  }
  
  public void b()
  {
    try
    {
      PrintWriter ☃ = new PrintWriter(new FileWriter(this.bb));
      
      ☃.println("invertYMouse:" + this.b);
      ☃.println("mouseSensitivity:" + this.a);
      ☃.println("fov:" + (this.aH - 70.0F) / 40.0F);
      ☃.println("gamma:" + this.aI);
      ☃.println("saturation:" + this.aJ);
      ☃.println("renderDistance:" + this.c);
      ☃.println("guiScale:" + this.aK);
      ☃.println("particles:" + this.aL);
      ☃.println("bobView:" + this.d);
      ☃.println("anaglyph3d:" + this.e);
      ☃.println("maxFps:" + this.g);
      ☃.println("fboEnable:" + this.f);
      ☃.println("difficulty:" + this.ay.a());
      ☃.println("fancyGraphics:" + this.i);
      ☃.println("ao:" + this.j);
      switch (this.h)
      {
      case 2: 
        ☃.println("renderClouds:true");
        break;
      case 1: 
        ☃.println("renderClouds:fast");
        break;
      case 0: 
        ☃.println("renderClouds:false");
      }
      ☃.println("resourcePacks:" + aP.toJson(this.k));
      ☃.println("incompatibleResourcePacks:" + aP.toJson(this.l));
      ☃.println("lastServer:" + this.aE);
      ☃.println("lang:" + this.aM);
      ☃.println("chatVisibility:" + this.m.a());
      ☃.println("chatColors:" + this.n);
      ☃.println("chatLinks:" + this.o);
      ☃.println("chatLinksPrompt:" + this.p);
      ☃.println("chatOpacity:" + this.q);
      ☃.println("snooperEnabled:" + this.r);
      ☃.println("fullscreen:" + this.s);
      ☃.println("enableVsync:" + this.t);
      ☃.println("useVbo:" + this.u);
      ☃.println("hideServerAddress:" + this.x);
      ☃.println("advancedItemTooltips:" + this.y);
      ☃.println("pauseOnLostFocus:" + this.z);
      ☃.println("touchscreen:" + this.A);
      ☃.println("overrideWidth:" + this.B);
      ☃.println("overrideHeight:" + this.C);
      ☃.println("heldItemTooltips:" + this.D);
      ☃.println("chatHeightFocused:" + this.H);
      ☃.println("chatHeightUnfocused:" + this.G);
      ☃.println("chatScale:" + this.E);
      ☃.println("chatWidth:" + this.F);
      ☃.println("showInventoryAchievementHint:" + this.I);
      ☃.println("mipmapLevels:" + this.J);
      ☃.println("streamBytesPerPixel:" + this.K);
      ☃.println("streamMicVolume:" + this.L);
      ☃.println("streamSystemVolume:" + this.M);
      ☃.println("streamKbps:" + this.N);
      ☃.println("streamFps:" + this.O);
      ☃.println("streamCompression:" + this.P);
      ☃.println("streamSendMetadata:" + this.Q);
      ☃.println("streamPreferredServer:" + this.R);
      ☃.println("streamChatEnabled:" + this.S);
      ☃.println("streamChatUserFilter:" + this.T);
      ☃.println("streamMicToggleBehavior:" + this.U);
      ☃.println("forceUnicodeFont:" + this.aN);
      ☃.println("allowBlockAlternatives:" + this.v);
      ☃.println("reducedDebugInfo:" + this.w);
      ☃.println("useNativeTransport:" + this.V);
      ☃.println("entityShadows:" + this.W);
      for (avb ☃ : this.aw) {
        ☃.println("key_" + ☃.g() + ":" + ☃.i());
      }
      for (bpg ☃ : bpg.values()) {
        ☃.println("soundCategory_" + ☃.a() + ":" + a(☃));
      }
      for (wo ☃ : wo.values()) {
        ☃.println("modelPart_" + ☃.c() + ":" + this.aZ.contains(☃));
      }
      ☃.close();
    }
    catch (Exception ☃)
    {
      aO.error("Failed to save options", ☃);
    }
    c();
  }
  
  public float a(bpg ☃)
  {
    if (this.ba.containsKey(☃)) {
      return ((Float)this.ba.get(☃)).floatValue();
    }
    return 1.0F;
  }
  
  public void a(bpg ☃, float ☃)
  {
    this.ax.W().a(☃, ☃);
    this.ba.put(☃, Float.valueOf(☃));
  }
  
  public void c()
  {
    if (this.ax.h != null)
    {
      int ☃ = 0;
      for (wo ☃ : this.aZ) {
        ☃ |= ☃.a();
      }
      this.ax.h.a.a(new ih(this.aM, this.c, this.m, this.n, ☃));
    }
  }
  
  public Set<wo> d()
  {
    return ImmutableSet.copyOf(this.aZ);
  }
  
  public void a(wo ☃, boolean ☃)
  {
    if (☃) {
      this.aZ.add(☃);
    } else {
      this.aZ.remove(☃);
    }
    c();
  }
  
  public void a(wo ☃)
  {
    if (!d().contains(☃)) {
      this.aZ.add(☃);
    } else {
      this.aZ.remove(☃);
    }
    c();
  }
  
  public int e()
  {
    if (this.c >= 4) {
      return this.h;
    }
    return 0;
  }
  
  public boolean f()
  {
    return this.V;
  }
}
