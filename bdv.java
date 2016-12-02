import java.util.Random;

public class bdv
  extends beb
{
  private int a;
  private int az;
  
  protected bdv(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.az = 8;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃) {}
  
  public void t_()
  {
    for (int ☃ = 0; ☃ < 6; ☃++)
    {
      double ☃ = this.s + (this.V.nextDouble() - this.V.nextDouble()) * 4.0D;
      double ☃ = this.t + (this.V.nextDouble() - this.V.nextDouble()) * 4.0D;
      double ☃ = this.u + (this.V.nextDouble() - this.V.nextDouble()) * 4.0D;
      this.o.a(cy.b, ☃, ☃, ☃, this.a / this.az, 0.0D, 0.0D, new int[0]);
    }
    this.a += 1;
    if (this.a == this.az) {
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
