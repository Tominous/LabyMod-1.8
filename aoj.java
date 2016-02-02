import java.util.Random;

public class aoj
  extends aoh
{
  private static final alz a = afi.r.Q().a(ail.b, aio.a.c);
  private static final alz b = afi.t.Q().a(aik.Q, aio.a.c).a(aik.b, Boolean.valueOf(false));
  private boolean c;
  
  public aoj(boolean ☃, boolean ☃)
  {
    super(☃);
    this.c = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = ☃.nextInt(3) + 5;
    if (this.c) {
      ☃ += ☃.nextInt(7);
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
    for (int ☃ = ☃.o() - 3 + ☃; ☃ <= ☃.o() + ☃; ☃++)
    {
      int ☃ = ☃ - (☃.o() + ☃);
      int ☃ = 1 - ☃ / 2;
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
            if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
              a(☃, ☃, b);
            }
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      afh ☃ = ☃.p(☃.b(☃)).c();
      if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
        a(☃, ☃.b(☃), a);
      }
    }
    return true;
  }
}
