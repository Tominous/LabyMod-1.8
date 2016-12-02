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
    
    a = new bct(this, 26, 24);
    a.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
    a.a(3.0F, 17.5F, 3.7F);
    a.i = true;
    a(a, 0.0F, 0.0F, 0.0F);
    
    b = new bct(this, 8, 24);
    b.a(-1.0F, 5.5F, -3.7F, 2, 1, 7);
    b.a(-3.0F, 17.5F, 3.7F);
    b.i = true;
    a(b, 0.0F, 0.0F, 0.0F);
    
    c = new bct(this, 30, 15);
    c.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
    c.a(3.0F, 17.5F, 3.7F);
    c.i = true;
    a(c, -0.34906584F, 0.0F, 0.0F);
    
    d = new bct(this, 16, 15);
    d.a(-1.0F, 0.0F, 0.0F, 2, 4, 5);
    d.a(-3.0F, 17.5F, 3.7F);
    d.i = true;
    a(d, -0.34906584F, 0.0F, 0.0F);
    
    e = new bct(this, 0, 0);
    e.a(-3.0F, -2.0F, -10.0F, 6, 5, 10);
    e.a(0.0F, 19.0F, 8.0F);
    e.i = true;
    a(e, -0.34906584F, 0.0F, 0.0F);
    
    f = new bct(this, 8, 15);
    f.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
    f.a(3.0F, 17.0F, -1.0F);
    f.i = true;
    a(f, -0.17453292F, 0.0F, 0.0F);
    
    g = new bct(this, 0, 15);
    g.a(-1.0F, 0.0F, -1.0F, 2, 7, 2);
    g.a(-3.0F, 17.0F, -1.0F);
    g.i = true;
    a(g, -0.17453292F, 0.0F, 0.0F);
    
    h = new bct(this, 32, 0);
    h.a(-2.5F, -4.0F, -5.0F, 5, 4, 5);
    h.a(0.0F, 16.0F, -1.0F);
    h.i = true;
    a(h, 0.0F, 0.0F, 0.0F);
    
    i = new bct(this, 52, 0);
    i.a(-2.5F, -9.0F, -1.0F, 2, 5, 1);
    i.a(0.0F, 16.0F, -1.0F);
    i.i = true;
    a(i, 0.0F, -0.2617994F, 0.0F);
    
    j = new bct(this, 58, 0);
    j.a(0.5F, -9.0F, -1.0F, 2, 5, 1);
    j.a(0.0F, 16.0F, -1.0F);
    j.i = true;
    a(j, 0.0F, 0.2617994F, 0.0F);
    
    k = new bct(this, 52, 6);
    k.a(-1.5F, -1.5F, 0.0F, 3, 3, 2);
    k.a(0.0F, 20.0F, 7.0F);
    k.i = true;
    a(k, -0.3490659F, 0.0F, 0.0F);
    
    l = new bct(this, 32, 9);
    l.a(-0.5F, -2.5F, -5.5F, 1, 1, 1);
    l.a(0.0F, 16.0F, -1.0F);
    l.i = true;
    a(l, 0.0F, 0.0F, 0.0F);
  }
  
  private void a(bct ☃, float ☃, float ☃, float ☃)
  {
    f = ☃;
    g = ☃;
    h = ☃;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, 5.0F * ☃, 2.0F * ☃);
      h.a(☃);
      j.a(☃);
      i.a(☃);
      l.a(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      a.a(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
      g.a(☃);
      k.a(☃);
      bfl.F();
    }
    else
    {
      a.a(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
      g.a(☃);
      h.a(☃);
      i.a(☃);
      j.a(☃);
      k.a(☃);
      l.a(☃);
    }
  }
  
  private float m = 0.0F;
  private float n = 0.0F;
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = ☃ - W;
    
    tu ☃ = (tu)☃;
    l.f = (h.f = i.f = j.f = ☃ * 0.017453292F);
    l.g = (h.g = ☃ * 0.017453292F);
    i.g = (l.g - 0.2617994F);
    j.g = (l.g + 0.2617994F);
    m = ns.a(☃.p(☃) * 3.1415927F);
    c.f = (d.f = (m * 50.0F - 21.0F) * 0.017453292F);
    a.f = (b.f = m * 50.0F * 0.017453292F);
    f.f = (g.f = (m * -40.0F - 11.0F) * 0.017453292F);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃) {}
}
