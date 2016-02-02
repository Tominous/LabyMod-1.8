import java.util.List;
import java.util.Random;

public class aol
  extends aot
{
  private final List<ob> a;
  private final int b;
  
  public aol(List<ob> ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    afh ☃;
    while ((((☃ = ☃.p(☃).c()).t() == arm.a) || (☃.t() == arm.j)) && (☃.o() > 1)) {
      ☃ = ☃.b();
    }
    if (☃.o() < 1) {
      return false;
    }
    ☃ = ☃.a();
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(4) - ☃.nextInt(4), ☃.nextInt(3) - ☃.nextInt(3), ☃.nextInt(4) - ☃.nextInt(4));
      if ((☃.d(☃)) && (adm.a(☃, ☃.b())))
      {
        ☃.a(☃, afi.ae.Q(), 2);
        
        akw ☃ = ☃.s(☃);
        if ((☃ instanceof aky)) {
          ob.a(☃, this.a, (aky)☃, this.b);
        }
        cj ☃ = ☃.f();
        cj ☃ = ☃.e();
        cj ☃ = ☃.c();
        cj ☃ = ☃.d();
        if ((☃.d(☃)) && (adm.a(☃, ☃.b()))) {
          ☃.a(☃, afi.aa.Q(), 2);
        }
        if ((☃.d(☃)) && (adm.a(☃, ☃.b()))) {
          ☃.a(☃, afi.aa.Q(), 2);
        }
        if ((☃.d(☃)) && (adm.a(☃, ☃.b()))) {
          ☃.a(☃, afi.aa.Q(), 2);
        }
        if ((☃.d(☃)) && (adm.a(☃, ☃.b()))) {
          ☃.a(☃, afi.aa.Q(), 2);
        }
        return true;
      }
    }
    return false;
  }
}
