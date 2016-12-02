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
    
    this.f = new wb.d(this);
    
    this.i.a(1, new wb.b(this));
    
    this.i.a(2, new wb.a(this));
    this.i.a(3, new wb.e(this));
    
    this.i.a(5, new wb.c(this));
    
    this.bi.a(1, new so(this));
    this.bi.a(3, new sn(this, ty.class));
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(16, Byte.valueOf((byte)1));
  }
  
  protected void a(int ☃)
  {
    this.ac.b(16, Byte.valueOf((byte)☃));
    a(0.51000005F * ☃, 0.51000005F * ☃);
    b(this.s, this.t, this.u);
    a(vy.a).a(☃ * ☃);
    a(vy.d).a(0.2F + 0.1F * ☃);
    i(bu());
    this.b_ = ☃;
  }
  
  public int cm()
  {
    return this.ac.a(16);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Size", cm() - 1);
    ☃.a("wasOnGround", this.bk);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    int ☃ = ☃.f("Size");
    if (☃ < 0) {
      ☃ = 0;
    }
    a(☃ + 1);
    this.bk = ☃.n("wasOnGround");
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
    if ((!this.o.D) && (this.o.aa() == oj.a) && (cm() > 0)) {
      this.I = true;
    }
    this.b += (this.a - this.b) * 0.5F;
    this.c = this.b;
    super.t_();
    if ((this.C) && (!this.bk))
    {
      int ☃ = cm();
      for (int ☃ = 0; ☃ < ☃ * 8; ☃++)
      {
        float ☃ = this.V.nextFloat() * 3.1415927F * 2.0F;
        float ☃ = this.V.nextFloat() * 0.5F + 0.5F;
        float ☃ = ns.a(☃) * ☃ * 0.5F * ☃;
        float ☃ = ns.b(☃) * ☃ * 0.5F * ☃;
        this.o.a(n(), this.s + ☃, aR().b, this.u + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      }
      if (cl()) {
        a(ck(), bB(), ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F) / 0.8F);
      }
      this.a = -0.5F;
    }
    else if ((!this.C) && (this.bk))
    {
      this.a = 1.0F;
    }
    this.bk = this.C;
    ch();
  }
  
  protected void ch()
  {
    this.a *= 0.6F;
  }
  
  protected int cg()
  {
    return this.V.nextInt(20) + 10;
  }
  
  protected wb cf()
  {
    return new wb(this.o);
  }
  
  public void i(int ☃)
  {
    if (☃ == 16)
    {
      int ☃ = cm();
      a(0.51000005F * ☃, 0.51000005F * ☃);
      this.y = this.aK;
      this.aI = this.aK;
      if ((V()) && 
        (this.V.nextInt(20) == 0)) {
        X();
      }
    }
    super.i(☃);
  }
  
  public void J()
  {
    int ☃ = cm();
    if ((!this.o.D) && (☃ > 1) && (bn() <= 0.0F))
    {
      int ☃ = 2 + this.V.nextInt(3);
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
        ☃.b(this.s + ☃, this.t + 0.5D, this.u + ☃, this.V.nextFloat() * 360.0F, 0.0F);
        this.o.d(☃);
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
      a("mob.attack", 1.0F, (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
      a(this, ☃);
    }
  }
  
  public float aS()
  {
    return 0.625F * this.K;
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
    cj ☃ = new cj(ns.c(this.s), 0, ns.c(this.u));
    amy ☃ = this.o.f(☃);
    if ((this.o.P().u() == adr.c) && (this.V.nextInt(4) != 1)) {
      return false;
    }
    if (this.o.aa() != oj.a)
    {
      ady ☃ = this.o.b(☃);
      if ((☃ == ady.v) && (this.t > 50.0D) && (this.t < 70.0D) && (this.V.nextFloat() < 0.5F) && 
        (this.V.nextFloat() < this.o.y()) && (this.o.l(new cj(this)) <= this.V.nextInt(8))) {
        return super.bR();
      }
      if ((this.V.nextInt(10) == 0) && (☃.a(987234911L).nextInt(10) == 0) && (this.t < 40.0D)) {
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
    this.w = 0.41999998688697815D;
    this.ai = true;
  }
  
  public pu a(ok ☃, pu ☃)
  {
    int ☃ = this.V.nextInt(3);
    if ((☃ < 2) && (this.V.nextFloat() < 0.5F * ☃.c())) {
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
      this.i = ☃;
    }
    
    public void a(float ☃, boolean ☃)
    {
      this.g = ☃;
      this.j = ☃;
    }
    
    public void a(double ☃)
    {
      this.e = ☃;
      this.f = true;
    }
    
    public void c()
    {
      this.a.y = a(this.a.y, this.g, 30.0F);
      this.a.aK = this.a.y;
      this.a.aI = this.a.y;
      if (!this.f)
      {
        this.a.n(0.0F);
        return;
      }
      this.f = false;
      if (this.a.C)
      {
        this.a.k((float)(this.e * this.a.a(vy.d).e()));
        if (this.h-- <= 0)
        {
          this.h = this.i.cg();
          if (this.j) {
            this.h /= 3;
          }
          this.i.r().a();
          if (this.i.cn()) {
            this.i.a(this.i.ck(), this.i.bB(), ((this.i.bc().nextFloat() - this.i.bc().nextFloat()) * 0.2F + 1.0F) * 0.8F);
          }
        }
        else
        {
          this.i.aZ = (this.i.ba = 0.0F);
          this.a.k(0.0F);
        }
      }
      else
      {
        this.a.k((float)(this.e * this.a.a(vy.d).e()));
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
      this.a = ☃;
      a(2);
    }
    
    public boolean a()
    {
      pr ☃ = this.a.u();
      if (☃ == null) {
        return false;
      }
      if (!☃.ai()) {
        return false;
      }
      if (((☃ instanceof wn)) && (((wn)☃).bA.a)) {
        return false;
      }
      return true;
    }
    
    public void c()
    {
      this.b = 300;
      super.c();
    }
    
    public boolean b()
    {
      pr ☃ = this.a.u();
      if (☃ == null) {
        return false;
      }
      if (!☃.ai()) {
        return false;
      }
      if (((☃ instanceof wn)) && (((wn)☃).bA.a)) {
        return false;
      }
      if (--this.b <= 0) {
        return false;
      }
      return true;
    }
    
    public void e()
    {
      this.a.a(this.a.u(), 10.0F, 10.0F);
      ((wb.d)this.a.q()).a(this.a.y, this.a.ci());
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
      this.a = ☃;
      a(2);
    }
    
    public boolean a()
    {
      return (this.a.u() == null) && ((this.a.C) || (this.a.V()) || (this.a.ab()));
    }
    
    public void e()
    {
      if (--this.c <= 0)
      {
        this.c = (40 + this.a.bc().nextInt(60));
        this.b = this.a.bc().nextInt(360);
      }
      ((wb.d)this.a.q()).a(this.b, false);
    }
  }
  
  static class b
    extends rd
  {
    private wb a;
    
    public b(wb ☃)
    {
      this.a = ☃;
      a(5);
      ((sv)☃.s()).d(true);
    }
    
    public boolean a()
    {
      return (this.a.V()) || (this.a.ab());
    }
    
    public void e()
    {
      if (this.a.bc().nextFloat() < 0.8F) {
        this.a.r().a();
      }
      ((wb.d)this.a.q()).a(1.2D);
    }
  }
  
  static class c
    extends rd
  {
    private wb a;
    
    public c(wb ☃)
    {
      this.a = ☃;
      a(5);
    }
    
    public boolean a()
    {
      return true;
    }
    
    public void e()
    {
      ((wb.d)this.a.q()).a(1.0D);
    }
  }
}
