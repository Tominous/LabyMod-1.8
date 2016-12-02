import com.google.common.collect.Sets;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Random;
import java.util.Set;

public final class adt
{
  private static final int a = (int)Math.pow(17.0D, 2.0D);
  private final Set<adg> b = Sets.newHashSet();
  
  public int a(le ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    if ((!☃) && (!☃)) {
      return 0;
    }
    this.b.clear();
    int ☃ = 0;
    for (wn ☃ : ☃.j) {
      if (!☃.v())
      {
        int ☃ = ns.c(☃.s / 16.0D);
        int ☃ = ns.c(☃.u / 16.0D);
        int ☃ = 8;
        for (int ☃ = -☃; ☃ <= ☃; ☃++) {
          for (int ☃ = -☃; ☃ <= ☃; ☃++)
          {
            boolean ☃ = (☃ == -☃) || (☃ == ☃) || (☃ == -☃) || (☃ == ☃);
            adg ☃ = new adg(☃ + ☃, ☃ + ☃);
            if (!this.b.contains(☃))
            {
              ☃++;
              if ((!☃) && (☃.af().a(☃))) {
                this.b.add(☃);
              }
            }
          }
        }
      }
    }
    int ☃ = 0;
    cj ☃ = ☃.M();
    pt ☃;
    label846:
    label852:
    for (☃ : pt.values()) {
      if ((!☃.d()) || (☃)) {
        if ((☃.d()) || (☃)) {
          if ((!☃.e()) || (☃))
          {
            int ☃ = ☃.a(☃.a());
            int ☃ = ☃.b() * ☃ / a;
            if (☃ <= ☃) {
              for (adg ☃ : this.b)
              {
                cj ☃ = a(☃, ☃.a, ☃.b);
                int ☃ = ☃.n();
                int ☃ = ☃.o();
                int ☃ = ☃.p();
                
                afh ☃ = ☃.p(☃).c();
                if (!☃.v())
                {
                  int ☃ = 0;
                  for (int ☃ = 0;; ☃++)
                  {
                    if (☃ >= 3) {
                      break label852;
                    }
                    int ☃ = ☃;
                    int ☃ = ☃;
                    int ☃ = ☃;
                    int ☃ = 6;
                    
                    ady.c ☃ = null;
                    pu ☃ = null;
                    for (int ☃ = 0;; ☃++)
                    {
                      if (☃ >= 4) {
                        break label846;
                      }
                      ☃ += ☃.s.nextInt(☃) - ☃.s.nextInt(☃);
                      ☃ += ☃.s.nextInt(1) - ☃.s.nextInt(1);
                      ☃ += ☃.s.nextInt(☃) - ☃.s.nextInt(☃);
                      cj ☃ = new cj(☃, ☃, ☃);
                      
                      float ☃ = ☃ + 0.5F;
                      float ☃ = ☃ + 0.5F;
                      if (!☃.b(☃, ☃, ☃, 24.0D)) {
                        if (☃.c(☃, ☃, ☃) >= 576.0D)
                        {
                          if (☃ == null)
                          {
                            ☃ = ☃.a(☃, ☃);
                            if (☃ == null) {
                              break label846;
                            }
                          }
                          if (☃.a(☃, ☃, ☃)) {
                            if (a(pv.a(☃.b), ☃, ☃))
                            {
                              ps ☃;
                              try
                              {
                                ☃ = (ps)☃.b.getConstructor(new Class[] { adm.class }).newInstance(new Object[] { ☃ });
                              }
                              catch (Exception ☃)
                              {
                                ☃.printStackTrace();
                                return ☃;
                              }
                              ☃.b(☃, ☃, ☃, ☃.s.nextFloat() * 360.0F, 0.0F);
                              if ((☃.bR()) && (☃.bS()))
                              {
                                ☃ = ☃.a(☃.E(new cj(☃)), ☃);
                                if (☃.bS())
                                {
                                  ☃++;
                                  ☃.d(☃);
                                }
                                if (☃ >= ☃.bV()) {
                                  break;
                                }
                              }
                              ☃ += ☃;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return ☃;
  }
  
  protected static cj a(adm ☃, int ☃, int ☃)
  {
    amy ☃ = ☃.a(☃, ☃);
    int ☃ = ☃ * 16 + ☃.s.nextInt(16);
    int ☃ = ☃ * 16 + ☃.s.nextInt(16);
    int ☃ = ns.c(☃.f(new cj(☃, 0, ☃)) + 1, 16);
    int ☃ = ☃.s.nextInt(☃ > 0 ? ☃ : ☃.g() + 16 - 1);
    
    return new cj(☃, ☃, ☃);
  }
  
  public static boolean a(ps.a ☃, adm ☃, cj ☃)
  {
    if (☃.af().a(☃))
    {
      afh ☃ = ☃.p(☃).c();
      if (☃ == ps.a.c) {
        return (☃.t().d()) && (☃.p(☃.b()).c().t().d()) && (!☃.p(☃.a()).c().v());
      }
      cj ☃ = ☃.b();
      if (!adm.a(☃, ☃)) {
        return false;
      }
      afh ☃ = ☃.p(☃).c();
      boolean ☃ = (☃ != afi.h) && (☃ != afi.cv);
      return (☃) && (!☃.v()) && (!☃.t().d()) && (!☃.p(☃.a()).c().v());
    }
    return false;
  }
  
  public static void a(adm ☃, ady ☃, int ☃, int ☃, int ☃, int ☃, Random ☃)
  {
    List<ady.c> ☃ = ☃.a(pt.b);
    if (☃.isEmpty()) {
      return;
    }
    while (☃.nextFloat() < ☃.g())
    {
      ady.c ☃ = (ady.c)oa.a(☃.s, ☃);
      int ☃ = ☃.c + ☃.nextInt(1 + ☃.d - ☃.c);
      pu ☃ = null;
      
      int ☃ = ☃ + ☃.nextInt(☃);
      int ☃ = ☃ + ☃.nextInt(☃);
      int ☃ = ☃;
      int ☃ = ☃;
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        boolean ☃ = false;
        for (int ☃ = 0; (!☃) && (☃ < 4); ☃++)
        {
          cj ☃ = ☃.r(new cj(☃, 0, ☃));
          if (a(ps.a.a, ☃, ☃))
          {
            ps ☃;
            try
            {
              ☃ = (ps)☃.b.getConstructor(new Class[] { adm.class }).newInstance(new Object[] { ☃ });
            }
            catch (Exception ☃)
            {
              ☃.printStackTrace();
              continue;
            }
            ☃.b(☃ + 0.5F, ☃.o(), ☃ + 0.5F, ☃.nextFloat() * 360.0F, 0.0F);
            
            ☃.d(☃);
            ☃ = ☃.a(☃.E(new cj(☃)), ☃);
            ☃ = true;
          }
          ☃ += ☃.nextInt(5) - ☃.nextInt(5);
          ☃ += ☃.nextInt(5) - ☃.nextInt(5);
          while ((☃ < ☃) || (☃ >= ☃ + ☃) || (☃ < ☃) || (☃ >= ☃ + ☃))
          {
            ☃ = ☃ + ☃.nextInt(5) - ☃.nextInt(5);
            ☃ = ☃ + ☃.nextInt(5) - ☃.nextInt(5);
          }
        }
      }
    }
  }
}
