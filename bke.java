public class bke
  extends bjm<vi>
{
  public bke(biu ☃)
  {
    super(☃);
  }
  
  protected void a(vi ☃, float ☃, alz ☃)
  {
    int ☃ = ☃.l();
    if ((☃ > -1) && 
      (☃ - ☃ + 1.0F < 10.0F))
    {
      float ☃ = 1.0F - (☃ - ☃ + 1.0F) / 10.0F;
      ☃ = ns.a(☃, 0.0F, 1.0F);
      ☃ *= ☃;
      ☃ *= ☃;
      float ☃ = 1.0F + ☃ * 0.3F;
      bfl.a(☃, ☃, ☃);
    }
    super.a(☃, ☃, ☃);
    if ((☃ > -1) && (☃ / 5 % 2 == 0))
    {
      bgd ☃ = ave.A().ae();
      
      bfl.x();
      bfl.f();
      bfl.l();
      bfl.b(770, 772);
      bfl.c(1.0F, 1.0F, 1.0F, (1.0F - (☃ - ☃ + 1.0F) / 100.0F) * 0.8F);
      
      bfl.E();
      ☃.a(afi.W.Q(), 1.0F);
      bfl.F();
      
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.k();
      bfl.e();
      bfl.w();
    }
  }
}
