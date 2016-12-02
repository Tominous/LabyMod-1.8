import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class bfl
{
  private static bfl.a a = new bfl.a((bfl.1)null);
  private static bfl.c b = new bfl.c(2896);
  private static bfl.c[] c = new bfl.c[8];
  private static bfl.h d = new bfl.h((bfl.1)null);
  private static bfl.b e = new bfl.b((bfl.1)null);
  private static bfl.j f = new bfl.j((bfl.1)null);
  private static bfl.k g = new bfl.k((bfl.1)null);
  private static bfl.i h = new bfl.i((bfl.1)null);
  private static bfl.l i = new bfl.l((bfl.1)null);
  private static bfl.f j = new bfl.f((bfl.1)null);
  private static bfl.q k = new bfl.q((bfl.1)null);
  private static bfl.d l = new bfl.d((bfl.1)null);
  private static bfl.n m = new bfl.n((bfl.1)null);
  private static bfl.c n = new bfl.c(2977);
  private static int o = 0;
  private static bfl.r[] p = new bfl.r[32];
  private static int q = 7425;
  private static bfl.c r = new bfl.c(32826);
  private static bfl.g s = new bfl.g((bfl.1)null);
  private static bfl.e t = new bfl.e();
  private static final String __OBFID = "CL_00002558";
  public static boolean clearEnabled = true;
  
  public static void a()
  {
    GL11.glPushAttrib(8256);
  }
  
  public static void b() {}
  
  public static void c()
  {
    aa.a();
  }
  
  public static void d()
  {
    aa.b();
  }
  
  public static void a(int p_179092_0_, float p_179092_1_)
  {
    if ((p_179092_0_ != ab) || (p_179092_1_ != ac))
    {
      ab = p_179092_0_;
      ac = p_179092_1_;
      GL11.glAlphaFunc(p_179092_0_, p_179092_1_);
    }
  }
  
  public static void e()
  {
    b.b();
  }
  
  public static void f()
  {
    b.a();
  }
  
  public static void a(int p_179085_0_)
  {
    c[p_179085_0_].b();
  }
  
  public static void b(int p_179122_0_)
  {
    c[p_179122_0_].a();
  }
  
  public static void g()
  {
    da.b();
  }
  
  public static void h()
  {
    da.a();
  }
  
  public static void a(int p_179104_0_, int p_179104_1_)
  {
    if ((p_179104_0_ != db) || (p_179104_1_ != dc))
    {
      db = p_179104_0_;
      dc = p_179104_1_;
      GL11.glColorMaterial(p_179104_0_, p_179104_1_);
    }
  }
  
  public static void i()
  {
    fa.a();
  }
  
  public static void j()
  {
    fa.b();
  }
  
  public static void c(int p_179143_0_)
  {
    if (p_179143_0_ != fc)
    {
      fc = p_179143_0_;
      GL11.glDepthFunc(p_179143_0_);
    }
  }
  
  public static void a(boolean p_179132_0_)
  {
    if (p_179132_0_ != fb)
    {
      fb = p_179132_0_;
      GL11.glDepthMask(p_179132_0_);
    }
  }
  
  public static void k()
  {
    ea.a();
  }
  
  public static void l()
  {
    ea.b();
  }
  
  public static void b(int p_179112_0_, int p_179112_1_)
  {
    if ((p_179112_0_ != eb) || (p_179112_1_ != ec))
    {
      eb = p_179112_0_;
      ec = p_179112_1_;
      GL11.glBlendFunc(p_179112_0_, p_179112_1_);
    }
  }
  
  public static void a(int p_179120_0_, int p_179120_1_, int p_179120_2_, int p_179120_3_)
  {
    if ((p_179120_0_ != eb) || (p_179120_1_ != ec) || (p_179120_2_ != ed) || (p_179120_3_ != ee))
    {
      eb = p_179120_0_;
      ec = p_179120_1_;
      ed = p_179120_2_;
      ee = p_179120_3_;
      bqs.c(p_179120_0_, p_179120_1_, p_179120_2_, p_179120_3_);
    }
  }
  
  public static void m()
  {
    ga.b();
  }
  
  public static void n()
  {
    ga.a();
  }
  
  public static void d(int p_179093_0_)
  {
    if (p_179093_0_ != gb)
    {
      gb = p_179093_0_;
      GL11.glFogi(2917, p_179093_0_);
    }
  }
  
  public static void a(float p_179095_0_)
  {
    if (p_179095_0_ != gc)
    {
      gc = p_179095_0_;
      GL11.glFogf(2914, p_179095_0_);
    }
  }
  
  public static void b(float p_179102_0_)
  {
    if (p_179102_0_ != gd)
    {
      gd = p_179102_0_;
      GL11.glFogf(2915, p_179102_0_);
    }
  }
  
  public static void c(float p_179153_0_)
  {
    if (p_179153_0_ != ge)
    {
      ge = p_179153_0_;
      GL11.glFogf(2916, p_179153_0_);
    }
  }
  
  public static void o()
  {
    ha.b();
  }
  
  public static void p()
  {
    ha.a();
  }
  
  public static void e(int p_179107_0_)
  {
    if (p_179107_0_ != hb)
    {
      hb = p_179107_0_;
      GL11.glCullFace(p_179107_0_);
    }
  }
  
  public static void q()
  {
    ia.b();
  }
  
  public static void r()
  {
    ia.a();
  }
  
  public static void a(float p_179136_0_, float p_179136_1_)
  {
    if ((p_179136_0_ != ic) || (p_179136_1_ != id))
    {
      ic = p_179136_0_;
      id = p_179136_1_;
      GL11.glPolygonOffset(p_179136_0_, p_179136_1_);
    }
  }
  
  public static void u()
  {
    ja.b();
  }
  
  public static void v()
  {
    ja.a();
  }
  
  public static void f(int p_179116_0_)
  {
    if (p_179116_0_ != jb)
    {
      jb = p_179116_0_;
      GL11.glLogicOp(p_179116_0_);
    }
  }
  
  public static void a(bfl.o p_179087_0_)
  {
    ca.b();
  }
  
  public static void b(bfl.o p_179100_0_)
  {
    ca.a();
  }
  
  public static void a(bfl.o p_179149_0_, int p_179149_1_)
  {
    bfl.p var2 = c(p_179149_0_);
    if (p_179149_1_ != c)
    {
      c = p_179149_1_;
      GL11.glTexGeni(b, 9472, p_179149_1_);
    }
  }
  
  public static void a(bfl.o p_179105_0_, int p_179105_1_, FloatBuffer p_179105_2_)
  {
    GL11.glTexGen(cb, p_179105_1_, p_179105_2_);
  }
  
  private static bfl.p c(bfl.o p_179125_0_)
  {
    switch (bfl.1.a[p_179125_0_.ordinal()])
    {
    case 1: 
      return ka;
    case 2: 
      return kb;
    case 3: 
      return kc;
    case 4: 
      return kd;
    }
    return ka;
  }
  
  public static void g(int p_179138_0_)
  {
    if (o != p_179138_0_ - bqs.q)
    {
      o = p_179138_0_ - bqs.q;
      bqs.k(p_179138_0_);
    }
  }
  
  public static void w()
  {
    poa.b();
  }
  
  public static void x()
  {
    poa.a();
  }
  
  public static int y()
  {
    return GL11.glGenTextures();
  }
  
  public static void h(int p_179150_0_)
  {
    if (p_179150_0_ == 0) {
      return;
    }
    GL11.glDeleteTextures(p_179150_0_);
    bfl.r[] var1 = p;
    int var2 = var1.length;
    for (int var3 = 0; var3 < var2; var3++)
    {
      bfl.r var4 = var1[var3];
      if (b == p_179150_0_) {
        b = 0;
      }
    }
  }
  
  public static void i(int p_179144_0_)
  {
    if (p_179144_0_ != pob)
    {
      pob = p_179144_0_;
      GL11.glBindTexture(3553, p_179144_0_);
    }
  }
  
  public static void bindCurrentTexture()
  {
    GL11.glBindTexture(3553, pob);
  }
  
  public static void z()
  {
    n.b();
  }
  
  public static void A()
  {
    n.a();
  }
  
  public static void j(int p_179103_0_)
  {
    if (p_179103_0_ != q)
    {
      q = p_179103_0_;
      GL11.glShadeModel(p_179103_0_);
    }
  }
  
  public static void B()
  {
    r.b();
  }
  
  public static void C()
  {
    r.a();
  }
  
  public static void b(int p_179083_0_, int p_179083_1_, int p_179083_2_, int p_179083_3_)
  {
    GL11.glViewport(p_179083_0_, p_179083_1_, p_179083_2_, p_179083_3_);
  }
  
  public static void a(boolean p_179135_0_, boolean p_179135_1_, boolean p_179135_2_, boolean p_179135_3_)
  {
    if ((p_179135_0_ != sa) || (p_179135_1_ != sb) || (p_179135_2_ != sc) || (p_179135_3_ != sd))
    {
      sa = p_179135_0_;
      sb = p_179135_1_;
      sc = p_179135_2_;
      sd = p_179135_3_;
      GL11.glColorMask(p_179135_0_, p_179135_1_, p_179135_2_, p_179135_3_);
    }
  }
  
  public static void a(double p_179151_0_)
  {
    if (p_179151_0_ != la)
    {
      la = p_179151_0_;
      GL11.glClearDepth(p_179151_0_);
    }
  }
  
  public static void a(float p_179082_0_, float p_179082_1_, float p_179082_2_, float p_179082_3_)
  {
    if ((p_179082_0_ != lb.a) || (p_179082_1_ != lb.b) || (p_179082_2_ != lb.c) || (p_179082_3_ != lb.d))
    {
      lb.a = p_179082_0_;
      lb.b = p_179082_1_;
      lb.c = p_179082_2_;
      lb.d = p_179082_3_;
      GL11.glClearColor(p_179082_0_, p_179082_1_, p_179082_2_, p_179082_3_);
    }
  }
  
  public static void m(int p_179086_0_)
  {
    if (!clearEnabled) {
      return;
    }
    GL11.glClear(p_179086_0_);
  }
  
  public static void n(int p_179128_0_)
  {
    GL11.glMatrixMode(p_179128_0_);
  }
  
  public static void D() {}
  
  public static void E() {}
  
  public static void F() {}
  
  public static void a(int p_179111_0_, FloatBuffer p_179111_1_)
  {
    GL11.glGetFloat(p_179111_0_, p_179111_1_);
  }
  
  public static void a(double p_179130_0_, double p_179130_2_, double p_179130_4_, double p_179130_6_, double p_179130_8_, double p_179130_10_)
  {
    GL11.glOrtho(p_179130_0_, p_179130_2_, p_179130_4_, p_179130_6_, p_179130_8_, p_179130_10_);
  }
  
  public static void b(float p_179114_0_, float p_179114_1_, float p_179114_2_, float p_179114_3_)
  {
    GL11.glRotatef(p_179114_0_, p_179114_1_, p_179114_2_, p_179114_3_);
  }
  
  public static void a(float p_179152_0_, float p_179152_1_, float p_179152_2_)
  {
    GL11.glScalef(p_179152_0_, p_179152_1_, p_179152_2_);
  }
  
  public static void a(double p_179139_0_, double p_179139_2_, double p_179139_4_)
  {
    GL11.glScaled(p_179139_0_, p_179139_2_, p_179139_4_);
  }
  
  public static void b(float p_179109_0_, float p_179109_1_, float p_179109_2_)
  {
    GL11.glTranslatef(p_179109_0_, p_179109_1_, p_179109_2_);
  }
  
  public static void b(double p_179137_0_, double p_179137_2_, double p_179137_4_)
  {
    GL11.glTranslated(p_179137_0_, p_179137_2_, p_179137_4_);
  }
  
  public static void a(FloatBuffer p_179110_0_)
  {
    GL11.glMultMatrix(p_179110_0_);
  }
  
  public static void c(float p_179131_0_, float p_179131_1_, float p_179131_2_, float p_179131_3_)
  {
    if ((p_179131_0_ != ta) || (p_179131_1_ != tb) || (p_179131_2_ != tc) || (p_179131_3_ != td))
    {
      ta = p_179131_0_;
      tb = p_179131_1_;
      tc = p_179131_2_;
      td = p_179131_3_;
      GL11.glColor4f(p_179131_0_, p_179131_1_, p_179131_2_, p_179131_3_);
    }
  }
  
  public static void c(float p_179124_0_, float p_179124_1_, float p_179124_2_)
  {
    c(p_179124_0_, p_179124_1_, p_179124_2_, 1.0F);
  }
  
  public static void G()
  {
    ta = (tb = tc = td = -1.0F);
  }
  
  public static void o(int p_179148_0_)
  {
    GL11.glCallList(p_179148_0_);
  }
  
  public static int getActiveTextureUnit()
  {
    return bqs.q + o;
  }
  
  public static int getBoundTexture()
  {
    return pob;
  }
  
  public static void checkBoundTexture()
  {
    if (!Config.isMinecraftThread()) {
      return;
    }
    int glAct = GL11.glGetInteger(34016);
    int glTex = GL11.glGetInteger(32873);
    int act = getActiveTextureUnit();
    int tex = getBoundTexture();
    if (tex <= 0) {
      return;
    }
    if ((glAct != act) || (glTex != tex)) {
      Config.dbg("checkTexture: act: " + act + ", glAct: " + glAct + ", tex: " + tex + ", glTex: " + glTex);
    }
  }
  
  public static void deleteTextures(IntBuffer buf)
  {
    buf.rewind();
    while (buf.position() < buf.limit())
    {
      int texId = buf.get();
      h(texId);
    }
    buf.rewind();
  }
  
  static
  {
    for (int var0 = 0; var0 < 8; var0++) {
      c[var0] = new bfl.c(16384 + var0);
    }
    for (var0 = 0; var0 < p.length; var0++) {
      p[var0] = new bfl.r((bfl.1)null);
    }
  }
  
  static class a
  {
    public bfl.c a;
    public int b;
    public float c;
    private static final String __OBFID = "CL_00002556";
    
    private a()
    {
      a = new bfl.c(3008);
      b = 519;
      c = -1.0F;
    }
    
    a(bfl.1 p_i46269_1_)
    {
      this();
    }
  }
  
  static class b
  {
    public bfl.c a;
    public int b;
    public int c;
    public int d;
    public int e;
    private static final String __OBFID = "CL_00002555";
    
    private b()
    {
      a = new bfl.c(3042);
      b = 1;
      c = 0;
      d = 1;
      e = 0;
    }
    
    b(bfl.1 p_i46268_1_)
    {
      this();
    }
  }
  
  static class c
  {
    private final int a;
    private boolean b = false;
    private static final String __OBFID = "CL_00002554";
    
    public c(int p_i46267_1_)
    {
      a = p_i46267_1_;
    }
    
    public void a()
    {
      a(false);
    }
    
    public void b()
    {
      a(true);
    }
    
    public void a(boolean p_179199_1_)
    {
      if (p_179199_1_ != b)
      {
        b = p_179199_1_;
        if (p_179199_1_) {
          GL11.glEnable(a);
        } else {
          GL11.glDisable(a);
        }
      }
    }
  }
  
  static class d
  {
    public double a;
    public bfl.e b;
    public int c;
    private static final String __OBFID = "CL_00002553";
    
    private d()
    {
      a = 1.0D;
      b = new bfl.e(0.0F, 0.0F, 0.0F, 0.0F);
      c = 0;
    }
    
    d(bfl.1 p_i46266_1_)
    {
      this();
    }
  }
  
  static class e
  {
    public float a = 1.0F;
    public float b = 1.0F;
    public float c = 1.0F;
    public float d = 1.0F;
    private static final String __OBFID = "CL_00002552";
    
    public e() {}
    
    public e(float p_i46265_1_, float p_i46265_2_, float p_i46265_3_, float p_i46265_4_)
    {
      a = p_i46265_1_;
      b = p_i46265_2_;
      c = p_i46265_3_;
      d = p_i46265_4_;
    }
  }
  
  static class f
  {
    public bfl.c a;
    public int b;
    private static final String __OBFID = "CL_00002551";
    
    private f()
    {
      a = new bfl.c(3058);
      b = 5379;
    }
    
    f(bfl.1 p_i46264_1_)
    {
      this();
    }
  }
  
  static class g
  {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private static final String __OBFID = "CL_00002550";
    
    private g()
    {
      a = true;
      b = true;
      c = true;
      d = true;
    }
    
    g(bfl.1 p_i46263_1_)
    {
      this();
    }
  }
  
  static class h
  {
    public bfl.c a;
    public int b;
    public int c;
    private static final String __OBFID = "CL_00002549";
    
    private h()
    {
      a = new bfl.c(2903);
      b = 1032;
      c = 5634;
    }
    
    h(bfl.1 p_i46262_1_)
    {
      this();
    }
  }
  
  static class i
  {
    public bfl.c a;
    public int b;
    private static final String __OBFID = "CL_00002548";
    
    private i()
    {
      a = new bfl.c(2884);
      b = 1029;
    }
    
    i(bfl.1 p_i46261_1_)
    {
      this();
    }
  }
  
  static class j
  {
    public bfl.c a;
    public boolean b;
    public int c;
    private static final String __OBFID = "CL_00002547";
    
    private j()
    {
      a = new bfl.c(2929);
      b = true;
      c = 513;
    }
    
    j(bfl.1 p_i46260_1_)
    {
      this();
    }
  }
  
  static class k
  {
    public bfl.c a;
    public int b;
    public float c;
    public float d;
    public float e;
    private static final String __OBFID = "CL_00002546";
    
    private k()
    {
      a = new bfl.c(2912);
      b = 2048;
      c = 1.0F;
      d = 0.0F;
      e = 1.0F;
    }
    
    k(bfl.1 p_i46259_1_)
    {
      this();
    }
  }
  
  static class l
  {
    public bfl.c a;
    public bfl.c b;
    public float c;
    public float d;
    private static final String __OBFID = "CL_00002545";
    
    private l()
    {
      a = new bfl.c(32823);
      b = new bfl.c(10754);
      c = 0.0F;
      d = 0.0F;
    }
    
    l(bfl.1 p_i46258_1_)
    {
      this();
    }
  }
  
  static class m
  {
    public int a;
    public int b;
    public int c;
    private static final String __OBFID = "CL_00002544";
    
    private m()
    {
      a = 519;
      b = 0;
      c = -1;
    }
    
    m(bfl.1 p_i46257_1_)
    {
      this();
    }
  }
  
  static class n
  {
    public bfl.m a;
    public int b;
    public int c;
    public int d;
    public int e;
    private static final String __OBFID = "CL_00002543";
    
    private n()
    {
      a = new bfl.m((bfl.1)null);
      b = -1;
      c = 7680;
      d = 7680;
      e = 7680;
    }
    
    n(bfl.1 p_i46256_1_)
    {
      this();
    }
  }
  
  public static enum o
  {
    private static final o[] e = { a, b, c, d };
    private static final String __OBFID = "CL_00002542";
  }
  
  static class p
  {
    public bfl.c a;
    public int b;
    public int c = -1;
    private static final String __OBFID = "CL_00002541";
    
    public p(int p_i46254_1_, int p_i46254_2_)
    {
      b = p_i46254_1_;
      a = new bfl.c(p_i46254_2_);
    }
  }
  
  static class q
  {
    public bfl.p a;
    public bfl.p b;
    public bfl.p c;
    public bfl.p d;
    private static final String __OBFID = "CL_00002540";
    
    private q()
    {
      a = new bfl.p(8192, 3168);
      b = new bfl.p(8193, 3169);
      c = new bfl.p(8194, 3170);
      d = new bfl.p(8195, 3171);
    }
    
    q(bfl.1 p_i46253_1_)
    {
      this();
    }
  }
  
  static class r
  {
    public bfl.c a;
    public int b;
    private static final String __OBFID = "CL_00002539";
    
    private r()
    {
      a = new bfl.c(3553);
      b = 0;
    }
    
    r(bfl.1 p_i46252_1_)
    {
      this();
    }
  }
}
