import java.util.Random;

public class tn
  extends tm
{
  public float bm;
  public float bo;
  public float bp;
  public float bq;
  public float br = 1.0F;
  public int bs;
  public boolean bt;
  
  public tn(adm ☃)
  {
    super(☃);
    a(0.4F, 0.7F);
    this.bs = (this.V.nextInt(6000) + 6000);
    
    this.i.a(0, new ra(this));
    this.i.a(1, new rv(this, 1.4D));
    this.i.a(2, new qv(this, 1.0D));
    this.i.a(3, new sh(this, 1.0D, zy.N, false));
    this.i.a(4, new rc(this, 1.1D));
    this.i.a(5, new rz(this, 1.0D));
    this.i.a(6, new ri(this, wn.class, 6.0F));
    this.i.a(7, new ry(this));
  }
  
  public float aS()
  {
    return this.K;
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(4.0D);
    a(vy.d).a(0.25D);
  }
  
  public void m()
  {
    super.m();
    
    this.bq = this.bm;
    this.bp = this.bo;
    
    this.bo = ((float)(this.bo + (this.C ? -1 : 4) * 0.3D));
    this.bo = ns.a(this.bo, 0.0F, 1.0F);
    if ((!this.C) && (this.br < 1.0F)) {
      this.br = 1.0F;
    }
    this.br = ((float)(this.br * 0.9D));
    if ((!this.C) && (this.w < 0.0D)) {
      this.w *= 0.6D;
    }
    this.bm += this.br * 2.0F;
    if ((!this.o.D) && (!j_()) && (!cl()) && (--this.bs <= 0))
    {
      a("mob.chicken.plop", 1.0F, (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
      a(zy.aP, 1);
      this.bs = (this.V.nextInt(6000) + 6000);
    }
  }
  
  public void e(float ☃, float ☃) {}
  
  protected String z()
  {
    return "mob.chicken.say";
  }
  
  protected String bo()
  {
    return "mob.chicken.hurt";
  }
  
  protected String bp()
  {
    return "mob.chicken.hurt";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.chicken.step", 0.15F, 1.0F);
  }
  
  protected zw A()
  {
    return zy.G;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = this.V.nextInt(3) + this.V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.G, 1);
    }
    if (at()) {
      a(zy.bl, 1);
    } else {
      a(zy.bk, 1);
    }
  }
  
  public tn b(ph ☃)
  {
    return new tn(this.o);
  }
  
  public boolean d(zx ☃)
  {
    return (☃ != null) && (☃.b() == zy.N);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    this.bt = ☃.n("IsChickenJockey");
    if (☃.c("EggLayTime")) {
      this.bs = ☃.f("EggLayTime");
    }
  }
  
  protected int b(wn ☃)
  {
    if (cl()) {
      return 10;
    }
    return super.b(☃);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("IsChickenJockey", this.bt);
    ☃.a("EggLayTime", this.bs);
  }
  
  protected boolean C()
  {
    return (cl()) && (this.l == null);
  }
  
  public void al()
  {
    super.al();
    float ☃ = ns.a(this.aI * 3.1415927F / 180.0F);
    float ☃ = ns.b(this.aI * 3.1415927F / 180.0F);
    float ☃ = 0.1F;
    float ☃ = 0.0F;
    
    this.l.b(this.s + ☃ * ☃, this.t + this.K * 0.5F + this.l.am() + ☃, this.u - ☃ * ☃);
    if ((this.l instanceof pr)) {
      ((pr)this.l).aI = this.aI;
    }
  }
  
  public boolean cl()
  {
    return this.bt;
  }
  
  public void l(boolean ☃)
  {
    this.bt = ☃;
  }
}
