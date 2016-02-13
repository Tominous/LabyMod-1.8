import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.LeftHand;
import org.lwjgl.opengl.GL11;

public class bfn
{
  private static final jy a = new jy("textures/map/map_background.png");
  private static final jy b = new jy("textures/misc/underwater.png");
  private final ave c;
  private zx d;
  private float e;
  private float f;
  private final biu g;
  private final bjh h;
  private int i = -1;
  
  public bfn(ave mcIn)
  {
    this.c = mcIn;
    this.g = mcIn.af();
    this.h = mcIn.ag();
  }
  
  public void a(pr entityIn, zx heldStack, bgr.b transform)
  {
    if (heldStack != null)
    {
      zw item = heldStack.b();
      afh block = afh.a(item);
      bfl.E();
      if (this.h.a(heldStack))
      {
        bfl.a(2.0F, 2.0F, 2.0F);
        if (a(block)) {
          bfl.a(false);
        }
      }
      this.h.a(heldStack, entityIn, transform);
      if (a(block)) {
        bfl.a(true);
      }
      bfl.F();
    }
  }
  
  private boolean a(afh blockIn)
  {
    return (blockIn != null) && (blockIn.m() == adf.d);
  }
  
  private void a(float angle, float p_178101_2_)
  {
    bfl.E();
    bfl.b(angle, 1.0F, 0.0F, 0.0F);
    bfl.b(p_178101_2_, 0.0F, 1.0F, 0.0F);
    avc.b();
    bfl.F();
  }
  
  private void a(bet clientPlayer)
  {
    int i = this.c.f.b(new cj(clientPlayer.s, clientPlayer.t + clientPlayer.aS(), clientPlayer.u), 0);
    float f = i & 0xFFFF;
    float f1 = i >> 16;
    bqs.a(bqs.r, f, f1);
  }
  
  private void a(bew entityplayerspIn, float partialTicks)
  {
    float f = entityplayerspIn.i + (entityplayerspIn.g - entityplayerspIn.i) * partialTicks;
    float f1 = entityplayerspIn.h + (entityplayerspIn.f - entityplayerspIn.h) * partialTicks;
    bfl.b((entityplayerspIn.z - f) * 0.1F, 1.0F, 0.0F, 0.0F);
    bfl.b((entityplayerspIn.y - f1) * 0.1F, 0.0F, 1.0F, 0.0F);
  }
  
  private float c(float p_178100_1_)
  {
    float f = 1.0F - p_178100_1_ / 45.0F + 0.1F;
    f = ns.a(f, 0.0F, 1.0F);
    f = -ns.b(f * 3.1415927F) * 0.5F + 0.5F;
    return f;
  }
  
