import java.util.List;

public class yb
  extends xi
{
  private acy a;
  private ya f;
  private final adm g;
  
  public yb(wm ☃, acy ☃, adm ☃)
  {
    this.a = ☃;
    this.g = ☃;
    
    this.f = new ya(☃.d, ☃);
    a(new yg(this.f, 0, 36, 53));
    a(new yg(this.f, 1, 62, 53));
    a(new yc(☃.d, ☃, this.f, 2, 120, 53));
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
    return this.f;
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
    this.f.h();
    super.a(☃);
  }
  
  public void d(int ☃)
  {
    this.f.d(☃);
  }
  
  public void b(int ☃, int ☃) {}
  
  public boolean a(wn ☃)
  {
    return this.a.v_() == ☃;
  }
  
  public zx b(wn ☃, int ☃)
  {
    zx ☃ = null;
    yg ☃ = (yg)this.c.get(☃);
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
      if (☃.b == 0) {
        ☃.d(null);
      } else {
        ☃.f();
      }
      if (☃.b == ☃.b) {
        return null;
      }
      ☃.a(☃, ☃);
    }
    return ☃;
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    this.a.a_(null);
    
    super.b(☃);
    if (this.g.D) {
      return;
    }
    zx ☃ = this.f.b(0);
    if (☃ != null) {
      ☃.a(☃, false);
    }
    ☃ = this.f.b(1);
    if (☃ != null) {
      ☃.a(☃, false);
    }
  }
}
