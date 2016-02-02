import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ab
  extends i
{
  public String c()
  {
    return "enchant";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.enchant.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf("commands.enchant.usage", new Object[0]);
    }
    wn ☃ = a(☃, ☃[0]);
    ☃.a(n.a.d, 0);
    int ☃;
    try
    {
      ☃ = a(☃[1], 0);
    }
    catch (cb ☃)
    {
      aci ☃ = aci.b(☃[1]);
      if (☃ == null) {
        throw ☃;
      }
      ☃ = ☃.B;
    }
    int ☃ = 1;
    
    zx ☃ = ☃.bZ();
    if (☃ == null) {
      throw new bz("commands.enchant.noItem", new Object[0]);
    }
    aci ☃ = aci.c(☃);
    if (☃ == null) {
      throw new cb("commands.enchant.notFound", new Object[] { Integer.valueOf(☃) });
    }
    if (!☃.a(☃)) {
      throw new bz("commands.enchant.cantEnchant", new Object[0]);
    }
    if (☃.length >= 3) {
      ☃ = a(☃[2], ☃.e(), ☃.b());
    }
    if (☃.n())
    {
      du ☃ = ☃.p();
      if (☃ != null) {
        for (int ☃ = 0; ☃ < ☃.c(); ☃++)
        {
          int ☃ = ☃.b(☃).e("id");
          if (aci.c(☃) != null)
          {
            aci ☃ = aci.c(☃);
            if (!☃.a(☃)) {
              throw new bz("commands.enchant.cantCombine", new Object[] { ☃.d(☃), ☃.d(☃.b(☃).e("lvl")) });
            }
          }
        }
      }
    }
    ☃.a(☃, ☃);
    a(☃, this, "commands.enchant.success", new Object[0]);
    ☃.a(n.a.d, 1);
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, d());
    }
    if (☃.length == 2) {
      return a(☃, aci.c());
    }
    return null;
  }
  
  protected String[] d()
  {
    return MinecraftServer.N().K();
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
