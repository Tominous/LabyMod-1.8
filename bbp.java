public class bbp
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
  int i = 1;
  
  public bbp()
  {
    a("head.main", 0, 0);
    a("head.nose", 0, 24);
    a("head.ear1", 0, 10);
    a("head.ear2", 6, 10);
    
    this.g = new bct(this, "head");
    this.g.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
    this.g.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
    this.g.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
    this.g.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
    this.g.a(0.0F, 15.0F, -9.0F);
    
    this.h = new bct(this, 20, 0);
    this.h.a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
    this.h.a(0.0F, 12.0F, -10.0F);
    
    this.e = new bct(this, 0, 15);
    this.e.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    this.e.f = 0.9F;
    this.e.a(0.0F, 15.0F, 8.0F);
    
    this.f = new bct(this, 4, 15);
    this.f.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    this.f.a(0.0F, 20.0F, 14.0F);
    
    this.a = new bct(this, 8, 13);
    this.a.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
    this.a.a(1.1F, 18.0F, 5.0F);
    
    this.b = new bct(this, 8, 13);
    this.b.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
    this.b.a(-1.1F, 18.0F, 5.0F);
    
    this.c = new bct(this, 40, 0);
    this.c.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
    this.c.a(1.2F, 13.8F, -5.0F);
    
    this.d = new bct(this, 40, 0);
    this.d.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
    this.d.a(-1.2F, 13.8F, -5.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (this.r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.a(1.5F / ☃, 1.5F / ☃, 1.5F / ☃);
      bfl.b(0.0F, 10.0F * ☃, 4.0F * ☃);
      this.g.a(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      this.h.a(☃);
      this.a.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
      bfl.F();
    }
    else
    {
      this.g.a(☃);
      this.h.a(☃);
      this.e.a(☃);
      this.f.a(☃);
      this.a.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    this.g.f = (☃ / 57.295776F);
    this.g.g = (☃ / 57.295776F);
    if (this.i != 3)
    {
      this.h.f = 1.5707964F;
      if (this.i == 2)
      {
        this.a.f = (ns.b(☃ * 0.6662F) * 1.0F * ☃);
        this.b.f = (ns.b(☃ * 0.6662F + 0.3F) * 1.0F * ☃);
        this.c.f = (ns.b(☃ * 0.6662F + 3.1415927F + 0.3F) * 1.0F * ☃);
        this.d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.0F * ☃);
        this.f.f = (1.7278761F + 0.31415927F * ns.b(☃) * ☃);
      }
      else
      {
        this.a.f = (ns.b(☃ * 0.6662F) * 1.0F * ☃);
        this.b.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.0F * ☃);
        this.c.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.0F * ☃);
        this.d.f = (ns.b(☃ * 0.6662F) * 1.0F * ☃);
        if (this.i == 1) {
          this.f.f = (1.7278761F + 0.7853982F * ns.b(☃) * ☃);
        } else {
          this.f.f = (1.7278761F + 0.47123894F * ns.b(☃) * ☃);
        }
      }
    }
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    ts ☃ = (ts)☃;
    
    this.h.d = 12.0F;
    this.h.e = -10.0F;
    this.g.d = 15.0F;
    this.g.e = -9.0F;
    this.e.d = 15.0F;
    this.e.e = 8.0F;
    this.f.d = 20.0F;
    this.f.e = 14.0F;
    this.c.d = (this.d.d = 13.8F);
    this.c.e = (this.d.e = -5.0F);
    this.a.d = (this.b.d = 18.0F);
    this.a.e = (this.b.e = 5.0F);
    this.e.f = 0.9F;
    if (☃.av())
    {
      this.h.d += 1.0F;
      this.g.d += 2.0F;
      this.e.d += 1.0F;
      this.f.d += -4.0F;
      this.f.e += 2.0F;
      this.e.f = 1.5707964F;
      this.f.f = 1.5707964F;
      this.i = 0;
    }
    else if (☃.aw())
    {
      this.f.d = this.e.d;
      this.f.e += 2.0F;
      this.e.f = 1.5707964F;
      this.f.f = 1.5707964F;
      this.i = 2;
    }
    else if (☃.cn())
    {
      this.h.f = 0.7853982F;
      this.h.d += -4.0F;
      this.h.e += 5.0F;
      this.g.d += -3.3F;
      this.g.e += 1.0F;
      
      this.e.d += 8.0F;
      this.e.e += -2.0F;
      this.f.d += 2.0F;
      this.f.e += -0.8F;
      this.e.f = 1.7278761F;
      this.f.f = 2.670354F;
      
      this.c.f = (this.d.f = -0.15707964F);
      this.c.d = (this.d.d = 15.8F);
      this.c.e = (this.d.e = -7.0F);
      
      this.a.f = (this.b.f = -1.5707964F);
      this.a.d = (this.b.d = 21.0F);
      this.a.e = (this.b.e = 1.0F);
      this.i = 3;
    }
    else
    {
      this.i = 1;
    }
  }
}
