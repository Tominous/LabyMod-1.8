import java.util.Random;
import java.util.Set;

class vo$c
  extends rd
{
  private vo a;
  
  public vo$c(vo ☃)
  {
    this.a = ☃;
  }
  
  public boolean a()
  {
    if (!this.a.o.Q().b("mobGriefing")) {
      return false;
    }
    if (this.a.cm().c().t() != arm.a) {
      return false;
    }
    if (this.a.bc().nextInt(20) != 0) {
      return false;
    }
    return true;
  }
  
  public void e()
  {
    Random ☃ = this.a.bc();
    adm ☃ = this.a.o;
    
    int ☃ = ns.c(this.a.s - 2.0D + ☃.nextDouble() * 4.0D);
    int ☃ = ns.c(this.a.t + ☃.nextDouble() * 3.0D);
    int ☃ = ns.c(this.a.u - 2.0D + ☃.nextDouble() * 4.0D);
    cj ☃ = new cj(☃, ☃, ☃);
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (vo.cq().contains(☃))
    {
      this.a.a(☃);
      ☃.a(☃, afi.a.Q());
    }
  }
}
