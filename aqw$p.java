import java.util.List;
import java.util.Random;

public class aqw$p
  extends aqw.n
{
  public aqw$p() {}
  
  public aqw$p(aqw.k ☃, int ☃, Random ☃, int ☃, int ☃)
  {
    super(☃, ☃);
    
    this.m = cq.c.a.a(☃);
    switch (aqw.1.a[this.m.ordinal()])
    {
    case 1: 
    case 2: 
      this.l = new aqe(☃, 64, ☃, ☃ + 6 - 1, 78, ☃ + 6 - 1);
      break;
    default: 
      this.l = new aqe(☃, 64, ☃, ☃ + 6 - 1, 78, ☃ + 6 - 1);
    }
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    aqw.b((aqw.k)☃, ☃, ☃, this.l.a - 1, this.l.e - 4, this.l.c + 1, cq.e, d());
    aqw.b((aqw.k)☃, ☃, ☃, this.l.d + 1, this.l.e - 4, this.l.c + 1, cq.f, d());
    aqw.b((aqw.k)☃, ☃, ☃, this.l.a + 1, this.l.e - 4, this.l.c - 1, cq.c, d());
    aqw.b((aqw.k)☃, ☃, ☃, this.l.a + 1, this.l.e - 4, this.l.f + 1, cq.d, d());
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (this.h < 0)
    {
      this.h = b(☃, ☃);
      if (this.h < 0) {
        return true;
      }
      this.l.a(0, this.h - this.l.e + 3, 0);
    }
    a(☃, ☃, 1, 0, 1, 4, 12, 4, afi.e.Q(), afi.i.Q(), false);
    a(☃, afi.a.Q(), 2, 12, 2, ☃);
    a(☃, afi.a.Q(), 3, 12, 2, ☃);
    a(☃, afi.a.Q(), 2, 12, 3, ☃);
    a(☃, afi.a.Q(), 3, 12, 3, ☃);
    
    a(☃, afi.aO.Q(), 1, 13, 1, ☃);
    a(☃, afi.aO.Q(), 1, 14, 1, ☃);
    a(☃, afi.aO.Q(), 4, 13, 1, ☃);
    a(☃, afi.aO.Q(), 4, 14, 1, ☃);
    a(☃, afi.aO.Q(), 1, 13, 4, ☃);
    a(☃, afi.aO.Q(), 1, 14, 4, ☃);
    a(☃, afi.aO.Q(), 4, 13, 4, ☃);
    a(☃, afi.aO.Q(), 4, 14, 4, ☃);
    a(☃, ☃, 1, 15, 1, 4, 15, 4, afi.e.Q(), afi.e.Q(), false);
    for (int ☃ = 0; ☃ <= 5; ☃++) {
      for (int ☃ = 0; ☃ <= 5; ☃++) {
        if ((☃ == 0) || (☃ == 5) || (☃ == 0) || (☃ == 5))
        {
          a(☃, afi.n.Q(), ☃, 11, ☃, ☃);
          b(☃, ☃, 12, ☃, ☃);
        }
      }
    }
    return true;
  }
}
