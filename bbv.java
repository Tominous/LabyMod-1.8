public class bbv
  extends bbt
{
  private float i;
  
  public bbv()
  {
    super(12, 0.0F);
    
    a = new bct(this, 0, 0);
    a.a(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
    a.a(0.0F, 6.0F, -8.0F);
    
    b = new bct(this, 28, 8);
    b.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
    b.a(0.0F, 5.0F, 2.0F);
    
    float ☃ = 0.5F;
    c = new bct(this, 0, 16);
    c.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    c.a(-3.0F, 12.0F, 7.0F);
    
    d = new bct(this, 0, 16);
    d.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    d.a(3.0F, 12.0F, 7.0F);
    
    e = new bct(this, 0, 16);
    e.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    e.a(-3.0F, 12.0F, -5.0F);
    
    f = new bct(this, 0, 16);
    f.a(-2.0F, 0.0F, -2.0F, 4, 6, 4, ☃);
    f.a(3.0F, 12.0F, -5.0F);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    super.a(☃, ☃, ☃, ☃);
    
    a.d = (6.0F + ((tv)☃).p(☃) * 9.0F);
    i = ((tv)☃).q(☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.f = i;
  }
}
