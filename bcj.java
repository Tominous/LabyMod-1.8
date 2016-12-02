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
      e = new bct(this, 0, 0);
      e.a(-4.0F, -10.0F, -4.0F, 8, 8, 8, ☃);
      e.a(0.0F, 0.0F + ☃, 0.0F);
    }
    else
    {
      e = new bct(this);
      e.a(0.0F, 0.0F + ☃, 0.0F);
      e.a(0, 32).a(-4.0F, -10.0F, -4.0F, 8, 10, 8, ☃);
      e.a(24, 32).a(-1.0F, -3.0F, -6.0F, 2, 4, 2, ☃);
    }
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    float ☃ = ns.a(p * 3.1415927F);
    float ☃ = ns.a((1.0F - (1.0F - p) * (1.0F - p)) * 3.1415927F);
    h.h = 0.0F;
    i.h = 0.0F;
    h.g = (-(0.1F - ☃ * 0.6F));
    i.g = (0.1F - ☃ * 0.6F);
    h.f = -1.5707964F;
    i.f = -1.5707964F;
    h.f -= ☃ * 1.2F - ☃ * 0.4F;
    i.f -= ☃ * 1.2F - ☃ * 0.4F;
    
    h.h += ns.b(☃ * 0.09F) * 0.05F + 0.05F;
    i.h -= ns.b(☃ * 0.09F) * 0.05F + 0.05F;
    h.f += ns.a(☃ * 0.067F) * 0.05F;
    i.f -= ns.a(☃ * 0.067F) * 0.05F;
  }
}
