import java.util.Random;

public class aov
  extends apv
{
  private final alz a;
  private final alz b;
  
  public aov(alz ☃, alz ☃)
  {
    super(false);
    b = ☃;
    a = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    afh ☃;
    while ((((☃ = ☃.p(☃).c()).t() == arm.a) || (☃.t() == arm.j)) && (☃.o() > 0)) {
      ☃ = ☃.b();
    }
    afh ☃ = ☃.p(☃).c();
    if ((☃ == afi.d) || (☃ == afi.c))
    {
      ☃ = ☃.a();
      a(☃, ☃, b);
      for (int ☃ = ☃.o(); ☃ <= ☃.o() + 2; ☃++)
      {
        int ☃ = ☃ - ☃.o();
        int ☃ = 2 - ☃;
        for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++)
        {
          int ☃ = ☃ - ☃.n();
          for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
          {
            int ☃ = ☃ - ☃.p();
            if ((Math.abs(☃) != ☃) || (Math.abs(☃) != ☃) || (☃.nextInt(2) != 0))
            {
              cj ☃ = new cj(☃, ☃, ☃);
              if (!☃.p(☃).c().o()) {
                a(☃, ☃, a);
              }
            }
          }
        }
      }
    }
    return true;
  }
}
