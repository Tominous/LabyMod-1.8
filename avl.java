public class avl
{
  float a;
  private double f;
  public int b;
  public float c;
  public float d = 1.0F;
  public float e;
  private long g;
  private long h;
  private long i;
  private double j = 1.0D;
  
  public avl(float ☃)
  {
    a = ☃;
    g = ave.J();
    h = (System.nanoTime() / 1000000L);
  }
  
  public void a()
  {
    long ☃ = ave.J();
    long ☃ = ☃ - g;
    long ☃ = System.nanoTime() / 1000000L;
    double ☃ = ☃ / 1000.0D;
    if ((☃ > 1000L) || (☃ < 0L))
    {
      f = ☃;
    }
    else
    {
      i += ☃;
      if (i > 1000L)
      {
        long ☃ = ☃ - h;
        
        double ☃ = i / ☃;
        j += (☃ - j) * 0.20000000298023224D;
        
        h = ☃;
        i = 0L;
      }
      if (i < 0L) {
        h = ☃;
      }
    }
    g = ☃;
    
    double ☃ = (☃ - f) * j;
    f = ☃;
    
    ☃ = ns.a(☃, 0.0D, 1.0D);
    
    e = ((float)(e + ☃ * d * a));
    
    b = ((int)e);
    e -= b;
    if (b > 10) {
      b = 10;
    }
    c = e;
  }
}
