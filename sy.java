public class sy
  extends sw
{
  public sy(ps ☃, adm ☃)
  {
    super(☃, ☃);
  }
  
  protected asy a()
  {
    return new asy(new asz());
  }
  
  protected boolean b()
  {
    return o();
  }
  
  protected aui c()
  {
    return new aui(b.s, b.t + b.K * 0.5D, b.u);
  }
  
  protected void l()
  {
    aui ☃ = c();
    
    float ☃ = b.J * b.J;
    int ☃ = 6;
    if (☃.g(d.a(b, d.e())) < ☃) {
      d.a();
    }
    for (int ☃ = Math.min(d.e() + ☃, d.d() - 1); ☃ > d.e(); ☃--)
    {
      aui ☃ = d.a(b, ☃);
      if (☃.g(☃) <= 36.0D) {
        if (a(☃, ☃, 0, 0, 0))
        {
          d.c(☃);
          break;
        }
      }
    }
    a(☃);
  }
  
  protected void d()
  {
    super.d();
  }
  
  protected boolean a(aui ☃, aui ☃, int ☃, int ☃, int ☃)
  {
    auh ☃ = c.a(☃, new aui(a, b + b.K * 0.5D, c), false, true, false);
    return (☃ == null) || (a == auh.a.a);
  }
}
