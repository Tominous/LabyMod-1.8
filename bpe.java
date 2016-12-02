public class bpe
  extends bpb
{
  private final wn k;
  private final va l;
  
  public bpe(wn ☃, va ☃)
  {
    super(new jy("minecraft:minecart.inside"));
    
    this.k = ☃;
    this.l = ☃;
    
    this.i = bpj.a.a;
    this.g = true;
    this.h = 0;
  }
  
  public void c()
  {
    if ((this.l.I) || (!this.k.au()) || (this.k.m != this.l))
    {
      this.j = true;
      return;
    }
    float ☃ = ns.a(this.l.v * this.l.v + this.l.x * this.l.x);
    if (☃ >= 0.01D) {
      this.b = (0.0F + ns.a(☃, 0.0F, 1.0F) * 0.75F);
    } else {
      this.b = 0.0F;
    }
  }
}
