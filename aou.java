import java.util.Random;

public class aou
  extends aot
{
  private agw a;
  private alz b;
  
  public aou(agw ☃, agw.a ☃)
  {
    a(☃, ☃);
  }
  
  public void a(agw ☃, agw.a ☃)
  {
    this.a = ☃;
    this.b = ☃.Q().a(☃.n(), ☃);
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    for (int ☃ = 0; ☃ < 64; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(8) - ☃.nextInt(8), ☃.nextInt(4) - ☃.nextInt(4), ☃.nextInt(8) - ☃.nextInt(8));
      if ((☃.d(☃)) && ((!☃.t.o()) || (☃.o() < 255)) && 
        (this.a.f(☃, ☃, this.b))) {
        ☃.a(☃, this.b, 2);
      }
    }
    return true;
  }
}
