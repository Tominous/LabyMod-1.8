public class blc
  implements blb
{
  private static final jy a = new jy("textures/entity/sheep/sheep_fur.png");
  private final bjv b;
  private final bbv c = new bbv();
  private static final String __OBFID = "CL_00002413";
  
  public blc(bjv p_i46112_1_)
  {
    this.b = p_i46112_1_;
  }
  
  public void a(tv p_177162_1_, float p_177162_2_, float p_177162_3_, float p_177162_4_, float p_177162_5_, float p_177162_6_, float p_177162_7_, float p_177162_8_)
  {
    if ((!p_177162_1_.cm()) && (!p_177162_1_.ax()))
    {
      this.b.a(a);
      if ((p_177162_1_.l_()) && ("jeb_".equals(p_177162_1_.aM())))
      {
        boolean var17 = true;
        int var10 = p_177162_1_.W / 25 + p_177162_1_.F();
        int var11 = zd.values().length;
        int var12 = var10 % var11;
        int var13 = (var10 + 1) % var11;
        float var14 = (p_177162_1_.W % 25 + p_177162_4_) / 25.0F;
        float[] var15 = tv.a(zd.b(var12));
        float[] var16 = tv.a(zd.b(var13));
        if (Config.isCustomColors())
        {
          var15 = CustomColorizer.getSheepColors(zd.b(var12), var15);
          var16 = CustomColorizer.getSheepColors(zd.b(var13), var16);
        }
        bfl.c(var15[0] * (1.0F - var14) + var16[0] * var14, var15[1] * (1.0F - var14) + var16[1] * var14, var15[2] * (1.0F - var14) + var16[2] * var14);
      }
      else
      {
        float[] var9 = tv.a(p_177162_1_.cl());
        if (Config.isCustomColors()) {
          var9 = CustomColorizer.getSheepColors(p_177162_1_.cl(), var9);
        }
        bfl.c(var9[0], var9[1], var9[2]);
      }
      this.c.a(this.b.b());
      this.c.a(p_177162_1_, p_177162_2_, p_177162_3_, p_177162_4_);
      this.c.a(p_177162_1_, p_177162_2_, p_177162_3_, p_177162_5_, p_177162_6_, p_177162_7_, p_177162_8_);
    }
  }
  
  public boolean b()
  {
    return true;
  }
  
  public void a(pr p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
  {
    a((tv)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
  }
}
