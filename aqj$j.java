import java.util.List;
import java.util.Random;

public class aqj$j
  extends aqj.m
{
  private boolean b;
  
  public aqj$j() {}
  
  public aqj$j(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    m = ☃;
    l = ☃;
    
    b = (☃.nextInt(3) == 0);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    
    b = ☃.n("Chest");
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    
    ☃.a("Chest", b);
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    c((aqj.q)☃, ☃, ☃, 0, 1, true);
  }
  
  public static j a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, 0, 0, 5, 7, 5, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new j(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    a(☃, ☃, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 0, 2, 0, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 0, 3, 1, 0, 4, 1, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 0, 3, 3, 0, 4, 3, afi.bz.Q(), afi.bz.Q(), false);
    
    a(☃, ☃, 4, 2, 0, 4, 5, 0, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 1, 2, 4, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 3, 4, 1, 4, 4, afi.bz.Q(), afi.by.Q(), false);
    a(☃, ☃, 3, 3, 4, 3, 4, 4, afi.bz.Q(), afi.by.Q(), false);
    if ((b) && 
      (☃.b(new cj(a(1, 3), d(2), b(1, 3)))))
    {
      b = false;
      a(☃, ☃, ☃, 1, 2, 3, a, 2 + ☃.nextInt(4));
    }
    a(☃, ☃, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
    for (int ☃ = 0; ☃ <= 4; ☃++) {
      for (int ☃ = 0; ☃ <= 4; ☃++) {
        b(☃, afi.by.Q(), ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
