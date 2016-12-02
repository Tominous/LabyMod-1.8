import com.google.common.base.Predicates;
import java.util.Random;

public class aor
  extends aot
{
  private static final amh a = amh.a(afi.m).a(ajh.a, Predicates.equalTo(ajh.a.a));
  private final alz b = afi.U.Q().a(akb.N, akb.a.b).a(ahh.a, ahh.a.b);
  private final alz c = afi.A.Q();
  private final alz d = afi.i.Q();
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    while ((☃.d(☃)) && (☃.o() > 2)) {
      ☃ = ☃.b();
    }
    if (!a.a(☃.p(☃))) {
      return false;
    }
    for (int ☃ = -2; ☃ <= 2; ☃++) {
      for (int ☃ = -2; ☃ <= 2; ☃++) {
        if ((☃.d(☃.a(☃, -1, ☃))) && (☃.d(☃.a(☃, -2, ☃)))) {
          return false;
        }
      }
    }
    for (int ☃ = -1; ☃ <= 0; ☃++) {
      for (int ☃ = -2; ☃ <= 2; ☃++) {
        for (int ☃ = -2; ☃ <= 2; ☃++) {
          ☃.a(☃.a(☃, ☃, ☃), c, 2);
        }
      }
    }
    ☃.a(☃, d, 2);
    for (cq ☃ : cq.c.a) {
      ☃.a(☃.a(☃), d, 2);
    }
    for (int ☃ = -2; ☃ <= 2; ☃++) {
      for (int ☃ = -2; ☃ <= 2; ☃++) {
        if ((☃ == -2) || (☃ == 2) || (☃ == -2) || (☃ == 2)) {
          ☃.a(☃.a(☃, 1, ☃), c, 2);
        }
      }
    }
    ☃.a(☃.a(2, 1, 0), b, 2);
    ☃.a(☃.a(-2, 1, 0), b, 2);
    ☃.a(☃.a(0, 1, 2), b, 2);
    ☃.a(☃.a(0, 1, -2), b, 2);
    for (int ☃ = -1; ☃ <= 1; ☃++) {
      for (int ☃ = -1; ☃ <= 1; ☃++) {
        if ((☃ == 0) && (☃ == 0)) {
          ☃.a(☃.a(☃, 4, ☃), c, 2);
        } else {
          ☃.a(☃.a(☃, 4, ☃), b, 2);
        }
      }
    }
    for (int ☃ = 1; ☃ <= 3; ☃++)
    {
      ☃.a(☃.a(-1, ☃, -1), c, 2);
      ☃.a(☃.a(-1, ☃, 1), c, 2);
      ☃.a(☃.a(1, ☃, -1), c, 2);
      ☃.a(☃.a(1, ☃, 1), c, 2);
    }
    return true;
  }
}
