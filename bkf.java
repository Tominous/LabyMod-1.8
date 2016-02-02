public class bkf
  extends biv<vj>
{
  public bkf(biu ☃)
  {
    super(☃);
    this.c = 0.5F;
  }
  
  public void a(vj ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bgd ☃ = ave.A().ae();
    
    bfl.E();
    bfl.b((float)☃, (float)☃ + 0.5F, (float)☃);
    if (☃.a - ☃ + 1.0F < 10.0F)
    {
      float ☃ = 1.0F - (☃.a - ☃ + 1.0F) / 10.0F;
      ☃ = ns.a(☃, 0.0F, 1.0F);
      ☃ *= ☃;
      ☃ *= ☃;
      float ☃ = 1.0F + ☃ * 0.3F;
      bfl.a(☃, ☃, ☃);
    }
    float ☃ = (1.0F - (☃.a - ☃ + 1.0F) / 100.0F) * 0.8F;
    c(☃);
    bfl.b(-0.5F, -0.5F, 0.5F);
    ☃.a(afi.W.Q(), ☃.c(☃));
    bfl.b(0.0F, 0.0F, 1.0F);
    if (☃.a / 5 % 2 == 0)
    {
      bfl.x();
      bfl.f();
      bfl.l();
      bfl.b(770, 772);
      bfl.c(1.0F, 1.0F, 1.0F, ☃);
      bfl.a(-3.0F, -3.0F);
      bfl.q();
      ☃.a(afi.W.Q(), 1.0F);
      bfl.a(0.0F, 0.0F);
      bfl.r();
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      bfl.k();
      bfl.e();
      bfl.w();
    }
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(vj ☃)
  {
    return bmh.g;
  }
}
