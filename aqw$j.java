import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqw$j
  extends aqw.n
{
  private static final List<ob> a = Lists.newArrayList(new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zw.a(afi.Z), 0, 3, 7, 5), new ob(zw.a(afi.g), 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
  private boolean b;
  
  public aqw$j() {}
  
  public aqw$j(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    m = ☃;
    l = ☃;
  }
  
  public static j a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 10, 6, 7, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new j(☃, ☃, ☃, ☃, ☃);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Chest", b);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    b = ☃.n("Chest");
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (h < 0)
    {
      h = b(☃, ☃);
      if (h < 0) {
        return true;
      }
      l.a(0, h - l.e + 6 - 1, 0);
    }
    a(☃, ☃, 0, 1, 0, 9, 4, 6, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 0, 0, 0, 9, 0, 6, afi.e.Q(), afi.e.Q(), false);
    
    a(☃, ☃, 0, 4, 0, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
    a(☃, ☃, 0, 5, 0, 9, 5, 6, afi.U.Q(), afi.U.Q(), false);
    a(☃, ☃, 1, 5, 1, 8, 5, 5, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 0, 1, 0, 0, 4, 0, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 3, 1, 0, 3, 4, 0, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 0, 1, 6, 0, 4, 6, afi.r.Q(), afi.r.Q(), false);
    a(☃, afi.f.Q(), 3, 3, 1, ☃);
    a(☃, ☃, 3, 1, 2, 3, 3, 2, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 4, 1, 3, 5, 3, 3, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 0, 1, 1, 0, 3, 5, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 1, 1, 6, 5, 3, 6, afi.f.Q(), afi.f.Q(), false);
    
    a(☃, ☃, 5, 1, 0, 5, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
    a(☃, ☃, 9, 1, 0, 9, 3, 0, afi.aO.Q(), afi.aO.Q(), false);
    
    a(☃, ☃, 6, 1, 4, 9, 4, 6, afi.e.Q(), afi.e.Q(), false);
    a(☃, afi.k.Q(), 7, 1, 5, ☃);
    a(☃, afi.k.Q(), 8, 1, 5, ☃);
    a(☃, afi.bi.Q(), 9, 2, 5, ☃);
    a(☃, afi.bi.Q(), 9, 2, 4, ☃);
    a(☃, ☃, 7, 2, 4, 8, 2, 5, afi.a.Q(), afi.a.Q(), false);
    a(☃, afi.e.Q(), 6, 1, 3, ☃);
    a(☃, afi.al.Q(), 6, 2, 3, ☃);
    a(☃, afi.al.Q(), 6, 3, 3, ☃);
    a(☃, afi.T.Q(), 8, 1, 1, ☃);
    
    a(☃, afi.bj.Q(), 0, 2, 2, ☃);
    a(☃, afi.bj.Q(), 0, 2, 4, ☃);
    a(☃, afi.bj.Q(), 2, 2, 6, ☃);
    a(☃, afi.bj.Q(), 4, 2, 6, ☃);
    
    a(☃, afi.aO.Q(), 2, 1, 4, ☃);
    a(☃, afi.aB.Q(), 2, 2, 4, ☃);
    a(☃, afi.f.Q(), 1, 1, 5, ☃);
    a(☃, afi.ad.a(a(afi.ad, 3)), 2, 1, 5, ☃);
    a(☃, afi.ad.a(a(afi.ad, 1)), 1, 1, 4, ☃);
    if ((!b) && 
      (☃.b(new cj(a(5, 5), d(1), b(5, 5)))))
    {
      b = true;
      a(☃, ☃, ☃, 5, 1, 5, a, 3 + ☃.nextInt(6));
    }
    for (int ☃ = 6; ☃ <= 8; ☃++) {
      if ((a(☃, ☃, 0, -1, ☃).c().t() == arm.a) && (a(☃, ☃, -1, -1, ☃).c().t() != arm.a)) {
        a(☃, afi.aw.a(a(afi.aw, 3)), ☃, 0, -1, ☃);
      }
    }
    for (int ☃ = 0; ☃ < 7; ☃++) {
      for (int ☃ = 0; ☃ < 10; ☃++)
      {
        b(☃, ☃, 6, ☃, ☃);
        b(☃, afi.e.Q(), ☃, -1, ☃, ☃);
      }
    }
    a(☃, ☃, 7, 1, 1, 1);
    
    return true;
  }
  
  protected int c(int ☃, int ☃)
  {
    return 3;
  }
}
