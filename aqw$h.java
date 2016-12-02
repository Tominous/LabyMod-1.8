import java.util.List;
import java.util.Random;

public class aqw$h
  extends aqw.n
{
  private boolean a;
  private int b;
  
  public aqw$h() {}
  
  public aqw$h(aqw.k ☃, int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃, ☃);
    
    this.m = ☃;
    this.l = ☃;
    this.a = ☃.nextBoolean();
    this.b = ☃.nextInt(3);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("T", this.b);
    ☃.a("C", this.a);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.b = ☃.f("T");
    this.a = ☃.n("C");
  }
  
  public static h a(aqw.k ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, 0, 0, 0, 4, 6, 5, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new h(☃, ☃, ☃, ☃, ☃);
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
    a(☃, ☃, 1, 1, 1, 3, 5, 4, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 0, 0, 0, 3, 0, 4, afi.e.Q(), afi.e.Q(), false);
    a(☃, ☃, 1, 0, 1, 2, 0, 3, afi.d.Q(), afi.d.Q(), false);
    if (this.a) {
      a(☃, ☃, 1, 4, 1, 2, 4, 3, afi.r.Q(), afi.r.Q(), false);
    } else {
      a(☃, ☃, 1, 5, 1, 2, 5, 3, afi.r.Q(), afi.r.Q(), false);
    }
    a(☃, afi.r.Q(), 1, 4, 0, ☃);
    a(☃, afi.r.Q(), 2, 4, 0, ☃);
    a(☃, afi.r.Q(), 1, 4, 4, ☃);
    a(☃, afi.r.Q(), 2, 4, 4, ☃);
    a(☃, afi.r.Q(), 0, 4, 1, ☃);
    a(☃, afi.r.Q(), 0, 4, 2, ☃);
    a(☃, afi.r.Q(), 0, 4, 3, ☃);
    a(☃, afi.r.Q(), 3, 4, 1, ☃);
    a(☃, afi.r.Q(), 3, 4, 2, ☃);
    a(☃, afi.r.Q(), 3, 4, 3, ☃);
    
    a(☃, ☃, 0, 1, 0, 0, 3, 0, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 3, 1, 0, 3, 3, 0, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 0, 1, 4, 0, 3, 4, afi.r.Q(), afi.r.Q(), false);
    a(☃, ☃, 3, 1, 4, 3, 3, 4, afi.r.Q(), afi.r.Q(), false);
    
    a(☃, ☃, 0, 1, 1, 0, 3, 3, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 3, 1, 1, 3, 3, 3, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 1, 1, 0, 2, 3, 0, afi.f.Q(), afi.f.Q(), false);
    a(☃, ☃, 1, 1, 4, 2, 3, 4, afi.f.Q(), afi.f.Q(), false);
    
    a(☃, afi.bj.Q(), 0, 2, 2, ☃);
    a(☃, afi.bj.Q(), 3, 2, 2, ☃);
    if (this.b > 0)
    {
      a(☃, afi.aO.Q(), this.b, 1, 3, ☃);
      a(☃, afi.aB.Q(), this.b, 2, 3, ☃);
    }
    a(☃, afi.a.Q(), 1, 1, 0, ☃);
    a(☃, afi.a.Q(), 1, 2, 0, ☃);
    a(☃, ☃, ☃, 1, 1, 0, cq.b(a(afi.ao, 1)));
    if ((a(☃, 1, 0, -1, ☃).c().t() == arm.a) && (a(☃, 1, -1, -1, ☃).c().t() != arm.a)) {
      a(☃, afi.aw.a(a(afi.aw, 3)), 1, 0, -1, ☃);
    }
    for (int ☃ = 0; ☃ < 5; ☃++) {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        b(☃, ☃, 6, ☃, ☃);
        b(☃, afi.e.Q(), ☃, -1, ☃, ☃);
      }
    }
    a(☃, ☃, 1, 1, 2, 1);
    
    return true;
  }
}
