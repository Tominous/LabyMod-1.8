public class bdn
  extends beb
{
  private arm a;
  private int az;
  
  protected bdn(adm ☃, double ☃, double ☃, double ☃, arm ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v = (w = x = 0.0D);
    if (☃ == arm.h)
    {
      ar = 0.0F;
      as = 0.0F;
      at = 1.0F;
    }
    else
    {
      ar = 1.0F;
      as = 0.0F;
      at = 0.0F;
    }
    k(113);
    a(0.01F, 0.01F);
    i = 0.06F;
    a = ☃;
    az = 40;
    
    g = ((int)(64.0D / (Math.random() * 0.8D + 0.2D)));
    v = (w = x = 0.0D);
  }
  
  public int b(float ☃)
  {
    if (a == arm.h) {
      return super.b(☃);
    }
    return 257;
  }
  
  public float c(float ☃)
  {
    if (a == arm.h) {
      return super.c(☃);
    }
    return 1.0F;
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    if (a == arm.h)
    {
      ar = 0.2F;
      as = 0.3F;
      at = 1.0F;
    }
    else
    {
      ar = 1.0F;
      as = (16.0F / (40 - az + 16));
      at = (4.0F / (40 - az + 8));
    }
    w -= i;
    if (az-- > 0)
    {
      v *= 0.02D;
      w *= 0.02D;
      x *= 0.02D;
      k(113);
    }
    else
    {
      k(112);
    }
    d(v, w, x);
    v *= 0.9800000190734863D;
    w *= 0.9800000190734863D;
    x *= 0.9800000190734863D;
    if (g-- <= 0) {
      J();
    }
    if (C)
    {
      if (a == arm.h)
      {
        J();
        o.a(cy.f, s, t, u, 0.0D, 0.0D, 0.0D, new int[0]);
      }
      else
      {
        k(114);
      }
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
    }
    cj ☃ = new cj(this);
    alz ☃ = o.p(☃);
    arm ☃ = ☃.c().t();
    if ((☃.d()) || (☃.a()))
    {
      double ☃ = 0.0D;
      if ((☃.c() instanceof ahv)) {
        ☃ = ahv.b(((Integer)☃.b(ahv.b)).intValue());
      }
      double ☃ = ns.c(t) + 1 - ☃;
      if (t < ☃) {
        J();
      }
    }
  }
  
  public static class b
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdn(☃, ☃, ☃, ☃, arm.h);
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdn(☃, ☃, ☃, ☃, arm.i);
    }
  }
}
