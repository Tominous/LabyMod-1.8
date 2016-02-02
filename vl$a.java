import java.util.Random;

class vl$a
  extends rd
{
  private vl a;
  private int b;
  private int c;
  
  public vl$a(vl ☃)
  {
    this.a = ☃;
    
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = this.a.u();
    if ((☃ == null) || (!☃.ai())) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    this.b = 0;
  }
  
  public void d()
  {
    this.a.a(false);
  }
  
  public void e()
  {
    this.c -= 1;
    
    pr ☃ = this.a.u();
    
    double ☃ = this.a.h(☃);
    if (☃ < 4.0D)
    {
      if (this.c <= 0)
      {
        this.c = 20;
        this.a.r(☃);
      }
      this.a.q().a(☃.s, ☃.t, ☃.u, 1.0D);
    }
    else if (☃ < 256.0D)
    {
      double ☃ = ☃.s - this.a.s;
      double ☃ = ☃.aR().b + ☃.K / 2.0F - (this.a.t + this.a.K / 2.0F);
      double ☃ = ☃.u - this.a.u;
      if (this.c <= 0)
      {
        this.b += 1;
        if (this.b == 1)
        {
          this.c = 60;
          this.a.a(true);
        }
        else if (this.b <= 4)
        {
          this.c = 6;
        }
        else
        {
          this.c = 100;
          this.b = 0;
          this.a.a(false);
        }
        if (this.b > 1)
        {
          float ☃ = ns.c(ns.a(☃)) * 0.5F;
          
          this.a.o.a(null, 1009, new cj((int)this.a.s, (int)this.a.t, (int)this.a.u), 0);
          for (int ☃ = 0; ☃ < 1; ☃++)
          {
            ww ☃ = new ww(this.a.o, this.a, ☃ + this.a.bc().nextGaussian() * ☃, ☃, ☃ + this.a.bc().nextGaussian() * ☃);
            ☃.t = (this.a.t + this.a.K / 2.0F + 0.5D);
            this.a.o.d(☃);
          }
        }
      }
      this.a.p().a(☃, 10.0F, 10.0F);
    }
    else
    {
      this.a.s().n();
      this.a.q().a(☃.s, ☃.t, ☃.u, 1.0D);
    }
    super.e();
  }
}
