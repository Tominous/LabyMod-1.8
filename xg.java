public class xg
{
  private int a;
  private float b;
  private float c;
  private int d;
  private int e;
  
  public xg()
  {
    a = 20;
    e = 20;
    b = 5.0F;
  }
  
  public void a(int ☃, float ☃)
  {
    a = Math.min(☃ + a, 20);
    b = Math.min(b + ☃ * ☃ * 2.0F, a);
  }
  
  public void a(zs ☃, zx ☃)
  {
    a(☃.h(☃), ☃.i(☃));
  }
  
  public void a(wn ☃)
  {
    oj ☃ = o.aa();
    
    e = a;
    if (c > 4.0F)
    {
      c -= 4.0F;
      if (b > 0.0F) {
        b = Math.max(b - 1.0F, 0.0F);
      } else if (☃ != oj.a) {
        a = Math.max(a - 1, 0);
      }
    }
    if ((o.Q().b("naturalRegeneration")) && (a >= 18) && (☃.cm()))
    {
      d += 1;
      if (d >= 80)
      {
        ☃.h(1.0F);
        a(3.0F);
        d = 0;
      }
    }
    else if (a <= 0)
    {
      d += 1;
      if (d >= 80)
      {
        if ((☃.bn() > 10.0F) || (☃ == oj.d) || ((☃.bn() > 1.0F) && (☃ == oj.c))) {
          ☃.a(ow.g, 1.0F);
        }
        d = 0;
      }
    }
    else
    {
      d = 0;
    }
  }
  
  public void a(dn ☃)
  {
    if (☃.b("foodLevel", 99))
    {
      a = ☃.f("foodLevel");
      d = ☃.f("foodTickTimer");
      b = ☃.h("foodSaturationLevel");
      c = ☃.h("foodExhaustionLevel");
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("foodLevel", a);
    ☃.a("foodTickTimer", d);
    ☃.a("foodSaturationLevel", b);
    ☃.a("foodExhaustionLevel", c);
  }
  
  public int a()
  {
    return a;
  }
  
  public int b()
  {
    return e;
  }
  
  public boolean c()
  {
    return a < 20;
  }
  
  public void a(float ☃)
  {
    c = Math.min(c + ☃, 40.0F);
  }
  
  public float e()
  {
    return b;
  }
  
  public void a(int ☃)
  {
    a = ☃;
  }
  
  public void b(float ☃)
  {
    b = ☃;
  }
}
