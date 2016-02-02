import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import shadersmod.client.Shaders;

public abstract class biv
{
  private static final jy a = new jy("textures/misc/shadow.png");
  protected final biu b;
  protected float c;
  protected float d = 1.0F;
  private static final String __OBFID = "CL_00000992";
  
  protected biv(biu p_i46179_1_)
  {
    this.b = p_i46179_1_;
  }
  
  public boolean a(pk p_177071_1_, bia p_177071_2_, double p_177071_3_, double p_177071_5_, double p_177071_7_)
  {
    aug var9 = p_177071_1_.aR();
    if ((var9.b()) || (var9.a() == 0.0D)) {
      var9 = new aug(p_177071_1_.s - 2.0D, p_177071_1_.t - 2.0D, p_177071_1_.u - 2.0D, p_177071_1_.s + 2.0D, p_177071_1_.t + 2.0D, p_177071_1_.u + 2.0D);
    }
    return (p_177071_1_.h(p_177071_3_, p_177071_5_, p_177071_7_)) && ((p_177071_1_.ah) || (p_177071_2_.a(var9)));
  }
  
  public void a(pk p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
  {
    a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_);
  }
  
  protected void a(pk p_177067_1_, double p_177067_2_, double p_177067_4_, double p_177067_6_)
  {
    if (b(p_177067_1_)) {
      a(p_177067_1_, p_177067_1_.f_().d(), p_177067_2_, p_177067_4_, p_177067_6_, 64);
    }
  }
  
  protected boolean b(pk p_177070_1_)
  {
    return (p_177070_1_.aO()) && (p_177070_1_.l_());
  }
  
  protected void a(pk p_177069_1_, double p_177069_2_, double p_177069_4_, double p_177069_6_, String p_177069_8_, float p_177069_9_, double p_177069_10_)
  {
    a(p_177069_1_, p_177069_8_, p_177069_2_, p_177069_4_, p_177069_6_, 64);
  }
  
  protected abstract jy a(pk parampk);
  
  protected boolean c(pk p_180548_1_)
  {
    jy var2 = a(p_180548_1_);
    if (var2 == null) {
      return false;
    }
    a(var2);
    return true;
  }
  
  public void a(jy p_110776_1_)
  {
    this.b.a.a(p_110776_1_);
  }
  
