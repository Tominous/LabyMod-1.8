import java.util.List;
import net.minecraft.server.MinecraftServer;

public class an
  extends i
{
  public String c()
  {
    return "banlist";
  }
  
  public int a()
  {
    return 3;
  }
  
  public boolean a(m ☃)
  {
    return ((MinecraftServer.N().ap().i().b()) || (MinecraftServer.N().ap().h().b())) && (super.a(☃));
  }
  
  public String c(m ☃)
  {
    return "commands.banlist.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length >= 1) && (☃[0].equalsIgnoreCase("ips")))
    {
      ☃.a(new fb("commands.banlist.ips", new Object[] { Integer.valueOf(MinecraftServer.N().ap().i().a().length) }));
      ☃.a(new fa(a(MinecraftServer.N().ap().i().a())));
    }
    else
    {
      ☃.a(new fb("commands.banlist.players", new Object[] { Integer.valueOf(MinecraftServer.N().ap().h().a().length) }));
      ☃.a(new fa(a(MinecraftServer.N().ap().h().a())));
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "players", "ips" });
    }
    return null;
  }
}
