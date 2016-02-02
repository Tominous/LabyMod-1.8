import net.minecraft.server.MinecraftServer;

public class aw
  extends i
{
  public String c()
  {
    return "publish";
  }
  
  public String c(m ☃)
  {
    return "commands.publish.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    String ☃ = MinecraftServer.N().a(adp.a.b, false);
    if (☃ != null) {
      a(☃, this, "commands.publish.started", new Object[] { ☃ });
    } else {
      a(☃, this, "commands.publish.failed", new Object[0]);
    }
  }
}
