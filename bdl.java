import java.util.Random;

public class bdl
  extends beb
{
  protected bdl(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    this.ar = 1.0F;
    this.as = 1.0F;
    this.at = 1.0F;
    k(32);
    a(0.02F, 0.02F);
    
    this.h *= (this.V.nextFloat() * 0.6F + 0.2F);
    
    this.v = (☃ * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D);
    this.w = (☃ * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D);
    this.x = (☃ * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D);
    
    this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    this.w += 0.002D;
    d(this.v, this.w, this.x);
    this.v *= 0.8500000238418579D;
    this.w *= 0.8500000238418579D;
    this.x *= 0.8500000238418579D;
    if (this.o.p(new cj(this)).c().t() != arm.h) {
      J();
    }
    if (this.g-- <= 0) {
      J();
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdl(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
