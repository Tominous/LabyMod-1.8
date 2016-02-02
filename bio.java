public class bio
  extends bjo<vn>
{
  private static final jy a = new jy("textures/entity/creeper/creeper.png");
  
  public bio(biu ☃)
  {
    super(☃, new bbc(), 0.5F);
    
    a(new bkr(this));
  }
  
  protected void a(vn ☃, float ☃)
  {
    float ☃ = ☃.a(☃);
    
    float ☃ = 1.0F + ns.a(☃ * 100.0F) * ☃ * 0.01F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    ☃ *= ☃;
    ☃ *= ☃;
    float ☃ = (1.0F + ☃ * 0.4F) * ☃;
    float ☃ = (1.0F + ☃ * 0.1F) / ☃;
    bfl.a(☃, ☃, ☃);
  }
  
  protected int a(vn ☃, float ☃, float ☃)
  {
    float ☃ = ☃.a(☃);
    if ((int)(☃ * 10.0F) % 2 == 0) {
      return 0;
    }
    int ☃ = (int)(☃ * 0.2F * 255.0F);
    ☃ = ns.a(☃, 0, 255);
    
    return ☃ << 24 | 0xFFFFFF;
  }
  
  protected jy a(vn ☃)
  {
    return a;
  }
}
