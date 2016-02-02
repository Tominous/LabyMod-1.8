public class beq
  extends beb
{
  protected beq(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.v *= 0.30000001192092896D;
    this.w = (Math.random() * 0.20000000298023224D + 0.10000000149011612D);
    this.x *= 0.30000001192092896D;
    
    this.ar = 1.0F;
    this.as = 1.0F;
    this.at = 1.0F;
    k(19);
    a(0.01F, 0.01F);
    
    this.g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
    
    this.i = 0.0F;
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
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
    
    int ☃ = 60 - this.g;
    float ☃ = ☃ * 0.001F;
    a(☃, ☃);
    k(19 + ☃ % 4);
    if (this.g-- <= 0) {
      J();
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new beq(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
