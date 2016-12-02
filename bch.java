public class bch
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  public bct d;
  public bct e;
  public bct f;
  
  public bch()
  {
    this(0.0F);
  }
  
  public bch(float ☃)
  {
    this(☃, -7.0F);
  }
  
  public bch(float ☃, float ☃)
  {
    int ☃ = 128;
    int ☃ = 128;
    
    a = new bct(this).b(☃, ☃);
    a.a(0.0F, 0.0F + ☃, -2.0F);
    a.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8, 10, 8, ☃);
    a.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2, 4, 2, ☃);
    
    b = new bct(this).b(☃, ☃);
    b.a(0.0F, 0.0F + ☃, 0.0F);
    b.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18, 12, 11, ☃);
    b.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9, 5, 6, ☃ + 0.5F);
    
    c = new bct(this).b(☃, ☃);
    c.a(0.0F, -7.0F, 0.0F);
    c.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4, 30, 6, ☃);
    
    d = new bct(this).b(☃, ☃);
    d.a(0.0F, -7.0F, 0.0F);
    d.a(60, 58).a(9.0F, -2.5F, -3.0F, 4, 30, 6, ☃);
    
    e = new bct(this, 0, 22).b(☃, ☃);
    e.a(-4.0F, 18.0F + ☃, 0.0F);
    e.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6, 16, 5, ☃);
    
    f = new bct(this, 0, 22).b(☃, ☃);
    f.i = true;
    f.a(60, 0).a(5.0F, 18.0F + ☃, 0.0F);
    f.a(-3.5F, -3.0F, -3.0F, 6, 16, 5, ☃);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    b.a(☃);
    e.a(☃);
    f.a(☃);
    c.a(☃);
    d.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    a.g = (☃ / 57.295776F);
    a.f = (☃ / 57.295776F);
    
    e.f = (-1.5F * a(☃, 13.0F) * ☃);
    f.f = (1.5F * a(☃, 13.0F) * ☃);
    e.g = 0.0F;
    f.g = 0.0F;
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    ty ☃ = (ty)☃;
    
    int ☃ = ☃.cl();
    if (☃ > 0)
    {
      c.f = (-2.0F + 1.5F * a(☃ - ☃, 10.0F));
      d.f = (-2.0F + 1.5F * a(☃ - ☃, 10.0F));
    }
    else
    {
      int ☃ = ☃.cm();
      if (☃ > 0)
      {
        c.f = (-0.8F + 0.025F * a(☃, 70.0F));
        d.f = 0.0F;
      }
      else
      {
        c.f = ((-0.2F + 1.5F * a(☃, 13.0F)) * ☃);
        d.f = ((-0.2F - 1.5F * a(☃, 13.0F)) * ☃);
      }
    }
  }
  
  private float a(float ☃, float ☃)
  {
    return (Math.abs(☃ % ☃ - ☃ * 0.5F) - ☃ * 0.25F) / (☃ * 0.25F);
  }
}
