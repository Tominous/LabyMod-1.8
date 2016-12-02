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
    
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
    this.az = ☃;
    this.aA = ☃;
    this.aB = ☃;
    this.s = (this.p = ☃ + ☃);
    this.t = (this.q = ☃ + ☃);
    this.u = (this.r = ☃ + ☃);
    
    float ☃ = this.V.nextFloat() * 0.6F + 0.4F;
    this.a = (this.h = this.V.nextFloat() * 0.5F + 0.2F);
    this.ar = (this.as = this.at = 1.0F * ☃);
    this.as *= 0.9F;
    this.ar *= 0.9F;
    
    this.g = ((int)(Math.random() * 10.0D) + 30);
    this.T = true;
    k((int)(Math.random() * 26.0D + 1.0D + 224.0D));
  }
  
  public int b(float ☃)
  {
    int ☃ = super.b(☃);
    
    float ☃ = this.f / this.g;
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
    float ☃ = this.f / this.g;
    ☃ *= ☃;
    ☃ *= ☃;
    return ☃ * (1.0F - ☃) + ☃;
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    float ☃ = this.f / this.g;
    ☃ = 1.0F - ☃;
    
    float ☃ = 1.0F - ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    this.s = (this.az + this.v * ☃);
    this.t = (this.aA + this.w * ☃ - ☃ * 1.2F);
    this.u = (this.aB + this.x * ☃);
    if (this.f++ >= this.g) {
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
