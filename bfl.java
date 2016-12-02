import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class bfl
{
  private static bfl.a a = new bfl.a(null);
  private static bfl.c b = new bfl.c(2896);
  private static bfl.c[] c = new bfl.c[8];
  private static bfl.h d = new bfl.h(null);
  private static bfl.b e = new bfl.b(null);
  private static bfl.j f = new bfl.j(null);
  private static bfl.k g = new bfl.k(null);
  private static bfl.i h = new bfl.i(null);
  private static bfl.l i = new bfl.l(null);
  private static bfl.f j = new bfl.f(null);
  private static bfl.q k = new bfl.q(null);
  private static bfl.d l = new bfl.d(null);
  private static bfl.n m = new bfl.n(null);
  private static bfl.c n = new bfl.c(2977);
  private static int o = 0;
  private static bfl.r[] p = new bfl.r[8];
  private static int q = 7425;
  private static bfl.c r = new bfl.c(32826);
  private static bfl.g s = new bfl.g(null);
  private static bfl.e t = new bfl.e();
  
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
  
  public static void a(int ☃, float ☃)
  {
    if ((☃ != a.b) || (☃ != a.c))
    {
      a.b = ☃;
      a.c = ☃;
      GL11.glAlphaFunc(☃, ☃);
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
  
  public static void a(int ☃)
  {
    c[☃].b();
  }
  
  public static void b(int ☃)
  {
    c[☃].a();
  }
  
  public static void g()
  {
    d.a.b();
  }
  
  public static void h()
  {
    d.a.a();
  }
  
  public static void a(int ☃, int ☃)
  {
    if ((☃ != d.b) || (☃ != d.c))
    {
      d.b = ☃;
      d.c = ☃;
      GL11.glColorMaterial(☃, ☃);
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
  
  public static void c(int ☃)
  {
    if (☃ != f.c)
    {
      f.c = ☃;
      GL11.glDepthFunc(☃);
    }
  }
  
  public static void a(boolean ☃)
  {
    if (☃ != f.b)
    {
      f.b = ☃;
      GL11.glDepthMask(☃);
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
  
  public static void b(int ☃, int ☃)
  {
    if ((☃ != e.b) || (☃ != e.c))
    {
      e.b = ☃;
      e.c = ☃;
      GL11.glBlendFunc(☃, ☃);
    }
  }
  
  public static void a(int ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ != e.b) || (☃ != e.c) || (☃ != e.d) || (☃ != e.e))
    {
      e.b = ☃;
      e.c = ☃;
      e.d = ☃;
      e.e = ☃;
      bqs.c(☃, ☃, ☃, ☃);
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
  
  public static void d(int ☃)
  {
    if (☃ != g.b)
    {
      g.b = ☃;
      GL11.glFogi(2917, ☃);
    }
  }
  
  public static void a(float ☃)
  {
    if (☃ != g.c)
    {
      g.c = ☃;
      GL11.glFogf(2914, ☃);
    }
  }
  
  public static void b(float ☃)
  {
    if (☃ != g.d)
    {
      g.d = ☃;
      GL11.glFogf(2915, ☃);
    }
  }
  
  public static void c(float ☃)
  {
    if (☃ != g.e)
    {
      g.e = ☃;
      GL11.glFogf(2916, ☃);
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
  
  public static void e(int ☃)
  {
    if (☃ != h.b)
    {
      h.b = ☃;
      GL11.glCullFace(☃);
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
  
  public static void a(float ☃, float ☃)
  {
    if ((☃ != i.c) || (☃ != i.d))
    {
      i.c = ☃;
      i.d = ☃;
      GL11.glPolygonOffset(☃, ☃);
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
  
  public static void f(int ☃)
  {
    if (☃ != j.b)
    {
      j.b = ☃;
      GL11.glLogicOp(☃);
    }
  }
  
  public static void a(bfl.o ☃)
  {
    c(☃).a.b();
  }
  
  public static void b(bfl.o ☃)
  {
    c(☃).a.a();
  }
  
  public static void a(bfl.o ☃, int ☃)
  {
    bfl.p ☃ = c(☃);
    if (☃ != ☃.c)
    {
      ☃.c = ☃;
      GL11.glTexGeni(☃.b, 9472, ☃);
    }
  }
  
  public static void a(bfl.o ☃, int ☃, FloatBuffer ☃)
  {
    GL11.glTexGen(c(☃).b, ☃, ☃);
  }
  
  private static bfl.p c(bfl.o ☃)
  {
    switch (bfl.1.a[☃.ordinal()])
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
  
  public static void g(int ☃)
  {
    if (o != ☃ - bqs.q)
    {
      o = ☃ - bqs.q;
      bqs.k(☃);
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
  
  public static void h(int ☃)
  {
    GL11.glDeleteTextures(☃);
    for (bfl.r ☃ : p) {
      if (☃.b == ☃) {
        ☃.b = -1;
      }
    }
  }
  
  public static void i(int ☃)
  {
    if (☃ != p[o].b)
    {
      p[o].b = ☃;
      GL11.glBindTexture(3553, ☃);
    }
  }
  
  public static void z()
  {
    n.b();
  }
  
  public static void A()
  {
    n.a();
  }
  
  public static void j(int ☃)
  {
    if (☃ != q)
    {
      q = ☃;
      GL11.glShadeModel(☃);
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
  
  public static void b(int ☃, int ☃, int ☃, int ☃)
  {
    GL11.glViewport(☃, ☃, ☃, ☃);
  }
  
  public static void a(boolean ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    if ((☃ != s.a) || (☃ != s.b) || (☃ != s.c) || (☃ != s.d))
    {
      s.a = ☃;
      s.b = ☃;
      s.c = ☃;
      s.d = ☃;
      GL11.glColorMask(☃, ☃, ☃, ☃);
    }
  }
  
  public static void a(double ☃)
  {
    if (☃ != l.a)
    {
      l.a = ☃;
      GL11.glClearDepth(☃);
    }
  }
  
  public static void a(float ☃, float ☃, float ☃, float ☃)
  {
    if ((☃ != l.b.a) || (☃ != l.b.b) || (☃ != l.b.c) || (☃ != l.b.d))
    {
      l.b.a = ☃;
      l.b.b = ☃;
      l.b.c = ☃;
      l.b.d = ☃;
      GL11.glClearColor(☃, ☃, ☃, ☃);
    }
  }
  
  public static void m(int ☃)
  {
    GL11.glClear(☃);
  }
  
  public static void n(int ☃)
  {
    GL11.glMatrixMode(☃);
  }
  
  public static void D() {}
  
  public static void E() {}
  
  public static void F() {}
  
  public static void a(int ☃, FloatBuffer ☃)
  {
    GL11.glGetFloat(☃, ☃);
  }
  
  public static void a(double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    GL11.glOrtho(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public static void b(float ☃, float ☃, float ☃, float ☃)
  {
    GL11.glRotatef(☃, ☃, ☃, ☃);
  }
  
  public static void a(float ☃, float ☃, float ☃)
  {
    GL11.glScalef(☃, ☃, ☃);
  }
  
  public static void a(double ☃, double ☃, double ☃)
  {
    GL11.glScaled(☃, ☃, ☃);
  }
  
  public static void b(float ☃, float ☃, float ☃)
  {
    GL11.glTranslatef(☃, ☃, ☃);
  }
  
  public static void b(double ☃, double ☃, double ☃)
  {
    GL11.glTranslated(☃, ☃, ☃);
  }
  
  public static void a(FloatBuffer ☃)
  {
    GL11.glMultMatrix(☃);
  }
  
  public static void c(float ☃, float ☃, float ☃, float ☃)
  {
    if ((☃ != t.a) || (☃ != t.b) || (☃ != t.c) || (☃ != t.d))
    {
      t.a = ☃;
      t.b = ☃;
      t.c = ☃;
      t.d = ☃;
      GL11.glColor4f(☃, ☃, ☃, ☃);
    }
  }
  
  public static void c(float ☃, float ☃, float ☃)
  {
    c(☃, ☃, ☃, 1.0F);
  }
  
  public static void G()
  {
    t.a = (t.b = t.c = t.d = -1.0F);
  }
  
  public static void o(int ☃)
  {
    GL11.glCallList(☃);
  }
  
  static
  {
    for (int ☃ = 0; ☃ < 8; ☃++) {
      c[☃] = new bfl.c(16384 + ☃);
    }
    for (int ☃ = 0; ☃ < 8; ☃++) {
      p[☃] = new bfl.r(null);
    }
  }
  
  static class r
  {
    public bfl.c a = new bfl.c(3553);
    public int b = 0;
  }
  
  static class a
  {
    public bfl.c a = new bfl.c(3008);
    public int b = 519;
    public float c = -1.0F;
  }
  
  static class h
  {
    public bfl.c a = new bfl.c(2903);
    public int b = 1032;
    public int c = 5634;
  }
  
  static class b
  {
    public bfl.c a = new bfl.c(3042);
    public int b = 1;
    public int c = 0;
    public int d = 1;
    public int e = 0;
  }
  
  static class j
  {
    public bfl.c a = new bfl.c(2929);
    public boolean b = true;
    public int c = 513;
  }
  
  static class k
  {
    public bfl.c a = new bfl.c(2912);
    public int b = 2048;
    public float c = 1.0F;
    public float d = 0.0F;
    public float e = 1.0F;
  }
  
  static class i
  {
    public bfl.c a = new bfl.c(2884);
    public int b = 1029;
  }
  
  static class l
  {
    public bfl.c a = new bfl.c(32823);
    public bfl.c b = new bfl.c(10754);
    public float c = 0.0F;
    public float d = 0.0F;
  }
  
  static class f
  {
    public bfl.c a = new bfl.c(3058);
    public int b = 5379;
  }
  
  static class d
  {
    public double a = 1.0D;
    public bfl.e b = new bfl.e(0.0F, 0.0F, 0.0F, 0.0F);
    public int c = 0;
  }
  
  static class m
  {
    public int a = 519;
    public int b = 0;
    public int c = -1;
  }
  
  static class n
  {
    public bfl.m a = new bfl.m(null);
    public int b = -1;
    public int c = 7680;
    public int d = 7680;
    public int e = 7680;
  }
  
  static class q
  {
    public bfl.p a = new bfl.p(8192, 3168);
    public bfl.p b = new bfl.p(8193, 3169);
    public bfl.p c = new bfl.p(8194, 3170);
    public bfl.p d = new bfl.p(8195, 3171);
  }
  
  static class p
  {
    public bfl.c a;
    public int b;
    public int c = -1;
    
    public p(int ☃, int ☃)
    {
      this.b = ☃;
      this.a = new bfl.c(☃);
    }
  }
  
  public static enum o
  {
    private o() {}
  }
  
  static class g
  {
    public boolean a = true;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
  }
  
  static class e
  {
    public float a = 1.0F;
    public float b = 1.0F;
    public float c = 1.0F;
    public float d = 1.0F;
    
    public e() {}
    
    public e(float ☃, float ☃, float ☃, float ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
      this.d = ☃;
    }
  }
  
  static class c
  {
    private final int a;
    private boolean b = false;
    
    public c(int ☃)
    {
      this.a = ☃;
    }
    
    public void a()
    {
      a(false);
    }
    
    public void b()
    {
      a(true);
    }
    
    public void a(boolean ☃)
    {
      if (☃ != this.b)
      {
        this.b = ☃;
        if (☃) {
          GL11.glEnable(this.a);
        } else {
          GL11.glDisable(this.a);
        }
      }
    }
  }
}
