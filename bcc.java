public class bcc
  extends bbo
{
  bct a;
  bct b;
  bct c;
  bct d;
  
  public bcc(int ☃)
  {
    a = new bct(this, 0, ☃);
    a.a(-4.0F, 16.0F, -4.0F, 8, 8, 8);
    if (☃ > 0)
    {
      a = new bct(this, 0, ☃);
      a.a(-3.0F, 17.0F, -3.0F, 6, 6, 6);
      
      b = new bct(this, 32, 0);
      b.a(-3.25F, 18.0F, -3.5F, 2, 2, 2);
      
      c = new bct(this, 32, 4);
      c.a(1.25F, 18.0F, -3.5F, 2, 2, 2);
      
      d = new bct(this, 32, 8);
      d.a(0.0F, 21.0F, -3.5F, 1, 1, 1);
    }
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    if (b != null)
    {
      b.a(☃);
      c.a(☃);
      d.a(☃);
    }
  }
}
