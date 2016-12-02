class tu$h
  extends ro
{
  private final tu c;
  private boolean d;
  private boolean e = false;
  
  public tu$h(tu ☃)
  {
    super(☃, 0.699999988079071D, 16);
    c = ☃;
  }
  
  public boolean a()
  {
    if (a <= 0)
    {
      if (!c.o.Q().b("mobGriefing")) {
        return false;
      }
      e = false;
      d = tu.a(c);
    }
    return super.a();
  }
  
  public boolean b()
  {
    return (e) && (super.b());
  }
  
  public void c()
  {
    super.c();
  }
  
  public void d()
  {
    super.d();
  }
  
  public void e()
  {
    super.e();
    
    c.p().a(b.n() + 0.5D, b.o() + 1, b.p() + 0.5D, 10.0F, c.bQ());
    if (f())
    {
      adm ☃ = c.o;
      cj ☃ = b.a();
      
      alz ☃ = ☃.p(☃);
      afh ☃ = ☃.c();
      if ((e) && ((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7))
      {
        ☃.a(☃, afi.a.Q(), 2);
        ☃.b(☃, true);
        c.cp();
      }
      e = false;
      
      a = 10;
    }
  }
  
  protected boolean a(adm ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃).c();
    if (☃ == afi.ak)
    {
      ☃ = ☃.a();
      alz ☃ = ☃.p(☃);
      ☃ = ☃.c();
      if (((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7) && (d) && (!e))
      {
        e = true;
        return true;
      }
    }
    return false;
  }
}
