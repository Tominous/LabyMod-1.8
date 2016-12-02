import java.util.Random;

public class bdy
  extends beb
{
  private float a;
  
  protected bdy(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v *= 0.800000011920929D;
    this.w *= 0.800000011920929D;
    this.x *= 0.800000011920929D;
    this.w = (this.V.nextFloat() * 0.4F + 0.05F);
    
    this.ar = (this.as = this.at = 1.0F);
    this.h *= (this.V.nextFloat() * 2.0F + 0.2F);
    this.a = this.h;
    
    this.g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
    this.T = false;
    k(49);
  }
  
  public int b(float ☃)
  {
    float ☃ = (this.f + ☃) / this.g;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    int ☃ = super.b(☃);
    
    int ☃ = 240;
    int ☃ = ☃ >> 16 & 0xFF;
    return ☃ | ☃ << 16;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (this.f + ☃) / this.g;
    this.h = (this.a * (1.0F - ☃ * ☃));
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
    float ☃ = this.f / this.g;
    if (this.V.nextFloat() > ☃) {
      this.o.a(cy.l, this.s, this.t, this.u, this.v, this.w, this.x, new int[0]);
    }
    this.w -= 0.03D;
    d(this.v, this.w, this.x);
    this.v *= 0.9990000128746033D;
    this.w *= 0.9990000128746033D;
    this.x *= 0.9990000128746033D;
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
      return new bdy(☃, ☃, ☃, ☃);
    }
  }
}
