import java.util.List;
import net.minecraft.server.MinecraftServer;

public class yo
  extends zw
{
  protected final afh a;
  
  public yo(afh ☃)
  {
    a = ☃;
  }
  
  public yo b(String ☃)
  {
    super.c(☃);
    return this;
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (!☃.a(☃, ☃)) {
      ☃ = ☃.a(☃);
    }
    if (b == 0) {
      return false;
    }
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    if (☃.a(a, ☃, false, ☃, null, ☃))
    {
      int ☃ = a(☃.i());
      alz ☃ = a.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      if (☃.a(☃, ☃, 3))
      {
        ☃ = ☃.p(☃);
        if (☃.c() == a)
        {
          a(☃, ☃, ☃, ☃);
          a.a(☃, ☃, ☃, ☃, ☃);
        }
        ☃.a(☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F, a.H.b(), (a.H.d() + 1.0F) / 2.0F, a.H.e() * 0.8F);
        b -= 1;
      }
      return true;
    }
    return false;
  }
  
  public static boolean a(adm ☃, wn ☃, cj ☃, zx ☃)
  {
    MinecraftServer ☃ = MinecraftServer.N();
    if (☃ == null) {
      return false;
    }
    if ((☃.n()) && (☃.o().b("BlockEntityTag", 10)))
    {
      akw ☃ = ☃.s(☃);
      if (☃ != null)
      {
        if ((!D) && (☃.F()) && (!☃.ap().h(☃.cd()))) {
          return false;
        }
        dn ☃ = new dn();
        dn ☃ = (dn)☃.b();
        ☃.b(☃);
        
        dn ☃ = (dn)☃.o().a("BlockEntityTag");
        ☃.a(☃);
        ☃.a("x", ☃.n());
        ☃.a("y", ☃.o());
        ☃.a("z", ☃.p());
        if (!☃.equals(☃))
        {
          ☃.a(☃);
          ☃.p_();
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean a(adm ☃, cj ☃, cq ☃, wn ☃, zx ☃)
  {
    afh ☃ = ☃.p(☃).c();
    if (☃ == afi.aH) {
      ☃ = cq.b;
    } else if (!☃.a(☃, ☃)) {
      ☃ = ☃.a(☃);
    }
    return ☃.a(a, ☃, false, ☃, null, ☃);
  }
  
  public String e_(zx ☃)
  {
    return a.a();
  }
  
  public String a()
  {
    return a.a();
  }
  
  public yz c()
  {
    return a.L();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    a.a(☃, ☃, ☃);
  }
  
  public afh d()
  {
    return a;
  }
}
