import shadersmod.client.Shaders;

public class bkw
  implements blb
{
  private static final jy a = new jy("textures/entity/enderman/enderman_eyes.png");
  private final bis b;
  private static final String __OBFID = "CL_00002418";
  
  public bkw(bis p_i46117_1_)
  {
    this.b = p_i46117_1_;
  }
  
  public void a(vo p_177201_1_, float p_177201_2_, float p_177201_3_, float p_177201_4_, float p_177201_5_, float p_177201_6_, float p_177201_7_, float p_177201_8_)
  {
    this.b.a(a);
    bfl.l();
    bfl.c();
    bfl.b(1, 1);
    bfl.f();
    bfl.a(!p_177201_1_.ax());
    char var9 = 61680;
    int var10 = var9 % 65536;
    int var11 = var9 / 65536;
    bqs.a(bqs.r, var10 / 1.0F, var11 / 1.0F);
    bfl.e();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if (Config.isShaders()) {
      Shaders.beginSpiderEyes();
    }
    this.b.b().a(p_177201_1_, p_177201_2_, p_177201_3_, p_177201_5_, p_177201_6_, p_177201_7_, p_177201_8_);
    this.b.a(p_177201_1_, p_177201_4_);
    bfl.a(true);
    bfl.k();
    bfl.d();
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void a(pr p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
  {
    a((vo)p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_);
  }
}
