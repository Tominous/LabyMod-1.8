public class bja
  extends bjo<vr>
{
  private static final jy a = new jy("textures/entity/ghast/ghast.png");
  private static final jy e = new jy("textures/entity/ghast/ghast_shooting.png");
  
  public bja(biu ☃)
  {
    super(☃, new bbf(), 0.5F);
  }
  
  protected jy a(vr ☃)
  {
    if (☃.n()) {
      return e;
    }
    return a;
  }
  
  protected void a(vr ☃, float ☃)
  {
    float ☃ = 1.0F;
    float ☃ = (8.0F + ☃) / 2.0F;
    float ☃ = (8.0F + 1.0F / ☃) / 2.0F;
    bfl.a(☃, ☃, ☃);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
  }
}
