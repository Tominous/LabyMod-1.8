import java.util.List;

public class xl
  extends xi
{
  private og a;
  private final xl.a f;
  
  public xl(og ☃, og ☃)
  {
    this.a = ☃;
    
    a(this.f = new xl.a(☃, 0, 136, 110));
    
    int ☃ = 36;
    int ☃ = 137;
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, ☃ + ☃ * 18, ☃ + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, ☃ + ☃ * 18, 58 + ☃));
    }
  }
  
  public void a(xn ☃)
  {
    super.a(☃);
    ☃.a(this, this.a);
  }
  
  public void b(int ☃, int ☃)
  {
    this.a.b(☃, ☃);
  }
  
  public og e()
  {
    return this.a;
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    if ((☃ == null) || (☃.o.D)) {
      return;
    }
    zx ☃ = this.f.a(this.f.a());
    if (☃ != null) {
      ☃.a(☃, false);
    }
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
      if (☃ == 0)
      {
        if (!a(☃, 1, 37, true)) {
          return null;
        }
        ☃.a(☃, ☃);
      }
      else if ((!this.f.e()) && (this.f.a(☃)) && (☃.b == 1))
      {
        if (!a(☃, 0, 1, false)) {
          return null;
        }
      }
      else if ((☃ >= 1) && (☃ < 28))
      {
        if (!a(☃, 28, 37, false)) {
          return null;
        }
      }
      else if ((☃ >= 28) && (☃ < 37))
      {
        if (!a(☃, 1, 28, false)) {
          return null;
        }
      }
      else if (!a(☃, 1, 37, false))
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
        return (☃.b() == zy.bO) || (☃.b() == zy.i) || (☃.b() == zy.k) || (☃.b() == zy.j);
      }
      return false;
    }
    
    public int a()
    {
      return 1;
    }
  }
}
