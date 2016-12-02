import java.util.List;
import java.util.Random;

public class aqp$c
  extends aqp.p
{
  private boolean a;
  private boolean b;
  private boolean c;
  private boolean e;
  
  public aqp$c() {}
  
  public aqp$c(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    m = ☃;
    d = a(☃);
    l = ☃;
    
    a = ☃.nextBoolean();
    b = ☃.nextBoolean();
    c = ☃.nextBoolean();
    e = (☃.nextInt(3) > 0);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("leftLow", a);
    ☃.a("leftHigh", b);
    ☃.a("rightLow", c);
    ☃.a("rightHigh", e);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    a = ☃.n("leftLow");
    b = ☃.n("leftHigh");
    c = ☃.n("rightLow");
    e = ☃.n("rightHigh");
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = 3;
    int ☃ = 5;
    if ((m == cq.e) || (m == cq.c))
    {
      ☃ = 8 - ☃;
      ☃ = 8 - ☃;
    }
    a((aqp.m)☃, ☃, ☃, 5, 1);
    if (a) {
      b((aqp.m)☃, ☃, ☃, ☃, 1);
    }
    if (b) {
      b((aqp.m)☃, ☃, ☃, ☃, 7);
    }
    if (c) {
      c((aqp.m)☃, ☃, ☃, ☃, 1);
    }
    if (e) {
      c((aqp.m)☃, ☃, ☃, ☃, 7);
    }
  }
  
  public static c a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -4, -3, 0, 10, 9, 11, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new c(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 9, 8, 10, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, d, 4, 3, 0);
    if (a) {
      a(☃, ☃, 0, 3, 1, 0, 5, 3, afi.a.Q(), afi.a.Q(), false);
    }
    if (c) {
      a(☃, ☃, 9, 3, 1, 9, 5, 3, afi.a.Q(), afi.a.Q(), false);
    }
    if (b) {
      a(☃, ☃, 0, 5, 7, 0, 7, 9, afi.a.Q(), afi.a.Q(), false);
    }
    if (e) {
      a(☃, ☃, 9, 5, 7, 9, 7, 9, afi.a.Q(), afi.a.Q(), false);
    }
    a(☃, ☃, 5, 1, 10, 7, 3, 10, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 1, 2, 1, 8, 2, 6, false, ☃, aqp.c());
    
    a(☃, ☃, 4, 1, 5, 4, 4, 9, false, ☃, aqp.c());
    a(☃, ☃, 8, 1, 5, 8, 4, 9, false, ☃, aqp.c());
    
    a(☃, ☃, 1, 4, 7, 3, 4, 9, false, ☃, aqp.c());
    
    a(☃, ☃, 1, 3, 5, 3, 3, 6, false, ☃, aqp.c());
    a(☃, ☃, 1, 3, 4, 3, 3, 4, afi.U.Q(), afi.U.Q(), false);
    a(☃, ☃, 1, 4, 6, 3, 4, 6, afi.U.Q(), afi.U.Q(), false);
    
    a(☃, ☃, 5, 1, 7, 7, 1, 8, false, ☃, aqp.c());
    a(☃, ☃, 5, 1, 9, 7, 1, 9, afi.U.Q(), afi.U.Q(), false);
    a(☃, ☃, 5, 2, 7, 7, 2, 7, afi.U.Q(), afi.U.Q(), false);
    
    a(☃, ☃, 4, 5, 7, 4, 5, 9, afi.U.Q(), afi.U.Q(), false);
    a(☃, ☃, 8, 5, 7, 8, 5, 9, afi.U.Q(), afi.U.Q(), false);
    a(☃, ☃, 5, 5, 7, 7, 5, 9, afi.T.Q(), afi.T.Q(), false);
    a(☃, afi.aa.Q(), 6, 5, 6, ☃);
    
    return true;
  }
}
