public class beg
  extends beb
{
  float a;
  
  protected beg(adm ☃, double ☃, double ☃, double ☃, float ☃, float ☃, float ☃)
  {
    this(☃, ☃, ☃, ☃, 1.0F, ☃, ☃, ☃);
  }
  
  protected beg(adm ☃, double ☃, double ☃, double ☃, float ☃, float ☃, float ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v *= 0.10000000149011612D;
    w *= 0.10000000149011612D;
    x *= 0.10000000149011612D;
    if (☃ == 0.0F) {
      ☃ = 1.0F;
    }
    float ☃ = (float)Math.random() * 0.4F + 0.6F;
    ar = (((float)(Math.random() * 0.20000000298023224D) + 0.8F) * ☃ * ☃);
    as = (((float)(Math.random() * 0.20000000298023224D) + 0.8F) * ☃ * ☃);
    at = (((float)(Math.random() * 0.20000000298023224D) + 0.8F) * ☃ * ☃);
    h *= 0.75F;
    h *= ☃;
    a = h;
    
    g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
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
    if (t == q)
    {
      v *= 1.1D;
      x *= 1.1D;
    }
    v *= 0.9599999785423279D;
    w *= 0.9599999785423279D;
    x *= 0.9599999785423279D;
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
      return new beg(☃, ☃, ☃, ☃, (float)☃, (float)☃, (float)☃);
    }
  }
}
