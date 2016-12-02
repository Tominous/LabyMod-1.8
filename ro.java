import java.util.Random;

public abstract class ro
  extends rd
{
  private final py c;
  private final double d;
  protected int a;
  private int e;
  private int f;
  protected cj b = cj.a;
  private boolean g;
  private int h;
  
  public ro(py ☃, double ☃, int ☃)
  {
    c = ☃;
    d = ☃;
    h = ☃;
    a(5);
  }
  
  public boolean a()
  {
    if (a > 0)
    {
      a -= 1;
      return false;
    }
    a = (200 + c.bc().nextInt(200));
    return g();
  }
  
  public boolean b()
  {
    return (e >= -f) && (e <= 1200) && (a(c.o, b));
  }
  
  public void c()
  {
    c.s().a(b.n() + 0.5D, b.o() + 1, b.p() + 0.5D, d);
    e = 0;
    f = (c.bc().nextInt(c.bc().nextInt(1200) + 1200) + 1200);
  }
  
  public void d() {}
  
  public void e()
  {
    if (c.c(b.a()) > 1.0D)
    {
      g = false;
      e += 1;
      if (e % 40 == 0) {
        c.s().a(b.n() + 0.5D, b.o() + 1, b.p() + 0.5D, d);
      }
    }
    else
    {
      g = true;
      e -= 1;
    }
  }
  
  protected boolean f()
  {
    return g;
  }
  
  private boolean g()
  {
    int ☃ = h;
    int ☃ = 1;
    cj ☃ = new cj(c);
    for (int ☃ = 0; ☃ <= 1; ☃ = ☃ > 0 ? -☃ : 1 - ☃) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        for (int ☃ = 0; ☃ <= ☃; ☃ = ☃ > 0 ? -☃ : 1 - ☃) {
          for (int ☃ = (☃ < ☃) && (☃ > -☃) ? ☃ : 0; ☃ <= ☃; ☃ = ☃ > 0 ? -☃ : 1 - ☃)
          {
            cj ☃ = ☃.a(☃, ☃ - 1, ☃);
            if ((c.e(☃)) && (a(c.o, ☃)))
            {
              b = ☃;
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  protected abstract boolean a(adm paramadm, cj paramcj);
}
