public class bpe
  extends bpb
{
  private final wn k;
  private final va l;
  
  public bpe(wn ☃, va ☃)
  {
    super(new jy("minecraft:minecart.inside"));
    
    k = ☃;
    l = ☃;
    
    i = bpj.a.a;
    g = true;
    h = 0;
  }
  
  public void c()
  {
    if ((l.I) || (!k.au()) || (k.m != l))
    {
      j = true;
      return;
    }
    float ☃ = ns.a(l.v * l.v + l.x * l.x);
    if (☃ >= 0.01D) {
      b = (0.0F + ns.a(☃, 0.0F, 1.0F) * 0.75F);
    } else {
      b = 0.0F;
    }
  }
}
