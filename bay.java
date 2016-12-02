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
    a = new bct(this).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
    b = new bct(this).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
    
    g = new bct(this).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);
    
    c = new bct(this).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
    d = new bct(this).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
    
    e = new bct(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
    f = new bct(this).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
    
    a.a(0.0F, 0.0F, -1.0F);
    b.a(0.0F, 0.0F, 1.0F);
    
    g.g = 1.5707964F;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    b.a(☃);
    g.a(☃);
    
    c.a(☃);
    d.a(☃);
    
    e.a(☃);
    f.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = (ns.a(☃ * 0.02F) * 0.1F + 1.25F) * ☃;
    
    a.g = (3.1415927F + ☃);
    b.g = (-☃);
    c.g = ☃;
    d.g = (-☃);
    
    e.g = (☃ - ☃ * 2.0F * ☃);
    f.g = (☃ - ☃ * 2.0F * ☃);
    
    c.c = ns.a(☃);
    d.c = ns.a(☃);
    e.c = ns.a(☃);
    f.c = ns.a(☃);
  }
}
