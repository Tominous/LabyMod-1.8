import java.util.Calendar;
import java.util.Random;

public class wa
  extends vv
  implements vx
{
  private sa a = new sa(this, 1.0D, 20, 60, 15.0F);
  private rl b = new rl(this, wn.class, 1.2D, false);
  
  public wa(adm ☃)
  {
    super(☃);
    
    this.i.a(1, new ra(this));
    this.i.a(2, new sc(this));
    this.i.a(3, new qz(this, 1.0D));
    this.i.a(3, new qs(this, ua.class, 6.0F, 1.0D, 1.2D));
    this.i.a(4, new rz(this, 1.0D));
    this.i.a(6, new ri(this, wn.class, 8.0F));
    this.i.a(6, new ry(this));
    
    this.bi.a(1, new sm(this, false, new Class[0]));
    this.bi.a(2, new sp(this, wn.class, true));
    this.bi.a(3, new sp(this, ty.class, true));
    if ((☃ != null) && (!☃.D)) {
      n();
    }
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.d).a(0.25D);
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(13, new Byte((byte)0));
  }
  
  protected String z()
  {
    return "mob.skeleton.say";
  }
  
  protected String bo()
  {
    return "mob.skeleton.hurt";
  }
  
  protected String bp()
  {
    return "mob.skeleton.death";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.skeleton.step", 0.15F, 1.0F);
  }
  
  public boolean r(pk ☃)
  {
    if (super.r(☃))
    {
      if ((cm() == 1) && ((☃ instanceof pr))) {
        ((pr)☃).c(new pf(pe.v.H, 200));
      }
      return true;
    }
    return false;
  }
  
  public pw bz()
  {
    return pw.b;
  }
  
  public void m()
  {
    if ((this.o.w()) && (!this.o.D))
    {
      float ☃ = c(1.0F);
      cj ☃ = new cj(this.s, Math.round(this.t), this.u);
      if ((☃ > 0.5F) && (this.V.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F) && (this.o.i(☃)))
      {
        boolean ☃ = true;
        
        zx ☃ = p(4);
        if (☃ != null)
        {
          if (☃.e())
          {
            ☃.b(☃.h() + this.V.nextInt(2));
            if (☃.h() >= ☃.j())
            {
              b(☃);
              c(4, null);
            }
          }
          ☃ = false;
        }
        if (☃) {
          e(8);
        }
      }
    }
    if ((this.o.D) && 
      (cm() == 1)) {
      a(0.72F, 2.535F);
    }
    super.m();
  }
  
  public void ak()
  {
    super.ak();
    if ((this.m instanceof py))
    {
      py ☃ = (py)this.m;
      this.aI = ☃.aI;
    }
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if (((☃.i() instanceof wq)) && ((☃.j() instanceof wn)))
    {
      wn ☃ = (wn)☃.j();
      double ☃ = ☃.s - this.s;
      double ☃ = ☃.u - this.u;
      if (☃ * ☃ + ☃ * ☃ >= 2500.0D) {
        ☃.b(mr.v);
      }
    }
    else if (((☃.j() instanceof vn)) && 
      (((vn)☃.j()).n()) && (((vn)☃.j()).cp()))
    {
      ((vn)☃.j()).cq();
      a(new zx(zy.bX, 1, cm() == 1 ? 1 : 0), 0.0F);
    }
  }
  
  protected zw A()
  {
    return zy.g;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    if (cm() == 1)
    {
      int ☃ = this.V.nextInt(3 + ☃) - 1;
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(zy.h, 1);
      }
    }
    else
    {
      int ☃ = this.V.nextInt(3 + ☃);
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(zy.g, 1);
      }
    }
    int ☃ = this.V.nextInt(3 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.aX, 1);
    }
  }
  
  protected void bq()
  {
    if (cm() == 1) {
      a(new zx(zy.bX, 1, 1), 0.0F);
    }
  }
  
  protected void a(ok ☃)
  {
    super.a(☃);
    
    c(0, new zx(zy.f));
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    if (((this.o.t instanceof ann)) && (bc().nextInt(5) > 0))
    {
      this.i.a(4, this.b);
      
      a(1);
      c(0, new zx(zy.q));
      a(vy.e).a(4.0D);
    }
    else
    {
      this.i.a(4, this.a);
      
      a(☃);
      b(☃);
    }
    j(this.V.nextFloat() < 0.55F * ☃.c());
    if (p(4) == null)
    {
      Calendar ☃ = this.o.Y();
      if ((☃.get(2) + 1 == 10) && (☃.get(5) == 31) && (this.V.nextFloat() < 0.25F))
      {
        c(4, new zx(this.V.nextFloat() < 0.1F ? afi.aZ : afi.aU));
        this.bj[4] = 0.0F;
      }
    }
    return ☃;
  }
  
  public void n()
  {
    this.i.a(this.b);
    this.i.a(this.a);
    
    zx ☃ = bA();
    if ((☃ != null) && (☃.b() == zy.f)) {
      this.i.a(4, this.a);
    } else {
      this.i.a(4, this.b);
    }
  }
  
  public void a(pr ☃, float ☃)
  {
    wq ☃ = new wq(this.o, this, ☃, 1.6F, 14 - this.o.aa().a() * 4);
    int ☃ = ack.a(aci.v.B, bA());
    int ☃ = ack.a(aci.w.B, bA());
    
    ☃.b(☃ * 2.0F + (this.V.nextGaussian() * 0.25D + this.o.aa().a() * 0.11F));
    if (☃ > 0) {
      ☃.b(☃.j() + ☃ * 0.5D + 0.5D);
    }
    if (☃ > 0) {
      ☃.a(☃);
    }
    if ((ack.a(aci.x.B, bA()) > 0) || (cm() == 1)) {
      ☃.e(100);
    }
    a("random.bow", 1.0F, 1.0F / (bc().nextFloat() * 0.4F + 0.8F));
    this.o.d(☃);
  }
  
  public int cm()
  {
    return this.ac.a(13);
  }
  
  public void a(int ☃)
  {
    this.ac.b(13, Byte.valueOf((byte)☃));
    
    this.ab = (☃ == 1);
    if (☃ == 1) {
      a(0.72F, 2.535F);
    } else {
      a(0.6F, 1.95F);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("SkeletonType", 99))
    {
      int ☃ = ☃.d("SkeletonType");
      a(☃);
    }
    n();
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("SkeletonType", (byte)cm());
  }
  
  public void c(int ☃, zx ☃)
  {
    super.c(☃, ☃);
    if ((!this.o.D) && (☃ == 0)) {
      n();
    }
  }
  
  public float aS()
  {
    if (cm() == 1) {
      return super.aS();
    }
    return 1.74F;
  }
  
  public double am()
  {
    return j_() ? 0.0D : -0.35D;
  }
}
