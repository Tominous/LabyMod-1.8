import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.events.ModelBipedRotationAnglesEvent;
import de.labystudio.modapi.events.RenderModelBipedEvent;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.LeftHand;

public class bbj
  extends bbo
{
  public float bipedModelSize;
  public float bipedF;
  public bct e;
  public bct f;
  public bct g;
  public bct h;
  public bct i;
  public bct j;
  public bct k;
  public int l;
  public int m;
  public boolean n;
  public boolean o;
  
  public bbj()
  {
    this(0.0F);
  }
  
  public bbj(float modelSize)
  {
    this(modelSize, 0.0F, 64, 32);
  }
  
  public bbj(float modelSize, float p_i1149_2_, int textureWidthIn, int textureHeightIn)
  {
    bipedModelSize = modelSize;
    bipedF = p_i1149_2_;
    
    t = textureWidthIn;
    u = textureHeightIn;
    e = new bct(this, 0, 0);
    e.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, modelSize);
    e.a(0.0F, 0.0F + p_i1149_2_, 0.0F);
    f = new bct(this, 32, 0);
    f.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, modelSize + 0.5F);
    f.a(0.0F, 0.0F + p_i1149_2_, 0.0F);
    f.a(0.0F, 0.0F + p_i1149_2_, 0.0F);
    g = new bct(this, 16, 16);
    g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, modelSize);
    g.a(0.0F, 0.0F + p_i1149_2_, 0.0F);
    h = new bct(this, 40, 16);
    h.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, modelSize);
    h.a(-5.0F, 2.0F + p_i1149_2_, 0.0F);
    i = new bct(this, 40, 16);
    i.i = true;
    i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, modelSize);
    i.a(5.0F, 2.0F + p_i1149_2_, 0.0F);
    j = new bct(this, 0, 16);
    j.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, modelSize);
    j.a(-1.9F, 12.0F + p_i1149_2_, 0.0F);
    k = new bct(this, 0, 16);
    k.i = true;
    k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, modelSize);
    k.a(1.9F, 12.0F + p_i1149_2_, 0.0F);
  }
  
  public void a(pk entityIn, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float scale)
  {
    a(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale, entityIn);
    bfl.E();
    if (r)
    {
      float f = 2.0F;
      bfl.a(1.5F / f, 1.5F / f, 1.5F / f);
      bfl.b(0.0F, 16.0F * scale, 0.0F);
      e.a(scale);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / f, 1.0F / f, 1.0F / f);
      bfl.b(0.0F, 24.0F * scale, 0.0F);
      g.a(scale);
      h.a(scale);
      i.a(scale);
      j.a(scale);
      k.a(scale);
      this.f.a(scale);
    }
    else
    {
      if (entityIn.av()) {
        bfl.b(0.0F, 0.2F, 0.0F);
      }
      if (LeftHand.use(entityIn)) {
        bfl.a(-1.0F, 1.0F, 1.0F);
      }
      RenderModelBipedEvent event = null;
      if (ModAPI.enabled()) {
        event = (RenderModelBipedEvent)ModAPI.callEvent(new RenderModelBipedEvent(e, this.f, g, h, i, j, k, scale, entityIn, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, this));
      }
      if ((event != null) && (event.getModifiedBipedHead() != null)) {
        e = event.getModifiedBipedHead();
      } else {
        e.a(scale);
      }
      if ((event != null) && (event.getModifiedBipedHeadwear() != null)) {
        this.f = event.getModifiedBipedHeadwear();
      } else {
        this.f.a(scale);
      }
      if (LeftHand.use(entityIn)) {
        bfl.a(-1.0F, 1.0F, 1.0F);
      }
      if ((event != null) && (event.getModifiedBipedBody() != null)) {
        g = event.getModifiedBipedBody();
      } else {
        g.a(scale);
      }
      if ((event != null) && (event.getModifiedBipedRightArm() != null)) {
        h = event.getModifiedBipedRightArm();
      } else {
        h.a(scale);
      }
      if ((event != null) && (event.getModifiedBipedLeftArm() != null)) {
        i = event.getModifiedBipedLeftArm();
      } else {
        i.a(scale);
      }
      if ((event != null) && (event.getModifiedBipedRightLeg() != null)) {
        j = event.getModifiedBipedRightLeg();
      } else {
        j.a(scale);
      }
      if ((event != null) && (event.getModifiedBipedLeftLeg() != null)) {
        k = event.getModifiedBipedLeftLeg();
      } else {
        k.a(scale);
      }
    }
    bfl.F();
  }
  
  public void a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, pk entityIn)
  {
    if ((ModAPI.enabled()) && (((ModelBipedRotationAnglesEvent)ModAPI.callEvent(new ModelBipedRotationAnglesEvent(this, entityIn))).isCancelled())) {
      return;
    }
    if (LeftHand.use(entityIn)) {
      e.g = (p_78087_4_ / 57.295776F * -1.0F);
    } else {
      e.g = (p_78087_4_ / 57.295776F);
    }
    e.f = (p_78087_5_ / 57.295776F);
    h.f = (ns.b(p_78087_1_ * 0.6662F + 3.1415927F) * 2.0F * p_78087_2_ * 0.5F);
    i.f = (ns.b(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F);
    h.h = 0.0F;
    i.h = 0.0F;
    j.f = (ns.b(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
    k.f = (ns.b(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
    j.g = 0.0F;
    k.g = 0.0F;
    if (q)
    {
      h.f += -0.62831855F;
      i.f += -0.62831855F;
      j.f = -1.2566371F;
      k.f = -1.2566371F;
      j.g = 0.31415927F;
      k.g = -0.31415927F;
    }
    if (l != 0) {
      i.f = (i.f * 0.5F - 0.31415927F * l);
    }
    h.g = 0.0F;
    h.h = 0.0F;
    
    int item = m;
    switch (item)
    {
    case 0: 
    case 2: 
    default: 
      break;
    case 1: 
      h.f = (h.f * 0.5F - 0.31415927F * m);
      break;
    case 3: 
      h.f = (h.f * 0.5F - 0.31415927F * m);
      if ((!settingsoldSword) || (!Allowed.animations())) {
        h.g = -0.5235988F;
      }
      break;
    }
    i.g = 0.0F;
    if (p > -9990.0F)
    {
      float f = p;
      g.g = (ns.a(ns.c(f) * 3.1415927F * 2.0F) * 0.2F);
      h.e = (ns.a(g.g) * 5.0F);
      h.c = (-ns.b(g.g) * 5.0F);
      i.e = (-ns.a(g.g) * 5.0F);
      i.c = (ns.b(g.g) * 5.0F);
      h.g += g.g;
      i.g += g.g;
      i.f += g.g;
      f = 1.0F - p;
      f *= f;
      f *= f;
      f = 1.0F - f;
      float f1 = ns.a(f * 3.1415927F);
      float f2 = ns.a(p * 3.1415927F) * -(e.f - 0.7F) * 0.75F;
      h.f = ((float)(h.f - (f1 * 1.2D + f2)));
      h.g += g.g * 2.0F;
      h.h += ns.a(p * 3.1415927F) * -0.4F;
    }
    if (n)
    {
      g.f = 0.5F;
      h.f += 0.4F;
      i.f += 0.4F;
      j.e = 4.0F;
      k.e = 4.0F;
      j.d = 9.0F;
      k.d = 9.0F;
      e.d = 1.0F;
    }
    else
    {
      g.f = 0.0F;
      j.e = 0.1F;
      k.e = 0.1F;
      j.d = 12.0F;
      k.d = 12.0F;
      e.d = 0.0F;
    }
    h.h += ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    i.h -= ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    h.f += ns.a(p_78087_3_ * 0.067F) * 0.05F;
    i.f -= ns.a(p_78087_3_ * 0.067F) * 0.05F;
    if (o)
    {
      float f3 = 0.0F;
      float f4 = 0.0F;
      h.h = 0.0F;
      i.h = 0.0F;
      h.g = (-(0.1F - f3 * 0.6F) + e.g);
      i.g = (0.1F - f3 * 0.6F + e.g + 0.4F);
      h.f = (-1.5707964F + e.f);
      i.f = (-1.5707964F + e.f);
      h.f -= f3 * 1.2F - f4 * 0.4F;
      i.f -= f3 * 1.2F - f4 * 0.4F;
      h.h += ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
      i.h -= ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
      h.f += ns.a(p_78087_3_ * 0.067F) * 0.05F;
      i.f -= ns.a(p_78087_3_ * 0.067F) * 0.05F;
    }
    if (LeftHand.use(entityIn))
    {
      ff = e.f;
      fg = (-e.g);
      fh = (-e.h);
      fc = e.c;
      fd = e.d;
      fe = (-e.e);
      e.g = (p_78087_4_ / 57.295776F);
    }
    else
    {
      a(e, this.f);
    }
  }
  
  public void a(bbo model)
  {
    super.a(model);
    if ((model instanceof bbj))
    {
      bbj modelbiped = (bbj)model;
      l = l;
      m = m;
      n = n;
      o = o;
    }
  }
  
  public void a(boolean invisible)
  {
    e.j = invisible;
    f.j = invisible;
    g.j = invisible;
    h.j = invisible;
    i.j = invisible;
    j.j = invisible;
    k.j = invisible;
  }
  
  public void a(float scale)
  {
    h.c(scale);
  }
}
