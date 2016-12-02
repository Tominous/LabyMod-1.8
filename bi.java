import net.minecraft.server.MinecraftServer;

public class bi
  extends i
{
  public boolean a(m ☃)
  {
    return (MinecraftServer.N().T()) || (super.a(☃));
  }
  
  public String c()
  {
    return "seed";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.seed.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    adm ☃ = (☃ instanceof wn) ? o : MinecraftServer.N().a(0);
    ☃.a(new fb("commands.seed.success", new Object[] { Long.valueOf(☃.J()) }));
  }
}
