public class bbu
  extends bbo
{
  bct a;
  bct b;
  bct c;
  bct d;
  bct e;
  bct f;
  bct g;
  bct h;
  bct i;
  bct j;
  bct k;
  bct l;
  
  public bbu()
  {
    a("head.main", 0, 0);
    a("head.nose", 0, 24);
    a("head.ear1", 0, 10);
    a("head.ear2", 6, 10);
    
    this.a = new bct(this, 26, 24);
    this.a.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
    this.a.a(3.0F, 17.5F, 3.7F);
    this.a.i = true;
    a(this.a, 0.0F, 0.0F, 0.0F);
    
    this.b = new bct(this, 8, 24);
    this.b.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
    this.b.a(-3.0F, 17.5F, 3.7F);
    this.b.i = true;
    a(this.b, 0.0F, 0.0F, 0.0F);
    
    this.c = new bct(this, 30, 15);
    this.c.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
    this.c.a(3.0F, 17.5F, 3.7F);
    this.c.i = true;
    a(this.c, -0.34906584F, 0.0F, 0.0F);
    
    this.d = new bct(this, 16, 15);
    this.d.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
    this.d.a(-3.0F, 17.5F, 3.7F);
    this.d.i = true;
    a(this.d, -0.34906584F, 0.0F, 0.0F);
    
    this.e = new bct(this, 0, 0);
    this.e.a(-3.0F, -2.0F, -10.0F, 6, 5, 10);
    this.e.a(0.0F, 19.0F, 8.0F);
    this.e.i = true;
    a(this.e, -0.34906584F, 0.0F, 0.0F);
    
    this.f = new bct(this, 8, 15);
    this.f.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
    this.f.a(3.0F, 17.0F, -1.0F);
    this.f.i = true;
    a(this.f, -0.17453292F, 0.0F, 0.0F);
    
    this.g = new bct(this, 0, 15);
    this.g.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
    this.g.a(-3.0F, 17.0F, -1.0F);
    this.g.i = true;
    a(this.g, -0.17453292F, 0.0F, 0.0F);
    
    this.h = new bct(this, 32, 0);
    this.h.a(-2.5F, -4.0F, -5.0F, 5, 4, 5);
    this.h.a(0.0F, 16.0F, -1.0F);
    this.h.i = true;
    a(this.h, 0.0F, 0.0F, 0.0F);
    
    this.i = new bct(this, 52, 0);
    this.i.a(-2.5F, -9.0F, -1.0F, 2, 5, 1);
    this.i.a(0.0F, 16.0F, -1.0F);
    this.i.i = true;
    a(this.i, 0.0F, -0.2617994F, 0.0F);
    
    this.j = new bct(this, 58, 0);
    this.j.a(0.5F, -9.0F, -1.0F, 2, 5, 1);
    this.j.a(0.0F, 16.0F, -1.0F);
    this.j.i = true;
    a(this.j, 0.0F, 0.2617994F, 0.0F);
    
    this.k = new bct(this, 52, 6);
    this.k.a(-1.5F, -1.5F, 0.0F, 3, 3, 2);
    this.k.a(0.0F, 20.0F, 7.0F);
    this.k.i = true;
    a(this.k, -0.3490659F, 0.0F, 0.0F);
    
    this.l = new bct(this, 32, 9);
    this.l.a(-0.5F, -2.5F, -5.5F, 1, 1, 1);
    this.l.a(0.0F, 16.0F, -1.0F);
    this.l.i = true;
    a(this.l, 0.0F, 0.0F, 0.0F);
  }
  
  private void a(bct ☃, float ☃, float ☃, float ☃)
  {
    ☃.f = ☃;
    ☃.g = ☃;
    ☃.h = ☃;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (this.r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, 5.0F * ☃, 2.0F * ☃);
      this.h.a(☃);
      this.j.a(☃);
      this.i.a(☃);
      this.l.a(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      this.a.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
      this.g.a(☃);
      this.k.a(☃);
      bfl.F();
    }
    else
    {
      this.a.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
      this.g.a(☃);
      this.h.a(☃);
      this.i.a(☃);
      this.j.a(☃);
      this.k.a(☃);
      this.l.a(☃);
    }
  }
  
  private float m = 0.0F;
  private float n = 0.0F;
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = ☃ - ☃.W;
    
    tu ☃ = (tu)☃;
    this.l.f = (this.h.f = this.i.f = this.j.f = ☃ * 0.017453292F);
    this.l.g = (this.h.g = ☃ * 0.017453292F);
    this.i.g = (this.l.g - 0.2617994F);
    this.j.g = (this.l.g + 0.2617994F);
    this.m = ns.a(☃.p(☃) * 3.1415927F);
    this.c.f = (this.d.f = (this.m * 50.0F - 21.0F) * 0.017453292F);
    this.a.f = (this.b.f = this.m * 50.0F * 0.017453292F);
    this.f.f = (this.g.f = (this.m * -40.0F - 11.0F) * 0.017453292F);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃) {}
}
