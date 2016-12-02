public class baw
  extends bbo
{
  private bct[] a;
  private bct b;
  
  public baw()
  {
    a = new bct[12];
    for (int ☃ = 0; ☃ < a.length; ☃++)
    {
      a[☃] = new bct(this, 0, 16);
      a[☃].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
    }
    b = new bct(this, 0, 0);
    b.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    b.a(☃);
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      a[☃].a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = ☃ * 3.1415927F * -0.1F;
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      a[☃].d = (-2.0F + ns.b((☃ * 2 + ☃) * 0.25F));
      a[☃].c = (ns.b(☃) * 9.0F);
      a[☃].e = (ns.a(☃) * 9.0F);
      ☃ += 1.5707964F;
    }
    ☃ = 0.7853982F + ☃ * 3.1415927F * 0.03F;
    for (int ☃ = 4; ☃ < 8; ☃++)
    {
      a[☃].d = (2.0F + ns.b((☃ * 2 + ☃) * 0.25F));
      a[☃].c = (ns.b(☃) * 7.0F);
      a[☃].e = (ns.a(☃) * 7.0F);
      ☃ += 1.5707964F;
    }
    ☃ = 0.47123894F + ☃ * 3.1415927F * -0.05F;
    for (int ☃ = 8; ☃ < 12; ☃++)
    {
      a[☃].d = (11.0F + ns.b((☃ * 1.5F + ☃) * 0.5F));
      a[☃].c = (ns.b(☃) * 5.0F);
      a[☃].e = (ns.a(☃) * 5.0F);
      ☃ += 1.5707964F;
    }
    b.g = (☃ / 57.295776F);
    b.f = (☃ / 57.295776F);
  }
}
