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
    return new aui(this.b.s, this.b.t + this.b.K * 0.5D, this.b.u);
  }
  
  protected void l()
  {
    aui ☃ = c();
    
    float ☃ = this.b.J * this.b.J;
    int ☃ = 6;
    if (☃.g(this.d.a(this.b, this.d.e())) < ☃) {
      this.d.a();
    }
    for (int ☃ = Math.min(this.d.e() + ☃, this.d.d() - 1); ☃ > this.d.e(); ☃--)
    {
      aui ☃ = this.d.a(this.b, ☃);
      if (☃.g(☃) <= 36.0D) {
        if (a(☃, ☃, 0, 0, 0))
        {
          this.d.c(☃);
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
    auh ☃ = this.c.a(☃, new aui(☃.a, ☃.b + this.b.K * 0.5D, ☃.c), false, true, false);
    return (☃ == null) || (☃.a == auh.a.a);
  }
}
