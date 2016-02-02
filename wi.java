import java.util.Random;
import java.util.UUID;

public class wi
  extends ph
  implements acy, wh
{
  private int bn;
  private boolean bo;
  private boolean bp;
  tf bm;
  private wn bq;
  private ada br;
  private int bs;
  private boolean bt;
  private boolean bu;
  private int bv;
  private String bw;
  private int bx;
  private int by;
  private boolean bz;
  private boolean bA;
  private oq bB = new oq("Items", false, 8);
  
  public wi(adm ☃)
  {
    this(☃, 0);
  }
  
  public wi(adm ☃, int ☃)
  {
    super(☃);
    r(☃);
    a(0.6F, 1.8F);
    
    ((sv)s()).b(true);
    ((sv)s()).a(true);
    
    this.i.a(0, new ra(this));
    this.i.a(1, new qs(this, we.class, 8.0F, 0.6D, 0.6D));
    this.i.a(1, new si(this));
    this.i.a(1, new rj(this));
    this.i.a(2, new rm(this));
    this.i.a(3, new sb(this));
    this.i.a(4, new ru(this, true));
    this.i.a(5, new rp(this, 0.6D));
    this.i.a(6, new rk(this));
    this.i.a(7, new sg(this));
    this.i.a(9, new rg(this, wn.class, 3.0F, 1.0F));
    this.i.a(9, new sj(this));
    this.i.a(9, new rz(this, 0.6D));
    this.i.a(10, new ri(this, ps.class, 8.0F));
    
    j(true);
  }
  
  private void cv()
  {
    if (this.bA) {
      return;
    }
    this.bA = true;
    if (j_()) {
      this.i.a(8, new rw(this, 0.32D));
    } else if (cl() == 0) {
      this.i.a(6, new rf(this, 0.6D));
    }
  }
  
  protected void n()
  {
    if (cl() == 0) {
      this.i.a(8, new rf(this, 0.6D));
    }
    super.n();
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.d).a(0.5D);
  }
  
  protected void E()
  {
    if (--this.bn <= 0)
    {
      cj ☃ = new cj(this);
      this.o.ae().a(☃);
      this.bn = (70 + this.V.nextInt(50));
      
      this.bm = this.o.ae().a(☃, 32);
      if (this.bm == null)
      {
        cj();
      }
      else
      {
        cj ☃ = this.bm.a();
        a(☃, (int)(this.bm.b() * 1.0F));
        if (this.bz)
        {
          this.bz = false;
          this.bm.b(5);
        }
      }
    }
    if ((!co()) && (this.bs > 0))
    {
      this.bs -= 1;
      if (this.bs <= 0)
      {
        if (this.bt)
        {
          for (acz ☃ : this.br) {
            if (☃.h()) {
              ☃.a(this.V.nextInt(6) + this.V.nextInt(6) + 2);
            }
          }
          cw();
          this.bt = false;
          if ((this.bm != null) && (this.bw != null))
          {
            this.o.a(this, (byte)14);
            this.bm.a(this.bw, 1);
          }
        }
        c(new pf(pe.l.H, 200, 0));
      }
    }
    super.E();
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = ☃.bi.h();
    boolean ☃ = (☃ != null) && (☃.b() == zy.bJ);
    if ((!☃) && (ai()) && (!co()) && (!j_()))
    {
      if ((!this.o.D) && ((this.br == null) || (this.br.size() > 0)))
      {
        a_(☃);
        ☃.a(this);
      }
      ☃.b(na.F);
      return true;
    }
    return super.a(☃);
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(16, Integer.valueOf(0));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Profession", cl());
    ☃.a("Riches", this.bv);
    ☃.a("Career", this.bx);
    ☃.a("CareerLevel", this.by);
    ☃.a("Willing", this.bu);
    if (this.br != null) {
      ☃.a("Offers", this.br.a());
    }
    du ☃ = new du();
    for (int ☃ = 0; ☃ < this.bB.o_(); ☃++)
    {
      zx ☃ = this.bB.a(☃);
      if (☃ != null) {
        ☃.a(☃.b(new dn()));
      }
    }
    ☃.a("Inventory", ☃);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    r(☃.f("Profession"));
    this.bv = ☃.f("Riches");
    this.bx = ☃.f("Career");
    this.by = ☃.f("CareerLevel");
    this.bu = ☃.n("Willing");
    if (☃.b("Offers", 10))
    {
      dn ☃ = ☃.m("Offers");
      this.br = new ada(☃);
    }
    du ☃ = ☃.c("Inventory", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      zx ☃ = zx.a(☃.b(☃));
      if (☃ != null) {
        this.bB.a(☃);
      }
    }
    j(true);
    cv();
  }
  
  protected boolean C()
  {
    return false;
  }
  
  protected String z()
  {
    if (co()) {
      return "mob.villager.haggle";
    }
    return "mob.villager.idle";
  }
  
  protected String bo()
  {
    return "mob.villager.hit";
  }
  
  protected String bp()
  {
    return "mob.villager.death";
  }
  
  public void r(int ☃)
  {
    this.ac.b(16, Integer.valueOf(☃));
  }
  
  public int cl()
  {
    return Math.max(this.ac.c(16) % 5, 0);
  }
  
  public boolean cm()
  {
    return this.bo;
  }
  
  public void l(boolean ☃)
  {
    this.bo = ☃;
  }
  
  public void m(boolean ☃)
  {
    this.bp = ☃;
  }
  
  public boolean cn()
  {
    return this.bp;
  }
  
  public void b(pr ☃)
  {
    super.b(☃);
    if ((this.bm != null) && (☃ != null))
    {
      this.bm.a(☃);
      if ((☃ instanceof wn))
      {
        int ☃ = -1;
        if (j_()) {
          ☃ = -3;
        }
        this.bm.a(☃.e_(), ☃);
        if (ai()) {
          this.o.a(this, (byte)13);
        }
      }
    }
  }
  
  public void a(ow ☃)
  {
    if (this.bm != null)
    {
      pk ☃ = ☃.j();
      if (☃ != null)
      {
        if ((☃ instanceof wn)) {
          this.bm.a(☃.e_(), -2);
        } else if ((☃ instanceof vq)) {
          this.bm.h();
        }
      }
      else
      {
        wn ☃ = this.o.a(this, 16.0D);
        if (☃ != null) {
          this.bm.h();
        }
      }
    }
    super.a(☃);
  }
  
  public void a_(wn ☃)
  {
    this.bq = ☃;
  }
  
  public wn v_()
  {
    return this.bq;
  }
  
  public boolean co()
  {
    return this.bq != null;
  }
  
  public boolean n(boolean ☃)
  {
    if ((!this.bu) && (☃) && (cr()))
    {
      boolean ☃ = false;
      for (int ☃ = 0; ☃ < this.bB.o_(); ☃++)
      {
        zx ☃ = this.bB.a(☃);
        if (☃ != null) {
          if ((☃.b() == zy.P) && (☃.b >= 3))
          {
            ☃ = true;
            this.bB.a(☃, 3);
          }
          else if (((☃.b() == zy.bS) || (☃.b() == zy.bR)) && (☃.b >= 12))
          {
            ☃ = true;
            this.bB.a(☃, 12);
          }
        }
        if (☃)
        {
          this.o.a(this, (byte)18);
          this.bu = true;
          break;
        }
      }
    }
    return this.bu;
  }
  
  public void o(boolean ☃)
  {
    this.bu = ☃;
  }
  
  public void a(acz ☃)
  {
    ☃.g();
    this.a_ = (-w());
    a("mob.villager.yes", bB(), bC());
    
    int ☃ = 3 + this.V.nextInt(4);
    if ((☃.e() == 1) || (this.V.nextInt(5) == 0))
    {
      this.bs = 40;
      this.bt = true;
      this.bu = true;
      if (this.bq != null) {
        this.bw = this.bq.e_();
      } else {
        this.bw = null;
      }
      ☃ += 5;
    }
    if (☃.a().b() == zy.bO) {
      this.bv += ☃.a().b;
    }
    if (☃.j()) {
      this.o.d(new pp(this.o, this.s, this.t + 0.5D, this.u, ☃));
    }
  }
  
  public void a_(zx ☃)
  {
    if ((!this.o.D) && (this.a_ > -w() + 20))
    {
      this.a_ = (-w());
      if (☃ != null) {
        a("mob.villager.yes", bB(), bC());
      } else {
        a("mob.villager.no", bB(), bC());
      }
    }
  }
  
  public ada b_(wn ☃)
  {
    if (this.br == null) {
      cw();
    }
    return this.br;
  }
  
  private void cw()
  {
    wi.f[][][] ☃ = bC[cl()];
    if ((this.bx == 0) || (this.by == 0))
    {
      this.bx = (this.V.nextInt(☃.length) + 1);
      this.by = 1;
    }
    else
    {
      this.by += 1;
    }
    if (this.br == null) {
      this.br = new ada();
    }
    int ☃ = this.bx - 1;
    int ☃ = this.by - 1;
    
    wi.f[][] ☃ = ☃[☃];
    if ((☃ >= 0) && (☃ < ☃.length))
    {
      wi.f[] ☃ = ☃[☃];
      for (wi.f ☃ : ☃) {
        ☃.a(this.br, this.V);
      }
    }
  }
  
  public void a(ada ☃) {}
  
  public eu f_()
  {
    String ☃ = aM();
    if ((☃ != null) && (☃.length() > 0))
    {
      fa ☃ = new fa(☃);
      ☃.b().a(aQ());
      ☃.b().a(aK().toString());
      return ☃;
    }
    if (this.br == null) {
      cw();
    }
    String ☃ = null;
    switch (cl())
    {
    case 0: 
      if (this.bx == 1) {
        ☃ = "farmer";
      } else if (this.bx == 2) {
        ☃ = "fisherman";
      } else if (this.bx == 3) {
        ☃ = "shepherd";
      } else if (this.bx == 4) {
        ☃ = "fletcher";
      }
      break;
    case 1: 
      ☃ = "librarian";
      
      break;
    case 2: 
      ☃ = "cleric";
      
      break;
    case 3: 
      if (this.bx == 1) {
        ☃ = "armor";
      } else if (this.bx == 2) {
        ☃ = "weapon";
      } else if (this.bx == 3) {
        ☃ = "tool";
      }
      break;
    case 4: 
      if (this.bx == 1) {
        ☃ = "butcher";
      } else if (this.bx == 2) {
        ☃ = "leather";
      }
      break;
    }
    if (☃ != null)
    {
      fb ☃ = new fb("entity.Villager." + ☃, new Object[0]);
      ☃.b().a(aQ());
      ☃.b().a(aK().toString());
      return ☃;
    }
    return super.f_();
  }
  
  public float aS()
  {
    float ☃ = 1.62F;
    if (j_()) {
      ☃ = (float)(☃ - 0.81D);
    }
    return ☃;
  }
  
  private static final wi.f[][][][] bC = { { { { new wi.a(zy.O, new wi.g(18, 22)), new wi.a(zy.bS, new wi.g(15, 19)), new wi.a(zy.bR, new wi.g(15, 19)), new wi.e(zy.P, new wi.g(-4, -2)) }, { new wi.a(zw.a(afi.aU), new wi.g(8, 13)), new wi.e(zy.ca, new wi.g(-3, -2)) }, { new wi.a(zw.a(afi.bk), new wi.g(7, 12)), new wi.e(zy.e, new wi.g(-5, -7)) }, { new wi.e(zy.bc, new wi.g(-6, -10)), new wi.e(zy.aZ, new wi.g(1, 1)) } }, { { new wi.a(zy.F, new wi.g(15, 20)), new wi.a(zy.h, new wi.g(16, 24)), new wi.d(zy.aU, new wi.g(6, 6), zy.aV, new wi.g(6, 6)) }, { new wi.c(zy.aR, new wi.g(7, 8)) } }, { { new wi.a(zw.a(afi.L), new wi.g(16, 22)), new wi.e(zy.be, new wi.g(3, 4)) }, { new wi.e(new zx(zw.a(afi.L), 1, 0), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 1), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 2), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 3), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 4), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 5), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 6), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 7), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 8), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 9), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 10), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 11), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 12), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 13), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 14), new wi.g(1, 2)), new wi.e(new zx(zw.a(afi.L), 1, 15), new wi.g(1, 2)) } }, { { new wi.a(zy.F, new wi.g(15, 20)), new wi.e(zy.g, new wi.g(-12, -8)) }, { new wi.e(zy.f, new wi.g(2, 3)), new wi.d(zw.a(afi.n), new wi.g(10, 10), zy.ak, new wi.g(6, 10)) } } }, { { { new wi.a(zy.aK, new wi.g(24, 36)), new wi.b() }, { new wi.a(zy.aL, new wi.g(8, 10)), new wi.e(zy.aQ, new wi.g(10, 12)), new wi.e(zw.a(afi.X), new wi.g(3, 4)) }, { new wi.a(zy.bN, new wi.g(2, 2)), new wi.e(zy.aS, new wi.g(10, 12)), new wi.e(zw.a(afi.w), new wi.g(-5, -3)) }, { new wi.b() }, { new wi.b() }, { new wi.e(zy.co, new wi.g(20, 22)) } } }, { { { new wi.a(zy.bt, new wi.g(36, 40)), new wi.a(zy.k, new wi.g(8, 10)) }, { new wi.e(zy.aC, new wi.g(-4, -1)), new wi.e(new zx(zy.aW, 1, zd.l.b()), new wi.g(-2, -1)) }, { new wi.e(zy.bH, new wi.g(7, 11)), new wi.e(zw.a(afi.aX), new wi.g(-3, -1)) }, { new wi.e(zy.bK, new wi.g(3, 11)) } } }, { { { new wi.a(zy.h, new wi.g(16, 24)), new wi.e(zy.Y, new wi.g(4, 6)) }, { new wi.a(zy.j, new wi.g(7, 9)), new wi.e(zy.Z, new wi.g(10, 14)) }, { new wi.a(zy.i, new wi.g(3, 4)), new wi.c(zy.ad, new wi.g(16, 19)) }, { new wi.e(zy.X, new wi.g(5, 7)), new wi.e(zy.W, new wi.g(9, 11)), new wi.e(zy.U, new wi.g(5, 7)), new wi.e(zy.V, new wi.g(11, 15)) } }, { { new wi.a(zy.h, new wi.g(16, 24)), new wi.e(zy.c, new wi.g(6, 8)) }, { new wi.a(zy.j, new wi.g(7, 9)), new wi.c(zy.l, new wi.g(9, 10)) }, { new wi.a(zy.i, new wi.g(3, 4)), new wi.c(zy.u, new wi.g(12, 15)), new wi.c(zy.x, new wi.g(9, 12)) } }, { { new wi.a(zy.h, new wi.g(16, 24)), new wi.c(zy.a, new wi.g(5, 7)) }, { new wi.a(zy.j, new wi.g(7, 9)), new wi.c(zy.b, new wi.g(9, 11)) }, { new wi.a(zy.i, new wi.g(3, 4)), new wi.c(zy.w, new wi.g(12, 15)) } } }, { { { new wi.a(zy.al, new wi.g(14, 18)), new wi.a(zy.bk, new wi.g(14, 18)) }, { new wi.a(zy.h, new wi.g(16, 24)), new wi.e(zy.am, new wi.g(-7, -5)), new wi.e(zy.bl, new wi.g(-8, -6)) } }, { { new wi.a(zy.aF, new wi.g(9, 12)), new wi.e(zy.S, new wi.g(2, 4)) }, { new wi.c(zy.R, new wi.g(7, 12)) }, { new wi.e(zy.aA, new wi.g(8, 10)) } } } };
  
  static class g
    extends nz<Integer, Integer>
  {
    public g(int ☃, int ☃)
    {
      super(Integer.valueOf(☃));
    }
    
    public int a(Random ☃)
    {
      if (((Integer)a()).intValue() >= ((Integer)b()).intValue()) {
        return ((Integer)a()).intValue();
      }
      return ((Integer)a()).intValue() + ☃.nextInt(((Integer)b()).intValue() - ((Integer)a()).intValue() + 1);
    }
  }
  
  static abstract interface f
  {
    public abstract void a(ada paramada, Random paramRandom);
  }
  
  static class a
    implements wi.f
  {
    public zw a;
    public wi.g b;
    
    public a(zw ☃, wi.g ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
    
    public void a(ada ☃, Random ☃)
    {
      int ☃ = 1;
      if (this.b != null) {
        ☃ = this.b.a(☃);
      }
      ☃.add(new acz(new zx(this.a, ☃, 0), zy.bO));
    }
  }
  
  static class e
    implements wi.f
  {
    public zx a;
    public wi.g b;
    
    public e(zw ☃, wi.g ☃)
    {
      this.a = new zx(☃);
      this.b = ☃;
    }
    
    public e(zx ☃, wi.g ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
    
    public void a(ada ☃, Random ☃)
    {
      int ☃ = 1;
      if (this.b != null) {
        ☃ = this.b.a(☃);
      }
      zx ☃;
      zx ☃;
      zx ☃;
      if (☃ < 0)
      {
        zx ☃ = new zx(zy.bO, 1, 0);
        ☃ = new zx(this.a.b(), -☃, this.a.i());
      }
      else
      {
        ☃ = new zx(zy.bO, ☃, 0);
        ☃ = new zx(this.a.b(), 1, this.a.i());
      }
      ☃.add(new acz(☃, ☃));
    }
  }
  
  static class c
    implements wi.f
  {
    public zx a;
    public wi.g b;
    
    public c(zw ☃, wi.g ☃)
    {
      this.a = new zx(☃);
      this.b = ☃;
    }
    
    public void a(ada ☃, Random ☃)
    {
      int ☃ = 1;
      if (this.b != null) {
        ☃ = this.b.a(☃);
      }
      zx ☃ = new zx(zy.bO, ☃, 0);
      zx ☃ = new zx(this.a.b(), 1, this.a.i());
      ☃ = ack.a(☃, ☃, 5 + ☃.nextInt(15));
      
      ☃.add(new acz(☃, ☃));
    }
  }
  
  static class b
    implements wi.f
  {
    public void a(ada ☃, Random ☃)
    {
      aci ☃ = aci.b[☃.nextInt(aci.b.length)];
      int ☃ = ns.a(☃, ☃.e(), ☃.b());
      zx ☃ = zy.cd.a(new acl(☃, ☃));
      int ☃ = 2 + ☃.nextInt(5 + ☃ * 10) + 3 * ☃;
      if (☃ > 64) {
        ☃ = 64;
      }
      ☃.add(new acz(new zx(zy.aL), new zx(zy.bO, ☃), ☃));
    }
  }
  
  static class d
    implements wi.f
  {
    public zx a;
    public wi.g b;
    public zx c;
    public wi.g d;
    
    public d(zw ☃, wi.g ☃, zw ☃, wi.g ☃)
    {
      this.a = new zx(☃);
      this.b = ☃;
      this.c = new zx(☃);
      this.d = ☃;
    }
    
    public void a(ada ☃, Random ☃)
    {
      int ☃ = 1;
      if (this.b != null) {
        ☃ = this.b.a(☃);
      }
      int ☃ = 1;
      if (this.d != null) {
        ☃ = this.d.a(☃);
      }
      ☃.add(new acz(new zx(this.a.b(), ☃, this.a.i()), new zx(zy.bO), new zx(this.c.b(), ☃, this.c.i())));
    }
  }
  
  public void a(byte ☃)
  {
    if (☃ == 12) {
      a(cy.I);
    } else if (☃ == 13) {
      a(cy.u);
    } else if (☃ == 14) {
      a(cy.v);
    } else {
      super.a(☃);
    }
  }
  
  private void a(cy ☃)
  {
    for (int ☃ = 0; ☃ < 5; ☃++)
    {
      double ☃ = this.V.nextGaussian() * 0.02D;
      double ☃ = this.V.nextGaussian() * 0.02D;
      double ☃ = this.V.nextGaussian() * 0.02D;
      this.o.a(☃, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 1.0D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, ☃, ☃, ☃, new int[0]);
    }
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    
    r(this.o.s.nextInt(5));
    
    cv();
    
    return ☃;
  }
  
  public void cp()
  {
    this.bz = true;
  }
  
  public wi b(ph ☃)
  {
    wi ☃ = new wi(this.o);
    ☃.a(this.o.E(new cj(☃)), null);
    return ☃;
  }
  
  public boolean cb()
  {
    return false;
  }
  
  public void a(uv ☃)
  {
    if ((this.o.D) || (this.I)) {
      return;
    }
    wd ☃ = new wd(this.o);
    ☃.b(this.s, this.t, this.u, this.y, this.z);
    ☃.a(this.o.E(new cj(☃)), null);
    ☃.k(ce());
    if (l_())
    {
      ☃.a(aM());
      ☃.g(aN());
    }
    this.o.d(☃);
    J();
  }
  
  public oq cq()
  {
    return this.bB;
  }
  
  protected void a(uz ☃)
  {
    zx ☃ = ☃.l();
    zw ☃ = ☃.b();
    if (a(☃))
    {
      zx ☃ = this.bB.a(☃);
      if (☃ == null) {
        ☃.J();
      } else {
        ☃.b = ☃.b;
      }
    }
  }
  
  private boolean a(zw ☃)
  {
    return (☃ == zy.P) || (☃ == zy.bS) || (☃ == zy.bR) || (☃ == zy.O) || (☃ == zy.N);
  }
  
  public boolean cr()
  {
    return s(1);
  }
  
  public boolean cs()
  {
    return s(2);
  }
  
  public boolean ct()
  {
    boolean ☃ = cl() == 0;
    if (☃) {
      return !s(5);
    }
    return !s(1);
  }
  
  private boolean s(int ☃)
  {
    boolean ☃ = cl() == 0;
    for (int ☃ = 0; ☃ < this.bB.o_(); ☃++)
    {
      zx ☃ = this.bB.a(☃);
      if (☃ != null)
      {
        if (((☃.b() == zy.P) && (☃.b >= 3 * ☃)) || ((☃.b() == zy.bS) && (☃.b >= 12 * ☃)) || ((☃.b() == zy.bR) && (☃.b >= 12 * ☃))) {
          return true;
        }
        if ((☃) && 
          (☃.b() == zy.O) && (☃.b >= 9 * ☃)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean cu()
  {
    for (int ☃ = 0; ☃ < this.bB.o_(); ☃++)
    {
      zx ☃ = this.bB.a(☃);
      if ((☃ != null) && (
        (☃.b() == zy.N) || (☃.b() == zy.bS) || (☃.b() == zy.bR))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean d(int ☃, zx ☃)
  {
    if (super.d(☃, ☃)) {
      return true;
    }
    int ☃ = ☃ - 300;
    if ((☃ >= 0) && (☃ < this.bB.o_()))
    {
      this.bB.a(☃, ☃);
      return true;
    }
    return false;
  }
}
