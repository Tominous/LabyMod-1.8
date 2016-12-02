import java.util.List;
import java.util.Random;

public class aqj$g
  extends aqj.m
{
  public aqj$g() {}
  
  public aqj$g(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqj.q)☃, ☃, ☃, 1, 0, true);
    b((aqj.q)☃, ☃, ☃, 0, 1, true);
    c((aqj.q)☃, ☃, ☃, 0, 1, true);
  }
  
  public static g a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, 0, 0, 5, 7, 5, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new g(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    a(☃, ☃, 0, 0, 0, 4, 1, 4, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 0, 2, 0, 4, 5, 4, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 0, 2, 0, 0, 5, 0, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 4, 2, 0, 4, 5, 0, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 0, 2, 4, 0, 5, 4, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 4, 2, 4, 4, 5, 4, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 0, 6, 0, 4, 6, 4, afi.by.Q(), afi.by.Q(), false);
    for (int ☃ = 0; ☃ <= 4; ☃++) {
      for (int ☃ = 0; ☃ <= 4; ☃++) {
        b(☃, afi.by.Q(), ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
