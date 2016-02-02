public class abk
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
        if (☃.b() == zy.bN)
        {
          if (☃ != null) {
            return false;
          }
          ☃ = ☃;
        }
        else if (☃.b() == zy.bM)
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
        if (☃.b() == zy.bN)
        {
          if (☃ != null) {
            return null;
          }
          ☃ = ☃;
        }
        else if (☃.b() == zy.bM)
        {
          ☃++;
        }
        else
        {
          return null;
        }
      }
    }
    if ((☃ == null) || (☃ < 1) || (abd.h(☃) >= 2)) {
      return null;
    }
    zx ☃ = new zx(zy.bN, ☃);
    ☃.d((dn)☃.o().b());
    ☃.o().a("generation", abd.h(☃) + 1);
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
      if ((☃ != null) && ((☃.b() instanceof abd)))
      {
        ☃[☃] = ☃;
        break;
      }
    }
    return ☃;
  }
}
