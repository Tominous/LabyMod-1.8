public class bcl
  extends bbo
{
  private bct[] a;
  private bct[] b;
  
  public bcl(float ☃)
  {
    t = 64;
    u = 64;
    
    a = new bct[3];
    
    a[0] = new bct(this, 0, 16);
    a[0].a(-10.0F, 3.9F, -0.5F, 20, 3, 3, ☃);
    
    a[1] = new bct(this).b(t, u);
    a[1].a(-2.0F, 6.9F, -0.5F);
    a[1].a(0, 22).a(0.0F, 0.0F, 0.0F, 3, 10, 3, ☃);
    a[1].a(24, 22).a(-4.0F, 1.5F, 0.5F, 11, 2, 2, ☃);
    a[1].a(24, 22).a(-4.0F, 4.0F, 0.5F, 11, 2, 2, ☃);
    a[1].a(24, 22).a(-4.0F, 6.5F, 0.5F, 11, 2, 2, ☃);
    
    a[2] = new bct(this, 12, 22);
    a[2].a(0.0F, 0.0F, 0.0F, 3, 6, 3, ☃);
    
    b = new bct[3];
    b[0] = new bct(this, 0, 0);
    b[0].a(-4.0F, -4.0F, -4.0F, 8, 8, 8, ☃);
    b[1] = new bct(this, 32, 0);
    b[1].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, ☃);
    b[1].c = -8.0F;
    b[1].d = 4.0F;
    b[2] = new bct(this, 32, 0);
    b[2].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, ☃);
    b[2].c = 10.0F;
    b[2].d = 4.0F;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    for (bct ☃ : b) {
      ☃.a(☃);
    }
    for (bct ☃ : a) {
      ☃.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = ns.b(☃ * 0.1F);
    a[1].f = ((0.065F + 0.05F * ☃) * 3.1415927F);
    
    a[2].a(-2.0F, 6.9F + ns.b(a[1].f) * 10.0F, -0.5F + ns.a(a[1].f) * 10.0F);
    a[2].f = ((0.265F + 0.1F * ☃) * 3.1415927F);
    
    b[0].g = (☃ / 57.295776F);
    b[0].f = (☃ / 57.295776F);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    uk ☃ = (uk)☃;
    for (int ☃ = 1; ☃ < 3; ☃++)
    {
      b[☃].g = ((☃.a(☃ - 1) - aI) / 57.295776F);
      b[☃].f = (☃.b(☃ - 1) / 57.295776F);
    }
  }
}
