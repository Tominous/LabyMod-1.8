import shadersmod.client.Shaders;

public class blf
  implements blb
{
  private static final jy a = new jy("textures/entity/spider_eyes.png");
  private final bka b;
  private static final String __OBFID = "CL_00002410";
  
  public blf(bka p_i46109_1_)
  {
    b = p_i46109_1_;
  }
  
  public void a(wc p_177148_1_, float p_177148_2_, float p_177148_3_, float p_177148_4_, float p_177148_5_, float p_177148_6_, float p_177148_7_, float p_177148_8_)
  {
    b.a(a);
    bfl.l();
    bfl.c();
    bfl.b(1, 1);
    if (p_177148_1_.ax()) {
      bfl.a(false);
    } else {
      bfl.a(true);
    }
    char var9 = 61680;
    int var10 = var9 % 65536;
    int var11 = var9 / 65536;
    bqs.a(bqs.r, var10 / 1.0F, var11 / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if (Config.isShaders()) {
      Shaders.beginSpiderEyes();
    }
    b.b().a(p_177148_1_, p_177148_2_, p_177148_3_, p_177148_5_, p_177148_6_, p_177148_7_, p_177148_8_);
    int var12 = p_177148_1_.b(p_177148_4_);
    var10 = var12 % 65536;
    var11 = var12 / 65536;
    bqs.a(bqs.r, var10 / 1.0F, var11 / 1.0F);
    b.a(p_177148_1_, p_177148_4_);
    bfl.k();
    bfl.d();
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void a(pr p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
  {
    a((wc)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
  }
}
