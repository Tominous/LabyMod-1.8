import java.util.List;
import net.minecraft.server.MinecraftServer;

public class yo
  extends zw
{
  protected final afh a;
  
  public yo(afh ☃)
  {
    this.a = ☃;
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
    if (☃.b == 0) {
      return false;
    }
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    if (☃.a(this.a, ☃, false, ☃, null, ☃))
    {
      int ☃ = a(☃.i());
      alz ☃ = this.a.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      if (☃.a(☃, ☃, 3))
      {
        ☃ = ☃.p(☃);
        if (☃.c() == this.a)
        {
          a(☃, ☃, ☃, ☃);
          this.a.a(☃, ☃, ☃, ☃, ☃);
        }
        ☃.a(☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F, this.a.H.b(), (this.a.H.d() + 1.0F) / 2.0F, this.a.H.e() * 0.8F);
        ☃.b -= 1;
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
        if ((!☃.D) && (☃.F()) && (!☃.ap().h(☃.cd()))) {
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
    return ☃.a(this.a, ☃, false, ☃, null, ☃);
  }
  
  public String e_(zx ☃)
  {
    return this.a.a();
  }
  
  public String a()
  {
    return this.a.a();
  }
  
  public yz c()
  {
    return this.a.L();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    this.a.a(☃, ☃, ☃);
  }
  
  public afh d()
  {
    return this.a;
  }
}
