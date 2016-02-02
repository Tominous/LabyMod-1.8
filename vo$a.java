import java.util.Random;

class vo$a
  extends rd
{
  private vo a;
  
  public vo$a(vo ☃)
  {
    this.a = ☃;
  }
  
  public boolean a()
  {
    if (!this.a.o.Q().b("mobGriefing")) {
      return false;
    }
    if (this.a.cm().c().t() == arm.a) {
      return false;
    }
    if (this.a.bc().nextInt(2000) != 0) {
      return false;
    }
    return true;
  }
  
  public void e()
  {
    Random ☃ = this.a.bc();
    adm ☃ = this.a.o;
    
    int ☃ = ns.c(this.a.s - 1.0D + ☃.nextDouble() * 2.0D);
    int ☃ = ns.c(this.a.t + ☃.nextDouble() * 2.0D);
    int ☃ = ns.c(this.a.u - 1.0D + ☃.nextDouble() * 2.0D);
    cj ☃ = new cj(☃, ☃, ☃);
    afh ☃ = ☃.p(☃).c();
    afh ☃ = ☃.p(☃.b()).c();
    if (a(☃, ☃, this.a.cm().c(), ☃, ☃))
    {
      ☃.a(☃, this.a.cm(), 3);
      this.a.a(afi.a.Q());
    }
  }
  
  private boolean a(adm ☃, cj ☃, afh ☃, afh ☃, afh ☃)
  {
    if (!☃.d(☃, ☃)) {
      return false;
    }
    if (☃.t() != arm.a) {
      return false;
    }
    if (☃.t() == arm.a) {
      return false;
    }
    if (!☃.d()) {
      return false;
    }
    return true;
  }
}
