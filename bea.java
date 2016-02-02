public class bea
  extends beb
{
  float a;
  
  protected bea(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 2.0F);
  }
  
  protected bea(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v *= 0.009999999776482582D;
    this.w *= 0.009999999776482582D;
    this.x *= 0.009999999776482582D;
    this.w += 0.2D;
    
    this.ar = (ns.a(((float)☃ + 0.0F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
    this.as = (ns.a(((float)☃ + 0.33333334F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
    this.at = (ns.a(((float)☃ + 0.6666667F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
    
    this.h *= 0.75F;
    this.h *= ☃;
    this.a = this.h;
    
    this.g = 6;
    this.T = false;
    
    k(64);
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (this.f + ☃) / this.g * 32.0F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    this.h = (this.a * ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if (this.f++ >= this.g) {
      J();
    }
    d(this.v, this.w, this.x);
    if (this.t == this.q)
    {
      this.v *= 1.1D;
      this.x *= 1.1D;
    }
    this.v *= 0.6600000262260437D;
    this.w *= 0.6600000262260437D;
    this.x *= 0.6600000262260437D;
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
      return new bea(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
