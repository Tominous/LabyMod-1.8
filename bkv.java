import shadersmod.client.Shaders;

public class bkv
  implements blb
{
  private static final jy a = new jy("textures/entity/enderdragon/dragon_eyes.png");
  private final bir b;
  private static final String __OBFID = "CL_00002419";
  
  public bkv(bir p_i46118_1_)
  {
    this.b = p_i46118_1_;
  }
  
  public void a(ug p_177210_1_, float p_177210_2_, float p_177210_3_, float p_177210_4_, float p_177210_5_, float p_177210_6_, float p_177210_7_, float p_177210_8_)
  {
    this.b.a(a);
    bfl.l();
    bfl.c();
    bfl.b(1, 1);
    bfl.f();
    bfl.c(514);
    char var9 = 61680;
    int var10 = var9 % 65536;
    int var11 = var9 / 65536;
    bqs.a(bqs.r, var10 / 1.0F, var11 / 1.0F);
    bfl.e();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if (Config.isShaders()) {
      Shaders.beginSpiderEyes();
    }
    this.b.b().a(p_177210_1_, p_177210_2_, p_177210_3_, p_177210_5_, p_177210_6_, p_177210_7_, p_177210_8_);
    this.b.a(p_177210_1_, p_177210_4_);
    bfl.k();
    bfl.d();
    bfl.c(515);
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void a(pr p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
  {
    a((ug)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
  }
}
