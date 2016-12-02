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
    m = wn.b.a;
    n = true;
    o = true;
    p = true;
    q = 1.0F;
    r = true;
    t = true;
    u = false;
    v = true;
    w = false;
    z = true;
    aZ = Sets.newHashSet(wo.values());
    D = true;
    E = 1.0F;
    F = 1.0F;
    G = 0.44366196F;
    H = 1.0F;
    I = true;
    J = 4;
    ba = Maps.newEnumMap(bpg.class);
    K = 0.5F;
    L = 1.0F;
    M = 1.0F;
    N = 0.5412844F;
    O = 0.31690142F;
    P = 1;
    Q = true;
    R = "";
    S = 0;
    T = 0;
    U = 0;
    V = true;
    W = true;
    X = new avb("key.forward", 17, "key.categories.movement");
    Y = new avb("key.left", 30, "key.categories.movement");
    Z = new avb("key.back", 31, "key.categories.movement");
    aa = new avb("key.right", 32, "key.categories.movement");
    ab = new avb("key.jump", 57, "key.categories.movement");
    ac = new avb("key.sneak", 42, "key.categories.movement");
    ad = new avb("key.sprint", 29, "key.categories.movement");
    ae = new avb("key.inventory", 18, "key.categories.inventory");
    af = new avb("key.use", -99, "key.categories.gameplay");
    ag = new avb("key.drop", 16, "key.categories.gameplay");
    ah = new avb("key.attack", -100, "key.categories.gameplay");
    ai = new avb("key.pickItem", -98, "key.categories.gameplay");
    aj = new avb("key.chat", 20, "key.categories.multiplayer");
    ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
    al = new avb("key.command", 53, "key.categories.multiplayer");
    am = new avb("key.screenshot", 60, "key.categories.misc");
    an = new avb("key.togglePerspective", 63, "key.categories.misc");
    ao = new avb("key.smoothCamera", 0, "key.categories.misc");
    ap = new avb("key.fullscreen", 87, "key.categories.misc");
    aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
    ar = new avb("key.streamStartStop", 64, "key.categories.stream");
    as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
    at = new avb("key.streamCommercial", 0, "key.categories.stream");
    au = new avb("key.streamToggleMic", 0, "key.categories.stream");
    av = new avb[] { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
    aw = ((avb[])ArrayUtils.addAll(new avb[] { ah, af, X, Y, Z, aa, ab, ac, ad, ag, ae, aj, ak, ai, al, am, an, ao, ar, as, at, au, ap, aq }, av));
    ay = oj.c;
    aE = "";
    aH = 70.0F;
    aM = "en_US";
    aN = false;
    ax = mcIn;
    bb = new File(p_i46326_2_, "options.txt");
    
    optionsFileOF = new File(p_i46326_2_, "optionsof.txt");
    
    g = ((int)avh.a.i.f());
    
    ofKeyBindZoom = new avb("Zoom", 46, "key.categories.misc");
    aw = ((avb[])ArrayUtils.add(aw, ofKeyBindZoom));
    
    avh.a.f.a(32.0F);
    
    c = 8;
    a();
    
    Config.initGameSettings(this);
  }
  
  public avh()
  {
    m = wn.b.a;
    n = true;
    o = true;
    p = true;
    q = 1.0F;
    r = true;
    t = true;
    u = false;
    v = true;
    w = false;
    z = true;
    aZ = Sets.newHashSet(wo.values());
    D = true;
    E = 1.0F;
    F = 1.0F;
    G = 0.44366196F;
    H = 1.0F;
    I = true;
    J = 4;
    ba = Maps.newEnumMap(bpg.class);
    K = 0.5F;
    L = 1.0F;
    M = 1.0F;
    N = 0.5412844F;
    O = 0.31690142F;
    P = 1;
    Q = true;
    R = "";
    S = 0;
    T = 0;
    U = 0;
    V = true;
    W = true;
    X = new avb("key.forward", 17, "key.categories.movement");
    Y = new avb("key.left", 30, "key.categories.movement");
    Z = new avb("key.back", 31, "key.categories.movement");
    aa = new avb("key.right", 32, "key.categories.movement");
    ab = new avb("key.jump", 57, "key.categories.movement");
    ac = new avb("key.sneak", 42, "key.categories.movement");
    ad = new avb("key.sprint", 29, "key.categories.movement");
    ae = new avb("key.inventory", 18, "key.categories.inventory");
    af = new avb("key.use", -99, "key.categories.gameplay");
    ag = new avb("key.drop", 16, "key.categories.gameplay");
    ah = new avb("key.attack", -100, "key.categories.gameplay");
    ai = new avb("key.pickItem", -98, "key.categories.gameplay");
    aj = new avb("key.chat", 20, "key.categories.multiplayer");
    ak = new avb("key.playerlist", 15, "key.categories.multiplayer");
    al = new avb("key.command", 53, "key.categories.multiplayer");
    am = new avb("key.screenshot", 60, "key.categories.misc");
    an = new avb("key.togglePerspective", 63, "key.categories.misc");
    ao = new avb("key.smoothCamera", 0, "key.categories.misc");
    ap = new avb("key.fullscreen", 87, "key.categories.misc");
    aq = new avb("key.spectatorOutlines", 0, "key.categories.misc");
    ar = new avb("key.streamStartStop", 64, "key.categories.stream");
    as = new avb("key.streamPauseUnpause", 65, "key.categories.stream");
    at = new avb("key.streamCommercial", 0, "key.categories.stream");
    au = new avb("key.streamToggleMic", 0, "key.categories.stream");
    av = new avb[] { new avb("key.hotbar.1", 2, "key.categories.inventory"), new avb("key.hotbar.2", 3, "key.categories.inventory"), new avb("key.hotbar.3", 4, "key.categories.inventory"), new avb("key.hotbar.4", 5, "key.categories.inventory"), new avb("key.hotbar.5", 6, "key.categories.inventory"), new avb("key.hotbar.6", 7, "key.categories.inventory"), new avb("key.hotbar.7", 8, "key.categories.inventory"), new avb("key.hotbar.8", 9, "key.categories.inventory"), new avb("key.hotbar.9", 10, "key.categories.inventory") };
    aw = ((avb[])ArrayUtils.addAll(new avb[] { ah, af, X, Y, Z, aa, ab, ac, ad, ag, ae, aj, ak, ai, al, am, an, ao, ar, as, at, au, ap, aq }, av));
    ay = oj.c;
    aE = "";
    aH = 70.0F;
    aM = "en_US";
    aN = false;
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
      a = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.c) {
      aH = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.d) {
      aI = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.i)
    {
      g = ((int)p_74304_2_);
      
      t = false;
      if (g <= 0)
      {
        g = ((int)avh.a.i.f());
        t = true;
      }
      updateVSync();
    }
    if (p_74304_1_ == avh.a.s)
    {
      q = p_74304_2_;
      ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.B)
    {
      H = p_74304_2_;
      ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.C)
    {
      G = p_74304_2_;
      ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.A)
    {
      F = p_74304_2_;
      ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.z)
    {
      E = p_74304_2_;
      ax.q.d().b();
    }
    if (p_74304_1_ == avh.a.D)
    {
      int var3 = J;
      J = ((int)p_74304_2_);
      if (var3 != p_74304_2_)
      {
        ax.T().a(J);
        ax.P().a(bmh.g);
        ax.T().a(false, J > 0);
        ax.B();
      }
    }
    if (p_74304_1_ == avh.a.P)
    {
      v = (!v);
      ax.g.a();
    }
    if (p_74304_1_ == avh.a.f)
    {
      c = ((int)p_74304_2_);
      ax.g.m();
    }
    if (p_74304_1_ == avh.a.F) {
      K = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.G)
    {
      L = p_74304_2_;
      ax.Y().p();
    }
    if (p_74304_1_ == avh.a.H)
    {
      M = p_74304_2_;
      ax.Y().p();
    }
    if (p_74304_1_ == avh.a.I) {
      N = p_74304_2_;
    }
    if (p_74304_1_ == avh.a.J) {
      O = p_74304_2_;
    }
  }
  
  public void a(avh.a p_74306_1_, int p_74306_2_)
  {
    setOptionValueOF(p_74306_1_, p_74306_2_);
    if (p_74306_1_ == avh.a.a) {
      b = (!b);
    }
    if (p_74306_1_ == avh.a.n) {
      aK = (aK + p_74306_2_ & 0x3);
    }
    if (p_74306_1_ == avh.a.o) {
      aL = ((aL + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.g) {
      d = (!d);
    }
    if (p_74306_1_ == avh.a.k) {
      h = ((h + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.E)
    {
      aN = (!aN);
      ax.k.a((ax.S().a()) || (aN));
    }
    if (p_74306_1_ == avh.a.j) {
      f = (!f);
    }
    if (p_74306_1_ == avh.a.h)
    {
      e = (!e);
      ax.e();
    }
    if (p_74306_1_ == avh.a.l)
    {
      i = (!i);
      
      updateRenderClouds();
      
      ax.g.a();
    }
    if (p_74306_1_ == avh.a.m)
    {
      j = ((j + p_74306_2_) % 3);
      ax.g.a();
    }
    if (p_74306_1_ == avh.a.p) {
      m = wn.b.a((m.a() + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.K) {
      P = ((P + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.L) {
      Q = (!Q);
    }
    if (p_74306_1_ == avh.a.M) {
      S = ((S + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.N) {
      T = ((T + p_74306_2_) % 3);
    }
    if (p_74306_1_ == avh.a.O) {
      U = ((U + p_74306_2_) % 2);
    }
    if (p_74306_1_ == avh.a.q) {
      n = (!n);
    }
    if (p_74306_1_ == avh.a.r) {
      o = (!o);
    }
    if (p_74306_1_ == avh.a.t) {
      p = (!p);
    }
    if (p_74306_1_ == avh.a.u) {
      r = (!r);
    }
    if (p_74306_1_ == avh.a.y) {
      A = (!A);
    }
    if (p_74306_1_ == avh.a.v)
    {
      s = (!s);
      if (ax.K() != s) {
        ax.q();
      }
    }
    if (p_74306_1_ == avh.a.w)
    {
      t = (!t);
      Display.setVSyncEnabled(t);
    }
    if (p_74306_1_ == avh.a.x)
    {
      u = (!u);
      ax.g.a();
    }
    if (p_74306_1_ == avh.a.P)
    {
      v = (!v);
      ax.g.a();
    }
    if (p_74306_1_ == avh.a.Q) {
      w = (!w);
    }
    if (p_74306_1_ == avh.a.R) {
      W = (!W);
    }
    b();
  }
  
  public float a(avh.a p_74296_1_)
  {
    if (p_74296_1_ == avh.a.CLOUD_HEIGHT) {
      return ofCloudsHeight;
    }
    if (p_74296_1_ == avh.a.AO_LEVEL) {
      return ofAoLevel;
    }
    if (p_74296_1_ == avh.a.AA_LEVEL) {
      return ofAaLevel;
    }
    if (p_74296_1_ == avh.a.AF_LEVEL) {
      return ofAfLevel;
    }
    if (p_74296_1_ == avh.a.MIPMAP_TYPE) {
      return ofMipmapType;
    }
    if (p_74296_1_ == avh.a.i)
    {
      if ((g == avh.a.i.f()) && (t)) {
        return 0.0F;
      }
      return g;
    }
    return p_74296_1_ == avh.a.J ? O : p_74296_1_ == avh.a.I ? N : p_74296_1_ == avh.a.H ? M : p_74296_1_ == avh.a.G ? L : p_74296_1_ == avh.a.F ? K : p_74296_1_ == avh.a.f ? c : p_74296_1_ == avh.a.D ? J : p_74296_1_ == avh.a.i ? g : p_74296_1_ == avh.a.A ? F : p_74296_1_ == avh.a.z ? E : p_74296_1_ == avh.a.C ? G : p_74296_1_ == avh.a.B ? H : p_74296_1_ == avh.a.s ? q : p_74296_1_ == avh.a.b ? a : p_74296_1_ == avh.a.e ? aJ : p_74296_1_ == avh.a.d ? aI : p_74296_1_ == avh.a.c ? aH : 0.0F;
  }
  
  public boolean b(avh.a p_74308_1_)
  {
    switch (avh.2.a[p_74308_1_.ordinal()])
    {
    case 1: 
      return b;
    case 2: 
      return d;
    case 3: 
      return e;
    case 4: 
      return f;
    case 5: 
      return n;
    case 6: 
      return o;
    case 7: 
      return p;
    case 8: 
      return r;
    case 9: 
      return s;
    case 10: 
      return t;
    case 11: 
      return u;
    case 12: 
      return A;
    case 13: 
      return Q;
    case 14: 
      return aN;
    case 15: 
      return v;
    case 16: 
      return w;
    case 17: 
      return W;
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
      return var2 + a(aR, aK);
    }
    if (p_74297_1_ == avh.a.p) {
      return var2 + bnq.a(m.b(), new Object[0]);
    }
    if (p_74297_1_ == avh.a.o) {
      return var2 + a(aS, aL);
    }
    if (p_74297_1_ == avh.a.m) {
      return var2 + a(aT, j);
    }
    if (p_74297_1_ == avh.a.K) {
      return var2 + a(aU, P);
    }
    if (p_74297_1_ == avh.a.M) {
      return var2 + a(aV, S);
    }
    if (p_74297_1_ == avh.a.N) {
      return var2 + a(aW, T);
    }
    if (p_74297_1_ == avh.a.O) {
      return var2 + a(aX, U);
    }
    if (p_74297_1_ == avh.a.k) {
      return var2 + a(aY, h);
    }
    if (p_74297_1_ == avh.a.l)
    {
      if (i) {
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
      if (!bb.exists()) {
        return;
      }
      BufferedReader var1 = new BufferedReader(new FileReader(bb));
      String var2 = "";
      ba.clear();
      while ((var2 = var1.readLine()) != null) {
        try
        {
          String[] var3 = var2.split(":");
          if (var3[0].equals("mouseSensitivity")) {
            a = a(var3[1]);
          }
          if (var3[0].equals("fov")) {
            aH = (a(var3[1]) * 40.0F + 70.0F);
          }
          if (var3[0].equals("gamma")) {
            aI = a(var3[1]);
          }
          if (var3[0].equals("saturation")) {
            aJ = a(var3[1]);
          }
          if (var3[0].equals("invertYMouse")) {
            b = var3[1].equals("true");
          }
          if (var3[0].equals("renderDistance")) {
            c = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("guiScale")) {
            aK = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("particles")) {
            aL = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("bobView")) {
            d = var3[1].equals("true");
          }
          if (var3[0].equals("anaglyph3d")) {
            e = var3[1].equals("true");
          }
          if (var3[0].equals("maxFps"))
          {
            g = Integer.parseInt(var3[1]);
            
            t = false;
            if (g <= 0)
            {
              g = ((int)avh.a.i.f());
              t = true;
            }
            updateVSync();
          }
          if (var3[0].equals("fboEnable")) {
            f = var3[1].equals("true");
          }
          if (var3[0].equals("difficulty")) {
            ay = oj.a(Integer.parseInt(var3[1]));
          }
          if (var3[0].equals("fancyGraphics"))
          {
            i = var3[1].equals("true");
            
            updateRenderClouds();
          }
          if (var3[0].equals("ao")) {
            if (var3[1].equals("true")) {
              j = 2;
            } else if (var3[1].equals("false")) {
              j = 0;
            } else {
              j = Integer.parseInt(var3[1]);
            }
          }
          if (var3[0].equals("renderClouds")) {
            if (var3[1].equals("true")) {
              h = 2;
            } else if (var3[1].equals("false")) {
              h = 0;
            } else if (var3[1].equals("fast")) {
              h = 1;
            }
          }
          if (var3[0].equals("resourcePacks"))
          {
            k = ((List)aP.fromJson(var2.substring(var2.indexOf(':') + 1), aQ));
            if (k == null) {
              k = Lists.newArrayList();
            }
          }
          if (var3[0].equals("incompatibleResourcePacks"))
          {
            l = ((List)aP.fromJson(var2.substring(var2.indexOf(':') + 1), aQ));
            if (l == null) {
              l = Lists.newArrayList();
            }
          }
          if ((var3[0].equals("lastServer")) && (var3.length >= 2)) {
            aE = var2.substring(var2.indexOf(':') + 1);
          }
          if ((var3[0].equals("lang")) && (var3.length >= 2)) {
            aM = var3[1];
          }
          if (var3[0].equals("chatVisibility")) {
            m = wn.b.a(Integer.parseInt(var3[1]));
          }
          if (var3[0].equals("chatColors")) {
            n = var3[1].equals("true");
          }
          if (var3[0].equals("chatLinks")) {
            o = var3[1].equals("true");
          }
          if (var3[0].equals("chatLinksPrompt")) {
            p = var3[1].equals("true");
          }
          if (var3[0].equals("chatOpacity")) {
            q = a(var3[1]);
          }
          if (var3[0].equals("snooperEnabled")) {
            r = var3[1].equals("true");
          }
          if (var3[0].equals("fullscreen")) {
            s = var3[1].equals("true");
          }
          if (var3[0].equals("enableVsync"))
          {
            t = var3[1].equals("true");
            
            updateVSync();
          }
          if (var3[0].equals("useVbo")) {
            u = var3[1].equals("true");
          }
          if (var3[0].equals("hideServerAddress")) {
            x = var3[1].equals("true");
          }
          if (var3[0].equals("advancedItemTooltips")) {
            y = var3[1].equals("true");
          }
          if (var3[0].equals("pauseOnLostFocus")) {
            z = var3[1].equals("true");
          }
          if (var3[0].equals("touchscreen")) {
            A = var3[1].equals("true");
          }
          if (var3[0].equals("overrideHeight")) {
            C = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("overrideWidth")) {
            B = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("heldItemTooltips")) {
            D = var3[1].equals("true");
          }
          if (var3[0].equals("chatHeightFocused")) {
            H = a(var3[1]);
          }
          if (var3[0].equals("chatHeightUnfocused")) {
            G = a(var3[1]);
          }
          if (var3[0].equals("chatScale")) {
            E = a(var3[1]);
          }
          if (var3[0].equals("chatWidth")) {
            F = a(var3[1]);
          }
          if (var3[0].equals("showInventoryAchievementHint")) {
            I = var3[1].equals("true");
          }
          if (var3[0].equals("mipmapLevels")) {
            J = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamBytesPerPixel")) {
            K = a(var3[1]);
          }
          if (var3[0].equals("streamMicVolume")) {
            L = a(var3[1]);
          }
          if (var3[0].equals("streamSystemVolume")) {
            M = a(var3[1]);
          }
          if (var3[0].equals("streamKbps")) {
            N = a(var3[1]);
          }
          if (var3[0].equals("streamFps")) {
            O = a(var3[1]);
          }
          if (var3[0].equals("streamCompression")) {
            P = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamSendMetadata")) {
            Q = var3[1].equals("true");
          }
          if ((var3[0].equals("streamPreferredServer")) && (var3.length >= 2)) {
            R = var2.substring(var2.indexOf(':') + 1);
          }
          if (var3[0].equals("streamChatEnabled")) {
            S = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamChatUserFilter")) {
            T = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("streamMicToggleBehavior")) {
            U = Integer.parseInt(var3[1]);
          }
          if (var3[0].equals("forceUnicodeFont")) {
            aN = var3[1].equals("true");
          }
          if (var3[0].equals("allowBlockAlternatives")) {
            v = var3[1].equals("true");
          }
          if (var3[0].equals("reducedDebugInfo")) {
            w = var3[1].equals("true");
          }
          if (var3[0].equals("useNativeTransport")) {
            V = var3[1].equals("true");
          }
          if (var3[0].equals("entityShadows")) {
            W = var3[1].equals("true");
          }
          avb[] var4 = aw;
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
              ba.put(var12, Float.valueOf(a(var3[1])));
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
      PrintWriter var1 = new PrintWriter(new FileWriter(bb));
      var1.println("invertYMouse:" + b);
      var1.println("mouseSensitivity:" + a);
      var1.println("fov:" + (aH - 70.0F) / 40.0F);
      var1.println("gamma:" + aI);
      var1.println("saturation:" + aJ);
      var1.println("renderDistance:" + c);
      var1.println("guiScale:" + aK);
      var1.println("particles:" + aL);
      var1.println("bobView:" + d);
      var1.println("anaglyph3d:" + e);
      var1.println("maxFps:" + g);
      var1.println("fboEnable:" + f);
      var1.println("difficulty:" + ay.a());
      var1.println("fancyGraphics:" + i);
      var1.println("ao:" + j);
      switch (h)
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
      var1.println("resourcePacks:" + aP.toJson(k));
      var1.println("incompatibleResourcePacks:" + aP.toJson(l));
      var1.println("lastServer:" + aE);
      var1.println("lang:" + aM);
      var1.println("chatVisibility:" + m.a());
      var1.println("chatColors:" + n);
      var1.println("chatLinks:" + o);
      var1.println("chatLinksPrompt:" + p);
      var1.println("chatOpacity:" + q);
      var1.println("snooperEnabled:" + r);
      var1.println("fullscreen:" + s);
      var1.println("enableVsync:" + t);
      var1.println("useVbo:" + u);
      var1.println("hideServerAddress:" + x);
      var1.println("advancedItemTooltips:" + y);
      var1.println("pauseOnLostFocus:" + z);
      var1.println("touchscreen:" + A);
      var1.println("overrideWidth:" + B);
      var1.println("overrideHeight:" + C);
      var1.println("heldItemTooltips:" + D);
      var1.println("chatHeightFocused:" + H);
      var1.println("chatHeightUnfocused:" + G);
      var1.println("chatScale:" + E);
      var1.println("chatWidth:" + F);
      var1.println("showInventoryAchievementHint:" + I);
      var1.println("mipmapLevels:" + J);
      var1.println("streamBytesPerPixel:" + K);
      var1.println("streamMicVolume:" + L);
      var1.println("streamSystemVolume:" + M);
      var1.println("streamKbps:" + N);
      var1.println("streamFps:" + O);
      var1.println("streamCompression:" + P);
      var1.println("streamSendMetadata:" + Q);
      var1.println("streamPreferredServer:" + R);
      var1.println("streamChatEnabled:" + S);
      var1.println("streamChatUserFilter:" + T);
      var1.println("streamMicToggleBehavior:" + U);
      var1.println("forceUnicodeFont:" + aN);
      var1.println("allowBlockAlternatives:" + v);
      var1.println("reducedDebugInfo:" + w);
      var1.println("useNativeTransport:" + V);
      var1.println("entityShadows:" + W);
      avb[] var2 = aw;
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
        var1.println("modelPart_" + var10.c() + ":" + aZ.contains(var10));
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
    return ba.containsKey(p_151438_1_) ? ((Float)ba.get(p_151438_1_)).floatValue() : 1.0F;
  }
  
  public void a(bpg p_151439_1_, float p_151439_2_)
  {
    ax.W().a(p_151439_1_, p_151439_2_);
    ba.put(p_151439_1_, Float.valueOf(p_151439_2_));
  }
  
  public void c()
  {
    if (ax.h != null)
    {
      int var1 = 0;
      wo var3;
      for (Iterator var2 = aZ.iterator(); var2.hasNext(); var1 |= var3.a()) {
        var3 = (wo)var2.next();
      }
      ax.h.a.a(new ih(aM, c, m, n, var1));
    }
  }
  
  public Set d()
  {
    return ImmutableSet.copyOf(aZ);
  }
  
  public void a(wo p_178878_1_, boolean p_178878_2_)
  {
    if (p_178878_2_) {
      aZ.add(p_178878_1_);
    } else {
      aZ.remove(p_178878_1_);
    }
    c();
  }
  
  public void a(wo p_178877_1_)
  {
    if (!d().contains(p_178877_1_)) {
      aZ.add(p_178877_1_);
    } else {
      aZ.remove(p_178877_1_);
    }
    c();
  }
  
  public int e()
  {
    return c >= 4 ? h : 0;
  }
  
  public boolean f()
  {
    return V;
  }
  
  private void setOptionFloatValueOF(avh.a option, float val)
  {
    if (option == avh.a.CLOUD_HEIGHT)
    {
      ofCloudsHeight = val;
      
      ax.g.resetClouds();
    }
    if (option == avh.a.AO_LEVEL)
    {
      ofAoLevel = val;
      ax.g.a();
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
      ofAaLevel = 0;
      for (int l = 0; l < aaLevels.length; l++) {
        if (valInt >= aaLevels[l]) {
          ofAaLevel = aaLevels[l];
        }
      }
      ofAaLevel = Config.limit(ofAaLevel, 0, 16);
    }
    if (option == avh.a.AF_LEVEL)
    {
      int valInt = (int)val;
      if ((valInt > 1) && (Config.isShaders()))
      {
        Config.showGuiMessage("Anisotropic Filtering is not compatible with Shaders.", "Please disable Shaders to enable this option.");
        return;
      }
      ofAfLevel = 1;
      while (ofAfLevel * 2 <= valInt) {
        ofAfLevel *= 2;
      }
      ofAfLevel = Config.limit(ofAfLevel, 1, 16);
      
      ax.e();
    }
    if (option == avh.a.MIPMAP_TYPE)
    {
      int valInt = (int)val;
      ofMipmapType = Config.limit(valInt, 0, 3);
      
      ax.e();
    }
  }
  
  private void setOptionValueOF(avh.a par1EnumOptions, int par2)
  {
    if (par1EnumOptions == avh.a.FOG_FANCY) {
      switch (ofFogType)
      {
      case 1: 
        ofFogType = 2;
        if (!Config.isFancyFogAvailable()) {
          ofFogType = 3;
        }
        break;
      case 2: 
        ofFogType = 3;
        break;
      case 3: 
        ofFogType = 1;
        break;
      default: 
        ofFogType = 1;
      }
    }
    if (par1EnumOptions == avh.a.FOG_START)
    {
      ofFogStart += 0.2F;
      if (ofFogStart > 0.81F) {
        ofFogStart = 0.2F;
      }
    }
    if (par1EnumOptions == avh.a.SMOOTH_FPS) {
      ofSmoothFps = (!ofSmoothFps);
    }
    if (par1EnumOptions == avh.a.SMOOTH_WORLD)
    {
      ofSmoothWorld = (!ofSmoothWorld);
      
      Config.updateThreadPriorities();
    }
    if (par1EnumOptions == avh.a.CLOUDS)
    {
      ofClouds += 1;
      if (ofClouds > 3) {
        ofClouds = 0;
      }
      updateRenderClouds();
      
      ax.g.resetClouds();
    }
    if (par1EnumOptions == avh.a.TREES)
    {
      ofTrees += 1;
      if (ofTrees > 2) {
        ofTrees = 0;
      }
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.DROPPED_ITEMS)
    {
      ofDroppedItems += 1;
      if (ofDroppedItems > 2) {
        ofDroppedItems = 0;
      }
    }
    if (par1EnumOptions == avh.a.RAIN)
    {
      ofRain += 1;
      if (ofRain > 3) {
        ofRain = 0;
      }
    }
    if (par1EnumOptions == avh.a.ANIMATED_WATER)
    {
      ofAnimatedWater += 1;
      if (ofAnimatedWater > 2) {
        ofAnimatedWater = 0;
      }
    }
    if (par1EnumOptions == avh.a.ANIMATED_LAVA)
    {
      ofAnimatedLava += 1;
      if (ofAnimatedLava > 2) {
        ofAnimatedLava = 0;
      }
    }
    if (par1EnumOptions == avh.a.ANIMATED_FIRE) {
      ofAnimatedFire = (!ofAnimatedFire);
    }
    if (par1EnumOptions == avh.a.ANIMATED_PORTAL) {
      ofAnimatedPortal = (!ofAnimatedPortal);
    }
    if (par1EnumOptions == avh.a.ANIMATED_REDSTONE) {
      ofAnimatedRedstone = (!ofAnimatedRedstone);
    }
    if (par1EnumOptions == avh.a.ANIMATED_EXPLOSION) {
      ofAnimatedExplosion = (!ofAnimatedExplosion);
    }
    if (par1EnumOptions == avh.a.ANIMATED_FLAME) {
      ofAnimatedFlame = (!ofAnimatedFlame);
    }
    if (par1EnumOptions == avh.a.ANIMATED_SMOKE) {
      ofAnimatedSmoke = (!ofAnimatedSmoke);
    }
    if (par1EnumOptions == avh.a.VOID_PARTICLES) {
      ofVoidParticles = (!ofVoidParticles);
    }
    if (par1EnumOptions == avh.a.WATER_PARTICLES) {
      ofWaterParticles = (!ofWaterParticles);
    }
    if (par1EnumOptions == avh.a.PORTAL_PARTICLES) {
      ofPortalParticles = (!ofPortalParticles);
    }
    if (par1EnumOptions == avh.a.POTION_PARTICLES) {
      ofPotionParticles = (!ofPotionParticles);
    }
    if (par1EnumOptions == avh.a.FIREWORK_PARTICLES) {
      ofFireworkParticles = (!ofFireworkParticles);
    }
    if (par1EnumOptions == avh.a.DRIPPING_WATER_LAVA) {
      ofDrippingWaterLava = (!ofDrippingWaterLava);
    }
    if (par1EnumOptions == avh.a.ANIMATED_TERRAIN) {
      ofAnimatedTerrain = (!ofAnimatedTerrain);
    }
    if (par1EnumOptions == avh.a.ANIMATED_TEXTURES) {
      ofAnimatedTextures = (!ofAnimatedTextures);
    }
    if (par1EnumOptions == avh.a.RAIN_SPLASH) {
      ofRainSplash = (!ofRainSplash);
    }
    if (par1EnumOptions == avh.a.LAGOMETER) {
      ofLagometer = (!ofLagometer);
    }
    if (par1EnumOptions == avh.a.SHOW_FPS) {
      ofShowFps = (!ofShowFps);
    }
    if (par1EnumOptions == avh.a.AUTOSAVE_TICKS)
    {
      ofAutoSaveTicks *= 10;
      if (ofAutoSaveTicks > 40000) {
        ofAutoSaveTicks = 40;
      }
    }
    if (par1EnumOptions == avh.a.BETTER_GRASS)
    {
      ofBetterGrass += 1;
      if (ofBetterGrass > 3) {
        ofBetterGrass = 1;
      }
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.CONNECTED_TEXTURES)
    {
      ofConnectedTextures += 1;
      if (ofConnectedTextures > 3) {
        ofConnectedTextures = 1;
      }
      if (ofConnectedTextures != 2) {
        ax.e();
      }
    }
    if (par1EnumOptions == avh.a.WEATHER) {
      ofWeather = (!ofWeather);
    }
    if (par1EnumOptions == avh.a.SKY) {
      ofSky = (!ofSky);
    }
    if (par1EnumOptions == avh.a.STARS) {
      ofStars = (!ofStars);
    }
    if (par1EnumOptions == avh.a.SUN_MOON) {
      ofSunMoon = (!ofSunMoon);
    }
    if (par1EnumOptions == avh.a.VIGNETTE)
    {
      ofVignette += 1;
      if (ofVignette > 2) {
        ofVignette = 0;
      }
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES)
    {
      ofChunkUpdates += 1;
      if (ofChunkUpdates > 5) {
        ofChunkUpdates = 1;
      }
    }
    if (par1EnumOptions == avh.a.CHUNK_LOADING)
    {
      ofChunkLoading += 1;
      if (ofChunkLoading > 2) {
        ofChunkLoading = 0;
      }
      updateChunkLoading();
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES_DYNAMIC) {
      ofChunkUpdatesDynamic = (!ofChunkUpdatesDynamic);
    }
    if (par1EnumOptions == avh.a.TIME)
    {
      ofTime += 1;
      if (ofTime > 3) {
        ofTime = 0;
      }
    }
    if (par1EnumOptions == avh.a.CLEAR_WATER)
    {
      ofClearWater = (!ofClearWater);
      updateWaterOpacity();
    }
    if (par1EnumOptions == avh.a.PROFILER) {
      ofProfiler = (!ofProfiler);
    }
    if (par1EnumOptions == avh.a.BETTER_SNOW)
    {
      ofBetterSnow = (!ofBetterSnow);
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.SWAMP_COLORS)
    {
      ofSwampColors = (!ofSwampColors);
      CustomColorizer.updateUseDefaultColorMultiplier();
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.RANDOM_MOBS)
    {
      ofRandomMobs = (!ofRandomMobs);
      RandomMobs.resetTextures();
    }
    if (par1EnumOptions == avh.a.SMOOTH_BIOMES)
    {
      ofSmoothBiomes = (!ofSmoothBiomes);
      CustomColorizer.updateUseDefaultColorMultiplier();
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.CUSTOM_FONTS)
    {
      ofCustomFonts = (!ofCustomFonts);
      
      ax.k.a(Config.getResourceManager());
      ax.l.a(Config.getResourceManager());
    }
    if (par1EnumOptions == avh.a.CUSTOM_COLORS)
    {
      ofCustomColors = (!ofCustomColors);
      
      CustomColorizer.update();
      
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.CUSTOM_ITEMS)
    {
      ofCustomItems = (!ofCustomItems);
      
      ax.e();
    }
    if (par1EnumOptions == avh.a.CUSTOM_SKY)
    {
      ofCustomSky = (!ofCustomSky);
      
      CustomSky.update();
    }
    if (par1EnumOptions == avh.a.SHOW_CAPES) {
      ofShowCapes = (!ofShowCapes);
    }
    if (par1EnumOptions == avh.a.NATURAL_TEXTURES)
    {
      ofNaturalTextures = (!ofNaturalTextures);
      
      NaturalTextures.update();
      
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.FAST_MATH)
    {
      ofFastMath = (!ofFastMath);
      
      ns.fastMath = ofFastMath;
    }
    if (par1EnumOptions == avh.a.FAST_RENDER)
    {
      if ((!ofFastRender) && (Config.isShaders()))
      {
        Config.showGuiMessage("Fast Render is not compatible with Shaders.", "Please disable Shaders to enable this option.");
        return;
      }
      ofFastRender = (!ofFastRender);
      if (ofFastRender) {
        ax.o.b();
      }
      Config.updateFramebufferSize();
    }
    if (par1EnumOptions == avh.a.TRANSLUCENT_BLOCKS)
    {
      if (ofTranslucentBlocks == 0) {
        ofTranslucentBlocks = 1;
      } else if (ofTranslucentBlocks == 1) {
        ofTranslucentBlocks = 2;
      } else if (ofTranslucentBlocks == 2) {
        ofTranslucentBlocks = 0;
      } else {
        ofTranslucentBlocks = 0;
      }
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.LAZY_CHUNK_LOADING)
    {
      ofLazyChunkLoading = (!ofLazyChunkLoading);
      
      Config.updateAvailableProcessors();
      if (!Config.isSingleProcessor()) {
        ofLazyChunkLoading = false;
      }
      ax.g.a();
    }
    if (par1EnumOptions == avh.a.FULLSCREEN_MODE)
    {
      List modeList = Arrays.asList(Config.getFullscreenModes());
      if (ofFullscreenMode.equals("Default"))
      {
        ofFullscreenMode = ((String)modeList.get(0));
      }
      else
      {
        int index = modeList.indexOf(ofFullscreenMode);
        if (index < 0)
        {
          ofFullscreenMode = "Default";
        }
        else
        {
          index++;
          if (index >= modeList.size()) {
            ofFullscreenMode = "Default";
          } else {
            ofFullscreenMode = ((String)modeList.get(index));
          }
        }
      }
    }
    if (par1EnumOptions == avh.a.HELD_ITEM_TOOLTIPS) {
      D = (!D);
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
      int diff = c - baseDist;
      String descr = str;
      if (diff > 0) {
        descr = descr + "+";
      }
      return var2 + distChunks + " " + descr + "";
    }
    if (par1EnumOptions == avh.a.FOG_FANCY)
    {
      switch (ofFogType)
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
      return s + ofFogStart;
    }
    if (par1EnumOptions == avh.a.MIPMAP_TYPE)
    {
      switch (ofMipmapType)
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
      if (ofSmoothFps) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SMOOTH_WORLD)
    {
      if (ofSmoothWorld) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CLOUDS)
    {
      switch (ofClouds)
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
      switch (ofTrees)
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
      switch (ofDroppedItems)
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
      switch (ofRain)
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
      switch (ofAnimatedWater)
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
      switch (ofAnimatedLava)
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
      if (ofAnimatedFire) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_PORTAL)
    {
      if (ofAnimatedPortal) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_REDSTONE)
    {
      if (ofAnimatedRedstone) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_EXPLOSION)
    {
      if (ofAnimatedExplosion) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_FLAME)
    {
      if (ofAnimatedFlame) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_SMOKE)
    {
      if (ofAnimatedSmoke) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.VOID_PARTICLES)
    {
      if (ofVoidParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.WATER_PARTICLES)
    {
      if (ofWaterParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.PORTAL_PARTICLES)
    {
      if (ofPortalParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.POTION_PARTICLES)
    {
      if (ofPotionParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FIREWORK_PARTICLES)
    {
      if (ofFireworkParticles) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.DRIPPING_WATER_LAVA)
    {
      if (ofDrippingWaterLava) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_TERRAIN)
    {
      if (ofAnimatedTerrain) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.ANIMATED_TEXTURES)
    {
      if (ofAnimatedTextures) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.RAIN_SPLASH)
    {
      if (ofRainSplash) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.LAGOMETER)
    {
      if (ofLagometer) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SHOW_FPS)
    {
      if (ofShowFps) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.AUTOSAVE_TICKS)
    {
      if (ofAutoSaveTicks <= 40) {
        return s + "Default (2s)";
      }
      if (ofAutoSaveTicks <= 400) {
        return s + "20s";
      }
      if (ofAutoSaveTicks <= 4000) {
        return s + "3min";
      }
      return s + "30min";
    }
    if (par1EnumOptions == avh.a.BETTER_GRASS)
    {
      switch (ofBetterGrass)
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
      switch (ofConnectedTextures)
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
      if (ofWeather) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SKY)
    {
      if (ofSky) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.STARS)
    {
      if (ofStars) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SUN_MOON)
    {
      if (ofSunMoon) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.VIGNETTE)
    {
      switch (ofVignette)
      {
      case 1: 
        return s + "Fast";
      case 2: 
        return s + "Fancy";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES) {
      return s + ofChunkUpdates;
    }
    if (par1EnumOptions == avh.a.CHUNK_LOADING)
    {
      if (ofChunkLoading == 1) {
        return s + "Smooth";
      }
      if (ofChunkLoading == 2) {
        return s + "Multi-Core";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.CHUNK_UPDATES_DYNAMIC)
    {
      if (ofChunkUpdatesDynamic) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.TIME)
    {
      if (ofTime == 1) {
        return s + "Day Only";
      }
      if (ofTime == 3) {
        return s + "Night Only";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.CLEAR_WATER)
    {
      if (ofClearWater) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.AA_LEVEL)
    {
      String suffix = "";
      if (ofAaLevel != Config.getAntialiasingLevel()) {
        suffix = " (restart)";
      }
      if (ofAaLevel == 0) {
        return s + "OFF" + suffix;
      }
      return s + ofAaLevel + suffix;
    }
    if (par1EnumOptions == avh.a.AF_LEVEL)
    {
      if (ofAfLevel == 1) {
        return s + "OFF";
      }
      return s + ofAfLevel;
    }
    if (par1EnumOptions == avh.a.PROFILER)
    {
      if (ofProfiler) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.BETTER_SNOW)
    {
      if (ofBetterSnow) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SWAMP_COLORS)
    {
      if (ofSwampColors) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.RANDOM_MOBS)
    {
      if (ofRandomMobs) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SMOOTH_BIOMES)
    {
      if (ofSmoothBiomes) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_FONTS)
    {
      if (ofCustomFonts) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_COLORS)
    {
      if (ofCustomColors) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_SKY)
    {
      if (ofCustomSky) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.SHOW_CAPES)
    {
      if (ofShowCapes) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.CUSTOM_ITEMS)
    {
      if (ofCustomItems) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.NATURAL_TEXTURES)
    {
      if (ofNaturalTextures) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FAST_MATH)
    {
      if (ofFastMath) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FAST_RENDER)
    {
      if (ofFastRender) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.TRANSLUCENT_BLOCKS)
    {
      if (ofTranslucentBlocks == 1) {
        return s + "Fast";
      }
      if (ofTranslucentBlocks == 2) {
        return s + "Fancy";
      }
      return s + "Default";
    }
    if (par1EnumOptions == avh.a.LAZY_CHUNK_LOADING)
    {
      if (ofLazyChunkLoading) {
        return s + "ON";
      }
      return s + "OFF";
    }
    if (par1EnumOptions == avh.a.FULLSCREEN_MODE) {
      return s + ofFullscreenMode;
    }
    if (par1EnumOptions == avh.a.HELD_ITEM_TOOLTIPS)
    {
      if (D) {
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
      File ofReadFile = optionsFileOF;
      if (!ofReadFile.exists()) {
        ofReadFile = bb;
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
            c = Integer.valueOf(as[1]).intValue();
            c = Config.limit(c, 2, 32);
          }
          if ((as[0].equals("ofFogType")) && (as.length >= 2))
          {
            ofFogType = Integer.valueOf(as[1]).intValue();
            ofFogType = Config.limit(ofFogType, 1, 3);
          }
          if ((as[0].equals("ofFogStart")) && (as.length >= 2))
          {
            ofFogStart = Float.valueOf(as[1]).floatValue();
            if (ofFogStart < 0.2F) {
              ofFogStart = 0.2F;
            }
            if (ofFogStart > 0.81F) {
              ofFogStart = 0.8F;
            }
          }
          if ((as[0].equals("ofMipmapType")) && (as.length >= 2))
          {
            ofMipmapType = Integer.valueOf(as[1]).intValue();
            ofMipmapType = Config.limit(ofMipmapType, 0, 3);
          }
          if ((as[0].equals("ofOcclusionFancy")) && (as.length >= 2)) {
            ofOcclusionFancy = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSmoothFps")) && (as.length >= 2)) {
            ofSmoothFps = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSmoothWorld")) && (as.length >= 2)) {
            ofSmoothWorld = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAoLevel")) && (as.length >= 2))
          {
            ofAoLevel = Float.valueOf(as[1]).floatValue();
            ofAoLevel = Config.limit(ofAoLevel, 0.0F, 1.0F);
          }
          if ((as[0].equals("ofClouds")) && (as.length >= 2))
          {
            ofClouds = Integer.valueOf(as[1]).intValue();
            ofClouds = Config.limit(ofClouds, 0, 3);
            
            updateRenderClouds();
          }
          if ((as[0].equals("ofCloudsHeight")) && (as.length >= 2))
          {
            ofCloudsHeight = Float.valueOf(as[1]).floatValue();
            ofCloudsHeight = Config.limit(ofCloudsHeight, 0.0F, 1.0F);
          }
          if ((as[0].equals("ofTrees")) && (as.length >= 2))
          {
            ofTrees = Integer.valueOf(as[1]).intValue();
            ofTrees = Config.limit(ofTrees, 0, 2);
          }
          if ((as[0].equals("ofDroppedItems")) && (as.length >= 2))
          {
            ofDroppedItems = Integer.valueOf(as[1]).intValue();
            ofDroppedItems = Config.limit(ofDroppedItems, 0, 2);
          }
          if ((as[0].equals("ofRain")) && (as.length >= 2))
          {
            ofRain = Integer.valueOf(as[1]).intValue();
            ofRain = Config.limit(ofRain, 0, 3);
          }
          if ((as[0].equals("ofAnimatedWater")) && (as.length >= 2))
          {
            ofAnimatedWater = Integer.valueOf(as[1]).intValue();
            ofAnimatedWater = Config.limit(ofAnimatedWater, 0, 2);
          }
          if ((as[0].equals("ofAnimatedLava")) && (as.length >= 2))
          {
            ofAnimatedLava = Integer.valueOf(as[1]).intValue();
            ofAnimatedLava = Config.limit(ofAnimatedLava, 0, 2);
          }
          if ((as[0].equals("ofAnimatedFire")) && (as.length >= 2)) {
            ofAnimatedFire = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedPortal")) && (as.length >= 2)) {
            ofAnimatedPortal = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedRedstone")) && (as.length >= 2)) {
            ofAnimatedRedstone = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedExplosion")) && (as.length >= 2)) {
            ofAnimatedExplosion = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedFlame")) && (as.length >= 2)) {
            ofAnimatedFlame = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedSmoke")) && (as.length >= 2)) {
            ofAnimatedSmoke = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofVoidParticles")) && (as.length >= 2)) {
            ofVoidParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofWaterParticles")) && (as.length >= 2)) {
            ofWaterParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofPortalParticles")) && (as.length >= 2)) {
            ofPortalParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofPotionParticles")) && (as.length >= 2)) {
            ofPotionParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofFireworkParticles")) && (as.length >= 2)) {
            ofFireworkParticles = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofDrippingWaterLava")) && (as.length >= 2)) {
            ofDrippingWaterLava = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedTerrain")) && (as.length >= 2)) {
            ofAnimatedTerrain = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAnimatedTextures")) && (as.length >= 2)) {
            ofAnimatedTextures = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofRainSplash")) && (as.length >= 2)) {
            ofRainSplash = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofLagometer")) && (as.length >= 2)) {
            ofLagometer = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofShowFps")) && (as.length >= 2)) {
            ofShowFps = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofAutoSaveTicks")) && (as.length >= 2))
          {
            ofAutoSaveTicks = Integer.valueOf(as[1]).intValue();
            ofAutoSaveTicks = Config.limit(ofAutoSaveTicks, 40, 40000);
          }
          if ((as[0].equals("ofBetterGrass")) && (as.length >= 2))
          {
            ofBetterGrass = Integer.valueOf(as[1]).intValue();
            ofBetterGrass = Config.limit(ofBetterGrass, 1, 3);
          }
          if ((as[0].equals("ofConnectedTextures")) && (as.length >= 2))
          {
            ofConnectedTextures = Integer.valueOf(as[1]).intValue();
            ofConnectedTextures = Config.limit(ofConnectedTextures, 1, 3);
          }
          if ((as[0].equals("ofWeather")) && (as.length >= 2)) {
            ofWeather = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSky")) && (as.length >= 2)) {
            ofSky = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofStars")) && (as.length >= 2)) {
            ofStars = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSunMoon")) && (as.length >= 2)) {
            ofSunMoon = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofVignette")) && (as.length >= 2))
          {
            ofVignette = Integer.valueOf(as[1]).intValue();
            ofVignette = Config.limit(ofVignette, 0, 2);
          }
          if ((as[0].equals("ofChunkUpdates")) && (as.length >= 2))
          {
            ofChunkUpdates = Integer.valueOf(as[1]).intValue();
            ofChunkUpdates = Config.limit(ofChunkUpdates, 1, 5);
          }
          if ((as[0].equals("ofChunkLoading")) && (as.length >= 2))
          {
            ofChunkLoading = Integer.valueOf(as[1]).intValue();
            ofChunkLoading = Config.limit(ofChunkLoading, 0, 2);
            
            updateChunkLoading();
          }
          if ((as[0].equals("ofChunkUpdatesDynamic")) && (as.length >= 2)) {
            ofChunkUpdatesDynamic = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofTime")) && (as.length >= 2))
          {
            ofTime = Integer.valueOf(as[1]).intValue();
            ofTime = Config.limit(ofTime, 0, 3);
          }
          if ((as[0].equals("ofClearWater")) && (as.length >= 2))
          {
            ofClearWater = Boolean.valueOf(as[1]).booleanValue();
            updateWaterOpacity();
          }
          if ((as[0].equals("ofAaLevel")) && (as.length >= 2))
          {
            ofAaLevel = Integer.valueOf(as[1]).intValue();
            ofAaLevel = Config.limit(ofAaLevel, 0, 16);
          }
          if ((as[0].equals("ofAfLevel")) && (as.length >= 2))
          {
            ofAfLevel = Integer.valueOf(as[1]).intValue();
            ofAfLevel = Config.limit(ofAfLevel, 1, 16);
          }
          if ((as[0].equals("ofProfiler")) && (as.length >= 2)) {
            ofProfiler = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofBetterSnow")) && (as.length >= 2)) {
            ofBetterSnow = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSwampColors")) && (as.length >= 2)) {
            ofSwampColors = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofRandomMobs")) && (as.length >= 2)) {
            ofRandomMobs = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofSmoothBiomes")) && (as.length >= 2)) {
            ofSmoothBiomes = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomFonts")) && (as.length >= 2)) {
            ofCustomFonts = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomColors")) && (as.length >= 2)) {
            ofCustomColors = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomItems")) && (as.length >= 2)) {
            ofCustomItems = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofCustomSky")) && (as.length >= 2)) {
            ofCustomSky = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofShowCapes")) && (as.length >= 2)) {
            ofShowCapes = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofNaturalTextures")) && (as.length >= 2)) {
            ofNaturalTextures = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofLazyChunkLoading")) && (as.length >= 2)) {
            ofLazyChunkLoading = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofFullscreenMode")) && (as.length >= 2)) {
            ofFullscreenMode = as[1];
          }
          if ((as[0].equals("ofFastMath")) && (as.length >= 2))
          {
            ofFastMath = Boolean.valueOf(as[1]).booleanValue();
            
            ns.fastMath = ofFastMath;
          }
          if ((as[0].equals("ofFastRender")) && (as.length >= 2)) {
            ofFastRender = Boolean.valueOf(as[1]).booleanValue();
          }
          if ((as[0].equals("ofTranslucentBlocks")) && (as.length >= 2))
          {
            ofTranslucentBlocks = Integer.valueOf(as[1]).intValue();
            ofTranslucentBlocks = Config.limit(ofTranslucentBlocks, 0, 2);
          }
          if (as[0].equals("key_" + ofKeyBindZoom.g())) {
            ofKeyBindZoom.b(Integer.parseInt(as[1]));
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
      PrintWriter printwriter = new PrintWriter(new FileWriter(optionsFileOF));
      
      printwriter.println("ofRenderDistanceChunks:" + c);
      
      printwriter.println("ofFogType:" + ofFogType);
      printwriter.println("ofFogStart:" + ofFogStart);
      
      printwriter.println("ofMipmapType:" + ofMipmapType);
      
      printwriter.println("ofOcclusionFancy:" + ofOcclusionFancy);
      printwriter.println("ofSmoothFps:" + ofSmoothFps);
      printwriter.println("ofSmoothWorld:" + ofSmoothWorld);
      printwriter.println("ofAoLevel:" + ofAoLevel);
      printwriter.println("ofClouds:" + ofClouds);
      printwriter.println("ofCloudsHeight:" + ofCloudsHeight);
      printwriter.println("ofTrees:" + ofTrees);
      
      printwriter.println("ofDroppedItems:" + ofDroppedItems);
      printwriter.println("ofRain:" + ofRain);
      
      printwriter.println("ofAnimatedWater:" + ofAnimatedWater);
      printwriter.println("ofAnimatedLava:" + ofAnimatedLava);
      printwriter.println("ofAnimatedFire:" + ofAnimatedFire);
      printwriter.println("ofAnimatedPortal:" + ofAnimatedPortal);
      printwriter.println("ofAnimatedRedstone:" + ofAnimatedRedstone);
      printwriter.println("ofAnimatedExplosion:" + ofAnimatedExplosion);
      printwriter.println("ofAnimatedFlame:" + ofAnimatedFlame);
      printwriter.println("ofAnimatedSmoke:" + ofAnimatedSmoke);
      printwriter.println("ofVoidParticles:" + ofVoidParticles);
      printwriter.println("ofWaterParticles:" + ofWaterParticles);
      printwriter.println("ofPortalParticles:" + ofPortalParticles);
      printwriter.println("ofPotionParticles:" + ofPotionParticles);
      printwriter.println("ofFireworkParticles:" + ofFireworkParticles);
      printwriter.println("ofDrippingWaterLava:" + ofDrippingWaterLava);
      printwriter.println("ofAnimatedTerrain:" + ofAnimatedTerrain);
      printwriter.println("ofAnimatedTextures:" + ofAnimatedTextures);
      
      printwriter.println("ofRainSplash:" + ofRainSplash);
      printwriter.println("ofLagometer:" + ofLagometer);
      printwriter.println("ofShowFps:" + ofShowFps);
      printwriter.println("ofAutoSaveTicks:" + ofAutoSaveTicks);
      printwriter.println("ofBetterGrass:" + ofBetterGrass);
      printwriter.println("ofConnectedTextures:" + ofConnectedTextures);
      printwriter.println("ofWeather:" + ofWeather);
      printwriter.println("ofSky:" + ofSky);
      printwriter.println("ofStars:" + ofStars);
      printwriter.println("ofSunMoon:" + ofSunMoon);
      printwriter.println("ofVignette:" + ofVignette);
      printwriter.println("ofChunkUpdates:" + ofChunkUpdates);
      printwriter.println("ofChunkLoading:" + ofChunkLoading);
      printwriter.println("ofChunkUpdatesDynamic:" + ofChunkUpdatesDynamic);
      printwriter.println("ofTime:" + ofTime);
      printwriter.println("ofClearWater:" + ofClearWater);
      
      printwriter.println("ofAaLevel:" + ofAaLevel);
      printwriter.println("ofAfLevel:" + ofAfLevel);
      printwriter.println("ofProfiler:" + ofProfiler);
      printwriter.println("ofBetterSnow:" + ofBetterSnow);
      printwriter.println("ofSwampColors:" + ofSwampColors);
      printwriter.println("ofRandomMobs:" + ofRandomMobs);
      printwriter.println("ofSmoothBiomes:" + ofSmoothBiomes);
      printwriter.println("ofCustomFonts:" + ofCustomFonts);
      printwriter.println("ofCustomColors:" + ofCustomColors);
      printwriter.println("ofCustomItems:" + ofCustomItems);
      printwriter.println("ofCustomSky:" + ofCustomSky);
      printwriter.println("ofShowCapes:" + ofShowCapes);
      printwriter.println("ofNaturalTextures:" + ofNaturalTextures);
      printwriter.println("ofLazyChunkLoading:" + ofLazyChunkLoading);
      printwriter.println("ofFullscreenMode:" + ofFullscreenMode);
      printwriter.println("ofFastMath:" + ofFastMath);
      printwriter.println("ofFastRender:" + ofFastRender);
      printwriter.println("ofTranslucentBlocks:" + ofTranslucentBlocks);
      
      printwriter.println("key_" + ofKeyBindZoom.g() + ":" + ofKeyBindZoom.i());
      
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
    switch (ofClouds)
    {
    case 3: 
      h = 0;
      break;
    case 1: 
      h = 1;
      break;
    case 2: 
      h = 2;
      break;
    default: 
      if (i) {
        h = 2;
      } else {
        h = 1;
      }
      break;
    }
  }
  
  public void resetSettings()
  {
    c = 8;
    d = true;
    e = false;
    g = ((int)avh.a.i.f());
    
    t = false;
    updateVSync();
    
    J = 4;
    
    i = true;
    j = 2;
    h = 2;
    aH = 70.0F;
    aI = 0.0F;
    aK = 0;
    aL = 0;
    D = true;
    u = false;
    v = true;
    aN = false;
    
    ofFogType = 1;
    ofFogStart = 0.8F;
    
    ofMipmapType = 0;
    
    ofOcclusionFancy = false;
    ofSmoothFps = false;
    
    Config.updateAvailableProcessors();
    ofSmoothWorld = Config.isSingleProcessor();
    ofLazyChunkLoading = Config.isSingleProcessor();
    
    ofFastMath = false;
    ofFastRender = false;
    
    ofTranslucentBlocks = 0;
    
    ofAoLevel = 1.0F;
    
    ofAaLevel = 0;
    ofAfLevel = 1;
    
    ofClouds = 0;
    ofCloudsHeight = 0.0F;
    ofTrees = 0;
    
    ofRain = 0;
    
    ofBetterGrass = 3;
    ofAutoSaveTicks = 4000;
    ofLagometer = false;
    ofShowFps = false;
    ofProfiler = false;
    ofWeather = true;
    ofSky = true;
    ofStars = true;
    ofSunMoon = true;
    ofVignette = 0;
    ofChunkUpdates = 1;
    ofChunkLoading = 0;
    ofChunkUpdatesDynamic = false;
    ofTime = 0;
    ofClearWater = false;
    
    ofBetterSnow = false;
    ofFullscreenMode = "Default";
    ofSwampColors = true;
    ofRandomMobs = true;
    ofSmoothBiomes = true;
    ofCustomFonts = true;
    ofCustomColors = true;
    ofCustomItems = true;
    ofCustomSky = true;
    ofShowCapes = true;
    ofConnectedTextures = 2;
    ofNaturalTextures = false;
    
    ofAnimatedWater = 0;
    ofAnimatedLava = 0;
    ofAnimatedFire = true;
    ofAnimatedPortal = true;
    ofAnimatedRedstone = true;
    ofAnimatedExplosion = true;
    ofAnimatedFlame = true;
    ofAnimatedSmoke = true;
    ofVoidParticles = true;
    ofWaterParticles = true;
    ofRainSplash = true;
    ofPortalParticles = true;
    ofPotionParticles = true;
    ofFireworkParticles = true;
    ofDrippingWaterLava = true;
    ofAnimatedTerrain = true;
    
    ofAnimatedTextures = true;
    
    Shaders.setShaderPack(Shaders.packNameNone);
    Shaders.configAntialiasingLevel = 0;
    Shaders.uninit();
    Shaders.storeConfig();
    
    updateWaterOpacity();
    
    ax.e();
    
    b();
  }
  
  public void updateVSync()
  {
    Display.setVSyncEnabled(t);
  }
  
  private void updateWaterOpacity()
  {
    if ((ax.E()) && (ax.G() != null)) {
      Config.waterOpacityChanged = true;
    }
    ClearWater.updateWaterOpacity(this, ax.f);
  }
  
  public void updateChunkLoading()
  {
    if (ax.g != null) {
      ax.g.a();
    }
  }
  
  public void setAllAnimations(boolean flag)
  {
    int animVal = flag ? 0 : 2;
    
    ofAnimatedWater = animVal;
    ofAnimatedLava = animVal;
    ofAnimatedFire = flag;
    ofAnimatedPortal = flag;
    ofAnimatedRedstone = flag;
    ofAnimatedExplosion = flag;
    ofAnimatedFlame = flag;
    ofAnimatedSmoke = flag;
    ofVoidParticles = flag;
    ofWaterParticles = flag;
    ofRainSplash = flag;
    ofPortalParticles = flag;
    ofPotionParticles = flag;
    ofFireworkParticles = flag;
    aL = (flag ? 0 : 2);
    ofDrippingWaterLava = flag;
    ofAnimatedTerrain = flag;
    
    ofAnimatedTextures = flag;
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
      U = p_i45004_3_;
      S = p_i45004_4_;
      T = p_i45004_5_;
      W = p_i45004_6_;
      X = p_i45004_7_;
      V = p_i45004_8_;
    }
    
    public boolean a()
    {
      return S;
    }
    
    public boolean b()
    {
      return T;
    }
    
    public int c()
    {
      return ordinal();
    }
    
    public String d()
    {
      return U;
    }
    
    public float f()
    {
      return X;
    }
    
    public void a(float p_148263_1_)
    {
      X = p_148263_1_;
    }
    
    public float c(float p_148266_1_)
    {
      return ns.a((e(p_148266_1_) - W) / (X - W), 0.0F, 1.0F);
    }
    
    public float d(float p_148262_1_)
    {
      return e(W + (X - W) * ns.a(p_148262_1_, 0.0F, 1.0F));
    }
    
    public float e(float p_148268_1_)
    {
      p_148268_1_ = f(p_148268_1_);
      return ns.a(p_148268_1_, W, X);
    }
    
    protected float f(float p_148264_1_)
    {
      if (V > 0.0F) {
        p_148264_1_ = V * Math.round(p_148264_1_ / V);
      }
      return p_148264_1_;
    }
  }
}
