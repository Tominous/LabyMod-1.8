import java.util.Random;

public class aom
  extends aot
{
  private afm a;
  
  public aom(afm ☃)
  {
    this.a = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    for (int ☃ = 0; ☃ < 64; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(8) - ☃.nextInt(8), ☃.nextInt(4) - ☃.nextInt(4), ☃.nextInt(8) - ☃.nextInt(8));
      if ((☃.d(☃)) && ((!☃.t.o()) || (☃.o() < 255)) && 
        (this.a.f(☃, ☃, this.a.Q()))) {
        ☃.a(☃, this.a.Q(), 2);
      }
    }
    return true;
  }
}
