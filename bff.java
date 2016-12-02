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
    g = ☃.b(new df(☃, ☃, ☃));
    
    int ☃ = 8000;
    h = new int['ὀ'];
    Arrays.fill(h, -1);
    i = new alz['ὀ'];
  }
  
  public akw s(cj ☃)
  {
    int ☃ = (☃.n() >> 4) - a;
    int ☃ = (☃.p() >> 4) - b;
    
    return c[☃][☃].a(☃, amy.a.b);
  }
  
  public int b(cj ☃, int ☃)
  {
    int ☃ = e(☃);
    int ☃ = h[☃];
    if (☃ == -1)
    {
      ☃ = super.b(☃, ☃);
      h[☃] = ☃;
    }
    return ☃;
  }
  
  public alz p(cj ☃)
  {
    int ☃ = e(☃);
    alz ☃ = i[☃];
    if (☃ == null)
    {
      ☃ = c(☃);
      i[☃] = ☃;
    }
    return ☃;
  }
  
  private alz c(cj ☃)
  {
    if ((☃.o() >= 0) && (☃.o() < 256))
    {
      int ☃ = (☃.n() >> 4) - a;
      int ☃ = (☃.p() >> 4) - b;
      
      return c[☃][☃].g(☃);
    }
    return f;
  }
  
  private int e(cj ☃)
  {
    int ☃ = ☃.n() - g.n();
    int ☃ = ☃.o() - g.o();
    int ☃ = ☃.p() - g.p();
    return ☃ * 400 + ☃ * 20 + ☃;
  }
}
