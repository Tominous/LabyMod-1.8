import java.util.Random;

public class rh
  extends rd
{
  ps a;
  pr b;
  float c;
  
  public rh(ps ☃, float ☃)
  {
    this.a = ☃;
    this.c = ☃;
    a(5);
  }
  
  public boolean a()
  {
    this.b = this.a.u();
    if (this.b == null) {
      return false;
    }
    double ☃ = this.a.h(this.b);
    if ((☃ < 4.0D) || (☃ > 16.0D)) {
      return false;
    }
    if (!this.a.C) {
      return false;
    }
    if (this.a.bc().nextInt(5) != 0) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    return !this.a.C;
  }
  
  public void c()
  {
    double ☃ = this.b.s - this.a.s;
    double ☃ = this.b.u - this.a.u;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    this.a.v += ☃ / ☃ * 0.5D * 0.800000011920929D + this.a.v * 0.20000000298023224D;
    this.a.x += ☃ / ☃ * 0.5D * 0.800000011920929D + this.a.x * 0.20000000298023224D;
    this.a.w = this.c;
  }
}
