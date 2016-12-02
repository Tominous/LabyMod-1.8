import java.util.Random;

public class bbf
  extends bbo
{
  bct a;
  bct[] b = new bct[9];
  
  public bbf()
  {
    int ☃ = -16;
    this.a = new bct(this, 0, 0);
    this.a.a(-8.0F, -8.0F, -8.0F, 16, 16, 16);
    this.a.d += 24 + ☃;
    
    Random ☃ = new Random(1660L);
    for (int ☃ = 0; ☃ < this.b.length; ☃++)
    {
      this.b[☃] = new bct(this, 0, 0);
      
      float ☃ = ((☃ % 3 - ☃ / 3 % 2 * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
      float ☃ = (☃ / 3 / 2.0F * 2.0F - 1.0F) * 5.0F;
      int ☃ = ☃.nextInt(7) + 8;
      this.b[☃].a(-1.0F, 0.0F, -1.0F, 2, ☃, 2);
      
      this.b[☃].c = ☃;
      this.b[☃].e = ☃;
      this.b[☃].d = (31 + ☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      this.b[☃].f = (0.2F * ns.a(☃ * 0.3F + ☃) + 0.4F);
    }
  }
  
  public void a(pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    bfl.E();
    bfl.b(0.0F, 0.6F, 0.0F);
    
    this.a.a(☃);
    for (bct ☃ : this.b) {
      ☃.a(☃);
    }
    bfl.F();
  }
}
