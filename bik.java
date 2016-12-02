public class bik
  extends biv<ux>
{
  private static final jy e = new jy("textures/entity/boat.png");
  protected bbo a = new bax();
  
  public bik(biu ☃)
  {
    super(☃);
    c = 0.5F;
  }
  
  public void a(ux ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.E();
    
    bfl.b((float)☃, (float)☃ + 0.25F, (float)☃);
    
    bfl.b(180.0F - ☃, 0.0F, 1.0F, 0.0F);
    float ☃ = ☃.l() - ☃;
    float ☃ = ☃.j() - ☃;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    if (☃ > 0.0F) {
      bfl.b(ns.a(☃) * ☃ * ☃ / 10.0F * ☃.m(), 1.0F, 0.0F, 0.0F);
    }
    float ☃ = 0.75F;
    bfl.a(☃, ☃, ☃);
    bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
    
    c(☃);
    bfl.a(-1.0F, -1.0F, 1.0F);
    a.a(☃, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(ux ☃)
  {
    return e;
  }
}
