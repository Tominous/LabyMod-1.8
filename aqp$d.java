import java.util.List;
import java.util.Random;

public class aqp$d
  extends aqp.p
{
  public aqp$d() {}
  
  public aqp$d(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    m = ☃;
    d = a(☃);
    l = ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    if ((m == cq.c) || (m == cq.f)) {
      b((aqp.m)☃, ☃, ☃, 1, 1);
    } else {
      c((aqp.m)☃, ☃, ☃, 1, 1);
    }
  }
  
  public static d a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 5, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new d(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 4, 4, 4, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, d, 1, 1, 0);
    if ((m == cq.c) || (m == cq.f)) {
      a(☃, ☃, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
    } else {
      a(☃, ☃, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
    }
    return true;
  }
}
