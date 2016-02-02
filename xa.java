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
    this.c = ☃;
  }
  
  public xa(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  protected void a(auh ☃)
  {
    pr ☃ = n();
    if (☃.d != null)
    {
      if (☃.d == this.c) {
        return;
      }
      ☃.d.a(ow.a(this, ☃), 0.0F);
    }
    for (int ☃ = 0; ☃ < 32; ☃++) {
      this.o.a(cy.y, this.s, this.t + this.V.nextDouble() * 2.0D, this.u, this.V.nextGaussian(), 0.0D, this.V.nextGaussian(), new int[0]);
    }
    if (!this.o.D)
    {
      if ((☃ instanceof lf))
      {
        lf ☃ = (lf)☃;
        if ((☃.a.a().g()) && (☃.o == this.o) && (!☃.bJ()))
        {
          if ((this.V.nextFloat() < 0.05F) && (this.o.Q().b("doMobSpawning")))
          {
            vp ☃ = new vp(this.o);
            ☃.a(true);
            ☃.b(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
            this.o.d(☃);
          }
          if (☃.au()) {
            ☃.a(null);
          }
          ☃.a(this.s, this.t, this.u);
          ☃.O = 0.0F;
          ☃.a(ow.i, 5.0F);
        }
      }
      else if (☃ != null)
      {
        ☃.a(this.s, this.t, this.u);
        ☃.O = 0.0F;
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
