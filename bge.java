public class bge
{
  private bmi[] a = new bmi[2];
  private bmi[] b = new bmi[2];
  private static final String __OBFID = "CL_00002519";
  
  public bge()
  {
    a();
  }
  
  protected void a()
  {
    bmh var1 = ave.A().T();
    a[0] = var1.a("minecraft:blocks/lava_still");
    a[1] = var1.a("minecraft:blocks/lava_flow");
    b[0] = var1.a("minecraft:blocks/water_still");
    b[1] = var1.a("minecraft:blocks/water_flow");
  }
  
  public boolean a(adq p_178270_1_, alz p_178270_2_, cj p_178270_3_, bfd p_178270_4_)
  {
    ahv var5 = (ahv)p_178270_2_.c();
    var5.a(p_178270_1_, p_178270_3_);
    bmi[] var6 = var5.t() == arm.i ? a : b;
    
    int var7 = CustomColorizer.getFluidColor(var5, p_178270_1_, p_178270_3_);
    
    float var8 = (var7 >> 16 & 0xFF) / 255.0F;
    float var9 = (var7 >> 8 & 0xFF) / 255.0F;
    float var10 = (var7 & 0xFF) / 255.0F;
    boolean var11 = var5.a(p_178270_1_, p_178270_3_.a(), cq.b);
    boolean var12 = var5.a(p_178270_1_, p_178270_3_.b(), cq.a);
    
    RenderEnv renderEnv = RenderEnv.getInstance(p_178270_1_, p_178270_2_, p_178270_3_);
    boolean[] var13 = renderEnv.getBorderFlags();
    var13[0] = var5.a(p_178270_1_, p_178270_3_.c(), cq.c);
    var13[1] = var5.a(p_178270_1_, p_178270_3_.d(), cq.d);
    var13[2] = var5.a(p_178270_1_, p_178270_3_.e(), cq.e);
    var13[3] = var5.a(p_178270_1_, p_178270_3_.f(), cq.f);
    if ((!var11) && (!var12) && (var13[0] == 0) && (var13[1] == 0) && (var13[2] == 0) && (var13[3] == 0)) {
      return false;
    }
    boolean var14 = false;
    float var15 = 0.5F;
    float var16 = 1.0F;
    float var17 = 0.8F;
    float var18 = 0.6F;
    arm var19 = var5.t();
    float var20 = a(p_178270_1_, p_178270_3_, var19);
    float var21 = a(p_178270_1_, p_178270_3_.d(), var19);
    float var22 = a(p_178270_1_, p_178270_3_.f().d(), var19);
    float var23 = a(p_178270_1_, p_178270_3_.f(), var19);
    double var24 = p_178270_3_.n();
    double var26 = p_178270_3_.o();
    double var28 = p_178270_3_.p();
    float var30 = 0.001F;
    if (var11)
    {
      var14 = true;
      bmi var31 = var6[0];
      float var32 = (float)ahv.a(p_178270_1_, p_178270_3_, var19);
      if (var32 > -999.0F) {
        var31 = var6[1];
      }
      p_178270_4_.setSprite(var31);
      
      var20 -= var30;
      var21 -= var30;
      var22 -= var30;
      var23 -= var30;
      float var40;
      float var33;
      float var37;
      float var34;
      float var38;
      float var35;
      float var39;
      float var36;
      float var40;
      if (var32 < -999.0F)
      {
        float var33 = var31.a(0.0D);
        float var37 = var31.b(0.0D);
        float var34 = var33;
        float var38 = var31.b(16.0D);
        float var35 = var31.a(16.0D);
        float var39 = var38;
        float var36 = var35;
        var40 = var37;
      }
      else
      {
        float var41 = ns.a(var32) * 0.25F;
        float var42 = ns.b(var32) * 0.25F;
        float var43 = 8.0F;
        var33 = var31.a(8.0F + (-var42 - var41) * 16.0F);
        var37 = var31.b(8.0F + (-var42 + var41) * 16.0F);
        var34 = var31.a(8.0F + (-var42 + var41) * 16.0F);
        var38 = var31.b(8.0F + (var42 + var41) * 16.0F);
        var35 = var31.a(8.0F + (var42 + var41) * 16.0F);
        var39 = var31.b(8.0F + (var42 - var41) * 16.0F);
        var36 = var31.a(8.0F + (var42 - var41) * 16.0F);
        var40 = var31.b(8.0F + (-var42 - var41) * 16.0F);
      }
      int var67 = var5.c(p_178270_1_, p_178270_3_);
      int var68 = var67 >> 16 & 0xFFFF;
      int var70 = var67 & 0xFFFF;
      float var44 = var16 * var8;
      float var45 = var16 * var9;
      float var46 = var16 * var10;
      p_178270_4_.b(var24 + 0.0D, var26 + var20, var28 + 0.0D).a(var44, var45, var46, 1.0F).a(var33, var37).a(var68, var70).d();
      p_178270_4_.b(var24 + 0.0D, var26 + var21, var28 + 1.0D).a(var44, var45, var46, 1.0F).a(var34, var38).a(var68, var70).d();
      p_178270_4_.b(var24 + 1.0D, var26 + var22, var28 + 1.0D).a(var44, var45, var46, 1.0F).a(var35, var39).a(var68, var70).d();
      p_178270_4_.b(var24 + 1.0D, var26 + var23, var28 + 0.0D).a(var44, var45, var46, 1.0F).a(var36, var40).a(var68, var70).d();
      if (var5.g(p_178270_1_, p_178270_3_.a()))
      {
        p_178270_4_.b(var24 + 0.0D, var26 + var20, var28 + 0.0D).a(var44, var45, var46, 1.0F).a(var33, var37).a(var68, var70).d();
        p_178270_4_.b(var24 + 1.0D, var26 + var23, var28 + 0.0D).a(var44, var45, var46, 1.0F).a(var36, var40).a(var68, var70).d();
        p_178270_4_.b(var24 + 1.0D, var26 + var22, var28 + 1.0D).a(var44, var45, var46, 1.0F).a(var35, var39).a(var68, var70).d();
        p_178270_4_.b(var24 + 0.0D, var26 + var21, var28 + 1.0D).a(var44, var45, var46, 1.0F).a(var34, var38).a(var68, var70).d();
      }
    }
    if (var12)
    {
      float var32 = var6[0].e();
      float var33 = var6[0].f();
      float var34 = var6[0].g();
      float var35 = var6[0].h();
      int var62 = var5.c(p_178270_1_, p_178270_3_.b());
      int var63 = var62 >> 16 & 0xFFFF;
      int var64 = var62 & 0xFFFF;
      p_178270_4_.b(var24, var26, var28 + 1.0D).a(var15, var15, var15, 1.0F).a(var32, var35).a(var63, var64).d();
      p_178270_4_.b(var24, var26, var28).a(var15, var15, var15, 1.0F).a(var32, var34).a(var63, var64).d();
      p_178270_4_.b(var24 + 1.0D, var26, var28).a(var15, var15, var15, 1.0F).a(var33, var34).a(var63, var64).d();
      p_178270_4_.b(var24 + 1.0D, var26, var28 + 1.0D).a(var15, var15, var15, 1.0F).a(var33, var35).a(var63, var64).d();
      var14 = true;
    }
    for (int var58 = 0; var58 < 4; var58++)
    {
      int var59 = 0;
      int var60 = 0;
      if (var58 == 0) {
        var60--;
      }
      if (var58 == 1) {
        var60++;
      }
      if (var58 == 2) {
        var59--;
      }
      if (var58 == 3) {
        var59++;
      }
      cj var61 = p_178270_3_.a(var59, 0, var60);
      bmi var31 = var6[1];
      
      p_178270_4_.setSprite(var31);
      if (var13[var58] != 0)
      {
        double var71;
        float var36;
        float var37;
        double var65;
        double var69;
        double var66;
        double var71;
        if (var58 == 0)
        {
          float var36 = var20;
          float var37 = var23;
          double var65 = var24;
          double var69 = var24 + 1.0D;
          double var66 = var28 + var30;
          var71 = var28 + var30;
        }
        else
        {
          double var71;
          if (var58 == 1)
          {
            float var36 = var22;
            float var37 = var21;
            double var65 = var24 + 1.0D;
            double var69 = var24;
            double var66 = var28 + 1.0D - var30;
            var71 = var28 + 1.0D - var30;
          }
          else
          {
            double var71;
            if (var58 == 2)
            {
              float var36 = var21;
              float var37 = var20;
              double var65 = var24 + var30;
              double var69 = var24 + var30;
              double var66 = var28 + 1.0D;
              var71 = var28;
            }
            else
            {
              var36 = var23;
              var37 = var22;
              var65 = var24 + 1.0D - var30;
              var69 = var24 + 1.0D - var30;
              var66 = var28;
              var71 = var28 + 1.0D;
            }
          }
        }
        var14 = true;
        float var46 = var31.a(0.0D);
        float var47 = var31.a(8.0D);
        float var48 = var31.b((1.0F - var36) * 16.0F * 0.5F);
        float var49 = var31.b((1.0F - var37) * 16.0F * 0.5F);
        float var50 = var31.b(8.0D);
        int var51 = var5.c(p_178270_1_, var61);
        int var52 = var51 >> 16 & 0xFFFF;
        int var53 = var51 & 0xFFFF;
        float var54 = var58 < 2 ? var17 : var18;
        float var55 = var16 * var54 * var8;
        float var56 = var16 * var54 * var9;
        float var57 = var16 * var54 * var10;
        p_178270_4_.b(var65, var26 + var36, var66).a(var55, var56, var57, 1.0F).a(var46, var48).a(var52, var53).d();
        p_178270_4_.b(var69, var26 + var37, var71).a(var55, var56, var57, 1.0F).a(var47, var49).a(var52, var53).d();
        p_178270_4_.b(var69, var26 + 0.0D, var71).a(var55, var56, var57, 1.0F).a(var47, var50).a(var52, var53).d();
        p_178270_4_.b(var65, var26 + 0.0D, var66).a(var55, var56, var57, 1.0F).a(var46, var50).a(var52, var53).d();
        p_178270_4_.b(var65, var26 + 0.0D, var66).a(var55, var56, var57, 1.0F).a(var46, var50).a(var52, var53).d();
        p_178270_4_.b(var69, var26 + 0.0D, var71).a(var55, var56, var57, 1.0F).a(var47, var50).a(var52, var53).d();
        p_178270_4_.b(var69, var26 + var37, var71).a(var55, var56, var57, 1.0F).a(var47, var49).a(var52, var53).d();
        p_178270_4_.b(var65, var26 + var36, var66).a(var55, var56, var57, 1.0F).a(var46, var48).a(var52, var53).d();
      }
    }
    p_178270_4_.setSprite(null);
    
    return var14;
  }
  
  private float a(adq p_178269_1_, cj p_178269_2_, arm p_178269_3_)
  {
    int var4 = 0;
    float var5 = 0.0F;
    for (int var6 = 0; var6 < 4; var6++)
    {
      cj var7 = p_178269_2_.a(-(var6 & 0x1), 0, -(var6 >> 1 & 0x1));
      if (p_178269_1_.p(var7.a()).c().t() == p_178269_3_) {
        return 1.0F;
      }
      alz var8 = p_178269_1_.p(var7);
      arm var9 = var8.c().t();
      if (var9 == p_178269_3_)
      {
        int var10 = ((Integer)var8.b(ahv.b)).intValue();
        if ((var10 >= 8) || (var10 == 0))
        {
          var5 += ahv.b(var10) * 10.0F;
          var4 += 10;
        }
        var5 += ahv.b(var10);
        var4++;
      }
      else if (!var9.a())
      {
        var5 += 1.0F;
        var4++;
      }
    }
    return 1.0F - var5 / var4;
  }
}
