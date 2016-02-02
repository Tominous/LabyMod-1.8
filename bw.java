import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bw
  extends i
{
  public String c()
  {
    return "whitelist";
  }
  
  public int a()
  {
    return 3;
  }
  
  public String c(m ☃)
  {
    return "commands.whitelist.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 1) {
      throw new cf("commands.whitelist.usage", new Object[0]);
    }
    MinecraftServer ☃ = MinecraftServer.N();
    if (☃[0].equals("on"))
    {
      ☃.ap().a(true);
      a(☃, this, "commands.whitelist.enabled", new Object[0]);
    }
    else if (☃[0].equals("off"))
    {
      ☃.ap().a(false);
      a(☃, this, "commands.whitelist.disabled", new Object[0]);
    }
    else if (☃[0].equals("list"))
    {
      ☃.a(new fb("commands.whitelist.list", new Object[] { Integer.valueOf(☃.ap().l().length), Integer.valueOf(☃.ap().q().length) }));
      String[] ☃ = ☃.ap().l();
      ☃.a(new fa(a(☃)));
    }
    else if (☃[0].equals("add"))
    {
      if (☃.length < 2) {
        throw new cf("commands.whitelist.add.usage", new Object[0]);
      }
      GameProfile ☃ = ☃.aF().a(☃[1]);
      if (☃ == null) {
        throw new bz("commands.whitelist.add.failed", new Object[] { ☃[1] });
      }
      ☃.ap().d(☃);
      a(☃, this, "commands.whitelist.add.success", new Object[] { ☃[1] });
    }
    else if (☃[0].equals("remove"))
    {
      if (☃.length < 2) {
        throw new cf("commands.whitelist.remove.usage", new Object[0]);
      }
      GameProfile ☃ = ☃.ap().k().a(☃[1]);
      if (☃ == null) {
        throw new bz("commands.whitelist.remove.failed", new Object[] { ☃[1] });
      }
      ☃.ap().c(☃);
      a(☃, this, "commands.whitelist.remove.success", new Object[] { ☃[1] });
    }
    else if (☃[0].equals("reload"))
    {
      ☃.ap().a();
      a(☃, this, "commands.whitelist.reloaded", new Object[0]);
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "on", "off", "list", "add", "remove", "reload" });
    }
    if (☃.length == 2)
    {
      if (☃[0].equals("remove")) {
        return a(☃, MinecraftServer.N().ap().l());
      }
      if (☃[0].equals("add")) {
        return a(☃, MinecraftServer.N().aF().a());
      }
    }
    return null;
  }
}
