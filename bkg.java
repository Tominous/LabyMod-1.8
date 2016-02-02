public class bkg
  extends bjo<ty>
{
  private static final jy a = new jy("textures/entity/iron_golem.png");
  
  public bkg(biu ☃)
  {
    super(☃, new bch(), 0.5F);
    
    a(new blh(this));
  }
  
  protected jy a(ty ☃)
  {
    return a;
  }
  
  protected void a(ty ☃, float ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃);
    if (☃.aB < 0.01D) {
      return;
    }
    float ☃ = 13.0F;
    float ☃ = ☃.aC - ☃.aB * (1.0F - ☃) + 6.0F;
    float ☃ = (Math.abs(☃ % ☃ - ☃ * 0.5F) - ☃ * 0.25F) / (☃ * 0.25F);
    bfl.b(6.5F * ☃, 0.0F, 0.0F, 1.0F);
  }
}
