import net.minecraft.server.MinecraftServer;

public class y
  extends ah
{
  public String c()
  {
    return "defaultgamemode";
  }
  
  public String c(m ☃)
  {
    return "commands.defaultgamemode.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length <= 0) {
      throw new cf("commands.defaultgamemode.usage", new Object[0]);
    }
    adp.a ☃ = h(☃, ☃[0]);
    a(☃);
    
    a(☃, this, "commands.defaultgamemode.success", new Object[] { new fb("gameMode." + ☃.b(), new Object[0]) });
  }
  
  protected void a(adp.a ☃)
  {
    MinecraftServer ☃ = MinecraftServer.N();
    ☃.a(☃);
    if (☃.ax()) {
      for (lf ☃ : MinecraftServer.N().ap().v())
      {
        ☃.a(☃);
        ☃.O = 0.0F;
      }
    }
  }
}
