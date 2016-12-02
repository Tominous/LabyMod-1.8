public class beq
  extends beb
{
  protected beq(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v *= 0.30000001192092896D;
    w = (Math.random() * 0.20000000298023224D + 0.10000000149011612D);
    x *= 0.30000001192092896D;
    
    ar = 1.0F;
    as = 1.0F;
    at = 1.0F;
    k(19);
    a(0.01F, 0.01F);
    
    g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
    
    i = 0.0F;
    v = ☃;
    w = ☃;
    x = ☃;
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    
    w -= i;
    d(v, w, x);
    v *= 0.9800000190734863D;
    w *= 0.9800000190734863D;
    x *= 0.9800000190734863D;
    
    int ☃ = 60 - g;
    float ☃ = ☃ * 0.001F;
    a(☃, ☃);
    k(19 + ☃ % 4);
    if (g-- <= 0) {
      J();
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new beq(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
