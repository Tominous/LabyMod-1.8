import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ah
  extends i
{
  public String c()
  {
    return "gamemode";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.gamemode.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length <= 0) {
      throw new cf("commands.gamemode.usage", new Object[0]);
    }
    adp.a ☃ = h(☃, ☃[0]);
    wn ☃ = ☃.length >= 2 ? a(☃, ☃[1]) : b(☃);
    
    ☃.a(☃);
    O = 0.0F;
    if (☃.e().Q().b("sendCommandFeedback")) {
      ☃.a(new fb("gameMode.changed", new Object[0]));
    }
    eu ☃ = new fb("gameMode." + ☃.b(), new Object[0]);
    if (☃ != ☃) {
      a(☃, this, 1, "commands.gamemode.success.other", new Object[] { ☃.e_(), ☃ });
    } else {
      a(☃, this, 1, "commands.gamemode.success.self", new Object[] { ☃ });
    }
  }
  
  protected adp.a h(m ☃, String ☃)
    throws cb
  {
    if ((☃.equalsIgnoreCase(adp.a.b.b())) || (☃.equalsIgnoreCase("s"))) {
      return adp.a.b;
    }
    if ((☃.equalsIgnoreCase(adp.a.c.b())) || (☃.equalsIgnoreCase("c"))) {
      return adp.a.c;
    }
    if ((☃.equalsIgnoreCase(adp.a.d.b())) || (☃.equalsIgnoreCase("a"))) {
      return adp.a.d;
    }
    if ((☃.equalsIgnoreCase(adp.a.e.b())) || (☃.equalsIgnoreCase("sp"))) {
      return adp.a.e;
    }
    return adp.a(a(☃, 0, adp.a.values().length - 2));
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "survival", "creative", "adventure", "spectator" });
    }
    if (☃.length == 2) {
      return a(☃, d());
    }
    return null;
  }
  
  protected String[] d()
  {
    return MinecraftServer.N().K();
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 1;
  }
}
