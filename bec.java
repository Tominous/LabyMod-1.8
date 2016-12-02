import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

public class bec
{
  private static final jy b = new jy("textures/particle/particles.png");
  protected adm a;
  private List[][] c = new List[4][];
  private List d = Lists.newArrayList();
  private bmj e;
  private Random f = new Random();
  private Map g = Maps.newHashMap();
  private static final String __OBFID = "CL_00000915";
  
  public bec(adm worldIn, bmj p_i1220_2_)
  {
    a = worldIn;
    e = p_i1220_2_;
    for (int var3 = 0; var3 < 4; var3++)
    {
      c[var3] = new List[2];
      for (int var4 = 0; var4 < 2; var4++) {
        c[var3][var4] = Lists.newArrayList();
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
  
  public void a(int p_178929_1_, bed p_178929_2_)
  {
    g.put(Integer.valueOf(p_178929_1_), p_178929_2_);
  }
  
  public void a(pk p_178926_1_, cy p_178926_2_)
  {
    d.add(new bep(a, p_178926_1_, p_178926_2_));
  }
  
  public beb a(int p_178927_1_, double p_178927_2_, double p_178927_4_, double p_178927_6_, double p_178927_8_, double p_178927_10_, double p_178927_12_, int... p_178927_14_)
  {
    bed var15 = (bed)g.get(Integer.valueOf(p_178927_1_));
    if (var15 != null)
    {
      beb var16 = var15.a(p_178927_1_, a, p_178927_2_, p_178927_4_, p_178927_6_, p_178927_8_, p_178927_10_, p_178927_12_, p_178927_14_);
      if (var16 != null)
      {
        a(var16);
        return var16;
      }
    }
    return null;
  }
  
  public void a(beb p_78873_1_)
  {
    if (p_78873_1_ == null) {
      return;
    }
    if (((p_78873_1_ instanceof bdq.b)) && (!Config.isFireworkParticles())) {
      return;
    }
    int var2 = p_78873_1_.a();
    int var3 = p_78873_1_.j() != 1.0F ? 0 : 1;
    if (c[var2][var3].size() >= 4000) {
      c[var2][var3].remove(0);
    }
    c[var2][var3].add(p_78873_1_);
  }
  
  public void a()
  {
    for (int var1 = 0; var1 < 4; var1++) {
      a(var1);
    }
    ArrayList var4 = Lists.newArrayList();
    Iterator var2 = d.iterator();
    while (var2.hasNext())
    {
      bep var3 = (bep)var2.next();
      var3.t_();
      if (I) {
        var4.add(var3);
      }
    }
    d.removeAll(var4);
  }
  
  private void a(int p_178922_1_)
  {
    for (int var2 = 0; var2 < 2; var2++) {
      a(c[p_178922_1_][var2]);
    }
  }
  
  private void a(List p_178925_1_)
  {
    ArrayList var2 = Lists.newArrayList();
    for (int var3 = 0; var3 < p_178925_1_.size(); var3++)
    {
      beb var4 = (beb)p_178925_1_.get(var3);
      d(var4);
      if (I) {
        var2.add(var4);
      }
    }
    p_178925_1_.removeAll(var2);
  }
  
  private void d(final beb p_178923_1_)
  {
    try
    {
      p_178923_1_.t_();
    }
    catch (Throwable var6)
    {
      b var3 = b.a(var6, "Ticking Particle");
      c var4 = var3.a("Particle being ticked");
      final int var5 = p_178923_1_.a();
      var4.a("Particle", new Callable()
      {
        private static final String __OBFID = "CL_00000916";
        
        public String a()
          throws Exception
        {
          return p_178923_1_.toString();
        }
      });
      var4.a("Particle Type", new Callable()
      {
        private static final String __OBFID = "CL_00000917";
        
        public String a()
          throws Exception
        {
          return "Unknown - " + var5;
        }
      });
      throw new e(var3);
    }
  }
  
  public void a(pk p_78874_1_, float partialTicks)
  {
    float var3 = auz.b();
    float var4 = auz.d();
    float var5 = auz.e();
    float var6 = auz.f();
    float var7 = auz.c();
    beb.aw = P + (s - P) * partialTicks;
    beb.ax = Q + (t - Q) * partialTicks;
    beb.ay = R + (u - R) * partialTicks;
    bfl.l();
    bfl.b(770, 771);
    bfl.a(516, 0.003921569F);
    for (int var8_nf = 0; var8_nf < 3; var8_nf++)
    {
      final int var8 = var8_nf;
      for (int var9 = 0; var9 < 2; var9++) {
        if (!c[var8][var9].isEmpty())
        {
          switch (var9)
          {
          case 0: 
            bfl.a(false);
            break;
          case 1: 
            bfl.a(true);
          }
          switch (var8)
          {
          case 0: 
          default: 
            e.a(b);
            break;
          case 1: 
            e.a(bmh.g);
          }
          bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
          bfx var10 = bfx.a();
          bfd var11 = var10.c();
          var11.a(7, bms.d);
          for (int var12 = 0; var12 < c[var8][var9].size(); var12++)
          {
            final beb var13 = (beb)c[var8][var9].get(var12);
            try
            {
              var13.a(var11, p_78874_1_, partialTicks, var3, var7, var4, var5, var6);
            }
            catch (Throwable var18)
            {
              b var15 = b.a(var18, "Rendering Particle");
              c var16 = var15.a("Particle being rendered");
              var16.a("Particle", new Callable()
              {
                private static final String __OBFID = "CL_00000918";
                
                public String a()
                  throws Exception
                {
                  return var13.toString();
                }
              });
              var16.a("Particle Type", new Callable()
              {
                private static final String __OBFID = "CL_00000919";
                
                public String a()
                  throws Exception
                {
                  return "Unknown - " + var8;
                }
              });
              throw new e(var15);
            }
          }
          var10.b();
        }
      }
    }
    bfl.a(true);
    bfl.k();
    bfl.a(516, 0.1F);
  }
  
  public void b(pk p_78872_1_, float p_78872_2_)
  {
    float var3 = 0.017453292F;
    float var4 = ns.b(y * 0.017453292F);
    float var5 = ns.a(y * 0.017453292F);
    float var6 = -var5 * ns.a(z * 0.017453292F);
    float var7 = var4 * ns.a(z * 0.017453292F);
    float var8 = ns.b(z * 0.017453292F);
    for (int var9 = 0; var9 < 2; var9++)
    {
      List var10 = c[3][var9];
      if (!var10.isEmpty())
      {
        bfx var11 = bfx.a();
        bfd var12 = var11.c();
        for (int var13 = 0; var13 < var10.size(); var13++)
        {
          beb var14 = (beb)var10.get(var13);
          var14.a(var12, p_78872_1_, p_78872_2_, var4, var8, var5, var6, var7);
        }
      }
    }
  }
  
  public void a(adm worldIn)
  {
    a = worldIn;
    for (int var2 = 0; var2 < 4; var2++) {
      for (int var3 = 0; var3 < 2; var3++) {
        c[var2][var3].clear();
      }
    }
    d.clear();
  }
  
  public void a(cj p_180533_1_, alz p_180533_2_)
  {
    boolean notAir;
    boolean notAir;
    if ((Reflector.ForgeBlock_addDestroyEffects.exists()) && (Reflector.ForgeBlock_isAir.exists()))
    {
      afh block = p_180533_2_.c();
      boolean forgeIsAir = Reflector.callBoolean(block, Reflector.ForgeBlock_isAir, new Object[] { a, p_180533_1_ });
      if (!Reflector.callBoolean(block, Reflector.ForgeBlock_isAir, new Object[] { a, p_180533_1_ })) {}
      notAir = !Reflector.callBoolean(block, Reflector.ForgeBlock_addDestroyEffects, new Object[] { a, p_180533_1_, this });
    }
    else
    {
      notAir = p_180533_2_.c().t() != arm.a;
    }
    if (notAir)
    {
      p_180533_2_ = p_180533_2_.c().a(p_180533_2_, a, p_180533_1_);
      byte var3 = 4;
      for (int var4 = 0; var4 < var3; var4++) {
        for (int var5 = 0; var5 < var3; var5++) {
          for (int var6 = 0; var6 < var3; var6++)
          {
            double var7 = p_180533_1_.n() + (var4 + 0.5D) / var3;
            double var9 = p_180533_1_.o() + (var5 + 0.5D) / var3;
            double var11 = p_180533_1_.p() + (var6 + 0.5D) / var3;
            a(new beo(a, var7, var9, var11, var7 - p_180533_1_.n() - 0.5D, var9 - p_180533_1_.o() - 0.5D, var11 - p_180533_1_.p() - 0.5D, p_180533_2_).a(p_180533_1_));
          }
        }
      }
    }
  }
  
  public void a(cj p_180532_1_, cq p_180532_2_)
  {
    alz var3 = a.p(p_180532_1_);
    afh var4 = var3.c();
    if (var4.b() != -1)
    {
      int var5 = p_180532_1_.n();
      int var6 = p_180532_1_.o();
      int var7 = p_180532_1_.p();
      float var8 = 0.1F;
      double var9 = var5 + f.nextDouble() * (var4.C() - var4.B() - var8 * 2.0F) + var8 + var4.B();
      double var11 = var6 + f.nextDouble() * (var4.E() - var4.D() - var8 * 2.0F) + var8 + var4.D();
      double var13 = var7 + f.nextDouble() * (var4.G() - var4.F() - var8 * 2.0F) + var8 + var4.F();
      if (p_180532_2_ == cq.a) {
        var11 = var6 + var4.D() - var8;
      }
      if (p_180532_2_ == cq.b) {
        var11 = var6 + var4.E() + var8;
      }
      if (p_180532_2_ == cq.c) {
        var13 = var7 + var4.F() - var8;
      }
      if (p_180532_2_ == cq.d) {
        var13 = var7 + var4.G() + var8;
      }
      if (p_180532_2_ == cq.e) {
        var9 = var5 + var4.B() - var8;
      }
      if (p_180532_2_ == cq.f) {
        var9 = var5 + var4.C() + var8;
      }
      a(new beo(a, var9, var11, var13, 0.0D, 0.0D, 0.0D, var3).a(p_180532_1_).a(0.2F).h(0.6F));
    }
  }
  
  public void b(beb p_178928_1_)
  {
    a(p_178928_1_, 1, 0);
  }
  
  public void c(beb p_178931_1_)
  {
    a(p_178931_1_, 0, 1);
  }
  
  private void a(beb p_178924_1_, int p_178924_2_, int p_178924_3_)
  {
    for (int var4 = 0; var4 < 4; var4++) {
      if (c[var4][p_178924_2_].contains(p_178924_1_))
      {
        c[var4][p_178924_2_].remove(p_178924_1_);
        c[var4][p_178924_3_].add(p_178924_1_);
      }
    }
  }
  
  public String b()
  {
    int var1 = 0;
    for (int var2 = 0; var2 < 4; var2++) {
      for (int var3 = 0; var3 < 2; var3++) {
        var1 += c[var2][var3].size();
      }
    }
    return "" + var1;
  }
  
  public void addBlockHitEffects(cj pos, auh target)
  {
    afh block = a.p(pos).c();
    
    boolean blockAddHitEffects = Reflector.callBoolean(block, Reflector.ForgeBlock_addHitEffects, new Object[] { a, target, this });
    if ((block != null) && (!blockAddHitEffects)) {
      a(pos, b);
    }
  }
}
