public class bkj
  extends bjo<uk>
{
  private static final jy a = new jy("textures/entity/wither/wither_invulnerable.png");
  private static final jy e = new jy("textures/entity/wither/wither.png");
  
  public bkj(biu ☃)
  {
    super(☃, new bcl(0.0F), 1.0F);
    
    a(new blj(this));
  }
  
  public void a(uk ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfc.a(☃, true);
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(uk ☃)
  {
    int ☃ = ☃.cl();
    if ((☃ <= 0) || ((☃ <= 80) && (☃ / 5 % 2 == 1))) {
      return e;
    }
    return a;
  }
  
  protected void a(uk ☃, float ☃)
  {
    float ☃ = 2.0F;
    
    int ☃ = ☃.cl();
    if (☃ > 0) {
      ☃ -= (☃ - ☃) / 220.0F * 0.5F;
    }
    bfl.a(☃, ☃, ☃);
  }
}
