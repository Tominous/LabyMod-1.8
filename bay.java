public class bay
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  public bct g;
  
  public bay()
  {
    this.a = new bct(this).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
    this.b = new bct(this).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
    
    this.g = new bct(this).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);
    
    this.c = new bct(this).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
    this.d = new bct(this).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
    
    this.e = new bct(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
    this.f = new bct(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
    
    this.a.a(0.0F, 0.0F, -1.0F);
    this.b.a(0.0F, 0.0F, 1.0F);
    
    this.g.g = 1.5707964F;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.a.a(☃);
    this.b.a(☃);
    this.g.a(☃);
    
    this.c.a(☃);
    this.d.a(☃);
    
    this.e.a(☃);
    this.f.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = (ns.a(☃ * 0.02F) * 0.1F + 1.25F) * ☃;
    
    this.a.g = (3.1415927F + ☃);
    this.b.g = (-☃);
    this.c.g = ☃;
    this.d.g = (-☃);
    
    this.e.g = (☃ - ☃ * 2.0F * ☃);
    this.f.g = (☃ - ☃ * 2.0F * ☃);
    
    this.c.c = ns.a(☃);
    this.d.c = ns.a(☃);
    this.e.c = ns.a(☃);
    this.f.c = ns.a(☃);
  }
}
