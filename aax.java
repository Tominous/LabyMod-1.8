import java.util.List;
import java.util.Map;
import java.util.Random;

public class aax
  extends zw
{
  public aax()
  {
    a(true);
    a(yz.f);
  }
  
  public String a(zx ☃)
  {
    String ☃ = ("" + di.a(new StringBuilder().append(a()).append(".name").toString())).trim();
    
    String ☃ = pm.b(☃.i());
    if (☃ != null) {
      ☃ = ☃ + " " + di.a(new StringBuilder().append("entity.").append(☃).append(".name").toString());
    }
    return ☃;
  }
  
  public int a(zx ☃, int ☃)
  {
    pm.a ☃ = (pm.a)pm.a.get(Integer.valueOf(☃.i()));
    if (☃ != null)
    {
      if (☃ == 0) {
        return ☃.b;
      }
      return ☃.c;
    }
    return 16777215;
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    if (!☃.a(☃.a(☃), ☃, ☃)) {
      return false;
    }
    alz ☃ = ☃.p(☃);
    if (☃.c() == afi.ac)
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof all))
      {
        add ☃ = ((all)☃).b();
        ☃.a(pm.b(☃.i()));
        ☃.p_();
        ☃.h(☃);
        if (!☃.bA.d) {
          ☃.b -= 1;
        }
        return true;
      }
    }
    ☃ = ☃.a(☃);
    
    double ☃ = 0.0D;
    if ((☃ == cq.b) && ((☃ instanceof agt))) {
      ☃ = 0.5D;
    }
    pk ☃ = a(☃, ☃.i(), ☃.n() + 0.5D, ☃.o() + ☃, ☃.p() + 0.5D);
    if (☃ != null)
    {
      if (((☃ instanceof pr)) && (☃.s())) {
        ☃.a(☃.q());
      }
      if (!☃.bA.d) {
        ☃.b -= 1;
      }
    }
    return true;
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (☃.D) {
      return ☃;
    }
    auh ☃ = a(☃, ☃, true);
    if (☃ == null) {
      return ☃;
    }
    if (☃.a == auh.a.b)
    {
      cj ☃ = ☃.a();
      if (!☃.a(☃, ☃)) {
        return ☃;
      }
      if (!☃.a(☃, ☃.b, ☃)) {
        return ☃;
      }
      if ((☃.p(☃).c() instanceof ahv))
      {
        pk ☃ = a(☃, ☃.i(), ☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D);
        if (☃ != null)
        {
          if (((☃ instanceof pr)) && (☃.s())) {
            ((ps)☃).a(☃.q());
          }
          if (!☃.bA.d) {
            ☃.b -= 1;
          }
          ☃.b(na.ad[zw.b(this)]);
        }
      }
    }
    return ☃;
  }
  
  public static pk a(adm ☃, int ☃, double ☃, double ☃, double ☃)
  {
    if (!pm.a.containsKey(Integer.valueOf(☃))) {
      return null;
    }
    pk ☃ = null;
    for (int ☃ = 0; ☃ < 1; ☃++)
    {
      ☃ = pm.a(☃, ☃);
      if ((☃ instanceof pr))
      {
        ps ☃ = (ps)☃;
        ☃.b(☃, ☃, ☃, ns.g(☃.s.nextFloat() * 360.0F), 0.0F);
        ☃.aK = ☃.y;
        ☃.aI = ☃.y;
        
        ☃.a(☃.E(new cj(☃)), null);
        ☃.d(☃);
        ☃.x();
      }
    }
    return ☃;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (pm.a ☃ : pm.a.values()) {
      ☃.add(new zx(☃, 1, ☃.a));
    }
  }
}
