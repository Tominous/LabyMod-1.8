import java.util.List;
import java.util.Random;

public class aqw$d
  extends aqw.n
{
  public aqw$d() {}
  
  public aqw$d(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    this.m = ☃;
    this.l = ☃;
  }
  
  public static aqe a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 3, 4, 2, ☃);
    if (aqt.a(☃, ☃) != null) {
      return null;
    }
    return ☃;
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (this.h < 0)
    {
      this.h = b(☃, ☃);
      if (this.h < 0) {
        return true;
      }
      this.l.a(0, this.h - this.l.e + 4 - 1, 0);
    }
    a(☃, ☃, 0, 0, 0, 2, 3, 1, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, afi.aO.Q(), 1, 0, 0, ☃);
    a(☃, afi.aO.Q(), 1, 1, 0, ☃);
    a(☃, afi.aO.Q(), 1, 2, 0, ☃);
    
    a(☃, afi.L.a(zd.a.b()), 1, 3, 0, ☃);
    
    boolean ☃ = (this.m == cq.f) || (this.m == cq.c);
    a(☃, afi.aa.Q().a(akf.a, this.m.e()), ☃ ? 2 : 0, 3, 0, ☃);
    a(☃, afi.aa.Q().a(akf.a, this.m), 1, 3, 1, ☃);
    a(☃, afi.aa.Q().a(akf.a, this.m.f()), ☃ ? 0 : 2, 3, 0, ☃);
    a(☃, afi.aa.Q().a(akf.a, this.m.d()), 1, 3, -1, ☃);
    
    return true;
  }
}
