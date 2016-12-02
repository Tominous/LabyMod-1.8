import java.util.List;
import java.util.Random;

public class qv
  extends rd
{
  private tm d;
  adm a;
  private tm e;
  int b;
  double c;
  
  public qv(tm ☃, double ☃)
  {
    this.d = ☃;
    this.a = ☃.o;
    this.c = ☃;
    a(3);
  }
  
  public boolean a()
  {
    if (!this.d.cr()) {
      return false;
    }
    this.e = f();
    return this.e != null;
  }
  
  public boolean b()
  {
    return (this.e.ai()) && (this.e.cr()) && (this.b < 60);
  }
  
  public void d()
  {
    this.e = null;
    this.b = 0;
  }
  
  public void e()
  {
    this.d.p().a(this.e, 10.0F, this.d.bQ());
    this.d.s().a(this.e, this.c);
    this.b += 1;
    if ((this.b >= 60) && (this.d.h(this.e) < 9.0D)) {
      g();
    }
  }
  
  private tm f()
  {
    float ☃ = 8.0F;
    List<tm> ☃ = this.a.a(this.d.getClass(), this.d.aR().b(☃, ☃, ☃));
    double ☃ = Double.MAX_VALUE;
    tm ☃ = null;
    for (tm ☃ : ☃) {
      if ((this.d.a(☃)) && (this.d.h(☃) < ☃))
      {
        ☃ = ☃;
        ☃ = this.d.h(☃);
      }
    }
    return ☃;
  }
  
  private void g()
  {
    ph ☃ = this.d.a(this.e);
    if (☃ == null) {
      return;
    }
    wn ☃ = this.d.cq();
    if ((☃ == null) && (this.e.cq() != null)) {
      ☃ = this.e.cq();
    }
    if (☃ != null)
    {
      ☃.b(na.A);
      if ((this.d instanceof to)) {
        ☃.b(mr.H);
      }
    }
    this.d.b(6000);
    this.e.b(6000);
    this.d.cs();
    this.e.cs();
    ☃.b(41536);
    ☃.b(this.d.s, this.d.t, this.d.u, 0.0F, 0.0F);
    this.a.d(☃);
    
    Random ☃ = this.d.bc();
    for (int ☃ = 0; ☃ < 7; ☃++)
    {
      double ☃ = ☃.nextGaussian() * 0.02D;
      double ☃ = ☃.nextGaussian() * 0.02D;
      double ☃ = ☃.nextGaussian() * 0.02D;
      
      double ☃ = ☃.nextDouble() * this.d.J * 2.0D - this.d.J;
      double ☃ = 0.5D + ☃.nextDouble() * this.d.K;
      double ☃ = ☃.nextDouble() * this.d.J * 2.0D - this.d.J;
      
      this.a.a(cy.I, this.d.s + ☃, this.d.t + ☃, this.d.u + ☃, ☃, ☃, ☃, new int[0]);
    }
    if (this.a.Q().b("doMobLoot")) {
      this.a.d(new pp(this.a, this.d.s, this.d.t, this.d.u, ☃.nextInt(7) + 1));
    }
  }
}
