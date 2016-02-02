public class abp
  implements abs
{
  public boolean a(xp ☃, adm ☃)
  {
    int ☃ = 0;
    zx ☃ = null;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        if (☃.b() == zy.bd)
        {
          if (☃ != null) {
            return false;
          }
          ☃ = ☃;
        }
        else if (☃.b() == zy.bV)
        {
          ☃++;
        }
        else
        {
          return false;
        }
      }
    }
    return (☃ != null) && (☃ > 0);
  }
  
  public zx a(xp ☃)
  {
    int ☃ = 0;
    zx ☃ = null;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        if (☃.b() == zy.bd)
        {
          if (☃ != null) {
            return null;
          }
          ☃ = ☃;
        }
        else if (☃.b() == zy.bV)
        {
          ☃++;
        }
        else
        {
          return null;
        }
      }
    }
    if ((☃ == null) || (☃ < 1)) {
      return null;
    }
    zx ☃ = new zx(zy.bd, ☃ + 1, ☃.i());
    if (☃.s()) {
      ☃.c(☃.q());
    }
    return ☃;
  }
  
  public int a()
  {
    return 9;
  }
  
  public zx b()
  {
    return null;
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
}
