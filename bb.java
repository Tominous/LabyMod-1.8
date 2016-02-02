import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bb
  extends i
{
  public String c()
  {
    return "say";
  }
  
  public int a()
  {
    return 1;
  }
  
  public String c(m ☃)
  {
    return "commands.say.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length <= 0) || (☃[0].length() <= 0)) {
      throw new cf("commands.say.usage", new Object[0]);
    }
    eu ☃ = b(☃, ☃, 0, true);
    MinecraftServer.N().ap().a(new fb("chat.type.announcement", new Object[] { ☃.f_(), ☃ }));
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length >= 1) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
}
