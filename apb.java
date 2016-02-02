import java.util.Random;

public class apb
  extends aot
{
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    while ((☃.d(☃)) && (☃.o() > 2)) {
      ☃ = ☃.b();
    }
    if (☃.p(☃).c() != afi.aJ) {
      return false;
    }
    ☃ = ☃.b(☃.nextInt(4));
    
    int ☃ = ☃.nextInt(4) + 7;
    int ☃ = ☃ / 4 + ☃.nextInt(2);
    if ((☃ > 1) && (☃.nextInt(60) == 0)) {
      ☃ = ☃.b(10 + ☃.nextInt(30));
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      float ☃ = (1.0F - ☃ / ☃) * ☃;
      int ☃ = ns.f(☃);
      for (int ☃ = -☃; ☃ <= ☃; ☃++)
      {
        float ☃ = ns.a(☃) - 0.25F;
        for (int ☃ = -☃; ☃ <= ☃; ☃++)
        {
          float ☃ = ns.a(☃) - 0.25F;
          if (((☃ == 0) && (☃ == 0)) || (☃ * ☃ + ☃ * ☃ <= ☃ * ☃)) {
            if (((☃ != -☃) && (☃ != ☃) && (☃ != -☃) && (☃ != ☃)) || 
              (☃.nextFloat() <= 0.75F))
            {
              afh ☃ = ☃.p(☃.a(☃, ☃, ☃)).c();
              if ((☃.t() == arm.a) || (☃ == afi.d) || (☃ == afi.aJ) || (☃ == afi.aI)) {
                a(☃, ☃.a(☃, ☃, ☃), afi.cB.Q());
              }
              if ((☃ != 0) && (☃ > 1))
              {
                ☃ = ☃.p(☃.a(☃, -☃, ☃)).c();
                if ((☃.t() == arm.a) || (☃ == afi.d) || (☃ == afi.aJ) || (☃ == afi.aI)) {
                  a(☃, ☃.a(☃, -☃, ☃), afi.cB.Q());
                }
              }
            }
          }
        }
      }
    }
    int ☃ = ☃ - 1;
    if (☃ < 0) {
      ☃ = 0;
    } else if (☃ > 1) {
      ☃ = 1;
    }
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ <= ☃; ☃++)
      {
        cj ☃ = ☃.a(☃, -1, ☃);
        int ☃ = 50;
        if ((Math.abs(☃) == 1) && (Math.abs(☃) == 1)) {
          ☃ = ☃.nextInt(5);
        }
        while (☃.o() > 50)
        {
          afh ☃ = ☃.p(☃).c();
          if ((☃.t() != arm.a) && (☃ != afi.d) && (☃ != afi.aJ) && (☃ != afi.aI) && (☃ != afi.cB)) {
            break;
          }
          a(☃, ☃, afi.cB.Q());
          
          ☃ = ☃.b();
          ☃--;
          if (☃ <= 0)
          {
            ☃ = ☃.c(☃.nextInt(5) + 1);
            ☃ = ☃.nextInt(5);
          }
        }
      }
    }
    return true;
  }
}
