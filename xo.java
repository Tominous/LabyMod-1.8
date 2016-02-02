import java.util.List;

public class xo
  extends xi
{
  private og a;
  private int f;
  
  public xo(og ☃, og ☃, wn ☃)
  {
    this.a = ☃;
    this.f = (☃.o_() / 9);
    ☃.b(☃);
    
    int ☃ = (this.f - 4) * 18;
    for (int ☃ = 0; ☃ < this.f; ☃++) {
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
      if (☃ < this.f * 9)
      {
        if (!a(☃, this.f * 9, this.c.size(), true)) {
          return null;
        }
      }
      else if (!a(☃, 0, this.f * 9, false)) {
        return null;
      }
      if (☃.b == 0) {
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
    this.a.c(☃);
  }
  
  public og e()
  {
    return this.a;
  }
}
