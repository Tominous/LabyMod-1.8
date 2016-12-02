import de.labystudio.cosmetic.ModelCosmetics;

public class bbr
  extends ModelCosmetics
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct v;
  public bct w;
  public bct x;
  public boolean y;
  
  public bbr(float p_i46304_1_, boolean p_i46304_2_)
  {
    super(p_i46304_1_, 0.0F, 64, 64);
    
    this.y = p_i46304_2_;
    this.x = new bct(this, 24, 0);
    this.x.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i46304_1_);
    this.w = new bct(this, 0, 0);
    this.w.b(64, 32);
    this.w.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i46304_1_);
    if (p_i46304_2_)
    {
      this.i = new bct(this, 32, 48);
      this.i.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_);
      this.i.a(5.0F, 2.5F, 0.0F);
      this.h = new bct(this, 40, 16);
      this.h.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_);
      this.h.a(-5.0F, 2.5F, 0.0F);
      this.a = new bct(this, 48, 48);
      this.a.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_ + 0.25F);
      this.a.a(5.0F, 2.5F, 0.0F);
      this.b = new bct(this, 40, 32);
      this.b.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_ + 0.25F);
      this.b.a(-5.0F, 2.5F, 10.0F);
    }
    else
    {
      this.i = new bct(this, 32, 48);
      this.i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, p_i46304_1_);
      this.i.a(5.0F, 2.0F, 0.0F);
      this.a = new bct(this, 48, 48);
      this.a.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
      this.a.a(5.0F, 2.0F, 0.0F);
      this.b = new bct(this, 40, 32);
      this.b.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
      this.b.a(-5.0F, 2.0F, 10.0F);
    }
    this.k = new bct(this, 16, 48);
    this.k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, p_i46304_1_);
    this.k.a(1.9F, 12.0F, 0.0F);
    this.c = new bct(this, 0, 48);
    this.c.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
    this.c.a(1.9F, 12.0F, 0.0F);
    this.d = new bct(this, 0, 32);
    this.d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
    this.d.a(-1.9F, 12.0F, 0.0F);
    this.v = new bct(this, 16, 32);
    this.v.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, p_i46304_1_ + 0.25F);
    this.v.a(0.0F, 0.0F, 0.0F);
  }
  
  public void a(pk entityIn, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float scale)
  {
    super.a(entityIn, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale);
    bfl.E();
    if (this.r)
    {
      float f = 2.0F;
      bfl.a(1.0F / f, 1.0F / f, 1.0F / f);
      bfl.b(0.0F, 24.0F * scale, 0.0F);
      this.c.a(scale);
      this.d.a(scale);
      this.a.a(scale);
      this.b.a(scale);
      this.v.a(scale);
    }
    else
    {
      if (entityIn.av()) {
        bfl.b(0.0F, 0.2F, 0.0F);
      }
      this.c.a(scale);
      this.d.a(scale);
      this.a.a(scale);
      this.b.a(scale);
      this.v.a(scale);
    }
    bfl.F();
  }
  
  public void b(float p_178727_1_)
  {
    a(this.e, this.x);
    this.x.c = 0.0F;
    this.x.d = 0.0F;
    this.x.a(p_178727_1_);
  }
  
  public void c(float p_178728_1_)
  {
    this.w.a(p_178728_1_);
  }
  
  public void a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, pk entityIn)
  {
    super.a(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
    a(this.k, this.c);
    a(this.j, this.d);
    a(this.i, this.a);
    a(this.h, this.b);
    a(this.g, this.v);
    if (entityIn.av()) {
      this.w.d = 2.0F;
    } else {
      this.w.d = 0.0F;
    }
  }
  
  public void a()
  {
    this.h.a(0.0625F);
    this.b.a(0.0625F);
  }
  
  public void b()
  {
    this.i.a(0.0625F);
    this.a.a(0.0625F);
  }
  
  public void a(boolean invisible)
  {
    super.a(invisible);
    this.a.j = invisible;
    this.b.j = invisible;
    this.c.j = invisible;
    this.d.j = invisible;
    this.v.j = invisible;
    this.w.j = invisible;
    this.x.j = invisible;
  }
  
  public void a(float scale)
  {
    if (this.y)
    {
      this.h.c += 1.0F;
      this.h.c(scale);
      this.h.c -= 1.0F;
    }
    else
    {
      this.h.c(scale);
    }
  }
}
