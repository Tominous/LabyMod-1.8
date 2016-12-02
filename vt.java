import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;

public class vt
  extends vv
{
  private float a;
  private float b;
  private float c;
  private float bm;
  private float bn;
  private pr bo;
  private int bp;
  private boolean bq;
  private rz br;
  
  public vt(adm ☃)
  {
    super(☃);
    
    this.b_ = 10;
    a(0.85F, 0.85F);
    
    this.i.a(4, new vt.a(this));
    rp ☃;
    this.i.a(5, ☃ = new rp(this, 1.0D));
    this.i.a(7, this.br = new rz(this, 1.0D, 80));
    this.i.a(8, new ri(this, wn.class, 8.0F));
    this.i.a(8, new ri(this, vt.class, 12.0F, 0.01F));
    this.i.a(9, new ry(this));
    
    this.br.a(3);
    ☃.a(3);
    
    this.bi.a(1, new sp(this, pr.class, 10, true, false, new vt.b(this)));
    
    this.f = new vt.c(this);
    
    this.b = (this.a = this.V.nextFloat());
  }
  
  protected void aX()
  {
    super.aX();
    a(vy.e).a(6.0D);
    a(vy.d).a(0.5D);
    a(vy.b).a(16.0D);
    a(vy.a).a(30.0D);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    a(☃.n("Elder"));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("Elder", cn());
  }
  
  protected sw b(adm ☃)
  {
    return new sy(this, ☃);
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(16, Integer.valueOf(0));
    this.ac.a(17, Integer.valueOf(0));
  }
  
  private boolean a(int ☃)
  {
    return (this.ac.c(16) & ☃) != 0;
  }
  
  private void a(int ☃, boolean ☃)
  {
    int ☃ = this.ac.c(16);
    if (☃) {
      this.ac.b(16, Integer.valueOf(☃ | ☃));
    } else {
      this.ac.b(16, Integer.valueOf(☃ & (☃ ^ 0xFFFFFFFF)));
    }
  }
  
  public boolean n()
  {
    return a(2);
  }
  
  private void l(boolean ☃)
  {
    a(2, ☃);
  }
  
  public int cm()
  {
    if (cn()) {
      return 60;
    }
    return 80;
  }
  
  public boolean cn()
  {
    return a(4);
  }
  
  public void a(boolean ☃)
  {
    a(4, ☃);
    if (☃)
    {
      a(1.9975F, 1.9975F);
      a(vy.d).a(0.30000001192092896D);
      a(vy.e).a(8.0D);
      a(vy.a).a(80.0D);
      bX();
      
      this.br.b(400);
    }
  }
  
  public void co()
  {
    a(true);
    this.bn = (this.bm = 1.0F);
  }
  
  private void b(int ☃)
  {
    this.ac.b(17, Integer.valueOf(☃));
  }
  
  public boolean cp()
  {
    return this.ac.c(17) != 0;
  }
  
  public pr cq()
  {
    if (!cp()) {
      return null;
    }
    if (this.o.D)
    {
      if (this.bo != null) {
        return this.bo;
      }
      pk ☃ = this.o.a(this.ac.c(17));
      if ((☃ instanceof pr))
      {
        this.bo = ((pr)☃);
        return this.bo;
      }
      return null;
    }
    return u();
  }
  
  public void i(int ☃)
  {
    super.i(☃);
    if (☃ == 16)
    {
      if ((cn()) && (this.J < 1.0F)) {
        a(1.9975F, 1.9975F);
      }
    }
    else if (☃ == 17)
    {
      this.bp = 0;
      this.bo = null;
    }
  }
  
  public int w()
  {
    return 160;
  }
  
  protected String z()
  {
    if (!V()) {
      return "mob.guardian.land.idle";
    }
    if (cn()) {
      return "mob.guardian.elder.idle";
    }
    return "mob.guardian.idle";
  }
  
  protected String bo()
  {
    if (!V()) {
      return "mob.guardian.land.hit";
    }
    if (cn()) {
      return "mob.guardian.elder.hit";
    }
    return "mob.guardian.hit";
  }
  
  protected String bp()
  {
    if (!V()) {
      return "mob.guardian.land.death";
    }
    if (cn()) {
      return "mob.guardian.elder.death";
    }
    return "mob.guardian.death";
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  public float aS()
  {
    return this.K * 0.5F;
  }
  
  public float a(cj ☃)
  {
    if (this.o.p(☃).c().t() == arm.h) {
      return 10.0F + this.o.o(☃) - 0.5F;
    }
    return super.a(☃);
  }
  
  public void m()
  {
    if (this.o.D)
    {
      this.b = this.a;
      if (!V())
      {
        this.c = 2.0F;
        if ((this.w > 0.0D) && (this.bq) && (!R())) {
          this.o.a(this.s, this.t, this.u, "mob.guardian.flop", 1.0F, 1.0F, false);
        }
        this.bq = ((this.w < 0.0D) && (this.o.d(new cj(this).b(), false)));
      }
      else if (n())
      {
        if (this.c < 0.5F) {
          this.c = 4.0F;
        } else {
          this.c += (0.5F - this.c) * 0.1F;
        }
      }
      else
      {
        this.c += (0.125F - this.c) * 0.2F;
      }
      this.a += this.c;
      
      this.bn = this.bm;
      if (!V()) {
        this.bm = this.V.nextFloat();
      } else if (n()) {
        this.bm += (0.0F - this.bm) * 0.25F;
      } else {
        this.bm += (1.0F - this.bm) * 0.06F;
      }
      if ((n()) && (V()))
      {
        aui ☃ = d(0.0F);
        for (int ☃ = 0; ☃ < 2; ☃++) {
          this.o.a(cy.e, this.s + (this.V.nextDouble() - 0.5D) * this.J - ☃.a * 1.5D, this.t + this.V.nextDouble() * this.K - ☃.b * 1.5D, this.u + (this.V.nextDouble() - 0.5D) * this.J - ☃.c * 1.5D, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
      if (cp())
      {
        if (this.bp < cm()) {
          this.bp += 1;
        }
        pr ☃ = cq();
        if (☃ != null)
        {
          p().a(☃, 90.0F, 90.0F);
          p().a();
          
          double ☃ = q(0.0F);
          double ☃ = ☃.s - this.s;
          double ☃ = ☃.t + ☃.K * 0.5F - (this.t + aS());
          double ☃ = ☃.u - this.u;
          double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
          ☃ /= ☃;
          ☃ /= ☃;
          ☃ /= ☃;
          double ☃ = this.V.nextDouble();
          while (☃ < ☃)
          {
            ☃ += 1.8D - ☃ + this.V.nextDouble() * (1.7D - ☃);
            this.o.a(cy.e, this.s + ☃ * ☃, this.t + ☃ * ☃ + aS(), this.u + ☃ * ☃, 0.0D, 0.0D, 0.0D, new int[0]);
          }
        }
      }
    }
    if (this.Y)
    {
      h(300);
    }
    else if (this.C)
    {
      this.w += 0.5D;
      this.v += (this.V.nextFloat() * 2.0F - 1.0F) * 0.4F;
      this.x += (this.V.nextFloat() * 2.0F - 1.0F) * 0.4F;
      this.y = (this.V.nextFloat() * 360.0F);
      this.C = false;
      this.ai = true;
    }
    if (cp()) {
      this.y = this.aK;
    }
    super.m();
  }
  
  public float a(float ☃)
  {
    return this.b + (this.a - this.b) * ☃;
  }
  
  public float p(float ☃)
  {
    return this.bn + (this.bm - this.bn) * ☃;
  }
  
  public float q(float ☃)
  {
    return (this.bp + ☃) / cm();
  }
  
  protected void E()
  {
    super.E();
    if (cn())
    {
      int ☃ = 1200;
      int ☃ = 1200;
      int ☃ = 6000;
      int ☃ = 2;
      pe ☃;
      if ((this.W + F()) % 1200 == 0)
      {
        ☃ = pe.f;
        
        List<lf> ☃ = this.o.b(lf.class, new Predicate()
        {
          public boolean a(lf ☃)
          {
            return (vt.this.h(☃) < 2500.0D) && (☃.c.c());
          }
        });
        for (lf ☃ : ☃) {
          if ((!☃.a(☃)) || (☃.b(☃).c() < 2) || (☃.b(☃).b() < 1200))
          {
            ☃.a.a(new gm(10, 0.0F));
            ☃.c(new pf(☃.H, 6000, 2));
          }
        }
      }
      if (!ck()) {
        a(new cj(this), 16);
      }
    }
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = this.V.nextInt(3) + this.V.nextInt(☃ + 1);
    if (☃ > 0) {
      a(new zx(zy.cC, ☃, 0), 1.0F);
    }
    if (this.V.nextInt(3 + ☃) > 1) {
      a(new zx(zy.aU, 1, zp.a.a.a()), 1.0F);
    } else if (this.V.nextInt(3 + ☃) > 1) {
      a(new zx(zy.cD, 1, 0), 1.0F);
    }
    if ((☃) && 
      (cn())) {
      a(new zx(afi.v, 1, 1), 1.0F);
    }
  }
  
  protected void bq()
  {
    zx ☃ = ((us)oa.a(this.V, ur.j())).a(this.V);
    a(☃, 1.0F);
  }
  
  protected boolean n_()
  {
    return true;
  }
  
  public boolean bS()
  {
    return (this.o.a(aR(), this)) && (this.o.a(this, aR()).isEmpty());
  }
  
  public boolean bR()
  {
    return ((this.V.nextInt(20) == 0) || (!this.o.j(new cj(this)))) && (super.bR());
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if ((!n()) && (!☃.s()) && ((☃.i() instanceof pr)))
    {
      pr ☃ = (pr)☃.i();
      if (!☃.c())
      {
        ☃.a(ow.a(this), 2.0F);
        ☃.a("damage.thorns", 0.5F, 1.0F);
      }
    }
    this.br.f();
    return super.a(☃, ☃);
  }
  
  public int bQ()
  {
    return 180;
  }
  
  public void g(float ☃, float ☃)
  {
    if (bM())
    {
      if (V())
      {
        a(☃, ☃, 0.1F);
        d(this.v, this.w, this.x);
        
        this.v *= 0.8999999761581421D;
        this.w *= 0.8999999761581421D;
        this.x *= 0.8999999761581421D;
        if ((!n()) && (u() == null)) {
          this.w -= 0.005D;
        }
      }
      else
      {
        super.g(☃, ☃);
      }
    }
    else {
      super.g(☃, ☃);
    }
  }
  
  static class b
    implements Predicate<pr>
  {
    private vt a;
    
    public b(vt ☃)
    {
      this.a = ☃;
    }
    
    public boolean a(pr ☃)
    {
      return (((☃ instanceof wn)) || ((☃ instanceof tx))) && (☃.h(this.a) > 9.0D);
    }
  }
  
  static class a
    extends rd
  {
    private vt a;
    private int b;
    
    public a(vt ☃)
    {
      this.a = ☃;
      
      a(3);
    }
    
    public boolean a()
    {
      pr ☃ = this.a.u();
      if ((☃ == null) || (!☃.ai())) {
        return false;
      }
      return true;
    }
    
    public boolean b()
    {
      return (super.b()) && ((this.a.cn()) || (this.a.h(this.a.u()) > 9.0D));
    }
    
    public void c()
    {
      this.b = -10;
      this.a.s().n();
      this.a.p().a(this.a.u(), 90.0F, 90.0F);
      
      this.a.ai = true;
    }
    
    public void d()
    {
      vt.a(this.a, 0);
      this.a.d(null);
      
      vt.a(this.a).f();
    }
    
    public void e()
    {
      pr ☃ = this.a.u();
      
      this.a.s().n();
      this.a.p().a(☃, 90.0F, 90.0F);
      if (!this.a.t(☃))
      {
        this.a.d(null);
        return;
      }
      this.b += 1;
      if (this.b == 0)
      {
        vt.a(this.a, this.a.u().F());
        this.a.o.a(this.a, (byte)21);
      }
      else if (this.b >= this.a.cm())
      {
        float ☃ = 1.0F;
        if (this.a.o.aa() == oj.d) {
          ☃ += 2.0F;
        }
        if (this.a.cn()) {
          ☃ += 2.0F;
        }
        ☃.a(ow.b(this.a, this.a), ☃);
        ☃.a(ow.a(this.a), (float)this.a.a(vy.e).e());
        this.a.d(null);
      }
      else if ((this.b < 60) || (this.b % 20 != 0)) {}
      super.e();
    }
  }
  
  static class c
    extends qq
  {
    private vt g;
    
    public c(vt ☃)
    {
      super();
      this.g = ☃;
    }
    
    public void c()
    {
      if ((!this.f) || (this.g.s().m()))
      {
        this.g.k(0.0F);
        vt.a(this.g, false);
        return;
      }
      double ☃ = this.b - this.g.s;
      double ☃ = this.c - this.g.t;
      double ☃ = this.d - this.g.u;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      ☃ = ns.a(☃);
      ☃ /= ☃;
      
      float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
      
      this.g.y = a(this.g.y, ☃, 30.0F);
      this.g.aI = this.g.y;
      
      float ☃ = (float)(this.e * this.g.a(vy.d).e());
      this.g.k(this.g.bI() + (☃ - this.g.bI()) * 0.125F);
      double ☃ = Math.sin((this.g.W + this.g.F()) * 0.5D) * 0.05D;
      double ☃ = Math.cos(this.g.y * 3.1415927F / 180.0F);
      double ☃ = Math.sin(this.g.y * 3.1415927F / 180.0F);
      this.g.v += ☃ * ☃;
      this.g.x += ☃ * ☃;
      
      ☃ = Math.sin((this.g.W + this.g.F()) * 0.75D) * 0.05D;
      this.g.w += ☃ * (☃ + ☃) * 0.25D;
      this.g.w += this.g.bI() * ☃ * 0.1D;
      
      qp ☃ = this.g.p();
      double ☃ = this.g.s + ☃ / ☃ * 2.0D;
      double ☃ = this.g.aS() + this.g.t + ☃ / ☃ * 1.0D;
      double ☃ = this.g.u + ☃ / ☃ * 2.0D;
      double ☃ = ☃.e();
      double ☃ = ☃.f();
      double ☃ = ☃.g();
      if (!☃.b())
      {
        ☃ = ☃;
        ☃ = ☃;
        ☃ = ☃;
      }
      this.g.p().a(☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, 10.0F, 40.0F);
      vt.a(this.g, true);
    }
  }
}
