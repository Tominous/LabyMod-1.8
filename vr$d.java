import java.util.Random;

class vr$d
  extends rd
{
  private vr a;
  
  public vr$d(vr ☃)
  {
    a = ☃;
    
    a(1);
  }
  
  public boolean a()
  {
    qq ☃ = a.q();
    if (!☃.a()) {
      return true;
    }
    double ☃ = ☃.d() - a.s;
    double ☃ = ☃.e() - a.t;
    double ☃ = ☃.f() - a.u;
    
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
    Random ☃ = a.bc();
    double ☃ = a.s + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
    double ☃ = a.t + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
    double ☃ = a.u + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
    a.q().a(☃, ☃, ☃, 1.0D);
  }
}
