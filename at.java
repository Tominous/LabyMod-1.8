import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class at
  extends i
{
  public String c()
  {
    return "pardon";
  }
  
  public int a()
  {
    return 3;
  }
  
  public String c(m ☃)
  {
    return "commands.unban.usage";
  }
  
  public boolean a(m ☃)
  {
    return (MinecraftServer.N().ap().h().b()) && (super.a(☃));
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length != 1) || (☃[0].length() <= 0)) {
      throw new cf("commands.unban.usage", new Object[0]);
    }
    MinecraftServer ☃ = MinecraftServer.N();
    GameProfile ☃ = ☃.ap().h().a(☃[0]);
    if (☃ == null) {
      throw new bz("commands.unban.failed", new Object[] { ☃[0] });
    }
    ☃.ap().h().c(☃);
    a(☃, this, "commands.unban.success", new Object[] { ☃[0] });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, MinecraftServer.N().ap().h().a());
    }
    return null;
  }
}
