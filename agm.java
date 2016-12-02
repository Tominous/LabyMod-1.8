import java.util.Random;

public class agm
  extends afc
{
  protected agm()
  {
    super(arm.e, arn.D);
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
    e(0);
    a(yz.c);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    super.c(☃, ☃, ☃, ☃);
    for (int ☃ = -2; ☃ <= 2; ☃++) {
      for (int ☃ = -2; ☃ <= 2; ☃++)
      {
        if ((☃ > -2) && (☃ < 2) && (☃ == -1)) {
          ☃ = 2;
        }
        if (☃.nextInt(16) == 0) {
          for (int ☃ = 0; ☃ <= 1; ☃++)
          {
            cj ☃ = ☃.a(☃, ☃, ☃);
            if (☃.p(☃).c() == afi.X)
            {
              if (!☃.d(☃.a(☃ / 2, 0, ☃ / 2))) {
                break;
              }
              ☃.a(cy.z, ☃.n() + 0.5D, ☃.o() + 2.0D, ☃.p() + 0.5D, ☃ + ☃.nextFloat() - 0.5D, ☃ - ☃.nextFloat() - 1.0F, ☃ + ☃.nextFloat() - 0.5D, new int[0]);
            }
          }
        }
      }
    }
  }
  
  public boolean c()
  {
    return false;
  }
  
  public int b()
  {
    return 3;
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new ale();
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof ale)) {
      ☃.a((ale)☃);
    }
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃);
    if (☃.s())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof ale)) {
        ((ale)☃).a(☃.q());
      }
    }
  }
}
