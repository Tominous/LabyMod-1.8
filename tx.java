import java.util.Random;

public class tx
  extends tz
{
  public float a;
  public float b;
  public float c;
  public float bk;
  public float bl;
  public float bm;
  public float bn;
  public float bo;
  private float bp;
  private float bq;
  private float br;
  private float bs;
  private float bt;
  private float bu;
  
  public tx(adm ☃)
  {
    super(☃);
    a(0.95F, 0.95F);
    V.setSeed(1 + F());
    bq = (1.0F / (V.nextFloat() + 1.0F) * 0.2F);
    
    i.a(0, new tx.a(this));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
  }
  
  public float aS()
  {
    return K * 0.5F;
  }
  
  protected String z()
  {
    return null;
  }
  
  protected String bo()
  {
    return null;
  }
  
  protected String bp()
  {
    return null;
  }
  
  protected float bB()
  {
    return 0.4F;
  }
  
  protected zw A()
  {
    return null;
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = V.nextInt(3 + ☃) + 1;
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(new zx(zy.aW, 1, zd.p.b()), 0.0F);
    }
  }
  
  public boolean V()
  {
    return o.a(aR().b(0.0D, -0.6000000238418579D, 0.0D), arm.h, this);
  }
  
  public void m()
  {
    super.m();
    
    b = a;
    bk = c;
    
    bm = bl;
    bo = bn;
    
    bl += bq;
    if (bl > 6.283185307179586D) {
      if (o.D)
      {
        bl = 6.2831855F;
      }
      else
      {
        bl = ((float)(bl - 6.283185307179586D));
        if (V.nextInt(10) == 0) {
          bq = (1.0F / (V.nextFloat() + 1.0F) * 0.2F);
        }
        o.a(this, (byte)19);
      }
    }
    if (Y)
    {
      if (bl < 3.1415927F)
      {
        float ☃ = bl / 3.1415927F;
        bn = (ns.a(☃ * ☃ * 3.1415927F) * 3.1415927F * 0.25F);
        if (☃ > 0.75D)
        {
          bp = 1.0F;
          br = 1.0F;
        }
        else
        {
          br *= 0.8F;
        }
      }
      else
      {
        bn = 0.0F;
        bp *= 0.9F;
        br *= 0.99F;
      }
      if (!o.D)
      {
        v = (bs * bp);
        w = (bt * bp);
        x = (bu * bp);
      }
      float ☃ = ns.a(v * v + x * x);
      
      aI += (-(float)ns.b(v, x) * 180.0F / 3.1415927F - aI) * 0.1F;
      y = aI;
      c = ((float)(c + 3.141592653589793D * br * 1.5D));
      a += (-(float)ns.b(☃, w) * 180.0F / 3.1415927F - a) * 0.1F;
    }
    else
    {
      bn = (ns.e(ns.a(bl)) * 3.1415927F * 0.25F);
      if (!o.D)
      {
        v = 0.0D;
        w -= 0.08D;
        w *= 0.9800000190734863D;
        x = 0.0D;
      }
      a = ((float)(a + (-90.0F - a) * 0.02D));
    }
  }
  
  public void g(float ☃, float ☃)
  {
    d(v, w, x);
  }
  
  public boolean bR()
  {
    return (t > 45.0D) && (t < o.F()) && (super.bR());
  }
  
  public void a(byte ☃)
  {
    if (☃ == 19) {
      bl = 0.0F;
    } else {
      super.a(☃);
    }
  }
  
  public void b(float ☃, float ☃, float ☃)
  {
    bs = ☃;
    bt = ☃;
    bu = ☃;
  }
  
  public boolean n()
  {
    return (bs != 0.0F) || (bt != 0.0F) || (bu != 0.0F);
  }
  
  static class a
    extends rd
  {
    private tx a;
    
    public a(tx ☃)
    {
      a = ☃;
    }
    
    public boolean a()
    {
      return true;
    }
    
    public void e()
    {
      int ☃ = a.bh();
      if (☃ > 100)
      {
        a.b(0.0F, 0.0F, 0.0F);
      }
      else if ((a.bc().nextInt(50) == 0) || (!tx.a(a)) || (!a.n()))
      {
        float ☃ = a.bc().nextFloat() * 3.1415927F * 2.0F;
        float ☃ = ns.b(☃) * 0.2F;
        float ☃ = -0.1F + a.bc().nextFloat() * 0.2F;
        float ☃ = ns.a(☃) * 0.2F;
        a.b(☃, ☃, ☃);
      }
    }
  }
}
