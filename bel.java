import java.util.Random;

public class bel
  extends beb
{
  protected bel(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃ - 0.125D, ☃, ☃, ☃, ☃);
    
    this.ar = 0.4F;
    this.as = 0.4F;
    this.at = 0.7F;
    k(0);
    a(0.01F, 0.01F);
    
    this.h *= (this.V.nextFloat() * 0.6F + 0.2F);
    
    this.v = (☃ * 0.0D);
    this.w = (☃ * 0.0D);
    this.x = (☃ * 0.0D);
    
    this.g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    d(this.v, this.w, this.x);
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
      return new bel(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
