public class bdw
  extends beb
{
  private pk a;
  private pk az;
  private int aA;
  private int aB;
  private float aC;
  private biu aD = ave.A().af();
  
  public bdw(adm ☃, pk ☃, pk ☃, float ☃)
  {
    super(☃, s, t, u, v, w, x);
    a = ☃;
    az = ☃;
    aB = 3;
    aC = ☃;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (aA + ☃) / aB;
    ☃ *= ☃;
    
    double ☃ = a.s;
    double ☃ = a.t;
    double ☃ = a.u;
    
    double ☃ = az.P + (az.s - az.P) * ☃;
    double ☃ = az.Q + (az.t - az.Q) * ☃ + aC;
    double ☃ = az.R + (az.u - az.R) * ☃;
    
    double ☃ = ☃ + (☃ - ☃) * ☃;
    double ☃ = ☃ + (☃ - ☃) * ☃;
    double ☃ = ☃ + (☃ - ☃) * ☃;
    
    int ☃ = b(☃);
    int ☃ = ☃ % 65536;
    int ☃ = ☃ / 65536;
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    ☃ -= aw;
    ☃ -= ax;
    ☃ -= ay;
    
    aD.a(a, (float)☃, (float)☃, (float)☃, a.y, ☃);
  }
  
  public void t_()
  {
    aA += 1;
    if (aA == aB) {
      J();
    }
  }
  
  public int a()
  {
    return 3;
  }
}
