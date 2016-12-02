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
    this.c = ☃;
    this.d = ☃.o;
    a(7);
  }
  
  public boolean a()
  {
    if (this.c.bc().nextInt(this.c.j_() ? 50 : 1000) != 0) {
      return false;
    }
    cj ☃ = new cj(this.c.s, this.c.t, this.c.u);
    if (b.apply(this.d.p(☃))) {
      return true;
    }
    if (this.d.p(☃.b()).c() == afi.c) {
      return true;
    }
    return false;
  }
  
  public void c()
  {
    this.a = 40;
    this.d.a(this.c, (byte)10);
    this.c.s().n();
  }
  
  public void d()
  {
    this.a = 0;
  }
  
  public boolean b()
  {
    return this.a > 0;
  }
  
  public int f()
  {
    return this.a;
  }
  
  public void e()
  {
    this.a = Math.max(0, this.a - 1);
    if (this.a != 4) {
      return;
    }
    cj ☃ = new cj(this.c.s, this.c.t, this.c.u);
    if (b.apply(this.d.p(☃)))
    {
      if (this.d.Q().b("mobGriefing")) {
        this.d.b(☃, false);
      }
      this.c.v();
    }
    else
    {
      cj ☃ = ☃.b();
      if (this.d.p(☃).c() == afi.c)
      {
        if (this.d.Q().b("mobGriefing"))
        {
          this.d.b(2001, ☃, afh.a(afi.c));
          this.d.a(☃, afi.d.Q(), 2);
        }
        this.c.v();
      }
    }
  }
}
