import java.util.Random;
import java.util.Set;

class vo$c
  extends rd
{
  private vo a;
  
  public vo$c(vo ☃)
  {
    a = ☃;
  }
  
  public boolean a()
  {
    if (!a.o.Q().b("mobGriefing")) {
      return false;
    }
    if (a.cm().c().t() != arm.a) {
      return false;
    }
    if (a.bc().nextInt(20) != 0) {
      return false;
    }
    return true;
  }
  
  public void e()
  {
    Random ☃ = a.bc();
    adm ☃ = a.o;
    
    int ☃ = ns.c(a.s - 2.0D + ☃.nextDouble() * 4.0D);
    int ☃ = ns.c(a.t + ☃.nextDouble() * 3.0D);
    int ☃ = ns.c(a.u - 2.0D + ☃.nextDouble() * 4.0D);
    cj ☃ = new cj(☃, ☃, ☃);
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (vo.cq().contains(☃))
    {
      a.a(☃);
      ☃.a(☃, afi.a.Q());
    }
  }
}
