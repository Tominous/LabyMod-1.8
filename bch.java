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
    
    this.a = new bct(this).b(☃, ☃);
    this.a.a(0.0F, 0.0F + ☃, -2.0F);
    this.a.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8, 10, 8, ☃);
    this.a.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2, 4, 2, ☃);
    
    this.b = new bct(this).b(☃, ☃);
    this.b.a(0.0F, 0.0F + ☃, 0.0F);
    this.b.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18, 12, 11, ☃);
    this.b.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9, 5, 6, ☃ + 0.5F);
    
    this.c = new bct(this).b(☃, ☃);
    this.c.a(0.0F, -7.0F, 0.0F);
    this.c.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4, 30, 6, ☃);
    
    this.d = new bct(this).b(☃, ☃);
    this.d.a(0.0F, -7.0F, 0.0F);
    this.d.a(60, 58).a(9.0F, -2.5F, -3.0F, 4, 30, 6, ☃);
    
    this.e = new bct(this, 0, 22).b(☃, ☃);
    this.e.a(-4.0F, 18.0F + ☃, 0.0F);
    this.e.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6, 16, 5, ☃);
    
    this.f = new bct(this, 0, 22).b(☃, ☃);
    this.f.i = true;
    this.f.a(60, 0).a(5.0F, 18.0F + ☃, 0.0F);
    this.f.a(-3.5F, -3.0F, -3.0F, 6, 16, 5, ☃);
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.a.a(☃);
    this.b.a(☃);
    this.e.a(☃);
    this.f.a(☃);
    this.c.a(☃);
    this.d.a(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    this.a.g = (☃ / 57.295776F);
    this.a.f = (☃ / 57.295776F);
    
    this.e.f = (-1.5F * a(☃, 13.0F) * ☃);
    this.f.f = (1.5F * a(☃, 13.0F) * ☃);
    this.e.g = 0.0F;
    this.f.g = 0.0F;
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    ty ☃ = (ty)☃;
    
    int ☃ = ☃.cl();
    if (☃ > 0)
    {
      this.c.f = (-2.0F + 1.5F * a(☃ - ☃, 10.0F));
      this.d.f = (-2.0F + 1.5F * a(☃ - ☃, 10.0F));
    }
    else
    {
      int ☃ = ☃.cm();
      if (☃ > 0)
      {
        this.c.f = (-0.8F + 0.025F * a(☃, 70.0F));
        this.d.f = 0.0F;
      }
      else
      {
        this.c.f = ((-0.2F + 1.5F * a(☃, 13.0F)) * ☃);
        this.d.f = ((-0.2F - 1.5F * a(☃, 13.0F)) * ☃);
      }
    }
  }
  
  private float a(float ☃, float ☃)
  {
    return (Math.abs(☃ % ☃ - ☃ * 0.5F) - ☃ * 0.25F) / (☃ * 0.25F);
  }
}
