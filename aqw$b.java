import java.util.List;
import java.util.Random;

public class aqw$b
  extends aqw.n
{
  private afh a;
  private afh b;
  private afh c;
  private afh d;
  
  public aqw$b() {}
  
  public aqw$b(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    this.m = ☃;
    this.l = ☃;
    
    this.a = a(☃);
    this.b = a(☃);
    this.c = a(☃);
    this.d = a(☃);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("CA", afh.c.b(this.a));
    ☃.a("CB", afh.c.b(this.b));
    ☃.a("CC", afh.c.b(this.c));
    ☃.a("CD", afh.c.b(this.d));
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a = afh.c(☃.f("CA"));
    this.b = afh.c(☃.f("CB"));
    this.c = afh.c(☃.f("CC"));
    this.d = afh.c(☃.f("CD"));
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
  
  public static b a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 13, 4, 9, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new b(☃, ☃, ☃, ☃, ☃);
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
    a(☃, ☃, 0, 1, 0, 12, 4, 8, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 1, 0, 1, 2, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
    a(☃, ☃, 4, 0, 1, 5, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
    a(☃, ☃, 7, 0, 1, 8, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
    a(☃, ☃, 10, 0, 1, 11, 0, 7, afi.ak.Q(), afi.ak.Q(), false);
    
    a(☃, ☃, 0, 0, 0, 0, 0, 8, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 6, 0, 0, 6, 0, 8, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 12, 0, 0, 12, 0, 8, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 1, 0, 0, 11, 0, 0, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 1, 0, 8, 11, 0, 8, afi.r.Q(), afi.r.Q(), false);
    
    a(☃, ☃, 3, 0, 1, 3, 0, 7, afi.j.Q(), afi.j.Q(), false);
    a(☃, ☃, 9, 0, 1, 9, 0, 7, afi.j.Q(), afi.j.Q(), false);
    for (int ☃ = 1; ☃ <= 7; ☃++)
    {
      a(☃, this.a.a(ns.a(☃, 2, 7)), 1, 1, ☃, ☃);
      a(☃, this.a.a(ns.a(☃, 2, 7)), 2, 1, ☃, ☃);
      a(☃, this.b.a(ns.a(☃, 2, 7)), 4, 1, ☃, ☃);
      a(☃, this.b.a(ns.a(☃, 2, 7)), 5, 1, ☃, ☃);
      a(☃, this.c.a(ns.a(☃, 2, 7)), 7, 1, ☃, ☃);
      a(☃, this.c.a(ns.a(☃, 2, 7)), 8, 1, ☃, ☃);
      a(☃, this.d.a(ns.a(☃, 2, 7)), 10, 1, ☃, ☃);
      a(☃, this.d.a(ns.a(☃, 2, 7)), 11, 1, ☃, ☃);
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      for (int ☃ = 0; ☃ < 13; ☃++)
      {
        b(☃, ☃, 4, ☃, ☃);
        b(☃, afi.d.Q(), ☃, -1, ☃, ☃);
      }
    }
    return true;
  }
}
