public class bci
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  
  public bci(float ☃)
  {
    this(☃, 0.0F, 64, 64);
  }
  
  public bci(float ☃, float ☃, int ☃, int ☃)
  {
    this.a = new bct(this).b(☃, ☃);
    this.a.a(0.0F, 0.0F + ☃, 0.0F);
    this.a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, ☃);
    
    this.f = new bct(this).b(☃, ☃);
    this.f.a(0.0F, ☃ - 2.0F, 0.0F);
    this.f.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2, 4, 2, ☃);
    this.a.a(this.f);
    
    this.b = new bct(this).b(☃, ☃);
    this.b.a(0.0F, 0.0F + ☃, 0.0F);
    this.b.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8, 12, 6, ☃);
    this.b.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, ☃ + 0.5F);
    
    this.c = new bct(this).b(☃, ☃);
    this.c.a(0.0F, 0.0F + ☃ + 2.0F, 0.0F);
    this.c.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4, 8, 4, ☃);
    this.c.a(44, 22).a(4.0F, -2.0F, -2.0F, 4, 8, 4, ☃);
    this.c.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8, 4, 4, ☃);
    
    this.d = new bct(this, 0, 22).b(☃, ☃);
    this.d.a(-2.0F, 12.0F + ☃, 0.0F);
    this.d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, ☃);
    
    this.e = new bct(this, 0, 22).b(☃, ☃);
    this.e.i = true;
    this.e.a(2.0F, 12.0F + ☃, 0.0F);
    this.e.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, ☃);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.a.a(☃);
    this.b.a(☃);
    this.d.a(☃);
    this.e.a(☃);
    this.c.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    this.a.g = (☃ / 57.295776F);
    this.a.f = (☃ / 57.295776F);
    
    this.c.d = 3.0F;
    this.c.e = -1.0F;
    this.c.f = -0.75F;
    
    this.d.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃ * 0.5F);
    this.e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃ * 0.5F);
    this.d.g = 0.0F;
    this.e.g = 0.0F;
  }
}
