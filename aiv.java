import com.google.common.base.Predicate;
import java.util.Random;

public class aiv
  extends age
{
  private amd a;
  private amd b;
  private amd N;
  private amd P;
  
  protected aiv()
  {
    super(arm.C, arn.q);
    j(this.M.b().a(O, cq.c));
    a(true);
    a(yz.b);
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    super.c(☃, ☃, ☃);
    f(☃, ☃);
  }
  
  public boolean e(adm ☃, cj ☃)
  {
    return (l().a(☃, ☃) != null) || (T().a(☃, ☃) != null);
  }
  
  private void f(adm ☃, cj ☃)
  {
    amd.b ☃;
    if ((☃ = n().a(☃, ☃)) != null)
    {
      for (int ☃ = 0; ☃ < n().b(); ☃++)
      {
        amc ☃ = ☃.a(0, ☃, 0);
        ☃.a(☃.d(), afi.a.Q(), 2);
      }
      tw ☃ = new tw(☃);
      cj ☃ = ☃.a(0, 2, 0).d();
      ☃.b(☃.n() + 0.5D, ☃.o() + 0.05D, ☃.p() + 0.5D, 0.0F, 0.0F);
      ☃.d(☃);
      for (int ☃ = 0; ☃ < 120; ☃++) {
        ☃.a(cy.G, ☃.n() + ☃.s.nextDouble(), ☃.o() + ☃.s.nextDouble() * 2.5D, ☃.p() + ☃.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
      }
      for (int ☃ = 0; ☃ < n().b(); ☃++)
      {
        amc ☃ = ☃.a(0, ☃, 0);
        ☃.b(☃.d(), afi.a);
      }
    }
    else if ((☃ = U().a(☃, ☃)) != null)
    {
      for (int ☃ = 0; ☃ < U().c(); ☃++) {
        for (int ☃ = 0; ☃ < U().b(); ☃++) {
          ☃.a(☃.a(☃, ☃, 0).d(), afi.a.Q(), 2);
        }
      }
      cj ☃ = ☃.a(1, 2, 0).d();
      
      ty ☃ = new ty(☃);
      ☃.l(true);
      ☃.b(☃.n() + 0.5D, ☃.o() + 0.05D, ☃.p() + 0.5D, 0.0F, 0.0F);
      ☃.d(☃);
      for (int ☃ = 0; ☃ < 120; ☃++) {
        ☃.a(cy.F, ☃.n() + ☃.s.nextDouble(), ☃.o() + ☃.s.nextDouble() * 3.9D, ☃.p() + ☃.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
      }
      for (int ☃ = 0; ☃ < U().c(); ☃++) {
        for (int ☃ = 0; ☃ < U().b(); ☃++)
        {
          amc ☃ = ☃.a(☃, ☃, 0);
          ☃.b(☃.d(), afi.a);
        }
      }
    }
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (☃.p(☃).c().J.j()) && (adm.a(☃, ☃.b()));
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(O, ☃.aP().d());
  }
  
  public alz a(int ☃)
  {
    return Q().a(O, cq.b(☃));
  }
  
  public int c(alz ☃)
  {
    return ((cq)☃.b(O)).b();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { O });
  }
  
  private static final Predicate<alz> Q = new Predicate()
  {
    public boolean a(alz ☃)
    {
      return (☃ != null) && ((☃.c() == afi.aU) || (☃.c() == afi.aZ));
    }
  };
  
  protected amd l()
  {
    if (this.a == null) {
      this.a = ame.a().a(new String[] { " ", "#", "#" }).a('#', amc.a(amh.a(afi.aJ))).b();
    }
    return this.a;
  }
  
  protected amd n()
  {
    if (this.b == null) {
      this.b = ame.a().a(new String[] { "^", "#", "#" }).a('^', amc.a(Q)).a('#', amc.a(amh.a(afi.aJ))).b();
    }
    return this.b;
  }
  
  protected amd T()
  {
    if (this.N == null) {
      this.N = ame.a().a(new String[] { "~ ~", "###", "~#~" }).a('#', amc.a(amh.a(afi.S))).a('~', amc.a(amh.a(afi.a))).b();
    }
    return this.N;
  }
  
  protected amd U()
  {
    if (this.P == null) {
      this.P = ame.a().a(new String[] { "~^~", "###", "~#~" }).a('^', amc.a(Q)).a('#', amc.a(amh.a(afi.S))).a('~', amc.a(amh.a(afi.a))).b();
    }
    return this.P;
  }
}
