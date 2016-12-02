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
    
    i.a(1, new ra(this));
    i.a(2, new sf(this));
    i.a(3, new qs(this, ts.class, 6.0F, 1.0D, 1.2D));
    i.a(4, new rl(this, 1.0D, false));
    i.a(5, new rz(this, 0.8D));
    i.a(6, new ri(this, wn.class, 8.0F));
    i.a(6, new ry(this));
    
    bi.a(1, new sp(this, wn.class, true));
    bi.a(2, new sm(this, false, new Class[0]));
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
    
    b = ((int)(b + ☃ * 1.5F));
    if (b > c - 5) {
      b = (c - 5);
    }
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(16, Byte.valueOf((byte)-1));
    ac.a(17, Byte.valueOf((byte)0));
    ac.a(18, Byte.valueOf((byte)0));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (ac.a(17) == 1) {
      ☃.a("powered", true);
    }
    ☃.a("Fuse", (short)c);
    ☃.a("ExplosionRadius", (byte)bm);
    ☃.a("ignited", cn());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    ac.b(17, Byte.valueOf((byte)(☃.n("powered") ? 1 : 0)));
    if (☃.b("Fuse", 99)) {
      c = ☃.e("Fuse");
    }
    if (☃.b("ExplosionRadius", 99)) {
      bm = ☃.d("ExplosionRadius");
    }
    if (☃.n("ignited")) {
      co();
    }
  }
  
  public void t_()
  {
    if (ai())
    {
      a = b;
      if (cn()) {
        a(1);
      }
      int ☃ = cm();
      if ((☃ > 0) && (b == 0)) {
        a("creeper.primed", 1.0F, 0.5F);
      }
      b += ☃;
      if (b < 0) {
        b = 0;
      }
      if (b >= c)
      {
        b = c;
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
      int ☃ = ☃ + V.nextInt(☃ - ☃ + 1);
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
    return ac.a(17) == 1;
  }
  
  public float a(float ☃)
  {
    return (a + (b - a) * ☃) / (c - 2);
  }
  
  protected zw A()
  {
    return zy.H;
  }
  
  public int cm()
  {
    return ac.a(16);
  }
  
  public void a(int ☃)
  {
    ac.b(16, Byte.valueOf((byte)☃));
  }
  
  public void a(uv ☃)
  {
    super.a(☃);
    ac.b(17, Byte.valueOf((byte)1));
  }
  
  protected boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if ((☃ != null) && (☃.b() == zy.d))
    {
      o.a(s + 0.5D, t + 0.5D, u + 0.5D, "fire.ignite", 1.0F, V.nextFloat() * 0.4F + 0.8F);
      ☃.bw();
      if (!o.D)
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
    if (!o.D)
    {
      boolean ☃ = o.Q().b("mobGriefing");
      float ☃ = n() ? 2.0F : 1.0F;
      o.a(this, s, t, u, bm * ☃, ☃);
      J();
    }
  }
  
  public boolean cn()
  {
    return ac.a(18) != 0;
  }
  
  public void co()
  {
    ac.b(18, Byte.valueOf((byte)1));
  }
  
  public boolean cp()
  {
    return (bn < 1) && (o.Q().b("doMobLoot"));
  }
  
  public void cq()
  {
    bn += 1;
  }
}
