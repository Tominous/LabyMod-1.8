import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class we
  extends vv
{
  protected static final qb a = new qj(null, "zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D).a("Spawn Reinforcements Chance");
  private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
  private static final qd c = new qd(b, "Baby speed boost", 0.5D, 1);
  private final qu bm = new qu(this);
  private int bn;
  private boolean bo = false;
  
  public we(adm ☃)
  {
    super(☃);
    
    ((sv)s()).b(true);
    this.i.a(0, new ra(this));
    this.i.a(2, new rl(this, wn.class, 1.0D, false));
    this.i.a(5, new rp(this, 1.0D));
    this.i.a(7, new rz(this, 1.0D));
    this.i.a(8, new ri(this, wn.class, 8.0F));
    this.i.a(8, new ry(this));
    
    n();
    
    a(0.6F, 1.95F);
  }
  
  protected void n()
  {
    this.i.a(4, new rl(this, wi.class, 1.0D, true));
    this.i.a(4, new rl(this, ty.class, 1.0D, true));
    this.i.a(6, new rn(this, 1.0D, false));
    
    this.bi.a(1, new sm(this, true, new Class[] { vw.class }));
    this.bi.a(2, new sp(this, wn.class, true));
    this.bi.a(2, new sp(this, wi.class, false));
    this.bi.a(2, new sp(this, ty.class, true));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.b).a(35.0D);
    a(vy.d).a(0.23000000417232513D);
    a(vy.e).a(3.0D);
    
    by().b(a).a(this.V.nextDouble() * 0.10000000149011612D);
  }
  
  protected void h()
  {
    super.h();
    
    H().a(12, Byte.valueOf((byte)0));
    H().a(13, Byte.valueOf((byte)0));
    H().a(14, Byte.valueOf((byte)0));
  }
  
  public int br()
  {
    int ☃ = super.br() + 2;
    if (☃ > 20) {
      ☃ = 20;
    }
    return ☃;
  }
  
  public boolean cn()
  {
    return this.bo;
  }
  
  public void a(boolean ☃)
  {
    if (this.bo != ☃)
    {
      this.bo = ☃;
      if (☃) {
        this.i.a(1, this.bm);
      } else {
        this.i.a(this.bm);
      }
    }
  }
  
  public boolean j_()
  {
    return H().a(12) == 1;
  }
  
  protected int b(wn ☃)
  {
    if (j_()) {
      this.b_ = ((int)(this.b_ * 2.5F));
    }
    return super.b(☃);
  }
  
  public void l(boolean ☃)
  {
    H().b(12, Byte.valueOf((byte)(☃ ? 1 : 0)));
    if ((this.o != null) && (!this.o.D))
    {
      qc ☃ = a(vy.d);
      ☃.c(c);
      if (☃) {
        ☃.b(c);
      }
    }
    n(☃);
  }
  
  public boolean co()
  {
    return H().a(13) == 1;
  }
  
  public void m(boolean ☃)
  {
    H().b(13, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public void m()
  {
    if ((this.o.w()) && (!this.o.D) && (!j_()))
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
    if ((au()) && (u() != null) && ((this.m instanceof tn))) {
      ((ps)this.m).s().a(s().j(), 1.5D);
    }
    super.m();
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (super.a(☃, ☃))
    {
      pr ☃ = u();
      if ((☃ == null) && ((☃.j() instanceof pr))) {
        ☃ = (pr)☃.j();
      }
      if ((☃ != null) && (this.o.aa() == oj.d) && (this.V.nextFloat() < a(a).e()))
      {
        int ☃ = ns.c(this.s);
        int ☃ = ns.c(this.t);
        int ☃ = ns.c(this.u);
        we ☃ = new we(this.o);
        for (int ☃ = 0; ☃ < 50; ☃++)
        {
          int ☃ = ☃ + ns.a(this.V, 7, 40) * ns.a(this.V, -1, 1);
          int ☃ = ☃ + ns.a(this.V, 7, 40) * ns.a(this.V, -1, 1);
          int ☃ = ☃ + ns.a(this.V, 7, 40) * ns.a(this.V, -1, 1);
          if ((adm.a(this.o, new cj(☃, ☃ - 1, ☃))) && (this.o.l(new cj(☃, ☃, ☃)) < 10))
          {
            ☃.b(☃, ☃, ☃);
            if ((!this.o.b(☃, ☃, ☃, 7.0D)) && (this.o.a(☃.aR(), ☃)) && (this.o.a(☃, ☃.aR()).isEmpty()) && (!this.o.d(☃.aR())))
            {
              this.o.d(☃);
              ☃.d(☃);
              ☃.a(this.o.E(new cj(☃)), null);
              
              a(a).b(new qd("Zombie reinforcement caller charge", -0.05000000074505806D, 0));
              ☃.a(a).b(new qd("Zombie reinforcement callee charge", -0.05000000074505806D, 0));
              break;
            }
          }
        }
      }
      return true;
    }
    return false;
  }
  
  public void t_()
  {
    if ((!this.o.D) && (cp()))
    {
      int ☃ = cr();
      
      this.bn -= ☃;
      if (this.bn <= 0) {
        cq();
      }
    }
    super.t_();
  }
  
  public boolean r(pk ☃)
  {
    boolean ☃ = super.r(☃);
    if (☃)
    {
      int ☃ = this.o.aa().a();
      if ((bA() == null) && (at()) && (this.V.nextFloat() < ☃ * 0.3F)) {
        ☃.e(2 * ☃);
      }
    }
    return ☃;
  }
  
  protected String z()
  {
    return "mob.zombie.say";
  }
  
  protected String bo()
  {
    return "mob.zombie.hurt";
  }
  
  protected String bp()
  {
    return "mob.zombie.death";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.zombie.step", 0.15F, 1.0F);
  }
  
  protected zw A()
  {
    return zy.bt;
  }
  
  public pw bz()
  {
    return pw.b;
  }
  
  protected void bq()
  {
    switch (this.V.nextInt(3))
    {
    case 0: 
      a(zy.j, 1);
      break;
    case 1: 
      a(zy.bR, 1);
      break;
    case 2: 
      a(zy.bS, 1);
    }
  }
  
  protected void a(ok ☃)
  {
    super.a(☃);
    if (this.V.nextFloat() < (this.o.aa() == oj.d ? 0.05F : 0.01F))
    {
      int ☃ = this.V.nextInt(3);
      if (☃ == 0) {
        c(0, new zx(zy.l));
      } else {
        c(0, new zx(zy.a));
      }
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (j_()) {
      ☃.a("IsBaby", true);
    }
    if (co()) {
      ☃.a("IsVillager", true);
    }
    ☃.a("ConversionTime", cp() ? this.bn : -1);
    ☃.a("CanBreakDoors", cn());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.n("IsBaby")) {
      l(true);
    }
    if (☃.n("IsVillager")) {
      m(true);
    }
    if ((☃.b("ConversionTime", 99)) && (☃.f("ConversionTime") > -1)) {
      a(☃.f("ConversionTime"));
    }
    a(☃.n("CanBreakDoors"));
  }
  
  public void a(pr ☃)
  {
    super.a(☃);
    if (((this.o.aa() == oj.c) || (this.o.aa() == oj.d)) && ((☃ instanceof wi)))
    {
      if ((this.o.aa() != oj.d) && (this.V.nextBoolean())) {
        return;
      }
      ps ☃ = (ps)☃;
      we ☃ = new we(this.o);
      ☃.m(☃);
      this.o.e(☃);
      ☃.a(this.o.E(new cj(☃)), null);
      ☃.m(true);
      if (☃.j_()) {
        ☃.l(true);
      }
      ☃.k(☃.ce());
      if (☃.l_())
      {
        ☃.a(☃.aM());
        ☃.g(☃.aN());
      }
      this.o.d(☃);
      
      this.o.a(null, 1016, new cj((int)this.s, (int)this.t, (int)this.u), 0);
    }
  }
  
  public float aS()
  {
    float ☃ = 1.74F;
    if (j_()) {
      ☃ = (float)(☃ - 0.81D);
    }
    return ☃;
  }
  
  protected boolean a(zx ☃)
  {
    if ((☃.b() == zy.aP) && (j_()) && (au())) {
      return false;
    }
    return super.a(☃);
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    float ☃ = ☃.c();
    
    j(this.V.nextFloat() < 0.55F * ☃);
    if (☃ == null) {
      ☃ = new we.a(this.o.s.nextFloat() < 0.05F, this.o.s.nextFloat() < 0.05F, null);
    }
    if ((☃ instanceof we.a))
    {
      we.a ☃ = (we.a)☃;
      if (☃.b) {
        m(true);
      }
      if (☃.a)
      {
        l(true);
        if (this.o.s.nextFloat() < 0.05D)
        {
          List<tn> ☃ = this.o.a(tn.class, aR().b(5.0D, 3.0D, 5.0D), po.b);
          if (!☃.isEmpty())
          {
            tn ☃ = (tn)☃.get(0);
            ☃.l(true);
            a(☃);
          }
        }
        else if (this.o.s.nextFloat() < 0.05D)
        {
          tn ☃ = new tn(this.o);
          ☃.b(this.s, this.t, this.u, this.y, 0.0F);
          ☃.a(☃, null);
          ☃.l(true);
          this.o.d(☃);
          a(☃);
        }
      }
    }
    a(this.V.nextFloat() < ☃ * 0.1F);
    
    a(☃);
    b(☃);
    if (p(4) == null)
    {
      Calendar ☃ = this.o.Y();
      if ((☃.get(2) + 1 == 10) && (☃.get(5) == 31) && (this.V.nextFloat() < 0.25F))
      {
        c(4, new zx(this.V.nextFloat() < 0.1F ? afi.aZ : afi.aU));
        this.bj[4] = 0.0F;
      }
    }
    a(vy.c).b(new qd("Random spawn bonus", this.V.nextDouble() * 0.05000000074505806D, 0));
    double ☃ = this.V.nextDouble() * 1.5D * ☃;
    if (☃ > 1.0D) {
      a(vy.b).b(new qd("Random zombie-spawn bonus", ☃, 2));
    }
    if (this.V.nextFloat() < ☃ * 0.05F)
    {
      a(a).b(new qd("Leader zombie bonus", this.V.nextDouble() * 0.25D + 0.5D, 0));
      a(vy.a).b(new qd("Leader zombie bonus", this.V.nextDouble() * 3.0D + 1.0D, 2));
      a(true);
    }
    return ☃;
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = ☃.bZ();
    if ((☃ != null) && (☃.b() == zy.ao) && (☃.i() == 0) && (co()) && (a(pe.t)))
    {
      if (!☃.bA.d) {
        ☃.b -= 1;
      }
      if (☃.b <= 0) {
        ☃.bi.a(☃.bi.c, null);
      }
      if (!this.o.D) {
        a(this.V.nextInt(2401) + 3600);
      }
      return true;
    }
    return false;
  }
  
  protected void a(int ☃)
  {
    this.bn = ☃;
    H().b(14, Byte.valueOf((byte)1));
    
    m(pe.t.H);
    c(new pf(pe.g.H, ☃, Math.min(this.o.aa().a() - 1, 0)));
    
    this.o.a(this, (byte)16);
  }
  
  public void a(byte ☃)
  {
    if (☃ == 16)
    {
      if (!R()) {
        this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "mob.zombie.remedy", 1.0F + this.V.nextFloat(), this.V.nextFloat() * 0.7F + 0.3F, false);
      }
    }
    else {
      super.a(☃);
    }
  }
  
  protected boolean C()
  {
    return !cp();
  }
  
  public boolean cp()
  {
    return H().a(14) == 1;
  }
  
  protected void cq()
  {
    wi ☃ = new wi(this.o);
    ☃.m(this);
    ☃.a(this.o.E(new cj(☃)), null);
    ☃.cp();
    if (j_()) {
      ☃.b(41536);
    }
    this.o.e(this);
    ☃.k(ce());
    if (l_())
    {
      ☃.a(aM());
      ☃.g(aN());
    }
    this.o.d(☃);
    
    ☃.c(new pf(pe.k.H, 200, 0));
    this.o.a(null, 1017, new cj((int)this.s, (int)this.t, (int)this.u), 0);
  }
  
  protected int cr()
  {
    int ☃ = 1;
    if (this.V.nextFloat() < 0.01F)
    {
      int ☃ = 0;
      
      cj.a ☃ = new cj.a();
      for (int ☃ = (int)this.s - 4; (☃ < (int)this.s + 4) && (☃ < 14); ☃++) {
        for (int ☃ = (int)this.t - 4; (☃ < (int)this.t + 4) && (☃ < 14); ☃++) {
          for (int ☃ = (int)this.u - 4; (☃ < (int)this.u + 4) && (☃ < 14); ☃++)
          {
            afh ☃ = this.o.p(☃.c(☃, ☃, ☃)).c();
            if ((☃ == afi.bi) || (☃ == afi.C))
            {
              if (this.V.nextFloat() < 0.3F) {
                ☃++;
              }
              ☃++;
            }
          }
        }
      }
    }
    return ☃;
  }
  
  class a
    implements pu
  {
    public boolean a = false;
    public boolean b = false;
    
    private a(boolean ☃, boolean ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
  }
  
  public void n(boolean ☃)
  {
    a(☃ ? 0.5F : 1.0F);
  }
  
  private float bp = -1.0F;
  private float bq;
  
  protected final void a(float ☃, float ☃)
  {
    boolean ☃ = (this.bp > 0.0F) && (this.bq > 0.0F);
    
    this.bp = ☃;
    this.bq = ☃;
    if (!☃) {
      a(1.0F);
    }
  }
  
  protected final void a(float ☃)
  {
    super.a(this.bp * ☃, this.bq * ☃);
  }
  
  public double am()
  {
    return j_() ? 0.0D : -0.35D;
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if (((☃.j() instanceof vn)) && (!(this instanceof vw)) && 
      (((vn)☃.j()).n()) && (((vn)☃.j()).cp()))
    {
      ((vn)☃.j()).cq();
      a(new zx(zy.bX, 1, 2), 0.0F);
    }
  }
}
