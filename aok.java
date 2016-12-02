import java.util.Random;

public class aok
  extends aot
{
  private final afh a;
  private final int b;
  
  public aok(afh ☃, int ☃)
  {
    super(false);
    a = ☃;
    b = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    while (☃.o() > 3)
    {
      if (!☃.d(☃.b()))
      {
        afh ☃ = ☃.p(☃.b()).c();
        if ((☃ == afi.c) || (☃ == afi.d) || (☃ == afi.b)) {
          break;
        }
      }
      ☃ = ☃.b();
    }
    if (☃.o() <= 3) {
      return false;
    }
    int ☃ = b;
    int ☃ = 0;
    while ((☃ >= 0) && (☃ < 3))
    {
      int ☃ = ☃ + ☃.nextInt(2);
      int ☃ = ☃ + ☃.nextInt(2);
      int ☃ = ☃ + ☃.nextInt(2);
      float ☃ = (☃ + ☃ + ☃) * 0.333F + 0.5F;
      for (cj ☃ : cj.a(☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃))) {
        if (☃.i(☃) <= ☃ * ☃) {
          ☃.a(☃, a.Q(), 4);
        }
      }
      ☃ = ☃.a(-(☃ + 1) + ☃.nextInt(2 + ☃ * 2), 0 - ☃.nextInt(2), -(☃ + 1) + ☃.nextInt(2 + ☃ * 2));
      ☃++;
    }
    return true;
  }
}
