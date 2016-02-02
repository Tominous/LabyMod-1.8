import java.util.Random;

public class tu
  extends tm
{
  private tu.c<ua> bm;
  private int bo = 0;
  private int bp = 0;
  private boolean bq = false;
  private boolean br = false;
  private int bs = 0;
  private tu.b bt = tu.b.b;
  private int bu = 0;
  
  public tu(adm ☃)
  {
    super(☃);
    a(0.6F, 0.7F);
    
    this.g = new tu.e(this);
    
    this.f = new tu.f(this);
    
    ((sv)s()).a(true);
    this.h.a(2.5F);
    
    this.i.a(1, new ra(this));
    this.i.a(1, new tu.g(this, 1.33D));
    this.i.a(2, new sh(this, 1.0D, zy.bR, false));
    this.i.a(2, new sh(this, 1.0D, zy.bW, false));
    this.i.a(2, new sh(this, 1.0D, zw.a(afi.N), false));
    this.i.a(3, new qv(this, 0.8D));
    this.i.a(5, new tu.h(this));
    this.i.a(5, new rz(this, 0.6D));
    this.i.a(11, new ri(this, wn.class, 10.0F));
    
    this.bm = new tu.c(this, ua.class, 16.0F, 1.33D, 1.33D);
    
    this.i.a(4, this.bm);
    
    b(0.0D);
  }
  
  protected float bE()
  {
    if ((this.f.a()) && (this.f.e() > this.t + 0.5D)) {
      return 0.5F;
    }
    return this.bt.b();
  }
  
  public void a(tu.b ☃)
  {
    this.bt = ☃;
  }
  
  public float p(float ☃)
  {
    if (this.bp == 0) {
      return 0.0F;
    }
    return (this.bo + ☃) / this.bp;
  }
  
  public void b(double ☃)
  {
    s().a(☃);
    this.f.a(this.f.d(), this.f.e(), this.f.f(), ☃);
  }
  
  public void a(boolean ☃, tu.b ☃)
  {
    super.i(☃);
    if (!☃)
    {
      if (this.bt == tu.b.e) {
        this.bt = tu.b.b;
      }
    }
    else
    {
      b(1.5D * ☃.a());
      a(cm(), bB(), ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F) * 0.8F);
    }
    this.bq = ☃;
  }
  
  public void b(tu.b ☃)
  {
    a(true, ☃);
    this.bp = ☃.d();
    this.bo = 0;
  }
  
  public boolean cl()
  {
    return this.bq;
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(18, Byte.valueOf((byte)0));
  }
  
  private wn bv = null;
  
  public void E()
  {
    if (this.f.b() > 0.8D) {
      a(tu.b.d);
    } else if (this.bt != tu.b.e) {
      a(tu.b.b);
    }
    if (this.bs > 0) {
      this.bs -= 1;
    }
    if (this.bu > 0)
    {
      this.bu -= this.V.nextInt(3);
      if (this.bu < 0) {
        this.bu = 0;
      }
    }
    if (this.C)
    {
      if (!this.br)
      {
        a(false, tu.b.a);
        cw();
      }
      if ((cn() == 99) && (this.bs == 0))
      {
        pr ☃ = u();
        if ((☃ != null) && (h(☃) < 16.0D))
        {
          a(☃.s, ☃.u);
          this.f.a(☃.s, ☃.t, ☃.u, this.f.b());
          b(tu.b.e);
          this.br = true;
        }
      }
      tu.e ☃ = (tu.e)this.g;
      if (!☃.c())
      {
        if ((this.f.a()) && (this.bs == 0))
        {
          asx ☃ = this.h.j();
          aui ☃ = new aui(this.f.d(), this.f.e(), this.f.f());
          if ((☃ != null) && (☃.e() < ☃.d())) {
            ☃ = ☃.a(this);
          }
          a(☃.a, ☃.c);
          b(this.bt);
        }
      }
      else if (!☃.d()) {
        ct();
      }
    }
    this.br = this.C;
  }
  
  public void Y() {}
  
  private void a(double ☃, double ☃)
  {
    this.y = ((float)(ns.b(☃ - this.u, ☃ - this.s) * 180.0D / 3.1415927410125732D) - 90.0F);
  }
  
  private void ct()
  {
    ((tu.e)this.g).a(true);
  }
  
  private void cu()
  {
    ((tu.e)this.g).a(false);
  }
  
  private void cv()
  {
    this.bs = co();
  }
  
  private void cw()
  {
    cv();
    cu();
  }
  
  public void m()
  {
    super.m();
    if (this.bo != this.bp)
    {
      if ((this.bo == 0) && (!this.o.D)) {
        this.o.a(this, (byte)1);
      }
      this.bo += 1;
    }
    else if (this.bp != 0)
    {
      this.bo = 0;
      this.bp = 0;
    }
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
    a(vy.d).a(0.30000001192092896D);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("RabbitType", cn());
    ☃.a("MoreCarrotTicks", this.bu);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    r(☃.f("RabbitType"));
    this.bu = ☃.f("MoreCarrotTicks");
  }
  
  protected String cm()
  {
    return "mob.rabbit.hop";
  }
  
  protected String z()
  {
    return "mob.rabbit.idle";
  }
  
  protected String bo()
  {
    return "mob.rabbit.hurt";
  }
  
  protected String bp()
  {
    return "mob.rabbit.death";
  }
  
  public boolean r(pk ☃)
  {
    if (cn() == 99)
    {
      a("mob.attack", 1.0F, (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
      return ☃.a(ow.a(this), 8.0F);
    }
    return ☃.a(ow.a(this), 3.0F);
  }
  
  public int br()
  {
    if (cn() == 99) {
      return 8;
    }
    return super.br();
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    return super.a(☃, ☃);
  }
  
  protected void bq()
  {
    a(new zx(zy.br, 1), 0.0F);
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = this.V.nextInt(2) + this.V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.bs, 1);
    }
    ☃ = this.V.nextInt(2);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      if (at()) {
        a(zy.bp, 1);
      } else {
        a(zy.bo, 1);
      }
    }
  }
  
  private boolean a(zw ☃)
  {
    return (☃ == zy.bR) || (☃ == zy.bW) || (☃ == zw.a(afi.N));
  }
  
  public tu b(ph ☃)
  {
    tu ☃ = new tu(this.o);
    if ((☃ instanceof tu)) {
      ☃.r(this.V.nextBoolean() ? cn() : ((tu)☃).cn());
    }
    return ☃;
  }
  
  public boolean d(zx ☃)
  {
    return (☃ != null) && (a(☃.b()));
  }
  
  public int cn()
  {
    return this.ac.a(18);
  }
  
  public void r(int ☃)
  {
    if (☃ == 99)
    {
      this.i.a(this.bm);
      this.i.a(4, new tu.a(this));
      this.bi.a(1, new sm(this, false, new Class[0]));
      this.bi.a(2, new sp(this, wn.class, true));
      this.bi.a(2, new sp(this, ua.class, true));
      if (!l_()) {
        a(di.a("entity.KillerBunny.name"));
      }
    }
    this.ac.b(18, Byte.valueOf((byte)☃));
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    
    int ☃ = this.V.nextInt(6);
    boolean ☃ = false;
    if ((☃ instanceof tu.d))
    {
      ☃ = ((tu.d)☃).a;
      ☃ = true;
    }
    else
    {
      ☃ = new tu.d(☃);
    }
    r(☃);
    if (☃) {
      b(41536);
    }
    return ☃;
  }
  
  public static class d
    implements pu
  {
    public int a;
    
    public d(int ☃)
    {
      this.a = ☃;
    }
  }
  
  private boolean cx()
  {
    return this.bu == 0;
  }
  
  protected int co()
  {
    return this.bt.c();
  }
  
  protected void cp()
  {
    this.o.a(cy.M, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, 0.0D, 0.0D, 0.0D, new int[] { afh.f(afi.cb.a(7)) });
    this.bu = 100;
  }
  
  public void a(byte ☃)
  {
    if (☃ == 1)
    {
      Z();
      this.bp = 10;
      this.bo = 0;
    }
    else
    {
      super.a(☃);
    }
  }
  
  public class e
    extends qo
  {
    private tu c;
    private boolean d = false;
    
    public e(tu ☃)
    {
      super();
      this.c = ☃;
    }
    
    public boolean c()
    {
      return this.a;
    }
    
    public boolean d()
    {
      return this.d;
    }
    
    public void a(boolean ☃)
    {
      this.d = ☃;
    }
    
    public void b()
    {
      if (this.a)
      {
        this.c.b(tu.b.c);
        this.a = false;
      }
    }
  }
  
  static class f
    extends qq
  {
    private tu g;
    
    public f(tu ☃)
    {
      super();
      this.g = ☃;
    }
    
    public void c()
    {
      if ((this.g.C) && (!this.g.cl())) {
        this.g.b(0.0D);
      }
      super.c();
    }
  }
  
  static class c<T extends pk>
    extends qs<T>
  {
    private tu c;
    
    public c(tu ☃, Class<T> ☃, float ☃, double ☃, double ☃)
    {
      super(☃, ☃, ☃, ☃);
      this.c = ☃;
    }
    
    public void e()
    {
      super.e();
    }
  }
  
  static class h
    extends ro
  {
    private final tu c;
    private boolean d;
    private boolean e = false;
    
    public h(tu ☃)
    {
      super(0.699999988079071D, 16);
      this.c = ☃;
    }
    
    public boolean a()
    {
      if (this.a <= 0)
      {
        if (!this.c.o.Q().b("mobGriefing")) {
          return false;
        }
        this.e = false;
        this.d = tu.a(this.c);
      }
      return super.a();
    }
    
    public boolean b()
    {
      return (this.e) && (super.b());
    }
    
    public void c()
    {
      super.c();
    }
    
    public void d()
    {
      super.d();
    }
    
    public void e()
    {
      super.e();
      
      this.c.p().a(this.b.n() + 0.5D, this.b.o() + 1, this.b.p() + 0.5D, 10.0F, this.c.bQ());
      if (f())
      {
        adm ☃ = this.c.o;
        cj ☃ = this.b.a();
        
        alz ☃ = ☃.p(☃);
        afh ☃ = ☃.c();
        if ((this.e) && ((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7))
        {
          ☃.a(☃, afi.a.Q(), 2);
          ☃.b(☃, true);
          this.c.cp();
        }
        this.e = false;
        
        this.a = 10;
      }
    }
    
    protected boolean a(adm ☃, cj ☃)
    {
      afh ☃ = ☃.p(☃).c();
      if (☃ == afi.ak)
      {
        ☃ = ☃.a();
        alz ☃ = ☃.p(☃);
        ☃ = ☃.c();
        if (((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7) && (this.d) && (!this.e))
        {
          this.e = true;
          return true;
        }
      }
      return false;
    }
  }
  
  static class g
    extends rv
  {
    private tu b;
    
    public g(tu ☃, double ☃)
    {
      super(☃);
      this.b = ☃;
    }
    
    public void e()
    {
      super.e();
      
      this.b.b(this.a);
    }
  }
  
  static class a
    extends rl
  {
    public a(tu ☃)
    {
      super(pr.class, 1.4D, true);
    }
    
    protected double a(pr ☃)
    {
      return 4.0F + ☃.J;
    }
  }
  
  static enum b
  {
    private final float f;
    private final float g;
    private final int h;
    private final int i;
    
    private b(float ☃, float ☃, int ☃, int ☃)
    {
      this.f = ☃;
      this.g = ☃;
      this.h = ☃;
      this.i = ☃;
    }
    
    public float a()
    {
      return this.f;
    }
    
    public float b()
    {
      return this.g;
    }
    
    public int c()
    {
      return this.h;
    }
    
    public int d()
    {
      return this.i;
    }
  }
}
