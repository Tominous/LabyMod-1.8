import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqp$j
  extends aqp.p
{
  private static final List<ob> b = Lists.newArrayList(new ob[] { new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1) });
  protected int a;
  
  public aqp$j() {}
  
  public aqp$j(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.d = a(☃);
    this.l = ☃;
    this.a = ☃.nextInt(5);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Type", this.a);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a = ☃.f("Type");
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqp.m)☃, ☃, ☃, 4, 1);
    b((aqp.m)☃, ☃, ☃, 1, 4);
    c((aqp.m)☃, ☃, ☃, 1, 4);
  }
  
  public static j a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 11, 7, 11, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new j(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 10, 6, 10, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, this.d, 4, 1, 0);
    
    a(☃, ☃, 4, 1, 10, 6, 3, 10, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, 0, 1, 4, 0, 3, 6, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, 10, 1, 4, 10, 3, 6, afi.a.Q(), afi.a.Q(), false);
    switch (this.a)
    {
    default: 
      break;
    case 0: 
      a(☃, afi.bf.Q(), 5, 1, 5, ☃);
      a(☃, afi.bf.Q(), 5, 2, 5, ☃);
      a(☃, afi.bf.Q(), 5, 3, 5, ☃);
      a(☃, afi.aa.Q(), 4, 3, 5, ☃);
      a(☃, afi.aa.Q(), 6, 3, 5, ☃);
      a(☃, afi.aa.Q(), 5, 3, 4, ☃);
      a(☃, afi.aa.Q(), 5, 3, 6, ☃);
      a(☃, afi.U.Q(), 4, 1, 4, ☃);
      a(☃, afi.U.Q(), 4, 1, 5, ☃);
      a(☃, afi.U.Q(), 4, 1, 6, ☃);
      a(☃, afi.U.Q(), 6, 1, 4, ☃);
      a(☃, afi.U.Q(), 6, 1, 5, ☃);
      a(☃, afi.U.Q(), 6, 1, 6, ☃);
      a(☃, afi.U.Q(), 5, 1, 4, ☃);
      a(☃, afi.U.Q(), 5, 1, 6, ☃);
      break;
    case 1: 
      for (int ☃ = 0; ☃ < 5; ☃++)
      {
        a(☃, afi.bf.Q(), 3, 1, 3 + ☃, ☃);
        a(☃, afi.bf.Q(), 7, 1, 3 + ☃, ☃);
        a(☃, afi.bf.Q(), 3 + ☃, 1, 3, ☃);
        a(☃, afi.bf.Q(), 3 + ☃, 1, 7, ☃);
      }
      a(☃, afi.bf.Q(), 5, 1, 5, ☃);
      a(☃, afi.bf.Q(), 5, 2, 5, ☃);
      a(☃, afi.bf.Q(), 5, 3, 5, ☃);
      a(☃, afi.i.Q(), 5, 4, 5, ☃);
      break;
    case 2: 
      for (int ☃ = 1; ☃ <= 9; ☃++)
      {
        a(☃, afi.e.Q(), 1, 3, ☃, ☃);
        a(☃, afi.e.Q(), 9, 3, ☃, ☃);
      }
      for (int ☃ = 1; ☃ <= 9; ☃++)
      {
        a(☃, afi.e.Q(), ☃, 3, 1, ☃);
        a(☃, afi.e.Q(), ☃, 3, 9, ☃);
      }
      a(☃, afi.e.Q(), 5, 1, 4, ☃);
      a(☃, afi.e.Q(), 5, 1, 6, ☃);
      a(☃, afi.e.Q(), 5, 3, 4, ☃);
      a(☃, afi.e.Q(), 5, 3, 6, ☃);
      a(☃, afi.e.Q(), 4, 1, 5, ☃);
      a(☃, afi.e.Q(), 6, 1, 5, ☃);
      a(☃, afi.e.Q(), 4, 3, 5, ☃);
      a(☃, afi.e.Q(), 6, 3, 5, ☃);
      for (int ☃ = 1; ☃ <= 3; ☃++)
      {
        a(☃, afi.e.Q(), 4, ☃, 4, ☃);
        a(☃, afi.e.Q(), 6, ☃, 4, ☃);
        a(☃, afi.e.Q(), 4, ☃, 6, ☃);
        a(☃, afi.e.Q(), 6, ☃, 6, ☃);
      }
      a(☃, afi.aa.Q(), 5, 3, 5, ☃);
      for (int ☃ = 2; ☃ <= 8; ☃++)
      {
        a(☃, afi.f.Q(), 2, 3, ☃, ☃);
        a(☃, afi.f.Q(), 3, 3, ☃, ☃);
        if ((☃ <= 3) || (☃ >= 7))
        {
          a(☃, afi.f.Q(), 4, 3, ☃, ☃);
          a(☃, afi.f.Q(), 5, 3, ☃, ☃);
          a(☃, afi.f.Q(), 6, 3, ☃, ☃);
        }
        a(☃, afi.f.Q(), 7, 3, ☃, ☃);
        a(☃, afi.f.Q(), 8, 3, ☃, ☃);
      }
      a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 1, 3, ☃);
      a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 2, 3, ☃);
      a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 3, 3, ☃);
      
      a(☃, ☃, ☃, 3, 4, 8, ob.a(b, new ob[] { zy.cd.b(☃) }), 1 + ☃.nextInt(4));
    }
    return true;
  }
}
