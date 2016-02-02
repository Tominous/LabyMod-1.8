import java.util.List;
import net.minecraft.server.MinecraftServer;

public class am
  extends i
{
  public String c()
  {
    return "kill";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.kill.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length == 0)
    {
      wn ☃ = b(☃);
      ☃.G();
      a(☃, this, "commands.kill.successful", new Object[] { ☃.f_() });
      return;
    }
    pk ☃ = b(☃, ☃[0]);
    ☃.G();
    a(☃, this, "commands.kill.successful", new Object[] { ☃.f_() });
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
}
