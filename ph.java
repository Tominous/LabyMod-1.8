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
    zx ☃ = bi.h();
    if ((☃ != null) && (☃.b() == zy.bJ))
    {
      if (!o.D)
      {
        Class<? extends pk> ☃ = pm.a(☃.i());
        if ((☃ != null) && (getClass() == ☃))
        {
          ph ☃ = a(this);
          if (☃ != null)
          {
            ☃.b(41536);
            ☃.b(s, t, u, 0.0F, 0.0F);
            
            o.d(☃);
            if (☃.s()) {
              ☃.a(☃.q());
            }
            if (!bA.d)
            {
              b -= 1;
              if (b <= 0) {
                bi.a(bi.c, null);
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
    ac.a(12, Byte.valueOf((byte)0));
  }
  
  public int l()
  {
    if (o.D) {
      return ac.a(12);
    }
    return a;
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
      b += ☃;
      if (c == 0) {
        c = 40;
      }
    }
    if (l() == 0) {
      b(b);
    }
  }
  
  public void a(int ☃)
  {
    a(☃, false);
  }
  
  public void b(int ☃)
  {
    ac.b(12, Byte.valueOf((byte)ns.a(☃, -1, 1)));
    a = ☃;
    a(j_());
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Age", l());
    ☃.a("ForcedAge", b);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    b(☃.f("Age"));
    b = ☃.f("ForcedAge");
  }
  
  public void m()
  {
    super.m();
    if (o.D)
    {
      if (c > 0)
      {
        if (c % 4 == 0) {
          o.a(cy.v, s + V.nextFloat() * J * 2.0F - J, t + 0.5D + V.nextFloat() * K, u + V.nextFloat() * J * 2.0F - J, 0.0D, 0.0D, 0.0D, new int[0]);
        }
        c -= 1;
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
    boolean ☃ = bm > 0.0F;
    
    bm = ☃;
    bn = ☃;
    if (!☃) {
      a(1.0F);
    }
  }
  
  protected final void a(float ☃)
  {
    super.a(bm * ☃, bn * ☃);
  }
}
