import java.util.List;
import java.util.Random;

public class aqp$i
  extends aqp.d
{
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    if ((this.m == cq.c) || (this.m == cq.f)) {
      c((aqp.m)☃, ☃, ☃, 1, 1);
    } else {
      b((aqp.m)☃, ☃, ☃, 1, 1);
    }
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 4, 4, 4, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, this.d, 1, 1, 0);
    if ((this.m == cq.c) || (this.m == cq.f)) {
      a(☃, ☃, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
    } else {
      a(☃, ☃, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
    }
    return true;
  }
}
