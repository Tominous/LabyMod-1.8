class abj$a
  implements abs
{
  public boolean a(xp ☃, adm ☃)
  {
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if ((☃ != null) && (☃.b() == zy.cE))
      {
        if (☃) {
          return false;
        }
        if (aku.c(☃) >= 6) {
          return false;
        }
        ☃ = true;
      }
    }
    if (!☃) {
      return false;
    }
    return c(☃) != null;
  }
  
  public zx a(xp ☃)
  {
    zx ☃ = null;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        if (☃.b() == zy.cE)
        {
          ☃ = ☃.k();
          b = 1;
          break;
        }
      }
    }
    aku.a ☃ = c(☃);
    if (☃ != null)
    {
      int ☃ = 0;
      for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
      {
        zx ☃ = ☃.a(☃);
        if ((☃ != null) && (☃.b() == zy.aW))
        {
          ☃ = ☃.i();
          break;
        }
      }
      dn ☃ = ☃.a("BlockEntityTag", true);
      du ☃ = null;
      if (☃.b("Patterns", 9))
      {
        ☃ = ☃.c("Patterns", 10);
      }
      else
      {
        ☃ = new du();
        ☃.a("Patterns", ☃);
      }
      dn ☃ = new dn();
      ☃.a("Pattern", ☃.b());
      ☃.a("Color", ☃);
      ☃.a(☃);
    }
    return ☃;
  }
  
  public int a()
  {
    return 10;
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
  
  private aku.a c(xp ☃)
  {
    for (aku.a ☃ : ) {
      if (☃.d())
      {
        boolean ☃ = true;
        if (☃.e())
        {
          boolean ☃ = false;
          boolean ☃ = false;
          for (int ☃ = 0; (☃ < ☃.o_()) && (☃); ☃++)
          {
            zx ☃ = ☃.a(☃);
            if ((☃ != null) && (☃.b() != zy.cE)) {
              if (☃.b() == zy.aW)
              {
                if (☃)
                {
                  ☃ = false;
                  break;
                }
                ☃ = true;
              }
              else if ((!☃) && (☃.a(☃.f())))
              {
                ☃ = true;
              }
              else
              {
                ☃ = false;
                break;
              }
            }
          }
          if (!☃) {
            ☃ = false;
          }
        }
        else if (☃.o_() == ☃.c().length * ☃.c()[0].length())
        {
          int ☃ = -1;
          for (int ☃ = 0; (☃ < ☃.o_()) && (☃); ☃++)
          {
            int ☃ = ☃ / 3;
            int ☃ = ☃ % 3;
            
            zx ☃ = ☃.a(☃);
            if ((☃ == null) || (☃.b() == zy.cE))
            {
              if (☃.c()[☃].charAt(☃) != ' ')
              {
                ☃ = false;
                break;
              }
            }
            else
            {
              if (☃.b() != zy.aW)
              {
                ☃ = false;
                break;
              }
              if ((☃ != -1) && (☃ != ☃.i()))
              {
                ☃ = false;
                break;
              }
              if (☃.c()[☃].charAt(☃) == ' ')
              {
                ☃ = false;
                break;
              }
              ☃ = ☃.i();
            }
          }
        }
        else
        {
          ☃ = false;
        }
        if (☃) {
          return ☃;
        }
      }
    }
    return null;
  }
}
