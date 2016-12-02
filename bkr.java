public class bkr
  implements blb<vn>
{
  private static final jy a = new jy("textures/entity/creeper/creeper_armor.png");
  private final bio b;
  private final bbc c = new bbc(2.0F);
  
  public bkr(bio ☃)
  {
    this.b = ☃;
  }
  
  public void a(vn ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if (!☃.n()) {
      return;
    }
    boolean ☃ = ☃.ax();
    bfl.a(!☃);
    
    this.b.a(a);
    
    bfl.n(5890);
    bfl.D();
    
    float ☃ = ☃.W + ☃;
    bfl.b(☃ * 0.01F, ☃ * 0.01F, 0.0F);
    
    bfl.n(5888);
    bfl.l();
    float ☃ = 0.5F;
    bfl.c(☃, ☃, ☃, 1.0F);
    bfl.f();
    bfl.b(1, 1);
    
    this.c.a(this.b.b());
    this.c.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    bfl.n(5890);
    bfl.D();
    bfl.n(5888);
    bfl.e();
    bfl.k();
    
    bfl.a(☃);
  }
  
  public boolean b()
  {
    return false;
  }
}
