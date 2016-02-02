import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;

public class as
  extends i
{
  public String c()
  {
    return "pardon-ip";
  }
  
  public int a()
  {
    return 3;
  }
  
  public boolean a(m ☃)
  {
    return (MinecraftServer.N().ap().i().b()) && (super.a(☃));
  }
  
  public String c(m ☃)
  {
    return "commands.unbanip.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length != 1) || (☃[0].length() <= 1)) {
      throw new cf("commands.unbanip.usage", new Object[0]);
    }
    Matcher ☃ = q.a.matcher(☃[0]);
    if (☃.matches())
    {
      MinecraftServer.N().ap().i().c(☃[0]);
      a(☃, this, "commands.unbanip.success", new Object[] { ☃[0] });
    }
    else
    {
      throw new cc("commands.unbanip.invalid", new Object[0]);
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, MinecraftServer.N().ap().i().a());
    }
    return null;
  }
}
