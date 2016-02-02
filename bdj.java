public class bdj
  extends beb
{
  protected bdj(adm ☃, double ☃, double ☃, double ☃, zw ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    a(ave.A().ag().a().a(☃));
    this.ar = (this.as = this.at = 1.0F);
    this.v = (this.w = this.x = 0.0D);
    this.i = 0.0F;
    this.g = 80;
  }
  
  public int a()
  {
    return 1;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = this.av.e();
    float ☃ = this.av.f();
    float ☃ = this.av.g();
    float ☃ = this.av.h();
    float ☃ = 0.5F;
    
    float ☃ = (float)(this.p + (this.s - this.p) * ☃ - aw);
    float ☃ = (float)(this.q + (this.t - this.q) * ☃ - ax);
    float ☃ = (float)(this.r + (this.u - this.r) * ☃ - ay);
    
    int ☃ = b(☃);
    int ☃ = ☃ >> 16 & 0xFFFF;
    int ☃ = ☃ & 0xFFFF;
    
    ☃.b(☃ - ☃ * 0.5F - ☃ * 0.5F, ☃ - ☃ * 0.5F, ☃ - ☃ * 0.5F - ☃ * 0.5F).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ - ☃ * 0.5F + ☃ * 0.5F, ☃ + ☃ * 0.5F, ☃ - ☃ * 0.5F + ☃ * 0.5F).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * 0.5F + ☃ * 0.5F, ☃ + ☃ * 0.5F, ☃ + ☃ * 0.5F + ☃ * 0.5F).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * 0.5F - ☃ * 0.5F, ☃ - ☃ * 0.5F, ☃ + ☃ * 0.5F - ☃ * 0.5F).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdj(☃, ☃, ☃, ☃, zw.a(afi.cv));
    }
  }
}
