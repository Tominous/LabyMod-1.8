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
    ac = d;
    ad = false;
    ae = 0;
    h = mcIn;
    i = p_i45076_2_;
    c = mcIn.ah();
    l = new avq(mcIn.P());
    G = new blz(16, 16);
    I = mcIn.P().a("lightMap", G);
    H = G.e();
    aa = null;
    for (int var3 = 0; var3 < 32; var3++) {
      for (int var4 = 0; var4 < 32; var4++)
      {
        float var5 = var4 - 16;
        float var6 = var3 - 16;
        float var7 = ns.c(var5 * var5 + var6 * var6);
        N[(var3 << 5 | var4)] = (-var6 / var7);
        O[(var3 << 5 | var4)] = (var5 / var7);
      }
    }
  }
  
  public boolean a()
  {
    return (bqs.O) && (aa != null);
  }
  
  public void b()
  {
    if (aa != null) {
      aa.a();
    }
    aa = null;
    ac = d;
  }
  
  public void c()
  {
    ad = (!ad);
  }
  
  public void a(pk p_175066_1_)
  {
    if (bqs.O)
    {
      if (aa != null) {
        aa.a();
      }
      aa = null;
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
      if ((h.ac() instanceof wn))
      {
        if (aa != null) {
          aa.a();
        }
        ac = ((ac + 1) % (ab.length + 1));
        if (ac != d) {
          a(ab[ac]);
        } else {
          aa = null;
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
      aa = new blr(h.P(), i, h.b(), p_175069_1_);
      aa.a(h.d, h.e);
      ad = true;
    }
    catch (IOException var3)
    {
      e.warn("Failed to load shader: " + p_175069_1_, var3);
      ac = d;
      ad = false;
    }
    catch (JsonSyntaxException var4)
    {
      e.warn("Failed to load shader: " + p_175069_1_, var4);
      ac = d;
      ad = false;
    }
  }
  
  public void a(bni resourceManager)
  {
    if (aa != null) {
      aa.a();
    }
    aa = null;
    if (ac != d) {
      a(ab[ac]);
    } else {
      a(h.ac());
    }
  }
  
  public void e()
  {
    if ((bqs.O) && (blu.b() == null)) {
      blu.a();
    }
    l();
    m();
    T = U;
    r = q;
    if (h.t.aF)
    {
      float var1 = h.t.a * 0.6F + 0.2F;
      float var2 = var1 * var1 * var1 * 8.0F;
      u = o.a(s, 0.05F * var2);
      v = p.a(t, 0.05F * var2);
      w = 0.0F;
      s = 0.0F;
      t = 0.0F;
    }
    else
    {
      u = 0.0F;
      v = 0.0F;
      o.a();
      p.a();
    }
    if (h.ac() == null) {
      h.a(h.h);
    }
    float var1 = h.f.o(new cj(h.ac()));
    float var2 = h.t.c / 32.0F;
    float var3 = var1 * (1.0F - var2) + var2;
    U += (var3 - U) * 0.1F;
    m += 1;
    c.a();
    o();
    A = z;
    if (bfc.d)
    {
      z += 0.05F;
      if (z > 1.0F) {
        z = 1.0F;
      }
      bfc.d = false;
    }
    else if (z > 0.0F)
    {
      z -= 0.0125F;
    }
  }
  
  public blr f()
  {
    return aa;
  }
  
  public void a(int p_147704_1_, int p_147704_2_)
  {
    if (bqs.O)
    {
      if (aa != null) {
        aa.a(p_147704_1_, p_147704_2_);
      }
      h.g.a(p_147704_1_, p_147704_2_);
    }
  }
  
  public void a(float p_78473_1_)
  {
    pk var2 = h.ac();
    if (var2 != null) {
      if (h.f != null)
      {
        h.A.a("pick");
        h.i = null;
        double var3 = h.c.d();
        h.s = var2.a(var3, p_78473_1_);
        double var5 = var3;
        aui var7 = var2.e(p_78473_1_);
        boolean var8 = false;
        boolean var9 = true;
        if (h.c.i())
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
        if (h.s != null) {
          var5 = h.s.c.f(var7);
        }
        aui var10 = var2.d(p_78473_1_);
        aui var11 = var7.b(a * var3, b * var3, c * var3);
        n = null;
        aui var12 = null;
        float var13 = 1.0F;
        List var14 = h.f.a(var2, var2.aR().a(a * var3, b * var3, c * var3).b(var13, var13, var13), Predicates.and(po.d, new bfk.1(this)));
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
              n = var18;
              var12 = var21 == null ? var7 : c;
              var15 = 0.0D;
            }
          }
          else if (var21 != null)
          {
            double var22 = var7.f(c);
            if ((var22 < var15) || (var15 == 0.0D))
            {
              boolean canRiderInteract = false;
              if (Reflector.ForgeEntity_canRiderInteract.exists()) {
                canRiderInteract = Reflector.callBoolean(var18, Reflector.ForgeEntity_canRiderInteract, new Object[0]);
              }
              if ((var18 == m) && (!canRiderInteract))
              {
                if (var15 == 0.0D)
                {
                  n = var18;
                  var12 = c;
                }
              }
              else
              {
                n = var18;
                var12 = c;
                var15 = var22;
              }
            }
          }
        }
        if ((n != null) && (var8) && (var7.f(var12) > 3.0D))
        {
          n = null;
          h.s = new auh(auh.a.a, var12, (cq)null, new cj(var12));
        }
        if ((n != null) && ((var15 < var5) || (h.s == null)))
        {
          h.s = new auh(n, var12);
          if (((n instanceof pr)) || ((n instanceof uo))) {
            h.i = n;
          }
        }
        h.A.b();
      }
    }
  }
  
  private void l()
  {
    float var1 = 1.0F;
    if ((h.ac() instanceof bet))
    {
      bet var2 = (bet)h.ac();
      var1 = var2.o();
    }
    y = x;
    x += (var1 - x) * 0.5F;
    if (x > 1.5F) {
      x = 1.5F;
    }
    if (x < 0.1F) {
      x = 0.1F;
    }
  }
  
  private float a(float partialTicks, boolean p_78481_2_)
  {
    if (W) {
      return 90.0F;
    }
    pk var3 = h.ac();
    float var4 = 70.0F;
    if (p_78481_2_)
    {
      var4 = h.t.aH;
      var4 *= (y + (x - y) * partialTicks);
    }
    boolean zoomActive = false;
    if (h.m == null) {
      zoomActive = avh.a(h.t.ofKeyBindZoom);
    }
    if (zoomActive)
    {
      if (!Config.zoomMode)
      {
        Config.zoomMode = true;
        h.t.aF = true;
      }
      if (Config.zoomMode) {
        var4 /= 4.0F;
      }
    }
    else if (Config.zoomMode)
    {
      Config.zoomMode = false;
      h.t.aF = false;
      
      o = new nv();
      p = new nv();
      
      h.g.ac = true;
    }
    if (((var3 instanceof pr)) && (((pr)var3).bn() <= 0.0F))
    {
      float var5 = ax + partialTicks;
      var4 /= ((1.0F - 500.0F / (var5 + 500.0F)) * 2.0F + 1.0F);
    }
    afh var6 = auz.a(h.f, var3, partialTicks);
    if (var6.t() == arm.h) {
      var4 = var4 * 60.0F / 70.0F;
    }
    return var4;
  }
  
  private void d(float p_78482_1_)
  {
    if ((h.ac() instanceof pr))
    {
      pr var2 = (pr)h.ac();
      float var3 = au - p_78482_1_;
      if (var2.bn() <= 0.0F)
      {
        float var4 = ax + p_78482_1_;
        bfl.b(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }
      if (var3 < 0.0F) {
        return;
      }
      var3 /= av;
      var3 = ns.a(var3 * var3 * var3 * var3 * 3.1415927F);
      float var4 = aw;
      bfl.b(-var4, 0.0F, 1.0F, 0.0F);
      bfl.b(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(var4, 0.0F, 1.0F, 0.0F);
    }
  }
  
  private void e(float p_78475_1_)
  {
    if ((h.ac() instanceof wn))
    {
      wn var2 = (wn)h.ac();
      float var3 = M - L;
      float var4 = -(M + var3 * p_78475_1_);
      float var5 = bn + (bo - bn) * p_78475_1_;
      float var6 = aE + (aF - aE) * p_78475_1_;
      bfl.b(ns.a(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(ns.b(var4 * 3.1415927F) * var5), 0.0F);
      bfl.b(ns.a(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(Math.abs(ns.b(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
      bfl.b(var6, 1.0F, 0.0F, 0.0F);
    }
  }
  
  private void f(float p_78467_1_)
  {
    pk var2 = h.ac();
    float var3 = var2.aS();
    double var4 = p + (s - p) * p_78467_1_;
    double var6 = q + (t - q) * p_78467_1_ + var3;
    double var8 = r + (u - r) * p_78467_1_;
    if (((var2 instanceof pr)) && (((pr)var2).bJ()))
    {
      var3 = (float)(var3 + 1.0D);
      bfl.b(0.0F, 0.3F, 0.0F);
      if (!h.t.aG)
      {
        cj var27 = new cj(var2);
        alz var11 = h.f.p(var27);
        afh var29 = var11.c();
        if (Reflector.ForgeHooksClient_orientBedCamera.exists())
        {
          Reflector.callVoid(Reflector.ForgeHooksClient_orientBedCamera, new Object[] { h.f, var27, var11, var2 });
        }
        else if (var29 == afi.C)
        {
          int var30 = ((cq)var11.b(afg.O)).b();
          bfl.b(var30 * 90, 0.0F, 1.0F, 0.0F);
        }
        bfl.b(A + (y - A) * p_78467_1_ + 180.0F, 0.0F, -1.0F, 0.0F);
        bfl.b(B + (z - B) * p_78467_1_, -1.0F, 0.0F, 0.0F);
      }
    }
    else if (h.t.aA > 0)
    {
      double var10 = r + (q - r) * p_78467_1_;
      if (h.t.aG)
      {
        bfl.b(0.0F, 0.0F, (float)-var10);
      }
      else
      {
        float var12 = y;
        float var13 = z;
        if (h.t.aA == 2) {
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
          auh var24 = h.f.a(new aui(var4 + var21, var6 + var22, var8 + var23), new aui(var4 - var14 + var21 + var23, var6 - var18 + var22, var8 - var16 + var23));
          if (var24 != null)
          {
            double var25 = c.f(new aui(var4, var6, var8));
            if (var25 < var10) {
              var10 = var25;
            }
          }
        }
        if (h.t.aA == 2) {
          bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
        }
        bfl.b(z - var13, 1.0F, 0.0F, 0.0F);
        bfl.b(y - var12, 0.0F, 1.0F, 0.0F);
        bfl.b(0.0F, 0.0F, (float)-var10);
        bfl.b(var12 - y, 0.0F, 1.0F, 0.0F);
        bfl.b(var13 - z, 1.0F, 0.0F, 0.0F);
      }
    }
    else
    {
      bfl.b(0.0F, 0.0F, -0.1F);
    }
    if (!h.t.aG)
    {
      bfl.b(B + (z - B) * p_78467_1_, 1.0F, 0.0F, 0.0F);
      if ((var2 instanceof tm))
      {
        tm var28 = (tm)var2;
        bfl.b(aL + (aK - aL) * p_78467_1_ + 180.0F, 0.0F, 1.0F, 0.0F);
      }
      else
      {
        bfl.b(A + (y - A) * p_78467_1_ + 180.0F, 0.0F, 1.0F, 0.0F);
      }
    }
    bfl.b(0.0F, -var3, 0.0F);
    var4 = p + (s - p) * p_78467_1_;
    var6 = q + (t - q) * p_78467_1_ + var3;
    var8 = r + (u - r) * p_78467_1_;
    B = h.g.a(var4, var6, var8, p_78467_1_);
  }
  
  public void a(float partialTicks, int pass)
  {
    k = (h.t.c * 16);
    if (Config.isFogFancy()) {
      k *= 0.95F;
    }
    if (Config.isFogFast()) {
      k *= 0.83F;
    }
    bfl.n(5889);
    bfl.D();
    float var3 = 0.07F;
    if (h.t.e) {
      bfl.b(-(pass * 2 - 1) * var3, 0.0F, 0.0F);
    }
    clipDistance = (k * 2.0F);
    if (clipDistance < 173.0F) {
      clipDistance = 173.0F;
    }
    if (h.f.t.q() == 1) {
      clipDistance = 256.0F;
    }
    if (X != 1.0D)
    {
      bfl.b((float)Y, (float)-Z, 0.0F);
      bfl.a(X, X, 1.0D);
    }
    Project.gluPerspective(a(partialTicks, true), h.d / h.e, 0.05F, clipDistance);
    bfl.n(5888);
    bfl.D();
    if (h.t.e) {
      bfl.b((pass * 2 - 1) * 0.1F, 0.0F, 0.0F);
    }
    d(partialTicks);
    if (h.t.d) {
      e(partialTicks);
    }
    float var4 = h.h.bI + (h.h.bH - h.h.bI) * partialTicks;
    if (var4 > 0.0F)
    {
      byte var5 = 20;
      if (h.h.a(pe.k)) {
        var5 = 7;
      }
      float var6 = 5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F;
      var6 *= var6;
      bfl.b((m + partialTicks) * var5, 0.0F, 1.0F, 1.0F);
      bfl.a(1.0F / var6, 1.0F, 1.0F);
      bfl.b(-(m + partialTicks) * var5, 0.0F, 1.0F, 1.0F);
    }
    f(partialTicks);
    if (W) {
      switch (V)
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
    if (!W)
    {
      bfl.n(5889);
      bfl.D();
      float var3 = 0.07F;
      if (h.t.e) {
        bfl.b(-(p_78476_2_ * 2 - 1) * var3, 0.0F, 0.0F);
      }
      if (Config.isShaders()) {
        Shaders.applyHandDepth();
      }
      Project.gluPerspective(a(p_78476_1_, false), h.d / h.e, 0.05F, k * 2.0F);
      bfl.n(5888);
      bfl.D();
      if (h.t.e) {
        bfl.b((p_78476_2_ * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }
      boolean var4 = false;
      if ((!Config.isShaders()) || (!Shaders.isHandRendered))
      {
        bfl.E();
        d(p_78476_1_);
        if (h.t.d) {
          e(p_78476_1_);
        }
        var4 = ((h.ac() instanceof pr)) && (((pr)h.ac()).bJ());
        if ((h.t.aA == 0) && (!var4) && (!h.t.az) && (!h.c.a()))
        {
          i();
          if (Config.isShaders()) {
            ShadersRender.renderItemFP(c, p_78476_1_);
          } else {
            c.a(p_78476_1_);
          }
          h();
        }
        bfl.F();
      }
      if ((Config.isShaders()) && (!Shaders.isCompositeRendered)) {
        return;
      }
      h();
      if ((h.t.aA == 0) && (!var4))
      {
        c.b(p_78476_1_);
        d(p_78476_1_);
      }
      if (h.t.d) {
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
    h.P().a(I);
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
    L = ((float)(L + (Math.random() - Math.random()) * Math.random() * Math.random()));
    L = ((float)(L * 0.9D));
    K += (L - K) * 1.0F;
    J = true;
  }
  
  private void g(float partialTicks)
  {
    if (J)
    {
      h.A.a("lightTex");
      bdb var2 = h.f;
      if (var2 != null)
      {
        if (CustomColorizer.updateLightmap(var2, K, H, h.h.a(pe.r)))
        {
          G.d();
          J = false;
          h.A.b();
          
          return;
        }
        float var3 = var2.b(1.0F);
        float var4 = var3 * 0.95F + 0.05F;
        for (int var5 = 0; var5 < 256; var5++)
        {
          float var6 = t.p()[(var5 / 16)] * var4;
          float var7 = t.p()[(var5 % 16)] * (K * 0.1F + 1.5F);
          if (var2.ac() > 0) {
            var6 = t.p()[(var5 / 16)];
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
          if (z > 0.0F)
          {
            float var17 = A + (z - A) * partialTicks;
            var14 = var14 * (1.0F - var17) + var14 * 0.7F * var17;
            var15 = var15 * (1.0F - var17) + var15 * 0.6F * var17;
            var16 = var16 * (1.0F - var17) + var16 * 0.6F * var17;
          }
          if (t.q() == 1)
          {
            var14 = 0.22F + var7 * 0.75F;
            var15 = 0.28F + var12 * 0.75F;
            var16 = 0.25F + var13 * 0.75F;
          }
          if (h.h.a(pe.r))
          {
            float var17 = a(h.h, partialTicks);
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
          float var17 = h.t.aI;
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
          H[var5] = (var21 << 24 | var22 << 16 | var23 << 8 | var24);
        }
        G.d();
        J = false;
        h.A.b();
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
    if ((!var4) && (h.t.z) && ((!h.t.A) || (!Mouse.isButtonDown(1))))
    {
      if (ave.J() - E > 500L) {
        h.p();
      }
    }
    else {
      E = ave.J();
    }
    h.A.a("mouse");
    if ((var4) && (ave.a) && (h.w) && (!Mouse.isInsideWindow()))
    {
      Mouse.setGrabbed(false);
      Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
      Mouse.setGrabbed(true);
    }
    if ((h.w) && (var4))
    {
      h.u.c();
      float var5 = h.t.a * 0.6F + 0.2F;
      float var6 = var5 * var5 * var5 * 8.0F;
      float var7 = h.u.a * var6;
      float var8 = h.u.b * var6;
      byte var9 = 1;
      if (h.t.b) {
        var9 = -1;
      }
      if (h.t.aF)
      {
        s += var7;
        t += var8;
        float var10 = partialTicks - w;
        w = partialTicks;
        var7 = u * var10;
        var8 = v * var10;
        h.h.c(var7, var8 * var9);
      }
      else
      {
        s = 0.0F;
        t = 0.0F;
        h.h.c(var7, var8 * var9);
      }
    }
    h.A.b();
    if (!h.r)
    {
      a = h.t.e;
      final avr var17 = new avr(h);
      int var18 = var17.a();
      int var19 = var17.b();
      final int var20 = Mouse.getX() * var18 / h.d;
      final int var21 = var19 - Mouse.getY() * var19 / h.e - 1;
      int var22 = h.t.g;
      if (h.f != null)
      {
        h.A.a("level");
        int var11 = Math.min(ave.ai(), var22);
        var11 = Math.max(var11, 60);
        long var12 = System.nanoTime() - nanoTimeStart;
        long var14 = Math.max(1000000000 / var11 / 4 - var12, 0L);
        b(partialTicks, System.nanoTime() + var14);
        if (bqs.O)
        {
          h.g.c();
          if ((aa != null) && (ad))
          {
            bfl.n(5890);
            bfl.E();
            bfl.D();
            aa.a(partialTicks);
            bfl.F();
          }
          h.b().a(true);
        }
        F = System.nanoTime();
        h.A.c("gui");
        if ((!h.t.az) || (h.m != null))
        {
          bfl.a(516, 0.1F);
          h.q.a(partialTicks);
          if ((h.t.ofShowFps) && (!h.t.aB)) {
            Config.drawFps();
          }
          if (h.t.aB) {
            Lagometer.showLagometer(var17);
          }
        }
        h.A.b();
      }
      else
      {
        bfl.b(0, 0, h.d, h.e);
        bfl.n(5889);
        bfl.D();
        bfl.n(5888);
        bfl.D();
        j();
        F = System.nanoTime();
      }
      if (h.m != null)
      {
        bfl.m(256);
        try
        {
          if (Reflector.ForgeHooksClient_drawScreen.exists()) {
            Reflector.callVoid(Reflector.ForgeHooksClient_drawScreen, new Object[] { h.m, Integer.valueOf(var20), Integer.valueOf(var21), Float.valueOf(partialTicks) });
          } else {
            h.m.a(var20, var21, partialTicks);
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
              return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", new Object[] { Integer.valueOf(var17.a()), Integer.valueOf(var17.b()), Integer.valueOf(ad), Integer.valueOf(ae), Integer.valueOf(var17.e()) });
            }
          });
          throw new e(var23);
        }
      }
    }
    frameFinish();
    
    waitForServerThread();
    
    Lagometer.updateLagometer();
    if (h.t.ofProfiler) {
      h.t.aC = true;
    }
  }
  
  public void b(float p_152430_1_)
  {
    j();
    h.q.c(new avr(h));
  }
  
  private boolean n()
  {
    if (!D) {
      return false;
    }
    pk var1 = h.ac();
    boolean var2 = ((var1 instanceof wn)) && (!h.t.az);
    if ((var2) && (!bA.e))
    {
      zx var3 = ((wn)var1).bZ();
      if ((h.s != null) && (h.s.a == auh.a.b))
      {
        cj var4 = h.s.a();
        afh var5 = h.f.p(var4).c();
        if (h.c.l() == adp.a.e)
        {
          boolean hasTileEntity;
          boolean hasTileEntity;
          if (Reflector.ForgeBlock_hasTileEntity.exists())
          {
            alz bs = h.f.p(var4);
            hasTileEntity = Reflector.callBoolean(var5, Reflector.ForgeBlock_hasTileEntity, new Object[] { bs });
          }
          else
          {
            hasTileEntity = var5.z();
          }
          var2 = (hasTileEntity) && ((h.f.s(var4) instanceof og));
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
    if ((h.t.aB) && (!h.t.az) && (!h.h.cq()) && (!h.t.w))
    {
      pk var2 = h.ac();
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
    if (h.ac() == null) {
      h.a(h.h);
    }
    a(partialTicks);
    if (Config.isShaders()) {
      Shaders.beginRender(h, partialTicks, finishTimeNano);
    }
    bfl.j();
    bfl.d();
    
    bfl.a(516, 0.1F);
    h.A.a("center");
    if (h.t.e)
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
    h.A.b();
  }
  
  private void a(int pass, float partialTicks, long finishTimeNano)
  {
    boolean isShaders = Config.isShaders();
    if (isShaders) {
      Shaders.beginRenderPass(pass, partialTicks, finishTimeNano);
    }
    bfr var5 = h.g;
    bec var6 = h.j;
    boolean var7 = n();
    bfl.o();
    h.A.c("clear");
    if (isShaders) {
      Shaders.setViewport(0, 0, h.d, h.e);
    } else {
      bfl.b(0, 0, h.d, h.e);
    }
    i(partialTicks);
    bfl.m(16640);
    if (isShaders) {
      Shaders.clearRenderBuffer();
    }
    h.A.c("camera");
    a(partialTicks, pass);
    if (isShaders) {
      Shaders.setCamera(partialTicks);
    }
    auz.a(h.h, h.t.aA == 2);
    h.A.c("frustum");
    bib.a();
    h.A.c("culling");
    bic var8 = new bic();
    pk var9 = h.ac();
    double var10 = P + (s - P) * partialTicks;
    double var12 = Q + (t - Q) * partialTicks;
    double var14 = R + (u - R) * partialTicks;
    if (isShaders) {
      ShadersRender.setFrustrumPosition(var8, var10, var12, var14);
    } else {
      var8.a(var10, var12, var14);
    }
    if (((Config.isSkyEnabled()) || (Config.isSunMoonEnabled()) || (Config.isStarsEnabled())) && (!Shaders.isShadowPass))
    {
      a(-1, partialTicks);
      h.A.c("sky");
      bfl.n(5889);
      bfl.D();
      
      Project.gluPerspective(a(partialTicks, true), h.d / h.e, 0.05F, clipDistance);
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
      
      Project.gluPerspective(a(partialTicks, true), h.d / h.e, 0.05F, clipDistance);
      bfl.n(5888);
    }
    else
    {
      bfl.k();
    }
    a(0, partialTicks);
    bfl.j(7425);
    if (t + var9.aS() < 128.0D + h.t.ofCloudsHeight * 128.0F) {
      a(var5, partialTicks, pass);
    }
    h.A.c("prepareterrain");
    a(0, partialTicks);
    h.P().a(bmh.g);
    avc.a();
    h.A.c("terrain_setup");
    if (isShaders) {
      ShadersRender.setupTerrain(var5, var9, partialTicks, var8, ae++, h.h.v());
    } else {
      var5.a(var9, partialTicks, var8, ae++, h.h.v());
    }
    if ((pass == 0) || (pass == 2))
    {
      h.A.c("updatechunks");
      
      Lagometer.timerChunkUpload.start();
      if (isShaders) {
        ShadersRender.updateChunks(var5, finishTimeNano);
      } else {
        h.g.a(finishTimeNano);
      }
      Lagometer.timerChunkUpload.end();
    }
    h.A.c("terrain");
    
    Lagometer.timerTerrain.start();
    if ((h.t.ofSmoothFps) && (pass > 0))
    {
      h.A.c("finish");
      GL11.glFinish();
      h.A.c("terrain");
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
    h.P().b(bmh.g).b(false, false);
    if (isShaders) {
      ShadersRender.beginTerrainCutout();
    }
    var5.a(adf.c, partialTicks, pass, var9);
    h.P().b(bmh.g).a();
    if (isShaders) {
      ShadersRender.endTerrain();
    }
    Lagometer.timerTerrain.end();
    bfl.j(7424);
    bfl.a(516, 0.1F);
    if (!W)
    {
      bfl.n(5888);
      bfl.F();
      bfl.E();
      avc.b();
      h.A.c("entities");
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
      if ((h.s != null) && (var9.a(arm.h)) && (var7))
      {
        wn var16 = (wn)var9;
        bfl.c();
        h.A.c("outline");
        
        boolean hasForgeMethod = Reflector.ForgeHooksClient_onDrawBlockHighlight.exists();
        if (hasForgeMethod)
        {
          if (Reflector.callBoolean(Reflector.ForgeHooksClient_onDrawBlockHighlight, new Object[] { var5, var16, h.s, Integer.valueOf(0), var16.bA(), Float.valueOf(partialTicks) })) {}
        }
        else if (!h.t.az) {
          var5.a(var16, h.s, 0, partialTicks);
        }
        bfl.d();
      }
    }
    bfl.n(5888);
    bfl.F();
    if ((var7) && (h.s != null) && (!var9.a(arm.h)))
    {
      wn var16 = (wn)var9;
      bfl.c();
      h.A.c("outline");
      
      boolean hasForgeMethod = Reflector.ForgeHooksClient_onDrawBlockHighlight.exists();
      if (hasForgeMethod)
      {
        if (Reflector.callBoolean(Reflector.ForgeHooksClient_onDrawBlockHighlight, new Object[] { var5, var16, h.s, Integer.valueOf(0), var16.bA(), Float.valueOf(partialTicks) })) {}
      }
      else if (!h.t.az) {
        var5.a(var16, h.s, 0, partialTicks);
      }
      bfl.d();
    }
    if (!x.isEmpty())
    {
      h.A.c("destroyProgress");
      bfl.l();
      bfl.a(770, 1, 1, 0);
      h.P().b(bmh.g).b(false, false);
      var5.a(bfx.a(), bfx.a().c(), var9, partialTicks);
      h.P().b(bmh.g).a();
    }
    bfl.k();
    if (!W)
    {
      i();
      h.A.c("litParticles");
      if (isShaders) {
        Shaders.beginLitParticles();
      }
      var6.b(var9, partialTicks);
      avc.a();
      a(0, partialTicks);
      h.A.c("particles");
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
    h.A.c("weather");
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
    h.P().a(bmh.g);
    bfl.j(7425);
    h.A.c("translucent");
    if (isShaders) {
      Shaders.beginWater();
    }
    var5.a(adf.d, partialTicks, pass, var9);
    if (isShaders) {
      Shaders.endWater();
    }
    if ((Reflector.ForgeHooksClient_setRenderPass.exists()) && (!W))
    {
      avc.b();
      h.A.c("entities");
      Reflector.callVoid(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(1) });
      h.g.a(var9, var8, partialTicks);
      Reflector.callVoid(Reflector.ForgeHooksClient_setRenderPass, new Object[] { Integer.valueOf(-1) });
      avc.a();
    }
    bfl.j(7424);
    bfl.a(true);
    bfl.o();
    bfl.k();
    bfl.n();
    if (t + var9.aS() >= 128.0D + h.t.ofCloudsHeight * 128.0F)
    {
      h.A.c("aboveClouds");
      a(var5, partialTicks, pass);
    }
    if (Reflector.ForgeHooksClient_dispatchRenderLast.exists())
    {
      h.A.c("forge_render_last");
      Reflector.callVoid(Reflector.ForgeHooksClient_dispatchRenderLast, new Object[] { var5, Float.valueOf(partialTicks) });
    }
    h.A.c("hand");
    
    boolean handRendered = Reflector.callBoolean(Reflector.ForgeHooksClient_renderFirstPersonHand, new Object[] { h.g, Float.valueOf(partialTicks), Integer.valueOf(pass) });
    if ((!handRendered) && (C) && (!Shaders.isShadowPass))
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
    if ((h.t.c >= 4) && (!Config.isCloudsOff()) && (Shaders.shouldRenderClouds(h.t)))
    {
      h.A.c("clouds");
      bfl.n(5889);
      bfl.D();
      
      Project.gluPerspective(a(partialTicks, true), h.d / h.e, 0.05F, clipDistance * 4.0F);
      bfl.n(5888);
      bfl.E();
      a(0, partialTicks);
      p_180437_1_.b(partialTicks, pass);
      bfl.n();
      bfl.F();
      bfl.n(5889);
      bfl.D();
      
      Project.gluPerspective(a(partialTicks, true), h.d / h.e, 0.05F, clipDistance);
      bfl.n(5888);
    }
  }
  
  private void o()
  {
    float var1 = h.f.j(1.0F);
    if (!Config.isRainFancy()) {
      var1 /= 2.0F;
    }
    if ((var1 != 0.0F) && (Config.isRainSplash()))
    {
      j.setSeed(m * 312987231L);
      pk var2 = h.ac();
      bdb var3 = h.f;
      cj var4 = new cj(var2);
      byte var5 = 10;
      double var6 = 0.0D;
      double var8 = 0.0D;
      double var10 = 0.0D;
      int var12 = 0;
      int var13 = (int)(100.0F * var1 * var1);
      if (h.t.aL == 1) {
        var13 >>= 1;
      } else if (h.t.aL == 2) {
        var13 = 0;
      }
      for (int var14 = 0; var14 < var13; var14++)
      {
        cj var15 = var3.q(var4.a(j.nextInt(var5) - j.nextInt(var5), 0, j.nextInt(var5) - j.nextInt(var5)));
        ady var16 = var3.b(var15);
        cj var17 = var15.b();
        afh var18 = var3.p(var17).c();
        if ((var15.o() <= var4.o() + var5) && (var15.o() >= var4.o() - var5) && (var16.e()) && (var16.a(var15) >= 0.15F))
        {
          double var19 = j.nextDouble();
          double var21 = j.nextDouble();
          if (var18.t() == arm.i)
          {
            h.f.a(cy.l, var15.n() + var19, var15.o() + 0.1F - var18.D(), var15.p() + var21, 0.0D, 0.0D, 0.0D, new int[0]);
          }
          else if (var18.t() != arm.a)
          {
            var18.a(var3, var17);
            var12++;
            if (j.nextInt(var12) == 0)
            {
              var6 = var17.n() + var19;
              var8 = var17.o() + 0.1F + var18.E() - 1.0D;
              var10 = var17.p() + var21;
            }
            h.f.a(cy.N, var17.n() + var19, var17.o() + 0.1F + var18.E(), var17.p() + var21, 0.0D, 0.0D, 0.0D, new int[0]);
          }
        }
      }
      if ((var12 > 0) && (j.nextInt(3) < M++))
      {
        M = 0;
        if ((var8 > var4.o() + 1) && (var3.q(var4).o() > ns.d(var4.o()))) {
          h.f.a(var6, var8, var10, "ambient.weather.rain", 0.1F, 0.5F, false);
        } else {
          h.f.a(var6, var8, var10, "ambient.weather.rain", 0.2F, 1.0F, false);
        }
      }
    }
  }
  
  protected void c(float partialTicks)
  {
    if (Reflector.ForgeWorldProvider_getWeatherRenderer.exists())
    {
      anm worldProvider = h.f.t;
      Object weatherRenderer = Reflector.call(worldProvider, Reflector.ForgeWorldProvider_getWeatherRenderer, new Object[0]);
      if (weatherRenderer != null)
      {
        Reflector.callVoid(weatherRenderer, Reflector.IRenderHandler_render, new Object[] { Float.valueOf(partialTicks), h.f, h });
        return;
      }
    }
    float var2 = h.f.j(partialTicks);
    if (var2 > 0.0F)
    {
      if (Config.isRainOff()) {
        return;
      }
      i();
      pk var3 = h.ac();
      bdb var4 = h.f;
      int var5 = ns.c(s);
      int var6 = ns.c(t);
      int var7 = ns.c(u);
      bfx var8 = bfx.a();
      bfd var9 = var8.c();
      bfl.p();
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.a(516, 0.1F);
      double var10 = P + (s - P) * partialTicks;
      double var12 = Q + (t - Q) * partialTicks;
      double var14 = R + (u - R) * partialTicks;
      int var16 = ns.c(var12);
      byte var17 = 5;
      if (Config.isRainFancy()) {
        var17 = 10;
      }
      byte var18 = -1;
      float var19 = m + partialTicks;
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
          double var24 = N[var23] * 0.5D;
          double var26 = O[var23] * 0.5D;
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
              j.setSeed(var22 * var22 * 3121 + var22 * 45238971 ^ var21 * var21 * 418711 + var21 * 13761);
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
                  h.P().a(f);
                  var9.a(7, bms.d);
                }
                double var34 = ((m + var22 * var22 * 3121 + var22 * 45238971 + var21 * var21 * 418711 + var21 * 13761 & 0x1F) + partialTicks) / 32.0D * (3.0D + j.nextDouble());
                double var36 = var22 + 0.5F - s;
                double var38 = var21 + 0.5F - u;
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
                  h.P().a(g);
                  var9.a(7, bms.d);
                }
                double var34 = ((m & 0x1FF) + partialTicks) / 512.0F;
                double var36 = j.nextDouble() + var19 * 0.01D * (float)j.nextGaussian();
                double var38 = j.nextDouble() + var19 * (float)j.nextGaussian() * 0.001D;
                double var49 = var22 + 0.5F - s;
                double var50 = var21 + 0.5F - u;
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
    avr var1 = new avr(h);
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
    bdb var2 = h.f;
    pk var3 = h.ac();
    float var4 = 0.25F + 0.75F * h.t.c / 32.0F;
    var4 = 1.0F - (float)Math.pow(var4, 0.25D);
    aui var5 = var2.a(h.ac(), partialTicks);
    
    var5 = CustomColorizer.getWorldSkyColor(var5, var2, h.ac(), partialTicks);
    
    float var6 = (float)a;
    float var7 = (float)b;
    float var8 = (float)c;
    aui var9 = var2.f(partialTicks);
    
    var9 = CustomColorizer.getWorldFogColor(var9, var2, h.ac(), partialTicks);
    
    Q = ((float)a);
    R = ((float)b);
    S = ((float)c);
    if (h.t.c >= 4)
    {
      double var10 = -1.0D;
      aui var12 = ns.a(var2.d(partialTicks)) > 0.0F ? new aui(var10, 0.0D, 0.0D) : new aui(1.0D, 0.0D, 0.0D);
      float var13 = (float)var3.d(partialTicks).b(var12);
      if (var13 < 0.0F) {
        var13 = 0.0F;
      }
      if (var13 > 0.0F)
      {
        float[] var14 = t.a(var2.c(partialTicks), partialTicks);
        if (var14 != null)
        {
          var13 *= var14[3];
          Q = (Q * (1.0F - var13) + var14[0] * var13);
          R = (R * (1.0F - var13) + var14[1] * var13);
          S = (S * (1.0F - var13) + var14[2] * var13);
        }
      }
    }
    Q += (var6 - Q) * var4;
    R += (var7 - R) * var4;
    S += (var8 - S) * var4;
    float var19 = var2.j(partialTicks);
    if (var19 > 0.0F)
    {
      float var11 = 1.0F - var19 * 0.5F;
      float var20 = 1.0F - var19 * 0.4F;
      Q *= var11;
      R *= var11;
      S *= var20;
    }
    float var11 = var2.h(partialTicks);
    if (var11 > 0.0F)
    {
      float var20 = 1.0F - var11 * 0.5F;
      Q *= var20;
      R *= var20;
      S *= var20;
    }
    afh var21 = auz.a(h.f, var3, partialTicks);
    if (B)
    {
      aui var22 = var2.e(partialTicks);
      Q = ((float)a);
      R = ((float)b);
      S = ((float)c);
    }
    else if (var21.t() == arm.h)
    {
      float var13 = ack.a(var3) * 0.2F;
      if (((var3 instanceof pr)) && (((pr)var3).a(pe.o))) {
        var13 = var13 * 0.3F + 0.6F;
      }
      Q = (0.02F + var13);
      R = (0.02F + var13);
      S = (0.2F + var13);
      
      aui colUnderwater = CustomColorizer.getUnderwaterColor(h.f, h.ac().s, h.ac().t + 1.0D, h.ac().u);
      if (colUnderwater != null)
      {
        Q = ((float)a);
        R = ((float)b);
        S = ((float)c);
      }
    }
    else if (var21.t() == arm.i)
    {
      Q = 0.6F;
      R = 0.1F;
      S = 0.0F;
    }
    float var13 = T + (U - T) * partialTicks;
    Q *= var13;
    R *= var13;
    S *= var13;
    
    double fogYFactor = t.j();
    
    double var23 = (Q + (t - Q) * partialTicks) * fogYFactor;
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
      Q = ((float)(Q * var23));
      R = ((float)(R * var23));
      S = ((float)(S * var23));
    }
    if (z > 0.0F)
    {
      float var24 = A + (z - A) * partialTicks;
      Q = (Q * (1.0F - var24) + Q * 0.7F * var24);
      R = (R * (1.0F - var24) + R * 0.6F * var24);
      S = (S * (1.0F - var24) + S * 0.6F * var24);
    }
    if (((var3 instanceof pr)) && (((pr)var3).a(pe.r)))
    {
      float var24 = a((pr)var3, partialTicks);
      float var17 = 1.0F / Q;
      if (var17 > 1.0F / R) {
        var17 = 1.0F / R;
      }
      if (var17 > 1.0F / S) {
        var17 = 1.0F / S;
      }
      Q = (Q * (1.0F - var24) + Q * var17 * var24);
      R = (R * (1.0F - var24) + R * var17 * var24);
      S = (S * (1.0F - var24) + S * var17 * var24);
    }
    if (h.t.e)
    {
      float var24 = (Q * 30.0F + R * 59.0F + S * 11.0F) / 100.0F;
      float var17 = (Q * 30.0F + R * 70.0F) / 100.0F;
      float var18 = (Q * 30.0F + S * 70.0F) / 100.0F;
      Q = var24;
      R = var17;
      S = var18;
    }
    if (Reflector.EntityViewRenderEvent_FogColors_Constructor.exists())
    {
      Object event = Reflector.newInstance(Reflector.EntityViewRenderEvent_FogColors_Constructor, new Object[] { this, var3, var21, Float.valueOf(partialTicks), Float.valueOf(Q), Float.valueOf(R), Float.valueOf(S) });
      Reflector.postForgeBusEvent(event);
      
      Q = Reflector.getFieldValueFloat(event, Reflector.EntityViewRenderEvent_FogColors_red, Q);
      R = Reflector.getFieldValueFloat(event, Reflector.EntityViewRenderEvent_FogColors_green, R);
      S = Reflector.getFieldValueFloat(event, Reflector.EntityViewRenderEvent_FogColors_blue, S);
    }
    Shaders.setClearColor(Q, R, S, 0.0F);
  }
  
  private void a(int p_78468_1_, float partialTicks)
  {
    pk var3 = h.ac();
    boolean var4 = false;
    
    fogStandard = false;
    if ((var3 instanceof wn)) {
      var4 = bA.d;
    }
    GL11.glFog(2918, a(Q, R, S, 1.0F));
    GL11.glNormal3f(0.0F, -1.0F, 0.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    afh var5 = auz.a(h.f, var3, partialTicks);
    
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
        var6 = 5.0F + (k - 5.0F) * (1.0F - var7 / 20.0F);
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
      if (getCapabilitiesGL_NV_fog_distance) {
        if (Config.isFogFancy()) {
          GL11.glFogi(34138, 34139);
        }
      }
    }
    else if (B)
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
      float var6 = k;
      
      fogStandard = true;
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
      if (getCapabilitiesGL_NV_fog_distance)
      {
        if (Config.isFogFancy()) {
          GL11.glFogi(34138, 34139);
        }
        if (Config.isFogFast()) {
          GL11.glFogi(34138, 34140);
        }
      }
      if (h.f.t.b((int)s, (int)u))
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
    P.clear();
    P.put(p_78469_1_).put(p_78469_2_).put(p_78469_3_).put(p_78469_4_);
    P.flip();
    return P;
  }
  
  public avq k()
  {
    return l;
  }
  
  private void waitForServerThread()
  {
    serverWaitTimeCurrent = 0;
    if ((!Config.isSmoothWorld()) || (!Config.isSingleProcessor()))
    {
      lastServerTime = 0L;
      lastServerTicks = 0;
      return;
    }
    if (!h.E()) {
      return;
    }
    bpo srv = h.G();
    if (srv == null) {
      return;
    }
    boolean paused = h.V();
    if ((paused) || ((h.m instanceof axs)))
    {
      if ((h.m instanceof axs)) {
        Config.sleep(20L);
      }
      lastServerTime = 0L;
      lastServerTicks = 0;
      return;
    }
    if (serverWaitTime > 0)
    {
      Lagometer.timerServer.start();
      
      Config.sleep(serverWaitTime);
      
      Lagometer.timerServer.end();
      
      serverWaitTimeCurrent = serverWaitTime;
    }
    long timeNow = System.nanoTime() / 1000000L;
    if ((lastServerTime == 0L) || (lastServerTicks == 0))
    {
      lastServerTime = timeNow;
      lastServerTicks = srv.at();
      avgServerTickDiff = 1.0F;
      avgServerTimeDiff = 50.0F;
      return;
    }
    long timeDiff = timeNow - lastServerTime;
    if (timeDiff < 0L)
    {
      lastServerTime = timeNow;
      timeDiff = 0L;
    }
    if (timeDiff < 50L) {
      return;
    }
    lastServerTime = timeNow;
    
    int ticks = srv.at();
    
    int tickDiff = ticks - lastServerTicks;
    if (tickDiff < 0)
    {
      lastServerTicks = ticks;
      tickDiff = 0;
    }
    if (tickDiff < 1) {
      if (serverWaitTime < 100) {
        serverWaitTime += 2;
      }
    }
    if (tickDiff > 1) {
      if (serverWaitTime > 0) {
        serverWaitTime -= 1;
      }
    }
    lastServerTicks = ticks;
  }
  
  private void frameInit()
  {
    if (!initialized)
    {
      TextureUtils.registerResourceListener();
      if ((Config.getBitsOs() == 64) && (Config.getBitsJre() == 32)) {
        Config.setNotify64BitJava(true);
      }
      initialized = true;
    }
    Config.isActing();
    
    Config.checkDisplayMode();
    
    adm world = h.f;
    if (world != null)
    {
      if (Config.getNewRelease() != null)
      {
        String userEdition = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
        String fullNewVer = userEdition + " " + Config.getNewRelease();
        fa msg = new fa("A new §eOptiFine§f version is available: §e" + fullNewVer + "§f");
        h.q.d().a(msg);
        Config.setNewRelease(null);
      }
      if (Config.isNotify64BitJava())
      {
        Config.setNotify64BitJava(false);
        fa msg = new fa("You can install §e64-bit Java§f to increase performance");
        h.q.d().a(msg);
      }
    }
    if ((h.m instanceof aya)) {
      updateMainMenu((aya)h.m);
    }
    if (updatedWorld != world)
    {
      RandomMobs.worldChanged(updatedWorld, world);
      
      Config.updateThreadPriorities();
      
      lastServerTime = 0L;
      lastServerTicks = 0;
      
      updatedWorld = world;
    }
    if (!setFxaaShader(Shaders.configAntialiasingLevel)) {
      Shaders.configAntialiasingLevel = 0;
    }
  }
  
  private void frameFinish()
  {
    if (h.f != null)
    {
      long now = System.currentTimeMillis();
      if (now > lastErrorCheckTimeMs + 10000L)
      {
        lastErrorCheckTimeMs = now;
        
        int err = GL11.glGetError();
        if (err != 0)
        {
          String text = GLU.gluErrorString(err);
          fa msg = new fa("§eOpenGL Error§f: " + err + " (" + text + ")");
          h.q.d().a(msg);
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
    if ((aa != null) && (aa != fxaaShaders[2]) && (aa != fxaaShaders[4])) {
      return true;
    }
    if ((fxaaLevel == 2) || (fxaaLevel == 4))
    {
      if ((aa != null) && (aa == fxaaShaders[fxaaLevel])) {
        return true;
      }
      if (h.f == null) {
        return true;
      }
      a(new jy("shaders/post/fxaa_of_" + fxaaLevel + "x.json"));
      
      fxaaShaders[fxaaLevel] = aa;
      
      return ad;
    }
    if (aa == null) {
      return true;
    }
    aa.a();
    aa = null;
    
    return true;
  }
}
