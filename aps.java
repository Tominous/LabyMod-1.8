import java.util.Random;

public class aps
  extends aoh
{
  private static final alz a = afi.r.Q().a(ail.b, aio.a.b);
  private static final alz b = afi.t.Q().a(aik.Q, aio.a.b).a(ahs.b, Boolean.valueOf(false));
  
  public aps(boolean ☃)
  {
    super(☃);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = ☃.nextInt(4) + 6;
    int ☃ = 1 + ☃.nextInt(2);
    int ☃ = ☃ - ☃;
    int ☃ = 2 + ☃.nextInt(2);
    
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
            afh ☃ = ☃.p(☃.c(☃, ☃, ☃)).c();
            if ((☃.t() != arm.a) && (☃.t() != arm.j)) {
              ☃ = false;
            }
          }
          else
          {
            ☃ = false;
          }
        }
      }
    }
    if (!☃) {
      return false;
    }
    afh ☃ = ☃.p(☃.b()).c();
    if (((☃ != afi.c) && (☃ != afi.d) && (☃ != afi.ak)) || (☃.o() >= 256 - ☃ - 1)) {
      return false;
    }
    a(☃, ☃.b());
    
    int ☃ = ☃.nextInt(2);
    int ☃ = 1;
    int ☃ = 0;
    for (int ☃ = 0; ☃ <= ☃; ☃++)
    {
      int ☃ = ☃.o() + ☃ - ☃;
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
      if (☃ >= ☃)
      {
        ☃ = ☃;
        ☃ = 1;
        ☃++;
        if (☃ > ☃) {
          ☃ = ☃;
        }
      }
      else
      {
        ☃++;
      }
    }
    int ☃ = ☃.nextInt(3);
    for (int ☃ = 0; ☃ < ☃ - ☃; ☃++)
    {
      afh ☃ = ☃.p(☃.b(☃)).c();
      if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
        a(☃, ☃.b(☃), a);
      }
    }
    return true;
  }
}
