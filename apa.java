import java.util.Random;

public class apa
  extends aot
{
  private afh a;
  private int b;
  
  public apa(int ☃)
  {
    this.a = afi.cB;
    this.b = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    while ((☃.d(☃)) && (☃.o() > 2)) {
      ☃ = ☃.b();
    }
    if (☃.p(☃).c() != afi.aJ) {
      return false;
    }
    int ☃ = ☃.nextInt(this.b - 2) + 2;
    int ☃ = 1;
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
            if ((☃ == afi.d) || (☃ == afi.aJ) || (☃ == afi.aI)) {
              ☃.a(☃, this.a.Q(), 2);
            }
          }
        }
      }
    }
    return true;
  }
}
