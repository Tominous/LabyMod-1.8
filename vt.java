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
    
    b_ = 10;
    a(0.85F, 0.85F);
    
    i.a(4, new vt.a(this));
    rp ☃;
    i.a(5, ☃ = new rp(this, 1.0D));
    i.a(7, br = new rz(this, 1.0D, 80));
    i.a(8, new ri(this, wn.class, 8.0F));
    i.a(8, new ri(this, vt.class, 12.0F, 0.01F));
    i.a(9, new ry(this));
    
    br.a(3);
    ☃.a(3);
    
    bi.a(1, new sp(this, pr.class, 10, true, false, new vt.b(this)));
    
    f = new vt.c(this);
    
    b = (a = V.nextFloat());
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
    
    ac.a(16, Integer.valueOf(0));
    ac.a(17, Integer.valueOf(0));
  }
  
  private boolean a(int ☃)
  {
    return (ac.c(16) & ☃) != 0;
  }
  
  private void a(int ☃, boolean ☃)
  {
    int ☃ = ac.c(16);
    if (☃) {
      ac.b(16, Integer.valueOf(☃ | ☃));
    } else {
      ac.b(16, Integer.valueOf(☃ & (☃ ^ 0xFFFFFFFF)));
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
      
      br.b(400);
    }
  }
  
  public void co()
  {
    a(true);
    bn = (bm = 1.0F);
  }
  
  private void b(int ☃)
  {
    ac.b(17, Integer.valueOf(☃));
  }
  
  public boolean cp()
  {
    return ac.c(17) != 0;
  }
  
  public pr cq()
  {
    if (!cp()) {
      return null;
    }
    if (o.D)
    {
      if (bo != null) {
        return bo;
      }
      pk ☃ = o.a(ac.c(17));
      if ((☃ instanceof pr))
      {
        bo = ((pr)☃);
        return bo;
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
      if ((cn()) && (J < 1.0F)) {
        a(1.9975F, 1.9975F);
      }
    }
    else if (☃ == 17)
    {
      bp = 0;
      bo = null;
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
    return K * 0.5F;
  }
  
  public float a(cj ☃)
  {
    if (o.p(☃).c().t() == arm.h) {
      return 10.0F + o.o(☃) - 0.5F;
    }
    return super.a(☃);
  }
  
  public void m()
  {
    if (o.D)
    {
      b = a;
      if (!V())
      {
        c = 2.0F;
        if ((w > 0.0D) && (bq) && (!R())) {
          o.a(s, t, u, "mob.guardian.flop", 1.0F, 1.0F, false);
        }
        bq = ((w < 0.0D) && (o.d(new cj(this).b(), false)));
      }
      else if (n())
      {
        if (c < 0.5F) {
          c = 4.0F;
        } else {
          c += (0.5F - c) * 0.1F;
        }
      }
      else
      {
        c += (0.125F - c) * 0.2F;
      }
      a += c;
      
      bn = bm;
      if (!V()) {
        bm = V.nextFloat();
      } else if (n()) {
        bm += (0.0F - bm) * 0.25F;
      } else {
        bm += (1.0F - bm) * 0.06F;
      }
      if ((n()) && (V()))
      {
        aui ☃ = d(0.0F);
        for (int ☃ = 0; ☃ < 2; ☃++) {
          o.a(cy.e, s + (V.nextDouble() - 0.5D) * J - a * 1.5D, t + V.nextDouble() * K - b * 1.5D, u + (V.nextDouble() - 0.5D) * J - c * 1.5D, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
      if (cp())
      {
        if (bp < cm()) {
          bp += 1;
        }
        pr ☃ = cq();
        if (☃ != null)
        {
          p().a(☃, 90.0F, 90.0F);
          p().a();
          
          double ☃ = q(0.0F);
          double ☃ = s - s;
          double ☃ = t + K * 0.5F - (t + aS());
          double ☃ = u - u;
          double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
          ☃ /= ☃;
          ☃ /= ☃;
          ☃ /= ☃;
          double ☃ = V.nextDouble();
          while (☃ < ☃)
          {
            ☃ += 1.8D - ☃ + V.nextDouble() * (1.7D - ☃);
            o.a(cy.e, s + ☃ * ☃, t + ☃ * ☃ + aS(), u + ☃ * ☃, 0.0D, 0.0D, 0.0D, new int[0]);
          }
        }
      }
    }
    if (Y)
    {
      h(300);
    }
    else if (C)
    {
      w += 0.5D;
      v += (V.nextFloat() * 2.0F - 1.0F) * 0.4F;
      x += (V.nextFloat() * 2.0F - 1.0F) * 0.4F;
      y = (V.nextFloat() * 360.0F);
      C = false;
      ai = true;
    }
    if (cp()) {
      y = aK;
    }
    super.m();
  }
  
  public float a(float ☃)
  {
    return b + (a - b) * ☃;
  }
  
  public float p(float ☃)
  {
    return bn + (bm - bn) * ☃;
  }
  
  public float q(float ☃)
  {
    return (bp + ☃) / cm();
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
      if ((W + F()) % 1200 == 0)
      {
        ☃ = pe.f;
        
        List<lf> ☃ = o.b(lf.class, new Predicate()
        {
          public boolean a(lf ☃)
          {
            return (h(☃) < 2500.0D) && (c.c());
          }
        });
        for (lf ☃ : ☃) {
          if ((!☃.a(☃)) || (☃.b(☃).c() < 2) || (☃.b(☃).b() < 1200))
          {
            a.a(new gm(10, 0.0F));
            ☃.c(new pf(H, 6000, 2));
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
    int ☃ = V.nextInt(3) + V.nextInt(☃ + 1);
    if (☃ > 0) {
      a(new zx(zy.cC, ☃, 0), 1.0F);
    }
    if (V.nextInt(3 + ☃) > 1) {
      a(new zx(zy.aU, 1, zp.a.a.a()), 1.0F);
    } else if (V.nextInt(3 + ☃) > 1) {
      a(new zx(zy.cD, 1, 0), 1.0F);
    }
    if ((☃) && 
      (cn())) {
      a(new zx(afi.v, 1, 1), 1.0F);
    }
  }
  
  protected void bq()
  {
    zx ☃ = ((us)oa.a(V, ur.j())).a(V);
    a(☃, 1.0F);
  }
  
  protected boolean n_()
  {
    return true;
  }
  
  public boolean bS()
  {
    return (o.a(aR(), this)) && (o.a(this, aR()).isEmpty());
  }
  
  public boolean bR()
  {
    return ((V.nextInt(20) == 0) || (!o.j(new cj(this)))) && (super.bR());
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
    br.f();
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
        d(v, w, x);
        
        v *= 0.8999999761581421D;
        w *= 0.8999999761581421D;
        x *= 0.8999999761581421D;
        if ((!n()) && (u() == null)) {
          w -= 0.005D;
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
      a = ☃;
    }
    
    public boolean a(pr ☃)
    {
      return (((☃ instanceof wn)) || ((☃ instanceof tx))) && (☃.h(a) > 9.0D);
    }
  }
  
  static class a
    extends rd
  {
    private vt a;
    private int b;
    
    public a(vt ☃)
    {
      a = ☃;
      
      a(3);
    }
    
    public boolean a()
    {
      pr ☃ = a.u();
      if ((☃ == null) || (!☃.ai())) {
        return false;
      }
      return true;
    }
    
    public boolean b()
    {
      return (super.b()) && ((a.cn()) || (a.h(a.u()) > 9.0D));
    }
    
    public void c()
    {
      b = -10;
      a.s().n();
      a.p().a(a.u(), 90.0F, 90.0F);
      
      a.ai = true;
    }
    
    public void d()
    {
      vt.a(a, 0);
      a.d(null);
      
      vt.a(a).f();
    }
    
    public void e()
    {
      pr ☃ = a.u();
      
      a.s().n();
      a.p().a(☃, 90.0F, 90.0F);
      if (!a.t(☃))
      {
        a.d(null);
        return;
      }
      b += 1;
      if (b == 0)
      {
        vt.a(a, a.u().F());
        a.o.a(a, (byte)21);
      }
      else if (b >= a.cm())
      {
        float ☃ = 1.0F;
        if (a.o.aa() == oj.d) {
          ☃ += 2.0F;
        }
        if (a.cn()) {
          ☃ += 2.0F;
        }
        ☃.a(ow.b(a, a), ☃);
        ☃.a(ow.a(a), (float)a.a(vy.e).e());
        a.d(null);
      }
      else if ((b < 60) || (b % 20 != 0)) {}
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
      g = ☃;
    }
    
    public void c()
    {
      if ((!f) || (g.s().m()))
      {
        g.k(0.0F);
        vt.a(g, false);
        return;
      }
      double ☃ = b - g.s;
      double ☃ = c - g.t;
      double ☃ = d - g.u;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      ☃ = ns.a(☃);
      ☃ /= ☃;
      
      float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
      
      g.y = a(g.y, ☃, 30.0F);
      g.aI = g.y;
      
      float ☃ = (float)(e * g.a(vy.d).e());
      g.k(g.bI() + (☃ - g.bI()) * 0.125F);
      double ☃ = Math.sin((g.W + g.F()) * 0.5D) * 0.05D;
      double ☃ = Math.cos(g.y * 3.1415927F / 180.0F);
      double ☃ = Math.sin(g.y * 3.1415927F / 180.0F);
      g.v += ☃ * ☃;
      g.x += ☃ * ☃;
      
      ☃ = Math.sin((g.W + g.F()) * 0.75D) * 0.05D;
      g.w += ☃ * (☃ + ☃) * 0.25D;
      g.w += g.bI() * ☃ * 0.1D;
      
      qp ☃ = g.p();
      double ☃ = g.s + ☃ / ☃ * 2.0D;
      double ☃ = g.aS() + g.t + ☃ / ☃ * 1.0D;
      double ☃ = g.u + ☃ / ☃ * 2.0D;
      double ☃ = ☃.e();
      double ☃ = ☃.f();
      double ☃ = ☃.g();
      if (!☃.b())
      {
        ☃ = ☃;
        ☃ = ☃;
        ☃ = ☃;
      }
      g.p().a(☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, ☃ + (☃ - ☃) * 0.125D, 10.0F, 40.0F);
      vt.a(g, true);
    }
  }
}
