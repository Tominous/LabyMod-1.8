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
    this.a = new bct(this, 0, 0);
    this.a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
    this.a.a(0.0F, -1 + ☃, -4.0F);
    
    this.g = new bct(this, 14, 0);
    this.g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
    this.g.a(0.0F, -1 + ☃, -4.0F);
    
    this.h = new bct(this, 14, 4);
    this.h.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
    this.h.a(0.0F, -1 + ☃, -4.0F);
    
    this.b = new bct(this, 0, 9);
    this.b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
    this.b.a(0.0F, ☃, 0.0F);
    
    this.c = new bct(this, 26, 0);
    this.c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    this.c.a(-2.0F, 3 + ☃, 1.0F);
    
    this.d = new bct(this, 26, 0);
    this.d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    this.d.a(1.0F, 3 + ☃, 1.0F);
    
    this.e = new bct(this, 24, 13);
    this.e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
    this.e.a(-4.0F, -3 + ☃, 0.0F);
    
    this.f = new bct(this, 24, 13);
    this.f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
    this.f.a(4.0F, -3 + ☃, 0.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (this.r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, 5.0F * ☃, 2.0F * ☃);
      this.a.a(☃);
      this.g.a(☃);
      this.h.a(☃);
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
      this.g.a(☃);
      this.h.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    this.a.f = (☃ / 57.295776F);
    this.a.g = (☃ / 57.295776F);
    
    this.g.f = this.a.f;
    this.g.g = this.a.g;
    
    this.h.f = this.a.f;
    this.h.g = this.a.g;
    
    this.b.f = 1.5707964F;
    
    this.c.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    this.d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    this.e.h = ☃;
    this.f.h = (-☃);
  }
}
