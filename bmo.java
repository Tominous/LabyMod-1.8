import java.util.List;

public class bmo
  extends bmi
{
  private double j;
  private double k;
  
  public bmo(String ☃)
  {
    super(☃);
  }
  
  public void j()
  {
    if (this.a.isEmpty()) {
      return;
    }
    ave ☃ = ave.A();
    
    double ☃ = 0.0D;
    if ((☃.f != null) && (☃.h != null))
    {
      ☃ = ☃.f.c(1.0F);
      if (!☃.f.t.d()) {
        ☃ = Math.random();
      }
    }
    double ☃ = ☃ - this.j;
    while (☃ < -0.5D) {
      ☃ += 1.0D;
    }
    while (☃ >= 0.5D) {
      ☃ -= 1.0D;
    }
    ☃ = ns.a(☃, -1.0D, 1.0D);
    this.k += ☃ * 0.1D;
    this.k *= 0.8D;
    
    this.j += this.k;
    
    int ☃ = (int)((this.j + 1.0D) * this.a.size()) % this.a.size();
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
