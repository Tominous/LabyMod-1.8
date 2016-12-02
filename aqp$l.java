import java.util.List;
import java.util.Random;

public class aqp$l
  extends aqp.p
{
  private boolean a;
  
  public aqp$l() {}
  
  public aqp$l(int ☃, Random ☃, int ☃, int ☃)
  {
    super(☃);
    
    a = true;
    m = cq.c.a.a(☃);
    d = aqp.p.a.a;
    switch (aqp.3.b[m.ordinal()])
    {
    case 1: 
    case 2: 
      l = new aqe(☃, 64, ☃, ☃ + 5 - 1, 74, ☃ + 5 - 1);
      break;
    default: 
      l = new aqe(☃, 64, ☃, ☃ + 5 - 1, 74, ☃ + 5 - 1);
    }
  }
  
  public aqp$l(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    a = false;
    m = ☃;
    d = a(☃);
    l = ☃;
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Source", a);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    a = ☃.n("Source");
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    if (a) {
      aqp.a(aqp.c.class);
    }
    a((aqp.m)☃, ☃, ☃, 1, 1);
  }
  
  public static l a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -7, 0, 5, 11, 5, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new l(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 4, 10, 4, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, d, 1, 7, 0);
    
    a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 4);
    
    a(☃, afi.bf.Q(), 2, 6, 1, ☃);
    a(☃, afi.bf.Q(), 1, 5, 1, ☃);
    a(☃, afi.U.a(akb.a.a.a()), 1, 6, 1, ☃);
    a(☃, afi.bf.Q(), 1, 5, 2, ☃);
    a(☃, afi.bf.Q(), 1, 4, 3, ☃);
    a(☃, afi.U.a(akb.a.a.a()), 1, 5, 3, ☃);
    a(☃, afi.bf.Q(), 2, 4, 3, ☃);
    a(☃, afi.bf.Q(), 3, 3, 3, ☃);
    a(☃, afi.U.a(akb.a.a.a()), 3, 4, 3, ☃);
    a(☃, afi.bf.Q(), 3, 3, 2, ☃);
    a(☃, afi.bf.Q(), 3, 2, 1, ☃);
    a(☃, afi.U.a(akb.a.a.a()), 3, 3, 1, ☃);
    a(☃, afi.bf.Q(), 2, 2, 1, ☃);
    a(☃, afi.bf.Q(), 1, 1, 1, ☃);
    a(☃, afi.U.a(akb.a.a.a()), 1, 2, 1, ☃);
    a(☃, afi.bf.Q(), 1, 1, 2, ☃);
    a(☃, afi.U.a(akb.a.a.a()), 1, 1, 3, ☃);
    
    return true;
  }
}
