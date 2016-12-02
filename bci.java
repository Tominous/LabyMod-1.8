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
    a = new bct(this).b(☃, ☃);
    a.a(0.0F, 0.0F + ☃, 0.0F);
    a.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, ☃);
    
    f = new bct(this).b(☃, ☃);
    f.a(0.0F, ☃ - 2.0F, 0.0F);
    f.a(24, 0).a(-1.0F, -1.0F, -6.0F, 2, 4, 2, ☃);
    a.a(f);
    
    b = new bct(this).b(☃, ☃);
    b.a(0.0F, 0.0F + ☃, 0.0F);
    b.a(16, 20).a(-4.0F, 0.0F, -3.0F, 8, 12, 6, ☃);
    b.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8, 18, 6, ☃ + 0.5F);
    
    c = new bct(this).b(☃, ☃);
    c.a(0.0F, 0.0F + ☃ + 2.0F, 0.0F);
    c.a(44, 22).a(-8.0F, -2.0F, -2.0F, 4, 8, 4, ☃);
    c.a(44, 22).a(4.0F, -2.0F, -2.0F, 4, 8, 4, ☃);
    c.a(40, 38).a(-4.0F, 2.0F, -2.0F, 8, 4, 4, ☃);
    
    d = new bct(this, 0, 22).b(☃, ☃);
    d.a(-2.0F, 12.0F + ☃, 0.0F);
    d.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, ☃);
    
    e = new bct(this, 0, 22).b(☃, ☃);
    e.i = true;
    e.a(2.0F, 12.0F + ☃, 0.0F);
    e.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, ☃);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    b.a(☃);
    d.a(☃);
    e.a(☃);
    c.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    a.g = (☃ / 57.295776F);
    a.f = (☃ / 57.295776F);
    
    c.d = 3.0F;
    c.e = -1.0F;
    c.f = -0.75F;
    
    d.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃ * 0.5F);
    e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃ * 0.5F);
    d.g = 0.0F;
    e.g = 0.0F;
  }
}
