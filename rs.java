public class rs
  extends ro
{
  private final ts c;
  
  public rs(ts ☃, double ☃)
  {
    super(☃, ☃, 8);
    this.c = ☃;
  }
  
  public boolean a()
  {
    return (this.c.cl()) && (!this.c.cn()) && (super.a());
  }
  
  public boolean b()
  {
    return super.b();
  }
  
  public void c()
  {
    super.c();
    this.c.cp().a(false);
  }
  
  public void d()
  {
    super.d();
    this.c.n(false);
  }
  
  public void e()
  {
    super.e();
    
    this.c.cp().a(false);
    if (!f()) {
      this.c.n(false);
    } else if (!this.c.cn()) {
      this.c.n(true);
    }
  }
  
  protected boolean a(adm ☃, cj ☃)
  {
    if (!☃.d(☃.a())) {
      return false;
    }
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (☃ == afi.ae)
    {
      akw ☃ = ☃.s(☃);
      if (((☃ instanceof aky)) && (((aky)☃).l < 1)) {
        return true;
      }
    }
    else
    {
      if (☃ == afi.am) {
        return true;
      }
      if ((☃ == afi.C) && (☃.b(afg.a) != afg.a.a)) {
        return true;
      }
    }
    return false;
  }
}
