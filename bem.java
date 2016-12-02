import java.util.Random;

public class bem
  extends beb
{
  protected bem(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    float ☃ = V.nextFloat() * 0.1F + 0.2F;
    ar = ☃;
    as = ☃;
    at = ☃;
    k(0);
    a(0.02F, 0.02F);
    
    h *= (V.nextFloat() * 0.6F + 0.5F);
    
    v *= 0.019999999552965164D;
    w *= 0.019999999552965164D;
    x *= 0.019999999552965164D;
    
    g = ((int)(20.0D / (Math.random() * 0.8D + 0.2D)));
    T = true;
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    
    d(v, w, x);
    v *= 0.99D;
    w *= 0.99D;
    x *= 0.99D;
    if (g-- <= 0) {
      J();
    }
  }
  
  public static class b
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bem(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      beb ☃ = new bem(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.k(82);
      ☃.b(1.0F, 1.0F, 1.0F);
      return ☃;
    }
  }
}
