public class asz
  extends asw
{
  public void a(adq ☃, pk ☃)
  {
    super.a(☃, ☃);
  }
  
  public void a()
  {
    super.a();
  }
  
  public asv a(pk ☃)
  {
    return a(ns.c(☃.aR().a), ns.c(☃.aR().b + 0.5D), ns.c(☃.aR().c));
  }
  
  public asv a(pk ☃, double ☃, double ☃, double ☃)
  {
    return a(ns.c(☃ - ☃.J / 2.0F), ns.c(☃ + 0.5D), ns.c(☃ - ☃.J / 2.0F));
  }
  
  public int a(asv[] ☃, pk ☃, asv ☃, asv ☃, float ☃)
  {
    int ☃ = 0;
    for (cq ☃ : cq.values())
    {
      asv ☃ = a(☃, ☃.a + ☃.g(), ☃.b + ☃.h(), ☃.c + ☃.i());
      if ((☃ != null) && (!☃.i) && (☃.a(☃) < ☃)) {
        ☃[(☃++)] = ☃;
      }
    }
    return ☃;
  }
  
  private asv a(pk ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = b(☃, ☃, ☃, ☃);
    if (☃ == -1) {
      return a(☃, ☃, ☃);
    }
    return null;
  }
  
  private int b(pk ☃, int ☃, int ☃, int ☃)
  {
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ < ☃ + this.c; ☃++) {
      for (int ☃ = ☃; ☃ < ☃ + this.d; ☃++) {
        for (int ☃ = ☃; ☃ < ☃ + this.e; ☃++)
        {
          afh ☃ = this.a.p(☃.c(☃, ☃, ☃)).c();
          if (☃.t() != arm.h) {
            return 0;
          }
        }
      }
    }
    return -1;
  }
}
