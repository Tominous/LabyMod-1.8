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
    S = 1.0F;
    
    i.a(0, new ra(this));
    i.a(2, new rl(this, 1.0D, false));
    
    i.a(7, new rz(this, 1.0D));
    i.a(8, new ri(this, wn.class, 8.0F));
    i.a(8, new ry(this));
    
    i.a(10, new vo.a(this));
    i.a(11, new vo.c(this));
    
    bi.a(1, new sm(this, false, new Class[0]));
    bi.a(2, new vo.b(this));
    bi.a(3, new sp(this, vp.class, 10, true, false, new Predicate()
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
    
    ac.a(16, new Short((short)0));
    ac.a(17, new Byte((byte)0));
    ac.a(18, new Byte((byte)0));
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
    zx ☃ = bi.b[3];
    if ((☃ != null) && (☃.b() == zw.a(afi.aU))) {
      return false;
    }
    aui ☃ = ☃.d(1.0F).a();
    aui ☃ = new aui(s - s, aRb + K / 2.0F - (t + ☃.aS()), u - u);
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
    if (o.D) {
      for (int ☃ = 0; ☃ < 2; ☃++) {
        o.a(cy.y, s + (V.nextDouble() - 0.5D) * J, t + V.nextDouble() * K - 0.25D, u + (V.nextDouble() - 0.5D) * J, (V.nextDouble() - 0.5D) * 2.0D, -V.nextDouble(), (V.nextDouble() - 0.5D) * 2.0D, new int[0]);
      }
    }
    aY = false;
    
    super.m();
  }
  
  protected void E()
  {
    if (U()) {
      a(ow.f, 1.0F);
    }
    if ((co()) && (!bm) && (V.nextInt(100) == 0)) {
      a(false);
    }
    if (o.w())
    {
      float ☃ = c(1.0F);
      if ((☃ > 0.5F) && 
        (o.i(new cj(this))) && (V.nextFloat() * 30.0F < (☃ - 0.4F) * 2.0F))
      {
        d(null);
        a(false);
        bm = false;
        n();
      }
    }
    super.E();
  }
  
  protected boolean n()
  {
    double ☃ = s + (V.nextDouble() - 0.5D) * 64.0D;
    double ☃ = t + (V.nextInt(64) - 32);
    double ☃ = u + (V.nextDouble() - 0.5D) * 64.0D;
    return k(☃, ☃, ☃);
  }
  
  protected boolean b(pk ☃)
  {
    aui ☃ = new aui(s - s, aRb + K / 2.0F - t + ☃.aS(), u - u);
    ☃ = ☃.a();
    double ☃ = 16.0D;
    double ☃ = s + (V.nextDouble() - 0.5D) * 8.0D - a * ☃;
    double ☃ = t + (V.nextInt(16) - 8) - b * ☃;
    double ☃ = u + (V.nextDouble() - 0.5D) * 8.0D - c * ☃;
    return k(☃, ☃, ☃);
  }
  
  protected boolean k(double ☃, double ☃, double ☃)
  {
    double ☃ = s;
    double ☃ = t;
    double ☃ = u;
    
    s = ☃;
    t = ☃;
    u = ☃;
    boolean ☃ = false;
    cj ☃ = new cj(s, t, u);
    if (o.e(☃))
    {
      boolean ☃ = false;
      while ((!☃) && (☃.o() > 0))
      {
        cj ☃ = ☃.b();
        afh ☃ = o.p(☃).c();
        if (☃.t().c())
        {
          ☃ = true;
        }
        else
        {
          t -= 1.0D;
          ☃ = ☃;
        }
      }
      if (☃)
      {
        super.a(s, t, u);
        if ((o.a(this, aR()).isEmpty()) && (!o.d(aR()))) {
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
        float ☃ = (V.nextFloat() - 0.5F) * 0.2F;
        float ☃ = (V.nextFloat() - 0.5F) * 0.2F;
        float ☃ = (V.nextFloat() - 0.5F) * 0.2F;
        
        double ☃ = ☃ + (s - ☃) * ☃ + (V.nextDouble() - 0.5D) * J * 2.0D;
        double ☃ = ☃ + (t - ☃) * ☃ + V.nextDouble() * K;
        double ☃ = ☃ + (u - ☃) * ☃ + (V.nextDouble() - 0.5D) * J * 2.0D;
        o.a(cy.y, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
      }
      o.a(☃, ☃, ☃, "mob.endermen.portal", 1.0F, 1.0F);
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
      int ☃ = V.nextInt(2 + ☃);
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(☃, 1);
      }
    }
  }
  
  public void a(alz ☃)
  {
    ac.b(16, Short.valueOf((short)(afh.f(☃) & 0xFFFF)));
  }
  
  public alz cm()
  {
    return afh.d(ac.b(16) & 0xFFFF);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((☃.j() == null) || (!(☃.j() instanceof vp)))
    {
      if (!o.D) {
        a(true);
      }
      if (((☃ instanceof ox)) && ((☃.j() instanceof wn))) {
        if (((☃.j() instanceof lf)) && (jc.d())) {
          a(false);
        } else {
          bm = true;
        }
      }
      if ((☃ instanceof oy))
      {
        bm = false;
        for (int ☃ = 0; ☃ < 64; ☃++) {
          if (n()) {
            return true;
          }
        }
        return false;
      }
    }
    boolean ☃ = super.a(☃, ☃);
    if ((☃.e()) && (V.nextInt(10) != 0)) {
      n();
    }
    return ☃;
  }
  
  public boolean co()
  {
    return ac.a(18) > 0;
  }
  
  public void a(boolean ☃)
  {
    ac.b(18, Byte.valueOf((byte)(☃ ? 1 : 0)));
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
      j = ☃;
    }
    
    public boolean a()
    {
      double ☃ = f();
      List<wn> ☃ = e.o.a(wn.class, e.aR().b(☃, 4.0D, ☃), c);
      Collections.sort(☃, b);
      if (☃.isEmpty()) {
        return false;
      }
      g = ((wn)☃.get(0));
      return true;
    }
    
    public void c()
    {
      h = 5;
      i = 0;
    }
    
    public void d()
    {
      g = null;
      j.a(false);
      
      qc ☃ = j.a(vy.d);
      ☃.c(vo.cp());
      
      super.d();
    }
    
    public boolean b()
    {
      if (g != null)
      {
        if (!vo.a(j, g)) {
          return false;
        }
        vo.a(j, true);
        j.a(g, 10.0F, 10.0F);
        return true;
      }
      return super.b();
    }
    
    public void e()
    {
      if (g != null)
      {
        if (--h <= 0)
        {
          d = g;
          g = null;
          super.c();
          
          j.a("mob.endermen.stare", 1.0F, 1.0F);
          j.a(true);
          
          qc ☃ = j.a(vy.d);
          ☃.b(vo.cp());
        }
      }
      else
      {
        if (d != null) {
          if (((d instanceof wn)) && (vo.a(j, (wn)d)))
          {
            if (d.h(j) < 16.0D) {
              j.n();
            }
            i = 0;
          }
          else if ((d.h(j) > 256.0D) && 
            (i++ >= 30) && 
            (j.b(d)))
          {
            i = 0;
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
      a = ☃;
    }
    
    public boolean a()
    {
      if (!a.o.Q().b("mobGriefing")) {
        return false;
      }
      if (a.cm().c().t() == arm.a) {
        return false;
      }
      if (a.bc().nextInt(2000) != 0) {
        return false;
      }
      return true;
    }
    
    public void e()
    {
      Random ☃ = a.bc();
      adm ☃ = a.o;
      
      int ☃ = ns.c(a.s - 1.0D + ☃.nextDouble() * 2.0D);
      int ☃ = ns.c(a.t + ☃.nextDouble() * 2.0D);
      int ☃ = ns.c(a.u - 1.0D + ☃.nextDouble() * 2.0D);
      cj ☃ = new cj(☃, ☃, ☃);
      afh ☃ = ☃.p(☃).c();
      afh ☃ = ☃.p(☃.b()).c();
      if (a(☃, ☃, a.cm().c(), ☃, ☃))
      {
        ☃.a(☃, a.cm(), 3);
        a.a(afi.a.Q());
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
      a = ☃;
    }
    
    public boolean a()
    {
      if (!a.o.Q().b("mobGriefing")) {
        return false;
      }
      if (a.cm().c().t() != arm.a) {
        return false;
      }
      if (a.bc().nextInt(20) != 0) {
        return false;
      }
      return true;
    }
    
    public void e()
    {
      Random ☃ = a.bc();
      adm ☃ = a.o;
      
      int ☃ = ns.c(a.s - 2.0D + ☃.nextDouble() * 4.0D);
      int ☃ = ns.c(a.t + ☃.nextDouble() * 3.0D);
      int ☃ = ns.c(a.u - 2.0D + ☃.nextDouble() * 4.0D);
      cj ☃ = new cj(☃, ☃, ☃);
      alz ☃ = ☃.p(☃);
      afh ☃ = ☃.c();
      if (vo.cq().contains(☃))
      {
        a.a(☃);
        ☃.a(☃, afi.a.Q());
      }
    }
  }
}
