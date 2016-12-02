import java.util.Random;

public class bdv
  extends beb
{
  private int a;
  private int az;
  
  protected bdv(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    az = 8;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃) {}
  
  public void t_()
  {
    for (int ☃ = 0; ☃ < 6; ☃++)
    {
      double ☃ = s + (V.nextDouble() - V.nextDouble()) * 4.0D;
      double ☃ = t + (V.nextDouble() - V.nextDouble()) * 4.0D;
      double ☃ = u + (V.nextDouble() - V.nextDouble()) * 4.0D;
      o.a(cy.b, ☃, ☃, ☃, a / az, 0.0D, 0.0D, new int[0]);
    }
    a += 1;
    if (a == az) {
      J();
    }
  }
  
  public int a()
  {
    return 1;
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdv(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
