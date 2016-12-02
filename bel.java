import java.util.Random;

public class bel
  extends beb
{
  protected bel(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃ - 0.125D, ☃, ☃, ☃, ☃);
    
    ar = 0.4F;
    as = 0.4F;
    at = 0.7F;
    k(0);
    a(0.01F, 0.01F);
    
    h *= (V.nextFloat() * 0.6F + 0.2F);
    
    v = (☃ * 0.0D);
    w = (☃ * 0.0D);
    x = (☃ * 0.0D);
    
    g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    
    d(v, w, x);
    if (o.p(new cj(this)).c().t() != arm.h) {
      J();
    }
    if (g-- <= 0) {
      J();
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bel(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
