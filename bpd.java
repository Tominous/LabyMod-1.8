public class bpd
  extends bpb
{
  private final va k;
  private float l = 0.0F;
  
  public bpd(va ☃)
  {
    super(new jy("minecraft:minecart.base"));
    
    this.k = ☃;
    this.g = true;
    this.h = 0;
  }
  
  public void c()
  {
    if (this.k.I)
    {
      this.j = true;
      return;
    }
    this.d = ((float)this.k.s);
    this.e = ((float)this.k.t);
    this.f = ((float)this.k.u);
    
    float ☃ = ns.a(this.k.v * this.k.v + this.k.x * this.k.x);
    if (☃ >= 0.01D)
    {
      this.l = ns.a(this.l + 0.0025F, 0.0F, 1.0F);
      
      this.b = (0.0F + ns.a(☃, 0.0F, 0.5F) * 0.7F);
    }
    else
    {
      this.l = 0.0F;
      this.b = 0.0F;
    }
  }
}
