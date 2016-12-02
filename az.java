import net.minecraft.server.MinecraftServer;

public class az
  extends i
{
  public String c()
  {
    return "save-off";
  }
  
  public String c(m ☃)
  {
    return "commands.save-off.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    MinecraftServer ☃ = MinecraftServer.N();
    
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < d.length; ☃++) {
      if (d[☃] != null)
      {
        le ☃ = d[☃];
        if (!c)
        {
          c = true;
          ☃ = true;
        }
      }
    }
    if (☃) {
      a(☃, this, "commands.save.disabled", new Object[0]);
    } else {
      throw new bz("commands.save-off.alreadyOff", new Object[0]);
    }
  }
}
