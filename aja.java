import java.util.Random;

public class aja
  extends afh
{
  private final boolean a;
  
  public aja(boolean ☃)
  {
    super(arm.e);
    if (☃) {
      a(true);
    }
    this.a = ☃;
  }
  
  public int a(adm ☃)
  {
    return 30;
  }
  
  public void a(adm ☃, cj ☃, wn ☃)
  {
    e(☃, ☃);
    super.a(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, pk ☃)
  {
    e(☃, ☃);
    super.a(☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    e(☃, ☃);
    return super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private void e(adm ☃, cj ☃)
  {
    f(☃, ☃);
    if (this == afi.aC) {
      ☃.a(☃, afi.aD.Q());
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (this == afi.aD) {
      ☃.a(☃, afi.aC.Q());
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.aC;
  }
  
  public int a(int ☃, Random ☃)
  {
    return a(☃) + ☃.nextInt(☃ + 1);
  }
  
  public int a(Random ☃)
  {
    return 4 + ☃.nextInt(2);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃);
    if (a(☃, ☃.s, ☃) != zw.a(this))
    {
      int ☃ = 1 + ☃.s.nextInt(5);
      b(☃, ☃, ☃);
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (this.a) {
      f(☃, ☃);
    }
  }
  
  private void f(adm ☃, cj ☃)
  {
    Random ☃ = ☃.s;
    double ☃ = 0.0625D;
    for (int ☃ = 0; ☃ < 6; ☃++)
    {
      double ☃ = ☃.n() + ☃.nextFloat();
      double ☃ = ☃.o() + ☃.nextFloat();
      double ☃ = ☃.p() + ☃.nextFloat();
      if ((☃ == 0) && (!☃.p(☃.a()).c().c())) {
        ☃ = ☃.o() + ☃ + 1.0D;
      }
      if ((☃ == 1) && (!☃.p(☃.b()).c().c())) {
        ☃ = ☃.o() - ☃;
      }
      if ((☃ == 2) && (!☃.p(☃.d()).c().c())) {
        ☃ = ☃.p() + ☃ + 1.0D;
      }
      if ((☃ == 3) && (!☃.p(☃.c()).c().c())) {
        ☃ = ☃.p() - ☃;
      }
      if ((☃ == 4) && (!☃.p(☃.f()).c().c())) {
        ☃ = ☃.n() + ☃ + 1.0D;
      }
      if ((☃ == 5) && (!☃.p(☃.e()).c().c())) {
        ☃ = ☃.n() - ☃;
      }
      if ((☃ < ☃.n()) || (☃ > ☃.n() + 1) || (☃ < 0.0D) || (☃ > ☃.o() + 1) || (☃ < ☃.p()) || (☃ > ☃.p() + 1)) {
        ☃.a(cy.E, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      }
    }
  }
  
  protected zx i(alz ☃)
  {
    return new zx(afi.aC);
  }
}
