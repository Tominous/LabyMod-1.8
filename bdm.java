public class bdm
  extends beb
{
  float a;
  
  protected bdm(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 1.0F);
  }
  
  protected bdm(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v *= 0.10000000149011612D;
    this.w *= 0.10000000149011612D;
    this.x *= 0.10000000149011612D;
    this.v += ☃ * 0.4D;
    this.w += ☃ * 0.4D;
    this.x += ☃ * 0.4D;
    
    this.ar = (this.as = this.at = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D));
    this.h *= 0.75F;
    this.h *= ☃;
    this.a = this.h;
    
    this.g = ((int)(6.0D / (Math.random() * 0.8D + 0.6D)));
    this.g = ((int)(this.g * ☃));
    this.T = false;
    
    k(65);
    t_();
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
    this.as = ((float)(this.as * 0.96D));
    this.at = ((float)(this.at * 0.9D));
    
    this.v *= 0.699999988079071D;
    this.w *= 0.699999988079071D;
    this.x *= 0.699999988079071D;
    this.w -= 0.019999999552965164D;
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
      return new bdm(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bdm(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.b(☃.b() * 0.3F, ☃.g() * 0.8F, ☃.i());
      ☃.k();
      return ☃;
    }
  }
}
