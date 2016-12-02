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
    if (d != null) {
      d.a(ow.a(this, n()), 0.0F);
    }
    if ((!o.D) && (V.nextInt(8) == 0))
    {
      int ☃ = 1;
      if (V.nextInt(32) == 0) {
        ☃ = 4;
      }
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        tn ☃ = new tn(o);
        ☃.b(41536);
        
        ☃.b(s, t, u, y, 0.0F);
        o.d(☃);
      }
    }
    double ☃ = 0.08D;
    for (int ☃ = 0; ☃ < 8; ☃++) {
      o.a(cy.K, s, t, u, (V.nextFloat() - 0.5D) * 0.08D, (V.nextFloat() - 0.5D) * 0.08D, (V.nextFloat() - 0.5D) * 0.08D, new int[] { zw.b(zy.aP) });
    }
    if (!o.D) {
      J();
    }
  }
}
