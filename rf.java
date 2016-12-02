public class rf
  extends ro
{
  private final wi c;
  private boolean d;
  private boolean e;
  private int f;
  
  public rf(wi ☃, double ☃)
  {
    super(☃, ☃, 16);
    this.c = ☃;
  }
  
  public boolean a()
  {
    if (this.a <= 0)
    {
      if (!this.c.o.Q().b("mobGriefing")) {
        return false;
      }
      this.f = -1;
      this.d = this.c.cu();
      this.e = this.c.ct();
    }
    return super.a();
  }
  
  public boolean b()
  {
    return (this.f >= 0) && (super.b());
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
      if ((this.f == 0) && ((☃ instanceof afz)) && (((Integer)☃.b(afz.a)).intValue() == 7))
      {
        ☃.b(☃, true);
      }
      else if ((this.f == 1) && (☃ == afi.a))
      {
        oq ☃ = this.c.cq();
        for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
        {
          zx ☃ = ☃.a(☃);
          boolean ☃ = false;
          if (☃ != null) {
            if (☃.b() == zy.N)
            {
              ☃.a(☃, afi.aj.Q(), 3);
              ☃ = true;
            }
            else if (☃.b() == zy.bS)
            {
              ☃.a(☃, afi.cc.Q(), 3);
              ☃ = true;
            }
            else if (☃.b() == zy.bR)
            {
              ☃.a(☃, afi.cb.Q(), 3);
              ☃ = true;
            }
          }
          if (☃)
          {
            ☃.b -= 1;
            if (☃.b > 0) {
              break;
            }
            ☃.a(☃, null); break;
          }
        }
      }
      this.f = -1;
      
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
      if (((☃ instanceof afz)) && (((Integer)☃.b(afz.a)).intValue() == 7) && (this.e) && ((this.f == 0) || (this.f < 0)))
      {
        this.f = 0;
        return true;
      }
      if ((☃ == afi.a) && (this.d) && ((this.f == 1) || (this.f < 0)))
      {
        this.f = 1;
        return true;
      }
    }
    return false;
  }
}
