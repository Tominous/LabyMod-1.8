import java.util.Random;

class xk$2
  extends yg
{
  xk$2(xk paramxk, og ☃, int ☃, int ☃, int ☃, adm paramadm, cj paramcj)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  public boolean a(zx ☃)
  {
    return false;
  }
  
  public boolean a(wn ☃)
  {
    return ((bA.d) || (bB >= c.a)) && (c.a > 0) && (e());
  }
  
  public void a(wn ☃, zx ☃)
  {
    if (!bA.d) {
      ☃.a(-c.a);
    }
    xk.a(c).a(0, null);
    if (xk.b(c) > 0)
    {
      zx ☃ = xk.a(c).a(1);
      if ((☃ != null) && (b > xk.b(c)))
      {
        b -= xk.b(c);
        xk.a(c).a(1, ☃);
      }
      else
      {
        xk.a(c).a(1, null);
      }
    }
    else
    {
      xk.a(c).a(1, null);
    }
    c.a = 0;
    
    alz ☃ = a.p(b);
    if ((!bA.d) && (!a.D) && (☃.c() == afi.cf) && (☃.bc().nextFloat() < 0.12F))
    {
      int ☃ = ((Integer)☃.b(aez.b)).intValue();
      ☃++;
      if (☃ > 2)
      {
        a.g(b);
        a.b(1020, b, 0);
      }
      else
      {
        a.a(b, ☃.a(aez.b, Integer.valueOf(☃)), 2);
        a.b(1021, b, 0);
      }
    }
    else if (!a.D)
    {
      a.b(1021, b, 0);
    }
  }
}
