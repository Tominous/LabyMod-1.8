public class bdt
  extends beb
{
  float a;
  
  protected bdt(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 2.0F);
  }
  
  protected bdt(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v *= 0.009999999776482582D;
    this.w *= 0.009999999776482582D;
    this.x *= 0.009999999776482582D;
    this.w += 0.1D;
    
    this.h *= 0.75F;
    this.h *= ☃;
    this.a = this.h;
    
    this.g = 16;
    this.T = false;
    
    k(80);
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
    this.v *= 0.8600000143051147D;
    this.w *= 0.8600000143051147D;
    this.x *= 0.8600000143051147D;
    if (this.C)
    {
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
    }
  }
  
  public static class b
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdt(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bdt(☃, ☃, ☃ + 0.5D, ☃, ☃, ☃, ☃);
      ☃.k(81);
      ☃.b(1.0F, 1.0F, 1.0F);
      return ☃;
    }
  }
}
