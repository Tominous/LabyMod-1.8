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
    
    this.e = new bct(this, 0, 0);
    this.e.a(-1.0F, -7.0F, -1.0F, 2, 7, 2, ☃);
    this.e.a(0.0F, 0.0F, 0.0F);
    
    this.g = new bct(this, 0, 26);
    this.g.a(-6.0F, 0.0F, -1.5F, 12, 3, 3, ☃);
    this.g.a(0.0F, 0.0F, 0.0F);
    
    this.h = new bct(this, 24, 0);
    this.h.a(-2.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
    this.h.a(-5.0F, 2.0F, 0.0F);
    
    this.i = new bct(this, 32, 16);
    this.i.i = true;
    this.i.a(0.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
    this.i.a(5.0F, 2.0F, 0.0F);
    
    this.j = new bct(this, 8, 0);
    this.j.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, ☃);
    this.j.a(-1.9F, 12.0F, 0.0F);
    
    this.k = new bct(this, 40, 16);
    this.k.i = true;
    this.k.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, ☃);
    this.k.a(1.9F, 12.0F, 0.0F);
    
    this.a = new bct(this, 16, 0);
    this.a.a(-3.0F, 3.0F, -1.0F, 2, 7, 2, ☃);
    this.a.a(0.0F, 0.0F, 0.0F);
    this.a.j = true;
    
    this.b = new bct(this, 48, 16);
    this.b.a(1.0F, 3.0F, -1.0F, 2, 7, 2, ☃);
    this.b.a(0.0F, 0.0F, 0.0F);
    
    this.c = new bct(this, 0, 48);
    this.c.a(-4.0F, 10.0F, -1.0F, 8, 2, 2, ☃);
    this.c.a(0.0F, 0.0F, 0.0F);
    
    this.d = new bct(this, 0, 32);
    this.d.a(-6.0F, 11.0F, -6.0F, 12, 1, 12, ☃);
    this.d.a(0.0F, 12.0F, 0.0F);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (!(☃ instanceof um)) {
      return;
    }
    um ☃ = (um)☃;
    
    this.i.j = ☃.q();
    this.h.j = ☃.q();
    this.d.j = (!☃.r());
    
    this.k.a(1.9F, 12.0F, 0.0F);
    this.j.a(-1.9F, 12.0F, 0.0F);
    
    this.a.f = (0.017453292F * ☃.u().b());
    this.a.g = (0.017453292F * ☃.u().c());
    this.a.h = (0.017453292F * ☃.u().d());
    
    this.b.f = (0.017453292F * ☃.u().b());
    this.b.g = (0.017453292F * ☃.u().c());
    this.b.h = (0.017453292F * ☃.u().d());
    
    this.c.f = (0.017453292F * ☃.u().b());
    this.c.g = (0.017453292F * ☃.u().c());
    this.c.h = (0.017453292F * ☃.u().d());
    
    float ☃ = (☃.x().b() + ☃.y().b()) / 2.0F;
    float ☃ = (☃.x().c() + ☃.y().c()) / 2.0F;
    float ☃ = (☃.x().d() + ☃.y().d()) / 2.0F;
    
    this.d.f = 0.0F;
    this.d.g = (0.017453292F * -☃.y);
    this.d.h = 0.0F;
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    bfl.E();
    if (this.r)
    {
      float ☃ = 2.0F;
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      this.a.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
    }
    else
    {
      if (☃.av()) {
        bfl.b(0.0F, 0.2F, 0.0F);
      }
      this.a.a(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
    }
    bfl.F();
  }
  
  public void a(float ☃)
  {
    boolean ☃ = this.h.j;
    this.h.j = true;
    super.a(☃);
    this.h.j = ☃;
  }
}
