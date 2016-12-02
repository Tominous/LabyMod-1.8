public class bea
  extends beb
{
  float a;
  
  protected bea(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 2.0F);
  }
  
  protected bea(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v *= 0.009999999776482582D;
    w *= 0.009999999776482582D;
    x *= 0.009999999776482582D;
    w += 0.2D;
    
    ar = (ns.a(((float)☃ + 0.0F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
    as = (ns.a(((float)☃ + 0.33333334F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
    at = (ns.a(((float)☃ + 0.6666667F) * 3.1415927F * 2.0F) * 0.65F + 0.35F);
    
    h *= 0.75F;
    h *= ☃;
    a = h;
    
    g = 6;
    T = false;
    
    k(64);
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
    d(v, w, x);
    if (t == q)
    {
      v *= 1.1D;
      x *= 1.1D;
    }
    v *= 0.6600000262260437D;
    w *= 0.6600000262260437D;
    x *= 0.6600000262260437D;
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
      return new bea(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
