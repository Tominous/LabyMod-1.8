import java.util.Random;

public class vn
  extends vv
{
  private int a;
  private int b;
  private int c = 30;
  private int bm = 3;
  private int bn = 0;
  
  public vn(adm ☃)
  {
    super(☃);
    
    this.i.a(1, new ra(this));
    this.i.a(2, new sf(this));
    this.i.a(3, new qs(this, ts.class, 6.0F, 1.0D, 1.2D));
    this.i.a(4, new rl(this, 1.0D, false));
    this.i.a(5, new rz(this, 0.8D));
    this.i.a(6, new ri(this, wn.class, 8.0F));
    this.i.a(6, new ry(this));
    
    this.bi.a(1, new sp(this, wn.class, true));
    this.bi.a(2, new sm(this, false, new Class[0]));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.d).a(0.25D);
  }
  
  public int aE()
  {
    if (u() == null) {
      return 3;
    }
    return 3 + (int)(bn() - 1.0F);
  }
  
  public void e(float ☃, float ☃)
  {
    super.e(☃, ☃);
    
    this.b = ((int)(this.b + ☃ * 1.5F));
    if (this.b > this.c - 5) {
      this.b = (this.c - 5);
    }
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(16, Byte.valueOf((byte)-1));
    this.ac.a(17, Byte.valueOf((byte)0));
    this.ac.a(18, Byte.valueOf((byte)0));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (this.ac.a(17) == 1) {
      ☃.a("powered", true);
    }
    ☃.a("Fuse", (short)this.c);
    ☃.a("ExplosionRadius", (byte)this.bm);
    ☃.a("ignited", cn());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    this.ac.b(17, Byte.valueOf((byte)(☃.n("powered") ? 1 : 0)));
    if (☃.b("Fuse", 99)) {
      this.c = ☃.e("Fuse");
    }
    if (☃.b("ExplosionRadius", 99)) {
      this.bm = ☃.d("ExplosionRadius");
    }
    if (☃.n("ignited")) {
      co();
    }
  }
  
  public void t_()
  {
    if (ai())
    {
      this.a = this.b;
      if (cn()) {
        a(1);
      }
      int ☃ = cm();
      if ((☃ > 0) && (this.b == 0)) {
        a("creeper.primed", 1.0F, 0.5F);
      }
      this.b += ☃;
      if (this.b < 0) {
        this.b = 0;
      }
      if (this.b >= this.c)
      {
        this.b = this.c;
        cr();
      }
    }
    super.t_();
  }
  
  protected String bo()
  {
    return "mob.creeper.say";
  }
  
  protected String bp()
  {
    return "mob.creeper.death";
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if ((☃.j() instanceof wa))
    {
      int ☃ = zw.b(zy.cq);
      int ☃ = zw.b(zy.cB);
      int ☃ = ☃ + this.V.nextInt(☃ - ☃ + 1);
      a(zw.b(☃), 1);
    }
    else if (((☃.j() instanceof vn)) && 
      (☃.j() != this) && (((vn)☃.j()).n()) && (((vn)☃.j()).cp()))
    {
      ((vn)☃.j()).cq();
      a(new zx(zy.bX, 1, 4), 0.0F);
    }
  }
  
  public boolean r(pk ☃)
  {
    return true;
  }
  
  public boolean n()
  {
    return this.ac.a(17) == 1;
  }
  
  public float a(float ☃)
  {
    return (this.a + (this.b - this.a) * ☃) / (this.c - 2);
  }
  
  protected zw A()
  {
    return zy.H;
  }
  
  public int cm()
  {
    return this.ac.a(16);
  }
  
  public void a(int ☃)
  {
    this.ac.b(16, Byte.valueOf((byte)☃));
  }
  
  public void a(uv ☃)
  {
    super.a(☃);
    this.ac.b(17, Byte.valueOf((byte)1));
  }
  
  protected boolean a(wn ☃)
  {
    zx ☃ = ☃.bi.h();
    if ((☃ != null) && (☃.b() == zy.d))
    {
      this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.ignite", 1.0F, this.V.nextFloat() * 0.4F + 0.8F);
      ☃.bw();
      if (!this.o.D)
      {
        co();
        ☃.a(1, ☃);
        return true;
      }
    }
    return super.a(☃);
  }
  
  private void cr()
  {
    if (!this.o.D)
    {
      boolean ☃ = this.o.Q().b("mobGriefing");
      float ☃ = n() ? 2.0F : 1.0F;
      this.o.a(this, this.s, this.t, this.u, this.bm * ☃, ☃);
      J();
    }
  }
  
  public boolean cn()
  {
    return this.ac.a(18) != 0;
  }
  
  public void co()
  {
    this.ac.b(18, Byte.valueOf((byte)1));
  }
  
  public boolean cp()
  {
    return (this.bn < 1) && (this.o.Q().b("doMobLoot"));
  }
  
  public void cq()
  {
    this.bn += 1;
  }
}
