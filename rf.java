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
    c = ☃;
  }
  
  public boolean a()
  {
    if (a <= 0)
    {
      if (!c.o.Q().b("mobGriefing")) {
        return false;
      }
      f = -1;
      d = c.cu();
      e = c.ct();
    }
    return super.a();
  }
  
  public boolean b()
  {
    return (f >= 0) && (super.b());
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
      if ((f == 0) && ((☃ instanceof afz)) && (((Integer)☃.b(afz.a)).intValue() == 7))
      {
        ☃.b(☃, true);
      }
      else if ((f == 1) && (☃ == afi.a))
      {
        oq ☃ = c.cq();
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
            b -= 1;
            if (b > 0) {
              break;
            }
            ☃.a(☃, null); break;
          }
        }
      }
      f = -1;
      
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
      if (((☃ instanceof afz)) && (((Integer)☃.b(afz.a)).intValue() == 7) && (e) && ((f == 0) || (f < 0)))
      {
        f = 0;
        return true;
      }
      if ((☃ == afi.a) && (d) && ((f == 1) || (f < 0)))
      {
        f = 1;
        return true;
      }
    }
    return false;
  }
}
