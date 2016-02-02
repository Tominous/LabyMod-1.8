public class bkp
  implements blb
{
  private final bln a;
  private static final String __OBFID = "CL_00002425";
  
  public bkp(bln p_i46123_1_)
  {
    this.a = p_i46123_1_;
  }
  
  public void a(bet p_177166_1_, float p_177166_2_, float p_177166_3_, float p_177166_4_, float p_177166_5_, float p_177166_6_, float p_177166_7_, float p_177166_8_)
  {
    if ((p_177166_1_.a()) && (!p_177166_1_.ax()) && (p_177166_1_.a(wo.a)) && (p_177166_1_.k() != null))
    {
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.a(p_177166_1_.k());
      bfl.E();
      bfl.b(0.0F, 0.0F, 0.125F);
      double var9 = p_177166_1_.bq + (p_177166_1_.bt - p_177166_1_.bq) * p_177166_4_ - (p_177166_1_.p + (p_177166_1_.s - p_177166_1_.p) * p_177166_4_);
      double var11 = p_177166_1_.br + (p_177166_1_.bu - p_177166_1_.br) * p_177166_4_ - (p_177166_1_.q + (p_177166_1_.t - p_177166_1_.q) * p_177166_4_);
      double var13 = p_177166_1_.bs + (p_177166_1_.bv - p_177166_1_.bs) * p_177166_4_ - (p_177166_1_.r + (p_177166_1_.u - p_177166_1_.r) * p_177166_4_);
      float var15 = p_177166_1_.aJ + (p_177166_1_.aI - p_177166_1_.aJ) * p_177166_4_;
      double var16 = ns.a(var15 * 3.1415927F / 180.0F);
      double var18 = -ns.b(var15 * 3.1415927F / 180.0F);
      float var20 = (float)var11 * 10.0F;
      var20 = ns.a(var20, -6.0F, 32.0F);
      float var21 = (float)(var9 * var16 + var13 * var18) * 100.0F;
      float var22 = (float)(var9 * var18 - var13 * var16) * 100.0F;
      if (var21 < 0.0F) {
        var21 = 0.0F;
      }
      if (var21 > 165.0F) {
        var21 = 165.0F;
      }
      float var23 = p_177166_1_.bn + (p_177166_1_.bo - p_177166_1_.bn) * p_177166_4_;
      var20 += ns.a((p_177166_1_.L + (p_177166_1_.M - p_177166_1_.L) * p_177166_4_) * 6.0F) * 32.0F * var23;
      if (p_177166_1_.av())
      {
        var20 += 25.0F;
        
        bfl.b(0.0F, 0.142F, -0.0178F);
      }
      bfl.b(6.0F + var21 / 2.0F + var20, 1.0F, 0.0F, 0.0F);
      bfl.b(var22 / 2.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(-var22 / 2.0F, 0.0F, 1.0F, 0.0F);
      bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
      this.a.g().c(0.0625F);
      bfl.F();
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void a(pr p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
  {
    a((bet)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
  }
}
