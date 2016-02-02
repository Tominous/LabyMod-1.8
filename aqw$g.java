import java.util.List;
import java.util.Random;

public class aqw$g
  extends aqw.n
{
  private boolean a;
  
  public aqw$g() {}
  
  public aqw$g(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    this.m = ☃;
    this.l = ☃;
    this.a = ☃.nextBoolean();
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Terrace", this.a);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a = ☃.n("Terrace");
  }
  
  public static g a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 5, 6, 5, ☃);
    if (aqt.a(☃, ☃) != null) {
      return null;
    }
    return new g(☃, ☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (this.h < 0)
    {
      this.h = b(☃, ☃);
      if (this.h < 0) {
        return true;
      }
      this.l.a(0, this.h - this.l.e + 6 - 1, 0);
    }
    a(☃, ☃, 0, 0, 0, 4, 0, 4, afi.e.Q(), afi.e.Q(), false);
    
    a(☃, ☃, 0, 4, 0, 4, 4, 4, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 1, 4, 1, 3, 4, 3, afi.f.Q(), afi.f.Q(), false);
    
    a(☃, afi.e.Q(), 0, 1, 0, ☃);
    a(☃, afi.e.Q(), 0, 2, 0, ☃);
    a(☃, afi.e.Q(), 0, 3, 0, ☃);
    a(☃, afi.e.Q(), 4, 1, 0, ☃);
    a(☃, afi.e.Q(), 4, 2, 0, ☃);
    a(☃, afi.e.Q(), 4, 3, 0, ☃);
    a(☃, afi.e.Q(), 0, 1, 4, ☃);
    a(☃, afi.e.Q(), 0, 2, 4, ☃);
    a(☃, afi.e.Q(), 0, 3, 4, ☃);
    a(☃, afi.e.Q(), 4, 1, 4, ☃);
    a(☃, afi.e.Q(), 4, 2, 4, ☃);
    a(☃, afi.e.Q(), 4, 3, 4, ☃);
    a(☃, ☃, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 4, 1, 1, 4, 3, 3, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 1, 1, 4, 3, 3, 4, afi.f.Q(), afi.f.Q(), false);
    a(☃, afi.bj.Q(), 0, 2, 2, ☃);
    a(☃, afi.bj.Q(), 2, 2, 4, ☃);
    a(☃, afi.bj.Q(), 4, 2, 2, ☃);
    
    a(☃, afi.f.Q(), 1, 1, 0, ☃);
    a(☃, afi.f.Q(), 1, 2, 0, ☃);
    a(☃, afi.f.Q(), 1, 3, 0, ☃);
    a(☃, afi.f.Q(), 2, 3, 0, ☃);
    a(☃, afi.f.Q(), 3, 3, 0, ☃);
    a(☃, afi.f.Q(), 3, 2, 0, ☃);
    a(☃, afi.f.Q(), 3, 1, 0, ☃);
    if ((a(☃, 2, 0, -1, ☃).c().t() == arm.a) && (a(☃, 2, -1, -1, ☃).c().t() != arm.a)) {
      a(☃, afi.aw.a(a(afi.aw, 3)), 2, 0, -1, ☃);
    }
    a(☃, ☃, 1, 1, 1, 3, 3, 3, afi.a.Q(), afi.a.Q(), false);
    if (this.a)
    {
      a(☃, afi.aO.Q(), 0, 5, 0, ☃);
      a(☃, afi.aO.Q(), 1, 5, 0, ☃);
      a(☃, afi.aO.Q(), 2, 5, 0, ☃);
      a(☃, afi.aO.Q(), 3, 5, 0, ☃);
      a(☃, afi.aO.Q(), 4, 5, 0, ☃);
      a(☃, afi.aO.Q(), 0, 5, 4, ☃);
      a(☃, afi.aO.Q(), 1, 5, 4, ☃);
      a(☃, afi.aO.Q(), 2, 5, 4, ☃);
      a(☃, afi.aO.Q(), 3, 5, 4, ☃);
      a(☃, afi.aO.Q(), 4, 5, 4, ☃);
      a(☃, afi.aO.Q(), 4, 5, 1, ☃);
      a(☃, afi.aO.Q(), 4, 5, 2, ☃);
      a(☃, afi.aO.Q(), 4, 5, 3, ☃);
      a(☃, afi.aO.Q(), 0, 5, 1, ☃);
      a(☃, afi.aO.Q(), 0, 5, 2, ☃);
      a(☃, afi.aO.Q(), 0, 5, 3, ☃);
    }
    if (this.a)
    {
      int ☃ = a(afi.au, 3);
      a(☃, afi.au.a(☃), 3, 1, 3, ☃);
      a(☃, afi.au.a(☃), 3, 2, 3, ☃);
      a(☃, afi.au.a(☃), 3, 3, 3, ☃);
      a(☃, afi.au.a(☃), 3, 4, 3, ☃);
    }
    a(☃, afi.aa.Q().a(akf.a, this.m), 2, 3, 1, ☃);
    for (int ☃ = 0; ☃ < 5; ☃++) {
      for (int ☃ = 0; ☃ < 5; ☃++)
      {
        b(☃, ☃, 6, ☃, ☃);
        b(☃, afi.e.Q(), ☃, -1, ☃, ☃);
      }
    }
    a(☃, ☃, 1, 1, 2, 1);
    
    return true;
  }
}
