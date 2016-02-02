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
    a.a.a();
  }
  
  public static void d()
  {
    a.a.b();
  }
  
  public static void a(int p_179092_0_, float p_179092_1_)
  {
    if ((p_179092_0_ != a.b) || (p_179092_1_ != a.c))
    {
      a.b = p_179092_0_;
      a.c = p_179092_1_;
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
    d.a.b();
  }
  
  public static void h()
  {
    d.a.a();
  }
  
  public static void a(int p_179104_0_, int p_179104_1_)
  {
    if ((p_179104_0_ != d.b) || (p_179104_1_ != d.c))
    {
      d.b = p_179104_0_;
      d.c = p_179104_1_;
      GL11.glColorMaterial(p_179104_0_, p_179104_1_);
    }
  }
  
  public static void i()
  {
    f.a.a();
  }
  
  public static void j()
  {
    f.a.b();
  }
  
  public static void c(int p_179143_0_)
  {
    if (p_179143_0_ != f.c)
    {
      f.c = p_179143_0_;
      GL11.glDepthFunc(p_179143_0_);
    }
  }
  
  public static void a(boolean p_179132_0_)
  {
    if (p_179132_0_ != f.b)
    {
      f.b = p_179132_0_;
      GL11.glDepthMask(p_179132_0_);
    }
  }
  
  public static void k()
  {
    e.a.a();
  }
  
  public static void l()
  {
    e.a.b();
  }
  
  public static void b(int p_179112_0_, int p_179112_1_)
  {
    if ((p_179112_0_ != e.b) || (p_179112_1_ != e.c))
    {
      e.b = p_179112_0_;
      e.c = p_179112_1_;
      GL11.glBlendFunc(p_179112_0_, p_179112_1_);
    }
  }
  
  public static void a(int p_179120_0_, int p_179120_1_, int p_179120_2_, int p_179120_3_)
  {
    if ((p_179120_0_ != e.b) || (p_179120_1_ != e.c) || (p_179120_2_ != e.d) || (p_179120_3_ != e.e))
    {
      e.b = p_179120_0_;
      e.c = p_179120_1_;
      e.d = p_179120_2_;
      e.e = p_179120_3_;
      bqs.c(p_179120_0_, p_179120_1_, p_179120_2_, p_179120_3_);
    }
  }
  
  public static void m()
  {
    g.a.b();
  }
  
  public static void n()
  {
    g.a.a();
  }
  
  public static void d(int p_179093_0_)
  {
    if (p_179093_0_ != g.b)
    {
      g.b = p_179093_0_;
      GL11.glFogi(2917, p_179093_0_);
    }
  }
  
  public static void a(float p_179095_0_)
  {
    if (p_179095_0_ != g.c)
    {
      g.c = p_179095_0_;
      GL11.glFogf(2914, p_179095_0_);
    }
  }
  
  public static void b(float p_179102_0_)
  {
    if (p_179102_0_ != g.d)
    {
      g.d = p_179102_0_;
      GL11.glFogf(2915, p_179102_0_);
    }
  }
  
  public static void c(float p_179153_0_)
  {
    if (p_179153_0_ != g.e)
    {
      g.e = p_179153_0_;
      GL11.glFogf(2916, p_179153_0_);
    }
  }
  
  public static void o()
  {
    h.a.b();
  }
  
  public static void p()
  {
    h.a.a();
  }
  
  public static void e(int p_179107_0_)
  {
    if (p_179107_0_ != h.b)
    {
      h.b = p_179107_0_;
      GL11.glCullFace(p_179107_0_);
    }
  }
  
  public static void q()
  {
    i.a.b();
  }
  
  public static void r()
  {
    i.a.a();
  }
  
  public static void a(float p_179136_0_, float p_179136_1_)
  {
    if ((p_179136_0_ != i.c) || (p_179136_1_ != i.d))
    {
      i.c = p_179136_0_;
      i.d = p_179136_1_;
      GL11.glPolygonOffset(p_179136_0_, p_179136_1_);
    }
  }
  
  public static void u()
  {
    j.a.b();
  }
  
  public static void v()
  {
    j.a.a();
  }
  
  public static void f(int p_179116_0_)
  {
    if (p_179116_0_ != j.b)
    {
      j.b = p_179116_0_;
      GL11.glLogicOp(p_179116_0_);
    }
  }
  
  public static void a(bfl.o p_179087_0_)
  {
    c(p_179087_0_).a.b();
  }
  
  public static void b(bfl.o p_179100_0_)
  {
    c(p_179100_0_).a.a();
  }
  
  public static void a(bfl.o p_179149_0_, int p_179149_1_)
  {
    bfl.p var2 = c(p_179149_0_);
    if (p_179149_1_ != var2.c)
    {
      var2.c = p_179149_1_;
      GL11.glTexGeni(var2.b, 9472, p_179149_1_);
    }
  }
  
  public static void a(bfl.o p_179105_0_, int p_179105_1_, FloatBuffer p_179105_2_)
  {
    GL11.glTexGen(c(p_179105_0_).b, p_179105_1_, p_179105_2_);
  }
  
  private static bfl.p c(bfl.o p_179125_0_)
  {
    switch (bfl.1.a[p_179125_0_.ordinal()])
    {
    case 1: 
      return k.a;
    case 2: 
      return k.b;
    case 3: 
      return k.c;
    case 4: 
      return k.d;
    }
    return k.a;
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
    p[o].a.b();
  }
  
  public static void x()
  {
    p[o].a.a();
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
      if (var4.b == p_179150_0_) {
        var4.b = 0;
      }
    }
  }
  
  public static void i(int p_179144_0_)
  {
    if (p_179144_0_ != p[o].b)
    {
      p[o].b = p_179144_0_;
      GL11.glBindTexture(3553, p_179144_0_);
    }
  }
  
  public static void bindCurrentTexture()
  {
    GL11.glBindTexture(3553, p[o].b);
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
    if ((p_179135_0_ != s.a) || (p_179135_1_ != s.b) || (p_179135_2_ != s.c) || (p_179135_3_ != s.d))
    {
      s.a = p_179135_0_;
      s.b = p_179135_1_;
      s.c = p_179135_2_;
      s.d = p_179135_3_;
      GL11.glColorMask(p_179135_0_, p_179135_1_, p_179135_2_, p_179135_3_);
    }
  }
  
  public static void a(double p_179151_0_)
  {
    if (p_179151_0_ != l.a)
    {
      l.a = p_179151_0_;
      GL11.glClearDepth(p_179151_0_);
    }
  }
  
  public static void a(float p_179082_0_, float p_179082_1_, float p_179082_2_, float p_179082_3_)
  {
    if ((p_179082_0_ != l.b.a) || (p_179082_1_ != l.b.b) || (p_179082_2_ != l.b.c) || (p_179082_3_ != l.b.d))
    {
      l.b.a = p_179082_0_;
      l.b.b = p_179082_1_;
      l.b.c = p_179082_2_;
      l.b.d = p_179082_3_;
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
    if ((p_179131_0_ != t.a) || (p_179131_1_ != t.b) || (p_179131_2_ != t.c) || (p_179131_3_ != t.d))
    {
      t.a = p_179131_0_;
      t.b = p_179131_1_;
      t.c = p_179131_2_;
      t.d = p_179131_3_;
      GL11.glColor4f(p_179131_0_, p_179131_1_, p_179131_2_, p_179131_3_);
    }
  }
  
  public static void c(float p_179124_0_, float p_179124_1_, float p_179124_2_)
  {
    c(p_179124_0_, p_179124_1_, p_179124_2_, 1.0F);
  }
  
  public static void G()
  {
    t.a = (t.b = t.c = t.d = -1.0F);
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
    return p[o].b;
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
      this.a = new bfl.c(3008);
      this.b = 519;
      this.c = -1.0F;
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
      this.a = new bfl.c(3042);
      this.b = 1;
      this.c = 0;
      this.d = 1;
      this.e = 0;
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
      this.a = p_i46267_1_;
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
      if (p_179199_1_ != this.b)
      {
        this.b = p_179199_1_;
        if (p_179199_1_) {
          GL11.glEnable(this.a);
        } else {
          GL11.glDisable(this.a);
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
      this.a = 1.0D;
      this.b = new bfl.e(0.0F, 0.0F, 0.0F, 0.0F);
      this.c = 0;
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
      this.a = p_i46265_1_;
      this.b = p_i46265_2_;
      this.c = p_i46265_3_;
      this.d = p_i46265_4_;
    }
  }
  
  static class f
  {
    public bfl.c a;
    public int b;
    private static final String __OBFID = "CL_00002551";
    
    private f()
    {
      this.a = new bfl.c(3058);
      this.b = 5379;
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
      this.a = true;
      this.b = true;
      this.c = true;
      this.d = true;
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
      this.a = new bfl.c(2903);
      this.b = 1032;
      this.c = 5634;
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
      this.a = new bfl.c(2884);
      this.b = 1029;
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
      this.a = new bfl.c(2929);
      this.b = true;
      this.c = 513;
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
      this.a = new bfl.c(2912);
      this.b = 2048;
      this.c = 1.0F;
      this.d = 0.0F;
      this.e = 1.0F;
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
      this.a = new bfl.c(32823);
      this.b = new bfl.c(10754);
      this.c = 0.0F;
      this.d = 0.0F;
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
      this.a = 519;
      this.b = 0;
      this.c = -1;
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
      this.a = new bfl.m((bfl.1)null);
      this.b = -1;
      this.c = 7680;
      this.d = 7680;
      this.e = 7680;
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
      this.b = p_i46254_1_;
      this.a = new bfl.c(p_i46254_2_);
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
      this.a = new bfl.p(8192, 3168);
      this.b = new bfl.p(8193, 3169);
      this.c = new bfl.p(8194, 3170);
      this.d = new bfl.p(8195, 3171);
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
      this.a = new bfl.c(3553);
      this.b = 0;
    }
    
    r(bfl.1 p_i46252_1_)
    {
      this();
    }
  }
}
