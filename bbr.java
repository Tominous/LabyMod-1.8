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
    
    y = p_i46304_2_;
    x = new bct(this, 24, 0);
    x.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i46304_1_);
    w = new bct(this, 0, 0);
    w.b(64, 32);
    w.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i46304_1_);
    if (p_i46304_2_)
    {
      i = new bct(this, 32, 48);
      i.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_);
      i.a(5.0F, 2.5F, 0.0F);
      h = new bct(this, 40, 16);
      h.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_);
      h.a(-5.0F, 2.5F, 0.0F);
      a = new bct(this, 48, 48);
      a.a(-1.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_ + 0.25F);
      a.a(5.0F, 2.5F, 0.0F);
      b = new bct(this, 40, 32);
      b.a(-2.0F, -2.0F, -2.0F, 3, 12, 4, p_i46304_1_ + 0.25F);
      b.a(-5.0F, 2.5F, 10.0F);
    }
    else
    {
      i = new bct(this, 32, 48);
      i.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, p_i46304_1_);
      i.a(5.0F, 2.0F, 0.0F);
      a = new bct(this, 48, 48);
      a.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
      a.a(5.0F, 2.0F, 0.0F);
      b = new bct(this, 40, 32);
      b.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
      b.a(-5.0F, 2.0F, 10.0F);
    }
    k = new bct(this, 16, 48);
    k.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, p_i46304_1_);
    k.a(1.9F, 12.0F, 0.0F);
    c = new bct(this, 0, 48);
    c.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
    c.a(1.9F, 12.0F, 0.0F);
    d = new bct(this, 0, 32);
    d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, p_i46304_1_ + 0.25F);
    d.a(-1.9F, 12.0F, 0.0F);
    v = new bct(this, 16, 32);
    v.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, p_i46304_1_ + 0.25F);
    v.a(0.0F, 0.0F, 0.0F);
  }
  
  public void a(pk entityIn, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float scale)
  {
    super.a(entityIn, p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale);
    bfl.E();
    if (r)
    {
      float f = 2.0F;
      bfl.a(1.0F / f, 1.0F / f, 1.0F / f);
      bfl.b(0.0F, 24.0F * scale, 0.0F);
      c.a(scale);
      d.a(scale);
      a.a(scale);
      b.a(scale);
      v.a(scale);
    }
    else
    {
      if (entityIn.av()) {
        bfl.b(0.0F, 0.2F, 0.0F);
      }
      c.a(scale);
      d.a(scale);
      a.a(scale);
      b.a(scale);
      v.a(scale);
    }
    bfl.F();
  }
  
  public void b(float p_178727_1_)
  {
    a(e, x);
    x.c = 0.0F;
    x.d = 0.0F;
    x.a(p_178727_1_);
  }
  
  public void c(float p_178728_1_)
  {
    w.a(p_178728_1_);
  }
  
  public void a(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, pk entityIn)
  {
    super.a(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
    a(k, c);
    a(j, d);
    a(i, a);
    a(h, b);
    a(g, v);
    if (entityIn.av()) {
      w.d = 2.0F;
    } else {
      w.d = 0.0F;
    }
  }
  
  public void a()
  {
    h.a(0.0625F);
    b.a(0.0625F);
  }
  
  public void b()
  {
    i.a(0.0625F);
    a.a(0.0625F);
  }
  
  public void a(boolean invisible)
  {
    super.a(invisible);
    a.j = invisible;
    b.j = invisible;
    c.j = invisible;
    d.j = invisible;
    v.j = invisible;
    w.j = invisible;
    x.j = invisible;
  }
  
  public void a(float scale)
  {
    if (y)
    {
      h.c += 1.0F;
      h.c(scale);
      h.c -= 1.0F;
    }
    else
    {
      h.c(scale);
    }
  }
}
