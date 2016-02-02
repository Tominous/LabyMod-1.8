import java.util.Random;

public class wz
  extends wy
{
  public wz(adm ☃)
  {
    super(☃);
  }
  
  public wz(adm ☃, pr ☃)
  {
    super(☃, ☃);
  }
  
  public wz(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  protected void a(auh ☃)
  {
    if (☃.d != null) {
      ☃.d.a(ow.a(this, n()), 0.0F);
    }
    if ((!this.o.D) && (this.V.nextInt(8) == 0))
    {
      int ☃ = 1;
      if (this.V.nextInt(32) == 0) {
        ☃ = 4;
      }
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        tn ☃ = new tn(this.o);
        ☃.b(41536);
        
        ☃.b(this.s, this.t, this.u, this.y, 0.0F);
        this.o.d(☃);
      }
    }
    double ☃ = 0.08D;
    for (int ☃ = 0; ☃ < 8; ☃++) {
      this.o.a(cy.K, this.s, this.t, this.u, (this.V.nextFloat() - 0.5D) * 0.08D, (this.V.nextFloat() - 0.5D) * 0.08D, (this.V.nextFloat() - 0.5D) * 0.08D, new int[] { zw.b(zy.aP) });
    }
    if (!this.o.D) {
      J();
    }
  }
}
