import java.util.Random;

public class app
  extends aoh
{
  private static final alz a = afi.s.Q().a(aig.b, aio.a.e);
  private static final alz b = afi.u.Q().a(aif.Q, aio.a.e).a(ahs.b, Boolean.valueOf(false));
  
  public app(boolean ☃)
  {
    super(☃);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = ☃.nextInt(3) + ☃.nextInt(3) + 5;
    
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
        ☃ = 2;
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
    
    cq ☃ = cq.c.a.a(☃);
    int ☃ = ☃ - ☃.nextInt(4) - 1;
    int ☃ = 3 - ☃.nextInt(3);
    
    int ☃ = ☃.n();int ☃ = ☃.p();
    int ☃ = 0;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.o() + ☃;
      if ((☃ >= ☃) && (☃ > 0))
      {
        ☃ += ☃.g();
        ☃ += ☃.i();
        ☃--;
      }
      cj ☃ = new cj(☃, ☃, ☃);
      arm ☃ = ☃.p(☃).c().t();
      if ((☃ == arm.a) || (☃ == arm.j))
      {
        b(☃, ☃);
        ☃ = ☃;
      }
    }
    cj ☃ = new cj(☃, ☃, ☃);
    for (int ☃ = -3; ☃ <= 3; ☃++) {
      for (int ☃ = -3; ☃ <= 3; ☃++) {
        if ((Math.abs(☃) != 3) || (Math.abs(☃) != 3)) {
          c(☃, ☃.a(☃, 0, ☃));
        }
      }
    }
    ☃ = ☃.a();
    for (int ☃ = -1; ☃ <= 1; ☃++) {
      for (int ☃ = -1; ☃ <= 1; ☃++) {
        c(☃, ☃.a(☃, 0, ☃));
      }
    }
    c(☃, ☃.g(2));
    c(☃, ☃.f(2));
    c(☃, ☃.e(2));
    c(☃, ☃.d(2));
    
    ☃ = ☃.n();
    ☃ = ☃.p();
    cq ☃ = cq.c.a.a(☃);
    if (☃ != ☃)
    {
      int ☃ = ☃ - ☃.nextInt(2) - 1;
      int ☃ = 1 + ☃.nextInt(3);
      
      ☃ = 0;
      for (int ☃ = ☃; (☃ < ☃) && (☃ > 0); ☃--)
      {
        if (☃ >= 1)
        {
          int ☃ = ☃.o() + ☃;
          ☃ += ☃.g();
          ☃ += ☃.i();
          cj ☃ = new cj(☃, ☃, ☃);
          arm ☃ = ☃.p(☃).c().t();
          if ((☃ == arm.a) || (☃ == arm.j))
          {
            b(☃, ☃);
            ☃ = ☃;
          }
        }
        ☃++;
      }
      if (☃ > 0)
      {
        cj ☃ = new cj(☃, ☃, ☃);
        for (int ☃ = -2; ☃ <= 2; ☃++) {
          for (int ☃ = -2; ☃ <= 2; ☃++) {
            if ((Math.abs(☃) != 2) || (Math.abs(☃) != 2)) {
              c(☃, ☃.a(☃, 0, ☃));
            }
          }
        }
        ☃ = ☃.a();
        for (int ☃ = -1; ☃ <= 1; ☃++) {
          for (int ☃ = -1; ☃ <= 1; ☃++) {
            c(☃, ☃.a(☃, 0, ☃));
          }
        }
      }
    }
    return true;
  }
  
  private void b(adm ☃, cj ☃)
  {
    a(☃, ☃, a);
  }
  
  private void c(adm ☃, cj ☃)
  {
    arm ☃ = ☃.p(☃).c().t();
    if ((☃ == arm.a) || (☃ == arm.j)) {
      a(☃, ☃, b);
    }
  }
}
