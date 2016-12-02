import java.util.Random;

public class aib
  extends afh
{
  public static final amk a = amk.a("snowy");
  
  protected aib()
  {
    super(arm.b, arn.z);
    j(M.b().a(a, Boolean.valueOf(false)));
    a(true);
    a(yz.b);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃.a()).c();
    return ☃.a(a, Boolean.valueOf((☃ == afi.aJ) || (☃ == afi.aH)));
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (D) {
      return;
    }
    if ((☃.l(☃.a()) < 4) && (☃.p(☃.a()).c().p() > 2))
    {
      ☃.a(☃, afi.d.Q().a(agf.a, agf.a.a));
      return;
    }
    if (☃.l(☃.a()) >= 9) {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        cj ☃ = ☃.a(☃.nextInt(3) - 1, ☃.nextInt(5) - 3, ☃.nextInt(3) - 1);
        alz ☃ = ☃.p(☃);
        afh ☃ = ☃.p(☃.a()).c();
        if ((☃.c() == afi.d) && (☃.b(agf.a) == agf.a.a) && (☃.l(☃.a()) >= 4) && (☃.p() <= 2)) {
          ☃.a(☃, Q());
        }
      }
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    super.c(☃, ☃, ☃, ☃);
    if (☃.nextInt(10) == 0) {
      ☃.a(cy.w, ☃.n() + ☃.nextFloat(), ☃.o() + 1.1F, ☃.p() + ☃.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), ☃, ☃);
  }
  
  public int c(alz ☃)
  {
    return 0;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
