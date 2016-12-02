import com.mojang.authlib.GameProfile;
import java.io.PrintStream;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kb
{
  private static final PrintStream a = System.out;
  private static boolean b = false;
  private static final Logger c = LogManager.getLogger();
  
  public static boolean a()
  {
    return b;
  }
  
  static void b()
  {
    agg.N.a(zy.g, new ka()
    {
      protected wv a(adm ☃, cz ☃)
      {
        wq ☃ = new wq(☃, ☃.a(), ☃.b(), ☃.c());
        a = 1;
        
        return ☃;
      }
    });
    agg.N.a(zy.aP, new ka()
    {
      protected wv a(adm ☃, cz ☃)
      {
        return new wz(☃, ☃.a(), ☃.b(), ☃.c());
      }
    });
    agg.N.a(zy.aD, new ka()
    {
      protected wv a(adm ☃, cz ☃)
      {
        return new wx(☃, ☃.a(), ☃.b(), ☃.c());
      }
    });
    agg.N.a(zy.bK, new ka()
    {
      protected wv a(adm ☃, cz ☃)
      {
        return new xb(☃, ☃.a(), ☃.b(), ☃.c());
      }
      
      protected float a()
      {
        return super.a() * 0.5F;
      }
      
      protected float b()
      {
        return super.b() * 1.25F;
      }
    });
    agg.N.a(zy.bz, new cr()
    {
      private final cn b = new cn();
      
      public zx a(ck ☃, final zx ☃)
      {
        if (aai.f(☃.i())) {
          new ka()
          {
            protected wv a(adm ☃, cz ☃)
            {
              return new xc(☃, ☃.a(), ☃.b(), ☃.c(), ☃.k());
            }
            
            protected float a()
            {
              return super.a() * 0.5F;
            }
            
            protected float b()
            {
              return super.b() * 1.25F;
            }
          }.a(☃, ☃);
        }
        return b.a(☃, ☃);
      }
    });
    agg.N.a(zy.bJ, new cn()
    {
      public zx b(ck ☃, zx ☃)
      {
        cq ☃ = agg.b(☃.f());
        
        double ☃ = ☃.a() + ☃.g();
        double ☃ = ☃.d().o() + 0.2F;
        double ☃ = ☃.c() + ☃.i();
        
        pk ☃ = aax.a(☃.i(), ☃.i(), ☃, ☃, ☃);
        if (((☃ instanceof pr)) && (☃.s())) {
          ((ps)☃).a(☃.q());
        }
        ☃.a(1);
        return ☃;
      }
    });
    agg.N.a(zy.cb, new cn()
    {
      public zx b(ck ☃, zx ☃)
      {
        cq ☃ = agg.b(☃.f());
        
        double ☃ = ☃.a() + ☃.g();
        double ☃ = ☃.d().o() + 0.2F;
        double ☃ = ☃.c() + ☃.i();
        
        wt ☃ = new wt(☃.i(), ☃, ☃, ☃, ☃);
        ☃.i().d(☃);
        
        ☃.a(1);
        return ☃;
      }
      
      protected void a(ck ☃)
      {
        ☃.i().b(1002, ☃.d(), 0);
      }
    });
    agg.N.a(zy.bL, new cn()
    {
      public zx b(ck ☃, zx ☃)
      {
        cq ☃ = agg.b(☃.f());
        
        cz ☃ = agg.a(☃);
        double ☃ = ☃.a() + ☃.g() * 0.3F;
        double ☃ = ☃.b() + ☃.h() * 0.3F;
        double ☃ = ☃.c() + ☃.i() * 0.3F;
        
        adm ☃ = ☃.i();
        Random ☃ = s;
        
        double ☃ = ☃.nextGaussian() * 0.05D + ☃.g();
        double ☃ = ☃.nextGaussian() * 0.05D + ☃.h();
        double ☃ = ☃.nextGaussian() * 0.05D + ☃.i();
        
        ☃.d(new ww(☃, ☃, ☃, ☃, ☃, ☃, ☃));
        
        ☃.a(1);
        return ☃;
      }
      
      protected void a(ck ☃)
      {
        ☃.i().b(1009, ☃.d(), 0);
      }
    });
    agg.N.a(zy.aE, new cn()
    {
      private final cn b = new cn();
      
      public zx b(ck ☃, zx ☃)
      {
        cq ☃ = agg.b(☃.f());
        adm ☃ = ☃.i();
        
        double ☃ = ☃.a() + ☃.g() * 1.125F;
        double ☃ = ☃.b() + ☃.h() * 1.125F;
        double ☃ = ☃.c() + ☃.i() * 1.125F;
        
        cj ☃ = ☃.d().a(☃);
        arm ☃ = ☃.p(☃).c().t();
        double ☃;
        if (arm.h.equals(☃))
        {
          ☃ = 1.0D;
        }
        else
        {
          double ☃;
          if ((arm.a.equals(☃)) && (arm.h.equals(☃.p(☃.b()).c().t()))) {
            ☃ = 0.0D;
          } else {
            return b.a(☃, ☃);
          }
        }
        double ☃;
        ux ☃ = new ux(☃, ☃, ☃ + ☃, ☃);
        ☃.d(☃);
        
        ☃.a(1);
        return ☃;
      }
      
      protected void a(ck ☃)
      {
        ☃.i().b(1000, ☃.d(), 0);
      }
    });
    cr ☃ = new cn()
    {
      private final cn b = new cn();
      
      public zx b(ck ☃, zx ☃)
      {
        yv ☃ = (yv)☃.b();
        cj ☃ = ☃.d().a(agg.b(☃.f()));
        if (☃.a(☃.i(), ☃))
        {
          ☃.a(zy.aw);
          b = 1;
          
          return ☃;
        }
        return b.a(☃, ☃);
      }
    };
    agg.N.a(zy.ay, ☃);
    agg.N.a(zy.ax, ☃);
    
    agg.N.a(zy.aw, new cn()
    {
      private final cn b = new cn();
      
      public zx b(ck ☃, zx ☃)
      {
        adm ☃ = ☃.i();
        
        cj ☃ = ☃.d().a(agg.b(☃.f()));
        
        alz ☃ = ☃.p(☃);
        afh ☃ = ☃.c();
        arm ☃ = ☃.t();
        zw ☃;
        if ((arm.h.equals(☃)) && ((☃ instanceof ahv)) && (((Integer)☃.b(ahv.b)).intValue() == 0))
        {
          ☃ = zy.ax;
        }
        else
        {
          zw ☃;
          if ((arm.i.equals(☃)) && ((☃ instanceof ahv)) && (((Integer)☃.b(ahv.b)).intValue() == 0)) {
            ☃ = zy.ay;
          } else {
            return super.b(☃, ☃);
          }
        }
        zw ☃;
        ☃.g(☃);
        if (--b == 0)
        {
          ☃.a(☃);
          b = 1;
        }
        else if (((alc)☃.h()).a(new zx(☃)) < 0)
        {
          b.a(☃, new zx(☃));
        }
        return ☃;
      }
    });
    agg.N.a(zy.d, new cn()
    {
      private boolean b = true;
      
      protected zx b(ck ☃, zx ☃)
      {
        adm ☃ = ☃.i();
        
        cj ☃ = ☃.d().a(agg.b(☃.f()));
        if (☃.d(☃))
        {
          ☃.a(☃, afi.ab.Q());
          if (☃.a(1, s)) {
            b = 0;
          }
        }
        else if (☃.p(☃).c() == afi.W)
        {
          afi.W.d(☃, ☃, afi.W.Q().a(ake.a, Boolean.valueOf(true)));
          ☃.g(☃);
        }
        else
        {
          b = false;
        }
        return ☃;
      }
      
      protected void a(ck ☃)
      {
        if (b) {
          ☃.i().b(1000, ☃.d(), 0);
        } else {
          ☃.i().b(1001, ☃.d(), 0);
        }
      }
    });
    agg.N.a(zy.aW, new cn()
    {
      private boolean b = true;
      
      protected zx b(ck ☃, zx ☃)
      {
        if (zd.a == zd.a(☃.i()))
        {
          adm ☃ = ☃.i();
          
          cj ☃ = ☃.d().a(agg.b(☃.f()));
          if (ze.a(☃, ☃, ☃))
          {
            if (!D) {
              ☃.b(2005, ☃, 0);
            }
          }
          else {
            b = false;
          }
          return ☃;
        }
        return super.b(☃, ☃);
      }
      
      protected void a(ck ☃)
      {
        if (b) {
          ☃.i().b(1000, ☃.d(), 0);
        } else {
          ☃.i().b(1001, ☃.d(), 0);
        }
      }
    });
    agg.N.a(zw.a(afi.W), new cn()
    {
      protected zx b(ck ☃, zx ☃)
      {
        adm ☃ = ☃.i();
        cj ☃ = ☃.d().a(agg.b(☃.f()));
        
        vj ☃ = new vj(☃, ☃.n() + 0.5D, ☃.o(), ☃.p() + 0.5D, null);
        ☃.d(☃);
        ☃.a(☃, "game.tnt.primed", 1.0F, 1.0F);
        
        b -= 1;
        return ☃;
      }
    });
    agg.N.a(zy.bX, new cn()
    {
      private boolean b = true;
      
      protected zx b(ck ☃, zx ☃)
      {
        adm ☃ = ☃.i();
        cq ☃ = agg.b(☃.f());
        cj ☃ = ☃.d().a(☃);
        ajm ☃ = afi.ce;
        if ((☃.d(☃)) && (☃.b(☃, ☃, ☃)))
        {
          if (!D)
          {
            ☃.a(☃, ☃.Q().a(ajm.a, cq.b), 3);
            akw ☃ = ☃.s(☃);
            if ((☃ instanceof alo))
            {
              if (☃.i() == 3)
              {
                GameProfile ☃ = null;
                if (☃.n())
                {
                  dn ☃ = ☃.o();
                  if (☃.b("SkullOwner", 10))
                  {
                    ☃ = dy.a(☃.m("SkullOwner"));
                  }
                  else if (☃.b("SkullOwner", 8))
                  {
                    String ☃ = ☃.j("SkullOwner");
                    if (!nx.b(☃)) {
                      ☃ = new GameProfile(null, ☃);
                    }
                  }
                }
                ((alo)☃).a(☃);
              }
              else
              {
                ((alo)☃).a(☃.i());
              }
              ((alo)☃).b(☃.d().b() * 4);
              afi.ce.a(☃, ☃, (alo)☃);
            }
            b -= 1;
          }
        }
        else {
          b = false;
        }
        return ☃;
      }
      
      protected void a(ck ☃)
      {
        if (b) {
          ☃.i().b(1000, ☃.d(), 0);
        } else {
          ☃.i().b(1001, ☃.d(), 0);
        }
      }
    });
    agg.N.a(zw.a(afi.aU), new cn()
    {
      private boolean b = true;
      
      protected zx b(ck ☃, zx ☃)
      {
        adm ☃ = ☃.i();
        cj ☃ = ☃.d().a(agg.b(☃.f()));
        aiv ☃ = (aiv)afi.aU;
        if ((☃.d(☃)) && (☃.e(☃, ☃)))
        {
          if (!D) {
            ☃.a(☃, ☃.Q(), 3);
          }
          b -= 1;
        }
        else
        {
          b = false;
        }
        return ☃;
      }
      
      protected void a(ck ☃)
      {
        if (b) {
          ☃.i().b(1000, ☃.d(), 0);
        } else {
          ☃.i().b(1001, ☃.d(), 0);
        }
      }
    });
  }
  
  public static void c()
  {
    if (b) {
      return;
    }
    b = true;
    if (c.isDebugEnabled()) {
      d();
    }
    afh.S();
    agv.l();
    
    zw.t();
    na.a();
    
    b();
  }
  
  private static void d()
  {
    System.setErr(new kg("STDERR", System.err));
    System.setOut(new kg("STDOUT", a));
  }
  
  public static void a(String ☃)
  {
    a.println(☃);
  }
}
