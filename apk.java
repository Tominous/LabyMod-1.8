import java.util.Random;

public class apk
  extends aoh
{
  private static final alz a = afi.r.Q().a(ail.b, aio.a.b);
  private static final alz b = afi.t.Q().a(aik.Q, aio.a.b).a(ahs.b, Boolean.valueOf(false));
  
  public apk()
  {
    super(false);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = ☃.nextInt(5) + 7;
    int ☃ = ☃ - ☃.nextInt(2) - 3;
    int ☃ = ☃ - ☃;
    int ☃ = 1 + ☃.nextInt(☃ + 1);
    
    boolean ☃ = true;
    if ((☃.o() < 1) || (☃.o() + ☃ + 1 > 256)) {
      return false;
    }
    for (int ☃ = ☃.o(); (☃ <= ☃.o() + 1 + ☃) && (☃); ☃++)
    {
      int ☃ = 1;
      if (☃ - ☃.o() < ☃) {
        ☃ = 0;
      } else {
        ☃ = ☃;
      }
      cj.a ☃ = new cj.a();
      for (int ☃ = ☃.n() - ☃; (☃ <= ☃.n() + ☃) && (☃); ☃++) {
        for (int ☃ = ☃.p() - ☃; (☃ <= ☃.p() + ☃) && (☃); ☃++) {
          if ((☃ >= 0) && (☃ < 256))
          {
            if (!a(☃.p(☃.c(☃, ☃, ☃)).c())) {
              ☃ = false;
            }
          }
          else {
            ☃ = false;
          }
        }
      }
    }
    if (!☃) {
      return false;
    }
    afh ☃ = ☃.p(☃.b()).c();
    if (((☃ != afi.c) && (☃ != afi.d)) || (☃.o() >= 256 - ☃ - 1)) {
      return false;
    }
    a(☃, ☃.b());
    
    int ☃ = 0;
    for (int ☃ = ☃.o() + ☃; ☃ >= ☃.o() + ☃; ☃--)
    {
      for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++)
      {
        int ☃ = ☃ - ☃.n();
        for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
        {
          int ☃ = ☃ - ☃.p();
          if ((Math.abs(☃) != ☃) || (Math.abs(☃) != ☃) || (☃ <= 0))
          {
            cj ☃ = new cj(☃, ☃, ☃);
            if (!☃.p(☃).c().o()) {
              a(☃, ☃, b);
            }
          }
        }
      }
      if ((☃ >= 1) && (☃ == ☃.o() + ☃ + 1)) {
        ☃--;
      } else if (☃ < ☃) {
        ☃++;
      }
    }
    for (int ☃ = 0; ☃ < ☃ - 1; ☃++)
    {
      afh ☃ = ☃.p(☃.b(☃)).c();
      if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
        a(☃, ☃.b(☃), a);
      }
    }
    return true;
  }
}
