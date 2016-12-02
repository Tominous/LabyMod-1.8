import java.util.Random;

public class bdq$b
  extends beb
{
  private int a = 160;
  private boolean az;
  private boolean aA;
  private final bec aB;
  private float aC;
  private float aD;
  private float aE;
  private boolean aF;
  
  public bdq$b(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, bec ☃)
  {
    super(☃, ☃, ☃, ☃);
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
    this.aB = ☃;
    
    this.h *= 0.75F;
    
    this.g = (48 + this.V.nextInt(12));
    this.T = false;
  }
  
  public void a(boolean ☃)
  {
    this.az = ☃;
  }
  
  public void i(boolean ☃)
  {
    this.aA = ☃;
  }
  
  public void a(int ☃)
  {
    float ☃ = ((☃ & 0xFF0000) >> 16) / 255.0F;
    float ☃ = ((☃ & 0xFF00) >> 8) / 255.0F;
    float ☃ = ((☃ & 0xFF) >> 0) / 255.0F;
    float ☃ = 1.0F;
    b(☃ * ☃, ☃ * ☃, ☃ * ☃);
  }
  
  public void b(int ☃)
  {
    this.aC = (((☃ & 0xFF0000) >> 16) / 255.0F);
    this.aD = (((☃ & 0xFF00) >> 8) / 255.0F);
    this.aE = (((☃ & 0xFF) >> 0) / 255.0F);
    this.aF = true;
  }
  
  public aug S()
  {
    return null;
  }
  
  public boolean ae()
  {
    return false;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if ((!this.aA) || (this.f < this.g / 3) || ((this.f + this.g) / 3 % 2 == 0)) {
      super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if (this.f++ >= this.g) {
      J();
    }
    if (this.f > this.g / 2)
    {
      i(1.0F - (this.f - this.g / 2) / this.g);
      if (this.aF)
      {
        this.ar += (this.aC - this.ar) * 0.2F;
        this.as += (this.aD - this.as) * 0.2F;
        this.at += (this.aE - this.at) * 0.2F;
      }
    }
    k(this.a + (7 - this.f * 8 / this.g));
    
    this.w -= 0.004D;
    d(this.v, this.w, this.x);
    this.v *= 0.9100000262260437D;
    this.w *= 0.9100000262260437D;
    this.x *= 0.9100000262260437D;
    if (this.C)
    {
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
    }
    if ((this.az) && (this.f < this.g / 2) && ((this.f + this.g) % 2 == 0))
    {
      b ☃ = new b(this.o, this.s, this.t, this.u, 0.0D, 0.0D, 0.0D, this.aB);
      ☃.i(0.99F);
      ☃.b(this.ar, this.as, this.at);
      ☃.f = (☃.g / 2);
      if (this.aF)
      {
        ☃.aF = true;
        ☃.aC = this.aC;
        ☃.aD = this.aD;
        ☃.aE = this.aE;
      }
      ☃.aA = this.aA;
      this.aB.a(☃);
    }
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
}
