import java.util.Random;

class vo$a
  extends rd
{
  private vo a;
  
  public vo$a(vo ☃)
  {
    a = ☃;
  }
  
  public boolean a()
  {
    if (!a.o.Q().b("mobGriefing")) {
      return false;
    }
    if (a.cm().c().t() == arm.a) {
      return false;
    }
    if (a.bc().nextInt(2000) != 0) {
      return false;
    }
    return true;
  }
  
  public void e()
  {
    Random ☃ = a.bc();
    adm ☃ = a.o;
    
    int ☃ = ns.c(a.s - 1.0D + ☃.nextDouble() * 2.0D);
    int ☃ = ns.c(a.t + ☃.nextDouble() * 2.0D);
    int ☃ = ns.c(a.u - 1.0D + ☃.nextDouble() * 2.0D);
    cj ☃ = new cj(☃, ☃, ☃);
    afh ☃ = ☃.p(☃).c();
    afh ☃ = ☃.p(☃.b()).c();
    if (a(☃, ☃, a.cm().c(), ☃, ☃))
    {
      ☃.a(☃, a.cm(), 3);
      a.a(afi.a.Q());
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
