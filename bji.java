public class bji
  extends bjo<vu>
{
  private static final jy a = new jy("textures/entity/slime/magmacube.png");
  
  public bji(biu ☃)
  {
    super(☃, new bbl(), 0.25F);
  }
  
  protected jy a(vu ☃)
  {
    return a;
  }
  
  protected void a(vu ☃, float ☃)
  {
    int ☃ = ☃.cm();
    float ☃ = (c + (b - c) * ☃) / (☃ * 0.5F + 1.0F);
    float ☃ = 1.0F / (☃ + 1.0F);
    float ☃ = ☃;
    bfl.a(☃ * ☃, 1.0F / ☃ * ☃, ☃ * ☃);
  }
}
