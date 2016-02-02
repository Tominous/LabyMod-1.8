import java.util.Random;

public class yv
  extends zw
{
  private afh a;
  
  public yv(afh ☃)
  {
    this.h = 1;
    this.a = ☃;
    a(yz.f);
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    boolean ☃ = this.a == afi.a;
    
    auh ☃ = a(☃, ☃, ☃);
    if (☃ == null) {
      return ☃;
    }
    if (☃.a == auh.a.b)
    {
      cj ☃ = ☃.a();
      if (!☃.a(☃, ☃)) {
        return ☃;
      }
      if (☃)
      {
        if (!☃.a(☃.a(☃.b), ☃.b, ☃)) {
          return ☃;
        }
        alz ☃ = ☃.p(☃);
        arm ☃ = ☃.c().t();
        if ((☃ == arm.h) && (((Integer)☃.b(ahv.b)).intValue() == 0))
        {
          ☃.g(☃);
          ☃.b(na.ad[zw.b(this)]);
          return a(☃, ☃, zy.ax);
        }
        if ((☃ == arm.i) && (((Integer)☃.b(ahv.b)).intValue() == 0))
        {
          ☃.g(☃);
          ☃.b(na.ad[zw.b(this)]);
          return a(☃, ☃, zy.ay);
        }
      }
      else
      {
        if (this.a == afi.a) {
          return new zx(zy.aw);
        }
        cj ☃ = ☃.a(☃.b);
        if (!☃.a(☃, ☃.b, ☃)) {
          return ☃;
        }
        if ((a(☃, ☃)) && (!☃.bA.d))
        {
          ☃.b(na.ad[zw.b(this)]);
          return new zx(zy.aw);
        }
      }
    }
    return ☃;
  }
  
  private zx a(zx ☃, wn ☃, zw ☃)
  {
    if (☃.bA.d) {
      return ☃;
    }
    if (--☃.b <= 0) {
      return new zx(☃);
    }
    if (!☃.bi.a(new zx(☃))) {
      ☃.a(new zx(☃, 1, 0), false);
    }
    return ☃;
  }
  
  public boolean a(adm ☃, cj ☃)
  {
    if (this.a == afi.a) {
      return false;
    }
    arm ☃ = ☃.p(☃).c().t();
    boolean ☃ = !☃.a();
    if ((☃.d(☃)) || (☃))
    {
      if ((☃.t.n()) && (this.a == afi.i))
      {
        int ☃ = ☃.n();
        int ☃ = ☃.o();
        int ☃ = ☃.p();
        
        ☃.a(☃ + 0.5F, ☃ + 0.5F, ☃ + 0.5F, "random.fizz", 0.5F, 2.6F + (☃.s.nextFloat() - ☃.s.nextFloat()) * 0.8F);
        for (int ☃ = 0; ☃ < 8; ☃++) {
          ☃.a(cy.m, ☃ + Math.random(), ☃ + Math.random(), ☃ + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
      else
      {
        if ((!☃.D) && (☃) && (!☃.d())) {
          ☃.b(☃, true);
        }
        ☃.a(☃, this.a.Q(), 3);
      }
      return true;
    }
    return false;
  }
}
