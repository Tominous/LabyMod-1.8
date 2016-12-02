import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

public class bec
{
  private static final jy b = new jy("textures/particle/particles.png");
  protected adm a;
  private List<beb>[][] c = new List[4][];
  private List<bep> d = Lists.newArrayList();
  private bmj e;
  private Random f = new Random();
  private Map<Integer, bed> g = Maps.newHashMap();
  
  public bec(adm ☃, bmj ☃)
  {
    this.a = ☃;
    this.e = ☃;
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      this.c[☃] = new List[2];
      for (int ☃ = 0; ☃ < 2; ☃++) {
        this.c[☃][☃] = Lists.newArrayList();
      }
    }
    c();
  }
  
  private void c()
  {
    a(cy.a.c(), new bdp.a());
    a(cy.e.c(), new bdl.a());
    a(cy.f.c(), new bek.a());
    a(cy.g.c(), new beq.a());
    a(cy.N.c(), new ber.a());
    a(cy.h.c(), new bel.a());
    a(cy.i.c(), new bem.b());
    a(cy.j.c(), new bdm.b());
    a(cy.k.c(), new bdm.a());
    a(cy.l.c(), new beh.a());
    a(cy.m.c(), new bdx.a());
    a(cy.n.c(), new bej.d());
    a(cy.o.c(), new bej.b());
    a(cy.p.c(), new bej.c());
    a(cy.q.c(), new bej.a());
    a(cy.r.c(), new bej.e());
    a(cy.s.c(), new bdn.b());
    a(cy.t.c(), new bdn.a());
    a(cy.u.c(), new bdt.a());
    a(cy.v.c(), new bem.a());
    a(cy.w.c(), new bem.b());
    a(cy.x.c(), new bea.a());
    a(cy.y.c(), new bef.a());
    a(cy.z.c(), new bdo.a());
    a(cy.A.c(), new bdr.a());
    a(cy.B.c(), new bdy.a());
    a(cy.C.c(), new bds.a());
    a(cy.D.c(), new bee.a());
    a(cy.E.c(), new beg.a());
    a(cy.F.c(), new bdk.c());
    a(cy.G.c(), new bei.a());
    a(cy.H.c(), new bdk.b());
    a(cy.I.c(), new bdt.b());
    a(cy.J.c(), new bdj.a());
    a(cy.K.c(), new bdk.a());
    a(cy.L.c(), new beo.a());
    a(cy.M.c(), new ben.a());
    a(cy.c.c(), new bdv.a());
    a(cy.b.c(), new bdu.a());
    a(cy.d.c(), new bdq.d());
    a(cy.P.c(), new bdz.a());
  }
  
  public void a(int ☃, bed ☃)
  {
    this.g.put(Integer.valueOf(☃), ☃);
  }
  
  public void a(pk ☃, cy ☃)
  {
    this.d.add(new bep(this.a, ☃, ☃));
  }
  
  public beb a(int ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    bed ☃ = (bed)this.g.get(Integer.valueOf(☃));
    if (☃ != null)
    {
      beb ☃ = ☃.a(☃, this.a, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      if (☃ != null)
      {
        a(☃);
        return ☃;
      }
    }
    return null;
  }
  
  public void a(beb ☃)
  {
    int ☃ = ☃.a();
    int ☃ = ☃.j() != 1.0F ? 0 : 1;
    if (this.c[☃][☃].size() >= 4000) {
      this.c[☃][☃].remove(0);
    }
    this.c[☃][☃].add(☃);
  }
  
  public void a()
  {
    for (int ☃ = 0; ☃ < 4; ☃++) {
      a(☃);
    }
    List<bep> ☃ = Lists.newArrayList();
    for (bep ☃ : this.d)
    {
      ☃.t_();
      if (☃.I) {
        ☃.add(☃);
      }
    }
    this.d.removeAll(☃);
  }
  
  private void a(int ☃)
  {
    for (int ☃ = 0; ☃ < 2; ☃++) {
      a(this.c[☃][☃]);
    }
  }
  
  private void a(List<beb> ☃)
  {
    List<beb> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      beb ☃ = (beb)☃.get(☃);
      d(☃);
      if (☃.I) {
        ☃.add(☃);
      }
    }
    ☃.removeAll(☃);
  }
  
  private void d(final beb ☃)
  {
    try
    {
      ☃.t_();
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Ticking Particle");
      c ☃ = ☃.a("Particle being ticked");
      final int ☃ = ☃.a();
      
      ☃.a("Particle", new Callable()
      {
        public String a()
          throws Exception
        {
          return ☃.toString();
        }
      });
      ☃.a("Particle Type", new Callable()
      {
        public String a()
          throws Exception
        {
          if (☃ == 0) {
            return "MISC_TEXTURE";
          }
          if (☃ == 1) {
            return "TERRAIN_TEXTURE";
          }
          if (☃ == 3) {
            return "ENTITY_PARTICLE_TEXTURE";
          }
          return "Unknown - " + ☃;
        }
      });
      throw new e(☃);
    }
  }
  
  public void a(pk ☃, float ☃)
  {
    float ☃ = auz.b();
    float ☃ = auz.d();
    
    float ☃ = auz.e();
    float ☃ = auz.f();
    float ☃ = auz.c();
    
    beb.aw = ☃.P + (☃.s - ☃.P) * ☃;
    beb.ax = ☃.Q + (☃.t - ☃.Q) * ☃;
    beb.ay = ☃.R + (☃.u - ☃.R) * ☃;
    
    bfl.l();
    bfl.b(770, 771);
    bfl.a(516, 0.003921569F);
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 2; ☃++) {
        if (!this.c[☃][☃].isEmpty())
        {
          switch (☃)
          {
          case 0: 
            bfl.a(false);
            break;
          case 1: 
            bfl.a(true);
          }
          switch (☃)
          {
          case 0: 
          default: 
            this.e.a(b);
            break;
          case 1: 
            this.e.a(bmh.g);
          }
          bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
          
          bfx ☃ = bfx.a();
          bfd ☃ = ☃.c();
          ☃.a(7, bms.d);
          for (int ☃ = 0; ☃ < this.c[☃][☃].size(); ☃++)
          {
            final beb ☃ = (beb)this.c[☃][☃].get(☃);
            try
            {
              ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
            }
            catch (Throwable ☃)
            {
              b ☃ = b.a(☃, "Rendering Particle");
              c ☃ = ☃.a("Particle being rendered");
              final int ☃ = ☃;
              
              ☃.a("Particle", new Callable()
              {
                public String a()
                  throws Exception
                {
                  return ☃.toString();
                }
              });
              ☃.a("Particle Type", new Callable()
              {
                public String a()
                  throws Exception
                {
                  if (☃ == 0) {
                    return "MISC_TEXTURE";
                  }
                  if (☃ == 1) {
                    return "TERRAIN_TEXTURE";
                  }
                  if (☃ == 3) {
                    return "ENTITY_PARTICLE_TEXTURE";
                  }
                  return "Unknown - " + ☃;
                }
              });
              throw new e(☃);
            }
          }
          ☃.b();
        }
      }
    }
    bfl.a(true);
    bfl.k();
    bfl.a(516, 0.1F);
  }
  
  public void b(pk ☃, float ☃)
  {
    float ☃ = 0.017453292F;
    float ☃ = ns.b(☃.y * 0.017453292F);
    float ☃ = ns.a(☃.y * 0.017453292F);
    
    float ☃ = -☃ * ns.a(☃.z * 0.017453292F);
    float ☃ = ☃ * ns.a(☃.z * 0.017453292F);
    float ☃ = ns.b(☃.z * 0.017453292F);
    for (int ☃ = 0; ☃ < 2; ☃++)
    {
      List<beb> ☃ = this.c[3][☃];
      if (!☃.isEmpty())
      {
        bfx ☃ = bfx.a();
        bfd ☃ = ☃.c();
        for (int ☃ = 0; ☃ < ☃.size(); ☃++)
        {
          beb ☃ = (beb)☃.get(☃);
          
          ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
        }
      }
    }
  }
  
  public void a(adm ☃)
  {
    this.a = ☃;
    for (int ☃ = 0; ☃ < 4; ☃++) {
      for (int ☃ = 0; ☃ < 2; ☃++) {
        this.c[☃][☃].clear();
      }
    }
    this.d.clear();
  }
  
  public void a(cj ☃, alz ☃)
  {
    if (☃.c().t() == arm.a) {
      return;
    }
    ☃ = ☃.c().a(☃, this.a, ☃);
    
    int ☃ = 4;
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          double ☃ = ☃.n() + (☃ + 0.5D) / ☃;
          double ☃ = ☃.o() + (☃ + 0.5D) / ☃;
          double ☃ = ☃.p() + (☃ + 0.5D) / ☃;
          a(new beo(this.a, ☃, ☃, ☃, ☃ - ☃.n() - 0.5D, ☃ - ☃.o() - 0.5D, ☃ - ☃.p() - 0.5D, ☃).a(☃));
        }
      }
    }
  }
  
  public void a(cj ☃, cq ☃)
  {
    alz ☃ = this.a.p(☃);
    afh ☃ = ☃.c();
    if (☃.b() == -1) {
      return;
    }
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    
    float ☃ = 0.1F;
    double ☃ = ☃ + this.f.nextDouble() * (☃.C() - ☃.B() - ☃ * 2.0F) + ☃ + ☃.B();
    double ☃ = ☃ + this.f.nextDouble() * (☃.E() - ☃.D() - ☃ * 2.0F) + ☃ + ☃.D();
    double ☃ = ☃ + this.f.nextDouble() * (☃.G() - ☃.F() - ☃ * 2.0F) + ☃ + ☃.F();
    if (☃ == cq.a) {
      ☃ = ☃ + ☃.D() - ☃;
    }
    if (☃ == cq.b) {
      ☃ = ☃ + ☃.E() + ☃;
    }
    if (☃ == cq.c) {
      ☃ = ☃ + ☃.F() - ☃;
    }
    if (☃ == cq.d) {
      ☃ = ☃ + ☃.G() + ☃;
    }
    if (☃ == cq.e) {
      ☃ = ☃ + ☃.B() - ☃;
    }
    if (☃ == cq.f) {
      ☃ = ☃ + ☃.C() + ☃;
    }
    a(new beo(this.a, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, ☃).a(☃).a(0.2F).h(0.6F));
  }
  
  public void b(beb ☃)
  {
    a(☃, 1, 0);
  }
  
  public void c(beb ☃)
  {
    a(☃, 0, 1);
  }
  
  private void a(beb ☃, int ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < 4; ☃++) {
      if (this.c[☃][☃].contains(☃))
      {
        this.c[☃][☃].remove(☃);
        this.c[☃][☃].add(☃);
      }
    }
  }
  
  public String b()
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < 4; ☃++) {
      for (int ☃ = 0; ☃ < 2; ☃++) {
        ☃ += this.c[☃][☃].size();
      }
    }
    return "" + ☃;
  }
}
