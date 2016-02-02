public class xg
{
  private int a;
  private float b;
  private float c;
  private int d;
  private int e;
  
  public xg()
  {
    this.a = 20;
    this.e = 20;
    this.b = 5.0F;
  }
  
  public void a(int ☃, float ☃)
  {
    this.a = Math.min(☃ + this.a, 20);
    this.b = Math.min(this.b + ☃ * ☃ * 2.0F, this.a);
  }
  
  public void a(zs ☃, zx ☃)
  {
    a(☃.h(☃), ☃.i(☃));
  }
  
  public void a(wn ☃)
  {
    oj ☃ = ☃.o.aa();
    
    this.e = this.a;
    if (this.c > 4.0F)
    {
      this.c -= 4.0F;
      if (this.b > 0.0F) {
        this.b = Math.max(this.b - 1.0F, 0.0F);
      } else if (☃ != oj.a) {
        this.a = Math.max(this.a - 1, 0);
      }
    }
    if ((☃.o.Q().b("naturalRegeneration")) && (this.a >= 18) && (☃.cm()))
    {
      this.d += 1;
      if (this.d >= 80)
      {
        ☃.h(1.0F);
        a(3.0F);
        this.d = 0;
      }
    }
    else if (this.a <= 0)
    {
      this.d += 1;
      if (this.d >= 80)
      {
        if ((☃.bn() > 10.0F) || (☃ == oj.d) || ((☃.bn() > 1.0F) && (☃ == oj.c))) {
          ☃.a(ow.g, 1.0F);
        }
        this.d = 0;
      }
    }
    else
    {
      this.d = 0;
    }
  }
  
  public void a(dn ☃)
  {
    if (☃.b("foodLevel", 99))
    {
      this.a = ☃.f("foodLevel");
      this.d = ☃.f("foodTickTimer");
      this.b = ☃.h("foodSaturationLevel");
      this.c = ☃.h("foodExhaustionLevel");
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("foodLevel", this.a);
    ☃.a("foodTickTimer", this.d);
    ☃.a("foodSaturationLevel", this.b);
    ☃.a("foodExhaustionLevel", this.c);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public boolean c()
  {
    return this.a < 20;
  }
  
  public void a(float ☃)
  {
    this.c = Math.min(this.c + ☃, 40.0F);
  }
  
  public float e()
  {
    return this.b;
  }
  
  public void a(int ☃)
  {
    this.a = ☃;
  }
  
  public void b(float ☃)
  {
    this.b = ☃;
  }
}
