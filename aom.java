import java.util.Random;

public class aom
  extends aot
{
  private afm a;
  
  public aom(afm ☃)
  {
    a = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    for (int ☃ = 0; ☃ < 64; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(8) - ☃.nextInt(8), ☃.nextInt(4) - ☃.nextInt(4), ☃.nextInt(8) - ☃.nextInt(8));
      if ((☃.d(☃)) && ((!t.o()) || (☃.o() < 255)) && 
        (a.f(☃, ☃, a.Q()))) {
        ☃.a(☃, a.Q(), 2);
      }
    }
    return true;
  }
}
