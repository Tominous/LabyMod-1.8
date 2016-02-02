public class bpc
  extends bpb
{
  private final vt k;
  
  public bpc(vt ☃)
  {
    super(new jy("minecraft:mob.guardian.attack"));
    
    this.k = ☃;
    
    this.i = bpj.a.a;
    this.g = true;
    this.h = 0;
  }
  
  public void c()
  {
    if ((this.k.I) || (!this.k.cp()))
    {
      this.j = true;
      return;
    }
    this.d = ((float)this.k.s);
    this.e = ((float)this.k.t);
    this.f = ((float)this.k.u);
    
    float ☃ = this.k.q(0.0F);
    this.b = (0.0F + 1.0F * ☃ * ☃);
    this.c = (0.7F + 0.5F * ☃);
  }
}
