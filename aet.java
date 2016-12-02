import java.util.List;
import java.util.Random;

public class aet
  extends ady
{
  protected aet(int ☃)
  {
    super(☃);
    this.as.A = 2;
    this.as.B = 1;
    this.as.D = 1;
    this.as.E = 8;
    this.as.F = 10;
    this.as.J = 1;
    this.as.z = 4;
    this.as.I = 0;
    this.as.H = 0;
    this.as.C = 5;
    
    this.ar = 14745518;
    
    this.at.add(new ady.c(wb.class, 1, 1, 1));
  }
  
  public aoh a(Random ☃)
  {
    return this.aC;
  }
  
  public int b(cj ☃)
  {
    double ☃ = af.a(☃.n() * 0.0225D, ☃.p() * 0.0225D);
    if (☃ < -0.1D) {
      return 5011004;
    }
    return 6975545;
  }
  
  public int c(cj ☃)
  {
    return 6975545;
  }
  
  public agw.a a(Random ☃, cj ☃)
  {
    return agw.a.c;
  }
  
  public void a(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
  {
    double ☃ = af.a(☃ * 0.25D, ☃ * 0.25D);
    if (☃ > 0.0D)
    {
      int ☃ = ☃ & 0xF;
      int ☃ = ☃ & 0xF;
      for (int ☃ = 255; ☃ >= 0; ☃--) {
        if (☃.a(☃, ☃, ☃).c().t() != arm.a)
        {
          if ((☃ != 62) || (☃.a(☃, ☃, ☃).c() == afi.j)) {
            break;
          }
          ☃.a(☃, ☃, ☃, afi.j.Q());
          if (☃ >= 0.12D) {
            break;
          }
          ☃.a(☃, ☃ + 1, ☃, afi.bx.Q()); break;
        }
      }
    }
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
}
