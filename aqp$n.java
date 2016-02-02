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
    
    this.m = ☃;
    this.d = a(☃);
    this.l = ☃;
    
    this.a = (☃.nextInt(2) == 0);
    this.b = (☃.nextInt(2) == 0);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Left", this.a);
    ☃.a("Right", this.b);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a = ☃.n("Left");
    this.b = ☃.n("Right");
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqp.m)☃, ☃, ☃, 1, 1);
    if (this.a) {
      b((aqp.m)☃, ☃, ☃, 1, 2);
    }
    if (this.b) {
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
    
    a(☃, ☃, ☃, this.d, 1, 1, 0);
    
    a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 6);
    
    a(☃, ☃, ☃, 0.1F, 1, 2, 1, afi.aa.Q());
    a(☃, ☃, ☃, 0.1F, 3, 2, 1, afi.aa.Q());
    a(☃, ☃, ☃, 0.1F, 1, 2, 5, afi.aa.Q());
    a(☃, ☃, ☃, 0.1F, 3, 2, 5, afi.aa.Q());
    if (this.a) {
      a(☃, ☃, 0, 1, 2, 0, 3, 4, afi.a.Q(), afi.a.Q(), false);
    }
    if (this.b) {
      a(☃, ☃, 4, 1, 2, 4, 3, 4, afi.a.Q(), afi.a.Q(), false);
    }
    return true;
  }
}
