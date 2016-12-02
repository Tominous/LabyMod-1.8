import java.util.Random;

public class aos
  extends aot
{
  private agi.b a;
  
  public void a(agi.b ☃)
  {
    a = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < 64; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(8) - ☃.nextInt(8), ☃.nextInt(4) - ☃.nextInt(4), ☃.nextInt(8) - ☃.nextInt(8));
      if ((☃.d(☃)) && ((!t.o()) || (☃.o() < 254)) && 
        (afi.cF.d(☃, ☃)))
      {
        afi.cF.a(☃, ☃, a, 2);
        ☃ = true;
      }
    }
    return ☃;
  }
}
