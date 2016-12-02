import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import com.minimap.XaeroMinimap;
import com.minimap.events.Events;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class bfk
  implements bnj
{
  private static final Logger e = ;
  private static final jy f = new jy("textures/environment/rain.png");
  private static final jy g = new jy("textures/environment/snow.png");
  public static boolean a;
  public static int b;
  private ave h;
  private final bni i;
  private Random j = new Random();
  private float k;
  public final bfn c;
  private final avq l;
  private int m;
  private pk n;
  private nv o = new nv();
  private nv p = new nv();
  private float q = 4.0F;
  private float r = 4.0F;
  private float s;
  private float t;
  private float u;
  private float v;
  private float w;
  private float x;
  private float y;
  private float z;
  private float A;
  private boolean B;
  private boolean C = true;
  private boolean D = true;
  private long E = ave.J();
  private long F;
  private final blz G;
  private final int[] H;
  private final jy I;
  private boolean J;
  private float K;
  private float L;
  private int M;
  private float[] N = new float['Ѐ'];
  private float[] O = new float['Ѐ'];
  private FloatBuffer P = avd.h(16);
  private float Q;
  private float R;
  private float S;
  private float T;
  private float U;
  private int V = 0;
  private boolean W = false;
  private double X = 1.0D;
  private double Y;
  private double Z;
  private blr aa;
  private static final jy[] ab = { new jy("shaders/post/notch.json"), new jy("shaders/post/fxaa.json"), new jy("shaders/post/art.json"), new jy("shaders/post/bumpy.json"), new jy("shaders/post/blobs2.json"), new jy("shaders/post/pencil.json"), new jy("shaders/post/color_convolve.json"), new jy("shaders/post/deconverge.json"), new jy("shaders/post/flip.json"), new jy("shaders/post/invert.json"), new jy("shaders/post/ntsc.json"), new jy("shaders/post/outline.json"), new jy("shaders/post/phosphor.json"), new jy("shaders/post/scan_pincushion.json"), new jy("shaders/post/sobel.json"), new jy("shaders/post/bits.json"), new jy("shaders/post/desaturate.json"), new jy("shaders/post/green.json"), new jy("shaders/post/blur.json"), new jy("shaders/post/wobble.json"), new jy("shaders/post/blobs.json"), new jy("shaders/post/antialias.json"), new jy("shaders/post/creeper.json"), new jy("shaders/post/spider.json") };
  public static final int d = ab.length;
  private int ac;
  private boolean ad;
  private int ae;
  
  public bfk(ave mcIn, bni resourceManagerIn)
  {
    this.ac = d;
    this.ad = false;
    this.ae = 0;
    this.h = mcIn;
    this.i = resourceManagerIn;
    this.c = mcIn.ah();
    this.l = new avq(mcIn.P());
    this.G = new blz(16, 16);
    this.I = mcIn.P().a("lightMap", this.G);
    this.H = this.G.e();
    this.aa = null;
    for (int i = 0; i < 32; i++) {
      for (int j = 0; j < 32; j++)
      {
        float f = j - 16;
        float f1 = i - 16;
        float f2 = ns.c(f * f + f1 * f1);
        this.N[(i << 5 | j)] = (-f1 / f2);
        this.O[(i << 5 | j)] = (f / f2);
      }
    }
  }
  
  public boolean a()
  {
    return (bqs.O) && (this.aa != null);
  }
  
  public void b()
  {
    if (this.aa != null) {
      this.aa.a();
    }
    this.aa = null;
    this.ac = d;
  }
  
  public void c()
  {
    this.ad = (!this.ad);
  }
  
  public void a(pk entityIn)
  {
    if (bqs.O)
    {
      if (this.aa != null) {
        this.aa.a();
      }
      this.aa = null;
      if ((entityIn instanceof vn)) {
        a(new jy("shaders/post/creeper.json"));
      } else if ((entityIn instanceof wc)) {
        a(new jy("shaders/post/spider.json"));
      } else if ((entityIn instanceof vo)) {
        a(new jy("shaders/post/invert.json"));
      }
    }
  }
  
  public void d()
  {
    if (bqs.O) {
      if ((this.h.ac() instanceof wn))
      {
        if (this.aa != null) {
          this.aa.a();
        }
        this.ac = ((this.ac + 1) % (ab.length + 1));
        if (this.ac != d) {
          a(ab[this.ac]);
        } else {
          this.aa = null;
        }
      }
    }
  }
  
  private void a(jy resourceLocationIn)
  {
    try
    {
      this.aa = new blr(this.h.P(), this.i, this.h.b(), resourceLocationIn);
      this.aa.a(this.h.d, this.h.e);
      this.ad = true;
    }
    catch (IOException ioexception)
    {
      e.warn("Failed to load shader: " + resourceLocationIn, ioexception);
      this.ac = d;
      this.ad = false;
    }
    catch (JsonSyntaxException jsonsyntaxexception)
    {
      e.warn("Failed to load shader: " + resourceLocationIn, jsonsyntaxexception);
      this.ac = d;
      this.ad = false;
    }
  }
  
  public void a(bni resourceManager)
  {
    if (this.aa != null) {
      this.aa.a();
    }
    this.aa = null;
    if (this.ac != d) {
      a(ab[this.ac]);
    } else {
      a(this.h.ac());
    }
  }
  
  public void e()
  {
    if ((bqs.O) && (blu.b() == null)) {
      blu.a();
    }
    l();
    m();
    this.T = this.U;
    this.r = this.q;
    if (this.h.t.aF)
    {
      float f = this.h.t.a * 0.6F + 0.2F;
      float f1 = f * f * f * 8.0F;
      this.u = this.o.a(this.s, 0.05F * f1);
      this.v = this.p.a(this.t, 0.05F * f1);
      this.w = 0.0F;
      this.s = 0.0F;
      this.t = 0.0F;
    }
    else
    {
      this.u = 0.0F;
      this.v = 0.0F;
      this.o.a();
      this.p.a();
    }
    if (this.h.ac() == null) {
      this.h.a(this.h.h);
    }
    float f3 = this.h.f.o(new cj(this.h.ac()));
    float f4 = this.h.t.c / 32.0F;
    float f2 = f3 * (1.0F - f4) + f4;
    this.U += (f2 - this.U) * 0.1F;
    this.m += 1;
    this.c.a();
    o();
    this.A = this.z;
    if (bfc.d)
    {
      this.z += 0.05F;
      if (this.z > 1.0F) {
        this.z = 1.0F;
      }
      bfc.d = false;
    }
    else if (this.z > 0.0F)
    {
      this.z -= 0.0125F;
    }
  }
  
  public blr f()
  {
    return this.aa;
  }
  
  public void a(int width, int height)
  {
    if (bqs.O)
    {
      if (this.aa != null) {
        this.aa.a(width, height);
      }
      this.h.g.a(width, height);
    }
  }
  
  public void a(float partialTicks)
  {
    pk entity = this.h.ac();
    if (entity != null) {
      if (this.h.f != null)
      {
        this.h.A.a("pick");
        this.h.i = null;
        double d0 = this.h.c.d();
        this.h.s = entity.a(d0, partialTicks);
        double d1 = d0;
        aui vec3 = entity.e(partialTicks);
        boolean flag = false;
        int i = 3;
        if (this.h.c.i())
        {
          d0 = 6.0D;
          d1 = 6.0D;
        }
        else if (d0 > 3.0D)
        {
          flag = true;
        }
        if (this.h.s != null) {
          d1 = this.h.s.c.f(vec3);
        }
        aui vec31 = entity.d(partialTicks);
        aui vec32 = vec3.b(vec31.a * d0, vec31.b * d0, vec31.c * d0);
        this.n = null;
        aui vec33 = null;
        float f = 1.0F;
        List<pk> list = this.h.f.a(entity, entity.aR().a(vec31.a * d0, vec31.b * d0, vec31.c * d0).b(f, f, f), Predicates.and(po.d, new Predicate()
        {
          public boolean a(pk p_apply_1_)
          {
            return p_apply_1_.ad();
          }
        }));
        double d2 = d1;
        for (int j = 0; j < list.size(); j++)
        {
          pk entity1 = (pk)list.get(j);
          float f1 = entity1.ao();
          aug axisalignedbb = entity1.aR().b(f1, f1, f1);
          auh movingobjectposition = axisalignedbb.a(vec3, vec32);
          if (axisalignedbb.a(vec3))
          {
            if (d2 >= 0.0D)
            {
              this.n = entity1;
              vec33 = movingobjectposition == null ? vec3 : movingobjectposition.c;
              d2 = 0.0D;
            }
          }
          else if (movingobjectposition != null)
          {
            double d3 = vec3.f(movingobjectposition.c);
            if ((d3 < d2) || (d2 == 0.0D)) {
              if (entity1 == entity.m)
              {
                if (d2 == 0.0D)
                {
                  this.n = entity1;
                  vec33 = movingobjectposition.c;
                }
              }
              else
              {
                this.n = entity1;
                vec33 = movingobjectposition.c;
                d2 = d3;
              }
            }
          }
        }
        if ((this.n != null) && (flag) && (vec3.f(vec33) > 3.0D))
        {
          this.n = null;
          this.h.s = new auh(auh.a.a, vec33, (cq)null, new cj(vec33));
        }
        if ((this.n != null) && ((d2 < d1) || (this.h.s == null)))
        {
          this.h.s = new auh(this.n, vec33);
          if (((this.n instanceof pr)) || ((this.n instanceof uo))) {
            this.h.i = this.n;
          }
        }
        this.h.A.b();
      }
    }
  }
  
  private void l()
  {
    float f = 1.0F;
    if ((this.h.ac() instanceof bet))
    {
      bet abstractclientplayer = (bet)this.h.ac();
      f = abstractclientplayer.o();
    }
    this.y = this.x;
    this.x += (f - this.x) * 0.5F;
    if (this.x > 1.5F) {
      this.x = 1.5F;
    }
    if (this.x < 0.1F) {
      this.x = 0.1F;
    }
  }
  
  private float a(float partialTicks, boolean p_78481_2_)
  {
    if (this.W) {
      return 90.0F;
    }
    pk entity = this.h.ac();
    float f = 70.0F;
    if (p_78481_2_)
    {
      f = this.h.t.aH;
      f *= (this.y + (this.x - this.y) * partialTicks);
    }
    if (((entity instanceof pr)) && (((pr)entity).bn() <= 0.0F))
    {
      float f1 = ((pr)entity).ax + partialTicks;
      f /= ((1.0F - 500.0F / (f1 + 500.0F)) * 2.0F + 1.0F);
    }
    afh block = auz.a(this.h.f, entity, partialTicks);
    if (block.t() == arm.h) {
      f = f * 60.0F / 70.0F;
    }
    return f;
  }
  
  private void d(float partialTicks)
  {
    if ((this.h.ac() instanceof pr))
    {
      pr entitylivingbase = (pr)this.h.ac();
      float f = entitylivingbase.au - partialTicks;
      if (entitylivingbase.bn() <= 0.0F)
      {
        float f1 = entitylivingbase.ax + partialTicks;
        bfl.b(40.0F - 8000.0F / (f1 + 200.0F), 0.0F, 0.0F, 1.0F);
      }
      if (f < 0.0F) {
        return;
      }
      f /= entitylivingbase.av;
      f = ns.a(f * f * f * f * 3.1415927F);
      float f2 = entitylivingbase.aw;
      bfl.b(-f2, 0.0F, 1.0F, 0.0F);
      bfl.b(-f * 14.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(f2, 0.0F, 1.0F, 0.0F);
    }
  }
  
  private void e(float partialTicks)
  {
    if ((this.h.ac() instanceof wn))
    {
      wn entityplayer = (wn)this.h.ac();
      float f = entityplayer.M - entityplayer.L;
      float f1 = -(entityplayer.M + f * partialTicks);
      float f2 = entityplayer.bn + (entityplayer.bo - entityplayer.bn) * partialTicks;
      float f3 = entityplayer.aE + (entityplayer.aF - entityplayer.aE) * partialTicks;
      bfl.b(ns.a(f1 * 3.1415927F) * f2 * 0.5F, -Math.abs(ns.b(f1 * 3.1415927F) * f2), 0.0F);
      bfl.b(ns.a(f1 * 3.1415927F) * f2 * 3.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(Math.abs(ns.b(f1 * 3.1415927F - 0.2F) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
      bfl.b(f3, 1.0F, 0.0F, 0.0F);
    }
  }
  
  private void f(float partialTicks)
  {
    pk entity = this.h.ac();
    float f = entity.aS();
    double d0 = entity.p + (entity.s - entity.p) * partialTicks;
    double d1 = entity.q + (entity.t - entity.q) * partialTicks + f;
    double d2 = entity.r + (entity.u - entity.r) * partialTicks;
    if (((entity instanceof pr)) && (((pr)entity).bJ()))
    {
      f = (float)(f + 1.0D);
      bfl.b(0.0F, 0.3F, 0.0F);
      if (!this.h.t.aG)
      {
        cj blockpos = new cj(entity);
        alz iblockstate = this.h.f.p(blockpos);
        afh block = iblockstate.c();
        if (block == afi.C)
        {
          int j = ((cq)iblockstate.b(afg.O)).b();
          bfl.b(j * 90, 0.0F, 1.0F, 0.0F);
        }
        bfl.b(entity.A + (entity.y - entity.A) * partialTicks + 180.0F, 0.0F, -1.0F, 0.0F);
        bfl.b(entity.B + (entity.z - entity.B) * partialTicks, -1.0F, 0.0F, 0.0F);
      }
    }
    else if (this.h.t.aA > 0)
    {
      double d3 = this.r + (this.q - this.r) * partialTicks;
      if (this.h.t.aG)
      {
        bfl.b(0.0F, 0.0F, (float)-d3);
      }
      else
      {
        float f1 = entity.y;
        float f2 = entity.z;
        if (this.h.t.aA == 2) {
          f2 += 180.0F;
        }
        double d4 = -ns.a(f1 / 180.0F * 3.1415927F) * ns.b(f2 / 180.0F * 3.1415927F) * d3;
        double d5 = ns.b(f1 / 180.0F * 3.1415927F) * ns.b(f2 / 180.0F * 3.1415927F) * d3;
        double d6 = -ns.a(f2 / 180.0F * 3.1415927F) * d3;
        for (int i = 0; i < 8; i++)
        {
          float f3 = (i & 0x1) * 2 - 1;
          float f4 = (i >> 1 & 0x1) * 2 - 1;
          float f5 = (i >> 2 & 0x1) * 2 - 1;
          f3 *= 0.1F;
          f4 *= 0.1F;
          f5 *= 0.1F;
          auh movingobjectposition = this.h.f.a(new aui(d0 + f3, d1 + f4, d2 + f5), new aui(d0 - d4 + f3 + f5, d1 - d6 + f4, d2 - d5 + f5));
          if (movingobjectposition != null)
          {
            double d7 = movingobjectposition.c.f(new aui(d0, d1, d2));
            if (d7 < d3) {
              d3 = d7;
            }
          }
        }
        if (this.h.t.aA == 2) {
          bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
        }
        bfl.b(entity.z - f2, 1.0F, 0.0F, 0.0F);
        bfl.b(entity.y - f1, 0.0F, 1.0F, 0.0F);
        bfl.b(0.0F, 0.0F, (float)-d3);
        bfl.b(f1 - entity.y, 0.0F, 1.0F, 0.0F);
        bfl.b(f2 - entity.z, 1.0F, 0.0F, 0.0F);
      }
    }
    else
    {
      bfl.b(0.0F, 0.0F, -0.1F);
    }
    if (!this.h.t.aG)
    {
      bfl.b(entity.B + (entity.z - entity.B) * partialTicks, 1.0F, 0.0F, 0.0F);
      if ((entity instanceof tm))
      {
        tm entityanimal = (tm)entity;
        bfl.b(entityanimal.aL + (entityanimal.aK - entityanimal.aL) * partialTicks + 180.0F, 0.0F, 1.0F, 0.0F);
      }
      else
      {
        bfl.b(entity.A + (entity.y - entity.A) * partialTicks + 180.0F, 0.0F, 1.0F, 0.0F);
      }
    }
    bfl.b(0.0F, -f, 0.0F);
    d0 = entity.p + (entity.s - entity.p) * partialTicks;
    d1 = entity.q + (entity.t - entity.q) * partialTicks + f;
    d2 = entity.r + (entity.u - entity.r) * partialTicks;
    this.B = this.h.g.a(d0, d1, d2, partialTicks);
  }
  
  private void a(float partialTicks, int pass)
  {
    this.k = (this.h.t.c * 16);
    bfl.n(5889);
    bfl.D();
    float f = 0.07F;
    if (this.h.t.e) {
      bfl.b(-(pass * 2 - 1) * f, 0.0F, 0.0F);
    }
    if (this.X != 1.0D)
    {
      bfl.b((float)this.Y, (float)-this.Z, 0.0F);
      bfl.a(this.X, this.X, 1.0D);
    }
    Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.k * ns.a);
    bfl.n(5888);
    bfl.D();
    if (this.h.t.e) {
      bfl.b((pass * 2 - 1) * 0.1F, 0.0F, 0.0F);
    }
    d(partialTicks);
    if (this.h.t.d) {
      e(partialTicks);
    }
    float f1 = this.h.h.bI + (this.h.h.bH - this.h.h.bI) * partialTicks;
    if (f1 > 0.0F)
    {
      int i = 20;
      if (this.h.h.a(pe.k)) {
        i = 7;
      }
      float f2 = 5.0F / (f1 * f1 + 5.0F) - f1 * 0.04F;
      f2 *= f2;
      bfl.b((this.m + partialTicks) * i, 0.0F, 1.0F, 1.0F);
      bfl.a(1.0F / f2, 1.0F, 1.0F);
      bfl.b(-(this.m + partialTicks) * i, 0.0F, 1.0F, 1.0F);
    }
    f(partialTicks);
    if (this.W) {
      switch (this.V)
      {
      case 0: 
        bfl.b(90.0F, 0.0F, 1.0F, 0.0F);
        break;
      case 1: 
        bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
        break;
      case 2: 
        bfl.b(-90.0F, 0.0F, 1.0F, 0.0F);
        break;
      case 3: 
        bfl.b(90.0F, 1.0F, 0.0F, 0.0F);
        break;
      case 4: 
        bfl.b(-90.0F, 1.0F, 0.0F, 0.0F);
      }
    }
  }
  
  private void b(float partialTicks, int xOffset)
  {
    if (!this.W)
    {
      bfl.n(5889);
      bfl.D();
      float f = 0.07F;
      if (this.h.t.e) {
        bfl.b(-(xOffset * 2 - 1) * f, 0.0F, 0.0F);
      }
      Project.gluPerspective(a(partialTicks, false), this.h.d / this.h.e, 0.05F, this.k * 2.0F);
      bfl.n(5888);
      bfl.D();
      if (this.h.t.e) {
        bfl.b((xOffset * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }
      bfl.E();
      d(partialTicks);
      if (this.h.t.d) {
        e(partialTicks);
      }
      boolean flag = ((this.h.ac() instanceof pr)) && (((pr)this.h.ac()).bJ());
      if ((this.h.t.aA == 0) && (!flag) && (!this.h.t.az) && (!this.h.c.a()))
      {
        i();
        this.c.a(partialTicks);
        h();
      }
      bfl.F();
      if ((this.h.t.aA == 0) && (!flag))
      {
        this.c.b(partialTicks);
        d(partialTicks);
      }
      if (this.h.t.d) {
        e(partialTicks);
      }
    }
  }
  
  public void h()
  {
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
  }
  
  public void i()
  {
    bfl.g(bqs.r);
    bfl.n(5890);
    bfl.D();
    float f = 0.00390625F;
    bfl.a(f, f, f);
    bfl.b(8.0F, 8.0F, 8.0F);
    bfl.n(5888);
    this.h.P().a(this.I);
    GL11.glTexParameteri(3553, 10241, 9729);
    GL11.glTexParameteri(3553, 10240, 9729);
    GL11.glTexParameteri(3553, 10242, 10496);
    GL11.glTexParameteri(3553, 10243, 10496);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.w();
    bfl.g(bqs.q);
  }
  
  private void m()
  {
    this.L = ((float)(this.L + (Math.random() - Math.random()) * Math.random() * Math.random()));
    this.L = ((float)(this.L * 0.9D));
    this.K += (this.L - this.K) * 1.0F;
    this.J = true;
  }
  
  private void g(float partialTicks)
  {
    if (this.J)
    {
      this.h.A.a("lightTex");
      adm world = this.h.f;
      if (world != null)
      {
        float f = world.b(1.0F);
        float f1 = f * 0.95F + 0.05F;
        for (int i = 0; i < 256; i++)
        {
          float f2 = world.t.p()[(i / 16)] * f1;
          float f3 = world.t.p()[(i % 16)] * (this.K * 0.1F + 1.5F);
          if (world.ac() > 0) {
            f2 = world.t.p()[(i / 16)];
          }
          float f4 = f2 * (f * 0.65F + 0.35F);
          float f5 = f2 * (f * 0.65F + 0.35F);
          float f6 = f3 * ((f3 * 0.6F + 0.4F) * 0.6F + 0.4F);
          float f7 = f3 * (f3 * f3 * 0.6F + 0.4F);
          float f8 = f4 + f3;
          float f9 = f5 + f6;
          float f10 = f2 + f7;
          f8 = f8 * 0.96F + 0.03F;
          f9 = f9 * 0.96F + 0.03F;
          f10 = f10 * 0.96F + 0.03F;
          if (this.z > 0.0F)
          {
            float f11 = this.A + (this.z - this.A) * partialTicks;
            f8 = f8 * (1.0F - f11) + f8 * 0.7F * f11;
            f9 = f9 * (1.0F - f11) + f9 * 0.6F * f11;
            f10 = f10 * (1.0F - f11) + f10 * 0.6F * f11;
          }
          if (world.t.q() == 1)
          {
            f8 = 0.22F + f3 * 0.75F;
            f9 = 0.28F + f6 * 0.75F;
            f10 = 0.25F + f7 * 0.75F;
          }
          if (this.h.h.a(pe.r))
          {
            float f15 = a(this.h.h, partialTicks);
            float f12 = 1.0F / f8;
            if (f12 > 1.0F / f9) {
              f12 = 1.0F / f9;
            }
            if (f12 > 1.0F / f10) {
              f12 = 1.0F / f10;
            }
            f8 = f8 * (1.0F - f15) + f8 * f12 * f15;
            f9 = f9 * (1.0F - f15) + f9 * f12 * f15;
            f10 = f10 * (1.0F - f15) + f10 * f12 * f15;
          }
          if (f8 > 1.0F) {
            f8 = 1.0F;
          }
          if (f9 > 1.0F) {
            f9 = 1.0F;
          }
          if (f10 > 1.0F) {
            f10 = 1.0F;
          }
          float f16 = this.h.t.aI;
          float f17 = 1.0F - f8;
          float f13 = 1.0F - f9;
          float f14 = 1.0F - f10;
          f17 = 1.0F - f17 * f17 * f17 * f17;
          f13 = 1.0F - f13 * f13 * f13 * f13;
          f14 = 1.0F - f14 * f14 * f14 * f14;
          f8 = f8 * (1.0F - f16) + f17 * f16;
          f9 = f9 * (1.0F - f16) + f13 * f16;
          f10 = f10 * (1.0F - f16) + f14 * f16;
          f8 = f8 * 0.96F + 0.03F;
          f9 = f9 * 0.96F + 0.03F;
          f10 = f10 * 0.96F + 0.03F;
          if (f8 > 1.0F) {
            f8 = 1.0F;
          }
          if (f9 > 1.0F) {
            f9 = 1.0F;
          }
          if (f10 > 1.0F) {
            f10 = 1.0F;
          }
          if (f8 < 0.0F) {
            f8 = 0.0F;
          }
          if (f9 < 0.0F) {
            f9 = 0.0F;
          }
          if (f10 < 0.0F) {
            f10 = 0.0F;
          }
          int j = 255;
          int k = (int)(f8 * 255.0F);
          int l = (int)(f9 * 255.0F);
          int i1 = (int)(f10 * 255.0F);
          this.H[i] = (j << 24 | k << 16 | l << 8 | i1);
        }
        this.G.d();
        this.J = false;
        this.h.A.b();
      }
    }
  }
  
  private float a(pr entitylivingbaseIn, float partialTicks)
  {
    int i = entitylivingbaseIn.b(pe.r).b();
    return i > 200 ? 1.0F : 0.7F + ns.a((i - partialTicks) * 3.1415927F * 0.2F) * 0.3F;
  }
  
  public void a(float p_181560_1_, long p_181560_2_)
  {
    boolean flag = Display.isActive();
    if ((!flag) && (this.h.t.z) && ((!this.h.t.A) || (!Mouse.isButtonDown(1))))
    {
      if (ave.J() - this.E > 500L) {
        this.h.p();
      }
    }
    else {
      this.E = ave.J();
    }
    this.h.A.a("mouse");
    if ((flag) && (ave.a) && (this.h.w) && (!Mouse.isInsideWindow()))
    {
      Mouse.setGrabbed(false);
      Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
      Mouse.setGrabbed(true);
    }
    if ((this.h.w) && (flag))
    {
      this.h.u.c();
      float f = this.h.t.a * 0.6F + 0.2F;
      float f1 = f * f * f * 8.0F;
      float f2 = this.h.u.a * f1;
      float f3 = this.h.u.b * f1;
      int i = 1;
      if (this.h.t.b) {
        i = -1;
      }
      if (this.h.t.aF)
      {
        this.s += f2;
        this.t += f3;
        float f4 = p_181560_1_ - this.w;
        this.w = p_181560_1_;
        f2 = this.u * f4;
        f3 = this.v * f4;
        this.h.h.c(f2, f3 * i);
      }
      else
      {
        this.s = 0.0F;
        this.t = 0.0F;
        this.h.h.c(f2, f3 * i);
      }
    }
    this.h.A.b();
    if (!this.h.r)
    {
      a = this.h.t.e;
      final avr scaledresolution = new avr(this.h);
      int i1 = scaledresolution.a();
      int j1 = scaledresolution.b();
      final int k1 = Mouse.getX() * i1 / this.h.d;
      final int l1 = j1 - Mouse.getY() * j1 / this.h.e - 1;
      int i2 = this.h.t.g;
      if (this.h.f != null)
      {
        this.h.A.a("level");
        int j = Math.min(ave.ai(), i2);
        j = Math.max(j, 60);
        long k = System.nanoTime() - p_181560_2_;
        long l = Math.max(1000000000 / j / 4 - k, 0L);
        b(p_181560_1_, System.nanoTime() + l);
        if (bqs.O)
        {
          this.h.g.c();
          if ((this.aa != null) && (this.ad))
          {
            bfl.n(5890);
            bfl.E();
            bfl.D();
            this.aa.a(p_181560_1_);
            bfl.F();
          }
          this.h.b().a(true);
        }
        this.F = System.nanoTime();
        this.h.A.c("gui");
        if ((!this.h.t.az) || (this.h.m != null))
        {
          bfl.a(516, 0.1F);
          this.h.q.a(p_181560_1_);
        }
        this.h.A.b();
      }
      else
      {
        bfl.b(0, 0, this.h.d, this.h.e);
        bfl.n(5889);
        bfl.D();
        bfl.n(5888);
        bfl.D();
        j();
        this.F = System.nanoTime();
      }
      if (this.h.m != null)
      {
        bfl.m(256);
        try
        {
          this.h.m.a(k1, l1, p_181560_1_);
        }
        catch (Throwable throwable)
        {
          b crashreport = b.a(throwable, "Rendering screen");
          c crashreportcategory = crashreport.a("Screen render details");
          crashreportcategory.a("Screen name", new Callable()
          {
            public String a()
              throws Exception
            {
              return bfk.a(bfk.this).m.getClass().getCanonicalName();
            }
          });
          crashreportcategory.a("Mouse location", new Callable()
          {
            public String a()
              throws Exception
            {
              return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", new Object[] { Integer.valueOf(k1), Integer.valueOf(l1), Integer.valueOf(Mouse.getX()), Integer.valueOf(Mouse.getY()) });
            }
          });
          crashreportcategory.a("Screen size", new Callable()
          {
            public String a()
              throws Exception
            {
              return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", new Object[] { Integer.valueOf(scaledresolution.a()), Integer.valueOf(scaledresolution.b()), Integer.valueOf(bfk.a(bfk.this).d), Integer.valueOf(bfk.a(bfk.this).e), Integer.valueOf(scaledresolution.e()) });
            }
          });
          throw new e(crashreport);
        }
      }
    }
  }
  
  public void b(float partialTicks)
  {
    j();
    this.h.q.c(new avr(this.h));
  }
  
  private boolean n()
  {
    if (!this.D) {
      return false;
    }
    pk entity = this.h.ac();
    boolean flag = ((entity instanceof wn)) && (!this.h.t.az);
    if ((flag) && (!((wn)entity).bA.e))
    {
      zx itemstack = ((wn)entity).bZ();
      if ((this.h.s != null) && (this.h.s.a == auh.a.b))
      {
        cj blockpos = this.h.s.a();
        afh block = this.h.f.p(blockpos).c();
        if (this.h.c.l() == adp.a.e) {
          flag = (block.z()) && ((this.h.f.s(blockpos) instanceof og));
        } else {
          flag = (itemstack != null) && ((itemstack.c(block)) || (itemstack.d(block)));
        }
      }
    }
    return flag;
  }
  
  private void h(float partialTicks)
  {
    if ((this.h.t.aB) && (!this.h.t.az) && (!this.h.h.cq()) && (!this.h.t.w))
    {
      pk entity = this.h.ac();
      bfl.l();
      bfl.a(770, 771, 1, 0);
      GL11.glLineWidth(1.0F);
      bfl.x();
      bfl.a(false);
      bfl.E();
      bfl.n(5888);
      bfl.D();
      f(partialTicks);
      bfl.b(0.0F, entity.aS(), 0.0F);
      bfr.a(new aug(0.0D, 0.0D, 0.0D, 0.005D, 1.0E-4D, 1.0E-4D), 255, 0, 0, 255);
      bfr.a(new aug(0.0D, 0.0D, 0.0D, 1.0E-4D, 1.0E-4D, 0.005D), 0, 0, 255, 255);
      bfr.a(new aug(0.0D, 0.0D, 0.0D, 1.0E-4D, 0.0033D, 1.0E-4D), 0, 255, 0, 255);
      bfl.F();
      bfl.a(true);
      bfl.w();
      bfl.k();
    }
  }
  
  public void b(float partialTicks, long finishTimeNano)
  {
    g(partialTicks);
    if (this.h.ac() == null) {
      this.h.a(this.h.h);
    }
    a(partialTicks);
    bfl.j();
    bfl.d();
    bfl.a(516, 0.5F);
    this.h.A.a("center");
    if (this.h.t.e)
    {
      b = 0;
      bfl.a(false, true, true, false);
      a(0, partialTicks, finishTimeNano);
      b = 1;
      bfl.a(true, false, false, false);
      a(1, partialTicks, finishTimeNano);
      bfl.a(true, true, true, false);
    }
    else
    {
      a(2, partialTicks, finishTimeNano);
    }
    this.h.A.b();
  }
  
  private void a(int pass, float partialTicks, long finishTimeNano)
  {
    bfr renderglobal = this.h.g;
    bec effectrenderer = this.h.j;
    boolean flag = n();
    bfl.o();
    this.h.A.c("clear");
    bfl.b(0, 0, this.h.d, this.h.e);
    i(partialTicks);
    bfl.m(16640);
    this.h.A.c("camera");
    a(partialTicks, pass);
    auz.a(this.h.h, this.h.t.aA == 2);
    this.h.A.c("frustum");
    bib.a();
    this.h.A.c("culling");
    bia icamera = new bic();
    pk entity = this.h.ac();
    double d0 = entity.P + (entity.s - entity.P) * partialTicks;
    double d1 = entity.Q + (entity.t - entity.Q) * partialTicks;
    double d2 = entity.R + (entity.u - entity.R) * partialTicks;
    icamera.a(d0, d1, d2);
    if (this.h.t.c >= 4)
    {
      a(-1, partialTicks);
      this.h.A.c("sky");
      bfl.n(5889);
      bfl.D();
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.k * 2.0F);
      bfl.n(5888);
      renderglobal.a(partialTicks, pass);
      bfl.n(5889);
      bfl.D();
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.k * ns.a);
      bfl.n(5888);
    }
    a(0, partialTicks);
    bfl.j(7425);
    if (entity.t + entity.aS() < 128.0D) {
      a(renderglobal, partialTicks, pass);
    }
    this.h.A.c("prepareterrain");
    a(0, partialTicks);
    this.h.P().a(bmh.g);
    avc.a();
    this.h.A.c("terrain_setup");
    renderglobal.a(entity, partialTicks, icamera, this.ae++, this.h.h.v());
    if ((pass == 0) || (pass == 2))
    {
      this.h.A.c("updatechunks");
      this.h.g.a(finishTimeNano);
    }
    this.h.A.c("terrain");
    bfl.n(5888);
    bfl.E();
    bfl.c();
    renderglobal.a(adf.a, partialTicks, pass, entity);
    bfl.d();
    renderglobal.a(adf.b, partialTicks, pass, entity);
    this.h.P().b(bmh.g).b(false, false);
    renderglobal.a(adf.c, partialTicks, pass, entity);
    this.h.P().b(bmh.g).a();
    bfl.j(7424);
    bfl.a(516, 0.1F);
    if (!this.W)
    {
      bfl.n(5888);
      bfl.F();
      bfl.E();
      avc.b();
      this.h.A.c("entities");
      renderglobal.a(entity, icamera, partialTicks);
      avc.a();
      h();
      bfl.n(5888);
      bfl.F();
      bfl.E();
      if ((this.h.s != null) && (entity.a(arm.h)) && (flag))
      {
        wn entityplayer = (wn)entity;
        bfl.c();
        this.h.A.c("outline");
        renderglobal.a(entityplayer, this.h.s, 0, partialTicks);
        bfl.d();
      }
    }
    bfl.n(5888);
    bfl.F();
    if ((flag) && (this.h.s != null) && (!entity.a(arm.h)))
    {
      wn entityplayer1 = (wn)entity;
      bfl.c();
      this.h.A.c("outline");
      renderglobal.a(entityplayer1, this.h.s, 0, partialTicks);
      bfl.d();
    }
    this.h.A.c("destroyProgress");
    bfl.l();
    bfl.a(770, 1, 1, 0);
    this.h.P().b(bmh.g).b(false, false);
    renderglobal.a(bfx.a(), bfx.a().c(), entity, partialTicks);
    this.h.P().b(bmh.g).a();
    bfl.k();
    if (!this.W)
    {
      i();
      this.h.A.c("litParticles");
      effectrenderer.b(entity, partialTicks);
      avc.a();
      a(0, partialTicks);
      this.h.A.c("particles");
      effectrenderer.a(entity, partialTicks);
      h();
    }
    bfl.a(false);
    bfl.o();
    this.h.A.c("weather");
    c(partialTicks);
    bfl.a(true);
    renderglobal.a(entity, partialTicks);
    bfl.k();
    bfl.o();
    bfl.a(770, 771, 1, 0);
    bfl.a(516, 0.1F);
    a(0, partialTicks);
    bfl.l();
    bfl.a(false);
    this.h.P().a(bmh.g);
    bfl.j(7425);
    this.h.A.c("translucent");
    renderglobal.a(adf.d, partialTicks, pass, entity);
    bfl.j(7424);
    bfl.a(true);
    bfl.o();
    bfl.k();
    bfl.n();
    if (entity.t + entity.aS() >= 128.0D)
    {
      this.h.A.c("aboveClouds");
      a(renderglobal, partialTicks, pass);
    }
    XaeroMinimap.events.renderLast(partialTicks);
    
    this.h.A.c("hand");
    if (this.C)
    {
      bfl.m(256);
      b(partialTicks, pass);
      h(partialTicks);
    }
  }
  
  private void a(bfr renderGlobalIn, float partialTicks, int pass)
  {
    if (this.h.t.e() != 0)
    {
      this.h.A.c("clouds");
      bfl.n(5889);
      bfl.D();
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.k * 4.0F);
      bfl.n(5888);
      bfl.E();
      a(0, partialTicks);
      renderGlobalIn.b(partialTicks, pass);
      bfl.n();
      bfl.F();
      bfl.n(5889);
      bfl.D();
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.k * ns.a);
      bfl.n(5888);
    }
  }
  
  private void o()
  {
    float f = this.h.f.j(1.0F);
    if (!this.h.t.i) {
      f /= 2.0F;
    }
    if (f != 0.0F)
    {
      this.j.setSeed(this.m * 312987231L);
      pk entity = this.h.ac();
      adm world = this.h.f;
      cj blockpos = new cj(entity);
      int i = 10;
      double d0 = 0.0D;
      double d1 = 0.0D;
      double d2 = 0.0D;
      int j = 0;
      int k = (int)(100.0F * f * f);
      if (this.h.t.aL == 1) {
        k >>= 1;
      } else if (this.h.t.aL == 2) {
        k = 0;
      }
      for (int l = 0; l < k; l++)
      {
        cj blockpos1 = world.q(blockpos.a(this.j.nextInt(i) - this.j.nextInt(i), 0, this.j.nextInt(i) - this.j.nextInt(i)));
        ady biomegenbase = world.b(blockpos1);
        cj blockpos2 = blockpos1.b();
        afh block = world.p(blockpos2).c();
        if ((blockpos1.o() <= blockpos.o() + i) && (blockpos1.o() >= blockpos.o() - i) && (biomegenbase.e()) && (biomegenbase.a(blockpos1) >= 0.15F))
        {
          double d3 = this.j.nextDouble();
          double d4 = this.j.nextDouble();
          if (block.t() == arm.i)
          {
            this.h.f.a(cy.l, blockpos1.n() + d3, blockpos1.o() + 0.1F - block.D(), blockpos1.p() + d4, 0.0D, 0.0D, 0.0D, new int[0]);
          }
          else if (block.t() != arm.a)
          {
            block.a(world, blockpos2);
            j++;
            if (this.j.nextInt(j) == 0)
            {
              d0 = blockpos2.n() + d3;
              d1 = blockpos2.o() + 0.1F + block.E() - 1.0D;
              d2 = blockpos2.p() + d4;
            }
            this.h.f.a(cy.N, blockpos2.n() + d3, blockpos2.o() + 0.1F + block.E(), blockpos2.p() + d4, 0.0D, 0.0D, 0.0D, new int[0]);
          }
        }
      }
      if ((j > 0) && (this.j.nextInt(3) < this.M++))
      {
        this.M = 0;
        if ((d1 > blockpos.o() + 1) && (world.q(blockpos).o() > ns.d(blockpos.o()))) {
          this.h.f.a(d0, d1, d2, "ambient.weather.rain", 0.1F, 0.5F, false);
        } else {
          this.h.f.a(d0, d1, d2, "ambient.weather.rain", 0.2F, 1.0F, false);
        }
      }
    }
  }
  
  protected void c(float partialTicks)
  {
    float f = this.h.f.j(partialTicks);
    if (f > 0.0F)
    {
      i();
      pk entity = this.h.ac();
      adm world = this.h.f;
      int i = ns.c(entity.s);
      int j = ns.c(entity.t);
      int k = ns.c(entity.u);
      bfx tessellator = bfx.a();
      bfd worldrenderer = tessellator.c();
      bfl.p();
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.a(516, 0.1F);
      double d0 = entity.P + (entity.s - entity.P) * partialTicks;
      double d1 = entity.Q + (entity.t - entity.Q) * partialTicks;
      double d2 = entity.R + (entity.u - entity.R) * partialTicks;
      int l = ns.c(d1);
      int i1 = 5;
      if (this.h.t.i) {
        i1 = 10;
      }
      int j1 = -1;
      float f1 = this.m + partialTicks;
      worldrenderer.c(-d0, -d1, -d2);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      cj.a blockpos$mutableblockpos = new cj.a();
      for (int k1 = k - i1; k1 <= k + i1; k1++) {
        for (int l1 = i - i1; l1 <= i + i1; l1++)
        {
          int i2 = (k1 - k + 16) * 32 + l1 - i + 16;
          double d3 = this.N[i2] * 0.5D;
          double d4 = this.O[i2] * 0.5D;
          blockpos$mutableblockpos.c(l1, 0, k1);
          ady biomegenbase = world.b(blockpos$mutableblockpos);
          if ((biomegenbase.e()) || (biomegenbase.d()))
          {
            int j2 = world.q(blockpos$mutableblockpos).o();
            int k2 = j - i1;
            int l2 = j + i1;
            if (k2 < j2) {
              k2 = j2;
            }
            if (l2 < j2) {
              l2 = j2;
            }
            int i3 = j2;
            if (j2 < l) {
              i3 = l;
            }
            if (k2 != l2)
            {
              this.j.setSeed(l1 * l1 * 3121 + l1 * 45238971 ^ k1 * k1 * 418711 + k1 * 13761);
              blockpos$mutableblockpos.c(l1, k2, k1);
              float f2 = biomegenbase.a(blockpos$mutableblockpos);
              if (world.v().a(f2, j2) >= 0.15F)
              {
                if (j1 != 0)
                {
                  if (j1 >= 0) {
                    tessellator.b();
                  }
                  j1 = 0;
                  this.h.P().a(f);
                  worldrenderer.a(7, bms.d);
                }
                double d5 = ((this.m + l1 * l1 * 3121 + l1 * 45238971 + k1 * k1 * 418711 + k1 * 13761 & 0x1F) + partialTicks) / 32.0D * (3.0D + this.j.nextDouble());
                double d6 = l1 + 0.5F - entity.s;
                double d7 = k1 + 0.5F - entity.u;
                float f3 = ns.a(d6 * d6 + d7 * d7) / i1;
                float f4 = ((1.0F - f3 * f3) * 0.5F + 0.5F) * f;
                blockpos$mutableblockpos.c(l1, i3, k1);
                int j3 = world.b(blockpos$mutableblockpos, 0);
                int k3 = j3 >> 16 & 0xFFFF;
                int l3 = j3 & 0xFFFF;
                worldrenderer.b(l1 - d3 + 0.5D, k2, k1 - d4 + 0.5D).a(0.0D, k2 * 0.25D + d5).a(1.0F, 1.0F, 1.0F, f4).a(k3, l3).d();
                worldrenderer.b(l1 + d3 + 0.5D, k2, k1 + d4 + 0.5D).a(1.0D, k2 * 0.25D + d5).a(1.0F, 1.0F, 1.0F, f4).a(k3, l3).d();
                worldrenderer.b(l1 + d3 + 0.5D, l2, k1 + d4 + 0.5D).a(1.0D, l2 * 0.25D + d5).a(1.0F, 1.0F, 1.0F, f4).a(k3, l3).d();
                worldrenderer.b(l1 - d3 + 0.5D, l2, k1 - d4 + 0.5D).a(0.0D, l2 * 0.25D + d5).a(1.0F, 1.0F, 1.0F, f4).a(k3, l3).d();
              }
              else
              {
                if (j1 != 1)
                {
                  if (j1 >= 0) {
                    tessellator.b();
                  }
                  j1 = 1;
                  this.h.P().a(g);
                  worldrenderer.a(7, bms.d);
                }
                double d8 = ((this.m & 0x1FF) + partialTicks) / 512.0F;
                double d9 = this.j.nextDouble() + f1 * 0.01D * (float)this.j.nextGaussian();
                double d10 = this.j.nextDouble() + f1 * (float)this.j.nextGaussian() * 0.001D;
                double d11 = l1 + 0.5F - entity.s;
                double d12 = k1 + 0.5F - entity.u;
                float f6 = ns.a(d11 * d11 + d12 * d12) / i1;
                float f5 = ((1.0F - f6 * f6) * 0.3F + 0.5F) * f;
                blockpos$mutableblockpos.c(l1, i3, k1);
                int i4 = (world.b(blockpos$mutableblockpos, 0) * 3 + 15728880) / 4;
                int j4 = i4 >> 16 & 0xFFFF;
                int k4 = i4 & 0xFFFF;
                worldrenderer.b(l1 - d3 + 0.5D, k2, k1 - d4 + 0.5D).a(0.0D + d9, k2 * 0.25D + d8 + d10).a(1.0F, 1.0F, 1.0F, f5).a(j4, k4).d();
                worldrenderer.b(l1 + d3 + 0.5D, k2, k1 + d4 + 0.5D).a(1.0D + d9, k2 * 0.25D + d8 + d10).a(1.0F, 1.0F, 1.0F, f5).a(j4, k4).d();
                worldrenderer.b(l1 + d3 + 0.5D, l2, k1 + d4 + 0.5D).a(1.0D + d9, l2 * 0.25D + d8 + d10).a(1.0F, 1.0F, 1.0F, f5).a(j4, k4).d();
                worldrenderer.b(l1 - d3 + 0.5D, l2, k1 - d4 + 0.5D).a(0.0D + d9, l2 * 0.25D + d8 + d10).a(1.0F, 1.0F, 1.0F, f5).a(j4, k4).d();
              }
            }
          }
        }
      }
      if (j1 >= 0) {
        tessellator.b();
      }
      worldrenderer.c(0.0D, 0.0D, 0.0D);
      bfl.o();
      bfl.k();
      bfl.a(516, 0.1F);
      h();
    }
  }
  
  public void j()
  {
    avr scaledresolution = new avr(this.h);
    bfl.m(256);
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, scaledresolution.c(), scaledresolution.d(), 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
  }
  
  private void i(float partialTicks)
  {
    adm world = this.h.f;
    pk entity = this.h.ac();
    float f = 0.25F + 0.75F * this.h.t.c / 32.0F;
    f = 1.0F - (float)Math.pow(f, 0.25D);
    aui vec3 = world.a(this.h.ac(), partialTicks);
    float f1 = (float)vec3.a;
    float f2 = (float)vec3.b;
    float f3 = (float)vec3.c;
    aui vec31 = world.f(partialTicks);
    this.Q = ((float)vec31.a);
    this.R = ((float)vec31.b);
    this.S = ((float)vec31.c);
    if (this.h.t.c >= 4)
    {
      double d0 = -1.0D;
      aui vec32 = ns.a(world.d(partialTicks)) > 0.0F ? new aui(d0, 0.0D, 0.0D) : new aui(1.0D, 0.0D, 0.0D);
      float f5 = (float)entity.d(partialTicks).b(vec32);
      if (f5 < 0.0F) {
        f5 = 0.0F;
      }
      if (f5 > 0.0F)
      {
        float[] afloat = world.t.a(world.c(partialTicks), partialTicks);
        if (afloat != null)
        {
          f5 *= afloat[3];
          this.Q = (this.Q * (1.0F - f5) + afloat[0] * f5);
          this.R = (this.R * (1.0F - f5) + afloat[1] * f5);
          this.S = (this.S * (1.0F - f5) + afloat[2] * f5);
        }
      }
    }
    this.Q += (f1 - this.Q) * f;
    this.R += (f2 - this.R) * f;
    this.S += (f3 - this.S) * f;
    float f8 = world.j(partialTicks);
    if (f8 > 0.0F)
    {
      float f4 = 1.0F - f8 * 0.5F;
      float f10 = 1.0F - f8 * 0.4F;
      this.Q *= f4;
      this.R *= f4;
      this.S *= f10;
    }
    float f9 = world.h(partialTicks);
    if (f9 > 0.0F)
    {
      float f11 = 1.0F - f9 * 0.5F;
      this.Q *= f11;
      this.R *= f11;
      this.S *= f11;
    }
    afh block = auz.a(this.h.f, entity, partialTicks);
    if (this.B)
    {
      aui vec33 = world.e(partialTicks);
      this.Q = ((float)vec33.a);
      this.R = ((float)vec33.b);
      this.S = ((float)vec33.c);
    }
    else if (block.t() == arm.h)
    {
      float f12 = ack.a(entity) * 0.2F;
      if (((entity instanceof pr)) && (((pr)entity).a(pe.o))) {
        f12 = f12 * 0.3F + 0.6F;
      }
      this.Q = (0.02F + f12);
      this.R = (0.02F + f12);
      this.S = (0.2F + f12);
    }
    else if (block.t() == arm.i)
    {
      this.Q = 0.6F;
      this.R = 0.1F;
      this.S = 0.0F;
    }
    float f13 = this.T + (this.U - this.T) * partialTicks;
    this.Q *= f13;
    this.R *= f13;
    this.S *= f13;
    double d1 = (entity.Q + (entity.t - entity.Q) * partialTicks) * world.t.j();
    if (((entity instanceof pr)) && (((pr)entity).a(pe.q)))
    {
      int i = ((pr)entity).b(pe.q).b();
      if (i < 20) {
        d1 *= (1.0F - i / 20.0F);
      } else {
        d1 = 0.0D;
      }
    }
    if (d1 < 1.0D)
    {
      if (d1 < 0.0D) {
        d1 = 0.0D;
      }
      d1 *= d1;
      this.Q = ((float)(this.Q * d1));
      this.R = ((float)(this.R * d1));
      this.S = ((float)(this.S * d1));
    }
    if (this.z > 0.0F)
    {
      float f14 = this.A + (this.z - this.A) * partialTicks;
      this.Q = (this.Q * (1.0F - f14) + this.Q * 0.7F * f14);
      this.R = (this.R * (1.0F - f14) + this.R * 0.6F * f14);
      this.S = (this.S * (1.0F - f14) + this.S * 0.6F * f14);
    }
    if (((entity instanceof pr)) && (((pr)entity).a(pe.r)))
    {
      float f15 = a((pr)entity, partialTicks);
      float f6 = 1.0F / this.Q;
      if (f6 > 1.0F / this.R) {
        f6 = 1.0F / this.R;
      }
      if (f6 > 1.0F / this.S) {
        f6 = 1.0F / this.S;
      }
      this.Q = (this.Q * (1.0F - f15) + this.Q * f6 * f15);
      this.R = (this.R * (1.0F - f15) + this.R * f6 * f15);
      this.S = (this.S * (1.0F - f15) + this.S * f6 * f15);
    }
    if (this.h.t.e)
    {
      float f16 = (this.Q * 30.0F + this.R * 59.0F + this.S * 11.0F) / 100.0F;
      float f17 = (this.Q * 30.0F + this.R * 70.0F) / 100.0F;
      float f7 = (this.Q * 30.0F + this.S * 70.0F) / 100.0F;
      this.Q = f16;
      this.R = f17;
      this.S = f7;
    }
    bfl.a(this.Q, this.R, this.S, 0.0F);
  }
  
  private void a(int p_78468_1_, float partialTicks)
  {
    pk entity = this.h.ac();
    boolean flag = false;
    if ((entity instanceof wn)) {
      flag = ((wn)entity).bA.d;
    }
    GL11.glFog(2918, a(this.Q, this.R, this.S, 1.0F));
    GL11.glNormal3f(0.0F, -1.0F, 0.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    afh block = auz.a(this.h.f, entity, partialTicks);
    if (((entity instanceof pr)) && (((pr)entity).a(pe.q)))
    {
      float f1 = 5.0F;
      int i = ((pr)entity).b(pe.q).b();
      if (i < 20) {
        f1 = 5.0F + (this.k - 5.0F) * (1.0F - i / 20.0F);
      }
      bfl.d(9729);
      if (p_78468_1_ == -1)
      {
        bfl.b(0.0F);
        bfl.c(f1 * 0.8F);
      }
      else
      {
        bfl.b(f1 * 0.25F);
        bfl.c(f1);
      }
      if (GLContext.getCapabilities().GL_NV_fog_distance) {
        GL11.glFogi(34138, 34139);
      }
    }
    else if (this.B)
    {
      bfl.d(2048);
      bfl.a(0.1F);
    }
    else if (block.t() == arm.h)
    {
      bfl.d(2048);
      if (((entity instanceof pr)) && (((pr)entity).a(pe.o))) {
        bfl.a(0.01F);
      } else {
        bfl.a(0.1F - ack.a(entity) * 0.03F);
      }
    }
    else if (block.t() == arm.i)
    {
      bfl.d(2048);
      bfl.a(2.0F);
    }
    else
    {
      float f = this.k;
      bfl.d(9729);
      if (p_78468_1_ == -1)
      {
        bfl.b(0.0F);
        bfl.c(f);
      }
      else
      {
        bfl.b(f * 0.75F);
        bfl.c(f);
      }
      if (GLContext.getCapabilities().GL_NV_fog_distance) {
        GL11.glFogi(34138, 34139);
      }
      if (this.h.f.t.b((int)entity.s, (int)entity.u))
      {
        bfl.b(f * 0.05F);
        bfl.c(Math.min(f, 192.0F) * 0.5F);
      }
    }
    bfl.g();
    bfl.m();
    bfl.a(1028, 4608);
  }
  
  private FloatBuffer a(float red, float green, float blue, float alpha)
  {
    this.P.clear();
    this.P.put(red).put(green).put(blue).put(alpha);
    this.P.flip();
    return this.P;
  }
  
  public avq k()
  {
    return this.l;
  }
}
