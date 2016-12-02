public class biw
  extends biv
{
  private static final jy a = new jy("textures/entity/experience_orb.png");
  private static final String __OBFID = "CL_00000993";
  
  public biw(biu p_i46178_1_)
  {
    super(p_i46178_1_);
    c = 0.15F;
    d = 0.75F;
  }
  
  public void a(pp p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
  {
    bfl.E();
    bfl.b((float)p_76986_2_, (float)p_76986_4_, (float)p_76986_6_);
    c(p_76986_1_);
    int var10 = p_76986_1_.l();
    float var11 = (var10 % 4 * 16 + 0) / 64.0F;
    float var12 = (var10 % 4 * 16 + 16) / 64.0F;
    float var13 = (var10 / 4 * 16 + 0) / 64.0F;
    float var14 = (var10 / 4 * 16 + 16) / 64.0F;
    float var15 = 1.0F;
    float var16 = 0.5F;
    float var17 = 0.25F;
    int var18 = p_76986_1_.b(p_76986_9_);
    int var19 = var18 % 65536;
    int var20 = var18 / 65536;
    bqs.a(bqs.r, var19 / 1.0F, var20 / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float var26 = 255.0F;
    float var27 = (a + p_76986_9_) / 2.0F;
    var20 = (int)((ns.a(var27 + 0.0F) + 1.0F) * 0.5F * 255.0F);
    boolean var21 = true;
    int var22 = (int)((ns.a(var27 + 4.1887903F) + 1.0F) * 0.1F * 255.0F);
    bfl.b(180.0F - b.e, 0.0F, 1.0F, 0.0F);
    bfl.b(-b.f, 1.0F, 0.0F, 0.0F);
    float var23 = 0.3F;
    bfl.a(0.3F, 0.3F, 0.3F);
    bfx var24 = bfx.a();
    bfd var25 = var24.c();
    var25.a(7, bms.l);
    
    int red = var20;
    int green = 255;
    int blue = var22;
    if (Config.isCustomColors())
    {
      int col = CustomColorizer.getXpOrbColor(var27);
      if (col >= 0)
      {
        red = col >> 16 & 0xFF;
        green = col >> 8 & 0xFF;
        blue = col >> 0 & 0xFF;
      }
    }
    var25.b(0.0F - var16, 0.0F - var17, 0.0D).a(var11, var14).b(red, green, blue, 128).c(0.0F, 1.0F, 0.0F).d();
    var25.b(var15 - var16, 0.0F - var17, 0.0D).a(var12, var14).b(red, green, blue, 128).c(0.0F, 1.0F, 0.0F).d();
    var25.b(var15 - var16, 1.0F - var17, 0.0D).a(var12, var13).b(red, green, blue, 128).c(0.0F, 1.0F, 0.0F).d();
    var25.b(0.0F - var16, 1.0F - var17, 0.0D).a(var11, var13).b(red, green, blue, 128).c(0.0F, 1.0F, 0.0F).d();
    var24.b();
    bfl.k();
    bfl.C();
    bfl.F();
    super.a(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
  
  protected jy a(pp p_180555_1_)
  {
    return a;
  }
  
  protected jy a(pk p_110775_1_)
  {
    return a((pp)p_110775_1_);
  }
  
  public void a(pk p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_)
  {
    a((pp)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
}
