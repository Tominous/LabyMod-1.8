import java.util.List;
import java.util.Random;

public class aqw$c
  extends aqw.n
{
  private afh a;
  private afh b;
  
  public aqw$c() {}
  
  public aqw$c(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    this.m = ☃;
    this.l = ☃;
    
    this.a = a(☃);
    this.b = a(☃);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("CA", afh.c.b(this.a));
    ☃.a("CB", afh.c.b(this.b));
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a = afh.c(☃.f("CA"));
    this.b = afh.c(☃.f("CB"));
  }
  
  private afh a(Random ☃)
  {
    switch (☃.nextInt(5))
    {
    default: 
      return afi.aj;
    case 0: 
      return afi.cb;
    }
    return afi.cc;
  }
  
  public static c a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 7, 4, 9, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new c(☃, ☃, ☃, ☃, ☃);
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
    a(☃, ☃, 0, 1, 0, 6, 4, 8, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 1, 0, 1, 2, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
    a(☃, ☃, 4, 0, 1, 5, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
    
    a(☃, ☃, 0, 0, 0, 0, 0, 8, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 6, 0, 0, 6, 0, 8, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 1, 0, 0, 5, 0, 0, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 1, 0, 8, 5, 0, 8, afi.r.Q(), afi.r.Q(), false);
    
    a(☃, ☃, 3, 0, 1, 3, 0, 7, afi.j.Q(), afi.j.Q(), false);
    for (int ☃ = 1; ☃ <= 7; ☃++)
    {
      a(☃, this.a.a(ns.a(☃, 2, 7)), 1, 1, ☃, ☃);
      a(☃, this.a.a(ns.a(☃, 2, 7)), 2, 1, ☃, ☃);
      a(☃, this.b.a(ns.a(☃, 2, 7)), 4, 1, ☃, ☃);
      a(☃, this.b.a(ns.a(☃, 2, 7)), 5, 1, ☃, ☃);
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      for (int ☃ = 0; ☃ < 7; ☃++)
      {
        b(☃, ☃, 4, ☃, ☃);
        b(☃, afi.d.Q(), ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
