import net.minecraft.server.MinecraftServer;

public class ay
  extends i
{
  public String c()
  {
    return "save-all";
  }
  
  public String c(m ☃)
  {
    return "commands.save.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    MinecraftServer ☃ = MinecraftServer.N();
    ☃.a(new fb("commands.save.start", new Object[0]));
    if (☃.ap() != null) {
      ☃.ap().j();
    }
    try
    {
      for (int ☃ = 0; ☃ < ☃.d.length; ☃++) {
        if (☃.d[☃] != null)
        {
          le ☃ = ☃.d[☃];
          boolean ☃ = ☃.c;
          ☃.c = false;
          ☃.a(true, null);
          ☃.c = ☃;
        }
      }
      if ((☃.length > 0) && ("flush".equals(☃[0])))
      {
        ☃.a(new fb("commands.save.flushStart", new Object[0]));
        for (int ☃ = 0; ☃ < ☃.d.length; ☃++) {
          if (☃.d[☃] != null)
          {
            le ☃ = ☃.d[☃];
            boolean ☃ = ☃.c;
            ☃.c = false;
            ☃.n();
            ☃.c = ☃;
          }
        }
        ☃.a(new fb("commands.save.flushEnd", new Object[0]));
      }
    }
    catch (adn ☃)
    {
      a(☃, this, "commands.save.failed", new Object[] { ☃.getMessage() });
      return;
    }
    a(☃, this, "commands.save.success", new Object[0]);
  }
}
