public class bcf
  extends bbo
{
  bct a;
  bct[] b = new bct[8];
  
  public bcf()
  {
    int ☃ = -16;
    a = new bct(this, 0, 0);
    a.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
    a.d += 24 + ☃;
    for (int ☃ = 0; ☃ < b.length; ☃++)
    {
      b[☃] = new bct(this, 48, 0);
      
      double ☃ = ☃ * 3.141592653589793D * 2.0D / b.length;
      float ☃ = (float)Math.cos(☃) * 5.0F;
      float ☃ = (float)Math.sin(☃) * 5.0F;
      b[☃].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
      
      b[☃].c = ☃;
      b[☃].e = ☃;
      b[☃].d = (31 + ☃);
      
      ☃ = ☃ * 3.141592653589793D * -2.0D / b.length + 1.5707963267948966D;
      b[☃].g = ((float)☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    for (bct ☃ : b) {
      f = ☃;
    }
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    a.a(☃);
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      b[☃].a(☃);
    }
  }
}
