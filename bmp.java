import java.util.List;

public class bmp
  extends bmi
{
  public double j;
  public double k;
  public static String l;
  
  public bmp(String ☃)
  {
    super(☃);
    l = ☃;
  }
  
  public void j()
  {
    ave ☃ = ave.A();
    if ((☃.f != null) && (☃.h != null)) {
      a(☃.f, ☃.h.s, ☃.h.u, ☃.h.y, false, false);
    } else {
      a(null, 0.0D, 0.0D, 0.0D, true, false);
    }
  }
  
  public void a(adm ☃, double ☃, double ☃, double ☃, boolean ☃, boolean ☃)
  {
    if (this.a.isEmpty()) {
      return;
    }
    double ☃ = 0.0D;
    if ((☃ != null) && (!☃))
    {
      cj ☃ = ☃.M();
      double ☃ = ☃.n() - ☃;
      double ☃ = ☃.p() - ☃;
      ☃ %= 360.0D;
      ☃ = -((☃ - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(☃, ☃));
      if (!☃.t.d()) {
        ☃ = Math.random() * 3.1415927410125732D * 2.0D;
      }
    }
    if (☃)
    {
      this.j = ☃;
    }
    else
    {
      double ☃ = ☃ - this.j;
      while (☃ < -3.141592653589793D) {
        ☃ += 6.283185307179586D;
      }
      while (☃ >= 3.141592653589793D) {
        ☃ -= 6.283185307179586D;
      }
      ☃ = ns.a(☃, -1.0D, 1.0D);
      this.k += ☃ * 0.1D;
      this.k *= 0.8D;
      this.j += this.k;
    }
    int ☃ = (int)((this.j / 6.283185307179586D + 1.0D) * this.a.size()) % this.a.size();
    while (☃ < 0) {
      ☃ = (☃ + this.a.size()) % this.a.size();
    }
    if (☃ != this.h)
    {
      this.h = ☃;
      bml.a((int[][])this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
    }
  }
}
