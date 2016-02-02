public class bcp
  extends bbo
{
  private bct a;
  private bct b;
  private bct c;
  
  public bcp(float ☃, boolean ☃)
  {
    this.b = new bct(this, "glass");
    this.b.a(0, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    
    this.a = new bct(this, "cube");
    this.a.a(32, 0).a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
    if (☃)
    {
      this.c = new bct(this, "base");
      this.c.a(0, 16).a(-6.0F, 0.0F, -6.0F, 12, 4, 12);
    }
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    bfl.E();
    bfl.a(2.0F, 2.0F, 2.0F);
    bfl.b(0.0F, -0.5F, 0.0F);
    if (this.c != null) {
      this.c.a(☃);
    }
    bfl.b(☃, 0.0F, 1.0F, 0.0F);
    bfl.b(0.0F, 0.8F + ☃, 0.0F);
    bfl.b(60.0F, 0.7071F, 0.0F, 0.7071F);
    this.b.a(☃);
    float ☃ = 0.875F;
    bfl.a(☃, ☃, ☃);
    bfl.b(60.0F, 0.7071F, 0.0F, 0.7071F);
    bfl.b(☃, 0.0F, 1.0F, 0.0F);
    this.b.a(☃);
    bfl.a(☃, ☃, ☃);
    bfl.b(60.0F, 0.7071F, 0.0F, 0.7071F);
    bfl.b(☃, 0.0F, 1.0F, 0.0F);
    this.a.a(☃);
    bfl.F();
  }
}
