import java.util.Random;

public class apf
  extends apg
{
  private static final alz e = afi.r.Q().a(ail.b, aio.a.b);
  private static final alz f = afi.t.Q().a(aik.Q, aio.a.b).a(ahs.b, Boolean.valueOf(false));
  private static final alz g = afi.d.Q().a(agf.a, agf.a.c);
  private boolean h;
  
  public apf(boolean ☃, boolean ☃)
  {
    super(☃, 13, 15, e, f);
    h = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = a(☃);
    if (!a(☃, ☃, ☃, ☃)) {
      return false;
    }
    a(☃, ☃.n(), ☃.p(), ☃.o() + ☃, 0, ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      afh ☃ = ☃.p(☃.b(☃)).c();
      if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
        a(☃, ☃.b(☃), b);
      }
      if (☃ < ☃ - 1)
      {
        ☃ = ☃.p(☃.a(1, ☃, 0)).c();
        if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
          a(☃, ☃.a(1, ☃, 0), b);
        }
        ☃ = ☃.p(☃.a(1, ☃, 1)).c();
        if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
          a(☃, ☃.a(1, ☃, 1), b);
        }
        ☃ = ☃.p(☃.a(0, ☃, 1)).c();
        if ((☃.t() == arm.a) || (☃.t() == arm.j)) {
          a(☃, ☃.a(0, ☃, 1), b);
        }
      }
    }
    return true;
  }
  
  private void a(adm ☃, int ☃, int ☃, int ☃, int ☃, Random ☃)
  {
    int ☃ = ☃.nextInt(5) + (h ? a : 3);
    
    int ☃ = 0;
    for (int ☃ = ☃ - ☃; ☃ <= ☃; ☃++)
    {
      int ☃ = ☃ - ☃;
      int ☃ = ☃ + ns.d(☃ / ☃ * 3.5F);
      a(☃, new cj(☃, ☃, ☃), ☃ + ((☃ > 0) && (☃ == ☃) && ((☃ & 0x1) == 0) ? 1 : 0));
      ☃ = ☃;
    }
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    b(☃, ☃.e().c());
    b(☃, ☃.g(2).c());
    b(☃, ☃.e().e(2));
    b(☃, ☃.g(2).e(2));
    for (int ☃ = 0; ☃ < 5; ☃++)
    {
      int ☃ = ☃.nextInt(64);
      int ☃ = ☃ % 8;
      int ☃ = ☃ / 8;
      if ((☃ == 0) || (☃ == 7) || (☃ == 0) || (☃ == 7)) {
        b(☃, ☃.a(-3 + ☃, 0, -3 + ☃));
      }
    }
  }
  
  private void b(adm ☃, cj ☃)
  {
    for (int ☃ = -2; ☃ <= 2; ☃++) {
      for (int ☃ = -2; ☃ <= 2; ☃++) {
        if ((Math.abs(☃) != 2) || (Math.abs(☃) != 2)) {
          c(☃, ☃.a(☃, 0, ☃));
        }
      }
    }
  }
  
  private void c(adm ☃, cj ☃)
  {
    for (int ☃ = 2; ☃ >= -3; ☃--)
    {
      cj ☃ = ☃.b(☃);
      afh ☃ = ☃.p(☃).c();
      if ((☃ == afi.c) || (☃ == afi.d)) {
        a(☃, ☃, g);
      } else {
        if ((☃.t() != arm.a) && (☃ < 0)) {
          break;
        }
      }
    }
  }
}
