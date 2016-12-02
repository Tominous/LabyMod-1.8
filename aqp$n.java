import java.util.List;
import java.util.Random;

public class aqp$n
  extends aqp.p
{
  private boolean a;
  private boolean b;
  
  public aqp$n() {}
  
  public aqp$n(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    m = ☃;
    d = a(☃);
    l = ☃;
    
    a = (☃.nextInt(2) == 0);
    b = (☃.nextInt(2) == 0);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Left", a);
    ☃.a("Right", b);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    a = ☃.n("Left");
    b = ☃.n("Right");
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqp.m)☃, ☃, ☃, 1, 1);
    if (a) {
      b((aqp.m)☃, ☃, ☃, 1, 2);
    }
    if (b) {
      c((aqp.m)☃, ☃, ☃, 1, 2);
    }
  }
  
  public static n a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 7, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new n(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 4, 4, 6, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, d, 1, 1, 0);
    
    a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 6);
    
    a(☃, ☃, ☃, 0.1F, 1, 2, 1, afi.aa.Q());
    a(☃, ☃, ☃, 0.1F, 3, 2, 1, afi.aa.Q());
    a(☃, ☃, ☃, 0.1F, 1, 2, 5, afi.aa.Q());
    a(☃, ☃, ☃, 0.1F, 3, 2, 5, afi.aa.Q());
    if (a) {
      a(☃, ☃, 0, 1, 2, 0, 3, 4, afi.a.Q(), afi.a.Q(), false);
    }
    if (b) {
      a(☃, ☃, 4, 1, 2, 4, 3, 4, afi.a.Q(), afi.a.Q(), false);
    }
    return true;
  }
}
