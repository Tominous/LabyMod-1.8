public class bkv
  implements blb<ug>
{
  private static final jy a = new jy("textures/entity/enderdragon/dragon_eyes.png");
  private final bir b;
  
  public bkv(bir ☃)
  {
    this.b = ☃;
  }
  
  public void a(ug ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    this.b.a(a);
    bfl.l();
    bfl.c();
    bfl.b(1, 1);
    bfl.f();
    bfl.c(514);
    
    int ☃ = 61680;
    int ☃ = ☃ % 65536;
    int ☃ = ☃ / 65536;
    
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    
    bfl.e();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    this.b.b().a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.b.a(☃, ☃);
    
    bfl.k();
    bfl.d();
    bfl.c(515);
  }
  
  public boolean b()
  {
    return false;
  }
}
