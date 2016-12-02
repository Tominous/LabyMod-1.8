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
    bs = (V.nextInt(6000) + 6000);
    
    i.a(0, new ra(this));
    i.a(1, new rv(this, 1.4D));
    i.a(2, new qv(this, 1.0D));
    i.a(3, new sh(this, 1.0D, zy.N, false));
    i.a(4, new rc(this, 1.1D));
    i.a(5, new rz(this, 1.0D));
    i.a(6, new ri(this, wn.class, 6.0F));
    i.a(7, new ry(this));
  }
  
  public float aS()
  {
    return K;
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
    
    bq = bm;
    bp = bo;
    
    bo = ((float)(bo + (C ? -1 : 4) * 0.3D));
    bo = ns.a(bo, 0.0F, 1.0F);
    if ((!C) && (br < 1.0F)) {
      br = 1.0F;
    }
    br = ((float)(br * 0.9D));
    if ((!C) && (w < 0.0D)) {
      w *= 0.6D;
    }
    bm += br * 2.0F;
    if ((!o.D) && (!j_()) && (!cl()) && (--bs <= 0))
    {
      a("mob.chicken.plop", 1.0F, (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F);
      a(zy.aP, 1);
      bs = (V.nextInt(6000) + 6000);
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
    int ☃ = V.nextInt(3) + V.nextInt(1 + ☃);
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
    return new tn(o);
  }
  
  public boolean d(zx ☃)
  {
    return (☃ != null) && (☃.b() == zy.N);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    bt = ☃.n("IsChickenJockey");
    if (☃.c("EggLayTime")) {
      bs = ☃.f("EggLayTime");
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
    ☃.a("IsChickenJockey", bt);
    ☃.a("EggLayTime", bs);
  }
  
  protected boolean C()
  {
    return (cl()) && (l == null);
  }
  
  public void al()
  {
    super.al();
    float ☃ = ns.a(aI * 3.1415927F / 180.0F);
    float ☃ = ns.b(aI * 3.1415927F / 180.0F);
    float ☃ = 0.1F;
    float ☃ = 0.0F;
    
    l.b(s + ☃ * ☃, t + K * 0.5F + l.am() + ☃, u - ☃ * ☃);
    if ((l instanceof pr)) {
      l).aI = aI;
    }
  }
  
  public boolean cl()
  {
    return bt;
  }
  
  public void l(boolean ☃)
  {
    bt = ☃;
  }
}
