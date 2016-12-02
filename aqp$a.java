import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqp$a
  extends aqp.p
{
  private static final List<ob> a = Lists.newArrayList(new ob[] { new ob(zy.bu, 0, 1, 1, 10), new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aA, 0, 1, 1, 1), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
  private boolean b;
  
  public aqp$a() {}
  
  public aqp$a(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    m = ☃;
    d = a(☃);
    l = ☃;
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
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqp.m)☃, ☃, ☃, 1, 1);
  }
  
  public static a a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 7, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new a(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 4, 4, 6, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, d, 1, 1, 0);
    
    a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 6);
    
    a(☃, ☃, 3, 1, 2, 3, 1, 4, afi.bf.Q(), afi.bf.Q(), false);
    a(☃, afi.U.a(akb.a.f.a()), 3, 1, 1, ☃);
    a(☃, afi.U.a(akb.a.f.a()), 3, 1, 5, ☃);
    a(☃, afi.U.a(akb.a.f.a()), 3, 2, 2, ☃);
    a(☃, afi.U.a(akb.a.f.a()), 3, 2, 4, ☃);
    for (int ☃ = 2; ☃ <= 4; ☃++) {
      a(☃, afi.U.a(akb.a.f.a()), 2, 1, ☃, ☃);
    }
    if ((!b) && 
      (☃.b(new cj(a(3, 3), d(2), b(3, 3)))))
    {
      b = true;
      a(☃, ☃, ☃, 3, 2, 3, ob.a(a, new ob[] { zy.cd.b(☃) }), 2 + ☃.nextInt(2));
    }
    return true;
  }
}
