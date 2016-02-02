import java.util.Random;

public class aia
  extends afm
  implements afj
{
  protected aia()
  {
    float ☃ = 0.2F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, ☃ * 2.0F, 0.5F + ☃);
    a(true);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.nextInt(25) == 0)
    {
      int ☃ = 5;
      int ☃ = 4;
      for (cj ☃ : cj.b(☃.a(-4, -1, -4), ☃.a(4, 1, 4))) {
        if (☃.p(☃).c() == this)
        {
          ☃--;
          if (☃ <= 0) {
            return;
          }
        }
      }
      cj ☃ = ☃.a(☃.nextInt(3) - 1, ☃.nextInt(2) - ☃.nextInt(2), ☃.nextInt(3) - 1);
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        if ((☃.d(☃)) && (f(☃, ☃, Q()))) {
          ☃ = ☃;
        }
        ☃ = ☃.a(☃.nextInt(3) - 1, ☃.nextInt(2) - ☃.nextInt(2), ☃.nextInt(3) - 1);
      }
      if ((☃.d(☃)) && (f(☃, ☃, Q()))) {
        ☃.a(☃, Q(), 2);
      }
    }
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (super.d(☃, ☃)) && (f(☃, ☃, Q()));
  }
  
  protected boolean c(afh ☃)
  {
    return ☃.o();
  }
  
  public boolean f(adm ☃, cj ☃, alz ☃)
  {
    if ((☃.o() < 0) || (☃.o() >= 256)) {
      return false;
    }
    alz ☃ = ☃.p(☃.b());
    if (☃.c() == afi.bw) {
      return true;
    }
    if ((☃.c() == afi.d) && (☃.b(agf.a) == agf.a.c)) {
      return true;
    }
    return (☃.k(☃) < 13) && (c(☃.c()));
  }
  
  public boolean d(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    ☃.g(☃);
    
    aot ☃ = null;
    if (this == afi.P) {
      ☃ = new aoz(afi.bg);
    } else if (this == afi.Q) {
      ☃ = new aoz(afi.bh);
    }
    if ((☃ != null) && (☃.b(☃, ☃, ☃))) {
      return true;
    }
    ☃.a(☃, ☃, 3);
    return false;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    return true;
  }
  
  public boolean a(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    return ☃.nextFloat() < 0.4D;
  }
  
  public void b(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    d(☃, ☃, ☃, ☃);
  }
}
