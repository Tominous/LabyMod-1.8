import java.util.List;

public class xx
  extends xi
{
  private og a;
  private tp f;
  
  public xx(og ☃, og ☃, final tp ☃, wn ☃)
  {
    a = ☃;
    f = ☃;
    int ☃ = 3;
    ☃.b(☃);
    
    int ☃ = (☃ - 4) * 18;
    
    a(new yg(☃, 0, 8, 18)
    {
      public boolean a(zx ☃)
      {
        return (super.a(☃)) && (☃.b() == zy.aA) && (!e());
      }
    });
    a(new yg(☃, 1, 8, 36)
    {
      public boolean a(zx ☃)
      {
        return (super.a(☃)) && (☃.cO()) && (tp.a(☃.b()));
      }
      
      public boolean b()
      {
        return ☃.cO();
      }
    });
    if (☃.cw()) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        for (int ☃ = 0; ☃ < 5; ☃++) {
          a(new yg(☃, 2 + ☃ + ☃ * 5, 80 + ☃ * 18, 18 + ☃ * 18));
        }
      }
    }
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, 102 + ☃ * 18 + ☃));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 160 + ☃));
    }
  }
  
  public boolean a(wn ☃)
  {
    return (a.a(☃)) && (f.ai()) && (f.g(☃) < 8.0F);
  }
  
  public zx b(wn ☃, int ☃)
  {
    zx ☃ = null;
    yg ☃ = (yg)c.get(☃);
    if ((☃ != null) && (☃.e()))
    {
      zx ☃ = ☃.d();
      ☃ = ☃.k();
      if (☃ < a.o_())
      {
        if (!a(☃, a.o_(), c.size(), true)) {
          return null;
        }
      }
      else if ((a(1).a(☃)) && (!a(1).e()))
      {
        if (!a(☃, 1, 2, false)) {
          return null;
        }
      }
      else if (a(0).a(☃))
      {
        if (!a(☃, 0, 1, false)) {
          return null;
        }
      }
      else if ((a.o_() <= 2) || (!a(☃, 2, a.o_(), false))) {
        return null;
      }
      if (b == 0) {
        ☃.d(null);
      } else {
        ☃.f();
      }
    }
    return ☃;
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    a.c(☃);
  }
}
