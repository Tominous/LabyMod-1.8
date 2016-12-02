import java.util.List;

public class yb
  extends xi
{
  private acy a;
  private ya f;
  private final adm g;
  
  public yb(wm ☃, acy ☃, adm ☃)
  {
    a = ☃;
    g = ☃;
    
    f = new ya(d, ☃);
    a(new yg(f, 0, 36, 53));
    a(new yg(f, 1, 62, 53));
    a(new yc(d, ☃, f, 2, 120, 53));
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, 84 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 142));
    }
  }
  
  public ya e()
  {
    return f;
  }
  
  public void a(xn ☃)
  {
    super.a(☃);
  }
  
  public void b()
  {
    super.b();
  }
  
  public void a(og ☃)
  {
    f.h();
    super.a(☃);
  }
  
  public void d(int ☃)
  {
    f.d(☃);
  }
  
  public void b(int ☃, int ☃) {}
  
  public boolean a(wn ☃)
  {
    return a.v_() == ☃;
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
      else if ((☃ == 0) || (☃ == 1))
      {
        if (!a(☃, 3, 39, false)) {
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
  
  public void b(wn ☃)
  {
    super.b(☃);
    a.a_(null);
    
    super.b(☃);
    if (g.D) {
      return;
    }
    zx ☃ = f.b(0);
    if (☃ != null) {
      ☃.a(☃, false);
    }
    ☃ = f.b(1);
    if (☃ != null) {
      ☃.a(☃, false);
    }
  }
}
