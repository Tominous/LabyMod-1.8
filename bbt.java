public class bbt
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  protected float g = 8.0F;
  protected float h = 4.0F;
  
  public bbt(int ☃, float ☃)
  {
    this.a = new bct(this, 0, 0);
    this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, ☃);
    this.a.a(0.0F, 18 - ☃, -6.0F);
    
    this.b = new bct(this, 28, 8);
    this.b.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, ☃);
    this.b.a(0.0F, 17 - ☃, 2.0F);
    
    this.c = new bct(this, 0, 16);
    this.c.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    this.c.a(-3.0F, 24 - ☃, 7.0F);
    
    this.d = new bct(this, 0, 16);
    this.d.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    this.d.a(3.0F, 24 - ☃, 7.0F);
    
    this.e = new bct(this, 0, 16);
    this.e.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    this.e.a(-3.0F, 24 - ☃, -5.0F);
    
    this.f = new bct(this, 0, 16);
    this.f.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    this.f.a(3.0F, 24 - ☃, -5.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (this.r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, this.g * ☃, this.h * ☃);
      this.a.a(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
      bfl.F();
    }
    else
    {
      this.a.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = 57.295776F;
    this.a.f = (☃ / 57.295776F);
    this.a.g = (☃ / 57.295776F);
    this.b.f = 1.5707964F;
    
    this.c.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    this.d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    this.e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    this.f.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
  }
}
