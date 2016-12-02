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
      h = new bct(this, 40, 16);
      h.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
      h.a(-5.0F, 2.0F, 0.0F);
      
      i = new bct(this, 40, 16);
      i.i = true;
      i.a(-1.0F, -2.0F, -1.0F, 2, 12, 2, ☃);
      i.a(5.0F, 2.0F, 0.0F);
      
      j = new bct(this, 0, 16);
      j.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, ☃);
      j.a(-2.0F, 12.0F, 0.0F);
      
      k = new bct(this, 0, 16);
      k.i = true;
      k.a(-1.0F, 0.0F, -1.0F, 2, 12, 2, ☃);
      k.a(2.0F, 12.0F, 0.0F);
    }
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    o = (((wa)☃).cm() == 1);
    super.a(☃, ☃, ☃, ☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
}
