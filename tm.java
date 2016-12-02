import java.util.Random;

public abstract class tm
  extends ph
  implements pi
{
  protected afh bn = afi.c;
  private int bm;
  private wn bo;
  
  public tm(adm ☃)
  {
    super(☃);
  }
  
  protected void E()
  {
    if (l() != 0) {
      bm = 0;
    }
    super.E();
  }
  
  public void m()
  {
    super.m();
    if (l() != 0) {
      bm = 0;
    }
    if (bm > 0)
    {
      bm -= 1;
      if (bm % 10 == 0)
      {
        double ☃ = V.nextGaussian() * 0.02D;
        double ☃ = V.nextGaussian() * 0.02D;
        double ☃ = V.nextGaussian() * 0.02D;
        o.a(cy.I, s + V.nextFloat() * J * 2.0F - J, t + 0.5D + V.nextFloat() * K, u + V.nextFloat() * J * 2.0F - J, ☃, ☃, ☃, new int[0]);
      }
    }
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    bm = 0;
    return super.a(☃, ☃);
  }
  
  public float a(cj ☃)
  {
    if (o.p(☃.b()).c() == afi.c) {
      return 10.0F;
    }
    return o.o(☃) - 0.5F;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("InLove", bm);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    bm = ☃.f("InLove");
  }
  
  public boolean bR()
  {
    int ☃ = ns.c(s);
    int ☃ = ns.c(aRb);
    int ☃ = ns.c(u);
    cj ☃ = new cj(☃, ☃, ☃);
    return (o.p(☃.b()).c() == bn) && (o.k(☃) > 8) && (super.bR());
  }
  
  public int w()
  {
    return 120;
  }
  
  protected boolean C()
  {
    return false;
  }
  
  protected int b(wn ☃)
  {
    return 1 + o.s.nextInt(3);
  }
  
  public boolean d(zx ☃)
  {
    if (☃ == null) {
      return false;
    }
    return ☃.b() == zy.O;
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if (☃ != null)
    {
      if ((d(☃)) && (l() == 0) && (bm <= 0))
      {
        a(☃, ☃);
        c(☃);
        return true;
      }
      if ((j_()) && (d(☃)))
      {
        a(☃, ☃);
        a((int)(-l() / 20 * 0.1F), true);
        return true;
      }
    }
    return super.a(☃);
  }
  
  protected void a(wn ☃, zx ☃)
  {
    if (!bA.d)
    {
      b -= 1;
      if (b <= 0) {
        bi.a(bi.c, null);
      }
    }
  }
  
  public void c(wn ☃)
  {
    bm = 600;
    bo = ☃;
    
    o.a(this, (byte)18);
  }
  
  public wn cq()
  {
    return bo;
  }
  
  public boolean cr()
  {
    return bm > 0;
  }
  
  public void cs()
  {
    bm = 0;
  }
  
  public boolean a(tm ☃)
  {
    if (☃ == this) {
      return false;
    }
    if (☃.getClass() != getClass()) {
      return false;
    }
    return (cr()) && (☃.cr());
  }
  
  public void a(byte ☃)
  {
    if (☃ == 18) {
      for (int ☃ = 0; ☃ < 7; ☃++)
      {
        double ☃ = V.nextGaussian() * 0.02D;
        double ☃ = V.nextGaussian() * 0.02D;
        double ☃ = V.nextGaussian() * 0.02D;
        o.a(cy.I, s + V.nextFloat() * J * 2.0F - J, t + 0.5D + V.nextFloat() * K, u + V.nextFloat() * J * 2.0F - J, ☃, ☃, ☃, new int[0]);
      }
    } else {
      super.a(☃);
    }
  }
}
