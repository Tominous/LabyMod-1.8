import java.util.Random;

public class bef
  extends beb
{
  private float a;
  private double az;
  private double aA;
  private double aB;
  
  protected bef(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    v = ☃;
    w = ☃;
    x = ☃;
    az = (s = ☃);
    aA = (t = ☃);
    aB = (u = ☃);
    
    float ☃ = V.nextFloat() * 0.6F + 0.4F;
    a = (h = V.nextFloat() * 0.2F + 0.5F);
    ar = (as = at = 1.0F * ☃);
    as *= 0.3F;
    ar *= 0.9F;
    
    g = ((int)(Math.random() * 10.0D) + 40);
    T = true;
    k((int)(Math.random() * 8.0D));
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (f + ☃) / g;
    ☃ = 1.0F - ☃;
    ☃ *= ☃;
    ☃ = 1.0F - ☃;
    h = (a * ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public int b(float ☃)
  {
    int ☃ = super.b(☃);
    
    float ☃ = f / g;
    ☃ *= ☃;
    ☃ *= ☃;
    
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
    float ☃ = super.c(☃);
    float ☃ = f / g;
    ☃ = ☃ * ☃ * ☃ * ☃;
    return ☃ * (1.0F - ☃) + ☃;
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    
    float ☃ = f / g;
    float ☃ = ☃;
    ☃ = -☃ + ☃ * ☃ * 2.0F;
    ☃ = 1.0F - ☃;
    
    s = (az + v * ☃);
    t = (aA + w * ☃ + (1.0F - ☃));
    u = (aB + x * ☃);
    if (f++ >= g) {
      J();
    }
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bef(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
