import java.util.Random;

public class apm
  extends aot
{
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    for (int ☃ = 0; ☃ < 20; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(4) - ☃.nextInt(4), 0, ☃.nextInt(4) - ☃.nextInt(4));
      if (☃.d(☃))
      {
        cj ☃ = ☃.b();
        if ((☃.p(☃.e()).c().t() == arm.h) || (☃.p(☃.f()).c().t() == arm.h) || (☃.p(☃.c()).c().t() == arm.h) || (☃.p(☃.d()).c().t() == arm.h))
        {
          int ☃ = 2 + ☃.nextInt(☃.nextInt(3) + 1);
          for (int ☃ = 0; ☃ < ☃; ☃++) {
            if (afi.aM.e(☃, ☃)) {
              ☃.a(☃.b(☃), afi.aM.Q(), 2);
            }
          }
        }
      }
    }
    return true;
  }
}
