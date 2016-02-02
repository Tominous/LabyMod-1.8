public class bau
  extends bbo
{
  public bct a;
  public bct b;
  public bct c;
  
  public bau()
  {
    this.t = 64;
    this.u = 64;
    
    this.a = new bct(this, 0, 0);
    this.a.a(-10.0F, 0.0F, -2.0F, 20, 40, 1, 0.0F);
    
    this.b = new bct(this, 44, 0);
    this.b.a(-1.0F, -30.0F, -1.0F, 2, 42, 2, 0.0F);
    
    this.c = new bct(this, 0, 42);
    this.c.a(-10.0F, -32.0F, -1.0F, 20, 2, 2, 0.0F);
  }
  
  public void a()
  {
    this.a.d = -32.0F;
    this.a.a(0.0625F);
    this.b.a(0.0625F);
    this.c.a(0.0625F);
  }
}
