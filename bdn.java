public class bdn
  extends beb
{
  private arm a;
  private int az;
  
  protected bdn(adm ☃, double ☃, double ☃, double ☃, arm ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v = (this.w = this.x = 0.0D);
    if (☃ == arm.h)
    {
      this.ar = 0.0F;
      this.as = 0.0F;
      this.at = 1.0F;
    }
    else
    {
      this.ar = 1.0F;
      this.as = 0.0F;
      this.at = 0.0F;
    }
    k(113);
    a(0.01F, 0.01F);
    this.i = 0.06F;
    this.a = ☃;
    this.az = 40;
    
    this.g = ((int)(64.0D / (Math.random() * 0.8D + 0.2D)));
    this.v = (this.w = this.x = 0.0D);
  }
  
  public int b(float ☃)
  {
    if (this.a == arm.h) {
      return super.b(☃);
    }
    return 257;
  }
  
  public float c(float ☃)
  {
    if (this.a == arm.h) {
      return super.c(☃);
    }
    return 1.0F;
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if (this.a == arm.h)
    {
      this.ar = 0.2F;
      this.as = 0.3F;
      this.at = 1.0F;
    }
    else
    {
      this.ar = 1.0F;
      this.as = (16.0F / (40 - this.az + 16));
      this.at = (4.0F / (40 - this.az + 8));
    }
    this.w -= this.i;
    if (this.az-- > 0)
    {
      this.v *= 0.02D;
      this.w *= 0.02D;
      this.x *= 0.02D;
      k(113);
    }
    else
    {
      k(112);
    }
    d(this.v, this.w, this.x);
    this.v *= 0.9800000190734863D;
    this.w *= 0.9800000190734863D;
    this.x *= 0.9800000190734863D;
    if (this.g-- <= 0) {
      J();
    }
    if (this.C)
    {
      if (this.a == arm.h)
      {
        J();
        this.o.a(cy.f, this.s, this.t, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
      }
      else
      {
        k(114);
      }
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
    }
    cj ☃ = new cj(this);
    alz ☃ = this.o.p(☃);
    arm ☃ = ☃.c().t();
    if ((☃.d()) || (☃.a()))
    {
      double ☃ = 0.0D;
      if ((☃.c() instanceof ahv)) {
        ☃ = ahv.b(((Integer)☃.b(ahv.b)).intValue());
      }
      double ☃ = ns.c(this.t) + 1 - ☃;
      if (this.t < ☃) {
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
