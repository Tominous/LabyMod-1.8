import java.util.Random;

public class xa
  extends wy
{
  private pr c;
  
  public xa(adm ☃)
  {
    super(☃);
  }
  
  public xa(adm ☃, pr ☃)
  {
    super(☃, ☃);
    c = ☃;
  }
  
  public xa(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  protected void a(auh ☃)
  {
    pr ☃ = n();
    if (d != null)
    {
      if (d == c) {
        return;
      }
      d.a(ow.a(this, ☃), 0.0F);
    }
    for (int ☃ = 0; ☃ < 32; ☃++) {
      o.a(cy.y, s, t + V.nextDouble() * 2.0D, u, V.nextGaussian(), 0.0D, V.nextGaussian(), new int[0]);
    }
    if (!o.D)
    {
      if ((☃ instanceof lf))
      {
        lf ☃ = (lf)☃;
        if ((a.a().g()) && (o == o) && (!☃.bJ()))
        {
          if ((V.nextFloat() < 0.05F) && (o.Q().b("doMobSpawning")))
          {
            vp ☃ = new vp(o);
            ☃.a(true);
            ☃.b(s, t, u, y, z);
            o.d(☃);
          }
          if (☃.au()) {
            ☃.a(null);
          }
          ☃.a(s, t, u);
          O = 0.0F;
          ☃.a(ow.i, 5.0F);
        }
      }
      else if (☃ != null)
      {
        ☃.a(s, t, u);
        O = 0.0F;
      }
      J();
    }
  }
  
  public void t_()
  {
    pr ☃ = n();
    if ((☃ != null) && ((☃ instanceof wn)) && (!☃.ai())) {
      J();
    } else {
      super.t_();
    }
  }
}
