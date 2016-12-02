import java.util.Random;

public class bdo
  extends beb
{
  private float a;
  private double az;
  private double aA;
  private double aB;
  
  protected bdo(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    v = ☃;
    w = ☃;
    x = ☃;
    az = ☃;
    aA = ☃;
    aB = ☃;
    s = (p = ☃ + ☃);
    t = (q = ☃ + ☃);
    u = (r = ☃ + ☃);
    
    float ☃ = V.nextFloat() * 0.6F + 0.4F;
    a = (h = V.nextFloat() * 0.5F + 0.2F);
    ar = (as = at = 1.0F * ☃);
    as *= 0.9F;
    ar *= 0.9F;
    
    g = ((int)(Math.random() * 10.0D) + 30);
    T = true;
    k((int)(Math.random() * 26.0D + 1.0D + 224.0D));
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
    ☃ *= ☃;
    ☃ *= ☃;
    return ☃ * (1.0F - ☃) + ☃;
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    
    float ☃ = f / g;
    ☃ = 1.0F - ☃;
    
    float ☃ = 1.0F - ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    s = (az + v * ☃);
    t = (aA + w * ☃ - ☃ * 1.2F);
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
      return new bdo(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
