public class bdt
  extends beb
{
  float a;
  
  protected bdt(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 2.0F);
  }
  
  protected bdt(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v *= 0.009999999776482582D;
    w *= 0.009999999776482582D;
    x *= 0.009999999776482582D;
    w += 0.1D;
    
    h *= 0.75F;
    h *= ☃;
    a = h;
    
    g = 16;
    T = false;
    
    k(80);
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
    v *= 0.8600000143051147D;
    w *= 0.8600000143051147D;
    x *= 0.8600000143051147D;
    if (C)
    {
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
    }
  }
  
  public static class b
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdt(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bdt(☃, ☃, ☃ + 0.5D, ☃, ☃, ☃, ☃);
      ☃.k(81);
      ☃.b(1.0F, 1.0F, 1.0F);
      return ☃;
    }
  }
}
