import com.mojang.authlib.GameProfile;
import java.util.List;

public class aat
  extends zw
{
  private static final String[] a = { "skeleton", "wither", "zombie", "char", "creeper" };
  
  public aat()
  {
    a(yz.c);
    d(0);
    a(true);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃ == cq.a) {
      return false;
    }
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    boolean ☃ = ☃.a(☃, ☃);
    if (!☃)
    {
      if (!☃.p(☃).c().t().a()) {
        return false;
      }
      ☃ = ☃.a(☃);
    }
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    if (!afi.ce.d(☃, ☃)) {
      return false;
    }
    if (!☃.D)
    {
      ☃.a(☃, afi.ce.Q().a(ajm.a, ☃), 3);
      
      int ☃ = 0;
      if (☃ == cq.b) {
        ☃ = ns.c(☃.y * 16.0F / 360.0F + 0.5D) & 0xF;
      }
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof alo))
      {
        alo ☃ = (alo)☃;
        if (☃.i() == 3)
        {
          GameProfile ☃ = null;
          if (☃.n())
          {
            dn ☃ = ☃.o();
            if (☃.b("SkullOwner", 10)) {
              ☃ = dy.a(☃.m("SkullOwner"));
            } else if ((☃.b("SkullOwner", 8)) && (☃.j("SkullOwner").length() > 0)) {
              ☃ = new GameProfile(null, ☃.j("SkullOwner"));
            }
          }
          ☃.a(☃);
        }
        else
        {
          ☃.a(☃.i());
        }
        ☃.b(☃);
        afi.ce.a(☃, ☃, ☃);
      }
      ☃.b -= 1;
    }
    return true;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      ☃.add(new zx(☃, 1, ☃));
    }
  }
  
  public int a(int ☃)
  {
    return ☃;
  }
  
  public String e_(zx ☃)
  {
    int ☃ = ☃.i();
    if ((☃ < 0) || (☃ >= a.length)) {
      ☃ = 0;
    }
    return super.a() + "." + a[☃];
  }
  
  public String a(zx ☃)
  {
    if ((☃.i() == 3) && (☃.n()))
    {
      if (☃.o().b("SkullOwner", 8)) {
        return di.a("item.skull.player.name", new Object[] { ☃.o().j("SkullOwner") });
      }
      if (☃.o().b("SkullOwner", 10))
      {
        dn ☃ = ☃.o().m("SkullOwner");
        if (☃.b("Name", 8)) {
          return di.a("item.skull.player.name", new Object[] { ☃.j("Name") });
        }
      }
    }
    return super.a(☃);
  }
  
  public boolean a(dn ☃)
  {
    super.a(☃);
    if ((☃.b("SkullOwner", 8)) && (☃.j("SkullOwner").length() > 0))
    {
      GameProfile ☃ = new GameProfile(null, ☃.j("SkullOwner"));
      ☃ = alo.b(☃);
      ☃.a("SkullOwner", dy.a(new dn(), ☃));
      return true;
    }
    return false;
  }
}
