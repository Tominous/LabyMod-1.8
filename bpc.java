public class bpc
  extends bpb
{
  private final vt k;
  
  public bpc(vt ☃)
  {
    super(new jy("minecraft:mob.guardian.attack"));
    
    k = ☃;
    
    i = bpj.a.a;
    g = true;
    h = 0;
  }
  
  public void c()
  {
    if ((k.I) || (!k.cp()))
    {
      j = true;
      return;
    }
    d = ((float)k.s);
    e = ((float)k.t);
    f = ((float)k.u);
    
    float ☃ = k.q(0.0F);
    b = (0.0F + 1.0F * ☃ * ☃);
    c = (0.7F + 0.5F * ☃);
  }
}
