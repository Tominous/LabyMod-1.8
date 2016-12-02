import java.util.Random;

public class bep
  extends beb
{
  private pk a;
  private int az;
  private int aA;
  private cy aB;
  
  public bep(adm ☃, pk ☃, cy ☃)
  {
    super(☃, s, aRb + K / 2.0F, u, v, w, x);
    a = ☃;
    aA = 3;
    aB = ☃;
    t_();
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃) {}
  
  public void t_()
  {
    for (int ☃ = 0; ☃ < 16; ☃++)
    {
      double ☃ = V.nextFloat() * 2.0F - 1.0F;
      double ☃ = V.nextFloat() * 2.0F - 1.0F;
      double ☃ = V.nextFloat() * 2.0F - 1.0F;
      if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ <= 1.0D)
      {
        double ☃ = a.s + ☃ * a.J / 4.0D;
        double ☃ = a.aR().b + a.K / 2.0F + ☃ * a.K / 4.0D;
        double ☃ = a.u + ☃ * a.J / 4.0D;
        o.a(aB, false, ☃, ☃, ☃, ☃, ☃ + 0.2D, ☃, new int[0]);
      }
    }
    az += 1;
    if (az >= aA) {
      J();
    }
  }
  
  public int a()
  {
    return 3;
  }
}