  private void a(bln renderPlayerIn)
  {
    bfl.E();
    bfl.b(54.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(64.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(-62.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(0.25F, -0.85F, 0.75F);
    renderPlayerIn.b(this.c.h);
    bfl.F();
  }
  
  private void b(bln renderPlayerIn)
  {
    bfl.E();
    bfl.b(92.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(45.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(41.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(-0.3F, -1.1F, 0.45F);
    renderPlayerIn.c(this.c.h);
    bfl.F();
  }
  
  private void b(bet clientPlayer)
  {
    this.c.P().a(clientPlayer.i());
    biv<bet> render = this.g.a(this.c.h);
    bln renderplayer = (bln)render;
    if (!clientPlayer.ax())
    {
      bfl.p();
      a(renderplayer);
      b(renderplayer);
      bfl.o();
    }
  }
  
  private void a(bet clientPlayer, float p_178097_2_, float p_178097_3_, float p_178097_4_)
  {
    float f = -0.4F * ns.a(ns.c(p_178097_4_) * 3.1415927F);
    float f1 = 0.2F * ns.a(ns.c(p_178097_4_) * 3.1415927F * 2.0F);
    float f2 = -0.2F * ns.a(p_178097_4_ * 3.1415927F);
    bfl.b(f, f1, f2);
    float f3 = c(p_178097_2_);
    bfl.b(0.0F, 0.04F, -0.72F);
    bfl.b(0.0F, p_178097_3_ * -1.2F, 0.0F);
    bfl.b(0.0F, f3 * -0.5F, 0.0F);
    bfl.b(90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(f3 * -85.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(0.0F, 1.0F, 0.0F, 0.0F);
    b(clientPlayer);
    float f4 = ns.a(p_178097_4_ * p_178097_4_ * 3.1415927F);
    float f5 = ns.a(ns.c(p_178097_4_) * 3.1415927F);
    bfl.b(f4 * -20.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(f5 * -20.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(f5 * -80.0F, 1.0F, 0.0F, 0.0F);
    bfl.a(0.38F, 0.38F, 0.38F);
    bfl.b(90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(0.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(-1.0F, -1.0F, 0.0F);
    bfl.a(0.015625F, 0.015625F, 0.015625F);
    this.c.P().a(a);
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    GL11.glNormal3f(0.0F, 0.0F, -1.0F);
    worldrenderer.a(7, bms.g);
    worldrenderer.b(-7.0D, 135.0D, 0.0D).a(0.0D, 1.0D).d();
    worldrenderer.b(135.0D, 135.0D, 0.0D).a(1.0D, 1.0D).d();
    worldrenderer.b(135.0D, -7.0D, 0.0D).a(1.0D, 0.0D).d();
    worldrenderer.b(-7.0D, -7.0D, 0.0D).a(0.0D, 0.0D).d();
    tessellator.b();
    atg mapdata = zy.bd.a(this.d, this.c.f);
    if (mapdata != null) {
      this.c.o.k().a(mapdata, false);
    }
  }
  
  private void a(bet clientPlayer, float p_178095_2_, float p_178095_3_)
  {
    float f = -0.3F * ns.a(ns.c(p_178095_3_) * 3.1415927F);
    float f1 = 0.4F * ns.a(ns.c(p_178095_3_) * 3.1415927F * 2.0F);
    float f2 = -0.4F * ns.a(p_178095_3_ * 3.1415927F);
    bfl.b(f, f1, f2);
    bfl.b(0.64000005F, -0.6F, -0.71999997F);
    bfl.b(0.0F, p_178095_2_ * -0.6F, 0.0F);
    bfl.b(45.0F, 0.0F, 1.0F, 0.0F);
    float f3 = ns.a(p_178095_3_ * p_178095_3_ * 3.1415927F);
    float f4 = ns.a(ns.c(p_178095_3_) * 3.1415927F);
    bfl.b(f4 * 70.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(f3 * -20.0F, 0.0F, 0.0F, 1.0F);
    this.c.P().a(clientPlayer.i());
    bfl.b(-1.0F, 3.6F, 3.5F);
    bfl.b(120.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(200.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(-135.0F, 0.0F, 1.0F, 0.0F);
    bfl.a(1.0F, 1.0F, 1.0F);
    bfl.b(5.6F, 0.0F, 0.0F);
    biv<bet> render = this.g.a(this.c.h);
    bfl.p();
    bln renderplayer = (bln)render;
    renderplayer.b(this.c.h);
    bfl.o();
  }
  
  private void d(float p_178105_1_)
  {
    float f = -0.4F * ns.a(ns.c(p_178105_1_) * 3.1415927F);
    float f1 = 0.2F * ns.a(ns.c(p_178105_1_) * 3.1415927F * 2.0F);
    float f2 = -0.2F * ns.a(p_178105_1_ * 3.1415927F);
    bfl.b(f, f1, f2);
  }
  
  private void a(bet clientPlayer, float p_178104_2_)
  {
    float f = clientPlayer.bR() - p_178104_2_ + 1.0F;
    float f1 = f / this.d.l();
    float f2 = ns.e(ns.b(f / 4.0F * 3.1415927F) * 0.1F);
    if (f1 >= 0.8F) {
      f2 = 0.0F;
    }
    bfl.b(0.0F, f2, 0.0F);
    float f3 = 1.0F - (float)Math.pow(f1, 27.0D);
    bfl.b(f3 * 0.6F, f3 * -0.5F, f3 * 0.0F);
    bfl.b(f3 * 90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(f3 * 10.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(f3 * 30.0F, 0.0F, 0.0F, 1.0F);
  }
  
  private void b(float equipProgress, float swingProgress)
  {
    if ((ConfigManager.settings.oldBow.booleanValue()) && (Allowed.animations()) && 
      (this.c != null) && (this.c.h != null) && (this.c.h.bQ() != null) && (this.c.h.bQ().b() != null) && 
      (zw.b(this.c.h.bQ().b()) == 261)) {
      bfl.b(0.0F, 0.0F, -0.08F);
    }
    if ((ConfigManager.settings.oldFishing) && (Allowed.animations()) && 
      (this.c != null) && (this.c.h != null) && (this.c.h.bZ() != null) && (this.c.h.bZ().b() != null) && 
      (zw.b(this.c.h.bZ().b()) == 346)) {
      bfl.b(0.1F, -0.02F, -0.335F);
    }
    bfl.b(0.56F, -0.52F, -0.71999997F);
    bfl.b(0.0F, equipProgress * -0.6F, 0.0F);
    bfl.b(45.0F, 0.0F, 1.0F, 0.0F);
    float f = ns.a(swingProgress * swingProgress * 3.1415927F);
    float f1 = ns.a(ns.c(swingProgress) * 3.1415927F);
    bfl.b(f * -20.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(f1 * -20.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(f1 * -80.0F, 1.0F, 0.0F, 0.0F);
    bfl.a(0.4F, 0.4F, 0.4F);
  }
  
  private void a(float p_178098_1_, bet clientPlayer)
  {
    bfl.b(-18.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(-12.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(-8.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(-0.9F, 0.2F, 0.0F);
    float f = this.d.l() - (clientPlayer.bR() - p_178098_1_ + 1.0F);
    float f1 = f / 20.0F;
    f1 = (f1 * f1 + f1 * 2.0F) / 3.0F;
    if (f1 > 1.0F) {
      f1 = 1.0F;
    }
    if (f1 > 0.1F)
    {
      float f2 = ns.a((f - 0.1F) * 1.3F);
      float f3 = f1 - 0.1F;
      float f4 = f2 * f3;
      bfl.b(f4 * 0.0F, f4 * 0.01F, f4 * 0.0F);
    }
    bfl.b(f1 * 0.0F, f1 * 0.0F, f1 * 0.1F);
    bfl.a(1.0F, 1.0F, 1.0F + f1 * 0.2F);
  }
  
  private void d()
  {
    bfl.b(-0.5F, 0.2F, 0.0F);
    bfl.b(30.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(-80.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(60.0F, 0.0F, 1.0F, 0.0F);
  }
  
  public void a(float partialTicks)
  {
    float f = 1.0F - (this.f + (this.e - this.f) * partialTicks);
    bet abstractclientplayer = this.c.h;
    float f1 = abstractclientplayer.l(partialTicks);
    float f2 = abstractclientplayer.B + (abstractclientplayer.z - abstractclientplayer.B) * partialTicks;
    float f3 = abstractclientplayer.A + (abstractclientplayer.y - abstractclientplayer.A) * partialTicks;
    a(f2, f3);
    a(abstractclientplayer);
    a((bew)abstractclientplayer, partialTicks);
    bfl.B();
    bfl.E();
    if (LeftHand.use(this.d))
    {
      GL11.glScaled(-1.0D, 1.0D, 1.0D);
      bfl.p();
    }
    else
    {
      bfl.o();
    }
    if (this.d != null)
    {
      if (this.d.b() == zy.bd)
      {
        a(abstractclientplayer, f2, f, f1);
      }
      else if (abstractclientplayer.bR() > 0)
      {
        aba enumaction = this.d.m();
        float var10 = 0.0F;
        if ((ConfigManager.settings.oldBlockhit.booleanValue()) && (Allowed.animations())) {
          var10 = f1;
        }
        switch (enumaction)
        {
        case a: 
          b(f, 0.0F);
          break;
        case b: 
        case c: 
          a(abstractclientplayer, partialTicks);
          b(f, var10);
          break;
        case d: 
          b(f, var10);
          d();
          break;
        case e: 
          b(f, var10);
          a(partialTicks, abstractclientplayer);
        }
      }
      else
      {
        d(f1);
        b(f, f1);
      }
      a(abstractclientplayer, this.d, bgr.b.c);
    }
    else if (!abstractclientplayer.ax())
    {
      a(abstractclientplayer, f, f1);
    }
    bfl.F();
    bfl.C();
    avc.a();
  }
  
  public void b(float partialTicks)
  {
    
    if (this.c.h.aj())
    {
      alz iblockstate = this.c.f.p(new cj(this.c.h));
      wn entityplayer = this.c.h;
      for (int i = 0; i < 8; i++)
      {
        double d0 = entityplayer.s + ((i >> 0) % 2 - 0.5F) * entityplayer.J * 0.8F;
        double d1 = entityplayer.t + ((i >> 1) % 2 - 0.5F) * 0.1F;
        double d2 = entityplayer.u + ((i >> 2) % 2 - 0.5F) * entityplayer.J * 0.8F;
        cj blockpos = new cj(d0, d1 + entityplayer.aS(), d2);
        alz iblockstate1 = this.c.f.p(blockpos);
        if (iblockstate1.c().w()) {
          iblockstate = iblockstate1;
        }
      }
      if (iblockstate.c().b() != -1) {
        a(partialTicks, this.c.ae().a().a(iblockstate));
      }
    }
    if (!this.c.h.v())
    {
      if (this.c.h.a(arm.h)) {
        e(partialTicks);
      }
      if (this.c.h.at()) {
        f(partialTicks);
      }
    }
    bfl.d();
  }
  
  private void a(float p_178108_1_, bmi p_178108_2_)
  {
    this.c.P().a(bmh.g);
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    float f = 0.1F;
    bfl.c(0.1F, 0.1F, 0.1F, 0.5F);
    bfl.E();
    float f1 = -1.0F;
    float f2 = 1.0F;
    float f3 = -1.0F;
    float f4 = 1.0F;
    float f5 = -0.5F;
    float f6 = p_178108_2_.e();
    float f7 = p_178108_2_.f();
    float f8 = p_178108_2_.g();
    float f9 = p_178108_2_.h();
    worldrenderer.a(7, bms.g);
    worldrenderer.b(-1.0D, -1.0D, -0.5D).a(f7, f9).d();
    worldrenderer.b(1.0D, -1.0D, -0.5D).a(f6, f9).d();
    worldrenderer.b(1.0D, 1.0D, -0.5D).a(f6, f8).d();
    worldrenderer.b(-1.0D, 1.0D, -0.5D).a(f7, f8).d();
    tessellator.b();
    bfl.F();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void e(float p_78448_1_)
  {
    this.c.P().a(b);
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    float f = this.c.h.c(p_78448_1_);
    bfl.c(f, f, f, 0.5F);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.E();
    float f1 = 4.0F;
    float f2 = -1.0F;
    float f3 = 1.0F;
    float f4 = -1.0F;
    float f5 = 1.0F;
    float f6 = -0.5F;
    float f7 = -this.c.h.y / 64.0F;
    float f8 = this.c.h.z / 64.0F;
    worldrenderer.a(7, bms.g);
    worldrenderer.b(-1.0D, -1.0D, -0.5D).a(4.0F + f7, 4.0F + f8).d();
    worldrenderer.b(1.0D, -1.0D, -0.5D).a(0.0F + f7, 4.0F + f8).d();
    worldrenderer.b(1.0D, 1.0D, -0.5D).a(0.0F + f7, 0.0F + f8).d();
    worldrenderer.b(-1.0D, 1.0D, -0.5D).a(4.0F + f7, 0.0F + f8).d();
    tessellator.b();
    bfl.F();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
  }
  
  private void f(float p_78442_1_)
  {
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    bfl.c(1.0F, 1.0F, 1.0F, 0.9F);
    bfl.c(519);
    bfl.a(false);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    float f = 1.0F;
    for (int i = 0; i < 2; i++)
    {
      bfl.E();
      bmi textureatlassprite = this.c.T().a("minecraft:blocks/fire_layer_1");
      this.c.P().a(bmh.g);
      float f1 = textureatlassprite.e();
      float f2 = textureatlassprite.f();
      float f3 = textureatlassprite.g();
      float f4 = textureatlassprite.h();
      float f5 = (0.0F - f) / 2.0F;
      float f6 = f5 + f;
      float f7 = 0.0F - f / 2.0F;
      float f8 = f7 + f;
      float f9 = -0.5F;
      bfl.b(-(i * 2 - 1) * 0.24F, -0.3F, 0.0F);
      bfl.b((i * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
      worldrenderer.a(7, bms.g);
      worldrenderer.b(f5, f7, f9).a(f2, f4).d();
      worldrenderer.b(f6, f7, f9).a(f1, f4).d();
      worldrenderer.b(f6, f8, f9).a(f1, f3).d();
      worldrenderer.b(f5, f8, f9).a(f2, f3).d();
      tessellator.b();
      bfl.F();
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    bfl.a(true);
    bfl.c(515);
  }
  
  public void a()
  {
    this.f = this.e;
    wn entityplayer = this.c.h;
    zx itemstack = entityplayer.bi.h();
    boolean flag = false;
    if ((this.d != null) && (itemstack != null))
    {
      if (!this.d.c(itemstack)) {
        flag = true;
      }
    }
    else if ((this.d == null) && (itemstack == null)) {
      flag = false;
    } else {
      flag = true;
    }
    float f = 0.4F;
    float f1 = flag ? 0.0F : 1.0F;
    float f2 = ns.a(f1 - this.e, -f, f);
    this.e += f2;
    if (this.e < 0.1F)
    {
      this.d = itemstack;
      this.i = entityplayer.bi.c;
    }
  }
  
  public void b()
  {
    this.e = 0.0F;
  }
  
  public void c()
  {
    this.e = 0.0F;
  }
}
