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
    super(☃, ☃.s, ☃.t, ☃.u, ☃.v, ☃.w, ☃.x);
    this.a = ☃;
    this.az = ☃;
    this.aB = 3;
    this.aC = ☃;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (this.aA + ☃) / this.aB;
    ☃ *= ☃;
    
    double ☃ = this.a.s;
    double ☃ = this.a.t;
    double ☃ = this.a.u;
    
    double ☃ = this.az.P + (this.az.s - this.az.P) * ☃;
    double ☃ = this.az.Q + (this.az.t - this.az.Q) * ☃ + this.aC;
    double ☃ = this.az.R + (this.az.u - this.az.R) * ☃;
    
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
    
    this.aD.a(this.a, (float)☃, (float)☃, (float)☃, this.a.y, ☃);
  }
  
  public void t_()
  {
    this.aA += 1;
    if (this.aA == this.aB) {
      J();
    }
  }
  
  public int a()
  {
    return 3;
  }
}
