import com.google.common.collect.Lists;
import de.labystudio.cosmetic.Cosmetic;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.cosmetic.CosmeticUser;
import de.labystudio.cosmetic.EnumCosmetic;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.events.RenderNametagEvent;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.Color;
import de.labystudio.utils.FriendsLoader;
import de.labystudio.utils.LeftHand;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public abstract class bjl<T extends pr>
  extends biv<T>
{
  private static final Logger a = ;
  private static final blz e = new blz(16, 16);
  public bbo f;
  protected FloatBuffer g = avd.h(4);
  protected List<blb<T>> h = Lists.newArrayList();
  protected boolean i = false;
  
  public bjl(biu renderManagerIn, bbo modelBaseIn, float shadowSizeIn)
  {
    super(renderManagerIn);
    this.f = modelBaseIn;
    this.c = shadowSizeIn;
  }
  
  protected <V extends pr, U extends blb<V>> boolean a(U layer)
  {
    return this.h.add(layer);
  }
  
  protected <V extends pr, U extends blb<V>> boolean b(U layer)
  {
    return this.h.remove(layer);
  }
  
  public bbo b()
  {
    return this.f;
  }
  
  protected float a(float par1, float par2, float par3)
  {
    for (float f = par2 - par1; f < -180.0F; f += 360.0F) {}
    while (f >= 180.0F) {
      f -= 360.0F;
    }
    return par1 + par3 * f;
  }
  
  public void C_() {}
  
  public void a(T entity, double x, double y, double z, float entityYaw, float partialTicks)
  {
    bfl.E();
    bfl.p();
    this.f.p = d(entity, partialTicks);
    this.f.q = entity.au();
    this.f.r = entity.j_();
    try
    {
      float f = a(entity.aJ, entity.aI, partialTicks);
      float f1 = a(entity.aL, entity.aK, partialTicks);
      float f2 = f1 - f;
      if ((entity.au()) && ((entity.m instanceof pr)))
      {
        pr entitylivingbase = (pr)entity.m;
        f = a(entitylivingbase.aJ, entitylivingbase.aI, partialTicks);
        f2 = f1 - f;
        float f3 = ns.g(f2);
        if (f3 < -85.0F) {
          f3 = -85.0F;
        }
        if (f3 >= 85.0F) {
          f3 = 85.0F;
        }
        f = f1 - f3;
        if (f3 * f3 > 2500.0F) {
          f += f3 * 0.2F;
        }
      }
      float f7 = entity.B + (entity.z - entity.B) * partialTicks;
      a(entity, x, y, z);
      float f8 = b(entity, partialTicks);
      a(entity, f8, f, partialTicks);
      bfl.B();
      bfl.a(-1.0F, -1.0F, 1.0F);
      a(entity, partialTicks);
      float f4 = 0.0625F;
      bfl.b(0.0F, -1.5078125F, 0.0F);
      float f5 = entity.aA + (entity.aB - entity.aA) * partialTicks;
      float f6 = entity.aC - entity.aB * (1.0F - partialTicks);
      if (entity.j_()) {
        f6 *= 3.0F;
      }
      if (f5 > 1.0F) {
        f5 = 1.0F;
      }
      bfl.d();
      this.f.a(entity, f6, f5, partialTicks);
      this.f.a(f6, f5, f8, f2, f7, 0.0625F, entity);
      if (this.i)
      {
        boolean flag1 = c(entity);
        a(entity, f6, f5, f8, f2, f7, 0.0625F);
        if (flag1) {
          e();
        }
      }
      else
      {
        boolean flag = c(entity, partialTicks);
        a(entity, f6, f5, f8, f2, f7, 0.0625F);
        if (flag) {
          f();
        }
        bfl.a(true);
        if ((!(entity instanceof wn)) || (!((wn)entity).v())) {
          a(entity, f6, f5, partialTicks, f8, f2, f7, 0.0625F);
        }
      }
      bfl.C();
    }
    catch (Exception exception)
    {
      a.error("Couldn't render entity", exception);
    }
    bfl.g(bqs.r);
    bfl.w();
    bfl.g(bqs.q);
    bfl.o();
    bfl.F();
    if (!this.i) {
      super.a(entity, x, y, z, entityYaw, partialTicks);
    }
  }
  
  protected boolean c(T entityLivingBaseIn)
  {
    int i = 16777215;
    if ((entityLivingBaseIn instanceof wn))
    {
      aul scoreplayerteam = (aul)entityLivingBaseIn.bO();
      if (scoreplayerteam != null)
      {
        String s = avn.b(scoreplayerteam.e());
        if (s.length() >= 2) {
          i = c().b(s.charAt(1));
        }
      }
    }
    float f1 = (i >> 16 & 0xFF) / 255.0F;
    float f2 = (i >> 8 & 0xFF) / 255.0F;
    float f = (i & 0xFF) / 255.0F;
    bfl.f();
    bfl.g(bqs.q);
    bfl.c(f1, f2, f, 1.0F);
    bfl.x();
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
    return true;
  }
  
  protected void e()
  {
    bfl.e();
    bfl.g(bqs.q);
    bfl.w();
    bfl.g(bqs.r);
    bfl.w();
    bfl.g(bqs.q);
  }
  
  protected void a(T entitylivingbaseIn, float p_77036_2_, float p_77036_3_, float p_77036_4_, float p_77036_5_, float p_77036_6_, float p_77036_7_)
  {
    boolean flag = !entitylivingbaseIn.ax();
    boolean flag1 = (!flag) && (!entitylivingbaseIn.f(ave.A().h));
    if ((flag) || (flag1))
    {
      if (!c(entitylivingbaseIn)) {
        return;
      }
      if (flag1)
      {
        bfl.E();
        bfl.c(1.0F, 1.0F, 1.0F, 0.15F);
        bfl.a(false);
        bfl.l();
        bfl.b(770, 771);
        bfl.a(516, 0.003921569F);
      }
      this.f.a(entitylivingbaseIn, p_77036_2_, p_77036_3_, p_77036_4_, p_77036_5_, p_77036_6_, p_77036_7_);
      if (flag1)
      {
        bfl.k();
        bfl.a(516, 0.1F);
        bfl.F();
        bfl.a(true);
      }
    }
  }
  
  protected boolean c(T entityLivingBaseIn, float partialTicks)
  {
    return a(entityLivingBaseIn, partialTicks, true);
  }
  
  protected boolean a(T entitylivingbaseIn, float partialTicks, boolean combineTextures)
  {
    float f = entitylivingbaseIn.c(partialTicks);
    int i = a(entitylivingbaseIn, f, partialTicks);
    boolean flag = (i >> 24 & 0xFF) > 0;
    boolean flag1 = (entitylivingbaseIn.au > 0) || (entitylivingbaseIn.ax > 0);
    if ((!flag) && (!flag1)) {
      return false;
    }
    if ((!flag) && (!combineTextures)) {
      return false;
    }
    bfl.g(bqs.q);
    bfl.w();
    GL11.glTexEnvi(8960, 8704, bqs.t);
    GL11.glTexEnvi(8960, bqs.y, 8448);
    GL11.glTexEnvi(8960, bqs.z, bqs.q);
    GL11.glTexEnvi(8960, bqs.A, bqs.v);
    GL11.glTexEnvi(8960, bqs.C, 768);
    GL11.glTexEnvi(8960, bqs.D, 768);
    GL11.glTexEnvi(8960, bqs.F, 7681);
    GL11.glTexEnvi(8960, bqs.G, bqs.q);
    GL11.glTexEnvi(8960, bqs.J, 770);
    bfl.g(bqs.r);
    bfl.w();
    GL11.glTexEnvi(8960, 8704, bqs.t);
    GL11.glTexEnvi(8960, bqs.y, bqs.u);
    GL11.glTexEnvi(8960, bqs.z, bqs.w);
    GL11.glTexEnvi(8960, bqs.A, bqs.x);
    GL11.glTexEnvi(8960, bqs.B, bqs.w);
    GL11.glTexEnvi(8960, bqs.C, 768);
    GL11.glTexEnvi(8960, bqs.D, 768);
    GL11.glTexEnvi(8960, bqs.E, 770);
    GL11.glTexEnvi(8960, bqs.F, 7681);
    GL11.glTexEnvi(8960, bqs.G, bqs.x);
    GL11.glTexEnvi(8960, bqs.J, 770);
    this.g.position(0);
    if (flag1)
    {
      if (ConfigManager.settings.oldDMG)
      {
        this.g.put(f);
        this.g.put(0.0F);
        this.g.put(0.0F);
        this.g.put(0.2F);
      }
      else
      {
        this.g.put(1.0F);
        this.g.put(0.0F);
        this.g.put(0.0F);
        this.g.put(0.3F);
      }
    }
    else
    {
      float f1 = (i >> 24 & 0xFF) / 255.0F;
      float f2 = (i >> 16 & 0xFF) / 255.0F;
      float f3 = (i >> 8 & 0xFF) / 255.0F;
      float f4 = (i & 0xFF) / 255.0F;
      this.g.put(f2);
      this.g.put(f3);
      this.g.put(f4);
      this.g.put(1.0F - f1);
    }
    this.g.flip();
    GL11.glTexEnv(8960, 8705, this.g);
    bfl.g(bqs.s);
    bfl.w();
    bfl.i(e.b());
    GL11.glTexEnvi(8960, 8704, bqs.t);
    GL11.glTexEnvi(8960, bqs.y, 8448);
    GL11.glTexEnvi(8960, bqs.z, bqs.x);
    GL11.glTexEnvi(8960, bqs.A, bqs.r);
    GL11.glTexEnvi(8960, bqs.C, 768);
    GL11.glTexEnvi(8960, bqs.D, 768);
    GL11.glTexEnvi(8960, bqs.F, 7681);
    GL11.glTexEnvi(8960, bqs.G, bqs.x);
    GL11.glTexEnvi(8960, bqs.J, 770);
    bfl.g(bqs.q);
    return true;
  }
  
  protected void f()
  {
    bfl.g(bqs.q);
    bfl.w();
    GL11.glTexEnvi(8960, 8704, bqs.t);
    GL11.glTexEnvi(8960, bqs.y, 8448);
    GL11.glTexEnvi(8960, bqs.z, bqs.q);
    GL11.glTexEnvi(8960, bqs.A, bqs.v);
    GL11.glTexEnvi(8960, bqs.C, 768);
    GL11.glTexEnvi(8960, bqs.D, 768);
    GL11.glTexEnvi(8960, bqs.F, 8448);
    GL11.glTexEnvi(8960, bqs.G, bqs.q);
    GL11.glTexEnvi(8960, bqs.H, bqs.v);
    GL11.glTexEnvi(8960, bqs.J, 770);
    GL11.glTexEnvi(8960, bqs.K, 770);
    bfl.g(bqs.r);
    GL11.glTexEnvi(8960, 8704, bqs.t);
    GL11.glTexEnvi(8960, bqs.y, 8448);
    GL11.glTexEnvi(8960, bqs.C, 768);
    GL11.glTexEnvi(8960, bqs.D, 768);
    GL11.glTexEnvi(8960, bqs.z, 5890);
    GL11.glTexEnvi(8960, bqs.A, bqs.x);
    GL11.glTexEnvi(8960, bqs.F, 8448);
    GL11.glTexEnvi(8960, bqs.J, 770);
    GL11.glTexEnvi(8960, bqs.G, 5890);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.g(bqs.s);
    bfl.x();
    bfl.i(0);
    GL11.glTexEnvi(8960, 8704, bqs.t);
    GL11.glTexEnvi(8960, bqs.y, 8448);
    GL11.glTexEnvi(8960, bqs.C, 768);
    GL11.glTexEnvi(8960, bqs.D, 768);
    GL11.glTexEnvi(8960, bqs.z, 5890);
    GL11.glTexEnvi(8960, bqs.A, bqs.x);
    GL11.glTexEnvi(8960, bqs.F, 8448);
    GL11.glTexEnvi(8960, bqs.J, 770);
    GL11.glTexEnvi(8960, bqs.G, 5890);
    bfl.g(bqs.q);
  }
  
  protected void a(T entityLivingBaseIn, double x, double y, double z)
  {
    bfl.b((float)x, (float)y, (float)z);
  }
  
  protected void a(T bat, float p_77043_2_, float p_77043_3_, float partialTicks)
  {
    bfl.b(180.0F - p_77043_3_, 0.0F, 1.0F, 0.0F);
    if (bat.ax > 0)
    {
      float f = (bat.ax + partialTicks - 1.0F) / 20.0F * 1.6F;
      f = ns.c(f);
      if (f > 1.0F) {
        f = 1.0F;
      }
      bfl.b(f * b(bat), 0.0F, 0.0F, 1.0F);
    }
    else
    {
      String s = a.a(bat.e_());
      if ((s != null) && ((s.equals("Dinnerbone")) || (s.equals("Grumm"))) && ((!(bat instanceof wn)) || (((wn)bat).a(wo.a))))
      {
        bfl.b(0.0F, bat.K + 0.1F, 0.0F);
        bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
      }
    }
  }
  
  protected float d(T livingBase, float partialTickTime)
  {
    return livingBase.l(partialTickTime);
  }
  
  protected float b(T livingBase, float partialTicks)
  {
    return livingBase.W + partialTicks;
  }
  
  protected void a(T entitylivingbaseIn, float p_177093_2_, float p_177093_3_, float partialTicks, float p_177093_5_, float p_177093_6_, float p_177093_7_, float p_177093_8_)
  {
    for (blb<T> layerrenderer : this.h)
    {
      boolean var12 = layerrenderer.b();
      if ((ConfigManager.settings.oldDMG) && (Allowed.animations()) && 
        ((layerrenderer instanceof bkx))) {
        var12 = true;
      }
      if ((LeftHand.use(entitylivingbaseIn)) && ((layerrenderer instanceof bkp))) {
        bfl.a(-1.0F, 1.0F, 1.0F);
      }
      boolean flag = a(entitylivingbaseIn, partialTicks, var12);
      layerrenderer.a(entitylivingbaseIn, p_177093_2_, p_177093_3_, partialTicks, p_177093_5_, p_177093_6_, p_177093_7_, p_177093_8_);
      if (flag) {
        f();
      }
    }
  }
  
  protected float b(T entityLivingBaseIn)
  {
    return 90.0F;
  }
  
  protected int a(T entitylivingbaseIn, float lightBrightness, float partialTickTime)
  {
    return 0;
  }
  
  protected void a(T entitylivingbaseIn, float partialTickTime) {}
  
  public void b(T entity, double x, double y, double z)
  {
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new RenderNametagEvent(entity, x, y, z));
    }
    if (a(entity))
    {
      double d0 = entity.h(this.b.c);
      float f = entity.av() ? 32.0F : 64.0F;
      if (d0 < f * f)
      {
        String s = entity.f_().d();
        float f1 = 0.02666667F;
        bfl.a(516, 0.1F);
        
        boolean nick = false;
        String b = s;
        s = FriendsLoader.getNick(s, Color.removeColor(entity.e_()));
        nick = !b.equals(s);
        if (nick)
        {
          String tag = entity.f_().c().replace(Color.removeColor(entity.e_()), "");
          String t = "";
          if ((tag.startsWith(Color.c)) && (tag.length() >= 2)) {
            t = tag.substring(0, 2);
          }
          s = Color.cl("e") + "✎ " + Color.cl("f") + t + s;
        }
        if (entity.av())
        {
          avn fontrenderer = c();
          bfl.E();
          
          bfl.b((float)x, (float)y + entity.K + 0.5F - (entity
            .j_() ? entity.K / 2.0F : 0.0F) + LabyMod.getInstance().getCosmeticManager().getNameTagHeight(entity), (float)z);
          
          GL11.glNormal3f(0.0F, 1.0F, 0.0F);
          bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
          bfl.b(this.b.f, 1.0F, 0.0F, 0.0F);
          bfl.a(-0.02666667F, -0.02666667F, 0.02666667F);
          bfl.b(0.0F, 9.374999F, 0.0F);
          bfl.f();
          bfl.a(false);
          bfl.l();
          bfl.x();
          bfl.a(770, 771, 1, 0);
          int i = fontrenderer.a(s) / 2;
          bfx tessellator = bfx.a();
          bfd worldrenderer = tessellator.c();
          worldrenderer.a(7, bms.f);
          worldrenderer.b(-i - 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          worldrenderer.b(-i - 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          worldrenderer.b(i + 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          worldrenderer.b(i + 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          tessellator.b();
          bfl.w();
          bfl.a(true);
          fontrenderer.a(s, -fontrenderer.a(s) / 2, 0, 553648127);
          bfl.e();
          bfl.k();
          bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
          bfl.F();
        }
        else if (nick)
        {
          avn fontrenderer = c();
          bfl.E();
          bfl.b((float)x, (float)y + entity.K + 0.5F - (entity
            .j_() ? entity.K / 2.0F : 0.0F) + LabyMod.getInstance().getCosmeticManager().getNameTagHeight(entity), (float)z);
          
          GL11.glNormal3f(0.0F, 1.0F, 0.0F);
          bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
          bfl.b(this.b.f, 1.0F, 0.0F, 0.0F);
          bfl.a(-0.02666667F, -0.02666667F, 0.02666667F);
          bfl.f();
          bfl.a(false);
          bfl.l();
          bfl.x();
          bfl.a(770, 771, 1, 0);
          int i = fontrenderer.a(s) / 2;
          bfx tessellator = bfx.a();
          bfd worldrenderer = tessellator.c();
          worldrenderer.a(7, bms.f);
          worldrenderer.b(-i - 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          worldrenderer.b(-i - 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          worldrenderer.b(i + 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          worldrenderer.b(i + 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          tessellator.b();
          bfl.w();
          bfl.a(true);
          bfl.j();
          fontrenderer.a(s, -fontrenderer.a(s) / 2, 0, -1);
          bfl.e();
          bfl.k();
          bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
          bfl.F();
        }
        else
        {
          double height = LabyMod.getInstance().getCosmeticManager().getNameTagHeight(entity);
          a(entity, x, y - (entity.j_() ? entity.K / 2.0F : 0.0D) + height, z, s, 0.02666667F, d0);
          CosmeticUser user = LabyMod.getInstance().getCosmeticManager().getCosmeticUser(entity);
          if (user != null)
          {
            Cosmetic rankCosmetic = (Cosmetic)user.getCosmeticHashMap().get(EnumCosmetic.RANK);
            if (rankCosmetic != null)
            {
              double lh = 0.0D;
              lh += 0.25D;
              a(entity, x, y - (entity.j_() ? entity.K / 2.0F : 0.0D) + height + lh, z, rankCosmetic.d.replace("&", Color.c), 0.02666667F, d0);
            }
          }
        }
      }
    }
  }
  
  protected boolean a(T entity)
  {
    bew entityplayersp = ave.A().h;
    if (((entity instanceof wn)) && (entity != entityplayersp))
    {
      auq team = entity.bO();
      auq team1 = entityplayersp.bO();
      if (team != null)
      {
        auq.a team$enumvisible = team.i();
        switch (team$enumvisible)
        {
        case a: 
          return true;
        case b: 
          return false;
        case c: 
          return (team1 == null) || (team.a(team1));
        case d: 
          return (team1 == null) || (!team.a(team1));
        }
        return true;
      }
    }
    boolean check = entity != this.b.c;
    if (ConfigManager.settings.showMyName) {
      check = true;
    }
    return (ave.v()) && (check) && (!entity.f(entityplayersp)) && (entity.l == null);
  }
  
  public void a(boolean renderOutlinesIn)
  {
    this.i = renderOutlinesIn;
  }
  
  static
  {
    int[] aint = e.e();
    for (int i = 0; i < 256; i++) {
      aint[i] = -1;
    }
    e.d();
  }
}
