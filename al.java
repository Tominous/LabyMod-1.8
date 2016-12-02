import java.util.List;
import net.minecraft.server.MinecraftServer;

public class al
  extends i
{
  public String c()
  {
    return "kick";
  }
  
  public int a()
  {
    return 3;
  }
  
  public String c(m ☃)
  {
    return "commands.kick.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length <= 0) || (☃[0].length() <= 1)) {
      throw new cf("commands.kick.usage", new Object[0]);
    }
    lf ☃ = MinecraftServer.N().ap().a(☃[0]);
    String ☃ = "Kicked by an operator.";
    boolean ☃ = false;
    if (☃ == null) {
      throw new cd();
    }
    if (☃.length >= 2)
    {
      ☃ = a(☃, ☃, 1).c();
      ☃ = true;
    }
    a.c(☃);
    if (☃) {
      a(☃, this, "commands.kick.success.reason", new Object[] { ☃.e_(), ☃ });
    } else {
      a(☃, this, "commands.kick.success", new Object[] { ☃.e_() });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length >= 1) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
}
