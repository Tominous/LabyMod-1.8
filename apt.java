import java.util.Random;

public class apt
  extends aoh
{
  private static final alz a = afi.r.Q().a(ail.b, aio.a.a);
  private static final alz b = afi.t.Q().a(aik.Q, aio.a.a).a(aik.b, Boolean.valueOf(false));
  
  public apt()
  {
    super(false);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = ☃.nextInt(4) + 5;
    while (☃.p(☃.b()).c().t() == arm.h) {
      ☃ = ☃.b();
    }
    boolean ☃ = true;
    if ((☃.o() < 1) || (☃.o() + ☃ + 1 > 256)) {
      return false;
    }
    for (int ☃ = ☃.o(); ☃ <= ☃.o() + 1 + ☃; ☃++)
    {
      int ☃ = 1;
      if (☃ == ☃.o()) {
        ☃ = 0;
      }
      if (☃ >= ☃.o() + 1 + ☃ - 2) {
        ☃ = 3;
      }
      cj.a ☃ = new cj.a();
      for (int ☃ = ☃.n() - ☃; (☃ <= ☃.n() + ☃) && (☃); ☃++) {
        for (int ☃ = ☃.p() - ☃; (☃ <= ☃.p() + ☃) && (☃); ☃++) {
          if ((☃ >= 0) && (☃ < 256))
          {
            afh ☃ = ☃.p(☃.c(☃, ☃, ☃)).c();
            if ((☃.t() != arm.a) && (☃.t() != arm.j)) {
              if ((☃ == afi.j) || (☃ == afi.i))
              {
                if (☃ > ☃.o()) {
                  ☃ = false;
                }
              }
              else {
                ☃ = false;
              }
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
    if (((☃ != afi.c) && (☃ != afi.d)) || (☃.o() >= 256 - ☃ - 1)) {
      return false;
    }
    a(☃, ☃.b());
    for (int ☃ = ☃.o() - 3 + ☃; ☃ <= ☃.o() + ☃; ☃++)
    {
      int ☃ = ☃ - (☃.o() + ☃);
      int ☃ = 2 - ☃ / 2;
      for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++)
      {
        int ☃ = ☃ - ☃.n();
        for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
        {
          int ☃ = ☃ - ☃.p();
          if ((Math.abs(☃) != ☃) || (Math.abs(☃) != ☃) || ((☃.nextInt(2) != 0) && (☃ != 0)))
          {
            cj ☃ = new cj(☃, ☃, ☃);
            if (!☃.p(☃).c().o()) {
              a(☃, ☃, b);
            }
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      afh ☃ = ☃.p(☃.b(☃)).c();
      if ((☃.t() == arm.a) || (☃.t() == arm.j) || (☃ == afi.i) || (☃ == afi.j)) {
        a(☃, ☃.b(☃), a);
      }
    }
    for (int ☃ = ☃.o() - 3 + ☃; ☃ <= ☃.o() + ☃; ☃++)
    {
      int ☃ = ☃ - (☃.o() + ☃);
      int ☃ = 2 - ☃ / 2;
      cj.a ☃ = new cj.a();
      for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++) {
        for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
        {
          ☃.c(☃, ☃, ☃);
          if (☃.p(☃).c().t() == arm.j)
          {
            cj ☃ = ☃.e();
            cj ☃ = ☃.f();
            cj ☃ = ☃.c();
            cj ☃ = ☃.d();
            if ((☃.nextInt(4) == 0) && (☃.p(☃).c().t() == arm.a)) {
              a(☃, ☃, akk.N);
            }
            if ((☃.nextInt(4) == 0) && (☃.p(☃).c().t() == arm.a)) {
              a(☃, ☃, akk.P);
            }
            if ((☃.nextInt(4) == 0) && (☃.p(☃).c().t() == arm.a)) {
              a(☃, ☃, akk.O);
            }
            if ((☃.nextInt(4) == 0) && (☃.p(☃).c().t() == arm.a)) {
              a(☃, ☃, akk.b);
            }
          }
        }
      }
    }
    return true;
  }
  
  private void a(adm ☃, cj ☃, amk ☃)
  {
    alz ☃ = afi.bn.Q().a(☃, Boolean.valueOf(true));
    a(☃, ☃, ☃);
    int ☃ = 4;
    
    ☃ = ☃.b();
    while ((☃.p(☃).c().t() == arm.a) && (☃ > 0))
    {
      a(☃, ☃, ☃);
      ☃ = ☃.b();
      ☃--;
    }
  }
}
