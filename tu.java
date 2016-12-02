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
    
    g = new tu.e(this);
    
    f = new tu.f(this);
    
    ((sv)s()).a(true);
    h.a(2.5F);
    
    i.a(1, new ra(this));
    i.a(1, new tu.g(this, 1.33D));
    i.a(2, new sh(this, 1.0D, zy.bR, false));
    i.a(2, new sh(this, 1.0D, zy.bW, false));
    i.a(2, new sh(this, 1.0D, zw.a(afi.N), false));
    i.a(3, new qv(this, 0.8D));
    i.a(5, new tu.h(this));
    i.a(5, new rz(this, 0.6D));
    i.a(11, new ri(this, wn.class, 10.0F));
    
    bm = new tu.c(this, ua.class, 16.0F, 1.33D, 1.33D);
    
    i.a(4, bm);
    
    b(0.0D);
  }
  
  protected float bE()
  {
    if ((f.a()) && (f.e() > t + 0.5D)) {
      return 0.5F;
    }
    return bt.b();
  }
  
  public void a(tu.b ☃)
  {
    bt = ☃;
  }
  
  public float p(float ☃)
  {
    if (bp == 0) {
      return 0.0F;
    }
    return (bo + ☃) / bp;
  }
  
  public void b(double ☃)
  {
    s().a(☃);
    f.a(f.d(), f.e(), f.f(), ☃);
  }
  
  public void a(boolean ☃, tu.b ☃)
  {
    super.i(☃);
    if (!☃)
    {
      if (bt == tu.b.e) {
        bt = tu.b.b;
      }
    }
    else
    {
      b(1.5D * ☃.a());
      a(cm(), bB(), ((V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F) * 0.8F);
    }
    bq = ☃;
  }
  
  public void b(tu.b ☃)
  {
    a(true, ☃);
    bp = ☃.d();
    bo = 0;
  }
  
  public boolean cl()
  {
    return bq;
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(18, Byte.valueOf((byte)0));
  }
  
  private wn bv = null;
  
  public void E()
  {
    if (f.b() > 0.8D) {
      a(tu.b.d);
    } else if (bt != tu.b.e) {
      a(tu.b.b);
    }
    if (bs > 0) {
      bs -= 1;
    }
    if (bu > 0)
    {
      bu -= V.nextInt(3);
      if (bu < 0) {
        bu = 0;
      }
    }
    if (C)
    {
      if (!br)
      {
        a(false, tu.b.a);
        cw();
      }
      if ((cn() == 99) && (bs == 0))
      {
        pr ☃ = u();
        if ((☃ != null) && (h(☃) < 16.0D))
        {
          a(s, u);
          f.a(s, t, u, f.b());
          b(tu.b.e);
          br = true;
        }
      }
      tu.e ☃ = (tu.e)g;
      if (!☃.c())
      {
        if ((f.a()) && (bs == 0))
        {
          asx ☃ = h.j();
          aui ☃ = new aui(f.d(), f.e(), f.f());
          if ((☃ != null) && (☃.e() < ☃.d())) {
            ☃ = ☃.a(this);
          }
          a(a, c);
          b(bt);
        }
      }
      else if (!☃.d()) {
        ct();
      }
    }
    br = C;
  }
  
  public void Y() {}
  
  private void a(double ☃, double ☃)
  {
    y = ((float)(ns.b(☃ - u, ☃ - s) * 180.0D / 3.1415927410125732D) - 90.0F);
  }
  
  private void ct()
  {
    ((tu.e)g).a(true);
  }
  
  private void cu()
  {
    ((tu.e)g).a(false);
  }
  
  private void cv()
  {
    bs = co();
  }
  
  private void cw()
  {
    cv();
    cu();
  }
  
  public void m()
  {
    super.m();
    if (bo != bp)
    {
      if ((bo == 0) && (!o.D)) {
        o.a(this, (byte)1);
      }
      bo += 1;
    }
    else if (bp != 0)
    {
      bo = 0;
      bp = 0;
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
    ☃.a("MoreCarrotTicks", bu);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    r(☃.f("RabbitType"));
    bu = ☃.f("MoreCarrotTicks");
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
      a("mob.attack", 1.0F, (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F);
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
    int ☃ = V.nextInt(2) + V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.bs, 1);
    }
    ☃ = V.nextInt(2);
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
    tu ☃ = new tu(o);
    if ((☃ instanceof tu)) {
      ☃.r(V.nextBoolean() ? cn() : ((tu)☃).cn());
    }
    return ☃;
  }
  
  public boolean d(zx ☃)
  {
    return (☃ != null) && (a(☃.b()));
  }
  
  public int cn()
  {
    return ac.a(18);
  }
  
  public void r(int ☃)
  {
    if (☃ == 99)
    {
      i.a(bm);
      i.a(4, new tu.a(this));
      bi.a(1, new sm(this, false, new Class[0]));
      bi.a(2, new sp(this, wn.class, true));
      bi.a(2, new sp(this, ua.class, true));
      if (!l_()) {
        a(di.a("entity.KillerBunny.name"));
      }
    }
    ac.b(18, Byte.valueOf((byte)☃));
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    
    int ☃ = V.nextInt(6);
    boolean ☃ = false;
    if ((☃ instanceof tu.d))
    {
      ☃ = a;
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
      a = ☃;
    }
  }
  
  private boolean cx()
  {
    return bu == 0;
  }
  
  protected int co()
  {
    return bt.c();
  }
  
  protected void cp()
  {
    o.a(cy.M, s + V.nextFloat() * J * 2.0F - J, t + 0.5D + V.nextFloat() * K, u + V.nextFloat() * J * 2.0F - J, 0.0D, 0.0D, 0.0D, new int[] { afh.f(afi.cb.a(7)) });
    bu = 100;
  }
  
  public void a(byte ☃)
  {
    if (☃ == 1)
    {
      Z();
      bp = 10;
      bo = 0;
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
      c = ☃;
    }
    
    public boolean c()
    {
      return a;
    }
    
    public boolean d()
    {
      return d;
    }
    
    public void a(boolean ☃)
    {
      d = ☃;
    }
    
    public void b()
    {
      if (a)
      {
        c.b(tu.b.c);
        a = false;
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
      g = ☃;
    }
    
    public void c()
    {
      if ((g.C) && (!g.cl())) {
        g.b(0.0D);
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
      c = ☃;
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
      c = ☃;
    }
    
    public boolean a()
    {
      if (a <= 0)
      {
        if (!c.o.Q().b("mobGriefing")) {
          return false;
        }
        e = false;
        d = tu.a(c);
      }
      return super.a();
    }
    
    public boolean b()
    {
      return (e) && (super.b());
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
      
      c.p().a(b.n() + 0.5D, b.o() + 1, b.p() + 0.5D, 10.0F, c.bQ());
      if (f())
      {
        adm ☃ = c.o;
        cj ☃ = b.a();
        
        alz ☃ = ☃.p(☃);
        afh ☃ = ☃.c();
        if ((e) && ((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7))
        {
          ☃.a(☃, afi.a.Q(), 2);
          ☃.b(☃, true);
          c.cp();
        }
        e = false;
        
        a = 10;
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
        if (((☃ instanceof afq)) && (((Integer)☃.b(afq.a)).intValue() == 7) && (d) && (!e))
        {
          e = true;
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
      b = ☃;
    }
    
    public void e()
    {
      super.e();
      
      b.b(a);
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
      return 4.0F + J;
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
      f = ☃;
      g = ☃;
      h = ☃;
      i = ☃;
    }
    
    public float a()
    {
      return f;
    }
    
    public float b()
    {
      return g;
    }
    
    public int c()
    {
      return h;
    }
    
    public int d()
    {
      return i;
    }
  }
}
