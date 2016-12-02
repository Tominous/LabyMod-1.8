public class blk
  implements blb
{
  private static final jy a = new jy("textures/entity/wolf/wolf_collar.png");
  private final bkl b;
  private static final String __OBFID = "CL_00002405";
  
  public blk(bkl p_i46104_1_)
  {
    b = p_i46104_1_;
  }
  
  public void a(ua p_177145_1_, float p_177145_2_, float p_177145_3_, float p_177145_4_, float p_177145_5_, float p_177145_6_, float p_177145_7_, float p_177145_8_)
  {
    if ((p_177145_1_.cl()) && (!p_177145_1_.ax()))
    {
      b.a(a);
      zd var9 = zd.b(p_177145_1_.cw().a());
      float[] var10 = tv.a(var9);
      if (Config.isCustomColors()) {
        var10 = CustomColorizer.getWolfCollarColors(var9, var10);
      }
      bfl.c(var10[0], var10[1], var10[2]);
      b.b().a(p_177145_1_, p_177145_2_, p_177145_3_, p_177145_5_, p_177145_6_, p_177145_7_, p_177145_8_);
    }
  }
  
  public boolean b()
  {
    return true;
  }
  
  public void a(pr p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
  {
    a((ua)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
  }
}
