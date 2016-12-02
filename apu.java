import java.util.Random;

public class apu
  extends aot
{
  private final alz a;
  
  public apu(akc.a ☃)
  {
    this.a = afi.H.Q().a(akc.a, ☃);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    afh ☃;
    while ((((☃ = ☃.p(☃).c()).t() == arm.a) || (☃.t() == arm.j)) && (☃.o() > 0)) {
      ☃ = ☃.b();
    }
    for (int ☃ = 0; ☃ < 128; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(8) - ☃.nextInt(8), ☃.nextInt(4) - ☃.nextInt(4), ☃.nextInt(8) - ☃.nextInt(8));
      if ((☃.d(☃)) && 
        (afi.H.f(☃, ☃, this.a))) {
        ☃.a(☃, this.a, 2);
      }
    }
    return true;
  }
}
