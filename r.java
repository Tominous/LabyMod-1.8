import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class r
  extends i
{
  public String c()
  {
    return "ban";
  }
  
  public int a()
  {
    return 3;
  }
  
  public String c(m ☃)
  {
    return "commands.ban.usage";
  }
  
  public boolean a(m ☃)
  {
    return (MinecraftServer.N().ap().h().b()) && (super.a(☃));
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length < 1) || (☃[0].length() <= 0)) {
      throw new cf("commands.ban.usage", new Object[0]);
    }
    MinecraftServer ☃ = MinecraftServer.N();
    GameProfile ☃ = ☃.aF().a(☃[0]);
    if (☃ == null) {
      throw new bz("commands.ban.failed", new Object[] { ☃[0] });
    }
    String ☃ = null;
    if (☃.length >= 2) {
      ☃ = a(☃, ☃, 1).c();
    }
    md ☃ = new md(☃, null, ☃.e_(), null, ☃);
    ☃.ap().h().a(☃);
    
    lf ☃ = ☃.ap().a(☃[0]);
    if (☃ != null) {
      ☃.a.c("You are banned from this server.");
    }
    a(☃, this, "commands.ban.success", new Object[] { ☃[0] });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length >= 1) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
}
