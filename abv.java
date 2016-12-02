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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public zx b()
  {
    return this.d;
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
    for (int ☃ = 0; ☃ <= 3 - this.a; ☃++) {
      for (int ☃ = 0; ☃ <= 3 - this.b; ☃++)
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
        if ((☃ >= 0) && (☃ >= 0) && (☃ < this.a) && (☃ < this.b)) {
          if (☃) {
            ☃ = this.c[(this.a - ☃ - 1 + ☃ * this.a)];
          } else {
            ☃ = this.c[(☃ + ☃ * this.a)];
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
    if (this.e) {
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
    return this.a * this.b;
  }
}
