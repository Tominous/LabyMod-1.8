import java.util.List;
import java.util.Random;

public class aqg$d
  extends aqt
{
  public aqg$d() {}
  
  public aqg$d(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    this.m = ☃;
    this.l = ☃;
  }
  
  protected void a(dn ☃) {}
  
  protected void b(dn ☃) {}
  
  public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    aqe ☃ = new aqe(☃, ☃ - 5, ☃, ☃, ☃ + 2, ☃);
    switch (aqg.1.a[☃.ordinal()])
    {
    case 1: 
      ☃.d = (☃ + 2);
      ☃.c = (☃ - 8);
      break;
    case 2: 
      ☃.d = (☃ + 2);
      ☃.f = (☃ + 8);
      break;
    case 3: 
      ☃.a = (☃ - 8);
      ☃.f = (☃ + 2);
      break;
    case 4: 
      ☃.d = (☃ + 8);
      ☃.f = (☃ + 2);
    }
    if (aqt.a(☃, ☃) != null) {
      return null;
    }
    return ☃;
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = d();
    if (this.m != null) {
      switch (aqg.1.a[this.m.ordinal()])
      {
      case 1: 
        aqg.a(☃, ☃, ☃, this.l.a, this.l.b, this.l.c - 1, cq.c, ☃);
        break;
      case 2: 
        aqg.a(☃, ☃, ☃, this.l.a, this.l.b, this.l.f + 1, cq.d, ☃);
        break;
      case 3: 
        aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c, cq.e, ☃);
        break;
      case 4: 
        aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c, cq.f, ☃);
      }
    }
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, 0, 5, 0, 2, 7, 1, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 0, 0, 7, 2, 2, 8, afi.a.Q(), afi.a.Q(), false);
    for (int ☃ = 0; ☃ < 5; ☃++) {
      a(☃, ☃, 0, 5 - ☃ - (☃ < 4 ? 1 : 0), 2 + ☃, 2, 7 - ☃, 2 + ☃, afi.a.Q(), afi.a.Q(), false);
    }
    return true;
  }
}
