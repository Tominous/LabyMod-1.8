import java.util.Random;

public class apo
  extends aot
{
  private afh a;
  private int b;
  
  public apo(afh ☃, int ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    if (☃.p(☃).c().t() != arm.h) {
      return false;
    }
    int ☃ = ☃.nextInt(b - 2) + 2;
    int ☃ = 2;
    for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++) {
      for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
      {
        int ☃ = ☃ - ☃.n();
        int ☃ = ☃ - ☃.p();
        if (☃ * ☃ + ☃ * ☃ <= ☃ * ☃) {
          for (int ☃ = ☃.o() - ☃; ☃ <= ☃.o() + ☃; ☃++)
          {
            cj ☃ = new cj(☃, ☃, ☃);
            afh ☃ = ☃.p(☃).c();
            if ((☃ == afi.d) || (☃ == afi.c)) {
              ☃.a(☃, a.Q(), 2);
            }
          }
        }
      }
    }
    return true;
  }
}
