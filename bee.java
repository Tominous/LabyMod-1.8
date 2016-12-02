public class bee
  extends beb
{
  float a;
  
  protected bee(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    
    float ☃ = 2.5F;
    v *= 0.10000000149011612D;
    w *= 0.10000000149011612D;
    x *= 0.10000000149011612D;
    v += ☃;
    w += ☃;
    x += ☃;
    
    ar = (as = at = 1.0F - (float)(Math.random() * 0.30000001192092896D));
    h *= 0.75F;
    h *= ☃;
    a = h;
    
    g = ((int)(8.0D / (Math.random() * 0.8D + 0.3D)));
    g = ((int)(g * ☃));
    T = false;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (f + ☃) / g * 32.0F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    h = (a * ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    if (f++ >= g) {
      J();
    }
    k(7 - f * 8 / g);
    
    d(v, w, x);
    v *= 0.9599999785423279D;
    w *= 0.9599999785423279D;
    x *= 0.9599999785423279D;
    wn ☃ = o.a(this, 2.0D);
    if ((☃ != null) && 
      (t > aRb))
    {
      t += (aRb - t) * 0.2D;
      w += (w - w) * 0.2D;
      b(s, t, u);
    }
    if (C)
    {
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bee(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
