import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Random;

public class qy
  extends rd
{
  private static final Predicate<alz> b = amh.a(afi.H).a(akc.a, Predicates.equalTo(akc.a.b));
  private ps c;
  private adm d;
  int a;
  
  public qy(ps ☃)
  {
    c = ☃;
    d = o;
    a(7);
  }
  
  public boolean a()
  {
    if (c.bc().nextInt(c.j_() ? 50 : 1000) != 0) {
      return false;
    }
    cj ☃ = new cj(c.s, c.t, c.u);
    if (b.apply(d.p(☃))) {
      return true;
    }
    if (d.p(☃.b()).c() == afi.c) {
      return true;
    }
    return false;
  }
  
  public void c()
  {
    a = 40;
    d.a(c, (byte)10);
    c.s().n();
  }
  
  public void d()
  {
    a = 0;
  }
  
  public boolean b()
  {
    return a > 0;
  }
  
  public int f()
  {
    return a;
  }
  
  public void e()
  {
    a = Math.max(0, a - 1);
    if (a != 4) {
      return;
    }
    cj ☃ = new cj(c.s, c.t, c.u);
    if (b.apply(d.p(☃)))
    {
      if (d.Q().b("mobGriefing")) {
        d.b(☃, false);
      }
      c.v();
    }
    else
    {
      cj ☃ = ☃.b();
      if (d.p(☃).c() == afi.c)
      {
        if (d.Q().b("mobGriefing"))
        {
          d.b(2001, ☃, afh.a(afi.c));
          d.a(☃, afi.d.Q(), 2);
        }
        c.v();
      }
    }
  }
}
