public class biq
  extends biv<uf>
{
  private static final jy a = new jy("textures/entity/endercrystal/endercrystal.png");
  private bbo e = new bcp(0.0F, true);
  
  public biq(biu ☃)
  {
    super(☃);
    this.c = 0.5F;
  }
  
  public void a(uf ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    float ☃ = ☃.a + ☃;
    bfl.E();
    bfl.b((float)☃, (float)☃, (float)☃);
    
    a(a);
    float ☃ = ns.a(☃ * 0.2F) / 2.0F + 0.5F;
    ☃ = ☃ * ☃ + ☃;
    this.e.a(☃, 0.0F, ☃ * 3.0F, ☃ * 0.2F, 0.0F, 0.0F, 0.0625F);
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(uf ☃)
  {
    return a;
  }
}
