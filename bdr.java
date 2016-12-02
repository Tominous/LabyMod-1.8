import java.util.Random;

public class bdr
  extends beb
{
  private float a;
  
  protected bdr(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    this.v = (this.v * 0.009999999776482582D + ☃);
    this.w = (this.w * 0.009999999776482582D + ☃);
    this.x = (this.x * 0.009999999776482582D + ☃);
    this.s += (this.V.nextFloat() - this.V.nextFloat()) * 0.05F;
    this.t += (this.V.nextFloat() - this.V.nextFloat()) * 0.05F;
    this.u += (this.V.nextFloat() - this.V.nextFloat()) * 0.05F;
    
    this.a = this.h;
    this.ar = (this.as = this.at = 1.0F);
    
    this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4);
    this.T = true;
    k(48);
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (this.f + ☃) / this.g;
    this.h = (this.a * (1.0F - ☃ * ☃ * 0.5F));
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public int b(float ☃)
  {
    float ☃ = (this.f + ☃) / this.g;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    int ☃ = super.b(☃);
    
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    ☃ += (int)(☃ * 15.0F * 16.0F);
    if (☃ > 240) {
      ☃ = 240;
    }
    return ☃ | ☃ << 16;
  }
  
  public float c(float ☃)
  {
    float ☃ = (this.f + ☃) / this.g;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    float ☃ = super.c(☃);
    
    return ☃ * ☃ + (1.0F - ☃);
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
      return new bdr(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
