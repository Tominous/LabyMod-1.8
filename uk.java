import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import java.util.Random;

public class uk
  extends vv
  implements uc, vx
{
  private float[] a = new float[2];
  private float[] b = new float[2];
  private float[] c = new float[2];
  private float[] bm = new float[2];
  private int[] bn = new int[2];
  private int[] bo = new int[2];
  private int bp;
  private static final Predicate<pk> bq = new Predicate()
  {
    public boolean a(pk ☃)
    {
      return ((☃ instanceof pr)) && (((pr)☃).bz() != pw.b);
    }
  };
  
  public uk(adm ☃)
  {
    super(☃);
    
    i(bu());
    
    a(0.9F, 3.5F);
    
    this.ab = true;
    
    ((sv)s()).d(true);
    
    this.i.a(0, new ra(this));
    this.i.a(2, new sa(this, 1.0D, 40, 20.0F));
    
    this.i.a(5, new rz(this, 1.0D));
    this.i.a(6, new ri(this, wn.class, 8.0F));
    this.i.a(7, new ry(this));
    
    this.bi.a(1, new sm(this, false, new Class[0]));
    this.bi.a(2, new sp(this, ps.class, 0, false, false, bq));
    
    this.b_ = 50;
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(17, new Integer(0));
    this.ac.a(18, new Integer(0));
    this.ac.a(19, new Integer(0));
    this.ac.a(20, new Integer(0));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("Invul", cl());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    r(☃.f("Invul"));
  }
  
  protected String z()
  {
    return "mob.wither.idle";
  }
  
  protected String bo()
  {
    return "mob.wither.hurt";
  }
  
  protected String bp()
  {
    return "mob.wither.death";
  }
  
  public void m()
  {
    this.w *= 0.6000000238418579D;
    if ((!this.o.D) && (s(0) > 0))
    {
      pk ☃ = this.o.a(s(0));
      if (☃ != null)
      {
        if ((this.t < ☃.t) || ((!cm()) && (this.t < ☃.t + 5.0D)))
        {
          if (this.w < 0.0D) {
            this.w = 0.0D;
          }
          this.w += (0.5D - this.w) * 0.6000000238418579D;
        }
        double ☃ = ☃.s - this.s;
        double ☃ = ☃.u - this.u;
        double ☃ = ☃ * ☃ + ☃ * ☃;
        if (☃ > 9.0D)
        {
          double ☃ = ns.a(☃);
          this.v += (☃ / ☃ * 0.5D - this.v) * 0.6000000238418579D;
          this.x += (☃ / ☃ * 0.5D - this.x) * 0.6000000238418579D;
        }
      }
    }
    if (this.v * this.v + this.x * this.x > 0.05000000074505806D) {
      this.y = ((float)ns.b(this.x, this.v) * 57.295776F - 90.0F);
    }
    super.m();
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      this.bm[☃] = this.b[☃];
      this.c[☃] = this.a[☃];
    }
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      int ☃ = s(☃ + 1);
      pk ☃ = null;
      if (☃ > 0) {
        ☃ = this.o.a(☃);
      }
      if (☃ != null)
      {
        double ☃ = t(☃ + 1);
        double ☃ = u(☃ + 1);
        double ☃ = v(☃ + 1);
        
        double ☃ = ☃.s - ☃;
        double ☃ = ☃.t + ☃.aS() - ☃;
        double ☃ = ☃.u - ☃;
        double ☃ = ns.a(☃ * ☃ + ☃ * ☃);
        
        float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
        float ☃ = (float)-(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D);
        this.a[☃] = b(this.a[☃], ☃, 40.0F);
        this.b[☃] = b(this.b[☃], ☃, 10.0F);
      }
      else
      {
        this.b[☃] = b(this.b[☃], this.aI, 10.0F);
      }
    }
    boolean ☃ = cm();
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      double ☃ = t(☃);
      double ☃ = u(☃);
      double ☃ = v(☃);
      
      this.o.a(cy.l, ☃ + this.V.nextGaussian() * 0.30000001192092896D, ☃ + this.V.nextGaussian() * 0.30000001192092896D, ☃ + this.V.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D, new int[0]);
      if ((☃) && (this.o.s.nextInt(4) == 0)) {
        this.o.a(cy.p, ☃ + this.V.nextGaussian() * 0.30000001192092896D, ☃ + this.V.nextGaussian() * 0.30000001192092896D, ☃ + this.V.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D, new int[0]);
      }
    }
    if (cl() > 0) {
      for (int ☃ = 0; ☃ < 3; ☃++) {
        this.o.a(cy.p, this.s + this.V.nextGaussian() * 1.0D, this.t + this.V.nextFloat() * 3.3F, this.u + this.V.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D, new int[0]);
      }
    }
  }
  
  protected void E()
  {
    if (cl() > 0)
    {
      int ☃ = cl() - 1;
      if (☃ <= 0)
      {
        this.o.a(this, this.s, this.t + aS(), this.u, 7.0F, false, this.o.Q().b("mobGriefing"));
        this.o.a(1013, new cj(this), 0);
      }
      r(☃);
      if (this.W % 10 == 0) {
        h(10.0F);
      }
      return;
    }
    super.E();
    for (int ☃ = 1; ☃ < 3; ☃++) {
      if (this.W >= this.bn[(☃ - 1)])
      {
        this.bn[(☃ - 1)] = (this.W + 10 + this.V.nextInt(10));
        if ((this.o.aa() == oj.c) || (this.o.aa() == oj.d))
        {
          int tmp188_187 = (☃ - 1); int[] tmp188_182 = this.bo; int tmp190_189 = tmp188_182[tmp188_187];tmp188_182[tmp188_187] = (tmp190_189 + 1);
          if (tmp190_189 > 15)
          {
            float ☃ = 10.0F;
            float ☃ = 5.0F;
            double ☃ = ns.a(this.V, this.s - ☃, this.s + ☃);
            double ☃ = ns.a(this.V, this.t - ☃, this.t + ☃);
            double ☃ = ns.a(this.V, this.u - ☃, this.u + ☃);
            a(☃ + 1, ☃, ☃, ☃, true);
            this.bo[(☃ - 1)] = 0;
          }
        }
        int ☃ = s(☃);
        if (☃ > 0)
        {
          pk ☃ = this.o.a(☃);
          if ((☃ == null) || (!☃.ai()) || (h(☃) > 900.0D) || (!t(☃)))
          {
            b(☃, 0);
          }
          else if (((☃ instanceof wn)) && (((wn)☃).bA.a))
          {
            b(☃, 0);
          }
          else
          {
            a(☃ + 1, (pr)☃);
            this.bn[(☃ - 1)] = (this.W + 40 + this.V.nextInt(20));
            this.bo[(☃ - 1)] = 0;
          }
        }
        else
        {
          List<pr> ☃ = this.o.a(pr.class, aR().b(20.0D, 8.0D, 20.0D), Predicates.and(bq, po.d));
          for (int ☃ = 0; (☃ < 10) && (!☃.isEmpty()); ☃++)
          {
            pr ☃ = (pr)☃.get(this.V.nextInt(☃.size()));
            if ((☃ != this) && (☃.ai()) && (t(☃)))
            {
              if ((☃ instanceof wn))
              {
                if (((wn)☃).bA.a) {
                  break;
                }
                b(☃, ☃.F()); break;
              }
              b(☃, ☃.F());
              break;
            }
            ☃.remove(☃);
          }
        }
      }
    }
    if (u() != null) {
      b(0, u().F());
    } else {
      b(0, 0);
    }
    if (this.bp > 0)
    {
      this.bp -= 1;
      if ((this.bp == 0) && (this.o.Q().b("mobGriefing")))
      {
        int ☃ = ns.c(this.t);
        int ☃ = ns.c(this.s);
        int ☃ = ns.c(this.u);
        boolean ☃ = false;
        for (int ☃ = -1; ☃ <= 1; ☃++) {
          for (int ☃ = -1; ☃ <= 1; ☃++) {
            for (int ☃ = 0; ☃ <= 3; ☃++)
            {
              int ☃ = ☃ + ☃;
              int ☃ = ☃ + ☃;
              int ☃ = ☃ + ☃;
              cj ☃ = new cj(☃, ☃, ☃);
              afh ☃ = this.o.p(☃).c();
              if ((☃.t() != arm.a) && (a(☃))) {
                ☃ = (this.o.b(☃, true)) || (☃);
              }
            }
          }
        }
        if (☃) {
          this.o.a(null, 1012, new cj(this), 0);
        }
      }
    }
    if (this.W % 20 == 0) {
      h(1.0F);
    }
  }
  
  public static boolean a(afh ☃)
  {
    return (☃ != afi.h) && (☃ != afi.bF) && (☃ != afi.bG) && (☃ != afi.bX) && (☃ != afi.cv);
  }
  
  public void n()
  {
    r(220);
    i(bu() / 3.0F);
  }
  
  public void aA() {}
  
  public int br()
  {
    return 4;
  }
  
  private double t(int ☃)
  {
    if (☃ <= 0) {
      return this.s;
    }
    float ☃ = (this.aI + 180 * (☃ - 1)) / 180.0F * 3.1415927F;
    float ☃ = ns.b(☃);
    return this.s + ☃ * 1.3D;
  }
  
  private double u(int ☃)
  {
    if (☃ <= 0) {
      return this.t + 3.0D;
    }
    return this.t + 2.2D;
  }
  
  private double v(int ☃)
  {
    if (☃ <= 0) {
      return this.u;
    }
    float ☃ = (this.aI + 180 * (☃ - 1)) / 180.0F * 3.1415927F;
    float ☃ = ns.a(☃);
    return this.u + ☃ * 1.3D;
  }
  
  private float b(float ☃, float ☃, float ☃)
  {
    float ☃ = ns.g(☃ - ☃);
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    return ☃ + ☃;
  }
  
  private void a(int ☃, pr ☃)
  {
    a(☃, ☃.s, ☃.t + ☃.aS() * 0.5D, ☃.u, (☃ == 0) && (this.V.nextFloat() < 0.001F));
  }
  
  private void a(int ☃, double ☃, double ☃, double ☃, boolean ☃)
  {
    this.o.a(null, 1014, new cj(this), 0);
    
    double ☃ = t(☃);
    double ☃ = u(☃);
    double ☃ = v(☃);
    
    double ☃ = ☃ - ☃;
    double ☃ = ☃ - ☃;
    double ☃ = ☃ - ☃;
    
    xd ☃ = new xd(this.o, this, ☃, ☃, ☃);
    if (☃) {
      ☃.a(true);
    }
    ☃.t = ☃;
    ☃.s = ☃;
    ☃.u = ☃;
    this.o.d(☃);
  }
  
  public void a(pr ☃, float ☃)
  {
    a(0, ☃);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((☃ == ow.f) || ((☃.j() instanceof uk))) {
      return false;
    }
    if ((cl() > 0) && (☃ != ow.j)) {
      return false;
    }
    if (cm())
    {
      pk ☃ = ☃.i();
      if ((☃ instanceof wq)) {
        return false;
      }
    }
    pk ☃ = ☃.j();
    if ((☃ != null) && 
      (!(☃ instanceof wn)) && 
      ((☃ instanceof pr)) && (((pr)☃).bz() == bz())) {
      return false;
    }
    if (this.bp <= 0) {
      this.bp = 20;
    }
    for (int ☃ = 0; ☃ < this.bo.length; ☃++) {
      this.bo[☃] += 3;
    }
    return super.a(☃, ☃);
  }
  
  protected void b(boolean ☃, int ☃)
  {
    uz ☃ = a(zy.bZ, 1);
    if (☃ != null) {
      ☃.u();
    }
    if (!this.o.D) {
      for (wn ☃ : this.o.a(wn.class, aR().b(50.0D, 100.0D, 50.0D))) {
        ☃.b(mr.J);
      }
    }
  }
  
  protected void D()
  {
    this.aQ = 0;
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
  
  public void e(float ☃, float ☃) {}
  
  public void c(pf ☃) {}
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(300.0D);
    a(vy.d).a(0.6000000238418579D);
    a(vy.b).a(40.0D);
  }
  
  public float a(int ☃)
  {
    return this.b[☃];
  }
  
  public float b(int ☃)
  {
    return this.a[☃];
  }
  
  public int cl()
  {
    return this.ac.c(20);
  }
  
  public void r(int ☃)
  {
    this.ac.b(20, Integer.valueOf(☃));
  }
  
  public int s(int ☃)
  {
    return this.ac.c(17 + ☃);
  }
  
  public void b(int ☃, int ☃)
  {
    this.ac.b(17 + ☃, Integer.valueOf(☃));
  }
  
  public boolean cm()
  {
    return bn() <= bu() / 2.0F;
  }
  
  public pw bz()
  {
    return pw.b;
  }
  
  public void a(pk ☃)
  {
    this.m = null;
  }
}
