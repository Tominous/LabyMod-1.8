public class bau
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  
  public bau()
  {
    t = 64;
    u = 64;
    
    a = new bct(this, 0, 0);
    a.a(-10.0F, 0.0F, -2.0F, 20, 40, 1, 0.0F);
    
    b = new bct(this, 44, 0);
    b.a(-1.0F, -30.0F, -1.0F, 2, 42, 2, 0.0F);
    
    c = new bct(this, 0, 42);
    c.a(-10.0F, -32.0F, -1.0F, 20, 2, 2, 0.0F);
  }
  
  public void a()
  {
    a.d = -32.0F;
    a.a(0.0625F);
    b.a(0.0625F);
    c.a(0.0625F);
  }
}
