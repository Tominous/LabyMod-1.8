package de.labystudio.cosmetic;

import ave;
import avn;
import bbj;
import bct;
import bet;
import bfd;
import bfl;
import bfn;
import bfx;
import bgr.b;
import biu;
import bmj;
import bms;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.LeftHand;
import de.labystudio.utils.ModGui;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import jy;
import ns;
import org.lwjgl.opengl.GL11;
import pe;
import pk;
import pr;
import wn;
import zw;
import zx;

public class ModelCosmetics
  extends bbj
{
  HashMap<UUID, Long> wingState = new HashMap();
  private bct bipedDeadmau5Head;
  private bct bipedRabbitHead;
  bct wolfTail;
  private bct wing;
  private bct wingTip;
  bct ocelotTail;
  bct ocelotTail2;
  private bct[] witherBody;
  private bct[] witherHeads;
  private bct[] blazeSticks = new bct[12];
  private bct witchHat;
  private bct xmasHat;
  private bct horn;
  private bct halo;
  private static final HashMap<String, jy> flags = new HashMap();
  private static final jy enderDragonTextures = new jy("textures/entity/enderdragon/dragon.png");
  private static final jy blazeTexture = new jy("textures/entity/blaze.png");
  private static final jy witherTexture = new jy("textures/entity/wither/wither.png");
  private static final jy witchTexture = new jy("flags/default.png");
  private static final jy haloTexture = new jy("halo.png");
  private static final jy xmasTexture = new jy("xmas.png");
  
  public ModelCosmetics(float p_i46304_1_, boolean p_i46304_2_)
  {
    super(p_i46304_1_, 0.0F, 64, 64);
    
    this.bipedDeadmau5Head = new bct(this, 24, 0);
    this.bipedDeadmau5Head.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i46304_1_);
    this.bipedDeadmau5Head.k = true;
    this.bipedRabbitHead = new bct(this, 24, 0);
    this.bipedRabbitHead.a(-3.0F, -6.0F, -1.0F, 2, 6, 1, p_i46304_1_);
    this.bipedRabbitHead.k = true;
    this.horn = new bct(this, 24, 0);
    this.horn.a(-3.0F, -6.0F, -1.0F, 2, 4, 1, p_i46304_1_);
    this.horn.k = true;
    this.wolfTail = new bct(this, 56, 30);
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
    
    this.halo = new bct(this, 0, 0);
    this.halo.a(-3.0F, -6.0F, -1.0F, 6, 1, 1, p_i46304_1_);
    this.halo.k = true;
    
    this.witchHat = new bct(this).b(40, 34);
    this.witchHat.a(-5.0F, -10.03125F, -5.0F);
    this.witchHat.a(0, 0).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
    bct modelrenderer = new bct(this).b(40, 34);
    modelrenderer.a(1.75F, -4.0F, 2.0F);
    modelrenderer.a(0, 12).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
    modelrenderer.f = -0.05235988F;
    modelrenderer.h = 0.02617994F;
    this.witchHat.a(modelrenderer);
    bct modelrenderer1 = new bct(this).b(40, 34);
    modelrenderer1.a(1.75F, -4.0F, 2.0F);
    modelrenderer1.a(0, 23).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
    modelrenderer1.f = -0.10471976F;
    modelrenderer1.h = 0.05235988F;
    modelrenderer.a(modelrenderer1);
    bct modelrenderer2 = new bct(this).b(40, 34);
    modelrenderer2.a(1.75F, -2.0F, 2.0F);
    modelrenderer2.a(0, 31).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
    modelrenderer2.f = -0.20943952F;
    modelrenderer2.h = 0.10471976F;
    modelrenderer1.a(modelrenderer2);
    this.witchHat.k = true;
    
    this.xmasHat = new bct(this).b(40, 34);
    this.xmasHat.a(-5.0F, -10.03125F, -5.0F);
    this.xmasHat.a(0, 0).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
    
    bct xmasLayer2 = new bct(this).b(40, 34);
    xmasLayer2.a(4.0F, -2.7F, 4.0F);
    xmasLayer2.a(0, 12).a(-3.0F, 0.0F, -3.0F, 8, 3, 8);
    xmasLayer2.h = 0.1F;
    this.xmasHat.a(xmasLayer2);
    
    bct xmasLayer3 = new bct(this).b(40, 34);
    xmasLayer3.a(1.0F, -1.7F, 1.0F);
    xmasLayer3.a(0, 12).a(-3.0F, 0.0F, -3.0F, 6, 2, 6);
    xmasLayer3.h = 0.1F;
    xmasLayer2.a(xmasLayer3);
    
    bct xmasLayer4 = new bct(this).b(40, 34);
    xmasLayer4.a(1.0F, -2.0F, 0.0F);
    xmasLayer4.a(0, 12).a(-1.0F, 0.0F, -2.0F, 4, 4, 4);
    xmasLayer4.h = 0.6F;
    xmasLayer3.a(xmasLayer4);
    
    bct xmasLayer5 = new bct(this).b(40, 34);
    xmasLayer5.a(2.0F, -3.0F, 0.0F);
    xmasLayer5.a(0, 12).a(-2.0F, 1.4F, -1.5F, 3, 2, 3);
    xmasLayer5.h = 0.2F;
    xmasLayer4.a(xmasLayer5);
    
    bct xmasLayer6 = new bct(this).b(40, 34);
    xmasLayer6.a(0.0F, 0.0F, 0.0F);
    xmasLayer6.a(0, 12).a(-0.5F, 0.5F, -1.0F, 4, 2, 2);
    xmasLayer6.h = -0.4F;
    xmasLayer5.a(xmasLayer6);
    
    bct xmasLayer7 = new bct(this).b(40, 34);
    xmasLayer7.a(0.0F, 0.0F, 0.0F);
    xmasLayer7.a(0, 12).a(3.5F, -0.5F, -0.5F, 3, 1, 1);
    xmasLayer7.h = 0.8F;
    xmasLayer6.a(xmasLayer7);
    
    bct xmasLayer8 = new bct(this).b(40, 34);
    xmasLayer8.a(0.0F, 0.0F, 0.0F);
    xmasLayer8.a(0, 0).a(5.0F, -1.2F, -1.0F, 2, 2, 2);
    xmasLayer8.h = 0.05F;
    xmasLayer7.a(xmasLayer8);
    
    this.xmasHat.k = true;
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
    if (LeftHand.use(entityIn)) {
      bfl.a(-1.0F, 1.0F, 1.0F);
    }
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    if (ConfigManager.settings.cosmetics)
    {
      CosmeticUser cosmeticUser = LabyMod.getInstance().getCosmeticManager().getCosmeticUser(entityIn);
      if ((cosmeticUser != null) && (cosmeticUser.getCosmeticsData() != null) && (!cosmeticUser.getCosmeticsData().isEmpty()) && 
        ((entityIn instanceof bet)))
      {
        bet clientPlayer = (bet)entityIn;
        if ((clientPlayer != null) && (clientPlayer.i() != null) && (!clientPlayer.v()) && (!clientPlayer.a(pe.p)))
        {
          float partialTicks = LabyMod.getInstance().getPartialTicks();
          if ((ave.A().m != null) && (clientPlayer == ave.A().h)) {
            partialTicks = 1.0F;
          }
          float f = getFirstRotationX(clientPlayer, partialTicks);
          float f1 = getSecondRotationX(clientPlayer, partialTicks);
          
          jy tex = clientPlayer.i();
          Collection<Cosmetic> dataList = cosmeticUser.getCosmeticsData();
          for (Cosmetic cosmetic : dataList) {
            if (cosmetic != null)
            {
              ave.A().P().a(tex);
              bfl.c(1.0F, 1.0F, 1.0F);
              GL11.glColor3d(1.0D, 1.0D, 1.0D);
              bfl.G();
              if (cosmetic.getType() == EnumCosmetic.XMAS)
              {
                ave.A().P().a(xmasTexture);
                bfl.E();
                if (entityIn.av()) {
                  bfl.b(0.0D, 0.06D, 0.0D);
                }
                bfl.b(f, 0.0F, 1.0F, 0.0F);
                bfl.b(f1, 1.0F, 0.0F, 0.0F);
                
                bfl.a(0.95F, 0.95F, 0.95F);
                
                boolean emotions = (cosmetic.getData() != null) && (cosmetic.getData().equalsIgnoreCase("emotions"));
                if (emotions)
                {
                  bet entity = (bet)entityIn;
                  double d0 = entity.bq + (entity.bt - entity.bq) * partialTicks - (entity.p + (entity.s - entity.p) * partialTicks);
                  
                  double d1 = entity.br + (entity.bu - entity.br) * partialTicks - (entity.q + (entity.t - entity.q) * partialTicks);
                  
                  double d2 = entity.bs + (entity.bv - entity.bs) * partialTicks - (entity.r + (entity.u - entity.r) * partialTicks);
                  
                  float ft = entity.aJ + (entity.aI - entity.aJ) * partialTicks;
                  double d3 = ns.a(ft * 3.1415927F / 180.0F);
                  double d4 = -ns.b(ft * 3.1415927F / 180.0F);
                  float k1 = (float)d1 * 10.0F;
                  k1 = ns.a(k1, -40.0F, 12.0F);
                  float f2t = (float)(d0 * d3 + d2 * d4) * 100.0F;
                  float f3 = (float)(d0 * d4 - d2 * d3) * 100.0F;
                  
                  float zFloat = (90.0F - Math.abs(clientPlayer.z)) / 100.0F;
                  float walkFloat = f2t > 120.0F ? 120.0F : f2t;
                  float fallFloat = (float)(d1 / 3.0D > 0.7D ? -0.7D : -d1 / 3.0D);
                  float shakingFloat = (float)Math.cos(p_78088_4_ / 10.0F) / 40.0F;
                  float pitch = clientPlayer.z;
                  
                  wn entityplayer = entity;
                  float bf = entityplayer.M - entityplayer.L;
                  float bf1 = -(entityplayer.M + bf * partialTicks);
                  float bf2 = entityplayer.bn + (entityplayer.bo - entityplayer.bn) * partialTicks;
                  walkFloat += Math.abs(ns.b(bf1 * 3.1415927F - 0.2F) * bf2) * 70.0F;
                  
                  float centrifugalPoint = 0.0F;
                  if (entity == ave.A().h)
                  {
                    float speedValue = 3.0F / (ModGui.getRealFPS() + 1);
                    if (CosmeticTick.LOCAL_XMAS_FPS_VALUE < CosmeticTick.LOCAL_XMAS_TICK_VALUE) {
                      CosmeticTick.LOCAL_XMAS_FPS_VALUE += speedValue;
                    }
                    if (CosmeticTick.LOCAL_XMAS_FPS_VALUE > CosmeticTick.LOCAL_XMAS_TICK_VALUE) {
                      CosmeticTick.LOCAL_XMAS_FPS_VALUE -= speedValue;
                    }
                    float centrifugal = -CosmeticTick.LOCAL_XMAS_FPS_VALUE;
                    centrifugalPoint = centrifugal / -1.5F;
                    fallFloat += centrifugal;
                  }
                  bct ch1 = (bct)this.xmasHat.m.get(0);
                  bct ch2 = (bct)ch1.m.get(0);
                  ch2.g = (pitch / 300.0F - walkFloat / 200.0F);
                  ch2.h = (0.1F + fallFloat / 2.0F);
                  bct ch3 = (bct)ch2.m.get(0);
                  ch3.g = (pitch / 200.0F);
                  ch2.h = (0.1F + fallFloat / 4.0F);
                  bct ch4 = (bct)ch3.m.get(0);
                  ch4.g = (pitch / 100.0F - walkFloat / 100.0F);
                  bct ch5 = (bct)ch4.m.get(0);
                  ch5.h = fallFloat;
                  ch5.g = shakingFloat;
                  ch5.d = centrifugalPoint;
                  bct ch6 = (bct)ch5.m.get(0);
                  ch6.h = (zFloat - 0.3F);
                  ch6.d = (3.0F - zFloat * 4.0F);
                  bct ch7 = (bct)ch6.m.get(0);
                  ch7.h = (shakingFloat / -2.0F);
                  ch7.g = (shakingFloat / 4.0F);
                }
                this.xmasHat.k = false;
                this.xmasHat.a(scale);
                this.xmasHat.k = true;
                bfl.F();
              }
              if (cosmetic.getType() == EnumCosmetic.HALLOWEEN)
              {
                bfl.E();
                bfl.b(f, 0.0F, 1.0F, 0.0F);
                bfl.b(f1, 1.0F, 0.0F, 0.0F);
                bfl.a(0.8D, 0.8D, 0.8D);
                
                zx item = null;
                int positon = (int)cosmetic.a;
                int itemId = 0;
                switch (positon)
                {
                case 0: 
                  itemId = 258;
                  bfl.b(-120.0F, 0.0F, 0.0F, 1.0F);
                  bfl.b(40.0F, 0.0F, 1.0F, 0.0F);
                  bfl.b(0.4D, -0.4D, 0.3D);
                  break;
                case 1: 
                  itemId = 257;
                  bfl.b(-30.0F, 0.0F, 0.0F, 1.0F);
                  bfl.b(-30.0F, 0.0F, 1.0F, 0.0F);
                  bfl.b(0.2D, -0.8D, -0.22D);
                  break;
                case 2: 
                  itemId = 258;
                  bfl.b(70.0F, 0.0F, 0.0F, 1.0F);
                  bfl.b(-30.0F, 0.0F, 1.0F, 0.0F);
                  bfl.b(-0.3D, -0.7D, -0.02D);
                  break;
                case 3: 
                  itemId = 292;
                  bfl.b(-50.0F, 0.0F, 0.0F, 1.0F);
                  bfl.b(70.0F, 0.0F, 1.0F, 0.0F);
                  bfl.b(0.2D, -0.6D, 0.4D);
                  break;
                case 4: 
                  itemId = 262;
                  bfl.b(-180.0F, 0.0F, 0.0F, 1.0F);
                  bfl.b(-100.0F, 0.0F, 1.0F, 0.0F);
                  bfl.b(30.0F, 1.0F, 0.0F, 0.0F);
                  bfl.b(0.1D, 0.3D, -0.5D);
                  break;
                case 5: 
                  itemId = 262;
                  bfl.b(-50.0F, 0.0F, 0.0F, 1.0F);
                  bfl.b(0.1D, -0.1D, 0.0D);
                  bfl.b(-0.19D, -0.19D, 0.0D);
                  item = new zx(zw.b(itemId));
                  if ((item != null) && (item.b() != null)) {
                    ave.A().ah().a((pr)entityIn, item, bgr.b.g);
                  }
                  bfl.b(0.38D, 0.38D, 0.0D);
                }
                if (itemId != 0)
                {
                  if (item == null) {
                    item = new zx(zw.b(itemId));
                  }
                  if ((item != null) && (item.b() != null)) {
                    ave.A().ah().a((pr)entityIn, item, bgr.b.g);
                  }
                }
                bfl.F();
              }
              if ((cosmetic.getType() == EnumCosmetic.TAG) && (cosmetic.d != null))
              {
                String s = cosmetic.d;
                pk entity = entityIn;
                biu renderManager = ave.A().af();
                avn fontrenderer = ave.A().k;
                bfl.E();
                GL11.glNormal3f(0.0F, 1.0F, 0.0F);
                if (entityIn.av()) {
                  bfl.b(30.0F, 1.0F, 0.0F, 0.0F);
                }
                bfl.b(180.0F, 1.0F, 0.0F, 0.0F);
                bfl.a(-0.02666667F, -0.02666667F, 0.02666667F);
                bfl.a(0.2D, 0.2D, 0.2D);
                bfl.b(0.0F, 100.0F, -28.0F);
                bfl.f();
                bfl.a(false);
                bfl.l();
                bfl.x();
                bfl.a(770, 771, 1, 0);
                int i = fontrenderer.a(s) / 2;
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
              float anim;
              if (cosmetic.getType() == EnumCosmetic.HALO) {
                for (int i = 0; i < 4; i++)
                {
                  bfl.E();
                  
                  bfl.c(3.9F, 3.0F, 0.0F);
                  bfl.b(f, 0.0F, 1.0F, 0.0F);
                  
                  bfl.b(90 * i, 0.0F, 1.0F, 0.0F);
                  
                  float move = 0.2F;
                  switch (i)
                  {
                  case 0: 
                    bfl.b(0.0F, 0.0F, 0.01F - move);
                    break;
                  case 1: 
                    bfl.b(-0.19F + move, 0.0F, -0.19F);
                    break;
                  case 2: 
                    bfl.b(0.0F, 0.0F, -0.38F + move);
                    break;
                  case 3: 
                    bfl.b(0.19F - move, 0.0F, -0.19F);
                  }
                  ave.A().P().a(haloTexture);
                  
                  anim = p_78088_4_ / 10.0F;
                  anim = ns.b(anim);
                  anim *= 0.03F;
                  
                  bfl.b(0.0F, -0.4F - p_78088_3_ * 0.1F - anim, 0.0F);
                  this.halo.k = false;
                  this.halo.a(scale);
                  this.halo.k = true;
                  bfl.F();
                }
              }
              if (cosmetic.getType() == EnumCosmetic.TOOL)
              {
                bfl.E();
                if (entityIn.av()) {
                  bfl.b(30.0F, 1.0F, 0.0F, 0.0F);
                }
                bfl.a(0.8D, 0.8D, 0.8D);
                bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
                bfl.b(0.0D, 0.3D, -0.22D);
                zx item;
                zx item;
                if (cosmetic.getData() == null) {
                  item = ((bet)entityIn).bA();
                } else {
                  item = new zx(zw.b((int)cosmetic.b));
                }
                if ((item != null) && (item.b() != null)) {
                  ave.A().ah().a((pr)entityIn, item, bgr.b.g);
                }
                bfl.F();
              }
              jy bind;
              jy texture;
              if (cosmetic.getType() == EnumCosmetic.HAT)
              {
                bind = witchTexture;
                if ((cosmetic.d != null) && (!cosmetic.d.isEmpty()))
                {
                  if (!flags.containsKey(cosmetic.d)) {
                    flags.put(cosmetic.d, new jy("flags/" + cosmetic.d + ".png"));
                  }
                  texture = (jy)flags.get(cosmetic.d);
                  if (texture != null) {
                    bind = (jy)flags.get(cosmetic.d);
                  }
                }
                ave.A().P().a(bind);
                bfl.E();
                if (entityIn.av()) {
                  bfl.b(0.0D, 0.1D, 0.0D);
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
                bind = this.witherHeads;texture = bind.length;
                for (anim = 0; anim < texture; anim++)
                {
                  bct modelrenderer = bind[anim];
                  modelrenderer.k = false;
                  modelrenderer.a(scale);
                  modelrenderer.k = true;
                }
                ave.A().P().a(witherTexture);
                bind = this.witherBody;texture = bind.length;
                for (anim = 0; anim < texture; anim++)
                {
                  bct modelrenderer1 = bind[anim];
                  modelrenderer1.k = false;
                  modelrenderer1.a(scale);
                  modelrenderer1.k = true;
                }
              }
              if (cosmetic.getType() == EnumCosmetic.BLAZE)
              {
                float p_78087_3_ = p_78088_4_;
                float b = p_78087_3_ * 3.1415927F * -0.01F;
                for (int i = 0; i < 4; i++)
                {
                  this.blazeSticks[i].d = (-2.0F + ns.b(((float)(i * 1.5D) + p_78087_3_) * 0.2F));
                  this.blazeSticks[i].c = (ns.b(b) * 10.0F);
                  this.blazeSticks[i].e = (ns.a(b) * 10.0F);
                  b += 1.0F;
                }
                b = 0.7853982F + p_78087_3_ * 3.1415927F * 0.01F;
                for (int j = 4; j < 8; j++)
                {
                  this.blazeSticks[j].d = (2.0F + ns.b((j * 2 + p_78087_3_) * 0.2F));
                  this.blazeSticks[j].c = (ns.b(b) * 9.0F);
                  this.blazeSticks[j].e = (ns.a(b) * 9.0F);
                  b += 1.0F;
                }
                b = 0.47123894F + p_78087_3_ * 3.1415927F * -0.01F;
                for (int k = 8; k < 12; k++)
                {
                  this.blazeSticks[k].d = (11.0F + ns.b((k * 1.5F + p_78087_3_) * 0.5F));
                  this.blazeSticks[k].c = (ns.b(b) * 5.0F);
                  this.blazeSticks[k].e = (ns.a(b) * 5.0F);
                  b += 1.0F;
                }
                ave.A().P().a(blazeTexture);
                for (int i = 0; i < this.blazeSticks.length; i++)
                {
                  this.blazeSticks[i].k = false;
                  this.blazeSticks[i].a(scale);
                  this.blazeSticks[i].k = true;
                }
              }
              if (cosmetic.getType() == EnumCosmetic.DEADMAU5) {
                for (int i = 0; i < 2; i++)
                {
                  bfl.E();
                  bfl.b(f, 0.0F, 1.0F, 0.0F);
                  bfl.b(f1, 1.0F, 0.0F, 0.0F);
                  bfl.b(0.375F * (i * 2 - 1), 0.0F, 0.0F);
                  bfl.b(0.0F, -0.375F, 0.0F);
                  bfl.b(-f1, 1.0F, 0.0F, 0.0F);
                  bfl.b(-f, 0.0F, 1.0F, 0.0F);
                  float f2 = 1.3333334F;
                  bfl.a(f2, f2, f2);
                  this.bipedDeadmau5Head.k = false;
                  renderDeadmau5Head(0.0625F);
                  this.bipedDeadmau5Head.k = true;
                  bfl.F();
                }
              }
              if (cosmetic.getType() == EnumCosmetic.RABBIT)
              {
                boolean emotions = (cosmetic.getData() != null) && (cosmetic.getData().equalsIgnoreCase("emotions"));
                float b = f;
                for (int i = 0; i < 2; i++)
                {
                  bfl.E();
                  if (i == 0)
                  {
                    if (emotions) {
                      bfl.b((float)(Math.cos(p_78088_4_ / 40.0F) * 1.5D), 0.0F, 0.0F, 1.0F);
                    }
                    bfl.b(b, 0.0F, 1.0F, 0.0F);
                    bfl.b(f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(0.375F * (float)(i * 0.78D) + 0.02D, 0.0D, 0.0D);
                    bfl.b(0.0F, -0.375F, 0.0F);
                    bfl.b(-f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(-b, 0.0F, 1.0F, 0.0F);
                    this.bipedRabbitHead.f = this.e.f;
                    this.bipedRabbitHead.g = this.e.g;
                    this.bipedRabbitHead.h = this.e.h;
                    this.bipedRabbitHead.c = this.e.c;
                    this.bipedRabbitHead.d = this.e.d;
                    this.bipedRabbitHead.e = this.e.e;
                  }
                  else
                  {
                    if (emotions) {
                      bfl.b((float)(Math.cos(p_78088_4_ / 50.0F) * 2.5D), 0.0F, 0.0F, 1.0F);
                    }
                    b *= -1.0F;
                    bfl.a(-1.0F, 1.0F, 1.0F);
                    bfl.b(b, 0.0F, 1.0F, 0.0F);
                    bfl.b(f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(0.375F * (float)(i * 0.78D) + -0.276D, 0.0D, 0.0D);
                    bfl.b(0.0F, -0.375F, 0.0F);
                    bfl.b(-f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(-b, 0.0F, 1.0F, 0.0F);
                    this.bipedRabbitHead.f = this.e.f;
                    this.bipedRabbitHead.g = (-this.e.g);
                    this.bipedRabbitHead.h = this.e.h;
                    this.bipedRabbitHead.c = this.e.c;
                    this.bipedRabbitHead.d = this.e.d;
                    this.bipedRabbitHead.e = this.e.e;
                  }
                  float f2 = 1.3333334F;
                  bfl.a(f2, f2, f2);
                  this.bipedRabbitHead.c = 0.0F;
                  this.bipedRabbitHead.d = 0.0F;
                  if ((cosmeticUser.getEnumList().contains(EnumCosmetic.XMAS)) || (cosmeticUser.getEnumList().contains(EnumCosmetic.HAT)))
                  {
                    bfl.b(-20.0F, 0.0F, 0.0F, 1.0F);
                    bfl.b(0.0F, -0.1F, 0.0F);
                  }
                  if ((emotions) && (entityIn.av())) {
                    bfl.b(entityIn.z / 5.0F, 0.0F, 1.0F, 0.0F);
                  }
                  this.bipedRabbitHead.k = false;
                  this.bipedRabbitHead.a(0.0625F);
                  this.bipedRabbitHead.k = true;
                  bfl.F();
                }
              }
              if (cosmetic.getType() == EnumCosmetic.PIXELBIESTER) {
                for (int s = 0; s < 2; s++) {
                  for (int i = 0; i < 3; i++)
                  {
                    bfl.E();
                    bfl.b(f, 0.0F, 1.0F, 0.0F);
                    bfl.b(f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(0.0D, 0.0D, s == 0 ? -0.04D : 0.04D);
                    bfl.b(s == 0 ? 180 : 0, 0.0F, 1.0F, 0.0F);
                    switch (i)
                    {
                    case 0: 
                      bfl.b(0.03D, -0.3D, 0.0D);
                      bfl.b(-20.0F, 0.0F, 0.0F, 1.0F);
                      break;
                    case 1: 
                      bfl.b(-0.28D, -0.45D, -0.02D);
                      bfl.a(0.8D, 0.8D, 0.8D);
                      bfl.b(35.0F, 0.0F, 0.0F, 1.0F);
                      break;
                    case 2: 
                      bfl.b(-0.1D, -0.88D, -0.04D);
                      bfl.a(0.4D, 0.4D, 0.4D);
                      bfl.b(-55.0F, 0.0F, 0.0F, 1.0F);
                    }
                    float f2 = 1.3333334F;
                    bfl.a(f2, f2, f2);
                    this.horn.c = 0.0F;
                    this.horn.d = 0.0F;
                    this.horn.k = false;
                    this.horn.a(0.0625F);
                    this.horn.k = true;
                    bfl.F();
                  }
                }
              }
              if ((cosmetic.getType() == EnumCosmetic.CENSORED) && (cosmetic.d != null))
              {
                String s = cosmetic.d;
                pk entity = entityIn;
                biu renderManager = ave.A().af();
                avn fontrenderer = ave.A().k;
                bfl.E();
                GL11.glNormal3f(0.0F, 1.0F, 0.0F);
                if (entityIn.av()) {
                  bfl.b(0.0D, 0.06D, 0.0D);
                }
                bfl.b(f, 0.0F, 1.0F, 0.0F);
                bfl.b(f1, 1.0F, 0.0F, 0.0F);
                bfl.a(0.01D, 0.01D, 0.01D);
                bfl.b(0.0D, -21.5D, -29.0D);
                bfl.f();
                bfl.a(false);
                bfl.l();
                bfl.x();
                bfl.a(770, 771, 1, 0);
                int i = fontrenderer.a(s) / 2;
                bfl.w();
                bfl.a(true);
                bfl.j();
                fontrenderer.a(s, -fontrenderer.a(s) / 2, 0, -1);
                bfl.e();
                bfl.k();
                bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
                bfl.F();
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
                boolean flying = this.wingState.containsKey(entityIn.aK());
                boolean onGround = entityIn.C;
                if ((!onGround) || (flying)) {
                  var6 = 10.0F;
                }
                if ((!flying) && (!onGround)) {
                  this.wingState.put(entityIn.aK(), Long.valueOf(0L));
                }
                float b = p_78088_3_ + p_78088_4_ / var6;
                float f2 = p_78088_3_ + p_78088_4_ / 100.0F;
                
                float fs11 = b * 3.141593F * 2.0F;
                float temp1 = 0.125F - (float)Math.cos(fs11) * 0.2F;
                
                float fs112 = f2 * 3.141593F * 2.0F;
                float temp2 = 0.125F - (float)Math.cos(fs112) * 0.2F;
                if ((this.wingState.containsKey(entityIn.aK())) && ((int)(temp1 * 100.0F) == (int)(temp2 * 100.0F)) && (onGround))
                {
                  this.wingState.remove(entityIn.aK());
                  var6 = 100.0F;
                }
                ave.A().P().a(enderDragonTextures);
                bfl.a(0.0012D * (ConfigManager.settings.wingsScale + 75), 0.0012D * (ConfigManager.settings.wingsScale + 75), 0.0012D * (ConfigManager.settings.wingsScale + 75));
                
                bfl.b(0.0D, -0.3D, 1.1D);
                bfl.b(50.0F, -50.0F, 0.0F, 0.0F);
                
                boolean t = false;
                boolean w = false;
                if (cosmetic.getData() != null)
                {
                  bfl.c(1.0F, 1.0F, 1.0F);
                  GL11.glColor3d(cosmetic.a * 0.01D, cosmetic.b * 0.01D, cosmetic.c * 0.01D);
                  if ((cosmetic.a == -1.0D) && (cosmetic.b == -1.0D) && (cosmetic.c == -1.0D))
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
                  if ((cosmetic.a == -2.0D) && (cosmetic.b == -2.0D) && (cosmetic.c == -2.0D))
                  {
                    GL11.glColor3d(18.0D, 18.0D, 0.0D);
                    t = true;
                  }
                }
                bfl.b(0);
                bfl.b(1);
                for (int j = 0; j < 2; j++)
                {
                  bfl.o();
                  float f11 = b * 3.1415927F * 2.0F;
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
          bfl.c(1.0F, 1.0F, 1.0F);
          bfl.G();
        }
      }
    }
    if (LeftHand.use(entityIn)) {
      bfl.a(-1.0F, 1.0F, 1.0F);
    }
    bfl.F();
  }
  
  private float getFirstRotationX(bet clientPlayer, float partialTicks)
  {
    float f = interpolateRotation(clientPlayer.aJ, clientPlayer.aI, partialTicks);
    float f1 = interpolateRotation(clientPlayer.aL, clientPlayer.aK, partialTicks);
    float f2 = f1 - f;
    if ((clientPlayer.au()) && ((clientPlayer.m instanceof pr)))
    {
      pr entitylivingbase = (pr)clientPlayer.m;
      f = interpolateRotation(entitylivingbase.aJ, entitylivingbase.aI, partialTicks);
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
    return f2;
  }
  
  private float getSecondRotationX(bet clientPlayer, float partialTicks)
  {
    return clientPlayer.B + (clientPlayer.z - clientPlayer.B) * partialTicks;
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
  
  private float interpolateRotation(float par1, float par2, float par3)
  {
    for (float f = par2 - par1; f < -180.0F; f += 360.0F) {}
    while (f >= 180.0F) {
      f -= 360.0F;
    }
    return par1 + par3 * f;
  }
}
