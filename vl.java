import java.util.Random;

public class vl
  extends vv
{
  private float a = 0.5F;
  private int b;
  
  public vl(adm ☃)
  {
    super(☃);
    
    this.ab = true;
    this.b_ = 10;
    
    this.i.a(4, new vl.a(this));
    this.i.a(5, new rp(this, 1.0D));
    this.i.a(7, new rz(this, 1.0D));
    this.i.a(8, new ri(this, wn.class, 8.0F));
    this.i.a(8, new ry(this));
    
    this.bi.a(1, new sm(this, true, new Class[0]));
    this.bi.a(2, new sp(this, wn.class, true));
  }
  
  protected void aX()
  {
    super.aX();
    a(vy.e).a(6.0D);
    a(vy.d).a(0.23000000417232513D);
    a(vy.b).a(48.0D);
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(16, new Byte((byte)0));
  }
  
  protected String z()
  {
    return "mob.blaze.breathe";
  }
  
  protected String bo()
  {
    return "mob.blaze.hit";
  }
  
  protected String bp()
  {
    return "mob.blaze.death";
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public void m()
  {
    if ((!this.C) && (this.w < 0.0D)) {
      this.w *= 0.6D;
    }
    if (this.o.D)
    {
      if ((this.V.nextInt(24) == 0) && (!R())) {
        this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.fire", 1.0F + this.V.nextFloat(), this.V.nextFloat() * 0.7F + 0.3F, false);
      }
      for (int ☃ = 0; ☃ < 2; ☃++) {
        this.o.a(cy.m, this.s + (this.V.nextDouble() - 0.5D) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5D) * this.J, 0.0D, 0.0D, 0.0D, new int[0]);
      }
    }
    super.m();
  }
  
  protected void E()
  {
    if (U()) {
      a(ow.f, 1.0F);
    }
    this.b -= 1;
    if (this.b <= 0)
    {
      this.b = 100;
      this.a = (0.5F + (float)this.V.nextGaussian() * 3.0F);
    }
    pr ☃ = u();
    if ((☃ != null) && (☃.t + ☃.aS() > this.t + aS() + this.a))
    {
      this.w += (0.30000001192092896D - this.w) * 0.30000001192092896D;
      this.ai = true;
    }
    super.E();
  }
  
  public void e(float ☃, float ☃) {}
  
  protected zw A()
  {
    return zy.bv;
  }
  
  public boolean at()
  {
    return n();
  }
  
  protected void b(boolean ☃, int ☃)
  {
    if (☃)
    {
      int ☃ = this.V.nextInt(2 + ☃);
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(zy.bv, 1);
      }
    }
  }
  
  public boolean n()
  {
    return (this.ac.a(16) & 0x1) != 0;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      ☃ = (byte)(☃ | 0x1);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFE);
    }
    this.ac.b(16, Byte.valueOf(☃));
  }
  
  protected boolean n_()
  {
    return true;
  }
  
  static class a
    extends rd
  {
    private vl a;
    private int b;
    private int c;
    
    public a(vl ☃)
    {
      this.a = ☃;
      
      a(3);
    }
    
    public boolean a()
    {
      pr ☃ = this.a.u();
      if ((☃ == null) || (!☃.ai())) {
        return false;
      }
      return true;
    }
    
    public void c()
    {
      this.b = 0;
    }
    
    public void d()
    {
      this.a.a(false);
    }
    
    public void e()
    {
      this.c -= 1;
      
      pr ☃ = this.a.u();
      
      double ☃ = this.a.h(☃);
      if (☃ < 4.0D)
      {
        if (this.c <= 0)
        {
          this.c = 20;
          this.a.r(☃);
        }
        this.a.q().a(☃.s, ☃.t, ☃.u, 1.0D);
      }
      else if (☃ < 256.0D)
      {
        double ☃ = ☃.s - this.a.s;
        double ☃ = ☃.aR().b + ☃.K / 2.0F - (this.a.t + this.a.K / 2.0F);
        double ☃ = ☃.u - this.a.u;
        if (this.c <= 0)
        {
          this.b += 1;
          if (this.b == 1)
          {
            this.c = 60;
            this.a.a(true);
          }
          else if (this.b <= 4)
          {
            this.c = 6;
          }
          else
          {
            this.c = 100;
            this.b = 0;
            this.a.a(false);
          }
          if (this.b > 1)
          {
            float ☃ = ns.c(ns.a(☃)) * 0.5F;
            
            this.a.o.a(null, 1009, new cj((int)this.a.s, (int)this.a.t, (int)this.a.u), 0);
            for (int ☃ = 0; ☃ < 1; ☃++)
            {
              ww ☃ = new ww(this.a.o, this.a, ☃ + this.a.bc().nextGaussian() * ☃, ☃, ☃ + this.a.bc().nextGaussian() * ☃);
              ☃.t = (this.a.t + this.a.K / 2.0F + 0.5D);
              this.a.o.d(☃);
            }
          }
        }
        this.a.p().a(☃, 10.0F, 10.0F);
      }
      else
      {
        this.a.s().n();
        this.a.q().a(☃.s, ☃.t, ☃.u, 1.0D);
      }
      super.e();
    }
  }
}
