import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.LeftHand;
import java.util.UUID;

public class bbr
  extends bbj
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct v;
  private bct w;
  private bct x;
  private boolean y;
  bct wolfTail;
  private bct wing;
  private bct wingTip;
  boolean keepFlying = false;
  private static final jy enderDragonTextures = new jy("textures/entity/enderdragon/dragon.png");
  
  public bbr(float p_i46304_1_, boolean p_i46304_2_)
  {
    super(p_i46304_1_, 0.0F, 64, 64);
    
    this.y = p_i46304_2_;
    this.x = new bct(this, 24, 0);
    this.x.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i46304_1_);
    this.w = new bct(this, 0, 0);
    this.w.b(64, 32);
    this.w.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i46304_1_);
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
    this.wing.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    this.wing.k = true;
    this.wingTip = new bct(this, "wingtip");
    this.wingTip.a(-56.0F, 0.0F, 0.0F);
    this.wingTip.k = true;
    this.wingTip.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
    this.wingTip.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    this.wing.a(this.wingTip);
    this.t = bw;
    this.u = bh;
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
    if (LeftHand.use(entityIn)) {
      bfl.a(-1.0F, 1.0F, 1.0F);
    }
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
      if (LabyMod.getInstance().isWolf(entityIn))
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
        this.wolfTail.k = false;
        this.wolfTail.b(scale);
        this.wolfTail.k = true;
        bfl.F();
      }
      if (LabyMod.getInstance().isDragon(entityIn))
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
        if (entityIn.aK().toString().equals("9e17cc5c-36d7-48d1-80de-40310ead7fbd")) {
          bfl.c(2.0F, 0.2F, 0.2F);
        }
        if (entityIn.aK().toString().equals("de231590-d66d-4947-855a-68cdfe2ce254")) {
          bfl.c(0.163F, 0.7F, 0.93F);
        }
        if (entityIn.aK().toString().equals("d4ca3485-6cab-4f7a-aea7-7e0ff5fb6927")) {
          bfl.c(0.0F, 151.0F, 255.0F);
        }
        if (entityIn.aK().toString().equals("72f0c79d-7a8d-4881-ad29-110c2ef8f81b")) {
          bfl.c(0.5F, 0.5F, 1.8F);
        }
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
          if (j == 0) {
            bfl.a(-1.0F, 1.0F, 1.0F);
          }
        }
        bfl.F();
      }
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
    
    this.wolfTail.g = (ns.b(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
    if (entityIn.av()) {
      this.w.d = 2.0F;
    } else {
      this.w.d = 0.0F;
    }
    this.wolfTail.f = p_78087_2_;
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
    this.wolfTail.j = invisible;
    this.wing.j = invisible;
    this.wingTip.j = invisible;
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
