import java.util.Random;

public class ahe
  extends afh
  implements afj
{
  public static final amk a = amk.a("snowy");
  
  protected ahe()
  {
    super(arm.b);
    j(M.b().a(a, Boolean.valueOf(false)));
    a(true);
    a(yz.b);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃.a()).c();
    return ☃.a(a, Boolean.valueOf((☃ == afi.aJ) || (☃ == afi.aH)));
  }
  
  public int H()
  {
    return adl.a(0.5D, 1.0D);
  }
  
  public int h(alz ☃)
  {
    return H();
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    return aea.a(☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (D) {
      return;
    }
    if ((☃.l(☃.a()) < 4) && (☃.p(☃.a()).c().p() > 2))
    {
      ☃.a(☃, afi.d.Q());
      return;
    }
    if (☃.l(☃.a()) >= 9) {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        cj ☃ = ☃.a(☃.nextInt(3) - 1, ☃.nextInt(5) - 3, ☃.nextInt(3) - 1);
        afh ☃ = ☃.p(☃.a()).c();
        alz ☃ = ☃.p(☃);
        if ((☃.c() == afi.d) && (☃.b(agf.a) == agf.a.a) && (☃.l(☃.a()) >= 4) && (☃.p() <= 2)) {
          ☃.a(☃, afi.c.Q());
        }
      }
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), ☃, ☃);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    return true;
  }
  
  public boolean a(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    return true;
  }
  
  public void b(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    cj ☃ = ☃.a();
    label260:
    for (int ☃ = 0; ☃ < 128; ☃++)
    {
      cj ☃ = ☃;
      for (int ☃ = 0; ☃ < ☃ / 16; ☃++)
      {
        ☃ = ☃.a(☃.nextInt(3) - 1, (☃.nextInt(3) - 1) * ☃.nextInt(3) / 2, ☃.nextInt(3) - 1);
        if ((☃.p(☃.b()).c() != afi.c) || (☃.p(☃).c().v())) {
          break label260;
        }
      }
      if (pcJ == arm.a) {
        if (☃.nextInt(8) == 0)
        {
          agw.a ☃ = ☃.b(☃).a(☃, ☃);
          agw ☃ = ☃.a().a();
          alz ☃ = ☃.Q().a(☃.n(), ☃);
          if (☃.f(☃, ☃, ☃)) {
            ☃.a(☃, ☃, 3);
          }
        }
        else
        {
          alz ☃ = afi.H.Q().a(akc.a, akc.a.b);
          if (afi.H.f(☃, ☃, ☃)) {
            ☃.a(☃, ☃, 3);
          }
        }
      }
    }
  }
  
  public adf m()
  {
    return adf.b;
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
