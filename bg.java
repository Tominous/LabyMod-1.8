import net.minecraft.server.MinecraftServer;

public class bg
  extends i
{
  public String c()
  {
    return "setidletimeout";
  }
  
  public int a()
  {
    return 3;
  }
  
  public String c(m ☃)
  {
    return "commands.setidletimeout.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length != 1) {
      throw new cf("commands.setidletimeout.usage", new Object[0]);
    }
    int ☃ = a(☃[0], 0);
    MinecraftServer.N().d(☃);
    a(☃, this, "commands.setidletimeout.success", new Object[] { Integer.valueOf(☃) });
  }
}
