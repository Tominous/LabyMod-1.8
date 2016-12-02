import net.minecraft.server.MinecraftServer;

public class bl
  extends i
{
  public String c()
  {
    return "stop";
  }
  
  public String c(m ☃)
  {
    return "commands.stop.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (MinecraftServer.N().d != null) {
      a(☃, this, "commands.stop.start", new Object[0]);
    }
    MinecraftServer.N().w();
  }
}
