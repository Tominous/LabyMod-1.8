import java.util.List;
import java.util.Random;

public class aqw$m
  extends aqw.n
{
  public aqw$m() {}
  
  public aqw$m(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    m = ☃;
    l = ☃;
  }
  
  public static m a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 9, 7, 12, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new m(☃, ☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (h < 0)
    {
      h = b(☃, ☃);
      if (h < 0) {
        return true;
      }
      l.a(0, h - l.e + 7 - 1, 0);
    }
    a(☃, ☃, 1, 1, 1, 7, 4, 4, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, 2, 1, 6, 8, 4, 10, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 2, 0, 5, 8, 0, 10, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 1, 0, 1, 7, 0, 4, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 0, 0, 0, 0, 3, 5, afi.e.Q(), afi.e.Q(), false);
    a(☃, ☃, 8, 0, 0, 8, 3, 10, afi.e.Q(), afi.e.Q(), false);
    a(☃, ☃, 1, 0, 0, 7, 2, 0, afi.e.Q(), afi.e.Q(), false);
    a(☃, ☃, 1, 0, 5, 2, 1, 5, afi.e.Q(), afi.e.Q(), false);
    a(☃, ☃, 2, 0, 6, 2, 3, 10, afi.e.Q(), afi.e.Q(), false);
    a(☃, ☃, 3, 0, 10, 7, 3, 10, afi.e.Q(), afi.e.Q(), false);
    
    a(☃, ☃, 1, 2, 0, 7, 3, 0, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 1, 2, 5, 2, 3, 5, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 0, 4, 1, 8, 4, 1, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 0, 4, 4, 3, 4, 4, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 0, 5, 2, 8, 5, 3, afi.f.Q(), afi.f.Q(), false);
    a(☃, afi.f.Q(), 0, 4, 2, ☃);
    a(☃, afi.f.Q(), 0, 4, 3, ☃);
    a(☃, afi.f.Q(), 8, 4, 2, ☃);
    a(☃, afi.f.Q(), 8, 4, 3, ☃);
    a(☃, afi.f.Q(), 8, 4, 4, ☃);
    
    int ☃ = a(afi.ad, 3);
    int ☃ = a(afi.ad, 2);
    for (int ☃ = -1; ☃ <= 2; ☃++) {
      for (int ☃ = 0; ☃ <= 8; ☃++)
      {
        a(☃, afi.ad.a(☃), ☃, 4 + ☃, ☃, ☃);
        if (((☃ > -1) || (☃ <= 1)) && ((☃ > 0) || (☃ <= 3)) && ((☃ > 1) || (☃ <= 4) || (☃ >= 6))) {
          a(☃, afi.ad.a(☃), ☃, 4 + ☃, 5 - ☃, ☃);
        }
      }
    }
    a(☃, ☃, 3, 4, 5, 3, 4, 10, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 7, 4, 2, 7, 4, 10, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 4, 5, 4, 4, 5, 10, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 6, 5, 4, 6, 5, 10, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 5, 6, 3, 5, 6, 10, afi.f.Q(), afi.f.Q(), false);
    int ☃ = a(afi.ad, 0);
    for (int ☃ = 4; ☃ >= 1; ☃--)
    {
      a(☃, afi.f.Q(), ☃, 2 + ☃, 7 - ☃, ☃);
      for (int ☃ = 8 - ☃; ☃ <= 10; ☃++) {
        a(☃, afi.ad.a(☃), ☃, 2 + ☃, ☃, ☃);
      }
    }
    int ☃ = a(afi.ad, 1);
    a(☃, afi.f.Q(), 6, 6, 3, ☃);
    a(☃, afi.f.Q(), 7, 5, 4, ☃);
    a(☃, afi.ad.a(☃), 6, 6, 4, ☃);
    for (int ☃ = 6; ☃ <= 8; ☃++) {
      for (int ☃ = 5; ☃ <= 10; ☃++) {
        a(☃, afi.ad.a(☃), ☃, 12 - ☃, ☃, ☃);
      }
    }
    a(☃, afi.r.Q(), 0, 2, 1, ☃);
    a(☃, afi.r.Q(), 0, 2, 4, ☃);
    a(☃, afi.bj.Q(), 0, 2, 2, ☃);
    a(☃, afi.bj.Q(), 0, 2, 3, ☃);
    
    a(☃, afi.r.Q(), 4, 2, 0, ☃);
    a(☃, afi.bj.Q(), 5, 2, 0, ☃);
    a(☃, afi.r.Q(), 6, 2, 0, ☃);
    
    a(☃, afi.r.Q(), 8, 2, 1, ☃);
    a(☃, afi.bj.Q(), 8, 2, 2, ☃);
    a(☃, afi.bj.Q(), 8, 2, 3, ☃);
    a(☃, afi.r.Q(), 8, 2, 4, ☃);
    a(☃, afi.f.Q(), 8, 2, 5, ☃);
    a(☃, afi.r.Q(), 8, 2, 6, ☃);
    a(☃, afi.bj.Q(), 8, 2, 7, ☃);
    a(☃, afi.bj.Q(), 8, 2, 8, ☃);
    a(☃, afi.r.Q(), 8, 2, 9, ☃);
    a(☃, afi.r.Q(), 2, 2, 6, ☃);
    a(☃, afi.bj.Q(), 2, 2, 7, ☃);
    a(☃, afi.bj.Q(), 2, 2, 8, ☃);
    a(☃, afi.r.Q(), 2, 2, 9, ☃);
    
    a(☃, afi.r.Q(), 4, 4, 10, ☃);
    a(☃, afi.bj.Q(), 5, 4, 10, ☃);
    a(☃, afi.r.Q(), 6, 4, 10, ☃);
    a(☃, afi.f.Q(), 5, 5, 10, ☃);
    
    a(☃, afi.a.Q(), 2, 1, 0, ☃);
    a(☃, afi.a.Q(), 2, 2, 0, ☃);
    a(☃, afi.aa.Q().a(akf.a, m), 2, 3, 1, ☃);
    a(☃, ☃, ☃, 2, 1, 0, cq.b(a(afi.ao, 1)));
    a(☃, ☃, 1, 0, -1, 3, 2, -1, afi.a.Q(), afi.a.Q(), false);
    if ((a(☃, 2, 0, -1, ☃).c().t() == arm.a) && (a(☃, 2, -1, -1, ☃).c().t() != arm.a)) {
      a(☃, afi.aw.a(a(afi.aw, 3)), 2, 0, -1, ☃);
    }
    for (int ☃ = 0; ☃ < 5; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++)
      {
        b(☃, ☃, 7, ☃, ☃);
        b(☃, afi.e.Q(), ☃, -1, ☃, ☃);
      }
    }
    for (int ☃ = 5; ☃ < 11; ☃++) {
      for (int ☃ = 2; ☃ < 9; ☃++)
      {
        b(☃, ☃, 7, ☃, ☃);
        b(☃, afi.e.Q(), ☃, -1, ☃, ☃);
      }
    }
    a(☃, ☃, 4, 1, 2, 2);
    
    return true;
  }
}
