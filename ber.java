import java.util.Random;

public class ber
  extends beb
{
  protected ber(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v *= 0.30000001192092896D;
    w = (Math.random() * 0.20000000298023224D + 0.10000000149011612D);
    x *= 0.30000001192092896D;
    
    ar = 1.0F;
    as = 1.0F;
    at = 1.0F;
    k(19 + V.nextInt(4));
    a(0.01F, 0.01F);
    i = 0.06F;
    
    g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
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
    if (g-- <= 0) {
      J();
    }
    if (C)
    {
      if (Math.random() < 0.5D) {
        J();
      }
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
    }
    cj ☃ = new cj(this);
    alz ☃ = o.p(☃);
    afh ☃ = ☃.c();
    ☃.a(o, ☃);
    arm ☃ = ☃.c().t();
    if ((☃.d()) || (☃.a()))
    {
      double ☃ = 0.0D;
      if ((☃.c() instanceof ahv)) {
        ☃ = 1.0F - ahv.b(((Integer)☃.b(ahv.b)).intValue());
      } else {
        ☃ = ☃.E();
      }
      double ☃ = ns.c(t) + ☃;
      if (t < ☃) {
        J();
      }
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new ber(☃, ☃, ☃, ☃);
    }
  }
}
