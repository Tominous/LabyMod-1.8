public class bck
  extends bci
{
  public boolean g;
  private bct h;
  private bct i;
  
  public bck(float ☃)
  {
    super(☃, 0.0F, 64, 128);
    
    this.h = new bct(this).b(64, 128);
    this.h.a(0.0F, -2.0F, 0.0F);
    this.h.a(0, 0).a(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
    this.f.a(this.h);
    
    this.i = new bct(this).b(64, 128);
    this.i.a(-5.0F, -10.03125F, -5.0F);
    this.i.a(0, 64).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
    this.a.a(this.i);
    
    bct ☃ = new bct(this).b(64, 128);
    ☃.a(1.75F, -4.0F, 2.0F);
    ☃.a(0, 76).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
    ☃.f = -0.05235988F;
    ☃.h = 0.02617994F;
    this.i.a(☃);
    
    bct ☃ = new bct(this).b(64, 128);
    ☃.a(1.75F, -4.0F, 2.0F);
    ☃.a(0, 87).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
    ☃.f = -0.10471976F;
    ☃.h = 0.05235988F;
    ☃.a(☃);
    
    bct ☃ = new bct(this).b(64, 128);
    ☃.a(1.75F, -2.0F, 2.0F);
    ☃.a(0, 95).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
    ☃.f = -0.20943952F;
    ☃.h = 0.10471976F;
    ☃.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.f.o = (this.f.p = this.f.q = 0.0F);
    
    float ☃ = 0.01F * (☃.F() % 10);
    this.f.f = (ns.a(☃.W * ☃) * 4.5F * 3.1415927F / 180.0F);
    this.f.g = 0.0F;
    this.f.h = (ns.b(☃.W * ☃) * 2.5F * 3.1415927F / 180.0F);
    if (this.g)
    {
      this.f.f = -0.9F;
      this.f.q = -0.09375F;
      this.f.p = 0.1875F;
    }
  }
}
