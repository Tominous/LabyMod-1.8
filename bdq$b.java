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
    v = ☃;
    w = ☃;
    x = ☃;
    aB = ☃;
    
    h *= 0.75F;
    
    g = (48 + V.nextInt(12));
    T = false;
  }
  
  public void a(boolean ☃)
  {
    az = ☃;
  }
  
  public void i(boolean ☃)
  {
    aA = ☃;
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
    aC = (((☃ & 0xFF0000) >> 16) / 255.0F);
    aD = (((☃ & 0xFF00) >> 8) / 255.0F);
    aE = (((☃ & 0xFF) >> 0) / 255.0F);
    aF = true;
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
    if ((!aA) || (f < g / 3) || ((f + g) / 3 % 2 == 0)) {
      super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    if (f++ >= g) {
      J();
    }
    if (f > g / 2)
    {
      i(1.0F - (f - g / 2) / g);
      if (aF)
      {
        ar += (aC - ar) * 0.2F;
        as += (aD - as) * 0.2F;
        at += (aE - at) * 0.2F;
      }
    }
    k(a + (7 - f * 8 / g));
    
    w -= 0.004D;
    d(v, w, x);
    v *= 0.9100000262260437D;
    w *= 0.9100000262260437D;
    x *= 0.9100000262260437D;
    if (C)
    {
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
    }
    if ((az) && (f < g / 2) && ((f + g) % 2 == 0))
    {
      b ☃ = new b(o, s, t, u, 0.0D, 0.0D, 0.0D, aB);
      ☃.i(0.99F);
      ☃.b(ar, as, at);
      f = (g / 2);
      if (aF)
      {
        aF = true;
        aC = aC;
        aD = aD;
        aE = aE;
      }
      aA = aA;
      aB.a(☃);
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
