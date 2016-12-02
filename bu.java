import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bu
  extends i
{
  public String c()
  {
    return "trigger";
  }
  
  public int a()
  {
    return 0;
  }
  
  public String c(m ☃)
  {
    return "commands.trigger.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 3) {
      throw new cf("commands.trigger.usage", new Object[0]);
    }
    lf ☃;
    if ((☃ instanceof lf))
    {
      ☃ = (lf)☃;
    }
    else
    {
      pk ☃ = ☃.f();
      lf ☃;
      if ((☃ instanceof lf)) {
        ☃ = (lf)☃;
      } else {
        throw new bz("commands.trigger.invalidPlayer", new Object[0]);
      }
    }
    lf ☃;
    auo ☃ = MinecraftServer.N().a(0).Z();
    auk ☃ = ☃.b(☃[0]);
    if ((☃ == null) || (☃.c() != auu.c)) {
      throw new bz("commands.trigger.invalidObjective", new Object[] { ☃[0] });
    }
    int ☃ = a(☃[2]);
    if (!☃.b(☃.e_(), ☃)) {
      throw new bz("commands.trigger.invalidObjective", new Object[] { ☃[0] });
    }
    aum ☃ = ☃.c(☃.e_(), ☃);
    if (☃.g()) {
      throw new bz("commands.trigger.disabled", new Object[] { ☃[0] });
    }
    if ("set".equals(☃[1])) {
      ☃.c(☃);
    } else if ("add".equals(☃[1])) {
      ☃.a(☃);
    } else {
      throw new bz("commands.trigger.invalidMode", new Object[] { ☃[1] });
    }
    ☃.a(true);
    if (c.d()) {
      a(☃, this, "commands.trigger.success", new Object[] { ☃[0], ☃[1], ☃[2] });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1)
    {
      auo ☃ = MinecraftServer.N().a(0).Z();
      List<String> ☃ = Lists.newArrayList();
      for (auk ☃ : ☃.c()) {
        if (☃.c() == auu.c) {
          ☃.add(☃.b());
        }
      }
      return a(☃, (String[])☃.toArray(new String[☃.size()]));
    }
    if (☃.length == 2) {
      return a(☃, new String[] { "add", "set" });
    }
    return null;
  }
}
