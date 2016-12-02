import java.util.List;

public class xu
  extends xi
{
  private final og a;
  private int f;
  private int g;
  private int h;
  private int i;
  
  public xu(wm ☃, og ☃)
  {
    a = ☃;
    
    a(new yg(☃, 0, 56, 17));
    a(new xt(☃, 1, 56, 53));
    a(new xv(d, ☃, 2, 116, 35));
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, 84 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 142));
    }
  }
  
  public void a(xn ☃)
  {
    super.a(☃);
    ☃.a(this, a);
  }
  
  public void b()
  {
    super.b();
    for (int ☃ = 0; ☃ < e.size(); ☃++)
    {
      xn ☃ = (xn)e.get(☃);
      if (f != a.a_(2)) {
        ☃.a(this, 2, a.a_(2));
      }
      if (h != a.a_(0)) {
        ☃.a(this, 0, a.a_(0));
      }
      if (i != a.a_(1)) {
        ☃.a(this, 1, a.a_(1));
      }
      if (g != a.a_(3)) {
        ☃.a(this, 3, a.a_(3));
      }
    }
    f = a.a_(2);
    h = a.a_(0);
    i = a.a_(1);
    g = a.a_(3);
  }
  
  public void b(int ☃, int ☃)
  {
    a.b(☃, ☃);
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
      if (☃ == 2)
      {
        if (!a(☃, 3, 39, true)) {
          return null;
        }
        ☃.a(☃, ☃);
      }
      else if ((☃ == 1) || (☃ == 0))
      {
        if (!a(☃, 3, 39, false)) {
          return null;
        }
      }
      else if (abo.a().a(☃) != null)
      {
        if (!a(☃, 0, 1, false)) {
          return null;
        }
      }
      else if (alh.c(☃))
      {
        if (!a(☃, 1, 2, false)) {
          return null;
        }
      }
      else if ((☃ >= 3) && (☃ < 30))
      {
        if (!a(☃, 30, 39, false)) {
          return null;
        }
      }
      else if ((☃ >= 30) && (☃ < 39) && 
        (!a(☃, 3, 30, false)))
      {
        return null;
      }
      if (b == 0) {
        ☃.d(null);
      } else {
        ☃.f();
      }
      if (b == b) {
        return null;
      }
      ☃.a(☃, ☃);
    }
    return ☃;
  }
}
