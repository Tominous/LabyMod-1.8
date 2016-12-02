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
    return ((☃.bA.d) || (☃.bB >= this.c.a)) && (this.c.a > 0) && (e());
  }
  
  public void a(wn ☃, zx ☃)
  {
    if (!☃.bA.d) {
      ☃.a(-this.c.a);
    }
    xk.a(this.c).a(0, null);
    if (xk.b(this.c) > 0)
    {
      zx ☃ = xk.a(this.c).a(1);
      if ((☃ != null) && (☃.b > xk.b(this.c)))
      {
        ☃.b -= xk.b(this.c);
        xk.a(this.c).a(1, ☃);
      }
      else
      {
        xk.a(this.c).a(1, null);
      }
    }
    else
    {
      xk.a(this.c).a(1, null);
    }
    this.c.a = 0;
    
    alz ☃ = this.a.p(this.b);
    if ((!☃.bA.d) && (!this.a.D) && (☃.c() == afi.cf) && (☃.bc().nextFloat() < 0.12F))
    {
      int ☃ = ((Integer)☃.b(aez.b)).intValue();
      ☃++;
      if (☃ > 2)
      {
        this.a.g(this.b);
        this.a.b(1020, this.b, 0);
      }
      else
      {
        this.a.a(this.b, ☃.a(aez.b, Integer.valueOf(☃)), 2);
        this.a.b(1021, this.b, 0);
      }
    }
    else if (!this.a.D)
    {
      this.a.b(1021, this.b, 0);
    }
  }
}
