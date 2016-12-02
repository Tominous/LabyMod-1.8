import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

class ayf$d
  extends awi
{
  private final List<pm.a> v = Lists.newArrayList();
  
  public ayf$d(ayf arg1, ave ☃)
  {
    super(☃, ???.l, ???.m, 32, ???.m - 64, ayf.m(???).a * 4);
    
    b(false);
    for (pm.a ☃ : pm.a.values()) {
      if ((ayf.b(???).a(☃.d) > 0) || (ayf.b(???).a(☃.e) > 0)) {
        this.v.add(☃);
      }
    }
  }
  
  protected int b()
  {
    return this.v.size();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃) {}
  
  protected boolean a(int ☃)
  {
    return false;
  }
  
  protected int k()
  {
    return b() * ayf.n(this.u).a * 4;
  }
  
  protected void a()
  {
    this.u.c();
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    pm.a ☃ = (pm.a)this.v.get(☃);
    String ☃ = bnq.a("entity." + pm.b(☃.a) + ".name", new Object[0]);
    int ☃ = ayf.b(this.u).a(☃.d);
    int ☃ = ayf.b(this.u).a(☃.e);
    String ☃ = bnq.a("stat.entityKills", new Object[] { Integer.valueOf(☃), ☃ });
    String ☃ = bnq.a("stat.entityKilledBy", new Object[] { ☃, Integer.valueOf(☃) });
    if (☃ == 0) {
      ☃ = bnq.a("stat.entityKills.none", new Object[] { ☃ });
    }
    if (☃ == 0) {
      ☃ = bnq.a("stat.entityKilledBy.none", new Object[] { ☃ });
    }
    this.u.c(ayf.o(this.u), ☃, ☃ + 2 - 10, ☃ + 1, 16777215);
    
    this.u.c(ayf.p(this.u), ☃, ☃ + 2, ☃ + 1 + ayf.q(this.u).a, ☃ == 0 ? 6316128 : 9474192);
    this.u.c(ayf.r(this.u), ☃, ☃ + 2, ☃ + 1 + ayf.s(this.u).a * 2, ☃ == 0 ? 6316128 : 9474192);
  }
}
