import java.util.List;
import java.util.Random;

public class aqj$l
  extends aqj.m
{
  private boolean b;
  
  public aqj$l() {}
  
  public aqj$l(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    
    this.b = ☃.n("Mob");
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    
    ☃.a("Mob", this.b);
  }
  
  public static l a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -2, 0, 0, 7, 8, 9, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new l(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    a(☃, ☃, 0, 2, 0, 6, 7, 7, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 1, 0, 0, 5, 1, 7, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 2, 1, 5, 2, 7, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 3, 2, 5, 3, 7, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 4, 3, 5, 4, 7, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 1, 2, 0, 1, 4, 2, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 5, 2, 0, 5, 4, 2, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 5, 2, 1, 5, 3, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 5, 5, 2, 5, 5, 3, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 0, 5, 3, 0, 5, 8, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 6, 5, 3, 6, 5, 8, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 5, 8, 5, 5, 8, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, afi.bz.Q(), 1, 6, 3, ☃);
    a(☃, afi.bz.Q(), 5, 6, 3, ☃);
    a(☃, ☃, 0, 6, 3, 0, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 6, 6, 3, 6, 6, 8, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 1, 6, 8, 5, 7, 8, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 2, 8, 8, 4, 8, 8, afi.bz.Q(), afi.bz.Q(), false);
    if (!this.b)
    {
      cj ☃ = new cj(a(3, 5), d(5), b(3, 5));
      if (☃.b(☃))
      {
        this.b = true;
        ☃.a(☃, afi.ac.Q(), 2);
        
        akw ☃ = ☃.s(☃);
        if ((☃ instanceof all)) {
          ((all)☃).b().a("Blaze");
        }
      }
    }
    for (int ☃ = 0; ☃ <= 6; ☃++) {
      for (int ☃ = 0; ☃ <= 6; ☃++) {
        b(☃, afi.by.Q(), ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
