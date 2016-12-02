public class bdq$a
  extends beb
{
  protected bdq$a(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
    
    this.g = 4;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = 0.25F;
    float ☃ = 0.5F;
    float ☃ = 0.125F;
    float ☃ = 0.375F;
    float ☃ = 7.1F * ns.a((this.f + ☃ - 1.0F) * 0.25F * 3.1415927F);
    this.au = (0.6F - (this.f + ☃ - 1.0F) * 0.25F * 0.5F);
    
    float ☃ = (float)(this.p + (this.s - this.p) * ☃ - aw);
    float ☃ = (float)(this.q + (this.t - this.q) * ☃ - ax);
    float ☃ = (float)(this.r + (this.u - this.r) * ☃ - ay);
    
    int ☃ = b(☃);
    int ☃ = ☃ >> 16 & 0xFFFF;
    int ☃ = ☃ & 0xFFFF;
    
    ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(0.5D, 0.375D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
    ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(0.5D, 0.125D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(0.25D, 0.125D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(0.25D, 0.375D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
  }
}
