import java.util.Random;

public class aoz
  extends aot
{
  private afh a;
  
  public aoz(afh ☃)
  {
    super(true);
    this.a = ☃;
  }
  
  public aoz()
  {
    super(false);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    if (this.a == null) {
      this.a = (☃.nextBoolean() ? afi.bg : afi.bh);
    }
    int ☃ = ☃.nextInt(3) + 4;
    
    boolean ☃ = true;
    if ((☃.o() < 1) || (☃.o() + ☃ + 1 >= 256)) {
      return false;
    }
    for (int ☃ = ☃.o(); ☃ <= ☃.o() + 1 + ☃; ☃++)
    {
      int ☃ = 3;
      if (☃ <= ☃.o() + 3) {
        ☃ = 0;
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
    if ((☃ != afi.d) && (☃ != afi.c) && (☃ != afi.bw)) {
      return false;
    }
    int ☃ = ☃.o() + ☃;
    if (this.a == afi.bh) {
      ☃ = ☃.o() + ☃ - 3;
    }
    for (int ☃ = ☃; ☃ <= ☃.o() + ☃; ☃++)
    {
      int ☃ = 1;
      if (☃ < ☃.o() + ☃) {
        ☃++;
      }
      if (this.a == afi.bg) {
        ☃ = 3;
      }
      int ☃ = ☃.n() - ☃;
      int ☃ = ☃.n() + ☃;
      int ☃ = ☃.p() - ☃;
      int ☃ = ☃.p() + ☃;
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          int ☃ = 5;
          if (☃ == ☃) {
            ☃--;
          } else if (☃ == ☃) {
            ☃++;
          }
          if (☃ == ☃) {
            ☃ -= 3;
          } else if (☃ == ☃) {
            ☃ += 3;
          }
          aho.a ☃ = aho.a.a(☃);
          if ((this.a == afi.bg) || (☃ < ☃.o() + ☃))
          {
            if (((☃ == ☃) || (☃ == ☃)) && ((☃ == ☃) || (☃ == ☃))) {
              continue;
            }
            if ((☃ == ☃.n() - (☃ - 1)) && (☃ == ☃)) {
              ☃ = aho.a.a;
            }
            if ((☃ == ☃) && (☃ == ☃.p() - (☃ - 1))) {
              ☃ = aho.a.a;
            }
            if ((☃ == ☃.n() + (☃ - 1)) && (☃ == ☃)) {
              ☃ = aho.a.c;
            }
            if ((☃ == ☃) && (☃ == ☃.p() - (☃ - 1))) {
              ☃ = aho.a.c;
            }
            if ((☃ == ☃.n() - (☃ - 1)) && (☃ == ☃)) {
              ☃ = aho.a.g;
            }
            if ((☃ == ☃) && (☃ == ☃.p() + (☃ - 1))) {
              ☃ = aho.a.g;
            }
            if ((☃ == ☃.n() + (☃ - 1)) && (☃ == ☃)) {
              ☃ = aho.a.i;
            }
            if ((☃ == ☃) && (☃ == ☃.p() + (☃ - 1))) {
              ☃ = aho.a.i;
            }
          }
          if ((☃ == aho.a.e) && (☃ < ☃.o() + ☃)) {
            ☃ = aho.a.k;
          }
          if ((☃.o() >= ☃.o() + ☃ - 1) || (☃ != aho.a.k))
          {
            cj ☃ = new cj(☃, ☃, ☃);
            if (!☃.p(☃).c().o()) {
              a(☃, ☃, this.a.Q().a(aho.a, ☃));
            }
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      afh ☃ = ☃.p(☃.b(☃)).c();
      if (!☃.o()) {
        a(☃, ☃.b(☃), this.a.Q().a(aho.a, aho.a.j));
      }
    }
    return true;
  }
}
