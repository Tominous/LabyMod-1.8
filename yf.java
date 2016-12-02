public class yf
  extends yg
{
  private final xp a;
  private final wn b;
  private int c;
  
  public yf(wn ☃, xp ☃, og ☃, int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃);
    b = ☃;
    a = ☃;
  }
  
  public boolean a(zx ☃)
  {
    return false;
  }
  
  public zx a(int ☃)
  {
    if (e()) {
      c += Math.min(☃, db);
    }
    return super.a(☃);
  }
  
  protected void a(zx ☃, int ☃)
  {
    c += ☃;
    c(☃);
  }
  
  protected void c(zx ☃)
  {
    if (c > 0) {
      ☃.a(b.o, b, c);
    }
    c = 0;
    if (☃.b() == zw.a(afi.ai)) {
      b.b(mr.h);
    }
    if ((☃.b() instanceof aag)) {
      b.b(mr.i);
    }
    if (☃.b() == zw.a(afi.al)) {
      b.b(mr.j);
    }
    if ((☃.b() instanceof zv)) {
      b.b(mr.l);
    }
    if (☃.b() == zy.P) {
      b.b(mr.m);
    }
    if (☃.b() == zy.aZ) {
      b.b(mr.n);
    }
    if (((☃.b() instanceof aag)) && (((aag)☃.b()).g() != zw.a.a)) {
      b.b(mr.o);
    }
    if ((☃.b() instanceof aay)) {
      b.b(mr.r);
    }
    if (☃.b() == zw.a(afi.bC)) {
      b.b(mr.E);
    }
    if (☃.b() == zw.a(afi.X)) {
      b.b(mr.G);
    }
    if ((☃.b() == zy.ao) && (☃.i() == 1)) {
      b.b(mr.M);
    }
  }
  
  public void a(wn ☃, zx ☃)
  {
    c(☃);
    
    zx[] ☃ = abt.a().b(a, o);
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      zx ☃ = a.a(☃);
      zx ☃ = ☃[☃];
      if (☃ != null) {
        a.a(☃, 1);
      }
      if (☃ != null) {
        if (a.a(☃) == null) {
          a.a(☃, ☃);
        } else if (!b.bi.a(☃)) {
          b.a(☃, false);
        }
      }
    }
  }
}
