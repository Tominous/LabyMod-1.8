public class rs
  extends ro
{
  private final ts c;
  
  public rs(ts ☃, double ☃)
  {
    super(☃, ☃, 8);
    c = ☃;
  }
  
  public boolean a()
  {
    return (c.cl()) && (!c.cn()) && (super.a());
  }
  
  public boolean b()
  {
    return super.b();
  }
  
  public void c()
  {
    super.c();
    c.cp().a(false);
  }
  
  public void d()
  {
    super.d();
    c.n(false);
  }
  
  public void e()
  {
    super.e();
    
    c.cp().a(false);
    if (!f()) {
      c.n(false);
    } else if (!c.cn()) {
      c.n(true);
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
      if (((☃ instanceof aky)) && (l < 1)) {
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
