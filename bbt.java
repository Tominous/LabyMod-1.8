public class bbt
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  protected float g = 8.0F;
  protected float h = 4.0F;
  
  public bbt(int ☃, float ☃)
  {
    a = new bct(this, 0, 0);
    a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, ☃);
    a.a(0.0F, 18 - ☃, -6.0F);
    
    b = new bct(this, 28, 8);
    b.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, ☃);
    b.a(0.0F, 17 - ☃, 2.0F);
    
    c = new bct(this, 0, 16);
    c.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    c.a(-3.0F, 24 - ☃, 7.0F);
    
    d = new bct(this, 0, 16);
    d.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    d.a(3.0F, 24 - ☃, 7.0F);
    
    e = new bct(this, 0, 16);
    e.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    e.a(-3.0F, 24 - ☃, -5.0F);
    
    f = new bct(this, 0, 16);
    f.a(-2.0F, 0.0F, -2.0F, 4, ☃, 4, ☃);
    f.a(3.0F, 24 - ☃, -5.0F);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (r)
    {
      float ☃ = 2.0F;
      bfl.E();
      bfl.b(0.0F, g * ☃, h * ☃);
      a.a(☃);
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
      b.a(☃);
      c.a(☃);
      d.a(☃);
      e.a(☃);
      f.a(☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    float ☃ = 57.295776F;
    a.f = (☃ / 57.295776F);
    a.g = (☃ / 57.295776F);
    b.f = 1.5707964F;
    
    c.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
    d.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    e.f = (ns.b(☃ * 0.6662F + 3.1415927F) * 1.4F * ☃);
    f.f = (ns.b(☃ * 0.6662F) * 1.4F * ☃);
  }
}
