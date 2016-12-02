import java.util.List;

public class ym
  extends yo
{
  public ym()
  {
    super(afi.cK);
    this.h = 16;
    a(yz.c);
    a(true);
    d(0);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃ == cq.a) {
      return false;
    }
    if (!☃.p(☃).c().t().a()) {
      return false;
    }
    ☃ = ☃.a(☃);
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    if (!afi.cK.d(☃, ☃)) {
      return false;
    }
    if (☃.D) {
      return true;
    }
    if (☃ == cq.b)
    {
      int ☃ = ns.c((☃.y + 180.0F) * 16.0F / 360.0F + 0.5D) & 0xF;
      ☃.a(☃, afi.cK.Q().a(ajv.a, Integer.valueOf(☃)), 3);
    }
    else
    {
      ☃.a(☃, afi.cL.Q().a(akm.a, ☃), 3);
    }
    ☃.b -= 1;
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof aku)) {
      ((aku)☃).a(☃);
    }
    return true;
  }
  
  public String a(zx ☃)
  {
    String ☃ = "item.banner.";
    
    zd ☃ = h(☃);
    ☃ = ☃ + ☃.d() + ".name";
    return di.a(☃);
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    dn ☃ = ☃.a("BlockEntityTag", false);
    if ((☃ == null) || (!☃.c("Patterns"))) {
      return;
    }
    du ☃ = ☃.c("Patterns", 10);
    for (int ☃ = 0; (☃ < ☃.c()) && (☃ < 6); ☃++)
    {
      dn ☃ = ☃.b(☃);
      zd ☃ = zd.a(☃.f("Color"));
      aku.a ☃ = aku.a.a(☃.j("Pattern"));
      if (☃ != null) {
        ☃.add(di.a("item.banner." + ☃.a() + "." + ☃.d()));
      }
    }
  }
  
  public int a(zx ☃, int ☃)
  {
    if (☃ == 0) {
      return 16777215;
    }
    zd ☃ = h(☃);
    return ☃.e().L;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (zd ☃ : )
    {
      dn ☃ = new dn();
      aku.a(☃, ☃.b(), null);
      
      dn ☃ = new dn();
      ☃.a("BlockEntityTag", ☃);
      
      zx ☃ = new zx(☃, 1, ☃.b());
      ☃.d(☃);
      
      ☃.add(☃);
    }
  }
  
  public yz c()
  {
    return yz.c;
  }
  
  private zd h(zx ☃)
  {
    dn ☃ = ☃.a("BlockEntityTag", false);
    zd ☃ = null;
    if ((☃ != null) && (☃.c("Base"))) {
      ☃ = zd.a(☃.f("Base"));
    } else {
      ☃ = zd.a(☃.i());
    }
    return ☃;
  }
}
