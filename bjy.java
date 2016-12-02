public class bjy
  extends bjo<wb>
{
  private static final jy a = new jy("textures/entity/slime/slime.png");
  
  public bjy(biu ☃, bbo ☃, float ☃)
  {
    super(☃, ☃, ☃);
    
    a(new bld(this));
  }
  
  public void a(wb ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    c = (0.25F * ☃.cm());
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected void a(wb ☃, float ☃)
  {
    float ☃ = ☃.cm();
    float ☃ = (c + (b - c) * ☃) / (☃ * 0.5F + 1.0F);
    float ☃ = 1.0F / (☃ + 1.0F);
    bfl.a(☃ * ☃, 1.0F / ☃ * ☃, ☃ * ☃);
  }
  
  protected jy a(wb ☃)
  {
    return a;
  }
}
