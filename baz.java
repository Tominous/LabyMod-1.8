public class baz
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  
  public baz()
  {
    a = new bct(this, 0, 0).b(64, 64);
    a.a(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
    a.c = 1.0F;
    a.d = 7.0F;
    a.e = 15.0F;
    
    c = new bct(this, 0, 0).b(64, 64);
    c.a(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
    c.c = 8.0F;
    c.d = 7.0F;
    c.e = 15.0F;
    
    b = new bct(this, 0, 19).b(64, 64);
    b.a(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
    b.c = 1.0F;
    b.d = 6.0F;
    b.e = 1.0F;
  }
  
  public void a()
  {
    c.f = a.f;
    
    a.a(0.0625F);
    c.a(0.0625F);
    b.a(0.0625F);
  }
}
