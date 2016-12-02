public class bkw
  implements blb<vo>
{
  private static final jy a = new jy("textures/entity/enderman/enderman_eyes.png");
  private final bis b;
  
  public bkw(bis ☃)
  {
    this.b = ☃;
  }
  
  public void a(vo ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    this.b.a(a);
    
    bfl.l();
    bfl.c();
    bfl.b(1, 1);
    bfl.f();
    bfl.a(!☃.ax());
    
    int ☃ = 61680;
    int ☃ = ☃ % 65536;
    int ☃ = ☃ / 65536;
    
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    
    bfl.e();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    this.b.b().a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.b.a(☃, ☃);
    
    bfl.a(true);
    bfl.k();
    bfl.d();
  }
  
  public boolean b()
  {
    return false;
  }
}
