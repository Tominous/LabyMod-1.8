import java.util.Random;

class vr$d
  extends rd
{
  private vr a;
  
  public vr$d(vr ☃)
  {
    this.a = ☃;
    
    a(1);
  }
  
  public boolean a()
  {
    qq ☃ = this.a.q();
    if (!☃.a()) {
      return true;
    }
    double ☃ = ☃.d() - this.a.s;
    double ☃ = ☃.e() - this.a.t;
    double ☃ = ☃.f() - this.a.u;
    
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    if ((☃ < 1.0D) || (☃ > 3600.0D)) {
      return true;
    }
    return false;
  }
  
  public boolean b()
  {
    return false;
  }
  
  public void c()
  {
    Random ☃ = this.a.bc();
    double ☃ = this.a.s + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
    double ☃ = this.a.t + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
    double ☃ = this.a.u + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
    this.a.q().a(☃, ☃, ☃, 1.0D);
  }
}
