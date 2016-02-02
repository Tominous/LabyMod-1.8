import java.util.List;
import java.util.Random;

public class aqj$a
  extends aqj.m
{
  public aqj$a() {}
  
  public aqj$a(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
  }
  
  protected aqj$a(Random ☃, int ☃, int ☃)
  {
    super(0);
    
    this.m = cq.c.a.a(☃);
    switch (aqj.1.a[this.m.ordinal()])
    {
    case 1: 
    case 2: 
      this.l = new aqe(☃, 64, ☃, ☃ + 19 - 1, 73, ☃ + 19 - 1);
      break;
    default: 
      this.l = new aqe(☃, 64, ☃, ☃ + 19 - 1, 73, ☃ + 19 - 1);
    }
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    a((aqj.q)☃, ☃, ☃, 8, 3, false);
    b((aqj.q)☃, ☃, ☃, 3, 8, false);
    c((aqj.q)☃, ☃, ☃, 3, 8, false);
  }
  
  public static a a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -8, -3, 0, 19, 10, 19, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new a(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    a(☃, ☃, 7, 3, 0, 11, 4, 18, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 0, 3, 7, 18, 4, 11, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 8, 5, 0, 10, 7, 18, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, 0, 5, 8, 18, 7, 10, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 7, 5, 0, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 7, 5, 11, 7, 5, 18, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 11, 5, 0, 11, 5, 7, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 11, 5, 11, 11, 5, 18, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 0, 5, 7, 7, 5, 7, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 11, 5, 7, 18, 5, 7, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 0, 5, 11, 7, 5, 11, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 11, 5, 11, 18, 5, 11, afi.by.Q(), afi.by.Q(), false);
    
    a(☃, ☃, 7, 2, 0, 11, 2, 5, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 7, 2, 13, 11, 2, 18, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 7, 0, 0, 11, 1, 3, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 7, 0, 15, 11, 1, 18, afi.by.Q(), afi.by.Q(), false);
    for (int ☃ = 7; ☃ <= 11; ☃++) {
      for (int ☃ = 0; ☃ <= 2; ☃++)
      {
        b(☃, afi.by.Q(), ☃, -1, ☃, ☃);
        b(☃, afi.by.Q(), ☃, -1, 18 - ☃, ☃);
      }
    }
    a(☃, ☃, 0, 2, 7, 5, 2, 11, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 13, 2, 7, 18, 2, 11, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 0, 0, 7, 3, 1, 11, afi.by.Q(), afi.by.Q(), false);
    a(☃, ☃, 15, 0, 7, 18, 1, 11, afi.by.Q(), afi.by.Q(), false);
    for (int ☃ = 0; ☃ <= 2; ☃++) {
      for (int ☃ = 7; ☃ <= 11; ☃++)
      {
        b(☃, afi.by.Q(), ☃, -1, ☃, ☃);
        b(☃, afi.by.Q(), 18 - ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
