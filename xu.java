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
    this.a = ☃;
    
    a(new yg(☃, 0, 56, 17));
    a(new xt(☃, 1, 56, 53));
    a(new xv(☃.d, ☃, 2, 116, 35));
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
    ☃.a(this, this.a);
  }
  
  public void b()
  {
    super.b();
    for (int ☃ = 0; ☃ < this.e.size(); ☃++)
    {
      xn ☃ = (xn)this.e.get(☃);
      if (this.f != this.a.a_(2)) {
        ☃.a(this, 2, this.a.a_(2));
      }
      if (this.h != this.a.a_(0)) {
        ☃.a(this, 0, this.a.a_(0));
      }
      if (this.i != this.a.a_(1)) {
        ☃.a(this, 1, this.a.a_(1));
      }
      if (this.g != this.a.a_(3)) {
        ☃.a(this, 3, this.a.a_(3));
      }
    }
    this.f = this.a.a_(2);
    this.h = this.a.a_(0);
    this.i = this.a.a_(1);
    this.g = this.a.a_(3);
  }
  
  public void b(int ☃, int ☃)
  {
    this.a.b(☃, ☃);
  }
  
  public boolean a(wn ☃)
  {
    return this.a.a(☃);
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
}
