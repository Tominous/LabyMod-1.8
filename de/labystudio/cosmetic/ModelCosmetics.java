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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import jy;
import ns;
import org.lwjgl.opengl.GL11;
import pe;
import pk;
import pr;
import zw;
import zx;

public class ModelCosmetics
  extends bbj
{
  private bct bipedDeadmau5Head;
  private bct bipedRabbitHead;
  bct wolfTail;
  private bct wing;
  private bct wingTip;
  bct ocelotTail;
  bct ocelotTail2;
  HashMap<UUID, Long> wingState = new HashMap();
  private bct[] witherBody;
  private bct[] witherHeads;
  private bct[] blazeSticks = new bct[12];
  private bct witchHat;
  private bct horn;
  private bct halo;
  private static final jy enderDragonTextures = new jy("textures/entity/enderdragon/dragon.png");
  private static final jy blazeTexture = new jy("textures/entity/blaze.png");
  private static final jy witherTexture = new jy("textures/entity/wither/wither.png");
  private static final jy witchTexture = new jy("flags/default.png");
  private static final jy haloTexture = new jy("halo.png");
  private static final HashMap<String, jy> flags = new HashMap();
  
  public ModelCosmetics(float p_i46304_1_, boolean p_i46304_2_)
  {
    super(p_i46304_1_, 0.0F, 64, 64);
    
    bipedDeadmau5Head = new bct(this, 24, 0);
    bipedDeadmau5Head.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i46304_1_);
    bipedDeadmau5Head.k = true;
    bipedRabbitHead = new bct(this, 24, 0);
    bipedRabbitHead.a(-3.0F, -6.0F, -1.0F, 2, 6, 1, p_i46304_1_);
    bipedRabbitHead.k = true;
    horn = new bct(this, 24, 0);
    horn.a(-3.0F, -6.0F, -1.0F, 2, 4, 1, p_i46304_1_);
    horn.k = true;
    wolfTail = new bct(this, 56, 30);
    wolfTail.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
    wolfTail.a(-0.2F, 10.0F, 3.0F);
    wolfTail.k = true;
    a("body.scale", 220, 53);
    a("body.body", 0, 0);
    a("wingtip.bone", 112, 136);
    a("wing.skin", -56, 88);
    a("wing.bone", 112, 88);
    a("wingtip.skin", -56, 144);
    int bw = t;
    int bh = u;
    t = 256;
    u = 256;
    wing = new bct(this, "wing");
    wing.a(-12.0F, 5.0F, 2.0F);
    wing.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
    wing.a("skin", -56.0F, 0.0F, 2.0F, 56, 1, 56);
    wing.k = true;
    wingTip = new bct(this, "wingtip");
    wingTip.a(-56.0F, 0.0F, 0.0F);
    wingTip.k = true;
    wingTip.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
    wingTip.a("skin", -56.0F, 0.0F, 2.0F, 56, 1, 56);
    wing.a(wingTip);
    t = bw;
    u = bh;
    ocelotTail = new bct(this, 58, 13);
    ocelotTail.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    ocelotTail.f = 0.9F;
    ocelotTail.a(0.0F, 15.0F, 8.0F);
    ocelotTail2 = new bct(this, 58, 15);
    ocelotTail2.a(-0.5F, 0.0F, 0.0F, 1, 6, 1);
    ocelotTail2.a(0.0F, 20.0F, 14.0F);
    ocelotTail.k = true;
    ocelotTail2.k = true;
    for (int i = 0; i < blazeSticks.length; i++)
    {
      blazeSticks[i] = new bct(this, 0, 16);
      blazeSticks[i].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      blazeSticks[i].k = true;
    }
    t = 64;
    u = 64;
    witherBody = new bct[2];
    witherBody[0] = new bct(this, 0, 16);
    witherBody[0].a(-10.0F, -1.9F, -0.5F, 20, 3, 3, p_i46304_1_);
    witherBody[0].k = true;
    witherBody[1] = new bct(this).b(t, u);
    witherBody[1].a(-2.0F, 6.9F, -0.5F);
    witherBody[1].k = true;
    
    witherHeads = new bct[2];
    witherHeads[0] = new bct(this, 3, 3);
    witherHeads[0].a(-4.0F, -11.0F, -4.0F, 6, 6, 6, p_i46304_1_);
    witherHeads[0].c = -8.0F;
    witherHeads[0].d = 4.0F;
    witherHeads[0].k = true;
    witherHeads[1] = new bct(this, 3, 3);
    witherHeads[1].a(-4.0F, -11.0F, -4.0F, 6, 6, 6, p_i46304_1_);
    witherHeads[1].c = 10.0F;
    witherHeads[1].d = 4.0F;
    witherHeads[1].k = true;
    t = bw;
    u = bh;
    
    witchHat = new bct(this).b(40, 34);
    witchHat.a(-5.0F, -10.03125F, -5.0F);
    witchHat.a(0, 0).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
    
    halo = new bct(this, 0, 0);
    halo.a(-3.0F, -6.0F, -1.0F, 6, 1, 1, p_i46304_1_);
    halo.k = true;
    
    bct modelrenderer = new bct(this).b(40, 34);
    modelrenderer.a(1.75F, -4.0F, 2.0F);
    modelrenderer.a(0, 12).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
    f = -0.05235988F;
    h = 0.02617994F;
    witchHat.a(modelrenderer);
    bct modelrenderer1 = new bct(this).b(40, 34);
    modelrenderer1.a(1.75F, -4.0F, 2.0F);
    modelrenderer1.a(0, 23).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
    f = -0.10471976F;
    h = 0.05235988F;
    modelrenderer.a(modelrenderer1);
    bct modelrenderer2 = new bct(this).b(40, 34);
    modelrenderer2.a(1.75F, -2.0F, 2.0F);
    modelrenderer2.a(0, 31).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
    f = -0.20943952F;
    h = 0.10471976F;
    modelrenderer1.a(modelrenderer2);
    witchHat.k = true;
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
    if (settingscosmetics)
    {
      ArrayList<Cosmetic> cosmetics = LabyMod.getInstance().getCosmeticManager().getCosmetic(entityIn);
      if ((cosmetics != null) && 
        ((entityIn instanceof bet)))
      {
        bet clientPlayer = (bet)entityIn;
        if ((clientPlayer != null) && (clientPlayer.i() != null) && (!clientPlayer.v()) && (!clientPlayer.a(pe.p)))
        {
          float partialTicks = Am == null ? LabyMod.getInstance().getPartialTicks() : 1.0F;
          jy tex = clientPlayer.i();
          for (Cosmetic cosmetic : cosmetics) {
            if (cosmetic != null)
            {
              ave.A().P().a(tex);
              bfl.c(1.0F, 1.0F, 1.0F);
              GL11.glColor3d(1.0D, 1.0D, 1.0D);
              bfl.G();
              if (cosmetic.getType() == EnumCosmetic.HALLOWEEN)
              {
                bfl.E();
                
                float f = aL + (aK - aL) * partialTicks - (aJ + (aI - aJ) * partialTicks);
                
                float f1 = B + (z - B) * partialTicks;
                
                bfl.b(f, 0.0F, 1.0F, 0.0F);
                bfl.b(f1, 1.0F, 0.0F, 0.0F);
                bfl.a(0.8D, 0.8D, 0.8D);
                
                zx item = null;
                int positon = (int)a;
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
              if ((cosmetic.getType() == EnumCosmetic.TAG) && (d != null))
              {
                String s = d;
                pk entity = entityIn;
                biu renderManager = ave.A().af();
                avn fontrenderer = Ak;
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
              if (cosmetic.getType() == EnumCosmetic.HALO) {
                for (int i = 0; i < 4; i++)
                {
                  float f = aL + (aK - aL) * partialTicks - (aJ + (aI - aJ) * partialTicks);
                  
                  float f1 = B + (z - B) * partialTicks;
                  
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
                  
                  float anim = p_78088_4_ / 10.0F;
                  anim = ns.b(anim);
                  anim *= 0.03F;
                  
                  bfl.b(0.0F, -0.4F - p_78088_3_ * 0.1F - anim, 0.0F);
                  halo.k = false;
                  halo.a(scale);
                  halo.k = true;
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
                  item = new zx(zw.b((int)b));
                }
                if ((item != null) && (item.b() != null)) {
                  ave.A().ah().a((pr)entityIn, item, bgr.b.g);
                }
                bfl.F();
              }
              jy bind;
              float f;
              float f1;
              if (cosmetic.getType() == EnumCosmetic.HAT)
              {
                bind = witchTexture;
                if ((d != null) && (!d.isEmpty()))
                {
                  if (!flags.containsKey(d)) {
                    flags.put(d, new jy("flags/" + d + ".png"));
                  }
                  jy texture = (jy)flags.get(d);
                  if (texture != null) {
                    bind = (jy)flags.get(d);
                  }
                }
                ave.A().P().a(bind);
                
                f = aL + (aK - aL) * partialTicks - (aJ + (aI - aJ) * partialTicks);
                
                f1 = B + (z - B) * partialTicks;
                
                bfl.E();
                if (entityIn.av()) {
                  bfl.b(0.0D, 0.1D, 0.0D);
                }
                bfl.b(f, 0.0F, 1.0F, 0.0F);
                bfl.b(f1, 1.0F, 0.0F, 0.0F);
                witchHat.k = false;
                witchHat.a(scale);
                witchHat.k = true;
                
                bfl.F();
              }
              if (cosmetic.getType() == EnumCosmetic.WITHER)
              {
                bind = witherHeads;f = bind.length;
                for (f1 = 0; f1 < f; f1++)
                {
                  bct modelrenderer = bind[f1];
                  
                  k = false;
                  modelrenderer.a(scale);
                  k = true;
                }
                ave.A().P().a(witherTexture);
                bind = witherBody;f = bind.length;
                for (f1 = 0; f1 < f; f1++)
                {
                  bct modelrenderer1 = bind[f1];
                  
                  k = false;
                  modelrenderer1.a(scale);
                  k = true;
                }
              }
              if (cosmetic.getType() == EnumCosmetic.BLAZE)
              {
                float p_78087_3_ = p_78088_4_;
                float f = p_78087_3_ * 3.1415927F * -0.01F;
                for (int i = 0; i < 4; i++)
                {
                  blazeSticks[i].d = (-2.0F + ns.b(((float)(i * 1.5D) + p_78087_3_) * 0.2F));
                  blazeSticks[i].c = (ns.b(f) * 10.0F);
                  blazeSticks[i].e = (ns.a(f) * 10.0F);
                  f += 1.0F;
                }
                f = 0.7853982F + p_78087_3_ * 3.1415927F * 0.01F;
                for (int j = 4; j < 8; j++)
                {
                  blazeSticks[j].d = (2.0F + ns.b((j * 2 + p_78087_3_) * 0.2F));
                  blazeSticks[j].c = (ns.b(f) * 9.0F);
                  blazeSticks[j].e = (ns.a(f) * 9.0F);
                  f += 1.0F;
                }
                f = 0.47123894F + p_78087_3_ * 3.1415927F * -0.01F;
                for (int k = 8; k < 12; k++)
                {
                  blazeSticks[k].d = (11.0F + ns.b((k * 1.5F + p_78087_3_) * 0.5F));
                  blazeSticks[k].c = (ns.b(f) * 5.0F);
                  blazeSticks[k].e = (ns.a(f) * 5.0F);
                  f += 1.0F;
                }
                ave.A().P().a(blazeTexture);
                for (int i = 0; i < blazeSticks.length; i++)
                {
                  blazeSticks[i].k = false;
                  blazeSticks[i].a(scale);
                  blazeSticks[i].k = true;
                }
              }
              if (cosmetic.getType() == EnumCosmetic.DEADMAU5) {
                for (int i = 0; i < 2; i++)
                {
                  float f = aL + (aK - aL) * partialTicks - (aJ + (aI - aJ) * partialTicks);
                  
                  float f1 = B + (z - B) * partialTicks;
                  bfl.E();
                  bfl.b(f, 0.0F, 1.0F, 0.0F);
                  bfl.b(f1, 1.0F, 0.0F, 0.0F);
                  bfl.b(0.375F * (i * 2 - 1), 0.0F, 0.0F);
                  bfl.b(0.0F, -0.375F, 0.0F);
                  bfl.b(-f1, 1.0F, 0.0F, 0.0F);
                  bfl.b(-f, 0.0F, 1.0F, 0.0F);
                  float f2 = 1.3333334F;
                  bfl.a(f2, f2, f2);
                  bipedDeadmau5Head.k = false;
                  renderDeadmau5Head(0.0625F);
                  bipedDeadmau5Head.k = true;
                  bfl.F();
                }
              }
              if (cosmetic.getType() == EnumCosmetic.RABBIT)
              {
                float f = aL + (aK - aL) * partialTicks - (aJ + (aI - aJ) * partialTicks);
                
                float f1 = B + (z - B) * partialTicks;
                boolean emotions = (cosmetic.getData() != null) && (cosmetic.getData().equalsIgnoreCase("emotions"));
                for (int i = 0; i < 2; i++)
                {
                  bfl.E();
                  if (i == 0)
                  {
                    if (emotions) {
                      bfl.b((float)(Math.cos(p_78088_4_ / 40.0F) * 1.5D), 0.0F, 0.0F, 1.0F);
                    }
                    bfl.b(f, 0.0F, 1.0F, 0.0F);
                    bfl.b(f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(0.375F * (float)(i * 0.78D) + 0.02D, 0.0D, 0.0D);
                    bfl.b(0.0F, -0.375F, 0.0F);
                    bfl.b(-f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(-f, 0.0F, 1.0F, 0.0F);
                    bipedRabbitHead.f = e.f;
                    bipedRabbitHead.g = e.g;
                    bipedRabbitHead.h = e.h;
                    bipedRabbitHead.c = e.c;
                    bipedRabbitHead.d = e.d;
                    bipedRabbitHead.e = e.e;
                  }
                  else
                  {
                    if (emotions) {
                      bfl.b((float)(Math.cos(p_78088_4_ / 50.0F) * 2.5D), 0.0F, 0.0F, 1.0F);
                    }
                    f *= -1.0F;
                    bfl.a(-1.0F, 1.0F, 1.0F);
                    bfl.b(f, 0.0F, 1.0F, 0.0F);
                    bfl.b(f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(0.375F * (float)(i * 0.78D) + -0.276D, 0.0D, 0.0D);
                    bfl.b(0.0F, -0.375F, 0.0F);
                    bfl.b(-f1, 1.0F, 0.0F, 0.0F);
                    bfl.b(-f, 0.0F, 1.0F, 0.0F);
                    bipedRabbitHead.f = e.f;
                    bipedRabbitHead.g = (-e.g);
                    bipedRabbitHead.h = e.h;
                    bipedRabbitHead.c = e.c;
                    bipedRabbitHead.d = e.d;
                    bipedRabbitHead.e = e.e;
                  }
                  float f2 = 1.3333334F;
                  bfl.a(f2, f2, f2);
                  bipedRabbitHead.c = 0.0F;
                  bipedRabbitHead.d = 0.0F;
                  if ((emotions) && (entityIn.av())) {
                    bfl.b(z / 5.0F, 0.0F, 1.0F, 0.0F);
                  }
                  bipedRabbitHead.k = false;
                  bipedRabbitHead.a(0.0625F);
                  bipedRabbitHead.k = true;
                  bfl.F();
                }
              }
              if (cosmetic.getType() == EnumCosmetic.PIXELBIESTER)
              {
                float f = aL + (aK - aL) * partialTicks - (aJ + (aI - aJ) * partialTicks);
                
                float f1 = B + (z - B) * partialTicks;
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
                    horn.c = 0.0F;
                    horn.d = 0.0F;
                    horn.k = false;
                    horn.a(0.0625F);
                    horn.k = true;
                    bfl.F();
                  }
                }
              }
              if ((cosmetic.getType() == EnumCosmetic.CENSORED) && (d != null))
              {
                float f = aL + (aK - aL) * partialTicks - (aJ + (aI - aJ) * partialTicks);
                
                float f1 = B + (z - B) * partialTicks;
                String s = d;
                pk entity = entityIn;
                biu renderManager = ave.A().af();
                avn fontrenderer = Ak;
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
                ocelotTail.d = 15.0F;
                ocelotTail.e = 8.0F;
                ocelotTail2.d = 20.0F;
                ocelotTail2.e = 14.0F;
                ocelotTail.f = 0.9F;
                bfl.E();
                if (entityIn.av())
                {
                  bfl.b(0.0F, -0.35F, -0.33F);
                  ocelotTail.d += 1.0F;
                  ocelotTail2.d += -4.0F;
                  ocelotTail2.e += 2.0F;
                  ocelotTail.f = 1.5707964F;
                  ocelotTail2.f = 1.5707964F;
                }
                else if (entityIn.aw())
                {
                  bfl.b(0.0F, -0.2F, -0.61F);
                  ocelotTail2.d = ocelotTail.d;
                  ocelotTail2.e += 2.0F;
                  ocelotTail.f = 1.5707964F;
                  ocelotTail2.f = 1.5707964F;
                  ocelotTail2.f = (1.7278761F + 0.31415927F * ns.b(p_78088_2_) * p_78088_3_);
                }
                if ((entityIn.aw()) || (entityIn.av()))
                {
                  ocelotTail2.f = (1.7278761F + 0.47123894F * ns.b(p_78088_2_) * p_78088_3_);
                }
                else
                {
                  bfl.b(0.0F, -0.35F, -0.61F);
                  ocelotTail2.f = (1.7278761F + 0.7853982F * ns.b(p_78088_2_) * p_78088_3_);
                }
                ocelotTail.k = false;
                ocelotTail2.k = false;
                ocelotTail.a(scale);
                ocelotTail2.a(scale);
                ocelotTail.k = true;
                ocelotTail2.k = true;
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
                wolfTail.k = false;
                wolfTail.b(scale);
                wolfTail.k = true;
                bfl.F();
              }
              if (cosmetic.getType() == EnumCosmetic.WINGS)
              {
                bfl.E();
                float var6 = 100.0F;
                boolean flying = wingState.containsKey(entityIn.aK());
                boolean onGround = C;
                if ((!onGround) || (flying)) {
                  var6 = 10.0F;
                }
                if ((!flying) && (!onGround)) {
                  wingState.put(entityIn.aK(), Long.valueOf(0L));
                }
                float f = p_78088_3_ + p_78088_4_ / var6;
                float f2 = p_78088_3_ + p_78088_4_ / 100.0F;
                
                float fs11 = f * 3.141593F * 2.0F;
                float temp1 = 0.125F - (float)Math.cos(fs11) * 0.2F;
                
                float fs112 = f2 * 3.141593F * 2.0F;
                float temp2 = 0.125F - (float)Math.cos(fs112) * 0.2F;
                if ((wingState.containsKey(entityIn.aK())) && ((int)(temp1 * 100.0F) == (int)(temp2 * 100.0F)) && (onGround))
                {
                  wingState.remove(entityIn.aK());
                  var6 = 100.0F;
                }
                ave.A().P().a(enderDragonTextures);
                bfl.a(0.0012D * (settingswingsScale + 75), 0.0012D * (settingswingsScale + 75), 0.0012D * (settingswingsScale + 75));
                
                bfl.b(0.0D, -0.3D, 1.1D);
                bfl.b(50.0F, -50.0F, 0.0F, 0.0F);
                
                boolean t = false;
                boolean w = false;
                if (cosmetic.getData() != null)
                {
                  bfl.c(1.0F, 1.0F, 1.0F);
                  GL11.glColor3d(a * 0.01D, b * 0.01D, c * 0.01D);
                  if ((a == -1.0D) && (b == -1.0D) && (c == -1.0D))
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
                  if ((a == -2.0D) && (b == -2.0D) && (c == -2.0D))
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
                  float f11 = f * 3.1415927F * 2.0F;
                  wing.f = (0.125F - (float)Math.cos(f11) * 0.2F);
                  wing.g = 0.25F;
                  wing.h = ((float)(Math.sin(f11) + 1.225D) * 0.3F);
                  wingTip.h = (-(float)(Math.sin(f11 + 2.0F) + 0.5D) * 0.75F);
                  wing.k = false;
                  wingTip.k = false;
                  wing.a(scale);
                  wing.k = true;
                  wingTip.k = true;
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
    }
    if (LeftHand.use(entityIn)) {
      bfl.a(-1.0F, 1.0F, 1.0F);
    }
    bfl.F();
  }
  
  public void renderDeadmau5Head(float p_178727_1_)
  {
    a(e, bipedDeadmau5Head);
    bipedDeadmau5Head.c = 0.0F;
    bipedDeadmau5Head.d = 0.0F;
    bipedDeadmau5Head.a(p_178727_1_);
  }
  
  public void a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, pk entityIn)
  {
    super.a(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
    
    wolfTail.g = (ns.b(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
    wolfTail.f = p_78087_2_;
  }
  
  public void a(boolean invisible)
  {
    super.a(invisible);
    bipedDeadmau5Head.j = invisible;
    wolfTail.j = invisible;
    wing.j = invisible;
    wingTip.j = invisible;
    ocelotTail.j = invisible;
    ocelotTail2.j = invisible;
  }
}
