public class bcf
  extends bbo
{
  bct a;
  bct[] b = new bct[8];
  
  public bcf()
  {
    int ☃ = -16;
    this.a = new bct(this, 0, 0);
    this.a.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
    this.a.d += 24 + ☃;
    for (int ☃ = 0; ☃ < this.b.length; ☃++)
    {
      this.b[☃] = new bct(this, 48, 0);
      
      double ☃ = ☃ * 3.141592653589793D * 2.0D / this.b.length;
      float ☃ = (float)Math.cos(☃) * 5.0F;
      float ☃ = (float)Math.sin(☃) * 5.0F;
      this.b[☃].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
      
      this.b[☃].c = ☃;
      this.b[☃].e = ☃;
      this.b[☃].d = (31 + ☃);
      
      ☃ = ☃ * 3.141592653589793D * -2.0D / this.b.length + 1.5707963267948966D;
      this.b[☃].g = ((float)☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    for (bct ☃ : this.b) {
      ☃.f = ☃;
    }
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.a.a(☃);
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      this.b[☃].a(☃);
    }
  }
}
