import java.util.List;
import java.util.Random;

public class afl
  extends afc
{
  public static final amk[] a = { amk.a("has_bottle_0"), amk.a("has_bottle_1"), amk.a("has_bottle_2") };
  
  public afl()
  {
    super(arm.f);
    j(this.M.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
  }
  
  public String f()
  {
    return di.a("item.brewingStand.name");
  }
  
  public boolean c()
  {
    return false;
  }
  
  public int b()
  {
    return 3;
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new akx();
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    j();
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void j()
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof akx))
    {
      ☃.a((akx)☃);
      ☃.b(na.M);
    }
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    if (☃.s())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof akx)) {
        ((akx)☃).a(☃.q());
      }
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    double ☃ = ☃.n() + 0.4F + ☃.nextFloat() * 0.2F;
    double ☃ = ☃.o() + 0.7F + ☃.nextFloat() * 0.3F;
    double ☃ = ☃.p() + 0.4F + ☃.nextFloat() * 0.2F;
    
    ☃.a(cy.l, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof akx)) {
      oi.a(☃, ☃, (akx)☃);
    }
    super.b(☃, ☃, ☃);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.bF;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.bF;
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    return xi.a(☃.s(☃));
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    alz ☃ = Q();
    for (int ☃ = 0; ☃ < 3; ☃++) {
      ☃ = ☃.a(a[☃], Boolean.valueOf((☃ & 1 << ☃) > 0));
    }
    return ☃;
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < 3; ☃++) {
      if (((Boolean)☃.b(a[☃])).booleanValue()) {
        ☃ |= 1 << ☃;
      }
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a[0], a[1], a[2] });
  }
}
