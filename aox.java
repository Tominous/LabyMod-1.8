import java.util.Random;

public class aox
  extends aot
{
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    if (!☃.d(☃)) {
      return false;
    }
    if (☃.p(☃.a()).c() != afi.aV) {
      return false;
    }
    ☃.a(☃, afi.aX.Q(), 2);
    for (int ☃ = 0; ☃ < 1500; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(8) - ☃.nextInt(8), -☃.nextInt(12), ☃.nextInt(8) - ☃.nextInt(8));
      if (☃.p(☃).c().t() == arm.a)
      {
        int ☃ = 0;
        for (cq ☃ : cq.values())
        {
          if (☃.p(☃.a(☃)).c() == afi.aX) {
            ☃++;
          }
          if (☃ > 1) {
            break;
          }
        }
        if (☃ == 1) {
          ☃.a(☃, afi.aX.Q(), 2);
        }
      }
    }
    return true;
  }
}
