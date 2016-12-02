public class bbl
  extends bbo
{
  bct[] a = new bct[8];
  bct b;
  
  public bbl()
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++)
    {
      int ☃ = 0;
      int ☃ = ☃;
      if (☃ == 2)
      {
        ☃ = 24;
        ☃ = 10;
      }
      else if (☃ == 3)
      {
        ☃ = 24;
        ☃ = 19;
      }
      this.a[☃] = new bct(this, ☃, ☃);
      this.a[☃].a(-4.0F, 16 + ☃, -4.0F, 8, 1, 8);
    }
    this.b = new bct(this, 0, 16);
    this.b.a(-2.0F, 18.0F, -2.0F, 4, 4, 4);
  }
  
  public void a(pr ☃, float ☃, float ☃, float ☃)
  {
    vu ☃ = (vu)☃;
    
    float ☃ = ☃.c + (☃.b - ☃.c) * ☃;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      this.a[☃].d = (-(4 - ☃) * ☃ * 1.7F);
    }
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.b.a(☃);
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      this.a[☃].a(☃);
    }
  }
}
