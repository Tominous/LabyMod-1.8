public class bcm
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  bct g;
  bct h;
  
  public bcm()
  {
    float ☃ = 0.0F;
    
    float ☃ = 13.5F;
    
    a = new bct(this, 0, 0);
    a.a(-3.0F, -3.0F, -2.0F, 6, 6, 4, ☃);
    a.a(-1.0F, ☃, -7.0F);
    
    b = new bct(this, 18, 14);
    b.a(-4.0F, -2.0F, -3.0F, 6, 9, 6, ☃);
    b.a(0.0F, 14.0F, 2.0F);
    
    h = new bct(this, 21, 0);
    h.a(-4.0F, -3.0F, -3.0F, 8, 6, 7, ☃);
    h.a(-1.0F, 14.0F, 2.0F);
    
    c = new bct(this, 0, 18);
    c.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    c.a(-2.5F, 16.0F, 7.0F);
    
    d = new bct(this, 0, 18);
    d.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    d.a(0.5F, 16.0F, 7.0F);
    
    e = new bct(this, 0, 18);
    e.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    e.a(-2.5F, 16.0F, -4.0F);
    
    f = new bct(this, 0, 18);
    f.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    f.a(0.5F, 16.0F, -4.0F);
    
    g = new bct(this, 9, 18);
    g.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    g.a(-1.0F, 12.0F, 8.0F);
    
    a.a(16, 14).a(-3.0F, -5.0F, 0.0F, 2, 2, 1, ☃);
    a.a(16, 14).a(1.0F, -5.0F, 0.0F, 2, 2, 1, ☃);
    a.a(0, 10).a(-1.5F, 0.0F, -5.0F, 3, 3, 4, ☃);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, 5.0F * ☃, 2.0F * ☃);
      a.b(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
      
      g.b(☃);
      h.a(☃);
      bfl.F();
    }
    else
    {
      a.b(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
      
      g.b(☃);
      h.a(☃);
    }
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    ua ☃ = (ua)☃;
    if (☃.cv()) {
      g.g = 0.0F;
    } else {
      g.g = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    }
    if (☃.cn())
    {
      h.a(-1.0F, 16.0F, -3.0F);
      h.f = 1.2566371F;
      h.g = 0.0F;
      
      b.a(0.0F, 18.0F, 0.0F);
      b.f = 0.7853982F;
      
      g.a(-1.0F, 21.0F, 6.0F);
      
      c.a(-2.5F, 22.0F, 2.0F);
      c.f = 4.712389F;
      d.a(0.5F, 22.0F, 2.0F);
      d.f = 4.712389F;
      
      e.f = 5.811947F;
      e.a(-2.49F, 17.0F, -4.0F);
      f.f = 5.811947F;
      f.a(0.51F, 17.0F, -4.0F);
    }
    else
    {
      b.a(0.0F, 14.0F, 2.0F);
      b.f = 1.5707964F;
      
      h.a(-1.0F, 14.0F, -3.0F);
      h.f = b.f;
      
      g.a(-1.0F, 12.0F, 8.0F);
      
      c.a(-2.5F, 16.0F, 7.0F);
      d.a(0.5F, 16.0F, 7.0F);
      e.a(-2.5F, 16.0F, -4.0F);
      f.a(0.5F, 16.0F, -4.0F);
      
      c.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
      d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
      e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
      f.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    }
    a.h = (☃.q(☃) + ☃.i(☃, 0.0F));
    
    h.h = ☃.i(☃, -0.08F);
    b.h = ☃.i(☃, -0.16F);
    g.h = ☃.i(☃, -0.2F);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    a.f = (☃ / 57.295776F);
    a.g = (☃ / 57.295776F);
    
    g.f = ☃;
  }
}
