import java.util.Random;

class vl$a
  extends rd
{
  private vl a;
  private int b;
  private int c;
  
  public vl$a(vl ☃)
  {
    a = ☃;
    
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = a.u();
    if ((☃ == null) || (!☃.ai())) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    b = 0;
  }
  
  public void d()
  {
    a.a(false);
  }
  
  public void e()
  {
    c -= 1;
    
    pr ☃ = a.u();
    
    double ☃ = a.h(☃);
    if (☃ < 4.0D)
    {
      if (c <= 0)
      {
        c = 20;
        a.r(☃);
      }
      a.q().a(s, t, u, 1.0D);
    }
    else if (☃ < 256.0D)
    {
      double ☃ = s - a.s;
      double ☃ = aRb + K / 2.0F - (a.t + a.K / 2.0F);
      double ☃ = u - a.u;
      if (c <= 0)
      {
        b += 1;
        if (b == 1)
        {
          c = 60;
          a.a(true);
        }
        else if (b <= 4)
        {
          c = 6;
        }
        else
        {
          c = 100;
          b = 0;
          a.a(false);
        }
        if (b > 1)
        {
          float ☃ = ns.c(ns.a(☃)) * 0.5F;
          
          a.o.a(null, 1009, new cj((int)a.s, (int)a.t, (int)a.u), 0);
          for (int ☃ = 0; ☃ < 1; ☃++)
          {
            ww ☃ = new ww(a.o, a, ☃ + a.bc().nextGaussian() * ☃, ☃, ☃ + a.bc().nextGaussian() * ☃);
            t = (a.t + a.K / 2.0F + 0.5D);
            a.o.d(☃);
          }
        }
      }
      a.p().a(☃, 10.0F, 10.0F);
    }
    else
    {
      a.s().n();
      a.q().a(s, t, u, 1.0D);
    }
    super.e();
  }
}
