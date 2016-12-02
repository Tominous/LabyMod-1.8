public class bat
  extends bas
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  
  public bat()
  {
    this(0.0F);
  }
  
  public bat(float ☃)
  {
    super(☃, 64, 64);
    
    e = new bct(this, 0, 0);
    e.a(-1.0F, -7.0F, -1.0F, 2, 7, 2, ☃);
    e.a(0.0F, 0.0F, 0.0F);
    
    g = new bct(this, 0, 26);
    g.a(-6.0F, 0.0F, -1.5F, 12, 3, 3, ☃);
    g.a(0.0F, 0.0F, 0.0F);
    
    h = new bct(this, 24, 0);
    h.a(-2.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
    h.a(-5.0F, 2.0F, 0.0F);
    
    i = new bct(this, 32, 16);
    i.i = true;
    i.a(0.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
    i.a(5.0F, 2.0F, 0.0F);
    
    j = new bct(this, 8, 0);
    j.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, ☃);
    j.a(-1.9F, 12.0F, 0.0F);
    
    k = new bct(this, 40, 16);
    k.i = true;
    k.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, ☃);
    k.a(1.9F, 12.0F, 0.0F);
    
    a = new bct(this, 16, 0);
    a.a(-3.0F, 3.0F, -1.0F, 2, 7, 2, ☃);
    a.a(0.0F, 0.0F, 0.0F);
    a.j = true;
    
    b = new bct(this, 48, 16);
    b.a(1.0F, 3.0F, -1.0F, 2, 7, 2, ☃);
    b.a(0.0F, 0.0F, 0.0F);
    
    c = new bct(this, 0, 48);
    c.a(-4.0F, 10.0F, -1.0F, 8, 2, 2, ☃);
    c.a(0.0F, 0.0F, 0.0F);
    
    d = new bct(this, 0, 32);
    d.a(-6.0F, 11.0F, -6.0F, 12, 1, 12, ☃);
    d.a(0.0F, 12.0F, 0.0F);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (!(☃ instanceof um)) {
      return;
    }
    um ☃ = (um)☃;
    
    i.j = ☃.q();
    h.j = ☃.q();
    d.j = (!☃.r());
    
    k.a(1.9F, 12.0F, 0.0F);
    j.a(-1.9F, 12.0F, 0.0F);
    
    a.f = (0.017453292F * ☃.u().b());
    a.g = (0.017453292F * ☃.u().c());
    a.h = (0.017453292F * ☃.u().d());
    
    b.f = (0.017453292F * ☃.u().b());
    b.g = (0.017453292F * ☃.u().c());
    b.h = (0.017453292F * ☃.u().d());
    
    c.f = (0.017453292F * ☃.u().b());
    c.g = (0.017453292F * ☃.u().c());
    c.h = (0.017453292F * ☃.u().d());
    
    float ☃ = (☃.x().b() + ☃.y().b()) / 2.0F;
    float ☃ = (☃.x().c() + ☃.y().c()) / 2.0F;
    float ☃ = (☃.x().d() + ☃.y().d()) / 2.0F;
    
    d.f = 0.0F;
    d.g = (0.017453292F * -y);
    d.h = 0.0F;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    bfl.E();
    if (r)
    {
      float ☃ = 2.0F;
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      a.a(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
    }
    else
    {
      if (☃.av()) {
        bfl.b(0.0F, 0.2F, 0.0F);
      }
      a.a(☃);
      b.a(☃);
      c.a(☃);
      d.a(☃);
    }
    bfl.F();
  }
  
  public void a(float ☃)
  {
    boolean ☃ = h.j;
    h.j = true;
    super.a(☃);
    h.j = ☃;
  }
}
