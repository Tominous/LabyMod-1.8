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
    
    i.a(1, new ra(this));
    i.a(2, new sc(this));
    i.a(3, new qz(this, 1.0D));
    i.a(3, new qs(this, ua.class, 6.0F, 1.0D, 1.2D));
    i.a(4, new rz(this, 1.0D));
    i.a(6, new ri(this, wn.class, 8.0F));
    i.a(6, new ry(this));
    
    bi.a(1, new sm(this, false, new Class[0]));
    bi.a(2, new sp(this, wn.class, true));
    bi.a(3, new sp(this, ty.class, true));
    if ((☃ != null) && (!D)) {
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
    
    ac.a(13, new Byte((byte)0));
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
        ((pr)☃).c(new pf(vH, 200));
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
    if ((o.w()) && (!o.D))
    {
      float ☃ = c(1.0F);
      cj ☃ = new cj(s, Math.round(t), u);
      if ((☃ > 0.5F) && (V.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F) && (o.i(☃)))
      {
        boolean ☃ = true;
        
        zx ☃ = p(4);
        if (☃ != null)
        {
          if (☃.e())
          {
            ☃.b(☃.h() + V.nextInt(2));
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
    if ((o.D) && 
      (cm() == 1)) {
      a(0.72F, 2.535F);
    }
    super.m();
  }
  
  public void ak()
  {
    super.ak();
    if ((m instanceof py))
    {
      py ☃ = (py)m;
      aI = aI;
    }
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if (((☃.i() instanceof wq)) && ((☃.j() instanceof wn)))
    {
      wn ☃ = (wn)☃.j();
      double ☃ = s - s;
      double ☃ = u - u;
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
      int ☃ = V.nextInt(3 + ☃) - 1;
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(zy.h, 1);
      }
    }
    else
    {
      int ☃ = V.nextInt(3 + ☃);
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(zy.g, 1);
      }
    }
    int ☃ = V.nextInt(3 + ☃);
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
    if (((o.t instanceof ann)) && (bc().nextInt(5) > 0))
    {
      i.a(4, b);
      
      a(1);
      c(0, new zx(zy.q));
      a(vy.e).a(4.0D);
    }
    else
    {
      i.a(4, a);
      
      a(☃);
      b(☃);
    }
    j(V.nextFloat() < 0.55F * ☃.c());
    if (p(4) == null)
    {
      Calendar ☃ = o.Y();
      if ((☃.get(2) + 1 == 10) && (☃.get(5) == 31) && (V.nextFloat() < 0.25F))
      {
        c(4, new zx(V.nextFloat() < 0.1F ? afi.aZ : afi.aU));
        bj[4] = 0.0F;
      }
    }
    return ☃;
  }
  
  public void n()
  {
    i.a(b);
    i.a(a);
    
    zx ☃ = bA();
    if ((☃ != null) && (☃.b() == zy.f)) {
      i.a(4, a);
    } else {
      i.a(4, b);
    }
  }
  
  public void a(pr ☃, float ☃)
  {
    wq ☃ = new wq(o, this, ☃, 1.6F, 14 - o.aa().a() * 4);
    int ☃ = ack.a(vB, bA());
    int ☃ = ack.a(wB, bA());
    
    ☃.b(☃ * 2.0F + (V.nextGaussian() * 0.25D + o.aa().a() * 0.11F));
    if (☃ > 0) {
      ☃.b(☃.j() + ☃ * 0.5D + 0.5D);
    }
    if (☃ > 0) {
      ☃.a(☃);
    }
    if ((ack.a(xB, bA()) > 0) || (cm() == 1)) {
      ☃.e(100);
    }
    a("random.bow", 1.0F, 1.0F / (bc().nextFloat() * 0.4F + 0.8F));
    o.d(☃);
  }
  
  public int cm()
  {
    return ac.a(13);
  }
  
  public void a(int ☃)
  {
    ac.b(13, Byte.valueOf((byte)☃));
    
    ab = (☃ == 1);
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
    if ((!o.D) && (☃ == 0)) {
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
