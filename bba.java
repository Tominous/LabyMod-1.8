public class bba
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  public bct g;
  public bct h;
  
  public bba()
  {
    int ☃ = 16;
    a = new bct(this, 0, 0);
    a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
    a.a(0.0F, -1 + ☃, -4.0F);
    
    g = new bct(this, 14, 0);
    g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
    g.a(0.0F, -1 + ☃, -4.0F);
    
    h = new bct(this, 14, 4);
    h.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
    h.a(0.0F, -1 + ☃, -4.0F);
    
    b = new bct(this, 0, 9);
    b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
    b.a(0.0F, ☃, 0.0F);
    
    c = new bct(this, 26, 0);
    c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    c.a(-2.0F, 3 + ☃, 1.0F);
    
    d = new bct(this, 26, 0);
    d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    d.a(1.0F, 3 + ☃, 1.0F);
    
    e = new bct(this, 24, 13);
    e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
    e.a(-4.0F, -3 + ☃, 0.0F);
    
    f = new bct(this, 24, 13);
    f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
    f.a(4.0F, -3 + ☃, 0.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, 5.0F * ☃, 2.0F * ☃);
      a.a(☃);
      g.a(☃);
      h.a(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
      bfl.F();
    }
    else
    {
      a.a(☃);
      g.a(☃);
      h.a(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    a.f = (☃ / 57.295776F);
    a.g = (☃ / 57.295776F);
    
    g.f = a.f;
    g.g = a.g;
    
    h.f = a.f;
    h.g = a.g;
    
    b.f = 1.5707964F;
    
    c.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    e.h = ☃;
    f.h = (-☃);
  }
}
