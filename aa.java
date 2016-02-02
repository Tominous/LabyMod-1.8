import java.util.List;
import net.minecraft.server.MinecraftServer;

public class aa
  extends i
{
  public String c()
  {
    return "me";
  }
  
  public int a()
  {
    return 0;
  }
  
  public String c(m ☃)
  {
    return "commands.me.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length <= 0) {
      throw new cf("commands.me.usage", new Object[0]);
    }
    eu ☃ = b(☃, ☃, 0, !(☃ instanceof wn));
    MinecraftServer.N().ap().a(new fb("chat.type.emote", new Object[] { ☃.f_(), ☃ }));
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    return a(☃, MinecraftServer.N().K());
  }
}
