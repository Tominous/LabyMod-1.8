public class bdm
  extends beb
{
  float a;
  
  protected bdm(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, 1.0F);
  }
  
  protected bdm(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v *= 0.10000000149011612D;
    w *= 0.10000000149011612D;
    x *= 0.10000000149011612D;
    v += ☃ * 0.4D;
    w += ☃ * 0.4D;
    x += ☃ * 0.4D;
    
    ar = (as = at = (float)(Math.random() * 0.30000001192092896D + 0.6000000238418579D));
    h *= 0.75F;
    h *= ☃;
    a = h;
    
    g = ((int)(6.0D / (Math.random() * 0.8D + 0.6D)));
    g = ((int)(g * ☃));
    T = false;
    
    k(65);
    t_();
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
    as = ((float)(as * 0.96D));
    at = ((float)(at * 0.9D));
    
    v *= 0.699999988079071D;
    w *= 0.699999988079071D;
    x *= 0.699999988079071D;
    w -= 0.019999999552965164D;
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
      return new bdm(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bdm(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.b(☃.b() * 0.3F, ☃.g() * 0.8F, ☃.i());
      ☃.k();
      return ☃;
    }
  }
}
