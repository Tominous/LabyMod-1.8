public class beh
  extends beb
{
  float a;
  
  private beh(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 1.0F);
  }
  
  protected beh(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v *= 0.10000000149011612D;
    this.w *= 0.10000000149011612D;
    this.x *= 0.10000000149011612D;
    this.v += ☃;
    this.w += ☃;
    this.x += ☃;
    
    this.ar = (this.as = this.at = (float)(Math.random() * 0.30000001192092896D));
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
    
    this.w += 0.004D;
    d(this.v, this.w, this.x);
    if (this.t == this.q)
    {
      this.v *= 1.1D;
      this.x *= 1.1D;
    }
    this.v *= 0.9599999785423279D;
    this.w *= 0.9599999785423279D;
    this.x *= 0.9599999785423279D;
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
      return new beh(☃, ☃, ☃, ☃, ☃, ☃, ☃, null);
    }
  }
}
