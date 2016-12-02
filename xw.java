import java.util.List;

public class xw
  extends xi
{
  private final og a;
  
  public xw(wm ☃, og ☃, wn ☃)
  {
    a = ☃;
    ☃.b(☃);
    int ☃ = 51;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++) {
      a(new yg(☃, ☃, 44 + ☃ * 18, 20));
    }
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, ☃ * 18 + ☃));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 58 + ☃));
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
      if (☃ < a.o_())
      {
        if (!a(☃, a.o_(), c.size(), true)) {
          return null;
        }
      }
      else if (!a(☃, 0, a.o_(), false)) {
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
