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
      this.bm = 0;
    }
    super.E();
  }
  
  public void m()
  {
    super.m();
    if (l() != 0) {
      this.bm = 0;
    }
    if (this.bm > 0)
    {
      this.bm -= 1;
      if (this.bm % 10 == 0)
      {
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        this.o.a(cy.I, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, ☃, ☃, ☃, new int[0]);
      }
    }
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    this.bm = 0;
    return super.a(☃, ☃);
  }
  
  public float a(cj ☃)
  {
    if (this.o.p(☃.b()).c() == afi.c) {
      return 10.0F;
    }
    return this.o.o(☃) - 0.5F;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("InLove", this.bm);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    this.bm = ☃.f("InLove");
  }
  
  public boolean bR()
  {
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(aR().b);
    int ☃ = ns.c(this.u);
    cj ☃ = new cj(☃, ☃, ☃);
    return (this.o.p(☃.b()).c() == this.bn) && (this.o.k(☃) > 8) && (super.bR());
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
    return 1 + this.o.s.nextInt(3);
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
    zx ☃ = ☃.bi.h();
    if (☃ != null)
    {
      if ((d(☃)) && (l() == 0) && (this.bm <= 0))
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
    if (!☃.bA.d)
    {
      ☃.b -= 1;
      if (☃.b <= 0) {
        ☃.bi.a(☃.bi.c, null);
      }
    }
  }
  
  public void c(wn ☃)
  {
    this.bm = 600;
    this.bo = ☃;
    
    this.o.a(this, (byte)18);
  }
  
  public wn cq()
  {
    return this.bo;
  }
  
  public boolean cr()
  {
    return this.bm > 0;
  }
  
  public void cs()
  {
    this.bm = 0;
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
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        this.o.a(cy.I, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, ☃, ☃, ☃, new int[0]);
      }
    } else {
      super.a(☃);
    }
  }
}
