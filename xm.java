import java.util.List;

public class xm
  extends xi
{
  private og a;
  private final yg f;
  private int g;
  
  public xm(wm ☃, og ☃)
  {
    a = ☃;
    
    a(new xm.b(d, ☃, 0, 56, 46));
    a(new xm.b(d, ☃, 1, 79, 53));
    a(new xm.b(d, ☃, 2, 102, 46));
    f = a(new xm.a(☃, 3, 79, 17));
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
      if (g != a.a_(0)) {
        ☃.a(this, 0, a.a_(0));
      }
    }
    g = a.a_(0);
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
      if (((☃ >= 0) && (☃ <= 2)) || (☃ == 3))
      {
        if (!a(☃, 4, 40, true)) {
          return null;
        }
        ☃.a(☃, ☃);
      }
      else if ((!f.e()) && (f.a(☃)))
      {
        if (!a(☃, 3, 4, false)) {
          return null;
        }
      }
      else if (xm.b.b_(☃))
      {
        if (!a(☃, 0, 3, false)) {
          return null;
        }
      }
      else if ((☃ >= 4) && (☃ < 31))
      {
        if (!a(☃, 31, 40, false)) {
          return null;
        }
      }
      else if ((☃ >= 31) && (☃ < 40))
      {
        if (!a(☃, 4, 31, false)) {
          return null;
        }
      }
      else if (!a(☃, 4, 40, false))
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
  
  static class b
    extends yg
  {
    private wn a;
    
    public b(wn ☃, og ☃, int ☃, int ☃, int ☃)
    {
      super(☃, ☃, ☃);
      a = ☃;
    }
    
    public boolean a(zx ☃)
    {
      return b_(☃);
    }
    
    public int a()
    {
      return 1;
    }
    
    public void a(wn ☃, zx ☃)
    {
      if ((☃.b() == zy.bz) && (☃.i() > 0)) {
        a.b(mr.B);
      }
      super.a(☃, ☃);
    }
    
    public static boolean b_(zx ☃)
    {
      return (☃ != null) && ((☃.b() == zy.bz) || (☃.b() == zy.bA));
    }
  }
  
  class a
    extends yg
  {
    public a(og ☃, int ☃, int ☃, int ☃)
    {
      super(☃, ☃, ☃);
    }
    
    public boolean a(zx ☃)
    {
      if (☃ != null) {
        return ☃.b().l(☃);
      }
      return false;
    }
    
    public int a()
    {
      return 64;
    }
  }
}