  private void a(pk p_76977_1_, double p_76977_2_, double p_76977_4_, double p_76977_6_, float p_76977_8_)
  {
    bfl.f();
    bmh var9 = ave.A().T();
    bmi var10 = var9.a("minecraft:blocks/fire_layer_0");
    bmi var11 = var9.a("minecraft:blocks/fire_layer_1");
    bfl.E();
    bfl.b((float)p_76977_2_, (float)p_76977_4_, (float)p_76977_6_);
    float var12 = p_76977_1_.J * 1.4F;
    bfl.a(var12, var12, var12);
    bfx var13 = bfx.a();
    bfd var14 = var13.c();
    float var15 = 0.5F;
    float var16 = 0.0F;
    float var17 = p_76977_1_.K / var12;
    float var18 = (float)(p_76977_1_.t - p_76977_1_.aR().b);
    bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
    bfl.b(0.0F, 0.0F, -0.3F + (int)var17 * 0.02F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float var19 = 0.0F;
    int var20 = 0;
    var14.a(7, bms.g);
    while (var17 > 0.0F)
    {
      bmi var21 = var20 % 2 == 0 ? var10 : var11;
      a(bmh.g);
      float var22 = var21.e();
      float var23 = var21.g();
      float var24 = var21.f();
      float var25 = var21.h();
      if (var20 / 2 % 2 == 0)
      {
        float var26 = var24;
        var24 = var22;
        var22 = var26;
      }
      var14.b(var15 - var16, 0.0F - var18, var19).a(var24, var25).d();
      var14.b(-var15 - var16, 0.0F - var18, var19).a(var22, var25).d();
      var14.b(-var15 - var16, 1.4F - var18, var19).a(var22, var23).d();
      var14.b(var15 - var16, 1.4F - var18, var19).a(var24, var23).d();
      var17 -= 0.45F;
      var18 -= 0.45F;
      var15 *= 0.9F;
      var19 += 0.03F;
      var20++;
    }
    var13.b();
    bfl.F();
    bfl.e();
  }
  
  private void c(pk p_76975_1_, double p_76975_2_, double p_76975_4_, double p_76975_6_, float p_76975_8_, float p_76975_9_)
  {
    if ((Config.isShaders()) && (Shaders.shouldSkipDefaultShadow)) {
      return;
    }
    bfl.l();
    bfl.b(770, 771);
    this.b.a.a(a);
    adm var10 = a();
    bfl.a(false);
    float var11 = this.c;
    if ((p_76975_1_ instanceof ps))
    {
      ps var12 = (ps)p_76975_1_;
      var11 *= var12.bT();
      if (var12.j_()) {
        var11 *= 0.5F;
      }
    }
    double var35 = p_76975_1_.P + (p_76975_1_.s - p_76975_1_.P) * p_76975_9_;
    double var14 = p_76975_1_.Q + (p_76975_1_.t - p_76975_1_.Q) * p_76975_9_;
    double var16 = p_76975_1_.R + (p_76975_1_.u - p_76975_1_.R) * p_76975_9_;
    int var18 = ns.c(var35 - var11);
    int var19 = ns.c(var35 + var11);
    int var20 = ns.c(var14 - var11);
    int var21 = ns.c(var14);
    int var22 = ns.c(var16 - var11);
    int var23 = ns.c(var16 + var11);
    double var24 = p_76975_2_ - var35;
    double var26 = p_76975_4_ - var14;
    double var28 = p_76975_6_ - var16;
    bfx var30 = bfx.a();
    bfd var31 = var30.c();
    var31.a(7, bms.i);
    Iterator var32 = cj.b(new cj(var18, var20, var22), new cj(var19, var21, var23)).iterator();
    while (var32.hasNext())
    {
      cj var33 = (cj)var32.next();
      afh var34 = var10.p(var33.b()).c();
      if ((var34.b() != -1) && (var10.l(var33) > 3)) {
        a(var34, p_76975_2_, p_76975_4_, p_76975_6_, var33, p_76975_8_, var11, var24, var26, var28);
      }
    }
    var30.b();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    bfl.a(true);
  }
  
  private adm a()
  {
    return this.b.b;
  }
  
  private void a(afh p_180549_1_, double p_180549_2_, double p_180549_4_, double p_180549_6_, cj p_180549_8_, float p_180549_9_, float p_180549_10_, double p_180549_11_, double p_180549_13_, double p_180549_15_)
  {
    if (p_180549_1_.d())
    {
      bfx var17 = bfx.a();
      bfd var18 = var17.c();
      double var19 = (p_180549_9_ - (p_180549_4_ - (p_180549_8_.o() + p_180549_13_)) / 2.0D) * 0.5D * a().o(p_180549_8_);
      if (var19 >= 0.0D)
      {
        if (var19 > 1.0D) {
          var19 = 1.0D;
        }
        double var21 = p_180549_8_.n() + p_180549_1_.B() + p_180549_11_;
        double var23 = p_180549_8_.n() + p_180549_1_.C() + p_180549_11_;
        double var25 = p_180549_8_.o() + p_180549_1_.D() + p_180549_13_ + 0.015625D;
        double var27 = p_180549_8_.p() + p_180549_1_.F() + p_180549_15_;
        double var29 = p_180549_8_.p() + p_180549_1_.G() + p_180549_15_;
        float var31 = (float)((p_180549_2_ - var21) / 2.0D / p_180549_10_ + 0.5D);
        float var32 = (float)((p_180549_2_ - var23) / 2.0D / p_180549_10_ + 0.5D);
        float var33 = (float)((p_180549_6_ - var27) / 2.0D / p_180549_10_ + 0.5D);
        float var34 = (float)((p_180549_6_ - var29) / 2.0D / p_180549_10_ + 0.5D);
        var18.b(var21, var25, var27).a(var31, var33).a(1.0F, 1.0F, 1.0F, (float)var19).d();
        var18.b(var21, var25, var29).a(var31, var34).a(1.0F, 1.0F, 1.0F, (float)var19).d();
        var18.b(var23, var25, var29).a(var32, var34).a(1.0F, 1.0F, 1.0F, (float)var19).d();
        var18.b(var23, var25, var27).a(var32, var33).a(1.0F, 1.0F, 1.0F, (float)var19).d();
      }
    }
  }
  
  public static void a(aug p_76978_0_, double p_76978_1_, double p_76978_3_, double p_76978_5_)
  {
    bfl.x();
    bfx var7 = bfx.a();
    bfd var8 = var7.c();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    var8.c(p_76978_1_, p_76978_3_, p_76978_5_);
    var8.a(7, bms.h);
    var8.b(p_76978_0_.a, p_76978_0_.e, p_76978_0_.c).c(0.0F, 0.0F, -1.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.e, p_76978_0_.c).c(0.0F, 0.0F, -1.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.b, p_76978_0_.c).c(0.0F, 0.0F, -1.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.b, p_76978_0_.c).c(0.0F, 0.0F, -1.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.b, p_76978_0_.f).c(0.0F, 0.0F, 1.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.b, p_76978_0_.f).c(0.0F, 0.0F, 1.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.e, p_76978_0_.f).c(0.0F, 0.0F, 1.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.e, p_76978_0_.f).c(0.0F, 0.0F, 1.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.b, p_76978_0_.c).c(0.0F, -1.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.b, p_76978_0_.c).c(0.0F, -1.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.b, p_76978_0_.f).c(0.0F, -1.0F, 0.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.b, p_76978_0_.f).c(0.0F, -1.0F, 0.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.e, p_76978_0_.f).c(0.0F, 1.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.e, p_76978_0_.f).c(0.0F, 1.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.e, p_76978_0_.c).c(0.0F, 1.0F, 0.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.e, p_76978_0_.c).c(0.0F, 1.0F, 0.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.b, p_76978_0_.f).c(-1.0F, 0.0F, 0.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.e, p_76978_0_.f).c(-1.0F, 0.0F, 0.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.e, p_76978_0_.c).c(-1.0F, 0.0F, 0.0F).d();
    var8.b(p_76978_0_.a, p_76978_0_.b, p_76978_0_.c).c(-1.0F, 0.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.b, p_76978_0_.c).c(1.0F, 0.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.e, p_76978_0_.c).c(1.0F, 0.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.e, p_76978_0_.f).c(1.0F, 0.0F, 0.0F).d();
    var8.b(p_76978_0_.d, p_76978_0_.b, p_76978_0_.f).c(1.0F, 0.0F, 0.0F).d();
    var7.b();
    var8.c(0.0D, 0.0D, 0.0D);
    bfl.w();
  }
  
  public void b(pk p_76979_1_, double p_76979_2_, double p_76979_4_, double p_76979_6_, float p_76979_8_, float p_76979_9_)
  {
    if (this.b.g != null)
    {
      if ((this.b.g.W) && (this.c > 0.0F) && (!p_76979_1_.ax()) && (this.b.a()))
      {
        double var10 = this.b.b(p_76979_1_.s, p_76979_1_.t, p_76979_1_.u);
        float var12 = (float)((1.0D - var10 / 256.0D) * this.d);
        if (var12 > 0.0F) {
          c(p_76979_1_, p_76979_2_, p_76979_4_, p_76979_6_, var12, p_76979_9_);
        }
      }
      if ((p_76979_1_.aJ()) && ((!(p_76979_1_ instanceof wn)) || (!((wn)p_76979_1_).v()))) {
        a(p_76979_1_, p_76979_2_, p_76979_4_, p_76979_6_, p_76979_9_);
      }
    }
  }
  
  public avn c()
  {
    return this.b.c();
  }
  
  protected void a(pk p_147906_1_, String p_147906_2_, double p_147906_3_, double p_147906_5_, double p_147906_7_, int p_147906_9_)
  {
    double var10 = p_147906_1_.h(this.b.c);
    if (var10 <= p_147906_9_ * p_147906_9_)
    {
      avn var12 = c();
      float var13 = 1.6F;
      float var14 = 0.016666668F * var13;
      bfl.E();
      bfl.b((float)p_147906_3_ + 0.0F, (float)p_147906_5_ + p_147906_1_.K + 0.5F, (float)p_147906_7_);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
      bfl.b(this.b.f, 1.0F, 0.0F, 0.0F);
      bfl.a(-var14, -var14, var14);
      bfl.f();
      bfl.a(false);
      bfl.i();
      bfl.l();
      bfl.a(770, 771, 1, 0);
      bfx var15 = bfx.a();
      bfd var16 = var15.c();
      byte var17 = 0;
      if (p_147906_2_.equals("deadmau5")) {
        var17 = -10;
      }
      int var18 = var12.a(p_147906_2_) / 2;
      bfl.x();
      var16.a(7, bms.f);
      var16.b(-var18 - 1, -1 + var17, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
      var16.b(-var18 - 1, 8 + var17, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
      var16.b(var18 + 1, 8 + var17, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
      var16.b(var18 + 1, -1 + var17, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
      var15.b();
      bfl.w();
      var12.a(p_147906_2_, -var12.a(p_147906_2_) / 2, var17, 553648127);
      bfl.j();
      bfl.a(true);
      var12.a(p_147906_2_, -var12.a(p_147906_2_) / 2, var17, -1);
      bfl.e();
      bfl.k();
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.F();
    }
  }
  
  public biu d()
  {
    return this.b;
  }
}
