public class bhg
  extends bhd<alf>
{
  private static final jy c = new jy("textures/entity/chest/ender.png");
  private baz d = new baz();
  
  public void a(alf ☃, double ☃, double ☃, double ☃, float ☃, int ☃)
  {
    int ☃ = 0;
    if (☃.t()) {
      ☃ = ☃.u();
    }
    if (☃ >= 0)
    {
      a(a[☃]);
      bfl.n(5890);
      bfl.E();
      bfl.a(4.0F, 4.0F, 1.0F);
      bfl.b(0.0625F, 0.0625F, 0.0625F);
      bfl.n(5888);
    }
    else
    {
      a(c);
    }
    bfl.E();
    bfl.B();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.b((float)☃, (float)☃ + 1.0F, (float)☃ + 1.0F);
    bfl.a(1.0F, -1.0F, -1.0F);
    
    bfl.b(0.5F, 0.5F, 0.5F);
    int ☃ = 0;
    if (☃ == 2) {
      ☃ = 180;
    }
    if (☃ == 3) {
      ☃ = 0;
    }
    if (☃ == 4) {
      ☃ = 90;
    }
    if (☃ == 5) {
      ☃ = -90;
    }
    bfl.b(☃, 0.0F, 1.0F, 0.0F);
    bfl.b(-0.5F, -0.5F, -0.5F);
    
    float ☃ = f + (a - f) * ☃;
    ☃ = 1.0F - ☃;
    ☃ = 1.0F - ☃ * ☃ * ☃;
    
    d.a.f = (-(☃ * 3.1415927F / 2.0F));
    d.a();
    bfl.C();
    bfl.F();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if (☃ >= 0)
    {
      bfl.n(5890);
      bfl.F();
      bfl.n(5888);
    }
  }
}
