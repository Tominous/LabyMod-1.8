import java.util.Collection;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class z
  extends i
{
  public String c()
  {
    return "effect";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.effect.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf("commands.effect.usage", new Object[0]);
    }
    pr ☃ = (pr)a(☃, ☃[0], pr.class);
    if (☃[1].equals("clear"))
    {
      if (☃.bl().isEmpty()) {
        throw new bz("commands.effect.failure.notActive.all", new Object[] { ☃.e_() });
      }
      ☃.bk();
      a(☃, this, "commands.effect.success.removed.all", new Object[] { ☃.e_() }); return;
    }
    int ☃;
    try
    {
      ☃ = a(☃[1], 1);
    }
    catch (cb ☃)
    {
      pe ☃ = pe.b(☃[1]);
      if (☃ == null) {
        throw ☃;
      }
      ☃ = ☃.H;
    }
    int ☃ = 600;
    int ☃ = 30;
    int ☃ = 0;
    if ((☃ < 0) || (☃ >= pe.a.length) || (pe.a[☃] == null)) {
      throw new cb("commands.effect.notFound", new Object[] { Integer.valueOf(☃) });
    }
    pe ☃ = pe.a[☃];
    if (☃.length >= 3)
    {
      ☃ = a(☃[2], 0, 1000000);
      if (☃.b()) {
        ☃ = ☃;
      } else {
        ☃ = ☃ * 20;
      }
    }
    else if (☃.b())
    {
      ☃ = 1;
    }
    if (☃.length >= 4) {
      ☃ = a(☃[3], 0, 255);
    }
    boolean ☃ = true;
    if ((☃.length >= 5) && 
      ("true".equalsIgnoreCase(☃[4]))) {
      ☃ = false;
    }
    if (☃ > 0)
    {
      pf ☃ = new pf(☃, ☃, ☃, false, ☃);
      ☃.c(☃);
      a(☃, this, "commands.effect.success", new Object[] { new fb(☃.g(), new Object[0]), Integer.valueOf(☃), Integer.valueOf(☃), ☃.e_(), Integer.valueOf(☃) });
      return;
    }
    if (☃.k(☃))
    {
      ☃.m(☃);
      a(☃, this, "commands.effect.success.removed", new Object[] { new fb(☃.a(), new Object[0]), ☃.e_() });
    }
    else
    {
      throw new bz("commands.effect.failure.notActive", new Object[] { new fb(☃.a(), new Object[0]), ☃.e_() });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, d());
    }
    if (☃.length == 2) {
      return a(☃, pe.c());
    }
    if (☃.length == 5) {
      return a(☃, new String[] { "true", "false" });
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
