import java.util.Random;

public class apv
  extends aoh
{
  private static final alz a = afi.r.Q().a(ail.b, aio.a.a);
  private static final alz b = afi.t.Q().a(aik.Q, aio.a.a).a(ahs.b, Boolean.valueOf(false));
  private final int c;
  private final boolean d;
  private final alz e;
  private final alz f;
  
  public apv(boolean ☃)
  {
    this(☃, 4, a, b, false);
  }
  
  public apv(boolean ☃, int ☃, alz ☃, alz ☃, boolean ☃)
  {
    super(☃);
    this.c = ☃;
    this.e = ☃;
    this.f = ☃;
    this.d = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = ☃.nextInt(3) + this.c;
    
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
    if (((☃ != afi.c) && (☃ != afi.d) && (☃ != afi.ak)) || (☃.o() >= 256 - ☃ - 1)) {
      return false;
    }
    a(☃, ☃.b());
    
    int ☃ = 3;
    int ☃ = 0;
    for (int ☃ = ☃.o() - ☃ + ☃; ☃ <= ☃.o() + ☃; ☃++)
    {
      int ☃ = ☃ - (☃.o() + ☃);
      int ☃ = ☃ + 1 - ☃ / 2;
      for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++)
      {
        int ☃ = ☃ - ☃.n();
        for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
        {
          int ☃ = ☃ - ☃.p();
          if ((Math.abs(☃) != ☃) || (Math.abs(☃) != ☃) || ((☃.nextInt(2) != 0) && (☃ != 0)))
          {
            cj ☃ = new cj(☃, ☃, ☃);
            afh ☃ = ☃.p(☃).c();
            if ((☃.t() == arm.a) || (☃.t() == arm.j) || (☃.t() == arm.l)) {
              a(☃, ☃, this.f);
            }
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      afh ☃ = ☃.p(☃.b(☃)).c();
      if ((☃.t() == arm.a) || (☃.t() == arm.j) || (☃.t() == arm.l))
      {
        a(☃, ☃.b(☃), this.e);
        if ((this.d) && (☃ > 0))
        {
          if ((☃.nextInt(3) > 0) && (☃.d(☃.a(-1, ☃, 0)))) {
            a(☃, ☃.a(-1, ☃, 0), akk.N);
          }
          if ((☃.nextInt(3) > 0) && (☃.d(☃.a(1, ☃, 0)))) {
            a(☃, ☃.a(1, ☃, 0), akk.P);
          }
          if ((☃.nextInt(3) > 0) && (☃.d(☃.a(0, ☃, -1)))) {
            a(☃, ☃.a(0, ☃, -1), akk.O);
          }
          if ((☃.nextInt(3) > 0) && (☃.d(☃.a(0, ☃, 1)))) {
            a(☃, ☃.a(0, ☃, 1), akk.b);
          }
        }
      }
    }
    if (this.d)
    {
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
                b(☃, ☃, akk.N);
              }
              if ((☃.nextInt(4) == 0) && (☃.p(☃).c().t() == arm.a)) {
                b(☃, ☃, akk.P);
              }
              if ((☃.nextInt(4) == 0) && (☃.p(☃).c().t() == arm.a)) {
                b(☃, ☃, akk.O);
              }
              if ((☃.nextInt(4) == 0) && (☃.p(☃).c().t() == arm.a)) {
                b(☃, ☃, akk.b);
              }
            }
          }
        }
      }
      if ((☃.nextInt(5) == 0) && (☃ > 5)) {
        for (int ☃ = 0; ☃ < 2; ☃++) {
          for (cq ☃ : cq.c.a) {
            if (☃.nextInt(4 - ☃) == 0)
            {
              cq ☃ = ☃.d();
              a(☃, ☃.nextInt(3), ☃.a(☃.g(), ☃ - 5 + ☃, ☃.i()), ☃);
            }
          }
        }
      }
    }
    return true;
  }
  
  private void a(adm ☃, int ☃, cj ☃, cq ☃)
  {
    a(☃, ☃, afi.bN.Q().a(afu.a, Integer.valueOf(☃)).a(afu.O, ☃));
  }
  
  private void a(adm ☃, cj ☃, amk ☃)
  {
    a(☃, ☃, afi.bn.Q().a(☃, Boolean.valueOf(true)));
  }
  
  private void b(adm ☃, cj ☃, amk ☃)
  {
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
