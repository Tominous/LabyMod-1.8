public abstract class pq
  extends ps
{
  public pq(adm ☃)
  {
    super(☃);
  }
  
  public void e(float ☃, float ☃) {}
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃) {}
  
  public void g(float ☃, float ☃)
  {
    if (V())
    {
      a(☃, ☃, 0.02F);
      d(v, w, x);
      
      v *= 0.800000011920929D;
      w *= 0.800000011920929D;
      x *= 0.800000011920929D;
    }
    else if (ab())
    {
      a(☃, ☃, 0.02F);
      d(v, w, x);
      v *= 0.5D;
      w *= 0.5D;
      x *= 0.5D;
    }
    else
    {
      float ☃ = 0.91F;
      if (C) {
        ☃ = o.p(new cj(ns.c(s), ns.c(aRb) - 1, ns.c(u))).c().L * 0.91F;
      }
      float ☃ = 0.16277136F / (☃ * ☃ * ☃);
      a(☃, ☃, C ? 0.1F * ☃ : 0.02F);
      
      ☃ = 0.91F;
      if (C) {
        ☃ = o.p(new cj(ns.c(s), ns.c(aRb) - 1, ns.c(u))).c().L * 0.91F;
      }
      d(v, w, x);
      
      v *= ☃;
      w *= ☃;
      x *= ☃;
    }
    aA = aB;
    double ☃ = s - p;
    double ☃ = u - r;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 4.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    aB += (☃ - aB) * 0.4F;
    aC += aB;
  }
  
  public boolean k_()
  {
    return false;
  }
}
