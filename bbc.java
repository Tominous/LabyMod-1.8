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
    
    this.a = new bct(this, 0, 0);
    this.a.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, ☃);
    this.a.a(0.0F, ☃, 0.0F);
    
    this.b = new bct(this, 32, 0);
    this.b.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, ☃ + 0.5F);
    this.b.a(0.0F, ☃, 0.0F);
    
    this.c = new bct(this, 16, 16);
    this.c.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, ☃);
    this.c.a(0.0F, ☃, 0.0F);
    
    this.d = new bct(this, 0, 16);
    this.d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    this.d.a(-2.0F, 12 + ☃, 4.0F);
    
    this.e = new bct(this, 0, 16);
    this.e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    this.e.a(2.0F, 12 + ☃, 4.0F);
    
    this.f = new bct(this, 0, 16);
    this.f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    this.f.a(-2.0F, 12 + ☃, -4.0F);
    
    this.g = new bct(this, 0, 16);
    this.g.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    this.g.a(2.0F, 12 + ☃, -4.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.a.a(☃);
    this.c.a(☃);
    this.d.a(☃);
    this.e.a(☃);
    this.f.a(☃);
    this.g.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    this.a.g = (☃ / 57.295776F);
    this.a.f = (☃ / 57.295776F);
    
    this.d.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    this.e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    this.f.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    this.g.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
  }
}
