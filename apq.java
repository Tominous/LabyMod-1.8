import java.util.Random;

public class apq
  extends aot
{
  private afh a;
  
  public apq(afh ☃)
  {
    this.a = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    if ((!☃.d(☃)) || (☃.p(☃.b()).c() != this.a)) {
      return false;
    }
    int ☃ = ☃.nextInt(32) + 6;
    int ☃ = ☃.nextInt(4) + 1;
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++) {
      for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
      {
        int ☃ = ☃ - ☃.n();
        int ☃ = ☃ - ☃.p();
        if ((☃ * ☃ + ☃ * ☃ <= ☃ * ☃ + 1) && 
          (☃.p(☃.c(☃, ☃.o() - 1, ☃)).c() != this.a)) {
          return false;
        }
      }
    }
    for (int ☃ = ☃.o(); ☃ < ☃.o() + ☃; ☃++)
    {
      if (☃ >= 256) {
        break;
      }
      for (int ☃ = ☃.n() - ☃; ☃ <= ☃.n() + ☃; ☃++) {
        for (int ☃ = ☃.p() - ☃; ☃ <= ☃.p() + ☃; ☃++)
        {
          int ☃ = ☃ - ☃.n();
          int ☃ = ☃ - ☃.p();
          if (☃ * ☃ + ☃ * ☃ <= ☃ * ☃ + 1) {
            ☃.a(new cj(☃, ☃, ☃), afi.Z.Q(), 2);
          }
        }
      }
    }
    pk ☃ = new uf(☃);
    ☃.b(☃.n() + 0.5F, ☃.o() + ☃, ☃.p() + 0.5F, ☃.nextFloat() * 360.0F, 0.0F);
    ☃.d(☃);
    ☃.a(☃.b(☃), afi.h.Q(), 2);
    
    return true;
  }
}
