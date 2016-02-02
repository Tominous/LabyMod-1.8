import java.util.List;
import java.util.Random;

public class aqp$o
  extends aqp.p
{
  public aqp$o() {}
  
  public aqp$o(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.d = a(☃);
    this.l = ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqp.m)☃, ☃, ☃, 1, 1);
  }
  
  public static o a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -7, 0, 5, 11, 8, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new o(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 0, 0, 4, 10, 7, true, ☃, aqp.c());
    
    a(☃, ☃, ☃, this.d, 1, 7, 0);
    
    a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 7);
    
    int ☃ = a(afi.aw, 2);
    for (int ☃ = 0; ☃ < 6; ☃++)
    {
      a(☃, afi.aw.a(☃), 1, 6 - ☃, 1 + ☃, ☃);
      a(☃, afi.aw.a(☃), 2, 6 - ☃, 1 + ☃, ☃);
      a(☃, afi.aw.a(☃), 3, 6 - ☃, 1 + ☃, ☃);
      if (☃ < 5)
      {
        a(☃, afi.bf.Q(), 1, 5 - ☃, 1 + ☃, ☃);
        a(☃, afi.bf.Q(), 2, 5 - ☃, 1 + ☃, ☃);
        a(☃, afi.bf.Q(), 3, 5 - ☃, 1 + ☃, ☃);
      }
    }
    return true;
  }
}
