public class abv
  implements abs
{
  private final int a;
  private final int b;
  private final zx[] c;
  private final zx d;
  private boolean e;
  
  public abv(int ☃, int ☃, zx[] ☃, zx ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public zx b()
  {
    return d;
  }
  
  public zx[] b(xp ☃)
  {
    zx[] ☃ = new zx[☃.o_()];
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      zx ☃ = ☃.a(☃);
      if ((☃ != null) && (☃.b().r())) {
        ☃[☃] = new zx(☃.b().q());
      }
    }
    return ☃;
  }
  
  public boolean a(xp ☃, adm ☃)
  {
    for (int ☃ = 0; ☃ <= 3 - a; ☃++) {
      for (int ☃ = 0; ☃ <= 3 - b; ☃++)
      {
        if (a(☃, ☃, ☃, true)) {
          return true;
        }
        if (a(☃, ☃, ☃, false)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean a(xp ☃, int ☃, int ☃, boolean ☃)
  {
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 3; ☃++)
      {
        int ☃ = ☃ - ☃;
        int ☃ = ☃ - ☃;
        zx ☃ = null;
        if ((☃ >= 0) && (☃ >= 0) && (☃ < a) && (☃ < b)) {
          if (☃) {
            ☃ = c[(a - ☃ - 1 + ☃ * a)];
          } else {
            ☃ = c[(☃ + ☃ * a)];
          }
        }
        zx ☃ = ☃.c(☃, ☃);
        if ((☃ != null) || (☃ != null))
        {
          if (((☃ == null) && (☃ != null)) || ((☃ != null) && (☃ == null))) {
            return false;
          }
          if (☃.b() != ☃.b()) {
            return false;
          }
          if ((☃.i() != 32767) && (☃.i() != ☃.i())) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public zx a(xp ☃)
  {
    zx ☃ = b().k();
    if (e) {
      for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
      {
        zx ☃ = ☃.a(☃);
        if ((☃ != null) && (☃.n())) {
          ☃.d((dn)☃.o().b());
        }
      }
    }
    return ☃;
  }
  
  public int a()
  {
    return a * b;
  }
}
