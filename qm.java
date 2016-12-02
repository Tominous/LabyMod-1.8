public class qm
{
  private pr a;
  private int b;
  private float c;
  
  public qm(pr ☃)
  {
    this.a = ☃;
  }
  
  public void a()
  {
    double ☃ = this.a.s - this.a.p;
    double ☃ = this.a.u - this.a.r;
    if (☃ * ☃ + ☃ * ☃ > 2.500000277905201E-7D)
    {
      this.a.aI = this.a.y;
      this.a.aK = a(this.a.aI, this.a.aK, 75.0F);
      this.c = this.a.aK;
      this.b = 0;
      return;
    }
    float ☃ = 75.0F;
    if (Math.abs(this.a.aK - this.c) > 15.0F)
    {
      this.b = 0;
      this.c = this.a.aK;
    }
    else
    {
      this.b += 1;
      int ☃ = 10;
      if (this.b > 10) {
        ☃ = Math.max(1.0F - (this.b - 10) / 10.0F, 0.0F) * 75.0F;
      }
    }
    this.a.aI = a(this.a.aK, this.a.aI, ☃);
  }
  
  private float a(float ☃, float ☃, float ☃)
  {
    float ☃ = ns.g(☃ - ☃);
    if (☃ < -☃) {
      ☃ = -☃;
    }
    if (☃ >= ☃) {
      ☃ = ☃;
    }
    return ☃ - ☃;
  }
}
