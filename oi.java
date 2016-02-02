import java.util.Random;

public class oi
{
  private static final Random a = new Random();
  
  public static void a(adm ☃, cj ☃, og ☃)
  {
    a(☃, ☃.n(), ☃.o(), ☃.p(), ☃);
  }
  
  public static void a(adm ☃, pk ☃, og ☃)
  {
    a(☃, ☃.s, ☃.t, ☃.u, ☃);
  }
  
  private static void a(adm ☃, double ☃, double ☃, double ☃, og ☃)
  {
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        a(☃, ☃, ☃, ☃, ☃);
      }
    }
  }
  
  private static void a(adm ☃, double ☃, double ☃, double ☃, zx ☃)
  {
    float ☃ = a.nextFloat() * 0.8F + 0.1F;
    float ☃ = a.nextFloat() * 0.8F + 0.1F;
    float ☃ = a.nextFloat() * 0.8F + 0.1F;
    while (☃.b > 0)
    {
      int ☃ = a.nextInt(21) + 10;
      if (☃ > ☃.b) {
        ☃ = ☃.b;
      }
      ☃.b -= ☃;
      
      uz ☃ = new uz(☃, ☃ + ☃, ☃ + ☃, ☃ + ☃, new zx(☃.b(), ☃, ☃.i()));
      if (☃.n()) {
        ☃.l().d((dn)☃.o().b());
      }
      float ☃ = 0.05F;
      ☃.v = (a.nextGaussian() * ☃);
      ☃.w = (a.nextGaussian() * ☃ + 0.20000000298023224D);
      ☃.x = (a.nextGaussian() * ☃);
      
      ☃.d(☃);
    }
  }
}
