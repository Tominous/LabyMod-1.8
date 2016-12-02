import java.util.List;

public class xy
  extends xi
{
  public xp a = new xp(this, 2, 2);
  public og f = new ye();
  public boolean g;
  private final wn h;
  
  public xy(wm ☃, boolean ☃, wn ☃)
  {
    this.g = ☃;
    this.h = ☃;
    a(new yf(☃.d, this.a, this.f, 0, 144, 36));
    for (int ☃ = 0; ☃ < 2; ☃++) {
      for (int ☃ = 0; ☃ < 2; ☃++) {
        a(new yg(this.a, ☃ + ☃ * 2, 88 + ☃ * 18, 26 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      final int ☃ = ☃;
      a(new yg(☃, ☃.o_() - 1 - ☃, 8, 8 + ☃ * 18)
      {
        public int a()
        {
          return 1;
        }
        
        public boolean a(zx ☃)
        {
          if (☃ == null) {
            return false;
          }
          if ((☃.b() instanceof yj)) {
            return ((yj)☃.b()).b == ☃;
          }
          if ((☃.b() == zw.a(afi.aU)) || (☃.b() == zy.bX)) {
            return ☃ == 0;
          }
          return false;
        }
        
        public String c()
        {
          return yj.a[☃];
        }
      });
    }
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + (☃ + 1) * 9, 8 + ☃ * 18, 84 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 142));
    }
    a(this.a);
  }
  
  public void a(og ☃)
  {
    this.f.a(0, abt.a().a(this.a, this.h.o));
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      zx ☃ = this.a.b(☃);
      if (☃ != null) {
        ☃.a(☃, false);
      }
    }
    this.f.a(0, null);
  }
  
  public boolean a(wn ☃)
  {
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
        if (!a(☃, 9, 45, true)) {
          return null;
        }
        ☃.a(☃, ☃);
      }
      else if ((☃ >= 1) && (☃ < 5))
      {
        if (!a(☃, 9, 45, false)) {
          return null;
        }
      }
      else if ((☃ >= 5) && (☃ < 9))
      {
        if (!a(☃, 9, 45, false)) {
          return null;
        }
      }
      else if (((☃.b() instanceof yj)) && (!((yg)this.c.get(5 + ((yj)☃.b()).b)).e()))
      {
        int ☃ = 5 + ((yj)☃.b()).b;
        if (!a(☃, ☃, ☃ + 1, false)) {
          return null;
        }
      }
      else if ((☃ >= 9) && (☃ < 36))
      {
        if (!a(☃, 36, 45, false)) {
          return null;
        }
      }
      else if ((☃ >= 36) && (☃ < 45))
      {
        if (!a(☃, 9, 36, false)) {
          return null;
        }
      }
      else if (!a(☃, 9, 45, false))
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
