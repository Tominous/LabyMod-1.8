import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class api
  extends aot
{
  private static final Logger a = ;
  private static final String[] b = { "Skeleton", "Zombie", "Zombie", "Spider" };
  private static final List<ob> c = Lists.newArrayList(new ob[] { new ob(zy.aA, 0, 1, 1, 10), new ob(zy.j, 0, 1, 4, 10), new ob(zy.P, 0, 1, 1, 10), new ob(zy.O, 0, 1, 4, 10), new ob(zy.H, 0, 1, 4, 10), new ob(zy.F, 0, 1, 4, 10), new ob(zy.aw, 0, 1, 1, 10), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aC, 0, 1, 4, 10), new ob(zy.cq, 0, 1, 1, 4), new ob(zy.cr, 0, 1, 1, 4), new ob(zy.co, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 2), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 1) });
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    int ☃ = 3;
    int ☃ = ☃.nextInt(2) + 2;
    int ☃ = -☃ - 1;
    int ☃ = ☃ + 1;
    
    int ☃ = -1;
    int ☃ = 4;
    
    int ☃ = ☃.nextInt(2) + 2;
    int ☃ = -☃ - 1;
    int ☃ = ☃ + 1;
    
    int ☃ = 0;
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -1; ☃ <= 4; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          cj ☃ = ☃.a(☃, ☃, ☃);
          arm ☃ = ☃.p(☃).c().t();
          boolean ☃ = ☃.a();
          if ((☃ == -1) && (!☃)) {
            return false;
          }
          if ((☃ == 4) && (!☃)) {
            return false;
          }
          if (((☃ == ☃) || (☃ == ☃) || (☃ == ☃) || (☃ == ☃)) && 
            (☃ == 0) && (☃.d(☃)) && (☃.d(☃.a()))) {
            ☃++;
          }
        }
      }
    }
    if ((☃ < 1) || (☃ > 5)) {
      return false;
    }
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = 3; ☃ >= -1; ☃--) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          cj ☃ = ☃.a(☃, ☃, ☃);
          if ((☃ == ☃) || (☃ == -1) || (☃ == ☃) || (☃ == ☃) || (☃ == 4) || (☃ == ☃))
          {
            if ((☃.o() >= 0) && (!☃.p(☃.b()).c().t().a())) {
              ☃.g(☃);
            } else if ((☃.p(☃).c().t().a()) && 
              (☃.p(☃).c() != afi.ae)) {
              if ((☃ == -1) && (☃.nextInt(4) != 0)) {
                ☃.a(☃, afi.Y.Q(), 2);
              } else {
                ☃.a(☃, afi.e.Q(), 2);
              }
            }
          }
          else if (☃.p(☃).c() != afi.ae) {
            ☃.g(☃);
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < 2; ☃++) {
      for (int ☃ = 0; ☃ < 3; ☃++)
      {
        int ☃ = ☃.n() + ☃.nextInt(☃ * 2 + 1) - ☃;
        int ☃ = ☃.o();
        int ☃ = ☃.p() + ☃.nextInt(☃ * 2 + 1) - ☃;
        cj ☃ = new cj(☃, ☃, ☃);
        if (☃.d(☃))
        {
          int ☃ = 0;
          for (cq ☃ : cq.c.a) {
            if (☃.p(☃.a(☃)).c().t().a()) {
              ☃++;
            }
          }
          if (☃ == 1)
          {
            ☃.a(☃, afi.ae.f(☃, ☃, afi.ae.Q()), 2);
            
            List<ob> ☃ = ob.a(c, new ob[] { zy.cd.b(☃) });
            
            akw ☃ = ☃.s(☃);
            if (!(☃ instanceof aky)) {
              break;
            }
            ob.a(☃, ☃, (aky)☃, 8); break;
          }
        }
      }
    }
    ☃.a(☃, afi.ac.Q(), 2);
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof all)) {
      ((all)☃).b().a(a(☃));
    } else {
      a.error("Failed to fetch mob spawner entity at (" + ☃.n() + ", " + ☃.o() + ", " + ☃.p() + ")");
    }
    return true;
  }
  
  private String a(Random ☃)
  {
    return b[☃.nextInt(b.length)];
  }
}
