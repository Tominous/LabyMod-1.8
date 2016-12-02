public class bcj
  extends bbj
{
  public bcj()
  {
    this(0.0F, 0.0F, false);
  }
  
  public bcj(float ☃, float ☃, boolean ☃)
  {
    super(☃, 0.0F, 64, ☃ ? 32 : 64);
    if (☃)
    {
      this.e = new bct(this, 0, 0);
      this.e.a(-4.0F, -10.0F, -4.0F, 8, 8, 8, ☃);
      this.e.a(0.0F, 0.0F + ☃, 0.0F);
    }
    else
    {
      this.e = new bct(this);
      this.e.a(0.0F, 0.0F + ☃, 0.0F);
      this.e.a(0, 32).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, ☃);
      this.e.a(24, 32).a(-1.0F, -3.0F, -6.0F, 2, 4, 2, ☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    float ☃ = ns.a(this.p * 3.1415927F);
    float ☃ = ns.a((1.0F - (1.0F - this.p) * (1.0F - this.p)) * 3.1415927F);
    this.h.h = 0.0F;
    this.i.h = 0.0F;
    this.h.g = (-(0.1F - ☃ * 0.6F));
    this.i.g = (0.1F - ☃ * 0.6F);
    this.h.f = -1.5707964F;
    this.i.f = -1.5707964F;
    this.h.f -= ☃ * 1.2F - ☃ * 0.4F;
    this.i.f -= ☃ * 1.2F - ☃ * 0.4F;
    
    this.h.h += ns.b(☃ * 0.09F) * 0.05F + 0.05F;
    this.i.h -= ns.b(☃ * 0.09F) * 0.05F + 0.05F;
    this.h.f += ns.a(☃ * 0.067F) * 0.05F;
    this.i.f -= ns.a(☃ * 0.067F) * 0.05F;
  }
}
