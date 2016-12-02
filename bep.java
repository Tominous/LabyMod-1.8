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
    super(☃, ☃.s, ☃.aR().b + ☃.K / 2.0F, ☃.u, ☃.v, ☃.w, ☃.x);
    this.a = ☃;
    this.aA = 3;
    this.aB = ☃;
    t_();
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃) {}
  
  public void t_()
  {
    for (int ☃ = 0; ☃ < 16; ☃++)
    {
      double ☃ = this.V.nextFloat() * 2.0F - 1.0F;
      double ☃ = this.V.nextFloat() * 2.0F - 1.0F;
      double ☃ = this.V.nextFloat() * 2.0F - 1.0F;
      if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ <= 1.0D)
      {
        double ☃ = this.a.s + ☃ * this.a.J / 4.0D;
        double ☃ = this.a.aR().b + this.a.K / 2.0F + ☃ * this.a.K / 4.0D;
        double ☃ = this.a.u + ☃ * this.a.J / 4.0D;
        this.o.a(this.aB, false, ☃, ☃, ☃, ☃, ☃ + 0.2D, ☃, new int[0]);
      }
    }
    this.az += 1;
    if (this.az >= this.aA) {
      J();
    }
  }
  
  public int a()
  {
    return 3;
  }
}
