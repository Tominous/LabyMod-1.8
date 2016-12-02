public class bbc
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  public bct g;
  
  public bbc()
  {
    this(0.0F);
  }
  
  public bbc(float ☃)
  {
    int ☃ = 6;
    
    a = new bct(this, 0, 0);
    a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, ☃);
    a.a(0.0F, ☃, 0.0F);
    
    b = new bct(this, 32, 0);
    b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, ☃ + 0.5F);
    b.a(0.0F, ☃, 0.0F);
    
    c = new bct(this, 16, 16);
    c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, ☃);
    c.a(0.0F, ☃, 0.0F);
    
    d = new bct(this, 0, 16);
    d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    d.a(-2.0F, 12 + ☃, 4.0F);
    
    e = new bct(this, 0, 16);
    e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    e.a(2.0F, 12 + ☃, 4.0F);
    
    f = new bct(this, 0, 16);
    f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    f.a(-2.0F, 12 + ☃, -4.0F);
    
    g = new bct(this, 0, 16);
    g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    g.a(2.0F, 12 + ☃, -4.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    c.a(☃);
    d.a(☃);
    e.a(☃);
    f.a(☃);
    g.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    a.g = (☃ / 57.295776F);
    a.f = (☃ / 57.295776F);
    
    d.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    f.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    g.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
  }
}
