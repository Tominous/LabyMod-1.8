public class bim
  extends bjo<tn>
{
  private static final jy a = new jy("textures/entity/chicken.png");
  
  public bim(biu ☃, bbo ☃, float ☃)
  {
    super(☃, ☃, ☃);
  }
  
  protected jy a(tn ☃)
  {
    return a;
  }
  
  protected float a(tn ☃, float ☃)
  {
    float ☃ = ☃.bq + (☃.bm - ☃.bq) * ☃;
    float ☃ = ☃.bp + (☃.bo - ☃.bp) * ☃;
    
    return (ns.a(☃) + 1.0F) * ☃;
  }
}
