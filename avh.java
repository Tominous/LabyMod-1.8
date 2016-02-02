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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import shadersmod.client.Shaders;

public class avh
{
  private static final Logger aO = ;
  private static final Gson aP = new Gson();
  private static final ParameterizedType aQ = new ParameterizedType()
  {
    private static final String __OBFID = "CL_00000651";
    
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
  public List k = Lists.newArrayList();
  public List l = Lists.newArrayList();
  public wn.b m;
  public boolean n;
  public boolean o;
  public boolean p;
  public float q;
  public boolean r;
  public boolean s;
  public boolean t;
  public boolean u;
  public boolean v;
  public boolean w;
  public boolean x;
  public boolean y;
  public boolean z;
  private final Set aZ;
  public boolean A;
  public int B;
  public int C;
  public boolean D;
  public float E;
  public float F;
  public float G;
  public float H;
  public boolean I;
  public int J;
  private Map ba;
  public float K;
  public float L;
  public float M;
  public float N;
  public float O;
  public int P;
  public boolean Q;
  public String R;
  public int S;
  public int T;
  public int U;
  public boolean V;
  public boolean W;
  public avb X;
  public avb Y;
  public avb Z;
  public avb aa;
  public avb ab;
  public avb ac;
  public avb ad;
  public avb ae;
  public avb af;
  public avb ag;
  public avb ah;
  public avb ai;
  public avb aj;
  public avb ak;
  public avb al;
  public avb am;
  public avb an;
  public avb ao;
  public avb ap;
  public avb aq;
  public avb ar;
  public avb as;
  public avb at;
  public avb au;
  public avb[] av;
  public avb[] aw;
  protected ave ax;
  private File bb;
  public oj ay;
  public boolean az;
  public int aA;
  public boolean aB;
  public boolean aC;
  public boolean aD;
  public String aE;
  public boolean aF;
  public boolean aG;
  public float aH;
  public float aI;
  public float aJ;
  public int aK;
  public int aL;
  public String aM;
  public boolean aN;
  private static final String __OBFID = "CL_00000650";
  public int ofFogType = 1;
  public float ofFogStart = 0.8F;
  public int ofMipmapType = 0;
  public boolean ofOcclusionFancy = false;
  public boolean ofSmoothFps = false;
  public boolean ofSmoothWorld = Config.isSingleProcessor();
  public boolean ofLazyChunkLoading = Config.isSingleProcessor();
  public float ofAoLevel = 1.0F;
  public int ofAaLevel = 0;
  public int ofAfLevel = 1;
  public int ofClouds = 0;
  public float ofCloudsHeight = 0.0F;
  public int ofTrees = 0;
  public int ofRain = 0;
  public int ofDroppedItems = 0;
  public int ofBetterGrass = 3;
  public int ofAutoSaveTicks = 4000;
  public boolean ofLagometer = false;
  public boolean ofProfiler = false;
  public boolean ofShowFps = false;
  public boolean ofWeather = true;
  public boolean ofSky = true;
  public boolean ofStars = true;
  public boolean ofSunMoon = true;
  public int ofVignette = 0;
  public int ofChunkUpdates = 1;
  public int ofChunkLoading = 0;
  public boolean ofChunkUpdatesDynamic = false;
  public int ofTime = 0;
  public boolean ofClearWater = false;
  public boolean ofBetterSnow = false;
  public String ofFullscreenMode = "Default";
  public boolean ofSwampColors = true;
  public boolean ofRandomMobs = true;
  public boolean ofSmoothBiomes = true;
  public boolean ofCustomFonts = true;
  public boolean ofCustomColors = true;
  public boolean ofCustomSky = true;
  public boolean ofShowCapes = true;
  public int ofConnectedTextures = 2;
  public boolean ofCustomItems = true;
  public boolean ofNaturalTextures = false;
  public boolean ofFastMath = false;
  public boolean ofFastRender = true;
  public int ofTranslucentBlocks = 0;
  public int ofAnimatedWater = 0;
  public int ofAnimatedLava = 0;
  public boolean ofAnimatedFire = true;
  public boolean ofAnimatedPortal = true;
  public boolean ofAnimatedRedstone = true;
  public boolean ofAnimatedExplosion = true;
  public boolean ofAnimatedFlame = true;
  public boolean ofAnimatedSmoke = true;
  public boolean ofVoidParticles = true;
  public boolean ofWaterParticles = true;
  public boolean ofRainSplash = true;
  public boolean ofPortalParticles = true;
  public boolean ofPotionParticles = true;
  public boolean ofFireworkParticles = true;
  public boolean ofDrippingWaterLava = true;
  public boolean ofAnimatedTerrain = true;
  public boolean ofAnimatedTextures = true;
  public static final int DEFAULT = 0;
  public static final int FAST = 1;
  public static final int FANCY = 2;
  public static final int OFF = 3;
  public static final int ANIM_ON = 0;
  public static final int ANIM_GENERATED = 1;
  public static final int ANIM_OFF = 2;
  public static final int CL_DEFAULT = 0;
  public static final int CL_SMOOTH = 1;
  public static final int CL_THREADED = 2;
  public static final String DEFAULT_STR = "Default";
  public avb ofKeyBindZoom;
  private File optionsFileOF;
  
  public avh(ave mcIn, File p_i46326_2_)
  {
    this.m = wn.b.a;
    this.n = true;
    this.o = true;
    this.p = true;
    this.q = 1.0F;
    this.r = true;
    this.t = true;
    this.u = false;
    this.v = true;
    this.w = false;
    this.z = true;
    this.aZ = Sets.newHashSet(wo.values());
    this.D = true;
    this.E = 1.0F;
    this.F = 1.0F;
    this.G = 0.44366196F;
    this.H = 1.0F;
    this.I = true;
    this.J = 4;
    this.ba = Maps.newEnumMap(bpg.class);
    this.K = 0.5F;
    this.L = 1.0F;
    this.M = 1.0F;
    this.N = 0.5412844F;
    this.O = 0.31690142F;
    this.P = 1;
    this.Q = true;
    this.R = "";
    this.S = 0;
    this.T = 0;
    this.U = 0;
    this.V = true;
    this.W = true;
    this.X = new avb("key.forward", 17, "key.categories.movement");
    this.Y = new avb("key.left", 30, "key.categories.movement");
    this.Z = new avb("key.back", 31, "key.categories.movement");
    this.aa = new avb("key.right", 32, "key.categories.movement");
    this.ab = new avb("key.jump", 57, "key.categories.movement");
    this.ac = new avb("key.sneak", 42, "key.categories.movement");
    this.ad = new avb("key.sprint", 29, "key.categories.movement");
    this.ae = new avb("key.inventory", 18, "key.categories.inventory");
    this.af = new avb("key.use", -99, "key.categories.gameplay");
    this.ag = new avb("key.drop", 16, "key.categories.gameplay");
    this.ah = new avb("key.attack", -100, "key.categories.gameplay");
    this.ai = new avb("key.pickItem", -98, "key.categories.gameplay");
    this.aj = new avb("key.chat", 20, "key.categories.multiplayer");
    this.ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
    this.al = new avb("key.command", 53, "key.categories.multiplayer");
    this.am = new avb("key.screenshot", 60, "key.categories.misc");
    this.an = new avb("key.togglePerspective", 63, "key.categories.misc");
    this.ao = new avb("key.smoothCamera", 0, "key.categories.misc");
    this.ap = new avb("key.fullscreen", 87, "key.categories.misc");
    this.aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
    this.ar = new avb("key.streamStartStop", 64, "key.categories.stream");
    this.as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
    this.at = new avb("key.streamCommercial", 0, "key.categories.stream");
    this.au = new avb("key.streamToggleMic", 0, "key.categories.stream");
    this.av = new avb[] { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
    this.aw = ((avb[])ArrayUtils.addAll(new avb[] { this.ah, this.af, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ag, this.ae, this.aj, this.ak, this.ai, this.al, this.am, this.an, this.ao, this.ar, this.as, this.at, this.au, this.ap, this.aq }, this.av));
    this.ay = oj.c;
    this.aE = "";
    this.aH = 70.0F;
    this.aM = "en_US";
    this.aN = false;
    this.ax = mcIn;
    this.bb = new File(p_i46326_2_, "options.txt");
    
    this.optionsFileOF = new File(p_i46326_2_, "optionsof.txt");
    
    this.g = ((int)avh.a.i.f());
    
    this.ofKeyBindZoom = new avb("Zoom", 46, "key.categories.misc");
    this.aw = ((avb[])ArrayUtils.add(this.aw, this.ofKeyBindZoom));
    
    avh.a.f.a(32.0F);
    
    this.c = 8;
    a();
    
    Config.initGameSettings(this);
  }
  
  public avh()
  {
    this.m = wn.b.a;
    this.n = true;
    this.o = true;
    this.p = true;
    this.q = 1.0F;
    this.r = true;
    this.t = true;
    this.u = false;
    this.v = true;
    this.w = false;
    this.z = true;
    this.aZ = Sets.newHashSet(wo.values());
    this.D = true;
    this.E = 1.0F;
    this.F = 1.0F;
    this.G = 0.44366196F;
    this.H = 1.0F;
    this.I = true;
    this.J = 4;
    this.ba = Maps.newEnumMap(bpg.class);
    this.K = 0.5F;
    this.L = 1.0F;
    this.M = 1.0F;
    this.N = 0.5412844F;
    this.O = 0.31690142F;
    this.P = 1;
    this.Q = true;
    this.R = "";
    this.S = 0;
    this.T = 0;
    this.U = 0;
    this.V = true;
    this.W = true;
    this.X = new avb("key.forward", 17, "key.categories.movement");
    this.Y = new avb("key.left", 30, "key.categories.movement");
    this.Z = new avb("key.back", 31, "key.categories.movement");
    this.aa = new avb("key.right", 32, "key.categories.movement");
    this.ab = new avb("key.jump", 57, "key.categories.movement");
    this.ac = new avb("key.sneak", 42, "key.categories.movement");
    this.ad = new avb("key.sprint", 29, "key.categories.movement");
    this.ae = new avb("key.inventory", 18, "key.categories.inventory");
    this.af = new avb("key.use", -99, "key.categories.gameplay");
    this.ag = new avb("key.drop", 16, "key.categories.gameplay");
    this.ah = new avb("key.attack", -100, "key.categories.gameplay");
    this.ai = new avb("key.pickItem", -98, "key.categories.gameplay");
    this.aj = new avb("key.chat", 20, "key.categories.multiplayer");
    this.ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
    this.al = new avb("key.command", 53, "key.categories.multiplayer");
    this.am = new avb("key.screenshot", 60, "key.categories.misc");
    this.an = new avb("key.togglePerspective", 63, "key.categories.misc");
    this.ao = new avb("key.smoothCamera", 0, "key.categories.misc");
    this.ap = new avb("key.fullscreen", 87, "key.categories.misc");
    this.aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
    this.ar = new avb("key.streamStartStop", 64, "key.categories.stream");
    this.as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
    this.at = new avb("key.streamCommercial", 0, "key.categories.stream");
    this.au = new avb("key.streamToggleMic", 0, "key.categories.stream");
    this.av = new avb[] { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
    this.aw = ((avb[])ArrayUtils.addAll(new avb[] { this.ah, this.af, this.X, this.Y, this.Z, this.aa, this.ab, this.ac, this.ad, this.ag, this.ae, this.aj, this.ak, this.ai, this.al, this.am, this.an, this.ao, this.ar, this.as, this.at, this.au, this.ap, this.aq }, this.av));
    this.ay = oj.c;
    this.aE = "";
    this.aH = 70.0F;
    this.aM = "en_US";
    this.aN = false;
  }
  
  public static String c(int p_74298_0_)
  {
    return p_74298_0_ < 256 ? Keyboard.getKeyName(p_74298_0_) : p_74298_0_ < 0 ? bnq.a("key.mouseButton", new Object[] { Integer.valueOf(p_74298_0_ + 101) }) : String.format("%c", new Object[] { Character.valueOf((char)(p_74298_0_ - 256)) }).toUpperCase();
  }
  
  public static boolean a(avb p_100015_0_)
  {
    int keyCode = p_100015_0_.i();
    if ((keyCode < -100) || (keyCode > 255)) {
      return false;
    }
    return p_100015_0_.i() < 0 ? Mouse.isButtonDown(p_100015_0_.i() + 100) : p_100015_0_.i() == 0 ? false : Keyboard.isKeyDown(p_100015_0_.i());
  }
  
  public void a(avb p_151440_1_, int p_151440_2_)
  {
    p_151440_1_.b(p_151440_2_);
    b();
  }
  
  public void a(avh.a p_74304_1_, float p_74304_2_)
  {
    setOptionFloatValueOF(p_74304_1_, p_74304_2_);
    if (p_74304_1_ == avh.a.b) {
      this.a = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.c) {
      this.aH = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.d) {
      this.aI = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.i)
    {
      this.g = ((int)p_74304_2_);
      
      this.t = false;
      if (this.g <= 0)
      {
        this.g = ((int)avh.a.i.f());
        this.t = true;
      }
      updateVSync();
    }
    if (p_74304_1_ == avh.a.s)
    {
      this.q = p_74304_2_;
      this.ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.B)
    {
      this.H = p_74304_2_;
      this.ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.C)
    {
      this.G = p_74304_2_;
      this.ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.A)
    {
      this.F = p_74304_2_;
      this.ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.z)
    {
      this.E = p_74304_2_;
      this.ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.D)
    {
      int var3 = this.J;
      this.J = ((int)p_74304_2_);
      if (var3 != p_74304_2_)
      {
        this.ax.T().a(this.J);
        this.ax.P().a(bmh.g);
        this.ax.T().a(false, this.J > 0);
        this.ax.B();
      }
    }
    if (p_74304_1_ == avh.a.P)
    {
      this.v = (!this.v);
      this.ax.g.a();
    }
    if (p_74304_1_ == avh.a.f)
    {
      this.c = ((int)p_74304_2_);
      this.ax.g.m();
    }
    if (p_74304_1_ == avh.a.F) {
      this.K = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.G)
    {
      this.L = p_74304_2_;
      this.ax.Y().p();
    }
    if (p_74304_1_ == avh.a.H)
    {
      this.M = p_74304_2_;
      this.ax.Y().p();
    }
    if (p_74304_1_ == avh.a.I) {
      this.N = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.J) {
      this.O = p_74304_2_;
    }
  }
  
  public void a(avh.a p_74306_1_, int p_74306_2_)
  {
    setOptionValueOF(p_74306_1_, p_74306_2_);
    if (p_74306_1_ == avh.a.a) {
      this.b = (!this.b);
    }
    if (p_74306_1_ == avh.a.n) {
      this.aK = (this.aK + p_74306_2_ & 0x3);
    }
    if (p_74306_1_ == avh.a.o) {
      this.aL = ((this.aL + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.g) {
      this.d = (!this.d);
    }
    if (p_74306_1_ == avh.a.k) {
      this.h = ((this.h + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.E)
    {
      this.aN = (!this.aN);
      this.ax.k.a((this.ax.S().a()) || (this.aN));
    }
    if (p_74306_1_ == avh.a.j) {
      this.f = (!this.f);
    }
    if (p_74306_1_ == avh.a.h)
    {
      this.e = (!this.e);
      this.ax.e();
    }
    if (p_74306_1_ == avh.a.l)
    {
      this.i = (!this.i);
      
      updateRenderClouds();
      
      this.ax.g.a();
    }
    if (p_74306_1_ == avh.a.m)
    {
      this.j = ((this.j + p_74306_2_) % 3);
      this.ax.g.a();
    }
    if (p_74306_1_ == avh.a.p) {
      this.m = wn.b.a((this.m.a() + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.K) {
      this.P = ((this.P + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.L) {
      this.Q = (!this.Q);
    }
    if (p_74306_1_ == avh.a.M) {
      this.S = ((this.S + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.N) {
      this.T = ((this.T + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.O) {
      this.U = ((this.U + p_74306_2_) % 2);
    }
    if (p_74306_1_ == avh.a.q) {
      this.n = (!this.n);
    }
    if (p_74306_1_ == avh.a.r) {
      this.o = (!this.o);
    }
    if (p_74306_1_ == avh.a.t) {
      this.p = (!this.p);
    }
    if (p_74306_1_ == avh.a.u) {
      this.r = (!this.r);
    }
    if (p_74306_1_ == avh.a.y) {
      this.A = (!this.A);
    }
    if (p_74306_1_ == avh.a.v)
    {
      this.s = (!this.s);
      if (this.ax.K() != this.s) {
        this.ax.q();
      }
    }
    if (p_74306_1_ == avh.a.w)
    {
      this.t = (!this.t);
      Display.setVSyncEnabled(this.t);
    }
    if (p_74306_1_ == avh.a.x)
    {
      this.u = (!this.u);
      this.ax.g.a();
    }
    if (p_74306_1_ == avh.a.P)
    {
      this.v = (!this.v);
      this.ax.g.a();
    }
    if (p_74306_1_ == avh.a.Q) {
      this.w = (!this.w);
    }
    if (p_74306_1_ == avh.a.R) {
      this.W = (!this.W);
    }
    b();
  }
  
  public float a(avh.a p_74296_1_)
  {
    if (p_74296_1_ == avh.a.CLOUD_HEIGHT) {
      return this.ofCloudsHeight;
    }
    if (p_74296_1_ == avh.a.AO_LEVEL) {
      return this.ofAoLevel;
    }
    if (p_74296_1_ == avh.a.AA_LEVEL) {
      return this.ofAaLevel;
    }
    if (p_74296_1_ == avh.a.AF_LEVEL) {
      return this.ofAfLevel;
    }
    if (p_74296_1_ == avh.a.MIPMAP_TYPE) {
      return this.ofMipmapType;
    }
    if (p_74296_1_ == avh.a.i)
    {
      if ((this.g == avh.a.i.f()) && (this.t)) {
        return 0.0F;
      }
      return this.g;
    }
    return p_74296_1_ == avh.a.J ? this.O : p_74296_1_ == avh.a.I ? this.N : p_74296_1_ == avh.a.H ? this.M : p_74296_1_ == avh.a.G ? this.L : p_74296_1_ == avh.a.F ? this.K : p_74296_1_ == avh.a.f ? this.c : p_74296_1_ == avh.a.D ? this.J : p_74296_1_ == avh.a.i ? this.g : p_74296_1_ == avh.a.A ? this.F : p_74296_1_ == avh.a.z ? this.E : p_74296_1_ == avh.a.C ? this.G : p_74296_1_ == avh.a.B ? this.H : p_74296_1_ == avh.a.s ? this.q : p_74296_1_ == avh.a.b ? this.a : p_74296_1_ == avh.a.e ? this.aJ : p_74296_1_ == avh.a.d ? this.aI : p_74296_1_ == avh.a.c ? this.aH : 0.0F;
  }
  
  public boolean b(avh.a p_74308_1_)
  {
    switch (avh.2.a[p_74308_1_.ordinal()])
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
  
  private static String a(String[] p_74299_0_, int p_74299_1_)
  {
    if ((p_74299_1_ < 0) || (p_74299_1_ >= p_74299_0_.length)) {
      p_74299_1_ = 0;
    }
    return bnq.a(p_74299_0_[p_74299_1_], new Object[0]);
  }
  
  public String c(avh.a p_74297_1_)
  {
    String strOF = getKeyBindingOF(p_74297_1_);
    if (strOF != null) {
      return strOF;
    }
    String var2 = bnq.a(p_74297_1_.d(), new Object[0]) + ": ";
    if (p_74297_1_.a())
    {
      float var6 = a(p_74297_1_);
      float var4 = p_74297_1_.c(var6);
      return var2 + (int)(var4 * 100.0F) + "%";
    }
    if (p_74297_1_.b())
    {
      boolean var5 = b(p_74297_1_);
      return var2 + bnq.a("options.off", new Object[0]);
    }
    if (p_74297_1_ == avh.a.n) {
      return var2 + a(aR, this.aK);
    }
    if (p_74297_1_ == avh.a.p) {
      return var2 + bnq.a(this.m.b(), new Object[0]);
    }
    if (p_74297_1_ == avh.a.o) {
      return var2 + a(aS, this.aL);
    }
    if (p_74297_1_ == avh.a.m) {
      return var2 + a(aT, this.j);
    }
    if (p_74297_1_ == avh.a.K) {
      return var2 + a(aU, this.P);
    }
    if (p_74297_1_ == avh.a.M) {
      return var2 + a(aV, this.S);
    }
    if (p_74297_1_ == avh.a.N) {
      return var2 + a(aW, this.T);
    }
    if (p_74297_1_ == avh.a.O) {
      return var2 + a(aX, this.U);
    }
    if (p_74297_1_ == avh.a.k) {
      return var2 + a(aY, this.h);
    }
    if (p_74297_1_ == avh.a.l)
    {
      if (this.i) {
        return var2 + bnq.a("options.graphics.fancy", new Object[0]);
      }
      String var3 = "options.graphics.fast";
      return var2 + bnq.a("options.graphics.fast", new Object[0]);
    }
    return var2;
  }
  
  public void a()
  {
    try
    {
      if (!this.bb.exists()) {
        return;
      }
      BufferedReader var1 = new BufferedReader(new FileReader(this.bb));
      String var2 = "";
      this.ba.clear();
      while ((var2 = var1.readLine()) != null) {
        try
        {
          String[] var3 = var2.split(":");
          if (var3[0].equals("mouseSensitivity")) {
            this.a = a(var3[1]);
          }
          if (var3[0].equals("fov")) {
            this.aH = (a(var3[1]) * 40.0F + 70.0F);
          }
          if (var3[0].equals("gamma")) {
            this.aI = a(var3[1]);
          }
          if (var3[0].equals("saturation")) {
            this.aJ = a(var3[1]);
          }
          if (var3[0].equals("invertYMouse")) {
            this.b = var3[1].equals("true");
          }
          if (var3[0].equals("renderDistance")) {
            this.c = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("guiScale")) {
            this.aK = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("particles")) {
            this.aL = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("bobView")) {
            this.d = var3[1].equals("true");
          }
          if (var3[0].equals("anaglyph3d")) {
            this.e = var3[1].equals("true");
          }
          if (var3[0].equals("maxFps"))
          {
            this.g = Integer.parseInt(var3[1]);
            
            this.t = false;
            if (this.g <= 0)
            {
              this.g = ((int)avh.a.i.f());
              this.t = true;
            }
            updateVSync();
          }
          if (var3[0].equals("fboEnable")) {
            this.f = var3[1].equals("true");
          }
          if (var3[0].equals("difficulty")) {
            this.ay = oj.a(Integer.parseInt(var3[1]));
          }
          if (var3[0].equals("fancyGraphics"))
          {
            this.i = var3[1].equals("true");
            
            updateRenderClouds();
          }
          if (var3[0].equals("ao")) {
            if (var3[1].equals("true")) {
              this.j = 2;
            } else if (var3[1].equals("false")) {
              this.j = 0;
            } else {
              this.j = Integer.parseInt(var3[1]);
            }
          }
          if (var3[0].equals("renderClouds")) {
            if (var3[1].equals("true")) {
              this.h = 2;
            } else if (var3[1].equals("false")) {
              this.h = 0;
            } else if (var3[1].equals("fast")) {
              this.h = 1;
            }
          }
          if (var3[0].equals("resourcePacks"))
          {
            this.k = ((List)aP.fromJson(var2.substring(var2.indexOf(':') + 1), aQ));
            if (this.k == null) {
              this.k = Lists.newArrayList();
            }
          }
          if (var3[0].equals("incompatibleResourcePacks"))
          {
            this.l = ((List)aP.fromJson(var2.substring(var2.indexOf(':') + 1), aQ));
            if (this.l == null) {
              this.l = Lists.newArrayList();
            }
          }
          if ((var3[0].equals("lastServer")) && (var3.length >= 2)) {
            this.aE = var2.substring(var2.indexOf(':') + 1);
          }
          if ((var3[0].equals("lang")) && (var3.length >= 2)) {
            this.aM = var3[1];
          }
          if (var3[0].equals("chatVisibility")) {
            this.m = wn.b.a(Integer.parseInt(var3[1]));
          }
          if (var3[0].equals("chatColors")) {
            this.n = var3[1].equals("true");
          }
          if (var3[0].equals("chatLinks")) {
            this.o = var3[1].equals("true");
          }
          if (var3[0].equals("chatLinksPrompt")) {
            this.p = var3[1].equals("true");
          }
          if (var3[0].equals("chatOpacity")) {
            this.q = a(var3[1]);
          }
          if (var3[0].equals("snooperEnabled")) {
            this.r = var3[1].equals("true");
          }
          if (var3[0].equals("fullscreen")) {
            this.s = var3[1].equals("true");
          }
          if (var3[0].equals("enableVsync"))
          {
            this.t = var3[1].equals("true");
            
            updateVSync();
          }
          if (var3[0].equals("useVbo")) {
            this.u = var3[1].equals("true");
          }
          if (var3[0].equals("hideServerAddress")) {
            this.x = var3[1].equals("true");
          }
          if (var3[0].equals("advancedItemTooltips")) {
            this.y = var3[1].equals("true");
          }
          if (var3[0].equals("pauseOnLostFocus")) {
            this.z = var3[1].equals("true");
          }
          if (var3[0].equals("touchscreen")) {
            this.A = var3[1].equals("true");
          }
          if (var3[0].equals("overrideHeight")) {
            this.C = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("overrideWidth")) {
            this.B = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("heldItemTooltips")) {
            this.D = var3[1].equals("true");
          }
          if (var3[0].equals("chatHeightFocused")) {
            this.H = a(var3[1]);
          }
          if (var3[0].equals("chatHeightUnfocused")) {
            this.G = a(var3[1]);
          }
          if (var3[0].equals("chatScale")) {
            this.E = a(var3[1]);
          }
          if (var3[0].equals("chatWidth")) {
            this.F = a(var3[1]);
          }
          if (var3[0].equals("showInventoryAchievementHint")) {
            this.I = var3[1].equals("true");
          }
          if (var3[0].equals("mipmapLevels")) {
            this.J = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamBytesPerPixel")) {
            this.K = a(var3[1]);
          }
          if (var3[0].equals("streamMicVolume")) {
            this.L = a(var3[1]);
          }
          if (var3[0].equals("streamSystemVolume")) {
            this.M = a(var3[1]);
          }
          if (var3[0].equals("streamKbps")) {
            this.N = a(var3[1]);
          }
          if (var3[0].equals("streamFps")) {
            this.O = a(var3[1]);
          }
          if (var3[0].equals("streamCompression")) {
            this.P = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamSendMetadata")) {
            this.Q = var3[1].equals("true");
          }
          if ((var3[0].equals("streamPreferredServer")) && (var3.length >= 2)) {
            this.R = var2.substring(var2.indexOf(':') + 1);
          }
          if (var3[0].equals("streamChatEnabled")) {
            this.S = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamChatUserFilter")) {
            this.T = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamMicToggleBehavior")) {
            this.U = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("forceUnicodeFont")) {
            this.aN = var3[1].equals("true");
          }
          if (var3[0].equals("allowBlockAlternatives")) {
            this.v = var3[1].equals("true");
          }
          if (var3[0].equals("reducedDebugInfo")) {
            this.w = var3[1].equals("true");
          }
          if (var3[0].equals("useNativeTransport")) {
            this.V = var3[1].equals("true");
          }
          if (var3[0].equals("entityShadows")) {
            this.W = var3[1].equals("true");
          }
          avb[] var4 = this.aw;
          int var5 = var4.length;
          for (int var6 = 0; var6 < var5; var6++)
          {
            avb var7 = var4[var6];
            if (var3[0].equals("key_" + var7.g())) {
              var7.b(Integer.parseInt(var3[1]));
            }
          }
          bpg[] var10 = bpg.values();
          var5 = var10.length;
          for (var6 = 0; var6 < var5; var6++)
          {
            bpg var12 = var10[var6];
            if (var3[0].equals("soundCategory_" + var12.a())) {
              this.ba.put(var12, Float.valueOf(a(var3[1])));
            }
          }
          wo[] var11 = wo.values();
          var5 = var11.length;
          for (var6 = 0; var6 < var5; var6++)
          {
            wo var13 = var11[var6];
            if (var3[0].equals("modelPart_" + var13.c())) {
              a(var13, var3[1].equals("true"));
            }
          }
        }
        catch (Exception var8)
        {
          aO.warn("Skipping bad option: " + var2);
          
          var8.printStackTrace();
        }
      }
      avb.b();
      var1.close();
    }
    catch (Exception var9)
    {
      aO.error("Failed to load options", var9);
    }
    loadOfOptions();
  }
  
  private float a(String p_74305_1_)
  {
    return p_74305_1_.equals("false") ? 0.0F : p_74305_1_.equals("true") ? 1.0F : Float.parseFloat(p_74305_1_);
  }
  
  public void b()
  {
    if (Reflector.FMLClientHandler.exists())
    {
      Object fml = Reflector.call(Reflector.FMLClientHandler_instance, new Object[0]);
      if ((fml != null) && (Reflector.callBoolean(fml, Reflector.FMLClientHandler_isLoading, new Object[0]))) {
        return;
      }
    }
    try
    {
      PrintWriter var1 = new PrintWriter(new FileWriter(this.bb));
      var1.println("invertYMouse:" + this.b);
      var1.println("mouseSensitivity:" + this.a);
      var1.println("fov:" + (this.aH - 70.0F) / 40.0F);
      var1.println("gamma:" + this.aI);
      var1.println("saturation:" + this.aJ);
      var1.println("renderDistance:" + this.c);
      var1.println("guiScale:" + this.aK);
      var1.println("particles:" + this.aL);
      var1.println("bobView:" + this.d);
      var1.println("anaglyph3d:" + this.e);
      var1.println("maxFps:" + this.g);
      var1.println("fboEnable:" + this.f);
      var1.println("difficulty:" + this.ay.a());
      var1.println("fancyGraphics:" + this.i);
      var1.println("ao:" + this.j);
      switch (this.h)
      {
      case 0: 
        var1.println("renderClouds:false");
        break;
      case 1: 
        var1.println("renderClouds:fast");
        break;
      case 2: 
        var1.println("renderClouds:true");
      }
      var1.println("resourcePacks:" + aP.toJson(this.k));
      var1.println("incompatibleResourcePacks:" + aP.toJson(this.l));
      var1.println("lastServer:" + this.aE);
      var1.println("lang:" + this.aM);
      var1.println("chatVisibility:" + this.m.a());
      var1.println("chatColors:" + this.n);
      var1.println("chatLinks:" + this.o);
      var1.println("chatLinksPrompt:" + this.p);
      var1.println("chatOpacity:" + this.q);
      var1.println("snooperEnabled:" + this.r);
      var1.println("fullscreen:" + this.s);
      var1.println("enableVsync:" + this.t);
      var1.println("useVbo:" + this.u);
      var1.println("hideServerAddress:" + this.x);
      var1.println("advancedItemTooltips:" + this.y);
      var1.println("pauseOnLostFocus:" + this.z);
      var1.println("touchscreen:" + this.A);
      var1.println("overrideWidth:" + this.B);
      var1.println("overrideHeight:" + this.C);
      var1.println("heldItemTooltips:" + this.D);
      var1.println("chatHeightFocused:" + this.H);
      var1.println("chatHeightUnfocused:" + this.G);
      var1.println("chatScale:" + this.E);
      var1.println("chatWidth:" + this.F);
      var1.println("showInventoryAchievementHint:" + this.I);
      var1.println("mipmapLevels:" + this.J);
      var1.println("streamBytesPerPixel:" + this.K);
      var1.println("streamMicVolume:" + this.L);
      var1.println("streamSystemVolume:" + this.M);
      var1.println("streamKbps:" + this.N);
      var1.println("streamFps:" + this.O);
      var1.println("streamCompression:" + this.P);
      var1.println("streamSendMetadata:" + this.Q);
      var1.println("streamPreferredServer:" + this.R);
      var1.println("streamChatEnabled:" + this.S);
      var1.println("streamChatUserFilter:" + this.T);
      var1.println("streamMicToggleBehavior:" + this.U);
      var1.println("forceUnicodeFont:" + this.aN);
      var1.println("allowBlockAlternatives:" + this.v);
      var1.println("reducedDebugInfo:" + this.w);
      var1.println("useNativeTransport:" + this.V);
      var1.println("entityShadows:" + this.W);
      avb[] var2 = this.aw;
      int var3 = var2.length;
      for (int var4 = 0; var4 < var3; var4++)
      {
        avb var5 = var2[var4];
        var1.println("key_" + var5.g() + ":" + var5.i());
      }
      bpg[] var7 = bpg.values();
      var3 = var7.length;
      for (var4 = 0; var4 < var3; var4++)
      {
        bpg var9 = var7[var4];
        var1.println("soundCategory_" + var9.a() + ":" + a(var9));
      }
      wo[] var8 = wo.values();
      var3 = var8.length;
      for (var4 = 0; var4 < var3; var4++)
      {
        wo var10 = var8[var4];
        var1.println("modelPart_" + var10.c() + ":" + this.aZ.contains(var10));
      }
      var1.close();
    }
    catch (Exception var6)
    {
      aO.error("Failed to save options", var6);
    }
    saveOfOptions();
    
    c();
  }
  
  public float a(bpg p_151438_1_)
  {
    return this.ba.containsKey(p_151438_1_) ? ((Float)this.ba.get(p_151438_1_)).floatValue() : 1.0F;
  }
  
  public void a(bpg p_151439_1_, float p_151439_2_)
  {
    this.ax.W().a(p_151439_1_, p_151439_2_);
    this.ba.put(p_151439_1_, Float.valueOf(p_151439_2_));
  }
  
  public void c()
  {
    if (this.ax.h != null)
    {
      int var1 = 0;
      wo var3;
      for (Iterator var2 = this.aZ.iterator(); var2.hasNext(); var1 |= var3.a()) {
        var3 = (wo)var2.next();
      }
      this.ax.h.a.a(new ih(this.aM, this.c, this.m, this.n, var1));
    }
  }
  
  public Set d()
  {
    return ImmutableSet.copyOf(this.aZ);
  }
  
  public void a(wo p_178878_1_, boolean p_178878_2_)
  {
    if (p_178878_2_) {
      this.aZ.add(p_178878_1_);
    } else {
      this.aZ.remove(p_178878_1_);
    }
    c();
  }
  
  public void a(wo p_178877_1_)
  {
    if (!d().contains(p_178877_1_)) {
      this.aZ.add(p_178877_1_);
    } else {
      this.aZ.remove(p_178877_1_);
    }
    c();
  }
  
  public int e()
  {
    return this.c >= 4 ? this.h : 0;
  }
  
  public boolean f()
  {
    return this.V;
  }
  
  private void setOptionFloatValueOF(avh.a option, float val)
  {
    if (option == avh.a.CLOUD_HEIGHT)
    {
      this.ofCloudsHeight = val;
      
      this.ax.g.resetClouds();
    }
    if (option == avh.a.AO_LEVEL)
    {
      this.ofAoLevel = val;
      this.ax.g.a();
    }
    if (option == avh.a.AA_LEVEL)
    {
      int valInt = (int)val;
      if ((valInt > 0) && (Config.isShaders()))
      {
        Config.showGuiMessage("Antialiasing is not compatible with Shaders.", "Please disable Shaders to enable this option.");
        return;
      }
      int[] aaLevels = { 0, 2, 4, 6, 8, 12, 16 };
      this.ofAaLevel = 0;
      for (int l = 0; l < aaLevels.length; l++) {
        if (valInt >= aaLevels[l]) {
          this.ofAaLevel = aaLevels[l];
        }
      }
      this.ofAaLevel = Config.limit(this.ofAaLevel, 0, 16);
    }
    if (option == avh.a.AF_LEVEL)
    {
      int valInt = (int)val;
      if ((valInt > 1) && (Config.isShaders()))
      {
        Config.showGuiMessage("Anisotropic Filtering is not compatible with Shaders.", "Please disable Shaders to enable this option.");
        return;
      }
      this.ofAfLevel = 1;
      while (this.ofAfLevel * 2 <= valInt) {
        this.ofAfLevel *= 2;
      }
      this.ofAfLevel = Config.limit(this.ofAfLevel, 1, 16);
      
      this.ax.e();
    }
    if (option == avh.a.MIPMAP_TYPE)
    {
      int valInt = (int)val;
      this.ofMipmapType = Config.limit(valInt, 0, 3);
      
      this.ax.e();
    }
  }
  
  private void setOptionValueOF(avh.a par1EnumOptions, int par2)
  {
    if (par1EnumOptions == avh.a.FOG_FANCY) {
      switch (this.ofFogType)
      {
      case 1: 
        this.ofFogType = 2;
        if (!Config.isFancyFogAvailable()) {
          this.ofFogType = 3;
        }
        break;
      case 2: 
        this.ofFogType = 3;
        break;
      case 3: 
        this.ofFogType = 1;
        break;
      default: 
        this.ofFogType = 1;
      }
    }
    if (par1EnumOptions == avh.a.FOG_START)
    {
      this.ofFogStart += 0.2F;
      if (this.ofFogStart > 0.81F) {
        this.ofFogStart = 0.2F;
      }
    }
    if (par1EnumOptions == avh.a.SMOOTH_FPS) {
      this.ofSmoothFps = (!this.ofSmoothFps);
    }
    if (par1EnumOptions == avh.a.SMOOTH_WORLD)
    {
      this.ofSmoothWorld = (!this.ofSmoothWorld);
      
      Config.updateThreadPriorities();
    }
    if (par1EnumOptions == avh.a.CLOUDS)
    {
      this.ofClouds += 1;
      if (this.ofClouds > 3) {
        this.ofClouds = 0;
      }
      updateRenderClouds();
      
      this.ax.g.resetClouds();
    }
    if (par1EnumOptions == avh.a.TREES)
    {
      this.ofTrees += 1;
      if (this.ofTrees > 2) {
        this.ofTrees = 0;
      }
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.DROPPED_ITEMS)
    {
      this.ofDroppedItems += 1;
      if (this.ofDroppedItems > 2) {
        this.ofDroppedItems = 0;
      }
    }
    if (par1EnumOptions == avh.a.RAIN)
    {
      this.ofRain += 1;
      if (this.ofRain > 3) {
        this.ofRain = 0;
      }
    }
    if (par1EnumOptions == avh.a.ANIMATED_WATER)
    {
      this.ofAnimatedWater += 1;
      if (this.ofAnimatedWater > 2) {
        this.ofAnimatedWater = 0;
      }
    }
    if (par1EnumOptions == avh.a.ANIMATED_LAVA)
    {
      this.ofAnimatedLava += 1;
      if (this.ofAnimatedLava > 2) {
        this.ofAnimatedLava = 0;
      }
    }
    if (par1EnumOptions == avh.a.ANIMATED_FIRE) {
      this.ofAnimatedFire = (!this.ofAnimatedFire);
    }
    if (par1EnumOptions == avh.a.ANIMATED_PORTAL) {
      this.ofAnimatedPortal = (!this.ofAnimatedPortal);
    }
    if (par1EnumOptions == avh.a.ANIMATED_REDSTONE) {
      this.ofAnimatedRedstone = (!this.ofAnimatedRedstone);
    }
    if (par1EnumOptions == avh.a.ANIMATED_EXPLOSION) {
      this.ofAnimatedExplosion = (!this.ofAnimatedExplosion);
    }
    if (par1EnumOptions == avh.a.ANIMATED_FLAME) {
      this.ofAnimatedFlame = (!this.ofAnimatedFlame);
    }
    if (par1EnumOptions == avh.a.ANIMATED_SMOKE) {
      this.ofAnimatedSmoke = (!this.ofAnimatedSmoke);
    }
    if (par1EnumOptions == avh.a.VOID_PARTICLES) {
      this.ofVoidParticles = (!this.ofVoidParticles);
    }
    if (par1EnumOptions == avh.a.WATER_PARTICLES) {
      this.ofWaterParticles = (!this.ofWaterParticles);
    }
    if (par1EnumOptions == avh.a.PORTAL_PARTICLES) {
      this.ofPortalParticles = (!this.ofPortalParticles);
    }
    if (par1EnumOptions == avh.a.POTION_PARTICLES) {
      this.ofPotionParticles = (!this.ofPotionParticles);
    }
    if (par1EnumOptions == avh.a.FIREWORK_PARTICLES) {
      this.ofFireworkParticles = (!this.ofFireworkParticles);
    }
    if (par1EnumOptions == avh.a.DRIPPING_WATER_LAVA) {
      this.ofDrippingWaterLava = (!this.ofDrippingWaterLava);
    }
    if (par1EnumOptions == avh.a.ANIMATED_TERRAIN) {
      this.ofAnimatedTerrain = (!this.ofAnimatedTerrain);
    }
    if (par1EnumOptions == avh.a.ANIMATED_TEXTURES) {
      this.ofAnimatedTextures = (!this.ofAnimatedTextures);
    }
    if (par1EnumOptions == avh.a.RAIN_SPLASH) {
      this.ofRainSplash = (!this.ofRainSplash);
    }
    if (par1EnumOptions == avh.a.LAGOMETER) {
      this.ofLagometer = (!this.ofLagometer);
    }
    if (par1EnumOptions == avh.a.SHOW_FPS) {
      this.ofShowFps = (!this.ofShowFps);
    }
    if (par1EnumOptions == avh.a.AUTOSAVE_TICKS)
    {
      this.ofAutoSaveTicks *= 10;
      if (this.ofAutoSaveTicks > 40000) {
        this.ofAutoSaveTicks = 40;
      }
    }
    if (par1EnumOptions == avh.a.BETTER_GRASS)
    {
      this.ofBetterGrass += 1;
      if (this.ofBetterGrass > 3) {
        this.ofBetterGrass = 1;
      }
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.CONNECTED_TEXTURES)
    {
      this.ofConnectedTextures += 1;
      if (this.ofConnectedTextures > 3) {
        this.ofConnectedTextures = 1;
      }
      if (this.ofConnectedTextures != 2) {
        this.ax.e();
      }
    }
    if (par1EnumOptions == avh.a.WEATHER) {
      this.ofWeather = (!this.ofWeather);
    }
    if (par1EnumOptions == avh.a.SKY) {
      this.ofSky = (!this.ofSky);
    }
    if (par1EnumOptions == avh.a.STARS) {
      this.ofStars = (!this.ofStars);
    }
    if (par1EnumOptions == avh.a.SUN_MOON) {
      this.ofSunMoon = (!this.ofSunMoon);
    }
    if (par1EnumOptions == avh.a.VIGNETTE)
    {
      this.ofVignette += 1;
      if (this.ofVignette > 2) {
        this.ofVignette = 0;
      }
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES)
    {
      this.ofChunkUpdates += 1;
      if (this.ofChunkUpdates > 5) {
        this.ofChunkUpdates = 1;
      }
    }
    if (par1EnumOptions == avh.a.CHUNK_LOADING)
    {
      this.ofChunkLoading += 1;
      if (this.ofChunkLoading > 2) {
        this.ofChunkLoading = 0;
      }
      updateChunkLoading();
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES_DYNAMIC) {
      this.ofChunkUpdatesDynamic = (!this.ofChunkUpdatesDynamic);
    }
    if (par1EnumOptions == avh.a.TIME)
    {
      this.ofTime += 1;
      if (this.ofTime > 3) {
        this.ofTime = 0;
      }
    }
    if (par1EnumOptions == avh.a.CLEAR_WATER)
    {
      this.ofClearWater = (!this.ofClearWater);
      updateWaterOpacity();
    }
    if (par1EnumOptions == avh.a.PROFILER) {
      this.ofProfiler = (!this.ofProfiler);
    }
    if (par1EnumOptions == avh.a.BETTER_SNOW)
    {
      this.ofBetterSnow = (!this.ofBetterSnow);
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.SWAMP_COLORS)
    {
      this.ofSwampColors = (!this.ofSwampColors);
      CustomColorizer.updateUseDefaultColorMultiplier();
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.RANDOM_MOBS)
    {
      this.ofRandomMobs = (!this.ofRandomMobs);
      RandomMobs.resetTextures();
    }
    if (par1EnumOptions == avh.a.SMOOTH_BIOMES)
    {
      this.ofSmoothBiomes = (!this.ofSmoothBiomes);
      CustomColorizer.updateUseDefaultColorMultiplier();
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.CUSTOM_FONTS)
    {
      this.ofCustomFonts = (!this.ofCustomFonts);
      
      this.ax.k.a(Config.getResourceManager());
      this.ax.l.a(Config.getResourceManager());
    }
    if (par1EnumOptions == avh.a.CUSTOM_COLORS)
    {
      this.ofCustomColors = (!this.ofCustomColors);
      
      CustomColorizer.update();
      
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.CUSTOM_ITEMS)
    {
      this.ofCustomItems = (!this.ofCustomItems);
      
      this.ax.e();
    }
    if (par1EnumOptions == avh.a.CUSTOM_SKY)
    {
      this.ofCustomSky = (!this.ofCustomSky);
      
      CustomSky.update();
    }
    if (par1EnumOptions == avh.a.SHOW_CAPES) {
      this.ofShowCapes = (!this.ofShowCapes);
    }
    if (par1EnumOptions == avh.a.NATURAL_TEXTURES)
    {
      this.ofNaturalTextures = (!this.ofNaturalTextures);
      
      NaturalTextures.update();
      
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.FAST_MATH)
    {
      this.ofFastMath = (!this.ofFastMath);
      
      ns.fastMath = this.ofFastMath;
    }
    if (par1EnumOptions == avh.a.FAST_RENDER)
    {
      if ((!this.ofFastRender) && (Config.isShaders()))
      {
        Config.showGuiMessage("Fast Render is not compatible with Shaders.", "Please disable Shaders to enable this option.");
        return;
      }
      this.ofFastRender = (!this.ofFastRender);
      if (this.ofFastRender) {
        this.ax.o.b();
      }
      Config.updateFramebufferSize();
    }
    if (par1EnumOptions == avh.a.TRANSLUCENT_BLOCKS)
    {
      if (this.ofTranslucentBlocks == 0) {
        this.ofTranslucentBlocks = 1;
      } else if (this.ofTranslucentBlocks == 1) {
        this.ofTranslucentBlocks = 2;
      } else if (this.ofTranslucentBlocks == 2) {
        this.ofTranslucentBlocks = 0;
      } else {
        this.ofTranslucentBlocks = 0;
      }
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.LAZY_CHUNK_LOADING)
    {
      this.ofLazyChunkLoading = (!this.ofLazyChunkLoading);
      
      Config.updateAvailableProcessors();
      if (!Config.isSingleProcessor()) {
        this.ofLazyChunkLoading = false;
      }
      this.ax.g.a();
    }
    if (par1EnumOptions == avh.a.FULLSCREEN_MODE)
    {
      List modeList = Arrays.asList(Config.getFullscreenModes());
      if (this.ofFullscreenMode.equals("Default"))
      {
        this.ofFullscreenMode = ((String)modeList.get(0));
      }
      else
      {
        int index = modeList.indexOf(this.ofFullscreenMode);
        if (index < 0)
        {
          this.ofFullscreenMode = "Default";
        }
        else
        {
          index++;
          if (index >= modeList.size()) {
            this.ofFullscreenMode = "Default";
          } else {
            this.ofFullscreenMode = ((String)modeList.get(index));
          }
        }
      }
    }
    if (par1EnumOptions == avh.a.HELD_ITEM_TOOLTIPS) {
      this.D = (!this.D);
    }
  }
  
  private String getKeyBindingOF(avh.a par1EnumOptions)
  {
    String var2 = bnq.a(par1EnumOptions.d(), new Object[0]) + ": ";
    if (var2 == null) {
      var2 = par1EnumOptions.d();
    }
    String s = var2;
    if (par1EnumOptions == avh.a.f)
    {
      int distChunks = (int)a(par1EnumOptions);
      String str = "Tiny";
      int baseDist = 2;
      if (distChunks >= 4)
      {
        str = "Short";
        baseDist = 4;
      }
      if (distChunks >= 8)
      {
        str = "Normal";
        baseDist = 8;
      }
      if (distChunks >= 16)
      {
        str = "Far";
        baseDist = 16;
      }
      if (distChunks >= 32)
      {
        str = "Extreme";
        baseDist = 32;
      }
      int diff = this.c - baseDist;
      String descr = str;
      if (diff > 0) {
        descr = descr + "+";
      }
      return var2 + distChunks + " " + descr + "";
    }
    if (par1EnumOptions == avh.a.FOG_FANCY)
    {
      switch (this.ofFogType)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      case 3: 
        return s + "OFF";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FOG_START) {
      return s + this.ofFogStart;
    }
    if (par1EnumOptions == avh.a.MIPMAP_TYPE)
    {
      switch (this.ofMipmapType)
      {
      case 0: 
        return s + "Nearest";
      case 1: 
        return s + "Linear";
      case 2: 
        return s + "Bilinear";
      case 3: 
        return s + "Trilinear";
      }
      return s + "Nearest";
    }
    if (par1EnumOptions == avh.a.SMOOTH_FPS)
    {
      if (this.ofSmoothFps) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SMOOTH_WORLD)
    {
      if (this.ofSmoothWorld) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CLOUDS)
    {
      switch (this.ofClouds)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      case 3: 
        return s + "OFF";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.TREES)
    {
      switch (this.ofTrees)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.DROPPED_ITEMS)
    {
      switch (this.ofDroppedItems)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.RAIN)
    {
      switch (this.ofRain)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      case 3: 
        return s + "OFF";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.ANIMATED_WATER)
    {
      switch (this.ofAnimatedWater)
      {
      case 1: 
        return s + "Dynamic";
      case 2: 
        return s + "OFF";
      }
      return s + "ON";
    }
    if (par1EnumOptions == avh.a.ANIMATED_LAVA)
    {
      switch (this.ofAnimatedLava)
      {
      case 1: 
        return s + "Dynamic";
      case 2: 
        return s + "OFF";
      }
      return s + "ON";
    }
    if (par1EnumOptions == avh.a.ANIMATED_FIRE)
    {
      if (this.ofAnimatedFire) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_PORTAL)
    {
      if (this.ofAnimatedPortal) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_REDSTONE)
    {
      if (this.ofAnimatedRedstone) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_EXPLOSION)
    {
      if (this.ofAnimatedExplosion) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_FLAME)
    {
      if (this.ofAnimatedFlame) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_SMOKE)
    {
      if (this.ofAnimatedSmoke) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.VOID_PARTICLES)
    {
      if (this.ofVoidParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.WATER_PARTICLES)
    {
      if (this.ofWaterParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.PORTAL_PARTICLES)
    {
      if (this.ofPortalParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.POTION_PARTICLES)
    {
      if (this.ofPotionParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FIREWORK_PARTICLES)
    {
      if (this.ofFireworkParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.DRIPPING_WATER_LAVA)
    {
      if (this.ofDrippingWaterLava) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_TERRAIN)
    {
      if (this.ofAnimatedTerrain) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_TEXTURES)
    {
      if (this.ofAnimatedTextures) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.RAIN_SPLASH)
    {
      if (this.ofRainSplash) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.LAGOMETER)
    {
      if (this.ofLagometer) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SHOW_FPS)
    {
      if (this.ofShowFps) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.AUTOSAVE_TICKS)
    {
      if (this.ofAutoSaveTicks <= 40) {
        return s + "Default (2s)";
      }
      if (this.ofAutoSaveTicks <= 400) {
        return s + "20s";
      }
      if (this.ofAutoSaveTicks <= 4000) {
        return s + "3min";
      }
      return s + "30min";
    }
    if (par1EnumOptions == avh.a.BETTER_GRASS)
    {
      switch (this.ofBetterGrass)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CONNECTED_TEXTURES)
    {
      switch (this.ofConnectedTextures)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.WEATHER)
    {
      if (this.ofWeather) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SKY)
    {
      if (this.ofSky) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.STARS)
    {
      if (this.ofStars) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SUN_MOON)
    {
      if (this.ofSunMoon) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.VIGNETTE)
    {
      switch (this.ofVignette)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES) {
      return s + this.ofChunkUpdates;
    }
    if (par1EnumOptions == avh.a.CHUNK_LOADING)
    {
      if (this.ofChunkLoading == 1) {
        return s + "Smooth";
      }
      if (this.ofChunkLoading == 2) {
        return s + "Multi-Core";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES_DYNAMIC)
    {
      if (this.ofChunkUpdatesDynamic) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.TIME)
    {
      if (this.ofTime == 1) {
        return s + "Day Only";
      }
      if (this.ofTime == 3) {
        return s + "Night Only";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.CLEAR_WATER)
    {
      if (this.ofClearWater) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.AA_LEVEL)
    {
      String suffix = "";
      if (this.ofAaLevel != Config.getAntialiasingLevel()) {
        suffix = " (restart)";
      }
      if (this.ofAaLevel == 0) {
        return s + "OFF" + suffix;
      }
      return s + this.ofAaLevel + suffix;
    }
    if (par1EnumOptions == avh.a.AF_LEVEL)
    {
      if (this.ofAfLevel == 1) {
        return s + "OFF";
      }
      return s + this.ofAfLevel;
    }
    if (par1EnumOptions == avh.a.PROFILER)
    {
      if (this.ofProfiler) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.BETTER_SNOW)
    {
      if (this.ofBetterSnow) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SWAMP_COLORS)
    {
      if (this.ofSwampColors) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.RANDOM_MOBS)
    {
      if (this.ofRandomMobs) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SMOOTH_BIOMES)
    {
      if (this.ofSmoothBiomes) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_FONTS)
    {
      if (this.ofCustomFonts) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_COLORS)
    {
      if (this.ofCustomColors) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_SKY)
    {
      if (this.ofCustomSky) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SHOW_CAPES)
    {
      if (this.ofShowCapes) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_ITEMS)
    {
      if (this.ofCustomItems) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.NATURAL_TEXTURES)
    {
      if (this.ofNaturalTextures) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FAST_MATH)
    {
      if (this.ofFastMath) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FAST_RENDER)
    {
      if (this.ofFastRender) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.TRANSLUCENT_BLOCKS)
    {
      if (this.ofTranslucentBlocks == 1) {
        return s + "Fast";
      }
      if (this.ofTranslucentBlocks == 2) {
        return s + "Fancy";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.LAZY_CHUNK_LOADING)
    {
      if (this.ofLazyChunkLoading) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FULLSCREEN_MODE) {
      return s + this.ofFullscreenMode;
    }
    if (par1EnumOptions == avh.a.HELD_ITEM_TOOLTIPS)
    {
      if (this.D) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.i)
    {
      float var6 = a(par1EnumOptions);
      if (var6 == 0.0F) {
        return var2 + "VSync";
      }
      if (var6 == avh.a.a(par1EnumOptions)) {
        return var2 + bnq.a("options.framerateLimit.max", new Object[0]);
      }
      return var2 + (int)var6 + " fps";
    }
    return null;
  }
  
  public void loadOfOptions()
  {
    try
    {
      File ofReadFile = this.optionsFileOF;
      if (!ofReadFile.exists()) {
        ofReadFile = this.bb;
      }
      if (!ofReadFile.exists()) {
        return;
      }
      BufferedReader bufferedreader = new BufferedReader(new FileReader(ofReadFile));
      for (String s = ""; (s = bufferedreader.readLine()) != null;) {
        try
        {
          String[] as = s.split(":");
          if ((as[0].equals("ofRenderDistanceChunks")) && (as.length >= 2))
          {
            this.c = Integer.valueOf(as[1]).intValue();
            this.c = Config.limit(this.c, 2, 32);
          }
          if ((as[0].equals("ofFogType")) && (as.length >= 2))
          {
            this.ofFogType = Integer.valueOf(as[1]).intValue();
            this.ofFogType = Config.limit(this.ofFogType, 1, 3);
          }
          if ((as[0].equals("ofFogStart")) && (as.length >= 2))
          {
            this.ofFogStart = Float.valueOf(as[1]).floatValue();
            if (this.ofFogStart < 0.2F) {
              this.ofFogStart = 0.2F;
            }
            if (this.ofFogStart > 0.81F) {
              this.ofFogStart = 0.8F;
            }
          }
          if ((as[0].equals("ofMipmapType")) && (as.length >= 2))
          {
            this.ofMipmapType = Integer.valueOf(as[1]).intValue();
            this.ofMipmapType = Config.limit(this.ofMipmapType, 0, 3);
          }
          if ((as[0].equals("ofOcclusionFancy")) && (as.length >= 2)) {
            this.ofOcclusionFancy = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSmoothFps")) && (as.length >= 2)) {
            this.ofSmoothFps = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSmoothWorld")) && (as.length >= 2)) {
            this.ofSmoothWorld = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAoLevel")) && (as.length >= 2))
          {
            this.ofAoLevel = Float.valueOf(as[1]).floatValue();
            this.ofAoLevel = Config.limit(this.ofAoLevel, 0.0F, 1.0F);
          }
          if ((as[0].equals("ofClouds")) && (as.length >= 2))
          {
            this.ofClouds = Integer.valueOf(as[1]).intValue();
            this.ofClouds = Config.limit(this.ofClouds, 0, 3);
            
            updateRenderClouds();
          }
          if ((as[0].equals("ofCloudsHeight")) && (as.length >= 2))
          {
            this.ofCloudsHeight = Float.valueOf(as[1]).floatValue();
            this.ofCloudsHeight = Config.limit(this.ofCloudsHeight, 0.0F, 1.0F);
          }
          if ((as[0].equals("ofTrees")) && (as.length >= 2))
          {
            this.ofTrees = Integer.valueOf(as[1]).intValue();
            this.ofTrees = Config.limit(this.ofTrees, 0, 2);
          }
          if ((as[0].equals("ofDroppedItems")) && (as.length >= 2))
          {
            this.ofDroppedItems = Integer.valueOf(as[1]).intValue();
            this.ofDroppedItems = Config.limit(this.ofDroppedItems, 0, 2);
          }
          if ((as[0].equals("ofRain")) && (as.length >= 2))
          {
            this.ofRain = Integer.valueOf(as[1]).intValue();
            this.ofRain = Config.limit(this.ofRain, 0, 3);
          }
          if ((as[0].equals("ofAnimatedWater")) && (as.length >= 2))
          {
            this.ofAnimatedWater = Integer.valueOf(as[1]).intValue();
            this.ofAnimatedWater = Config.limit(this.ofAnimatedWater, 0, 2);
          }
          if ((as[0].equals("ofAnimatedLava")) && (as.length >= 2))
          {
            this.ofAnimatedLava = Integer.valueOf(as[1]).intValue();
            this.ofAnimatedLava = Config.limit(this.ofAnimatedLava, 0, 2);
          }
          if ((as[0].equals("ofAnimatedFire")) && (as.length >= 2)) {
            this.ofAnimatedFire = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedPortal")) && (as.length >= 2)) {
            this.ofAnimatedPortal = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedRedstone")) && (as.length >= 2)) {
            this.ofAnimatedRedstone = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedExplosion")) && (as.length >= 2)) {
            this.ofAnimatedExplosion = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedFlame")) && (as.length >= 2)) {
            this.ofAnimatedFlame = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedSmoke")) && (as.length >= 2)) {
            this.ofAnimatedSmoke = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofVoidParticles")) && (as.length >= 2)) {
            this.ofVoidParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofWaterParticles")) && (as.length >= 2)) {
            this.ofWaterParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofPortalParticles")) && (as.length >= 2)) {
            this.ofPortalParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofPotionParticles")) && (as.length >= 2)) {
            this.ofPotionParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofFireworkParticles")) && (as.length >= 2)) {
            this.ofFireworkParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofDrippingWaterLava")) && (as.length >= 2)) {
            this.ofDrippingWaterLava = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedTerrain")) && (as.length >= 2)) {
            this.ofAnimatedTerrain = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedTextures")) && (as.length >= 2)) {
            this.ofAnimatedTextures = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofRainSplash")) && (as.length >= 2)) {
            this.ofRainSplash = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofLagometer")) && (as.length >= 2)) {
            this.ofLagometer = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofShowFps")) && (as.length >= 2)) {
            this.ofShowFps = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAutoSaveTicks")) && (as.length >= 2))
          {
            this.ofAutoSaveTicks = Integer.valueOf(as[1]).intValue();
            this.ofAutoSaveTicks = Config.limit(this.ofAutoSaveTicks, 40, 40000);
          }
          if ((as[0].equals("ofBetterGrass")) && (as.length >= 2))
          {
            this.ofBetterGrass = Integer.valueOf(as[1]).intValue();
            this.ofBetterGrass = Config.limit(this.ofBetterGrass, 1, 3);
          }
          if ((as[0].equals("ofConnectedTextures")) && (as.length >= 2))
          {
            this.ofConnectedTextures = Integer.valueOf(as[1]).intValue();
            this.ofConnectedTextures = Config.limit(this.ofConnectedTextures, 1, 3);
          }
          if ((as[0].equals("ofWeather")) && (as.length >= 2)) {
            this.ofWeather = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSky")) && (as.length >= 2)) {
            this.ofSky = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofStars")) && (as.length >= 2)) {
            this.ofStars = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSunMoon")) && (as.length >= 2)) {
            this.ofSunMoon = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofVignette")) && (as.length >= 2))
          {
            this.ofVignette = Integer.valueOf(as[1]).intValue();
            this.ofVignette = Config.limit(this.ofVignette, 0, 2);
          }
          if ((as[0].equals("ofChunkUpdates")) && (as.length >= 2))
          {
            this.ofChunkUpdates = Integer.valueOf(as[1]).intValue();
            this.ofChunkUpdates = Config.limit(this.ofChunkUpdates, 1, 5);
          }
          if ((as[0].equals("ofChunkLoading")) && (as.length >= 2))
          {
            this.ofChunkLoading = Integer.valueOf(as[1]).intValue();
            this.ofChunkLoading = Config.limit(this.ofChunkLoading, 0, 2);
            
            updateChunkLoading();
          }
          if ((as[0].equals("ofChunkUpdatesDynamic")) && (as.length >= 2)) {
            this.ofChunkUpdatesDynamic = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofTime")) && (as.length >= 2))
          {
            this.ofTime = Integer.valueOf(as[1]).intValue();
            this.ofTime = Config.limit(this.ofTime, 0, 3);
          }
          if ((as[0].equals("ofClearWater")) && (as.length >= 2))
          {
            this.ofClearWater = Boolean.valueOf(as[1]).booleanValue();
            updateWaterOpacity();
          }
          if ((as[0].equals("ofAaLevel")) && (as.length >= 2))
          {
            this.ofAaLevel = Integer.valueOf(as[1]).intValue();
            this.ofAaLevel = Config.limit(this.ofAaLevel, 0, 16);
          }
          if ((as[0].equals("ofAfLevel")) && (as.length >= 2))
          {
            this.ofAfLevel = Integer.valueOf(as[1]).intValue();
            this.ofAfLevel = Config.limit(this.ofAfLevel, 1, 16);
          }
          if ((as[0].equals("ofProfiler")) && (as.length >= 2)) {
            this.ofProfiler = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofBetterSnow")) && (as.length >= 2)) {
            this.ofBetterSnow = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSwampColors")) && (as.length >= 2)) {
            this.ofSwampColors = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofRandomMobs")) && (as.length >= 2)) {
            this.ofRandomMobs = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSmoothBiomes")) && (as.length >= 2)) {
            this.ofSmoothBiomes = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomFonts")) && (as.length >= 2)) {
            this.ofCustomFonts = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomColors")) && (as.length >= 2)) {
            this.ofCustomColors = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomItems")) && (as.length >= 2)) {
            this.ofCustomItems = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomSky")) && (as.length >= 2)) {
            this.ofCustomSky = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofShowCapes")) && (as.length >= 2)) {
            this.ofShowCapes = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofNaturalTextures")) && (as.length >= 2)) {
            this.ofNaturalTextures = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofLazyChunkLoading")) && (as.length >= 2)) {
            this.ofLazyChunkLoading = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofFullscreenMode")) && (as.length >= 2)) {
            this.ofFullscreenMode = as[1];
          }
          if ((as[0].equals("ofFastMath")) && (as.length >= 2))
          {
            this.ofFastMath = Boolean.valueOf(as[1]).booleanValue();
            
            ns.fastMath = this.ofFastMath;
          }
          if ((as[0].equals("ofFastRender")) && (as.length >= 2)) {
            this.ofFastRender = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofTranslucentBlocks")) && (as.length >= 2))
          {
            this.ofTranslucentBlocks = Integer.valueOf(as[1]).intValue();
            this.ofTranslucentBlocks = Config.limit(this.ofTranslucentBlocks, 0, 2);
          }
          if (as[0].equals("key_" + this.ofKeyBindZoom.g())) {
            this.ofKeyBindZoom.b(Integer.parseInt(as[1]));
          }
        }
        catch (Exception exception1)
        {
          Config.dbg("Skipping bad option: " + s);
          exception1.printStackTrace();
        }
      }
      avb.b();
      bufferedreader.close();
    }
    catch (Exception exception)
    {
      Config.warn("Failed to load options");
      exception.printStackTrace();
    }
  }
  
  public void saveOfOptions()
  {
    try
    {
      PrintWriter printwriter = new PrintWriter(new FileWriter(this.optionsFileOF));
      
      printwriter.println("ofRenderDistanceChunks:" + this.c);
      
      printwriter.println("ofFogType:" + this.ofFogType);
      printwriter.println("ofFogStart:" + this.ofFogStart);
      
      printwriter.println("ofMipmapType:" + this.ofMipmapType);
      
      printwriter.println("ofOcclusionFancy:" + this.ofOcclusionFancy);
      printwriter.println("ofSmoothFps:" + this.ofSmoothFps);
      printwriter.println("ofSmoothWorld:" + this.ofSmoothWorld);
      printwriter.println("ofAoLevel:" + this.ofAoLevel);
      printwriter.println("ofClouds:" + this.ofClouds);
      printwriter.println("ofCloudsHeight:" + this.ofCloudsHeight);
      printwriter.println("ofTrees:" + this.ofTrees);
      
      printwriter.println("ofDroppedItems:" + this.ofDroppedItems);
      printwriter.println("ofRain:" + this.ofRain);
      
      printwriter.println("ofAnimatedWater:" + this.ofAnimatedWater);
      printwriter.println("ofAnimatedLava:" + this.ofAnimatedLava);
      printwriter.println("ofAnimatedFire:" + this.ofAnimatedFire);
      printwriter.println("ofAnimatedPortal:" + this.ofAnimatedPortal);
      printwriter.println("ofAnimatedRedstone:" + this.ofAnimatedRedstone);
      printwriter.println("ofAnimatedExplosion:" + this.ofAnimatedExplosion);
      printwriter.println("ofAnimatedFlame:" + this.ofAnimatedFlame);
      printwriter.println("ofAnimatedSmoke:" + this.ofAnimatedSmoke);
      printwriter.println("ofVoidParticles:" + this.ofVoidParticles);
      printwriter.println("ofWaterParticles:" + this.ofWaterParticles);
      printwriter.println("ofPortalParticles:" + this.ofPortalParticles);
      printwriter.println("ofPotionParticles:" + this.ofPotionParticles);
      printwriter.println("ofFireworkParticles:" + this.ofFireworkParticles);
      printwriter.println("ofDrippingWaterLava:" + this.ofDrippingWaterLava);
      printwriter.println("ofAnimatedTerrain:" + this.ofAnimatedTerrain);
      printwriter.println("ofAnimatedTextures:" + this.ofAnimatedTextures);
      
      printwriter.println("ofRainSplash:" + this.ofRainSplash);
      printwriter.println("ofLagometer:" + this.ofLagometer);
      printwriter.println("ofShowFps:" + this.ofShowFps);
      printwriter.println("ofAutoSaveTicks:" + this.ofAutoSaveTicks);
      printwriter.println("ofBetterGrass:" + this.ofBetterGrass);
      printwriter.println("ofConnectedTextures:" + this.ofConnectedTextures);
      printwriter.println("ofWeather:" + this.ofWeather);
      printwriter.println("ofSky:" + this.ofSky);
      printwriter.println("ofStars:" + this.ofStars);
      printwriter.println("ofSunMoon:" + this.ofSunMoon);
      printwriter.println("ofVignette:" + this.ofVignette);
      printwriter.println("ofChunkUpdates:" + this.ofChunkUpdates);
      printwriter.println("ofChunkLoading:" + this.ofChunkLoading);
      printwriter.println("ofChunkUpdatesDynamic:" + this.ofChunkUpdatesDynamic);
      printwriter.println("ofTime:" + this.ofTime);
      printwriter.println("ofClearWater:" + this.ofClearWater);
      
      printwriter.println("ofAaLevel:" + this.ofAaLevel);
      printwriter.println("ofAfLevel:" + this.ofAfLevel);
      printwriter.println("ofProfiler:" + this.ofProfiler);
      printwriter.println("ofBetterSnow:" + this.ofBetterSnow);
      printwriter.println("ofSwampColors:" + this.ofSwampColors);
      printwriter.println("ofRandomMobs:" + this.ofRandomMobs);
      printwriter.println("ofSmoothBiomes:" + this.ofSmoothBiomes);
      printwriter.println("ofCustomFonts:" + this.ofCustomFonts);
      printwriter.println("ofCustomColors:" + this.ofCustomColors);
      printwriter.println("ofCustomItems:" + this.ofCustomItems);
      printwriter.println("ofCustomSky:" + this.ofCustomSky);
      printwriter.println("ofShowCapes:" + this.ofShowCapes);
      printwriter.println("ofNaturalTextures:" + this.ofNaturalTextures);
      printwriter.println("ofLazyChunkLoading:" + this.ofLazyChunkLoading);
      printwriter.println("ofFullscreenMode:" + this.ofFullscreenMode);
      printwriter.println("ofFastMath:" + this.ofFastMath);
      printwriter.println("ofFastRender:" + this.ofFastRender);
      printwriter.println("ofTranslucentBlocks:" + this.ofTranslucentBlocks);
      
      printwriter.println("key_" + this.ofKeyBindZoom.g() + ":" + this.ofKeyBindZoom.i());
      
      printwriter.close();
    }
    catch (Exception exception)
    {
      Config.warn("Failed to save options");
      exception.printStackTrace();
    }
  }
  
  private void updateRenderClouds()
  {
    switch (this.ofClouds)
    {
    case 3: 
      this.h = 0;
      break;
    case 1: 
      this.h = 1;
      break;
    case 2: 
      this.h = 2;
      break;
    default: 
      if (this.i) {
        this.h = 2;
      } else {
        this.h = 1;
      }
      break;
    }
  }
  
  public void resetSettings()
  {
    this.c = 8;
    this.d = true;
    this.e = false;
    this.g = ((int)avh.a.i.f());
    
    this.t = false;
    updateVSync();
    
    this.J = 4;
    
    this.i = true;
    this.j = 2;
    this.h = 2;
    this.aH = 70.0F;
    this.aI = 0.0F;
    this.aK = 0;
    this.aL = 0;
    this.D = true;
    this.u = false;
    this.v = true;
    this.aN = false;
    
    this.ofFogType = 1;
    this.ofFogStart = 0.8F;
    
    this.ofMipmapType = 0;
    
    this.ofOcclusionFancy = false;
    this.ofSmoothFps = false;
    
    Config.updateAvailableProcessors();
    this.ofSmoothWorld = Config.isSingleProcessor();
    this.ofLazyChunkLoading = Config.isSingleProcessor();
    
    this.ofFastMath = false;
    this.ofFastRender = false;
    
    this.ofTranslucentBlocks = 0;
    
    this.ofAoLevel = 1.0F;
    
    this.ofAaLevel = 0;
    this.ofAfLevel = 1;
    
    this.ofClouds = 0;
    this.ofCloudsHeight = 0.0F;
    this.ofTrees = 0;
    
    this.ofRain = 0;
    
    this.ofBetterGrass = 3;
    this.ofAutoSaveTicks = 4000;
    this.ofLagometer = false;
    this.ofShowFps = false;
    this.ofProfiler = false;
    this.ofWeather = true;
    this.ofSky = true;
    this.ofStars = true;
    this.ofSunMoon = true;
    this.ofVignette = 0;
    this.ofChunkUpdates = 1;
    this.ofChunkLoading = 0;
    this.ofChunkUpdatesDynamic = false;
    this.ofTime = 0;
    this.ofClearWater = false;
    
    this.ofBetterSnow = false;
    this.ofFullscreenMode = "Default";
    this.ofSwampColors = true;
    this.ofRandomMobs = true;
    this.ofSmoothBiomes = true;
    this.ofCustomFonts = true;
    this.ofCustomColors = true;
    this.ofCustomItems = true;
    this.ofCustomSky = true;
    this.ofShowCapes = true;
    this.ofConnectedTextures = 2;
    this.ofNaturalTextures = false;
    
    this.ofAnimatedWater = 0;
    this.ofAnimatedLava = 0;
    this.ofAnimatedFire = true;
    this.ofAnimatedPortal = true;
    this.ofAnimatedRedstone = true;
    this.ofAnimatedExplosion = true;
    this.ofAnimatedFlame = true;
    this.ofAnimatedSmoke = true;
    this.ofVoidParticles = true;
    this.ofWaterParticles = true;
    this.ofRainSplash = true;
    this.ofPortalParticles = true;
    this.ofPotionParticles = true;
    this.ofFireworkParticles = true;
    this.ofDrippingWaterLava = true;
    this.ofAnimatedTerrain = true;
    
    this.ofAnimatedTextures = true;
    
    Shaders.setShaderPack(Shaders.packNameNone);
    Shaders.configAntialiasingLevel = 0;
    Shaders.uninit();
    Shaders.storeConfig();
    
    updateWaterOpacity();
    
    this.ax.e();
    
    b();
  }
  
  public void updateVSync()
  {
    Display.setVSyncEnabled(this.t);
  }
  
  private void updateWaterOpacity()
  {
    if ((this.ax.E()) && (this.ax.G() != null)) {
      Config.waterOpacityChanged = true;
    }
    ClearWater.updateWaterOpacity(this, this.ax.f);
  }
  
  public void updateChunkLoading()
  {
    if (this.ax.g != null) {
      this.ax.g.a();
    }
  }
  
  public void setAllAnimations(boolean flag)
  {
    int animVal = flag ? 0 : 2;
    
    this.ofAnimatedWater = animVal;
    this.ofAnimatedLava = animVal;
    this.ofAnimatedFire = flag;
    this.ofAnimatedPortal = flag;
    this.ofAnimatedRedstone = flag;
    this.ofAnimatedExplosion = flag;
    this.ofAnimatedFlame = flag;
    this.ofAnimatedSmoke = flag;
    this.ofVoidParticles = flag;
    this.ofWaterParticles = flag;
    this.ofRainSplash = flag;
    this.ofPortalParticles = flag;
    this.ofPotionParticles = flag;
    this.ofFireworkParticles = flag;
    this.aL = (flag ? 0 : 2);
    this.ofDrippingWaterLava = flag;
    this.ofAnimatedTerrain = flag;
    
    this.ofAnimatedTextures = flag;
  }
  
  public static enum a
  {
    private final boolean S;
    private final boolean T;
    private final String U;
    private final float V;
    private float W;
    private float X;
    private static final a[] Y = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R };
    private static final String __OBFID = "CL_00000653";
    
    public static a a(int p_74379_0_)
    {
      a[] var1 = values();
      int var2 = var1.length;
      for (int var3 = 0; var3 < var2; var3++)
      {
        a var4 = var1[var3];
        if (var4.c() == p_74379_0_) {
          return var4;
        }
      }
      return null;
    }
    
    private a(String p_i1015_1_, int p_i1015_2_, String p_i1015_3_, boolean p_i1015_4_, boolean p_i1015_5_)
    {
      this(p_i1015_1_, p_i1015_2_, p_i1015_3_, p_i1015_4_, p_i1015_5_, 0.0F, 1.0F, 0.0F);
    }
    
    private a(String p_i45004_1_, int p_i45004_2_, String p_i45004_3_, boolean p_i45004_4_, boolean p_i45004_5_, float p_i45004_6_, float p_i45004_7_, float p_i45004_8_)
    {
      this.U = p_i45004_3_;
      this.S = p_i45004_4_;
      this.T = p_i45004_5_;
      this.W = p_i45004_6_;
      this.X = p_i45004_7_;
      this.V = p_i45004_8_;
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
    
    public void a(float p_148263_1_)
    {
      this.X = p_148263_1_;
    }
    
    public float c(float p_148266_1_)
    {
      return ns.a((e(p_148266_1_) - this.W) / (this.X - this.W), 0.0F, 1.0F);
    }
    
    public float d(float p_148262_1_)
    {
      return e(this.W + (this.X - this.W) * ns.a(p_148262_1_, 0.0F, 1.0F));
    }
    
    public float e(float p_148268_1_)
    {
      p_148268_1_ = f(p_148268_1_);
      return ns.a(p_148268_1_, this.W, this.X);
    }
    
    protected float f(float p_148264_1_)
    {
      if (this.V > 0.0F) {
        p_148264_1_ = this.V * Math.round(p_148264_1_ / this.V);
      }
      return p_148264_1_;
    }
  }
}
