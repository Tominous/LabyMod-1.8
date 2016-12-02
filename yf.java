public class yf
  extends yg
{
  private final xp a;
  private final wn b;
  private int c;
  
  public yf(wn ☃, xp ☃, og ☃, int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃);
    this.b = ☃;
    this.a = ☃;
  }
  
  public boolean a(zx ☃)
  {
    return false;
  }
  
  public zx a(int ☃)
  {
    if (e()) {
      this.c += Math.min(☃, d().b);
    }
    return super.a(☃);
  }
  
  protected void a(zx ☃, int ☃)
  {
    this.c += ☃;
    c(☃);
  }
  
  protected void c(zx ☃)
  {
    if (this.c > 0) {
      ☃.a(this.b.o, this.b, this.c);
    }
    this.c = 0;
    if (☃.b() == zw.a(afi.ai)) {
      this.b.b(mr.h);
    }
    if ((☃.b() instanceof aag)) {
      this.b.b(mr.i);
    }
    if (☃.b() == zw.a(afi.al)) {
      this.b.b(mr.j);
    }
    if ((☃.b() instanceof zv)) {
      this.b.b(mr.l);
    }
    if (☃.b() == zy.P) {
      this.b.b(mr.m);
    }
    if (☃.b() == zy.aZ) {
      this.b.b(mr.n);
    }
    if (((☃.b() instanceof aag)) && (((aag)☃.b()).g() != zw.a.a)) {
      this.b.b(mr.o);
    }
    if ((☃.b() instanceof aay)) {
      this.b.b(mr.r);
    }
    if (☃.b() == zw.a(afi.bC)) {
      this.b.b(mr.E);
    }
    if (☃.b() == zw.a(afi.X)) {
      this.b.b(mr.G);
    }
    if ((☃.b() == zy.ao) && (☃.i() == 1)) {
      this.b.b(mr.M);
    }
  }
  
  public void a(wn ☃, zx ☃)
  {
    c(☃);
    
    zx[] ☃ = abt.a().b(this.a, ☃.o);
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      zx ☃ = this.a.a(☃);
      zx ☃ = ☃[☃];
      if (☃ != null) {
        this.a.a(☃, 1);
      }
      if (☃ != null) {
        if (this.a.a(☃) == null) {
          this.a.a(☃, ☃);
        } else if (!this.b.bi.a(☃)) {
          this.b.a(☃, false);
        }
      }
    }
  }
}
