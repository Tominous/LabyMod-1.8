import java.util.List;

public class xq
  extends xi
{
  public xp a = new xp(this, 3, 3);
  public og f = new ye();
  private adm g;
  private cj h;
  
  public xq(wm ☃, adm ☃, cj ☃)
  {
    this.g = ☃;
    this.h = ☃;
    a(new yf(☃.d, this.a, this.f, 0, 124, 35));
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 3; ☃++) {
        a(new yg(this.a, ☃ + ☃ * 3, 30 + ☃ * 18, 17 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, 84 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 142));
    }
    a(this.a);
  }
  
  public void a(og ☃)
  {
    this.f.a(0, abt.a().a(this.a, this.g));
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    if (this.g.D) {
      return;
    }
    for (int ☃ = 0; ☃ < 9; ☃++)
    {
      zx ☃ = this.a.b(☃);
      if (☃ != null) {
        ☃.a(☃, false);
      }
    }
  }
  
  public boolean a(wn ☃)
  {
    if (this.g.p(this.h).c() != afi.ai) {
      return false;
    }
    if (☃.e(this.h.n() + 0.5D, this.h.o() + 0.5D, this.h.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public zx b(wn ☃, int ☃)
  {
    zx ☃ = null;
    yg ☃ = (yg)this.c.get(☃);
    if ((☃ != null) && (☃.e()))
    {
      zx ☃ = ☃.d();
      ☃ = ☃.k();
      if (☃ == 0)
      {
        if (!a(☃, 10, 46, true)) {
          return null;
        }
        ☃.a(☃, ☃);
      }
      else if ((☃ >= 10) && (☃ < 37))
      {
        if (!a(☃, 37, 46, false)) {
          return null;
        }
      }
      else if ((☃ >= 37) && (☃ < 46))
      {
        if (!a(☃, 10, 37, false)) {
          return null;
        }
      }
      else if (!a(☃, 10, 46, false))
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
  
  public boolean a(zx ☃, yg ☃)
  {
    return (☃.d != this.f) && (super.a(☃, ☃));
  }
}
