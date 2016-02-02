public class blj
  implements blb<uk>
{
  private static final jy a = new jy("textures/entity/wither/wither_armor.png");
  private final bkj b;
  private final bcl c = new bcl(0.5F);
  
  public blj(bkj ☃)
  {
    this.b = ☃;
  }
  
  public void a(uk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if (!☃.cm()) {
      return;
    }
    bfl.a(!☃.ax());
    
    this.b.a(a);
    
    bfl.n(5890);
    bfl.D();
    
    float ☃ = ☃.W + ☃;
    float ☃ = ns.b(☃ * 0.02F) * 3.0F;
    float ☃ = ☃ * 0.01F;
    bfl.b(☃, ☃, 0.0F);
    
    bfl.n(5888);
    bfl.l();
    
    float ☃ = 0.5F;
    bfl.c(☃, ☃, ☃, 1.0F);
    
    bfl.f();
    bfl.b(1, 1);
    
    this.c.a(☃, ☃, ☃, ☃);
    this.c.a(this.b.b());
    this.c.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    bfl.n(5890);
    bfl.D();
    bfl.n(5888);
    bfl.e();
    bfl.k();
  }
  
  public boolean b()
  {
    return false;
  }
}
