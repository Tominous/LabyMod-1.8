import java.util.List;
import java.util.Random;

public class ze
  extends zw
{
  public static final int[] a = { 1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320 };
  
  public ze()
  {
    a(true);
    d(0);
    a(yz.l);
  }
  
  public String e_(zx ☃)
  {
    int ☃ = ☃.i();
    return super.a() + "." + zd.a(☃).d();
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (!☃.a(☃.a(☃), ☃, ☃)) {
      return false;
    }
    zd ☃ = zd.a(☃.i());
    if (☃ == zd.a)
    {
      if (a(☃, ☃, ☃))
      {
        if (!☃.D) {
          ☃.b(2005, ☃, 0);
        }
        return true;
      }
    }
    else if (☃ == zd.m)
    {
      alz ☃ = ☃.p(☃);
      afh ☃ = ☃.c();
      if ((☃ == afi.r) && (☃.b(aio.a) == aio.a.d))
      {
        if (☃ == cq.a) {
          return false;
        }
        if (☃ == cq.b) {
          return false;
        }
        ☃ = ☃.a(☃);
        if (☃.d(☃))
        {
          alz ☃ = afi.bN.a(☃, ☃, ☃, ☃, ☃, ☃, 0, ☃);
          ☃.a(☃, ☃, 2);
          if (!☃.bA.d) {
            ☃.b -= 1;
          }
        }
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(zx ☃, adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    if ((☃.c() instanceof afj))
    {
      afj ☃ = (afj)☃.c();
      if (☃.a(☃, ☃, ☃, ☃.D))
      {
        if (!☃.D)
        {
          if (☃.a(☃, ☃.s, ☃, ☃)) {
            ☃.b(☃, ☃.s, ☃, ☃);
          }
          ☃.b -= 1;
        }
        return true;
      }
    }
    return false;
  }
  
  public static void a(adm ☃, cj ☃, int ☃)
  {
    if (☃ == 0) {
      ☃ = 15;
    }
    afh ☃ = ☃.p(☃).c();
    if (☃.t() == arm.a) {
      return;
    }
    ☃.a(☃, ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      double ☃ = g.nextGaussian() * 0.02D;
      double ☃ = g.nextGaussian() * 0.02D;
      double ☃ = g.nextGaussian() * 0.02D;
      ☃.a(cy.v, ☃.n() + g.nextFloat(), ☃.o() + g.nextFloat() * ☃.E(), ☃.p() + g.nextFloat(), ☃, ☃, ☃, new int[0]);
    }
  }
  
  public boolean a(zx ☃, wn ☃, pr ☃)
  {
    if ((☃ instanceof tv))
    {
      tv ☃ = (tv)☃;
      zd ☃ = zd.a(☃.i());
      if ((!☃.cm()) && (☃.cl() != ☃))
      {
        ☃.b(☃);
        ☃.b -= 1;
      }
      return true;
    }
    return false;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (int ☃ = 0; ☃ < 16; ☃++) {
      ☃.add(new zx(☃, 1, ☃));
    }
  }
}
