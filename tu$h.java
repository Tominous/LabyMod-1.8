class tu$h
  extends ro
{
  private final tu c;
  private boolean d;
  private boolean e = false;
  
  public tu$h(tu ☃)
  {
    super(☃, 0.699999988079071D, 16);
    this.c = ☃;
  }
  
  public boolean a()
  {
    if (this.a <= 0)
    {
      if (!this.c.o.Q().b("mobGriefing")) {
        return false;
      }
      this.e = false;
      this.d = tu.a(this.c);
    }
    return super.a();
  }
  
  public boolean b()
  {
    return (this.e) && (super.b());
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
    
    this.c.p().a(this.b.n() + 0.5D, this.b.o() + 1, this.b.p() + 0.5D, 10.0F, this.c.bQ());
    if (f())
    {
      adm ☃ = this.c.o;
      cj ☃ = this.b.a();
      
      alz ☃ = ☃.p(☃);
      afh ☃ = ☃.c();
      if ((this.e) && ((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7))
      {
        ☃.a(☃, afi.a.Q(), 2);
        ☃.b(☃, true);
        this.c.cp();
      }
      this.e = false;
      
      this.a = 10;
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
      if (((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7) && (this.d) && (!this.e))
      {
        this.e = true;
        return true;
      }
    }
    return false;
  }
}
