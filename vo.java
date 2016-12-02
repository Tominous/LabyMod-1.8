import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class vo
  extends vv
{
  private static final UUID a = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
  private static final qd b = new qd(a, "Attacking speed boost", 0.15000000596046448D, 0).a(false);
  private static final Set<afh> c = Sets.newIdentityHashSet();
  private boolean bm;
  
  static
  {
    c.add(afi.c);
    c.add(afi.d);
    c.add(afi.m);
    c.add(afi.n);
    c.add(afi.N);
    c.add(afi.O);
    c.add(afi.P);
    c.add(afi.Q);
    c.add(afi.W);
    c.add(afi.aK);
    c.add(afi.aL);
    c.add(afi.aU);
    c.add(afi.bk);
    c.add(afi.bw);
  }
  
  public vo(adm ☃)
  {
    super(☃);
    a(0.6F, 2.9F);
    this.S = 1.0F;
    
    this.i.a(0, new ra(this));
    this.i.a(2, new rl(this, 1.0D, false));
    
    this.i.a(7, new rz(this, 1.0D));
    this.i.a(8, new ri(this, wn.class, 8.0F));
    this.i.a(8, new ry(this));
    
    this.i.a(10, new vo.a(this));
    this.i.a(11, new vo.c(this));
    
    this.bi.a(1, new sm(this, false, new Class[0]));
    this.bi.a(2, new vo.b(this));
    this.bi.a(3, new sp(this, vp.class, 10, true, false, new Predicate()
    {
      public boolean a(vp ☃)
      {
        return ☃.n();
      }
    }));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(40.0D);
    a(vy.d).a(0.30000001192092896D);
    a(vy.e).a(7.0D);
    a(vy.b).a(64.0D);
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(16, new Short((short)0));
    this.ac.a(17, new Byte((byte)0));
    this.ac.a(18, new Byte((byte)0));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    alz ☃ = cm();
    ☃.a("carried", (short)afh.a(☃.c()));
    ☃.a("carriedData", (short)☃.c().c(☃));
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    alz ☃;
    alz ☃;
    if (☃.b("carried", 8)) {
      ☃ = afh.b(☃.j("carried")).a(☃.e("carriedData") & 0xFFFF);
    } else {
      ☃ = afh.c(☃.e("carried")).a(☃.e("carriedData") & 0xFFFF);
    }
    a(☃);
  }
  
  private boolean c(wn ☃)
  {
    zx ☃ = ☃.bi.b[3];
    if ((☃ != null) && (☃.b() == zw.a(afi.aU))) {
      return false;
    }
    aui ☃ = ☃.d(1.0F).a();
    aui ☃ = new aui(this.s - ☃.s, aR().b + this.K / 2.0F - (☃.t + ☃.aS()), this.u - ☃.u);
    double ☃ = ☃.b();
    ☃ = ☃.a();
    double ☃ = ☃.b(☃);
    if (☃ > 1.0D - 0.025D / ☃) {
      return ☃.t(this);
    }
    return false;
  }
  
  public float aS()
  {
    return 2.55F;
  }
  
  public void m()
  {
    if (this.o.D) {
      for (int ☃ = 0; ☃ < 2; ☃++) {
        this.o.a(cy.y, this.s + (this.V.nextDouble() - 0.5D) * this.J, this.t + this.V.nextDouble() * this.K - 0.25D, this.u + (this.V.nextDouble() - 0.5D) * this.J, (this.V.nextDouble() - 0.5D) * 2.0D, -this.V.nextDouble(), (this.V.nextDouble() - 0.5D) * 2.0D, new int[0]);
      }
    }
    this.aY = false;
    
    super.m();
  }
  
  protected void E()
  {
    if (U()) {
      a(ow.f, 1.0F);
    }
    if ((co()) && (!this.bm) && (this.V.nextInt(100) == 0)) {
      a(false);
    }
    if (this.o.w())
    {
      float ☃ = c(1.0F);
      if ((☃ > 0.5F) && 
        (this.o.i(new cj(this))) && (this.V.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F))
      {
        d(null);
        a(false);
        this.bm = false;
        n();
      }
    }
    super.E();
  }
  
  protected boolean n()
  {
    double ☃ = this.s + (this.V.nextDouble() - 0.5D) * 64.0D;
    double ☃ = this.t + (this.V.nextInt(64) - 32);
    double ☃ = this.u + (this.V.nextDouble() - 0.5D) * 64.0D;
    return k(☃, ☃, ☃);
  }
  
  protected boolean b(pk ☃)
  {
    aui ☃ = new aui(this.s - ☃.s, aR().b + this.K / 2.0F - ☃.t + ☃.aS(), this.u - ☃.u);
    ☃ = ☃.a();
    double ☃ = 16.0D;
    double ☃ = this.s + (this.V.nextDouble() - 0.5D) * 8.0D - ☃.a * ☃;
    double ☃ = this.t + (this.V.nextInt(16) - 8) - ☃.b * ☃;
    double ☃ = this.u + (this.V.nextDouble() - 0.5D) * 8.0D - ☃.c * ☃;
    return k(☃, ☃, ☃);
  }
  
  protected boolean k(double ☃, double ☃, double ☃)
  {
    double ☃ = this.s;
    double ☃ = this.t;
    double ☃ = this.u;
    
    this.s = ☃;
    this.t = ☃;
    this.u = ☃;
    boolean ☃ = false;
    cj ☃ = new cj(this.s, this.t, this.u);
    if (this.o.e(☃))
    {
      boolean ☃ = false;
      while ((!☃) && (☃.o() > 0))
      {
        cj ☃ = ☃.b();
        afh ☃ = this.o.p(☃).c();
        if (☃.t().c())
        {
          ☃ = true;
        }
        else
        {
          this.t -= 1.0D;
          ☃ = ☃;
        }
      }
      if (☃)
      {
        super.a(this.s, this.t, this.u);
        if ((this.o.a(this, aR()).isEmpty()) && (!this.o.d(aR()))) {
          ☃ = true;
        }
      }
    }
    if (☃)
    {
      int ☃ = 128;
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        double ☃ = ☃ / (☃ - 1.0D);
        float ☃ = (this.V.nextFloat() - 0.5F) * 0.2F;
        float ☃ = (this.V.nextFloat() - 0.5F) * 0.2F;
        float ☃ = (this.V.nextFloat() - 0.5F) * 0.2F;
        
        double ☃ = ☃ + (this.s - ☃) * ☃ + (this.V.nextDouble() - 0.5D) * this.J * 2.0D;
        double ☃ = ☃ + (this.t - ☃) * ☃ + this.V.nextDouble() * this.K;
        double ☃ = ☃ + (this.u - ☃) * ☃ + (this.V.nextDouble() - 0.5D) * this.J * 2.0D;
        this.o.a(cy.y, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
      }
      this.o.a(☃, ☃, ☃, "mob.endermen.portal", 1.0F, 1.0F);
      a("mob.endermen.portal", 1.0F, 1.0F);
      
      return true;
    }
    b(☃, ☃, ☃);
    return false;
  }
  
  protected String z()
  {
    return co() ? "mob.endermen.scream" : "mob.endermen.idle";
  }
  
  protected String bo()
  {
    return "mob.endermen.hit";
  }
  
  protected String bp()
  {
    return "mob.endermen.death";
  }
  
  protected zw A()
  {
    return zy.bu;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    zw ☃ = A();
    if (☃ != null)
    {
      int ☃ = this.V.nextInt(2 + ☃);
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(☃, 1);
      }
    }
  }
  
  public void a(alz ☃)
  {
    this.ac.b(16, Short.valueOf((short)(afh.f(☃) & 0xFFFF)));
  }
  
  public alz cm()
  {
    return afh.d(this.ac.b(16) & 0xFFFF);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((☃.j() == null) || (!(☃.j() instanceof vp)))
    {
      if (!this.o.D) {
        a(true);
      }
      if (((☃ instanceof ox)) && ((☃.j() instanceof wn))) {
        if (((☃.j() instanceof lf)) && (((lf)☃.j()).c.d())) {
          a(false);
        } else {
          this.bm = true;
        }
      }
      if ((☃ instanceof oy))
      {
        this.bm = false;
        for (int ☃ = 0; ☃ < 64; ☃++) {
          if (n()) {
            return true;
          }
        }
        return false;
      }
    }
    boolean ☃ = super.a(☃, ☃);
    if ((☃.e()) && (this.V.nextInt(10) != 0)) {
      n();
    }
    return ☃;
  }
  
  public boolean co()
  {
    return this.ac.a(18) > 0;
  }
  
  public void a(boolean ☃)
  {
    this.ac.b(18, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  static class b
    extends sp
  {
    private wn g;
    private int h;
    private int i;
    private vo j;
    
    public b(vo ☃)
    {
      super(wn.class, true);
      this.j = ☃;
    }
    
    public boolean a()
    {
      double ☃ = f();
      List<wn> ☃ = this.e.o.a(wn.class, this.e.aR().b(☃, 4.0D, ☃), this.c);
      Collections.sort(☃, this.b);
      if (☃.isEmpty()) {
        return false;
      }
      this.g = ((wn)☃.get(0));
      return true;
    }
    
    public void c()
    {
      this.h = 5;
      this.i = 0;
    }
    
    public void d()
    {
      this.g = null;
      this.j.a(false);
      
      qc ☃ = this.j.a(vy.d);
      ☃.c(vo.cp());
      
      super.d();
    }
    
    public boolean b()
    {
      if (this.g != null)
      {
        if (!vo.a(this.j, this.g)) {
          return false;
        }
        vo.a(this.j, true);
        this.j.a(this.g, 10.0F, 10.0F);
        return true;
      }
      return super.b();
    }
    
    public void e()
    {
      if (this.g != null)
      {
        if (--this.h <= 0)
        {
          this.d = this.g;
          this.g = null;
          super.c();
          
          this.j.a("mob.endermen.stare", 1.0F, 1.0F);
          this.j.a(true);
          
          qc ☃ = this.j.a(vy.d);
          ☃.b(vo.cp());
        }
      }
      else
      {
        if (this.d != null) {
          if (((this.d instanceof wn)) && (vo.a(this.j, (wn)this.d)))
          {
            if (this.d.h(this.j) < 16.0D) {
              this.j.n();
            }
            this.i = 0;
          }
          else if ((this.d.h(this.j) > 256.0D) && 
            (this.i++ >= 30) && 
            (this.j.b(this.d)))
          {
            this.i = 0;
          }
        }
        super.e();
      }
    }
  }
  
  static class a
    extends rd
  {
    private vo a;
    
    public a(vo ☃)
    {
      this.a = ☃;
    }
    
    public boolean a()
    {
      if (!this.a.o.Q().b("mobGriefing")) {
        return false;
      }
      if (this.a.cm().c().t() == arm.a) {
        return false;
      }
      if (this.a.bc().nextInt(2000) != 0) {
        return false;
      }
      return true;
    }
    
    public void e()
    {
      Random ☃ = this.a.bc();
      adm ☃ = this.a.o;
      
      int ☃ = ns.c(this.a.s - 1.0D + ☃.nextDouble() * 2.0D);
      int ☃ = ns.c(this.a.t + ☃.nextDouble() * 2.0D);
      int ☃ = ns.c(this.a.u - 1.0D + ☃.nextDouble() * 2.0D);
      cj ☃ = new cj(☃, ☃, ☃);
      afh ☃ = ☃.p(☃).c();
      afh ☃ = ☃.p(☃.b()).c();
      if (a(☃, ☃, this.a.cm().c(), ☃, ☃))
      {
        ☃.a(☃, this.a.cm(), 3);
        this.a.a(afi.a.Q());
      }
    }
    
    private boolean a(adm ☃, cj ☃, afh ☃, afh ☃, afh ☃)
    {
      if (!☃.d(☃, ☃)) {
        return false;
      }
      if (☃.t() != arm.a) {
        return false;
      }
      if (☃.t() == arm.a) {
        return false;
      }
      if (!☃.d()) {
        return false;
      }
      return true;
    }
  }
  
  static class c
    extends rd
  {
    private vo a;
    
    public c(vo ☃)
    {
      this.a = ☃;
    }
    
    public boolean a()
    {
      if (!this.a.o.Q().b("mobGriefing")) {
        return false;
      }
      if (this.a.cm().c().t() != arm.a) {
        return false;
      }
      if (this.a.bc().nextInt(20) != 0) {
        return false;
      }
      return true;
    }
    
    public void e()
    {
      Random ☃ = this.a.bc();
      adm ☃ = this.a.o;
      
      int ☃ = ns.c(this.a.s - 2.0D + ☃.nextDouble() * 4.0D);
      int ☃ = ns.c(this.a.t + ☃.nextDouble() * 3.0D);
      int ☃ = ns.c(this.a.u - 2.0D + ☃.nextDouble() * 4.0D);
      cj ☃ = new cj(☃, ☃, ☃);
      alz ☃ = ☃.p(☃);
      afh ☃ = ☃.c();
      if (vo.cq().contains(☃))
      {
        this.a.a(☃);
        ☃.a(☃, afi.a.Q());
      }
    }
  }
}
