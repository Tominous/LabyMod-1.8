public class qp
{
  private ps a;
  private float b;
  private float c;
  private boolean d;
  private double e;
  private double f;
  private double g;
  
  public qp(ps ☃)
  {
    this.a = ☃;
  }
  
  public void a(pk ☃, float ☃, float ☃)
  {
    this.e = ☃.s;
    if ((☃ instanceof pr)) {
      this.f = (☃.t + ☃.aS());
    } else {
      this.f = ((☃.aR().b + ☃.aR().e) / 2.0D);
    }
    this.g = ☃.u;
    this.b = ☃;
    this.c = ☃;
    this.d = true;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = true;
  }
  
  public void a()
  {
    this.a.z = 0.0F;
    if (this.d)
    {
      this.d = false;
      
      double ☃ = this.e - this.a.s;
      double ☃ = this.f - (this.a.t + this.a.aS());
      double ☃ = this.g - this.a.u;
      double ☃ = ns.a(☃ * ☃ + ☃ * ☃);
      
      float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
      float ☃ = (float)-(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D);
      this.a.z = a(this.a.z, ☃, this.c);
      this.a.aK = a(this.a.aK, ☃, this.b);
    }
    else
    {
      this.a.aK = a(this.a.aK, this.a.aI, 10.0F);
    }
    float ☃ = ns.g(this.a.aK - this.a.aI);
    if (!this.a.s().m())
    {
      if (☃ < -75.0F) {
        this.a.aK = (this.a.aI - 75.0F);
      }
      if (☃ > 75.0F) {
        this.a.aK = (this.a.aI + 75.0F);
      }
    }
  }
  
  private float a(float ☃, float ☃, float ☃)
  {
    float ☃ = ns.g(☃ - ☃);
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    return ☃ + ☃;
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public double e()
  {
    return this.e;
  }
  
  public double f()
  {
    return this.f;
  }
  
  public double g()
  {
    return this.g;
  }
}
