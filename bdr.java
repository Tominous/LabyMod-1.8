import java.util.Random;

public class bdr
  extends beb
{
  private float a;
  
  protected bdr(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    v = (v * 0.009999999776482582D + ☃);
    w = (w * 0.009999999776482582D + ☃);
    x = (x * 0.009999999776482582D + ☃);
    s += (V.nextFloat() - V.nextFloat()) * 0.05F;
    t += (V.nextFloat() - V.nextFloat()) * 0.05F;
    u += (V.nextFloat() - V.nextFloat()) * 0.05F;
    
    a = h;
    ar = (as = at = 1.0F);
    
    g = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4);
    T = true;
    k(48);
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (f + ☃) / g;
    h = (a * (1.0F - ☃ * ☃ * 0.5F));
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public int b(float ☃)
  {
    float ☃ = (f + ☃) / g;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    int ☃ = super.b(☃);
    
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    ☃ += (int)(☃ * 15.0F * 16.0F);
    if (☃ > 240) {
      ☃ = 240;
    }
    return ☃ | ☃ << 16;
  }
  
  public float c(float ☃)
  {
    float ☃ = (f + ☃) / g;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    float ☃ = super.c(☃);
    
    return ☃ * ☃ + (1.0F - ☃);
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
      return new bdr(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
