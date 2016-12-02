import java.util.Random;

public class bdp
  extends beb
{
  protected bdp(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    v = (☃ + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D);
    w = (☃ + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D);
    x = (☃ + (Math.random() * 2.0D - 1.0D) * 0.05000000074505806D);
    
    ar = (as = at = V.nextFloat() * 0.3F + 0.7F);
    h = (V.nextFloat() * V.nextFloat() * 6.0F + 1.0F);
    
    g = ((int)(16.0D / (V.nextFloat() * 0.8D + 0.2D)) + 2);
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
    
    w += 0.004D;
    d(v, w, x);
    v *= 0.8999999761581421D;
    w *= 0.8999999761581421D;
    x *= 0.8999999761581421D;
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
      return new bdp(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
