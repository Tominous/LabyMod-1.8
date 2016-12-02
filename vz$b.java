import java.util.Random;

class vz$b
  extends rd
{
  private vz a;
  private int b;
  
  public vz$b(vz ☃)
  {
    a = ☃;
  }
  
  public void f()
  {
    if (b == 0) {
      b = 20;
    }
  }
  
  public boolean a()
  {
    return b > 0;
  }
  
  public void e()
  {
    b -= 1;
    if (b <= 0)
    {
      adm ☃ = a.o;
      Random ☃ = a.bc();
      
      cj ☃ = new cj(a);
      for (int ☃ = 0; (☃ <= 5) && (☃ >= -5); ☃ = ☃ <= 0 ? 1 - ☃ : 0 - ☃) {
        for (int ☃ = 0; (☃ <= 10) && (☃ >= -10); ☃ = ☃ <= 0 ? 1 - ☃ : 0 - ☃) {
          for (int ☃ = 0; (☃ <= 10) && (☃ >= -10); ☃ = ☃ <= 0 ? 1 - ☃ : 0 - ☃)
          {
            cj ☃ = ☃.a(☃, ☃, ☃);
            alz ☃ = ☃.p(☃);
            if (☃.c() == afi.be)
            {
              if (☃.Q().b("mobGriefing")) {
                ☃.b(☃, true);
              } else {
                ☃.a(☃, ((ahz.a)☃.b(ahz.a)).d(), 3);
              }
              if (☃.nextBoolean()) {
                return;
              }
            }
          }
        }
      }
    }
  }
}
