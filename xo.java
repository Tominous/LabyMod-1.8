import java.util.List;

public class xo
  extends xi
{
  private og a;
  private int f;
  
  public xo(og ☃, og ☃, wn ☃)
  {
    a = ☃;
    f = (☃.o_() / 9);
    ☃.b(☃);
    
    int ☃ = (f - 4) * 18;
    for (int ☃ = 0; ☃ < f; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9, 8 + ☃ * 18, 18 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, 103 + ☃ * 18 + ☃));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 161 + ☃));
    }
  }
  
  public boolean a(wn ☃)
  {
    return a.a(☃);
  }
  
  public zx b(wn ☃, int ☃)
  {
    zx ☃ = null;
    yg ☃ = (yg)c.get(☃);
    if ((☃ != null) && (☃.e()))
    {
      zx ☃ = ☃.d();
      ☃ = ☃.k();
      if (☃ < f * 9)
      {
        if (!a(☃, f * 9, c.size(), true)) {
          return null;
        }
      }
      else if (!a(☃, 0, f * 9, false)) {
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
  
  public og e()
  {
    return a;
  }
}
