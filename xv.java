public class xv
  extends yg
{
  private wn a;
  private int b;
  
  public xv(wn ☃, og ☃, int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃);
    
    a = ☃;
  }
  
  public boolean a(zx ☃)
  {
    return false;
  }
  
  public zx a(int ☃)
  {
    if (e()) {
      b += Math.min(☃, db);
    }
    return super.a(☃);
  }
  
  public void a(wn ☃, zx ☃)
  {
    c(☃);
    super.a(☃, ☃);
  }
  
  protected void a(zx ☃, int ☃)
  {
    b += ☃;
    c(☃);
  }
  
  protected void c(zx ☃)
  {
    ☃.a(a.o, a, b);
    if (!a.o.D)
    {
      int ☃ = b;
      float ☃ = abo.a().b(☃);
      if (☃ == 0.0F)
      {
        ☃ = 0;
      }
      else if (☃ < 1.0F)
      {
        int ☃ = ns.d(☃ * ☃);
        if ((☃ < ns.f(☃ * ☃)) && (Math.random() < ☃ * ☃ - ☃)) {
          ☃++;
        }
        ☃ = ☃;
      }
      while (☃ > 0)
      {
        int ☃ = pp.a(☃);
        ☃ -= ☃;
        a.o.d(new pp(a.o, a.s, a.t + 0.5D, a.u + 0.5D, ☃));
      }
    }
    b = 0;
    if (☃.b() == zy.j) {
      a.b(mr.k);
    }
    if (☃.b() == zy.aV) {
      a.b(mr.p);
    }
  }
}
