public class bcl
  extends bbo
{
  private bct[] a;
  private bct[] b;
  
  public bcl(float ☃)
  {
    this.t = 64;
    this.u = 64;
    
    this.a = new bct[3];
    
    this.a[0] = new bct(this, 0, 16);
    this.a[0].a(-10.0F, 3.9F, -0.5F, 20, 3, 3, ☃);
    
    this.a[1] = new bct(this).b(this.t, this.u);
    this.a[1].a(-2.0F, 6.9F, -0.5F);
    this.a[1].a(0, 22).a(0.0F, 0.0F, 0.0F, 3, 10, 3, ☃);
    this.a[1].a(24, 22).a(-4.0F, 1.5F, 0.5F, 11, 2, 2, ☃);
    this.a[1].a(24, 22).a(-4.0F, 4.0F, 0.5F, 11, 2, 2, ☃);
    this.a[1].a(24, 22).a(-4.0F, 6.5F, 0.5F, 11, 2, 2, ☃);
    
    this.a[2] = new bct(this, 12, 22);
    this.a[2].a(0.0F, 0.0F, 0.0F, 3, 6, 3, ☃);
    
    this.b = new bct[3];
    this.b[0] = new bct(this, 0, 0);
    this.b[0].a(-4.0F, -4.0F, -4.0F, 8, 8, 8, ☃);
    this.b[1] = new bct(this, 32, 0);
    this.b[1].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, ☃);
    this.b[1].c = -8.0F;
    this.b[1].d = 4.0F;
    this.b[2] = new bct(this, 32, 0);
    this.b[2].a(-4.0F, -4.0F, -4.0F, 6, 6, 6, ☃);
    this.b[2].c = 10.0F;
    this.b[2].d = 4.0F;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    for (bct ☃ : this.b) {
      ☃.a(☃);
    }
    for (bct ☃ : this.a) {
      ☃.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = ns.b(☃ * 0.1F);
    this.a[1].f = ((0.065F + 0.05F * ☃) * 3.1415927F);
    
    this.a[2].a(-2.0F, 6.9F + ns.b(this.a[1].f) * 10.0F, -0.5F + ns.a(this.a[1].f) * 10.0F);
    this.a[2].f = ((0.265F + 0.1F * ☃) * 3.1415927F);
    
    this.b[0].g = (☃ / 57.295776F);
    this.b[0].f = (☃ / 57.295776F);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    uk ☃ = (uk)☃;
    for (int ☃ = 1; ☃ < 3; ☃++)
    {
      this.b[☃].g = ((☃.a(☃ - 1) - ☃.aI) / 57.295776F);
      this.b[☃].f = (☃.b(☃ - 1) / 57.295776F);
    }
  }
}
