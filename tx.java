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
    this.V.setSeed(1 + F());
    this.bq = (1.0F / (this.V.nextFloat() + 1.0F) * 0.2F);
    
    this.i.a(0, new tx.a(this));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
  }
  
  public float aS()
  {
    return this.K * 0.5F;
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
    int ☃ = this.V.nextInt(3 + ☃) + 1;
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(new zx(zy.aW, 1, zd.p.b()), 0.0F);
    }
  }
  
  public boolean V()
  {
    return this.o.a(aR().b(0.0D, -0.6000000238418579D, 0.0D), arm.h, this);
  }
  
  public void m()
  {
    super.m();
    
    this.b = this.a;
    this.bk = this.c;
    
    this.bm = this.bl;
    this.bo = this.bn;
    
    this.bl += this.bq;
    if (this.bl > 6.283185307179586D) {
      if (this.o.D)
      {
        this.bl = 6.2831855F;
      }
      else
      {
        this.bl = ((float)(this.bl - 6.283185307179586D));
        if (this.V.nextInt(10) == 0) {
          this.bq = (1.0F / (this.V.nextFloat() + 1.0F) * 0.2F);
        }
        this.o.a(this, (byte)19);
      }
    }
    if (this.Y)
    {
      if (this.bl < 3.1415927F)
      {
        float ☃ = this.bl / 3.1415927F;
        this.bn = (ns.a(☃ * ☃ * 3.1415927F) * 3.1415927F * 0.25F);
        if (☃ > 0.75D)
        {
          this.bp = 1.0F;
          this.br = 1.0F;
        }
        else
        {
          this.br *= 0.8F;
        }
      }
      else
      {
        this.bn = 0.0F;
        this.bp *= 0.9F;
        this.br *= 0.99F;
      }
      if (!this.o.D)
      {
        this.v = (this.bs * this.bp);
        this.w = (this.bt * this.bp);
        this.x = (this.bu * this.bp);
      }
      float ☃ = ns.a(this.v * this.v + this.x * this.x);
      
      this.aI += (-(float)ns.b(this.v, this.x) * 180.0F / 3.1415927F - this.aI) * 0.1F;
      this.y = this.aI;
      this.c = ((float)(this.c + 3.141592653589793D * this.br * 1.5D));
      this.a += (-(float)ns.b(☃, this.w) * 180.0F / 3.1415927F - this.a) * 0.1F;
    }
    else
    {
      this.bn = (ns.e(ns.a(this.bl)) * 3.1415927F * 0.25F);
      if (!this.o.D)
      {
        this.v = 0.0D;
        this.w -= 0.08D;
        this.w *= 0.9800000190734863D;
        this.x = 0.0D;
      }
      this.a = ((float)(this.a + (-90.0F - this.a) * 0.02D));
    }
  }
  
  public void g(float ☃, float ☃)
  {
    d(this.v, this.w, this.x);
  }
  
  public boolean bR()
  {
    return (this.t > 45.0D) && (this.t < this.o.F()) && (super.bR());
  }
  
  public void a(byte ☃)
  {
    if (☃ == 19) {
      this.bl = 0.0F;
    } else {
      super.a(☃);
    }
  }
  
  public void b(float ☃, float ☃, float ☃)
  {
    this.bs = ☃;
    this.bt = ☃;
    this.bu = ☃;
  }
  
  public boolean n()
  {
    return (this.bs != 0.0F) || (this.bt != 0.0F) || (this.bu != 0.0F);
  }
  
  static class a
    extends rd
  {
    private tx a;
    
    public a(tx ☃)
    {
      this.a = ☃;
    }
    
    public boolean a()
    {
      return true;
    }
    
    public void e()
    {
      int ☃ = this.a.bh();
      if (☃ > 100)
      {
        this.a.b(0.0F, 0.0F, 0.0F);
      }
      else if ((this.a.bc().nextInt(50) == 0) || (!tx.a(this.a)) || (!this.a.n()))
      {
        float ☃ = this.a.bc().nextFloat() * 3.1415927F * 2.0F;
        float ☃ = ns.b(☃) * 0.2F;
        float ☃ = -0.1F + this.a.bc().nextFloat() * 0.2F;
        float ☃ = ns.a(☃) * 0.2F;
        this.a.b(☃, ☃, ☃);
      }
    }
  }
}
