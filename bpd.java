public class bpd
  extends bpb
{
  private final va k;
  private float l = 0.0F;
  
  public bpd(va ☃)
  {
    super(new jy("minecraft:minecart.base"));
    
    k = ☃;
    g = true;
    h = 0;
  }
  
  public void c()
  {
    if (k.I)
    {
      j = true;
      return;
    }
    d = ((float)k.s);
    e = ((float)k.t);
    f = ((float)k.u);
    
    float ☃ = ns.a(k.v * k.v + k.x * k.x);
    if (☃ >= 0.01D)
    {
      l = ns.a(l + 0.0025F, 0.0F, 1.0F);
      
      b = (0.0F + ns.a(☃, 0.0F, 0.5F) * 0.7F);
    }
    else
    {
      l = 0.0F;
      b = 0.0F;
    }
  }
}
