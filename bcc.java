public class bcc
  extends bbo
{
  bct a;
  bct b;
  bct c;
  bct d;
  
  public bcc(int ☃)
  {
    this.a = new bct(this, 0, ☃);
    this.a.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
    if (☃ > 0)
    {
      this.a = new bct(this, 0, ☃);
      this.a.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
      
      this.b = new bct(this, 32, 0);
      this.b.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
      
      this.c = new bct(this, 32, 4);
      this.c.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
      
      this.d = new bct(this, 32, 8);
      this.d.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
    }
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.a.a(☃);
    if (this.b != null)
    {
      this.b.a(☃);
      this.c.a(☃);
      this.d.a(☃);
    }
  }
}
