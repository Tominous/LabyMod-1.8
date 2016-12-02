import java.util.Random;

public class bdl
  extends beb
{
  protected bdl(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    ar = 1.0F;
    as = 1.0F;
    at = 1.0F;
    k(32);
    a(0.02F, 0.02F);
    
    h *= (V.nextFloat() * 0.6F + 0.2F);
    
    v = (☃ * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D);
    w = (☃ * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D);
    x = (☃ * 0.20000000298023224D + (Math.random() * 2.0D - 1.0D) * 0.019999999552965164D);
    
    g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    
    w += 0.002D;
    d(v, w, x);
    v *= 0.8500000238418579D;
    w *= 0.8500000238418579D;
    x *= 0.8500000238418579D;
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
      return new bdl(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
