import java.util.List;
import java.util.Random;

public class aqj$e
  extends aqj.m
{
  public aqj$e() {}
  
  public aqj$e(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = 1;
    if ((this.m == cq.e) || (this.m == cq.c)) {
      ☃ = 5;
    }
    b((aqj.q)☃, ☃, ☃, 0, ☃, ☃.nextInt(8) > 0);
    c((aqj.q)☃, ☃, ☃, 0, ☃, ☃.nextInt(8) > 0);
  }
  
  public static e a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -3, 0, 0, 9, 7, 9, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new e(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    a(☃, ☃, 0, 0, 0, 8, 1, 8, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 0, 2, 0, 8, 5, 8, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 0, 6, 0, 8, 6, 5, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 0, 2, 0, 2, 5, 0, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 6, 2, 0, 8, 5, 0, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 3, 0, 1, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 7, 3, 0, 7, 4, 0, afi.bz.Q(), afi.bz.Q(), false);
    
    a(☃, ☃, 0, 2, 4, 8, 2, 8, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 1, 4, 2, 2, 4, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, 6, 1, 4, 7, 2, 4, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 0, 3, 8, 8, 3, 8, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 0, 3, 6, 0, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 8, 3, 6, 8, 3, 7, afi.bz.Q(), afi.bz.Q(), false);
    
    a(☃, ☃, 0, 3, 4, 0, 5, 5, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 8, 3, 4, 8, 5, 5, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 3, 5, 2, 5, 5, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 6, 3, 5, 7, 5, 5, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 1, 4, 5, 1, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
    a(☃, ☃, 7, 4, 5, 7, 5, 5, afi.bz.Q(), afi.bz.Q(), false);
    for (int ☃ = 0; ☃ <= 5; ☃++) {
      for (int ☃ = 0; ☃ <= 8; ☃++) {
        b(☃, afi.by.Q(), ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
