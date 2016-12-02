public class bav
  extends bbo
{
  private bct a;
  private bct b;
  private bct c;
  private bct d;
  private bct e;
  private bct f;
  
  public bav()
  {
    t = 64;
    u = 64;
    
    a = new bct(this, 0, 0);
    a.a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    
    bct ☃ = new bct(this, 24, 0);
    ☃.a(-4.0F, -6.0F, -2.0F, 3, 4, 1);
    a.a(☃);
    bct ☃ = new bct(this, 24, 0);
    i = true;
    ☃.a(1.0F, -6.0F, -2.0F, 3, 4, 1);
    a.a(☃);
    
    b = new bct(this, 0, 16);
    b.a(-3.0F, 4.0F, -3.0F, 6, 12, 6);
    b.a(0, 34).a(-5.0F, 16.0F, 0.0F, 10, 6, 1);
    
    c = new bct(this, 42, 0);
    c.a(-12.0F, 1.0F, 1.5F, 10, 16, 1);
    e = new bct(this, 24, 16);
    e.a(-12.0F, 1.0F, 1.5F);
    e.a(-8.0F, 1.0F, 0.0F, 8, 12, 1);
    
    d = new bct(this, 42, 0);
    d.i = true;
    d.a(2.0F, 1.0F, 1.5F, 10, 16, 1);
    f = new bct(this, 24, 16);
    f.i = true;
    f.a(12.0F, 1.0F, 1.5F);
    f.a(0.0F, 1.0F, 0.0F, 8, 12, 1);
    
    b.a(c);
    b.a(d);
    c.a(e);
    d.a(f);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    b.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    if (((tk)☃).n())
    {
      float ☃ = 57.295776F;
      a.f = (☃ / 57.295776F);
      a.g = (3.1415927F - ☃ / 57.295776F);
      a.h = 3.1415927F;
      
      a.a(0.0F, -2.0F, 0.0F);
      c.a(-3.0F, 0.0F, 3.0F);
      d.a(3.0F, 0.0F, 3.0F);
      
      b.f = 3.1415927F;
      
      c.f = -0.15707964F;
      c.g = -1.2566371F;
      e.g = -1.7278761F;
      d.f = c.f;
      d.g = (-c.g);
      f.g = (-e.g);
    }
    else
    {
      float ☃ = 57.295776F;
      a.f = (☃ / 57.295776F);
      a.g = (☃ / 57.295776F);
      a.h = 0.0F;
      
      a.a(0.0F, 0.0F, 0.0F);
      c.a(0.0F, 0.0F, 0.0F);
      d.a(0.0F, 0.0F, 0.0F);
      
      b.f = (0.7853982F + ns.b(☃ * 0.1F) * 0.15F);
      b.g = 0.0F;
      
      c.g = (ns.b(☃ * 1.3F) * 3.1415927F * 0.25F);
      d.g = (-c.g);
      e.g = (c.g * 0.5F);
      f.g = (-c.g * 0.5F);
    }
  }
}
