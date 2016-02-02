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
    
    this.a = new bct(this, 0, 0);
    this.a.a(-3.0F, -3.0F, -2.0F, 6, 6, 4, ☃);
    this.a.a(-1.0F, ☃, -7.0F);
    
    this.b = new bct(this, 18, 14);
    this.b.a(-4.0F, -2.0F, -3.0F, 6, 9, 6, ☃);
    this.b.a(0.0F, 14.0F, 2.0F);
    
    this.h = new bct(this, 21, 0);
    this.h.a(-4.0F, -3.0F, -3.0F, 8, 6, 7, ☃);
    this.h.a(-1.0F, 14.0F, 2.0F);
    
    this.c = new bct(this, 0, 18);
    this.c.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    this.c.a(-2.5F, 16.0F, 7.0F);
    
    this.d = new bct(this, 0, 18);
    this.d.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    this.d.a(0.5F, 16.0F, 7.0F);
    
    this.e = new bct(this, 0, 18);
    this.e.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    this.e.a(-2.5F, 16.0F, -4.0F);
    
    this.f = new bct(this, 0, 18);
    this.f.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    this.f.a(0.5F, 16.0F, -4.0F);
    
    this.g = new bct(this, 9, 18);
    this.g.a(-1.0F, 0.0F, -1.0F, 2, 8, 2, ☃);
    this.g.a(-1.0F, 12.0F, 8.0F);
    
    this.a.a(16, 14).a(-3.0F, -5.0F, 0.0F, 2, 2, 1, ☃);
    this.a.a(16, 14).a(1.0F, -5.0F, 0.0F, 2, 2, 1, ☃);
    this.a.a(0, 10).a(-1.5F, 0.0F, -5.0F, 3, 3, 4, ☃);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (this.r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, 5.0F * ☃, 2.0F * ☃);
      this.a.b(☃);
      bfl.F();
      bfl.E();
      bfl.a(1.0F / ☃, 1.0F / ☃, 1.0F / ☃);
      bfl.b(0.0F, 24.0F * ☃, 0.0F);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
      
      this.g.b(☃);
      this.h.a(☃);
      bfl.F();
    }
    else
    {
      this.a.b(☃);
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
      this.e.a(☃);
      this.f.a(☃);
      
      this.g.b(☃);
      this.h.a(☃);
    }
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    ua ☃ = (ua)☃;
    if (☃.cv()) {
      this.g.g = 0.0F;
    } else {
      this.g.g = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    }
    if (☃.cn())
    {
      this.h.a(-1.0F, 16.0F, -3.0F);
      this.h.f = 1.2566371F;
      this.h.g = 0.0F;
      
      this.b.a(0.0F, 18.0F, 0.0F);
      this.b.f = 0.7853982F;
      
      this.g.a(-1.0F, 21.0F, 6.0F);
      
      this.c.a(-2.5F, 22.0F, 2.0F);
      this.c.f = 4.712389F;
      this.d.a(0.5F, 22.0F, 2.0F);
      this.d.f = 4.712389F;
      
      this.e.f = 5.811947F;
      this.e.a(-2.49F, 17.0F, -4.0F);
      this.f.f = 5.811947F;
      this.f.a(0.51F, 17.0F, -4.0F);
    }
    else
    {
      this.b.a(0.0F, 14.0F, 2.0F);
      this.b.f = 1.5707964F;
      
      this.h.a(-1.0F, 14.0F, -3.0F);
      this.h.f = this.b.f;
      
      this.g.a(-1.0F, 12.0F, 8.0F);
      
      this.c.a(-2.5F, 16.0F, 7.0F);
      this.d.a(0.5F, 16.0F, 7.0F);
      this.e.a(-2.5F, 16.0F, -4.0F);
      this.f.a(0.5F, 16.0F, -4.0F);
      
      this.c.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
      this.d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
      this.e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
      this.f.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    }
    this.a.h = (☃.q(☃) + ☃.i(☃, 0.0F));
    
    this.h.h = ☃.i(☃, -0.08F);
    this.b.h = ☃.i(☃, -0.16F);
    this.g.h = ☃.i(☃, -0.2F);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    this.a.f = (☃ / 57.295776F);
    this.a.g = (☃ / 57.295776F);
    
    this.g.f = ☃;
  }
}
