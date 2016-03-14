package de.labystudio.cosmetic;

import ave;
import bbj;
import bct;
import bet;
import bfl;
import bmj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.labymod.Timings;
import de.labystudio.utils.LeftHand;
import java.util.ArrayList;
import jy;
import ns;
import org.lwjgl.opengl.GL11;
import pk;

public class ModelCosmetics
  extends bbj
{
  private bct bipedDeadmau5Head;
  bct wolfTail;
  private bct wing;
  private bct wingTip;
  bct ocelotTail;
  bct ocelotTail2;
  boolean keepFlying = false;
  private bct[] witherBody;
  private bct[] witherHeads;
  private bct[] blazeSticks = new bct[12];
  private bct witchHat;
  private static final jy enderDragonTextures = new jy("textures/entity/enderdragon/dragon.png");
  private static final jy blazeTexture = new jy("textures/entity/blaze.png");
  private static final jy witherTexture = new jy("textures/entity/wither/wither.png");
  
  public ModelCosmetics(float p_i46304_1_, boolean p_i46304_2_)
  {
    super(p_i46304_1_, 0.0F, 64, 64);
    
    this.bipedDeadmau5Head = new bct(this, 24, 0);
    this.bipedDeadmau5Head.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i46304_1_);
    this.wolfTail = new bct(this, 19, 18);
    this.wolfTail.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
    this.wolfTail.a(-0.2F, 10.0F, 3.0F);
    this.wolfTail.k = true;
    a("body.scale", 220, 53);
    a("body.body", 0, 0);
    a("wingtip.bone", 112, 136);
    a("wing.skin", -56, 88);
    a("wing.bone", 112, 88);
    a("wingtip.skin", -56, 144);
    int bw = this.t;
    int bh = this.u;
    this.t = 256;
    this.u = 256;
    this.wing = new bct(this, "wing");
    this.wing.a(-12.0F, 5.0F, 2.0F);
    this.wing.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
    this.wing.a("skin", -56.0F, 0.0F, 2.0F, 56, 1, 56);
    this.wing.k = true;
    this.wingTip = new bct(this, "wingtip");
    this.wingTip.a(-56.0F, 0.0F, 0.0F);
    this.wingTip.k = true;
    this.wingTip.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
    this.wingTip.a("skin", -56.0F, 0.0F, 2.0F, 56, 1, 56);
    this.wing.a(this.wingTip);
    this.t = bw;
    this.u = bh;
    this.ocelotTail = new bct(this, 58, 13);
    this.ocelotTail.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    this.ocelotTail.f = 0.9F;
    this.ocelotTail.a(0.0F, 15.0F, 8.0F);
    this.ocelotTail2 = new bct(this, 58, 15);
    this.ocelotTail2.a(-0.5F, 0.0F, 0.0F, 1, 6, 1);
    this.ocelotTail2.a(0.0F, 20.0F, 14.0F);
    this.ocelotTail.k = true;
    this.ocelotTail2.k = true;
    for (int i = 0; i < this.blazeSticks.length; i++)
    {
      this.blazeSticks[i] = new bct(this, 0, 16);
      this.blazeSticks[i].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      this.blazeSticks[i].k = true;
    }
    this.t = 64;
    this.u = 64;
    this.witherBody = new bct[2];
    this.witherBody[0] = new bct(this, 0, 16);
    this.witherBody[0].a(-10.0F, -1.9F, -0.5F, 20, 3, 3, p_i46304_1_);
    this.witherBody[0].k = true;
    this.witherBody[1] = new bct(this).b(this.t, this.u);
    this.witherBody[1].a(-2.0F, 6.9F, -0.5F);
    this.witherBody[1].k = true;
    
    this.witherHeads = new bct[2];
    this.witherHeads[0] = new bct(this, 3, 3);
    this.witherHeads[0].a(-4.0F, -11.0F, -4.0F, 6, 6, 6, p_i46304_1_);
    this.witherHeads[0].c = -8.0F;
    this.witherHeads[0].d = 4.0F;
    this.witherHeads[0].k = true;
    this.witherHeads[1] = new bct(this, 3, 3);
    this.witherHeads[1].a(-4.0F, -11.0F, -4.0F, 6, 6, 6, p_i46304_1_);
    this.witherHeads[1].c = 10.0F;
    this.witherHeads[1].d = 4.0F;
    this.witherHeads[1].k = true;
    this.t = bw;
    this.u = bh;
    
    this.witchHat = new bct(this).b(64, 128);
    this.witchHat.a(-5.0F, -10.03125F, -5.0F);
    this.witchHat.a(0, 64).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
    
    bct modelrenderer = new bct(this).b(64, 128);
    modelrenderer.a(1.75F, -4.0F, 2.0F);
    modelrenderer.a(0, 76).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
    modelrenderer.f = -0.05235988F;
    modelrenderer.h = 0.02617994F;
    this.witchHat.a(modelrenderer);
    bct modelrenderer1 = new bct(this).b(64, 128);
    modelrenderer1.a(1.75F, -4.0F, 2.0F);
    modelrenderer1.a(0, 87).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
    modelrenderer1.f = -0.10471976F;
    modelrenderer1.h = 0.05235988F;
    modelrenderer.a(modelrenderer1);
    bct modelrenderer2 = new bct(this).b(64, 128);
    modelrenderer2.a(1.75F, -2.0F, 2.0F);
    modelrenderer2.a(0, 95).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
    modelrenderer2.f = -0.20943952F;
    modelrenderer2.h = 0.10471976F;
    modelrenderer1.a(modelrenderer2);
  }
  
  public ModelCosmetics(float p_i46304_1_, float f, int i, int j)
  {
    this(p_i46304_1_, false);
  }
  
  public void a(pk entityIn, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float scale)
  {
    if (LeftHand.use(entityIn)) {
      bfl.a(-1.0F, 1.0F, 1.0F);
    }
    super.a(entityIn, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale);
    bfl.E();
    if (entityIn.av()) {
      bfl.b(0.0F, 0.2F, 0.0F);
    }
    if (ConfigManager.settings.cosmetics)
    {
      Timings.start("Cosmetic Renderer");
      ArrayList<Cosmetic> cosmetics = LabyMod.getInstance().getCosmeticManager().getCosmetic(entityIn);
      if ((cosmetics != null) && 
        ((entityIn instanceof bet)))
      {
        bet clientPlayer = (bet)entityIn;
        if ((clientPlayer != null) && (clientPlayer.i() != null))
        {
          jy tex = clientPlayer.i();
          for (Cosmetic cosmetic : cosmetics) {
            if (cosmetic != null)
            {
              ave.A().P().a(tex);
              GL11.glColor3d(1.0D, 1.0D, 1.0D);
              float partialTicks;
              float f;
              float f1;
              if (cosmetic.getType() == EnumCosmetic.HAT)
              {
                partialTicks = 0.7F;
                ave.A().P().a(new jy("textures/entity/witch.png"));
                f = clientPlayer.A + (clientPlayer.y - clientPlayer.A) * partialTicks - (clientPlayer.aJ + (clientPlayer.aI - clientPlayer.aJ) * partialTicks);
                f1 = clientPlayer.B + (clientPlayer.z - clientPlayer.B) * partialTicks;
                bfl.E();
                if (entityIn.av()) {
                  bfl.b(0.0D, 0.1D, 0.0D);
                }
                if (cosmetic.getData() != null)
                {
                  bfl.c(1.0F, 1.0F, 1.0F);
                  GL11.glColor3d(cosmetic.a, cosmetic.b, cosmetic.c);
                }
                bfl.b(f, 0.0F, 1.0F, 0.0F);
                bfl.b(f1, 1.0F, 0.0F, 0.0F);
                this.witchHat.k = false;
                this.witchHat.a(scale);
                this.witchHat.k = true;
                bfl.F();
              }
              if (cosmetic.getType() == EnumCosmetic.WITHER)
              {
                partialTicks = this.witherHeads;f = partialTicks.length;
                for (f1 = 0; f1 < f; f1++)
                {
                  bct modelrenderer = partialTicks[f1];
                  
                  modelrenderer.k = false;
                  modelrenderer.a(scale);
                  modelrenderer.k = true;
                }
                ave.A().P().a(witherTexture);
                partialTicks = this.witherBody;f = partialTicks.length;
                for (f1 = 0; f1 < f; f1++)
                {
                  bct modelrenderer1 = partialTicks[f1];
                  
                  modelrenderer1.k = false;
                  modelrenderer1.a(scale);
                  modelrenderer1.k = true;
                }
              }
              if (cosmetic.getType() == EnumCosmetic.BLAZE)
              {
                float p_78087_3_ = p_78088_4_;
                float f = p_78087_3_ * 3.1415927F * -0.01F;
                for (int i = 0; i < 4; i++)
                {
                  this.blazeSticks[i].d = (-2.0F + ns.b(((float)(i * 1.5D) + p_78087_3_) * 0.2F));
                  this.blazeSticks[i].c = (ns.b(f) * 10.0F);
                  this.blazeSticks[i].e = (ns.a(f) * 10.0F);
                  f += 1.0F;
                }
                f = 0.7853982F + p_78087_3_ * 3.1415927F * 0.01F;
                for (int j = 4; j < 8; j++)
                {
                  this.blazeSticks[j].d = (2.0F + ns.b((j * 2 + p_78087_3_) * 0.2F));
                  this.blazeSticks[j].c = (ns.b(f) * 9.0F);
                  this.blazeSticks[j].e = (ns.a(f) * 9.0F);
                  f += 1.0F;
                }
                f = 0.47123894F + p_78087_3_ * 3.1415927F * -0.01F;
                for (int k = 8; k < 12; k++)
                {
                  this.blazeSticks[k].d = (11.0F + ns.b((k * 1.5F + p_78087_3_) * 0.5F));
                  this.blazeSticks[k].c = (ns.b(f) * 5.0F);
                  this.blazeSticks[k].e = (ns.a(f) * 5.0F);
                  f += 1.0F;
                }
                ave.A().P().a(blazeTexture);
                if (cosmetic.getData() != null)
                {
                  bfl.c(1.0F, 1.0F, 1.0F);
                  GL11.glColor3d(cosmetic.a, cosmetic.b, cosmetic.c);
                }
                for (int i = 0; i < this.blazeSticks.length; i++)
                {
                  this.blazeSticks[i].k = false;
                  this.blazeSticks[i].a(scale);
                  this.blazeSticks[i].k = true;
                }
              }
              if (cosmetic.getType() == EnumCosmetic.DEADMAU5)
              {
                float partialTicks = 0.7F;
                for (int i = 0; i < 2; i++)
                {
                  float f = clientPlayer.A + (clientPlayer.y - clientPlayer.A) * partialTicks - (clientPlayer.aJ + (clientPlayer.aI - clientPlayer.aJ) * partialTicks);
                  float f1 = clientPlayer.B + (clientPlayer.z - clientPlayer.B) * partialTicks;
                  bfl.E();
                  bfl.b(f, 0.0F, 1.0F, 0.0F);
                  bfl.b(f1, 1.0F, 0.0F, 0.0F);
                  bfl.b(0.375F * (i * 2 - 1), 0.0F, 0.0F);
                  bfl.b(0.0F, -0.375F, 0.0F);
                  bfl.b(-f1, 1.0F, 0.0F, 0.0F);
                  bfl.b(-f, 0.0F, 1.0F, 0.0F);
                  float f2 = 1.3333334F;
                  bfl.a(f2, f2, f2);
                  renderDeadmau5Head(0.0625F);
                  bfl.F();
                }
              }
              if (cosmetic.getType() == EnumCosmetic.OCELOTTAIL)
              {
                this.ocelotTail.d = 15.0F;
                this.ocelotTail.e = 8.0F;
                this.ocelotTail2.d = 20.0F;
                this.ocelotTail2.e = 14.0F;
                this.ocelotTail.f = 0.9F;
                bfl.E();
                if (entityIn.av())
                {
                  bfl.b(0.0F, -0.35F, -0.33F);
                  this.ocelotTail.d += 1.0F;
                  this.ocelotTail2.d += -4.0F;
                  this.ocelotTail2.e += 2.0F;
                  this.ocelotTail.f = 1.5707964F;
                  this.ocelotTail2.f = 1.5707964F;
                }
                else if (entityIn.aw())
                {
                  bfl.b(0.0F, -0.2F, -0.61F);
                  this.ocelotTail2.d = this.ocelotTail.d;
                  this.ocelotTail2.e += 2.0F;
                  this.ocelotTail.f = 1.5707964F;
                  this.ocelotTail2.f = 1.5707964F;
                  this.ocelotTail2.f = (1.7278761F + 0.31415927F * ns.b(p_78088_2_) * p_78088_3_);
                }
                if ((entityIn.aw()) || (entityIn.av()))
                {
                  this.ocelotTail2.f = (1.7278761F + 0.47123894F * ns.b(p_78088_2_) * p_78088_3_);
                }
                else
                {
                  bfl.b(0.0F, -0.35F, -0.61F);
                  this.ocelotTail2.f = (1.7278761F + 0.7853982F * ns.b(p_78088_2_) * p_78088_3_);
                }
                this.ocelotTail.k = false;
                this.ocelotTail2.k = false;
                this.ocelotTail.a(scale);
                this.ocelotTail2.a(scale);
                this.ocelotTail.k = true;
                this.ocelotTail2.k = true;
                bfl.F();
              }
              if (cosmetic.getType() == EnumCosmetic.WOLFTAIL)
              {
                bfl.E();
                if (entityIn.av())
                {
                  bfl.b(0.0F, 0.2F, -0.25F);
                  bfl.b(45.0F, 45.0F, 0.0F, 0.0F);
                }
                else
                {
                  bfl.b(0.0F, 0.1F, -0.25F);
                  bfl.b(15.0F, 15.0F, 0.0F, 0.0F);
                }
                if ((cosmetic.getData() != null) && (cosmetic.getData().equalsIgnoreCase("emotions")))
                {
                  float health = clientPlayer.bn();
                  if (health > 20.0F) {
                    health = 20.0F;
                  }
                  if (health < 0.0F) {
                    health = 0.0F;
                  }
                  bfl.b(0.0F, health / 80.0F, health / 50.0F * -1.0F);
                  bfl.b(health * 2.0F, health * 2.0F, 0.0F, 0.0F);
                }
                this.wolfTail.k = false;
                this.wolfTail.b(scale);
                this.wolfTail.k = true;
                bfl.F();
              }
              if (cosmetic.getType() == EnumCosmetic.WINGS)
              {
                bfl.E();
                float var6 = 100.0F;
                if ((!entityIn.C) || (this.keepFlying))
                {
                  var6 = 10.0F;
                  this.keepFlying = true;
                }
                float f = p_78088_3_ + p_78088_4_ / var6;
                float f2 = p_78088_3_ + p_78088_4_ / 100.0F;
                
                float fs11 = f * 3.1415927F * 2.0F;
                float temp1 = 0.125F - (float)Math.cos(fs11) * 0.2F;
                
                float fs112 = f2 * 3.1415927F * 2.0F;
                float temp2 = 0.125F - (float)Math.cos(fs112) * 0.2F;
                if ((this.keepFlying) && ((int)(temp1 * 100.0F) == (int)(temp2 * 100.0F)))
                {
                  this.keepFlying = false;
                  var6 = 100.0F;
                }
                ave.A().P().a(enderDragonTextures);
                bfl.a(0.15D, 0.15D, 0.15D);
                bfl.b(0.0D, -0.3D, 1.1D);
                bfl.b(50.0F, -50.0F, 0.0F, 0.0F);
                
                boolean t = false;
                boolean w = false;
                if (cosmetic.getData() != null)
                {
                  bfl.c(1.0F, 1.0F, 1.0F);
                  GL11.glColor3d(cosmetic.a, cosmetic.b, cosmetic.c);
                  if ((cosmetic.a == -1.0F) && (cosmetic.b == -1.0F) && (cosmetic.c == -1.0F))
                  {
                    int wr = 600;
                    w = ave.J() % wr / (wr / 2) == 0L;
                    t = true;
                    if (w) {
                      GL11.glColor3d(18.0D, 0.0D, 0.0D);
                    } else {
                      GL11.glColor3d(0.0D, 0.0D, 18.0D);
                    }
                  }
                }
                bfl.b(0);
                bfl.b(1);
                for (int j = 0; j < 2; j++)
                {
                  bfl.o();
                  float f11 = f * 3.1415927F * 2.0F;
                  this.wing.f = (0.125F - (float)Math.cos(f11) * 0.2F);
                  this.wing.g = 0.25F;
                  this.wing.h = ((float)(Math.sin(f11) + 1.225D) * 0.3F);
                  this.wingTip.h = (-(float)(Math.sin(f11 + 2.0F) + 0.5D) * 0.75F);
                  this.wing.k = false;
                  this.wingTip.k = false;
                  this.wing.a(scale);
                  this.wing.k = true;
                  this.wingTip.k = true;
                  bfl.a(-1.0F, 1.0F, 1.0F);
                  if (j == 0)
                  {
                    bfl.e(1028);
                    if (t) {
                      if (w) {
                        GL11.glColor3d(0.0D, 0.0D, 18.0D);
                      } else {
                        GL11.glColor3d(18.0D, 0.0D, 0.0D);
                      }
                    }
                  }
                }
                bfl.a(0);
                bfl.a(1);
                
                bfl.e(1029);
                bfl.p();
                bfl.j();
                bfl.F();
              }
            }
          }
          ave.A().P().a(tex);
          GL11.glColor3d(1.0D, 1.0D, 1.0D);
        }
      }
      Timings.stop("Cosmetic Renderer");
    }
    bfl.F();
  }
  
  public void renderDeadmau5Head(float p_178727_1_)
  {
    a(this.e, this.bipedDeadmau5Head);
    this.bipedDeadmau5Head.c = 0.0F;
    this.bipedDeadmau5Head.d = 0.0F;
    this.bipedDeadmau5Head.a(p_178727_1_);
  }
  
  public void a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, pk entityIn)
  {
    super.a(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
    
    this.wolfTail.g = (ns.b(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
    this.wolfTail.f = p_78087_2_;
  }
  
  public void a(boolean invisible)
  {
    super.a(invisible);
    this.bipedDeadmau5Head.j = invisible;
    this.wolfTail.j = invisible;
    this.wing.j = invisible;
    this.wingTip.j = invisible;
    this.ocelotTail.j = invisible;
    this.ocelotTail2.j = invisible;
  }
}
