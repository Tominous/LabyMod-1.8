import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.FloatBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Project;
import shadersmod.client.Shaders;
import shadersmod.client.ShadersRender;

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
  public bfn c;
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
  public float Q;
  public float R;
  public float S;
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
  public int ae;
  private static final String __OBFID = "CL_00000947";
  private boolean initialized = false;
  private adm updatedWorld = null;
  private boolean showDebugInfo = false;
  public boolean fogStandard = false;
  private float clipDistance = 128.0F;
  private long lastServerTime = 0L;
  private int lastServerTicks = 0;
  private int serverWaitTime = 0;
  private int serverWaitTimeCurrent = 0;
  private float avgServerTimeDiff = 0.0F;
  private float avgServerTickDiff = 0.0F;
  private long lastErrorCheckTimeMs = 0L;
  private blr[] fxaaShaders = new blr[10];
  
  public bfk(ave mcIn, bni p_i45076_2_)
  {
    this.ac = d;
    this.ad = false;
    this.ae = 0;
    this.h = mcIn;
    this.i = p_i45076_2_;
    this.c = mcIn.ah();
    this.l = new avq(mcIn.P());
    this.G = new blz(16, 16);
    this.I = mcIn.P().a("lightMap", this.G);
    this.H = this.G.e();
    this.aa = null;
    for (int var3 = 0; var3 < 32; var3++) {
      for (int var4 = 0; var4 < 32; var4++)
      {
        float var5 = var4 - 16;
        float var6 = var3 - 16;
        float var7 = ns.c(var5 * var5 + var6 * var6);
        this.N[(var3 << 5 | var4)] = (-var6 / var7);
        this.O[(var3 << 5 | var4)] = (var5 / var7);
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
  
  public void a(pk p_175066_1_)
  {
    if (bqs.O)
    {
      if (this.aa != null) {
        this.aa.a();
      }
      this.aa = null;
      if ((p_175066_1_ instanceof vn)) {
        a(new jy("shaders/post/creeper.json"));
      } else if ((p_175066_1_ instanceof wc)) {
        a(new jy("shaders/post/spider.json"));
      } else if ((p_175066_1_ instanceof vo)) {
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
  
  private void a(jy p_175069_1_)
  {
    if (!bqs.i()) {
      return;
    }
    try
    {
      this.aa = new blr(this.h.P(), this.i, this.h.b(), p_175069_1_);
      this.aa.a(this.h.d, this.h.e);
      this.ad = true;
    }
    catch (IOException var3)
    {
      e.warn("Failed to load shader: " + p_175069_1_, var3);
      this.ac = d;
      this.ad = false;
    }
    catch (JsonSyntaxException var4)
    {
      e.warn("Failed to load shader: " + p_175069_1_, var4);
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
      float var1 = this.h.t.a * 0.6F + 0.2F;
      float var2 = var1 * var1 * var1 * 8.0F;
      this.u = this.o.a(this.s, 0.05F * var2);
      this.v = this.p.a(this.t, 0.05F * var2);
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
    float var1 = this.h.f.o(new cj(this.h.ac()));
    float var2 = this.h.t.c / 32.0F;
    float var3 = var1 * (1.0F - var2) + var2;
    this.U += (var3 - this.U) * 0.1F;
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
  
  public void a(int p_147704_1_, int p_147704_2_)
  {
    if (bqs.O)
    {
      if (this.aa != null) {
        this.aa.a(p_147704_1_, p_147704_2_);
      }
      this.h.g.a(p_147704_1_, p_147704_2_);
    }
  }
  
  public void a(float p_78473_1_)
  {
    pk var2 = this.h.ac();
    if (var2 != null) {
      if (this.h.f != null)
      {
        this.h.A.a("pick");
        this.h.i = null;
        double var3 = this.h.c.d();
        this.h.s = var2.a(var3, p_78473_1_);
        double var5 = var3;
        aui var7 = var2.e(p_78473_1_);
        boolean var8 = false;
        boolean var9 = true;
        if (this.h.c.i())
        {
          var3 = 6.0D;
          var5 = 6.0D;
        }
        else
        {
          if (var3 > 3.0D) {
            var8 = true;
          }
          var3 = var3;
        }
        if (this.h.s != null) {
          var5 = this.h.s.c.f(var7);
        }
        aui var10 = var2.d(p_78473_1_);
        aui var11 = var7.b(var10.a * var3, var10.b * var3, var10.c * var3);
        this.n = null;
        aui var12 = null;
        float var13 = 1.0F;
        List var14 = this.h.f.a(var2, var2.aR().a(var10.a * var3, var10.b * var3, var10.c * var3).b(var13, var13, var13), Predicates.and(po.d, new bfk.1(this)));
        double var15 = var5;
        for (int var17 = 0; var17 < var14.size(); var17++)
        {
          pk var18 = (pk)var14.get(var17);
          float var19 = var18.ao();
          aug var20 = var18.aR().b(var19, var19, var19);
          auh var21 = var20.a(var7, var11);
          if (var20.a(var7))
          {
            if (var15 >= 0.0D)
            {
              this.n = var18;
              var12 = var21 == null ? var7 : var21.c;
              var15 = 0.0D;
            }
          }
          else if (var21 != null)
          {
            double var22 = var7.f(var21.c);
            if ((var22 < var15) || (var15 == 0.0D))
            {
              boolean canRiderInteract = false;
              if (Reflector.ForgeEntity_canRiderInteract.exists()) {
                canRiderInteract = Reflector.callBoolean(var18, Reflector.ForgeEntity_canRiderInteract, new Object[0]);
              }
              if ((var18 == var2.m) && (!canRiderInteract))
              {
                if (var15 == 0.0D)
                {
                  this.n = var18;
                  var12 = var21.c;
                }
              }
              else
              {
                this.n = var18;
                var12 = var21.c;
                var15 = var22;
              }
            }
          }
        }
        if ((this.n != null) && (var8) && (var7.f(var12) > 3.0D))
        {
          this.n = null;
          this.h.s = new auh(auh.a.a, var12, (cq)null, new cj(var12));
        }
        if ((this.n != null) && ((var15 < var5) || (this.h.s == null)))
        {
          this.h.s = new auh(this.n, var12);
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
    float var1 = 1.0F;
    if ((this.h.ac() instanceof bet))
    {
      bet var2 = (bet)this.h.ac();
      var1 = var2.o();
    }
    this.y = this.x;
    this.x += (var1 - this.x) * 0.5F;
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
    pk var3 = this.h.ac();
    float var4 = 70.0F;
    if (p_78481_2_)
    {
      var4 = this.h.t.aH;
      var4 *= (this.y + (this.x - this.y) * partialTicks);
    }
    boolean zoomActive = false;
    if (this.h.m == null) {
      zoomActive = avh.a(this.h.t.ofKeyBindZoom);
    }
    if (zoomActive)
    {
      if (!Config.zoomMode)
      {
        Config.zoomMode = true;
        this.h.t.aF = true;
      }
      if (Config.zoomMode) {
        var4 /= 4.0F;
      }
    }
    else if (Config.zoomMode)
    {
      Config.zoomMode = false;
      this.h.t.aF = false;
      
      this.o = new nv();
      this.p = new nv();
      
      this.h.g.ac = true;
    }
    if (((var3 instanceof pr)) && (((pr)var3).bn() <= 0.0F))
    {
      float var5 = ((pr)var3).ax + partialTicks;
      var4 /= ((1.0F - 500.0F / (var5 + 500.0F)) * 2.0F + 1.0F);
    }
    afh var6 = auz.a(this.h.f, var3, partialTicks);
    if (var6.t() == arm.h) {
      var4 = var4 * 60.0F / 70.0F;
    }
    return var4;
  }
  
  private void d(float p_78482_1_)
  {
    if ((this.h.ac() instanceof pr))
    {
      pr var2 = (pr)this.h.ac();
      float var3 = var2.au - p_78482_1_;
      if (var2.bn() <= 0.0F)
      {
        float var4 = var2.ax + p_78482_1_;
        bfl.b(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }
      if (var3 < 0.0F) {
        return;
      }
      var3 /= var2.av;
      var3 = ns.a(var3 * var3 * var3 * var3 * 3.1415927F);
      float var4 = var2.aw;
      bfl.b(-var4, 0.0F, 1.0F, 0.0F);
      bfl.b(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(var4, 0.0F, 1.0F, 0.0F);
    }
  }
  
  private void e(float p_78475_1_)
  {
    if ((this.h.ac() instanceof wn))
    {
      wn var2 = (wn)this.h.ac();
      float var3 = var2.M - var2.L;
      float var4 = -(var2.M + var3 * p_78475_1_);
      float var5 = var2.bn + (var2.bo - var2.bn) * p_78475_1_;
      float var6 = var2.aE + (var2.aF - var2.aE) * p_78475_1_;
      bfl.b(ns.a(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(ns.b(var4 * 3.1415927F) * var5), 0.0F);
      bfl.b(ns.a(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(Math.abs(ns.b(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
      bfl.b(var6, 1.0F, 0.0F, 0.0F);
    }
  }
  
  private void f(float p_78467_1_)
  {
    pk var2 = this.h.ac();
    float var3 = var2.aS();
    double var4 = var2.p + (var2.s - var2.p) * p_78467_1_;
    double var6 = var2.q + (var2.t - var2.q) * p_78467_1_ + var3;
    double var8 = var2.r + (var2.u - var2.r) * p_78467_1_;
    if (((var2 instanceof pr)) && (((pr)var2).bJ()))
    {
      var3 = (float)(var3 + 1.0D);
      bfl.b(0.0F, 0.3F, 0.0F);
      if (!this.h.t.aG)
      {
        cj var27 = new cj(var2);
        alz var11 = this.h.f.p(var27);
        afh var29 = var11.c();
        if (Reflector.ForgeHooksClient_orientBedCamera.exists())
        {
          Reflector.callVoid(Reflector.ForgeHooksClient_orientBedCamera, new Object[] { this.h.f, var27, var11, var2 });
        }
        else if (var29 == afi.C)
        {
          int var30 = ((cq)var11.b(afg.O)).b();
          bfl.b(var30 * 90, 0.0F, 1.0F, 0.0F);
        }
        bfl.b(var2.A + (var2.y - var2.A) * p_78467_1_ + 180.0F, 0.0F, -1.0F, 0.0F);
        bfl.b(var2.B + (var2.z - var2.B) * p_78467_1_, -1.0F, 0.0F, 0.0F);
      }
    }
    else if (this.h.t.aA > 0)
    {
      double var10 = this.r + (this.q - this.r) * p_78467_1_;
      if (this.h.t.aG)
      {
        bfl.b(0.0F, 0.0F, (float)-var10);
      }
      else
      {
        float var12 = var2.y;
        float var13 = var2.z;
        if (this.h.t.aA == 2) {
          var13 += 180.0F;
        }
        double var14 = -ns.a(var12 / 180.0F * 3.1415927F) * ns.b(var13 / 180.0F * 3.1415927F) * var10;
        double var16 = ns.b(var12 / 180.0F * 3.1415927F) * ns.b(var13 / 180.0F * 3.1415927F) * var10;
        double var18 = -ns.a(var13 / 180.0F * 3.1415927F) * var10;
        for (int var20 = 0; var20 < 8; var20++)
        {
          float var21 = (var20 & 0x1) * 2 - 1;
          float var22 = (var20 >> 1 & 0x1) * 2 - 1;
          float var23 = (var20 >> 2 & 0x1) * 2 - 1;
          var21 *= 0.1F;
          var22 *= 0.1F;
          var23 *= 0.1F;
          auh var24 = this.h.f.a(new aui(var4 + var21, var6 + var22, var8 + var23), new aui(var4 - var14 + var21 + var23, var6 - var18 + var22, var8 - var16 + var23));
          if (var24 != null)
          {
            double var25 = var24.c.f(new aui(var4, var6, var8));
            if (var25 < var10) {
              var10 = var25;
            }
          }
        }
        if (this.h.t.aA == 2) {
          bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
        }
        bfl.b(var2.z - var13, 1.0F, 0.0F, 0.0F);
        bfl.b(var2.y - var12, 0.0F, 1.0F, 0.0F);
        bfl.b(0.0F, 0.0F, (float)-var10);
        bfl.b(var12 - var2.y, 0.0F, 1.0F, 0.0F);
        bfl.b(var13 - var2.z, 1.0F, 0.0F, 0.0F);
      }
    }
    else
    {
      bfl.b(0.0F, 0.0F, -0.1F);
    }
    if (!this.h.t.aG)
    {
      bfl.b(var2.B + (var2.z - var2.B) * p_78467_1_, 1.0F, 0.0F, 0.0F);
      if ((var2 instanceof tm))
      {
        tm var28 = (tm)var2;
        bfl.b(var28.aL + (var28.aK - var28.aL) * p_78467_1_ + 180.0F, 0.0F, 1.0F, 0.0F);
      }
      else
      {
        bfl.b(var2.A + (var2.y - var2.A) * p_78467_1_ + 180.0F, 0.0F, 1.0F, 0.0F);
      }
    }
    bfl.b(0.0F, -var3, 0.0F);
    var4 = var2.p + (var2.s - var2.p) * p_78467_1_;
    var6 = var2.q + (var2.t - var2.q) * p_78467_1_ + var3;
    var8 = var2.r + (var2.u - var2.r) * p_78467_1_;
    this.B = this.h.g.a(var4, var6, var8, p_78467_1_);
  }
  
  public void a(float partialTicks, int pass)
  {
    this.k = (this.h.t.c * 16);
    if (Config.isFogFancy()) {
      this.k *= 0.95F;
    }
    if (Config.isFogFast()) {
      this.k *= 0.83F;
    }
    bfl.n(5889);
    bfl.D();
    float var3 = 0.07F;
    if (this.h.t.e) {
      bfl.b(-(pass * 2 - 1) * var3, 0.0F, 0.0F);
    }
    this.clipDistance = (this.k * 2.0F);
    if (this.clipDistance < 173.0F) {
      this.clipDistance = 173.0F;
    }
    if (this.h.f.t.q() == 1) {
      this.clipDistance = 256.0F;
    }
    if (this.X != 1.0D)
    {
      bfl.b((float)this.Y, (float)-this.Z, 0.0F);
      bfl.a(this.X, this.X, 1.0D);
    }
    Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.clipDistance);
    bfl.n(5888);
    bfl.D();
    if (this.h.t.e) {
      bfl.b((pass * 2 - 1) * 0.1F, 0.0F, 0.0F);
    }
    d(partialTicks);
    if (this.h.t.d) {
      e(partialTicks);
    }
    float var4 = this.h.h.bI + (this.h.h.bH - this.h.h.bI) * partialTicks;
    if (var4 > 0.0F)
    {
      byte var5 = 20;
      if (this.h.h.a(pe.k)) {
        var5 = 7;
      }
      float var6 = 5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F;
      var6 *= var6;
      bfl.b((this.m + partialTicks) * var5, 0.0F, 1.0F, 1.0F);
      bfl.a(1.0F / var6, 1.0F, 1.0F);
      bfl.b(-(this.m + partialTicks) * var5, 0.0F, 1.0F, 1.0F);
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
  
  public void b(float p_78476_1_, int p_78476_2_)
  {
    if (!this.W)
    {
      bfl.n(5889);
      bfl.D();
      float var3 = 0.07F;
      if (this.h.t.e) {
        bfl.b(-(p_78476_2_ * 2 - 1) * var3, 0.0F, 0.0F);
      }
      if (Config.isShaders()) {
        Shaders.applyHandDepth();
      }
      Project.gluPerspective(a(p_78476_1_, false), this.h.d / this.h.e, 0.05F, this.k * 2.0F);
      bfl.n(5888);
      bfl.D();
      if (this.h.t.e) {
        bfl.b((p_78476_2_ * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }
      boolean var4 = false;
      if ((!Config.isShaders()) || (!Shaders.isHandRendered))
      {
        bfl.E();
        d(p_78476_1_);
        if (this.h.t.d) {
          e(p_78476_1_);
        }
        var4 = ((this.h.ac() instanceof pr)) && (((pr)this.h.ac()).bJ());
        if ((this.h.t.aA == 0) && (!var4) && (!this.h.t.az) && (!this.h.c.a()))
        {
          i();
          if (Config.isShaders()) {
            ShadersRender.renderItemFP(this.c, p_78476_1_);
          } else {
            this.c.a(p_78476_1_);
          }
          h();
        }
        bfl.F();
      }
      if ((Config.isShaders()) && (!Shaders.isCompositeRendered)) {
        return;
      }
      h();
      if ((this.h.t.aA == 0) && (!var4))
      {
        this.c.b(p_78476_1_);
        d(p_78476_1_);
      }
      if (this.h.t.d) {
        e(p_78476_1_);
      }
    }
  }
  
  public void h()
  {
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
    if (Config.isShaders()) {
      Shaders.disableLightmap();
    }
  }
  
  public void i()
  {
    bfl.g(bqs.r);
    bfl.n(5890);
    bfl.D();
    float var1 = 0.00390625F;
    bfl.a(var1, var1, var1);
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
    if (Config.isShaders()) {
      Shaders.enableLightmap();
    }
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
      bdb var2 = this.h.f;
      if (var2 != null)
      {
        if (CustomColorizer.updateLightmap(var2, this.K, this.H, this.h.h.a(pe.r)))
        {
          this.G.d();
          this.J = false;
          this.h.A.b();
          
          return;
        }
        float var3 = var2.b(1.0F);
        float var4 = var3 * 0.95F + 0.05F;
        for (int var5 = 0; var5 < 256; var5++)
        {
          float var6 = var2.t.p()[(var5 / 16)] * var4;
          float var7 = var2.t.p()[(var5 % 16)] * (this.K * 0.1F + 1.5F);
          if (var2.ac() > 0) {
            var6 = var2.t.p()[(var5 / 16)];
          }
          float var8 = var6 * (var3 * 0.65F + 0.35F);
          float var9 = var6 * (var3 * 0.65F + 0.35F);
          float var12 = var7 * ((var7 * 0.6F + 0.4F) * 0.6F + 0.4F);
          float var13 = var7 * (var7 * var7 * 0.6F + 0.4F);
          float var14 = var8 + var7;
          float var15 = var9 + var12;
          float var16 = var6 + var13;
          var14 = var14 * 0.96F + 0.03F;
          var15 = var15 * 0.96F + 0.03F;
          var16 = var16 * 0.96F + 0.03F;
          if (this.z > 0.0F)
          {
            float var17 = this.A + (this.z - this.A) * partialTicks;
            var14 = var14 * (1.0F - var17) + var14 * 0.7F * var17;
            var15 = var15 * (1.0F - var17) + var15 * 0.6F * var17;
            var16 = var16 * (1.0F - var17) + var16 * 0.6F * var17;
          }
          if (var2.t.q() == 1)
          {
            var14 = 0.22F + var7 * 0.75F;
            var15 = 0.28F + var12 * 0.75F;
            var16 = 0.25F + var13 * 0.75F;
          }
          if (this.h.h.a(pe.r))
          {
            float var17 = a(this.h.h, partialTicks);
            float var18 = 1.0F / var14;
            if (var18 > 1.0F / var15) {
              var18 = 1.0F / var15;
            }
            if (var18 > 1.0F / var16) {
              var18 = 1.0F / var16;
            }
            var14 = var14 * (1.0F - var17) + var14 * var18 * var17;
            var15 = var15 * (1.0F - var17) + var15 * var18 * var17;
            var16 = var16 * (1.0F - var17) + var16 * var18 * var17;
          }
          if (var14 > 1.0F) {
            var14 = 1.0F;
          }
          if (var15 > 1.0F) {
            var15 = 1.0F;
          }
          if (var16 > 1.0F) {
            var16 = 1.0F;
          }
          float var17 = this.h.t.aI;
          float var18 = 1.0F - var14;
          float var19 = 1.0F - var15;
          float var20 = 1.0F - var16;
          var18 = 1.0F - var18 * var18 * var18 * var18;
          var19 = 1.0F - var19 * var19 * var19 * var19;
          var20 = 1.0F - var20 * var20 * var20 * var20;
          var14 = var14 * (1.0F - var17) + var18 * var17;
          var15 = var15 * (1.0F - var17) + var19 * var17;
          var16 = var16 * (1.0F - var17) + var20 * var17;
          var14 = var14 * 0.96F + 0.03F;
          var15 = var15 * 0.96F + 0.03F;
          var16 = var16 * 0.96F + 0.03F;
          if (var14 > 1.0F) {
            var14 = 1.0F;
          }
          if (var15 > 1.0F) {
            var15 = 1.0F;
          }
          if (var16 > 1.0F) {
            var16 = 1.0F;
          }
          if (var14 < 0.0F) {
            var14 = 0.0F;
          }
          if (var15 < 0.0F) {
            var15 = 0.0F;
          }
          if (var16 < 0.0F) {
            var16 = 0.0F;
          }
          short var21 = 255;
          int var22 = (int)(var14 * 255.0F);
          int var23 = (int)(var15 * 255.0F);
          int var24 = (int)(var16 * 255.0F);
          this.H[var5] = (var21 << 24 | var22 << 16 | var23 << 8 | var24);
        }
        this.G.d();
        this.J = false;
        this.h.A.b();
      }
    }
  }
  
  private float a(pr p_180438_1_, float partialTicks)
  {
    int var3 = p_180438_1_.b(pe.r).b();
    return var3 > 200 ? 1.0F : 0.7F + ns.a((var3 - partialTicks) * 3.1415927F * 0.2F) * 0.3F;
  }
  
  public void a(float partialTicks, long nanoTimeStart)
  {
    frameInit();
    
    boolean var4 = Display.isActive();
    if ((!var4) && (this.h.t.z) && ((!this.h.t.A) || (!Mouse.isButtonDown(1))))
    {
      if (ave.J() - this.E > 500L) {
        this.h.p();
      }
    }
    else {
      this.E = ave.J();
    }
    this.h.A.a("mouse");
    if ((var4) && (ave.a) && (this.h.w) && (!Mouse.isInsideWindow()))
    {
      Mouse.setGrabbed(false);
      Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
      Mouse.setGrabbed(true);
    }
    if ((this.h.w) && (var4))
    {
      this.h.u.c();
      float var5 = this.h.t.a * 0.6F + 0.2F;
      float var6 = var5 * var5 * var5 * 8.0F;
      float var7 = this.h.u.a * var6;
      float var8 = this.h.u.b * var6;
      byte var9 = 1;
      if (this.h.t.b) {
        var9 = -1;
      }
      if (this.h.t.aF)
      {
        this.s += var7;
        this.t += var8;
        float var10 = partialTicks - this.w;
        this.w = partialTicks;
        var7 = this.u * var10;
        var8 = this.v * var10;
        this.h.h.c(var7, var8 * var9);
      }
      else
      {
        this.s = 0.0F;
        this.t = 0.0F;
        this.h.h.c(var7, var8 * var9);
      }
    }
    this.h.A.b();
    if (!this.h.r)
    {
      a = this.h.t.e;
      final avr var17 = new avr(this.h);
      int var18 = var17.a();
      int var19 = var17.b();
      final int var20 = Mouse.getX() * var18 / this.h.d;
      final int var21 = var19 - Mouse.getY() * var19 / this.h.e - 1;
      int var22 = this.h.t.g;
      if (this.h.f != null)
      {
        this.h.A.a("level");
        int var11 = Math.min(ave.ai(), var22);
        var11 = Math.max(var11, 60);
        long var12 = System.nanoTime() - nanoTimeStart;
        long var14 = Math.max(1000000000 / var11 / 4 - var12, 0L);
        b(partialTicks, System.nanoTime() + var14);
        if (bqs.O)
        {
          this.h.g.c();
          if ((this.aa != null) && (this.ad))
          {
            bfl.n(5890);
            bfl.E();
            bfl.D();
            this.aa.a(partialTicks);
            bfl.F();
          }
          this.h.b().a(true);
        }
        this.F = System.nanoTime();
        this.h.A.c("gui");
        if ((!this.h.t.az) || (this.h.m != null))
        {
          bfl.a(516, 0.1F);
          this.h.q.a(partialTicks);
          if ((this.h.t.ofShowFps) && (!this.h.t.aB)) {
            Config.drawFps();
          }
          if (this.h.t.aB) {
            Lagometer.showLagometer(var17);
          }
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
          if (Reflector.ForgeHooksClient_drawScreen.exists()) {
            Reflector.callVoid(Reflector.ForgeHooksClient_drawScreen, new Object[] { this.h.m, Integer.valueOf(var20), Integer.valueOf(var21), Float.valueOf(partialTicks) });
          } else {
            this.h.m.a(var20, var21, partialTicks);
          }
        }
        catch (Throwable var16)
        {
          b var23 = b.a(var16, "Rendering screen");
          c var13 = var23.a("Screen render details");
          var13.a("Screen name", new bfk.2(this));
          var13.a("Mouse location", new Callable()
          {
            private static final String __OBFID = "CL_00000950";
            
            public String a()
              throws Exception
            {
              return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", new Object[] { Integer.valueOf(var20), Integer.valueOf(var21), Integer.valueOf(Mouse.getX()), Integer.valueOf(Mouse.getY()) });
            }
          });
          var13.a("Screen size", new Callable()
          {
            private static final String __OBFID = "CL_00000951";
            
            public String a()
              throws Exception
            {
              return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", new Object[] { Integer.valueOf(var17.a()), Integer.valueOf(var17.b()), Integer.valueOf(bfk.a(bfk.this).d), Integer.valueOf(bfk.a(bfk.this).e), Integer.valueOf(var17.e()) });
            }
          });
          throw new e(var23);
        }
      }
    }
    frameFinish();
    
    waitForServerThread();
    
    Lagometer.updateLagometer();
    if (this.h.t.ofProfiler) {
      this.h.t.aC = true;
    }
  }
  
  public void b(float p_152430_1_)
  {
    j();
    this.h.q.c(new avr(this.h));
  }
  
  private boolean n()
  {
    if (!this.D) {
      return false;
    }
    pk var1 = this.h.ac();
    boolean var2 = ((var1 instanceof wn)) && (!this.h.t.az);
    if ((var2) && (!((wn)var1).bA.e))
    {
      zx var3 = ((wn)var1).bZ();
      if ((this.h.s != null) && (this.h.s.a == auh.a.b))
      {
        cj var4 = this.h.s.a();
        afh var5 = this.h.f.p(var4).c();
        if (this.h.c.l() == adp.a.e)
        {
          boolean hasTileEntity;
          boolean hasTileEntity;
          if (Reflector.ForgeBlock_hasTileEntity.exists())
          {
            alz bs = this.h.f.p(var4);
            hasTileEntity = Reflector.callBoolean(var5, Reflector.ForgeBlock_hasTileEntity, new Object[] { bs });
          }
          else
          {
            hasTileEntity = var5.z();
          }
          var2 = (hasTileEntity) && ((this.h.f.s(var4) instanceof og));
        }
        else
        {
          var2 = (var3 != null) && ((var3.c(var5)) || (var3.d(var5)));
        }
      }
    }
    return var2;
  }
  
  private void h(float p_175067_1_)
  {
    if ((this.h.t.aB) && (!this.h.t.az) && (!this.h.h.cq()) && (!this.h.t.w))
    {
      pk var2 = this.h.ac();
      bfl.l();
      bfl.a(770, 771, 1, 0);
      GL11.glLineWidth(1.0F);
      bfl.x();
      bfl.a(false);
      bfl.E();
      bfl.n(5888);
      bfl.D();
      f(p_175067_1_);
      bfl.b(0.0F, var2.aS(), 0.0F);
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
    if (Config.isShaders()) {
      Shaders.beginRender(this.h, partialTicks, finishTimeNano);
    }
    bfl.j();
    bfl.d();
    
    bfl.a(516, 0.1F);
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
    boolean isShaders = Config.isShaders();
    if (isShaders) {
      Shaders.beginRenderPass(pass, partialTicks, finishTimeNano);
    }
    bfr var5 = this.h.g;
    bec var6 = this.h.j;
    boolean var7 = n();
    bfl.o();
    this.h.A.c("clear");
    if (isShaders) {
      Shaders.setViewport(0, 0, this.h.d, this.h.e);
    } else {
      bfl.b(0, 0, this.h.d, this.h.e);
    }
    i(partialTicks);
    bfl.m(16640);
    if (isShaders) {
      Shaders.clearRenderBuffer();
    }
    this.h.A.c("camera");
    a(partialTicks, pass);
    if (isShaders) {
      Shaders.setCamera(partialTicks);
    }
    auz.a(this.h.h, this.h.t.aA == 2);
    this.h.A.c("frustum");
    bib.a();
    this.h.A.c("culling");
    bic var8 = new bic();
    pk var9 = this.h.ac();
    double var10 = var9.P + (var9.s - var9.P) * partialTicks;
    double var12 = var9.Q + (var9.t - var9.Q) * partialTicks;
    double var14 = var9.R + (var9.u - var9.R) * partialTicks;
    if (isShaders) {
      ShadersRender.setFrustrumPosition(var8, var10, var12, var14);
    } else {
      var8.a(var10, var12, var14);
    }
    if (((Config.isSkyEnabled()) || (Config.isSunMoonEnabled()) || (Config.isStarsEnabled())) && (!Shaders.isShadowPass))
    {
      a(-1, partialTicks);
      this.h.A.c("sky");
      bfl.n(5889);
      bfl.D();
      
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.clipDistance);
      bfl.n(5888);
      if (isShaders) {
        Shaders.beginSky();
      }
      var5.a(partialTicks, pass);
      if (isShaders) {
        Shaders.endSky();
      }
      bfl.n(5889);
      bfl.D();
      
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.clipDistance);
      bfl.n(5888);
    }
    else
    {
      bfl.k();
    }
    a(0, partialTicks);
    bfl.j(7425);
    if (var9.t + var9.aS() < 128.0D + this.h.t.ofCloudsHeight * 128.0F) {
      a(var5, partialTicks, pass);
    }
    this.h.A.c("prepareterrain");
    a(0, partialTicks);
    this.h.P().a(bmh.g);
    avc.a();
    this.h.A.c("terrain_setup");
    if (isShaders) {
      ShadersRender.setupTerrain(var5, var9, partialTicks, var8, this.ae++, this.h.h.v());
    } else {
      var5.a(var9, partialTicks, var8, this.ae++, this.h.h.v());
    }
    if ((pass == 0) || (pass == 2))
    {
      this.h.A.c("updatechunks");
      
      Lagometer.timerChunkUpload.start();
      if (isShaders) {
        ShadersRender.updateChunks(var5, finishTimeNano);
      } else {
        this.h.g.a(finishTimeNano);
      }
      Lagometer.timerChunkUpload.end();
    }
    this.h.A.c("terrain");
    
    Lagometer.timerTerrain.start();
    if ((this.h.t.ofSmoothFps) && (pass > 0))
    {
      this.h.A.c("finish");
      GL11.glFinish();
      this.h.A.c("terrain");
    }
    bfl.n(5888);
    bfl.E();
    bfl.c();
    if (isShaders) {
      ShadersRender.beginTerrainSolid();
    }
    var5.a(adf.a, partialTicks, pass, var9);
    bfl.d();
    if (isShaders) {
      ShadersRender.beginTerrainCutoutMipped();
    }
    var5.a(adf.b, partialTicks, pass, var9);
    this.h.P().b(bmh.g).b(false, false);
    if (isShaders) {
      ShadersRender.beginTerrainCutout();
    }
    var5.a(adf.c, partialTicks, pass, var9);
    this.h.P().b(bmh.g).a();
    if (isShaders) {
      ShadersRender.endTerrain();
    }
    Lagometer.timerTerrain.end();
    bfl.j(7424);
    bfl.a(516, 0.1F);
    if (!this.W)
    {
      bfl.n(5888);
      bfl.F();
      bfl.E();
      avc.b();
      this.h.A.c("entities");
      if (Reflector.ForgeHooksClient_setRenderPass.exists()) {
        Reflector.callVoid(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(0) });
      }
      var5.a(var9, var8, partialTicks);
      if (Reflector.ForgeHooksClient_setRenderPass.exists()) {
        Reflector.callVoid(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(-1) });
      }
      avc.a();
      h();
      bfl.n(5888);
      bfl.F();
      bfl.E();
      if ((this.h.s != null) && (var9.a(arm.h)) && (var7))
      {
        wn var16 = (wn)var9;
        bfl.c();
        this.h.A.c("outline");
        
        boolean hasForgeMethod = Reflector.ForgeHooksClient_onDrawBlockHighlight.exists();
        if (hasForgeMethod)
        {
          if (Reflector.callBoolean(Reflector.ForgeHooksClient_onDrawBlockHighlight, new Object[] { var5, var16, this.h.s, Integer.valueOf(0), var16.bA(), Float.valueOf(partialTicks) })) {}
        }
        else if (!this.h.t.az) {
          var5.a(var16, this.h.s, 0, partialTicks);
        }
        bfl.d();
      }
    }
    bfl.n(5888);
    bfl.F();
    if ((var7) && (this.h.s != null) && (!var9.a(arm.h)))
    {
      wn var16 = (wn)var9;
      bfl.c();
      this.h.A.c("outline");
      
      boolean hasForgeMethod = Reflector.ForgeHooksClient_onDrawBlockHighlight.exists();
      if (hasForgeMethod)
      {
        if (Reflector.callBoolean(Reflector.ForgeHooksClient_onDrawBlockHighlight, new Object[] { var5, var16, this.h.s, Integer.valueOf(0), var16.bA(), Float.valueOf(partialTicks) })) {}
      }
      else if (!this.h.t.az) {
        var5.a(var16, this.h.s, 0, partialTicks);
      }
      bfl.d();
    }
    if (!var5.x.isEmpty())
    {
      this.h.A.c("destroyProgress");
      bfl.l();
      bfl.a(770, 1, 1, 0);
      this.h.P().b(bmh.g).b(false, false);
      var5.a(bfx.a(), bfx.a().c(), var9, partialTicks);
      this.h.P().b(bmh.g).a();
    }
    bfl.k();
    if (!this.W)
    {
      i();
      this.h.A.c("litParticles");
      if (isShaders) {
        Shaders.beginLitParticles();
      }
      var6.b(var9, partialTicks);
      avc.a();
      a(0, partialTicks);
      this.h.A.c("particles");
      if (isShaders) {
        Shaders.beginParticles();
      }
      var6.a(var9, partialTicks);
      if (isShaders) {
        Shaders.endParticles();
      }
      h();
    }
    bfl.a(false);
    bfl.o();
    this.h.A.c("weather");
    if (isShaders) {
      Shaders.beginWeather();
    }
    c(partialTicks);
    if (isShaders) {
      Shaders.endWeather();
    }
    bfl.a(true);
    if (isShaders)
    {
      ShadersRender.renderHand0(this, partialTicks, pass);
      Shaders.preWater();
    }
    var5.a(var9, partialTicks);
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
    if (isShaders) {
      Shaders.beginWater();
    }
    var5.a(adf.d, partialTicks, pass, var9);
    if (isShaders) {
      Shaders.endWater();
    }
    if ((Reflector.ForgeHooksClient_setRenderPass.exists()) && (!this.W))
    {
      avc.b();
      this.h.A.c("entities");
      Reflector.callVoid(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(1) });
      this.h.g.a(var9, var8, partialTicks);
      Reflector.callVoid(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(-1) });
      avc.a();
    }
    bfl.j(7424);
    bfl.a(true);
    bfl.o();
    bfl.k();
    bfl.n();
    if (var9.t + var9.aS() >= 128.0D + this.h.t.ofCloudsHeight * 128.0F)
    {
      this.h.A.c("aboveClouds");
      a(var5, partialTicks, pass);
    }
    if (Reflector.ForgeHooksClient_dispatchRenderLast.exists())
    {
      this.h.A.c("forge_render_last");
      Reflector.callVoid(Reflector.ForgeHooksClient_dispatchRenderLast, new Object[] { var5, Float.valueOf(partialTicks) });
    }
    this.h.A.c("hand");
    
    boolean handRendered = Reflector.callBoolean(Reflector.ForgeHooksClient_renderFirstPersonHand, new Object[] { this.h.g, Float.valueOf(partialTicks), Integer.valueOf(pass) });
    if ((!handRendered) && (this.C) && (!Shaders.isShadowPass))
    {
      if (isShaders)
      {
        ShadersRender.renderHand1(this, partialTicks, pass);
        Shaders.renderCompositeFinal();
      }
      bfl.m(256);
      if (isShaders) {
        ShadersRender.renderFPOverlay(this, partialTicks, pass);
      } else {
        b(partialTicks, pass);
      }
      h(partialTicks);
    }
    if (isShaders) {
      Shaders.endRender();
    }
  }
  
  private void a(bfr p_180437_1_, float partialTicks, int pass)
  {
    if ((this.h.t.c >= 4) && (!Config.isCloudsOff()) && (Shaders.shouldRenderClouds(this.h.t)))
    {
      this.h.A.c("clouds");
      bfl.n(5889);
      bfl.D();
      
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.clipDistance * 4.0F);
      bfl.n(5888);
      bfl.E();
      a(0, partialTicks);
      p_180437_1_.b(partialTicks, pass);
      bfl.n();
      bfl.F();
      bfl.n(5889);
      bfl.D();
      
      Project.gluPerspective(a(partialTicks, true), this.h.d / this.h.e, 0.05F, this.clipDistance);
      bfl.n(5888);
    }
  }
  
  private void o()
  {
    float var1 = this.h.f.j(1.0F);
    if (!Config.isRainFancy()) {
      var1 /= 2.0F;
    }
    if ((var1 != 0.0F) && (Config.isRainSplash()))
    {
      this.j.setSeed(this.m * 312987231L);
      pk var2 = this.h.ac();
      bdb var3 = this.h.f;
      cj var4 = new cj(var2);
      byte var5 = 10;
      double var6 = 0.0D;
      double var8 = 0.0D;
      double var10 = 0.0D;
      int var12 = 0;
      int var13 = (int)(100.0F * var1 * var1);
      if (this.h.t.aL == 1) {
        var13 >>= 1;
      } else if (this.h.t.aL == 2) {
        var13 = 0;
      }
      for (int var14 = 0; var14 < var13; var14++)
      {
        cj var15 = var3.q(var4.a(this.j.nextInt(var5) - this.j.nextInt(var5), 0, this.j.nextInt(var5) - this.j.nextInt(var5)));
        ady var16 = var3.b(var15);
        cj var17 = var15.b();
        afh var18 = var3.p(var17).c();
        if ((var15.o() <= var4.o() + var5) && (var15.o() >= var4.o() - var5) && (var16.e()) && (var16.a(var15) >= 0.15F))
        {
          double var19 = this.j.nextDouble();
          double var21 = this.j.nextDouble();
          if (var18.t() == arm.i)
          {
            this.h.f.a(cy.l, var15.n() + var19, var15.o() + 0.1F - var18.D(), var15.p() + var21, 0.0D, 0.0D, 0.0D, new int[0]);
          }
          else if (var18.t() != arm.a)
          {
            var18.a(var3, var17);
            var12++;
            if (this.j.nextInt(var12) == 0)
            {
              var6 = var17.n() + var19;
              var8 = var17.o() + 0.1F + var18.E() - 1.0D;
              var10 = var17.p() + var21;
            }
            this.h.f.a(cy.N, var17.n() + var19, var17.o() + 0.1F + var18.E(), var17.p() + var21, 0.0D, 0.0D, 0.0D, new int[0]);
          }
        }
      }
      if ((var12 > 0) && (this.j.nextInt(3) < this.M++))
      {
        this.M = 0;
        if ((var8 > var4.o() + 1) && (var3.q(var4).o() > ns.d(var4.o()))) {
          this.h.f.a(var6, var8, var10, "ambient.weather.rain", 0.1F, 0.5F, false);
        } else {
          this.h.f.a(var6, var8, var10, "ambient.weather.rain", 0.2F, 1.0F, false);
        }
      }
    }
  }
  
  protected void c(float partialTicks)
  {
    if (Reflector.ForgeWorldProvider_getWeatherRenderer.exists())
    {
      anm worldProvider = this.h.f.t;
      Object weatherRenderer = Reflector.call(worldProvider, Reflector.ForgeWorldProvider_getWeatherRenderer, new Object[0]);
      if (weatherRenderer != null)
      {
        Reflector.callVoid(weatherRenderer, Reflector.IRenderHandler_render, new Object[] { Float.valueOf(partialTicks), this.h.f, this.h });
        return;
      }
    }
    float var2 = this.h.f.j(partialTicks);
    if (var2 > 0.0F)
    {
      if (Config.isRainOff()) {
        return;
      }
      i();
      pk var3 = this.h.ac();
      bdb var4 = this.h.f;
      int var5 = ns.c(var3.s);
      int var6 = ns.c(var3.t);
      int var7 = ns.c(var3.u);
      bfx var8 = bfx.a();
      bfd var9 = var8.c();
      bfl.p();
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.a(516, 0.1F);
      double var10 = var3.P + (var3.s - var3.P) * partialTicks;
      double var12 = var3.Q + (var3.t - var3.Q) * partialTicks;
      double var14 = var3.R + (var3.u - var3.R) * partialTicks;
      int var16 = ns.c(var12);
      byte var17 = 5;
      if (Config.isRainFancy()) {
        var17 = 10;
      }
      byte var18 = -1;
      float var19 = this.m + partialTicks;
      var9.c(-var10, -var12, -var14);
      if (Config.isRainFancy()) {
        var17 = 10;
      }
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      cj.a var20 = new cj.a();
      for (int var21 = var7 - var17; var21 <= var7 + var17; var21++) {
        for (int var22 = var5 - var17; var22 <= var5 + var17; var22++)
        {
          int var23 = (var21 - var7 + 16) * 32 + var22 - var5 + 16;
          double var24 = this.N[var23] * 0.5D;
          double var26 = this.O[var23] * 0.5D;
          var20.c(var22, 0, var21);
          ady var28 = var4.b(var20);
          if ((var28.e()) || (var28.d()))
          {
            int var29 = var4.q(var20).o();
            int var30 = var6 - var17;
            int var31 = var6 + var17;
            if (var30 < var29) {
              var30 = var29;
            }
            if (var31 < var29) {
              var31 = var29;
            }
            int var32 = var29;
            if (var29 < var16) {
              var32 = var16;
            }
            if (var30 != var31)
            {
              this.j.setSeed(var22 * var22 * 3121 + var22 * 45238971 ^ var21 * var21 * 418711 + var21 * 13761);
              var20.c(var22, var30, var21);
              float var33 = var28.a(var20);
              if (var4.v().a(var33, var29) >= 0.15F)
              {
                if (var18 != 0)
                {
                  if (var18 >= 0) {
                    var8.b();
                  }
                  var18 = 0;
                  this.h.P().a(f);
                  var9.a(7, bms.d);
                }
                double var34 = ((this.m + var22 * var22 * 3121 + var22 * 45238971 + var21 * var21 * 418711 + var21 * 13761 & 0x1F) + partialTicks) / 32.0D * (3.0D + this.j.nextDouble());
                double var36 = var22 + 0.5F - var3.s;
                double var38 = var21 + 0.5F - var3.u;
                float var40 = ns.a(var36 * var36 + var38 * var38) / var17;
                float var41 = ((1.0F - var40 * var40) * 0.5F + 0.5F) * var2;
                var20.c(var22, var32, var21);
                int var42 = var4.b(var20, 0);
                int var43 = var42 >> 16 & 0xFFFF;
                int var44 = var42 & 0xFFFF;
                var9.b(var22 - var24 + 0.5D, var30, var21 - var26 + 0.5D).a(0.0D, var30 * 0.25D + var34).a(1.0F, 1.0F, 1.0F, var41).a(var43, var44).d();
                var9.b(var22 + var24 + 0.5D, var30, var21 + var26 + 0.5D).a(1.0D, var30 * 0.25D + var34).a(1.0F, 1.0F, 1.0F, var41).a(var43, var44).d();
                var9.b(var22 + var24 + 0.5D, var31, var21 + var26 + 0.5D).a(1.0D, var31 * 0.25D + var34).a(1.0F, 1.0F, 1.0F, var41).a(var43, var44).d();
                var9.b(var22 - var24 + 0.5D, var31, var21 - var26 + 0.5D).a(0.0D, var31 * 0.25D + var34).a(1.0F, 1.0F, 1.0F, var41).a(var43, var44).d();
              }
              else
              {
                if (var18 != 1)
                {
                  if (var18 >= 0) {
                    var8.b();
                  }
                  var18 = 1;
                  this.h.P().a(g);
                  var9.a(7, bms.d);
                }
                double var34 = ((this.m & 0x1FF) + partialTicks) / 512.0F;
                double var36 = this.j.nextDouble() + var19 * 0.01D * (float)this.j.nextGaussian();
                double var38 = this.j.nextDouble() + var19 * (float)this.j.nextGaussian() * 0.001D;
                double var49 = var22 + 0.5F - var3.s;
                double var50 = var21 + 0.5F - var3.u;
                float var51 = ns.a(var49 * var49 + var50 * var50) / var17;
                float var45 = ((1.0F - var51 * var51) * 0.3F + 0.5F) * var2;
                var20.c(var22, var32, var21);
                int var46 = (var4.b(var20, 0) * 3 + 15728880) / 4;
                int var47 = var46 >> 16 & 0xFFFF;
                int var48 = var46 & 0xFFFF;
                var9.b(var22 - var24 + 0.5D, var30, var21 - var26 + 0.5D).a(0.0D + var36, var30 * 0.25D + var34 + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).d();
                var9.b(var22 + var24 + 0.5D, var30, var21 + var26 + 0.5D).a(1.0D + var36, var30 * 0.25D + var34 + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).d();
                var9.b(var22 + var24 + 0.5D, var31, var21 + var26 + 0.5D).a(1.0D + var36, var31 * 0.25D + var34 + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).d();
                var9.b(var22 - var24 + 0.5D, var31, var21 - var26 + 0.5D).a(0.0D + var36, var31 * 0.25D + var34 + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).d();
              }
            }
          }
        }
      }
      if (var18 >= 0) {
        var8.b();
      }
      var9.c(0.0D, 0.0D, 0.0D);
      bfl.o();
      bfl.k();
      bfl.a(516, 0.1F);
      h();
    }
  }
  
  public void j()
  {
    avr var1 = new avr(this.h);
    bfl.m(256);
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, var1.c(), var1.d(), 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
  }
  
  private void i(float partialTicks)
  {
    bdb var2 = this.h.f;
    pk var3 = this.h.ac();
    float var4 = 0.25F + 0.75F * this.h.t.c / 32.0F;
    var4 = 1.0F - (float)Math.pow(var4, 0.25D);
    aui var5 = var2.a(this.h.ac(), partialTicks);
    
    var5 = CustomColorizer.getWorldSkyColor(var5, var2, this.h.ac(), partialTicks);
    
    float var6 = (float)var5.a;
    float var7 = (float)var5.b;
    float var8 = (float)var5.c;
    aui var9 = var2.f(partialTicks);
    
    var9 = CustomColorizer.getWorldFogColor(var9, var2, this.h.ac(), partialTicks);
    
    this.Q = ((float)var9.a);
    this.R = ((float)var9.b);
    this.S = ((float)var9.c);
    if (this.h.t.c >= 4)
    {
      double var10 = -1.0D;
      aui var12 = ns.a(var2.d(partialTicks)) > 0.0F ? new aui(var10, 0.0D, 0.0D) : new aui(1.0D, 0.0D, 0.0D);
      float var13 = (float)var3.d(partialTicks).b(var12);
      if (var13 < 0.0F) {
        var13 = 0.0F;
      }
      if (var13 > 0.0F)
      {
        float[] var14 = var2.t.a(var2.c(partialTicks), partialTicks);
        if (var14 != null)
        {
          var13 *= var14[3];
          this.Q = (this.Q * (1.0F - var13) + var14[0] * var13);
          this.R = (this.R * (1.0F - var13) + var14[1] * var13);
          this.S = (this.S * (1.0F - var13) + var14[2] * var13);
        }
      }
    }
    this.Q += (var6 - this.Q) * var4;
    this.R += (var7 - this.R) * var4;
    this.S += (var8 - this.S) * var4;
    float var19 = var2.j(partialTicks);
    if (var19 > 0.0F)
    {
      float var11 = 1.0F - var19 * 0.5F;
      float var20 = 1.0F - var19 * 0.4F;
      this.Q *= var11;
      this.R *= var11;
      this.S *= var20;
    }
    float var11 = var2.h(partialTicks);
    if (var11 > 0.0F)
    {
      float var20 = 1.0F - var11 * 0.5F;
      this.Q *= var20;
      this.R *= var20;
      this.S *= var20;
    }
    afh var21 = auz.a(this.h.f, var3, partialTicks);
    if (this.B)
    {
      aui var22 = var2.e(partialTicks);
      this.Q = ((float)var22.a);
      this.R = ((float)var22.b);
      this.S = ((float)var22.c);
    }
    else if (var21.t() == arm.h)
    {
      float var13 = ack.a(var3) * 0.2F;
      if (((var3 instanceof pr)) && (((pr)var3).a(pe.o))) {
        var13 = var13 * 0.3F + 0.6F;
      }
      this.Q = (0.02F + var13);
      this.R = (0.02F + var13);
      this.S = (0.2F + var13);
      
      aui colUnderwater = CustomColorizer.getUnderwaterColor(this.h.f, this.h.ac().s, this.h.ac().t + 1.0D, this.h.ac().u);
      if (colUnderwater != null)
      {
        this.Q = ((float)colUnderwater.a);
        this.R = ((float)colUnderwater.b);
        this.S = ((float)colUnderwater.c);
      }
    }
    else if (var21.t() == arm.i)
    {
      this.Q = 0.6F;
      this.R = 0.1F;
      this.S = 0.0F;
    }
    float var13 = this.T + (this.U - this.T) * partialTicks;
    this.Q *= var13;
    this.R *= var13;
    this.S *= var13;
    
    double fogYFactor = var2.t.j();
    
    double var23 = (var3.Q + (var3.t - var3.Q) * partialTicks) * fogYFactor;
    if (((var3 instanceof pr)) && (((pr)var3).a(pe.q)))
    {
      int var16 = ((pr)var3).b(pe.q).b();
      if (var16 < 20) {
        var23 *= (1.0F - var16 / 20.0F);
      } else {
        var23 = 0.0D;
      }
    }
    if (var23 < 1.0D)
    {
      if (var23 < 0.0D) {
        var23 = 0.0D;
      }
      var23 *= var23;
      this.Q = ((float)(this.Q * var23));
      this.R = ((float)(this.R * var23));
      this.S = ((float)(this.S * var23));
    }
    if (this.z > 0.0F)
    {
      float var24 = this.A + (this.z - this.A) * partialTicks;
      this.Q = (this.Q * (1.0F - var24) + this.Q * 0.7F * var24);
      this.R = (this.R * (1.0F - var24) + this.R * 0.6F * var24);
      this.S = (this.S * (1.0F - var24) + this.S * 0.6F * var24);
    }
    if (((var3 instanceof pr)) && (((pr)var3).a(pe.r)))
    {
      float var24 = a((pr)var3, partialTicks);
      float var17 = 1.0F / this.Q;
      if (var17 > 1.0F / this.R) {
        var17 = 1.0F / this.R;
      }
      if (var17 > 1.0F / this.S) {
        var17 = 1.0F / this.S;
      }
      this.Q = (this.Q * (1.0F - var24) + this.Q * var17 * var24);
      this.R = (this.R * (1.0F - var24) + this.R * var17 * var24);
      this.S = (this.S * (1.0F - var24) + this.S * var17 * var24);
    }
    if (this.h.t.e)
    {
      float var24 = (this.Q * 30.0F + this.R * 59.0F + this.S * 11.0F) / 100.0F;
      float var17 = (this.Q * 30.0F + this.R * 70.0F) / 100.0F;
      float var18 = (this.Q * 30.0F + this.S * 70.0F) / 100.0F;
      this.Q = var24;
      this.R = var17;
      this.S = var18;
    }
    if (Reflector.EntityViewRenderEvent_FogColors_Constructor.exists())
    {
      Object event = Reflector.newInstance(Reflector.EntityViewRenderEvent_FogColors_Constructor, new Object[] { this, var3, var21, Float.valueOf(partialTicks), Float.valueOf(this.Q), Float.valueOf(this.R), Float.valueOf(this.S) });
      Reflector.postForgeBusEvent(event);
      
      this.Q = Reflector.getFieldValueFloat(event, Reflector.EntityViewRenderEvent_FogColors_red, this.Q);
      this.R = Reflector.getFieldValueFloat(event, Reflector.EntityViewRenderEvent_FogColors_green, this.R);
      this.S = Reflector.getFieldValueFloat(event, Reflector.EntityViewRenderEvent_FogColors_blue, this.S);
    }
    Shaders.setClearColor(this.Q, this.R, this.S, 0.0F);
  }
  
  private void a(int p_78468_1_, float partialTicks)
  {
    pk var3 = this.h.ac();
    boolean var4 = false;
    
    this.fogStandard = false;
    if ((var3 instanceof wn)) {
      var4 = ((wn)var3).bA.d;
    }
    GL11.glFog(2918, a(this.Q, this.R, this.S, 1.0F));
    GL11.glNormal3f(0.0F, -1.0F, 0.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    afh var5 = auz.a(this.h.f, var3, partialTicks);
    
    Object event = Reflector.newInstance(Reflector.EntityViewRenderEvent_FogDensity_Constructor, new Object[] { this, var3, var5, Float.valueOf(partialTicks), Float.valueOf(0.1F) });
    if (Reflector.postForgeBusEvent(event))
    {
      float density = Reflector.getFieldValueFloat(event, Reflector.EntityViewRenderEvent_FogDensity_density, 0.0F);
      bfl.a(density);
    }
    else if (((var3 instanceof pr)) && (((pr)var3).a(pe.q)))
    {
      float var6 = 5.0F;
      int var7 = ((pr)var3).b(pe.q).b();
      if (var7 < 20) {
        var6 = 5.0F + (this.k - 5.0F) * (1.0F - var7 / 20.0F);
      }
      if (Config.isShaders()) {
        Shaders.setFog(9729);
      } else {
        bfl.d(9729);
      }
      if (p_78468_1_ == -1)
      {
        bfl.b(0.0F);
        bfl.c(var6 * 0.8F);
      }
      else
      {
        bfl.b(var6 * 0.25F);
        bfl.c(var6);
      }
      if (GLContext.getCapabilities().GL_NV_fog_distance) {
        if (Config.isFogFancy()) {
          GL11.glFogi(34138, 34139);
        }
      }
    }
    else if (this.B)
    {
      if (Config.isShaders()) {
        Shaders.setFog(2048);
      } else {
        bfl.d(2048);
      }
      bfl.a(0.1F);
    }
    else if (var5.t() == arm.h)
    {
      if (Config.isShaders()) {
        Shaders.setFog(2048);
      } else {
        bfl.d(2048);
      }
      if (((var3 instanceof pr)) && (((pr)var3).a(pe.o))) {
        bfl.a(0.01F);
      } else {
        bfl.a(0.1F - ack.a(var3) * 0.03F);
      }
      if (Config.isClearWater()) {
        bfl.a(0.02F);
      }
    }
    else if (var5.t() == arm.i)
    {
      if (Config.isShaders()) {
        Shaders.setFog(2048);
      } else {
        bfl.d(2048);
      }
      bfl.a(2.0F);
    }
    else
    {
      float var6 = this.k;
      
      this.fogStandard = true;
      if (Config.isShaders()) {
        Shaders.setFog(9729);
      } else {
        bfl.d(9729);
      }
      if (p_78468_1_ == -1)
      {
        bfl.b(0.0F);
        bfl.c(var6);
      }
      else
      {
        bfl.b(var6 * Config.getFogStart());
        bfl.c(var6);
      }
      if (GLContext.getCapabilities().GL_NV_fog_distance)
      {
        if (Config.isFogFancy()) {
          GL11.glFogi(34138, 34139);
        }
        if (Config.isFogFast()) {
          GL11.glFogi(34138, 34140);
        }
      }
      if (this.h.f.t.b((int)var3.s, (int)var3.u))
      {
        bfl.b(var6 * 0.05F);
        
        bfl.c(var6);
      }
      if (Reflector.ForgeHooksClient_onFogRender.exists()) {
        Reflector.callVoid(Reflector.ForgeHooksClient_onFogRender, new Object[] { this, var3, var5, Float.valueOf(partialTicks), Integer.valueOf(p_78468_1_), Float.valueOf(var6) });
      }
    }
    bfl.g();
    bfl.m();
    bfl.a(1028, 4608);
  }
  
  private FloatBuffer a(float p_78469_1_, float p_78469_2_, float p_78469_3_, float p_78469_4_)
  {
    if (Config.isShaders()) {
      Shaders.setFogColor(p_78469_1_, p_78469_2_, p_78469_3_);
    }
    this.P.clear();
    this.P.put(p_78469_1_).put(p_78469_2_).put(p_78469_3_).put(p_78469_4_);
    this.P.flip();
    return this.P;
  }
  
  public avq k()
  {
    return this.l;
  }
  
  private void waitForServerThread()
  {
    this.serverWaitTimeCurrent = 0;
    if ((!Config.isSmoothWorld()) || (!Config.isSingleProcessor()))
    {
      this.lastServerTime = 0L;
      this.lastServerTicks = 0;
      return;
    }
    if (!this.h.E()) {
      return;
    }
    bpo srv = this.h.G();
    if (srv == null) {
      return;
    }
    boolean paused = this.h.V();
    if ((paused) || ((this.h.m instanceof axs)))
    {
      if ((this.h.m instanceof axs)) {
        Config.sleep(20L);
      }
      this.lastServerTime = 0L;
      this.lastServerTicks = 0;
      return;
    }
    if (this.serverWaitTime > 0)
    {
      Lagometer.timerServer.start();
      
      Config.sleep(this.serverWaitTime);
      
      Lagometer.timerServer.end();
      
      this.serverWaitTimeCurrent = this.serverWaitTime;
    }
    long timeNow = System.nanoTime() / 1000000L;
    if ((this.lastServerTime == 0L) || (this.lastServerTicks == 0))
    {
      this.lastServerTime = timeNow;
      this.lastServerTicks = srv.at();
      this.avgServerTickDiff = 1.0F;
      this.avgServerTimeDiff = 50.0F;
      return;
    }
    long timeDiff = timeNow - this.lastServerTime;
    if (timeDiff < 0L)
    {
      this.lastServerTime = timeNow;
      timeDiff = 0L;
    }
    if (timeDiff < 50L) {
      return;
    }
    this.lastServerTime = timeNow;
    
    int ticks = srv.at();
    
    int tickDiff = ticks - this.lastServerTicks;
    if (tickDiff < 0)
    {
      this.lastServerTicks = ticks;
      tickDiff = 0;
    }
    if (tickDiff < 1) {
      if (this.serverWaitTime < 100) {
        this.serverWaitTime += 2;
      }
    }
    if (tickDiff > 1) {
      if (this.serverWaitTime > 0) {
        this.serverWaitTime -= 1;
      }
    }
    this.lastServerTicks = ticks;
  }
  
  private void frameInit()
  {
    if (!this.initialized)
    {
      TextureUtils.registerResourceListener();
      if ((Config.getBitsOs() == 64) && (Config.getBitsJre() == 32)) {
        Config.setNotify64BitJava(true);
      }
      this.initialized = true;
    }
    Config.isActing();
    
    Config.checkDisplayMode();
    
    adm world = this.h.f;
    if (world != null)
    {
      if (Config.getNewRelease() != null)
      {
        String userEdition = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
        String fullNewVer = userEdition + " " + Config.getNewRelease();
        fa msg = new fa("A new §eOptiFine§f version is available: §e" + fullNewVer + "§f");
        this.h.q.d().a(msg);
        Config.setNewRelease(null);
      }
      if (Config.isNotify64BitJava())
      {
        Config.setNotify64BitJava(false);
        fa msg = new fa("You can install §e64-bit Java§f to increase performance");
        this.h.q.d().a(msg);
      }
    }
    if ((this.h.m instanceof aya)) {
      updateMainMenu((aya)this.h.m);
    }
    if (this.updatedWorld != world)
    {
      RandomMobs.worldChanged(this.updatedWorld, world);
      
      Config.updateThreadPriorities();
      
      this.lastServerTime = 0L;
      this.lastServerTicks = 0;
      
      this.updatedWorld = world;
    }
    if (!setFxaaShader(Shaders.configAntialiasingLevel)) {
      Shaders.configAntialiasingLevel = 0;
    }
  }
  
  private void frameFinish()
  {
    if (this.h.f != null)
    {
      long now = System.currentTimeMillis();
      if (now > this.lastErrorCheckTimeMs + 10000L)
      {
        this.lastErrorCheckTimeMs = now;
        
        int err = GL11.glGetError();
        if (err != 0)
        {
          String text = GLU.gluErrorString(err);
          fa msg = new fa("§eOpenGL Error§f: " + err + " (" + text + ")");
          this.h.q.d().a(msg);
        }
      }
    }
  }
  
  private void updateMainMenu(aya mainGui)
  {
    try
    {
      String str = null;
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(new Date());
      int day = calendar.get(5);
      int month = calendar.get(2) + 1;
      if ((day == 8) && (month == 4)) {
        str = "Happy birthday, OptiFine!";
      }
      if ((day == 14) && (month == 8)) {
        str = "Happy birthday, sp614x!";
      }
      if (str == null) {
        return;
      }
      Field[] fs = aya.class.getDeclaredFields();
      for (int i = 0; i < fs.length; i++) {
        if (fs[i].getType() == String.class)
        {
          fs[i].setAccessible(true);
          fs[i].set(mainGui, str);
          break;
        }
      }
    }
    catch (Throwable e) {}
  }
  
  public boolean setFxaaShader(int fxaaLevel)
  {
    if (!bqs.i()) {
      return false;
    }
    if ((this.aa != null) && (this.aa != this.fxaaShaders[2]) && (this.aa != this.fxaaShaders[4])) {
      return true;
    }
    if ((fxaaLevel == 2) || (fxaaLevel == 4))
    {
      if ((this.aa != null) && (this.aa == this.fxaaShaders[fxaaLevel])) {
        return true;
      }
      if (this.h.f == null) {
        return true;
      }
      a(new jy("shaders/post/fxaa_of_" + fxaaLevel + "x.json"));
      
      this.fxaaShaders[fxaaLevel] = this.aa;
      
      return this.ad;
    }
    if (this.aa == null) {
      return true;
    }
    this.aa.a();
    this.aa = null;
    
    return true;
  }
}
