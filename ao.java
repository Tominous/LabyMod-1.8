import net.minecraft.server.MinecraftServer;

public class ao
  extends i
{
  public String c()
  {
    return "list";
  }
  
  public int a()
  {
    return 0;
  }
  
  public String c(m ☃)
  {
    return "commands.players.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    int ☃ = MinecraftServer.N().I();
    ☃.a(new fb("commands.players.list", new Object[] { Integer.valueOf(☃), Integer.valueOf(MinecraftServer.N().J()) }));
    ☃.a(new fa(MinecraftServer.N().ap().b((☃.length > 0) && ("uuids".equalsIgnoreCase(☃[0])))));
    ☃.a(n.a.e, ☃);
  }
}
