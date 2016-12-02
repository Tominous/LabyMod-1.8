import java.util.Random;

public class ape
  extends apg
{
  public ape(boolean ☃, int ☃, int ☃, alz ☃, alz ☃)
  {
    super(☃, ☃, ☃, ☃, ☃);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = a(☃);
    if (!a(☃, ☃, ☃, ☃)) {
      return false;
    }
    c(☃, ☃.b(☃), 2);
    
    int ☃ = ☃.o() + ☃ - 2 - ☃.nextInt(4);
    while (☃ > ☃.o() + ☃ / 2)
    {
      float ☃ = ☃.nextFloat() * 3.1415927F * 2.0F;
      int ☃ = ☃.n() + (int)(0.5F + ns.b(☃) * 4.0F);
      int ☃ = ☃.p() + (int)(0.5F + ns.a(☃) * 4.0F);
      for (int ☃ = 0; ☃ < 5; ☃++)
      {
        ☃ = ☃.n() + (int)(1.5F + ns.b(☃) * ☃);
        ☃ = ☃.p() + (int)(1.5F + ns.a(☃) * ☃);
        a(☃, new cj(☃, ☃ - 3 + ☃ / 2, ☃), b);
      }
      int ☃ = 1 + ☃.nextInt(2);
      int ☃ = ☃;
      for (int ☃ = ☃ - ☃; ☃ <= ☃; ☃++)
      {
        int ☃ = ☃ - ☃;
        b(☃, new cj(☃, ☃, ☃), 1 - ☃);
      }
      ☃ -= 2 + ☃.nextInt(4);
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      cj ☃ = ☃.b(☃);
      if (a(☃.p(☃).c()))
      {
        a(☃, ☃, b);
        if (☃ > 0)
        {
          a(☃, ☃, ☃.e(), akk.N);
          a(☃, ☃, ☃.c(), akk.O);
        }
      }
      if (☃ < ☃ - 1)
      {
        cj ☃ = ☃.f();
        if (a(☃.p(☃).c()))
        {
          a(☃, ☃, b);
          if (☃ > 0)
          {
            a(☃, ☃, ☃.f(), akk.P);
            a(☃, ☃, ☃.c(), akk.O);
          }
        }
        cj ☃ = ☃.d().f();
        if (a(☃.p(☃).c()))
        {
          a(☃, ☃, b);
          if (☃ > 0)
          {
            a(☃, ☃, ☃.f(), akk.P);
            a(☃, ☃, ☃.d(), akk.b);
          }
        }
        cj ☃ = ☃.d();
        if (a(☃.p(☃).c()))
        {
          a(☃, ☃, b);
          if (☃ > 0)
          {
            a(☃, ☃, ☃.e(), akk.N);
            a(☃, ☃, ☃.d(), akk.b);
          }
        }
      }
    }
    return true;
  }
  
  private void a(adm ☃, Random ☃, cj ☃, amk ☃)
  {
    if ((☃.nextInt(3) > 0) && (☃.d(☃))) {
      a(☃, ☃, afi.bn.Q().a(☃, Boolean.valueOf(true)));
    }
  }
  
  private void c(adm ☃, cj ☃, int ☃)
  {
    int ☃ = 2;
    for (int ☃ = -☃; ☃ <= 0; ☃++) {
      a(☃, ☃.b(☃), ☃ + 1 - ☃);
    }
  }
}
