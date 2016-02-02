import java.util.Random;

public abstract class ph
  extends py
{
  protected int a;
  protected int b;
  protected int c;
  
  public ph(adm ☃)
  {
    super(☃);
  }
  
  public abstract ph a(ph paramph);
  
  public boolean a(wn ☃)
  {
    zx ☃ = ☃.bi.h();
    if ((☃ != null) && (☃.b() == zy.bJ))
    {
      if (!this.o.D)
      {
        Class<? extends pk> ☃ = pm.a(☃.i());
        if ((☃ != null) && (getClass() == ☃))
        {
          ph ☃ = a(this);
          if (☃ != null)
          {
            ☃.b(41536);
            ☃.b(this.s, this.t, this.u, 0.0F, 0.0F);
            
            this.o.d(☃);
            if (☃.s()) {
              ☃.a(☃.q());
            }
            if (!☃.bA.d)
            {
              ☃.b -= 1;
              if (☃.b <= 0) {
                ☃.bi.a(☃.bi.c, null);
              }
            }
          }
        }
      }
      return true;
    }
    return false;
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(12, Byte.valueOf((byte)0));
  }
  
  public int l()
  {
    if (this.o.D) {
      return this.ac.a(12);
    }
    return this.a;
  }
  
  public void a(int ☃, boolean ☃)
  {
    int ☃ = l();
    int ☃ = ☃;
    ☃ += ☃ * 20;
    if (☃ > 0)
    {
      ☃ = 0;
      if (☃ < 0) {
        n();
      }
    }
    int ☃ = ☃ - ☃;
    b(☃);
    if (☃)
    {
      this.b += ☃;
      if (this.c == 0) {
        this.c = 40;
      }
    }
    if (l() == 0) {
      b(this.b);
    }
  }
  
  public void a(int ☃)
  {
    a(☃, false);
  }
  
  public void b(int ☃)
  {
    this.ac.b(12, Byte.valueOf((byte)ns.a(☃, -1, 1)));
    this.a = ☃;
    a(j_());
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Age", l());
    ☃.a("ForcedAge", this.b);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    b(☃.f("Age"));
    this.b = ☃.f("ForcedAge");
  }
  
  public void m()
  {
    super.m();
    if (this.o.D)
    {
      if (this.c > 0)
      {
        if (this.c % 4 == 0) {
          this.o.a(cy.v, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, 0.0D, 0.0D, 0.0D, new int[0]);
        }
        this.c -= 1;
      }
      a(j_());
    }
    else
    {
      int ☃ = l();
      if (☃ < 0)
      {
        ☃++;
        b(☃);
        if (☃ == 0) {
          n();
        }
      }
      else if (☃ > 0)
      {
        ☃--;
        b(☃);
      }
    }
  }
  
  protected void n() {}
  
  public boolean j_()
  {
    return l() < 0;
  }
  
  public void a(boolean ☃)
  {
    a(☃ ? 0.5F : 1.0F);
  }
  
  private float bm = -1.0F;
  private float bn;
  
  protected final void a(float ☃, float ☃)
  {
    boolean ☃ = this.bm > 0.0F;
    
    this.bm = ☃;
    this.bn = ☃;
    if (!☃) {
      a(1.0F);
    }
  }
  
  protected final void a(float ☃)
  {
    super.a(this.bm * ☃, this.bn * ☃);
  }
}
