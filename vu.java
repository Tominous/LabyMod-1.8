import java.util.List;
import java.util.Random;

public class vu
  extends wb
{
  public vu(adm ☃)
  {
    super(☃);
    this.ab = true;
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.d).a(0.20000000298023224D);
  }
  
  public boolean bR()
  {
    return this.o.aa() != oj.a;
  }
  
  public boolean bS()
  {
    return (this.o.a(aR(), this)) && (this.o.a(this, aR()).isEmpty()) && (!this.o.d(aR()));
  }
  
  public int br()
  {
    return cm() * 3;
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  protected cy n()
  {
    return cy.A;
  }
  
  protected wb cf()
  {
    return new vu(this.o);
  }
  
  protected zw A()
  {
    return zy.bE;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    zw ☃ = A();
    if ((☃ != null) && (cm() > 1))
    {
      int ☃ = this.V.nextInt(4) - 2;
      if (☃ > 0) {
        ☃ += this.V.nextInt(☃ + 1);
      }
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(☃, 1);
      }
    }
  }
  
  public boolean at()
  {
    return false;
  }
  
  protected int cg()
  {
    return super.cg() * 4;
  }
  
  protected void ch()
  {
    this.a *= 0.9F;
  }
  
  protected void bF()
  {
    this.w = (0.42F + cm() * 0.1F);
    this.ai = true;
  }
  
  protected void bH()
  {
    this.w = (0.22F + cm() * 0.05F);
    this.ai = true;
  }
  
  public void e(float ☃, float ☃) {}
  
  protected boolean ci()
  {
    return true;
  }
  
  protected int cj()
  {
    return super.cj() + 2;
  }
  
  protected String ck()
  {
    if (cm() > 1) {
      return "mob.magmacube.big";
    }
    return "mob.magmacube.small";
  }
  
  protected boolean cl()
  {
    return true;
  }
}
