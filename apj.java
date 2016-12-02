import com.google.common.base.Predicate;
import java.util.Random;

public class apj
  extends aot
{
  private final alz a;
  private final int b;
  private final Predicate<alz> c;
  
  public apj(alz ☃, int ☃)
  {
    this(☃, ☃, amg.a(afi.b));
  }
  
  public apj(alz ☃, int ☃, Predicate<alz> ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    float ☃ = ☃.nextFloat() * 3.1415927F;
    
    double ☃ = ☃.n() + 8 + ns.a(☃) * b / 8.0F;
    double ☃ = ☃.n() + 8 - ns.a(☃) * b / 8.0F;
    double ☃ = ☃.p() + 8 + ns.b(☃) * b / 8.0F;
    double ☃ = ☃.p() + 8 - ns.b(☃) * b / 8.0F;
    
    double ☃ = ☃.o() + ☃.nextInt(3) - 2;
    double ☃ = ☃.o() + ☃.nextInt(3) - 2;
    for (int ☃ = 0; ☃ < b; ☃++)
    {
      float ☃ = ☃ / b;
      double ☃ = ☃ + (☃ - ☃) * ☃;
      double ☃ = ☃ + (☃ - ☃) * ☃;
      double ☃ = ☃ + (☃ - ☃) * ☃;
      
      double ☃ = ☃.nextDouble() * b / 16.0D;
      double ☃ = (ns.a(3.1415927F * ☃) + 1.0F) * ☃ + 1.0D;
      double ☃ = (ns.a(3.1415927F * ☃) + 1.0F) * ☃ + 1.0D;
      
      int ☃ = ns.c(☃ - ☃ / 2.0D);
      int ☃ = ns.c(☃ - ☃ / 2.0D);
      int ☃ = ns.c(☃ - ☃ / 2.0D);
      
      int ☃ = ns.c(☃ + ☃ / 2.0D);
      int ☃ = ns.c(☃ + ☃ / 2.0D);
      int ☃ = ns.c(☃ + ☃ / 2.0D);
      for (int ☃ = ☃; ☃ <= ☃; ☃++)
      {
        double ☃ = (☃ + 0.5D - ☃) / (☃ / 2.0D);
        if (☃ * ☃ < 1.0D) {
          for (int ☃ = ☃; ☃ <= ☃; ☃++)
          {
            double ☃ = (☃ + 0.5D - ☃) / (☃ / 2.0D);
            if (☃ * ☃ + ☃ * ☃ < 1.0D) {
              for (int ☃ = ☃; ☃ <= ☃; ☃++)
              {
                double ☃ = (☃ + 0.5D - ☃) / (☃ / 2.0D);
                if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ < 1.0D)
                {
                  cj ☃ = new cj(☃, ☃, ☃);
                  if (c.apply(☃.p(☃))) {
                    ☃.a(☃, a, 2);
                  }
                }
              }
            }
          }
        }
      }
    }
    return true;
  }
}
