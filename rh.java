import java.util.Random;

public class rh
  extends rd
{
  ps a;
  pr b;
  float c;
  
  public rh(ps ☃, float ☃)
  {
    a = ☃;
    c = ☃;
    a(5);
  }
  
  public boolean a()
  {
    b = a.u();
    if (b == null) {
      return false;
    }
    double ☃ = a.h(b);
    if ((☃ < 4.0D) || (☃ > 16.0D)) {
      return false;
    }
    if (!a.C) {
      return false;
    }
    if (a.bc().nextInt(5) != 0) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    return !a.C;
  }
  
  public void c()
  {
    double ☃ = b.s - a.s;
    double ☃ = b.u - a.u;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    a.v += ☃ / ☃ * 0.5D * 0.800000011920929D + a.v * 0.20000000298023224D;
    a.x += ☃ / ☃ * 0.5D * 0.800000011920929D + a.x * 0.20000000298023224D;
    a.w = c;
  }
}
