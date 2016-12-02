class vt$c
  extends qq
{
  private vt g;
  
  public vt$c(vt ☃)
  {
    super(☃);
    g = ☃;
  }
  
  public void c()
  {
    if ((!f) || (g.s().m()))
    {
      g.k(0.0F);
      vt.a(g, false);
      return;
    }
    double ☃ = b - g.s;
    double ☃ = c - g.t;
    double ☃ = d - g.u;
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    ☃ = ns.a(☃);
    ☃ /= ☃;
    
    float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
    
    g.y = a(g.y, ☃, 30.0F);
    g.aI = g.y;
    
    float ☃ = (float)(e * g.a(vy.d).e());
    g.k(g.bI() + (☃ - g.bI()) * 0.125F);
    double ☃ = Math.sin((g.W + g.F()) * 0.5D) * 0.05D;
    double ☃ = Math.cos(g.y * 3.1415927F / 180.0F);
    double ☃ = Math.sin(g.y * 3.1415927F / 180.0F);
    g.v += ☃ * ☃;
    g.x += ☃ * ☃;
    
    ☃ = Math.sin((g.W + g.F()) * 0.75D) * 0.05D;
    g.w += ☃ * (☃ + ☃) * 0.25D;
    g.w += g.bI() * ☃ * 0.1D;
    
    qp ☃ = g.p();
    double ☃ = g.s + ☃ / ☃ * 2.0D;
    double ☃ = g.aS() + g.t + ☃ / ☃ * 1.0D;
    double ☃ = g.u + ☃ / ☃ * 2.0D;
    double ☃ = ☃.e();
    double ☃ = ☃.f();
    double ☃ = ☃.g();
    if (!☃.b())
    {
      ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    g.p().a(☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, 10.0F, 40.0F);
    vt.a(g, true);
  }
}
