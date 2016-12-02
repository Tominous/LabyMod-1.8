import java.util.Random;

public class bdy
  extends beb
{
  private float a;
  
  protected bdy(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v *= 0.800000011920929D;
    w *= 0.800000011920929D;
    x *= 0.800000011920929D;
    w = (V.nextFloat() * 0.4F + 0.05F);
    
    ar = (as = at = 1.0F);
    h *= (V.nextFloat() * 2.0F + 0.2F);
    a = h;
    
    g = ((int)(16.0D / (Math.random() * 0.8D + 0.2D)));
    T = false;
    k(49);
  }
  
  public int b(float ☃)
  {
    float ☃ = (f + ☃) / g;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    int ☃ = super.b(☃);
    
    int ☃ = 240;
    int ☃ = ☃ >> 16 & 0xFF;
    return ☃ | ☃ << 16;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (f + ☃) / g;
    h = (a * (1.0F - ☃ * ☃));
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
    float ☃ = f / g;
    if (V.nextFloat() > ☃) {
      o.a(cy.l, s, t, u, v, w, x, new int[0]);
    }
    w -= 0.03D;
    d(v, w, x);
    v *= 0.9990000128746033D;
    w *= 0.9990000128746033D;
    x *= 0.9990000128746033D;
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
      return new bdy(☃, ☃, ☃, ☃);
    }
  }
}
