import java.util.Random;

public class apn
  extends aoh
{
  private static final alz a = afi.s.Q().a(aig.b, aio.a.f);
  private static final alz b = afi.u.Q().a(aif.Q, aio.a.f).a(ahs.b, Boolean.valueOf(false));
  
  public apn(boolean ☃)
  {
    super(☃);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = ☃.nextInt(3) + ☃.nextInt(2) + 6;
    
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    if ((☃ < 1) || (☃ + ☃ + 1 >= 256)) {
      return false;
    }
    cj ☃ = ☃.b();
    afh ☃ = ☃.p(☃).c();
    if ((☃ != afi.c) && (☃ != afi.d)) {
      return false;
    }
    if (!a(☃, ☃, ☃)) {
      return false;
    }
    a(☃, ☃);
    a(☃, ☃.f());
    a(☃, ☃.d());
    a(☃, ☃.d().f());
    
    cq ☃ = cq.c.a.a(☃);
    int ☃ = ☃ - ☃.nextInt(4);
    int ☃ = 2 - ☃.nextInt(3);
    
    int ☃ = ☃;
    int ☃ = ☃;
    int ☃ = ☃ + ☃ - 1;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      if ((☃ >= ☃) && (☃ > 0))
      {
        ☃ += ☃.g();
        ☃ += ☃.i();
        ☃--;
      }
      int ☃ = ☃ + ☃;
      cj ☃ = new cj(☃, ☃, ☃);
      arm ☃ = ☃.p(☃).c().t();
      if ((☃ == arm.a) || (☃ == arm.j))
      {
        b(☃, ☃);
        b(☃, ☃.f());
        b(☃, ☃.d());
        b(☃, ☃.f().d());
      }
    }
    for (int ☃ = -2; ☃ <= 0; ☃++) {
      for (int ☃ = -2; ☃ <= 0; ☃++)
      {
        int ☃ = -1;
        a(☃, ☃ + ☃, ☃ + ☃, ☃ + ☃);
        a(☃, 1 + ☃ - ☃, ☃ + ☃, ☃ + ☃);
        a(☃, ☃ + ☃, ☃ + ☃, 1 + ☃ - ☃);
        a(☃, 1 + ☃ - ☃, ☃ + ☃, 1 + ☃ - ☃);
        if (((☃ > -2) || (☃ > -1)) && ((☃ != -1) || (☃ != -2)))
        {
          ☃ = 1;
          a(☃, ☃ + ☃, ☃ + ☃, ☃ + ☃);
          a(☃, 1 + ☃ - ☃, ☃ + ☃, ☃ + ☃);
          a(☃, ☃ + ☃, ☃ + ☃, 1 + ☃ - ☃);
          a(☃, 1 + ☃ - ☃, ☃ + ☃, 1 + ☃ - ☃);
        }
      }
    }
    if (☃.nextBoolean())
    {
      a(☃, ☃, ☃ + 2, ☃);
      a(☃, ☃ + 1, ☃ + 2, ☃);
      a(☃, ☃ + 1, ☃ + 2, ☃ + 1);
      a(☃, ☃, ☃ + 2, ☃ + 1);
    }
    for (int ☃ = -3; ☃ <= 4; ☃++) {
      for (int ☃ = -3; ☃ <= 4; ☃++) {
        if (((☃ != -3) || (☃ != -3)) && ((☃ != -3) || (☃ != 4)) && ((☃ != 4) || (☃ != -3)) && ((☃ != 4) || (☃ != 4))) {
          if ((Math.abs(☃) < 3) || (Math.abs(☃) < 3)) {
            a(☃, ☃ + ☃, ☃, ☃ + ☃);
          }
        }
      }
    }
    for (int ☃ = -1; ☃ <= 2; ☃++) {
      for (int ☃ = -1; ☃ <= 2; ☃++) {
        if ((☃ < 0) || (☃ > 1) || (☃ < 0) || (☃ > 1)) {
          if (☃.nextInt(3) <= 0)
          {
            int ☃ = ☃.nextInt(3) + 2;
            for (int ☃ = 0; ☃ < ☃; ☃++) {
              b(☃, new cj(☃ + ☃, ☃ - ☃ - 1, ☃ + ☃));
            }
            for (int ☃ = -1; ☃ <= 1; ☃++) {
              for (int ☃ = -1; ☃ <= 1; ☃++) {
                a(☃, ☃ + ☃ + ☃, ☃, ☃ + ☃ + ☃);
              }
            }
            for (int ☃ = -2; ☃ <= 2; ☃++) {
              for (int ☃ = -2; ☃ <= 2; ☃++) {
                if ((Math.abs(☃) != 2) || (Math.abs(☃) != 2)) {
                  a(☃, ☃ + ☃ + ☃, ☃ - 1, ☃ + ☃ + ☃);
                }
              }
            }
          }
        }
      }
    }
    return true;
  }
  
  private boolean a(adm ☃, cj ☃, int ☃)
  {
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    
    cj.a ☃ = new cj.a();
    for (int ☃ = 0; ☃ <= ☃ + 1; ☃++)
    {
      int ☃ = 1;
      if (☃ == 0) {
        ☃ = 0;
      }
      if (☃ >= ☃ - 1) {
        ☃ = 2;
      }
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        for (int ☃ = -☃; ☃ <= ☃; ☃++) {
          if (!a(☃.p(☃.c(☃ + ☃, ☃ + ☃, ☃ + ☃)).c())) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  private void b(adm ☃, cj ☃)
  {
    if (a(☃.p(☃).c())) {
      a(☃, ☃, a);
    }
  }
  
  private void a(adm ☃, int ☃, int ☃, int ☃)
  {
    cj ☃ = new cj(☃, ☃, ☃);
    afh ☃ = ☃.p(☃).c();
    if (☃.t() == arm.a) {
      a(☃, ☃, b);
    }
  }
}
