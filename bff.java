import java.util.Arrays;

public class bff
  extends adv
{
  private static final alz f = afi.a.Q();
  private final cj g;
  private int[] h;
  private alz[] i;
  
  public bff(adm ☃, cj ☃, cj ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃);
    this.g = ☃.b(new df(☃, ☃, ☃));
    
    int ☃ = 8000;
    this.h = new int['ὀ'];
    Arrays.fill(this.h, -1);
    this.i = new alz['ὀ'];
  }
  
  public akw s(cj ☃)
  {
    int ☃ = (☃.n() >> 4) - this.a;
    int ☃ = (☃.p() >> 4) - this.b;
    
    return this.c[☃][☃].a(☃, amy.a.b);
  }
  
  public int b(cj ☃, int ☃)
  {
    int ☃ = e(☃);
    int ☃ = this.h[☃];
    if (☃ == -1)
    {
      ☃ = super.b(☃, ☃);
      this.h[☃] = ☃;
    }
    return ☃;
  }
  
  public alz p(cj ☃)
  {
    int ☃ = e(☃);
    alz ☃ = this.i[☃];
    if (☃ == null)
    {
      ☃ = c(☃);
      this.i[☃] = ☃;
    }
    return ☃;
  }
  
  private alz c(cj ☃)
  {
    if ((☃.o() >= 0) && (☃.o() < 256))
    {
      int ☃ = (☃.n() >> 4) - this.a;
      int ☃ = (☃.p() >> 4) - this.b;
      
      return this.c[☃][☃].g(☃);
    }
    return f;
  }
  
  private int e(cj ☃)
  {
    int ☃ = ☃.n() - this.g.n();
    int ☃ = ☃.o() - this.g.o();
    int ☃ = ☃.p() - this.g.p();
    return ☃ * 400 + ☃ * 20 + ☃;
  }
}
