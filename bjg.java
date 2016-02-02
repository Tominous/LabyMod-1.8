import org.lwjgl.opengl.GL11;
import shadersmod.client.ShadersTex;

public class bjg
  extends biv
{
  private static final jy a = new jy("textures/map/map_background.png");
  private final ave e = ave.A();
  private final bov f = new bov("item_frame", "normal");
  private final bov g = new bov("item_frame", "map");
  private bjh h;
  private static final String __OBFID = "CL_00001002";
  
  public bjg(biu p_i46166_1_, bjh p_i46166_2_)
  {
    super(p_i46166_1_);
    this.h = p_i46166_2_;
  }
  
  public void a(uo p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
  {
    bfl.E();
    cj var10 = p_76986_1_.n();
    double var11 = var10.n() - p_76986_1_.s + p_76986_2_;
    double var13 = var10.o() - p_76986_1_.t + p_76986_4_;
    double var15 = var10.p() - p_76986_1_.u + p_76986_6_;
    bfl.b(var11 + 0.5D, var13 + 0.5D, var15 + 0.5D);
    bfl.b(180.0F - p_76986_1_.y, 0.0F, 1.0F, 0.0F);
    this.b.a.a(bmh.g);
    bgd var17 = this.e.ae();
    bou var18 = var17.a().b();
    boq var19;
    boq var19;
    if ((p_76986_1_.o() != null) && (p_76986_1_.o().b() == zy.bd)) {
      var19 = var18.a(this.g);
    } else {
      var19 = var18.a(this.f);
    }
    bfl.E();
    bfl.b(-0.5F, -0.5F, -0.5F);
    var17.b().a(var19, 1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
    bfl.b(0.0F, 0.0F, 0.4375F);
    b(p_76986_1_);
    bfl.F();
    a(p_76986_1_, p_76986_2_ + p_76986_1_.b.g() * 0.3F, p_76986_4_ - 0.25D, p_76986_6_ + p_76986_1_.b.i() * 0.3F);
  }
  
  protected jy a(uo p_110775_1_)
  {
    return null;
  }
  
  private void b(uo p_82402_1_)
  {
    zx var2 = p_82402_1_.o();
    if (var2 != null)
    {
      uz var3 = new uz(p_82402_1_.o, 0.0D, 0.0D, 0.0D, var2);
      zw var4 = var3.l().b();
      var3.l().b = 1;
      var3.a = 0.0F;
      bfl.E();
      bfl.f();
      int var5 = p_82402_1_.p();
      if ((var4 instanceof aab)) {
        var5 = var5 % 4 * 2;
      }
      bfl.b(var5 * 360.0F / 8.0F, 0.0F, 0.0F, 1.0F);
      if (!Reflector.postForgeBusEvent(Reflector.RenderItemInFrameEvent_Constructor, new Object[] { p_82402_1_, this })) {
        if ((var4 instanceof aab))
        {
          this.b.a.a(a);
          bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
          float var6 = 0.0078125F;
          bfl.a(var6, var6, var6);
          bfl.b(-64.0F, -64.0F, 0.0F);
          atg var7 = zy.bd.a(var3.l(), p_82402_1_.o);
          bfl.b(0.0F, 0.0F, -1.0F);
          if (var7 != null) {
            this.e.o.k().a(var7, true);
          }
        }
        else
        {
          bmi var12 = null;
          if (var4 == zy.aQ)
          {
            var12 = this.e.T().a(bmp.l);
            if (Config.isShaders()) {
              ShadersTex.bindTextureMapForUpdateAndRender(this.e.P(), bmh.g);
            } else {
              this.e.P().a(bmh.g);
            }
            if ((var12 instanceof bmp))
            {
              bmp var13 = (bmp)var12;
              double var8 = var13.j;
              double var10 = var13.k;
              var13.j = 0.0D;
              var13.k = 0.0D;
              var13.a(p_82402_1_.o, p_82402_1_.s, p_82402_1_.u, ns.g(180 + p_82402_1_.b.b() * 90), false, true);
              var13.j = var8;
              var13.k = var10;
            }
            else
            {
              var12 = null;
            }
          }
          bfl.a(0.5F, 0.5F, 0.5F);
          if ((!this.h.a(var3.l())) || ((var4 instanceof aat))) {
            bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
          }
          bfl.a();
          avc.b();
          this.h.a(var3.l(), bgr.b.g);
          avc.a();
          bfl.b();
          if ((var12 != null) && (var12.k() > 0)) {
            var12.j();
          }
        }
      }
      bfl.e();
      bfl.F();
    }
    if (Config.isShaders()) {
      ShadersTex.updatingTex = null;
    }
  }
  
  protected void a(uo p_147914_1_, double p_147914_2_, double p_147914_4_, double p_147914_6_)
  {
    if ((ave.v()) && (p_147914_1_.o() != null) && (p_147914_1_.o().s()) && (this.b.d == p_147914_1_))
    {
      float var8 = 1.6F;
      float var9 = 0.016666668F * var8;
      double var10 = p_147914_1_.h(this.b.c);
      float var12 = p_147914_1_.av() ? 32.0F : 64.0F;
      if (var10 < var12 * var12)
      {
        String var13 = p_147914_1_.o().q();
        if (p_147914_1_.av())
        {
          avn var14 = c();
          bfl.E();
          bfl.b((float)p_147914_2_ + 0.0F, (float)p_147914_4_ + p_147914_1_.K + 0.5F, (float)p_147914_6_);
          GL11.glNormal3f(0.0F, 1.0F, 0.0F);
          bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
          bfl.b(this.b.f, 1.0F, 0.0F, 0.0F);
          bfl.a(-var9, -var9, var9);
          bfl.f();
          bfl.b(0.0F, 0.25F / var9, 0.0F);
          bfl.a(false);
          bfl.l();
          bfl.b(770, 771);
          bfx var15 = bfx.a();
          bfd var16 = var15.c();
          int var17 = var14.a(var13) / 2;
          bfl.x();
          var16.a(7, bms.f);
          var16.b(-var17 - 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          var16.b(-var17 - 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          var16.b(var17 + 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          var16.b(var17 + 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          var15.b();
          bfl.w();
          bfl.a(true);
          var14.a(var13, -var14.a(var13) / 2, 0, 553648127);
          bfl.e();
          bfl.k();
          bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
          bfl.F();
        }
        else
        {
          a(p_147914_1_, var13, p_147914_2_, p_147914_4_, p_147914_6_, 64);
        }
      }
    }
  }
  
  protected jy a(pk p_110775_1_)
  {
    return a((uo)p_110775_1_);
  }
  
  protected void a(pk p_177067_1_, double p_177067_2_, double p_177067_4_, double p_177067_6_)
  {
    a((uo)p_177067_1_, p_177067_2_, p_177067_4_, p_177067_6_);
  }
  
  public void a(pk p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
  {
    a((uo)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
}
