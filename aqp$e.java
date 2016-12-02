import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqp$e
  extends aqp.p
{
  private static final List<ob> a = Lists.newArrayList(new ob[] { new ob(zy.aL, 0, 1, 3, 20), new ob(zy.aK, 0, 2, 7, 20), new ob(zy.bV, 0, 1, 1, 1), new ob(zy.aQ, 0, 1, 1, 1) });
  private boolean b;
  
  public aqp$e() {}
  
  public aqp$e(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    m = ☃;
    d = a(☃);
    l = ☃;
    b = (☃.d() > 6);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Tall", b);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    b = ☃.n("Tall");
  }
  
  public static e a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 14, 11, 15, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null))
    {
      ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 14, 6, 15, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
    }
    return new e(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    int ☃ = 11;
    if (!b) {
      ☃ = 6;
    }
    a(☃, ☃, 0, 0, 0, 13, ☃ - 1, 14, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, d, 4, 1, 0);
    
    a(☃, ☃, ☃, 0.07F, 2, 1, 1, 11, 4, 13, afi.G.Q(), afi.G.Q(), false);
    
    int ☃ = 1;
    int ☃ = 12;
    for (int ☃ = 1; ☃ <= 13; ☃++) {
      if ((☃ - 1) % 4 == 0)
      {
        a(☃, ☃, 1, 1, ☃, 1, 4, ☃, afi.f.Q(), afi.f.Q(), false);
        a(☃, ☃, 12, 1, ☃, 12, 4, ☃, afi.f.Q(), afi.f.Q(), false);
        
        a(☃, afi.aa.Q(), 2, 3, ☃, ☃);
        a(☃, afi.aa.Q(), 11, 3, ☃, ☃);
        if (b)
        {
          a(☃, ☃, 1, 6, ☃, 1, 9, ☃, afi.f.Q(), afi.f.Q(), false);
          a(☃, ☃, 12, 6, ☃, 12, 9, ☃, afi.f.Q(), afi.f.Q(), false);
        }
      }
      else
      {
        a(☃, ☃, 1, 1, ☃, 1, 4, ☃, afi.X.Q(), afi.X.Q(), false);
        a(☃, ☃, 12, 1, ☃, 12, 4, ☃, afi.X.Q(), afi.X.Q(), false);
        if (b)
        {
          a(☃, ☃, 1, 6, ☃, 1, 9, ☃, afi.X.Q(), afi.X.Q(), false);
          a(☃, ☃, 12, 6, ☃, 12, 9, ☃, afi.X.Q(), afi.X.Q(), false);
        }
      }
    }
    for (int ☃ = 3; ☃ < 12; ☃ += 2)
    {
      a(☃, ☃, 3, 1, ☃, 4, 3, ☃, afi.X.Q(), afi.X.Q(), false);
      a(☃, ☃, 6, 1, ☃, 7, 3, ☃, afi.X.Q(), afi.X.Q(), false);
      a(☃, ☃, 9, 1, ☃, 10, 3, ☃, afi.X.Q(), afi.X.Q(), false);
    }
    if (b)
    {
      a(☃, ☃, 1, 5, 1, 3, 5, 13, afi.f.Q(), afi.f.Q(), false);
      a(☃, ☃, 10, 5, 1, 12, 5, 13, afi.f.Q(), afi.f.Q(), false);
      a(☃, ☃, 4, 5, 1, 9, 5, 2, afi.f.Q(), afi.f.Q(), false);
      a(☃, ☃, 4, 5, 12, 9, 5, 13, afi.f.Q(), afi.f.Q(), false);
      
      a(☃, afi.f.Q(), 9, 5, 11, ☃);
      a(☃, afi.f.Q(), 8, 5, 11, ☃);
      a(☃, afi.f.Q(), 9, 5, 10, ☃);
      
      a(☃, ☃, 3, 6, 2, 3, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
      a(☃, ☃, 10, 6, 2, 10, 6, 10, afi.aO.Q(), afi.aO.Q(), false);
      a(☃, ☃, 4, 6, 2, 9, 6, 2, afi.aO.Q(), afi.aO.Q(), false);
      a(☃, ☃, 4, 6, 12, 8, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
      a(☃, afi.aO.Q(), 9, 6, 11, ☃);
      a(☃, afi.aO.Q(), 8, 6, 11, ☃);
      a(☃, afi.aO.Q(), 9, 6, 10, ☃);
      
      int ☃ = a(afi.au, 3);
      a(☃, afi.au.a(☃), 10, 1, 13, ☃);
      a(☃, afi.au.a(☃), 10, 2, 13, ☃);
      a(☃, afi.au.a(☃), 10, 3, 13, ☃);
      a(☃, afi.au.a(☃), 10, 4, 13, ☃);
      a(☃, afi.au.a(☃), 10, 5, 13, ☃);
      a(☃, afi.au.a(☃), 10, 6, 13, ☃);
      a(☃, afi.au.a(☃), 10, 7, 13, ☃);
      
      int ☃ = 7;
      int ☃ = 7;
      a(☃, afi.aO.Q(), ☃ - 1, 9, ☃, ☃);
      a(☃, afi.aO.Q(), ☃, 9, ☃, ☃);
      a(☃, afi.aO.Q(), ☃ - 1, 8, ☃, ☃);
      a(☃, afi.aO.Q(), ☃, 8, ☃, ☃);
      a(☃, afi.aO.Q(), ☃ - 1, 7, ☃, ☃);
      a(☃, afi.aO.Q(), ☃, 7, ☃, ☃);
      
      a(☃, afi.aO.Q(), ☃ - 2, 7, ☃, ☃);
      a(☃, afi.aO.Q(), ☃ + 1, 7, ☃, ☃);
      a(☃, afi.aO.Q(), ☃ - 1, 7, ☃ - 1, ☃);
      a(☃, afi.aO.Q(), ☃ - 1, 7, ☃ + 1, ☃);
      a(☃, afi.aO.Q(), ☃, 7, ☃ - 1, ☃);
      a(☃, afi.aO.Q(), ☃, 7, ☃ + 1, ☃);
      
      a(☃, afi.aa.Q(), ☃ - 2, 8, ☃, ☃);
      a(☃, afi.aa.Q(), ☃ + 1, 8, ☃, ☃);
      a(☃, afi.aa.Q(), ☃ - 1, 8, ☃ - 1, ☃);
      a(☃, afi.aa.Q(), ☃ - 1, 8, ☃ + 1, ☃);
      a(☃, afi.aa.Q(), ☃, 8, ☃ - 1, ☃);
      a(☃, afi.aa.Q(), ☃, 8, ☃ + 1, ☃);
    }
    a(☃, ☃, ☃, 3, 3, 5, ob.a(a, new ob[] { zy.cd.a(☃, 1, 5, 2) }), 1 + ☃.nextInt(4));
    if (b)
    {
      a(☃, afi.a.Q(), 12, 9, 1, ☃);
      a(☃, ☃, ☃, 12, 8, 1, ob.a(a, new ob[] { zy.cd.a(☃, 1, 5, 2) }), 1 + ☃.nextInt(4));
    }
    return true;
  }
}
