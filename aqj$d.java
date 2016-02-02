import java.util.List;
import java.util.Random;

public class aqj$d
  extends aqj.m
{
  public aqj$d() {}
  
  public aqj$d(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqj.q)☃, ☃, ☃, 1, 0, true);
  }
  
  public static d a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -7, 0, 5, 14, 10, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new d(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    int ☃ = a(afi.bA, 2);
    for (int ☃ = 0; ☃ <= 9; ☃++)
    {
      int ☃ = Math.max(1, 7 - ☃);
      int ☃ = Math.min(Math.max(☃ + 5, 14 - ☃), 13);
      int ☃ = ☃;
      
      a(☃, ☃, 0, 0, ☃, 4, ☃, ☃, afi.by.Q(), afi.by.Q(), false);
      
      a(☃, ☃, 1, ☃ + 1, ☃, 3, ☃ - 1, ☃, afi.a.Q(), afi.a.Q(), false);
      if (☃ <= 6)
      {
        a(☃, afi.bA.a(☃), 1, ☃ + 1, ☃, ☃);
        a(☃, afi.bA.a(☃), 2, ☃ + 1, ☃, ☃);
        a(☃, afi.bA.a(☃), 3, ☃ + 1, ☃, ☃);
      }
      a(☃, ☃, 0, ☃, ☃, 4, ☃, ☃, afi.by.Q(), afi.by.Q(), false);
      
      a(☃, ☃, 0, ☃ + 1, ☃, 0, ☃ - 1, ☃, afi.by.Q(), afi.by.Q(), false);
      a(☃, ☃, 4, ☃ + 1, ☃, 4, ☃ - 1, ☃, afi.by.Q(), afi.by.Q(), false);
      if ((☃ & 0x1) == 0)
      {
        a(☃, ☃, 0, ☃ + 2, ☃, 0, ☃ + 3, ☃, afi.bz.Q(), afi.bz.Q(), false);
        a(☃, ☃, 4, ☃ + 2, ☃, 4, ☃ + 3, ☃, afi.bz.Q(), afi.bz.Q(), false);
      }
      for (int ☃ = 0; ☃ <= 4; ☃++) {
        b(☃, afi.by.Q(), ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
