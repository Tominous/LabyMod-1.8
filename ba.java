import net.minecraft.server.MinecraftServer;

public class ba
  extends i
{
  public String c()
  {
    return "save-on";
  }
  
  public String c(m ☃)
  {
    return "commands.save-on.usage";
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
        if (c)
        {
          c = false;
          ☃ = true;
        }
      }
    }
    if (☃) {
      a(☃, this, "commands.save.enabled", new Object[0]);
    } else {
      throw new bz("commands.save-on.alreadyOn", new Object[0]);
    }
  }
}
