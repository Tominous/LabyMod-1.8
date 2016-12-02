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
    d = ☃;
    a = o;
    c = ☃;
    a(3);
  }
  
  public boolean a()
  {
    if (!d.cr()) {
      return false;
    }
    e = f();
    return e != null;
  }
  
  public boolean b()
  {
    return (e.ai()) && (e.cr()) && (b < 60);
  }
  
  public void d()
  {
    e = null;
    b = 0;
  }
  
  public void e()
  {
    d.p().a(e, 10.0F, d.bQ());
    d.s().a(e, c);
    b += 1;
    if ((b >= 60) && (d.h(e) < 9.0D)) {
      g();
    }
  }
  
  private tm f()
  {
    float ☃ = 8.0F;
    List<tm> ☃ = a.a(d.getClass(), d.aR().b(☃, ☃, ☃));
    double ☃ = Double.MAX_VALUE;
    tm ☃ = null;
    for (tm ☃ : ☃) {
      if ((d.a(☃)) && (d.h(☃) < ☃))
      {
        ☃ = ☃;
        ☃ = d.h(☃);
      }
    }
    return ☃;
  }
  
  private void g()
  {
    ph ☃ = d.a(e);
    if (☃ == null) {
      return;
    }
    wn ☃ = d.cq();
    if ((☃ == null) && (e.cq() != null)) {
      ☃ = e.cq();
    }
    if (☃ != null)
    {
      ☃.b(na.A);
      if ((d instanceof to)) {
        ☃.b(mr.H);
      }
    }
    d.b(6000);
    e.b(6000);
    d.cs();
    e.cs();
    ☃.b(41536);
    ☃.b(d.s, d.t, d.u, 0.0F, 0.0F);
    a.d(☃);
    
    Random ☃ = d.bc();
    for (int ☃ = 0; ☃ < 7; ☃++)
    {
      double ☃ = ☃.nextGaussian() * 0.02D;
      double ☃ = ☃.nextGaussian() * 0.02D;
      double ☃ = ☃.nextGaussian() * 0.02D;
      
      double ☃ = ☃.nextDouble() * d.J * 2.0D - d.J;
      double ☃ = 0.5D + ☃.nextDouble() * d.K;
      double ☃ = ☃.nextDouble() * d.J * 2.0D - d.J;
      
      a.a(cy.I, d.s + ☃, d.t + ☃, d.u + ☃, ☃, ☃, ☃, new int[0]);
    }
    if (a.Q().b("doMobLoot")) {
      a.d(new pp(a, d.s, d.t, d.u, ☃.nextInt(7) + 1));
    }
  }
}
