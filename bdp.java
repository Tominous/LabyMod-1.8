import java.util.Random;

public class bdp
  extends beb
{
  protected bdp(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    this.v = (☃ + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D);
    this.w = (☃ + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D);
    this.x = (☃ + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D);
    
    this.ar = (this.as = this.at = this.V.nextFloat() * 0.3F + 0.7F);
    this.h = (this.V.nextFloat() * this.V.nextFloat() * 6.0F + 1.0F);
    
    this.g = ((int)(16.0D / (this.V.nextFloat() * 0.8D + 0.2D)) + 2);
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if (this.f++ >= this.g) {
      J();
    }
    k(7 - this.f * 8 / this.g);
    
    this.w += 0.004D;
    d(this.v, this.w, this.x);
    this.v *= 0.8999999761581421D;
    this.w *= 0.8999999761581421D;
    this.x *= 0.8999999761581421D;
    if (this.C)
    {
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdp(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
