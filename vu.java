import java.util.List;
import java.util.Random;

public class vu
  extends wb
{
  public vu(adm ☃)
  {
    super(☃);
    ab = true;
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.d).a(0.20000000298023224D);
  }
  
  public boolean bR()
  {
    return o.aa() != oj.a;
  }
  
  public boolean bS()
  {
    return (o.a(aR(), this)) && (o.a(this, aR()).isEmpty()) && (!o.d(aR()));
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
    return new vu(o);
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
      int ☃ = V.nextInt(4) - 2;
      if (☃ > 0) {
        ☃ += V.nextInt(☃ + 1);
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
    a *= 0.9F;
  }
  
  protected void bF()
  {
    w = (0.42F + cm() * 0.1F);
    ai = true;
  }
  
  protected void bH()
  {
    w = (0.22F + cm() * 0.05F);
    ai = true;
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
