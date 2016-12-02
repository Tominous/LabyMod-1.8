public class bkb
  extends bjo<tx>
{
  private static final jy a = new jy("textures/entity/squid.png");
  
  public bkb(biu ☃, bbo ☃, float ☃)
  {
    super(☃, ☃, ☃);
  }
  
  protected jy a(tx ☃)
  {
    return a;
  }
  
  protected void a(tx ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = ☃.b + (☃.a - ☃.b) * ☃;
    float ☃ = ☃.bk + (☃.c - ☃.bk) * ☃;
    
    bfl.b(0.0F, 0.5F, 0.0F);
    bfl.b(180.0F - ☃, 0.0F, 1.0F, 0.0F);
    bfl.b(☃, 1.0F, 0.0F, 0.0F);
    bfl.b(☃, 0.0F, 1.0F, 0.0F);
    bfl.b(0.0F, -1.2F, 0.0F);
  }
  
  protected float a(tx ☃, float ☃)
  {
    return ☃.bo + (☃.bn - ☃.bo) * ☃;
  }
}
