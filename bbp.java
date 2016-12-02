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
    
    g = new bct(this, "head");
    g.a("main", -2.5F, -2.0F, -3.0F, 5, 4, 5);
    g.a("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2);
    g.a("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2);
    g.a("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2);
    g.a(0.0F, 15.0F, -9.0F);
    
    h = new bct(this, 20, 0);
    h.a(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
    h.a(0.0F, 12.0F, -10.0F);
    
    e = new bct(this, 0, 15);
    e.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    e.f = 0.9F;
    e.a(0.0F, 15.0F, 8.0F);
    
    f = new bct(this, 4, 15);
    f.a(-0.5F, 0.0F, 0.0F, 1, 8, 1);
    f.a(0.0F, 20.0F, 14.0F);
    
    a = new bct(this, 8, 13);
    a.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
    a.a(1.1F, 18.0F, 5.0F);
    
    b = new bct(this, 8, 13);
    b.a(-1.0F, 0.0F, 1.0F, 2, 6, 2);
    b.a(-1.1F, 18.0F, 5.0F);
    
    c = new bct(this, 40, 0);
    c.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
    c.a(1.2F, 13.8F, -5.0F);
    
    d = new bct(this, 40, 0);
    d.a(-1.0F, 0.0F, 0.0F, 2, 10, 2);
    d.a(-1.2F, 13.8F, -5.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.a(1.5F / ☃, 1.5F / ☃, 1.5F / ☃);
      bfl.b(0.0F, 10.0F * ☃, 4.0F * ☃);
      g.a(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      h.a(☃);
      a.a(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
      bfl.F();
    }
    else
    {
      g.a(☃);
      h.a(☃);
      e.a(☃);
      f.a(☃);
      a.a(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    g.f = (☃ / 57.295776F);
    g.g = (☃ / 57.295776F);
    if (i != 3)
    {
      h.f = 1.5707964F;
      if (i == 2)
      {
        a.f = (ns.b(☃ * 0.6662F) * 1.0F * ☃);
        b.f = (ns.b(☃ * 0.6662F + 0.3F) * 1.0F * ☃);
        c.f = (ns.b(☃ * 0.6662F + 3.1415927F + 0.3F) * 1.0F * ☃);
        d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.0F * ☃);
        f.f = (1.7278761F + 0.31415927F * ns.b(☃) * ☃);
      }
      else
      {
        a.f = (ns.b(☃ * 0.6662F) * 1.0F * ☃);
        b.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.0F * ☃);
        c.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.0F * ☃);
        d.f = (ns.b(☃ * 0.6662F) * 1.0F * ☃);
        if (i == 1) {
          f.f = (1.7278761F + 0.7853982F * ns.b(☃) * ☃);
        } else {
          f.f = (1.7278761F + 0.47123894F * ns.b(☃) * ☃);
        }
      }
    }
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    ts ☃ = (ts)☃;
    
    h.d = 12.0F;
    h.e = -10.0F;
    g.d = 15.0F;
    g.e = -9.0F;
    e.d = 15.0F;
    e.e = 8.0F;
    f.d = 20.0F;
    f.e = 14.0F;
    c.d = (d.d = 13.8F);
    c.e = (d.e = -5.0F);
    a.d = (b.d = 18.0F);
    a.e = (b.e = 5.0F);
    e.f = 0.9F;
    if (☃.av())
    {
      h.d += 1.0F;
      g.d += 2.0F;
      e.d += 1.0F;
      f.d += -4.0F;
      f.e += 2.0F;
      e.f = 1.5707964F;
      f.f = 1.5707964F;
      i = 0;
    }
    else if (☃.aw())
    {
      f.d = e.d;
      f.e += 2.0F;
      e.f = 1.5707964F;
      f.f = 1.5707964F;
      i = 2;
    }
    else if (☃.cn())
    {
      h.f = 0.7853982F;
      h.d += -4.0F;
      h.e += 5.0F;
      g.d += -3.3F;
      g.e += 1.0F;
      
      e.d += 8.0F;
      e.e += -2.0F;
      f.d += 2.0F;
      f.e += -0.8F;
      e.f = 1.7278761F;
      f.f = 2.670354F;
      
      c.f = (d.f = -0.15707964F);
      c.d = (d.d = 15.8F);
      c.e = (d.e = -7.0F);
      
      a.f = (b.f = -1.5707964F);
      a.d = (b.d = 21.0F);
      a.e = (b.e = 1.0F);
      i = 3;
    }
    else
    {
      i = 1;
    }
  }
}
