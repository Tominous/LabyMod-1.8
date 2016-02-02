import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;

public class bbj
  extends bbo
{
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
    this.t = textureWidthIn;
    this.u = textureHeightIn;
    this.e = new bct(this, 0, 0);
    this.e.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, modelSize);
    this.e.a(0.0F, 0.0F + p_i1149_2_, 0.0F);
    this.f = new bct(this, 32, 0);
    this.f.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, modelSize + 0.5F);
    this.f.a(0.0F, 0.0F + p_i1149_2_, 0.0F);
    this.g = new bct(this, 16, 16);
    this.g.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, modelSize);
    this.g.a(0.0F, 0.0F + p_i1149_2_, 0.0F);
    this.h = new bct(this, 40, 16);
    this.h.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, modelSize);
    this.h.a(-5.0F, 2.0F + p_i1149_2_, 0.0F);
    this.i = new bct(this, 40, 16);
    this.i.i = true;
    this.i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, modelSize);
    this.i.a(5.0F, 2.0F + p_i1149_2_, 0.0F);
    this.j = new bct(this, 0, 16);
    this.j.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, modelSize);
    this.j.a(-1.9F, 12.0F + p_i1149_2_, 0.0F);
    this.k = new bct(this, 0, 16);
    this.k.i = true;
    this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, modelSize);
    this.k.a(1.9F, 12.0F + p_i1149_2_, 0.0F);
  }
  
  public void a(pk entityIn, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float scale)
  {
    a(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale, entityIn);
    bfl.E();
    if (this.r)
    {
      float f = 2.0F;
      bfl.a(1.5F / f, 1.5F / f, 1.5F / f);
      bfl.b(0.0F, 16.0F * scale, 0.0F);
      this.e.a(scale);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / f, 1.0F / f, 1.0F / f);
      bfl.b(0.0F, 24.0F * scale, 0.0F);
      this.g.a(scale);
      this.h.a(scale);
      this.i.a(scale);
      this.j.a(scale);
      this.k.a(scale);
      this.f.a(scale);
    }
    else
    {
      if (entityIn.av()) {
        bfl.b(0.0F, 0.2F, 0.0F);
      }
      this.e.a(scale);
      this.g.a(scale);
      this.h.a(scale);
      this.i.a(scale);
      this.j.a(scale);
      this.k.a(scale);
      this.f.a(scale);
    }
    bfl.F();
  }
  
  public void a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, pk entityIn)
  {
    this.e.g = (p_78087_4_ / 57.295776F);
    this.e.f = (p_78087_5_ / 57.295776F);
    this.h.f = (ns.b(p_78087_1_ * 0.6662F + 3.1415927F) * 2.0F * p_78087_2_ * 0.5F);
    this.i.f = (ns.b(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F);
    this.h.h = 0.0F;
    this.i.h = 0.0F;
    this.j.f = (ns.b(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
    this.k.f = (ns.b(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
    this.j.g = 0.0F;
    this.k.g = 0.0F;
    if (this.q)
    {
      this.h.f += -0.62831855F;
      this.i.f += -0.62831855F;
      this.j.f = -1.2566371F;
      this.k.f = -1.2566371F;
      this.j.g = 0.31415927F;
      this.k.g = -0.31415927F;
    }
    if (this.l != 0) {
      this.i.f = (this.i.f * 0.5F - 0.31415927F * this.l);
    }
    this.h.g = 0.0F;
    this.h.h = 0.0F;
    switch (this.m)
    {
    case 0: 
    case 2: 
    default: 
      break;
    case 1: 
      this.h.f = (this.h.f * 0.5F - 0.31415927F * this.m);
      break;
    case 3: 
      this.h.f = (this.h.f * 0.5F - 0.31415927F * this.m);
      if ((!ConfigManager.settings.oldSword.booleanValue()) || (!Allowed.animations())) {
        this.h.g = -0.5235988F;
      }
      break;
    }
    this.i.g = 0.0F;
    if (this.p > -9990.0F)
    {
      float f = this.p;
      this.g.g = (ns.a(ns.c(f) * 3.1415927F * 2.0F) * 0.2F);
      this.h.e = (ns.a(this.g.g) * 5.0F);
      this.h.c = (-ns.b(this.g.g) * 5.0F);
      this.i.e = (-ns.a(this.g.g) * 5.0F);
      this.i.c = (ns.b(this.g.g) * 5.0F);
      this.h.g += this.g.g;
      this.i.g += this.g.g;
      this.i.f += this.g.g;
      f = 1.0F - this.p;
      f *= f;
      f *= f;
      f = 1.0F - f;
      float f1 = ns.a(f * 3.1415927F);
      float f2 = ns.a(this.p * 3.1415927F) * -(this.e.f - 0.7F) * 0.75F;
      this.h.f = ((float)(this.h.f - (f1 * 1.2D + f2)));
      this.h.g += this.g.g * 2.0F;
      this.h.h += ns.a(this.p * 3.1415927F) * -0.4F;
    }
    if (this.n)
    {
      this.g.f = 0.5F;
      this.h.f += 0.4F;
      this.i.f += 0.4F;
      this.j.e = 4.0F;
      this.k.e = 4.0F;
      this.j.d = 9.0F;
      this.k.d = 9.0F;
      this.e.d = 1.0F;
    }
    else
    {
      this.g.f = 0.0F;
      this.j.e = 0.1F;
      this.k.e = 0.1F;
      this.j.d = 12.0F;
      this.k.d = 12.0F;
      this.e.d = 0.0F;
    }
    this.h.h += ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    this.i.h -= ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    this.h.f += ns.a(p_78087_3_ * 0.067F) * 0.05F;
    this.i.f -= ns.a(p_78087_3_ * 0.067F) * 0.05F;
    if (this.o)
    {
      float f3 = 0.0F;
      float f4 = 0.0F;
      this.h.h = 0.0F;
      this.i.h = 0.0F;
      this.h.g = (-(0.1F - f3 * 0.6F) + this.e.g);
      this.i.g = (0.1F - f3 * 0.6F + this.e.g + 0.4F);
      this.h.f = (-1.5707964F + this.e.f);
      this.i.f = (-1.5707964F + this.e.f);
      this.h.f -= f3 * 1.2F - f4 * 0.4F;
      this.i.f -= f3 * 1.2F - f4 * 0.4F;
      this.h.h += ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
      this.i.h -= ns.b(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
      this.h.f += ns.a(p_78087_3_ * 0.067F) * 0.05F;
      this.i.f -= ns.a(p_78087_3_ * 0.067F) * 0.05F;
    }
    a(this.e, this.f);
  }
  
  public void a(bbo model)
  {
    super.a(model);
    if ((model instanceof bbj))
    {
      bbj modelbiped = (bbj)model;
      this.l = modelbiped.l;
      this.m = modelbiped.m;
      this.n = modelbiped.n;
      this.o = modelbiped.o;
    }
  }
  
  public void a(boolean invisible)
  {
    this.e.j = invisible;
    this.f.j = invisible;
    this.g.j = invisible;
    this.h.j = invisible;
    this.i.j = invisible;
    this.j.j = invisible;
    this.k.j = invisible;
  }
  
  public void a(float scale)
  {
    this.h.c(scale);
  }
}
