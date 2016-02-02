public class bca
  extends bcn
{
  public bca()
  {
    this(0.0F, false);
  }
  
  public bca(float ☃, boolean ☃)
  {
    super(☃, 0.0F, 64, 32);
    if (!☃)
    {
      this.h = new bct(this, 40, 16);
      this.h.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
      this.h.a(-5.0F, 2.0F, 0.0F);
      
      this.i = new bct(this, 40, 16);
      this.i.i = true;
      this.i.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
      this.i.a(5.0F, 2.0F, 0.0F);
      
      this.j = new bct(this, 0, 16);
      this.j.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, ☃);
      this.j.a(-2.0F, 12.0F, 0.0F);
      
      this.k = new bct(this, 0, 16);
      this.k.i = true;
      this.k.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, ☃);
      this.k.a(2.0F, 12.0F, 0.0F);
    }
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    this.o = (((wa)☃).cm() == 1);
    super.a(☃, ☃, ☃, ☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
}
