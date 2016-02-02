import java.util.Random;

public class ber
  extends beb
{
  protected ber(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v *= 0.30000001192092896D;
    this.w = (Math.random() * 0.20000000298023224D + 0.10000000149011612D);
    this.x *= 0.30000001192092896D;
    
    this.ar = 1.0F;
    this.as = 1.0F;
    this.at = 1.0F;
    k(19 + this.V.nextInt(4));
    a(0.01F, 0.01F);
    this.i = 0.06F;
    
    this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    this.w -= this.i;
    d(this.v, this.w, this.x);
    this.v *= 0.9800000190734863D;
    this.w *= 0.9800000190734863D;
    this.x *= 0.9800000190734863D;
    if (this.g-- <= 0) {
      J();
    }
    if (this.C)
    {
      if (Math.random() < 0.5D) {
        J();
      }
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
    }
    cj ☃ = new cj(this);
    alz ☃ = this.o.p(☃);
    afh ☃ = ☃.c();
    ☃.a(this.o, ☃);
    arm ☃ = ☃.c().t();
    if ((☃.d()) || (☃.a()))
    {
      double ☃ = 0.0D;
      if ((☃.c() instanceof ahv)) {
        ☃ = 1.0F - ahv.b(((Integer)☃.b(ahv.b)).intValue());
      } else {
        ☃ = ☃.E();
      }
      double ☃ = ns.c(this.t) + ☃;
      if (this.t < ☃) {
        J();
      }
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new ber(☃, ☃, ☃, ☃);
    }
  }
}
