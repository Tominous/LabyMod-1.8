import java.util.Random;

public class bem
  extends beb
{
  protected bem(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    float ☃ = this.V.nextFloat() * 0.1F + 0.2F;
    this.ar = ☃;
    this.as = ☃;
    this.at = ☃;
    k(0);
    a(0.02F, 0.02F);
    
    this.h *= (this.V.nextFloat() * 0.6F + 0.5F);
    
    this.v *= 0.019999999552965164D;
    this.w *= 0.019999999552965164D;
    this.x *= 0.019999999552965164D;
    
    this.g = ((int)(20.0D / (Math.random() * 0.8D + 0.2D)));
    this.T = true;
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    d(this.v, this.w, this.x);
    this.v *= 0.99D;
    this.w *= 0.99D;
    this.x *= 0.99D;
    if (this.g-- <= 0) {
      J();
    }
  }
  
  public static class b
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bem(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bem(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.k(82);
      ☃.b(1.0F, 1.0F, 1.0F);
      return ☃;
    }
  }
}
