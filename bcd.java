public class bcd
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  
  public bcd()
  {
    float ☃ = 4.0F;
    float ☃ = 0.0F;
    
    c = new bct(this, 0, 0).b(64, 64);
    c.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, ☃ - 0.5F);
    c.a(0.0F, 0.0F + ☃, 0.0F);
    
    d = new bct(this, 32, 0).b(64, 64);
    d.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, ☃ - 0.5F);
    d.a(0.0F, 0.0F + ☃ + 9.0F - 7.0F, 0.0F);
    
    e = new bct(this, 32, 0).b(64, 64);
    e.a(-1.0F, 0.0F, -1.0F, 12, 2, 2, ☃ - 0.5F);
    e.a(0.0F, 0.0F + ☃ + 9.0F - 7.0F, 0.0F);
    
    a = new bct(this, 0, 16).b(64, 64);
    a.a(-5.0F, -10.0F, -5.0F, 10, 10, 10, ☃ - 0.5F);
    a.a(0.0F, 0.0F + ☃ + 9.0F, 0.0F);
    
    b = new bct(this, 0, 36).b(64, 64);
    b.a(-6.0F, -12.0F, -6.0F, 12, 12, 12, ☃ - 0.5F);
    b.a(0.0F, 0.0F + ☃ + 20.0F, 0.0F);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    c.g = (☃ / 57.295776F);
    c.f = (☃ / 57.295776F);
    a.g = (☃ / 57.295776F * 0.25F);
    
    float ☃ = ns.a(a.g);
    float ☃ = ns.b(a.g);
    
    d.h = 1.0F;
    e.h = -1.0F;
    d.g = (0.0F + a.g);
    e.g = (3.1415927F + a.g);
    
    d.c = (☃ * 5.0F);
    d.e = (-☃ * 5.0F);
    
    e.c = (-☃ * 5.0F);
    e.e = (☃ * 5.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    b.a(☃);
    c.a(☃);
    d.a(☃);
    e.a(☃);
  }
}
