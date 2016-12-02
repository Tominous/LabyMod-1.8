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
    a = ☃;
  }
  
  public void a(pk ☃, float ☃, float ☃)
  {
    e = s;
    if ((☃ instanceof pr)) {
      f = (t + ☃.aS());
    } else {
      f = ((aRb + aRe) / 2.0D);
    }
    g = u;
    b = ☃;
    c = ☃;
    d = true;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    e = ☃;
    f = ☃;
    g = ☃;
    b = ☃;
    c = ☃;
    d = true;
  }
  
  public void a()
  {
    a.z = 0.0F;
    if (d)
    {
      d = false;
      
      double ☃ = e - a.s;
      double ☃ = f - (a.t + a.aS());
      double ☃ = g - a.u;
      double ☃ = ns.a(☃ * ☃ + ☃ * ☃);
      
      float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
      float ☃ = (float)-(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D);
      a.z = a(a.z, ☃, c);
      a.aK = a(a.aK, ☃, b);
    }
    else
    {
      a.aK = a(a.aK, a.aI, 10.0F);
    }
    float ☃ = ns.g(a.aK - a.aI);
    if (!a.s().m())
    {
      if (☃ < -75.0F) {
        a.aK = (a.aI - 75.0F);
      }
      if (☃ > 75.0F) {
        a.aK = (a.aI + 75.0F);
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
    return d;
  }
  
  public double e()
  {
    return e;
  }
  
  public double f()
  {
    return f;
  }
  
  public double g()
  {
    return g;
  }
}
