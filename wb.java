import java.util.Random;

public class wb
  extends ps
  implements vq
{
  public float a;
  public float b;
  public float c;
  private boolean bk;
  
  public wb(adm ☃)
  {
    super(☃);
    
    f = new wb.d(this);
    
    i.a(1, new wb.b(this));
    
    i.a(2, new wb.a(this));
    i.a(3, new wb.e(this));
    
    i.a(5, new wb.c(this));
    
    bi.a(1, new so(this));
    bi.a(3, new sn(this, ty.class));
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(16, Byte.valueOf((byte)1));
  }
  
  protected void a(int ☃)
  {
    ac.b(16, Byte.valueOf((byte)☃));
    a(0.51000005F * ☃, 0.51000005F * ☃);
    b(s, t, u);
    a(vy.a).a(☃ * ☃);
    a(vy.d).a(0.2F + 0.1F * ☃);
    i(bu());
    b_ = ☃;
  }
  
  public int cm()
  {
    return ac.a(16);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Size", cm() - 1);
    ☃.a("wasOnGround", bk);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    int ☃ = ☃.f("Size");
    if (☃ < 0) {
      ☃ = 0;
    }
    a(☃ + 1);
    bk = ☃.n("wasOnGround");
  }
  
  protected cy n()
  {
    return cy.H;
  }
  
  protected String ck()
  {
    return "mob.slime." + (cm() > 1 ? "big" : "small");
  }
  
  public void t_()
  {
    if ((!o.D) && (o.aa() == oj.a) && (cm() > 0)) {
      I = true;
    }
    b += (a - b) * 0.5F;
    c = b;
    super.t_();
    if ((C) && (!bk))
    {
      int ☃ = cm();
      for (int ☃ = 0; ☃ < ☃ * 8; ☃++)
      {
        float ☃ = V.nextFloat() * 3.1415927F * 2.0F;
        float ☃ = V.nextFloat() * 0.5F + 0.5F;
        float ☃ = ns.a(☃) * ☃ * 0.5F * ☃;
        float ☃ = ns.b(☃) * ☃ * 0.5F * ☃;
        o.a(n(), s + ☃, aRb, u + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      }
      if (cl()) {
        a(ck(), bB(), ((V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F) / 0.8F);
      }
      a = -0.5F;
    }
    else if ((!C) && (bk))
    {
      a = 1.0F;
    }
    bk = C;
    ch();
  }
  
  protected void ch()
  {
    a *= 0.6F;
  }
  
  protected int cg()
  {
    return V.nextInt(20) + 10;
  }
  
  protected wb cf()
  {
    return new wb(o);
  }
  
  public void i(int ☃)
  {
    if (☃ == 16)
    {
      int ☃ = cm();
      a(0.51000005F * ☃, 0.51000005F * ☃);
      y = aK;
      aI = aK;
      if ((V()) && 
        (V.nextInt(20) == 0)) {
        X();
      }
    }
    super.i(☃);
  }
  
  public void J()
  {
    int ☃ = cm();
    if ((!o.D) && (☃ > 1) && (bn() <= 0.0F))
    {
      int ☃ = 2 + V.nextInt(3);
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        float ☃ = (☃ % 2 - 0.5F) * ☃ / 4.0F;
        float ☃ = (☃ / 2 - 0.5F) * ☃ / 4.0F;
        wb ☃ = cf();
        if (l_()) {
          ☃.a(aM());
        }
        if (bZ()) {
          ☃.bX();
        }
        ☃.a(☃ / 2);
        ☃.b(s + ☃, t + 0.5D, u + ☃, V.nextFloat() * 360.0F, 0.0F);
        o.d(☃);
      }
    }
    super.J();
  }
  
  public void i(pk ☃)
  {
    super.i(☃);
    if (((☃ instanceof ty)) && (ci())) {
      e((pr)☃);
    }
  }
  
  public void d(wn ☃)
  {
    if (ci()) {
      e(☃);
    }
  }
  
  protected void e(pr ☃)
  {
    int ☃ = cm();
    if ((t(☃)) && (h(☃) < 0.6D * ☃ * (0.6D * ☃)) && 
      (☃.a(ow.a(this), cj())))
    {
      a("mob.attack", 1.0F, (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F);
      a(this, ☃);
    }
  }
  
  public float aS()
  {
    return 0.625F * K;
  }
  
  protected boolean ci()
  {
    return cm() > 1;
  }
  
  protected int cj()
  {
    return cm();
  }
  
  protected String bo()
  {
    return "mob.slime." + (cm() > 1 ? "big" : "small");
  }
  
  protected String bp()
  {
    return "mob.slime." + (cm() > 1 ? "big" : "small");
  }
  
  protected zw A()
  {
    if (cm() == 1) {
      return zy.aM;
    }
    return null;
  }
  
  public boolean bR()
  {
    cj ☃ = new cj(ns.c(s), 0, ns.c(u));
    amy ☃ = o.f(☃);
    if ((o.P().u() == adr.c) && (V.nextInt(4) != 1)) {
      return false;
    }
    if (o.aa() != oj.a)
    {
      ady ☃ = o.b(☃);
      if ((☃ == ady.v) && (t > 50.0D) && (t < 70.0D) && (V.nextFloat() < 0.5F) && 
        (V.nextFloat() < o.y()) && (o.l(new cj(this)) <= V.nextInt(8))) {
        return super.bR();
      }
      if ((V.nextInt(10) == 0) && (☃.a(987234911L).nextInt(10) == 0) && (t < 40.0D)) {
        return super.bR();
      }
    }
    return false;
  }
  
  protected float bB()
  {
    return 0.4F * cm();
  }
  
  public int bQ()
  {
    return 0;
  }
  
  protected boolean cn()
  {
    return cm() > 0;
  }
  
  protected boolean cl()
  {
    return cm() > 2;
  }
  
  protected void bF()
  {
    w = 0.41999998688697815D;
    ai = true;
  }
  
  public pu a(ok ☃, pu ☃)
  {
    int ☃ = V.nextInt(3);
    if ((☃ < 2) && (V.nextFloat() < 0.5F * ☃.c())) {
      ☃++;
    }
    int ☃ = 1 << ☃;
    a(☃);
    
    return super.a(☃, ☃);
  }
  
  static class d
    extends qq
  {
    private float g;
    private int h;
    private wb i;
    private boolean j;
    
    public d(wb ☃)
    {
      super();
      i = ☃;
    }
    
    public void a(float ☃, boolean ☃)
    {
      g = ☃;
      j = ☃;
    }
    
    public void a(double ☃)
    {
      e = ☃;
      f = true;
    }
    
    public void c()
    {
      a.y = a(a.y, g, 30.0F);
      a.aK = a.y;
      a.aI = a.y;
      if (!f)
      {
        a.n(0.0F);
        return;
      }
      f = false;
      if (a.C)
      {
        a.k((float)(e * a.a(vy.d).e()));
        if (h-- <= 0)
        {
          h = i.cg();
          if (j) {
            h /= 3;
          }
          i.r().a();
          if (i.cn()) {
            i.a(i.ck(), i.bB(), ((i.bc().nextFloat() - i.bc().nextFloat()) * 0.2F + 1.0F) * 0.8F);
          }
        }
        else
        {
          i.aZ = (i.ba = 0.0F);
          a.k(0.0F);
        }
      }
      else
      {
        a.k((float)(e * a.a(vy.d).e()));
      }
    }
  }
  
  static class a
    extends rd
  {
    private wb a;
    private int b;
    
    public a(wb ☃)
    {
      a = ☃;
      a(2);
    }
    
    public boolean a()
    {
      pr ☃ = a.u();
      if (☃ == null) {
        return false;
      }
      if (!☃.ai()) {
        return false;
      }
      if (((☃ instanceof wn)) && (bA.a)) {
        return false;
      }
      return true;
    }
    
    public void c()
    {
      b = 300;
      super.c();
    }
    
    public boolean b()
    {
      pr ☃ = a.u();
      if (☃ == null) {
        return false;
      }
      if (!☃.ai()) {
        return false;
      }
      if (((☃ instanceof wn)) && (bA.a)) {
        return false;
      }
      if (--b <= 0) {
        return false;
      }
      return true;
    }
    
    public void e()
    {
      a.a(a.u(), 10.0F, 10.0F);
      ((wb.d)a.q()).a(a.y, a.ci());
    }
  }
  
  static class e
    extends rd
  {
    private wb a;
    private float b;
    private int c;
    
    public e(wb ☃)
    {
      a = ☃;
      a(2);
    }
    
    public boolean a()
    {
      return (a.u() == null) && ((a.C) || (a.V()) || (a.ab()));
    }
    
    public void e()
    {
      if (--c <= 0)
      {
        c = (40 + a.bc().nextInt(60));
        b = a.bc().nextInt(360);
      }
      ((wb.d)a.q()).a(b, false);
    }
  }
  
  static class b
    extends rd
  {
    private wb a;
    
    public b(wb ☃)
    {
      a = ☃;
      a(5);
      ((sv)☃.s()).d(true);
    }
    
    public boolean a()
    {
      return (a.V()) || (a.ab());
    }
    
    public void e()
    {
      if (a.bc().nextFloat() < 0.8F) {
        a.r().a();
      }
      ((wb.d)a.q()).a(1.2D);
    }
  }
  
  static class c
    extends rd
  {
    private wb a;
    
    public c(wb ☃)
    {
      a = ☃;
      a(5);
    }
    
    public boolean a()
    {
      return true;
    }
    
    public void e()
    {
      ((wb.d)a.q()).a(1.0D);
    }
  }
}
