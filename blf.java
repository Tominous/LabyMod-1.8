public class blf
  implements blb<wc>
{
  private static final jy a = new jy("textures/entity/spider_eyes.png");
  private final bka b;
  
  public blf(bka ☃)
  {
    this.b = ☃;
  }
  
  public void a(wc ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    this.b.a(a);
    
    bfl.l();
    bfl.c();
    bfl.b(1, 1);
    if (☃.ax()) {
      bfl.a(false);
    } else {
      bfl.a(true);
    }
    int ☃ = 61680;
    int ☃ = ☃ % 65536;
    int ☃ = ☃ / 65536;
    
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    this.b.b().a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    ☃ = ☃.b(☃);
    ☃ = ☃ % 65536;
    ☃ = ☃ / 65536;
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    
    this.b.a(☃, ☃);
    
    bfl.k();
    bfl.d();
  }
  
  public boolean b()
  {
    return false;
  }
}
