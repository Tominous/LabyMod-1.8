import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;
import shadersmod.client.Shaders;
import shadersmod.client.ShadersRender;

public class bfr
  implements ado, bnj
{
  private static final Logger b = ;
  private static final jy c = new jy("textures/environment/moon_phases.png");
  private static final jy d = new jy("textures/environment/sun.png");
  private static final jy e = new jy("textures/environment/clouds.png");
  private static final jy f = new jy("textures/environment/end_sky.png");
  private static final jy g = new jy("textures/misc/forcefield.png");
  public final ave h;
  private final bmj i;
  private final biu j;
  private bdb k;
  private Set l = Sets.newLinkedHashSet();
  private List m = Lists.newArrayListWithCapacity(69696);
  private final Set n = Sets.newHashSet();
  private bga o;
  private int p = -1;
  private int q = -1;
  private int r = -1;
  private bmu s;
  private bmt t;
  private bmt u;
  private bmt v;
  private int w;
  public final Map x = Maps.newHashMap();
  private final Map y = Maps.newHashMap();
  private final bmi[] z = new bmi[10];
  private bfw A;
  private blr B;
  private double C = Double.MIN_VALUE;
  private double D = Double.MIN_VALUE;
  private double E = Double.MIN_VALUE;
  private int F = Integer.MIN_VALUE;
  private int G = Integer.MIN_VALUE;
  private int H = Integer.MIN_VALUE;
  private double I = Double.MIN_VALUE;
  private double J = Double.MIN_VALUE;
  private double K = Double.MIN_VALUE;
  private double L = Double.MIN_VALUE;
  private double M = Double.MIN_VALUE;
  private final bho N = new bho();
  private bfh O;
  private int P = -1;
  private int Q = 2;
  private int R;
  private int S;
  private int T;
  private boolean U = false;
  private bid V;
  private final Vector4f[] W = new Vector4f[8];
  private final bqr X = new bqr();
  private boolean Y = false;
  bhu a;
  private double Z;
  private double aa;
  private double ab;
  public boolean ac = true;
  private static final String __OBFID = "CL_00000954";
  private CloudRenderer cloudRenderer;
  public pk renderedEntity;
  public Set chunksToResortTransparency = new LinkedHashSet();
  public Set chunksToUpdateForced = new LinkedHashSet();
  private Deque visibilityDeque = new ArrayDeque();
  private List renderInfosEntities = new ArrayList(1024);
  private List renderInfosTileEntities = new ArrayList(1024);
  private List renderInfosNormal = new ArrayList(1024);
  private List renderInfosEntitiesNormal = new ArrayList(1024);
  private List renderInfosTileEntitiesNormal = new ArrayList(1024);
  private List renderInfosShadow = new ArrayList(1024);
  private List renderInfosEntitiesShadow = new ArrayList(1024);
  private List renderInfosTileEntitiesShadow = new ArrayList(1024);
  private int renderDistance = 0;
  private int renderDistanceSq = 0;
  private static final Set SET_ALL_FACINGS = Collections.unmodifiableSet(new HashSet(Arrays.asList(cq.n)));
  private int countTileEntitiesRendered;
  
  public bfr(ave mcIn)
  {
    cloudRenderer = new CloudRenderer(mcIn);
    
    h = mcIn;
    j = mcIn.af();
    i = mcIn.P();
    i.a(g);
    GL11.glTexParameteri(3553, 10242, 10497);
    GL11.glTexParameteri(3553, 10243, 10497);
    bfl.i(0);
    n();
    Y = bqs.f();
    if (Y)
    {
      O = new bfy();
      a = new bhv();
    }
    else
    {
      O = new bft();
      a = new bhr();
    }
    s = new bmu();
    s.a(new bmv(0, bmv.a.a, bmv.b.a, 3));
    q();
    p();
    o();
  }
  
  public void a(bni resourceManager)
  {
    n();
  }
  
  private void n()
  {
    bmh var1 = h.T();
    for (int var2 = 0; var2 < z.length; var2++) {
      z[var2] = var1.a("minecraft:blocks/destroy_stage_" + var2);
    }
  }
  
  public void b()
  {
    if (bqs.O)
    {
      if (blu.b() == null) {
        blu.a();
      }
      jy var1 = new jy("shaders/post/entity_outline.json");
      try
      {
        B = new blr(h.P(), h.Q(), h.b(), var1);
        B.a(h.d, h.e);
        A = B.a("final");
      }
      catch (IOException var3)
      {
        b.warn("Failed to load shader: " + var1, var3);
        B = null;
        A = null;
      }
      catch (JsonSyntaxException var4)
      {
        b.warn("Failed to load shader: " + var1, var4);
        B = null;
        A = null;
      }
    }
    else
    {
      B = null;
      A = null;
    }
  }
  
  public void c()
  {
    if (d())
    {
      bfl.l();
      bfl.a(770, 771, 0, 1);
      A.a(h.d, h.e, false);
      bfl.k();
    }
  }
  
  protected boolean d()
  {
    return (A != null) && (B != null) && (h.h != null) && (h.h.v()) && (h.t.aq.d());
  }
  
  private void o()
  {
    bfx var1 = bfx.a();
    bfd var2 = var1.c();
    if (v != null) {
      v.c();
    }
    if (r >= 0)
    {
      avd.b(r);
      r = -1;
    }
    if (Y)
    {
      v = new bmt(s);
      a(var2, -16.0F, true);
      var2.e();
      var2.b();
      v.a(var2.f());
    }
    else
    {
      r = avd.a(1);
      GL11.glNewList(r, 4864);
      a(var2, -16.0F, true);
      var1.b();
      GL11.glEndList();
    }
  }
  
  private void p()
  {
    bfx var1 = bfx.a();
    bfd var2 = var1.c();
    if (u != null) {
      u.c();
    }
    if (q >= 0)
    {
      avd.b(q);
      q = -1;
    }
    if (Y)
    {
      u = new bmt(s);
      a(var2, 16.0F, false);
      var2.e();
      var2.b();
      u.a(var2.f());
    }
    else
    {
      q = avd.a(1);
      GL11.glNewList(q, 4864);
      a(var2, 16.0F, false);
      var1.b();
      GL11.glEndList();
    }
  }
  
  private void a(bfd worldRendererIn, float p_174968_2_, boolean p_174968_3_)
  {
    boolean var4 = true;
    boolean var5 = true;
    worldRendererIn.a(7, bms.e);
    for (int var6 = 65152; var6 <= 384; var6 += 64) {
      for (int var7 = 65152; var7 <= 384; var7 += 64)
      {
        float var8 = var6;
        float var9 = var6 + 64;
        if (p_174968_3_)
        {
          var9 = var6;
          var8 = var6 + 64;
        }
        worldRendererIn.b(var8, p_174968_2_, var7).d();
        worldRendererIn.b(var9, p_174968_2_, var7).d();
        worldRendererIn.b(var9, p_174968_2_, var7 + 64).d();
        worldRendererIn.b(var8, p_174968_2_, var7 + 64).d();
      }
    }
  }
  
  private void q()
  {
    bfx var1 = bfx.a();
    bfd var2 = var1.c();
    if (t != null) {
      t.c();
    }
    if (p >= 0)
    {
      avd.b(p);
      p = -1;
    }
    if (Y)
    {
      t = new bmt(s);
      a(var2);
      var2.e();
      var2.b();
      t.a(var2.f());
    }
    else
    {
      p = avd.a(1);
      bfl.E();
      GL11.glNewList(p, 4864);
      a(var2);
      var1.b();
      GL11.glEndList();
      bfl.F();
    }
  }
  
  private void a(bfd worldRendererIn)
  {
    Random var2 = new Random(10842L);
    worldRendererIn.a(7, bms.e);
    for (int var3 = 0; var3 < 1500; var3++)
    {
      double var4 = var2.nextFloat() * 2.0F - 1.0F;
      double var6 = var2.nextFloat() * 2.0F - 1.0F;
      double var8 = var2.nextFloat() * 2.0F - 1.0F;
      double var10 = 0.15F + var2.nextFloat() * 0.1F;
      double var12 = var4 * var4 + var6 * var6 + var8 * var8;
      if ((var12 < 1.0D) && (var12 > 0.01D))
      {
        var12 = 1.0D / Math.sqrt(var12);
        var4 *= var12;
        var6 *= var12;
        var8 *= var12;
        double var14 = var4 * 100.0D;
        double var16 = var6 * 100.0D;
        double var18 = var8 * 100.0D;
        double var20 = Math.atan2(var4, var8);
        double var22 = Math.sin(var20);
        double var24 = Math.cos(var20);
        double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
        double var28 = Math.sin(var26);
        double var30 = Math.cos(var26);
        double var32 = var2.nextDouble() * 3.141592653589793D * 2.0D;
        double var34 = Math.sin(var32);
        double var36 = Math.cos(var32);
        for (int var38 = 0; var38 < 4; var38++)
        {
          double var39 = 0.0D;
          double var41 = ((var38 & 0x2) - 1) * var10;
          double var43 = ((var38 + 1 & 0x2) - 1) * var10;
          double var45 = 0.0D;
          double var47 = var41 * var36 - var43 * var34;
          double var49 = var43 * var36 + var41 * var34;
          double var53 = var47 * var28 + 0.0D * var30;
          double var55 = 0.0D * var28 - var47 * var30;
          double var57 = var55 * var22 - var49 * var24;
          double var61 = var49 * var22 + var55 * var24;
          worldRendererIn.b(var14 + var57, var16 + var53, var18 + var61).d();
        }
      }
    }
  }
  
  public void a(bdb worldClientIn)
  {
    if (k != null) {
      k.b(this);
    }
    C = Double.MIN_VALUE;
    D = Double.MIN_VALUE;
    E = Double.MIN_VALUE;
    F = Integer.MIN_VALUE;
    G = Integer.MIN_VALUE;
    H = Integer.MIN_VALUE;
    j.a(worldClientIn);
    k = worldClientIn;
    if (worldClientIn != null)
    {
      worldClientIn.a(this);
      a();
    }
  }
  
  public void a()
  {
    if (k != null)
    {
      ac = true;
      
      afi.t.b(Config.isTreesFancy());
      afi.u.b(Config.isTreesFancy());
      
      bgf.updateAoLightValue();
      
      P = h.t.c;
      
      renderDistance = (P * 16);
      renderDistanceSq = (renderDistance * renderDistance);
      
      boolean var1 = Y;
      Y = bqs.f();
      if ((var1) && (!Y))
      {
        O = new bft();
        a = new bhr();
      }
      else if ((!var1) && (Y))
      {
        O = new bfy();
        a = new bhv();
      }
      if (var1 != Y)
      {
        q();
        p();
        o();
      }
      if (o != null) {
        o.a();
      }
      e();
      Set var2 = n;
      synchronized (n)
      {
        n.clear();
      }
      o = new bga(k, h.t.c, this, a);
      if (k != null)
      {
        pk var5 = h.ac();
        if (var5 != null) {
          o.a(s, u);
        }
      }
      Q = 2;
    }
  }
  
  protected void e()
  {
    l.clear();
    N.b();
  }
  
  public void a(int p_72720_1_, int p_72720_2_)
  {
    if (bqs.O) {
      if (B != null) {
        B.a(p_72720_1_, p_72720_2_);
      }
    }
  }
  
  public void a(pk p_180446_1_, bia p_180446_2_, float partialTicks)
  {
    int pass = 0;
    if (Reflector.MinecraftForgeClient_getRenderPass.exists()) {
      pass = Reflector.callInt(Reflector.MinecraftForgeClient_getRenderPass, new Object[0]);
    }
    if (Q > 0)
    {
      if (pass > 0) {
        return;
      }
      Q -= 1;
    }
    else
    {
      double var4 = p + (s - p) * partialTicks;
      double var6 = q + (t - q) * partialTicks;
      double var8 = r + (u - r) * partialTicks;
      k.B.a("prepare");
      bhc.a.a(k, h.P(), h.k, h.ac(), partialTicks);
      j.a(k, h.k, h.ac(), h.i, h.t, partialTicks);
      if (pass == 0)
      {
        R = 0;
        S = 0;
        T = 0;
        
        countTileEntitiesRendered = 0;
      }
      pk var10 = h.ac();
      double var11 = P + (s - P) * partialTicks;
      double var13 = Q + (t - Q) * partialTicks;
      double var15 = R + (u - R) * partialTicks;
      bhc.b = var11;
      bhc.c = var13;
      bhc.d = var15;
      j.a(var11, var13, var15);
      h.o.i();
      k.B.c("global");
      List var17 = k.E();
      if (pass == 0) {
        R = var17.size();
      }
      if ((Config.isFogOff()) && (h.o.fogStandard)) {
        bfl.n();
      }
      boolean forgeEntityPass = Reflector.ForgeEntity_shouldRenderInPass.exists();
      boolean forgeTileEntityPass = Reflector.ForgeTileEntity_shouldRenderInPass.exists();
      for (int var18 = 0; var18 < k.k.size(); var18++)
      {
        pk var19 = (pk)k.k.get(var18);
        if (forgeEntityPass)
        {
          if (!Reflector.callBoolean(var19, Reflector.ForgeEntity_shouldRenderInPass, new Object[] { Integer.valueOf(pass) })) {}
        }
        else
        {
          S += 1;
          if (var19.h(var4, var6, var8)) {
            j.a(var19, partialTicks);
          }
        }
      }
      if (d())
      {
        bfl.c(519);
        bfl.n();
        A.f();
        A.a(false);
        k.B.c("entityOutlines");
        avc.a();
        j.c(true);
        for (var18 = 0; var18 < var17.size(); var18++)
        {
          pk var19 = (pk)var17.get(var18);
          if (forgeEntityPass)
          {
            if (!Reflector.callBoolean(var19, Reflector.ForgeEntity_shouldRenderInPass, new Object[] { Integer.valueOf(pass) })) {}
          }
          else
          {
            boolean var20 = ((h.ac() instanceof pr)) && (((pr)h.ac()).bJ());
            boolean var21 = (var19.h(var4, var6, var8)) && ((ah) || (p_180446_2_.a(var19.aR())) || (l == h.h)) && ((var19 instanceof wn));
            if (((var19 != h.ac()) || (h.t.aA != 0) || (var20)) && (var21)) {
              j.a(var19, partialTicks);
            }
          }
        }
        j.c(false);
        avc.b();
        bfl.a(false);
        B.a(partialTicks);
        bfl.e();
        bfl.a(true);
        h.b().a(false);
        bfl.m();
        bfl.l();
        bfl.g();
        bfl.c(515);
        bfl.j();
        bfl.d();
      }
      k.B.c("entities");
      
      boolean isShaders = Config.isShaders();
      if (isShaders) {
        Shaders.beginEntities();
      }
      Iterator var28 = renderInfosEntities.iterator();
      
      boolean oldFancyGraphics = h.t.i;
      h.t.i = Config.isDroppedItemsFancy();
      while (var28.hasNext())
      {
        bfr.a var30 = (bfr.a)var28.next();
        amy var33 = k.f(a.j());
        ne var37 = var33.s()[(a.j().o() / 16)];
        if (!var37.isEmpty())
        {
          Iterator var22 = var37.iterator();
          while (var22.hasNext())
          {
            pk var23 = (pk)var22.next();
            if (forgeEntityPass)
            {
              if (!Reflector.callBoolean(var23, Reflector.ForgeEntity_shouldRenderInPass, new Object[] { Integer.valueOf(pass) })) {}
            }
            else
            {
              boolean var24 = (j.a(var23, p_180446_2_, var4, var6, var8)) || (l == h.h);
              if (var24)
              {
                boolean var25 = (h.ac() instanceof pr) ? ((pr)h.ac()).bJ() : false;
                if (((var23 != h.ac()) || (h.t.aA != 0) || (var25)) && ((t < 0.0D) || (t >= 256.0D) || (k.e(new cj(var23)))))
                {
                  S += 1;
                  if (var23.getClass() == uo.class) {
                    j = 0.06D;
                  }
                  renderedEntity = var23;
                  if (isShaders) {
                    Shaders.nextEntity();
                  }
                  j.a(var23, partialTicks);
                  
                  renderedEntity = null;
                }
              }
              else if ((!var24) && ((var23 instanceof xd)))
              {
                if (isShaders) {
                  Shaders.nextEntity();
                }
                h.af().b(var23, partialTicks);
              }
            }
          }
        }
      }
      h.t.i = oldFancyGraphics;
      
      avn fontRenderer = bhc.a.a();
      if (isShaders)
      {
        Shaders.endEntities();
        Shaders.beginBlockEntities();
      }
      k.B.c("blockentities");
      avc.b();
      
      var28 = renderInfosTileEntities.iterator();
      while (var28.hasNext())
      {
        bfr.a var30 = (bfr.a)var28.next();
        List var34 = a.g().b();
        if (!var34.isEmpty())
        {
          Iterator var38 = var34.iterator();
          while (var38.hasNext())
          {
            akw var40 = (akw)var38.next();
            if (isShaders) {
              Shaders.nextBlockEntity();
            }
            if (forgeTileEntityPass)
            {
              if (Reflector.callBoolean(var40, Reflector.ForgeTileEntity_shouldRenderInPass, new Object[] { Integer.valueOf(pass) }))
              {
                aug aabb = (aug)Reflector.call(var40, Reflector.ForgeTileEntity_getRenderBoundingBox, new Object[0]);
                if ((aabb != null) && (!p_180446_2_.a(aabb))) {}
              }
            }
            else
            {
              akw te = var40;
              Class teClass = te.getClass();
              if (teClass == aln.class) {
                if (!Config.zoomMode)
                {
                  wn pl = h.h;
                  double distSq = te.a(s, t, u);
                  if (distSq > 256.0D) {
                    enabled = false;
                  }
                }
              }
              bhc.a.a(var40, partialTicks, -1);
              
              countTileEntitiesRendered += 1;
              
              enabled = true;
            }
          }
        }
      }
      Set var29 = n;
      synchronized (n)
      {
        Iterator var31 = n.iterator();
        while (var31.hasNext())
        {
          akw var35 = (akw)var31.next();
          if (isShaders) {
            Shaders.nextBlockEntity();
          }
          if (forgeTileEntityPass)
          {
            if (Reflector.callBoolean(var35, Reflector.ForgeTileEntity_shouldRenderInPass, new Object[] { Integer.valueOf(pass) }))
            {
              aug aabb = (aug)Reflector.call(var35, Reflector.ForgeTileEntity_getRenderBoundingBox, new Object[0]);
              if ((aabb != null) && (!p_180446_2_.a(aabb))) {}
            }
          }
          else
          {
            akw te = var35;
            Class teClass = te.getClass();
            if (teClass == aln.class) {
              if (!Config.zoomMode)
              {
                wn pl = h.h;
                double distSq = te.a(s, t, u);
                if (distSq > 256.0D) {
                  enabled = false;
                }
              }
            }
            bhc.a.a(var35, partialTicks, -1);
            
            enabled = true;
          }
        }
      }
      s();
      var28 = x.values().iterator();
      while (var28.hasNext())
      {
        kw var32 = (kw)var28.next();
        cj var36 = var32.b();
        akw var39 = k.s(var36);
        if (isShaders) {
          Shaders.nextBlockEntity();
        }
        if ((var39 instanceof aky))
        {
          aky var41 = (aky)var39;
          if (h != null)
          {
            var36 = var36.a(cq.e);
            var39 = k.s(var36);
          }
          else if (f != null)
          {
            var36 = var36.a(cq.c);
            var39 = k.s(var36);
          }
        }
        afh var42 = k.p(var36).c();
        boolean shouldRender;
        if (forgeTileEntityPass)
        {
          akw tileEntity = var39;
          boolean shouldRender = false;
          if (tileEntity != null) {
            if ((Reflector.callBoolean(tileEntity, Reflector.ForgeTileEntity_shouldRenderInPass, new Object[] { Integer.valueOf(pass) })) && (Reflector.callBoolean(tileEntity, Reflector.ForgeTileEntity_canRenderBreaking, new Object[0])))
            {
              aug aabb = (aug)Reflector.call(tileEntity, Reflector.ForgeTileEntity_getRenderBoundingBox, new Object[0]);
              if (aabb != null) {
                shouldRender = p_180446_2_.a(aabb);
              }
            }
          }
        }
        else
        {
          shouldRender = (var39 != null) && (((var42 instanceof afs)) || ((var42 instanceof agp)) || ((var42 instanceof ajl)) || ((var42 instanceof ajm)));
        }
        if (shouldRender) {
          bhc.a.a(var39, partialTicks, var32.c());
        }
      }
      t();
      h.o.h();
      h.A.b();
    }
  }
  
  public String f()
  {
    int var1 = o.f.length;
    int var2 = 0;
    Iterator var3 = m.iterator();
    while (var3.hasNext())
    {
      bfr.a var4 = (bfr.a)var3.next();
      bhq var5 = a.b;
      if ((var5 != bhq.a) && (!var5.a())) {
        var2++;
      }
    }
    return String.format("C: %d/%d %sD: %d, %s", new Object[] { Integer.valueOf(var2), Integer.valueOf(var1), h.G ? "(s) " : "", Integer.valueOf(P), N.a() });
  }
  
  public String g()
  {
    return "E: " + S + "/" + R + ", B: " + T + ", I: " + (R - T - S) + ", " + Config.getVersionShaders();
  }
  
  public void a(pk viewEntity, double partialTicks, bia camera, int frameCount, boolean playerSpectator)
  {
    if (h.t.c != P) {
      a();
    }
    k.B.a("camera");
    double var7 = s - C;
    double var9 = t - D;
    double var11 = u - E;
    if ((F != ae) || (G != af) || (H != ag) || (var7 * var7 + var9 * var9 + var11 * var11 > 16.0D))
    {
      C = s;
      D = t;
      E = u;
      F = ae;
      G = af;
      H = ag;
      o.a(s, u);
    }
    k.B.c("renderlistcamera");
    double var13 = P + (s - P) * partialTicks;
    double var15 = Q + (t - Q) * partialTicks;
    double var17 = R + (u - R) * partialTicks;
    O.a(var13, var15, var17);
    k.B.c("cull");
    if (V != null)
    {
      bic var19 = new bic(V);
      var19.a(X.a, X.b, X.c);
      camera = var19;
    }
    h.A.c("culling");
    cj var35 = new cj(var13, var15 + viewEntity.aS(), var17);
    bht var20 = o.a(var35);
    cj var21 = new cj(ns.c(var13 / 16.0D) * 16, ns.c(var15 / 16.0D) * 16, ns.c(var17 / 16.0D) * 16);
    ac = ((ac) || (!l.isEmpty()) || (s != I) || (t != J) || (u != K) || (z != L) || (y != M));
    I = s;
    J = t;
    K = u;
    L = z;
    M = y;
    boolean var22 = V != null;
    
    Lagometer.timerVisibility.start();
    if (Shaders.isShadowPass)
    {
      m = renderInfosShadow;
      renderInfosEntities = renderInfosEntitiesShadow;
      renderInfosTileEntities = renderInfosTileEntitiesShadow;
      if ((!var22) && (ac))
      {
        m.clear();
        renderInfosEntities.clear();
        renderInfosTileEntities.clear();
        for (int i = 0; i < o.f.length; i++)
        {
          bht chunk = o.f[i];
          if (camera.a(c))
          {
            bfr.a info = new bfr.a(chunk, null, 0, null);
            cj pos = chunk.j();
            if ((!b.a()) || (chunk.l()))
            {
              if (info == null) {
                info = new bfr.a(chunk, null, 0, null);
              }
              m.add(info);
            }
            if (ChunkUtils.hasEntities(k.f(pos)))
            {
              if (info == null) {
                info = new bfr.a(chunk, null, 0, null);
              }
              renderInfosEntities.add(info);
            }
            if (chunk.g().b().size() > 0)
            {
              if (info == null) {
                info = new bfr.a(chunk, null, 0, null);
              }
              renderInfosTileEntities.add(info);
            }
          }
        }
      }
    }
    else
    {
      m = renderInfosNormal;
      renderInfosEntities = renderInfosEntitiesNormal;
      renderInfosTileEntities = renderInfosTileEntitiesNormal;
    }
    if ((!var22) && (ac) && (!Shaders.isShadowPass))
    {
      ac = false;
      
      m.clear();
      
      renderInfosEntities.clear();
      renderInfosTileEntities.clear();
      
      visibilityDeque.clear();
      Deque var23 = visibilityDeque;
      
      boolean var24 = h.G;
      if (var20 == null)
      {
        int var25 = var35.o() > 0 ? 248 : 8;
        for (int var26 = -P; var26 <= P; var26++) {
          for (int var27 = -P; var27 <= P; var27++)
          {
            bht var28 = o.a(new cj((var26 << 4) + 8, var25, (var27 << 4) + 8));
            if ((var28 != null) && (camera.a(c)))
            {
              var28.a(frameCount);
              var23.add(new bfr.a(var28, (cq)null, 0, null));
            }
          }
        }
      }
      else
      {
        boolean var38 = false;
        bfr.a var40 = new bfr.a(var20, (cq)null, 0, null);
        
        Set var42 = SET_ALL_FACINGS;
        if (var42.size() == 1)
        {
          Vector3f var44 = a(viewEntity, partialTicks);
          cq var29 = cq.a(x, y, z).d();
          var42.remove(var29);
        }
        if (var42.isEmpty()) {
          var38 = true;
        }
        if ((var38) && (!playerSpectator))
        {
          m.add(var40);
        }
        else
        {
          if ((playerSpectator) && (k.p(var35).c().c())) {
            var24 = false;
          }
          var20.a(frameCount);
          var23.add(var40);
        }
      }
      cq[] var46 = cq.n;
      int var30 = var46.length;
      while (!var23.isEmpty())
      {
        bfr.a var39 = (bfr.a)var23.poll();
        bht var41 = a;
        cq var43 = b;
        cj var45 = var41.j();
        if ((!b.a()) || (var41.l())) {
          m.add(var39);
        }
        if (ChunkUtils.hasEntities(k.f(var45))) {
          renderInfosEntities.add(var39);
        }
        if (var41.g().b().size() > 0) {
          renderInfosTileEntities.add(var39);
        }
        for (int var31 = 0; var31 < var30; var31++)
        {
          cq var32 = var46[var31];
          if (((!var24) || (!c.contains(var32.d()))) && ((!var24) || (var43 == null) || (var41.g().a(var43.d(), var32))))
          {
            bht var33 = a(var35, var41, var32);
            if ((var33 != null) && (var33.a(frameCount)) && (camera.a(c)))
            {
              bfr.a var34 = new bfr.a(var33, var32, d + 1, null);
              c.addAll(c);
              c.add(var32);
              var23.add(var34);
            }
          }
        }
      }
    }
    if (U)
    {
      a(var13, var15, var17);
      U = false;
    }
    Lagometer.timerVisibility.end();
    if (Shaders.isShadowPass)
    {
      Shaders.mcProfilerEndSection();
      return;
    }
    N.e();
    Set var36 = l;
    l = Sets.newLinkedHashSet();
    Iterator var37 = m.iterator();
    
    Lagometer.timerChunkUpdate.start();
    while (var37.hasNext())
    {
      bfr.a var39 = (bfr.a)var37.next();
      bht var41 = a;
      if ((var41.l()) || (var36.contains(var41)))
      {
        ac = true;
        if (a(var21, a))
        {
          if (!Config.isActing())
          {
            chunksToUpdateForced.add(var41);
          }
          else
          {
            h.A.a("build near");
            N.b(var41);
            var41.a(false);
            h.A.b();
          }
        }
        else {
          l.add(var41);
        }
      }
    }
    Lagometer.timerChunkUpdate.end();
    
    l.addAll(var36);
    h.A.b();
  }
  
  private boolean a(cj p_174983_1_, bht p_174983_2_)
  {
    cj var3 = p_174983_2_.j();
    return ns.a(p_174983_1_.n() - var3.n()) <= 16;
  }
  
  private Set c(cj p_174978_1_)
  {
    bhw var2 = new bhw();
    cj var3 = new cj(p_174978_1_.n() >> 4 << 4, p_174978_1_.o() >> 4 << 4, p_174978_1_.p() >> 4 << 4);
    amy var4 = k.f(var3);
    Iterator var5 = cj.b(var3, var3.a(15, 15, 15)).iterator();
    while (var5.hasNext())
    {
      cj.a var6 = (cj.a)var5.next();
      if (var4.a(var6).c()) {
        var2.a(var6);
      }
    }
    return var2.b(p_174978_1_);
  }
  
  private bht a(cj p_174973_1_, bht renderChunk, cq p_174973_3_)
  {
    cj var4 = renderChunk.getPositionOffset16(p_174973_3_);
    if ((var4.o() < 0) || (var4.o() >= 256)) {
      return null;
    }
    int dx = ns.a(p_174973_1_.n() - var4.n());
    int dz = ns.a(p_174973_1_.p() - var4.p());
    if (Config.isFogOff())
    {
      if ((dx > renderDistance) || (dz > renderDistance)) {
        return null;
      }
    }
    else
    {
      int distSq = dx * dx + dz * dz;
      if (distSq > renderDistanceSq) {
        return null;
      }
    }
    return o.a(var4);
  }
  
  private void a(double p_174984_1_, double p_174984_3_, double p_174984_5_)
  {
    V = new bib();
    ((bib)V).b();
    bqq var7 = new bqq(V.c);
    var7.transpose();
    bqq var8 = new bqq(V.b);
    var8.transpose();
    bqq var9 = new bqq();
    bqq.mul(var8, var7, var9);
    var9.invert();
    X.a = p_174984_1_;
    X.b = p_174984_3_;
    X.c = p_174984_5_;
    W[0] = new Vector4f(-1.0F, -1.0F, -1.0F, 1.0F);
    W[1] = new Vector4f(1.0F, -1.0F, -1.0F, 1.0F);
    W[2] = new Vector4f(1.0F, 1.0F, -1.0F, 1.0F);
    W[3] = new Vector4f(-1.0F, 1.0F, -1.0F, 1.0F);
    W[4] = new Vector4f(-1.0F, -1.0F, 1.0F, 1.0F);
    W[5] = new Vector4f(1.0F, -1.0F, 1.0F, 1.0F);
    W[6] = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
    W[7] = new Vector4f(-1.0F, 1.0F, 1.0F, 1.0F);
    for (int var10 = 0; var10 < 8; var10++)
    {
      bqq.transform(var9, W[var10], W[var10]);
      W[var10].x /= W[var10].w;
      W[var10].y /= W[var10].w;
      W[var10].z /= W[var10].w;
      W[var10].w = 1.0F;
    }
  }
  
  protected Vector3f a(pk p_500145_1_, double p_500145_2_)
  {
    float var4 = (float)(B + (z - B) * p_500145_2_);
    float var5 = (float)(A + (y - A) * p_500145_2_);
    if (At.aA == 2) {
      var4 += 180.0F;
    }
    float var6 = ns.b(-var5 * 0.017453292F - 3.1415927F);
    float var7 = ns.a(-var5 * 0.017453292F - 3.1415927F);
    float var8 = -ns.b(-var4 * 0.017453292F);
    float var9 = ns.a(-var4 * 0.017453292F);
    return new Vector3f(var7 * var8, var9, var6 * var8);
  }
  
  public int a(adf blockLayerIn, double partialTicks, int pass, pk entityIn)
  {
    
    if (blockLayerIn == adf.d)
    {
      h.A.a("translucent_sort");
      double var6 = s - Z;
      double var8 = t - aa;
      double var10 = u - ab;
      if (var6 * var6 + var8 * var8 + var10 * var10 > 1.0D)
      {
        Z = s;
        aa = t;
        ab = u;
        int var12 = 0;
        Iterator var13 = m.iterator();
        
        chunksToResortTransparency.clear();
        while (var13.hasNext())
        {
          bfr.a var14 = (bfr.a)var13.next();
          if ((a.b.d(blockLayerIn)) && (var12++ < 15)) {
            chunksToResortTransparency.add(a);
          }
        }
      }
      h.A.b();
    }
    h.A.a("filterempty");
    int var15 = 0;
    boolean var7 = blockLayerIn == adf.d;
    int var16 = var7 ? m.size() - 1 : 0;
    int var9 = var7 ? -1 : m.size();
    int var17 = var7 ? -1 : 1;
    for (int var11 = var16; var11 != var9; var11 += var17)
    {
      bht var18 = m.get(var11)).a;
      if (!var18.g().b(blockLayerIn))
      {
        var15++;
        O.a(var18, blockLayerIn);
      }
    }
    if (var15 == 0)
    {
      h.A.b();
      return var15;
    }
    if ((Config.isFogOff()) && (h.o.fogStandard)) {
      bfl.n();
    }
    h.A.c("render_" + blockLayerIn);
    a(blockLayerIn);
    h.A.b();
    return var15;
  }
  
  private void a(adf blockLayerIn)
  {
    h.o.i();
    if (bqs.f())
    {
      GL11.glEnableClientState(32884);
      bqs.l(bqs.q);
      GL11.glEnableClientState(32888);
      bqs.l(bqs.r);
      GL11.glEnableClientState(32888);
      bqs.l(bqs.q);
      GL11.glEnableClientState(32886);
    }
    if (Config.isShaders()) {
      ShadersRender.preRenderChunkLayer();
    }
    O.a(blockLayerIn);
    if (Config.isShaders()) {
      ShadersRender.postRenderChunkLayer();
    }
    if (bqs.f())
    {
      List var2 = bms.a.h();
      Iterator var3 = var2.iterator();
      while (var3.hasNext())
      {
        bmv var4 = (bmv)var3.next();
        bmv.b var5 = var4.b();
        int var6 = var4.d();
        switch (bfr.2.a[var5.ordinal()])
        {
        case 1: 
          GL11.glDisableClientState(32884);
          break;
        case 2: 
          bqs.l(bqs.q + var6);
          GL11.glDisableClientState(32888);
          bqs.l(bqs.q);
          break;
        case 3: 
          GL11.glDisableClientState(32886);
          bfl.G();
        }
      }
    }
    h.o.h();
  }
  
  private void a(Iterator p_174965_1_)
  {
    while (p_174965_1_.hasNext())
    {
      kw var2 = (kw)p_174965_1_.next();
      int var3 = var2.d();
      if (w - var3 > 400) {
        p_174965_1_.remove();
      }
    }
  }
  
  public void j()
  {
    w += 1;
    if (w % 20 == 0) {
      a(x.values().iterator());
    }
  }
  
  private void r()
  {
    if (!Config.isSkyEnabled()) {
      return;
    }
    bfl.n();
    bfl.c();
    bfl.l();
    bfl.a(770, 771, 1, 0);
    avc.a();
    bfl.a(false);
    i.a(f);
    bfx var1 = bfx.a();
    bfd var2 = var1.c();
    for (int var3 = 0; var3 < 6; var3++)
    {
      bfl.E();
      if (var3 == 1) {
        bfl.b(90.0F, 1.0F, 0.0F, 0.0F);
      }
      if (var3 == 2) {
        bfl.b(-90.0F, 1.0F, 0.0F, 0.0F);
      }
      if (var3 == 3) {
        bfl.b(180.0F, 1.0F, 0.0F, 0.0F);
      }
      if (var3 == 4) {
        bfl.b(90.0F, 0.0F, 0.0F, 1.0F);
      }
      if (var3 == 5) {
        bfl.b(-90.0F, 0.0F, 0.0F, 1.0F);
      }
      var2.a(7, bms.i);
      var2.b(-100.0D, -100.0D, -100.0D).a(0.0D, 0.0D).b(40, 40, 40, 255).d();
      var2.b(-100.0D, -100.0D, 100.0D).a(0.0D, 16.0D).b(40, 40, 40, 255).d();
      var2.b(100.0D, -100.0D, 100.0D).a(16.0D, 16.0D).b(40, 40, 40, 255).d();
      var2.b(100.0D, -100.0D, -100.0D).a(16.0D, 0.0D).b(40, 40, 40, 255).d();
      var1.b();
      bfl.F();
    }
    bfl.a(true);
    bfl.w();
    bfl.d();
  }
  
  public void a(float partialTicks, int pass)
  {
    if (Reflector.ForgeWorldProvider_getSkyRenderer.exists())
    {
      anm wp = h.f.t;
      Object skyRenderer = Reflector.call(wp, Reflector.ForgeWorldProvider_getSkyRenderer, new Object[0]);
      if (skyRenderer != null)
      {
        Reflector.callVoid(skyRenderer, Reflector.IRenderHandler_render, new Object[] { Float.valueOf(partialTicks), k, h });
        return;
      }
    }
    if (h.f.t.q() == 1)
    {
      r();
    }
    else if (h.f.t.d())
    {
      bfl.x();
      
      boolean isShaders = Config.isShaders();
      if (isShaders) {
        Shaders.disableTexture2D();
      }
      aui var3 = k.a(h.ac(), partialTicks);
      
      var3 = CustomColorizer.getSkyColor(var3, h.f, h.ac().s, h.ac().t + 1.0D, h.ac().u);
      if (isShaders) {
        Shaders.setSkyColor(var3);
      }
      float var4 = (float)a;
      float var5 = (float)b;
      float var6 = (float)c;
      if (pass != 2)
      {
        float var7 = (var4 * 30.0F + var5 * 59.0F + var6 * 11.0F) / 100.0F;
        float var8 = (var4 * 30.0F + var5 * 70.0F) / 100.0F;
        float var9 = (var4 * 30.0F + var6 * 70.0F) / 100.0F;
        var4 = var7;
        var5 = var8;
        var6 = var9;
      }
      bfl.c(var4, var5, var6);
      bfx var20 = bfx.a();
      bfd var21 = var20.c();
      bfl.a(false);
      bfl.m();
      if (isShaders) {
        Shaders.enableFog();
      }
      bfl.c(var4, var5, var6);
      if (isShaders) {
        Shaders.preSkyList();
      }
      if (Config.isSkyEnabled()) {
        if (Y)
        {
          u.a();
          GL11.glEnableClientState(32884);
          GL11.glVertexPointer(3, 5126, 12, 0L);
          u.a(7);
          u.b();
          GL11.glDisableClientState(32884);
        }
        else
        {
          bfl.o(q);
        }
      }
      bfl.n();
      if (isShaders) {
        Shaders.disableFog();
      }
      bfl.c();
      bfl.l();
      bfl.a(770, 771, 1, 0);
      avc.a();
      
      float[] var22 = k.t.a(k.c(partialTicks), partialTicks);
      if ((var22 != null) && (Config.isSunMoonEnabled()))
      {
        bfl.x();
        if (isShaders) {
          Shaders.disableTexture2D();
        }
        bfl.j(7425);
        bfl.E();
        bfl.b(90.0F, 1.0F, 0.0F, 0.0F);
        bfl.b(ns.a(k.d(partialTicks)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
        bfl.b(90.0F, 0.0F, 0.0F, 1.0F);
        float var10 = var22[0];
        float var11 = var22[1];
        float var12 = var22[2];
        if (pass != 2)
        {
          float var13 = (var10 * 30.0F + var11 * 59.0F + var12 * 11.0F) / 100.0F;
          float var14 = (var10 * 30.0F + var11 * 70.0F) / 100.0F;
          float var15 = (var10 * 30.0F + var12 * 70.0F) / 100.0F;
          var10 = var13;
          var11 = var14;
          var12 = var15;
        }
        var21.a(6, bms.f);
        var21.b(0.0D, 100.0D, 0.0D).a(var10, var11, var12, var22[3]).d();
        boolean var25 = true;
        for (int var27 = 0; var27 <= 16; var27++)
        {
          float var15 = var27 * 3.1415927F * 2.0F / 16.0F;
          float var16 = ns.a(var15);
          float var17 = ns.b(var15);
          var21.b(var16 * 120.0F, var17 * 120.0F, -var17 * 40.0F * var22[3]).a(var22[0], var22[1], var22[2], 0.0F).d();
        }
        var20.b();
        bfl.F();
        bfl.j(7424);
      }
      bfl.w();
      if (isShaders) {
        Shaders.enableTexture2D();
      }
      bfl.a(770, 1, 1, 0);
      bfl.E();
      float var10 = 1.0F - k.j(partialTicks);
      bfl.c(1.0F, 1.0F, 1.0F, var10);
      bfl.b(-90.0F, 0.0F, 1.0F, 0.0F);
      
      CustomSky.renderSky(k, i, k.c(partialTicks), var10);
      if (isShaders) {
        Shaders.preCelestialRotate();
      }
      bfl.b(k.c(partialTicks) * 360.0F, 1.0F, 0.0F, 0.0F);
      if (isShaders) {
        Shaders.postCelestialRotate();
      }
      if (Config.isSunMoonEnabled())
      {
        float var11 = 30.0F;
        
        i.a(d);
        var21.a(7, bms.g);
        var21.b(-var11, 100.0D, -var11).a(0.0D, 0.0D).d();
        var21.b(var11, 100.0D, -var11).a(1.0D, 0.0D).d();
        var21.b(var11, 100.0D, var11).a(1.0D, 1.0D).d();
        var21.b(-var11, 100.0D, var11).a(0.0D, 1.0D).d();
        var20.b();
        
        var11 = 20.0F;
        
        i.a(c);
        int var24 = k.x();
        int var26 = var24 % 4;
        int var27 = var24 / 4 % 2;
        float var15 = (var26 + 0) / 4.0F;
        float var16 = (var27 + 0) / 2.0F;
        float var17 = (var26 + 1) / 4.0F;
        float var18 = (var27 + 1) / 2.0F;
        var21.a(7, bms.g);
        var21.b(-var11, -100.0D, var11).a(var17, var18).d();
        var21.b(var11, -100.0D, var11).a(var15, var18).d();
        var21.b(var11, -100.0D, -var11).a(var15, var16).d();
        var21.b(-var11, -100.0D, -var11).a(var17, var16).d();
        var20.b();
      }
      bfl.x();
      if (isShaders) {
        Shaders.disableTexture2D();
      }
      float var19 = k.g(partialTicks) * var10;
      if ((var19 > 0.0F) && (Config.isStarsEnabled()) && (!CustomSky.hasSkyLayers(k)))
      {
        bfl.c(var19, var19, var19, var19);
        if (Y)
        {
          t.a();
          GL11.glEnableClientState(32884);
          GL11.glVertexPointer(3, 5126, 12, 0L);
          t.a(7);
          t.b();
          GL11.glDisableClientState(32884);
        }
        else
        {
          bfl.o(p);
        }
      }
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.k();
      bfl.d();
      bfl.m();
      if (isShaders) {
        Shaders.enableFog();
      }
      bfl.F();
      bfl.x();
      if (isShaders) {
        Shaders.disableTexture2D();
      }
      bfl.c(0.0F, 0.0F, 0.0F);
      double var23 = h.h.e(partialTicks).b - k.X();
      if (var23 < 0.0D)
      {
        bfl.E();
        bfl.b(0.0F, 12.0F, 0.0F);
        if (Y)
        {
          v.a();
          GL11.glEnableClientState(32884);
          GL11.glVertexPointer(3, 5126, 12, 0L);
          v.a(7);
          v.b();
          GL11.glDisableClientState(32884);
        }
        else
        {
          bfl.o(r);
        }
        bfl.F();
        float var12 = 1.0F;
        float var13 = -(float)(var23 + 65.0D);
        float var14 = -1.0F;
        var21.a(7, bms.f);
        var21.b(-1.0D, var13, 1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, var13, 1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, var13, -1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, var13, -1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, var13, 1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, var13, -1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, var13, -1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, var13, 1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
        var21.b(-1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, -1.0D, 1.0D).b(0, 0, 0, 255).d();
        var21.b(1.0D, -1.0D, -1.0D).b(0, 0, 0, 255).d();
        var20.b();
      }
      if (k.t.g()) {
        bfl.c(var4 * 0.2F + 0.04F, var5 * 0.2F + 0.04F, var6 * 0.6F + 0.1F);
      } else {
        bfl.c(var4, var5, var6);
      }
      if (h.t.c <= 4) {
        bfl.c(h.o.Q, h.o.R, h.o.S);
      }
      bfl.E();
      bfl.b(0.0F, -(float)(var23 - 16.0D), 0.0F);
      if (Config.isSkyEnabled()) {
        bfl.o(r);
      }
      bfl.F();
      bfl.w();
      if (isShaders) {
        Shaders.enableTexture2D();
      }
      bfl.a(true);
    }
  }
  
  public void b(float p_180447_1_, int p_180447_2_)
  {
    if (Config.isCloudsOff()) {
      return;
    }
    if (Reflector.ForgeWorldProvider_getCloudRenderer.exists())
    {
      anm wp = h.f.t;
      
      Object cloudRenderer = Reflector.call(wp, Reflector.ForgeWorldProvider_getCloudRenderer, new Object[0]);
      if (cloudRenderer != null)
      {
        Reflector.callVoid(cloudRenderer, Reflector.IRenderHandler_render, new Object[] { Float.valueOf(p_180447_1_), k, h });
        return;
      }
    }
    if (h.f.t.d()) {
      if (Config.isCloudsFancy())
      {
        c(p_180447_1_, p_180447_2_);
      }
      else
      {
        float partialTicks = p_180447_1_;
        this.cloudRenderer.prepareToRender(false, w, partialTicks);
        
        p_180447_1_ = 0.0F;
        
        bfl.p();
        float var3 = (float)(h.ac().Q + (h.ac().t - h.ac().Q) * p_180447_1_);
        boolean var4 = true;
        boolean var5 = true;
        bfx var6 = bfx.a();
        bfd var7 = var6.c();
        i.a(e);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        if (this.cloudRenderer.shouldUpdateGlList())
        {
          this.cloudRenderer.startUpdateGlList();
          
          aui var8 = k.e(p_180447_1_);
          float var9 = (float)a;
          float var10 = (float)b;
          float var11 = (float)c;
          if (p_180447_2_ != 2)
          {
            float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
          }
          float var12 = 4.8828125E-4F;
          double var26 = w + p_180447_1_;
          double var15 = h.ac().p + (h.ac().s - h.ac().p) * p_180447_1_ + var26 * 0.029999999329447746D;
          double var17 = h.ac().r + (h.ac().u - h.ac().r) * p_180447_1_;
          int var19 = ns.c(var15 / 2048.0D);
          int var20 = ns.c(var17 / 2048.0D);
          var15 -= var19 * 2048;
          var17 -= var20 * 2048;
          float var21 = k.t.f() - var3 + 0.33F;
          
          var21 += h.t.ofCloudsHeight * 128.0F;
          
          float var22 = (float)(var15 * 4.8828125E-4D);
          float var23 = (float)(var17 * 4.8828125E-4D);
          var7.a(7, bms.i);
          for (int var24 = 65280; var24 < 256; var24 += 32) {
            for (int var25 = 65280; var25 < 256; var25 += 32)
            {
              var7.b(var24 + 0, var21, var25 + 32).a((var24 + 0) * 4.8828125E-4F + var22, (var25 + 32) * 4.8828125E-4F + var23).a(var9, var10, var11, 0.8F).d();
              var7.b(var24 + 32, var21, var25 + 32).a((var24 + 32) * 4.8828125E-4F + var22, (var25 + 32) * 4.8828125E-4F + var23).a(var9, var10, var11, 0.8F).d();
              var7.b(var24 + 32, var21, var25 + 0).a((var24 + 32) * 4.8828125E-4F + var22, (var25 + 0) * 4.8828125E-4F + var23).a(var9, var10, var11, 0.8F).d();
              var7.b(var24 + 0, var21, var25 + 0).a((var24 + 0) * 4.8828125E-4F + var22, (var25 + 0) * 4.8828125E-4F + var23).a(var9, var10, var11, 0.8F).d();
            }
          }
          var6.b();
          
          this.cloudRenderer.endUpdateGlList();
        }
        this.cloudRenderer.renderGlList();
        
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        bfl.k();
        bfl.o();
      }
    }
  }
  
  public boolean a(double p_72721_1_, double p_72721_3_, double p_72721_5_, float p_72721_7_)
  {
    return false;
  }
  
  private void c(float p_180445_1_, int p_180445_2_)
  {
    float partialTicks = p_180445_1_;
    cloudRenderer.prepareToRender(true, w, partialTicks);
    
    p_180445_1_ = 0.0F;
    
    bfl.p();
    float var3 = (float)(h.ac().Q + (h.ac().t - h.ac().Q) * p_180445_1_);
    bfx var4 = bfx.a();
    bfd var5 = var4.c();
    float var6 = 12.0F;
    float var7 = 4.0F;
    double var8 = w + p_180445_1_;
    double var10 = (h.ac().p + (h.ac().s - h.ac().p) * p_180445_1_ + var8 * 0.029999999329447746D) / 12.0D;
    double var12 = (h.ac().r + (h.ac().u - h.ac().r) * p_180445_1_) / 12.0D + 0.33000001311302185D;
    float var14 = k.t.f() - var3 + 0.33F;
    
    var14 += h.t.ofCloudsHeight * 128.0F;
    
    int var15 = ns.c(var10 / 2048.0D);
    int var16 = ns.c(var12 / 2048.0D);
    var10 -= var15 * 2048;
    var12 -= var16 * 2048;
    i.a(e);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    aui var17 = k.e(p_180445_1_);
    float var18 = (float)a;
    float var19 = (float)b;
    float var20 = (float)c;
    if (p_180445_2_ != 2)
    {
      float var21 = (var18 * 30.0F + var19 * 59.0F + var20 * 11.0F) / 100.0F;
      float var22 = (var18 * 30.0F + var19 * 70.0F) / 100.0F;
      float var23 = (var18 * 30.0F + var20 * 70.0F) / 100.0F;
      var18 = var21;
      var19 = var22;
      var20 = var23;
    }
    float var21 = var18 * 0.9F;
    float var22 = var19 * 0.9F;
    float var23 = var20 * 0.9F;
    float var24 = var18 * 0.7F;
    float var25 = var19 * 0.7F;
    float var26 = var20 * 0.7F;
    float var27 = var18 * 0.8F;
    float var28 = var19 * 0.8F;
    float var29 = var20 * 0.8F;
    float var30 = 0.00390625F;
    float var31 = ns.c(var10) * 0.00390625F;
    float var32 = ns.c(var12) * 0.00390625F;
    float var33 = (float)(var10 - ns.c(var10));
    float var34 = (float)(var12 - ns.c(var12));
    boolean var35 = true;
    boolean var36 = true;
    float var37 = 9.765625E-4F;
    bfl.a(12.0F, 1.0F, 12.0F);
    for (int var38 = 0; var38 < 2; var38++)
    {
      if (var38 == 0) {
        bfl.a(false, false, false, false);
      } else {
        switch (p_180445_2_)
        {
        case 0: 
          bfl.a(false, true, true, true);
          break;
        case 1: 
          bfl.a(true, false, false, true);
          break;
        case 2: 
          bfl.a(true, true, true, true);
        }
      }
      cloudRenderer.renderGlList();
    }
    if (cloudRenderer.shouldUpdateGlList())
    {
      cloudRenderer.startUpdateGlList();
      for (int var39 = -3; var39 <= 4; var39++) {
        for (int var40 = -3; var40 <= 4; var40++)
        {
          var5.a(7, bms.l);
          float var41 = var39 * 8;
          float var42 = var40 * 8;
          float var43 = var41 - var33;
          float var44 = var42 - var34;
          if (var14 > -5.0F)
          {
            var5.b(var43 + 0.0F, var14 + 0.0F, var44 + 8.0F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var24, var25, var26, 0.8F).c(0.0F, -1.0F, 0.0F).d();
            var5.b(var43 + 8.0F, var14 + 0.0F, var44 + 8.0F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var24, var25, var26, 0.8F).c(0.0F, -1.0F, 0.0F).d();
            var5.b(var43 + 8.0F, var14 + 0.0F, var44 + 0.0F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var24, var25, var26, 0.8F).c(0.0F, -1.0F, 0.0F).d();
            var5.b(var43 + 0.0F, var14 + 0.0F, var44 + 0.0F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var24, var25, var26, 0.8F).c(0.0F, -1.0F, 0.0F).d();
          }
          if (var14 <= 5.0F)
          {
            var5.b(var43 + 0.0F, var14 + 4.0F - 9.765625E-4F, var44 + 8.0F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var18, var19, var20, 0.8F).c(0.0F, 1.0F, 0.0F).d();
            var5.b(var43 + 8.0F, var14 + 4.0F - 9.765625E-4F, var44 + 8.0F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var18, var19, var20, 0.8F).c(0.0F, 1.0F, 0.0F).d();
            var5.b(var43 + 8.0F, var14 + 4.0F - 9.765625E-4F, var44 + 0.0F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var18, var19, var20, 0.8F).c(0.0F, 1.0F, 0.0F).d();
            var5.b(var43 + 0.0F, var14 + 4.0F - 9.765625E-4F, var44 + 0.0F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var18, var19, var20, 0.8F).c(0.0F, 1.0F, 0.0F).d();
          }
          if (var39 > -1) {
            for (int var45 = 0; var45 < 8; var45++)
            {
              var5.b(var43 + var45 + 0.0F, var14 + 0.0F, var44 + 8.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
              var5.b(var43 + var45 + 0.0F, var14 + 4.0F, var44 + 8.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
              var5.b(var43 + var45 + 0.0F, var14 + 4.0F, var44 + 0.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
              var5.b(var43 + var45 + 0.0F, var14 + 0.0F, var44 + 0.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(-1.0F, 0.0F, 0.0F).d();
            }
          }
          if (var39 <= 1) {
            for (int var45 = 0; var45 < 8; var45++)
            {
              var5.b(var43 + var45 + 1.0F - 9.765625E-4F, var14 + 0.0F, var44 + 8.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(1.0F, 0.0F, 0.0F).d();
              var5.b(var43 + var45 + 1.0F - 9.765625E-4F, var14 + 4.0F, var44 + 8.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 8.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(1.0F, 0.0F, 0.0F).d();
              var5.b(var43 + var45 + 1.0F - 9.765625E-4F, var14 + 4.0F, var44 + 0.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(1.0F, 0.0F, 0.0F).d();
              var5.b(var43 + var45 + 1.0F - 9.765625E-4F, var14 + 0.0F, var44 + 0.0F).a((var41 + var45 + 0.5F) * 0.00390625F + var31, (var42 + 0.0F) * 0.00390625F + var32).a(var21, var22, var23, 0.8F).c(1.0F, 0.0F, 0.0F).d();
            }
          }
          if (var40 > -1) {
            for (int var45 = 0; var45 < 8; var45++)
            {
              var5.b(var43 + 0.0F, var14 + 4.0F, var44 + var45 + 0.0F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, -1.0F).d();
              var5.b(var43 + 8.0F, var14 + 4.0F, var44 + var45 + 0.0F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, -1.0F).d();
              var5.b(var43 + 8.0F, var14 + 0.0F, var44 + var45 + 0.0F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, -1.0F).d();
              var5.b(var43 + 0.0F, var14 + 0.0F, var44 + var45 + 0.0F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, -1.0F).d();
            }
          }
          if (var40 <= 1) {
            for (int var45 = 0; var45 < 8; var45++)
            {
              var5.b(var43 + 0.0F, var14 + 4.0F, var44 + var45 + 1.0F - 9.765625E-4F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, 1.0F).d();
              var5.b(var43 + 8.0F, var14 + 4.0F, var44 + var45 + 1.0F - 9.765625E-4F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, 1.0F).d();
              var5.b(var43 + 8.0F, var14 + 0.0F, var44 + var45 + 1.0F - 9.765625E-4F).a((var41 + 8.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, 1.0F).d();
              var5.b(var43 + 0.0F, var14 + 0.0F, var44 + var45 + 1.0F - 9.765625E-4F).a((var41 + 0.0F) * 0.00390625F + var31, (var42 + var45 + 0.5F) * 0.00390625F + var32).a(var27, var28, var29, 0.8F).c(0.0F, 0.0F, 1.0F).d();
            }
          }
          var4.b();
        }
      }
      cloudRenderer.endUpdateGlList();
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    bfl.o();
  }
  
  public void a(long p_174967_1_)
  {
    ac |= N.a(p_174967_1_);
    if (chunksToUpdateForced.size() > 0)
    {
      Iterator itForced = chunksToUpdateForced.iterator();
      while (itForced.hasNext())
      {
        bht rc = (bht)itForced.next();
        if (!N.a(rc)) {
          break;
        }
        rc.a(false);
        itForced.remove();
        l.remove(rc);
        chunksToResortTransparency.remove(rc);
      }
    }
    if (chunksToResortTransparency.size() > 0)
    {
      Iterator itTransparency = chunksToResortTransparency.iterator();
      if (itTransparency.hasNext())
      {
        bht renderChunk = (bht)itTransparency.next();
        if (N.c(renderChunk)) {
          itTransparency.remove();
        }
      }
    }
    int countUpdated = 0;
    int updatesPerFrame = Config.getUpdatesPerFrame();
    int maxUpdatesPerFrame = updatesPerFrame * 2;
    
    Iterator var3 = l.iterator();
    while (var3.hasNext())
    {
      bht var4 = (bht)var3.next();
      if (!N.a(var4)) {
        break;
      }
      var4.a(false);
      var3.remove();
      if ((var4.g().a()) && (updatesPerFrame < maxUpdatesPerFrame)) {
        updatesPerFrame++;
      }
      countUpdated++;
      if (countUpdated >= updatesPerFrame) {
        break;
      }
    }
  }
  
  public void a(pk p_180449_1_, float p_180449_2_)
  {
    bfx var3 = bfx.a();
    bfd var4 = var3.c();
    ams var5 = k.af();
    double var6 = h.t.c * 16;
    if ((s >= var5.d() - var6) || (s <= var5.b() + var6) || (u >= var5.e() - var6) || (u <= var5.c() + var6))
    {
      double var8 = 1.0D - var5.a(p_180449_1_) / var6;
      var8 = Math.pow(var8, 4.0D);
      double var10 = P + (s - P) * p_180449_2_;
      double var12 = Q + (t - Q) * p_180449_2_;
      double var14 = R + (u - R) * p_180449_2_;
      bfl.l();
      bfl.a(770, 1, 1, 0);
      i.a(g);
      bfl.a(false);
      bfl.E();
      int var16 = var5.a().a();
      float var17 = (var16 >> 16 & 0xFF) / 255.0F;
      float var18 = (var16 >> 8 & 0xFF) / 255.0F;
      float var19 = (var16 & 0xFF) / 255.0F;
      bfl.c(var17, var18, var19, (float)var8);
      bfl.a(-3.0F, -3.0F);
      bfl.q();
      bfl.a(516, 0.1F);
      bfl.d();
      bfl.p();
      float var20 = (float)(ave.J() % 3000L) / 3000.0F;
      float var21 = 0.0F;
      float var22 = 0.0F;
      float var23 = 128.0F;
      var4.a(7, bms.g);
      var4.c(-var10, -var12, -var14);
      double var24 = Math.max(ns.c(var14 - var6), var5.c());
      double var26 = Math.min(ns.f(var14 + var6), var5.e());
      if (var10 > var5.d() - var6)
      {
        float var28 = 0.0F;
        for (double var29 = var24; var29 < var26; var28 += 0.5F)
        {
          double var31 = Math.min(1.0D, var26 - var29);
          float var33 = (float)var31 * 0.5F;
          var4.b(var5.d(), 256.0D, var29).a(var20 + var28, var20 + 0.0F).d();
          var4.b(var5.d(), 256.0D, var29 + var31).a(var20 + var33 + var28, var20 + 0.0F).d();
          var4.b(var5.d(), 0.0D, var29 + var31).a(var20 + var33 + var28, var20 + 128.0F).d();
          var4.b(var5.d(), 0.0D, var29).a(var20 + var28, var20 + 128.0F).d();
          var29 += 1.0D;
        }
      }
      if (var10 < var5.b() + var6)
      {
        float var28 = 0.0F;
        for (double var29 = var24; var29 < var26; var28 += 0.5F)
        {
          double var31 = Math.min(1.0D, var26 - var29);
          float var33 = (float)var31 * 0.5F;
          var4.b(var5.b(), 256.0D, var29).a(var20 + var28, var20 + 0.0F).d();
          var4.b(var5.b(), 256.0D, var29 + var31).a(var20 + var33 + var28, var20 + 0.0F).d();
          var4.b(var5.b(), 0.0D, var29 + var31).a(var20 + var33 + var28, var20 + 128.0F).d();
          var4.b(var5.b(), 0.0D, var29).a(var20 + var28, var20 + 128.0F).d();
          var29 += 1.0D;
        }
      }
      var24 = Math.max(ns.c(var10 - var6), var5.b());
      var26 = Math.min(ns.f(var10 + var6), var5.d());
      if (var14 > var5.e() - var6)
      {
        float var28 = 0.0F;
        for (double var29 = var24; var29 < var26; var28 += 0.5F)
        {
          double var31 = Math.min(1.0D, var26 - var29);
          float var33 = (float)var31 * 0.5F;
          var4.b(var29, 256.0D, var5.e()).a(var20 + var28, var20 + 0.0F).d();
          var4.b(var29 + var31, 256.0D, var5.e()).a(var20 + var33 + var28, var20 + 0.0F).d();
          var4.b(var29 + var31, 0.0D, var5.e()).a(var20 + var33 + var28, var20 + 128.0F).d();
          var4.b(var29, 0.0D, var5.e()).a(var20 + var28, var20 + 128.0F).d();
          var29 += 1.0D;
        }
      }
      if (var14 < var5.c() + var6)
      {
        float var28 = 0.0F;
        for (double var29 = var24; var29 < var26; var28 += 0.5F)
        {
          double var31 = Math.min(1.0D, var26 - var29);
          float var33 = (float)var31 * 0.5F;
          var4.b(var29, 256.0D, var5.c()).a(var20 + var28, var20 + 0.0F).d();
          var4.b(var29 + var31, 256.0D, var5.c()).a(var20 + var33 + var28, var20 + 0.0F).d();
          var4.b(var29 + var31, 0.0D, var5.c()).a(var20 + var33 + var28, var20 + 128.0F).d();
          var4.b(var29, 0.0D, var5.c()).a(var20 + var28, var20 + 128.0F).d();
          var29 += 1.0D;
        }
      }
      var3.b();
      var4.c(0.0D, 0.0D, 0.0D);
      bfl.o();
      bfl.c();
      bfl.a(0.0F, 0.0F);
      bfl.r();
      bfl.d();
      bfl.k();
      bfl.F();
      bfl.a(true);
    }
  }
  
  private void s()
  {
    bfl.a(774, 768, 1, 0);
    bfl.l();
    bfl.c(1.0F, 1.0F, 1.0F, 0.5F);
    bfl.a(-3.0F, -3.0F);
    bfl.q();
    bfl.a(516, 0.1F);
    bfl.d();
    bfl.E();
    if (Config.isShaders()) {
      ShadersRender.beginBlockDamage();
    }
  }
  
  private void t()
  {
    bfl.c();
    bfl.a(0.0F, 0.0F);
    bfl.r();
    bfl.d();
    bfl.a(true);
    bfl.F();
    if (Config.isShaders()) {
      ShadersRender.endBlockDamage();
    }
  }
  
  public void a(bfx p_174981_1_, bfd p_174981_2_, pk p_174981_3_, float p_174981_4_)
  {
    double var5 = P + (s - P) * p_174981_4_;
    double var7 = Q + (t - Q) * p_174981_4_;
    double var9 = R + (u - R) * p_174981_4_;
    if (!x.isEmpty())
    {
      i.a(bmh.g);
      s();
      p_174981_2_.a(7, bms.a);
      p_174981_2_.c(-var5, -var7, -var9);
      p_174981_2_.c();
      Iterator var11 = x.values().iterator();
      while (var11.hasNext())
      {
        kw var12 = (kw)var11.next();
        cj var13 = var12.b();
        double var14 = var13.n() - var5;
        double var16 = var13.o() - var7;
        double var18 = var13.p() - var9;
        afh var20 = k.p(var13).c();
        boolean renderBreaking;
        boolean renderBreaking;
        if (Reflector.ForgeTileEntity_canRenderBreaking.exists())
        {
          afh block = var20;
          boolean tileEntityRenderBreaking = ((block instanceof afs)) || ((block instanceof agp)) || ((block instanceof ajl)) || ((block instanceof ajm));
          if (!tileEntityRenderBreaking)
          {
            akw te = k.s(var13);
            if (te != null) {
              tileEntityRenderBreaking = Reflector.callBoolean(te, Reflector.ForgeTileEntity_canRenderBreaking, new Object[0]);
            }
          }
          renderBreaking = !tileEntityRenderBreaking;
        }
        else
        {
          renderBreaking = (!(var20 instanceof afs)) && (!(var20 instanceof agp)) && (!(var20 instanceof ajl)) && (!(var20 instanceof ajm));
        }
        if (renderBreaking) {
          if (var14 * var14 + var16 * var16 + var18 * var18 > 1024.0D)
          {
            var11.remove();
          }
          else
          {
            alz var21 = k.p(var13);
            if (var21.c().t() != arm.a)
            {
              int var22 = var12.c();
              bmi var23 = z[var22];
              bgd var24 = h.ae();
              var24.a(var21, var13, var23, k);
            }
          }
        }
      }
      p_174981_1_.b();
      p_174981_2_.c(0.0D, 0.0D, 0.0D);
      t();
    }
  }
  
  public void a(wn p_72731_1_, auh p_72731_2_, int p_72731_3_, float p_72731_4_)
  {
    if ((p_72731_3_ == 0) && (a == auh.a.b))
    {
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfl.c(0.0F, 0.0F, 0.0F, 0.4F);
      GL11.glLineWidth(2.0F);
      bfl.x();
      if (Config.isShaders()) {
        Shaders.disableTexture2D();
      }
      bfl.a(false);
      float var5 = 0.002F;
      cj var6 = p_72731_2_.a();
      afh var7 = k.p(var6).c();
      if ((var7.t() != arm.a) && (k.af().a(var6)))
      {
        var7.a(k, var6);
        double var8 = P + (s - P) * p_72731_4_;
        double var10 = Q + (t - Q) * p_72731_4_;
        double var12 = R + (u - R) * p_72731_4_;
        a(var7.b(k, var6).b(0.0020000000949949026D, 0.0020000000949949026D, 0.0020000000949949026D).c(-var8, -var10, -var12));
      }
      bfl.a(true);
      bfl.w();
      if (Config.isShaders()) {
        Shaders.enableTexture2D();
      }
      bfl.k();
    }
  }
  
  public static void a(aug p_500146_0_)
  {
    bfx var1 = bfx.a();
    bfd var2 = var1.c();
    var2.a(3, bms.e);
    var2.b(a, b, c).d();
    var2.b(d, b, c).d();
    var2.b(d, b, f).d();
    var2.b(a, b, f).d();
    var2.b(a, b, c).d();
    var1.b();
    var2.a(3, bms.e);
    var2.b(a, e, c).d();
    var2.b(d, e, c).d();
    var2.b(d, e, f).d();
    var2.b(a, e, f).d();
    var2.b(a, e, c).d();
    var1.b();
    var2.a(1, bms.e);
    var2.b(a, b, c).d();
    var2.b(a, e, c).d();
    var2.b(d, b, c).d();
    var2.b(d, e, c).d();
    var2.b(d, b, f).d();
    var2.b(d, e, f).d();
    var2.b(a, b, f).d();
    var2.b(a, e, f).d();
    var1.b();
  }
  
  public static void a(aug p_500147_0_, int p_500147_1_, int p_500147_2_, int p_500147_3_, int p_500147_4_)
  {
    bfx var5 = bfx.a();
    bfd var6 = var5.c();
    var6.a(3, bms.f);
    var6.b(a, b, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, b, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, b, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(a, b, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(a, b, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var5.b();
    var6.a(3, bms.f);
    var6.b(a, e, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, e, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, e, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(a, e, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(a, e, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var5.b();
    var6.a(1, bms.f);
    var6.b(a, b, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(a, e, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, b, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, e, c).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, b, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(d, e, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(a, b, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var6.b(a, e, f).b(p_500147_1_, p_500147_2_, p_500147_3_, p_500147_4_).d();
    var5.b();
  }
  
  private void b(int p_72725_1_, int p_72725_2_, int p_72725_3_, int p_72725_4_, int p_72725_5_, int p_72725_6_)
  {
    o.a(p_72725_1_, p_72725_2_, p_72725_3_, p_72725_4_, p_72725_5_, p_72725_6_);
  }
  
  public void a(cj pos)
  {
    int var2 = pos.n();
    int var3 = pos.o();
    int var4 = pos.p();
    b(var2 - 1, var3 - 1, var4 - 1, var2 + 1, var3 + 1, var4 + 1);
  }
  
  public void b(cj pos)
  {
    int var2 = pos.n();
    int var3 = pos.o();
    int var4 = pos.p();
    b(var2 - 1, var3 - 1, var4 - 1, var2 + 1, var3 + 1, var4 + 1);
  }
  
  public void a(int x1, int y1, int z1, int x2, int y2, int z2)
  {
    b(x1 - 1, y1 - 1, z1 - 1, x2 + 1, y2 + 1, z2 + 1);
  }
  
  public void a(String p_174961_1_, cj p_174961_2_)
  {
    bpj var3 = (bpj)y.get(p_174961_2_);
    if (var3 != null)
    {
      h.W().b(var3);
      y.remove(p_174961_2_);
    }
    if (p_174961_1_ != null)
    {
      aak var4 = aak.b(p_174961_1_);
      if (var4 != null) {
        h.q.a(var4.g());
      }
      jy resource = null;
      if ((Reflector.ForgeItemRecord_getRecordResource.exists()) && (var4 != null)) {
        resource = (jy)Reflector.call(var4, Reflector.ForgeItemRecord_getRecordResource, new Object[] { p_174961_1_ });
      }
      if (resource == null) {
        resource = new jy(p_174961_1_);
      }
      bpf var5 = bpf.a(resource, p_174961_2_.n(), p_174961_2_.o(), p_174961_2_.p());
      
      y.put(p_174961_2_, var5);
      h.W().a(var5);
    }
  }
  
  public void a(String soundName, double x, double y, double z, float volume, float pitch) {}
  
  public void a(wn except, String soundName, double x, double y, double z, float volume, float pitch) {}
  
  public void a(int p_180442_1_, boolean p_180442_2_, final double p_180442_3_, double p_180442_5_, final double p_180442_7_, double p_180442_9_, double p_180442_11_, double p_180442_13_, int... p_180442_15_)
  {
    try
    {
      b(p_180442_1_, p_180442_2_, p_180442_3_, p_180442_5_, p_180442_7_, p_180442_9_, p_180442_11_, p_180442_13_, p_180442_15_);
    }
    catch (Throwable var19)
    {
      b var17 = b.a(var19, "Exception while adding particle");
      c var18 = var17.a("Particle being added");
      var18.a("ID", Integer.valueOf(p_180442_1_));
      if (p_180442_15_ != null) {
        var18.a("Parameters", p_180442_15_);
      }
      var18.a("Position", new Callable()
      {
        private static final String __OBFID = "CL_00000955";
        
        public String a()
          throws Exception
        {
          return c.a(p_180442_3_, p_180442_7_, val$p_180442_7_);
        }
      });
      throw new e(var17);
    }
  }
  
  private void a(cy p_174972_1_, double p_174972_2_, double p_174972_4_, double p_174972_6_, double p_174972_8_, double p_174972_10_, double p_174972_12_, int... p_174972_14_)
  {
    a(p_174972_1_.c(), p_174972_1_.e(), p_174972_2_, p_174972_4_, p_174972_6_, p_174972_8_, p_174972_10_, p_174972_12_, p_174972_14_);
  }
  
  private beb b(int p_174974_1_, boolean p_174974_2_, double p_174974_3_, double p_174974_5_, double p_174974_7_, double p_174974_9_, double p_174974_11_, double p_174974_13_, int... p_174974_15_)
  {
    if ((h != null) && (h.ac() != null) && (h.j != null))
    {
      int var16 = h.t.aL;
      if ((var16 == 1) && (k.s.nextInt(3) == 0)) {
        var16 = 2;
      }
      double var17 = h.ac().s - p_174974_3_;
      double var19 = h.ac().t - p_174974_5_;
      double var21 = h.ac().u - p_174974_7_;
      
      int id = p_174974_1_;
      if ((id == cy.c.c()) && (!Config.isAnimatedExplosion())) {
        return null;
      }
      if ((id == cy.b.c()) && (!Config.isAnimatedExplosion())) {
        return null;
      }
      if ((id == cy.a.c()) && (!Config.isAnimatedExplosion())) {
        return null;
      }
      if ((id == cy.h.c()) && (!Config.isWaterParticles())) {
        return null;
      }
      if ((id == cy.i.c()) && (!Config.isVoidParticles())) {
        return null;
      }
      if ((id == cy.l.c()) && (!Config.isAnimatedSmoke())) {
        return null;
      }
      if ((id == cy.m.c()) && (!Config.isAnimatedSmoke())) {
        return null;
      }
      if ((id == cy.p.c()) && (!Config.isPotionParticles())) {
        return null;
      }
      if ((id == cy.q.c()) && (!Config.isPotionParticles())) {
        return null;
      }
      if ((id == cy.n.c()) && (!Config.isPotionParticles())) {
        return null;
      }
      if ((id == cy.o.c()) && (!Config.isPotionParticles())) {
        return null;
      }
      if ((id == cy.r.c()) && (!Config.isPotionParticles())) {
        return null;
      }
      if ((id == cy.y.c()) && (!Config.isAnimatedPortal())) {
        return null;
      }
      if ((id == cy.A.c()) && (!Config.isAnimatedFlame())) {
        return null;
      }
      if ((id == cy.E.c()) && (!Config.isAnimatedRedstone())) {
        return null;
      }
      if ((id == cy.s.c()) && (!Config.isDrippingWaterLava())) {
        return null;
      }
      if ((id == cy.t.c()) && (!Config.isDrippingWaterLava())) {
        return null;
      }
      if ((id == cy.d.c()) && (!Config.isFireworkParticles())) {
        return null;
      }
      if (p_174974_2_) {
        return h.j.a(p_174974_1_, p_174974_3_, p_174974_5_, p_174974_7_, p_174974_9_, p_174974_11_, p_174974_13_, p_174974_15_);
      }
      double var23 = 16.0D;
      
      double maxDistSq = 256.0D;
      if (id == cy.j.c()) {
        maxDistSq = 38416.0D;
      }
      if (var17 * var17 + var19 * var19 + var21 * var21 > maxDistSq) {
        return null;
      }
      if (var16 > 1) {
        return null;
      }
      beb entityFx = h.j.a(p_174974_1_, p_174974_3_, p_174974_5_, p_174974_7_, p_174974_9_, p_174974_11_, p_174974_13_, p_174974_15_);
      if (id == cy.e.c()) {
        CustomColorizer.updateWaterFX(entityFx, k, p_174974_3_, p_174974_5_, p_174974_7_);
      }
      if (id == cy.f.c()) {
        CustomColorizer.updateWaterFX(entityFx, k, p_174974_3_, p_174974_5_, p_174974_7_);
      }
      if (id == cy.N.c()) {
        CustomColorizer.updateWaterFX(entityFx, k, p_174974_3_, p_174974_5_, p_174974_7_);
      }
      if (id == cy.w.c()) {
        CustomColorizer.updateMyceliumFX(entityFx);
      }
      if (id == cy.y.c()) {
        CustomColorizer.updatePortalFX(entityFx);
      }
      if (id == cy.E.c()) {
        CustomColorizer.updateReddustFX(entityFx, k, p_174974_3_, p_174974_5_, p_174974_7_);
      }
      return entityFx;
    }
    return null;
  }
  
  public void a(pk entityIn)
  {
    RandomMobs.entityLoaded(entityIn);
  }
  
  public void b(pk entityIn) {}
  
  public void k() {}
  
  public void a(int p_180440_1_, cj p_180440_2_, int p_180440_3_)
  {
    switch (p_180440_1_)
    {
    case 1013: 
    case 1018: 
      if (h.ac() != null)
      {
        double var4 = p_180440_2_.n() - h.ac().s;
        double var6 = p_180440_2_.o() - h.ac().t;
        double var8 = p_180440_2_.p() - h.ac().u;
        double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
        double var12 = h.ac().s;
        double var14 = h.ac().t;
        double var16 = h.ac().u;
        if (var10 > 0.0D)
        {
          var12 += var4 / var10 * 2.0D;
          var14 += var6 / var10 * 2.0D;
          var16 += var8 / var10 * 2.0D;
        }
        if (p_180440_1_ == 1013) {
          k.a(var12, var14, var16, "mob.wither.spawn", 1.0F, 1.0F, false);
        } else {
          k.a(var12, var14, var16, "mob.enderdragon.end", 5.0F, 1.0F, false);
        }
      }
      break;
    }
  }
  
  public void a(wn p_180439_1_, int p_180439_2_, cj p_180439_3_, int p_180439_4_)
  {
    Random var5 = k.s;
    double var9;
    double var11;
    double var32;
    double var7;
    int var13;
    int var18;
    switch (p_180439_2_)
    {
    case 1000: 
      k.a(p_180439_3_, "random.click", 1.0F, 1.0F, false);
      break;
    case 1001: 
      k.a(p_180439_3_, "random.click", 1.0F, 1.2F, false);
      break;
    case 1002: 
      k.a(p_180439_3_, "random.bow", 1.0F, 1.2F, false);
      break;
    case 1003: 
      k.a(p_180439_3_, "random.door_open", 1.0F, k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1004: 
      k.a(p_180439_3_, "random.fizz", 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);
      break;
    case 1005: 
      if ((zw.b(p_180439_4_) instanceof aak)) {
        k.a(p_180439_3_, "records." + ba);
      } else {
        k.a(p_180439_3_, (String)null);
      }
      break;
    case 1006: 
      k.a(p_180439_3_, "random.door_close", 1.0F, k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1007: 
      k.a(p_180439_3_, "mob.ghast.charge", 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1008: 
      k.a(p_180439_3_, "mob.ghast.fireball", 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1009: 
      k.a(p_180439_3_, "mob.ghast.fireball", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1010: 
      k.a(p_180439_3_, "mob.zombie.wood", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1011: 
      k.a(p_180439_3_, "mob.zombie.metal", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1012: 
      k.a(p_180439_3_, "mob.zombie.woodbreak", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1014: 
      k.a(p_180439_3_, "mob.wither.shoot", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1015: 
      k.a(p_180439_3_, "mob.bat.takeoff", 0.05F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1016: 
      k.a(p_180439_3_, "mob.zombie.infect", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1017: 
      k.a(p_180439_3_, "mob.zombie.unfect", 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
      break;
    case 1020: 
      k.a(p_180439_3_, "random.anvil_break", 1.0F, k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1021: 
      k.a(p_180439_3_, "random.anvil_use", 1.0F, k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 1022: 
      k.a(p_180439_3_, "random.anvil_land", 0.3F, k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 2000: 
      int var31 = p_180439_4_ % 3 - 1;
      int var8 = p_180439_4_ / 3 % 3 - 1;
      var9 = p_180439_3_.n() + var31 * 0.6D + 0.5D;
      var11 = p_180439_3_.o() + 0.5D;
      var32 = p_180439_3_.p() + var8 * 0.6D + 0.5D;
      for (int var33 = 0; var33 < 10; var33++)
      {
        double var34 = var5.nextDouble() * 0.2D + 0.01D;
        double var35 = var9 + var31 * 0.01D + (var5.nextDouble() - 0.5D) * var8 * 0.5D;
        double var20 = var11 + (var5.nextDouble() - 0.5D) * 0.5D;
        double var22 = var32 + var8 * 0.01D + (var5.nextDouble() - 0.5D) * var31 * 0.5D;
        double var24 = var31 * var34 + var5.nextGaussian() * 0.01D;
        double var26 = -0.03D + var5.nextGaussian() * 0.01D;
        double var28 = var8 * var34 + var5.nextGaussian() * 0.01D;
        a(cy.l, var35, var20, var22, var24, var26, var28, new int[0]);
      }
      return;
    case 2001: 
      afh var6 = afh.c(p_180439_4_ & 0xFFF);
      if (var6.t() != arm.a) {
        h.W().a(new bpf(new jy(H.a()), (H.d() + 1.0F) / 2.0F, H.e() * 0.8F, p_180439_3_.n() + 0.5F, p_180439_3_.o() + 0.5F, p_180439_3_.p() + 0.5F));
      }
      h.j.a(p_180439_3_, var6.a(p_180439_4_ >> 12 & 0xFF));
      break;
    case 2002: 
      var7 = p_180439_3_.n();
      var9 = p_180439_3_.o();
      var11 = p_180439_3_.p();
      for (var13 = 0; var13 < 8; var13++) {
        a(cy.K, var7, var9, var11, var5.nextGaussian() * 0.15D, var5.nextDouble() * 0.2D, var5.nextGaussian() * 0.15D, new int[] { zw.b(zy.bz), p_180439_4_ });
      }
      var13 = zy.bz.g(p_180439_4_);
      float var14 = (var13 >> 16 & 0xFF) / 255.0F;
      float var15 = (var13 >> 8 & 0xFF) / 255.0F;
      float var16 = (var13 >> 0 & 0xFF) / 255.0F;
      cy var17 = cy.n;
      if (zy.bz.h(p_180439_4_)) {
        var17 = cy.o;
      }
      for (var18 = 0; var18 < 100; var18++)
      {
        double var19 = var5.nextDouble() * 4.0D;
        double var21 = var5.nextDouble() * 3.141592653589793D * 2.0D;
        double var23 = Math.cos(var21) * var19;
        double var25 = 0.01D + var5.nextDouble() * 0.5D;
        double var27 = Math.sin(var21) * var19;
        beb var29 = b(var17.c(), var17.e(), var7 + var23 * 0.1D, var9 + 0.3D, var11 + var27 * 0.1D, var23, var25, var27, new int[0]);
        if (var29 != null)
        {
          float var30 = 0.75F + var5.nextFloat() * 0.25F;
          var29.b(var14 * var30, var15 * var30, var16 * var30);
          var29.a((float)var19);
        }
      }
      k.a(p_180439_3_, "game.potion.smash", 1.0F, k.s.nextFloat() * 0.1F + 0.9F, false);
      break;
    case 2003: 
      var7 = p_180439_3_.n() + 0.5D;
      var9 = p_180439_3_.o();
      var11 = p_180439_3_.p() + 0.5D;
      for (var13 = 0; var13 < 8; var13++) {
        a(cy.K, var7, var9, var11, var5.nextGaussian() * 0.15D, var5.nextDouble() * 0.2D, var5.nextGaussian() * 0.15D, new int[] { zw.b(zy.bH) });
      }
      for (var32 = 0.0D; var32 < 6.283185307179586D; var32 += 0.15707963267948966D)
      {
        a(cy.y, var7 + Math.cos(var32) * 5.0D, var9 - 0.4D, var11 + Math.sin(var32) * 5.0D, Math.cos(var32) * -5.0D, 0.0D, Math.sin(var32) * -5.0D, new int[0]);
        a(cy.y, var7 + Math.cos(var32) * 5.0D, var9 - 0.4D, var11 + Math.sin(var32) * 5.0D, Math.cos(var32) * -7.0D, 0.0D, Math.sin(var32) * -7.0D, new int[0]);
      }
      return;
    case 2004: 
      for (var18 = 0; var18 < 20; var18++)
      {
        double var19 = p_180439_3_.n() + 0.5D + (k.s.nextFloat() - 0.5D) * 2.0D;
        double var21 = p_180439_3_.o() + 0.5D + (k.s.nextFloat() - 0.5D) * 2.0D;
        double var23 = p_180439_3_.p() + 0.5D + (k.s.nextFloat() - 0.5D) * 2.0D;
        k.a(cy.l, var19, var21, var23, 0.0D, 0.0D, 0.0D, new int[0]);
        k.a(cy.A, var19, var21, var23, 0.0D, 0.0D, 0.0D, new int[0]);
      }
      return;
    case 2005: 
      ze.a(k, p_180439_3_, p_180439_4_);
    }
  }
  
  public void b(int breakerId, cj pos, int progress)
  {
    if ((progress >= 0) && (progress < 10))
    {
      kw var4 = (kw)x.get(Integer.valueOf(breakerId));
      if ((var4 == null) || (var4.b().n() != pos.n()) || (var4.b().o() != pos.o()) || (var4.b().p() != pos.p()))
      {
        var4 = new kw(breakerId, pos);
        x.put(Integer.valueOf(breakerId), var4);
      }
      var4.a(progress);
      var4.b(w);
    }
    else
    {
      x.remove(Integer.valueOf(breakerId));
    }
  }
  
  public void m()
  {
    ac = true;
  }
  
  public void resetClouds()
  {
    cloudRenderer.reset();
  }
  
  public int getCountRenderers()
  {
    return o.f.length;
  }
  
  public int getCountActiveRenderers()
  {
    return m.size();
  }
  
  public int getCountEntitiesRendered()
  {
    return S;
  }
  
  public int getCountTileEntitiesRendered()
  {
    return countTileEntitiesRendered;
  }
  
  public void a(Collection p_500148_1_, Collection p_500148_2_)
  {
    Set var3 = n;
    synchronized (n)
    {
      n.removeAll(p_500148_1_);
      n.addAll(p_500148_2_);
    }
  }
  
  class a
  {
    final bht a;
    final cq b;
    final Set c;
    final int d;
    private static final String __OBFID = "CL_00002534";
    
    private a(bht p_i46248_2_, cq p_i46248_3_, int p_i46248_4_)
    {
      c = EnumSet.noneOf(cq.class);
      a = p_i46248_2_;
      b = p_i46248_3_;
      d = p_i46248_4_;
    }
    
    a(bht p_i46249_2_, cq p_i46249_3_, int p_i46249_4_, Object p_i46249_5_)
    {
      this(p_i46249_2_, p_i46249_3_, p_i46249_4_);
    }
  }
}
