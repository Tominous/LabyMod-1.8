public class bei
  extends beb
{
  float a;
  
  protected bei(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 1.0F);
  }
  
  protected bei(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    this.v *= 0.10000000149011612D;
    this.w *= 0.10000000149011612D;
    this.x *= 0.10000000149011612D;
    this.v += ☃;
    this.w += ☃;
    this.x += ☃;
    
    this.ar = (this.as = this.at = 1.0F - (float)(Math.random() * 0.30000001192092896D));
    this.h *= 0.75F;
    this.h *= ☃;
    this.a = this.h;
    
    this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
    this.g = ((int)(this.g * ☃));
    this.T = false;
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
    k(7 - this.f * 8 / this.g);
    
    this.w -= 0.03D;
    d(this.v, this.w, this.x);
    this.v *= 0.9900000095367432D;
    this.w *= 0.9900000095367432D;
    this.x *= 0.9900000095367432D;
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
      return new bei(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
